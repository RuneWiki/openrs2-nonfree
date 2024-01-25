import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class133_Sub2 extends Class133 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class133_Sub2() {
		this.method4337();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat55 * (float) arg0 + this.aFloat59 * (float) arg1 + this.aFloat60 * (float) arg2 + this.aFloat56);
		arg3[1] = (int) (this.aFloat54 + this.aFloat58 * (float) arg0 + this.aFloat53 * (float) arg1 + this.aFloat61 * (float) arg2);
		arg3[0] = (int) (this.aFloat64 * (float) arg1 + (float) arg0 * this.aFloat62 + (float) arg2 * this.aFloat63 + this.aFloat57);
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)[F")
	public float[] method4341() {
		Static245.aFloatArray18[13] = this.aFloat54;
		Static245.aFloatArray18[2] = this.aFloat55;
		Static245.aFloatArray18[5] = this.aFloat53;
		Static245.aFloatArray18[12] = this.aFloat57;
		Static245.aFloatArray18[9] = this.aFloat61;
		Static245.aFloatArray18[10] = this.aFloat60;
		Static245.aFloatArray18[14] = this.aFloat56;
		Static245.aFloatArray18[4] = this.aFloat64;
		Static245.aFloatArray18[6] = this.aFloat59;
		Static245.aFloatArray18[1] = this.aFloat58;
		Static245.aFloatArray18[0] = this.aFloat62;
		Static245.aFloatArray18[8] = this.aFloat63;
		return Static245.aFloatArray18;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
	@Override
	public void method4338(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class167.aFloatArray19[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class167.aFloatArray20[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat58;
		@Pc(17) float local17 = this.aFloat53;
		@Pc(20) float local20 = this.aFloat61;
		this.aFloat58 = local5 * local14 - local11 * this.aFloat55;
		@Pc(34) float local34 = this.aFloat54;
		this.aFloat55 = this.aFloat55 * local5 + local11 * local14;
		this.aFloat53 = local5 * local17 - this.aFloat59 * local11;
		this.aFloat61 = local5 * local20 - local11 * this.aFloat60;
		this.aFloat59 = local11 * local17 + local5 * this.aFloat59;
		this.aFloat54 = local34 * local5 - this.aFloat56 * local11;
		this.aFloat60 = local11 * local20 + local5 * this.aFloat60;
		this.aFloat56 = local34 * local11 + this.aFloat56 * local5;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!nc;)V")
	public void method4342(@OriginalArg(1) Class133 arg0) {
		@Pc(2) Class133_Sub2 local2 = (Class133_Sub2) arg0;
		this.aFloat64 = local2.aFloat58;
		this.aFloat62 = local2.aFloat62;
		this.aFloat63 = local2.aFloat55;
		this.aFloat58 = local2.aFloat64;
		this.aFloat55 = local2.aFloat63;
		this.aFloat61 = local2.aFloat59;
		this.aFloat53 = local2.aFloat53;
		this.aFloat60 = local2.aFloat60;
		this.aFloat57 = -(local2.aFloat57 * this.aFloat62 + this.aFloat64 * local2.aFloat54 + local2.aFloat56 * this.aFloat63);
		this.aFloat59 = local2.aFloat61;
		this.aFloat54 = -(local2.aFloat56 * this.aFloat61 + local2.aFloat54 * this.aFloat53 + local2.aFloat57 * this.aFloat58);
		this.aFloat56 = -(this.aFloat59 * local2.aFloat54 + local2.aFloat57 * this.aFloat55 + this.aFloat60 * local2.aFloat56);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()V")
	@Override
	public void method4337() {
		this.aFloat62 = this.aFloat53 = this.aFloat60 = 1.0F;
		this.aFloat58 = this.aFloat55 = this.aFloat64 = this.aFloat59 = this.aFloat63 = this.aFloat61 = this.aFloat57 = this.aFloat54 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)[F")
	public float[] method4343() {
		Static245.aFloatArray18[10] = this.aFloat60;
		Static245.aFloatArray18[5] = this.aFloat53;
		Static245.aFloatArray18[13] = 0.0F;
		Static245.aFloatArray18[6] = this.aFloat59;
		Static245.aFloatArray18[9] = this.aFloat61;
		Static245.aFloatArray18[14] = 0.0F;
		Static245.aFloatArray18[4] = this.aFloat64;
		Static245.aFloatArray18[8] = this.aFloat63;
		Static245.aFloatArray18[0] = this.aFloat62;
		Static245.aFloatArray18[12] = 0.0F;
		Static245.aFloatArray18[2] = this.aFloat55;
		Static245.aFloatArray18[1] = this.aFloat58;
		return Static245.aFloatArray18;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class167.aFloatArray19[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class167.aFloatArray20[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class167.aFloatArray19[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class167.aFloatArray20[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class167.aFloatArray19[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class167.aFloatArray20[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat53 = local29 * local5;
		this.aFloat58 = local35 * -local17 + local39 * local23;
		this.aFloat63 = local17 * local43 + -local23 * local29;
		this.aFloat61 = local23 * local35 + local39 * local17;
		this.aFloat60 = local17 * local5;
		this.aFloat55 = local23 * local5;
		this.aFloat64 = local5 * local35;
		this.aFloat59 = -local11;
		this.aFloat62 = local29 * local17 + local23 * local43;
		this.aFloat57 = -(this.aFloat63 * (float) arg2) - this.aFloat64 * (float) arg1 + this.aFloat62 * (float) -arg0;
		this.aFloat54 = -((float) arg1 * this.aFloat53) + (float) -arg0 * this.aFloat58 - (float) arg2 * this.aFloat61;
		this.aFloat56 = (float) -arg0 * this.aFloat55 - this.aFloat59 * (float) arg1 - (float) arg2 * this.aFloat60;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method4328(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat62 = this.aFloat53 = Class167.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat58 = Class167.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat64 = -this.aFloat58;
		this.aFloat63 = this.aFloat57 = this.aFloat61 = this.aFloat54 = this.aFloat55 = this.aFloat59 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lclient!pm;")
	public Class133_Sub2 method4344() {
		@Pc(3) Class133_Sub2 local3 = new Class133_Sub2();
		local3.aFloat53 = this.aFloat53;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat54 = this.aFloat54;
		local3.aFloat62 = this.aFloat62;
		local3.aFloat58 = this.aFloat58;
		local3.aFloat55 = this.aFloat55;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat64 = this.aFloat64;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat63 = this.aFloat63;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat59 = this.aFloat59;
		return local3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V")
	@Override
	public void method4329(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat57;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat54;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat56;
		arg0[1] = (int) (this.aFloat64 * local7 + local16 * this.aFloat53 + local24 * this.aFloat59);
		arg0[0] = (int) (local24 * this.aFloat55 + this.aFloat58 * local16 + this.aFloat62 * local7);
		arg0[2] = (int) (this.aFloat61 * local16 + this.aFloat63 * local7 + this.aFloat60 * local24);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method4340(@OriginalArg(0) Class133 arg0) {
		@Pc(2) Class133_Sub2 local2 = (Class133_Sub2) arg0;
		this.aFloat56 = local2.aFloat56;
		this.aFloat55 = local2.aFloat55;
		this.aFloat64 = local2.aFloat64;
		this.aFloat62 = local2.aFloat62;
		this.aFloat53 = local2.aFloat53;
		this.aFloat59 = local2.aFloat59;
		this.aFloat54 = local2.aFloat54;
		this.aFloat63 = local2.aFloat63;
		this.aFloat60 = local2.aFloat60;
		this.aFloat57 = local2.aFloat57;
		this.aFloat61 = local2.aFloat61;
		this.aFloat58 = local2.aFloat58;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public void method4327(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class167.aFloatArray19[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class167.aFloatArray20[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat62;
		@Pc(17) float local17 = this.aFloat64;
		@Pc(20) float local20 = this.aFloat63;
		@Pc(23) float local23 = this.aFloat57;
		this.aFloat62 = local5 * local14 + local11 * this.aFloat55;
		this.aFloat55 = this.aFloat55 * local5 - local14 * local11;
		this.aFloat64 = local5 * local17 + this.aFloat59 * local11;
		this.aFloat63 = local5 * local20 + local11 * this.aFloat60;
		this.aFloat59 = this.aFloat59 * local5 - local17 * local11;
		this.aFloat60 = this.aFloat60 * local5 - local11 * local20;
		this.aFloat57 = local23 * local5 + local11 * this.aFloat56;
		this.aFloat56 = this.aFloat56 * local5 - local11 * local23;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method4331(@OriginalArg(0) int arg0) {
		this.aFloat53 = 1.0F;
		this.aFloat62 = this.aFloat60 = Class167.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat63 = Class167.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat64 = this.aFloat57 = this.aFloat58 = this.aFloat61 = this.aFloat54 = this.aFloat59 = this.aFloat56 = 0.0F;
		this.aFloat55 = -this.aFloat63;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
	@Override
	public void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat54 += arg1;
		this.aFloat57 += arg0;
		this.aFloat56 += arg2;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
	@Override
	public void method4336(@OriginalArg(0) int arg0) {
		this.aFloat62 = 1.0F;
		this.aFloat53 = this.aFloat60 = Class167.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat59 = Class167.aFloatArray20[arg0 & 0x3FFF];
		this.aFloat61 = -this.aFloat59;
		this.aFloat64 = this.aFloat63 = this.aFloat57 = this.aFloat58 = this.aFloat54 = this.aFloat55 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	@Override
	public void method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 = this.aFloat55 = this.aFloat64 = this.aFloat59 = this.aFloat63 = this.aFloat61 = 0.0F;
		this.aFloat56 = arg2;
		this.aFloat57 = arg0;
		this.aFloat62 = this.aFloat53 = this.aFloat60 = 1.0F;
		this.aFloat54 = arg1;
	}
}
