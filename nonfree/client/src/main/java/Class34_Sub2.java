import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!cf", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat29 = 1.0F;
		this.aFloat34 = this.aFloat28 = Class260.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat27 = Class260.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat26 = this.aFloat31 = this.aFloat36 = this.aFloat32 = this.aFloat35 = this.aFloat33 = this.aFloat30 = 0.0F;
		this.aFloat25 = -this.aFloat27;
	}

	@OriginalMember(owner = "client!cf", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat29 + this.aFloat26 * (float) arg1 + (float) arg2 * this.aFloat31);
		arg3[2] = (int) ((float) arg0 * this.aFloat33 + this.aFloat27 * (float) arg1 + (float) arg2 * this.aFloat28);
		arg3[1] = (int) ((float) arg1 * this.aFloat34 + this.aFloat32 * (float) arg0 + (float) arg2 * this.aFloat25);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)[F")
	public float[] method971() {
		Static531.aFloatArray80[2] = this.aFloat33;
		Static531.aFloatArray80[8] = this.aFloat31;
		Static531.aFloatArray80[4] = this.aFloat26;
		Static531.aFloatArray80[10] = this.aFloat28;
		Static531.aFloatArray80[5] = this.aFloat34;
		Static531.aFloatArray80[1] = this.aFloat32;
		Static531.aFloatArray80[6] = this.aFloat27;
		Static531.aFloatArray80[14] = this.aFloat30;
		Static531.aFloatArray80[12] = this.aFloat36;
		Static531.aFloatArray80[0] = this.aFloat29;
		Static531.aFloatArray80[9] = this.aFloat25;
		Static531.aFloatArray80[13] = this.aFloat35;
		return Static531.aFloatArray80;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6215() {
		@Pc(7) Class34_Sub2 local7 = new Class34_Sub2();
		local7.aFloat35 = this.aFloat35;
		local7.aFloat29 = this.aFloat29;
		local7.aFloat32 = this.aFloat32;
		local7.aFloat27 = this.aFloat27;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat28 = this.aFloat28;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat31 = this.aFloat31;
		local7.aFloat25 = this.aFloat25;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat30 = this.aFloat30;
		return local7;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public void method972() {
		this.aFloat30 = -this.aFloat30;
		this.aFloat35 = -this.aFloat35;
		this.aFloat32 = -this.aFloat32;
		this.aFloat34 = -this.aFloat34;
		this.aFloat27 = -this.aFloat27;
		this.aFloat25 = -this.aFloat25;
		this.aFloat28 = -this.aFloat28;
		this.aFloat33 = -this.aFloat33;
	}

	@OriginalMember(owner = "client!cf", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat36;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat35;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat30;
		arg0[2] = (int) (this.aFloat28 * local29 + this.aFloat31 * local11 + this.aFloat25 * local20);
		arg0[0] = (int) (local29 * this.aFloat33 + this.aFloat32 * local20 + this.aFloat29 * local11);
		arg0[1] = (int) (local29 * this.aFloat27 + local11 * this.aFloat26 + this.aFloat34 * local20);
	}

	@OriginalMember(owner = "client!cf", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat30 = arg2;
		this.aFloat35 = arg1;
		this.aFloat29 = this.aFloat34 = this.aFloat28 = 1.0F;
		this.aFloat36 = arg0;
		this.aFloat32 = this.aFloat33 = this.aFloat26 = this.aFloat27 = this.aFloat31 = this.aFloat25 = 0.0F;
	}

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class260.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class260.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat32;
		@Pc(21) float local21 = this.aFloat34;
		@Pc(24) float local24 = this.aFloat25;
		@Pc(27) float local27 = this.aFloat35;
		this.aFloat32 = local18 * local9 - this.aFloat33 * local15;
		this.aFloat34 = local21 * local9 - this.aFloat27 * local15;
		this.aFloat33 = local9 * this.aFloat33 + local18 * local15;
		this.aFloat27 = local15 * local21 + this.aFloat27 * local9;
		this.aFloat25 = local9 * local24 - local15 * this.aFloat28;
		this.aFloat28 = local9 * this.aFloat28 + local24 * local15;
		this.aFloat35 = local9 * local27 - this.aFloat30 * local15;
		this.aFloat30 = this.aFloat30 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method973(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat26 = local6.aFloat32;
		this.aFloat31 = local6.aFloat33;
		this.aFloat29 = local6.aFloat29;
		this.aFloat25 = local6.aFloat27;
		this.aFloat34 = local6.aFloat34;
		this.aFloat33 = local6.aFloat31;
		this.aFloat32 = local6.aFloat26;
		this.aFloat27 = local6.aFloat25;
		this.aFloat28 = local6.aFloat28;
		this.aFloat36 = -(this.aFloat31 * local6.aFloat30 + local6.aFloat35 * this.aFloat26 + local6.aFloat36 * this.aFloat29);
		this.aFloat35 = -(local6.aFloat35 * this.aFloat34 + this.aFloat32 * local6.aFloat36 + this.aFloat25 * local6.aFloat30);
		this.aFloat30 = -(this.aFloat28 * local6.aFloat30 + this.aFloat33 * local6.aFloat36 + this.aFloat27 * local6.aFloat35);
	}

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat34 = 1.0F;
		this.aFloat29 = this.aFloat28 = Class260.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat31 = Class260.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat26 = this.aFloat36 = this.aFloat32 = this.aFloat25 = this.aFloat35 = this.aFloat27 = this.aFloat30 = 0.0F;
		this.aFloat33 = -this.aFloat31;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat36 + this.aFloat31 * (float) arg2 + (float) arg1 * this.aFloat26 + this.aFloat29 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat28 + (float) arg1 * this.aFloat27 + (float) arg0 * this.aFloat33 + this.aFloat30);
		arg3[1] = (int) (this.aFloat35 + this.aFloat32 * (float) arg0 + (float) arg1 * this.aFloat34 + this.aFloat25 * (float) arg2);
	}

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "(III[I)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat35);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat30);
		@Pc(20) int local20 = (int) ((float) arg0 - this.aFloat36);
		arg3[2] = (int) ((float) local13 * this.aFloat28 + this.aFloat25 * (float) local6 + (float) local20 * this.aFloat31);
		arg3[0] = (int) ((float) local13 * this.aFloat33 + (float) local6 * this.aFloat32 + this.aFloat29 * (float) local20);
		arg3[1] = (int) ((float) local20 * this.aFloat26 + (float) local6 * this.aFloat34 + this.aFloat27 * (float) local13);
	}

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat30 += arg2;
		this.aFloat36 += arg0;
		this.aFloat35 += arg1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FI[FFFF)V")
	public void method976(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg1[2] = arg0 * this.aFloat33 + arg3 * this.aFloat27 + this.aFloat28 * arg4;
		arg1[1] = this.aFloat25 * arg4 + this.aFloat34 * arg3 + arg0 * this.aFloat32;
		arg1[0] = this.aFloat26 * arg3 + this.aFloat29 * arg0 + this.aFloat31 * arg4;
		@Pc(97) float local97;
		@Pc(89) float local89;
		@Pc(81) float local81;
		@Pc(73) float local73;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local73 = -arg2 / arg0;
			local81 = local73 * this.aFloat33 + this.aFloat30;
			local89 = local73 * this.aFloat32 + this.aFloat35;
			local97 = this.aFloat36 + local73 * this.aFloat29;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local73 = -arg2 / arg3;
			local97 = local73 * this.aFloat26 + this.aFloat36;
			local81 = this.aFloat30 + local73 * this.aFloat27;
			local89 = local73 * this.aFloat34 + this.aFloat35;
		} else {
			local73 = -arg2 / arg4;
			local97 = this.aFloat36 + local73 * this.aFloat31;
			local81 = this.aFloat28 * local73 + this.aFloat30;
			local89 = this.aFloat35 + local73 * this.aFloat25;
		}
		arg1[3] = -(arg1[0] * local97 + arg1[1] * local89 + arg1[2] * local81);
	}

	@OriginalMember(owner = "client!cf", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class260.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class260.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat29;
		@Pc(21) float local21 = this.aFloat26;
		@Pc(24) float local24 = this.aFloat31;
		this.aFloat29 = local18 * local9 - local15 * this.aFloat32;
		@Pc(37) float local37 = this.aFloat36;
		this.aFloat32 = this.aFloat32 * local9 + local18 * local15;
		this.aFloat26 = local9 * local21 - local15 * this.aFloat34;
		this.aFloat34 = local21 * local15 + this.aFloat34 * local9;
		this.aFloat31 = local24 * local9 - local15 * this.aFloat25;
		this.aFloat36 = local37 * local9 - local15 * this.aFloat35;
		this.aFloat25 = local15 * local24 + this.aFloat25 * local9;
		this.aFloat35 = local9 * this.aFloat35 + local37 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class260.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class260.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat29;
		@Pc(21) float local21 = this.aFloat26;
		@Pc(24) float local24 = this.aFloat31;
		this.aFloat29 = local18 * local9 + this.aFloat33 * local15;
		@Pc(37) float local37 = this.aFloat36;
		this.aFloat33 = local9 * this.aFloat33 - local18 * local15;
		this.aFloat26 = local15 * this.aFloat27 + local9 * local21;
		this.aFloat27 = local9 * this.aFloat27 - local15 * local21;
		this.aFloat31 = local9 * local24 + this.aFloat28 * local15;
		this.aFloat36 = local9 * local37 + this.aFloat30 * local15;
		this.aFloat28 = this.aFloat28 * local9 - local24 * local15;
		this.aFloat30 = this.aFloat30 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class260.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class260.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class260.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class260.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class260.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class260.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat25 = local27 * local39 + local21 * local43;
		this.aFloat26 = local9 * local39;
		this.aFloat28 = local9 * local21;
		this.aFloat31 = local47 * local21 + -local27 * local33;
		this.aFloat29 = local33 * local21 + local47 * local27;
		this.aFloat27 = -local15;
		this.aFloat32 = local39 * -local21 + local43 * local27;
		this.aFloat33 = local9 * local27;
		this.aFloat34 = local9 * local33;
		this.aFloat30 = this.aFloat33 * (float) -arg0 - this.aFloat27 * (float) arg1 - this.aFloat28 * (float) arg2;
		this.aFloat35 = -((float) arg2 * this.aFloat25) + (float) -arg0 * this.aFloat32 - (float) arg1 * this.aFloat34;
		this.aFloat36 = -(this.aFloat31 * (float) arg2) + this.aFloat29 * (float) -arg0 - this.aFloat26 * (float) arg1;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)[F")
	public float[] method978() {
		Static531.aFloatArray80[5] = this.aFloat34;
		Static531.aFloatArray80[4] = this.aFloat26;
		Static531.aFloatArray80[0] = this.aFloat29;
		Static531.aFloatArray80[12] = 0.0F;
		Static531.aFloatArray80[1] = this.aFloat32;
		Static531.aFloatArray80[10] = this.aFloat28;
		Static531.aFloatArray80[13] = 0.0F;
		Static531.aFloatArray80[8] = this.aFloat31;
		Static531.aFloatArray80[14] = 0.0F;
		Static531.aFloatArray80[6] = this.aFloat27;
		Static531.aFloatArray80[9] = this.aFloat25;
		Static531.aFloatArray80[2] = this.aFloat33;
		return Static531.aFloatArray80;
	}

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat33 = local6.aFloat33;
		this.aFloat32 = local6.aFloat32;
		this.aFloat31 = local6.aFloat31;
		this.aFloat27 = local6.aFloat27;
		this.aFloat34 = local6.aFloat34;
		this.aFloat26 = local6.aFloat26;
		this.aFloat28 = local6.aFloat28;
		this.aFloat35 = local6.aFloat35;
		this.aFloat36 = local6.aFloat36;
		this.aFloat30 = local6.aFloat30;
		this.aFloat29 = local6.aFloat29;
		this.aFloat25 = local6.aFloat25;
	}

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat29 = this.aFloat34 = this.aFloat28 = 1.0F;
		this.aFloat32 = this.aFloat33 = this.aFloat26 = this.aFloat27 = this.aFloat31 = this.aFloat25 = this.aFloat36 = this.aFloat35 = this.aFloat30 = 0.0F;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FBIFIIF)V")
	public void method980(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat32 = this.aFloat33 = this.aFloat26 = this.aFloat27 = this.aFloat31 = this.aFloat25 = 0.0F;
			this.aFloat34 = arg3;
			this.aFloat28 = 1.0F;
			this.aFloat29 = arg1;
		} else {
			@Pc(10) float local10 = Class260.aFloatArray58[arg4 & 0x3FFF];
			@Pc(16) float local16 = Class260.aFloatArray57[arg4 & 0x3FFF];
			this.aFloat34 = (float) arg3 * local10;
			this.aFloat33 = this.aFloat27 = this.aFloat31 = this.aFloat25 = 0.0F;
			this.aFloat29 = local10 * (float) arg1;
			this.aFloat32 = (float) arg1 * local16;
			this.aFloat26 = (float) arg3 * -local16;
			this.aFloat28 = 1.0F;
		}
		this.aFloat35 = arg0;
		this.aFloat30 = arg5;
		this.aFloat36 = arg2;
	}

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat28 = 1.0F;
		this.aFloat29 = this.aFloat34 = Class260.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat32 = Class260.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat26 = -this.aFloat32;
		this.aFloat31 = this.aFloat36 = this.aFloat25 = this.aFloat35 = this.aFloat33 = this.aFloat27 = this.aFloat30 = 0.0F;
	}
}
