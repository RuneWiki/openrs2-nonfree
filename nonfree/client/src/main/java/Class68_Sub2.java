import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!mga", name = "p", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!mga", name = "q", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!mga", name = "A", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!mga", name = "E", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!mga", name = "F", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!mga", name = "H", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!mga", name = "I", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!mga", name = "M", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!mga", name = "T", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!mga", name = "cb", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!mga", name = "fb", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!mga", name = "gb", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	public Class68_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!mga", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class68 arg0) {
		@Pc(6) Class68_Sub2 local6 = (Class68_Sub2) arg0;
		this.aFloat182 = local6.aFloat182;
		this.aFloat190 = local6.aFloat190;
		this.aFloat185 = local6.aFloat185;
		this.aFloat186 = local6.aFloat186;
		this.aFloat188 = local6.aFloat188;
		this.aFloat187 = local6.aFloat187;
		this.aFloat189 = local6.aFloat189;
		this.aFloat183 = local6.aFloat183;
		this.aFloat184 = local6.aFloat184;
		this.aFloat181 = local6.aFloat181;
		this.aFloat180 = local6.aFloat180;
		this.aFloat191 = local6.aFloat191;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!q;)V")
	public void method5098(@OriginalArg(1) Class68 arg0) {
		@Pc(6) Class68_Sub2 local6 = (Class68_Sub2) arg0;
		this.aFloat187 = local6.aFloat187;
		this.aFloat180 = 0.0F;
		this.aFloat191 = local6.aFloat191;
		this.aFloat182 = 0;
		this.aFloat186 = local6.aFloat186;
		this.aFloat185 = local6.aFloat185;
		this.aFloat181 = local6.aFloat181;
		this.aFloat188 = local6.aFloat188;
		this.aFloat183 = 0.0F;
		this.aFloat184 = local6.aFloat184;
		this.aFloat190 = local6.aFloat190;
		this.aFloat189 = local6.aFloat189;
	}

	@OriginalMember(owner = "client!mga", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat187 = 1.0F;
		this.aFloat188 = this.aFloat186 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat190 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat181 = this.aFloat191 = this.aFloat182 = this.aFloat189 = this.aFloat180 = this.aFloat185 = this.aFloat183 = 0.0F;
		this.aFloat184 = -this.aFloat190;
	}

	@OriginalMember(owner = "client!mga", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class56_Sub8.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class56_Sub8.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class56_Sub8.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class56_Sub8.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat181 = local39 * local9;
		this.aFloat184 = local21 * local43 + local27 * local39;
		this.aFloat190 = -local15;
		this.aFloat191 = local21 * local47 + local33 * -local27;
		this.aFloat185 = local27 * local9;
		this.aFloat188 = local9 * local33;
		this.aFloat189 = -local21 * local39 + local43 * local27;
		this.aFloat186 = local9 * local21;
		this.aFloat187 = local47 * local27 + local21 * local33;
		this.aFloat182 = -(this.aFloat191 * (float) arg2) - this.aFloat181 * (float) arg1 + (float) -arg0 * this.aFloat187;
		this.aFloat180 = -(this.aFloat184 * (float) arg2) - (float) arg1 * this.aFloat188 + (float) -arg0 * this.aFloat189;
		this.aFloat183 = this.aFloat185 * (float) -arg0 - this.aFloat190 * (float) arg1 - (float) arg2 * this.aFloat186;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FFFB)V")
	public void method5100(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat180 += arg2;
		this.aFloat182 += arg0;
		this.aFloat183 += arg1;
	}

	@OriginalMember(owner = "client!mga", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat186 = 1.0F;
		this.aFloat187 = this.aFloat188 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat189 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat181 = -this.aFloat189;
		this.aFloat191 = this.aFloat182 = this.aFloat184 = this.aFloat180 = this.aFloat185 = this.aFloat190 = this.aFloat183 = 0.0F;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat190 + this.aFloat185 * (float) arg0 + (float) arg2 * this.aFloat186 + this.aFloat183);
		arg3[1] = (int) (this.aFloat180 + (float) arg0 * this.aFloat189 + this.aFloat188 * (float) arg1 + this.aFloat184 * (float) arg2);
		arg3[0] = (int) (this.aFloat191 * (float) arg2 + this.aFloat187 * (float) arg0 + (float) arg1 * this.aFloat181 + this.aFloat182);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I[F)[F")
	public float[] method5101(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat184;
		arg0[5] = this.aFloat188;
		arg0[4] = this.aFloat189;
		arg0[1] = this.aFloat181;
		arg0[2] = this.aFloat191;
		arg0[0] = this.aFloat187;
		arg0[3] = this.aFloat182;
		arg0[7] = this.aFloat180;
		return arg0;
	}

	@OriginalMember(owner = "client!mga", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat188 = 1.0F;
		this.aFloat187 = this.aFloat186 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat191 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat185 = -this.aFloat191;
		this.aFloat181 = this.aFloat182 = this.aFloat189 = this.aFloat184 = this.aFloat180 = this.aFloat190 = this.aFloat183 = 0.0F;
	}

	@OriginalMember(owner = "client!mga", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat189 = this.aFloat185 = this.aFloat181 = this.aFloat190 = this.aFloat191 = this.aFloat184 = 0.0F;
		this.aFloat182 = arg0;
		this.aFloat183 = arg2;
		this.aFloat180 = arg1;
		this.aFloat187 = this.aFloat188 = this.aFloat186 = 1.0F;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FFFI)F")
	public float method5103(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat180 + arg2 * this.aFloat184 + arg1 * this.aFloat188 + arg0 * this.aFloat189;
	}

	@OriginalMember(owner = "client!mga", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat190 * (float) arg1 + (float) arg0 * this.aFloat185 + this.aFloat186 * (float) arg2);
		arg3[0] = (int) ((float) arg1 * this.aFloat181 + this.aFloat187 * (float) arg0 + this.aFloat191 * (float) arg2);
		arg3[1] = (int) (this.aFloat189 * (float) arg0 + this.aFloat188 * (float) arg1 + this.aFloat184 * (float) arg2);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FIFF)F")
	public float method5105(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat183 + arg1 * this.aFloat186 + arg2 * this.aFloat185 + this.aFloat190 * arg0;
	}

	@OriginalMember(owner = "client!mga", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat187 = this.aFloat188 = this.aFloat186 = 1.0F;
		this.aFloat189 = this.aFloat185 = this.aFloat181 = this.aFloat190 = this.aFloat191 = this.aFloat184 = this.aFloat182 = this.aFloat180 = this.aFloat183 = 0.0F;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I[F)[F")
	public float[] method5106(@OriginalArg(1) float[] arg0) {
		arg0[9] = this.aFloat190;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 0.0F;
		arg0[6] = this.aFloat184;
		arg0[1] = this.aFloat181;
		arg0[4] = this.aFloat189;
		arg0[7] = 0.0F;
		arg0[2] = this.aFloat191;
		arg0[8] = this.aFloat185;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat186;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat188;
		arg0[0] = this.aFloat187;
		return arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FFFFFFFFFZ)V")
	public void method5107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat186 = arg0;
		this.aFloat180 = 0.0F;
		this.aFloat181 = arg1;
		this.aFloat185 = arg5;
		this.aFloat188 = arg8;
		this.aFloat189 = arg6;
		this.aFloat184 = arg7;
		this.aFloat182 = 0.0F;
		this.aFloat190 = arg3;
		this.aFloat187 = arg4;
		this.aFloat191 = arg2;
		this.aFloat183 = 0.0F;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(FIFF)V")
	public void method5108(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat187 = arg0;
		this.aFloat188 = arg1;
		this.aFloat181 = 0.0F;
		this.aFloat186 = arg2;
		this.aFloat182 = 0.0F;
		this.aFloat191 = 0.0F;
		this.aFloat189 = 0.0F;
		this.aFloat180 = 0.0F;
		this.aFloat183 = 0.0F;
		this.aFloat190 = 0.0F;
		this.aFloat184 = 0.0F;
		this.aFloat185 = 0.0F;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IFBFFII)V")
	public void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat180 = arg1 - (float) arg4;
			this.aFloat182 = arg3 - (float) arg0;
			this.aFloat183 = arg2;
			this.aFloat188 = arg4 * 2;
			this.aFloat186 = 1.0F;
			this.aFloat187 = arg0 * 2;
			this.aFloat189 = this.aFloat185 = this.aFloat181 = this.aFloat190 = this.aFloat191 = this.aFloat184 = 0.0F;
			return;
		}
		@Pc(10) float local10 = Class56_Sub8.aFloatArray56[arg5 & 0x3FFF];
		@Pc(16) float local16 = Class56_Sub8.aFloatArray57[arg5 & 0x3FFF];
		this.aFloat181 = local16 * -2.0F * (float) arg4;
		this.aFloat180 = arg1 + (float) (arg4 * 2) * (-0.5F * local16 - local10 * 0.5F);
		this.aFloat186 = 1.0F;
		this.aFloat189 = (float) arg0 * 2.0F * local16;
		this.aFloat182 = (float) (arg0 * 2) * (local16 * 0.5F - local10 * 0.5F) + arg3;
		this.aFloat188 = local10 * 2.0F * (float) arg4;
		this.aFloat185 = this.aFloat190 = this.aFloat191 = this.aFloat184 = 0.0F;
		this.aFloat183 = arg2;
		this.aFloat187 = (float) arg0 * local10 * 2.0F;
	}

	@OriginalMember(owner = "client!mga", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat187;
		@Pc(21) float local21 = this.aFloat181;
		@Pc(24) float local24 = this.aFloat191;
		this.aFloat187 = local15 * this.aFloat185 + local9 * local18;
		@Pc(37) float local37 = this.aFloat182;
		this.aFloat185 = local9 * this.aFloat185 - local15 * local18;
		this.aFloat181 = local21 * local9 + this.aFloat190 * local15;
		this.aFloat190 = this.aFloat190 * local9 - local15 * local21;
		this.aFloat191 = this.aFloat186 * local15 + local9 * local24;
		this.aFloat182 = this.aFloat183 * local15 + local37 * local9;
		this.aFloat186 = local9 * this.aFloat186 - local15 * local24;
		this.aFloat183 = local9 * this.aFloat183 - local15 * local37;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FBFF)V")
	public void method5110(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat187 = this.aFloat188 = this.aFloat186 = 1.0F;
		this.aFloat183 = arg1;
		this.aFloat180 = arg0;
		this.aFloat189 = this.aFloat185 = this.aFloat181 = this.aFloat190 = this.aFloat191 = this.aFloat184 = 0.0F;
		this.aFloat182 = arg2;
	}

	@OriginalMember(owner = "client!mga", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat189;
		@Pc(21) float local21 = this.aFloat188;
		@Pc(24) float local24 = this.aFloat184;
		@Pc(27) float local27 = this.aFloat180;
		this.aFloat189 = local9 * local18 - local15 * this.aFloat185;
		this.aFloat188 = local21 * local9 - this.aFloat190 * local15;
		this.aFloat185 = local18 * local15 + local9 * this.aFloat185;
		this.aFloat184 = local9 * local24 - local15 * this.aFloat186;
		this.aFloat190 = local9 * this.aFloat190 + local21 * local15;
		this.aFloat180 = local9 * local27 - local15 * this.aFloat183;
		this.aFloat186 = this.aFloat186 * local9 + local15 * local24;
		this.aFloat183 = local9 * this.aFloat183 + local15 * local27;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(F[FFFI)V")
	public void method5111(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[2] = this.aFloat186 * arg3 + this.aFloat190 * arg2 + arg0 * this.aFloat185;
		arg1[0] = arg3 * this.aFloat191 + this.aFloat187 * arg0 + this.aFloat181 * arg2;
		arg1[1] = this.aFloat188 * arg2 + arg0 * this.aFloat189 + this.aFloat184 * arg3;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BLclient!q;)V")
	public void method5112(@OriginalArg(1) Class68 arg0) {
		@Pc(6) Class68_Sub2 local6 = (Class68_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat187;
		@Pc(12) float local12 = this.aFloat189;
		@Pc(21) float local21 = this.aFloat181;
		@Pc(24) float local24 = this.aFloat188;
		@Pc(27) float local27 = this.aFloat191;
		@Pc(30) float local30 = this.aFloat184;
		@Pc(33) float local33 = this.aFloat182;
		this.aFloat189 = local12 * local6.aFloat188 + local9 * local6.aFloat189 + local6.aFloat184 * this.aFloat185;
		@Pc(53) float local53 = this.aFloat180;
		this.aFloat187 = local6.aFloat191 * this.aFloat185 + local12 * local6.aFloat181 + local6.aFloat187 * local9;
		this.aFloat181 = this.aFloat190 * local6.aFloat191 + local6.aFloat187 * local21 + local6.aFloat181 * local24;
		this.aFloat188 = this.aFloat190 * local6.aFloat184 + local24 * local6.aFloat188 + local6.aFloat189 * local21;
		this.aFloat185 = local6.aFloat186 * this.aFloat185 + local6.aFloat185 * local9 + local6.aFloat190 * local12;
		this.aFloat191 = local27 * local6.aFloat187 + local30 * local6.aFloat181 + this.aFloat186 * local6.aFloat191;
		this.aFloat190 = local6.aFloat190 * local24 + local21 * local6.aFloat185 + this.aFloat190 * local6.aFloat186;
		this.aFloat184 = this.aFloat186 * local6.aFloat184 + local6.aFloat189 * local27 + local6.aFloat188 * local30;
		this.aFloat186 = local6.aFloat185 * local27 + local6.aFloat190 * local30 + local6.aFloat186 * this.aFloat186;
		this.aFloat182 = local6.aFloat182 + local6.aFloat191 * this.aFloat183 + local53 * local6.aFloat181 + local6.aFloat187 * local33;
		this.aFloat180 = local6.aFloat184 * this.aFloat183 + local53 * local6.aFloat188 + local33 * local6.aFloat189 + local6.aFloat180;
		this.aFloat183 = local6.aFloat183 + this.aFloat183 * local6.aFloat186 + local33 * local6.aFloat185 + local53 * local6.aFloat190;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method5113(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(6) Class68_Sub2 local6 = (Class68_Sub2) arg0;
		@Pc(9) Class68_Sub2 local9 = (Class68_Sub2) arg1;
		this.aFloat187 = local9.aFloat185 * local6.aFloat191 + local6.aFloat187 * local9.aFloat187 + local9.aFloat189 * local6.aFloat181;
		this.aFloat189 = local6.aFloat189 * local9.aFloat187 + local9.aFloat189 * local6.aFloat188 + local6.aFloat184 * local9.aFloat185;
		this.aFloat181 = local6.aFloat181 * local9.aFloat188 + local6.aFloat187 * local9.aFloat181 + local9.aFloat190 * local6.aFloat191;
		this.aFloat185 = local6.aFloat186 * local9.aFloat185 + local6.aFloat190 * local9.aFloat189 + local6.aFloat185 * local9.aFloat187;
		this.aFloat188 = local9.aFloat190 * local6.aFloat184 + local9.aFloat188 * local6.aFloat188 + local9.aFloat181 * local6.aFloat189;
		this.aFloat190 = local6.aFloat185 * local9.aFloat181 + local9.aFloat188 * local6.aFloat190 + local9.aFloat190 * local6.aFloat186;
		this.aFloat191 = local9.aFloat191 * local6.aFloat187 + local6.aFloat181 * local9.aFloat184 + local9.aFloat186 * local6.aFloat191;
		this.aFloat184 = local9.aFloat186 * local6.aFloat184 + local6.aFloat189 * local9.aFloat191 + local6.aFloat188 * local9.aFloat184;
		this.aFloat186 = local9.aFloat186 * local6.aFloat186 + local9.aFloat184 * local6.aFloat190 + local6.aFloat185 * local9.aFloat191;
		this.aFloat182 = local6.aFloat182 + local9.aFloat183 * local6.aFloat191 + local6.aFloat187 * local9.aFloat182 + local6.aFloat181 * local9.aFloat180;
		this.aFloat180 = local6.aFloat180 + local9.aFloat180 * local6.aFloat188 + local6.aFloat189 * local9.aFloat182 + local6.aFloat184 * local9.aFloat183;
		this.aFloat183 = local6.aFloat183 + local9.aFloat182 * local6.aFloat185 + local6.aFloat190 * local9.aFloat180 + local9.aFloat183 * local6.aFloat186;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B[F)[F")
	public float[] method5114(@OriginalArg(1) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat184;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[10] = this.aFloat186;
		arg0[14] = this.aFloat183;
		arg0[13] = this.aFloat180;
		arg0[12] = this.aFloat182;
		arg0[2] = this.aFloat185;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat188;
		arg0[4] = this.aFloat181;
		arg0[1] = this.aFloat189;
		arg0[0] = this.aFloat187;
		arg0[6] = this.aFloat190;
		arg0[8] = this.aFloat191;
		return arg0;
	}

	@OriginalMember(owner = "client!mga", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat182 += arg0;
		this.aFloat180 += arg1;
		this.aFloat183 += arg2;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(ILclient!q;)V")
	public void method5115(@OriginalArg(1) Class68 arg0) {
		@Pc(6) Class68_Sub2 local6 = (Class68_Sub2) arg0;
		this.aFloat181 = local6.aFloat189;
		this.aFloat187 = local6.aFloat187;
		this.aFloat191 = local6.aFloat185;
		this.aFloat185 = local6.aFloat191;
		this.aFloat188 = local6.aFloat188;
		this.aFloat189 = local6.aFloat181;
		this.aFloat184 = local6.aFloat190;
		this.aFloat190 = local6.aFloat184;
		this.aFloat186 = local6.aFloat186;
		this.aFloat182 = -(this.aFloat181 * local6.aFloat180 + this.aFloat187 * local6.aFloat182 + local6.aFloat183 * this.aFloat191);
		this.aFloat180 = -(this.aFloat184 * local6.aFloat183 + this.aFloat188 * local6.aFloat180 + this.aFloat189 * local6.aFloat182);
		this.aFloat183 = -(this.aFloat190 * local6.aFloat180 + this.aFloat185 * local6.aFloat182 + this.aFloat186 * local6.aFloat183);
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I[F)[F")
	public float[] method5116(@OriginalArg(1) float[] arg0) {
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat183;
		arg0[5] = this.aFloat188;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat187;
		arg0[1] = this.aFloat189;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat180;
		arg0[15] = 1.0F;
		arg0[6] = 0.0F;
		arg0[4] = this.aFloat181;
		arg0[8] = this.aFloat182;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mga", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat187;
		@Pc(21) float local21 = this.aFloat181;
		@Pc(24) float local24 = this.aFloat191;
		this.aFloat187 = local18 * local9 - local15 * this.aFloat189;
		@Pc(38) float local38 = this.aFloat182;
		this.aFloat181 = local21 * local9 - this.aFloat188 * local15;
		this.aFloat189 = local15 * local18 + this.aFloat189 * local9;
		this.aFloat188 = this.aFloat188 * local9 + local21 * local15;
		this.aFloat191 = local9 * local24 - local15 * this.aFloat184;
		this.aFloat184 = local24 * local15 + local9 * this.aFloat184;
		this.aFloat182 = local9 * local38 - local15 * this.aFloat180;
		this.aFloat180 = local9 * this.aFloat180 + local38 * local15;
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V")
	public void method5117() {
		this.aFloat184 = -this.aFloat184;
		this.aFloat186 = -this.aFloat186;
		this.aFloat189 = -this.aFloat189;
		this.aFloat190 = -this.aFloat190;
		this.aFloat180 = -this.aFloat180;
		this.aFloat183 = -this.aFloat183;
		this.aFloat188 = -this.aFloat188;
		this.aFloat185 = -this.aFloat185;
	}

	@OriginalMember(owner = "client!mga", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat182;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat180;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat183;
		arg0[2] = (int) (this.aFloat191 * local12 + this.aFloat184 * local20 + this.aFloat186 * local28);
		arg0[0] = (int) (local28 * this.aFloat185 + local20 * this.aFloat189 + local12 * this.aFloat187);
		arg0[1] = (int) (local12 * this.aFloat181 + local20 * this.aFloat188 + this.aFloat190 * local28);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BFFF)V")
	public void method5118(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat185 *= arg2;
		this.aFloat180 *= arg1;
		this.aFloat186 *= arg2;
		this.aFloat187 *= arg0;
		this.aFloat188 *= arg1;
		this.aFloat190 *= arg2;
		this.aFloat182 *= arg0;
		this.aFloat181 *= arg0;
		this.aFloat191 *= arg0;
		this.aFloat184 *= arg1;
		this.aFloat189 *= arg1;
		this.aFloat183 *= arg2;
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(I[F)[F")
	public float[] method5119(@OriginalArg(1) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat190;
		arg0[12] = 0.0F;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat187;
		arg0[1] = this.aFloat181;
		arg0[2] = this.aFloat191;
		arg0[3] = this.aFloat182;
		arg0[6] = this.aFloat184;
		arg0[10] = this.aFloat186;
		arg0[11] = this.aFloat183;
		arg0[5] = this.aFloat188;
		arg0[4] = this.aFloat189;
		arg0[8] = this.aFloat185;
		arg0[7] = this.aFloat180;
		arg0[13] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6462() {
		@Pc(7) Class68_Sub2 local7 = new Class68_Sub2();
		local7.aFloat181 = this.aFloat181;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat183 = this.aFloat183;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat190 = this.aFloat190;
		return local7;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(F[FFIFF)V")
	public void method5121(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg1[2] = this.aFloat186 * arg0 + this.aFloat185 * arg4 + this.aFloat190 * arg2;
		arg1[0] = this.aFloat187 * arg4 + arg2 * this.aFloat181 + this.aFloat191 * arg0;
		arg1[1] = arg0 * this.aFloat184 + arg4 * this.aFloat189 + arg2 * this.aFloat188;
		@Pc(101) float local101;
		@Pc(85) float local85;
		@Pc(93) float local93;
		@Pc(77) float local77;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local77 = -arg3 / arg4;
			local93 = local77 * this.aFloat185 + this.aFloat183;
			local85 = this.aFloat180 + local77 * this.aFloat189;
			local101 = this.aFloat182 + local77 * this.aFloat187;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local77 = -arg3 / arg2;
			local85 = this.aFloat180 + local77 * this.aFloat188;
			local93 = this.aFloat183 + this.aFloat190 * local77;
			local101 = this.aFloat182 + this.aFloat181 * local77;
		} else {
			local77 = -arg3 / arg0;
			local85 = this.aFloat180 + this.aFloat184 * local77;
			local101 = this.aFloat182 + this.aFloat191 * local77;
			local93 = this.aFloat186 * local77 + this.aFloat183;
		}
		arg1[3] = -(local101 * arg1[0] + local85 * arg1[1] + local93 * arg1[2]);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IFFF)F")
	public float method5122(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat191 + this.aFloat181 * arg0 + arg1 * this.aFloat187 + this.aFloat182;
	}
}
