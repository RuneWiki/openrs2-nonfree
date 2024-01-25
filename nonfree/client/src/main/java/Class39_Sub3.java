import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!rda", name = "K", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class39_Sub3() {
		this.method7246();
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat196;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat191;
		this.aFloat196 = local9 * local18 + local15 * this.aFloat192;
		@Pc(37) float local37 = this.aFloat194;
		this.aFloat195 = this.aFloat193 * local15 + local21 * local9;
		this.aFloat192 = this.aFloat192 * local9 - local18 * local15;
		this.aFloat191 = local15 * this.aFloat189 + local24 * local9;
		this.aFloat193 = local9 * this.aFloat193 - local21 * local15;
		this.aFloat189 = local9 * this.aFloat189 - local24 * local15;
		this.aFloat194 = local9 * local37 + this.aFloat188 * local15;
		this.aFloat188 = local9 * this.aFloat188 - local37 * local15;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "()V")
	@Override
	public void method7246() {
		this.aFloat198 = this.aFloat192 = this.aFloat195 = this.aFloat193 = this.aFloat191 = this.aFloat197 = this.aFloat194 = this.aFloat187 = this.aFloat188 = 0.0F;
		this.aFloat196 = this.aFloat190 = this.aFloat189 = 1.0F;
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0) {
		this.aFloat189 = 1.0F;
		this.aFloat196 = this.aFloat190 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat198 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat195 = -this.aFloat198;
		this.aFloat191 = this.aFloat194 = this.aFloat197 = this.aFloat187 = this.aFloat192 = this.aFloat193 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([I)V")
	@Override
	public void method7241(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat194;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat187;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat188;
		arg0[0] = (int) (local12 * this.aFloat196 + this.aFloat198 * local21 + local29 * this.aFloat192);
		arg0[1] = (int) (this.aFloat193 * local29 + local12 * this.aFloat195 + local21 * this.aFloat190);
		arg0[2] = (int) (local21 * this.aFloat197 + this.aFloat191 * local12 + local29 * this.aFloat189);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	@Override
	public void method7237(@OriginalArg(0) int arg0) {
		this.aFloat196 = 1.0F;
		this.aFloat190 = this.aFloat189 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat193 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat195 = this.aFloat191 = this.aFloat194 = this.aFloat198 = this.aFloat187 = this.aFloat192 = this.aFloat188 = 0.0F;
		this.aFloat197 = -this.aFloat193;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class10_Sub3.aFloatArray78[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class10_Sub3.aFloatArray79[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class10_Sub3.aFloatArray78[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class10_Sub3.aFloatArray79[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat189 = local21 * local9;
		this.aFloat197 = local39 * local27 + local21 * local43;
		this.aFloat191 = local33 * -local27 + local47 * local21;
		this.aFloat193 = -local15;
		this.aFloat196 = local27 * local47 + local33 * local21;
		this.aFloat198 = -local21 * local39 + local27 * local43;
		this.aFloat195 = local39 * local9;
		this.aFloat190 = local33 * local9;
		this.aFloat192 = local27 * local9;
		this.aFloat188 = -((float) arg2 * this.aFloat189) - (float) arg1 * this.aFloat193 + this.aFloat192 * (float) -arg0;
		this.aFloat187 = -(this.aFloat197 * (float) arg2) + (float) -arg0 * this.aFloat198 - this.aFloat190 * (float) arg1;
		this.aFloat194 = -(this.aFloat191 * (float) arg2) - (float) arg1 * this.aFloat195 + this.aFloat196 * (float) -arg0;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat198;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat197;
		@Pc(27) float local27 = this.aFloat187;
		this.aFloat198 = local9 * local18 - local15 * this.aFloat192;
		this.aFloat190 = local21 * local9 - this.aFloat193 * local15;
		this.aFloat192 = this.aFloat192 * local9 + local15 * local18;
		this.aFloat197 = local24 * local9 - this.aFloat189 * local15;
		this.aFloat193 = local15 * local21 + this.aFloat193 * local9;
		this.aFloat187 = local27 * local9 - local15 * this.aFloat188;
		this.aFloat189 = this.aFloat189 * local9 + local15 * local24;
		this.aFloat188 = local9 * this.aFloat188 + local15 * local27;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat198 * (float) arg0 + this.aFloat190 * (float) arg1 + (float) arg2 * this.aFloat197);
		arg3[0] = (int) ((float) arg2 * this.aFloat191 + this.aFloat196 * (float) arg0 + (float) arg1 * this.aFloat195);
		arg3[2] = (int) ((float) arg0 * this.aFloat192 + this.aFloat193 * (float) arg1 + this.aFloat189 * (float) arg2);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
	@Override
	public void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat194 = arg0;
		this.aFloat196 = this.aFloat190 = this.aFloat189 = 1.0F;
		this.aFloat198 = this.aFloat192 = this.aFloat195 = this.aFloat193 = this.aFloat191 = this.aFloat197 = 0.0F;
		this.aFloat187 = arg1;
		this.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method7236(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub3 local6 = (Class39_Sub3) arg0;
		this.aFloat194 = local6.aFloat194;
		this.aFloat188 = local6.aFloat188;
		this.aFloat198 = local6.aFloat198;
		this.aFloat191 = local6.aFloat191;
		this.aFloat190 = local6.aFloat190;
		this.aFloat187 = local6.aFloat187;
		this.aFloat196 = local6.aFloat196;
		this.aFloat192 = local6.aFloat192;
		this.aFloat189 = local6.aFloat189;
		this.aFloat195 = local6.aFloat195;
		this.aFloat197 = local6.aFloat197;
		this.aFloat193 = local6.aFloat193;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		this.aFloat190 = 1.0F;
		this.aFloat196 = this.aFloat189 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat191 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat195 = this.aFloat194 = this.aFloat198 = this.aFloat197 = this.aFloat187 = this.aFloat193 = this.aFloat188 = 0.0F;
		this.aFloat192 = -this.aFloat191;
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat196;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat191;
		@Pc(27) float local27 = this.aFloat194;
		this.aFloat196 = local9 * local18 - this.aFloat198 * local15;
		this.aFloat198 = local18 * local15 + this.aFloat198 * local9;
		this.aFloat195 = local9 * local21 - local15 * this.aFloat190;
		this.aFloat190 = local21 * local15 + local9 * this.aFloat190;
		this.aFloat191 = local9 * local24 - this.aFloat197 * local15;
		this.aFloat197 = local24 * local15 + local9 * this.aFloat197;
		this.aFloat194 = local27 * local9 - this.aFloat187 * local15;
		this.aFloat187 = local27 * local15 + this.aFloat187 * local9;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7248() {
		@Pc(7) Class39_Sub3 local7 = new Class39_Sub3();
		local7.aFloat198 = this.aFloat198;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat196 = this.aFloat196;
		local7.aFloat189 = this.aFloat189;
		return local7;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat194);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat187);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat188);
		arg3[1] = (int) ((float) local24 * this.aFloat193 + this.aFloat190 * (float) local17 + this.aFloat195 * (float) local10);
		arg3[2] = (int) (this.aFloat197 * (float) local17 + this.aFloat191 * (float) local10 + (float) local24 * this.aFloat189);
		arg3[0] = (int) (this.aFloat192 * (float) local24 + (float) local10 * this.aFloat196 + (float) local17 * this.aFloat198);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat191 * (float) arg2 + this.aFloat196 * (float) arg0 + this.aFloat195 * (float) arg1 + this.aFloat194);
		arg3[1] = (int) ((float) arg1 * this.aFloat190 + this.aFloat198 * (float) arg0 + this.aFloat197 * (float) arg2 + this.aFloat187);
		arg3[2] = (int) (this.aFloat189 * (float) arg2 + (float) arg1 * this.aFloat193 + (float) arg0 * this.aFloat192 + this.aFloat188);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat194 += arg0;
		this.aFloat187 += arg1;
		this.aFloat188 += arg2;
	}
}
