import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class205_Sub1 extends Class205 {

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "F")
	public float aFloat192;

	static {
		new Class67("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class205_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat187 + (float) arg0 * this.aFloat183 + (float) arg2 * this.aFloat182 + this.aFloat184);
		arg3[1] = (int) ((float) arg2 * this.aFloat190 + this.aFloat186 * (float) arg0 + (float) arg1 * this.aFloat189 + this.aFloat191);
		arg3[0] = (int) (this.aFloat188 + this.aFloat181 * (float) arg1 + (float) arg0 * this.aFloat192 + (float) arg2 * this.aFloat185);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method5217(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1) {
		@Pc(6) Class205_Sub1 local6 = (Class205_Sub1) arg0;
		@Pc(9) Class205_Sub1 local9 = (Class205_Sub1) arg1;
		this.aFloat192 = local9.aFloat183 * local6.aFloat185 + local6.aFloat192 * local9.aFloat192 + local6.aFloat181 * local9.aFloat186;
		this.aFloat186 = local9.aFloat192 * local6.aFloat186 + local9.aFloat186 * local6.aFloat189 + local6.aFloat190 * local9.aFloat183;
		this.aFloat181 = local9.aFloat189 * local6.aFloat181 + local6.aFloat192 * local9.aFloat181 + local6.aFloat185 * local9.aFloat187;
		this.aFloat183 = local9.aFloat183 * local6.aFloat182 + local9.aFloat192 * local6.aFloat183 + local6.aFloat187 * local9.aFloat186;
		this.aFloat189 = local9.aFloat187 * local6.aFloat190 + local6.aFloat189 * local9.aFloat189 + local9.aFloat181 * local6.aFloat186;
		this.aFloat185 = local6.aFloat185 * local9.aFloat182 + local6.aFloat181 * local9.aFloat190 + local9.aFloat185 * local6.aFloat192;
		this.aFloat187 = local9.aFloat181 * local6.aFloat183 + local6.aFloat187 * local9.aFloat189 + local9.aFloat187 * local6.aFloat182;
		this.aFloat190 = local9.aFloat182 * local6.aFloat190 + local9.aFloat190 * local6.aFloat189 + local6.aFloat186 * local9.aFloat185;
		this.aFloat188 = local9.aFloat188 * local6.aFloat192 + local9.aFloat191 * local6.aFloat181 + local9.aFloat184 * local6.aFloat185 + local6.aFloat188;
		this.aFloat182 = local9.aFloat182 * local6.aFloat182 + local9.aFloat190 * local6.aFloat187 + local9.aFloat185 * local6.aFloat183;
		this.aFloat191 = local9.aFloat191 * local6.aFloat189 + local9.aFloat188 * local6.aFloat186 + local9.aFloat184 * local6.aFloat190 + local6.aFloat191;
		this.aFloat184 = local6.aFloat183 * local9.aFloat188 + local9.aFloat191 * local6.aFloat187 + local6.aFloat182 * local9.aFloat184 + local6.aFloat184;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IFFF)F")
	public float method5218(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat181 * arg1 + arg0 * this.aFloat192 + this.aFloat185 * arg2 + this.aFloat188;
	}

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat188 += arg0;
		this.aFloat184 += arg2;
		this.aFloat191 += arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!q;B)V")
	public void method5220(@OriginalArg(0) Class205 arg0) {
		@Pc(6) Class205_Sub1 local6 = (Class205_Sub1) arg0;
		this.aFloat185 = local6.aFloat183;
		this.aFloat181 = local6.aFloat186;
		this.aFloat192 = local6.aFloat192;
		this.aFloat186 = local6.aFloat181;
		this.aFloat189 = local6.aFloat189;
		this.aFloat183 = local6.aFloat185;
		this.aFloat190 = local6.aFloat187;
		this.aFloat188 = -(this.aFloat185 * local6.aFloat184 + this.aFloat181 * local6.aFloat191 + this.aFloat192 * local6.aFloat188);
		this.aFloat182 = local6.aFloat182;
		this.aFloat187 = local6.aFloat190;
		this.aFloat191 = -(local6.aFloat188 * this.aFloat186 + this.aFloat189 * local6.aFloat191 + this.aFloat190 * local6.aFloat184);
		this.aFloat184 = -(this.aFloat182 * local6.aFloat184 + local6.aFloat188 * this.aFloat183 + local6.aFloat191 * this.aFloat187);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B[F)[F")
	public float[] method5221(@OriginalArg(1) float[] arg0) {
		arg0[7] = this.aFloat191;
		arg0[10] = this.aFloat182;
		arg0[3] = this.aFloat188;
		arg0[6] = this.aFloat190;
		arg0[0] = this.aFloat192;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat189;
		arg0[8] = this.aFloat183;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat181;
		arg0[2] = this.aFloat185;
		arg0[9] = this.aFloat187;
		arg0[11] = this.aFloat184;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat186;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([FFIFF)V")
	public void method5222(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[2] = arg2 * this.aFloat183 + this.aFloat187 * arg1 + arg3 * this.aFloat182;
		arg0[1] = this.aFloat190 * arg3 + this.aFloat189 * arg1 + arg2 * this.aFloat186;
		arg0[0] = this.aFloat185 * arg3 + this.aFloat192 * arg2 + this.aFloat181 * arg1;
	}

	@OriginalMember(owner = "client!nh", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat182 = 1.0F;
		this.aFloat192 = this.aFloat189 = Class291.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat186 = Class291.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat181 = -this.aFloat186;
		this.aFloat185 = this.aFloat188 = this.aFloat190 = this.aFloat191 = this.aFloat183 = this.aFloat187 = this.aFloat184 = 0.0F;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!q;)V")
	public void method5223(@OriginalArg(1) Class205 arg0) {
		@Pc(10) Class205_Sub1 local10 = (Class205_Sub1) arg0;
		@Pc(13) float local13 = this.aFloat192;
		@Pc(16) float local16 = this.aFloat186;
		@Pc(19) float local19 = this.aFloat181;
		@Pc(22) float local22 = this.aFloat189;
		@Pc(25) float local25 = this.aFloat185;
		@Pc(28) float local28 = this.aFloat190;
		@Pc(31) float local31 = this.aFloat188;
		this.aFloat186 = local10.aFloat190 * this.aFloat183 + local10.aFloat186 * local13 + local16 * local10.aFloat189;
		@Pc(51) float local51 = this.aFloat191;
		this.aFloat192 = local16 * local10.aFloat181 + local13 * local10.aFloat192 + this.aFloat183 * local10.aFloat185;
		this.aFloat181 = local10.aFloat185 * this.aFloat187 + local22 * local10.aFloat181 + local10.aFloat192 * local19;
		this.aFloat183 = local16 * local10.aFloat187 + local10.aFloat183 * local13 + this.aFloat183 * local10.aFloat182;
		this.aFloat189 = local10.aFloat190 * this.aFloat187 + local10.aFloat186 * local19 + local10.aFloat189 * local22;
		this.aFloat185 = local10.aFloat181 * local28 + local10.aFloat192 * local25 + local10.aFloat185 * this.aFloat182;
		this.aFloat187 = local10.aFloat182 * this.aFloat187 + local22 * local10.aFloat187 + local10.aFloat183 * local19;
		this.aFloat190 = local10.aFloat190 * this.aFloat182 + local25 * local10.aFloat186 + local10.aFloat189 * local28;
		this.aFloat188 = this.aFloat184 * local10.aFloat185 + local31 * local10.aFloat192 + local10.aFloat181 * local51 + local10.aFloat188;
		this.aFloat191 = local10.aFloat190 * this.aFloat184 + local31 * local10.aFloat186 + local51 * local10.aFloat189 + local10.aFloat191;
		this.aFloat182 = local10.aFloat183 * local25 + local10.aFloat187 * local28 + local10.aFloat182 * this.aFloat182;
		this.aFloat184 = local10.aFloat184 + local10.aFloat182 * this.aFloat184 + local51 * local10.aFloat187 + local31 * local10.aFloat183;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFBF)F")
	public float method5224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat184 + arg1 * this.aFloat183 + arg2 * this.aFloat187 + this.aFloat182 * arg0;
	}

	@OriginalMember(owner = "client!nh", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class205 arg0) {
		@Pc(6) Class205_Sub1 local6 = (Class205_Sub1) arg0;
		this.aFloat189 = local6.aFloat189;
		this.aFloat185 = local6.aFloat185;
		this.aFloat181 = local6.aFloat181;
		this.aFloat187 = local6.aFloat187;
		this.aFloat191 = local6.aFloat191;
		this.aFloat190 = local6.aFloat190;
		this.aFloat183 = local6.aFloat183;
		this.aFloat188 = local6.aFloat188;
		this.aFloat182 = local6.aFloat182;
		this.aFloat186 = local6.aFloat186;
		this.aFloat184 = local6.aFloat184;
		this.aFloat192 = local6.aFloat192;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFI)V")
	public void method5225(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat188 = arg1;
		this.aFloat186 = this.aFloat183 = this.aFloat181 = this.aFloat187 = this.aFloat185 = this.aFloat190 = 0.0F;
		this.aFloat191 = arg0;
		this.aFloat192 = this.aFloat189 = this.aFloat182 = 1;
		this.aFloat184 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[F)[F")
	public float[] method5226(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat187;
		arg0[0] = this.aFloat192;
		arg0[1] = this.aFloat186;
		arg0[9] = this.aFloat190;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat189;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[13] = this.aFloat191;
		arg0[14] = this.aFloat184;
		arg0[4] = this.aFloat181;
		arg0[8] = this.aFloat185;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat183;
		arg0[12] = this.aFloat188;
		arg0[10] = this.aFloat182;
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(FFFI)V")
	public void method5227(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat188 += arg0;
		this.aFloat184 += arg2;
		this.aFloat191 += arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFBFFF)V")
	public void method5228(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat186 = arg6;
		this.aFloat184 = 0.0F;
		this.aFloat181 = arg4;
		this.aFloat192 = arg8;
		this.aFloat183 = arg2;
		this.aFloat189 = arg7;
		this.aFloat185 = arg0;
		this.aFloat190 = arg3;
		this.aFloat187 = arg5;
		this.aFloat188 = 0.0F;
		this.aFloat182 = arg1;
		this.aFloat191 = 0.0F;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IFFF)V")
	public void method5229(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat186 *= arg1;
		this.aFloat184 *= arg2;
		this.aFloat183 *= arg2;
		this.aFloat192 *= arg0;
		this.aFloat189 *= arg1;
		this.aFloat181 *= arg0;
		this.aFloat182 *= arg2;
		this.aFloat191 *= arg1;
		this.aFloat190 *= arg1;
		this.aFloat188 *= arg0;
		this.aFloat185 *= arg0;
		this.aFloat187 *= arg2;
	}

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat186 = this.aFloat183 = this.aFloat181 = this.aFloat187 = this.aFloat185 = this.aFloat190 = this.aFloat188 = this.aFloat191 = this.aFloat184 = 0.0F;
		this.aFloat192 = this.aFloat189 = this.aFloat182 = 1.0F;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public void method5230() {
		this.aFloat187 = -this.aFloat187;
		this.aFloat183 = -this.aFloat183;
		this.aFloat190 = -this.aFloat190;
		this.aFloat186 = -this.aFloat186;
		this.aFloat182 = -this.aFloat182;
		this.aFloat184 = -this.aFloat184;
		this.aFloat189 = -this.aFloat189;
		this.aFloat191 = -this.aFloat191;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I[F)[F")
	public float[] method5233(@OriginalArg(1) float[] arg0) {
		arg0[6] = 0.0F;
		arg0[10] = this.aFloat184;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat191;
		arg0[8] = this.aFloat188;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat181;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat189;
		arg0[1] = this.aFloat186;
		arg0[15] = 1.0F;
		arg0[2] = 0.0F;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat192;
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat192 = this.aFloat189 = this.aFloat182 = 1.0F;
		this.aFloat188 = arg0;
		this.aFloat186 = this.aFloat183 = this.aFloat181 = this.aFloat187 = this.aFloat185 = this.aFloat190 = 0.0F;
		this.aFloat184 = arg2;
		this.aFloat191 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class291.aFloatArray70[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class291.aFloatArray71[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class291.aFloatArray70[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class291.aFloatArray71[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class291.aFloatArray70[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class291.aFloatArray71[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat192 = local21 * local33 + local47 * local27;
		this.aFloat185 = -local27 * local33 + local21 * local47;
		this.aFloat189 = local9 * local33;
		this.aFloat183 = local27 * local9;
		this.aFloat190 = local43 * local21 + local39 * local27;
		this.aFloat182 = local21 * local9;
		this.aFloat181 = local9 * local39;
		this.aFloat186 = local39 * -local21 + local43 * local27;
		this.aFloat187 = -local15;
		this.aFloat188 = this.aFloat192 * (float) -arg0 - this.aFloat181 * (float) arg1 - this.aFloat185 * (float) arg2;
		this.aFloat191 = this.aFloat186 * (float) -arg0 - this.aFloat189 * (float) arg1 - this.aFloat190 * (float) arg2;
		this.aFloat184 = -(this.aFloat182 * (float) arg2) + this.aFloat183 * (float) -arg0 - this.aFloat187 * (float) arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([FIFFFF)V")
	public void method5234(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(6) float local6 = -arg3;
		@Pc(10) float local10 = local6 * arg4;
		@Pc(14) float local14 = local6 * arg2;
		@Pc(18) float local18 = local6 * arg1;
		@Pc(44) float local44 = this.aFloat188 + local14 * this.aFloat181 + local10 * this.aFloat192 + this.aFloat185 * local18;
		@Pc(62) float local62 = local18 * this.aFloat190 + local14 * this.aFloat189 + this.aFloat186 * local10 + this.aFloat191;
		arg0[1] = arg2 * this.aFloat189 + arg4 * this.aFloat186 + arg1 * this.aFloat190;
		@Pc(97) float local97 = this.aFloat184 + this.aFloat182 * local18 + this.aFloat183 * local10 + local14 * this.aFloat187;
		arg0[2] = this.aFloat183 * arg4 + arg2 * this.aFloat187 + arg1 * this.aFloat182;
		arg0[0] = this.aFloat192 * arg4 + this.aFloat181 * arg2 + this.aFloat185 * arg1;
		arg0[3] = -(arg0[0] * local44 + arg0[1] * local62 + local97 * arg0[2]);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFIIIIF)V")
	public void method5235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat182 = 1.0F;
			this.aFloat189 = arg2 * 2;
			this.aFloat186 = this.aFloat183 = this.aFloat181 = this.aFloat187 = this.aFloat185 = this.aFloat190 = 0.0F;
			this.aFloat192 = arg4 * 2;
		} else {
			@Pc(42) float local42 = Class291.aFloatArray70[arg3 & 0x3FFF];
			@Pc(48) float local48 = Class291.aFloatArray71[arg3 & 0x3FFF];
			this.aFloat186 = local48 * 2.0F * (float) arg4;
			this.aFloat192 = local42 * 2.0F * (float) arg4;
			this.aFloat182 = 1.0F;
			this.aFloat183 = this.aFloat187 = this.aFloat185 = this.aFloat190 = 0.0F;
			this.aFloat181 = (float) arg2 * local48 * -2.0F;
			this.aFloat189 = local42 * 2.0F * (float) arg2;
		}
		this.aFloat184 = arg1;
		this.aFloat191 = arg5 - (float) arg2;
		this.aFloat188 = arg0 - (float) arg4;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([FI)[F")
	public float[] method5236(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat190;
		arg0[1] = this.aFloat181;
		arg0[3] = this.aFloat188;
		arg0[2] = this.aFloat185;
		arg0[5] = this.aFloat189;
		arg0[4] = this.aFloat186;
		arg0[7] = this.aFloat191;
		arg0[0] = this.aFloat192;
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat188;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat191;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat184;
		arg0[1] = (int) (local29 * this.aFloat187 + local21 * this.aFloat189 + this.aFloat181 * local12);
		arg0[0] = (int) (local21 * this.aFloat186 + local12 * this.aFloat192 + local29 * this.aFloat183);
		arg0[2] = (int) (local29 * this.aFloat182 + local21 * this.aFloat190 + local12 * this.aFloat185);
	}

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class291.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class291.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat186;
		@Pc(21) float local21 = this.aFloat189;
		@Pc(24) float local24 = this.aFloat190;
		this.aFloat186 = local18 * local9 - this.aFloat183 * local15;
		@Pc(37) float local37 = this.aFloat191;
		this.aFloat189 = local21 * local9 - local15 * this.aFloat187;
		this.aFloat183 = local9 * this.aFloat183 + local15 * local18;
		this.aFloat190 = local9 * local24 - this.aFloat182 * local15;
		this.aFloat187 = local15 * local21 + local9 * this.aFloat187;
		this.aFloat182 = this.aFloat182 * local9 + local15 * local24;
		this.aFloat191 = local9 * local37 - local15 * this.aFloat184;
		this.aFloat184 = this.aFloat184 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class291.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class291.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat192;
		@Pc(21) float local21 = this.aFloat181;
		@Pc(24) float local24 = this.aFloat185;
		@Pc(27) float local27 = this.aFloat188;
		this.aFloat192 = this.aFloat183 * local15 + local18 * local9;
		this.aFloat183 = local9 * this.aFloat183 - local18 * local15;
		this.aFloat181 = this.aFloat187 * local15 + local21 * local9;
		this.aFloat185 = local9 * local24 + local15 * this.aFloat182;
		this.aFloat187 = this.aFloat187 * local9 - local21 * local15;
		this.aFloat182 = local9 * this.aFloat182 - local24 * local15;
		this.aFloat188 = this.aFloat184 * local15 + local9 * local27;
		this.aFloat184 = this.aFloat184 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FIFF)F")
	public float method5237(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat190 * arg1 + arg0 * this.aFloat189 + arg2 * this.aFloat186 + this.aFloat191;
	}

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat185 * (float) arg2 + (float) arg0 * this.aFloat192 + (float) arg1 * this.aFloat181);
		arg3[2] = (int) (this.aFloat182 * (float) arg2 + this.aFloat183 * (float) arg0 + this.aFloat187 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat190 + (float) arg1 * this.aFloat189 + (float) arg0 * this.aFloat186);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!q;B)V")
	public void method5238(@OriginalArg(0) Class205 arg0) {
		@Pc(6) Class205_Sub1 local6 = (Class205_Sub1) arg0;
		this.aFloat191 = 0.0F;
		this.aFloat184 = 0.0F;
		this.aFloat187 = local6.aFloat187;
		this.aFloat190 = local6.aFloat190;
		this.aFloat189 = local6.aFloat189;
		this.aFloat188 = 0.0F;
		this.aFloat182 = local6.aFloat182;
		this.aFloat183 = local6.aFloat183;
		this.aFloat185 = local6.aFloat185;
		this.aFloat181 = local6.aFloat181;
		this.aFloat186 = local6.aFloat186;
		this.aFloat192 = local6.aFloat192;
	}

	@OriginalMember(owner = "client!nh", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat192 = 1.0F;
		this.aFloat189 = this.aFloat182 = Class291.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat187 = Class291.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat181 = this.aFloat185 = this.aFloat188 = this.aFloat186 = this.aFloat191 = this.aFloat183 = this.aFloat184 = 0.0F;
		this.aFloat190 = -this.aFloat187;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7801() {
		@Pc(7) Class205_Sub1 local7 = new Class205_Sub1();
		local7.aFloat192 = this.aFloat192;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat183 = this.aFloat183;
		return local7;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat189 = 1.0F;
		this.aFloat192 = this.aFloat182 = Class291.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat185 = Class291.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat181 = this.aFloat188 = this.aFloat186 = this.aFloat190 = this.aFloat191 = this.aFloat187 = this.aFloat184 = 0.0F;
		this.aFloat183 = -this.aFloat185;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFIF)V")
	public void method5240(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat182 = arg0;
		this.aFloat185 = 0.0F;
		this.aFloat191 = 0.0F;
		this.aFloat184 = 0.0F;
		this.aFloat181 = 0.0F;
		this.aFloat187 = 0.0F;
		this.aFloat183 = 0.0F;
		this.aFloat190 = 0.0F;
		this.aFloat188 = 0.0F;
		this.aFloat189 = arg2;
		this.aFloat186 = 0.0F;
		this.aFloat192 = arg1;
	}
}
