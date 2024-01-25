import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class6_Sub3_Sub30 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	public int anInt7727 = 4;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	public int anInt7726 = 1638;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "Z")
	public boolean aBoolean527 = true;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
	public int anInt7734 = 4;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "[B")
	private byte[] aByteArray104 = new byte[512];

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	public int anInt7733 = 4;

	@OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
	public int anInt7738 = 0;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
	public void method6388(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static564.anIntArray703[arg1] * this.anInt7733;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(31) int local31;
		@Pc(36) short local36;
		@Pc(100) int local100;
		@Pc(56) int local56;
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(95) int local95;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (this.anInt7727 == 1) {
			local31 = this.aShortArray132[0] << 12;
			local36 = this.aShortArray133[0];
			local43 = local31 * this.anInt7733 >> 12;
			local50 = this.anInt7734 * local31 >> 12;
			local56 = local31 * local12 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			if (local64 >= local43) {
				local64 = 0;
			}
			local56 &= 0xFFF;
			local82 = this.aByteArray104[local60 & 0xFF] & 0xFF;
			local91 = this.aByteArray104[local64 & 0xFF] & 0xFF;
			local95 = Class6_Sub1_Sub11.anIntArray407[local56];
			if (this.aBoolean527) {
				for (local100 = 0; local100 < Static447.anInt8568; local100++) {
					local109 = Static157.anIntArray321[local100] * this.anInt7734;
					local123 = this.method6391(local91, local95, local50, local82, local31 * local109 >> 12, local56);
					local123 = local123 * local36 >> 12;
					arg0[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static447.anInt8568; local100++) {
					local109 = this.anInt7734 * Static157.anIntArray321[local100];
					local123 = this.method6391(local91, local95, local50, local82, local109 * local31 >> 12, local56);
					arg0[local100] = local123 * local36 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray133[0];
		if (local36 > 8 || local36 < -8) {
			local31 = this.aShortArray132[0] << 12;
			local50 = this.anInt7734 * local31 >> 12;
			local43 = local31 * this.anInt7733 >> 12;
			local56 = local31 * local12 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			@Pc(232) int local232 = local56 & 0xFFF;
			if (local64 >= local43) {
				local64 = 0;
			}
			local95 = Class6_Sub1_Sub11.anIntArray407[local232];
			local82 = this.aByteArray104[local60 & 0xFF] & 0xFF;
			local91 = this.aByteArray104[local64 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static447.anInt8568; local100++) {
				local109 = this.anInt7734 * Static157.anIntArray321[local100];
				local123 = this.method6391(local91, local95, local50, local82, local31 * local109 >> 12, local232);
				arg0[local100] = local36 * local123 >> 12;
			}
		}
		for (@Pc(300) int local300 = 1; local300 < this.anInt7727; local300++) {
			local36 = this.aShortArray133[local300];
			if (local36 > 8 || local36 < -8) {
				local31 = this.aShortArray132[local300] << 12;
				local43 = this.anInt7733 * local31 >> 12;
				local50 = local31 * this.anInt7734 >> 12;
				local56 = local12 * local31 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				local56 &= 0xFFF;
				if (local64 >= local43) {
					local64 = 0;
				}
				local95 = Class6_Sub1_Sub11.anIntArray407[local56];
				local82 = this.aByteArray104[local60 & 0xFF] & 0xFF;
				local91 = this.aByteArray104[local64 & 0xFF] & 0xFF;
				if (this.aBoolean527 && local300 == this.anInt7727 - 1) {
					for (local100 = 0; local100 < Static447.anInt8568; local100++) {
						local109 = Static157.anIntArray321[local100] * this.anInt7734;
						local123 = this.method6391(local91, local95, local50, local82, local109 * local31 >> 12, local56);
						local123 = (local36 * local123 >> 12) + arg0[local100];
						arg0[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static447.anInt8568; local100++) {
						local109 = this.anInt7734 * Static157.anIntArray321[local100];
						local123 = this.method6391(local91, local95, local50, local82, local31 * local109 >> 12, local56);
						arg0[local100] += local36 * local123 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			this.method6388(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.aByteArray104 = Static201.method5197(this.anInt7738);
		this.method6390();
		for (@Pc(23) int local23 = this.anInt7727 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray133[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt7727--;
		}
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
	private void method6390() {
		@Pc(31) int local31;
		if (this.anInt7726 > 0) {
			this.aShortArray132 = new short[this.anInt7727];
			this.aShortArray133 = new short[this.anInt7727];
			for (local31 = 0; local31 < this.anInt7727; local31++) {
				this.aShortArray133[local31] = (short) (Math.pow((double) ((float) this.anInt7726 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray132[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray133 != null && this.aShortArray133.length == this.anInt7727) {
			this.aShortArray132 = new short[this.anInt7727];
			for (local31 = 0; local31 < this.anInt7727; local31++) {
				this.aShortArray132[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean527 = arg1.method6041() == 1;
		} else if (arg0 == 1) {
			this.anInt7727 = arg1.method6041();
		} else if (arg0 == 2) {
			this.anInt7726 = arg1.method6008();
			if (this.anInt7726 < 0) {
				this.aShortArray133 = new short[this.anInt7727];
				for (@Pc(78) int local78 = 0; local78 < this.anInt7727; local78++) {
					this.aShortArray133[local78] = (short) arg1.method6008();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7734 = this.anInt7733 = arg1.method6041();
		} else if (arg0 == 4) {
			this.anInt7738 = arg1.method6041();
		} else if (arg0 == 5) {
			this.anInt7734 = arg1.method6041();
		} else if (arg0 == 6) {
			this.anInt7733 = arg1.method6041();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII)I")
	private int method6391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg4 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (arg2 <= local13) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg5 - 4096;
		@Pc(34) int local34 = local17 - 4096;
		local13 &= 0xFF;
		@Pc(47) int local47 = this.aByteArray104[local21 + arg3] & 0x3;
		@Pc(59) int local59 = Class6_Sub1_Sub11.anIntArray407[local17];
		@Pc(77) int local77;
		if (local47 <= 1) {
			local77 = local47 == 0 ? arg5 + local17 : arg5 - local17;
		} else {
			local77 = local47 == 2 ? local17 - arg5 : -local17 + -arg5;
		}
		local47 = this.aByteArray104[arg3 + local13] & 0x3;
		@Pc(121) int local121;
		if (local47 > 1) {
			local121 = local47 == 2 ? local34 - arg5 : -local34 - arg5;
		} else {
			local121 = local47 == 0 ? local34 + arg5 : arg5 + -local34;
		}
		@Pc(145) int local145 = (local59 * (local121 - local77) >> 12) + local77;
		local47 = this.aByteArray104[arg0 + local21] & 0x3;
		if (local47 <= 1) {
			local77 = local47 == 0 ? local30 + local17 : local30 + -local17;
		} else {
			local77 = local47 == 2 ? local17 - local30 : -local17 - local30;
		}
		local47 = this.aByteArray104[arg0 + local13] & 0x3;
		if (local47 > 1) {
			local121 = local47 == 2 ? local34 - local30 : -local34 + -local30;
		} else {
			local121 = local47 == 0 ? local34 + local30 : local30 - local34;
		}
		@Pc(242) int local242 = ((local121 - local77) * local59 >> 12) + local77;
		return local145 + (arg1 * (local242 - local145) >> 12);
	}
}
