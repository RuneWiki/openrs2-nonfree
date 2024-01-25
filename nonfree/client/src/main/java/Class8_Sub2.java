import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!cba", name = "G", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!cba", name = "K", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!cba", name = "L", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!cba", name = "M", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!cba", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat26;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat24;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat32;
		arg0[0] = (int) (this.aFloat23 * local11 + local20 * this.aFloat31 + this.aFloat21 * local28);
		arg0[2] = (int) (local11 * this.aFloat30 + this.aFloat29 * local20 + this.aFloat27 * local28);
		arg0[1] = (int) (this.aFloat22 * local28 + local20 * this.aFloat20 + this.aFloat25 * local11);
	}

	@OriginalMember(owner = "client!cba", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) arg0;
		this.aFloat25 = local6.aFloat25;
		this.aFloat22 = local6.aFloat22;
		this.aFloat24 = local6.aFloat24;
		this.aFloat30 = local6.aFloat30;
		this.aFloat32 = local6.aFloat32;
		this.aFloat31 = local6.aFloat31;
		this.aFloat27 = local6.aFloat27;
		this.aFloat21 = local6.aFloat21;
		this.aFloat29 = local6.aFloat29;
		this.aFloat23 = local6.aFloat23;
		this.aFloat26 = local6.aFloat26;
		this.aFloat20 = local6.aFloat20;
	}

	@OriginalMember(owner = "client!cba", name = "DA", descriptor = "(III[I)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat26);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat24);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat32);
		arg3[1] = (int) (this.aFloat25 * (float) local6 + this.aFloat20 * (float) local13 + (float) local24 * this.aFloat22);
		arg3[0] = (int) (this.aFloat21 * (float) local24 + this.aFloat31 * (float) local13 + this.aFloat23 * (float) local6);
		arg3[2] = (int) (this.aFloat30 * (float) local6 + this.aFloat29 * (float) local13 + (float) local24 * this.aFloat27);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat26 + (float) arg1 * this.aFloat25 + (float) arg0 * this.aFloat23 + (float) arg2 * this.aFloat30);
		arg3[2] = (int) ((float) arg1 * this.aFloat22 + (float) arg0 * this.aFloat21 + (float) arg2 * this.aFloat27 + this.aFloat32);
		arg3[1] = (int) ((float) arg2 * this.aFloat29 + (float) arg0 * this.aFloat31 + (float) arg1 * this.aFloat20 + this.aFloat24);
	}

	@OriginalMember(owner = "client!cba", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat31 = this.aFloat21 = this.aFloat25 = this.aFloat22 = this.aFloat30 = this.aFloat29 = this.aFloat26 = this.aFloat24 = this.aFloat32 = 0.0F;
		this.aFloat23 = this.aFloat20 = this.aFloat27 = 1.0F;
	}

	@OriginalMember(owner = "client!cba", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat26 += arg0;
		this.aFloat24 += arg1;
		this.aFloat32 += arg2;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)V")
	public void method932() {
		this.aFloat22 = -this.aFloat22;
		this.aFloat27 = -this.aFloat27;
		this.aFloat32 = -this.aFloat32;
		this.aFloat31 = -this.aFloat31;
		this.aFloat21 = -this.aFloat21;
		this.aFloat24 = -this.aFloat24;
		this.aFloat20 = -this.aFloat20;
		this.aFloat29 = -this.aFloat29;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIFIFFI)V")
	public void method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat27 = 1.0F;
			this.aFloat31 = this.aFloat21 = this.aFloat25 = this.aFloat22 = this.aFloat30 = this.aFloat29 = 0.0F;
			this.aFloat23 = arg1;
			this.aFloat20 = arg3;
		} else {
			@Pc(41) float local41 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
			@Pc(47) float local47 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
			this.aFloat20 = local41 * (float) arg3;
			this.aFloat31 = local47 * (float) arg1;
			this.aFloat21 = this.aFloat22 = this.aFloat30 = this.aFloat29 = 0.0F;
			this.aFloat23 = local41 * (float) arg1;
			this.aFloat27 = 1.0F;
			this.aFloat25 = (float) arg3 * -local47;
		}
		this.aFloat24 = arg4;
		this.aFloat26 = arg5;
		this.aFloat32 = arg2;
	}

	@OriginalMember(owner = "client!cba", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat20 + this.aFloat31 * (float) arg0 + this.aFloat29 * (float) arg2);
		arg3[2] = (int) (this.aFloat21 * (float) arg0 + this.aFloat22 * (float) arg1 + this.aFloat27 * (float) arg2);
		arg3[0] = (int) (this.aFloat23 * (float) arg0 + (float) arg1 * this.aFloat25 + this.aFloat30 * (float) arg2);
	}

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat31;
		@Pc(21) float local21 = this.aFloat20;
		@Pc(24) float local24 = this.aFloat29;
		this.aFloat31 = local18 * local9 - local15 * this.aFloat21;
		@Pc(37) float local37 = this.aFloat24;
		this.aFloat20 = local21 * local9 - local15 * this.aFloat22;
		this.aFloat21 = local18 * local15 + this.aFloat21 * local9;
		this.aFloat29 = local24 * local9 - this.aFloat27 * local15;
		this.aFloat22 = this.aFloat22 * local9 + local21 * local15;
		this.aFloat27 = local24 * local15 + this.aFloat27 * local9;
		this.aFloat24 = local37 * local9 - local15 * this.aFloat32;
		this.aFloat32 = local37 * local15 + local9 * this.aFloat32;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(FFZ[FFF)V")
	public void method934(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(42) float local42;
		@Pc(26) float local26;
		@Pc(34) float local34;
		@Pc(18) float local18;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local18 = -arg3 / arg1;
			local26 = this.aFloat24 + local18 * this.aFloat31;
			local34 = this.aFloat21 * local18 + this.aFloat32;
			local42 = this.aFloat23 * local18 + this.aFloat26;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local18 = -arg3 / arg0;
			local26 = this.aFloat24 + local18 * this.aFloat20;
			local42 = this.aFloat25 * local18 + this.aFloat26;
			local34 = this.aFloat32 + local18 * this.aFloat22;
		} else {
			local18 = -arg3 / arg4;
			local42 = this.aFloat26 + this.aFloat30 * local18;
			local34 = local18 * this.aFloat27 + this.aFloat32;
			local26 = this.aFloat24 + local18 * this.aFloat29;
		}
		arg2[0] = this.aFloat23 * arg1 + arg0 * this.aFloat25 + arg4 * this.aFloat30;
		arg2[1] = this.aFloat29 * arg4 + arg0 * this.aFloat20 + this.aFloat31 * arg1;
		arg2[2] = this.aFloat21 * arg1 + this.aFloat22 * arg0 + this.aFloat27 * arg4;
		arg2[3] = -(arg2[2] * local34 + local26 * arg2[1] + arg2[0] * local42);
	}

	@OriginalMember(owner = "client!cba", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat27 = 1.0F;
		this.aFloat23 = this.aFloat20 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat31 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat30 = this.aFloat26 = this.aFloat29 = this.aFloat24 = this.aFloat21 = this.aFloat22 = this.aFloat32 = 0.0F;
		this.aFloat25 = -this.aFloat31;
	}

	@OriginalMember(owner = "client!cba", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class4_Sub7_Sub2.aFloatArray24[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub7_Sub2.aFloatArray23[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class4_Sub7_Sub2.aFloatArray24[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class4_Sub7_Sub2.aFloatArray23[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class4_Sub7_Sub2.aFloatArray24[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class4_Sub7_Sub2.aFloatArray23[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat25 = local9 * local39;
		this.aFloat20 = local33 * local9;
		this.aFloat23 = local27 * local47 + local21 * local33;
		this.aFloat21 = local9 * local27;
		this.aFloat27 = local21 * local9;
		this.aFloat30 = local21 * local47 + local33 * -local27;
		this.aFloat29 = local27 * local39 + local43 * local21;
		this.aFloat22 = -local15;
		this.aFloat31 = local27 * local43 + local39 * -local21;
		this.aFloat32 = -(this.aFloat27 * (float) arg2) - this.aFloat22 * (float) arg1 + (float) -arg0 * this.aFloat21;
		this.aFloat26 = this.aFloat23 * (float) -arg0 - this.aFloat25 * (float) arg1 - (float) arg2 * this.aFloat30;
		this.aFloat24 = -((float) arg2 * this.aFloat29) - (float) arg1 * this.aFloat20 + (float) -arg0 * this.aFloat31;
	}

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat20 = 1.0F;
		this.aFloat23 = this.aFloat27 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat30 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat25 = this.aFloat26 = this.aFloat31 = this.aFloat29 = this.aFloat24 = this.aFloat22 = this.aFloat32 = 0.0F;
		this.aFloat21 = -this.aFloat30;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method6812() {
		@Pc(7) Class8_Sub2 local7 = new Class8_Sub2();
		local7.aFloat29 = this.aFloat29;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat23 = this.aFloat23;
		local7.aFloat30 = this.aFloat30;
		local7.aFloat27 = this.aFloat27;
		local7.aFloat32 = this.aFloat32;
		local7.aFloat22 = this.aFloat22;
		local7.aFloat25 = this.aFloat25;
		local7.aFloat31 = this.aFloat31;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat24 = this.aFloat24;
		return local7;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)[F")
	public float[] method935() {
		Static74.aFloatArray2[9] = this.aFloat29;
		Static74.aFloatArray2[4] = this.aFloat25;
		Static74.aFloatArray2[12] = this.aFloat26;
		Static74.aFloatArray2[13] = this.aFloat24;
		Static74.aFloatArray2[1] = this.aFloat31;
		Static74.aFloatArray2[14] = this.aFloat32;
		Static74.aFloatArray2[8] = this.aFloat30;
		Static74.aFloatArray2[10] = this.aFloat27;
		Static74.aFloatArray2[5] = this.aFloat20;
		Static74.aFloatArray2[0] = this.aFloat23;
		Static74.aFloatArray2[2] = this.aFloat21;
		Static74.aFloatArray2[6] = this.aFloat22;
		return Static74.aFloatArray2;
	}

	@OriginalMember(owner = "client!cba", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat23;
		@Pc(21) float local21 = this.aFloat25;
		@Pc(24) float local24 = this.aFloat30;
		this.aFloat23 = local18 * local9 + local15 * this.aFloat21;
		@Pc(37) float local37 = this.aFloat26;
		this.aFloat25 = local9 * local21 + local15 * this.aFloat22;
		this.aFloat21 = local9 * this.aFloat21 - local15 * local18;
		this.aFloat22 = local9 * this.aFloat22 - local15 * local21;
		this.aFloat30 = local9 * local24 + this.aFloat27 * local15;
		this.aFloat27 = local9 * this.aFloat27 - local15 * local24;
		this.aFloat26 = local37 * local9 + this.aFloat32 * local15;
		this.aFloat32 = this.aFloat32 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!q;I)V")
	public void method936(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) arg0;
		this.aFloat25 = local6.aFloat31;
		this.aFloat23 = local6.aFloat23;
		this.aFloat30 = local6.aFloat21;
		this.aFloat21 = local6.aFloat30;
		this.aFloat29 = local6.aFloat22;
		this.aFloat31 = local6.aFloat25;
		this.aFloat20 = local6.aFloat20;
		this.aFloat27 = local6.aFloat27;
		this.aFloat26 = -(local6.aFloat24 * this.aFloat25 + this.aFloat23 * local6.aFloat26 + this.aFloat30 * local6.aFloat32);
		this.aFloat22 = local6.aFloat29;
		this.aFloat24 = -(this.aFloat29 * local6.aFloat32 + this.aFloat31 * local6.aFloat26 + this.aFloat20 * local6.aFloat24);
		this.aFloat32 = -(local6.aFloat26 * this.aFloat21 + local6.aFloat24 * this.aFloat22 + this.aFloat27 * local6.aFloat32);
	}

	@OriginalMember(owner = "client!cba", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat23;
		@Pc(21) float local21 = this.aFloat25;
		@Pc(24) float local24 = this.aFloat30;
		@Pc(27) float local27 = this.aFloat26;
		this.aFloat23 = local18 * local9 - local15 * this.aFloat31;
		this.aFloat25 = local9 * local21 - local15 * this.aFloat20;
		this.aFloat31 = this.aFloat31 * local9 + local15 * local18;
		this.aFloat20 = local15 * local21 + this.aFloat20 * local9;
		this.aFloat30 = local9 * local24 - local15 * this.aFloat29;
		this.aFloat29 = local15 * local24 + this.aFloat29 * local9;
		this.aFloat26 = local9 * local27 - this.aFloat24 * local15;
		this.aFloat24 = local15 * local27 + local9 * this.aFloat24;
	}

	@OriginalMember(owner = "client!cba", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat23 = 1.0F;
		this.aFloat20 = this.aFloat27 = Class4_Sub7_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat22 = Class4_Sub7_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat25 = this.aFloat30 = this.aFloat26 = this.aFloat31 = this.aFloat24 = this.aFloat21 = this.aFloat32 = 0.0F;
		this.aFloat29 = -this.aFloat22;
	}

	@OriginalMember(owner = "client!cba", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat26 = arg0;
		this.aFloat32 = arg2;
		this.aFloat23 = this.aFloat20 = this.aFloat27 = 1.0F;
		this.aFloat24 = arg1;
		this.aFloat31 = this.aFloat21 = this.aFloat25 = this.aFloat22 = this.aFloat30 = this.aFloat29 = 0.0F;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)[F")
	public float[] method939() {
		Static74.aFloatArray2[6] = this.aFloat22;
		Static74.aFloatArray2[12] = 0.0F;
		Static74.aFloatArray2[14] = 0.0F;
		Static74.aFloatArray2[4] = this.aFloat25;
		Static74.aFloatArray2[0] = this.aFloat23;
		Static74.aFloatArray2[1] = this.aFloat31;
		Static74.aFloatArray2[10] = this.aFloat27;
		Static74.aFloatArray2[9] = this.aFloat29;
		Static74.aFloatArray2[2] = this.aFloat21;
		Static74.aFloatArray2[13] = 0.0F;
		Static74.aFloatArray2[5] = this.aFloat20;
		Static74.aFloatArray2[8] = this.aFloat30;
		return Static74.aFloatArray2;
	}
}
