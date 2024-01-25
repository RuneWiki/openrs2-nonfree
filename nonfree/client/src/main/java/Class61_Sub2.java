import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class61_Sub2() {
		this.method3663();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat40 + this.aFloat39 * (float) arg0 + this.aFloat32 * (float) arg1 + this.aFloat34);
		arg3[2] = (int) ((float) arg0 * this.aFloat43 + this.aFloat42 * (float) arg1 + this.aFloat33 * (float) arg2 + this.aFloat37);
		arg3[0] = (int) ((float) arg2 * this.aFloat38 + this.aFloat35 * (float) arg1 + this.aFloat36 * (float) arg0 + this.aFloat41);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0) {
		this.aFloat32 = 1.0F;
		this.aFloat36 = this.aFloat33 = Class35.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat38 = Class35.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat43 = -this.aFloat38;
		this.aFloat35 = this.aFloat41 = this.aFloat39 = this.aFloat40 = this.aFloat34 = this.aFloat42 = this.aFloat37 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)[F")
	public float[] method3671() {
		Static205.aFloatArray21[0] = this.aFloat36;
		Static205.aFloatArray21[12] = this.aFloat41;
		Static205.aFloatArray21[4] = this.aFloat35;
		Static205.aFloatArray21[14] = this.aFloat37;
		Static205.aFloatArray21[2] = this.aFloat43;
		Static205.aFloatArray21[6] = this.aFloat42;
		Static205.aFloatArray21[8] = this.aFloat38;
		Static205.aFloatArray21[9] = this.aFloat40;
		Static205.aFloatArray21[1] = this.aFloat39;
		Static205.aFloatArray21[10] = this.aFloat33;
		Static205.aFloatArray21[13] = this.aFloat34;
		Static205.aFloatArray21[5] = this.aFloat32;
		return Static205.aFloatArray21;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ic;)V")
	public void method3672(@OriginalArg(1) Class61 arg0) {
		@Pc(2) Class61_Sub2 local2 = (Class61_Sub2) arg0;
		this.aFloat35 = local2.aFloat39;
		this.aFloat36 = local2.aFloat36;
		this.aFloat38 = local2.aFloat43;
		this.aFloat39 = local2.aFloat35;
		this.aFloat32 = local2.aFloat32;
		this.aFloat43 = local2.aFloat38;
		this.aFloat40 = local2.aFloat42;
		this.aFloat41 = -(local2.aFloat34 * this.aFloat35 + this.aFloat36 * local2.aFloat41 + local2.aFloat37 * this.aFloat38);
		this.aFloat42 = local2.aFloat40;
		this.aFloat33 = local2.aFloat33;
		this.aFloat34 = -(this.aFloat40 * local2.aFloat37 + this.aFloat39 * local2.aFloat41 + local2.aFloat34 * this.aFloat32);
		this.aFloat37 = -(this.aFloat33 * local2.aFloat37 + local2.aFloat34 * this.aFloat42 + this.aFloat43 * local2.aFloat41);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class35.aFloatArray2[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class35.aFloatArray3[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class35.aFloatArray2[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class35.aFloatArray3[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class35.aFloatArray2[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class35.aFloatArray3[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat36 = local17 * local29 + local23 * local43;
		this.aFloat39 = local39 * local23 + -local17 * local35;
		this.aFloat35 = local5 * local35;
		this.aFloat32 = local29 * local5;
		this.aFloat38 = local43 * local17 + -local23 * local29;
		this.aFloat40 = local17 * local39 + local23 * local35;
		this.aFloat42 = -local11;
		this.aFloat43 = local5 * local23;
		this.aFloat33 = local5 * local17;
		this.aFloat34 = -(this.aFloat32 * (float) arg1) + this.aFloat39 * (float) -arg0 - this.aFloat40 * (float) arg2;
		this.aFloat37 = -((float) arg2 * this.aFloat33) + this.aFloat43 * (float) -arg0 - (float) arg1 * this.aFloat42;
		this.aFloat41 = -((float) arg1 * this.aFloat35) + (float) -arg0 * this.aFloat36 - this.aFloat38 * (float) arg2;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)[F")
	public float[] method3673() {
		Static205.aFloatArray21[9] = this.aFloat40;
		Static205.aFloatArray21[6] = this.aFloat42;
		Static205.aFloatArray21[4] = this.aFloat35;
		Static205.aFloatArray21[1] = this.aFloat39;
		Static205.aFloatArray21[13] = 0.0F;
		Static205.aFloatArray21[0] = this.aFloat36;
		Static205.aFloatArray21[12] = 0.0F;
		Static205.aFloatArray21[10] = this.aFloat33;
		Static205.aFloatArray21[5] = this.aFloat32;
		Static205.aFloatArray21[14] = 0.0F;
		Static205.aFloatArray21[2] = this.aFloat43;
		Static205.aFloatArray21[8] = this.aFloat38;
		return Static205.aFloatArray21;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lclient!nd;")
	public Class61_Sub2 method3674() {
		@Pc(3) Class61_Sub2 local3 = new Class61_Sub2();
		local3.aFloat33 = this.aFloat33;
		local3.aFloat40 = this.aFloat40;
		local3.aFloat32 = this.aFloat32;
		local3.aFloat38 = this.aFloat38;
		local3.aFloat42 = this.aFloat42;
		local3.aFloat39 = this.aFloat39;
		local3.aFloat37 = this.aFloat37;
		local3.aFloat43 = this.aFloat43;
		local3.aFloat34 = this.aFloat34;
		local3.aFloat36 = this.aFloat36;
		local3.aFloat35 = this.aFloat35;
		local3.aFloat41 = this.aFloat41;
		return local3;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	@Override
	public void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat34 = arg1;
		this.aFloat36 = this.aFloat32 = this.aFloat33 = 1.0F;
		this.aFloat37 = arg2;
		this.aFloat39 = this.aFloat43 = this.aFloat35 = this.aFloat42 = this.aFloat38 = this.aFloat40 = 0.0F;
		this.aFloat41 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	@Override
	public void method3655(@OriginalArg(0) int arg0) {
		this.aFloat36 = 1.0F;
		this.aFloat32 = this.aFloat33 = Class35.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat42 = Class35.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat35 = this.aFloat38 = this.aFloat41 = this.aFloat39 = this.aFloat34 = this.aFloat43 = this.aFloat37 = 0.0F;
		this.aFloat40 = -this.aFloat42;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ic;)V")
	@Override
	public void method3670(@OriginalArg(0) Class61 arg0) {
		@Pc(2) Class61_Sub2 local2 = (Class61_Sub2) arg0;
		this.aFloat42 = local2.aFloat42;
		this.aFloat40 = local2.aFloat40;
		this.aFloat34 = local2.aFloat34;
		this.aFloat38 = local2.aFloat38;
		this.aFloat41 = local2.aFloat41;
		this.aFloat39 = local2.aFloat39;
		this.aFloat36 = local2.aFloat36;
		this.aFloat33 = local2.aFloat33;
		this.aFloat37 = local2.aFloat37;
		this.aFloat32 = local2.aFloat32;
		this.aFloat35 = local2.aFloat35;
		this.aFloat43 = local2.aFloat43;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([I)V")
	@Override
	public void method3661(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat41;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat34;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat37;
		arg0[0] = (int) (this.aFloat39 * local16 + local8 * this.aFloat36 + local25 * this.aFloat43);
		arg0[2] = (int) (local16 * this.aFloat40 + this.aFloat38 * local8 + this.aFloat33 * local25);
		arg0[1] = (int) (this.aFloat35 * local8 + this.aFloat32 * local16 + local25 * this.aFloat42);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	@Override
	public void method3663() {
		this.aFloat36 = this.aFloat32 = this.aFloat33 = 1.0F;
		this.aFloat39 = this.aFloat43 = this.aFloat35 = this.aFloat42 = this.aFloat38 = this.aFloat40 = this.aFloat41 = this.aFloat34 = this.aFloat37 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	@Override
	public void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat37 += arg2;
		this.aFloat41 += arg0;
		this.aFloat34 += arg1;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	@Override
	public void method3664(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class35.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class35.aFloatArray3[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat39;
		@Pc(17) float local17 = this.aFloat32;
		@Pc(20) float local20 = this.aFloat40;
		@Pc(23) float local23 = this.aFloat34;
		this.aFloat39 = local14 * local5 - this.aFloat43 * local11;
		this.aFloat32 = local17 * local5 - this.aFloat42 * local11;
		this.aFloat43 = local5 * this.aFloat43 + local14 * local11;
		this.aFloat42 = this.aFloat42 * local5 + local17 * local11;
		this.aFloat40 = local5 * local20 - local11 * this.aFloat33;
		this.aFloat34 = local23 * local5 - this.aFloat37 * local11;
		this.aFloat33 = local11 * local20 + this.aFloat33 * local5;
		this.aFloat37 = local11 * local23 + this.aFloat37 * local5;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	@Override
	public void method3659(@OriginalArg(0) int arg0) {
		this.aFloat33 = 1.0F;
		this.aFloat36 = this.aFloat32 = Class35.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat39 = Class35.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat35 = -this.aFloat39;
		this.aFloat38 = this.aFloat41 = this.aFloat40 = this.aFloat34 = this.aFloat43 = this.aFloat42 = this.aFloat37 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	@Override
	public void method3657(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class35.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class35.aFloatArray3[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat36;
		@Pc(17) float local17 = this.aFloat35;
		@Pc(20) float local20 = this.aFloat38;
		@Pc(23) float local23 = this.aFloat41;
		this.aFloat36 = this.aFloat43 * local11 + local14 * local5;
		this.aFloat35 = local17 * local5 + this.aFloat42 * local11;
		this.aFloat43 = local5 * this.aFloat43 - local11 * local14;
		this.aFloat42 = local5 * this.aFloat42 - local11 * local17;
		this.aFloat38 = this.aFloat33 * local11 + local20 * local5;
		this.aFloat33 = this.aFloat33 * local5 - local20 * local11;
		this.aFloat41 = local23 * local5 + local11 * this.aFloat37;
		this.aFloat37 = local5 * this.aFloat37 - local11 * local23;
	}
}
