import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class112_Sub2() {
		this.method3591();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	@Override
	public void method3591() {
		this.aFloat59 = this.aFloat57 = this.aFloat56 = this.aFloat55 = this.aFloat61 = this.aFloat53 = this.aFloat60 = this.aFloat58 = this.aFloat62 = 0.0F;
		this.aFloat51 = this.aFloat52 = this.aFloat54 = 1.0F;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	@Override
	public void method3595(@OriginalArg(0) int arg0) {
		this.aFloat52 = 1.0F;
		this.aFloat51 = this.aFloat54 = Class122.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat61 = Class122.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat57 = -this.aFloat61;
		this.aFloat56 = this.aFloat60 = this.aFloat59 = this.aFloat53 = this.aFloat58 = this.aFloat55 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat51 = this.aFloat52 = Class122.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat59 = Class122.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat61 = this.aFloat60 = this.aFloat53 = this.aFloat58 = this.aFloat57 = this.aFloat55 = this.aFloat62 = 0.0F;
		this.aFloat56 = -this.aFloat59;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)[F")
	public float[] method3600() {
		Static201.aFloatArray19[1] = this.aFloat59;
		Static201.aFloatArray19[9] = this.aFloat53;
		Static201.aFloatArray19[13] = 0.0F;
		Static201.aFloatArray19[12] = 0.0F;
		Static201.aFloatArray19[4] = this.aFloat56;
		Static201.aFloatArray19[0] = this.aFloat51;
		Static201.aFloatArray19[2] = this.aFloat57;
		Static201.aFloatArray19[10] = this.aFloat54;
		Static201.aFloatArray19[6] = this.aFloat55;
		Static201.aFloatArray19[14] = 0.0F;
		Static201.aFloatArray19[5] = this.aFloat52;
		Static201.aFloatArray19[8] = this.aFloat61;
		return Static201.aFloatArray19;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method3598(@OriginalArg(0) Class112 arg0) {
		@Pc(2) Class112_Sub2 local2 = (Class112_Sub2) arg0;
		this.aFloat62 = local2.aFloat62;
		this.aFloat51 = local2.aFloat51;
		this.aFloat59 = local2.aFloat59;
		this.aFloat52 = local2.aFloat52;
		this.aFloat56 = local2.aFloat56;
		this.aFloat53 = local2.aFloat53;
		this.aFloat57 = local2.aFloat57;
		this.aFloat54 = local2.aFloat54;
		this.aFloat60 = local2.aFloat60;
		this.aFloat61 = local2.aFloat61;
		this.aFloat55 = local2.aFloat55;
		this.aFloat58 = local2.aFloat58;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([I)V")
	@Override
	public void method3599(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat60;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat58;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat62;
		arg0[2] = (int) (local25 * this.aFloat54 + this.aFloat61 * local8 + this.aFloat53 * local16);
		arg0[0] = (int) (this.aFloat57 * local25 + local8 * this.aFloat51 + this.aFloat59 * local16);
		arg0[1] = (int) (local25 * this.aFloat55 + local8 * this.aFloat56 + local16 * this.aFloat52);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)[F")
	public float[] method3601() {
		Static201.aFloatArray19[4] = this.aFloat56;
		Static201.aFloatArray19[13] = this.aFloat58;
		Static201.aFloatArray19[8] = this.aFloat61;
		Static201.aFloatArray19[5] = this.aFloat52;
		Static201.aFloatArray19[10] = this.aFloat54;
		Static201.aFloatArray19[12] = this.aFloat60;
		Static201.aFloatArray19[6] = this.aFloat55;
		Static201.aFloatArray19[9] = this.aFloat53;
		Static201.aFloatArray19[2] = this.aFloat57;
		Static201.aFloatArray19[0] = this.aFloat51;
		Static201.aFloatArray19[1] = this.aFloat59;
		Static201.aFloatArray19[14] = this.aFloat62;
		return Static201.aFloatArray19;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
	@Override
	public void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat51 = this.aFloat52 = this.aFloat54 = 1.0F;
		this.aFloat58 = arg1;
		this.aFloat62 = arg2;
		this.aFloat60 = arg0;
		this.aFloat59 = this.aFloat57 = this.aFloat56 = this.aFloat55 = this.aFloat61 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	@Override
	public void method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 += arg1;
		this.aFloat60 += arg0;
		this.aFloat62 += arg2;
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	@Override
	public void method3597(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class122.aFloatArray17[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class122.aFloatArray18[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat51;
		@Pc(17) float local17 = this.aFloat56;
		@Pc(20) float local20 = this.aFloat61;
		@Pc(23) float local23 = this.aFloat60;
		this.aFloat51 = this.aFloat57 * local11 + local5 * local14;
		this.aFloat57 = this.aFloat57 * local5 - local14 * local11;
		this.aFloat56 = local5 * local17 + this.aFloat55 * local11;
		this.aFloat61 = this.aFloat54 * local11 + local5 * local20;
		this.aFloat55 = local5 * this.aFloat55 - local17 * local11;
		this.aFloat54 = local5 * this.aFloat54 - local20 * local11;
		this.aFloat60 = this.aFloat62 * local11 + local5 * local23;
		this.aFloat62 = this.aFloat62 * local5 - local23 * local11;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()Lclient!nc;")
	public Class112_Sub2 method3602() {
		@Pc(3) Class112_Sub2 local3 = new Class112_Sub2();
		local3.aFloat62 = this.aFloat62;
		local3.aFloat58 = this.aFloat58;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat53 = this.aFloat53;
		local3.aFloat51 = this.aFloat51;
		local3.aFloat52 = this.aFloat52;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat59 = this.aFloat59;
		local3.aFloat55 = this.aFloat55;
		local3.aFloat54 = this.aFloat54;
		return local3;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class122.aFloatArray17[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class122.aFloatArray18[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class122.aFloatArray17[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class122.aFloatArray18[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class122.aFloatArray17[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class122.aFloatArray18[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat56 = local5 * local35;
		this.aFloat54 = local17 * local5;
		this.aFloat61 = local29 * -local23 + local43 * local17;
		this.aFloat51 = local23 * local43 + local29 * local17;
		this.aFloat53 = local39 * local17 + local35 * local23;
		this.aFloat57 = local23 * local5;
		this.aFloat59 = local23 * local39 + local35 * -local17;
		this.aFloat55 = -local11;
		this.aFloat52 = local29 * local5;
		this.aFloat62 = -((float) arg2 * this.aFloat54) - (float) arg1 * this.aFloat55 + this.aFloat57 * (float) -arg0;
		this.aFloat60 = -(this.aFloat61 * (float) arg2) + this.aFloat51 * (float) -arg0 - (float) arg1 * this.aFloat56;
		this.aFloat58 = -(this.aFloat53 * (float) arg2) + this.aFloat59 * (float) -arg0 - this.aFloat52 * (float) arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!vr;I)V")
	public void method3603(@OriginalArg(0) Class112 arg0) {
		@Pc(2) Class112_Sub2 local2 = (Class112_Sub2) arg0;
		this.aFloat61 = local2.aFloat57;
		this.aFloat51 = local2.aFloat51;
		this.aFloat56 = local2.aFloat59;
		this.aFloat57 = local2.aFloat61;
		this.aFloat52 = local2.aFloat52;
		this.aFloat53 = local2.aFloat55;
		this.aFloat59 = local2.aFloat56;
		this.aFloat55 = local2.aFloat53;
		this.aFloat54 = local2.aFloat54;
		this.aFloat60 = -(local2.aFloat58 * this.aFloat56 + this.aFloat51 * local2.aFloat60 + this.aFloat61 * local2.aFloat62);
		this.aFloat58 = -(local2.aFloat58 * this.aFloat52 + this.aFloat59 * local2.aFloat60 + this.aFloat53 * local2.aFloat62);
		this.aFloat62 = -(local2.aFloat62 * this.aFloat54 + this.aFloat55 * local2.aFloat58 + local2.aFloat60 * this.aFloat57);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0) {
		this.aFloat51 = 1.0F;
		this.aFloat52 = this.aFloat54 = Class122.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat55 = Class122.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat53 = -this.aFloat55;
		this.aFloat56 = this.aFloat61 = this.aFloat60 = this.aFloat59 = this.aFloat58 = this.aFloat57 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat54 * (float) arg2 + (float) arg0 * this.aFloat57 + (float) arg1 * this.aFloat55 + this.aFloat62);
		arg3[1] = (int) (this.aFloat58 + this.aFloat53 * (float) arg2 + (float) arg1 * this.aFloat52 + (float) arg0 * this.aFloat59);
		arg3[0] = (int) (this.aFloat60 + (float) arg0 * this.aFloat51 + this.aFloat56 * (float) arg1 + (float) arg2 * this.aFloat61);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	@Override
	public void method3585(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class122.aFloatArray17[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class122.aFloatArray18[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat59;
		@Pc(17) float local17 = this.aFloat52;
		@Pc(20) float local20 = this.aFloat53;
		@Pc(23) float local23 = this.aFloat58;
		this.aFloat59 = local5 * local14 - this.aFloat57 * local11;
		this.aFloat57 = local5 * this.aFloat57 + local11 * local14;
		this.aFloat52 = local17 * local5 - local11 * this.aFloat55;
		this.aFloat55 = this.aFloat55 * local5 + local11 * local17;
		this.aFloat53 = local5 * local20 - local11 * this.aFloat54;
		this.aFloat58 = local23 * local5 - local11 * this.aFloat62;
		this.aFloat54 = local5 * this.aFloat54 + local20 * local11;
		this.aFloat62 = this.aFloat62 * local5 + local23 * local11;
	}
}
