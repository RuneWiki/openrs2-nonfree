import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!fw", name = "C", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!fw", name = "J", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!fw", name = "L", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!fw", name = "M", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!fw", name = "N", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!fw", name = "O", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!fw", name = "U", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class47_Sub2() {
		this.method7878();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method7867() {
		@Pc(7) Class47_Sub2 local7 = new Class47_Sub2();
		local7.aFloat137 = this.aFloat137;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat132 = this.aFloat132;
		return local7;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat139 += arg2;
		this.aFloat142 += arg0;
		this.aFloat140 += arg1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub1_Sub12.aFloatArray51[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub12.aFloatArray52[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub1_Sub12.aFloatArray51[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub1_Sub12.aFloatArray52[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub1_Sub12.aFloatArray51[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub1_Sub12.aFloatArray52[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat135 = local33 * local21 + local47 * local27;
		this.aFloat133 = local9 * local21;
		this.aFloat141 = local27 * local9;
		this.aFloat136 = -local15;
		this.aFloat137 = local33 * local9;
		this.aFloat131 = local43 * local27 + -local21 * local39;
		this.aFloat132 = local9 * local39;
		this.aFloat138 = local33 * -local27 + local21 * local47;
		this.aFloat134 = local39 * local27 + local43 * local21;
		this.aFloat139 = -((float) arg2 * this.aFloat133) + this.aFloat141 * (float) -arg0 - (float) arg1 * this.aFloat136;
		this.aFloat142 = -((float) arg2 * this.aFloat138) + (float) -arg0 * this.aFloat135 - this.aFloat132 * (float) arg1;
		this.aFloat140 = (float) -arg0 * this.aFloat131 - (float) arg1 * this.aFloat137 - (float) arg2 * this.aFloat134;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat131;
		@Pc(21) float local21 = this.aFloat137;
		@Pc(24) float local24 = this.aFloat134;
		@Pc(27) float local27 = this.aFloat140;
		this.aFloat131 = local18 * local9 - this.aFloat141 * local15;
		this.aFloat137 = local9 * local21 - this.aFloat136 * local15;
		this.aFloat141 = local15 * local18 + local9 * this.aFloat141;
		this.aFloat134 = local9 * local24 - this.aFloat133 * local15;
		this.aFloat136 = local21 * local15 + local9 * this.aFloat136;
		this.aFloat140 = local27 * local9 - this.aFloat139 * local15;
		this.aFloat133 = this.aFloat133 * local9 + local15 * local24;
		this.aFloat139 = this.aFloat139 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	@Override
	public void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat142 = arg0;
		this.aFloat131 = this.aFloat141 = this.aFloat132 = this.aFloat136 = this.aFloat138 = this.aFloat134 = 0.0F;
		this.aFloat140 = arg1;
		this.aFloat135 = this.aFloat137 = this.aFloat133 = 1.0F;
		this.aFloat139 = arg2;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!wc;B)V")
	public void method3497(@OriginalArg(0) Class47 arg0) {
		@Pc(6) Class47_Sub2 local6 = (Class47_Sub2) arg0;
		this.aFloat138 = local6.aFloat141;
		this.aFloat135 = local6.aFloat135;
		this.aFloat132 = local6.aFloat131;
		this.aFloat137 = local6.aFloat137;
		this.aFloat131 = local6.aFloat132;
		this.aFloat141 = local6.aFloat138;
		this.aFloat134 = local6.aFloat136;
		this.aFloat142 = -(this.aFloat138 * local6.aFloat139 + this.aFloat135 * local6.aFloat142 + local6.aFloat140 * this.aFloat132);
		this.aFloat136 = local6.aFloat134;
		this.aFloat133 = local6.aFloat133;
		this.aFloat140 = -(local6.aFloat142 * this.aFloat131 + local6.aFloat140 * this.aFloat137 + this.aFloat134 * local6.aFloat139);
		this.aFloat139 = -(local6.aFloat139 * this.aFloat133 + local6.aFloat140 * this.aFloat136 + this.aFloat141 * local6.aFloat142);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method7877(@OriginalArg(0) Class47 arg0) {
		@Pc(6) Class47_Sub2 local6 = (Class47_Sub2) arg0;
		this.aFloat131 = local6.aFloat131;
		this.aFloat133 = local6.aFloat133;
		this.aFloat140 = local6.aFloat140;
		this.aFloat142 = local6.aFloat142;
		this.aFloat132 = local6.aFloat132;
		this.aFloat138 = local6.aFloat138;
		this.aFloat136 = local6.aFloat136;
		this.aFloat139 = local6.aFloat139;
		this.aFloat141 = local6.aFloat141;
		this.aFloat135 = local6.aFloat135;
		this.aFloat134 = local6.aFloat134;
		this.aFloat137 = local6.aFloat137;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat142);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat140);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat139);
		arg3[2] = (int) (this.aFloat138 * (float) local6 + (float) local13 * this.aFloat134 + (float) local24 * this.aFloat133);
		arg3[0] = (int) (this.aFloat141 * (float) local24 + (float) local6 * this.aFloat135 + this.aFloat131 * (float) local13);
		arg3[1] = (int) ((float) local6 * this.aFloat132 + (float) local13 * this.aFloat137 + (float) local24 * this.aFloat136);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)[F")
	public float[] method3498() {
		Static222.aFloatArray50[6] = this.aFloat136;
		Static222.aFloatArray50[0] = this.aFloat135;
		Static222.aFloatArray50[5] = this.aFloat137;
		Static222.aFloatArray50[10] = this.aFloat133;
		Static222.aFloatArray50[12] = 0.0F;
		Static222.aFloatArray50[1] = this.aFloat131;
		Static222.aFloatArray50[9] = this.aFloat134;
		Static222.aFloatArray50[2] = this.aFloat141;
		Static222.aFloatArray50[13] = 0.0F;
		Static222.aFloatArray50[8] = this.aFloat138;
		Static222.aFloatArray50[14] = 0.0F;
		Static222.aFloatArray50[4] = this.aFloat132;
		return Static222.aFloatArray50;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	@Override
	public void method7861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat135;
		@Pc(21) float local21 = this.aFloat132;
		@Pc(24) float local24 = this.aFloat138;
		@Pc(27) float local27 = this.aFloat142;
		this.aFloat135 = local18 * local9 - local15 * this.aFloat131;
		this.aFloat132 = local21 * local9 - this.aFloat137 * local15;
		this.aFloat131 = this.aFloat131 * local9 + local18 * local15;
		this.aFloat138 = local9 * local24 - this.aFloat134 * local15;
		this.aFloat137 = local15 * local21 + local9 * this.aFloat137;
		this.aFloat134 = this.aFloat134 * local9 + local24 * local15;
		this.aFloat142 = local27 * local9 - this.aFloat140 * local15;
		this.aFloat140 = local9 * this.aFloat140 + local15 * local27;
	}

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		this.aFloat137 = 1.0F;
		this.aFloat135 = this.aFloat133 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat138 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat132 = this.aFloat142 = this.aFloat131 = this.aFloat134 = this.aFloat140 = this.aFloat136 = this.aFloat139 = 0.0F;
		this.aFloat141 = -this.aFloat138;
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V")
	public void method3499() {
		this.aFloat139 = -this.aFloat139;
		this.aFloat133 = -this.aFloat133;
		this.aFloat141 = -this.aFloat141;
		this.aFloat134 = -this.aFloat134;
		this.aFloat137 = -this.aFloat137;
		this.aFloat136 = -this.aFloat136;
		this.aFloat131 = -this.aFloat131;
		this.aFloat140 = -this.aFloat140;
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)V")
	@Override
	public void method7871(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat135;
		@Pc(21) float local21 = this.aFloat132;
		@Pc(24) float local24 = this.aFloat138;
		this.aFloat135 = local15 * this.aFloat141 + local9 * local18;
		@Pc(37) float local37 = this.aFloat142;
		this.aFloat132 = local15 * this.aFloat136 + local9 * local21;
		this.aFloat141 = this.aFloat141 * local9 - local18 * local15;
		this.aFloat136 = this.aFloat136 * local9 - local21 * local15;
		this.aFloat138 = this.aFloat133 * local15 + local9 * local24;
		this.aFloat133 = this.aFloat133 * local9 - local15 * local24;
		this.aFloat142 = local37 * local9 + this.aFloat139 * local15;
		this.aFloat139 = this.aFloat139 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "(I)[F")
	public float[] method3500() {
		Static222.aFloatArray50[1] = this.aFloat131;
		Static222.aFloatArray50[5] = this.aFloat137;
		Static222.aFloatArray50[4] = this.aFloat132;
		Static222.aFloatArray50[10] = this.aFloat133;
		Static222.aFloatArray50[12] = this.aFloat142;
		Static222.aFloatArray50[0] = this.aFloat135;
		Static222.aFloatArray50[9] = this.aFloat134;
		Static222.aFloatArray50[14] = this.aFloat139;
		Static222.aFloatArray50[6] = this.aFloat136;
		Static222.aFloatArray50[13] = this.aFloat140;
		Static222.aFloatArray50[2] = this.aFloat141;
		Static222.aFloatArray50[8] = this.aFloat138;
		return Static222.aFloatArray50;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat131 * (float) arg0 + this.aFloat137 * (float) arg1 + this.aFloat134 * (float) arg2);
		arg3[2] = (int) (this.aFloat136 * (float) arg1 + (float) arg0 * this.aFloat141 + (float) arg2 * this.aFloat133);
		arg3[0] = (int) (this.aFloat138 * (float) arg2 + (float) arg1 * this.aFloat132 + this.aFloat135 * (float) arg0);
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat133 = 1.0F;
		this.aFloat135 = this.aFloat137 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat131 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat138 = this.aFloat142 = this.aFloat134 = this.aFloat140 = this.aFloat141 = this.aFloat136 = this.aFloat139 = 0.0F;
		this.aFloat132 = -this.aFloat131;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([I)V")
	@Override
	public void method7874(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat142;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat140;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat139;
		arg0[0] = (int) (this.aFloat141 * local29 + this.aFloat131 * local20 + local11 * this.aFloat135);
		arg0[2] = (int) (this.aFloat133 * local29 + this.aFloat134 * local20 + local11 * this.aFloat138);
		arg0[1] = (int) (local29 * this.aFloat136 + this.aFloat137 * local20 + local11 * this.aFloat132);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B[FFFFF)V")
	public void method3501(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[2] = this.aFloat136 * arg4 + this.aFloat141 * arg1 + arg2 * this.aFloat133;
		@Pc(67) float local67;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local43 = -arg3 / arg1;
			local67 = this.aFloat142 + local43 * this.aFloat135;
			local51 = this.aFloat131 * local43 + this.aFloat140;
			local59 = this.aFloat139 + this.aFloat141 * local43;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local43 = -arg3 / arg4;
			local59 = local43 * this.aFloat136 + this.aFloat139;
			local51 = this.aFloat137 * local43 + this.aFloat140;
			local67 = this.aFloat132 * local43 + this.aFloat142;
		} else {
			local43 = -arg3 / arg2;
			local51 = this.aFloat140 + this.aFloat134 * local43;
			local59 = this.aFloat139 + local43 * this.aFloat133;
			local67 = this.aFloat138 * local43 + this.aFloat142;
		}
		arg0[1] = arg4 * this.aFloat137 + this.aFloat131 * arg1 + arg2 * this.aFloat134;
		arg0[0] = this.aFloat138 * arg2 + this.aFloat135 * arg1 + this.aFloat132 * arg4;
		arg0[3] = -(arg0[2] * local59 + arg0[1] * local51 + local67 * arg0[0]);
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "()V")
	@Override
	public void method7878() {
		this.aFloat131 = this.aFloat141 = this.aFloat132 = this.aFloat136 = this.aFloat138 = this.aFloat134 = this.aFloat142 = this.aFloat140 = this.aFloat139 = 0.0F;
		this.aFloat135 = this.aFloat137 = this.aFloat133 = 1.0F;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(FIFIFII)V")
	public void method3503(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat133 = 1.0F;
			this.aFloat135 = arg1;
			this.aFloat137 = arg5;
			this.aFloat131 = this.aFloat141 = this.aFloat132 = this.aFloat136 = this.aFloat138 = this.aFloat134 = 0.0F;
		} else {
			@Pc(10) float local10 = Class3_Sub1_Sub12.aFloatArray51[arg4 & 0x3FFF];
			@Pc(16) float local16 = Class3_Sub1_Sub12.aFloatArray52[arg4 & 0x3FFF];
			this.aFloat132 = (float) arg5 * -local16;
			this.aFloat131 = (float) arg1 * local16;
			this.aFloat133 = 1.0F;
			this.aFloat141 = this.aFloat136 = this.aFloat138 = this.aFloat134 = 0.0F;
			this.aFloat137 = local10 * (float) arg5;
			this.aFloat135 = local10 * (float) arg1;
		}
		this.aFloat140 = arg0;
		this.aFloat139 = arg3;
		this.aFloat142 = arg2;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0) {
		this.aFloat135 = 1.0F;
		this.aFloat137 = this.aFloat133 = Class3_Sub1_Sub12.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat136 = Class3_Sub1_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat132 = this.aFloat138 = this.aFloat142 = this.aFloat131 = this.aFloat140 = this.aFloat141 = this.aFloat139 = 0.0F;
		this.aFloat134 = -this.aFloat136;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat142 + this.aFloat132 * (float) arg1 + (float) arg0 * this.aFloat135 + (float) arg2 * this.aFloat138);
		arg3[1] = (int) (this.aFloat140 + this.aFloat137 * (float) arg1 + this.aFloat131 * (float) arg0 + this.aFloat134 * (float) arg2);
		arg3[2] = (int) (this.aFloat139 + (float) arg0 * this.aFloat141 + (float) arg1 * this.aFloat136 + (float) arg2 * this.aFloat133);
	}
}
