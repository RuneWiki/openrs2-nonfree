import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class254_Sub1 extends Class254 {

	@OriginalMember(owner = "client!no", name = "e", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!no", name = "I", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!no", name = "K", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!no", name = "M", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class254_Sub1() {
		this.method7357();
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat131 + (float) arg1 * this.aFloat140 + this.aFloat135 * (float) arg0 + this.aFloat133 * (float) arg2);
		arg3[2] = (int) (this.aFloat141 * (float) arg1 + this.aFloat139 * (float) arg0 + (float) arg2 * this.aFloat130 + this.aFloat132);
		arg3[0] = (int) (this.aFloat137 + this.aFloat138 * (float) arg2 + (float) arg0 * this.aFloat134 + this.aFloat136 * (float) arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([I)V")
	@Override
	public void method7351(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat137;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat131;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat132;
		arg0[0] = (int) (local28 * this.aFloat139 + local20 * this.aFloat135 + local12 * this.aFloat134);
		arg0[1] = (int) (this.aFloat141 * local28 + local12 * this.aFloat136 + local20 * this.aFloat140);
		arg0[2] = (int) (local12 * this.aFloat138 + local20 * this.aFloat133 + local28 * this.aFloat130);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
	@Override
	public void method7350(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class254.aFloatArray85[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class254.aFloatArray86[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat134;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat138;
		this.aFloat134 = local18 * local9 + this.aFloat139 * local15;
		@Pc(37) float local37 = this.aFloat137;
		this.aFloat139 = local9 * this.aFloat139 - local18 * local15;
		this.aFloat136 = local9 * local21 + local15 * this.aFloat141;
		this.aFloat141 = this.aFloat141 * local9 - local21 * local15;
		this.aFloat138 = this.aFloat130 * local15 + local9 * local24;
		this.aFloat130 = this.aFloat130 * local9 - local15 * local24;
		this.aFloat137 = local15 * this.aFloat132 + local37 * local9;
		this.aFloat132 = this.aFloat132 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(III)V")
	@Override
	public void method7361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat135 = this.aFloat139 = this.aFloat136 = this.aFloat141 = this.aFloat138 = this.aFloat133 = 0.0F;
		this.aFloat134 = this.aFloat140 = this.aFloat130 = 1.0F;
		this.aFloat137 = (float) arg0;
		this.aFloat132 = (float) arg2;
		this.aFloat131 = (float) arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat131 += (float) arg1;
		this.aFloat132 += (float) arg2;
		this.aFloat137 += (float) arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!oha;)V")
	public void method5929(@OriginalArg(1) Class254 arg0) {
		@Pc(6) Class254_Sub1 local6 = (Class254_Sub1) arg0;
		this.aFloat134 = local6.aFloat134;
		this.aFloat136 = local6.aFloat135;
		this.aFloat138 = local6.aFloat139;
		this.aFloat135 = local6.aFloat136;
		this.aFloat133 = local6.aFloat141;
		this.aFloat139 = local6.aFloat138;
		this.aFloat140 = local6.aFloat140;
		this.aFloat137 = -(local6.aFloat132 * this.aFloat138 + this.aFloat136 * local6.aFloat131 + local6.aFloat137 * this.aFloat134);
		this.aFloat141 = local6.aFloat133;
		this.aFloat130 = local6.aFloat130;
		this.aFloat131 = -(this.aFloat135 * local6.aFloat137 + local6.aFloat131 * this.aFloat140 + this.aFloat133 * local6.aFloat132);
		this.aFloat132 = -(this.aFloat139 * local6.aFloat137 + local6.aFloat131 * this.aFloat141 + local6.aFloat132 * this.aFloat130);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIFFIFI)V")
	public void method5930(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat140 = (float) arg3;
			this.aFloat130 = 1.0F;
			this.aFloat134 = (float) arg0;
			this.aFloat135 = this.aFloat139 = this.aFloat136 = this.aFloat141 = this.aFloat138 = this.aFloat133 = 0.0F;
		} else {
			@Pc(42) float local42 = Class254.aFloatArray85[arg5 & 0x3FFF];
			@Pc(48) float local48 = Class254.aFloatArray86[arg5 & 0x3FFF];
			this.aFloat135 = (float) arg0 * local48;
			this.aFloat139 = this.aFloat141 = this.aFloat138 = this.aFloat133 = 0.0F;
			this.aFloat140 = local42 * (float) arg3;
			this.aFloat134 = local42 * (float) arg0;
			this.aFloat136 = (float) arg3 * -local48;
			this.aFloat130 = 1.0F;
		}
		this.aFloat132 = arg2;
		this.aFloat131 = arg4;
		this.aFloat137 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)[F")
	public float[] method5931() {
		Static198.aFloatArray83[12] = 0.0F;
		Static198.aFloatArray83[9] = this.aFloat133;
		Static198.aFloatArray83[1] = this.aFloat135;
		Static198.aFloatArray83[13] = 0.0F;
		Static198.aFloatArray83[10] = this.aFloat130;
		Static198.aFloatArray83[5] = this.aFloat140;
		Static198.aFloatArray83[2] = this.aFloat139;
		Static198.aFloatArray83[8] = this.aFloat138;
		Static198.aFloatArray83[0] = this.aFloat134;
		Static198.aFloatArray83[14] = 0.0F;
		Static198.aFloatArray83[4] = this.aFloat136;
		Static198.aFloatArray83[6] = this.aFloat141;
		return Static198.aFloatArray83;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method7346(@OriginalArg(0) int arg0) {
		this.aFloat140 = 1.0F;
		this.aFloat134 = this.aFloat130 = Class254.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat138 = Class254.aFloatArray86[arg0 & 0x3FFF];
		this.aFloat136 = this.aFloat137 = this.aFloat135 = this.aFloat133 = this.aFloat131 = this.aFloat141 = this.aFloat132 = 0.0F;
		this.aFloat139 = -this.aFloat138;
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(I)[F")
	public float[] method5932() {
		Static198.aFloatArray83[1] = this.aFloat135;
		Static198.aFloatArray83[5] = this.aFloat140;
		Static198.aFloatArray83[12] = this.aFloat137;
		Static198.aFloatArray83[10] = this.aFloat130;
		Static198.aFloatArray83[4] = this.aFloat136;
		Static198.aFloatArray83[8] = this.aFloat138;
		Static198.aFloatArray83[14] = this.aFloat132;
		Static198.aFloatArray83[6] = this.aFloat141;
		Static198.aFloatArray83[2] = this.aFloat139;
		Static198.aFloatArray83[0] = this.aFloat134;
		Static198.aFloatArray83[9] = this.aFloat133;
		Static198.aFloatArray83[13] = this.aFloat131;
		return Static198.aFloatArray83;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	@Override
	public void method7347(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class254.aFloatArray85[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class254.aFloatArray86[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat134;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat138;
		@Pc(27) float local27 = this.aFloat137;
		this.aFloat134 = local9 * local18 - local15 * this.aFloat135;
		this.aFloat135 = local15 * local18 + local9 * this.aFloat135;
		this.aFloat136 = local9 * local21 - this.aFloat140 * local15;
		this.aFloat140 = this.aFloat140 * local9 + local15 * local21;
		this.aFloat138 = local24 * local9 - local15 * this.aFloat133;
		this.aFloat137 = local27 * local9 - local15 * this.aFloat131;
		this.aFloat133 = this.aFloat133 * local9 + local15 * local24;
		this.aFloat131 = this.aFloat131 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat132);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat131);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat137);
		arg3[1] = (int) (this.aFloat141 * (float) local10 + this.aFloat136 * (float) local24 + (float) local17 * this.aFloat140);
		arg3[0] = (int) (this.aFloat139 * (float) local10 + (float) local24 * this.aFloat134 + (float) local17 * this.aFloat135);
		arg3[2] = (int) ((float) local24 * this.aFloat138 + this.aFloat133 * (float) local17 + this.aFloat130 * (float) local10);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method7353() {
		@Pc(7) Class254_Sub1 local7 = new Class254_Sub1();
		local7.aFloat130 = this.aFloat130;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat141 = this.aFloat141;
		return local7;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat138 + this.aFloat134 * (float) arg0 + (float) arg1 * this.aFloat136);
		arg3[2] = (int) ((float) arg1 * this.aFloat141 + (float) arg0 * this.aFloat139 + this.aFloat130 * (float) arg2);
		arg3[1] = (int) ((float) arg0 * this.aFloat135 + this.aFloat140 * (float) arg1 + this.aFloat133 * (float) arg2);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FIF[FFF)V")
	public void method5934(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[2] = arg4 * this.aFloat130 + this.aFloat139 * arg1 + arg0 * this.aFloat141;
		@Pc(43) float local43;
		@Pc(59) float local59;
		@Pc(51) float local51;
		@Pc(35) float local35;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local35 = -arg3 / arg1;
			local43 = this.aFloat137 + local35 * this.aFloat134;
			local51 = this.aFloat139 * local35 + this.aFloat132;
			local59 = this.aFloat131 + this.aFloat135 * local35;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local35 = -arg3 / arg0;
			local51 = local35 * this.aFloat141 + this.aFloat132;
			local43 = local35 * this.aFloat136 + this.aFloat137;
			local59 = this.aFloat131 + this.aFloat140 * local35;
		} else {
			local35 = -arg3 / arg4;
			local43 = this.aFloat138 * local35 + this.aFloat137;
			local59 = this.aFloat131 + this.aFloat133 * local35;
			local51 = local35 * this.aFloat130 + this.aFloat132;
		}
		arg2[0] = this.aFloat138 * arg4 + arg1 * this.aFloat134 + arg0 * this.aFloat136;
		arg2[1] = this.aFloat133 * arg4 + this.aFloat135 * arg1 + arg0 * this.aFloat140;
		arg2[3] = -(arg2[0] * local43 + local59 * arg2[1] + arg2[2] * local51);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
	@Override
	public void method7357() {
		this.aFloat134 = this.aFloat140 = this.aFloat130 = 1.0F;
		this.aFloat135 = this.aFloat139 = this.aFloat136 = this.aFloat141 = this.aFloat138 = this.aFloat133 = this.aFloat137 = this.aFloat131 = this.aFloat132 = 0.0F;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
	@Override
	public void method7354(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat140 = this.aFloat130 = Class254.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat141 = Class254.aFloatArray86[arg0 & 0x3FFF];
		this.aFloat136 = this.aFloat138 = this.aFloat137 = this.aFloat135 = this.aFloat131 = this.aFloat139 = this.aFloat132 = 0.0F;
		this.aFloat133 = -this.aFloat141;
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
	public void method5935() {
		this.aFloat140 = -this.aFloat140;
		this.aFloat139 = -this.aFloat139;
		this.aFloat131 = -this.aFloat131;
		this.aFloat130 = -this.aFloat130;
		this.aFloat141 = -this.aFloat141;
		this.aFloat132 = -this.aFloat132;
		this.aFloat135 = -this.aFloat135;
		this.aFloat133 = -this.aFloat133;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class254.aFloatArray85[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class254.aFloatArray86[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class254.aFloatArray85[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class254.aFloatArray86[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class254.aFloatArray85[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class254.aFloatArray86[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat133 = local21 * local43 + local27 * local39;
		this.aFloat140 = local33 * local9;
		this.aFloat136 = local39 * local9;
		this.aFloat134 = local27 * local47 + local21 * local33;
		this.aFloat139 = local27 * local9;
		this.aFloat138 = local33 * -local27 + local21 * local47;
		this.aFloat130 = local9 * local21;
		this.aFloat141 = -local15;
		this.aFloat135 = -local21 * local39 + local27 * local43;
		this.aFloat137 = -((float) arg1 * this.aFloat136) + (float) -arg0 * this.aFloat134 - (float) arg2 * this.aFloat138;
		this.aFloat131 = (float) -arg0 * this.aFloat135 - this.aFloat140 * (float) arg1 - this.aFloat133 * (float) arg2;
		this.aFloat132 = -((float) arg2 * this.aFloat130) + this.aFloat139 * (float) -arg0 - this.aFloat141 * (float) arg1;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
	@Override
	public void method7363(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat134 = this.aFloat140 = Class254.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat135 = Class254.aFloatArray86[arg0 & 0x3FFF];
		this.aFloat136 = -this.aFloat135;
		this.aFloat138 = this.aFloat137 = this.aFloat133 = this.aFloat131 = this.aFloat139 = this.aFloat141 = this.aFloat132 = 0.0F;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	public void method7352(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class254.aFloatArray85[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class254.aFloatArray86[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat135;
		@Pc(21) float local21 = this.aFloat140;
		@Pc(24) float local24 = this.aFloat133;
		this.aFloat135 = local18 * local9 - local15 * this.aFloat139;
		@Pc(38) float local38 = this.aFloat131;
		this.aFloat139 = this.aFloat139 * local9 + local18 * local15;
		this.aFloat140 = local21 * local9 - this.aFloat141 * local15;
		this.aFloat141 = local21 * local15 + this.aFloat141 * local9;
		this.aFloat133 = local24 * local9 - this.aFloat130 * local15;
		this.aFloat131 = local38 * local9 - local15 * this.aFloat132;
		this.aFloat130 = local9 * this.aFloat130 + local15 * local24;
		this.aFloat132 = this.aFloat132 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method7356(@OriginalArg(0) Class254 arg0) {
		@Pc(6) Class254_Sub1 local6 = (Class254_Sub1) arg0;
		this.aFloat131 = local6.aFloat131;
		this.aFloat135 = local6.aFloat135;
		this.aFloat130 = local6.aFloat130;
		this.aFloat136 = local6.aFloat136;
		this.aFloat134 = local6.aFloat134;
		this.aFloat141 = local6.aFloat141;
		this.aFloat138 = local6.aFloat138;
		this.aFloat139 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat133 = local6.aFloat133;
		this.aFloat137 = local6.aFloat137;
		this.aFloat132 = local6.aFloat132;
	}
}
