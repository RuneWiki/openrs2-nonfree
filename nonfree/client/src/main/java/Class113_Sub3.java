import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class113_Sub3 extends Class113 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class113_Sub3() {
		this.method8460();
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat187 * (float) arg2 + (float) arg0 * this.aFloat194 + this.aFloat193 * (float) arg1);
		arg3[0] = (int) (this.aFloat190 * (float) arg1 + (float) arg0 * this.aFloat191 + (float) arg2 * this.aFloat197);
		arg3[1] = (int) (this.aFloat186 * (float) arg2 + (float) arg0 * this.aFloat195 + this.aFloat196 * (float) arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V")
	@Override
	public void method8449(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat189;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat192;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat188;
		arg0[2] = (int) (this.aFloat187 * local28 + this.aFloat197 * local11 + local19 * this.aFloat186);
		arg0[1] = (int) (this.aFloat196 * local19 + this.aFloat190 * local11 + this.aFloat193 * local28);
		arg0[0] = (int) (this.aFloat194 * local28 + local19 * this.aFloat195 + local11 * this.aFloat191);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	@Override
	public void method8453(@OriginalArg(0) int arg0) {
		this.aFloat187 = 1.0F;
		this.aFloat191 = this.aFloat196 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat195 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat190 = -this.aFloat195;
		this.aFloat197 = this.aFloat189 = this.aFloat186 = this.aFloat192 = this.aFloat194 = this.aFloat193 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	@Override
	public void method8459(@OriginalArg(0) int arg0) {
		this.aFloat196 = 1.0F;
		this.aFloat191 = this.aFloat187 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat197 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat190 = this.aFloat189 = this.aFloat195 = this.aFloat186 = this.aFloat192 = this.aFloat193 = this.aFloat188 = 0.0F;
		this.aFloat194 = -this.aFloat197;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub5_Sub10.aFloatArray24[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub5_Sub10.aFloatArray25[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub5_Sub10.aFloatArray24[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub5_Sub10.aFloatArray25[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat195 = local43 * local27 + local39 * -local21;
		this.aFloat186 = local21 * local43 + local27 * local39;
		this.aFloat187 = local21 * local9;
		this.aFloat190 = local9 * local39;
		this.aFloat191 = local27 * local47 + local33 * local21;
		this.aFloat194 = local27 * local9;
		this.aFloat196 = local9 * local33;
		this.aFloat197 = -local27 * local33 + local47 * local21;
		this.aFloat193 = -local15;
		this.aFloat188 = -(this.aFloat187 * (float) arg2) - (float) arg1 * this.aFloat193 + (float) -arg0 * this.aFloat194;
		this.aFloat189 = -((float) arg2 * this.aFloat197) + (float) -arg0 * this.aFloat191 - this.aFloat190 * (float) arg1;
		this.aFloat192 = -(this.aFloat196 * (float) arg1) + this.aFloat195 * (float) -arg0 - this.aFloat186 * (float) arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	@Override
	public void method8454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat192 += arg1;
		this.aFloat189 += arg0;
		this.aFloat188 += arg2;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	@Override
	public void method8461(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat191;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat197;
		@Pc(27) float local27 = this.aFloat189;
		this.aFloat191 = this.aFloat194 * local15 + local18 * local9;
		this.aFloat190 = local15 * this.aFloat193 + local9 * local21;
		this.aFloat194 = this.aFloat194 * local9 - local15 * local18;
		this.aFloat197 = local15 * this.aFloat187 + local24 * local9;
		this.aFloat193 = this.aFloat193 * local9 - local21 * local15;
		this.aFloat187 = local9 * this.aFloat187 - local15 * local24;
		this.aFloat189 = local9 * local27 + local15 * this.aFloat188;
		this.aFloat188 = local9 * this.aFloat188 - local15 * local27;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
	@Override
	public void method8460() {
		this.aFloat195 = this.aFloat194 = this.aFloat190 = this.aFloat193 = this.aFloat197 = this.aFloat186 = this.aFloat189 = this.aFloat192 = this.aFloat188 = 0.0F;
		this.aFloat191 = this.aFloat196 = this.aFloat187 = 1.0F;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	@Override
	public void method8457(@OriginalArg(0) int arg0) {
		this.aFloat191 = 1.0F;
		this.aFloat196 = this.aFloat187 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat193 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat186 = -this.aFloat193;
		this.aFloat190 = this.aFloat197 = this.aFloat189 = this.aFloat195 = this.aFloat192 = this.aFloat194 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8456(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub3 local6 = (Class113_Sub3) arg0;
		this.aFloat197 = local6.aFloat197;
		this.aFloat186 = local6.aFloat186;
		this.aFloat190 = local6.aFloat190;
		this.aFloat188 = local6.aFloat188;
		this.aFloat192 = local6.aFloat192;
		this.aFloat189 = local6.aFloat189;
		this.aFloat194 = local6.aFloat194;
		this.aFloat195 = local6.aFloat195;
		this.aFloat196 = local6.aFloat196;
		this.aFloat187 = local6.aFloat187;
		this.aFloat191 = local6.aFloat191;
		this.aFloat193 = local6.aFloat193;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method8446() {
		@Pc(7) Class113_Sub3 local7 = new Class113_Sub3();
		local7.aFloat188 = this.aFloat188;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat196 = this.aFloat196;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat190 = this.aFloat190;
		return local7;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat188 + (float) arg0 * this.aFloat194 + this.aFloat193 * (float) arg1 + (float) arg2 * this.aFloat187);
		arg3[1] = (int) (this.aFloat192 + this.aFloat186 * (float) arg2 + this.aFloat195 * (float) arg0 + this.aFloat196 * (float) arg1);
		arg3[0] = (int) (this.aFloat189 + (float) arg1 * this.aFloat190 + this.aFloat191 * (float) arg0 + (float) arg2 * this.aFloat197);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat191 = this.aFloat196 = this.aFloat187 = 1.0F;
		this.aFloat189 = arg0;
		this.aFloat195 = this.aFloat194 = this.aFloat190 = this.aFloat193 = this.aFloat197 = this.aFloat186 = 0.0F;
		this.aFloat192 = arg1;
		this.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat189);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat188);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat192);
		arg3[2] = (int) ((float) local17 * this.aFloat187 + this.aFloat197 * (float) local6 + (float) local24 * this.aFloat186);
		arg3[1] = (int) (this.aFloat196 * (float) local24 + (float) local6 * this.aFloat190 + this.aFloat193 * (float) local17);
		arg3[0] = (int) (this.aFloat194 * (float) local17 + (float) local6 * this.aFloat191 + (float) local24 * this.aFloat195);
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	@Override
	public void method8455(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat195;
		@Pc(21) float local21 = this.aFloat196;
		@Pc(24) float local24 = this.aFloat186;
		this.aFloat195 = local18 * local9 - this.aFloat194 * local15;
		@Pc(37) float local37 = this.aFloat192;
		this.aFloat194 = this.aFloat194 * local9 + local15 * local18;
		this.aFloat196 = local21 * local9 - this.aFloat193 * local15;
		this.aFloat193 = local9 * this.aFloat193 + local21 * local15;
		this.aFloat186 = local24 * local9 - local15 * this.aFloat187;
		this.aFloat192 = local37 * local9 - local15 * this.aFloat188;
		this.aFloat187 = local9 * this.aFloat187 + local24 * local15;
		this.aFloat188 = local9 * this.aFloat188 + local37 * local15;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat191;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat197;
		@Pc(27) float local27 = this.aFloat189;
		this.aFloat191 = local9 * local18 - this.aFloat195 * local15;
		this.aFloat195 = local9 * this.aFloat195 + local18 * local15;
		this.aFloat190 = local9 * local21 - local15 * this.aFloat196;
		this.aFloat196 = local21 * local15 + local9 * this.aFloat196;
		this.aFloat197 = local24 * local9 - local15 * this.aFloat186;
		this.aFloat189 = local27 * local9 - local15 * this.aFloat192;
		this.aFloat186 = local15 * local24 + local9 * this.aFloat186;
		this.aFloat192 = local15 * local27 + this.aFloat192 * local9;
	}
}
