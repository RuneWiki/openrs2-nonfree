import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!un", name = "t", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!un", name = "P", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!un", name = "Z", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!un", name = "bb", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!un", name = "db", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class109_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!un", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat192 = arg0;
		this.aFloat188 = arg1;
		this.aFloat191 = this.aFloat194 = this.aFloat187 = this.aFloat196 = this.aFloat195 = this.aFloat190 = 0.0F;
		this.aFloat193 = this.aFloat186 = this.aFloat197 = 1.0F;
		this.aFloat189 = arg2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([FI)[F")
	public float[] method7101(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat191;
		arg0[10] = this.aFloat189;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat193;
		arg0[2] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat186;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat187;
		arg0[6] = 0.0F;
		arg0[9] = this.aFloat188;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat192;
		return arg0;
	}

	@OriginalMember(owner = "client!un", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat192;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat188;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat189;
		arg0[2] = (int) (this.aFloat197 * local27 + this.aFloat195 * local11 + this.aFloat190 * local19);
		arg0[1] = (int) (local11 * this.aFloat187 + this.aFloat186 * local19 + local27 * this.aFloat196);
		arg0[0] = (int) (this.aFloat191 * local19 + local11 * this.aFloat193 + local27 * this.aFloat194);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(F[FBFFF)V")
	public void method7102(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(34) float local34;
		@Pc(26) float local26;
		@Pc(42) float local42;
		@Pc(18) float local18;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local18 = -arg4 / arg0;
			local26 = this.aFloat188 + local18 * this.aFloat191;
			local34 = this.aFloat192 + local18 * this.aFloat193;
			local42 = local18 * this.aFloat194 + this.aFloat189;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local18 = -arg4 / arg3;
			local26 = this.aFloat186 * local18 + this.aFloat188;
			local34 = local18 * this.aFloat187 + this.aFloat192;
			local42 = local18 * this.aFloat196 + this.aFloat189;
		} else {
			local18 = -arg4 / arg2;
			local42 = this.aFloat189 + local18 * this.aFloat197;
			local26 = this.aFloat188 + this.aFloat190 * local18;
			local34 = local18 * this.aFloat195 + this.aFloat192;
		}
		arg1[1] = arg2 * this.aFloat190 + this.aFloat191 * arg0 + this.aFloat186 * arg3;
		arg1[2] = this.aFloat197 * arg2 + arg0 * this.aFloat194 + this.aFloat196 * arg3;
		arg1[0] = this.aFloat195 * arg2 + arg3 * this.aFloat187 + this.aFloat193 * arg0;
		arg1[3] = -(arg1[2] * local42 + local34 * arg1[0] + local26 * arg1[1]);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([FZ)[F")
	public float[] method7103(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat192;
		arg0[5] = this.aFloat186;
		arg0[2] = this.aFloat195;
		arg0[6] = this.aFloat190;
		arg0[1] = this.aFloat187;
		arg0[0] = this.aFloat193;
		arg0[4] = this.aFloat191;
		arg0[7] = this.aFloat188;
		return arg0;
	}

	@OriginalMember(owner = "client!un", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat187 + (float) arg0 * this.aFloat193 + this.aFloat195 * (float) arg2);
		arg3[1] = (int) (this.aFloat190 * (float) arg2 + this.aFloat186 * (float) arg1 + this.aFloat191 * (float) arg0);
		arg3[2] = (int) (this.aFloat197 * (float) arg2 + this.aFloat196 * (float) arg1 + this.aFloat194 * (float) arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!q;I)V")
	public void method7104(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		this.aFloat193 = local6.aFloat193;
		this.aFloat186 = local6.aFloat186;
		this.aFloat191 = local6.aFloat191;
		this.aFloat188 = 0.0F;
		this.aFloat194 = local6.aFloat194;
		this.aFloat190 = local6.aFloat190;
		this.aFloat187 = local6.aFloat187;
		this.aFloat197 = local6.aFloat197;
		this.aFloat196 = local6.aFloat196;
		this.aFloat192 = 0.0F;
		this.aFloat195 = local6.aFloat195;
		this.aFloat189 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFFFFFFFI)V")
	public void method7105(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat196 = arg4;
		this.aFloat197 = arg0;
		this.aFloat192 = 0;
		this.aFloat188 = 0.0F;
		this.aFloat191 = arg6;
		this.aFloat190 = arg3;
		this.aFloat187 = arg1;
		this.aFloat186 = arg8;
		this.aFloat195 = arg5;
		this.aFloat194 = arg7;
		this.aFloat193 = arg2;
		this.aFloat189 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat193 * (float) arg0 + (float) arg1 * this.aFloat187 + this.aFloat195 * (float) arg2 + this.aFloat192);
		arg3[1] = (int) ((float) arg0 * this.aFloat191 + this.aFloat186 * (float) arg1 + this.aFloat190 * (float) arg2 + this.aFloat188);
		arg3[2] = (int) (this.aFloat194 * (float) arg0 + this.aFloat196 * (float) arg1 + (float) arg2 * this.aFloat197 + this.aFloat189);
	}

	@OriginalMember(owner = "client!un", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat191;
		@Pc(21) float local21 = this.aFloat186;
		@Pc(24) float local24 = this.aFloat190;
		@Pc(27) float local27 = this.aFloat188;
		this.aFloat191 = local9 * local18 - this.aFloat194 * local15;
		this.aFloat194 = local15 * local18 + this.aFloat194 * local9;
		this.aFloat186 = local9 * local21 - this.aFloat196 * local15;
		this.aFloat190 = local24 * local9 - this.aFloat197 * local15;
		this.aFloat196 = local21 * local15 + local9 * this.aFloat196;
		this.aFloat197 = local24 * local15 + this.aFloat197 * local9;
		this.aFloat188 = local27 * local9 - this.aFloat189 * local15;
		this.aFloat189 = this.aFloat189 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFZ)V")
	public void method7106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat186 *= arg0;
		this.aFloat193 *= arg2;
		this.aFloat194 *= arg1;
		this.aFloat196 *= arg1;
		this.aFloat197 *= arg1;
		this.aFloat191 *= arg0;
		this.aFloat190 *= arg0;
		this.aFloat192 *= arg2;
		this.aFloat187 *= arg2;
		this.aFloat189 *= arg1;
		this.aFloat195 *= arg2;
		this.aFloat188 *= arg0;
	}

	@OriginalMember(owner = "client!un", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		this.aFloat188 = local6.aFloat188;
		this.aFloat187 = local6.aFloat187;
		this.aFloat190 = local6.aFloat190;
		this.aFloat192 = local6.aFloat192;
		this.aFloat196 = local6.aFloat196;
		this.aFloat197 = local6.aFloat197;
		this.aFloat186 = local6.aFloat186;
		this.aFloat193 = local6.aFloat193;
		this.aFloat194 = local6.aFloat194;
		this.aFloat189 = local6.aFloat189;
		this.aFloat191 = local6.aFloat191;
		this.aFloat195 = local6.aFloat195;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FBFF)F")
	public float method7107(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat192 + arg2 * this.aFloat195 + arg0 * this.aFloat193 + arg1 * this.aFloat187;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I[F)[F")
	public float[] method7108(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat195;
		arg0[7] = this.aFloat188;
		arg0[5] = this.aFloat186;
		arg0[13] = 0;
		arg0[1] = this.aFloat187;
		arg0[3] = this.aFloat192;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat191;
		arg0[14] = 0.0F;
		arg0[11] = this.aFloat189;
		arg0[10] = this.aFloat197;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat193;
		arg0[8] = this.aFloat194;
		arg0[9] = this.aFloat196;
		arg0[6] = this.aFloat190;
		return arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFI[F)V")
	public void method7109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = this.aFloat196 * arg2 + arg0 * this.aFloat194 + this.aFloat197 * arg1;
		arg3[1] = this.aFloat190 * arg1 + arg0 * this.aFloat191 + arg2 * this.aFloat186;
		arg3[0] = this.aFloat187 * arg2 + this.aFloat193 * arg0 + this.aFloat195 * arg1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	public void method7110() {
		this.aFloat194 = -this.aFloat194;
		this.aFloat191 = -this.aFloat191;
		this.aFloat197 = -this.aFloat197;
		this.aFloat190 = -this.aFloat190;
		this.aFloat188 = -this.aFloat188;
		this.aFloat189 = -this.aFloat189;
		this.aFloat196 = -this.aFloat196;
		this.aFloat186 = -this.aFloat186;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IFFF)V")
	public void method7113(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat188 += arg0;
		this.aFloat192 += arg2;
		this.aFloat189 += arg1;
	}

	@OriginalMember(owner = "client!un", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class57_Sub3.aFloatArray70[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class57_Sub3.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class57_Sub3.aFloatArray70[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class57_Sub3.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat195 = local33 * -local27 + local47 * local21;
		this.aFloat187 = local9 * local39;
		this.aFloat197 = local21 * local9;
		this.aFloat191 = local39 * -local21 + local43 * local27;
		this.aFloat186 = local33 * local9;
		this.aFloat193 = local47 * local27 + local33 * local21;
		this.aFloat196 = -local15;
		this.aFloat194 = local9 * local27;
		this.aFloat190 = local21 * local43 + local39 * local27;
		this.aFloat189 = (float) -arg0 * this.aFloat194 - this.aFloat196 * (float) arg1 - (float) arg2 * this.aFloat197;
		this.aFloat188 = -(this.aFloat190 * (float) arg2) + this.aFloat191 * (float) -arg0 - this.aFloat186 * (float) arg1;
		this.aFloat192 = -(this.aFloat195 * (float) arg2) - this.aFloat187 * (float) arg1 + this.aFloat193 * (float) -arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!q;)V")
	public void method7114(@OriginalArg(1) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat193;
		@Pc(12) float local12 = this.aFloat191;
		@Pc(15) float local15 = this.aFloat187;
		@Pc(18) float local18 = this.aFloat186;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat190;
		@Pc(27) float local27 = this.aFloat192;
		this.aFloat193 = this.aFloat194 * local6.aFloat195 + local6.aFloat193 * local9 + local12 * local6.aFloat187;
		this.aFloat191 = local9 * local6.aFloat191 + local6.aFloat186 * local12 + this.aFloat194 * local6.aFloat190;
		@Pc(72) float local72 = this.aFloat188;
		this.aFloat186 = local18 * local6.aFloat186 + local6.aFloat191 * local15 + this.aFloat196 * local6.aFloat190;
		this.aFloat194 = local6.aFloat194 * local9 + local6.aFloat196 * local12 + local6.aFloat197 * this.aFloat194;
		this.aFloat187 = this.aFloat196 * local6.aFloat195 + local6.aFloat187 * local18 + local6.aFloat193 * local15;
		this.aFloat195 = local6.aFloat195 * this.aFloat197 + local6.aFloat187 * local24 + local21 * local6.aFloat193;
		this.aFloat190 = local6.aFloat191 * local21 + local24 * local6.aFloat186 + local6.aFloat190 * this.aFloat197;
		this.aFloat196 = local6.aFloat197 * this.aFloat196 + local15 * local6.aFloat194 + local18 * local6.aFloat196;
		this.aFloat192 = this.aFloat189 * local6.aFloat195 + local27 * local6.aFloat193 + local72 * local6.aFloat187 + local6.aFloat192;
		this.aFloat188 = local6.aFloat188 + local6.aFloat186 * local72 + local27 * local6.aFloat191 + this.aFloat189 * local6.aFloat190;
		this.aFloat197 = this.aFloat197 * local6.aFloat197 + local6.aFloat196 * local24 + local6.aFloat194 * local21;
		this.aFloat189 = this.aFloat189 * local6.aFloat197 + local6.aFloat196 * local72 + local27 * local6.aFloat194 + local6.aFloat189;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFB)V")
	public void method7115(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat188 = arg0;
		this.aFloat189 = arg2;
		this.aFloat191 = this.aFloat194 = this.aFloat187 = this.aFloat196 = this.aFloat195 = this.aFloat190 = 0.0F;
		this.aFloat193 = this.aFloat186 = this.aFloat197 = 1.0F;
		this.aFloat192 = arg1;
	}

	@OriginalMember(owner = "client!un", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat189 += arg2;
		this.aFloat188 += arg1;
		this.aFloat192 += arg0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "([FI)[F")
	public float[] method7117(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat187;
		arg0[10] = this.aFloat197;
		arg0[9] = this.aFloat196;
		arg0[4] = this.aFloat191;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat193;
		arg0[5] = this.aFloat186;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[15] = 0.0F;
		arg0[6] = this.aFloat190;
		arg0[8] = this.aFloat194;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat195;
		return arg0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(FFFB)F")
	public float method7118(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat189 + arg1 * this.aFloat194 + this.aFloat196 * arg0 + this.aFloat197 * arg2;
	}

	@OriginalMember(owner = "client!un", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat193;
		@Pc(21) float local21 = this.aFloat187;
		@Pc(24) float local24 = this.aFloat195;
		@Pc(27) float local27 = this.aFloat192;
		this.aFloat193 = local9 * local18 - local15 * this.aFloat191;
		this.aFloat191 = this.aFloat191 * local9 + local15 * local18;
		this.aFloat187 = local9 * local21 - this.aFloat186 * local15;
		this.aFloat186 = local9 * this.aFloat186 + local15 * local21;
		this.aFloat195 = local24 * local9 - this.aFloat190 * local15;
		this.aFloat192 = local27 * local9 - this.aFloat188 * local15;
		this.aFloat190 = this.aFloat190 * local9 + local24 * local15;
		this.aFloat188 = this.aFloat188 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method7119(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		@Pc(9) Class109_Sub3 local9 = (Class109_Sub3) arg1;
		this.aFloat193 = local9.aFloat194 * local6.aFloat195 + local6.aFloat193 * local9.aFloat193 + local6.aFloat187 * local9.aFloat191;
		this.aFloat191 = local9.aFloat191 * local6.aFloat186 + local6.aFloat191 * local9.aFloat193 + local9.aFloat194 * local6.aFloat190;
		this.aFloat194 = local6.aFloat194 * local9.aFloat193 + local6.aFloat196 * local9.aFloat191 + local9.aFloat194 * local6.aFloat197;
		this.aFloat187 = local9.aFloat196 * local6.aFloat195 + local6.aFloat193 * local9.aFloat187 + local6.aFloat187 * local9.aFloat186;
		this.aFloat186 = local6.aFloat191 * local9.aFloat187 + local6.aFloat186 * local9.aFloat186 + local9.aFloat196 * local6.aFloat190;
		this.aFloat196 = local9.aFloat187 * local6.aFloat194 + local6.aFloat196 * local9.aFloat186 + local6.aFloat197 * local9.aFloat196;
		this.aFloat195 = local9.aFloat195 * local6.aFloat193 + local6.aFloat187 * local9.aFloat190 + local6.aFloat195 * local9.aFloat197;
		this.aFloat190 = local9.aFloat197 * local6.aFloat190 + local9.aFloat190 * local6.aFloat186 + local9.aFloat195 * local6.aFloat191;
		this.aFloat197 = local6.aFloat197 * local9.aFloat197 + local6.aFloat194 * local9.aFloat195 + local6.aFloat196 * local9.aFloat190;
		this.aFloat192 = local6.aFloat195 * local9.aFloat189 + local6.aFloat187 * local9.aFloat188 + local6.aFloat193 * local9.aFloat192 + local6.aFloat192;
		this.aFloat188 = local6.aFloat190 * local9.aFloat189 + local6.aFloat186 * local9.aFloat188 + local6.aFloat191 * local9.aFloat192 + local6.aFloat188;
		this.aFloat189 = local6.aFloat196 * local9.aFloat188 + local9.aFloat192 * local6.aFloat194 + local9.aFloat189 * local6.aFloat197 + local6.aFloat189;
	}

	@OriginalMember(owner = "client!un", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat193 = this.aFloat186 = this.aFloat197 = 1.0F;
		this.aFloat191 = this.aFloat194 = this.aFloat187 = this.aFloat196 = this.aFloat195 = this.aFloat190 = this.aFloat192 = this.aFloat188 = this.aFloat189 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FZFF)F")
	public float method7120(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat191 * arg2 + arg0 * this.aFloat186 + this.aFloat190 * arg1 + this.aFloat188;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BFFF)V")
	public void method7121(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat190 = 0.0F;
		this.aFloat192 = 0.0F;
		this.aFloat196 = 0.0F;
		this.aFloat195 = 0.0F;
		this.aFloat193 = arg1;
		this.aFloat189 = 0.0F;
		this.aFloat197 = arg0;
		this.aFloat188 = 0.0F;
		this.aFloat186 = arg2;
		this.aFloat191 = 0.0F;
		this.aFloat194 = 0.0F;
		this.aFloat187 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I[F)[F")
	public float[] method7122(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat195;
		arg0[1] = this.aFloat191;
		arg0[9] = this.aFloat190;
		arg0[7] = 0.0F;
		arg0[12] = this.aFloat192;
		arg0[5] = this.aFloat186;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat187;
		arg0[6] = this.aFloat196;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat193;
		arg0[14] = this.aFloat189;
		arg0[2] = this.aFloat194;
		arg0[10] = this.aFloat197;
		arg0[11] = 0.0F;
		arg0[13] = this.aFloat188;
		return arg0;
	}

	@OriginalMember(owner = "client!un", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat186 = 1.0F;
		this.aFloat193 = this.aFloat197 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat195 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat194 = -this.aFloat195;
		this.aFloat187 = this.aFloat192 = this.aFloat191 = this.aFloat190 = this.aFloat188 = this.aFloat196 = this.aFloat189 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IFIFBIF)V")
	public void method7123(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat189 = arg3;
			this.aFloat193 = arg4 * 2;
			this.aFloat197 = 1.0F;
			this.aFloat186 = arg2 * 2;
			this.aFloat188 = (float) -arg2 + arg1;
			this.aFloat191 = this.aFloat194 = this.aFloat187 = this.aFloat196 = this.aFloat195 = this.aFloat190 = 0.0F;
			this.aFloat192 = arg5 - (float) arg4;
			return;
		}
		@Pc(69) float local69 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(75) float local75 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat187 = local75 * -2.0F * (float) arg2;
		this.aFloat197 = 1.0F;
		this.aFloat188 = arg1 + (local75 * -0.5F - local69 * 0.5F) * (float) (arg2 * 2);
		this.aFloat194 = this.aFloat196 = this.aFloat195 = this.aFloat190 = 0.0F;
		this.aFloat186 = local69 * 2.0F * (float) arg2;
		this.aFloat189 = arg3;
		this.aFloat193 = local69 * 2.0F * (float) arg4;
		this.aFloat191 = (float) arg4 * local75 * 2.0F;
		this.aFloat192 = (local75 * 0.5F - local69 * 0.5F) * (float) (arg4 * 2) + arg5;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7100() {
		@Pc(7) Class109_Sub3 local7 = new Class109_Sub3();
		local7.aFloat196 = this.aFloat196;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat189 = this.aFloat189;
		return local7;
	}

	@OriginalMember(owner = "client!un", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat193;
		@Pc(21) float local21 = this.aFloat187;
		@Pc(24) float local24 = this.aFloat195;
		this.aFloat193 = this.aFloat194 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat192;
		this.aFloat194 = local9 * this.aFloat194 - local18 * local15;
		this.aFloat187 = local15 * this.aFloat196 + local21 * local9;
		this.aFloat195 = local9 * local24 + this.aFloat197 * local15;
		this.aFloat196 = local9 * this.aFloat196 - local15 * local21;
		this.aFloat192 = local37 * local9 + local15 * this.aFloat189;
		this.aFloat197 = local9 * this.aFloat197 - local15 * local24;
		this.aFloat189 = local9 * this.aFloat189 - local15 * local37;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(ILclient!q;)V")
	public void method7124(@OriginalArg(1) Class109 arg0) {
		@Pc(10) Class109_Sub3 local10 = (Class109_Sub3) arg0;
		this.aFloat193 = local10.aFloat193;
		this.aFloat187 = local10.aFloat191;
		this.aFloat195 = local10.aFloat194;
		this.aFloat194 = local10.aFloat195;
		this.aFloat190 = local10.aFloat196;
		this.aFloat191 = local10.aFloat187;
		this.aFloat186 = local10.aFloat186;
		this.aFloat197 = local10.aFloat197;
		this.aFloat192 = -(local10.aFloat188 * this.aFloat187 + local10.aFloat192 * this.aFloat193 + local10.aFloat189 * this.aFloat195);
		this.aFloat196 = local10.aFloat190;
		this.aFloat188 = -(this.aFloat190 * local10.aFloat189 + local10.aFloat188 * this.aFloat186 + this.aFloat191 * local10.aFloat192);
		this.aFloat189 = -(this.aFloat197 * local10.aFloat189 + local10.aFloat188 * this.aFloat196 + this.aFloat194 * local10.aFloat192);
	}

	@OriginalMember(owner = "client!un", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat193 = 1.0F;
		this.aFloat186 = this.aFloat197 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat196 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat187 = this.aFloat195 = this.aFloat192 = this.aFloat191 = this.aFloat188 = this.aFloat194 = this.aFloat189 = 0.0F;
		this.aFloat190 = -this.aFloat196;
	}

	@OriginalMember(owner = "client!un", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat197 = 1.0F;
		this.aFloat193 = this.aFloat186 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat191 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat195 = this.aFloat192 = this.aFloat190 = this.aFloat188 = this.aFloat194 = this.aFloat196 = this.aFloat189 = 0.0F;
		this.aFloat187 = -this.aFloat191;
	}
}
