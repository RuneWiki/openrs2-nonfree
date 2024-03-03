import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "[F")
	private static final float[] aFloatArray20 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V", line = 269)
	public Class14_Sub2() {
		this.method3933();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([I)V", line = 6)
	@Override
	public void method3936(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat60;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat53;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat59;
		arg0[2] = (int) (this.aFloat57 * local8 + local16 * this.aFloat56 + local24 * this.aFloat54);
		arg0[0] = (int) (this.aFloat51 * local24 + this.aFloat55 * local8 + local16 * this.aFloat61);
		arg0[1] = (int) (local8 * this.aFloat50 + this.aFloat52 * local16 + local24 * this.aFloat58);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 19)
	@Override
	public void method3926(@OriginalArg(0) int arg0) {
		this.aFloat52 = 1.0F;
		this.aFloat55 = this.aFloat54 = Class120.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat57 = Class120.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat51 = -this.aFloat57;
		this.aFloat50 = this.aFloat60 = this.aFloat61 = this.aFloat56 = this.aFloat53 = this.aFloat58 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!on;)V", line = 32)
	public void method3939(@OriginalArg(1) Class14 arg0) {
		@Pc(2) Class14_Sub2 local2 = (Class14_Sub2) arg0;
		this.aFloat57 = local2.aFloat51;
		this.aFloat50 = local2.aFloat61;
		this.aFloat55 = local2.aFloat55;
		this.aFloat51 = local2.aFloat57;
		this.aFloat52 = local2.aFloat52;
		this.aFloat56 = local2.aFloat58;
		this.aFloat61 = local2.aFloat50;
		this.aFloat54 = local2.aFloat54;
		this.aFloat58 = local2.aFloat56;
		this.aFloat60 = -(this.aFloat57 * local2.aFloat59 + local2.aFloat53 * this.aFloat50 + local2.aFloat60 * this.aFloat55);
		this.aFloat53 = -(local2.aFloat59 * this.aFloat56 + local2.aFloat53 * this.aFloat52 + this.aFloat61 * local2.aFloat60);
		this.aFloat59 = -(local2.aFloat53 * this.aFloat58 + this.aFloat51 * local2.aFloat60 + local2.aFloat59 * this.aFloat54);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[I)V", line = 55)
	@Override
	public void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat59 + this.aFloat54 * (float) arg2 + (float) arg0 * this.aFloat51 + this.aFloat58 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat57 + this.aFloat55 * (float) arg0 + (float) arg1 * this.aFloat50 + this.aFloat60);
		arg3[1] = (int) (this.aFloat53 + (float) arg1 * this.aFloat52 + (float) arg0 * this.aFloat61 + (float) arg2 * this.aFloat56);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "()V", line = 67)
	@Override
	public void method3933() {
		this.aFloat55 = this.aFloat52 = this.aFloat54 = 1.0F;
		this.aFloat61 = this.aFloat51 = this.aFloat50 = this.aFloat58 = this.aFloat57 = this.aFloat56 = this.aFloat60 = this.aFloat53 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!on;)V", line = 77)
	@Override
	public void method3925(@OriginalArg(0) Class14 arg0) {
		@Pc(2) Class14_Sub2 local2 = (Class14_Sub2) arg0;
		this.aFloat58 = local2.aFloat58;
		this.aFloat54 = local2.aFloat54;
		this.aFloat59 = local2.aFloat59;
		this.aFloat51 = local2.aFloat51;
		this.aFloat52 = local2.aFloat52;
		this.aFloat57 = local2.aFloat57;
		this.aFloat56 = local2.aFloat56;
		this.aFloat55 = local2.aFloat55;
		this.aFloat61 = local2.aFloat61;
		this.aFloat60 = local2.aFloat60;
		this.aFloat53 = local2.aFloat53;
		this.aFloat50 = local2.aFloat50;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "()Lclient!mu;", line = 98)
	public Class14_Sub2 method3940() {
		@Pc(3) Class14_Sub2 local3 = new Class14_Sub2();
		local3.aFloat59 = this.aFloat59;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat50 = this.aFloat50;
		local3.aFloat55 = this.aFloat55;
		local3.aFloat53 = this.aFloat53;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat54 = this.aFloat54;
		local3.aFloat51 = this.aFloat51;
		local3.aFloat52 = this.aFloat52;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat58 = this.aFloat58;
		return local3;
	}

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)[F", line = 118)
	public float[] method3941() {
		aFloatArray20[0] = this.aFloat55;
		aFloatArray20[1] = this.aFloat61;
		aFloatArray20[2] = this.aFloat51;
		aFloatArray20[8] = this.aFloat57;
		aFloatArray20[14] = 0.0F;
		aFloatArray20[12] = 0.0F;
		aFloatArray20[9] = this.aFloat56;
		aFloatArray20[10] = this.aFloat54;
		aFloatArray20[5] = this.aFloat52;
		aFloatArray20[13] = 0.0F;
		aFloatArray20[6] = this.aFloat58;
		aFloatArray20[4] = this.aFloat50;
		return aFloatArray20;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V", line = 138)
	@Override
	public void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 += arg1;
		this.aFloat60 += arg0;
		this.aFloat59 += arg2;
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V", line = 150)
	@Override
	public void method3932(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat55 = this.aFloat52 = Class120.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat61 = Class120.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat50 = -this.aFloat61;
		this.aFloat57 = this.aFloat60 = this.aFloat56 = this.aFloat53 = this.aFloat51 = this.aFloat58 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V", line = 161)
	@Override
	public void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat59 = arg2;
		this.aFloat61 = this.aFloat51 = this.aFloat50 = this.aFloat58 = this.aFloat57 = this.aFloat56 = 0.0F;
		this.aFloat53 = arg1;
		this.aFloat60 = arg0;
		this.aFloat55 = this.aFloat52 = this.aFloat54 = 1.0F;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIII)V", line = 173)
	@Override
	public void method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class120.aFloatArray14[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class120.aFloatArray15[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class120.aFloatArray14[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class120.aFloatArray15[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class120.aFloatArray14[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class120.aFloatArray15[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat52 = local29 * local5;
		this.aFloat54 = local5 * local17;
		this.aFloat50 = local5 * local35;
		this.aFloat61 = -local17 * local35 + local23 * local39;
		this.aFloat58 = -local11;
		this.aFloat51 = local5 * local23;
		this.aFloat55 = local29 * local17 + local23 * local43;
		this.aFloat56 = local35 * local23 + local17 * local39;
		this.aFloat57 = -local23 * local29 + local43 * local17;
		this.aFloat53 = -(this.aFloat52 * (float) arg1) + this.aFloat61 * (float) -arg0 - this.aFloat56 * (float) arg2;
		this.aFloat59 = this.aFloat51 * (float) -arg0 - this.aFloat58 * (float) arg1 - this.aFloat54 * (float) arg2;
		this.aFloat60 = (float) -arg0 * this.aFloat55 - (float) arg1 * this.aFloat50 - (float) arg2 * this.aFloat57;
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V", line = 208)
	@Override
	public void method3934(@OriginalArg(0) int arg0) {
		this.aFloat55 = 1.0F;
		this.aFloat52 = this.aFloat54 = Class120.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat58 = Class120.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat50 = this.aFloat57 = this.aFloat60 = this.aFloat61 = this.aFloat53 = this.aFloat51 = this.aFloat59 = 0.0F;
		this.aFloat56 = -this.aFloat58;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 221)
	@Override
	public void method3927(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class120.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class120.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat55;
		@Pc(17) float local17 = this.aFloat50;
		@Pc(20) float local20 = this.aFloat57;
		@Pc(23) float local23 = this.aFloat60;
		this.aFloat55 = local5 * local14 + this.aFloat51 * local11;
		this.aFloat51 = this.aFloat51 * local5 - local11 * local14;
		this.aFloat50 = local5 * local17 + this.aFloat58 * local11;
		this.aFloat58 = local5 * this.aFloat58 - local17 * local11;
		this.aFloat57 = local20 * local5 + this.aFloat54 * local11;
		this.aFloat60 = local23 * local5 + this.aFloat59 * local11;
		this.aFloat54 = local5 * this.aFloat54 - local11 * local20;
		this.aFloat59 = local5 * this.aFloat59 - local11 * local23;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)[F", line = 248)
	public float[] method3942() {
		aFloatArray20[12] = this.aFloat60;
		aFloatArray20[13] = this.aFloat53;
		aFloatArray20[0] = this.aFloat55;
		aFloatArray20[9] = this.aFloat56;
		aFloatArray20[2] = this.aFloat51;
		aFloatArray20[8] = this.aFloat57;
		aFloatArray20[14] = this.aFloat59;
		aFloatArray20[10] = this.aFloat54;
		aFloatArray20[4] = this.aFloat50;
		aFloatArray20[6] = this.aFloat58;
		aFloatArray20[5] = this.aFloat52;
		aFloatArray20[1] = this.aFloat61;
		return aFloatArray20;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 284)
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class120.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class120.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat61;
		@Pc(17) float local17 = this.aFloat52;
		@Pc(20) float local20 = this.aFloat56;
		@Pc(23) float local23 = this.aFloat53;
		this.aFloat61 = local14 * local5 - local11 * this.aFloat51;
		this.aFloat52 = local17 * local5 - local11 * this.aFloat58;
		this.aFloat51 = local5 * this.aFloat51 + local11 * local14;
		this.aFloat56 = local5 * local20 - local11 * this.aFloat54;
		this.aFloat58 = local5 * this.aFloat58 + local17 * local11;
		this.aFloat53 = local5 * local23 - this.aFloat59 * local11;
		this.aFloat54 = this.aFloat54 * local5 + local11 * local20;
		this.aFloat59 = this.aFloat59 * local5 + local23 * local11;
	}
}
