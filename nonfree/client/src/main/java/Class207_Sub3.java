import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class207_Sub3 extends Class207 {

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!uf", name = "X", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!uf", name = "Z", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!uf", name = "eb", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!uf", name = "fb", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class207_Sub3() {
		this.method8204();
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
	@Override
	public void method8213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat194;
		@Pc(21) float local21 = this.aFloat184;
		@Pc(24) float local24 = this.aFloat186;
		this.aFloat194 = local15 * this.aFloat191 + local9 * local18;
		@Pc(37) float local37 = this.aFloat193;
		this.aFloat184 = local9 * local21 + local15 * this.aFloat192;
		this.aFloat191 = this.aFloat191 * local9 - local15 * local18;
		this.aFloat186 = local15 * this.aFloat183 + local9 * local24;
		this.aFloat192 = local9 * this.aFloat192 - local21 * local15;
		this.aFloat183 = this.aFloat183 * local9 - local15 * local24;
		this.aFloat193 = local9 * local37 + local15 * this.aFloat188;
		this.aFloat188 = this.aFloat188 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void method8202(@OriginalArg(0) int arg0) {
		this.aFloat194 = 1.0F;
		this.aFloat187 = this.aFloat183 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat192 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat184 = this.aFloat186 = this.aFloat193 = this.aFloat190 = this.aFloat189 = this.aFloat191 = this.aFloat188 = 0.0F;
		this.aFloat185 = -this.aFloat192;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IFFF)V")
	public void method8215(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat193 += arg1;
		this.aFloat188 += arg0;
		this.aFloat189 += arg2;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	@Override
	public void method8207(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat194;
		@Pc(21) float local21 = this.aFloat184;
		@Pc(24) float local24 = this.aFloat186;
		this.aFloat194 = local18 * local9 - local15 * this.aFloat190;
		@Pc(38) float local38 = this.aFloat193;
		this.aFloat184 = local21 * local9 - local15 * this.aFloat187;
		this.aFloat190 = local18 * local15 + this.aFloat190 * local9;
		this.aFloat186 = local9 * local24 - this.aFloat185 * local15;
		this.aFloat187 = local15 * local21 + local9 * this.aFloat187;
		this.aFloat193 = local38 * local9 - local15 * this.aFloat189;
		this.aFloat185 = local24 * local15 + this.aFloat185 * local9;
		this.aFloat189 = local9 * this.aFloat189 + local15 * local38;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FB[FFF)V")
	public void method8216(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = arg2 * this.aFloat185 + arg3 * this.aFloat187 + this.aFloat190 * arg0;
		arg1[0] = this.aFloat184 * arg3 + arg0 * this.aFloat194 + this.aFloat186 * arg2;
		arg1[2] = this.aFloat183 * arg2 + arg3 * this.aFloat192 + arg0 * this.aFloat191;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[F)[F")
	public float[] method8217(@OriginalArg(1) float[] arg0) {
		arg0[3] = this.aFloat193;
		arg0[1] = this.aFloat184;
		arg0[0] = this.aFloat194;
		arg0[7] = this.aFloat189;
		arg0[4] = this.aFloat190;
		arg0[6] = this.aFloat185;
		arg0[5] = this.aFloat187;
		arg0[2] = this.aFloat186;
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFBF)F")
	public float method8218(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat193 + this.aFloat186 * arg0 + this.aFloat194 * arg2 + this.aFloat184 * arg1;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0) {
		this.aFloat183 = 1.0F;
		this.aFloat194 = this.aFloat187 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat190 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat186 = this.aFloat193 = this.aFloat185 = this.aFloat189 = this.aFloat191 = this.aFloat192 = this.aFloat188 = 0.0F;
		this.aFloat184 = -this.aFloat190;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFFZ[FF)V")
	public void method8219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[1] = arg0 * this.aFloat185 + this.aFloat187 * arg2 + this.aFloat190 * arg1;
		arg3[2] = this.aFloat183 * arg0 + this.aFloat192 * arg2 + arg1 * this.aFloat191;
		arg3[0] = this.aFloat184 * arg2 + arg1 * this.aFloat194 + arg0 * this.aFloat186;
		@Pc(91) float local91;
		@Pc(83) float local83;
		@Pc(99) float local99;
		@Pc(75) float local75;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local75 = -arg4 / arg1;
			local83 = local75 * this.aFloat190 + this.aFloat189;
			local91 = this.aFloat194 * local75 + this.aFloat193;
			local99 = this.aFloat188 + local75 * this.aFloat191;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local75 = -arg4 / arg2;
			local91 = this.aFloat184 * local75 + this.aFloat193;
			local99 = local75 * this.aFloat192 + this.aFloat188;
			local83 = this.aFloat189 + local75 * this.aFloat187;
		} else {
			local75 = -arg4 / arg0;
			local91 = this.aFloat193 + this.aFloat186 * local75;
			local99 = local75 * this.aFloat183 + this.aFloat188;
			local83 = this.aFloat185 * local75 + this.aFloat189;
		}
		arg3[3] = -(arg3[1] * local83 + local91 * arg3[0] + local99 * arg3[2]);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat188 += (float) arg2;
		this.aFloat189 += (float) arg1;
		this.aFloat193 += (float) arg0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
	@Override
	public void method8212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat193 = (float) arg0;
		this.aFloat188 = (float) arg2;
		this.aFloat194 = this.aFloat187 = this.aFloat183 = 1.0F;
		this.aFloat189 = (float) arg1;
		this.aFloat190 = this.aFloat191 = this.aFloat184 = this.aFloat192 = this.aFloat186 = this.aFloat185 = 0.0F;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FIIFFII)V")
	public void method8220(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat183 = 1.0F;
			this.aFloat189 = arg4 - (float) arg1;
			this.aFloat194 = (float) (arg2 * 2);
			this.aFloat190 = this.aFloat191 = this.aFloat184 = this.aFloat192 = this.aFloat186 = this.aFloat185 = 0.0F;
			this.aFloat187 = (float) (arg1 * 2);
			this.aFloat193 = (float) -arg2 + arg3;
			this.aFloat188 = arg0;
			return;
		}
		@Pc(12) float local12 = Class2_Sub9.aFloatArray58[arg5 & 0x3FFF];
		@Pc(18) float local18 = Class2_Sub9.aFloatArray57[arg5 & 0x3FFF];
		this.aFloat190 = local18 * 2.0F * (float) arg2;
		this.aFloat183 = 1.0F;
		this.aFloat187 = local12 * 2.0F * (float) arg1;
		this.aFloat193 = arg3 + (local18 * 0.5F - local12 * 0.5F) * (float) (arg2 * 2);
		this.aFloat194 = (float) arg2 * local12 * 2.0F;
		this.aFloat191 = this.aFloat192 = this.aFloat186 = this.aFloat185 = 0.0F;
		this.aFloat188 = arg0;
		this.aFloat189 = (-0.5F * local18 - local12 * 0.5F) * (float) (arg1 * 2) + arg4;
		this.aFloat184 = -2.0F * local18 * (float) arg1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub9.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub9.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub9.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub9.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat187 = local33 * local9;
		this.aFloat186 = local33 * -local27 + local21 * local47;
		this.aFloat185 = local39 * local27 + local21 * local43;
		this.aFloat191 = local27 * local9;
		this.aFloat183 = local9 * local21;
		this.aFloat190 = local39 * -local21 + local27 * local43;
		this.aFloat194 = local47 * local27 + local21 * local33;
		this.aFloat192 = -local15;
		this.aFloat184 = local9 * local39;
		this.aFloat193 = -((float) arg2 * this.aFloat186) - (float) arg1 * this.aFloat184 + this.aFloat194 * (float) -arg0;
		this.aFloat188 = -(this.aFloat192 * (float) arg1) + this.aFloat191 * (float) -arg0 - this.aFloat183 * (float) arg2;
		this.aFloat189 = -((float) arg1 * this.aFloat187) + (float) -arg0 * this.aFloat190 - this.aFloat185 * (float) arg2;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!oo;I)V")
	public void method8221(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub3 local6 = (Class207_Sub3) arg0;
		this.aFloat185 = local6.aFloat185;
		this.aFloat187 = local6.aFloat187;
		this.aFloat194 = local6.aFloat194;
		this.aFloat184 = local6.aFloat184;
		this.aFloat192 = local6.aFloat192;
		this.aFloat189 = 0.0F;
		this.aFloat186 = local6.aFloat186;
		this.aFloat190 = local6.aFloat190;
		this.aFloat193 = 0.0F;
		this.aFloat188 = 0.0F;
		this.aFloat183 = local6.aFloat183;
		this.aFloat191 = local6.aFloat191;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IFFFFFFFFF)V")
	public void method8222(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat187 = arg2;
		this.aFloat191 = arg1;
		this.aFloat193 = 0.0F;
		this.aFloat186 = arg0;
		this.aFloat184 = arg5;
		this.aFloat189 = 0.0F;
		this.aFloat192 = arg8;
		this.aFloat188 = 0.0F;
		this.aFloat190 = arg7;
		this.aFloat185 = arg4;
		this.aFloat183 = arg3;
		this.aFloat194 = arg6;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	@Override
	public void method8214(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat190;
		@Pc(21) float local21 = this.aFloat187;
		@Pc(24) float local24 = this.aFloat185;
		@Pc(27) float local27 = this.aFloat189;
		this.aFloat190 = local18 * local9 - local15 * this.aFloat191;
		this.aFloat187 = local9 * local21 - local15 * this.aFloat192;
		this.aFloat191 = local9 * this.aFloat191 + local18 * local15;
		this.aFloat192 = local21 * local15 + this.aFloat192 * local9;
		this.aFloat185 = local9 * local24 - local15 * this.aFloat183;
		this.aFloat189 = local9 * local27 - local15 * this.aFloat188;
		this.aFloat183 = local15 * local24 + local9 * this.aFloat183;
		this.aFloat188 = this.aFloat188 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!oo;Lclient!oo;)V")
	public void method8223(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1) {
		@Pc(6) Class207_Sub3 local6 = (Class207_Sub3) arg0;
		@Pc(9) Class207_Sub3 local9 = (Class207_Sub3) arg1;
		this.aFloat194 = local9.aFloat191 * local6.aFloat186 + local9.aFloat194 * local6.aFloat194 + local6.aFloat184 * local9.aFloat190;
		this.aFloat190 = local9.aFloat190 * local6.aFloat187 + local9.aFloat194 * local6.aFloat190 + local9.aFloat191 * local6.aFloat185;
		this.aFloat191 = local6.aFloat192 * local9.aFloat190 + local9.aFloat194 * local6.aFloat191 + local9.aFloat191 * local6.aFloat183;
		this.aFloat184 = local9.aFloat184 * local6.aFloat194 + local9.aFloat187 * local6.aFloat184 + local9.aFloat192 * local6.aFloat186;
		this.aFloat187 = local6.aFloat187 * local9.aFloat187 + local6.aFloat190 * local9.aFloat184 + local9.aFloat192 * local6.aFloat185;
		this.aFloat186 = local9.aFloat183 * local6.aFloat186 + local6.aFloat194 * local9.aFloat186 + local6.aFloat184 * local9.aFloat185;
		this.aFloat192 = local9.aFloat192 * local6.aFloat183 + local9.aFloat184 * local6.aFloat191 + local9.aFloat187 * local6.aFloat192;
		this.aFloat185 = local6.aFloat185 * local9.aFloat183 + local6.aFloat190 * local9.aFloat186 + local6.aFloat187 * local9.aFloat185;
		this.aFloat193 = local9.aFloat188 * local6.aFloat186 + local6.aFloat184 * local9.aFloat189 + local6.aFloat194 * local9.aFloat193 + local6.aFloat193;
		this.aFloat183 = local6.aFloat192 * local9.aFloat185 + local9.aFloat186 * local6.aFloat191 + local6.aFloat183 * local9.aFloat183;
		this.aFloat189 = local6.aFloat189 + local9.aFloat193 * local6.aFloat190 + local9.aFloat189 * local6.aFloat187 + local6.aFloat185 * local9.aFloat188;
		this.aFloat188 = local6.aFloat188 + local6.aFloat192 * local9.aFloat189 + local9.aFloat193 * local6.aFloat191 + local9.aFloat188 * local6.aFloat183;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat189);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat188);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat193);
		arg3[2] = (int) (this.aFloat186 * (float) local24 + this.aFloat185 * (float) local6 + (float) local17 * this.aFloat183);
		arg3[1] = (int) ((float) local17 * this.aFloat192 + (float) local24 * this.aFloat184 + (float) local6 * this.aFloat187);
		arg3[0] = (int) (this.aFloat190 * (float) local6 + this.aFloat194 * (float) local24 + this.aFloat191 * (float) local17);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
	public void method8225() {
		this.aFloat190 = -this.aFloat190;
		this.aFloat183 = -this.aFloat183;
		this.aFloat188 = -this.aFloat188;
		this.aFloat185 = -this.aFloat185;
		this.aFloat189 = -this.aFloat189;
		this.aFloat191 = -this.aFloat191;
		this.aFloat192 = -this.aFloat192;
		this.aFloat187 = -this.aFloat187;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat191 * (float) arg0 + (float) arg1 * this.aFloat192 + this.aFloat183 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat186 + (float) arg0 * this.aFloat194 + this.aFloat184 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat185 + (float) arg0 * this.aFloat190 + this.aFloat187 * (float) arg1);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
	@Override
	public void method8204() {
		this.aFloat194 = this.aFloat187 = this.aFloat183 = 1.0F;
		this.aFloat190 = this.aFloat191 = this.aFloat184 = this.aFloat192 = this.aFloat186 = this.aFloat185 = this.aFloat193 = this.aFloat189 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFFB)F")
	public float method8226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat183 * arg1 + this.aFloat192 * arg0 + this.aFloat191 * arg2 + this.aFloat188;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!oo;)V")
	public void method8228(@OriginalArg(1) Class207 arg0) {
		@Pc(6) Class207_Sub3 local6 = (Class207_Sub3) arg0;
		this.aFloat186 = local6.aFloat191;
		this.aFloat194 = local6.aFloat194;
		this.aFloat184 = local6.aFloat190;
		this.aFloat187 = local6.aFloat187;
		this.aFloat191 = local6.aFloat186;
		this.aFloat185 = local6.aFloat192;
		this.aFloat190 = local6.aFloat184;
		this.aFloat183 = local6.aFloat183;
		this.aFloat193 = -(local6.aFloat189 * this.aFloat184 + this.aFloat194 * local6.aFloat193 + local6.aFloat188 * this.aFloat186);
		this.aFloat192 = local6.aFloat185;
		this.aFloat189 = -(this.aFloat185 * local6.aFloat188 + local6.aFloat193 * this.aFloat190 + local6.aFloat189 * this.aFloat187);
		this.aFloat188 = -(local6.aFloat189 * this.aFloat192 + local6.aFloat193 * this.aFloat191 + local6.aFloat188 * this.aFloat183);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IFFF)V")
	public void method8229(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat186 *= arg1;
		this.aFloat184 *= arg1;
		this.aFloat187 *= arg0;
		this.aFloat192 *= arg2;
		this.aFloat194 *= arg1;
		this.aFloat183 *= arg2;
		this.aFloat191 *= arg2;
		this.aFloat185 *= arg0;
		this.aFloat193 *= arg1;
		this.aFloat188 *= arg2;
		this.aFloat190 *= arg0;
		this.aFloat189 *= arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([FI)[F")
	public float[] method8230(@OriginalArg(0) float[] arg0) {
		arg0[11] = this.aFloat188;
		arg0[2] = this.aFloat186;
		arg0[8] = this.aFloat191;
		arg0[5] = this.aFloat187;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat185;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat183;
		arg0[0] = this.aFloat194;
		arg0[12] = 0.0F;
		arg0[3] = this.aFloat193;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat192;
		arg0[7] = this.aFloat189;
		arg0[4] = this.aFloat190;
		arg0[1] = this.aFloat184;
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([I)V")
	@Override
	public void method8196(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat193;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat189;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat188;
		arg0[2] = (int) (local12 * this.aFloat186 + local20 * this.aFloat185 + local29 * this.aFloat183);
		arg0[1] = (int) (local12 * this.aFloat184 + local20 * this.aFloat187 + local29 * this.aFloat192);
		arg0[0] = (int) (local29 * this.aFloat191 + local20 * this.aFloat190 + this.aFloat194 * local12);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8211(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub3 local6 = (Class207_Sub3) arg0;
		this.aFloat192 = local6.aFloat192;
		this.aFloat189 = local6.aFloat189;
		this.aFloat194 = local6.aFloat194;
		this.aFloat193 = local6.aFloat193;
		this.aFloat185 = local6.aFloat185;
		this.aFloat188 = local6.aFloat188;
		this.aFloat186 = local6.aFloat186;
		this.aFloat183 = local6.aFloat183;
		this.aFloat191 = local6.aFloat191;
		this.aFloat187 = local6.aFloat187;
		this.aFloat184 = local6.aFloat184;
		this.aFloat190 = local6.aFloat190;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(FFFB)F")
	public float method8232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat189 + this.aFloat185 * arg1 + arg2 * this.aFloat190 + this.aFloat187 * arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B[F)[F")
	public float[] method8233(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat194;
		arg0[8] = this.aFloat191;
		arg0[10] = this.aFloat183;
		arg0[9] = this.aFloat192;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat185;
		arg0[4] = this.aFloat190;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat184;
		arg0[14] = 0.0F;
		arg0[15] = 0.0F;
		arg0[2] = this.aFloat186;
		arg0[5] = this.aFloat187;
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([FB)[F")
	public float[] method8234(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat194;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat188;
		arg0[15] = 1.0F;
		arg0[9] = this.aFloat189;
		arg0[13] = 0.0F;
		arg0[2] = 0.0F;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[6] = 0.0F;
		arg0[14] = 0.0F;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat190;
		arg0[4] = this.aFloat184;
		arg0[5] = this.aFloat187;
		arg0[8] = this.aFloat193;
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FIFF)V")
	public void method8235(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat194 = this.aFloat187 = this.aFloat183 = 1.0F;
		this.aFloat188 = arg0;
		this.aFloat189 = arg1;
		this.aFloat193 = arg2;
		this.aFloat190 = this.aFloat191 = this.aFloat184 = this.aFloat192 = this.aFloat186 = this.aFloat185 = 0.0F;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z[F)[F")
	public float[] method8236(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat192;
		arg0[5] = this.aFloat187;
		arg0[11] = 0.0F;
		arg0[12] = this.aFloat193;
		arg0[1] = this.aFloat190;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat189;
		arg0[9] = this.aFloat185;
		arg0[0] = this.aFloat194;
		arg0[4] = this.aFloat184;
		arg0[7] = 0.0F;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat183;
		arg0[8] = this.aFloat186;
		arg0[2] = this.aFloat191;
		arg0[14] = this.aFloat188;
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!oo;I)V")
	public void method8237(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub3 local6 = (Class207_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat194;
		@Pc(12) float local12 = this.aFloat190;
		@Pc(15) float local15 = this.aFloat184;
		@Pc(18) float local18 = this.aFloat187;
		@Pc(21) float local21 = this.aFloat186;
		@Pc(24) float local24 = this.aFloat185;
		@Pc(27) float local27 = this.aFloat193;
		@Pc(30) float local30 = this.aFloat189;
		this.aFloat190 = this.aFloat191 * local6.aFloat185 + local9 * local6.aFloat190 + local12 * local6.aFloat187;
		this.aFloat194 = local6.aFloat194 * local9 + local6.aFloat184 * local12 + local6.aFloat186 * this.aFloat191;
		this.aFloat184 = local6.aFloat184 * local18 + local15 * local6.aFloat194 + local6.aFloat186 * this.aFloat192;
		this.aFloat187 = this.aFloat192 * local6.aFloat185 + local18 * local6.aFloat187 + local6.aFloat190 * local15;
		this.aFloat191 = local6.aFloat183 * this.aFloat191 + local12 * local6.aFloat192 + local9 * local6.aFloat191;
		this.aFloat186 = local24 * local6.aFloat184 + local6.aFloat194 * local21 + this.aFloat183 * local6.aFloat186;
		this.aFloat192 = this.aFloat192 * local6.aFloat183 + local18 * local6.aFloat192 + local15 * local6.aFloat191;
		this.aFloat185 = local6.aFloat187 * local24 + local6.aFloat190 * local21 + this.aFloat183 * local6.aFloat185;
		this.aFloat193 = local6.aFloat193 + local6.aFloat186 * this.aFloat188 + local6.aFloat194 * local27 + local30 * local6.aFloat184;
		this.aFloat189 = local6.aFloat189 + local6.aFloat190 * local27 + local6.aFloat187 * local30 + local6.aFloat185 * this.aFloat188;
		this.aFloat183 = this.aFloat183 * local6.aFloat183 + local6.aFloat191 * local21 + local24 * local6.aFloat192;
		this.aFloat188 = local6.aFloat188 + this.aFloat188 * local6.aFloat183 + local6.aFloat192 * local30 + local27 * local6.aFloat191;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method8199() {
		@Pc(7) Class207_Sub3 local7 = new Class207_Sub3();
		local7.aFloat193 = this.aFloat193;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat183 = this.aFloat183;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat186 = this.aFloat186;
		return local7;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0) {
		this.aFloat187 = 1.0F;
		this.aFloat194 = this.aFloat183 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat186 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat184 = this.aFloat193 = this.aFloat190 = this.aFloat185 = this.aFloat189 = this.aFloat192 = this.aFloat188 = 0.0F;
		this.aFloat191 = -this.aFloat186;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat188 + this.aFloat183 * (float) arg2 + (float) arg0 * this.aFloat191 + (float) arg1 * this.aFloat192);
		arg3[0] = (int) (this.aFloat186 * (float) arg2 + this.aFloat194 * (float) arg0 + (float) arg1 * this.aFloat184 + this.aFloat193);
		arg3[1] = (int) (this.aFloat185 * (float) arg2 + this.aFloat190 * (float) arg0 + (float) arg1 * this.aFloat187 + this.aFloat189);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFFI)V")
	public void method8239(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat192 = 0.0F;
		this.aFloat190 = 0.0F;
		this.aFloat186 = 0.0F;
		this.aFloat184 = 0.0F;
		this.aFloat194 = arg0;
		this.aFloat189 = 0.0F;
		this.aFloat183 = arg2;
		this.aFloat188 = 0.0F;
		this.aFloat185 = 0.0F;
		this.aFloat187 = arg1;
		this.aFloat191 = 0.0F;
		this.aFloat193 = 0.0F;
	}
}
