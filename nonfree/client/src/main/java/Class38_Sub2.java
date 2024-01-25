import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class38_Sub2() {
		this.method4476();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
	@Override
	public void method4476() {
		this.aFloat56 = this.aFloat62 = this.aFloat55 = 1.0F;
		this.aFloat63 = this.aFloat54 = this.aFloat59 = this.aFloat53 = this.aFloat60 = this.aFloat57 = this.aFloat58 = this.aFloat61 = this.aFloat52 = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)[F")
	public float[] method4482() {
		Static254.aFloatArray21[5] = this.aFloat62;
		Static254.aFloatArray21[8] = this.aFloat60;
		Static254.aFloatArray21[13] = 0.0F;
		Static254.aFloatArray21[14] = 0.0F;
		Static254.aFloatArray21[10] = this.aFloat55;
		Static254.aFloatArray21[6] = this.aFloat53;
		Static254.aFloatArray21[2] = this.aFloat54;
		Static254.aFloatArray21[0] = this.aFloat56;
		Static254.aFloatArray21[9] = this.aFloat57;
		Static254.aFloatArray21[1] = this.aFloat63;
		Static254.aFloatArray21[4] = this.aFloat59;
		Static254.aFloatArray21[12] = 0.0F;
		return Static254.aFloatArray21;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class34.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class34.aFloatArray1[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat63;
		@Pc(17) float local17 = this.aFloat62;
		@Pc(20) float local20 = this.aFloat57;
		@Pc(23) float local23 = this.aFloat61;
		this.aFloat63 = local5 * local14 - local11 * this.aFloat54;
		this.aFloat62 = local5 * local17 - local11 * this.aFloat53;
		this.aFloat54 = local11 * local14 + this.aFloat54 * local5;
		this.aFloat53 = local17 * local11 + this.aFloat53 * local5;
		this.aFloat57 = local20 * local5 - this.aFloat55 * local11;
		this.aFloat55 = local20 * local11 + local5 * this.aFloat55;
		this.aFloat61 = local23 * local5 - this.aFloat52 * local11;
		this.aFloat52 = local23 * local11 + this.aFloat52 * local5;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat61 += arg1;
		this.aFloat58 += arg0;
		this.aFloat52 += arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V")
	@Override
	public void method4472(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat58;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat61;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat52;
		arg0[1] = (int) (local24 * this.aFloat53 + local7 * this.aFloat59 + this.aFloat62 * local16);
		arg0[0] = (int) (local24 * this.aFloat54 + this.aFloat63 * local16 + local7 * this.aFloat56);
		arg0[2] = (int) (local24 * this.aFloat55 + local16 * this.aFloat57 + this.aFloat60 * local7);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat63 * (float) arg0 + this.aFloat62 * (float) arg1 + (float) arg2 * this.aFloat57 + this.aFloat61);
		arg3[2] = (int) (this.aFloat52 + (float) arg1 * this.aFloat53 + this.aFloat54 * (float) arg0 + this.aFloat55 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat56 + this.aFloat59 * (float) arg1 + (float) arg2 * this.aFloat60 + this.aFloat58);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public void method4473(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class34.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class34.aFloatArray1[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat56;
		@Pc(17) float local17 = this.aFloat59;
		@Pc(20) float local20 = this.aFloat60;
		this.aFloat56 = local14 * local5 + this.aFloat54 * local11;
		@Pc(33) float local33 = this.aFloat58;
		this.aFloat54 = this.aFloat54 * local5 - local14 * local11;
		this.aFloat59 = local5 * local17 + local11 * this.aFloat53;
		this.aFloat53 = this.aFloat53 * local5 - local17 * local11;
		this.aFloat60 = local20 * local5 + local11 * this.aFloat55;
		this.aFloat58 = local33 * local5 + this.aFloat52 * local11;
		this.aFloat55 = local5 * this.aFloat55 - local20 * local11;
		this.aFloat52 = local5 * this.aFloat52 - local33 * local11;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()Lclient!pm;")
	public Class38_Sub2 method4483() {
		@Pc(3) Class38_Sub2 local3 = new Class38_Sub2();
		local3.aFloat58 = this.aFloat58;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat54 = this.aFloat54;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat53 = this.aFloat53;
		local3.aFloat52 = this.aFloat52;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat62 = this.aFloat62;
		local3.aFloat55 = this.aFloat55;
		local3.aFloat59 = this.aFloat59;
		local3.aFloat63 = this.aFloat63;
		return local3;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method4475(@OriginalArg(0) int arg0) {
		this.aFloat55 = 1.0F;
		this.aFloat56 = this.aFloat62 = Class34.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat63 = Class34.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat60 = this.aFloat58 = this.aFloat57 = this.aFloat61 = this.aFloat54 = this.aFloat53 = this.aFloat52 = 0.0F;
		this.aFloat59 = -this.aFloat63;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	@Override
	public void method4480(@OriginalArg(0) int arg0) {
		this.aFloat62 = 1.0F;
		this.aFloat56 = this.aFloat55 = Class34.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat60 = Class34.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat58 = this.aFloat63 = this.aFloat57 = this.aFloat61 = this.aFloat53 = this.aFloat52 = 0.0F;
		this.aFloat54 = -this.aFloat60;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
	@Override
	public void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat61 = arg1;
		this.aFloat56 = this.aFloat62 = this.aFloat55 = 1.0F;
		this.aFloat63 = this.aFloat54 = this.aFloat59 = this.aFloat53 = this.aFloat60 = this.aFloat57 = 0.0F;
		this.aFloat58 = arg0;
		this.aFloat52 = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class34.aFloatArray2[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class34.aFloatArray1[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class34.aFloatArray2[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class34.aFloatArray1[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class34.aFloatArray2[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class34.aFloatArray1[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat53 = -local11;
		this.aFloat54 = local23 * local5;
		this.aFloat56 = local17 * local29 + local43 * local23;
		this.aFloat59 = local35 * local5;
		this.aFloat62 = local29 * local5;
		this.aFloat60 = -local23 * local29 + local43 * local17;
		this.aFloat57 = local35 * local23 + local17 * local39;
		this.aFloat63 = local35 * -local17 + local23 * local39;
		this.aFloat55 = local17 * local5;
		this.aFloat52 = (float) -arg0 * this.aFloat54 - this.aFloat53 * (float) arg1 - this.aFloat55 * (float) arg2;
		this.aFloat58 = -((float) arg2 * this.aFloat60) + this.aFloat56 * (float) -arg0 - this.aFloat59 * (float) arg1;
		this.aFloat61 = -((float) arg2 * this.aFloat57) + this.aFloat63 * (float) -arg0 - (float) arg1 * this.aFloat62;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!jd;B)V")
	public void method4484(@OriginalArg(0) Class38 arg0) {
		@Pc(2) Class38_Sub2 local2 = (Class38_Sub2) arg0;
		this.aFloat56 = local2.aFloat56;
		this.aFloat59 = local2.aFloat63;
		this.aFloat60 = local2.aFloat54;
		this.aFloat62 = local2.aFloat62;
		this.aFloat63 = local2.aFloat59;
		this.aFloat57 = local2.aFloat53;
		this.aFloat54 = local2.aFloat60;
		this.aFloat55 = local2.aFloat55;
		this.aFloat53 = local2.aFloat57;
		this.aFloat58 = -(this.aFloat60 * local2.aFloat52 + local2.aFloat58 * this.aFloat56 + local2.aFloat61 * this.aFloat59);
		this.aFloat61 = -(local2.aFloat52 * this.aFloat57 + this.aFloat62 * local2.aFloat61 + this.aFloat63 * local2.aFloat58);
		this.aFloat52 = -(this.aFloat55 * local2.aFloat52 + local2.aFloat58 * this.aFloat54 + local2.aFloat61 * this.aFloat53);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!jd;)V")
	@Override
	public void method4477(@OriginalArg(0) Class38 arg0) {
		@Pc(2) Class38_Sub2 local2 = (Class38_Sub2) arg0;
		this.aFloat60 = local2.aFloat60;
		this.aFloat53 = local2.aFloat53;
		this.aFloat55 = local2.aFloat55;
		this.aFloat63 = local2.aFloat63;
		this.aFloat54 = local2.aFloat54;
		this.aFloat57 = local2.aFloat57;
		this.aFloat52 = local2.aFloat52;
		this.aFloat62 = local2.aFloat62;
		this.aFloat58 = local2.aFloat58;
		this.aFloat61 = local2.aFloat61;
		this.aFloat56 = local2.aFloat56;
		this.aFloat59 = local2.aFloat59;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method4479(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat62 = this.aFloat55 = Class34.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat53 = Class34.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat60 = this.aFloat58 = this.aFloat63 = this.aFloat61 = this.aFloat54 = this.aFloat52 = 0.0F;
		this.aFloat57 = -this.aFloat53;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)[F")
	public float[] method4485() {
		Static254.aFloatArray21[13] = this.aFloat61;
		Static254.aFloatArray21[2] = this.aFloat54;
		Static254.aFloatArray21[12] = this.aFloat58;
		Static254.aFloatArray21[6] = this.aFloat53;
		Static254.aFloatArray21[10] = this.aFloat55;
		Static254.aFloatArray21[14] = this.aFloat52;
		Static254.aFloatArray21[0] = this.aFloat56;
		Static254.aFloatArray21[9] = this.aFloat57;
		Static254.aFloatArray21[4] = this.aFloat59;
		Static254.aFloatArray21[8] = this.aFloat60;
		Static254.aFloatArray21[5] = this.aFloat62;
		Static254.aFloatArray21[1] = this.aFloat63;
		return Static254.aFloatArray21;
	}
}
