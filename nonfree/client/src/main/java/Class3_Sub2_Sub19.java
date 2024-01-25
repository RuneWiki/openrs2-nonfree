import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!ni", name = "J", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
	public int anInt7076 = 1638;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
	public int anInt7080 = 4;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
	public int anInt7081 = 4;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "[B")
	private byte[] aByteArray72 = new byte[512];

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
	public int anInt7082 = 0;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
	public int anInt7084 = 4;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
	public boolean aBoolean512 = true;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([III)V")
	public void method6095(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7080 * Static372.anIntArray207[arg1];
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(100) int local100;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(95) int local95;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(91) int local91;
		@Pc(82) int local82;
		if (this.anInt7084 == 1) {
			local29 = this.aShortArray106[0];
			local36 = this.aShortArray107[0] << 12;
			local43 = this.anInt7080 * local36 >> 12;
			local49 = local12 * local36 >> 12;
			local56 = local36 * this.anInt7081 >> 12;
			local60 = local49 >> 12;
			local64 = local60 + 1;
			if (local43 <= local64) {
				local64 = 0;
			}
			local49 &= 0xFFF;
			local82 = this.aByteArray72[local64 & 0xFF] & 0xFF;
			local91 = this.aByteArray72[local60 & 0xFF] & 0xFF;
			local95 = Class185_Sub1.anIntArray417[local49];
			if (this.aBoolean512) {
				for (local100 = 0; local100 < Static491.anInt8519; local100++) {
					local109 = this.anInt7081 * Static546.anIntArray582[local100];
					local123 = this.method6097(local49, local56, local36 * local109 >> 12, local82, local91, local95);
					local123 = local123 * local29 >> 12;
					arg0[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static491.anInt8519; local100++) {
					local109 = this.anInt7081 * Static546.anIntArray582[local100];
					local123 = this.method6097(local49, local56, local109 * local36 >> 12, local82, local91, local95);
					arg0[local100] = local29 * local123 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray106[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray107[0] << 12;
			local56 = this.anInt7081 * local36 >> 12;
			local43 = local36 * this.anInt7080 >> 12;
			local49 = local36 * local12 >> 12;
			local60 = local49 >> 12;
			local64 = local60 + 1;
			@Pc(236) int local236 = local49 & 0xFFF;
			if (local64 >= local43) {
				local64 = 0;
			}
			local91 = this.aByteArray72[local60 & 0xFF] & 0xFF;
			local82 = this.aByteArray72[local64 & 0xFF] & 0xFF;
			local95 = Class185_Sub1.anIntArray417[local236];
			for (local100 = 0; local100 < Static491.anInt8519; local100++) {
				local109 = Static546.anIntArray582[local100] * this.anInt7081;
				local123 = this.method6097(local236, local56, local109 * local36 >> 12, local82, local91, local95);
				arg0[local100] = local29 * local123 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt7084; local306++) {
			local29 = this.aShortArray106[local306];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray107[local306] << 12;
				local56 = local36 * this.anInt7081 >> 12;
				local49 = local12 * local36 >> 12;
				local43 = local36 * this.anInt7080 >> 12;
				local60 = local49 >> 12;
				local64 = local60 + 1;
				if (local64 >= local43) {
					local64 = 0;
				}
				local49 &= 0xFFF;
				local91 = this.aByteArray72[local60 & 0xFF] & 0xFF;
				local82 = this.aByteArray72[local64 & 0xFF] & 0xFF;
				local95 = Class185_Sub1.anIntArray417[local49];
				if (this.aBoolean512 && this.anInt7084 - 1 == local306) {
					for (local100 = 0; local100 < Static491.anInt8519; local100++) {
						local109 = this.anInt7081 * Static546.anIntArray582[local100];
						local123 = this.method6097(local49, local56, local36 * local109 >> 12, local82, local91, local95);
						local123 = (local29 * local123 >> 12) + arg0[local100];
						arg0[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static491.anInt8519; local100++) {
						local109 = this.anInt7081 * Static546.anIntArray582[local100];
						local123 = this.method6097(local49, local56, local36 * local109 >> 12, local82, local91, local95);
						arg0[local100] += local123 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)I")
	private int method6097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg1 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(26) int local26 = arg2 & 0xFFF;
		@Pc(30) int local30 = arg0 - 4096;
		@Pc(34) int local34 = local26 - 4096;
		local13 &= 0xFF;
		@Pc(47) int local47 = Class185_Sub1.anIntArray417[local26];
		@Pc(56) int local56 = this.aByteArray72[arg4 + local9] & 0x3;
		@Pc(74) int local74;
		if (local56 > 1) {
			local74 = local56 == 2 ? local26 - arg0 : -local26 - arg0;
		} else {
			local74 = local56 == 0 ? local26 + arg0 : arg0 - local26;
		}
		local56 = this.aByteArray72[arg4 + local13] & 0x3;
		@Pc(119) int local119;
		if (local56 <= 1) {
			local119 = local56 == 0 ? local34 + arg0 : -local34 + arg0;
		} else {
			local119 = local56 == 2 ? local34 - arg0 : -local34 + -arg0;
		}
		@Pc(146) int local146 = ((local119 - local74) * local47 >> 12) + local74;
		local56 = this.aByteArray72[local9 + arg3] & 0x3;
		if (local56 > 1) {
			local74 = local56 == 2 ? local26 - local30 : -local26 - local30;
		} else {
			local74 = local56 == 0 ? local30 + local26 : local30 - local26;
		}
		local56 = this.aByteArray72[arg3 + local13] & 0x3;
		if (local56 <= 1) {
			local119 = local56 == 0 ? local34 + local30 : local30 + -local34;
		} else {
			local119 = local56 == 2 ? local34 - local30 : -local30 + -local34;
		}
		@Pc(238) int local238 = (local47 * (local119 - local74) >> 12) + local74;
		return (arg5 * (local238 - local146) >> 12) + local146;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.aByteArray72 = Static136.method2561(this.anInt7082);
		this.method6098();
		for (@Pc(25) int local25 = this.anInt7084 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray106[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt7084--;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean512 = arg0.method4225() == 1;
		} else if (arg1 == 1) {
			this.anInt7084 = arg0.method4225();
		} else if (arg1 == 2) {
			this.anInt7076 = arg0.method4209();
			if (this.anInt7076 < 0) {
				this.aShortArray106 = new short[this.anInt7084];
				for (@Pc(69) int local69 = 0; local69 < this.anInt7084; local69++) {
					this.aShortArray106[local69] = (short) arg0.method4209();
				}
			}
		} else if (arg1 == 3) {
			this.anInt7081 = this.anInt7080 = arg0.method4225();
		} else if (arg1 == 4) {
			this.anInt7082 = arg0.method4225();
		} else if (arg1 == 5) {
			this.anInt7081 = arg0.method4225();
		} else if (arg1 == 6) {
			this.anInt7080 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			this.method6095(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	private void method6098() {
		@Pc(20) int local20;
		if (this.anInt7076 > 0) {
			this.aShortArray107 = new short[this.anInt7084];
			this.aShortArray106 = new short[this.anInt7084];
			for (local20 = 0; local20 < this.anInt7084; local20++) {
				this.aShortArray106[local20] = (short) (Math.pow((double) ((float) this.anInt7076 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray107[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray106 != null && this.aShortArray106.length == this.anInt7084) {
			this.aShortArray107 = new short[this.anInt7084];
			for (local20 = 0; local20 < this.anInt7084; local20++) {
				this.aShortArray107[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}
}
