import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class181_Sub2 extends Class181 {

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class181_Sub2() {
		this.method6349();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat129);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat133);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat137);
		arg3[1] = (int) ((float) local24 * this.aFloat131 + this.aFloat134 * (float) local6 + (float) local13 * this.aFloat136);
		arg3[2] = (int) (this.aFloat130 * (float) local24 + this.aFloat139 * (float) local6 + (float) local13 * this.aFloat135);
		arg3[0] = (int) ((float) local13 * this.aFloat132 + this.aFloat138 * (float) local6 + this.aFloat140 * (float) local24);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	@Override
	public void method6343(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class246.aFloatArray69[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class246.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat140;
		@Pc(21) float local21 = this.aFloat131;
		@Pc(24) float local24 = this.aFloat130;
		this.aFloat140 = local9 * local18 - this.aFloat132 * local15;
		@Pc(38) float local38 = this.aFloat137;
		this.aFloat131 = local21 * local9 - local15 * this.aFloat136;
		this.aFloat132 = this.aFloat132 * local9 + local18 * local15;
		this.aFloat130 = local24 * local9 - local15 * this.aFloat135;
		this.aFloat136 = this.aFloat136 * local9 + local15 * local21;
		this.aFloat137 = local38 * local9 - this.aFloat133 * local15;
		this.aFloat135 = this.aFloat135 * local9 + local15 * local24;
		this.aFloat133 = this.aFloat133 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat135 + (float) arg0 * this.aFloat132 + this.aFloat136 * (float) arg1);
		arg3[0] = (int) (this.aFloat138 * (float) arg0 + (float) arg1 * this.aFloat134 + this.aFloat139 * (float) arg2);
		arg3[1] = (int) (this.aFloat130 * (float) arg2 + (float) arg1 * this.aFloat131 + this.aFloat140 * (float) arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IFFIFZI)V")
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat138 = (float) arg5;
			this.aFloat135 = 1.0F;
			this.aFloat140 = this.aFloat132 = this.aFloat134 = this.aFloat136 = this.aFloat139 = this.aFloat130 = 0.0F;
			this.aFloat131 = (float) arg0;
		} else {
			@Pc(7) float local7 = Class246.aFloatArray69[arg3 & 0x3FFF];
			@Pc(13) float local13 = Class246.aFloatArray70[arg3 & 0x3FFF];
			this.aFloat140 = (float) arg5 * local13;
			this.aFloat131 = (float) arg0 * local7;
			this.aFloat138 = local7 * (float) arg5;
			this.aFloat134 = (float) arg0 * -local13;
			this.aFloat132 = this.aFloat136 = this.aFloat139 = this.aFloat130 = 0.0F;
			this.aFloat135 = 1.0F;
		}
		this.aFloat137 = arg1;
		this.aFloat133 = arg2;
		this.aFloat129 = arg4;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	@Override
	public void method6349() {
		this.aFloat140 = this.aFloat132 = this.aFloat134 = this.aFloat136 = this.aFloat139 = this.aFloat130 = this.aFloat129 = this.aFloat137 = this.aFloat133 = 0.0F;
		this.aFloat138 = this.aFloat131 = this.aFloat135 = 1.0F;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class246.aFloatArray69[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class246.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat138;
		@Pc(21) float local21 = this.aFloat134;
		@Pc(24) float local24 = this.aFloat139;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat138 = local18 * local9 + local15 * this.aFloat132;
		this.aFloat132 = local9 * this.aFloat132 - local15 * local18;
		this.aFloat134 = local9 * local21 + this.aFloat136 * local15;
		this.aFloat136 = local9 * this.aFloat136 - local21 * local15;
		this.aFloat139 = local9 * local24 + this.aFloat135 * local15;
		this.aFloat129 = local9 * local27 + this.aFloat133 * local15;
		this.aFloat135 = local9 * this.aFloat135 - local24 * local15;
		this.aFloat133 = this.aFloat133 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	@Override
	public void method6345(@OriginalArg(0) int arg0) {
		this.aFloat138 = 1.0F;
		this.aFloat131 = this.aFloat135 = Class246.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat136 = Class246.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat130 = -this.aFloat136;
		this.aFloat134 = this.aFloat139 = this.aFloat129 = this.aFloat140 = this.aFloat137 = this.aFloat132 = this.aFloat133 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	@Override
	public void method6357(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class246.aFloatArray69[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class246.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat138;
		@Pc(21) float local21 = this.aFloat134;
		@Pc(24) float local24 = this.aFloat139;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat138 = local9 * local18 - this.aFloat140 * local15;
		this.aFloat134 = local9 * local21 - local15 * this.aFloat131;
		this.aFloat140 = local18 * local15 + this.aFloat140 * local9;
		this.aFloat139 = local24 * local9 - this.aFloat130 * local15;
		this.aFloat131 = local15 * local21 + this.aFloat131 * local9;
		this.aFloat129 = local27 * local9 - this.aFloat137 * local15;
		this.aFloat130 = this.aFloat130 * local9 + local24 * local15;
		this.aFloat137 = local27 * local15 + this.aFloat137 * local9;
	}

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)[F")
	public float[] method6176() {
		Static682.aFloatArray103[0] = this.aFloat138;
		Static682.aFloatArray103[2] = this.aFloat132;
		Static682.aFloatArray103[13] = 0.0F;
		Static682.aFloatArray103[9] = this.aFloat130;
		Static682.aFloatArray103[12] = (float) 0;
		Static682.aFloatArray103[14] = 0.0F;
		Static682.aFloatArray103[5] = this.aFloat131;
		Static682.aFloatArray103[8] = this.aFloat139;
		Static682.aFloatArray103[4] = this.aFloat134;
		Static682.aFloatArray103[10] = this.aFloat135;
		Static682.aFloatArray103[1] = this.aFloat140;
		Static682.aFloatArray103[6] = this.aFloat136;
		return Static682.aFloatArray103;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat137 + this.aFloat130 * (float) arg2 + this.aFloat140 * (float) arg0 + this.aFloat131 * (float) arg1);
		arg3[2] = (int) (this.aFloat133 + (float) arg2 * this.aFloat135 + (float) arg0 * this.aFloat132 + (float) arg1 * this.aFloat136);
		arg3[0] = (int) ((float) arg1 * this.aFloat134 + this.aFloat138 * (float) arg0 + (float) arg2 * this.aFloat139 + this.aFloat129);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method6350() {
		@Pc(7) Class181_Sub2 local7 = new Class181_Sub2();
		local7.aFloat135 = this.aFloat135;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat130 = this.aFloat130;
		return local7;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([I)V")
	@Override
	public void method6347(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat129;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat137;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat133;
		arg0[2] = (int) (this.aFloat130 * local20 + local12 * this.aFloat139 + this.aFloat135 * local28);
		arg0[1] = (int) (this.aFloat136 * local28 + this.aFloat131 * local20 + this.aFloat134 * local12);
		arg0[0] = (int) (this.aFloat140 * local20 + local12 * this.aFloat138 + local28 * this.aFloat132);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([FIFFFF)V")
	public void method6177(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(64) float local64;
		@Pc(48) float local48;
		@Pc(56) float local56;
		@Pc(40) float local40;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local40 = -arg3 / arg4;
			local56 = this.aFloat133 + local40 * this.aFloat132;
			local64 = this.aFloat129 + this.aFloat138 * local40;
			local48 = local40 * this.aFloat140 + this.aFloat137;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local40 = -arg3 / arg2;
			local56 = this.aFloat136 * local40 + this.aFloat133;
			local48 = this.aFloat137 + local40 * this.aFloat131;
			local64 = this.aFloat134 * local40 + this.aFloat129;
		} else {
			local40 = -arg3 / arg1;
			local48 = this.aFloat130 * local40 + this.aFloat137;
			local56 = local40 * this.aFloat135 + this.aFloat133;
			local64 = this.aFloat129 + local40 * this.aFloat139;
		}
		arg0[2] = this.aFloat136 * arg2 + this.aFloat132 * arg4 + this.aFloat135 * arg1;
		arg0[1] = this.aFloat131 * arg2 + this.aFloat140 * arg4 + this.aFloat130 * arg1;
		arg0[0] = arg1 * this.aFloat139 + this.aFloat138 * arg4 + arg2 * this.aFloat134;
		arg0[3] = -(local64 * arg0[0] + local48 * arg0[1] + arg0[2] * local56);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class246.aFloatArray69[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class246.aFloatArray70[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class246.aFloatArray69[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class246.aFloatArray70[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class246.aFloatArray69[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class246.aFloatArray70[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat135 = local21 * local9;
		this.aFloat131 = local9 * local33;
		this.aFloat139 = local21 * local47 + -local27 * local33;
		this.aFloat140 = local39 * -local21 + local27 * local43;
		this.aFloat136 = -local15;
		this.aFloat138 = local47 * local27 + local21 * local33;
		this.aFloat132 = local9 * local27;
		this.aFloat130 = local43 * local21 + local39 * local27;
		this.aFloat134 = local9 * local39;
		this.aFloat133 = -((float) arg2 * this.aFloat135) + (float) -arg0 * this.aFloat132 - (float) arg1 * this.aFloat136;
		this.aFloat137 = -((float) arg1 * this.aFloat131) + this.aFloat140 * (float) -arg0 - this.aFloat130 * (float) arg2;
		this.aFloat129 = -((float) arg2 * this.aFloat139) - this.aFloat134 * (float) arg1 + this.aFloat138 * (float) -arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method6355(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		this.aFloat134 = local6.aFloat134;
		this.aFloat139 = local6.aFloat139;
		this.aFloat137 = local6.aFloat137;
		this.aFloat135 = local6.aFloat135;
		this.aFloat130 = local6.aFloat130;
		this.aFloat133 = local6.aFloat133;
		this.aFloat129 = local6.aFloat129;
		this.aFloat140 = local6.aFloat140;
		this.aFloat136 = local6.aFloat136;
		this.aFloat138 = local6.aFloat138;
		this.aFloat131 = local6.aFloat131;
		this.aFloat132 = local6.aFloat132;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	@Override
	public void method6351(@OriginalArg(0) int arg0) {
		this.aFloat135 = 1.0F;
		this.aFloat138 = this.aFloat131 = Class246.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat140 = Class246.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat134 = -this.aFloat140;
		this.aFloat139 = this.aFloat129 = this.aFloat130 = this.aFloat137 = this.aFloat132 = this.aFloat136 = this.aFloat133 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!iu;)V")
	public void method6179(@OriginalArg(1) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		this.aFloat134 = local6.aFloat140;
		this.aFloat139 = local6.aFloat132;
		this.aFloat138 = local6.aFloat138;
		this.aFloat130 = local6.aFloat136;
		this.aFloat140 = local6.aFloat134;
		this.aFloat132 = local6.aFloat139;
		this.aFloat131 = local6.aFloat131;
		this.aFloat135 = local6.aFloat135;
		this.aFloat136 = local6.aFloat130;
		this.aFloat129 = -(this.aFloat138 * local6.aFloat129 + local6.aFloat137 * this.aFloat134 + this.aFloat139 * local6.aFloat133);
		this.aFloat137 = -(this.aFloat131 * local6.aFloat137 + local6.aFloat129 * this.aFloat140 + local6.aFloat133 * this.aFloat130);
		this.aFloat133 = -(local6.aFloat133 * this.aFloat135 + local6.aFloat129 * this.aFloat132 + local6.aFloat137 * this.aFloat136);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	@Override
	public void method6356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat140 = this.aFloat132 = this.aFloat134 = this.aFloat136 = this.aFloat139 = this.aFloat130 = 0.0F;
		this.aFloat129 = (float) arg0;
		this.aFloat138 = this.aFloat131 = this.aFloat135 = 1.0F;
		this.aFloat133 = (float) arg2;
		this.aFloat137 = (float) arg1;
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)V")
	public void method6181() {
		this.aFloat137 = -this.aFloat137;
		this.aFloat132 = -this.aFloat132;
		this.aFloat135 = -this.aFloat135;
		this.aFloat130 = -this.aFloat130;
		this.aFloat140 = -this.aFloat140;
		this.aFloat136 = -this.aFloat136;
		this.aFloat133 = -this.aFloat133;
		this.aFloat131 = -this.aFloat131;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)[F")
	public float[] method6182() {
		Static682.aFloatArray103[10] = this.aFloat135;
		Static682.aFloatArray103[1] = this.aFloat140;
		Static682.aFloatArray103[4] = this.aFloat134;
		Static682.aFloatArray103[6] = this.aFloat136;
		Static682.aFloatArray103[12] = this.aFloat129;
		Static682.aFloatArray103[2] = this.aFloat132;
		Static682.aFloatArray103[8] = this.aFloat139;
		Static682.aFloatArray103[5] = this.aFloat131;
		Static682.aFloatArray103[0] = this.aFloat138;
		Static682.aFloatArray103[9] = this.aFloat130;
		Static682.aFloatArray103[13] = this.aFloat137;
		Static682.aFloatArray103[14] = this.aFloat133;
		return Static682.aFloatArray103;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	@Override
	public void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat137 += (float) arg1;
		this.aFloat133 += (float) arg2;
		this.aFloat129 += (float) arg0;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	@Override
	public void method6344(@OriginalArg(0) int arg0) {
		this.aFloat131 = 1.0F;
		this.aFloat138 = this.aFloat135 = Class246.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat139 = Class246.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat134 = this.aFloat129 = this.aFloat140 = this.aFloat130 = this.aFloat137 = this.aFloat136 = this.aFloat133 = 0.0F;
		this.aFloat132 = -this.aFloat139;
	}
}
