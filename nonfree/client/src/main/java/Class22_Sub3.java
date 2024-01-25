import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!qn", name = "U", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!qn", name = "W", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!qn", name = "X", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class22_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method5950(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(6) Class22_Sub3 local6 = (Class22_Sub3) arg0;
		@Pc(9) Class22_Sub3 local9 = (Class22_Sub3) arg1;
		this.aFloat140 = local9.aFloat133 * local6.aFloat141 + local6.aFloat136 * local9.aFloat139 + local9.aFloat140 * local6.aFloat140;
		this.aFloat139 = local9.aFloat140 * local6.aFloat139 + local6.aFloat135 * local9.aFloat139 + local6.aFloat137 * local9.aFloat133;
		this.aFloat133 = local6.aFloat143 * local9.aFloat133 + local6.aFloat144 * local9.aFloat139 + local9.aFloat140 * local6.aFloat133;
		this.aFloat136 = local6.aFloat141 * local9.aFloat144 + local6.aFloat140 * local9.aFloat136 + local9.aFloat135 * local6.aFloat136;
		this.aFloat135 = local6.aFloat139 * local9.aFloat136 + local6.aFloat135 * local9.aFloat135 + local6.aFloat137 * local9.aFloat144;
		this.aFloat144 = local6.aFloat144 * local9.aFloat135 + local6.aFloat133 * local9.aFloat136 + local6.aFloat143 * local9.aFloat144;
		this.aFloat141 = local6.aFloat136 * local9.aFloat137 + local9.aFloat141 * local6.aFloat140 + local6.aFloat141 * local9.aFloat143;
		this.aFloat137 = local9.aFloat143 * local6.aFloat137 + local6.aFloat135 * local9.aFloat137 + local6.aFloat139 * local9.aFloat141;
		this.aFloat138 = local6.aFloat138 + local6.aFloat141 * local9.aFloat142 + local6.aFloat136 * local9.aFloat134 + local6.aFloat140 * local9.aFloat138;
		this.aFloat143 = local9.aFloat143 * local6.aFloat143 + local9.aFloat141 * local6.aFloat133 + local6.aFloat144 * local9.aFloat137;
		this.aFloat134 = local9.aFloat134 * local6.aFloat135 + local6.aFloat139 * local9.aFloat138 + local9.aFloat142 * local6.aFloat137 + local6.aFloat134;
		this.aFloat142 = local6.aFloat144 * local9.aFloat134 + local9.aFloat138 * local6.aFloat133 + local9.aFloat142 * local6.aFloat143 + local6.aFloat142;
	}

	@OriginalMember(owner = "client!qn", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat140 = 1.0F;
		this.aFloat135 = this.aFloat143 = Class83.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat144 = Class83.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat137 = -this.aFloat144;
		this.aFloat136 = this.aFloat141 = this.aFloat138 = this.aFloat139 = this.aFloat134 = this.aFloat133 = this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FFFI)V")
	public void method5951(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat134 += arg0;
		this.aFloat138 += arg2;
		this.aFloat142 += arg1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!m;)V")
	public void method5952(@OriginalArg(1) Class22 arg0) {
		@Pc(6) Class22_Sub3 local6 = (Class22_Sub3) arg0;
		this.aFloat138 = 0.0F;
		this.aFloat143 = local6.aFloat143;
		this.aFloat141 = local6.aFloat141;
		this.aFloat136 = local6.aFloat136;
		this.aFloat134 = 0.0F;
		this.aFloat142 = 0.0F;
		this.aFloat144 = local6.aFloat144;
		this.aFloat139 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat137 = local6.aFloat137;
		this.aFloat135 = local6.aFloat135;
		this.aFloat133 = local6.aFloat133;
	}

	@OriginalMember(owner = "client!qn", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class83.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class83.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat140;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat141;
		this.aFloat140 = local18 * local9 + local15 * this.aFloat133;
		@Pc(37) float local37 = this.aFloat138;
		this.aFloat136 = local15 * this.aFloat144 + local9 * local21;
		this.aFloat133 = local9 * this.aFloat133 - local15 * local18;
		this.aFloat141 = local15 * this.aFloat143 + local24 * local9;
		this.aFloat144 = local9 * this.aFloat144 - local15 * local21;
		this.aFloat138 = local15 * this.aFloat142 + local37 * local9;
		this.aFloat143 = this.aFloat143 * local9 - local24 * local15;
		this.aFloat142 = local9 * this.aFloat142 - local15 * local37;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([FI)[F")
	public float[] method5953(@OriginalArg(0) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat136;
		arg0[2] = this.aFloat133;
		arg0[12] = this.aFloat138;
		arg0[1] = this.aFloat139;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat140;
		arg0[9] = this.aFloat137;
		arg0[10] = this.aFloat143;
		arg0[8] = this.aFloat141;
		arg0[14] = this.aFloat142;
		arg0[11] = 0.0F;
		arg0[13] = this.aFloat134;
		arg0[6] = this.aFloat144;
		arg0[5] = this.aFloat135;
		arg0[3] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat137 * (float) arg2 + (float) arg0 * this.aFloat139 + this.aFloat135 * (float) arg1 + this.aFloat134);
		arg3[2] = (int) (this.aFloat142 + this.aFloat143 * (float) arg2 + (float) arg1 * this.aFloat144 + (float) arg0 * this.aFloat133);
		arg3[0] = (int) (this.aFloat136 * (float) arg1 + (float) arg0 * this.aFloat140 + (float) arg2 * this.aFloat141 + this.aFloat138);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IFFF)V")
	public void method5954(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat142 = arg1;
		this.aFloat140 = this.aFloat135 = this.aFloat143 = 1.0F;
		this.aFloat134 = arg0;
		this.aFloat139 = this.aFloat133 = this.aFloat136 = this.aFloat144 = this.aFloat141 = this.aFloat137 = 0.0F;
		this.aFloat138 = arg2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!m;)V")
	public void method5955(@OriginalArg(1) Class22 arg0) {
		@Pc(6) Class22_Sub3 local6 = (Class22_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat140;
		@Pc(12) float local12 = this.aFloat139;
		@Pc(15) float local15 = this.aFloat136;
		@Pc(18) float local18 = this.aFloat135;
		@Pc(21) float local21 = this.aFloat141;
		@Pc(24) float local24 = this.aFloat137;
		@Pc(27) float local27 = this.aFloat138;
		this.aFloat140 = local6.aFloat140 * local9 + local12 * local6.aFloat136 + local6.aFloat141 * this.aFloat133;
		@Pc(47) float local47 = this.aFloat134;
		this.aFloat139 = local9 * local6.aFloat139 + local6.aFloat135 * local12 + local6.aFloat137 * this.aFloat133;
		this.aFloat133 = this.aFloat133 * local6.aFloat143 + local12 * local6.aFloat144 + local9 * local6.aFloat133;
		this.aFloat135 = local6.aFloat139 * local15 + local6.aFloat135 * local18 + this.aFloat144 * local6.aFloat137;
		this.aFloat136 = local6.aFloat141 * this.aFloat144 + local15 * local6.aFloat140 + local18 * local6.aFloat136;
		this.aFloat137 = local6.aFloat139 * local21 + local24 * local6.aFloat135 + this.aFloat143 * local6.aFloat137;
		this.aFloat141 = local6.aFloat141 * this.aFloat143 + local6.aFloat140 * local21 + local6.aFloat136 * local24;
		this.aFloat144 = this.aFloat144 * local6.aFloat143 + local15 * local6.aFloat133 + local6.aFloat144 * local18;
		this.aFloat143 = local6.aFloat133 * local21 + local6.aFloat144 * local24 + this.aFloat143 * local6.aFloat143;
		this.aFloat138 = local6.aFloat138 + local6.aFloat136 * local47 + local6.aFloat140 * local27 + local6.aFloat141 * this.aFloat142;
		this.aFloat134 = local6.aFloat134 + local27 * local6.aFloat139 + local6.aFloat135 * local47 + local6.aFloat137 * this.aFloat142;
		this.aFloat142 = local6.aFloat143 * this.aFloat142 + local6.aFloat144 * local47 + local6.aFloat133 * local27 + local6.aFloat142;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIFIFFI)V")
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat135 = arg5 * 2;
			this.aFloat143 = 1.0F;
			this.aFloat140 = arg0 * 2;
			this.aFloat139 = this.aFloat133 = this.aFloat136 = this.aFloat144 = this.aFloat141 = this.aFloat137 = 0.0F;
		} else {
			@Pc(10) float local10 = Class83.aFloatArray30[arg2 & 0x3FFF];
			@Pc(16) float local16 = Class83.aFloatArray29[arg2 & 0x3FFF];
			this.aFloat135 = (float) arg5 * 2.0F * local10;
			this.aFloat143 = 1.0F;
			this.aFloat139 = (float) arg0 * local16 * 2.0F;
			this.aFloat136 = -2.0F * local16 * (float) arg5;
			this.aFloat133 = this.aFloat144 = this.aFloat141 = this.aFloat137 = 0.0F;
			this.aFloat140 = local10 * 2.0F * (float) arg0;
		}
		this.aFloat134 = (float) -arg5 + arg4;
		this.aFloat142 = arg1;
		this.aFloat138 = arg3 - (float) arg0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IFFF)F")
	public float method5957(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat135 * arg2 + arg0 * this.aFloat139 + this.aFloat137 * arg1 + this.aFloat134;
	}

	@OriginalMember(owner = "client!qn", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class22 arg0) {
		@Pc(6) Class22_Sub3 local6 = (Class22_Sub3) arg0;
		this.aFloat133 = local6.aFloat133;
		this.aFloat136 = local6.aFloat136;
		this.aFloat134 = local6.aFloat134;
		this.aFloat142 = local6.aFloat142;
		this.aFloat138 = local6.aFloat138;
		this.aFloat144 = local6.aFloat144;
		this.aFloat137 = local6.aFloat137;
		this.aFloat141 = local6.aFloat141;
		this.aFloat140 = local6.aFloat140;
		this.aFloat143 = local6.aFloat143;
		this.aFloat139 = local6.aFloat139;
		this.aFloat135 = local6.aFloat135;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FIFF)V")
	public void method5958(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat133 *= arg2;
		this.aFloat139 *= arg1;
		this.aFloat140 *= arg0;
		this.aFloat142 *= arg2;
		this.aFloat134 *= arg1;
		this.aFloat141 *= arg0;
		this.aFloat136 *= arg0;
		this.aFloat135 *= arg1;
		this.aFloat144 *= arg2;
		this.aFloat137 *= arg1;
		this.aFloat143 *= arg2;
		this.aFloat138 *= arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FFBF)F")
	public float method5959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat142 + arg1 * this.aFloat143 + arg2 * this.aFloat144 + this.aFloat133 * arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([FZ)[F")
	public float[] method5960(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat137;
		arg0[3] = this.aFloat138;
		arg0[1] = this.aFloat136;
		arg0[0] = this.aFloat140;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat135;
		arg0[10] = this.aFloat143;
		arg0[8] = this.aFloat133;
		arg0[2] = this.aFloat141;
		arg0[14] = 0.0F;
		arg0[11] = this.aFloat142;
		arg0[12] = 0.0F;
		arg0[9] = this.aFloat144;
		arg0[7] = this.aFloat134;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat139;
		return arg0;
	}

	@OriginalMember(owner = "client!qn", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat139 = this.aFloat133 = this.aFloat136 = this.aFloat144 = this.aFloat141 = this.aFloat137 = 0.0F;
		this.aFloat140 = this.aFloat135 = this.aFloat143 = 1.0F;
		this.aFloat138 = arg0;
		this.aFloat134 = arg1;
		this.aFloat142 = arg2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public void method5961() {
		this.aFloat143 = -this.aFloat143;
		this.aFloat144 = -this.aFloat144;
		this.aFloat133 = -this.aFloat133;
		this.aFloat134 = -this.aFloat134;
		this.aFloat135 = -this.aFloat135;
		this.aFloat137 = -this.aFloat137;
		this.aFloat142 = -this.aFloat142;
		this.aFloat139 = -this.aFloat139;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class22 method5945() {
		@Pc(7) Class22_Sub3 local7 = new Class22_Sub3();
		local7.aFloat142 = this.aFloat142;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat138 = this.aFloat138;
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(FFFI)F")
	public float method5962(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat141 * arg1 + this.aFloat136 * arg0 + arg2 * this.aFloat140 + this.aFloat138;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[F)[F")
	public float[] method5963(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat135;
		arg0[1] = this.aFloat136;
		arg0[0] = this.aFloat140;
		arg0[4] = this.aFloat139;
		arg0[2] = this.aFloat141;
		arg0[3] = this.aFloat138;
		arg0[7] = this.aFloat134;
		arg0[6] = this.aFloat137;
		return arg0;
	}

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat143 + (float) arg0 * this.aFloat133 + (float) arg1 * this.aFloat144);
		arg3[1] = (int) ((float) arg2 * this.aFloat137 + (float) arg1 * this.aFloat135 + (float) arg0 * this.aFloat139);
		arg3[0] = (int) (this.aFloat141 * (float) arg2 + this.aFloat140 * (float) arg0 + this.aFloat136 * (float) arg1);
	}

	@OriginalMember(owner = "client!qn", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat134 += arg1;
		this.aFloat142 += arg2;
		this.aFloat138 += arg0;
	}

	@OriginalMember(owner = "client!qn", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat143 = 1.0F;
		this.aFloat140 = this.aFloat135 = Class83.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat139 = Class83.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat141 = this.aFloat138 = this.aFloat137 = this.aFloat134 = this.aFloat133 = this.aFloat144 = this.aFloat142 = 0.0F;
		this.aFloat136 = -this.aFloat139;
	}

	@OriginalMember(owner = "client!qn", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat139 = this.aFloat133 = this.aFloat136 = this.aFloat144 = this.aFloat141 = this.aFloat137 = this.aFloat138 = this.aFloat134 = this.aFloat142 = 0.0F;
		this.aFloat140 = this.aFloat135 = this.aFloat143 = 1.0F;
	}

	@OriginalMember(owner = "client!qn", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat135 = 1.0F;
		this.aFloat140 = this.aFloat143 = Class83.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat141 = Class83.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat133 = -this.aFloat141;
		this.aFloat136 = this.aFloat138 = this.aFloat139 = this.aFloat137 = this.aFloat134 = this.aFloat144 = this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([FIFFFF)V")
	public void method5964(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(2) float local2 = -arg2;
		@Pc(10) float local10 = arg1 * local2;
		@Pc(14) float local14 = arg3 * local2;
		@Pc(18) float local18 = local2 * arg4;
		@Pc(36) float local36 = local18 * this.aFloat141 + this.aFloat140 * local10 + local14 * this.aFloat136 + this.aFloat138;
		@Pc(54) float local54 = this.aFloat134 + local18 * this.aFloat137 + local14 * this.aFloat135 + this.aFloat139 * local10;
		arg0[0] = this.aFloat141 * arg4 + arg1 * this.aFloat140 + arg3 * this.aFloat136;
		arg0[1] = arg4 * this.aFloat137 + arg3 * this.aFloat135 + arg1 * this.aFloat139;
		arg0[2] = this.aFloat143 * arg4 + this.aFloat133 * arg1 + arg3 * this.aFloat144;
		@Pc(133) float local133 = this.aFloat142 + local18 * this.aFloat143 + local14 * this.aFloat144 + this.aFloat133 * local10;
		arg0[3] = -(local54 * arg0[1] + local36 * arg0[0] + arg0[2] * local133);
	}

	@OriginalMember(owner = "client!qn", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat138;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat134;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat142;
		arg0[2] = (int) (this.aFloat141 * local12 + local21 * this.aFloat137 + this.aFloat143 * local29);
		arg0[1] = (int) (this.aFloat135 * local21 + local12 * this.aFloat136 + this.aFloat144 * local29);
		arg0[0] = (int) (this.aFloat140 * local12 + this.aFloat139 * local21 + local29 * this.aFloat133);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(ILclient!m;)V")
	public void method5965(@OriginalArg(1) Class22 arg0) {
		@Pc(6) Class22_Sub3 local6 = (Class22_Sub3) arg0;
		this.aFloat136 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat141 = local6.aFloat133;
		this.aFloat133 = local6.aFloat141;
		this.aFloat139 = local6.aFloat136;
		this.aFloat137 = local6.aFloat144;
		this.aFloat135 = local6.aFloat135;
		this.aFloat138 = -(this.aFloat136 * local6.aFloat134 + this.aFloat140 * local6.aFloat138 + local6.aFloat142 * this.aFloat141);
		this.aFloat144 = local6.aFloat137;
		this.aFloat143 = local6.aFloat143;
		this.aFloat134 = -(this.aFloat137 * local6.aFloat142 + local6.aFloat134 * this.aFloat135 + local6.aFloat138 * this.aFloat139);
		this.aFloat142 = -(this.aFloat143 * local6.aFloat142 + this.aFloat144 * local6.aFloat134 + local6.aFloat138 * this.aFloat133);
	}

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class83.aFloatArray30[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class83.aFloatArray29[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class83.aFloatArray30[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class83.aFloatArray29[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class83.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class83.aFloatArray29[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat135 = local33 * local9;
		this.aFloat143 = local9 * local21;
		this.aFloat140 = local27 * local47 + local21 * local33;
		this.aFloat137 = local39 * local27 + local43 * local21;
		this.aFloat144 = -local15;
		this.aFloat133 = local27 * local9;
		this.aFloat141 = -local27 * local33 + local47 * local21;
		this.aFloat136 = local39 * local9;
		this.aFloat139 = -local21 * local39 + local27 * local43;
		this.aFloat134 = -((float) arg2 * this.aFloat137) + (float) -arg0 * this.aFloat139 - this.aFloat135 * (float) arg1;
		this.aFloat142 = -(this.aFloat143 * (float) arg2) - this.aFloat144 * (float) arg1 + (float) -arg0 * this.aFloat133;
		this.aFloat138 = -(this.aFloat141 * (float) arg2) - (float) arg1 * this.aFloat136 + (float) -arg0 * this.aFloat140;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FFFB)V")
	public void method5966(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat140 = arg1;
		this.aFloat139 = 0.0F;
		this.aFloat134 = 0.0F;
		this.aFloat143 = arg0;
		this.aFloat137 = 0.0F;
		this.aFloat135 = arg2;
		this.aFloat133 = 0.0F;
		this.aFloat136 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat142 = 0.0F;
		this.aFloat141 = 0.0F;
		this.aFloat138 = 0.0F;
	}

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class83.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class83.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat139;
		@Pc(21) float local21 = this.aFloat135;
		@Pc(24) float local24 = this.aFloat137;
		this.aFloat139 = local9 * local18 - this.aFloat133 * local15;
		@Pc(37) float local37 = this.aFloat134;
		this.aFloat133 = local18 * local15 + local9 * this.aFloat133;
		this.aFloat135 = local9 * local21 - this.aFloat144 * local15;
		this.aFloat144 = local9 * this.aFloat144 + local21 * local15;
		this.aFloat137 = local24 * local9 - this.aFloat143 * local15;
		this.aFloat143 = local24 * local15 + local9 * this.aFloat143;
		this.aFloat134 = local9 * local37 - this.aFloat142 * local15;
		this.aFloat142 = local9 * this.aFloat142 + local37 * local15;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FFFFFBFFFF)V")
	public void method5967(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat137 = arg4;
		this.aFloat144 = arg3;
		this.aFloat134 = 0.0F;
		this.aFloat142 = 0.0F;
		this.aFloat138 = 0.0F;
		this.aFloat143 = arg8;
		this.aFloat136 = arg5;
		this.aFloat140 = arg2;
		this.aFloat141 = arg7;
		this.aFloat133 = arg0;
		this.aFloat135 = arg6;
		this.aFloat139 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FF[FFB)V")
	public void method5968(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3) {
		arg2[0] = (float) (this.aFloat141 * arg1 + arg0 * this.aFloat136 + this.aFloat140 * arg3);
		arg2[2] = (float) (arg0 * this.aFloat144 + this.aFloat133 * arg3 + arg1 * this.aFloat143);
		arg2[1] = (float) (this.aFloat135 * arg0 + this.aFloat139 * arg3 + this.aFloat137 * arg1);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I[F)[F")
	public float[] method5969(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat139;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = 0.0F;
		arg0[10] = this.aFloat142;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat136;
		arg0[11] = 0.0F;
		arg0[2] = 0.0F;
		arg0[5] = this.aFloat135;
		arg0[15] = 1.0F;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat140;
		arg0[9] = this.aFloat134;
		arg0[8] = this.aFloat138;
		return arg0;
	}
}
