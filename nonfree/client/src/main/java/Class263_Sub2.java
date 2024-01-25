import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class263_Sub2 extends Class263 {

	@OriginalMember(owner = "client!q", name = "M", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!q", name = "U", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!q", name = "R", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class263_Sub2() {
		this.method8432();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat170 += (float) arg1;
		this.aFloat176 += (float) arg0;
		this.aFloat174 += (float) arg2;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([I)V")
	@Override
	public void method8443(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat176;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat170;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat174;
		arg0[2] = (int) (local19 * this.aFloat165 + this.aFloat175 * local11 + local27 * this.aFloat167);
		arg0[0] = (int) (local11 * this.aFloat173 + local19 * this.aFloat171 + local27 * this.aFloat172);
		arg0[1] = (int) (this.aFloat168 * local27 + local19 * this.aFloat166 + local11 * this.aFloat169);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method8434() {
		@Pc(7) Class263_Sub2 local7 = new Class263_Sub2();
		local7.aFloat173 = this.aFloat173;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat176 = this.aFloat176;
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(FFFB)V")
	public void method7276(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat169 = 0.0F;
		this.aFloat170 = 0.0F;
		this.aFloat165 = 0.0F;
		this.aFloat174 = 0.0F;
		this.aFloat172 = 0.0F;
		this.aFloat173 = arg2;
		this.aFloat168 = 0.0F;
		this.aFloat176 = 0.0F;
		this.aFloat175 = 0.0F;
		this.aFloat171 = 0.0F;
		this.aFloat166 = arg1;
		this.aFloat167 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!rd;Lclient!rd;)V")
	public void method7277(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class263 arg1) {
		@Pc(6) Class263_Sub2 local6 = (Class263_Sub2) arg0;
		@Pc(9) Class263_Sub2 local9 = (Class263_Sub2) arg1;
		this.aFloat173 = local9.aFloat172 * local6.aFloat175 + local6.aFloat173 * local9.aFloat173 + local6.aFloat169 * local9.aFloat171;
		this.aFloat171 = local6.aFloat166 * local9.aFloat171 + local9.aFloat173 * local6.aFloat171 + local6.aFloat165 * local9.aFloat172;
		this.aFloat169 = local6.aFloat175 * local9.aFloat168 + local9.aFloat169 * local6.aFloat173 + local9.aFloat166 * local6.aFloat169;
		this.aFloat172 = local9.aFloat171 * local6.aFloat168 + local9.aFloat173 * local6.aFloat172 + local9.aFloat172 * local6.aFloat167;
		this.aFloat166 = local6.aFloat165 * local9.aFloat168 + local6.aFloat166 * local9.aFloat166 + local6.aFloat171 * local9.aFloat169;
		this.aFloat168 = local6.aFloat172 * local9.aFloat169 + local9.aFloat166 * local6.aFloat168 + local9.aFloat168 * local6.aFloat167;
		this.aFloat175 = local9.aFloat167 * local6.aFloat175 + local6.aFloat173 * local9.aFloat175 + local6.aFloat169 * local9.aFloat165;
		this.aFloat165 = local6.aFloat165 * local9.aFloat167 + local9.aFloat175 * local6.aFloat171 + local9.aFloat165 * local6.aFloat166;
		this.aFloat176 = local9.aFloat170 * local6.aFloat169 + local6.aFloat173 * local9.aFloat176 + local6.aFloat175 * local9.aFloat174 + local6.aFloat176;
		this.aFloat167 = local6.aFloat172 * local9.aFloat175 + local6.aFloat168 * local9.aFloat165 + local6.aFloat167 * local9.aFloat167;
		this.aFloat170 = local6.aFloat165 * local9.aFloat174 + local6.aFloat171 * local9.aFloat176 + local6.aFloat166 * local9.aFloat170 + local6.aFloat170;
		this.aFloat174 = local6.aFloat174 + local9.aFloat176 * local6.aFloat172 + local9.aFloat170 * local6.aFloat168 + local9.aFloat174 * local6.aFloat167;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class98.aFloatArray11[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class98.aFloatArray10[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class98.aFloatArray11[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class98.aFloatArray10[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat175 = -local27 * local33 + local21 * local47;
		this.aFloat166 = local9 * local33;
		this.aFloat173 = local27 * local47 + local33 * local21;
		this.aFloat169 = local9 * local39;
		this.aFloat167 = local21 * local9;
		this.aFloat165 = local27 * local39 + local43 * local21;
		this.aFloat168 = -local15;
		this.aFloat172 = local27 * local9;
		this.aFloat171 = local43 * local27 + -local21 * local39;
		this.aFloat174 = -(this.aFloat167 * (float) arg2) + this.aFloat172 * (float) -arg0 - this.aFloat168 * (float) arg1;
		this.aFloat176 = -(this.aFloat175 * (float) arg2) + this.aFloat173 * (float) -arg0 - this.aFloat169 * (float) arg1;
		this.aFloat170 = -(this.aFloat165 * (float) arg2) + (float) -arg0 * this.aFloat171 - this.aFloat166 * (float) arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public void method8432() {
		this.aFloat173 = this.aFloat166 = this.aFloat167 = 1.0F;
		this.aFloat171 = this.aFloat172 = this.aFloat169 = this.aFloat168 = this.aFloat175 = this.aFloat165 = this.aFloat176 = this.aFloat170 = this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
	@Override
	public void method8449(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat173 = this.aFloat166 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat171 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat169 = -this.aFloat171;
		this.aFloat175 = this.aFloat176 = this.aFloat165 = this.aFloat170 = this.aFloat172 = this.aFloat168 = this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat170);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat176);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat174);
		arg3[2] = (int) ((float) local24 * this.aFloat167 + this.aFloat175 * (float) local13 + this.aFloat165 * (float) local6);
		arg3[0] = (int) (this.aFloat173 * (float) local13 + this.aFloat171 * (float) local6 + this.aFloat172 * (float) local24);
		arg3[1] = (int) ((float) local13 * this.aFloat169 + (float) local6 * this.aFloat166 + (float) local24 * this.aFloat168);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	@Override
	public void method8435(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat173;
		@Pc(21) float local21 = this.aFloat169;
		@Pc(24) float local24 = this.aFloat175;
		this.aFloat173 = local9 * local18 + this.aFloat172 * local15;
		@Pc(37) float local37 = this.aFloat176;
		this.aFloat172 = this.aFloat172 * local9 - local15 * local18;
		this.aFloat169 = local21 * local9 + this.aFloat168 * local15;
		this.aFloat168 = this.aFloat168 * local9 - local15 * local21;
		this.aFloat175 = local24 * local9 + local15 * this.aFloat167;
		this.aFloat167 = local9 * this.aFloat167 - local24 * local15;
		this.aFloat176 = local9 * local37 + local15 * this.aFloat174;
		this.aFloat174 = local9 * this.aFloat174 - local37 * local15;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Lclient!rd;I)V")
	public void method7279(@OriginalArg(0) Class263 arg0) {
		@Pc(6) Class263_Sub2 local6 = (Class263_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat173;
		@Pc(12) float local12 = this.aFloat171;
		@Pc(25) float local25 = this.aFloat169;
		@Pc(28) float local28 = this.aFloat166;
		@Pc(31) float local31 = this.aFloat175;
		@Pc(34) float local34 = this.aFloat165;
		@Pc(37) float local37 = this.aFloat176;
		this.aFloat173 = local6.aFloat175 * this.aFloat172 + local6.aFloat169 * local12 + local9 * local6.aFloat173;
		@Pc(57) float local57 = this.aFloat170;
		this.aFloat171 = local6.aFloat165 * this.aFloat172 + local6.aFloat171 * local9 + local6.aFloat166 * local12;
		this.aFloat169 = local6.aFloat175 * this.aFloat168 + local25 * local6.aFloat173 + local6.aFloat169 * local28;
		this.aFloat172 = local9 * local6.aFloat172 + local12 * local6.aFloat168 + this.aFloat172 * local6.aFloat167;
		this.aFloat166 = this.aFloat168 * local6.aFloat165 + local6.aFloat171 * local25 + local28 * local6.aFloat166;
		this.aFloat168 = local6.aFloat172 * local25 + local6.aFloat168 * local28 + this.aFloat168 * local6.aFloat167;
		this.aFloat175 = local6.aFloat175 * this.aFloat167 + local31 * local6.aFloat173 + local34 * local6.aFloat169;
		this.aFloat165 = local31 * local6.aFloat171 + local6.aFloat166 * local34 + local6.aFloat165 * this.aFloat167;
		this.aFloat176 = local57 * local6.aFloat169 + local6.aFloat173 * local37 + local6.aFloat175 * this.aFloat174 + local6.aFloat176;
		this.aFloat167 = this.aFloat167 * local6.aFloat167 + local6.aFloat168 * local34 + local6.aFloat172 * local31;
		this.aFloat170 = local6.aFloat166 * local57 + local6.aFloat171 * local37 + local6.aFloat165 * this.aFloat174 + local6.aFloat170;
		this.aFloat174 = this.aFloat174 * local6.aFloat167 + local6.aFloat172 * local37 + local6.aFloat168 * local57 + local6.aFloat174;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(IFFF)V")
	public void method7280(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat176 += arg2;
		this.aFloat174 += arg0;
		this.aFloat170 += arg1;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat173;
		@Pc(21) float local21 = this.aFloat169;
		@Pc(24) float local24 = this.aFloat175;
		this.aFloat173 = local18 * local9 - local15 * this.aFloat171;
		@Pc(38) float local38 = this.aFloat176;
		this.aFloat171 = this.aFloat171 * local9 + local15 * local18;
		this.aFloat169 = local9 * local21 - local15 * this.aFloat166;
		this.aFloat166 = local21 * local15 + local9 * this.aFloat166;
		this.aFloat175 = local9 * local24 - this.aFloat165 * local15;
		this.aFloat176 = local38 * local9 - local15 * this.aFloat170;
		this.aFloat165 = local15 * local24 + this.aFloat165 * local9;
		this.aFloat170 = this.aFloat170 * local9 + local38 * local15;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[F)[F")
	public float[] method7281(@OriginalArg(1) float[] arg0) {
		arg0[3] = this.aFloat176;
		arg0[2] = this.aFloat175;
		arg0[5] = this.aFloat166;
		arg0[4] = this.aFloat171;
		arg0[0] = this.aFloat173;
		arg0[6] = this.aFloat165;
		arg0[7] = this.aFloat170;
		arg0[1] = this.aFloat169;
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IFFF)F")
	public float method7282(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat170 + arg1 * this.aFloat166 + this.aFloat171 * arg0 + this.aFloat165 * arg2;
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
	public void method7283() {
		this.aFloat171 = -this.aFloat171;
		this.aFloat168 = -this.aFloat168;
		this.aFloat172 = -this.aFloat172;
		this.aFloat165 = -this.aFloat165;
		this.aFloat166 = -this.aFloat166;
		this.aFloat170 = -this.aFloat170;
		this.aFloat167 = -this.aFloat167;
		this.aFloat174 = -this.aFloat174;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method8437(@OriginalArg(0) Class263 arg0) {
		@Pc(6) Class263_Sub2 local6 = (Class263_Sub2) arg0;
		this.aFloat165 = local6.aFloat165;
		this.aFloat167 = local6.aFloat167;
		this.aFloat175 = local6.aFloat175;
		this.aFloat170 = local6.aFloat170;
		this.aFloat172 = local6.aFloat172;
		this.aFloat174 = local6.aFloat174;
		this.aFloat168 = local6.aFloat168;
		this.aFloat169 = local6.aFloat169;
		this.aFloat173 = local6.aFloat173;
		this.aFloat166 = local6.aFloat166;
		this.aFloat171 = local6.aFloat171;
		this.aFloat176 = local6.aFloat176;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat174 + (float) arg1 * this.aFloat168 + this.aFloat172 * (float) arg0 + this.aFloat167 * (float) arg2);
		arg3[0] = (int) (this.aFloat176 + (float) arg0 * this.aFloat173 + (float) arg1 * this.aFloat169 + (float) arg2 * this.aFloat175);
		arg3[1] = (int) (this.aFloat166 * (float) arg1 + (float) arg0 * this.aFloat171 + (float) arg2 * this.aFloat165 + this.aFloat170);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(FIFF)V")
	public void method7284(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat167 *= arg0;
		this.aFloat166 *= arg2;
		this.aFloat170 *= arg2;
		this.aFloat171 *= arg2;
		this.aFloat168 *= arg0;
		this.aFloat172 *= arg0;
		this.aFloat174 *= arg0;
		this.aFloat165 *= arg2;
		this.aFloat173 *= arg1;
		this.aFloat176 *= arg1;
		this.aFloat175 *= arg1;
		this.aFloat169 *= arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FIFF)V")
	public void method7285(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat174 = arg0;
		this.aFloat170 = arg2;
		this.aFloat173 = this.aFloat166 = this.aFloat167 = (float) 1;
		this.aFloat176 = arg1;
		this.aFloat171 = this.aFloat172 = this.aFloat169 = this.aFloat168 = this.aFloat175 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFI[F)V")
	public void method7286(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg2 * this.aFloat166 + arg3 * this.aFloat171 + arg1 * this.aFloat165;
		@Pc(57) float local57;
		@Pc(73) float local73;
		@Pc(65) float local65;
		@Pc(49) float local49;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local49 = -arg0 / arg3;
			local73 = this.aFloat170 + local49 * this.aFloat171;
			local57 = this.aFloat173 * local49 + this.aFloat176;
			local65 = this.aFloat174 + local49 * this.aFloat172;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local49 = -arg0 / arg2;
			local57 = this.aFloat176 + this.aFloat169 * local49;
			local65 = this.aFloat174 + this.aFloat168 * local49;
			local73 = this.aFloat170 + local49 * this.aFloat166;
		} else {
			local49 = -arg0 / arg1;
			local57 = this.aFloat176 + this.aFloat175 * local49;
			local73 = this.aFloat170 + this.aFloat165 * local49;
			local65 = this.aFloat174 + local49 * this.aFloat167;
		}
		arg4[2] = arg1 * this.aFloat167 + this.aFloat172 * arg3 + arg2 * this.aFloat168;
		arg4[0] = this.aFloat175 * arg1 + arg2 * this.aFloat169 + arg3 * this.aFloat173;
		arg4[3] = -(local73 * arg4[1] + local57 * arg4[0] + arg4[2] * local65);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(F[FFBF)V")
	public void method7287(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg1[2] = arg0 * this.aFloat172 + this.aFloat168 * arg3 + arg2 * this.aFloat167;
		arg1[0] = arg2 * this.aFloat175 + this.aFloat169 * arg3 + this.aFloat173 * arg0;
		arg1[1] = this.aFloat165 * arg2 + this.aFloat166 * arg3 + arg0 * this.aFloat171;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([FI)[F")
	public float[] method7289(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloat169;
		arg0[9] = this.aFloat170;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat166;
		arg0[2] = (float) 0;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat176;
		arg0[1] = this.aFloat171;
		arg0[0] = this.aFloat173;
		arg0[10] = this.aFloat174;
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	@Override
	public void method8439(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat171;
		@Pc(21) float local21 = this.aFloat166;
		@Pc(24) float local24 = this.aFloat165;
		this.aFloat171 = local18 * local9 - this.aFloat172 * local15;
		@Pc(38) float local38 = this.aFloat170;
		this.aFloat172 = local15 * local18 + local9 * this.aFloat172;
		this.aFloat166 = local21 * local9 - local15 * this.aFloat168;
		this.aFloat165 = local9 * local24 - this.aFloat167 * local15;
		this.aFloat168 = this.aFloat168 * local9 + local21 * local15;
		this.aFloat167 = this.aFloat167 * local9 + local15 * local24;
		this.aFloat170 = local38 * local9 - local15 * this.aFloat174;
		this.aFloat174 = this.aFloat174 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IFIIFFI)V")
	public void method7290(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat166 = (float) (arg0 * 2);
			this.aFloat173 = (float) (arg5 * 2);
			this.aFloat176 = arg1 - (float) arg5;
			this.aFloat170 = arg4 - (float) arg0;
			this.aFloat167 = 1.0F;
			this.aFloat174 = arg3;
			this.aFloat171 = this.aFloat172 = this.aFloat169 = this.aFloat168 = this.aFloat175 = this.aFloat165 = 0.0F;
			return;
		}
		@Pc(72) float local72 = Class98.aFloatArray11[arg2 & 0x3FFF];
		@Pc(78) float local78 = Class98.aFloatArray10[arg2 & 0x3FFF];
		this.aFloat167 = 1.0F;
		this.aFloat174 = arg3;
		this.aFloat173 = local72 * 2.0F * (float) arg5;
		this.aFloat166 = (float) arg0 * 2.0F * local72;
		this.aFloat176 = arg1 + (float) (arg5 * 2) * (local78 * 0.5F - local72 * 0.5F);
		this.aFloat169 = -2.0F * local78 * (float) arg0;
		this.aFloat171 = (float) arg5 * local78 * 2.0F;
		this.aFloat172 = this.aFloat168 = this.aFloat175 = this.aFloat165 = 0.0F;
		this.aFloat170 = arg4 + (local78 * -0.5F - local72 * 0.5F) * (float) (arg0 * 2);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "([FI)[F")
	public float[] method7291(@OriginalArg(0) float[] arg0) {
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat175;
		arg0[6] = this.aFloat168;
		arg0[7] = 0.0F;
		arg0[15] = 1.0F;
		arg0[13] = this.aFloat170;
		arg0[14] = this.aFloat174;
		arg0[12] = this.aFloat176;
		arg0[1] = this.aFloat171;
		arg0[2] = this.aFloat172;
		arg0[0] = this.aFloat173;
		arg0[10] = this.aFloat167;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat166;
		arg0[4] = this.aFloat169;
		arg0[9] = this.aFloat165;
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IFFF)F")
	public float method7292(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat172 + this.aFloat168 * arg1 + arg0 * this.aFloat167 + this.aFloat174;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!rd;B)V")
	public void method7293(@OriginalArg(0) Class263 arg0) {
		@Pc(16) Class263_Sub2 local16 = (Class263_Sub2) arg0;
		this.aFloat169 = local16.aFloat171;
		this.aFloat175 = local16.aFloat172;
		this.aFloat173 = local16.aFloat173;
		this.aFloat165 = local16.aFloat168;
		this.aFloat166 = local16.aFloat166;
		this.aFloat171 = local16.aFloat169;
		this.aFloat172 = local16.aFloat175;
		this.aFloat176 = -(this.aFloat173 * local16.aFloat176 + this.aFloat169 * local16.aFloat170 + local16.aFloat174 * this.aFloat175);
		this.aFloat168 = local16.aFloat165;
		this.aFloat167 = local16.aFloat167;
		this.aFloat170 = -(this.aFloat166 * local16.aFloat170 + this.aFloat171 * local16.aFloat176 + this.aFloat165 * local16.aFloat174);
		this.aFloat174 = -(this.aFloat167 * local16.aFloat174 + this.aFloat172 * local16.aFloat176 + this.aFloat168 * local16.aFloat170);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([FB)[F")
	public float[] method7294(@OriginalArg(0) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat171;
		arg0[15] = 0.0F;
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat166;
		arg0[9] = this.aFloat168;
		arg0[10] = this.aFloat167;
		arg0[0] = this.aFloat173;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat165;
		arg0[8] = this.aFloat172;
		arg0[2] = this.aFloat175;
		arg0[1] = this.aFloat169;
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method7295(@OriginalArg(0) Class263 arg0) {
		@Pc(6) Class263_Sub2 local6 = (Class263_Sub2) arg0;
		this.aFloat172 = local6.aFloat172;
		this.aFloat169 = local6.aFloat169;
		this.aFloat175 = local6.aFloat175;
		this.aFloat167 = local6.aFloat167;
		this.aFloat170 = 0.0F;
		this.aFloat168 = local6.aFloat168;
		this.aFloat176 = 0.0F;
		this.aFloat171 = local6.aFloat171;
		this.aFloat166 = local6.aFloat166;
		this.aFloat174 = 0.0F;
		this.aFloat165 = local6.aFloat165;
		this.aFloat173 = local6.aFloat173;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFB)F")
	public float method7296(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat173 * arg0 + this.aFloat169 * arg2 + this.aFloat175 * arg1 + this.aFloat176;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFFZFF)V")
	public void method7297(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat172 = arg5;
		this.aFloat168 = arg3;
		this.aFloat171 = arg4;
		this.aFloat170 = 0.0F;
		this.aFloat167 = arg6;
		this.aFloat173 = arg8;
		this.aFloat175 = arg1;
		this.aFloat174 = 0.0F;
		this.aFloat165 = arg2;
		this.aFloat169 = arg0;
		this.aFloat166 = arg7;
		this.aFloat176 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat173 = this.aFloat167 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat175 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat172 = -this.aFloat175;
		this.aFloat169 = this.aFloat176 = this.aFloat171 = this.aFloat165 = this.aFloat170 = this.aFloat168 = this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(III)V")
	@Override
	public void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat176 = (float) arg0;
		this.aFloat170 = (float) arg1;
		this.aFloat173 = this.aFloat166 = this.aFloat167 = 1.0F;
		this.aFloat171 = this.aFloat172 = this.aFloat169 = this.aFloat168 = this.aFloat175 = this.aFloat165 = 0.0F;
		this.aFloat174 = (float) arg2;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	@Override
	public void method8436(@OriginalArg(0) int arg0) {
		this.aFloat173 = 1.0F;
		this.aFloat166 = this.aFloat167 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat168 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat169 = this.aFloat175 = this.aFloat176 = this.aFloat171 = this.aFloat170 = this.aFloat172 = this.aFloat174 = 0.0F;
		this.aFloat165 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat168 * (float) arg1 + (float) arg0 * this.aFloat172 + (float) arg2 * this.aFloat167);
		arg3[0] = (int) (this.aFloat169 * (float) arg1 + this.aFloat173 * (float) arg0 + this.aFloat175 * (float) arg2);
		arg3[1] = (int) (this.aFloat171 * (float) arg0 + (float) arg1 * this.aFloat166 + (float) arg2 * this.aFloat165);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I[F)[F")
	public float[] method7298(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat175;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat165;
		arg0[0] = this.aFloat173;
		arg0[4] = this.aFloat171;
		arg0[8] = this.aFloat172;
		arg0[3] = this.aFloat176;
		arg0[7] = this.aFloat170;
		arg0[10] = this.aFloat167;
		arg0[1] = this.aFloat169;
		arg0[5] = this.aFloat166;
		arg0[9] = this.aFloat168;
		arg0[11] = this.aFloat174;
		return arg0;
	}
}
