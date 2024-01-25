import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class109_Sub2() {
		this.method3875();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!wr;)V")
	@Override
	public void method3870(@OriginalArg(0) Class109 arg0) {
		@Pc(2) Class109_Sub2 local2 = (Class109_Sub2) arg0;
		this.aFloat63 = local2.aFloat63;
		this.aFloat53 = local2.aFloat53;
		this.aFloat59 = local2.aFloat59;
		this.aFloat61 = local2.aFloat61;
		this.aFloat57 = local2.aFloat57;
		this.aFloat56 = local2.aFloat56;
		this.aFloat62 = local2.aFloat62;
		this.aFloat58 = local2.aFloat58;
		this.aFloat52 = local2.aFloat52;
		this.aFloat60 = local2.aFloat60;
		this.aFloat54 = local2.aFloat54;
		this.aFloat55 = local2.aFloat55;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat57 + (float) arg0 * this.aFloat62 + (float) arg1 * this.aFloat58 + (float) arg2 * this.aFloat56);
		arg3[1] = (int) ((float) arg2 * this.aFloat52 + (float) arg0 * this.aFloat54 + (float) arg1 * this.aFloat61 + this.aFloat53);
		arg3[0] = (int) (this.aFloat60 * (float) arg0 + (float) arg1 * this.aFloat63 + this.aFloat59 * (float) arg2 + this.aFloat55);
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)[F")
	public float[] method3881() {
		Static206.aFloatArray28[9] = this.aFloat52;
		Static206.aFloatArray28[4] = this.aFloat63;
		Static206.aFloatArray28[14] = this.aFloat57;
		Static206.aFloatArray28[2] = this.aFloat62;
		Static206.aFloatArray28[6] = this.aFloat58;
		Static206.aFloatArray28[1] = this.aFloat54;
		Static206.aFloatArray28[12] = this.aFloat55;
		Static206.aFloatArray28[10] = this.aFloat56;
		Static206.aFloatArray28[8] = this.aFloat59;
		Static206.aFloatArray28[5] = this.aFloat61;
		Static206.aFloatArray28[13] = this.aFloat53;
		Static206.aFloatArray28[0] = this.aFloat60;
		return Static206.aFloatArray28;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([I)V")
	@Override
	public void method3879(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat55;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat53;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat57;
		arg0[2] = (int) (this.aFloat56 * local25 + this.aFloat52 * local16 + local8 * this.aFloat59);
		arg0[1] = (int) (this.aFloat61 * local16 + local8 * this.aFloat63 + local25 * this.aFloat58);
		arg0[0] = (int) (this.aFloat62 * local25 + this.aFloat60 * local8 + this.aFloat54 * local16);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!wr;)V")
	public void method3882(@OriginalArg(1) Class109 arg0) {
		@Pc(2) Class109_Sub2 local2 = (Class109_Sub2) arg0;
		this.aFloat59 = local2.aFloat62;
		this.aFloat63 = local2.aFloat54;
		this.aFloat60 = local2.aFloat60;
		this.aFloat54 = local2.aFloat63;
		this.aFloat52 = local2.aFloat58;
		this.aFloat61 = local2.aFloat61;
		this.aFloat62 = local2.aFloat59;
		this.aFloat58 = local2.aFloat52;
		this.aFloat56 = local2.aFloat56;
		this.aFloat55 = -(local2.aFloat57 * this.aFloat59 + local2.aFloat55 * this.aFloat60 + this.aFloat63 * local2.aFloat53);
		this.aFloat53 = -(local2.aFloat55 * this.aFloat54 + local2.aFloat53 * this.aFloat61 + local2.aFloat57 * this.aFloat52);
		this.aFloat57 = -(local2.aFloat55 * this.aFloat62 + local2.aFloat53 * this.aFloat58 + local2.aFloat57 * this.aFloat56);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class70.aFloatArray8[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class70.aFloatArray7[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class70.aFloatArray8[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class70.aFloatArray7[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class70.aFloatArray8[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class70.aFloatArray7[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat60 = local29 * local17 + local23 * local43;
		this.aFloat58 = -local11;
		this.aFloat61 = local5 * local29;
		this.aFloat52 = local23 * local35 + local39 * local17;
		this.aFloat54 = -local17 * local35 + local23 * local39;
		this.aFloat63 = local35 * local5;
		this.aFloat56 = local5 * local17;
		this.aFloat59 = -local23 * local29 + local17 * local43;
		this.aFloat62 = local5 * local23;
		this.aFloat53 = -(this.aFloat61 * (float) arg1) + (float) -arg0 * this.aFloat54 - (float) arg2 * this.aFloat52;
		this.aFloat57 = -((float) arg2 * this.aFloat56) + (float) -arg0 * this.aFloat62 - this.aFloat58 * (float) arg1;
		this.aFloat55 = -(this.aFloat59 * (float) arg2) + this.aFloat60 * (float) -arg0 - this.aFloat63 * (float) arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	@Override
	public void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat57 = arg2;
		this.aFloat54 = this.aFloat62 = this.aFloat63 = this.aFloat58 = this.aFloat59 = this.aFloat52 = 0.0F;
		this.aFloat53 = arg1;
		this.aFloat55 = arg0;
		this.aFloat60 = this.aFloat61 = this.aFloat56 = 1.0F;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	@Override
	public void method3871(@OriginalArg(0) int arg0) {
		this.aFloat61 = 1.0F;
		this.aFloat60 = this.aFloat56 = Class70.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat59 = Class70.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat63 = this.aFloat55 = this.aFloat54 = this.aFloat52 = this.aFloat53 = this.aFloat58 = this.aFloat57 = 0.0F;
		this.aFloat62 = -this.aFloat59;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	@Override
	public void method3875() {
		this.aFloat60 = this.aFloat61 = this.aFloat56 = 1.0F;
		this.aFloat54 = this.aFloat62 = this.aFloat63 = this.aFloat58 = this.aFloat59 = this.aFloat52 = this.aFloat55 = this.aFloat53 = this.aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	@Override
	public void method3866(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat61 = this.aFloat56 = Class70.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat58 = Class70.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat63 = this.aFloat59 = this.aFloat55 = this.aFloat54 = this.aFloat53 = this.aFloat62 = this.aFloat57 = 0.0F;
		this.aFloat52 = -this.aFloat58;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
	@Override
	public void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 += arg1;
		this.aFloat55 += arg0;
		this.aFloat57 += arg2;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	@Override
	public void method3868(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class70.aFloatArray8[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class70.aFloatArray7[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat60;
		@Pc(17) float local17 = this.aFloat63;
		@Pc(20) float local20 = this.aFloat59;
		this.aFloat60 = local11 * this.aFloat62 + local5 * local14;
		@Pc(33) float local33 = this.aFloat55;
		this.aFloat62 = local5 * this.aFloat62 - local11 * local14;
		this.aFloat63 = local17 * local5 + local11 * this.aFloat58;
		this.aFloat59 = this.aFloat56 * local11 + local20 * local5;
		this.aFloat58 = this.aFloat58 * local5 - local17 * local11;
		this.aFloat56 = local5 * this.aFloat56 - local11 * local20;
		this.aFloat55 = local11 * this.aFloat57 + local5 * local33;
		this.aFloat57 = local5 * this.aFloat57 - local11 * local33;
	}

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)[F")
	public float[] method3883() {
		Static206.aFloatArray28[12] = 0.0F;
		Static206.aFloatArray28[10] = this.aFloat56;
		Static206.aFloatArray28[5] = this.aFloat61;
		Static206.aFloatArray28[8] = this.aFloat59;
		Static206.aFloatArray28[1] = this.aFloat54;
		Static206.aFloatArray28[6] = this.aFloat58;
		Static206.aFloatArray28[13] = 0.0F;
		Static206.aFloatArray28[14] = 0.0F;
		Static206.aFloatArray28[9] = this.aFloat52;
		Static206.aFloatArray28[2] = this.aFloat62;
		Static206.aFloatArray28[0] = this.aFloat60;
		Static206.aFloatArray28[4] = this.aFloat63;
		return Static206.aFloatArray28;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()Lclient!ng;")
	public Class109_Sub2 method3884() {
		@Pc(3) Class109_Sub2 local3 = new Class109_Sub2();
		local3.aFloat56 = this.aFloat56;
		local3.aFloat52 = this.aFloat52;
		local3.aFloat53 = this.aFloat53;
		local3.aFloat59 = this.aFloat59;
		local3.aFloat60 = this.aFloat60;
		local3.aFloat61 = this.aFloat61;
		local3.aFloat58 = this.aFloat58;
		local3.aFloat54 = this.aFloat54;
		local3.aFloat57 = this.aFloat57;
		local3.aFloat55 = this.aFloat55;
		local3.aFloat62 = this.aFloat62;
		local3.aFloat63 = this.aFloat63;
		return local3;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public void method3864(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat60 = this.aFloat61 = Class70.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat54 = Class70.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat63 = -this.aFloat54;
		this.aFloat59 = this.aFloat55 = this.aFloat52 = this.aFloat53 = this.aFloat62 = this.aFloat58 = this.aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
	@Override
	public void method3880(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class70.aFloatArray8[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class70.aFloatArray7[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat54;
		@Pc(17) float local17 = this.aFloat61;
		@Pc(20) float local20 = this.aFloat52;
		@Pc(23) float local23 = this.aFloat53;
		this.aFloat54 = local14 * local5 - this.aFloat62 * local11;
		this.aFloat62 = local11 * local14 + local5 * this.aFloat62;
		this.aFloat61 = local5 * local17 - this.aFloat58 * local11;
		this.aFloat52 = local5 * local20 - this.aFloat56 * local11;
		this.aFloat58 = local5 * this.aFloat58 + local17 * local11;
		this.aFloat53 = local5 * local23 - local11 * this.aFloat57;
		this.aFloat56 = local20 * local11 + local5 * this.aFloat56;
		this.aFloat57 = local11 * local23 + local5 * this.aFloat57;
	}
}
