import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class21_Sub1() {
		this.method3699();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)[F")
	public float[] method2683() {
		Static149.aFloatArray19[6] = this.aFloat39;
		Static149.aFloatArray19[13] = this.aFloat36;
		Static149.aFloatArray19[10] = this.aFloat33;
		Static149.aFloatArray19[9] = this.aFloat42;
		Static149.aFloatArray19[5] = this.aFloat34;
		Static149.aFloatArray19[0] = this.aFloat37;
		Static149.aFloatArray19[8] = this.aFloat41;
		Static149.aFloatArray19[4] = this.aFloat40;
		Static149.aFloatArray19[12] = this.aFloat32;
		Static149.aFloatArray19[2] = this.aFloat35;
		Static149.aFloatArray19[1] = this.aFloat31;
		Static149.aFloatArray19[14] = this.aFloat38;
		return Static149.aFloatArray19;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	@Override
	public void method3699() {
		this.aFloat31 = this.aFloat35 = this.aFloat40 = this.aFloat39 = this.aFloat41 = this.aFloat42 = this.aFloat32 = this.aFloat36 = this.aFloat38 = 0.0F;
		this.aFloat37 = this.aFloat34 = this.aFloat33 = 1.0F;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)[F")
	public float[] method2684() {
		Static149.aFloatArray19[6] = this.aFloat39;
		Static149.aFloatArray19[13] = 0.0F;
		Static149.aFloatArray19[14] = 0.0F;
		Static149.aFloatArray19[9] = this.aFloat42;
		Static149.aFloatArray19[12] = 0.0F;
		Static149.aFloatArray19[0] = this.aFloat37;
		Static149.aFloatArray19[2] = this.aFloat35;
		Static149.aFloatArray19[10] = this.aFloat33;
		Static149.aFloatArray19[8] = this.aFloat41;
		Static149.aFloatArray19[1] = this.aFloat31;
		Static149.aFloatArray19[4] = this.aFloat40;
		Static149.aFloatArray19[5] = this.aFloat34;
		return Static149.aFloatArray19;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	@Override
	public void method3709(@OriginalArg(0) int arg0) {
		this.aFloat33 = 1.0F;
		this.aFloat37 = this.aFloat34 = Class108.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat31 = Class108.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat41 = this.aFloat32 = this.aFloat42 = this.aFloat36 = this.aFloat35 = this.aFloat39 = this.aFloat38 = 0.0F;
		this.aFloat40 = -this.aFloat31;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()Lclient!ij;")
	public Class21_Sub1 method2685() {
		@Pc(3) Class21_Sub1 local3 = new Class21_Sub1();
		local3.aFloat37 = this.aFloat37;
		local3.aFloat36 = this.aFloat36;
		local3.aFloat39 = this.aFloat39;
		local3.aFloat35 = this.aFloat35;
		local3.aFloat42 = this.aFloat42;
		local3.aFloat40 = this.aFloat40;
		local3.aFloat41 = this.aFloat41;
		local3.aFloat32 = this.aFloat32;
		local3.aFloat38 = this.aFloat38;
		local3.aFloat34 = this.aFloat34;
		local3.aFloat31 = this.aFloat31;
		local3.aFloat33 = this.aFloat33;
		return local3;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class108.aFloatArray20[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class108.aFloatArray21[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class108.aFloatArray20[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class108.aFloatArray21[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class108.aFloatArray20[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class108.aFloatArray21[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat41 = local29 * -local23 + local17 * local43;
		this.aFloat31 = -local17 * local35 + local39 * local23;
		this.aFloat40 = local35 * local5;
		this.aFloat33 = local5 * local17;
		this.aFloat42 = local35 * local23 + local17 * local39;
		this.aFloat37 = local43 * local23 + local29 * local17;
		this.aFloat35 = local5 * local23;
		this.aFloat39 = -local11;
		this.aFloat34 = local5 * local29;
		this.aFloat32 = -((float) arg1 * this.aFloat40) + (float) -arg0 * this.aFloat37 - (float) arg2 * this.aFloat41;
		this.aFloat36 = this.aFloat31 * (float) -arg0 - (float) arg1 * this.aFloat34 - (float) arg2 * this.aFloat42;
		this.aFloat38 = this.aFloat35 * (float) -arg0 - this.aFloat39 * (float) arg1 - this.aFloat33 * (float) arg2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method3700(@OriginalArg(0) Class21 arg0) {
		@Pc(2) Class21_Sub1 local2 = (Class21_Sub1) arg0;
		this.aFloat31 = local2.aFloat31;
		this.aFloat33 = local2.aFloat33;
		this.aFloat35 = local2.aFloat35;
		this.aFloat41 = local2.aFloat41;
		this.aFloat39 = local2.aFloat39;
		this.aFloat38 = local2.aFloat38;
		this.aFloat32 = local2.aFloat32;
		this.aFloat42 = local2.aFloat42;
		this.aFloat37 = local2.aFloat37;
		this.aFloat40 = local2.aFloat40;
		this.aFloat36 = local2.aFloat36;
		this.aFloat34 = local2.aFloat34;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	@Override
	public void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat36 += arg1;
		this.aFloat32 += arg0;
		this.aFloat38 += arg2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public void method3703(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class108.aFloatArray20[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class108.aFloatArray21[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat31;
		@Pc(17) float local17 = this.aFloat34;
		@Pc(20) float local20 = this.aFloat42;
		@Pc(23) float local23 = this.aFloat36;
		this.aFloat31 = local14 * local5 - this.aFloat35 * local11;
		this.aFloat35 = this.aFloat35 * local5 + local14 * local11;
		this.aFloat34 = local5 * local17 - local11 * this.aFloat39;
		this.aFloat42 = local20 * local5 - local11 * this.aFloat33;
		this.aFloat39 = local17 * local11 + this.aFloat39 * local5;
		this.aFloat33 = local11 * local20 + local5 * this.aFloat33;
		this.aFloat36 = local23 * local5 - this.aFloat38 * local11;
		this.aFloat38 = local11 * local23 + local5 * this.aFloat38;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([I)V")
	@Override
	public void method3702(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat32;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat36;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat38;
		arg0[0] = (int) (local16 * this.aFloat31 + this.aFloat37 * local8 + this.aFloat35 * local25);
		arg0[1] = (int) (local8 * this.aFloat40 + this.aFloat34 * local16 + this.aFloat39 * local25);
		arg0[2] = (int) (local25 * this.aFloat33 + local8 * this.aFloat41 + this.aFloat42 * local16);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
	@Override
	public void method3711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat31 = this.aFloat35 = this.aFloat40 = this.aFloat39 = this.aFloat41 = this.aFloat42 = 0.0F;
		this.aFloat37 = this.aFloat34 = this.aFloat33 = 1.0F;
		this.aFloat32 = arg0;
		this.aFloat36 = arg1;
		this.aFloat38 = arg2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!bd;)V")
	public void method2686(@OriginalArg(1) Class21 arg0) {
		@Pc(9) Class21_Sub1 local9 = (Class21_Sub1) arg0;
		this.aFloat41 = local9.aFloat35;
		this.aFloat40 = local9.aFloat31;
		this.aFloat37 = local9.aFloat37;
		this.aFloat31 = local9.aFloat40;
		this.aFloat35 = local9.aFloat41;
		this.aFloat34 = local9.aFloat34;
		this.aFloat42 = local9.aFloat39;
		this.aFloat32 = -(local9.aFloat38 * this.aFloat41 + local9.aFloat32 * this.aFloat37 + local9.aFloat36 * this.aFloat40);
		this.aFloat39 = local9.aFloat42;
		this.aFloat33 = local9.aFloat33;
		this.aFloat36 = -(this.aFloat34 * local9.aFloat36 + this.aFloat31 * local9.aFloat32 + local9.aFloat38 * this.aFloat42);
		this.aFloat38 = -(local9.aFloat36 * this.aFloat39 + local9.aFloat32 * this.aFloat35 + local9.aFloat38 * this.aFloat33);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat38 + this.aFloat33 * (float) arg2 + (float) arg0 * this.aFloat35 + (float) arg1 * this.aFloat39);
		arg3[1] = (int) ((float) arg2 * this.aFloat42 + this.aFloat31 * (float) arg0 + this.aFloat34 * (float) arg1 + this.aFloat36);
		arg3[0] = (int) (this.aFloat41 * (float) arg2 + (float) arg0 * this.aFloat37 + (float) arg1 * this.aFloat40 + this.aFloat32);
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	@Override
	public void method3708(@OriginalArg(0) int arg0) {
		this.aFloat34 = 1.0F;
		this.aFloat37 = this.aFloat33 = Class108.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat41 = Class108.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat40 = this.aFloat32 = this.aFloat31 = this.aFloat42 = this.aFloat36 = this.aFloat39 = this.aFloat38 = 0.0F;
		this.aFloat35 = -this.aFloat41;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class108.aFloatArray20[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class108.aFloatArray21[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat37;
		@Pc(17) float local17 = this.aFloat40;
		@Pc(20) float local20 = this.aFloat41;
		@Pc(23) float local23 = this.aFloat32;
		this.aFloat37 = local11 * this.aFloat35 + local5 * local14;
		this.aFloat35 = this.aFloat35 * local5 - local11 * local14;
		this.aFloat40 = local11 * this.aFloat39 + local17 * local5;
		this.aFloat39 = this.aFloat39 * local5 - local11 * local17;
		this.aFloat41 = local11 * this.aFloat33 + local5 * local20;
		this.aFloat32 = local23 * local5 + local11 * this.aFloat38;
		this.aFloat33 = local5 * this.aFloat33 - local11 * local20;
		this.aFloat38 = this.aFloat38 * local5 - local11 * local23;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	@Override
	public void method3707(@OriginalArg(0) int arg0) {
		this.aFloat37 = 1.0F;
		this.aFloat34 = this.aFloat33 = Class108.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat39 = Class108.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat40 = this.aFloat41 = this.aFloat32 = this.aFloat31 = this.aFloat36 = this.aFloat35 = this.aFloat38 = 0.0F;
		this.aFloat42 = -this.aFloat39;
	}
}
