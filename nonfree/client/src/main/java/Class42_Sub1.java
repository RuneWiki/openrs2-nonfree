import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class42_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)[F")
	public float[] method1224() {
		Static148.aFloatArray34[9] = this.aFloat54;
		Static148.aFloatArray34[12] = 0.0F;
		Static148.aFloatArray34[10] = this.aFloat51;
		Static148.aFloatArray34[6] = this.aFloat44;
		Static148.aFloatArray34[5] = this.aFloat48;
		Static148.aFloatArray34[0] = this.aFloat47;
		Static148.aFloatArray34[2] = this.aFloat45;
		Static148.aFloatArray34[14] = 0.0F;
		Static148.aFloatArray34[13] = 0.0F;
		Static148.aFloatArray34[8] = this.aFloat55;
		Static148.aFloatArray34[1] = this.aFloat53;
		Static148.aFloatArray34[4] = this.aFloat49;
		return Static148.aFloatArray34;
	}

	@OriginalMember(owner = "client!bt", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class8.aFloatArray2[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class8.aFloatArray1[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class8.aFloatArray2[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class8.aFloatArray1[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class8.aFloatArray2[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class8.aFloatArray1[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat44 = -local15;
		this.aFloat54 = local43 * local21 + local39 * local27;
		this.aFloat45 = local9 * local27;
		this.aFloat51 = local21 * local9;
		this.aFloat47 = local33 * local21 + local27 * local47;
		this.aFloat48 = local33 * local9;
		this.aFloat55 = -local27 * local33 + local47 * local21;
		this.aFloat49 = local9 * local39;
		this.aFloat53 = local43 * local27 + -local21 * local39;
		this.aFloat52 = -(this.aFloat55 * (float) arg2) - this.aFloat49 * (float) arg1 + (float) -arg0 * this.aFloat47;
		this.aFloat50 = this.aFloat53 * (float) -arg0 - (float) arg1 * this.aFloat48 - this.aFloat54 * (float) arg2;
		this.aFloat46 = -((float) arg2 * this.aFloat51) - this.aFloat44 * (float) arg1 + (float) -arg0 * this.aFloat45;
	}

	@OriginalMember(owner = "client!bt", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat52;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat50;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat46;
		arg0[2] = (int) (local29 * this.aFloat51 + local12 * this.aFloat55 + local21 * this.aFloat54);
		arg0[1] = (int) (local29 * this.aFloat44 + local21 * this.aFloat48 + local12 * this.aFloat49);
		arg0[0] = (int) (local21 * this.aFloat53 + local12 * this.aFloat47 + local29 * this.aFloat45);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat52 + (float) arg0 * this.aFloat47 + this.aFloat49 * (float) arg1 + (float) arg2 * this.aFloat55);
		arg3[2] = (int) (this.aFloat46 + (float) arg2 * this.aFloat51 + (float) arg1 * this.aFloat44 + this.aFloat45 * (float) arg0);
		arg3[1] = (int) (this.aFloat53 * (float) arg0 + (float) arg1 * this.aFloat48 + (float) arg2 * this.aFloat54 + this.aFloat50);
	}

	@OriginalMember(owner = "client!bt", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 = this.aFloat45 = this.aFloat49 = this.aFloat44 = this.aFloat55 = this.aFloat54 = 0.0F;
		this.aFloat47 = this.aFloat48 = this.aFloat51 = 1.0F;
		this.aFloat46 = arg2;
		this.aFloat50 = arg1;
		this.aFloat52 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat47 = this.aFloat48 = this.aFloat51 = 1.0F;
		this.aFloat53 = this.aFloat45 = this.aFloat49 = this.aFloat44 = this.aFloat55 = this.aFloat54 = this.aFloat52 = this.aFloat50 = this.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 += arg1;
		this.aFloat46 += arg2;
		this.aFloat52 += arg0;
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat48 = 1.0F;
		this.aFloat47 = this.aFloat51 = Class8.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat55 = Class8.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat55;
		this.aFloat49 = this.aFloat52 = this.aFloat53 = this.aFloat54 = this.aFloat50 = this.aFloat44 = this.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!q;)V")
	public void method1228(@OriginalArg(1) Class42 arg0) {
		@Pc(6) Class42_Sub1 local6 = (Class42_Sub1) arg0;
		this.aFloat55 = local6.aFloat45;
		this.aFloat47 = local6.aFloat47;
		this.aFloat49 = local6.aFloat53;
		this.aFloat45 = local6.aFloat55;
		this.aFloat54 = local6.aFloat44;
		this.aFloat53 = local6.aFloat49;
		this.aFloat48 = local6.aFloat48;
		this.aFloat44 = local6.aFloat54;
		this.aFloat52 = -(this.aFloat47 * local6.aFloat52 + local6.aFloat50 * this.aFloat49 + local6.aFloat46 * this.aFloat55);
		this.aFloat51 = local6.aFloat51;
		this.aFloat50 = -(this.aFloat53 * local6.aFloat52 + local6.aFloat50 * this.aFloat48 + local6.aFloat46 * this.aFloat54);
		this.aFloat46 = -(this.aFloat45 * local6.aFloat52 + this.aFloat44 * local6.aFloat50 + this.aFloat51 * local6.aFloat46);
	}

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat51 = 1.0F;
		this.aFloat47 = this.aFloat48 = Class8.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat53 = Class8.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat49 = -this.aFloat53;
		this.aFloat55 = this.aFloat52 = this.aFloat54 = this.aFloat50 = this.aFloat45 = this.aFloat44 = this.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat50);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat52);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat46);
		arg3[0] = (int) (this.aFloat47 * (float) local17 + (float) local10 * this.aFloat53 + this.aFloat45 * (float) local24);
		arg3[2] = (int) (this.aFloat55 * (float) local17 + (float) local10 * this.aFloat54 + (float) local24 * this.aFloat51);
		arg3[1] = (int) ((float) local10 * this.aFloat48 + (float) local17 * this.aFloat49 + (float) local24 * this.aFloat44);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFF[FIF)V")
	public void method1229(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[2] = this.aFloat44 * arg0 + arg4 * this.aFloat45 + this.aFloat51 * arg1;
		arg3[1] = arg1 * this.aFloat54 + this.aFloat53 * arg4 + this.aFloat48 * arg0;
		arg3[0] = arg4 * this.aFloat47 + this.aFloat49 * arg0 + arg1 * this.aFloat55;
		@Pc(77) float local77;
		@Pc(85) float local85;
		@Pc(93) float local93;
		@Pc(69) float local69;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local69 = -arg2 / arg4;
			local77 = this.aFloat47 * local69 + this.aFloat52;
			local85 = this.aFloat53 * local69 + this.aFloat50;
			local93 = this.aFloat46 + local69 * this.aFloat45;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local69 = -arg2 / arg0;
			local85 = this.aFloat50 + this.aFloat48 * local69;
			local77 = this.aFloat52 + local69 * this.aFloat49;
			local93 = local69 * this.aFloat44 + this.aFloat46;
		} else {
			local69 = -arg2 / arg1;
			local93 = local69 * this.aFloat51 + this.aFloat46;
			local85 = this.aFloat54 * local69 + this.aFloat50;
			local77 = local69 * this.aFloat55 + this.aFloat52;
		}
		arg3[3] = -(local93 * arg3[2] + local77 * arg3[0] + local85 * arg3[1]);
	}

	@OriginalMember(owner = "client!bt", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat47;
		@Pc(21) float local21 = this.aFloat49;
		@Pc(24) float local24 = this.aFloat55;
		@Pc(27) float local27 = this.aFloat52;
		this.aFloat47 = this.aFloat45 * local15 + local18 * local9;
		this.aFloat45 = this.aFloat45 * local9 - local18 * local15;
		this.aFloat49 = local9 * local21 + local15 * this.aFloat44;
		this.aFloat55 = local9 * local24 + local15 * this.aFloat51;
		this.aFloat44 = this.aFloat44 * local9 - local21 * local15;
		this.aFloat51 = this.aFloat51 * local9 - local15 * local24;
		this.aFloat52 = local27 * local9 + this.aFloat46 * local15;
		this.aFloat46 = this.aFloat46 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class42 arg0) {
		@Pc(6) Class42_Sub1 local6 = (Class42_Sub1) arg0;
		this.aFloat45 = local6.aFloat45;
		this.aFloat48 = local6.aFloat48;
		this.aFloat50 = local6.aFloat50;
		this.aFloat49 = local6.aFloat49;
		this.aFloat47 = local6.aFloat47;
		this.aFloat52 = local6.aFloat52;
		this.aFloat54 = local6.aFloat54;
		this.aFloat51 = local6.aFloat51;
		this.aFloat55 = local6.aFloat55;
		this.aFloat44 = local6.aFloat44;
		this.aFloat53 = local6.aFloat53;
		this.aFloat46 = local6.aFloat46;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)[F")
	public float[] method1230() {
		Static148.aFloatArray34[2] = this.aFloat45;
		Static148.aFloatArray34[8] = this.aFloat55;
		Static148.aFloatArray34[6] = this.aFloat44;
		Static148.aFloatArray34[1] = this.aFloat53;
		Static148.aFloatArray34[4] = this.aFloat49;
		Static148.aFloatArray34[10] = this.aFloat51;
		Static148.aFloatArray34[0] = this.aFloat47;
		Static148.aFloatArray34[5] = this.aFloat48;
		Static148.aFloatArray34[12] = this.aFloat52;
		Static148.aFloatArray34[14] = this.aFloat46;
		Static148.aFloatArray34[13] = this.aFloat50;
		Static148.aFloatArray34[9] = this.aFloat54;
		return Static148.aFloatArray34;
	}

	@OriginalMember(owner = "client!bt", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat48 + (float) arg0 * this.aFloat53 + this.aFloat54 * (float) arg2);
		arg3[0] = (int) (this.aFloat55 * (float) arg2 + this.aFloat47 * (float) arg0 + this.aFloat49 * (float) arg1);
		arg3[2] = (int) (this.aFloat45 * (float) arg0 + (float) arg1 * this.aFloat44 + this.aFloat51 * (float) arg2);
	}

	@OriginalMember(owner = "client!bt", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat47;
		@Pc(21) float local21 = this.aFloat49;
		@Pc(24) float local24 = this.aFloat55;
		@Pc(27) float local27 = this.aFloat52;
		this.aFloat47 = local9 * local18 - this.aFloat53 * local15;
		this.aFloat53 = this.aFloat53 * local9 + local15 * local18;
		this.aFloat49 = local9 * local21 - this.aFloat48 * local15;
		this.aFloat55 = local9 * local24 - this.aFloat54 * local15;
		this.aFloat48 = local15 * local21 + local9 * this.aFloat48;
		this.aFloat52 = local9 * local27 - local15 * this.aFloat50;
		this.aFloat54 = this.aFloat54 * local9 + local24 * local15;
		this.aFloat50 = local27 * local15 + this.aFloat50 * local9;
	}

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat53;
		@Pc(21) float local21 = this.aFloat48;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat50;
		this.aFloat53 = local18 * local9 - local15 * this.aFloat45;
		this.aFloat45 = local18 * local15 + this.aFloat45 * local9;
		this.aFloat48 = local21 * local9 - local15 * this.aFloat44;
		this.aFloat44 = local21 * local15 + this.aFloat44 * local9;
		this.aFloat54 = local24 * local9 - local15 * this.aFloat51;
		this.aFloat51 = this.aFloat51 * local9 + local24 * local15;
		this.aFloat50 = local27 * local9 - local15 * this.aFloat46;
		this.aFloat46 = local9 * this.aFloat46 + local27 * local15;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIFIIFF)V")
	public void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat53 = this.aFloat45 = this.aFloat49 = this.aFloat44 = this.aFloat55 = this.aFloat54 = 0.0F;
			this.aFloat51 = 1.0F;
			this.aFloat47 = arg3;
			this.aFloat48 = arg1;
		} else {
			@Pc(42) float local42 = Class8.aFloatArray2[arg0 & 0x3FFF];
			@Pc(48) float local48 = Class8.aFloatArray1[arg0 & 0x3FFF];
			this.aFloat47 = local42 * (float) arg3;
			this.aFloat49 = -local48 * (float) arg1;
			this.aFloat45 = this.aFloat44 = this.aFloat55 = this.aFloat54 = 0.0F;
			this.aFloat51 = 1.0F;
			this.aFloat53 = (float) arg3 * local48;
			this.aFloat48 = (float) arg1 * local42;
		}
		this.aFloat50 = arg4;
		this.aFloat52 = arg2;
		this.aFloat46 = arg5;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class42 method7519() {
		@Pc(7) Class42_Sub1 local7 = new Class42_Sub1();
		local7.aFloat54 = this.aFloat54;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat48 = this.aFloat48;
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
	public void method1233() {
		this.aFloat44 = -this.aFloat44;
		this.aFloat50 = -this.aFloat50;
		this.aFloat48 = -this.aFloat48;
		this.aFloat53 = -this.aFloat53;
		this.aFloat45 = -this.aFloat45;
		this.aFloat51 = -this.aFloat51;
		this.aFloat46 = -this.aFloat46;
		this.aFloat54 = -this.aFloat54;
	}

	@OriginalMember(owner = "client!bt", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat48 = this.aFloat51 = Class8.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat44 = Class8.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat54 = -this.aFloat44;
		this.aFloat49 = this.aFloat55 = this.aFloat52 = this.aFloat53 = this.aFloat50 = this.aFloat45 = this.aFloat46 = 0.0F;
	}
}
