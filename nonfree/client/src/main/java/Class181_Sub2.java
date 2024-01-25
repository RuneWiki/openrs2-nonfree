import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class181_Sub2 extends Class181 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class181_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[F)[F")
	public float[] method5389(@OriginalArg(1) float[] arg0) {
		arg0[13] = this.aFloat136;
		arg0[10] = this.aFloat134;
		arg0[2] = this.aFloat133;
		arg0[1] = this.aFloat130;
		arg0[7] = 0.0F;
		arg0[15] = 1.0F;
		arg0[14] = this.aFloat138;
		arg0[9] = this.aFloat140;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat139;
		arg0[3] = 0.0F;
		arg0[6] = this.aFloat129;
		arg0[0] = this.aFloat137;
		arg0[5] = this.aFloat132;
		arg0[8] = this.aFloat131;
		arg0[12] = this.aFloat135;
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat136 += arg1;
		this.aFloat135 += arg0;
		this.aFloat138 += arg2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFFZFFFFFF)V")
	public void method5391(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat133 = arg8;
		this.aFloat129 = arg3;
		this.aFloat138 = 0.0F;
		this.aFloat137 = arg2;
		this.aFloat134 = arg0;
		this.aFloat131 = arg1;
		this.aFloat130 = arg7;
		this.aFloat136 = 0.0F;
		this.aFloat140 = arg6;
		this.aFloat132 = arg4;
		this.aFloat139 = arg5;
		this.aFloat135 = 0.0F;
	}

	@OriginalMember(owner = "client!oe", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = InputStream_Sub1.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = InputStream_Sub1.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat137;
		@Pc(21) float local21 = this.aFloat139;
		@Pc(24) float local24 = this.aFloat131;
		this.aFloat137 = local15 * this.aFloat133 + local18 * local9;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat139 = local9 * local21 + this.aFloat129 * local15;
		this.aFloat133 = this.aFloat133 * local9 - local18 * local15;
		this.aFloat129 = local9 * this.aFloat129 - local21 * local15;
		this.aFloat131 = local15 * this.aFloat134 + local24 * local9;
		this.aFloat134 = this.aFloat134 * local9 - local15 * local24;
		this.aFloat135 = local15 * this.aFloat138 + local9 * local37;
		this.aFloat138 = local9 * this.aFloat138 - local15 * local37;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFFI)F")
	public float method5392(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat129 + this.aFloat133 * arg1 + arg2 * this.aFloat134 + this.aFloat138;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!m;Z)V")
	public void method5393(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat137;
		@Pc(12) float local12 = this.aFloat130;
		@Pc(15) float local15 = this.aFloat139;
		@Pc(18) float local18 = this.aFloat132;
		@Pc(21) float local21 = this.aFloat131;
		@Pc(24) float local24 = this.aFloat140;
		@Pc(31) float local31 = this.aFloat135;
		this.aFloat137 = local6.aFloat137 * local9 + local12 * local6.aFloat139 + this.aFloat133 * local6.aFloat131;
		@Pc(51) float local51 = this.aFloat136;
		this.aFloat130 = local6.aFloat130 * local9 + local6.aFloat132 * local12 + local6.aFloat140 * this.aFloat133;
		this.aFloat132 = local18 * local6.aFloat132 + local6.aFloat130 * local15 + local6.aFloat140 * this.aFloat129;
		this.aFloat139 = local6.aFloat131 * this.aFloat129 + local6.aFloat137 * local15 + local6.aFloat139 * local18;
		this.aFloat133 = local9 * local6.aFloat133 + local12 * local6.aFloat129 + local6.aFloat134 * this.aFloat133;
		this.aFloat129 = this.aFloat129 * local6.aFloat134 + local6.aFloat129 * local18 + local15 * local6.aFloat133;
		this.aFloat140 = local6.aFloat132 * local24 + local21 * local6.aFloat130 + this.aFloat134 * local6.aFloat140;
		this.aFloat131 = local6.aFloat137 * local21 + local6.aFloat139 * local24 + local6.aFloat131 * this.aFloat134;
		this.aFloat136 = local6.aFloat136 + this.aFloat138 * local6.aFloat140 + local6.aFloat132 * local51 + local6.aFloat130 * local31;
		this.aFloat135 = local31 * local6.aFloat137 + local6.aFloat139 * local51 + local6.aFloat131 * this.aFloat138 + local6.aFloat135;
		this.aFloat134 = this.aFloat134 * local6.aFloat134 + local6.aFloat129 * local24 + local6.aFloat133 * local21;
		this.aFloat138 = local6.aFloat138 + local51 * local6.aFloat129 + local6.aFloat133 * local31 + this.aFloat138 * local6.aFloat134;
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = InputStream_Sub1.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = InputStream_Sub1.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat132;
		@Pc(24) float local24 = this.aFloat140;
		@Pc(27) float local27 = this.aFloat136;
		this.aFloat130 = local18 * local9 - local15 * this.aFloat133;
		this.aFloat133 = this.aFloat133 * local9 + local15 * local18;
		this.aFloat132 = local21 * local9 - this.aFloat129 * local15;
		this.aFloat140 = local24 * local9 - local15 * this.aFloat134;
		this.aFloat129 = local15 * local21 + this.aFloat129 * local9;
		this.aFloat134 = this.aFloat134 * local9 + local24 * local15;
		this.aFloat136 = local9 * local27 - this.aFloat138 * local15;
		this.aFloat138 = local15 * local27 + this.aFloat138 * local9;
	}

	@OriginalMember(owner = "client!oe", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat135;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat136;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat138;
		arg0[1] = (int) (this.aFloat129 * local28 + local11 * this.aFloat139 + this.aFloat132 * local19);
		arg0[2] = (int) (this.aFloat134 * local28 + this.aFloat140 * local19 + this.aFloat131 * local11);
		arg0[0] = (int) (local19 * this.aFloat130 + local11 * this.aFloat137 + this.aFloat133 * local28);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FZFF)V")
	public void method5394(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat130 *= arg0;
		this.aFloat129 *= arg1;
		this.aFloat133 *= arg1;
		this.aFloat135 *= arg2;
		this.aFloat138 *= arg1;
		this.aFloat136 *= arg0;
		this.aFloat134 *= arg1;
		this.aFloat131 *= arg2;
		this.aFloat139 *= arg2;
		this.aFloat137 *= arg2;
		this.aFloat132 *= arg0;
		this.aFloat140 *= arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIFFFII)V")
	public void method5395(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat130 = this.aFloat133 = this.aFloat139 = this.aFloat129 = this.aFloat131 = this.aFloat140 = 0.0F;
			this.aFloat134 = 1.0F;
			this.aFloat137 = arg0 * 2;
			this.aFloat132 = arg4 * 2;
		} else {
			@Pc(19) float local19 = InputStream_Sub1.aFloatArray56[arg5 & 0x3FFF];
			@Pc(25) float local25 = InputStream_Sub1.aFloatArray55[arg5 & 0x3FFF];
			this.aFloat130 = local25 * 2.0F * (float) arg0;
			this.aFloat139 = (float) arg4 * local25 * -2.0F;
			this.aFloat132 = (float) arg4 * 2.0F * local19;
			this.aFloat137 = local19 * 2.0F * (float) arg0;
			this.aFloat134 = 1.0F;
			this.aFloat133 = this.aFloat129 = this.aFloat131 = this.aFloat140 = 0.0F;
		}
		this.aFloat138 = arg1;
		this.aFloat135 = arg2 - (float) arg0;
		this.aFloat136 = arg3 - (float) arg4;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFFB)F")
	public float method5396(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat136 + arg0 * this.aFloat132 + arg1 * this.aFloat130 + arg2 * this.aFloat140;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method5397(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		@Pc(9) Class181_Sub2 local9 = (Class181_Sub2) arg1;
		this.aFloat137 = local6.aFloat139 * local9.aFloat130 + local9.aFloat137 * local6.aFloat137 + local9.aFloat133 * local6.aFloat131;
		this.aFloat130 = local9.aFloat137 * local6.aFloat130 + local6.aFloat132 * local9.aFloat130 + local9.aFloat133 * local6.aFloat140;
		this.aFloat133 = local9.aFloat130 * local6.aFloat129 + local9.aFloat137 * local6.aFloat133 + local9.aFloat133 * local6.aFloat134;
		this.aFloat139 = local9.aFloat129 * local6.aFloat131 + local9.aFloat132 * local6.aFloat139 + local6.aFloat137 * local9.aFloat139;
		this.aFloat132 = local9.aFloat132 * local6.aFloat132 + local6.aFloat130 * local9.aFloat139 + local6.aFloat140 * local9.aFloat129;
		this.aFloat131 = local9.aFloat134 * local6.aFloat131 + local9.aFloat131 * local6.aFloat137 + local6.aFloat139 * local9.aFloat140;
		this.aFloat129 = local6.aFloat129 * local9.aFloat132 + local6.aFloat133 * local9.aFloat139 + local6.aFloat134 * local9.aFloat129;
		this.aFloat140 = local6.aFloat140 * local9.aFloat134 + local6.aFloat130 * local9.aFloat131 + local6.aFloat132 * local9.aFloat140;
		this.aFloat135 = local6.aFloat135 + local9.aFloat136 * local6.aFloat139 + local9.aFloat135 * local6.aFloat137 + local6.aFloat131 * local9.aFloat138;
		this.aFloat134 = local6.aFloat134 * local9.aFloat134 + local9.aFloat140 * local6.aFloat129 + local6.aFloat133 * local9.aFloat131;
		this.aFloat136 = local6.aFloat140 * local9.aFloat138 + local9.aFloat136 * local6.aFloat132 + local9.aFloat135 * local6.aFloat130 + local6.aFloat136;
		this.aFloat138 = local6.aFloat138 + local9.aFloat138 * local6.aFloat134 + local9.aFloat136 * local6.aFloat129 + local9.aFloat135 * local6.aFloat133;
	}

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat131 + (float) arg0 * this.aFloat137 + this.aFloat139 * (float) arg1);
		arg3[1] = (int) ((float) arg0 * this.aFloat130 + (float) arg1 * this.aFloat132 + (float) arg2 * this.aFloat140);
		arg3[2] = (int) ((float) arg2 * this.aFloat134 + (float) arg1 * this.aFloat129 + (float) arg0 * this.aFloat133);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([FI)[F")
	public float[] method5398(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat140;
		arg0[5] = this.aFloat132;
		arg0[1] = this.aFloat139;
		arg0[3] = this.aFloat135;
		arg0[7] = this.aFloat136;
		arg0[2] = this.aFloat131;
		arg0[4] = this.aFloat130;
		arg0[0] = this.aFloat137;
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat132 = 1.0F;
		this.aFloat137 = this.aFloat134 = InputStream_Sub1.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat131 = InputStream_Sub1.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat139 = this.aFloat135 = this.aFloat130 = this.aFloat140 = this.aFloat136 = this.aFloat129 = this.aFloat138 = 0.0F;
		this.aFloat133 = -this.aFloat131;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!m;I)V")
	public void method5399(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		this.aFloat137 = local6.aFloat137;
		this.aFloat131 = local6.aFloat133;
		this.aFloat139 = local6.aFloat130;
		this.aFloat130 = local6.aFloat139;
		this.aFloat140 = local6.aFloat129;
		this.aFloat132 = local6.aFloat132;
		this.aFloat133 = local6.aFloat131;
		this.aFloat129 = local6.aFloat140;
		this.aFloat134 = local6.aFloat134;
		this.aFloat135 = -(local6.aFloat135 * this.aFloat137 + this.aFloat139 * local6.aFloat136 + this.aFloat131 * local6.aFloat138);
		this.aFloat136 = -(this.aFloat132 * local6.aFloat136 + this.aFloat130 * local6.aFloat135 + this.aFloat140 * local6.aFloat138);
		this.aFloat138 = -(local6.aFloat135 * this.aFloat133 + local6.aFloat136 * this.aFloat129 + this.aFloat134 * local6.aFloat138);
	}

	@OriginalMember(owner = "client!oe", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		this.aFloat137 = local6.aFloat137;
		this.aFloat140 = local6.aFloat140;
		this.aFloat134 = local6.aFloat134;
		this.aFloat136 = local6.aFloat136;
		this.aFloat131 = local6.aFloat131;
		this.aFloat130 = local6.aFloat130;
		this.aFloat133 = local6.aFloat133;
		this.aFloat135 = local6.aFloat135;
		this.aFloat132 = local6.aFloat132;
		this.aFloat138 = local6.aFloat138;
		this.aFloat129 = local6.aFloat129;
		this.aFloat139 = local6.aFloat139;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat136 + (float) arg0 * this.aFloat130 + this.aFloat132 * (float) arg1 + this.aFloat140 * (float) arg2);
		arg3[0] = (int) (this.aFloat135 + this.aFloat131 * (float) arg2 + this.aFloat139 * (float) arg1 + this.aFloat137 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat134 + (float) arg0 * this.aFloat133 + this.aFloat129 * (float) arg1 + this.aFloat138);
	}

	@OriginalMember(owner = "client!oe", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat136 = arg1;
		this.aFloat130 = this.aFloat133 = this.aFloat139 = this.aFloat129 = this.aFloat131 = this.aFloat140 = 0.0F;
		this.aFloat138 = arg2;
		this.aFloat137 = this.aFloat132 = this.aFloat134 = 1.0F;
		this.aFloat135 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!m;I)V")
	public void method5400(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg0;
		this.aFloat129 = local6.aFloat129;
		this.aFloat134 = local6.aFloat134;
		this.aFloat139 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat138 = 0.0F;
		this.aFloat132 = local6.aFloat132;
		this.aFloat131 = local6.aFloat131;
		this.aFloat133 = local6.aFloat133;
		this.aFloat136 = 0.0F;
		this.aFloat137 = local6.aFloat137;
		this.aFloat130 = local6.aFloat130;
		this.aFloat135 = 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BFFF)V")
	public void method5401(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat140 = 0.0F;
		this.aFloat132 = arg2;
		this.aFloat129 = 0.0F;
		this.aFloat135 = 0.0F;
		this.aFloat130 = 0.0F;
		this.aFloat137 = arg0;
		this.aFloat136 = 0.0F;
		this.aFloat134 = arg1;
		this.aFloat133 = 0.0F;
		this.aFloat131 = 0.0F;
		this.aFloat139 = 0.0F;
		this.aFloat138 = 0.0F;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFIF)V")
	public void method5402(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat136 += arg0;
		this.aFloat138 += arg2;
		this.aFloat135 += arg1;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	public void method5403() {
		this.aFloat130 = -this.aFloat130;
		this.aFloat136 = -this.aFloat136;
		this.aFloat132 = -this.aFloat132;
		this.aFloat138 = -this.aFloat138;
		this.aFloat140 = -this.aFloat140;
		this.aFloat134 = -this.aFloat134;
		this.aFloat129 = -this.aFloat129;
		this.aFloat133 = -this.aFloat133;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([FB)[F")
	public float[] method5404(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat139;
		arg0[15] = 1.0F;
		arg0[13] = 0.0F;
		arg0[3] = this.aFloat135;
		arg0[4] = this.aFloat130;
		arg0[5] = this.aFloat132;
		arg0[8] = this.aFloat133;
		arg0[12] = 0.0F;
		arg0[11] = this.aFloat138;
		arg0[14] = 0.0F;
		arg0[2] = this.aFloat131;
		arg0[0] = this.aFloat137;
		arg0[7] = this.aFloat136;
		arg0[6] = this.aFloat140;
		arg0[10] = this.aFloat134;
		arg0[9] = this.aFloat129;
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat130 = this.aFloat133 = this.aFloat139 = this.aFloat129 = this.aFloat131 = this.aFloat140 = this.aFloat135 = this.aFloat136 = this.aFloat138 = 0.0F;
		this.aFloat137 = this.aFloat132 = this.aFloat134 = 1.0F;
	}

	@OriginalMember(owner = "client!oe", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat137 = 1.0F;
		this.aFloat132 = this.aFloat134 = InputStream_Sub1.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat129 = InputStream_Sub1.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat139 = this.aFloat131 = this.aFloat135 = this.aFloat130 = this.aFloat136 = this.aFloat133 = this.aFloat138 = 0.0F;
		this.aFloat140 = -this.aFloat129;
	}

	@OriginalMember(owner = "client!oe", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat137 = this.aFloat132 = InputStream_Sub1.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat130 = InputStream_Sub1.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat139 = -this.aFloat130;
		this.aFloat131 = this.aFloat135 = this.aFloat140 = this.aFloat136 = this.aFloat133 = this.aFloat129 = this.aFloat138 = 0.0F;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FBF[FF)V")
	public void method5405(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[0] = (float) (this.aFloat139 * arg3 + this.aFloat137 * arg0 + arg1 * this.aFloat131);
		arg2[2] = (float) (arg1 * this.aFloat134 + arg3 * this.aFloat129 + this.aFloat133 * arg0);
		arg2[1] = (float) (this.aFloat140 * arg1 + arg3 * this.aFloat132 + this.aFloat130 * arg0);
	}

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = InputStream_Sub1.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = InputStream_Sub1.aFloatArray55[arg3 & 0x3FFF];
		@Pc(21) float local21 = InputStream_Sub1.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = InputStream_Sub1.aFloatArray55[arg4 & 0x3FFF];
		@Pc(33) float local33 = InputStream_Sub1.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = InputStream_Sub1.aFloatArray55[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat131 = local21 * local47 + local33 * -local27;
		this.aFloat129 = -local15;
		this.aFloat133 = local27 * local9;
		this.aFloat139 = local39 * local9;
		this.aFloat132 = local33 * local9;
		this.aFloat134 = local21 * local9;
		this.aFloat140 = local27 * local39 + local21 * local43;
		this.aFloat137 = local33 * local21 + local47 * local27;
		this.aFloat130 = -local21 * local39 + local43 * local27;
		this.aFloat136 = (float) -arg0 * this.aFloat130 - (float) arg1 * this.aFloat132 - (float) arg2 * this.aFloat140;
		this.aFloat138 = -((float) arg2 * this.aFloat134) + (float) -arg0 * this.aFloat133 - (float) arg1 * this.aFloat129;
		this.aFloat135 = -((float) arg2 * this.aFloat131) - (float) arg1 * this.aFloat139 + (float) -arg0 * this.aFloat137;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(FFIF)F")
	public float method5406(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat135 + this.aFloat131 * arg1 + this.aFloat137 * arg2 + arg0 * this.aFloat139;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([FB)[F")
	public float[] method5407(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat130;
		arg0[9] = this.aFloat136;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat138;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat137;
		arg0[2] = 0.0F;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat139;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat132;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat135;
		arg0[14] = 0.0F;
		arg0[6] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class181 method5993() {
		@Pc(7) Class181_Sub2 local7 = new Class181_Sub2();
		local7.aFloat130 = this.aFloat130;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat134 = this.aFloat134;
		return local7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([FFIFFF)V")
	public void method5408(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(6) float local6 = -arg2;
		@Pc(10) float local10 = arg3 * local6;
		@Pc(14) float local14 = arg1 * local6;
		@Pc(18) float local18 = arg4 * local6;
		@Pc(43) float local43 = this.aFloat137 * local10 + this.aFloat139 * local14 + local18 * this.aFloat131 + this.aFloat135;
		@Pc(61) float local61 = this.aFloat136 + this.aFloat140 * local18 + local10 * this.aFloat130 + this.aFloat132 * local14;
		@Pc(79) float local79 = this.aFloat138 + this.aFloat134 * local18 + this.aFloat133 * local10 + local14 * this.aFloat129;
		arg0[2] = arg4 * this.aFloat134 + arg3 * this.aFloat133 + this.aFloat129 * arg1;
		arg0[1] = this.aFloat140 * arg4 + arg1 * this.aFloat132 + this.aFloat130 * arg3;
		arg0[0] = arg4 * this.aFloat131 + this.aFloat139 * arg1 + arg3 * this.aFloat137;
		arg0[3] = -(arg0[2] * local79 + local43 * arg0[0] + local61 * arg0[1]);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(FFFB)V")
	public void method5409(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat135 = arg1;
		this.aFloat137 = this.aFloat132 = this.aFloat134 = 1.0F;
		this.aFloat136 = arg0;
		this.aFloat138 = arg2;
		this.aFloat130 = this.aFloat133 = this.aFloat139 = this.aFloat129 = this.aFloat131 = this.aFloat140 = 0.0F;
	}
}
