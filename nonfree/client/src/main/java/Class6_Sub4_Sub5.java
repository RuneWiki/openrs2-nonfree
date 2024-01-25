import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class6_Sub4_Sub5 extends Class6_Sub4 {

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!dt", name = "U", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
	public int anInt2200 = 4;

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
	public int anInt2198 = 1638;

	@OriginalMember(owner = "client!dt", name = "X", descriptor = "I")
	public int anInt2207 = 4;

	@OriginalMember(owner = "client!dt", name = "db", descriptor = "I")
	public int anInt2211 = 4;

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!dt", name = "fb", descriptor = "I")
	public int anInt2212 = 0;

	@OriginalMember(owner = "client!dt", name = "ib", descriptor = "[B")
	private byte[] aByteArray39 = new byte[512];

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			this.method1852(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIIII)I")
	private int method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg0 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (local13 >= arg5) {
			local13 = 0;
		}
		@Pc(42) int local42 = local17 - 4096;
		@Pc(46) int local46 = arg1 - 4096;
		local13 &= 0xFF;
		@Pc(59) int local59 = this.aByteArray39[arg3 + local21] & 0x3;
		@Pc(63) int local63 = Class326.anIntArray574[local17];
		@Pc(82) int local82;
		if (local59 <= 1) {
			local82 = local59 == 0 ? local17 + arg1 : arg1 - local17;
		} else {
			local82 = local59 == 2 ? local17 - arg1 : -arg1 + -local17;
		}
		local59 = this.aByteArray39[local13 + arg3] & 0x3;
		@Pc(127) int local127;
		if (local59 <= 1) {
			local127 = local59 == 0 ? arg1 + local42 : -local42 + arg1;
		} else {
			local127 = local59 == 2 ? local42 - arg1 : -local42 - arg1;
		}
		@Pc(152) int local152 = local82 + ((local127 - local82) * local63 >> 12);
		local59 = this.aByteArray39[local21 + arg4] & 0x3;
		if (local59 <= 1) {
			local82 = local59 == 0 ? local17 + local46 : local46 - local17;
		} else {
			local82 = local59 == 2 ? local17 - local46 : -local46 + -local17;
		}
		local59 = this.aByteArray39[local13 + arg4] & 0x3;
		if (local59 > 1) {
			local127 = local59 == 2 ? local42 - local46 : -local46 + -local42;
		} else {
			local127 = local59 == 0 ? local42 + local46 : local46 + -local42;
		}
		@Pc(253) int local253 = local82 + ((local127 - local82) * local63 >> 12);
		return local152 + (arg2 * (local253 - local152) >> 12);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.aByteArray39 = Static308.method5207(this.anInt2212);
		this.method1854();
		for (@Pc(19) int local19 = this.anInt2200 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray50[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt2200--;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.aBoolean164 = arg1.method8604() == 1;
		} else if (arg0 == 1) {
			this.anInt2200 = arg1.method8604();
		} else if (arg0 == 2) {
			this.anInt2198 = arg1.method8615();
			if (this.anInt2198 < 0) {
				this.aShortArray50 = new short[this.anInt2200];
				for (@Pc(72) int local72 = 0; local72 < this.anInt2200; local72++) {
					this.aShortArray50[local72] = (short) arg1.method8615();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2207 = this.anInt2211 = arg1.method8604();
		} else if (arg0 == 4) {
			this.anInt2212 = arg1.method8604();
		} else if (arg0 == 5) {
			this.anInt2207 = arg1.method8604();
		} else if (arg0 == 6) {
			this.anInt2211 = arg1.method8604();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([IBI)V")
	public void method1852(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static629.anIntArray635[arg1] * this.anInt2211;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(100) int local100;
		@Pc(56) int local56;
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(86) int local86;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (this.anInt2200 == 1) {
			local29 = this.aShortArray50[0];
			local36 = this.aShortArray51[0] << 12;
			local43 = this.anInt2211 * local36 >> 12;
			local50 = this.anInt2207 * local36 >> 12;
			local56 = local12 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			local56 &= 0xFFF;
			if (local43 <= local64) {
				local64 = 0;
			}
			local82 = this.aByteArray39[local60 & 0xFF] & 0xFF;
			local86 = Class326.anIntArray574[local56];
			local95 = this.aByteArray39[local64 & 0xFF] & 0xFF;
			if (this.aBoolean164) {
				for (local100 = 0; local100 < Static6.anInt111; local100++) {
					local109 = Static284.anIntArray482[local100] * this.anInt2207;
					local123 = this.method1850(local36 * local109 >> 12, local56, local86, local82, local95, local50);
					local123 = local29 * local123 >> 12;
					arg0[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static6.anInt111; local100++) {
					local109 = Static284.anIntArray482[local100] * this.anInt2207;
					local123 = this.method1850(local36 * local109 >> 12, local56, local86, local82, local95, local50);
					arg0[local100] = local29 * local123 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray50[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray51[0] << 12;
			local56 = local36 * local12 >> 12;
			local50 = this.anInt2207 * local36 >> 12;
			local43 = this.anInt2211 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			@Pc(234) int local234 = local56 & 0xFFF;
			if (local64 >= local43) {
				local64 = 0;
			}
			local95 = this.aByteArray39[local64 & 0xFF] & 0xFF;
			local86 = Class326.anIntArray574[local234];
			local82 = this.aByteArray39[local60 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static6.anInt111; local100++) {
				local109 = Static284.anIntArray482[local100] * this.anInt2207;
				local123 = this.method1850(local109 * local36 >> 12, local234, local86, local82, local95, local50);
				arg0[local100] = local29 * local123 >> 12;
			}
		}
		for (@Pc(300) int local300 = 1; local300 < this.anInt2200; local300++) {
			local29 = this.aShortArray50[local300];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray51[local300] << 12;
				local50 = local36 * this.anInt2207 >> 12;
				local43 = this.anInt2211 * local36 >> 12;
				local56 = local36 * local12 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				local56 &= 0xFFF;
				if (local43 <= local64) {
					local64 = 0;
				}
				local86 = Class326.anIntArray574[local56];
				local95 = this.aByteArray39[local64 & 0xFF] & 0xFF;
				local82 = this.aByteArray39[local60 & 0xFF] & 0xFF;
				if (this.aBoolean164 && local300 == this.anInt2200 - 1) {
					for (local100 = 0; local100 < Static6.anInt111; local100++) {
						local109 = Static284.anIntArray482[local100] * this.anInt2207;
						local123 = this.method1850(local109 * local36 >> 12, local56, local86, local82, local95, local50);
						local123 = (local29 * local123 >> 12) + arg0[local100];
						arg0[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static6.anInt111; local100++) {
						local109 = this.anInt2207 * Static284.anIntArray482[local100];
						local123 = this.method1850(local109 * local36 >> 12, local56, local86, local82, local95, local50);
						arg0[local100] += local123 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
	private void method1854() {
		@Pc(24) int local24;
		if (this.anInt2198 > 0) {
			this.aShortArray50 = new short[this.anInt2200];
			this.aShortArray51 = new short[this.anInt2200];
			for (local24 = 0; local24 < this.anInt2200; local24++) {
				this.aShortArray50[local24] = (short) (int) (Math.pow((double) ((float) this.anInt2198 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray51[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray50 != null && this.anInt2200 == this.aShortArray50.length) {
			this.aShortArray51 = new short[this.anInt2200];
			for (local24 = 0; local24 < this.anInt2200; local24++) {
				this.aShortArray51[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		}
	}
}
