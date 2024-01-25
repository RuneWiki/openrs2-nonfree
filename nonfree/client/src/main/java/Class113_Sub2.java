import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class113_Sub2 extends Class113 {

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!hda", name = "A", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!hda", name = "L", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class113_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!hda", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat65 = this.aFloat63 = this.aFloat70 = this.aFloat71 = this.aFloat72 = this.aFloat73 = this.aFloat68 = this.aFloat62 = this.aFloat69 = 0.0F;
		this.aFloat67 = this.aFloat66 = this.aFloat64 = 1.0F;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6103() {
		@Pc(7) Class113_Sub2 local7 = new Class113_Sub2();
		local7.aFloat70 = this.aFloat70;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat67 = this.aFloat67;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat69 = this.aFloat69;
		return local7;
	}

	@OriginalMember(owner = "client!hda", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class243.aFloatArray34[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class243.aFloatArray33[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat67;
		@Pc(21) float local21 = this.aFloat70;
		@Pc(24) float local24 = this.aFloat72;
		@Pc(27) float local27 = this.aFloat68;
		this.aFloat67 = local18 * local9 - this.aFloat65 * local15;
		this.aFloat70 = local9 * local21 - this.aFloat66 * local15;
		this.aFloat65 = this.aFloat65 * local9 + local18 * local15;
		this.aFloat72 = local24 * local9 - local15 * this.aFloat73;
		this.aFloat66 = local9 * this.aFloat66 + local21 * local15;
		this.aFloat73 = local15 * local24 + this.aFloat73 * local9;
		this.aFloat68 = local27 * local9 - local15 * this.aFloat62;
		this.aFloat62 = local27 * local15 + local9 * this.aFloat62;
	}

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class243.aFloatArray34[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class243.aFloatArray33[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat65;
		@Pc(21) float local21 = this.aFloat66;
		@Pc(24) float local24 = this.aFloat73;
		@Pc(27) float local27 = this.aFloat62;
		this.aFloat65 = local18 * local9 - local15 * this.aFloat63;
		this.aFloat63 = local15 * local18 + this.aFloat63 * local9;
		this.aFloat66 = local9 * local21 - local15 * this.aFloat71;
		this.aFloat73 = local9 * local24 - local15 * this.aFloat64;
		this.aFloat71 = local21 * local15 + this.aFloat71 * local9;
		this.aFloat62 = local27 * local9 - this.aFloat69 * local15;
		this.aFloat64 = local24 * local15 + local9 * this.aFloat64;
		this.aFloat69 = this.aFloat69 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!hda", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class243.aFloatArray34[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class243.aFloatArray33[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat67;
		@Pc(21) float local21 = this.aFloat70;
		@Pc(24) float local24 = this.aFloat72;
		@Pc(27) float local27 = this.aFloat68;
		this.aFloat67 = local18 * local9 + local15 * this.aFloat63;
		this.aFloat63 = local9 * this.aFloat63 - local15 * local18;
		this.aFloat70 = local15 * this.aFloat71 + local9 * local21;
		this.aFloat71 = this.aFloat71 * local9 - local15 * local21;
		this.aFloat72 = local15 * this.aFloat64 + local24 * local9;
		this.aFloat64 = this.aFloat64 * local9 - local15 * local24;
		this.aFloat68 = this.aFloat69 * local15 + local27 * local9;
		this.aFloat69 = local9 * this.aFloat69 - local27 * local15;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat69 + this.aFloat71 * (float) arg1 + (float) arg0 * this.aFloat63 + this.aFloat64 * (float) arg2);
		arg3[1] = (int) (this.aFloat62 + (float) arg2 * this.aFloat73 + (float) arg0 * this.aFloat65 + this.aFloat66 * (float) arg1);
		arg3[0] = (int) (this.aFloat68 + this.aFloat72 * (float) arg2 + (float) arg1 * this.aFloat70 + this.aFloat67 * (float) arg0);
	}

	@OriginalMember(owner = "client!hda", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat62 += arg1;
		this.aFloat68 += arg0;
		this.aFloat69 += arg2;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	public void method2596() {
		this.aFloat66 = -this.aFloat66;
		this.aFloat62 = -this.aFloat62;
		this.aFloat65 = -this.aFloat65;
		this.aFloat63 = -this.aFloat63;
		this.aFloat73 = -this.aFloat73;
		this.aFloat64 = -this.aFloat64;
		this.aFloat69 = -this.aFloat69;
		this.aFloat71 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!hda", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class243.aFloatArray34[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class243.aFloatArray33[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class243.aFloatArray34[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class243.aFloatArray33[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class243.aFloatArray34[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class243.aFloatArray33[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat73 = local21 * local43 + local39 * local27;
		this.aFloat65 = -local21 * local39 + local43 * local27;
		this.aFloat70 = local39 * local9;
		this.aFloat67 = local21 * local33 + local47 * local27;
		this.aFloat64 = local9 * local21;
		this.aFloat72 = local21 * local47 + -local27 * local33;
		this.aFloat71 = -local15;
		this.aFloat63 = local27 * local9;
		this.aFloat66 = local33 * local9;
		this.aFloat68 = -(this.aFloat70 * (float) arg1) + (float) -arg0 * this.aFloat67 - this.aFloat72 * (float) arg2;
		this.aFloat62 = -((float) arg1 * this.aFloat66) + this.aFloat65 * (float) -arg0 - (float) arg2 * this.aFloat73;
		this.aFloat69 = -(this.aFloat64 * (float) arg2) - (float) arg1 * this.aFloat71 + this.aFloat63 * (float) -arg0;
	}

	@OriginalMember(owner = "client!hda", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat65 * (float) arg0 + this.aFloat66 * (float) arg1 + this.aFloat73 * (float) arg2);
		arg3[2] = (int) (this.aFloat63 * (float) arg0 + (float) arg1 * this.aFloat71 + (float) arg2 * this.aFloat64);
		arg3[0] = (int) (this.aFloat67 * (float) arg0 + (float) arg1 * this.aFloat70 + (float) arg2 * this.aFloat72);
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)[F")
	public float[] method2598() {
		Static247.aFloatArray27[5] = this.aFloat66;
		Static247.aFloatArray27[6] = this.aFloat71;
		Static247.aFloatArray27[1] = this.aFloat65;
		Static247.aFloatArray27[8] = this.aFloat72;
		Static247.aFloatArray27[14] = this.aFloat69;
		Static247.aFloatArray27[12] = this.aFloat68;
		Static247.aFloatArray27[10] = this.aFloat64;
		Static247.aFloatArray27[4] = this.aFloat70;
		Static247.aFloatArray27[13] = this.aFloat62;
		Static247.aFloatArray27[2] = this.aFloat63;
		Static247.aFloatArray27[0] = this.aFloat67;
		Static247.aFloatArray27[9] = this.aFloat73;
		return Static247.aFloatArray27;
	}

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat66 = 1.0F;
		this.aFloat67 = this.aFloat64 = Class243.aFloatArray34[arg0 & 0x3FFF];
		this.aFloat72 = Class243.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat63 = -this.aFloat72;
		this.aFloat70 = this.aFloat68 = this.aFloat65 = this.aFloat73 = this.aFloat62 = this.aFloat71 = this.aFloat69 = 0.0F;
	}

	@OriginalMember(owner = "client!hda", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat68 = arg0;
		this.aFloat62 = arg1;
		this.aFloat65 = this.aFloat63 = this.aFloat70 = this.aFloat71 = this.aFloat72 = this.aFloat73 = 0.0F;
		this.aFloat69 = arg2;
		this.aFloat67 = this.aFloat66 = this.aFloat64 = 1.0F;
	}

	@OriginalMember(owner = "client!hda", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat67 = 1.0F;
		this.aFloat66 = this.aFloat64 = Class243.aFloatArray34[arg0 & 0x3FFF];
		this.aFloat71 = Class243.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat73 = -this.aFloat71;
		this.aFloat70 = this.aFloat72 = this.aFloat68 = this.aFloat65 = this.aFloat62 = this.aFloat63 = this.aFloat69 = 0.0F;
	}

	@OriginalMember(owner = "client!hda", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub2 local6 = (Class113_Sub2) arg0;
		this.aFloat69 = local6.aFloat69;
		this.aFloat63 = local6.aFloat63;
		this.aFloat67 = local6.aFloat67;
		this.aFloat68 = local6.aFloat68;
		this.aFloat70 = local6.aFloat70;
		this.aFloat66 = local6.aFloat66;
		this.aFloat65 = local6.aFloat65;
		this.aFloat71 = local6.aFloat71;
		this.aFloat73 = local6.aFloat73;
		this.aFloat64 = local6.aFloat64;
		this.aFloat72 = local6.aFloat72;
		this.aFloat62 = local6.aFloat62;
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)[F")
	public float[] method2599() {
		Static247.aFloatArray27[12] = 0.0F;
		Static247.aFloatArray27[2] = this.aFloat63;
		Static247.aFloatArray27[13] = 0;
		Static247.aFloatArray27[10] = this.aFloat64;
		Static247.aFloatArray27[14] = 0.0F;
		Static247.aFloatArray27[4] = this.aFloat70;
		Static247.aFloatArray27[9] = this.aFloat73;
		Static247.aFloatArray27[6] = this.aFloat71;
		Static247.aFloatArray27[5] = this.aFloat66;
		Static247.aFloatArray27[8] = this.aFloat72;
		Static247.aFloatArray27[1] = this.aFloat65;
		Static247.aFloatArray27[0] = this.aFloat67;
		return Static247.aFloatArray27;
	}

	@OriginalMember(owner = "client!hda", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat68;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat62;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat69;
		arg0[2] = (int) (local28 * this.aFloat64 + local19 * this.aFloat73 + this.aFloat72 * local11);
		arg0[1] = (int) (this.aFloat66 * local19 + this.aFloat70 * local11 + local28 * this.aFloat71);
		arg0[0] = (int) (this.aFloat63 * local28 + local19 * this.aFloat65 + this.aFloat67 * local11);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!q;)V")
	public void method2600(@OriginalArg(1) Class113 arg0) {
		@Pc(11) Class113_Sub2 local11 = (Class113_Sub2) arg0;
		this.aFloat72 = local11.aFloat63;
		this.aFloat67 = local11.aFloat67;
		this.aFloat70 = local11.aFloat65;
		this.aFloat66 = local11.aFloat66;
		this.aFloat65 = local11.aFloat70;
		this.aFloat73 = local11.aFloat71;
		this.aFloat63 = local11.aFloat72;
		this.aFloat71 = local11.aFloat73;
		this.aFloat68 = -(this.aFloat72 * local11.aFloat69 + this.aFloat70 * local11.aFloat62 + this.aFloat67 * local11.aFloat68);
		this.aFloat64 = local11.aFloat64;
		this.aFloat62 = -(local11.aFloat68 * this.aFloat65 + local11.aFloat62 * this.aFloat66 + this.aFloat73 * local11.aFloat69);
		this.aFloat69 = -(local11.aFloat62 * this.aFloat71 + local11.aFloat68 * this.aFloat63 + local11.aFloat69 * this.aFloat64);
	}

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat64 = 1.0F;
		this.aFloat67 = this.aFloat66 = Class243.aFloatArray34[arg0 & 0x3FFF];
		this.aFloat65 = Class243.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat72 = this.aFloat68 = this.aFloat73 = this.aFloat62 = this.aFloat63 = this.aFloat71 = this.aFloat69 = 0.0F;
		this.aFloat70 = -this.aFloat65;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(FIFIIBF)V")
	public void method2601(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat67 = arg3;
			this.aFloat65 = this.aFloat63 = this.aFloat70 = this.aFloat71 = this.aFloat72 = this.aFloat73 = 0.0F;
			this.aFloat64 = 1.0F;
			this.aFloat66 = arg4;
		} else {
			@Pc(14) float local14 = Class243.aFloatArray34[arg1 & 0x3FFF];
			@Pc(20) float local20 = Class243.aFloatArray33[arg1 & 0x3FFF];
			this.aFloat64 = 1.0F;
			this.aFloat65 = local20 * (float) arg3;
			this.aFloat66 = local14 * (float) arg4;
			this.aFloat63 = this.aFloat71 = this.aFloat72 = this.aFloat73 = 0.0F;
			this.aFloat70 = -local20 * (float) arg4;
			this.aFloat67 = local14 * (float) arg3;
		}
		this.aFloat62 = arg0;
		this.aFloat69 = arg5;
		this.aFloat68 = arg2;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(FF[FFFB)V")
	public void method2602(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg2[1] = arg0 * this.aFloat66 + arg3 * this.aFloat65 + this.aFloat73 * arg1;
		@Pc(57) float local57;
		@Pc(49) float local49;
		@Pc(65) float local65;
		@Pc(41) float local41;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local41 = -arg4 / arg3;
			local49 = this.aFloat62 + local41 * this.aFloat65;
			local57 = this.aFloat67 * local41 + this.aFloat68;
			local65 = this.aFloat69 + local41 * this.aFloat63;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local41 = -arg4 / arg0;
			local57 = this.aFloat70 * local41 + this.aFloat68;
			local65 = this.aFloat71 * local41 + this.aFloat69;
			local49 = this.aFloat62 + this.aFloat66 * local41;
		} else {
			local41 = -arg4 / arg1;
			local57 = local41 * this.aFloat72 + this.aFloat68;
			local49 = local41 * this.aFloat73 + this.aFloat62;
			local65 = this.aFloat69 + local41 * this.aFloat64;
		}
		arg2[2] = arg1 * this.aFloat64 + arg3 * this.aFloat63 + this.aFloat71 * arg0;
		arg2[0] = arg1 * this.aFloat72 + this.aFloat70 * arg0 + arg3 * this.aFloat67;
		arg2[3] = -(local49 * arg2[1] + arg2[0] * local57 + arg2[2] * local65);
	}
}
