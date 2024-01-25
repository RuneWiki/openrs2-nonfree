import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class56_Sub2() {
		this.method4695();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)[F")
	public float[] method4699() {
		Static281.aFloatArray22[4] = this.aFloat48;
		Static281.aFloatArray22[0] = this.aFloat39;
		Static281.aFloatArray22[5] = this.aFloat38;
		Static281.aFloatArray22[9] = this.aFloat37;
		Static281.aFloatArray22[1] = this.aFloat47;
		Static281.aFloatArray22[13] = this.aFloat44;
		Static281.aFloatArray22[10] = this.aFloat40;
		Static281.aFloatArray22[2] = this.aFloat45;
		Static281.aFloatArray22[12] = this.aFloat46;
		Static281.aFloatArray22[8] = this.aFloat43;
		Static281.aFloatArray22[6] = this.aFloat41;
		Static281.aFloatArray22[14] = this.aFloat42;
		return Static281.aFloatArray22;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	@Override
	public void method4695() {
		this.aFloat47 = this.aFloat45 = this.aFloat48 = this.aFloat41 = this.aFloat43 = this.aFloat37 = this.aFloat46 = this.aFloat44 = this.aFloat42 = 0.0F;
		this.aFloat39 = this.aFloat38 = this.aFloat40 = 1.0F;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)[F")
	public float[] method4700() {
		Static281.aFloatArray22[10] = this.aFloat40;
		Static281.aFloatArray22[1] = this.aFloat47;
		Static281.aFloatArray22[9] = this.aFloat37;
		Static281.aFloatArray22[5] = this.aFloat38;
		Static281.aFloatArray22[8] = this.aFloat43;
		Static281.aFloatArray22[2] = this.aFloat45;
		Static281.aFloatArray22[13] = 0.0F;
		Static281.aFloatArray22[14] = 0.0F;
		Static281.aFloatArray22[12] = 0.0F;
		Static281.aFloatArray22[0] = this.aFloat39;
		Static281.aFloatArray22[6] = this.aFloat41;
		Static281.aFloatArray22[4] = this.aFloat48;
		return Static281.aFloatArray22;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ug;)V")
	public void method4701(@OriginalArg(1) Class56 arg0) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		this.aFloat39 = local6.aFloat39;
		this.aFloat48 = local6.aFloat47;
		this.aFloat43 = local6.aFloat45;
		this.aFloat45 = local6.aFloat43;
		this.aFloat37 = local6.aFloat41;
		this.aFloat38 = local6.aFloat38;
		this.aFloat47 = local6.aFloat48;
		this.aFloat40 = local6.aFloat40;
		this.aFloat41 = local6.aFloat37;
		this.aFloat46 = -(this.aFloat43 * local6.aFloat42 + this.aFloat48 * local6.aFloat44 + local6.aFloat46 * this.aFloat39);
		this.aFloat44 = -(this.aFloat47 * local6.aFloat46 + local6.aFloat44 * this.aFloat38 + this.aFloat37 * local6.aFloat42);
		this.aFloat42 = -(local6.aFloat42 * this.aFloat40 + local6.aFloat46 * this.aFloat45 + this.aFloat41 * local6.aFloat44);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([I)V")
	@Override
	public void method4692(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat46;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat44;
		@Pc(23) float local23 = (float) arg0[2] - this.aFloat42;
		arg0[0] = (int) (local23 * this.aFloat45 + this.aFloat47 * local15 + this.aFloat39 * local7);
		arg0[2] = (int) (local23 * this.aFloat40 + local15 * this.aFloat37 + this.aFloat43 * local7);
		arg0[1] = (int) (this.aFloat48 * local7 + this.aFloat38 * local15 + this.aFloat41 * local23);
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class168.aFloatArray18[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class168.aFloatArray17[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat47;
		@Pc(17) float local17 = this.aFloat38;
		@Pc(20) float local20 = this.aFloat37;
		@Pc(23) float local23 = this.aFloat44;
		this.aFloat47 = local14 * local5 - this.aFloat45 * local11;
		this.aFloat38 = local17 * local5 - this.aFloat41 * local11;
		this.aFloat45 = local11 * local14 + local5 * this.aFloat45;
		this.aFloat37 = local5 * local20 - local11 * this.aFloat40;
		this.aFloat41 = this.aFloat41 * local5 + local17 * local11;
		this.aFloat44 = local5 * local23 - this.aFloat42 * local11;
		this.aFloat40 = local5 * this.aFloat40 + local11 * local20;
		this.aFloat42 = local23 * local11 + local5 * this.aFloat42;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method4697(@OriginalArg(0) Class56 arg0) {
		@Pc(2) Class56_Sub2 local2 = (Class56_Sub2) arg0;
		this.aFloat40 = local2.aFloat40;
		this.aFloat46 = local2.aFloat46;
		this.aFloat43 = local2.aFloat43;
		this.aFloat48 = local2.aFloat48;
		this.aFloat45 = local2.aFloat45;
		this.aFloat42 = local2.aFloat42;
		this.aFloat47 = local2.aFloat47;
		this.aFloat37 = local2.aFloat37;
		this.aFloat44 = local2.aFloat44;
		this.aFloat38 = local2.aFloat38;
		this.aFloat39 = local2.aFloat39;
		this.aFloat41 = local2.aFloat41;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat38 = this.aFloat40 = Class168.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat41 = Class168.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat37 = -this.aFloat41;
		this.aFloat48 = this.aFloat43 = this.aFloat46 = this.aFloat47 = this.aFloat44 = this.aFloat45 = this.aFloat42 = 0.0F;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	@Override
	public void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat46 += arg0;
		this.aFloat42 += arg2;
		this.aFloat44 += arg1;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	@Override
	public void method4698(@OriginalArg(0) int arg0) {
		this.aFloat40 = 1.0F;
		this.aFloat39 = this.aFloat38 = Class168.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat47 = Class168.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat43 = this.aFloat46 = this.aFloat37 = this.aFloat44 = this.aFloat45 = this.aFloat41 = this.aFloat42 = 0.0F;
		this.aFloat48 = -this.aFloat47;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0) {
		this.aFloat38 = 1.0F;
		this.aFloat39 = this.aFloat40 = Class168.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat43 = Class168.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat43;
		this.aFloat48 = this.aFloat46 = this.aFloat47 = this.aFloat37 = this.aFloat44 = this.aFloat41 = this.aFloat42 = 0.0F;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat42 = arg2;
		this.aFloat46 = arg0;
		this.aFloat44 = arg1;
		this.aFloat47 = this.aFloat45 = this.aFloat48 = this.aFloat41 = this.aFloat43 = this.aFloat37 = 0.0F;
		this.aFloat39 = this.aFloat38 = this.aFloat40 = 1.0F;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lclient!sd;")
	public Class56_Sub2 method4702() {
		@Pc(3) Class56_Sub2 local3 = new Class56_Sub2();
		local3.aFloat39 = this.aFloat39;
		local3.aFloat38 = this.aFloat38;
		local3.aFloat47 = this.aFloat47;
		local3.aFloat45 = this.aFloat45;
		local3.aFloat37 = this.aFloat37;
		local3.aFloat48 = this.aFloat48;
		local3.aFloat43 = this.aFloat43;
		local3.aFloat44 = this.aFloat44;
		local3.aFloat41 = this.aFloat41;
		local3.aFloat42 = this.aFloat42;
		local3.aFloat46 = this.aFloat46;
		local3.aFloat40 = this.aFloat40;
		return local3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class168.aFloatArray18[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class168.aFloatArray17[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class168.aFloatArray18[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class168.aFloatArray17[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class168.aFloatArray18[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class168.aFloatArray17[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat40 = local17 * local5;
		this.aFloat39 = local23 * local43 + local17 * local29;
		this.aFloat43 = local43 * local17 + -local23 * local29;
		this.aFloat45 = local23 * local5;
		this.aFloat41 = -local11;
		this.aFloat47 = local35 * -local17 + local23 * local39;
		this.aFloat38 = local29 * local5;
		this.aFloat37 = local17 * local39 + local23 * local35;
		this.aFloat48 = local5 * local35;
		this.aFloat42 = -(this.aFloat40 * (float) arg2) - (float) arg1 * this.aFloat41 + (float) -arg0 * this.aFloat45;
		this.aFloat46 = -(this.aFloat43 * (float) arg2) + this.aFloat39 * (float) -arg0 - (float) arg1 * this.aFloat48;
		this.aFloat44 = -((float) arg2 * this.aFloat37) + this.aFloat47 * (float) -arg0 - this.aFloat38 * (float) arg1;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class168.aFloatArray18[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class168.aFloatArray17[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat39;
		@Pc(17) float local17 = this.aFloat48;
		@Pc(20) float local20 = this.aFloat43;
		@Pc(23) float local23 = this.aFloat46;
		this.aFloat39 = local5 * local14 + local11 * this.aFloat45;
		this.aFloat48 = local11 * this.aFloat41 + local5 * local17;
		this.aFloat45 = this.aFloat45 * local5 - local14 * local11;
		this.aFloat41 = local5 * this.aFloat41 - local11 * local17;
		this.aFloat43 = this.aFloat40 * local11 + local5 * local20;
		this.aFloat46 = local23 * local5 + this.aFloat42 * local11;
		this.aFloat40 = local5 * this.aFloat40 - local20 * local11;
		this.aFloat42 = this.aFloat42 * local5 - local23 * local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat46 + this.aFloat43 * (float) arg2 + this.aFloat48 * (float) arg1 + this.aFloat39 * (float) arg0);
		arg3[1] = (int) (this.aFloat44 + this.aFloat47 * (float) arg0 + this.aFloat38 * (float) arg1 + (float) arg2 * this.aFloat37);
		arg3[2] = (int) (this.aFloat40 * (float) arg2 + this.aFloat41 * (float) arg1 + (float) arg0 * this.aFloat45 + this.aFloat42);
	}
}
