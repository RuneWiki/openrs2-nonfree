import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class44_Sub2() {
		this.method3538();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat60 = arg0;
		this.aFloat66 = this.aFloat56 = this.aFloat58 = 1.0F;
		this.aFloat62 = arg1;
		this.aFloat67 = arg2;
		this.aFloat64 = this.aFloat63 = this.aFloat57 = this.aFloat61 = this.aFloat59 = this.aFloat65 = 0.0F;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!de;I)V")
	public void method3543(@OriginalArg(0) Class44 arg0) {
		@Pc(2) Class44_Sub2 local2 = (Class44_Sub2) arg0;
		this.aFloat57 = local2.aFloat64;
		this.aFloat66 = local2.aFloat66;
		this.aFloat59 = local2.aFloat63;
		this.aFloat64 = local2.aFloat57;
		this.aFloat56 = local2.aFloat56;
		this.aFloat63 = local2.aFloat59;
		this.aFloat65 = local2.aFloat61;
		this.aFloat61 = local2.aFloat65;
		this.aFloat60 = -(local2.aFloat67 * this.aFloat59 + local2.aFloat60 * this.aFloat66 + this.aFloat57 * local2.aFloat62);
		this.aFloat58 = local2.aFloat58;
		this.aFloat62 = -(local2.aFloat60 * this.aFloat64 + this.aFloat56 * local2.aFloat62 + local2.aFloat67 * this.aFloat65);
		this.aFloat67 = -(this.aFloat58 * local2.aFloat67 + local2.aFloat62 * this.aFloat61 + local2.aFloat60 * this.aFloat63);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)[F")
	public float[] method3544() {
		Static211.aFloatArray18[4] = this.aFloat57;
		Static211.aFloatArray18[13] = this.aFloat62;
		Static211.aFloatArray18[8] = this.aFloat59;
		Static211.aFloatArray18[0] = this.aFloat66;
		Static211.aFloatArray18[12] = this.aFloat60;
		Static211.aFloatArray18[14] = this.aFloat67;
		Static211.aFloatArray18[1] = this.aFloat64;
		Static211.aFloatArray18[2] = this.aFloat63;
		Static211.aFloatArray18[9] = this.aFloat65;
		Static211.aFloatArray18[5] = this.aFloat56;
		Static211.aFloatArray18[6] = this.aFloat61;
		Static211.aFloatArray18[10] = this.aFloat58;
		return Static211.aFloatArray18;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)[F")
	public float[] method3545() {
		Static211.aFloatArray18[1] = this.aFloat64;
		Static211.aFloatArray18[14] = 0.0F;
		Static211.aFloatArray18[0] = this.aFloat66;
		Static211.aFloatArray18[10] = this.aFloat58;
		Static211.aFloatArray18[2] = this.aFloat63;
		Static211.aFloatArray18[6] = this.aFloat61;
		Static211.aFloatArray18[4] = this.aFloat57;
		Static211.aFloatArray18[13] = 0.0F;
		Static211.aFloatArray18[8] = this.aFloat59;
		Static211.aFloatArray18[9] = this.aFloat65;
		Static211.aFloatArray18[12] = 0.0F;
		Static211.aFloatArray18[5] = this.aFloat56;
		return Static211.aFloatArray18;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	@Override
	public void method3538() {
		this.aFloat66 = this.aFloat56 = this.aFloat58 = 1.0F;
		this.aFloat64 = this.aFloat63 = this.aFloat57 = this.aFloat61 = this.aFloat59 = this.aFloat65 = this.aFloat60 = this.aFloat62 = this.aFloat67 = 0.0F;
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
	@Override
	public void method3539(@OriginalArg(0) int arg0) {
		this.aFloat58 = 1.0F;
		this.aFloat66 = this.aFloat56 = Class116.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat64 = Class116.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat60 = this.aFloat65 = this.aFloat62 = this.aFloat63 = this.aFloat61 = this.aFloat67 = 0.0F;
		this.aFloat57 = -this.aFloat64;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method3531(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class116.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class116.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat66;
		@Pc(17) float local17 = this.aFloat57;
		@Pc(20) float local20 = this.aFloat59;
		this.aFloat66 = local14 * local5 + local11 * this.aFloat63;
		@Pc(33) float local33 = this.aFloat60;
		this.aFloat57 = local11 * this.aFloat61 + local17 * local5;
		this.aFloat63 = local5 * this.aFloat63 - local14 * local11;
		this.aFloat59 = local20 * local5 + this.aFloat58 * local11;
		this.aFloat61 = local5 * this.aFloat61 - local17 * local11;
		this.aFloat58 = this.aFloat58 * local5 - local11 * local20;
		this.aFloat60 = this.aFloat67 * local11 + local5 * local33;
		this.aFloat67 = local5 * this.aFloat67 - local11 * local33;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)V")
	@Override
	public void method3542(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat60;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat62;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat67;
		arg0[2] = (int) (this.aFloat59 * local8 + this.aFloat65 * local16 + local24 * this.aFloat58);
		arg0[0] = (int) (this.aFloat66 * local8 + local16 * this.aFloat64 + this.aFloat63 * local24);
		arg0[1] = (int) (local16 * this.aFloat56 + local8 * this.aFloat57 + local24 * this.aFloat61);
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	@Override
	public void method3533(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class116.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class116.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat64;
		@Pc(17) float local17 = this.aFloat56;
		@Pc(20) float local20 = this.aFloat65;
		this.aFloat64 = local14 * local5 - local11 * this.aFloat63;
		@Pc(34) float local34 = this.aFloat62;
		this.aFloat63 = local5 * this.aFloat63 + local14 * local11;
		this.aFloat56 = local5 * local17 - this.aFloat61 * local11;
		this.aFloat61 = local17 * local11 + local5 * this.aFloat61;
		this.aFloat65 = local20 * local5 - local11 * this.aFloat58;
		this.aFloat58 = local11 * local20 + this.aFloat58 * local5;
		this.aFloat62 = local5 * local34 - local11 * this.aFloat67;
		this.aFloat67 = local11 * local34 + local5 * this.aFloat67;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()Lclient!mi;")
	public Class44_Sub2 method3546() {
		@Pc(3) Class44_Sub2 local3 = new Class44_Sub2();
		local3.aFloat60 = this.aFloat60;
		local3.aFloat58 = this.aFloat58;
		local3.aFloat66 = this.aFloat66;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat67 = this.aFloat67;
		local3.aFloat63 = this.aFloat63;
		local3.aFloat62 = this.aFloat62;
		local3.aFloat65 = this.aFloat65;
		local3.aFloat64 = this.aFloat64;
		local3.aFloat59 = this.aFloat59;
		return local3;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0) {
		this.aFloat66 = 1.0F;
		this.aFloat56 = this.aFloat58 = Class116.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat61 = Class116.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat65 = -this.aFloat61;
		this.aFloat57 = this.aFloat59 = this.aFloat60 = this.aFloat64 = this.aFloat62 = this.aFloat63 = this.aFloat67 = 0.0F;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	@Override
	public void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat62 += arg1;
		this.aFloat60 += arg0;
		this.aFloat67 += arg2;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat61 * (float) arg1 + (float) arg0 * this.aFloat63 + this.aFloat58 * (float) arg2 + this.aFloat67);
		arg3[0] = (int) (this.aFloat60 + this.aFloat59 * (float) arg2 + this.aFloat66 * (float) arg0 + this.aFloat57 * (float) arg1);
		arg3[1] = (int) (this.aFloat64 * (float) arg0 + this.aFloat56 * (float) arg1 + this.aFloat65 * (float) arg2 + this.aFloat62);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!de;)V")
	@Override
	public void method3530(@OriginalArg(0) Class44 arg0) {
		@Pc(2) Class44_Sub2 local2 = (Class44_Sub2) arg0;
		this.aFloat60 = local2.aFloat60;
		this.aFloat58 = local2.aFloat58;
		this.aFloat57 = local2.aFloat57;
		this.aFloat66 = local2.aFloat66;
		this.aFloat61 = local2.aFloat61;
		this.aFloat56 = local2.aFloat56;
		this.aFloat59 = local2.aFloat59;
		this.aFloat62 = local2.aFloat62;
		this.aFloat65 = local2.aFloat65;
		this.aFloat63 = local2.aFloat63;
		this.aFloat64 = local2.aFloat64;
		this.aFloat67 = local2.aFloat67;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
	@Override
	public void method3536(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat66 = this.aFloat58 = Class116.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat59 = Class116.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat63 = -this.aFloat59;
		this.aFloat57 = this.aFloat60 = this.aFloat64 = this.aFloat65 = this.aFloat62 = this.aFloat61 = this.aFloat67 = 0.0F;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class116.aFloatArray14[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class116.aFloatArray15[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class116.aFloatArray14[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class116.aFloatArray15[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class116.aFloatArray14[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class116.aFloatArray15[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat63 = local5 * local23;
		this.aFloat56 = local5 * local29;
		this.aFloat65 = local39 * local17 + local23 * local35;
		this.aFloat59 = local17 * local43 + -local23 * local29;
		this.aFloat61 = -local11;
		this.aFloat57 = local35 * local5;
		this.aFloat66 = local29 * local17 + local23 * local43;
		this.aFloat64 = local35 * -local17 + local39 * local23;
		this.aFloat58 = local5 * local17;
		this.aFloat62 = -(this.aFloat65 * (float) arg2) + (float) -arg0 * this.aFloat64 - this.aFloat56 * (float) arg1;
		this.aFloat67 = -((float) arg1 * this.aFloat61) + this.aFloat63 * (float) -arg0 - (float) arg2 * this.aFloat58;
		this.aFloat60 = -(this.aFloat59 * (float) arg2) + this.aFloat66 * (float) -arg0 - (float) arg1 * this.aFloat57;
	}
}
