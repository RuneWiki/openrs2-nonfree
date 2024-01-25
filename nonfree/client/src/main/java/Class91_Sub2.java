import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!og", name = "E", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "F")
	public float aFloat144;

	static {
		new Class88("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class91_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!og", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat144;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat138;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat135;
		arg0[0] = (int) (local12 * this.aFloat141 + local21 * this.aFloat137 + local29 * this.aFloat136);
		arg0[1] = (int) (this.aFloat134 * local21 + local12 * this.aFloat143 + local29 * this.aFloat133);
		arg0[2] = (int) (local21 * this.aFloat139 + local12 * this.aFloat142 + this.aFloat140 * local29);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!m;I)V")
	public void method5489(@OriginalArg(0) Class91 arg0) {
		@Pc(6) Class91_Sub2 local6 = (Class91_Sub2) arg0;
		this.aFloat141 = local6.aFloat141;
		this.aFloat143 = local6.aFloat137;
		this.aFloat142 = local6.aFloat136;
		this.aFloat134 = local6.aFloat134;
		this.aFloat139 = local6.aFloat133;
		this.aFloat137 = local6.aFloat143;
		this.aFloat136 = local6.aFloat142;
		this.aFloat144 = -(local6.aFloat138 * this.aFloat143 + this.aFloat141 * local6.aFloat144 + this.aFloat142 * local6.aFloat135);
		this.aFloat133 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat138 = -(local6.aFloat135 * this.aFloat139 + local6.aFloat138 * this.aFloat134 + this.aFloat137 * local6.aFloat144);
		this.aFloat135 = -(local6.aFloat144 * this.aFloat136 + local6.aFloat138 * this.aFloat133 + this.aFloat140 * local6.aFloat135);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class91 method7050() {
		@Pc(7) Class91_Sub2 local7 = new Class91_Sub2();
		local7.aFloat134 = this.aFloat134;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat143 = this.aFloat143;
		return local7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFFF)F")
	public float method5490(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat144 + this.aFloat143 * arg1 + this.aFloat141 * arg0 + arg2 * this.aFloat142;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFIF)V")
	public void method5491(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat139 *= arg2;
		this.aFloat144 *= arg0;
		this.aFloat134 *= arg2;
		this.aFloat133 *= arg1;
		this.aFloat136 *= arg1;
		this.aFloat137 *= arg2;
		this.aFloat135 *= arg1;
		this.aFloat141 *= arg0;
		this.aFloat143 *= arg0;
		this.aFloat142 *= arg0;
		this.aFloat138 *= arg2;
		this.aFloat140 *= arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([FI)[F")
	public float[] method5493(@OriginalArg(0) float[] arg0) {
		arg0[10] = this.aFloat135;
		arg0[4] = this.aFloat143;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat138;
		arg0[6] = 0;
		arg0[2] = 0.0F;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat137;
		arg0[0] = this.aFloat141;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat134;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat144;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!m;)V")
	public void method5496(@OriginalArg(1) Class91 arg0) {
		@Pc(6) Class91_Sub2 local6 = (Class91_Sub2) arg0;
		this.aFloat136 = local6.aFloat136;
		this.aFloat133 = local6.aFloat133;
		this.aFloat139 = local6.aFloat139;
		this.aFloat142 = local6.aFloat142;
		this.aFloat144 = 0.0F;
		this.aFloat140 = local6.aFloat140;
		this.aFloat141 = local6.aFloat141;
		this.aFloat137 = local6.aFloat137;
		this.aFloat138 = 0.0F;
		this.aFloat143 = local6.aFloat143;
		this.aFloat135 = 0.0F;
		this.aFloat134 = local6.aFloat134;
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class50.aFloatArray26[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class50.aFloatArray27[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat137;
		@Pc(21) float local21 = this.aFloat134;
		@Pc(24) float local24 = this.aFloat139;
		@Pc(27) float local27 = this.aFloat138;
		this.aFloat137 = local9 * local18 - local15 * this.aFloat136;
		this.aFloat136 = local15 * local18 + local9 * this.aFloat136;
		this.aFloat134 = local21 * local9 - local15 * this.aFloat133;
		this.aFloat133 = local9 * this.aFloat133 + local15 * local21;
		this.aFloat139 = local24 * local9 - local15 * this.aFloat140;
		this.aFloat138 = local9 * local27 - this.aFloat135 * local15;
		this.aFloat140 = local24 * local15 + this.aFloat140 * local9;
		this.aFloat135 = local9 * this.aFloat135 + local27 * local15;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFZFFFFFF)V")
	public void method5497(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat142 = arg5;
		this.aFloat137 = arg2;
		this.aFloat143 = arg6;
		this.aFloat136 = arg7;
		this.aFloat134 = arg4;
		this.aFloat133 = arg8;
		this.aFloat141 = arg1;
		this.aFloat138 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat135 = 0.0F;
		this.aFloat139 = arg0;
		this.aFloat140 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFBFF[F)V")
	public void method5498(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		@Pc(6) float local6 = -arg2;
		@Pc(10) float local10 = arg1 * local6;
		@Pc(14) float local14 = arg3 * local6;
		@Pc(18) float local18 = arg0 * local6;
		@Pc(36) float local36 = this.aFloat142 * local18 + local14 * this.aFloat143 + local10 * this.aFloat141 + this.aFloat144;
		@Pc(54) float local54 = this.aFloat138 + this.aFloat134 * local14 + this.aFloat137 * local10 + this.aFloat139 * local18;
		arg4[0] = this.aFloat143 * arg3 + this.aFloat141 * arg1 + this.aFloat142 * arg0;
		arg4[2] = this.aFloat140 * arg0 + arg1 * this.aFloat136 + arg3 * this.aFloat133;
		@Pc(110) float local110 = local14 * this.aFloat133 + local10 * this.aFloat136 + local18 * this.aFloat140 + this.aFloat135;
		arg4[1] = arg3 * this.aFloat134 + this.aFloat137 * arg1 + arg0 * this.aFloat139;
		arg4[3] = -(local110 * arg4[2] + arg4[1] * local54 + local36 * arg4[0]);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public void method5499() {
		this.aFloat138 = -this.aFloat138;
		this.aFloat139 = -this.aFloat139;
		this.aFloat137 = -this.aFloat137;
		this.aFloat133 = -this.aFloat133;
		this.aFloat140 = -this.aFloat140;
		this.aFloat136 = -this.aFloat136;
		this.aFloat134 = -this.aFloat134;
		this.aFloat135 = -this.aFloat135;
	}

	@OriginalMember(owner = "client!og", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class91 arg0) {
		@Pc(6) Class91_Sub2 local6 = (Class91_Sub2) arg0;
		this.aFloat139 = local6.aFloat139;
		this.aFloat136 = local6.aFloat136;
		this.aFloat141 = local6.aFloat141;
		this.aFloat137 = local6.aFloat137;
		this.aFloat140 = local6.aFloat140;
		this.aFloat142 = local6.aFloat142;
		this.aFloat143 = local6.aFloat143;
		this.aFloat134 = local6.aFloat134;
		this.aFloat135 = local6.aFloat135;
		this.aFloat144 = local6.aFloat144;
		this.aFloat138 = local6.aFloat138;
		this.aFloat133 = local6.aFloat133;
	}

	@OriginalMember(owner = "client!og", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat141 = this.aFloat134 = this.aFloat140 = 1.0F;
		this.aFloat138 = arg1;
		this.aFloat135 = arg2;
		this.aFloat144 = arg0;
		this.aFloat137 = this.aFloat136 = this.aFloat143 = this.aFloat133 = this.aFloat142 = this.aFloat139 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class50.aFloatArray26[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class50.aFloatArray27[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat141;
		@Pc(21) float local21 = this.aFloat143;
		@Pc(24) float local24 = this.aFloat142;
		@Pc(27) float local27 = this.aFloat144;
		this.aFloat141 = local15 * this.aFloat136 + local18 * local9;
		this.aFloat136 = local9 * this.aFloat136 - local18 * local15;
		this.aFloat143 = local15 * this.aFloat133 + local9 * local21;
		this.aFloat133 = this.aFloat133 * local9 - local15 * local21;
		this.aFloat142 = local15 * this.aFloat140 + local9 * local24;
		this.aFloat144 = local15 * this.aFloat135 + local9 * local27;
		this.aFloat140 = local9 * this.aFloat140 - local15 * local24;
		this.aFloat135 = this.aFloat135 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IFFF)V")
	public void method5500(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat141 = this.aFloat134 = this.aFloat140 = 1.0F;
		this.aFloat138 = arg2;
		this.aFloat137 = this.aFloat136 = this.aFloat143 = this.aFloat133 = this.aFloat142 = this.aFloat139 = 0.0F;
		this.aFloat135 = arg0;
		this.aFloat144 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B[F)[F")
	public float[] method5501(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat141;
		arg0[10] = this.aFloat140;
		arg0[4] = this.aFloat137;
		arg0[11] = this.aFloat135;
		arg0[9] = this.aFloat133;
		arg0[14] = 0.0F;
		arg0[7] = this.aFloat138;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat136;
		arg0[5] = this.aFloat134;
		arg0[6] = this.aFloat139;
		arg0[1] = this.aFloat143;
		arg0[3] = this.aFloat144;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat142;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[F)[F")
	public float[] method5502(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat137;
		arg0[0] = this.aFloat141;
		arg0[6] = this.aFloat139;
		arg0[3] = this.aFloat144;
		arg0[2] = this.aFloat142;
		arg0[5] = this.aFloat134;
		arg0[7] = this.aFloat138;
		arg0[1] = this.aFloat143;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z[F)[F")
	public float[] method5503(@OriginalArg(1) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat134;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat137;
		arg0[6] = this.aFloat133;
		arg0[10] = this.aFloat140;
		arg0[8] = this.aFloat142;
		arg0[13] = this.aFloat138;
		arg0[12] = this.aFloat144;
		arg0[9] = this.aFloat139;
		arg0[4] = this.aFloat143;
		arg0[14] = this.aFloat135;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[0] = this.aFloat141;
		arg0[2] = this.aFloat136;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat141 = this.aFloat140 = Class50.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat142 = Class50.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat143 = this.aFloat144 = this.aFloat137 = this.aFloat139 = this.aFloat138 = this.aFloat133 = this.aFloat135 = 0.0F;
		this.aFloat136 = -this.aFloat142;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FBFF)V")
	public void method5504(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat135 = 0.0F;
		this.aFloat139 = 0.0F;
		this.aFloat133 = 0.0F;
		this.aFloat140 = arg0;
		this.aFloat134 = arg2;
		this.aFloat136 = 0.0F;
		this.aFloat137 = 0.0F;
		this.aFloat143 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat138 = 0.0F;
		this.aFloat141 = arg1;
		this.aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat135 += arg2;
		this.aFloat138 += arg1;
		this.aFloat144 += arg0;
	}

	@OriginalMember(owner = "client!og", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat141 = 1.0F;
		this.aFloat134 = this.aFloat140 = Class50.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat133 = Class50.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat143 = this.aFloat142 = this.aFloat144 = this.aFloat137 = this.aFloat138 = this.aFloat136 = this.aFloat135 = 0.0F;
		this.aFloat139 = -this.aFloat133;
	}

	@OriginalMember(owner = "client!og", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat140 = 1.0F;
		this.aFloat141 = this.aFloat134 = Class50.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat137 = Class50.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat142 = this.aFloat144 = this.aFloat139 = this.aFloat138 = this.aFloat136 = this.aFloat133 = this.aFloat135 = 0.0F;
		this.aFloat143 = -this.aFloat137;
	}

	@OriginalMember(owner = "client!og", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat141 = this.aFloat134 = this.aFloat140 = 1.0F;
		this.aFloat137 = this.aFloat136 = this.aFloat143 = this.aFloat133 = this.aFloat142 = this.aFloat139 = this.aFloat144 = this.aFloat138 = this.aFloat135 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IFFF)F")
	public float method5505(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat137 * arg1 + arg0 * this.aFloat134 + arg2 * this.aFloat139 + this.aFloat138;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method5506(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1) {
		@Pc(6) Class91_Sub2 local6 = (Class91_Sub2) arg0;
		@Pc(9) Class91_Sub2 local9 = (Class91_Sub2) arg1;
		this.aFloat141 = local9.aFloat141 * local6.aFloat141 + local9.aFloat137 * local6.aFloat143 + local6.aFloat142 * local9.aFloat136;
		this.aFloat137 = local6.aFloat137 * local9.aFloat141 + local6.aFloat134 * local9.aFloat137 + local9.aFloat136 * local6.aFloat139;
		this.aFloat143 = local9.aFloat143 * local6.aFloat141 + local9.aFloat134 * local6.aFloat143 + local9.aFloat133 * local6.aFloat142;
		this.aFloat136 = local6.aFloat133 * local9.aFloat137 + local9.aFloat141 * local6.aFloat136 + local9.aFloat136 * local6.aFloat140;
		this.aFloat134 = local6.aFloat134 * local9.aFloat134 + local9.aFloat143 * local6.aFloat137 + local9.aFloat133 * local6.aFloat139;
		this.aFloat133 = local6.aFloat140 * local9.aFloat133 + local9.aFloat143 * local6.aFloat136 + local9.aFloat134 * local6.aFloat133;
		this.aFloat142 = local6.aFloat141 * local9.aFloat142 + local6.aFloat143 * local9.aFloat139 + local6.aFloat142 * local9.aFloat140;
		this.aFloat139 = local6.aFloat139 * local9.aFloat140 + local9.aFloat142 * local6.aFloat137 + local9.aFloat139 * local6.aFloat134;
		this.aFloat144 = local6.aFloat144 + local9.aFloat135 * local6.aFloat142 + local6.aFloat143 * local9.aFloat138 + local6.aFloat141 * local9.aFloat144;
		this.aFloat140 = local6.aFloat133 * local9.aFloat139 + local9.aFloat142 * local6.aFloat136 + local9.aFloat140 * local6.aFloat140;
		this.aFloat138 = local6.aFloat138 + local6.aFloat139 * local9.aFloat135 + local9.aFloat144 * local6.aFloat137 + local6.aFloat134 * local9.aFloat138;
		this.aFloat135 = local6.aFloat135 + local9.aFloat135 * local6.aFloat140 + local6.aFloat136 * local9.aFloat144 + local6.aFloat133 * local9.aFloat138;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFBF)F")
	public float method5507(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat135 + arg0 * this.aFloat140 + arg1 * this.aFloat136 + this.aFloat133 * arg2;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(ILclient!m;)V")
	public void method5508(@OriginalArg(1) Class91 arg0) {
		@Pc(6) Class91_Sub2 local6 = (Class91_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat141;
		@Pc(12) float local12 = this.aFloat137;
		@Pc(15) float local15 = this.aFloat143;
		@Pc(18) float local18 = this.aFloat134;
		@Pc(24) float local24 = this.aFloat142;
		@Pc(27) float local27 = this.aFloat139;
		@Pc(30) float local30 = this.aFloat144;
		@Pc(33) float local33 = this.aFloat138;
		this.aFloat137 = local6.aFloat139 * this.aFloat136 + local9 * local6.aFloat137 + local12 * local6.aFloat134;
		this.aFloat141 = local6.aFloat143 * local12 + local6.aFloat141 * local9 + this.aFloat136 * local6.aFloat142;
		this.aFloat136 = local6.aFloat140 * this.aFloat136 + local12 * local6.aFloat133 + local9 * local6.aFloat136;
		this.aFloat143 = local6.aFloat141 * local15 + local6.aFloat143 * local18 + this.aFloat133 * local6.aFloat142;
		this.aFloat134 = local15 * local6.aFloat137 + local6.aFloat134 * local18 + this.aFloat133 * local6.aFloat139;
		this.aFloat133 = local18 * local6.aFloat133 + local6.aFloat136 * local15 + local6.aFloat140 * this.aFloat133;
		this.aFloat142 = this.aFloat140 * local6.aFloat142 + local6.aFloat143 * local27 + local24 * local6.aFloat141;
		this.aFloat139 = local6.aFloat134 * local27 + local24 * local6.aFloat137 + local6.aFloat139 * this.aFloat140;
		this.aFloat144 = local6.aFloat144 + this.aFloat135 * local6.aFloat142 + local6.aFloat143 * local33 + local30 * local6.aFloat141;
		this.aFloat140 = local6.aFloat136 * local24 + local27 * local6.aFloat133 + this.aFloat140 * local6.aFloat140;
		this.aFloat138 = local6.aFloat138 + local6.aFloat137 * local30 + local6.aFloat134 * local33 + local6.aFloat139 * this.aFloat135;
		this.aFloat135 = local6.aFloat136 * local30 + local33 * local6.aFloat133 + this.aFloat135 * local6.aFloat140 + local6.aFloat135;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FIIIFFI)V")
	public void method5509(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat134 = arg5 * 2;
			this.aFloat140 = 1.0F;
			this.aFloat141 = arg1 * 2;
			this.aFloat137 = this.aFloat136 = this.aFloat143 = this.aFloat133 = this.aFloat142 = this.aFloat139 = 0.0F;
		} else {
			@Pc(45) float local45 = Class50.aFloatArray26[arg2 & 0x3FFF];
			@Pc(51) float local51 = Class50.aFloatArray27[arg2 & 0x3FFF];
			this.aFloat143 = local51 * -2.0F * (float) arg5;
			this.aFloat136 = this.aFloat133 = this.aFloat142 = this.aFloat139 = 0.0F;
			this.aFloat141 = local45 * 2.0F * (float) arg1;
			this.aFloat137 = local51 * 2.0F * (float) arg1;
			this.aFloat134 = (float) arg5 * local45 * 2.0F;
			this.aFloat140 = 1.0F;
		}
		this.aFloat144 = arg0 - (float) arg1;
		this.aFloat135 = arg3;
		this.aFloat138 = arg4 - (float) arg5;
	}

	@OriginalMember(owner = "client!og", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class50.aFloatArray26[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class50.aFloatArray27[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class50.aFloatArray26[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class50.aFloatArray27[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class50.aFloatArray26[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class50.aFloatArray27[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat141 = local47 * local27 + local33 * local21;
		this.aFloat140 = local21 * local9;
		this.aFloat142 = local33 * -local27 + local47 * local21;
		this.aFloat139 = local27 * local39 + local43 * local21;
		this.aFloat134 = local33 * local9;
		this.aFloat133 = -local15;
		this.aFloat137 = local27 * local43 + -local21 * local39;
		this.aFloat143 = local39 * local9;
		this.aFloat136 = local27 * local9;
		this.aFloat135 = -((float) arg1 * this.aFloat133) + (float) -arg0 * this.aFloat136 - (float) arg2 * this.aFloat140;
		this.aFloat144 = (float) -arg0 * this.aFloat141 - this.aFloat143 * (float) arg1 - (float) arg2 * this.aFloat142;
		this.aFloat138 = -(this.aFloat139 * (float) arg2) - (float) arg1 * this.aFloat134 + (float) -arg0 * this.aFloat137;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat135 + (float) arg2 * this.aFloat140 + this.aFloat136 * (float) arg0 + this.aFloat133 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat142 + this.aFloat141 * (float) arg0 + (float) arg1 * this.aFloat143 + this.aFloat144);
		arg3[1] = (int) (this.aFloat138 + (float) arg2 * this.aFloat139 + this.aFloat134 * (float) arg1 + (float) arg0 * this.aFloat137);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFI)V")
	public void method5510(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat144 += arg0;
		this.aFloat135 += arg1;
		this.aFloat138 += arg2;
	}

	@OriginalMember(owner = "client!og", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat136 + this.aFloat133 * (float) arg1 + this.aFloat140 * (float) arg2);
		arg3[1] = (int) (this.aFloat139 * (float) arg2 + (float) arg1 * this.aFloat134 + (float) arg0 * this.aFloat137);
		arg3[0] = (int) (this.aFloat141 * (float) arg0 + (float) arg1 * this.aFloat143 + this.aFloat142 * (float) arg2);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFB[FF)V")
	public void method5511(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[0] = (float) (this.aFloat142 * arg0 + arg1 * this.aFloat143 + arg3 * this.aFloat141);
		arg2[2] = (float) (arg1 * this.aFloat133 + arg3 * this.aFloat136 + arg0 * this.aFloat140);
		arg2[1] = (float) (this.aFloat139 * arg0 + this.aFloat134 * arg1 + this.aFloat137 * arg3);
	}
}
