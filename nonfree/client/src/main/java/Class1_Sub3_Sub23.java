import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
	public int anInt3536 = 4;

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
	public int anInt3533 = 0;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
	public int anInt3538 = 4;

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
	public int anInt3543 = 4;

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
	public int anInt3541 = 1638;

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[B")
	private byte[] aByteArray49 = new byte[512];

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean257 = arg0.method2690() == 1;
		} else if (arg1 == 1) {
			this.anInt3536 = arg0.method2690();
		} else if (arg1 == 2) {
			this.anInt3541 = arg0.method2632();
			if (this.anInt3541 < 0) {
				this.aShortArray64 = new short[this.anInt3536];
				for (@Pc(79) int local79 = 0; local79 < this.anInt3536; local79++) {
					this.aShortArray64[local79] = (short) arg0.method2632();
				}
			}
		} else if (arg1 == 3) {
			this.anInt3538 = this.anInt3543 = arg0.method2690();
		} else if (arg1 == 4) {
			this.anInt3533 = arg0.method2690();
		} else if (arg1 == 5) {
			this.anInt3538 = arg0.method2690();
		} else if (arg1 == 6) {
			this.anInt3543 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.aByteArray49 = Static9.method246(this.anInt3533);
		this.method2854();
		for (@Pc(21) int local21 = this.anInt3536 - 1; local21 >= 1; local21--) {
			@Pc(29) short local29 = this.aShortArray64[local21];
			if (local29 > 8 || local29 < -8) {
				break;
			}
			this.anInt3536--;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)I")
	private int method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - 4096;
		@Pc(13) int local13 = arg3 >> 12;
		@Pc(17) int local17 = arg3 & 0xFFF;
		@Pc(21) int local21 = local17 - 4096;
		@Pc(25) int local25 = Class11.anIntArray37[local17];
		@Pc(29) int local29 = local13 + 1;
		if (local29 >= arg4) {
			local29 = 0;
		}
		local29 &= 0xFF;
		local13 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray49[local13 + arg5] & 0x3;
		@Pc(73) int local73;
		if (local56 <= 1) {
			local73 = local56 == 0 ? arg1 + local17 : arg1 + -local17;
		} else {
			local73 = local56 == 2 ? local17 - arg1 : -arg1 + -local17;
		}
		local56 = this.aByteArray49[local29 + arg5] & 0x3;
		@Pc(125) int local125;
		if (local56 <= 1) {
			local125 = local56 == 0 ? local21 + arg1 : arg1 + -local21;
		} else {
			local125 = local56 == 2 ? local21 - arg1 : -arg1 + -local21;
		}
		@Pc(153) int local153 = ((local125 - local73) * local25 >> 12) + local73;
		local56 = this.aByteArray49[local13 + arg0] & 0x3;
		if (local56 > 1) {
			local73 = local56 == 2 ? local17 - local9 : -local17 - local9;
		} else {
			local73 = local56 == 0 ? local9 + local17 : local9 + -local17;
		}
		local56 = this.aByteArray49[arg0 + local29] & 0x3;
		if (local56 <= 1) {
			local125 = local56 == 0 ? local9 + local21 : -local21 + local9;
		} else {
			local125 = local56 == 2 ? local21 - local9 : -local9 + -local21;
		}
		@Pc(248) int local248 = local73 + ((local125 - local73) * local25 >> 12);
		return ((local248 - local153) * arg2 >> 12) + local153;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V")
	private void method2854() {
		@Pc(22) int local22;
		if (this.anInt3541 > 0) {
			this.aShortArray65 = new short[this.anInt3536];
			this.aShortArray64 = new short[this.anInt3536];
			for (local22 = 0; local22 < this.anInt3536; local22++) {
				this.aShortArray64[local22] = (short) (Math.pow((double) ((float) this.anInt3541 / 4096.0F), (double) local22) * 4096.0D);
				this.aShortArray65[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		} else if (this.aShortArray64 != null && this.aShortArray64.length == this.anInt3536) {
			this.aShortArray65 = new short[this.anInt3536];
			for (local22 = 0; local22 < this.anInt3536; local22++) {
				this.aShortArray65[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			this.method2856(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[II)V")
	public void method2856(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static132.anIntArray265[arg1] * this.anInt3543;
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(42) int local42;
		@Pc(29) short local29;
		@Pc(103) int local103;
		@Pc(62) int local62;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(83) int local83;
		@Pc(66) int local66;
		@Pc(87) int local87;
		@Pc(75) int local75;
		@Pc(101) int local101;
		if (this.anInt3536 == 1) {
			local29 = this.aShortArray64[0];
			local42 = this.aShortArray65[0] << 12;
			local62 = local12 * local42 >> 12;
			local56 = this.anInt3538 * local42 >> 12;
			local66 = local62 >> 12;
			local62 &= 0xFFF;
			local75 = this.aByteArray49[local66 & 0xFF] & 0xFF;
			local87 = local66 + 1;
			local83 = Class11.anIntArray37[local62];
			local49 = local42 * this.anInt3543 >> 12;
			if (local49 <= local87) {
				local87 = 0;
			}
			local101 = this.aByteArray49[local87 & 0xFF] & 0xFF;
			if (this.aBoolean257) {
				for (local103 = 0; local103 < Static227.anInt4511; local103++) {
					local113 = Static209.anIntArray377[local103] * this.anInt3538;
					local127 = this.method2852(local101, local62, local83, local42 * local113 >> 12, local56, local75);
					local127 = local29 * local127 >> 12;
					arg0[local103] = (local127 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static227.anInt4511; local103++) {
					local113 = Static209.anIntArray377[local103] * this.anInt3538;
					local127 = this.method2852(local101, local62, local83, local42 * local113 >> 12, local56, local75);
					arg0[local103] = local127 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray64[0];
		if (local29 > 8 || local29 < -8) {
			local42 = this.aShortArray65[0] << 12;
			local49 = this.anInt3543 * local42 >> 12;
			local56 = local42 * this.anInt3538 >> 12;
			local62 = local12 * local42 >> 12;
			local66 = local62 >> 12;
			local75 = this.aByteArray49[local66 & 0xFF] & 0xFF;
			@Pc(79) int local79 = local62 & 0xFFF;
			local83 = Class11.anIntArray37[local79];
			local87 = local66 + 1;
			if (local87 >= local49) {
				local87 = 0;
			}
			local101 = this.aByteArray49[local87 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static227.anInt4511; local103++) {
				local113 = Static209.anIntArray377[local103] * this.anInt3538;
				local127 = this.method2852(local101, local79, local83, local42 * local113 >> 12, local56, local75);
				arg0[local103] = local29 * local127 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt3536; local140++) {
			local29 = this.aShortArray64[local140];
			if (local29 > 8 || local29 < -8) {
				local42 = this.aShortArray65[local140] << 12;
				local62 = local12 * local42 >> 12;
				local49 = this.anInt3543 * local42 >> 12;
				local66 = local62 >> 12;
				local56 = local42 * this.anInt3538 >> 12;
				local87 = local66 + 1;
				local62 &= 0xFFF;
				local83 = Class11.anIntArray37[local62];
				local75 = this.aByteArray49[local66 & 0xFF] & 0xFF;
				if (local87 >= local49) {
					local87 = 0;
				}
				local101 = this.aByteArray49[local87 & 0xFF] & 0xFF;
				if (this.aBoolean257 && local140 == this.anInt3536 - 1) {
					for (local103 = 0; local103 < Static227.anInt4511; local103++) {
						local113 = this.anInt3538 * Static209.anIntArray377[local103];
						local127 = this.method2852(local101, local62, local83, local113 * local42 >> 12, local56, local75);
						local127 = arg0[local103] + (local127 * local29 >> 12);
						arg0[local103] = (local127 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static227.anInt4511; local103++) {
						local113 = Static209.anIntArray377[local103] * this.anInt3538;
						local127 = this.method2852(local101, local62, local83, local42 * local113 >> 12, local56, local75);
						arg0[local103] += local127 * local29 >> 12;
					}
				}
			}
		}
	}
}
