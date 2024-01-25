import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class118_Sub3 extends Class118 {

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!uw", name = "O", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!uw", name = "P", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!uw", name = "R", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!uw", name = "X", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!uw", name = "ab", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	public Class118_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B[F)[F")
	public float[] method6967(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat196;
		arg0[9] = this.aFloat186;
		arg0[1] = this.aFloat193;
		arg0[3] = this.aFloat194;
		arg0[8] = this.aFloat192;
		arg0[4] = this.aFloat195;
		arg0[6] = this.aFloat188;
		arg0[11] = this.aFloat187;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat191;
		arg0[10] = this.aFloat189;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat190;
		arg0[7] = this.aFloat185;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class118 method6964() {
		@Pc(7) Class118_Sub3 local7 = new Class118_Sub3();
		local7.aFloat187 = this.aFloat187;
		local7.aFloat196 = this.aFloat196;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat190 = this.aFloat190;
		return local7;
	}

	@OriginalMember(owner = "client!uw", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat185 = arg1;
		this.aFloat195 = this.aFloat192 = this.aFloat193 = this.aFloat186 = this.aFloat196 = this.aFloat188 = 0.0F;
		this.aFloat187 = arg2;
		this.aFloat191 = this.aFloat190 = this.aFloat189 = 1.0F;
		this.aFloat194 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(FFIF)F")
	public float method6968(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat188 + arg0 * this.aFloat195 + this.aFloat190 * arg2 + this.aFloat185;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IFFFF[F)V")
	public void method6969(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		@Pc(6) float local6 = -arg2;
		@Pc(10) float local10 = arg3 * local6;
		@Pc(14) float local14 = arg1 * local6;
		@Pc(18) float local18 = arg0 * local6;
		@Pc(36) float local36 = local18 * this.aFloat196 + local14 * this.aFloat193 + this.aFloat191 * local10 + this.aFloat194;
		@Pc(54) float local54 = this.aFloat195 * local10 + this.aFloat190 * local14 + local18 * this.aFloat188 + this.aFloat185;
		@Pc(72) float local72 = local10 * this.aFloat192 + this.aFloat186 * local14 + this.aFloat189 * local18 + this.aFloat187;
		arg4[0] = arg1 * this.aFloat193 + this.aFloat191 * arg3 + arg0 * this.aFloat196;
		arg4[1] = this.aFloat188 * arg0 + this.aFloat195 * arg3 + this.aFloat190 * arg1;
		arg4[2] = arg1 * this.aFloat186 + this.aFloat192 * arg3 + this.aFloat189 * arg0;
		arg4[3] = -(arg4[1] * local54 + arg4[0] * local36 + local72 * arg4[2]);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(FFBFFFFFFF)V")
	public void method6970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat196 = arg5;
		this.aFloat188 = arg0;
		this.aFloat187 = 0.0F;
		this.aFloat195 = arg2;
		this.aFloat193 = arg4;
		this.aFloat186 = arg6;
		this.aFloat191 = arg1;
		this.aFloat192 = arg7;
		this.aFloat194 = 0.0F;
		this.aFloat190 = arg8;
		this.aFloat185 = 0.0F;
		this.aFloat189 = arg3;
	}

	@OriginalMember(owner = "client!uw", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat194;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat185;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat187;
		arg0[2] = (int) (this.aFloat189 * local29 + this.aFloat188 * local20 + this.aFloat196 * local11);
		arg0[1] = (int) (local11 * this.aFloat193 + local20 * this.aFloat190 + local29 * this.aFloat186);
		arg0[0] = (int) (this.aFloat192 * local29 + this.aFloat195 * local20 + local11 * this.aFloat191);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZFFF)V")
	public void method6972(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat195 *= arg2;
		this.aFloat193 *= arg0;
		this.aFloat189 *= arg1;
		this.aFloat192 *= arg1;
		this.aFloat185 *= arg2;
		this.aFloat187 *= arg1;
		this.aFloat194 *= arg0;
		this.aFloat186 *= arg1;
		this.aFloat191 *= arg0;
		this.aFloat190 *= arg2;
		this.aFloat188 *= arg2;
		this.aFloat196 *= arg0;
	}

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class198.aFloatArray37[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class198.aFloatArray38[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat195;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat188;
		@Pc(27) float local27 = this.aFloat185;
		this.aFloat195 = local18 * local9 - this.aFloat192 * local15;
		this.aFloat190 = local21 * local9 - this.aFloat186 * local15;
		this.aFloat192 = local9 * this.aFloat192 + local18 * local15;
		this.aFloat186 = local21 * local15 + this.aFloat186 * local9;
		this.aFloat188 = local9 * local24 - this.aFloat189 * local15;
		this.aFloat185 = local9 * local27 - this.aFloat187 * local15;
		this.aFloat189 = local15 * local24 + this.aFloat189 * local9;
		this.aFloat187 = this.aFloat187 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([FI)[F")
	public float[] method6973(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat190;
		arg0[4] = this.aFloat193;
		arg0[12] = this.aFloat194;
		arg0[1] = this.aFloat195;
		arg0[0] = this.aFloat191;
		arg0[9] = this.aFloat188;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat189;
		arg0[2] = this.aFloat192;
		arg0[11] = 0.0F;
		arg0[14] = this.aFloat187;
		arg0[3] = 0.0F;
		arg0[6] = this.aFloat186;
		arg0[13] = this.aFloat185;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat196;
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method6974(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class118 arg1) {
		@Pc(6) Class118_Sub3 local6 = (Class118_Sub3) arg0;
		@Pc(9) Class118_Sub3 local9 = (Class118_Sub3) arg1;
		this.aFloat191 = local6.aFloat196 * local9.aFloat192 + local6.aFloat193 * local9.aFloat195 + local9.aFloat191 * local6.aFloat191;
		this.aFloat195 = local6.aFloat190 * local9.aFloat195 + local9.aFloat191 * local6.aFloat195 + local6.aFloat188 * local9.aFloat192;
		this.aFloat193 = local9.aFloat193 * local6.aFloat191 + local9.aFloat190 * local6.aFloat193 + local9.aFloat186 * local6.aFloat196;
		this.aFloat192 = local6.aFloat189 * local9.aFloat192 + local6.aFloat192 * local9.aFloat191 + local6.aFloat186 * local9.aFloat195;
		this.aFloat190 = local6.aFloat190 * local9.aFloat190 + local6.aFloat195 * local9.aFloat193 + local9.aFloat186 * local6.aFloat188;
		this.aFloat186 = local6.aFloat189 * local9.aFloat186 + local9.aFloat193 * local6.aFloat192 + local6.aFloat186 * local9.aFloat190;
		this.aFloat196 = local9.aFloat196 * local6.aFloat191 + local6.aFloat193 * local9.aFloat188 + local9.aFloat189 * local6.aFloat196;
		this.aFloat188 = local9.aFloat189 * local6.aFloat188 + local6.aFloat195 * local9.aFloat196 + local6.aFloat190 * local9.aFloat188;
		this.aFloat194 = local6.aFloat196 * local9.aFloat187 + local9.aFloat194 * local6.aFloat191 + local6.aFloat193 * local9.aFloat185 + local6.aFloat194;
		this.aFloat189 = local9.aFloat196 * local6.aFloat192 + local6.aFloat186 * local9.aFloat188 + local6.aFloat189 * local9.aFloat189;
		this.aFloat185 = local6.aFloat185 + local6.aFloat188 * local9.aFloat187 + local6.aFloat195 * local9.aFloat194 + local6.aFloat190 * local9.aFloat185;
		this.aFloat187 = local6.aFloat187 + local6.aFloat186 * local9.aFloat185 + local6.aFloat192 * local9.aFloat194 + local9.aFloat187 * local6.aFloat189;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(FFFI)V")
	public void method6975(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat191 = this.aFloat190 = this.aFloat189 = 1.0F;
		this.aFloat187 = arg0;
		this.aFloat194 = arg2;
		this.aFloat195 = this.aFloat192 = this.aFloat193 = this.aFloat186 = this.aFloat196 = this.aFloat188 = 0.0F;
		this.aFloat185 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IFIFIFI)V")
	public void method6976(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		if (arg2 == 0) {
			this.aFloat195 = this.aFloat192 = this.aFloat193 = this.aFloat186 = this.aFloat196 = this.aFloat188 = 0.0F;
			this.aFloat189 = 1.0F;
			this.aFloat190 = arg4 * 2;
			this.aFloat191 = arg0 * 2;
		} else {
			@Pc(15) float local15 = Class198.aFloatArray37[arg2 & 0x3FFF];
			@Pc(21) float local21 = Class198.aFloatArray38[arg2 & 0x3FFF];
			this.aFloat189 = 1.0F;
			this.aFloat192 = this.aFloat186 = this.aFloat196 = this.aFloat188 = 0.0F;
			this.aFloat190 = (float) arg4 * 2.0F * local15;
			this.aFloat195 = local21 * 2.0F * (float) arg0;
			this.aFloat191 = (float) arg0 * local15 * 2.0F;
			this.aFloat193 = (float) arg4 * local21 * -2.0F;
		}
		this.aFloat194 = arg3 - (float) arg0;
		this.aFloat185 = arg5 - (float) arg4;
		this.aFloat187 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IFFF)V")
	public void method6977(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat193 = 0.0F;
		this.aFloat186 = 0;
		this.aFloat187 = 0.0F;
		this.aFloat195 = 0.0F;
		this.aFloat191 = arg1;
		this.aFloat196 = 0.0F;
		this.aFloat190 = arg0;
		this.aFloat188 = 0.0F;
		this.aFloat192 = 0.0F;
		this.aFloat189 = arg2;
		this.aFloat185 = 0.0F;
		this.aFloat194 = 0.0F;
	}

	@OriginalMember(owner = "client!uw", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class118 arg0) {
		@Pc(6) Class118_Sub3 local6 = (Class118_Sub3) arg0;
		this.aFloat196 = local6.aFloat196;
		this.aFloat189 = local6.aFloat189;
		this.aFloat194 = local6.aFloat194;
		this.aFloat193 = local6.aFloat193;
		this.aFloat195 = local6.aFloat195;
		this.aFloat187 = local6.aFloat187;
		this.aFloat190 = local6.aFloat190;
		this.aFloat186 = local6.aFloat186;
		this.aFloat188 = local6.aFloat188;
		this.aFloat191 = local6.aFloat191;
		this.aFloat192 = local6.aFloat192;
		this.aFloat185 = local6.aFloat185;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
	public void method6978() {
		this.aFloat189 = -this.aFloat189;
		this.aFloat186 = -this.aFloat186;
		this.aFloat195 = -this.aFloat195;
		this.aFloat185 = -this.aFloat185;
		this.aFloat187 = -this.aFloat187;
		this.aFloat188 = -this.aFloat188;
		this.aFloat190 = -this.aFloat190;
		this.aFloat192 = -this.aFloat192;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(F[FFFI)V")
	public void method6979(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[2] = (float) (arg0 * this.aFloat192 + arg3 * this.aFloat186 + arg2 * this.aFloat189);
		arg1[0] = (float) (this.aFloat193 * arg3 + this.aFloat191 * arg0 + this.aFloat196 * arg2);
		arg1[1] = (float) (arg0 * this.aFloat195 + this.aFloat190 * arg3 + this.aFloat188 * arg2);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[F)[F")
	public float[] method6981(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat190;
		arg0[6] = this.aFloat188;
		arg0[1] = this.aFloat193;
		arg0[7] = this.aFloat185;
		arg0[2] = this.aFloat196;
		arg0[3] = this.aFloat194;
		arg0[0] = this.aFloat191;
		arg0[4] = this.aFloat195;
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class198.aFloatArray37[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class198.aFloatArray38[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class198.aFloatArray37[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class198.aFloatArray38[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class198.aFloatArray37[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class198.aFloatArray38[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat191 = local21 * local33 + local27 * local47;
		this.aFloat186 = -local15;
		this.aFloat193 = local39 * local9;
		this.aFloat190 = local33 * local9;
		this.aFloat189 = local9 * local21;
		this.aFloat192 = local9 * local27;
		this.aFloat196 = local47 * local21 + -local27 * local33;
		this.aFloat188 = local21 * local43 + local39 * local27;
		this.aFloat195 = local27 * local43 + -local21 * local39;
		this.aFloat194 = -(this.aFloat196 * (float) arg2) - (float) arg1 * this.aFloat193 + this.aFloat191 * (float) -arg0;
		this.aFloat185 = -((float) arg2 * this.aFloat188) + (float) -arg0 * this.aFloat195 - this.aFloat190 * (float) arg1;
		this.aFloat187 = (float) -arg0 * this.aFloat192 - (float) arg1 * this.aFloat186 - (float) arg2 * this.aFloat189;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!m;I)V")
	public void method6982(@OriginalArg(0) Class118 arg0) {
		@Pc(6) Class118_Sub3 local6 = (Class118_Sub3) arg0;
		this.aFloat191 = local6.aFloat191;
		this.aFloat196 = local6.aFloat192;
		this.aFloat193 = local6.aFloat195;
		this.aFloat190 = local6.aFloat190;
		this.aFloat195 = local6.aFloat193;
		this.aFloat188 = local6.aFloat186;
		this.aFloat192 = local6.aFloat196;
		this.aFloat186 = local6.aFloat188;
		this.aFloat189 = local6.aFloat189;
		this.aFloat194 = -(this.aFloat196 * local6.aFloat187 + this.aFloat193 * local6.aFloat185 + local6.aFloat194 * this.aFloat191);
		this.aFloat185 = -(local6.aFloat194 * this.aFloat195 + this.aFloat190 * local6.aFloat185 + this.aFloat188 * local6.aFloat187);
		this.aFloat187 = -(this.aFloat192 * local6.aFloat194 + this.aFloat186 * local6.aFloat185 + local6.aFloat187 * this.aFloat189);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(FFFI)F")
	public float method6983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat196 + this.aFloat193 * arg2 + this.aFloat191 * arg1 + this.aFloat194;
	}

	@OriginalMember(owner = "client!uw", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat191 = 1.0F;
		this.aFloat190 = this.aFloat189 = Class198.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat186 = Class198.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat188 = -this.aFloat186;
		this.aFloat193 = this.aFloat196 = this.aFloat194 = this.aFloat195 = this.aFloat185 = this.aFloat192 = this.aFloat187 = 0.0F;
	}

	@OriginalMember(owner = "client!uw", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat189 = 1.0F;
		this.aFloat191 = this.aFloat190 = Class198.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat195 = Class198.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat193 = -this.aFloat195;
		this.aFloat196 = this.aFloat194 = this.aFloat188 = this.aFloat185 = this.aFloat192 = this.aFloat186 = this.aFloat187 = 0.0F;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z[F)[F")
	public float[] method6984(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat193;
		arg0[5] = this.aFloat190;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[6] = 0.0F;
		arg0[8] = this.aFloat194;
		arg0[10] = this.aFloat187;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat191;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat195;
		arg0[9] = this.aFloat185;
		arg0[11] = 0.0F;
		arg0[14] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat195 + (float) arg1 * this.aFloat190 + (float) arg2 * this.aFloat188);
		arg3[2] = (int) (this.aFloat189 * (float) arg2 + this.aFloat192 * (float) arg0 + (float) arg1 * this.aFloat186);
		arg3[0] = (int) ((float) arg0 * this.aFloat191 + (float) arg1 * this.aFloat193 + (float) arg2 * this.aFloat196);
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(FFFI)V")
	public void method6985(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat185 += arg0;
		this.aFloat194 += arg1;
		this.aFloat187 += arg2;
	}

	@OriginalMember(owner = "client!uw", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class198.aFloatArray37[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class198.aFloatArray38[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat191;
		@Pc(21) float local21 = this.aFloat193;
		@Pc(24) float local24 = this.aFloat196;
		this.aFloat191 = this.aFloat192 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat194;
		this.aFloat193 = local21 * local9 + this.aFloat186 * local15;
		this.aFloat192 = local9 * this.aFloat192 - local18 * local15;
		this.aFloat186 = local9 * this.aFloat186 - local21 * local15;
		this.aFloat196 = local15 * this.aFloat189 + local9 * local24;
		this.aFloat189 = this.aFloat189 * local9 - local24 * local15;
		this.aFloat194 = local9 * local37 + local15 * this.aFloat187;
		this.aFloat187 = this.aFloat187 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!uw", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat195 = this.aFloat192 = this.aFloat193 = this.aFloat186 = this.aFloat196 = this.aFloat188 = this.aFloat194 = this.aFloat185 = this.aFloat187 = 0.0F;
		this.aFloat191 = this.aFloat190 = this.aFloat189 = 1.0F;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(FFFZ)F")
	public float method6986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat187 + arg2 * this.aFloat189 + this.aFloat186 * arg0 + arg1 * this.aFloat192;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!m;)V")
	public void method6987(@OriginalArg(1) Class118 arg0) {
		@Pc(6) Class118_Sub3 local6 = (Class118_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat191;
		@Pc(12) float local12 = this.aFloat195;
		@Pc(15) float local15 = this.aFloat193;
		@Pc(18) float local18 = this.aFloat190;
		@Pc(21) float local21 = this.aFloat196;
		@Pc(24) float local24 = this.aFloat188;
		@Pc(27) float local27 = this.aFloat194;
		this.aFloat195 = local6.aFloat188 * this.aFloat192 + local12 * local6.aFloat190 + local9 * local6.aFloat195;
		@Pc(47) float local47 = this.aFloat185;
		this.aFloat191 = local6.aFloat196 * this.aFloat192 + local12 * local6.aFloat193 + local6.aFloat191 * local9;
		this.aFloat192 = local6.aFloat186 * local12 + local6.aFloat192 * local9 + this.aFloat192 * local6.aFloat189;
		this.aFloat193 = local6.aFloat196 * this.aFloat186 + local6.aFloat193 * local18 + local6.aFloat191 * local15;
		this.aFloat190 = this.aFloat186 * local6.aFloat188 + local18 * local6.aFloat190 + local6.aFloat195 * local15;
		this.aFloat196 = local6.aFloat196 * this.aFloat189 + local24 * local6.aFloat193 + local21 * local6.aFloat191;
		this.aFloat186 = local18 * local6.aFloat186 + local15 * local6.aFloat192 + local6.aFloat189 * this.aFloat186;
		this.aFloat188 = local6.aFloat195 * local21 + local24 * local6.aFloat190 + this.aFloat189 * local6.aFloat188;
		this.aFloat185 = this.aFloat187 * local6.aFloat188 + local47 * local6.aFloat190 + local6.aFloat195 * local27 + local6.aFloat185;
		this.aFloat189 = local6.aFloat186 * local24 + local21 * local6.aFloat192 + this.aFloat189 * local6.aFloat189;
		this.aFloat194 = local6.aFloat193 * local47 + local6.aFloat191 * local27 + local6.aFloat196 * this.aFloat187 + local6.aFloat194;
		this.aFloat187 = local6.aFloat187 + this.aFloat187 * local6.aFloat189 + local27 * local6.aFloat192 + local6.aFloat186 * local47;
	}

	@OriginalMember(owner = "client!uw", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat187 += arg2;
		this.aFloat185 += arg1;
		this.aFloat194 += arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat196 + this.aFloat191 * (float) arg0 + (float) arg1 * this.aFloat193 + this.aFloat194);
		arg3[2] = (int) ((float) arg2 * this.aFloat189 + (float) arg1 * this.aFloat186 + this.aFloat192 * (float) arg0 + this.aFloat187);
		arg3[1] = (int) (this.aFloat185 + (float) arg2 * this.aFloat188 + this.aFloat195 * (float) arg0 + this.aFloat190 * (float) arg1);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(ILclient!m;)V")
	public void method6988(@OriginalArg(1) Class118 arg0) {
		@Pc(14) Class118_Sub3 local14 = (Class118_Sub3) arg0;
		this.aFloat187 = 0.0F;
		this.aFloat195 = local14.aFloat195;
		this.aFloat191 = local14.aFloat191;
		this.aFloat196 = local14.aFloat196;
		this.aFloat193 = local14.aFloat193;
		this.aFloat194 = 0.0F;
		this.aFloat185 = 0.0F;
		this.aFloat186 = local14.aFloat186;
		this.aFloat192 = local14.aFloat192;
		this.aFloat188 = local14.aFloat188;
		this.aFloat190 = local14.aFloat190;
		this.aFloat189 = local14.aFloat189;
	}

	@OriginalMember(owner = "client!uw", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat190 = 1.0F;
		this.aFloat191 = this.aFloat189 = Class198.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat196 = Class198.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat193 = this.aFloat194 = this.aFloat195 = this.aFloat188 = this.aFloat185 = this.aFloat186 = this.aFloat187 = 0.0F;
		this.aFloat192 = -this.aFloat196;
	}
}
