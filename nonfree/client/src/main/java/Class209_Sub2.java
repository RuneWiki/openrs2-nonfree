import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class209_Sub2 extends Class209 {

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class209_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!mh", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat146;
		@Pc(21) float local21 = this.aFloat145;
		@Pc(24) float local24 = this.aFloat148;
		this.aFloat146 = local18 * local9 - this.aFloat147 * local15;
		@Pc(38) float local38 = this.aFloat138;
		this.aFloat145 = local9 * local21 - this.aFloat149 * local15;
		this.aFloat147 = local15 * local18 + this.aFloat147 * local9;
		this.aFloat148 = local24 * local9 - local15 * this.aFloat144;
		this.aFloat149 = this.aFloat149 * local9 + local15 * local21;
		this.aFloat144 = local24 * local15 + local9 * this.aFloat144;
		this.aFloat138 = local9 * local38 - local15 * this.aFloat141;
		this.aFloat141 = local38 * local15 + local9 * this.aFloat141;
	}

	@OriginalMember(owner = "client!mh", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat138;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat141;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat142;
		arg0[1] = (int) (local27 * this.aFloat139 + local19 * this.aFloat149 + local11 * this.aFloat145);
		arg0[0] = (int) (this.aFloat147 * local19 + this.aFloat146 * local11 + this.aFloat140 * local27);
		arg0[2] = (int) (this.aFloat143 * local27 + this.aFloat144 * local19 + this.aFloat148 * local11);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFFZ)F")
	public float method4911(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat141 + arg2 * this.aFloat144 + arg0 * this.aFloat147 + this.aFloat149 * arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLclient!q;)V")
	public void method4913(@OriginalArg(1) Class209 arg0) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg0;
		this.aFloat147 = local6.aFloat147;
		this.aFloat138 = 0.0F;
		this.aFloat149 = local6.aFloat149;
		this.aFloat148 = local6.aFloat148;
		this.aFloat143 = local6.aFloat143;
		this.aFloat141 = 0.0F;
		this.aFloat146 = local6.aFloat146;
		this.aFloat145 = local6.aFloat145;
		this.aFloat139 = local6.aFloat139;
		this.aFloat142 = 0.0F;
		this.aFloat140 = local6.aFloat140;
		this.aFloat144 = local6.aFloat144;
	}

	@OriginalMember(owner = "client!mh", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class223.aFloatArray45[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class223.aFloatArray46[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class223.aFloatArray45[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class223.aFloatArray46[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat147 = local39 * -local21 + local27 * local43;
		this.aFloat149 = local9 * local33;
		this.aFloat144 = local27 * local39 + local43 * local21;
		this.aFloat143 = local21 * local9;
		this.aFloat146 = local47 * local27 + local33 * local21;
		this.aFloat140 = local27 * local9;
		this.aFloat145 = local9 * local39;
		this.aFloat139 = -local15;
		this.aFloat148 = local21 * local47 + local33 * -local27;
		this.aFloat138 = -(this.aFloat148 * (float) arg2) + (float) -arg0 * this.aFloat146 - this.aFloat145 * (float) arg1;
		this.aFloat142 = -(this.aFloat143 * (float) arg2) - (float) arg1 * this.aFloat139 + this.aFloat140 * (float) -arg0;
		this.aFloat141 = -(this.aFloat144 * (float) arg2) - this.aFloat149 * (float) arg1 + this.aFloat147 * (float) -arg0;
	}

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat143 = 1.0F;
		this.aFloat146 = this.aFloat149 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat147 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat145 = -this.aFloat147;
		this.aFloat148 = this.aFloat138 = this.aFloat144 = this.aFloat141 = this.aFloat140 = this.aFloat139 = this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public void method4914() {
		this.aFloat140 = -this.aFloat140;
		this.aFloat144 = -this.aFloat144;
		this.aFloat143 = -this.aFloat143;
		this.aFloat147 = -this.aFloat147;
		this.aFloat139 = -this.aFloat139;
		this.aFloat142 = -this.aFloat142;
		this.aFloat149 = -this.aFloat149;
		this.aFloat141 = -this.aFloat141;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([FI)[F")
	public float[] method4915(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat144;
		arg0[4] = this.aFloat147;
		arg0[8] = this.aFloat140;
		arg0[9] = this.aFloat139;
		arg0[5] = this.aFloat149;
		arg0[1] = this.aFloat145;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat143;
		arg0[2] = this.aFloat148;
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat146;
		arg0[12] = 0.0F;
		arg0[15] = 0.0F;
		arg0[11] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method4916(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg0;
		@Pc(9) Class209_Sub2 local9 = (Class209_Sub2) arg1;
		this.aFloat146 = local9.aFloat140 * local6.aFloat148 + local6.aFloat145 * local9.aFloat147 + local6.aFloat146 * local9.aFloat146;
		this.aFloat147 = local9.aFloat140 * local6.aFloat144 + local9.aFloat146 * local6.aFloat147 + local6.aFloat149 * local9.aFloat147;
		this.aFloat145 = local6.aFloat148 * local9.aFloat139 + local6.aFloat146 * local9.aFloat145 + local9.aFloat149 * local6.aFloat145;
		this.aFloat140 = local6.aFloat143 * local9.aFloat140 + local9.aFloat147 * local6.aFloat139 + local9.aFloat146 * local6.aFloat140;
		this.aFloat149 = local6.aFloat147 * local9.aFloat145 + local9.aFloat149 * local6.aFloat149 + local6.aFloat144 * local9.aFloat139;
		this.aFloat139 = local9.aFloat139 * local6.aFloat143 + local6.aFloat140 * local9.aFloat145 + local6.aFloat139 * local9.aFloat149;
		this.aFloat148 = local9.aFloat148 * local6.aFloat146 + local9.aFloat144 * local6.aFloat145 + local9.aFloat143 * local6.aFloat148;
		this.aFloat144 = local9.aFloat144 * local6.aFloat149 + local6.aFloat147 * local9.aFloat148 + local6.aFloat144 * local9.aFloat143;
		this.aFloat143 = local9.aFloat148 * local6.aFloat140 + local9.aFloat144 * local6.aFloat139 + local9.aFloat143 * local6.aFloat143;
		this.aFloat138 = local6.aFloat138 + local6.aFloat148 * local9.aFloat142 + local9.aFloat138 * local6.aFloat146 + local6.aFloat145 * local9.aFloat141;
		this.aFloat141 = local6.aFloat141 + local6.aFloat144 * local9.aFloat142 + local6.aFloat147 * local9.aFloat138 + local6.aFloat149 * local9.aFloat141;
		this.aFloat142 = local9.aFloat141 * local6.aFloat139 + local9.aFloat138 * local6.aFloat140 + local6.aFloat143 * local9.aFloat142 + local6.aFloat142;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[F)[F")
	public float[] method4917(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat147;
		arg0[14] = 0.0F;
		arg0[3] = this.aFloat138;
		arg0[12] = 0.0F;
		arg0[7] = this.aFloat141;
		arg0[0] = this.aFloat146;
		arg0[13] = 0.0F;
		arg0[11] = this.aFloat142;
		arg0[5] = this.aFloat149;
		arg0[2] = this.aFloat148;
		arg0[9] = this.aFloat139;
		arg0[8] = this.aFloat140;
		arg0[10] = this.aFloat143;
		arg0[1] = this.aFloat145;
		arg0[15] = 1.0F;
		arg0[6] = this.aFloat144;
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!q;I)V")
	public void method4918(@OriginalArg(0) Class209 arg0) {
		@Pc(11) Class209_Sub2 local11 = (Class209_Sub2) arg0;
		this.aFloat145 = local11.aFloat147;
		this.aFloat148 = local11.aFloat140;
		this.aFloat146 = local11.aFloat146;
		this.aFloat147 = local11.aFloat145;
		this.aFloat140 = local11.aFloat148;
		this.aFloat149 = local11.aFloat149;
		this.aFloat144 = local11.aFloat139;
		this.aFloat138 = -(this.aFloat145 * local11.aFloat141 + local11.aFloat138 * this.aFloat146 + this.aFloat148 * local11.aFloat142);
		this.aFloat139 = local11.aFloat144;
		this.aFloat143 = local11.aFloat143;
		this.aFloat141 = -(this.aFloat144 * local11.aFloat142 + this.aFloat149 * local11.aFloat141 + this.aFloat147 * local11.aFloat138);
		this.aFloat142 = -(local11.aFloat142 * this.aFloat143 + local11.aFloat138 * this.aFloat140 + local11.aFloat141 * this.aFloat139);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([FB)[F")
	public float[] method4919(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat149;
		arg0[6] = this.aFloat144;
		arg0[1] = this.aFloat145;
		arg0[7] = this.aFloat141;
		arg0[2] = this.aFloat148;
		arg0[3] = this.aFloat138;
		arg0[4] = this.aFloat147;
		arg0[0] = this.aFloat146;
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat142 += arg2;
		this.aFloat141 += arg1;
		this.aFloat138 += arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FIFF)F")
	public float method4920(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat138 + arg1 * this.aFloat148 + this.aFloat145 * arg0 + arg2 * this.aFloat146;
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat147;
		@Pc(21) float local21 = this.aFloat149;
		@Pc(24) float local24 = this.aFloat144;
		this.aFloat147 = local18 * local9 - local15 * this.aFloat140;
		@Pc(37) float local37 = this.aFloat141;
		this.aFloat140 = local18 * local15 + local9 * this.aFloat140;
		this.aFloat149 = local9 * local21 - this.aFloat139 * local15;
		this.aFloat139 = local21 * local15 + local9 * this.aFloat139;
		this.aFloat144 = local24 * local9 - this.aFloat143 * local15;
		this.aFloat143 = this.aFloat143 * local9 + local24 * local15;
		this.aFloat141 = local37 * local9 - local15 * this.aFloat142;
		this.aFloat142 = local37 * local15 + this.aFloat142 * local9;
	}

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat149 = 1.0F;
		this.aFloat146 = this.aFloat143 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat148 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat140 = -this.aFloat148;
		this.aFloat145 = this.aFloat138 = this.aFloat147 = this.aFloat144 = this.aFloat141 = this.aFloat139 = this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(FIFF)F")
	public float method4921(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat139 + arg1 * this.aFloat140 + arg0 * this.aFloat143 + this.aFloat142;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([FI)[F")
	public float[] method4922(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat141;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat147;
		arg0[0] = this.aFloat146;
		arg0[12] = 0.0F;
		arg0[15] = 1;
		arg0[6] = 0.0F;
		arg0[5] = this.aFloat149;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[4] = this.aFloat145;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[2] = 0.0F;
		arg0[10] = this.aFloat142;
		arg0[8] = this.aFloat138;
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IFFFF[F)V")
	public void method4923(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg2 * this.aFloat147 + arg0 * this.aFloat149 + arg1 * this.aFloat144;
		@Pc(59) float local59;
		@Pc(51) float local51;
		@Pc(43) float local43;
		@Pc(35) float local35;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local35 = -arg3 / arg2;
			local43 = this.aFloat142 + this.aFloat140 * local35;
			local51 = this.aFloat141 + this.aFloat147 * local35;
			local59 = local35 * this.aFloat146 + this.aFloat138;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local35 = -arg3 / arg0;
			local43 = local35 * this.aFloat139 + this.aFloat142;
			local59 = this.aFloat138 + local35 * this.aFloat145;
			local51 = this.aFloat149 * local35 + this.aFloat141;
		} else {
			local35 = -arg3 / arg1;
			local43 = this.aFloat142 + this.aFloat143 * local35;
			local51 = this.aFloat141 + this.aFloat144 * local35;
			local59 = local35 * this.aFloat148 + this.aFloat138;
		}
		arg4[0] = arg1 * this.aFloat148 + this.aFloat146 * arg2 + arg0 * this.aFloat145;
		arg4[2] = this.aFloat139 * arg0 + this.aFloat140 * arg2 + arg1 * this.aFloat143;
		arg4[3] = -(arg4[2] * local43 + arg4[0] * local59 + arg4[1] * local51);
	}

	@OriginalMember(owner = "client!mh", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat146;
		@Pc(21) float local21 = this.aFloat145;
		@Pc(24) float local24 = this.aFloat148;
		this.aFloat146 = local15 * this.aFloat140 + local9 * local18;
		@Pc(37) float local37 = this.aFloat138;
		this.aFloat140 = this.aFloat140 * local9 - local18 * local15;
		this.aFloat145 = local9 * local21 + this.aFloat139 * local15;
		this.aFloat139 = this.aFloat139 * local9 - local21 * local15;
		this.aFloat148 = this.aFloat143 * local15 + local9 * local24;
		this.aFloat143 = this.aFloat143 * local9 - local15 * local24;
		this.aFloat138 = this.aFloat142 * local15 + local37 * local9;
		this.aFloat142 = this.aFloat142 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBFFF)V")
	public void method4924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat138 = arg4 - (float) arg1;
			this.aFloat149 = arg2 * 2;
			this.aFloat146 = arg1 * 2;
			this.aFloat147 = this.aFloat140 = this.aFloat145 = this.aFloat139 = this.aFloat148 = this.aFloat144 = 0.0F;
			this.aFloat143 = 1.0F;
			this.aFloat141 = arg5 - (float) arg2;
			this.aFloat142 = arg3;
			return;
		}
		@Pc(60) float local60 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(66) float local66 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat145 = (float) arg2 * -2.0F * local66;
		this.aFloat146 = (float) arg1 * 2.0F * local60;
		this.aFloat147 = local66 * 2.0F * (float) arg1;
		this.aFloat143 = 1.0F;
		this.aFloat149 = (float) arg2 * 2.0F * local60;
		this.aFloat140 = this.aFloat139 = this.aFloat148 = this.aFloat144 = 0.0F;
		this.aFloat138 = (local66 * 0.5F - local60 * 0.5F) * (float) (arg1 * 2) + arg4;
		this.aFloat142 = arg3;
		this.aFloat141 = (float) (arg2 * 2) * (-0.5F * local66 - local60 * 0.5F) + arg5;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFIF)V")
	public void method4925(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat139 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat148 = 0.0F;
		this.aFloat138 = 0.0F;
		this.aFloat141 = 0.0F;
		this.aFloat145 = 0.0F;
		this.aFloat146 = arg0;
		this.aFloat140 = 0.0F;
		this.aFloat143 = arg2;
		this.aFloat147 = 0.0F;
		this.aFloat142 = 0.0F;
		this.aFloat149 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFFI)V")
	public void method4926(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat142 = arg2;
		this.aFloat138 = arg1;
		this.aFloat141 = arg0;
		this.aFloat146 = this.aFloat149 = this.aFloat143 = 1.0F;
		this.aFloat147 = this.aFloat140 = this.aFloat145 = this.aFloat139 = this.aFloat148 = this.aFloat144 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat140 + this.aFloat139 * (float) arg1 + this.aFloat143 * (float) arg2 + this.aFloat142);
		arg3[0] = (int) (this.aFloat138 + this.aFloat148 * (float) arg2 + (float) arg0 * this.aFloat146 + this.aFloat145 * (float) arg1);
		arg3[1] = (int) ((float) arg1 * this.aFloat149 + (float) arg0 * this.aFloat147 + this.aFloat144 * (float) arg2 + this.aFloat141);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I[F)[F")
	public float[] method4927(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat146;
		arg0[15] = 1.0F;
		arg0[3] = 0.0F;
		arg0[2] = this.aFloat140;
		arg0[6] = this.aFloat139;
		arg0[10] = this.aFloat143;
		arg0[4] = this.aFloat145;
		arg0[1] = this.aFloat147;
		arg0[14] = this.aFloat142;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat148;
		arg0[9] = this.aFloat144;
		arg0[12] = this.aFloat138;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat149;
		arg0[13] = this.aFloat141;
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IFFF)V")
	public void method4928(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat149 *= arg2;
		this.aFloat146 *= arg0;
		this.aFloat142 *= arg1;
		this.aFloat144 *= arg2;
		this.aFloat143 *= arg1;
		this.aFloat139 *= arg1;
		this.aFloat145 *= arg0;
		this.aFloat141 *= arg2;
		this.aFloat138 *= arg0;
		this.aFloat147 *= arg2;
		this.aFloat140 *= arg1;
		this.aFloat148 *= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(F[FBFF)V")
	public void method4929(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg1[2] = arg2 * this.aFloat143 + arg0 * this.aFloat139 + arg3 * this.aFloat140;
		arg1[1] = this.aFloat149 * arg0 + arg3 * this.aFloat147 + arg2 * this.aFloat144;
		arg1[0] = this.aFloat148 * arg2 + this.aFloat146 * arg3 + this.aFloat145 * arg0;
	}

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat146 = this.aFloat149 = this.aFloat143 = 1.0F;
		this.aFloat147 = this.aFloat140 = this.aFloat145 = this.aFloat139 = this.aFloat148 = this.aFloat144 = this.aFloat138 = this.aFloat141 = this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!mh", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat147 = this.aFloat140 = this.aFloat145 = this.aFloat139 = this.aFloat148 = this.aFloat144 = 0.0F;
		this.aFloat146 = this.aFloat149 = this.aFloat143 = 1.0F;
		this.aFloat138 = arg0;
		this.aFloat141 = arg1;
		this.aFloat142 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat149 + (float) arg0 * this.aFloat147 + this.aFloat144 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat146 + (float) arg1 * this.aFloat145 + (float) arg2 * this.aFloat148);
		arg3[2] = (int) (this.aFloat143 * (float) arg2 + (float) arg1 * this.aFloat139 + (float) arg0 * this.aFloat140);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IFFF)V")
	public void method4932(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat138 += arg2;
		this.aFloat142 += arg0;
		this.aFloat141 += arg1;
	}

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class209 arg0) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg0;
		this.aFloat138 = local6.aFloat138;
		this.aFloat149 = local6.aFloat149;
		this.aFloat142 = local6.aFloat142;
		this.aFloat143 = local6.aFloat143;
		this.aFloat139 = local6.aFloat139;
		this.aFloat144 = local6.aFloat144;
		this.aFloat146 = local6.aFloat146;
		this.aFloat145 = local6.aFloat145;
		this.aFloat141 = local6.aFloat141;
		this.aFloat148 = local6.aFloat148;
		this.aFloat140 = local6.aFloat140;
		this.aFloat147 = local6.aFloat147;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFIFFFFFFF)V")
	public void method4933(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat144 = arg7;
		this.aFloat139 = arg3;
		this.aFloat140 = arg5;
		this.aFloat143 = arg4;
		this.aFloat141 = 0;
		this.aFloat147 = arg8;
		this.aFloat145 = arg1;
		this.aFloat146 = arg0;
		this.aFloat138 = 0.0F;
		this.aFloat148 = arg2;
		this.aFloat142 = 0.0F;
		this.aFloat149 = arg6;
	}

	@OriginalMember(owner = "client!mh", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat146 = 1.0F;
		this.aFloat149 = this.aFloat143 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat139 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat145 = this.aFloat148 = this.aFloat138 = this.aFloat147 = this.aFloat141 = this.aFloat140 = this.aFloat142 = 0.0F;
		this.aFloat144 = -this.aFloat139;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!q;)V")
	public void method4934(@OriginalArg(1) Class209 arg0) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat146;
		@Pc(12) float local12 = this.aFloat147;
		@Pc(15) float local15 = this.aFloat145;
		@Pc(18) float local18 = this.aFloat149;
		@Pc(21) float local21 = this.aFloat148;
		@Pc(24) float local24 = this.aFloat144;
		@Pc(27) float local27 = this.aFloat138;
		this.aFloat147 = local6.aFloat149 * local12 + local6.aFloat147 * local9 + local6.aFloat144 * this.aFloat140;
		this.aFloat146 = local6.aFloat145 * local12 + local6.aFloat146 * local9 + this.aFloat140 * local6.aFloat148;
		@Pc(64) float local64 = this.aFloat141;
		this.aFloat149 = this.aFloat139 * local6.aFloat144 + local6.aFloat147 * local15 + local6.aFloat149 * local18;
		this.aFloat145 = local18 * local6.aFloat145 + local15 * local6.aFloat146 + this.aFloat139 * local6.aFloat148;
		this.aFloat140 = local12 * local6.aFloat139 + local6.aFloat140 * local9 + this.aFloat140 * local6.aFloat143;
		this.aFloat139 = local15 * local6.aFloat140 + local18 * local6.aFloat139 + this.aFloat139 * local6.aFloat143;
		this.aFloat144 = this.aFloat143 * local6.aFloat144 + local6.aFloat149 * local24 + local21 * local6.aFloat147;
		this.aFloat148 = this.aFloat143 * local6.aFloat148 + local6.aFloat146 * local21 + local6.aFloat145 * local24;
		this.aFloat141 = local6.aFloat141 + local6.aFloat149 * local64 + local27 * local6.aFloat147 + local6.aFloat144 * this.aFloat142;
		this.aFloat143 = local21 * local6.aFloat140 + local24 * local6.aFloat139 + local6.aFloat143 * this.aFloat143;
		this.aFloat138 = local6.aFloat148 * this.aFloat142 + local6.aFloat145 * local64 + local27 * local6.aFloat146 + local6.aFloat138;
		this.aFloat142 = this.aFloat142 * local6.aFloat143 + local27 * local6.aFloat140 + local64 * local6.aFloat139 + local6.aFloat142;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6362() {
		@Pc(7) Class209_Sub2 local7 = new Class209_Sub2();
		local7.aFloat149 = this.aFloat149;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat147 = this.aFloat147;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat142 = this.aFloat142;
		return local7;
	}
}
