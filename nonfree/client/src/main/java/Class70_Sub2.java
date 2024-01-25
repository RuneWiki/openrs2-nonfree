import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!n", name = "h", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class70_Sub2() {
		this.method3705();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	@Override
	public void method3709(@OriginalArg(0) int arg0) {
		this.aFloat67 = 1.0F;
		this.aFloat66 = this.aFloat56 = Class188.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat61 = Class188.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat60 = this.aFloat57 = this.aFloat63 = this.aFloat65 = this.aFloat64 = this.aFloat62 = 0.0F;
		this.aFloat58 = -this.aFloat61;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([I)V")
	@Override
	public void method3714(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat60;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat63;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat62;
		arg0[2] = (int) (this.aFloat57 * local16 + local7 * this.aFloat59 + local25 * this.aFloat67);
		arg0[0] = (int) (this.aFloat61 * local16 + this.aFloat66 * local7 + local25 * this.aFloat65);
		arg0[1] = (int) (this.aFloat56 * local16 + this.aFloat58 * local7 + this.aFloat64 * local25);
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)[F")
	public float[] method3722() {
		Static209.aFloatArray26[5] = this.aFloat56;
		Static209.aFloatArray26[8] = this.aFloat59;
		Static209.aFloatArray26[2] = this.aFloat65;
		Static209.aFloatArray26[9] = this.aFloat57;
		Static209.aFloatArray26[14] = 0.0F;
		Static209.aFloatArray26[13] = 0.0F;
		Static209.aFloatArray26[12] = 0.0F;
		Static209.aFloatArray26[6] = this.aFloat64;
		Static209.aFloatArray26[10] = this.aFloat67;
		Static209.aFloatArray26[4] = this.aFloat58;
		Static209.aFloatArray26[0] = this.aFloat66;
		Static209.aFloatArray26[1] = this.aFloat61;
		return Static209.aFloatArray26;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
	@Override
	public void method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat61 = this.aFloat65 = this.aFloat58 = this.aFloat64 = this.aFloat59 = this.aFloat57 = 0.0F;
		this.aFloat63 = arg1;
		this.aFloat62 = arg2;
		this.aFloat60 = arg0;
		this.aFloat66 = this.aFloat56 = this.aFloat67 = 1.0F;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Lclient!n;")
	public Class70_Sub2 method3723() {
		@Pc(3) Class70_Sub2 local3 = new Class70_Sub2();
		local3.aFloat57 = this.aFloat57;
		local3.aFloat65 = this.aFloat65;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat58 = this.aFloat58;
		local3.aFloat62 = this.aFloat62;
		local3.aFloat67 = this.aFloat67;
		local3.aFloat56 = this.aFloat56;
		local3.aFloat59 = this.aFloat59;
		local3.aFloat63 = this.aFloat63;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat64 = this.aFloat64;
		local3.aFloat66 = this.aFloat66;
		return local3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class188.aFloatArray27[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class188.aFloatArray28[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class188.aFloatArray27[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class188.aFloatArray28[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class188.aFloatArray27[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class188.aFloatArray28[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat58 = local5 * local35;
		this.aFloat57 = local35 * local23 + local17 * local39;
		this.aFloat59 = -local23 * local29 + local43 * local17;
		this.aFloat64 = -local11;
		this.aFloat56 = local29 * local5;
		this.aFloat67 = local5 * local17;
		this.aFloat61 = local35 * -local17 + local39 * local23;
		this.aFloat66 = local23 * local43 + local17 * local29;
		this.aFloat65 = local5 * local23;
		this.aFloat62 = -((float) arg1 * this.aFloat64) + this.aFloat65 * (float) -arg0 - (float) arg2 * this.aFloat67;
		this.aFloat60 = -(this.aFloat59 * (float) arg2) - this.aFloat58 * (float) arg1 + this.aFloat66 * (float) -arg0;
		this.aFloat63 = -((float) arg2 * this.aFloat57) - this.aFloat56 * (float) arg1 + (float) -arg0 * this.aFloat61;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	@Override
	public void method3705() {
		this.aFloat66 = this.aFloat56 = this.aFloat67 = 1.0F;
		this.aFloat61 = this.aFloat65 = this.aFloat58 = this.aFloat64 = this.aFloat59 = this.aFloat57 = this.aFloat60 = this.aFloat63 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	@Override
	public void method3711(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat66 = this.aFloat67 = Class188.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat59 = Class188.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat65 = -this.aFloat59;
		this.aFloat58 = this.aFloat60 = this.aFloat61 = this.aFloat57 = this.aFloat63 = this.aFloat64 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	@Override
	public void method3721(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class188.aFloatArray27[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class188.aFloatArray28[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat61;
		@Pc(17) float local17 = this.aFloat56;
		@Pc(20) float local20 = this.aFloat57;
		@Pc(23) float local23 = this.aFloat63;
		this.aFloat61 = local14 * local5 - local11 * this.aFloat65;
		this.aFloat56 = local5 * local17 - this.aFloat64 * local11;
		this.aFloat65 = local5 * this.aFloat65 + local11 * local14;
		this.aFloat57 = local20 * local5 - this.aFloat67 * local11;
		this.aFloat64 = this.aFloat64 * local5 + local17 * local11;
		this.aFloat67 = local5 * this.aFloat67 + local11 * local20;
		this.aFloat63 = local5 * local23 - local11 * this.aFloat62;
		this.aFloat62 = this.aFloat62 * local5 + local23 * local11;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)[F")
	public float[] method3724() {
		Static209.aFloatArray26[6] = this.aFloat64;
		Static209.aFloatArray26[0] = this.aFloat66;
		Static209.aFloatArray26[14] = this.aFloat62;
		Static209.aFloatArray26[5] = this.aFloat56;
		Static209.aFloatArray26[1] = this.aFloat61;
		Static209.aFloatArray26[10] = this.aFloat67;
		Static209.aFloatArray26[12] = this.aFloat60;
		Static209.aFloatArray26[8] = this.aFloat59;
		Static209.aFloatArray26[2] = this.aFloat65;
		Static209.aFloatArray26[4] = this.aFloat58;
		Static209.aFloatArray26[13] = this.aFloat63;
		Static209.aFloatArray26[9] = this.aFloat57;
		return Static209.aFloatArray26;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat59 * (float) arg2 + this.aFloat58 * (float) arg1 + this.aFloat66 * (float) arg0 + this.aFloat60);
		arg3[2] = (int) ((float) arg0 * this.aFloat65 + this.aFloat64 * (float) arg1 + this.aFloat67 * (float) arg2 + this.aFloat62);
		arg3[1] = (int) (this.aFloat63 + this.aFloat57 * (float) arg2 + this.aFloat56 * (float) arg1 + (float) arg0 * this.aFloat61);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method3713(@OriginalArg(0) Class70 arg0) {
		@Pc(2) Class70_Sub2 local2 = (Class70_Sub2) arg0;
		this.aFloat60 = local2.aFloat60;
		this.aFloat56 = local2.aFloat56;
		this.aFloat57 = local2.aFloat57;
		this.aFloat58 = local2.aFloat58;
		this.aFloat64 = local2.aFloat64;
		this.aFloat63 = local2.aFloat63;
		this.aFloat62 = local2.aFloat62;
		this.aFloat66 = local2.aFloat66;
		this.aFloat61 = local2.aFloat61;
		this.aFloat67 = local2.aFloat67;
		this.aFloat59 = local2.aFloat59;
		this.aFloat65 = local2.aFloat65;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!mk;I)V")
	public void method3725(@OriginalArg(0) Class70 arg0) {
		@Pc(2) Class70_Sub2 local2 = (Class70_Sub2) arg0;
		this.aFloat59 = local2.aFloat65;
		this.aFloat66 = local2.aFloat66;
		this.aFloat58 = local2.aFloat61;
		this.aFloat61 = local2.aFloat58;
		this.aFloat65 = local2.aFloat59;
		this.aFloat56 = local2.aFloat56;
		this.aFloat57 = local2.aFloat64;
		this.aFloat60 = -(local2.aFloat62 * this.aFloat59 + this.aFloat58 * local2.aFloat63 + this.aFloat66 * local2.aFloat60);
		this.aFloat64 = local2.aFloat57;
		this.aFloat67 = local2.aFloat67;
		this.aFloat63 = -(local2.aFloat62 * this.aFloat57 + local2.aFloat63 * this.aFloat56 + local2.aFloat60 * this.aFloat61);
		this.aFloat62 = -(this.aFloat65 * local2.aFloat60 + local2.aFloat63 * this.aFloat64 + local2.aFloat62 * this.aFloat67);
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	@Override
	public void method3715(@OriginalArg(0) int arg0) {
		this.aFloat66 = 1.0F;
		this.aFloat56 = this.aFloat67 = Class188.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat64 = Class188.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat57 = -this.aFloat64;
		this.aFloat58 = this.aFloat59 = this.aFloat60 = this.aFloat61 = this.aFloat63 = this.aFloat65 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat63 += arg1;
		this.aFloat62 += arg2;
		this.aFloat60 += arg0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	@Override
	public void method3712(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class188.aFloatArray27[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class188.aFloatArray28[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat66;
		@Pc(17) float local17 = this.aFloat58;
		@Pc(20) float local20 = this.aFloat59;
		this.aFloat66 = local14 * local5 + local11 * this.aFloat65;
		@Pc(33) float local33 = this.aFloat60;
		this.aFloat58 = local11 * this.aFloat64 + local17 * local5;
		this.aFloat65 = local5 * this.aFloat65 - local11 * local14;
		this.aFloat59 = this.aFloat67 * local11 + local20 * local5;
		this.aFloat64 = this.aFloat64 * local5 - local17 * local11;
		this.aFloat67 = local5 * this.aFloat67 - local20 * local11;
		this.aFloat60 = local11 * this.aFloat62 + local33 * local5;
		this.aFloat62 = this.aFloat62 * local5 - local33 * local11;
	}
}
