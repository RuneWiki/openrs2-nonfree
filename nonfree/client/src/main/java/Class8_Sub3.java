import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!ww", name = "C", descriptor = "F")
	public float aFloat209;

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!ww", name = "J", descriptor = "F")
	public float aFloat211;

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "F")
	public float aFloat212;

	@OriginalMember(owner = "client!ww", name = "T", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!ww", name = "Y", descriptor = "F")
	public float aFloat214;

	@OriginalMember(owner = "client!ww", name = "ab", descriptor = "F")
	public float aFloat215;

	@OriginalMember(owner = "client!ww", name = "bb", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
	public Class8_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat205 = 1.0F;
		this.aFloat207 = this.aFloat216 = Class6_Sub39_Sub1.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat208 = Class6_Sub39_Sub1.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat210 = this.aFloat206 = this.aFloat209 = this.aFloat212 = this.aFloat213 = this.aFloat215 = this.aFloat211 = 0.0F;
		this.aFloat214 = -this.aFloat208;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B[F)[F")
	public float[] method8180(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat211;
		arg0[1] = this.aFloat209;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat213;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[4] = this.aFloat210;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat207;
		arg0[5] = this.aFloat205;
		arg0[8] = this.aFloat206;
		arg0[12] = 0.0F;
		arg0[6] = 0.0F;
		arg0[2] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FFFFFIFFFF)V")
	public void method8181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat206 = 0.0F;
		this.aFloat212 = arg1;
		this.aFloat213 = 0.0F;
		this.aFloat216 = arg3;
		this.aFloat205 = arg5;
		this.aFloat211 = 0.0F;
		this.aFloat208 = arg4;
		this.aFloat207 = arg7;
		this.aFloat214 = arg0;
		this.aFloat209 = arg8;
		this.aFloat210 = arg6;
		this.aFloat215 = arg2;
	}

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat206;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat213;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat211;
		arg0[1] = (int) (this.aFloat215 * local28 + this.aFloat205 * local19 + this.aFloat210 * local11);
		arg0[2] = (int) (local11 * this.aFloat208 + local19 * this.aFloat212 + local28 * this.aFloat216);
		arg0[0] = (int) (this.aFloat214 * local28 + this.aFloat209 * local19 + local11 * this.aFloat207);
	}

	@OriginalMember(owner = "client!ww", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat209 * (float) arg0 + this.aFloat205 * (float) arg1 + (float) arg2 * this.aFloat212);
		arg3[2] = (int) (this.aFloat216 * (float) arg2 + (float) arg1 * this.aFloat215 + (float) arg0 * this.aFloat214);
		arg3[0] = (int) (this.aFloat208 * (float) arg2 + (float) arg1 * this.aFloat210 + (float) arg0 * this.aFloat207);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([FZ)[F")
	public float[] method8182(@OriginalArg(0) float[] arg0) {
		arg0[7] = this.aFloat213;
		arg0[6] = this.aFloat212;
		arg0[1] = this.aFloat210;
		arg0[5] = this.aFloat205;
		arg0[0] = this.aFloat207;
		arg0[4] = this.aFloat209;
		arg0[3] = this.aFloat206;
		arg0[2] = this.aFloat208;
		return arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FFFI[FF)V")
	public void method8183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		@Pc(6) float local6 = -arg2;
		@Pc(10) float local10 = arg1 * local6;
		@Pc(14) float local14 = local6 * arg4;
		@Pc(18) float local18 = arg0 * local6;
		@Pc(36) float local36 = local18 * this.aFloat208 + this.aFloat207 * local10 + this.aFloat210 * local14 + this.aFloat206;
		@Pc(54) float local54 = local10 * this.aFloat209 + this.aFloat205 * local14 + this.aFloat212 * local18 + this.aFloat213;
		@Pc(72) float local72 = local14 * this.aFloat215 + local10 * this.aFloat214 + local18 * this.aFloat216 + this.aFloat211;
		arg3[1] = arg1 * this.aFloat209 + this.aFloat205 * arg4 + this.aFloat212 * arg0;
		arg3[0] = this.aFloat210 * arg4 + this.aFloat207 * arg1 + this.aFloat208 * arg0;
		arg3[2] = arg0 * this.aFloat216 + this.aFloat215 * arg4 + this.aFloat214 * arg1;
		arg3[3] = -(arg3[0] * local36 + arg3[1] * local54 + arg3[2] * local72);
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "([FZ)[F")
	public float[] method8184(@OriginalArg(0) float[] arg0) {
		arg0[10] = this.aFloat216;
		arg0[11] = this.aFloat211;
		arg0[8] = this.aFloat214;
		arg0[7] = this.aFloat213;
		arg0[3] = this.aFloat206;
		arg0[9] = this.aFloat215;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat205;
		arg0[13] = 0.0F;
		arg0[2] = this.aFloat208;
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat210;
		arg0[0] = this.aFloat207;
		arg0[6] = this.aFloat212;
		arg0[4] = this.aFloat209;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method8185(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		@Pc(9) Class8_Sub3 local9 = (Class8_Sub3) arg1;
		this.aFloat207 = local6.aFloat208 * local9.aFloat214 + local9.aFloat209 * local6.aFloat210 + local6.aFloat207 * local9.aFloat207;
		this.aFloat209 = local9.aFloat209 * local6.aFloat205 + local9.aFloat207 * local6.aFloat209 + local9.aFloat214 * local6.aFloat212;
		this.aFloat214 = local6.aFloat216 * local9.aFloat214 + local9.aFloat209 * local6.aFloat215 + local9.aFloat207 * local6.aFloat214;
		this.aFloat210 = local6.aFloat208 * local9.aFloat215 + local9.aFloat205 * local6.aFloat210 + local6.aFloat207 * local9.aFloat210;
		this.aFloat205 = local9.aFloat215 * local6.aFloat212 + local6.aFloat205 * local9.aFloat205 + local9.aFloat210 * local6.aFloat209;
		this.aFloat215 = local6.aFloat214 * local9.aFloat210 + local9.aFloat205 * local6.aFloat215 + local9.aFloat215 * local6.aFloat216;
		this.aFloat208 = local6.aFloat210 * local9.aFloat212 + local9.aFloat208 * local6.aFloat207 + local6.aFloat208 * local9.aFloat216;
		this.aFloat212 = local9.aFloat216 * local6.aFloat212 + local9.aFloat212 * local6.aFloat205 + local9.aFloat208 * local6.aFloat209;
		this.aFloat206 = local6.aFloat206 + local6.aFloat210 * local9.aFloat213 + local9.aFloat206 * local6.aFloat207 + local9.aFloat211 * local6.aFloat208;
		this.aFloat216 = local9.aFloat212 * local6.aFloat215 + local6.aFloat214 * local9.aFloat208 + local9.aFloat216 * local6.aFloat216;
		this.aFloat213 = local9.aFloat206 * local6.aFloat209 + local6.aFloat205 * local9.aFloat213 + local6.aFloat212 * local9.aFloat211 + local6.aFloat213;
		this.aFloat211 = local6.aFloat211 + local9.aFloat213 * local6.aFloat215 + local6.aFloat214 * local9.aFloat206 + local6.aFloat216 * local9.aFloat211;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FFIF)F")
	public float method8186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat205 * arg2 + this.aFloat209 * arg1 + arg0 * this.aFloat212 + this.aFloat213;
	}

	@OriginalMember(owner = "client!ww", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat213 += arg1;
		this.aFloat206 += arg0;
		this.aFloat211 += arg2;
	}

	@OriginalMember(owner = "client!ww", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat216 = 1.0F;
		this.aFloat207 = this.aFloat205 = Class6_Sub39_Sub1.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat209 = Class6_Sub39_Sub1.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat210 = -this.aFloat209;
		this.aFloat208 = this.aFloat206 = this.aFloat212 = this.aFloat213 = this.aFloat214 = this.aFloat215 = this.aFloat211 = 0.0F;
	}

	@OriginalMember(owner = "client!ww", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub39_Sub1.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub39_Sub1.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat209;
		@Pc(21) float local21 = this.aFloat205;
		@Pc(24) float local24 = this.aFloat212;
		this.aFloat209 = local9 * local18 - this.aFloat214 * local15;
		@Pc(38) float local38 = this.aFloat213;
		this.aFloat205 = local21 * local9 - this.aFloat215 * local15;
		this.aFloat214 = local9 * this.aFloat214 + local18 * local15;
		this.aFloat212 = local24 * local9 - local15 * this.aFloat216;
		this.aFloat215 = local21 * local15 + this.aFloat215 * local9;
		this.aFloat216 = local15 * local24 + local9 * this.aFloat216;
		this.aFloat213 = local38 * local9 - this.aFloat211 * local15;
		this.aFloat211 = this.aFloat211 * local9 + local38 * local15;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!q;I)V")
	public void method8187(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat207 = local6.aFloat207;
		this.aFloat210 = local6.aFloat209;
		this.aFloat208 = local6.aFloat214;
		this.aFloat205 = local6.aFloat205;
		this.aFloat209 = local6.aFloat210;
		this.aFloat214 = local6.aFloat208;
		this.aFloat212 = local6.aFloat215;
		this.aFloat216 = local6.aFloat216;
		this.aFloat215 = local6.aFloat212;
		this.aFloat206 = -(local6.aFloat213 * this.aFloat210 + this.aFloat207 * local6.aFloat206 + local6.aFloat211 * this.aFloat208);
		this.aFloat213 = -(this.aFloat209 * local6.aFloat206 + this.aFloat205 * local6.aFloat213 + local6.aFloat211 * this.aFloat212);
		this.aFloat211 = -(this.aFloat216 * local6.aFloat211 + local6.aFloat213 * this.aFloat215 + local6.aFloat206 * this.aFloat214);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method8188(@OriginalArg(0) Class8 arg0) {
		@Pc(12) Class8_Sub3 local12 = (Class8_Sub3) arg0;
		@Pc(15) float local15 = this.aFloat207;
		@Pc(18) float local18 = this.aFloat209;
		@Pc(21) float local21 = this.aFloat210;
		@Pc(24) float local24 = this.aFloat205;
		@Pc(27) float local27 = this.aFloat208;
		@Pc(30) float local30 = this.aFloat212;
		@Pc(33) float local33 = this.aFloat206;
		this.aFloat207 = local12.aFloat208 * this.aFloat214 + local18 * local12.aFloat210 + local12.aFloat207 * local15;
		@Pc(53) float local53 = this.aFloat213;
		this.aFloat209 = local15 * local12.aFloat209 + local12.aFloat205 * local18 + local12.aFloat212 * this.aFloat214;
		this.aFloat214 = local12.aFloat216 * this.aFloat214 + local15 * local12.aFloat214 + local12.aFloat215 * local18;
		this.aFloat210 = local12.aFloat208 * this.aFloat215 + local12.aFloat207 * local21 + local24 * local12.aFloat210;
		this.aFloat205 = local12.aFloat205 * local24 + local12.aFloat209 * local21 + local12.aFloat212 * this.aFloat215;
		this.aFloat215 = local12.aFloat216 * this.aFloat215 + local12.aFloat215 * local24 + local21 * local12.aFloat214;
		this.aFloat208 = local12.aFloat207 * local27 + local12.aFloat210 * local30 + local12.aFloat208 * this.aFloat216;
		this.aFloat212 = local12.aFloat212 * this.aFloat216 + local12.aFloat209 * local27 + local30 * local12.aFloat205;
		this.aFloat206 = local12.aFloat207 * local33 + local12.aFloat210 * local53 + this.aFloat211 * local12.aFloat208 + local12.aFloat206;
		this.aFloat213 = local12.aFloat213 + local12.aFloat205 * local53 + local33 * local12.aFloat209 + this.aFloat211 * local12.aFloat212;
		this.aFloat216 = local12.aFloat216 * this.aFloat216 + local27 * local12.aFloat214 + local30 * local12.aFloat215;
		this.aFloat211 = local12.aFloat211 + local12.aFloat215 * local53 + local12.aFloat214 * local33 + this.aFloat211 * local12.aFloat216;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([FFFBF)V")
	public void method8189(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat208 * arg3 + arg1 * this.aFloat210 + this.aFloat207 * arg2;
		arg0[1] = this.aFloat205 * arg1 + this.aFloat209 * arg2 + this.aFloat212 * arg3;
		arg0[2] = arg2 * this.aFloat214 + this.aFloat215 * arg1 + arg3 * this.aFloat216;
	}

	@OriginalMember(owner = "client!ww", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat209 = this.aFloat214 = this.aFloat210 = this.aFloat215 = this.aFloat208 = this.aFloat212 = this.aFloat206 = this.aFloat213 = this.aFloat211 = 0.0F;
		this.aFloat207 = this.aFloat205 = this.aFloat216 = 1.0F;
	}

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub39_Sub1.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub39_Sub1.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat207;
		@Pc(21) float local21 = this.aFloat210;
		@Pc(24) float local24 = this.aFloat208;
		@Pc(27) float local27 = this.aFloat206;
		this.aFloat207 = local9 * local18 + this.aFloat214 * local15;
		this.aFloat214 = local9 * this.aFloat214 - local18 * local15;
		this.aFloat210 = this.aFloat215 * local15 + local21 * local9;
		this.aFloat215 = this.aFloat215 * local9 - local15 * local21;
		this.aFloat208 = local15 * this.aFloat216 + local24 * local9;
		this.aFloat206 = this.aFloat211 * local15 + local27 * local9;
		this.aFloat216 = this.aFloat216 * local9 - local15 * local24;
		this.aFloat211 = this.aFloat211 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
	public void method8190() {
		this.aFloat216 = -this.aFloat216;
		this.aFloat215 = -this.aFloat215;
		this.aFloat211 = -this.aFloat211;
		this.aFloat212 = -this.aFloat212;
		this.aFloat209 = -this.aFloat209;
		this.aFloat213 = -this.aFloat213;
		this.aFloat205 = -this.aFloat205;
		this.aFloat214 = -this.aFloat214;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FFFB)V")
	public void method8191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat207 = this.aFloat205 = this.aFloat216 = 1.0F;
		this.aFloat206 = arg2;
		this.aFloat213 = arg0;
		this.aFloat211 = arg1;
		this.aFloat209 = this.aFloat214 = this.aFloat210 = this.aFloat215 = this.aFloat208 = this.aFloat212 = 0.0F;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IFFF)V")
	public void method8192(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat215 *= arg2;
		this.aFloat209 *= arg1;
		this.aFloat212 *= arg1;
		this.aFloat205 *= arg1;
		this.aFloat210 *= arg0;
		this.aFloat206 *= arg0;
		this.aFloat213 *= arg1;
		this.aFloat211 *= arg2;
		this.aFloat207 *= arg0;
		this.aFloat216 *= arg2;
		this.aFloat214 *= arg2;
		this.aFloat208 *= arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FBFF)F")
	public float method8193(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat211 + arg1 * this.aFloat215 + this.aFloat214 * arg0 + arg2 * this.aFloat216;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!q;)V")
	public void method8194(@OriginalArg(1) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat212 = local6.aFloat212;
		this.aFloat205 = local6.aFloat205;
		this.aFloat209 = local6.aFloat209;
		this.aFloat211 = 0.0F;
		this.aFloat207 = local6.aFloat207;
		this.aFloat214 = local6.aFloat214;
		this.aFloat216 = local6.aFloat216;
		this.aFloat213 = 0.0F;
		this.aFloat206 = 0.0F;
		this.aFloat210 = local6.aFloat210;
		this.aFloat215 = local6.aFloat215;
		this.aFloat208 = local6.aFloat208;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZFFF)V")
	public void method8195(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat206 += arg2;
		this.aFloat211 += arg0;
		this.aFloat213 += arg1;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B[F)[F")
	public float[] method8196(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat208;
		arg0[1] = this.aFloat209;
		arg0[4] = this.aFloat210;
		arg0[0] = this.aFloat207;
		arg0[9] = this.aFloat212;
		arg0[12] = this.aFloat206;
		arg0[14] = this.aFloat211;
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat205;
		arg0[11] = 0.0F;
		arg0[13] = this.aFloat213;
		arg0[3] = 0.0F;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat214;
		arg0[6] = this.aFloat215;
		arg0[10] = this.aFloat216;
		return arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat215 * (float) arg1 + (float) arg0 * this.aFloat214 + (float) arg2 * this.aFloat216 + this.aFloat211);
		arg3[1] = (int) (this.aFloat212 * (float) arg2 + (float) arg1 * this.aFloat205 + this.aFloat209 * (float) arg0 + this.aFloat213);
		arg3[0] = (int) (this.aFloat206 + this.aFloat208 * (float) arg2 + (float) arg0 * this.aFloat207 + (float) arg1 * this.aFloat210);
	}

	@OriginalMember(owner = "client!ww", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat207 = this.aFloat205 = this.aFloat216 = 1.0F;
		this.aFloat209 = this.aFloat214 = this.aFloat210 = this.aFloat215 = this.aFloat208 = this.aFloat212 = 0.0F;
		this.aFloat211 = arg2;
		this.aFloat213 = arg1;
		this.aFloat206 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat207 = 1.0F;
		this.aFloat205 = this.aFloat216 = Class6_Sub39_Sub1.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat215 = Class6_Sub39_Sub1.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat212 = -this.aFloat215;
		this.aFloat210 = this.aFloat208 = this.aFloat206 = this.aFloat209 = this.aFloat213 = this.aFloat214 = this.aFloat211 = 0.0F;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FIFF)F")
	public float method8197(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat210 * arg1 + arg2 * this.aFloat207 + arg0 * this.aFloat208 + this.aFloat206;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FFBF)V")
	public void method8198(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat216 = arg2;
		this.aFloat206 = 0.0F;
		this.aFloat209 = 0.0F;
		this.aFloat214 = 0.0F;
		this.aFloat207 = arg1;
		this.aFloat205 = arg0;
		this.aFloat210 = 0.0F;
		this.aFloat212 = 0.0F;
		this.aFloat208 = 0.0F;
		this.aFloat215 = 0.0F;
		this.aFloat213 = 0.0F;
		this.aFloat211 = 0.0F;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method8175() {
		@Pc(7) Class8_Sub3 local7 = new Class8_Sub3();
		local7.aFloat205 = this.aFloat205;
		local7.aFloat212 = this.aFloat212;
		local7.aFloat210 = this.aFloat210;
		local7.aFloat207 = this.aFloat207;
		local7.aFloat211 = this.aFloat211;
		local7.aFloat208 = this.aFloat208;
		local7.aFloat209 = this.aFloat209;
		local7.aFloat214 = this.aFloat214;
		local7.aFloat215 = this.aFloat215;
		local7.aFloat213 = this.aFloat213;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat216 = this.aFloat216;
		return local7;
	}

	@OriginalMember(owner = "client!ww", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub39_Sub1.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub39_Sub1.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub39_Sub1.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub39_Sub1.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub39_Sub1.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub39_Sub1.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat208 = local21 * local47 + local33 * -local27;
		this.aFloat210 = local9 * local39;
		this.aFloat209 = local39 * -local21 + local27 * local43;
		this.aFloat215 = -local15;
		this.aFloat205 = local33 * local9;
		this.aFloat214 = local27 * local9;
		this.aFloat207 = local33 * local21 + local47 * local27;
		this.aFloat212 = local43 * local21 + local27 * local39;
		this.aFloat216 = local21 * local9;
		this.aFloat213 = (float) -arg0 * this.aFloat209 - (float) arg1 * this.aFloat205 - (float) arg2 * this.aFloat212;
		this.aFloat206 = (float) -arg0 * this.aFloat207 - this.aFloat210 * (float) arg1 - (float) arg2 * this.aFloat208;
		this.aFloat211 = -(this.aFloat216 * (float) arg2) - (float) arg1 * this.aFloat215 + (float) -arg0 * this.aFloat214;
	}

	@OriginalMember(owner = "client!ww", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat210 = local6.aFloat210;
		this.aFloat214 = local6.aFloat214;
		this.aFloat212 = local6.aFloat212;
		this.aFloat209 = local6.aFloat209;
		this.aFloat216 = local6.aFloat216;
		this.aFloat211 = local6.aFloat211;
		this.aFloat206 = local6.aFloat206;
		this.aFloat215 = local6.aFloat215;
		this.aFloat205 = local6.aFloat205;
		this.aFloat207 = local6.aFloat207;
		this.aFloat208 = local6.aFloat208;
		this.aFloat213 = local6.aFloat213;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FIFIIIF)V")
	public void method8199(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat216 = 1.0F;
			this.aFloat209 = this.aFloat214 = this.aFloat210 = this.aFloat215 = this.aFloat208 = this.aFloat212 = 0.0F;
			this.aFloat205 = arg2 * 2;
			this.aFloat207 = arg3 * 2;
			this.aFloat211 = arg0;
			this.aFloat206 = (float) -arg3 + arg5;
			this.aFloat213 = (float) -arg2 + arg1;
			return;
		}
		@Pc(7) float local7 = Class6_Sub39_Sub1.aFloatArray58[arg4 & 0x3FFF];
		@Pc(13) float local13 = Class6_Sub39_Sub1.aFloatArray57[arg4 & 0x3FFF];
		this.aFloat205 = local7 * 2.0F * (float) arg2;
		this.aFloat210 = (float) arg2 * -2.0F * local13;
		this.aFloat216 = 1.0F;
		this.aFloat213 = (-0.5F * local13 - local7 * 0.5F) * (float) (arg2 * 2) + arg1;
		this.aFloat211 = arg0;
		this.aFloat206 = (local13 * 0.5F - local7 * 0.5F) * (float) (arg3 * 2) + arg5;
		this.aFloat207 = local7 * 2.0F * (float) arg3;
		this.aFloat209 = local13 * 2.0F * (float) arg3;
		this.aFloat214 = this.aFloat215 = this.aFloat208 = this.aFloat212 = 0.0F;
	}
}
