import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class203_Sub3 extends Class203 {

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!tp", name = "B", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!tp", name = "M", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class203_Sub3() {
		this.method8337();
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
	@Override
	public void method8332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat191 = (float) arg2;
		this.aFloat193 = this.aFloat195 = this.aFloat196 = this.aFloat194 = this.aFloat190 = this.aFloat198 = 0.0F;
		this.aFloat197 = (float) arg0;
		this.aFloat192 = (float) arg1;
		this.aFloat189 = this.aFloat199 = this.aFloat188 = 1.0F;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat190 + this.aFloat196 * (float) arg1 + this.aFloat189 * (float) arg0);
		arg3[1] = (int) (this.aFloat198 * (float) arg2 + (float) arg1 * this.aFloat199 + this.aFloat193 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat188 + (float) arg0 * this.aFloat195 + (float) arg1 * this.aFloat194);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class176.aFloatArray33[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class176.aFloatArray32[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class176.aFloatArray33[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class176.aFloatArray32[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat196 = local39 * local9;
		this.aFloat193 = local27 * local43 + -local21 * local39;
		this.aFloat189 = local21 * local33 + local47 * local27;
		this.aFloat199 = local33 * local9;
		this.aFloat194 = -local15;
		this.aFloat188 = local21 * local9;
		this.aFloat195 = local9 * local27;
		this.aFloat198 = local21 * local43 + local27 * local39;
		this.aFloat190 = -local27 * local33 + local47 * local21;
		this.aFloat191 = -((float) arg1 * this.aFloat194) + this.aFloat195 * (float) -arg0 - (float) arg2 * this.aFloat188;
		this.aFloat192 = -((float) arg1 * this.aFloat199) + (float) -arg0 * this.aFloat193 - this.aFloat198 * (float) arg2;
		this.aFloat197 = -((float) arg1 * this.aFloat196) + (float) -arg0 * this.aFloat189 - this.aFloat190 * (float) arg2;
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V")
	@Override
	public void method8326(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat193;
		@Pc(21) float local21 = this.aFloat199;
		@Pc(24) float local24 = this.aFloat198;
		this.aFloat193 = local18 * local9 - local15 * this.aFloat195;
		@Pc(37) float local37 = this.aFloat192;
		this.aFloat195 = local9 * this.aFloat195 + local18 * local15;
		this.aFloat199 = local21 * local9 - this.aFloat194 * local15;
		this.aFloat194 = local21 * local15 + this.aFloat194 * local9;
		this.aFloat198 = local24 * local9 - local15 * this.aFloat188;
		this.aFloat188 = local24 * local15 + this.aFloat188 * local9;
		this.aFloat192 = local37 * local9 - this.aFloat191 * local15;
		this.aFloat191 = local15 * local37 + this.aFloat191 * local9;
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V")
	@Override
	public void method8331(@OriginalArg(0) int arg0) {
		this.aFloat199 = 1.0F;
		this.aFloat189 = this.aFloat188 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat190 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat195 = -this.aFloat190;
		this.aFloat196 = this.aFloat197 = this.aFloat193 = this.aFloat198 = this.aFloat192 = this.aFloat194 = this.aFloat191 = 0.0F;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method8323() {
		@Pc(7) Class203_Sub3 local7 = new Class203_Sub3();
		local7.aFloat194 = this.aFloat194;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat196 = this.aFloat196;
		return local7;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "()V")
	@Override
	public void method8337() {
		this.aFloat189 = this.aFloat199 = this.aFloat188 = 1.0F;
		this.aFloat193 = this.aFloat195 = this.aFloat196 = this.aFloat194 = this.aFloat190 = this.aFloat198 = this.aFloat197 = this.aFloat192 = this.aFloat191 = 0.0F;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat192 + (float) arg1 * this.aFloat199 + this.aFloat193 * (float) arg0 + (float) arg2 * this.aFloat198);
		arg3[2] = (int) (this.aFloat191 + this.aFloat188 * (float) arg2 + this.aFloat194 * (float) arg1 + (float) arg0 * this.aFloat195);
		arg3[0] = (int) ((float) arg2 * this.aFloat190 + (float) arg0 * this.aFloat189 + (float) arg1 * this.aFloat196 + this.aFloat197);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat189;
		@Pc(21) float local21 = this.aFloat196;
		@Pc(24) float local24 = this.aFloat190;
		@Pc(27) float local27 = this.aFloat197;
		this.aFloat189 = local9 * local18 - this.aFloat193 * local15;
		this.aFloat196 = local9 * local21 - local15 * this.aFloat199;
		this.aFloat193 = local15 * local18 + local9 * this.aFloat193;
		this.aFloat199 = this.aFloat199 * local9 + local21 * local15;
		this.aFloat190 = local24 * local9 - local15 * this.aFloat198;
		this.aFloat198 = local9 * this.aFloat198 + local15 * local24;
		this.aFloat197 = local27 * local9 - this.aFloat192 * local15;
		this.aFloat192 = local15 * local27 + local9 * this.aFloat192;
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V")
	@Override
	public void method8338(@OriginalArg(0) int arg0) {
		this.aFloat188 = 1.0F;
		this.aFloat189 = this.aFloat199 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat193 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat196 = -this.aFloat193;
		this.aFloat190 = this.aFloat197 = this.aFloat198 = this.aFloat192 = this.aFloat195 = this.aFloat194 = this.aFloat191 = 0.0F;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat192);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat197);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat191);
		arg3[1] = (int) (this.aFloat199 * (float) local6 + (float) local17 * this.aFloat196 + (float) local24 * this.aFloat194);
		arg3[0] = (int) ((float) local24 * this.aFloat195 + (float) local6 * this.aFloat193 + this.aFloat189 * (float) local17);
		arg3[2] = (int) ((float) local17 * this.aFloat190 + (float) local6 * this.aFloat198 + this.aFloat188 * (float) local24);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method8336(@OriginalArg(0) Class203 arg0) {
		@Pc(6) Class203_Sub3 local6 = (Class203_Sub3) arg0;
		this.aFloat192 = local6.aFloat192;
		this.aFloat189 = local6.aFloat189;
		this.aFloat197 = local6.aFloat197;
		this.aFloat196 = local6.aFloat196;
		this.aFloat191 = local6.aFloat191;
		this.aFloat198 = local6.aFloat198;
		this.aFloat199 = local6.aFloat199;
		this.aFloat193 = local6.aFloat193;
		this.aFloat194 = local6.aFloat194;
		this.aFloat188 = local6.aFloat188;
		this.aFloat190 = local6.aFloat190;
		this.aFloat195 = local6.aFloat195;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat191 += (float) arg2;
		this.aFloat192 += (float) arg1;
		this.aFloat197 += (float) arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([I)V")
	@Override
	public void method8333(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat197;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat192;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat191;
		arg0[1] = (int) (this.aFloat194 * local28 + this.aFloat199 * local19 + local11 * this.aFloat196);
		arg0[2] = (int) (local19 * this.aFloat198 + local11 * this.aFloat190 + this.aFloat188 * local28);
		arg0[0] = (int) (this.aFloat195 * local28 + this.aFloat193 * local19 + local11 * this.aFloat189);
	}

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "(I)V")
	@Override
	public void method8324(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat189;
		@Pc(21) float local21 = this.aFloat196;
		@Pc(24) float local24 = this.aFloat190;
		this.aFloat189 = this.aFloat195 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat197;
		this.aFloat196 = local21 * local9 + local15 * this.aFloat194;
		this.aFloat195 = this.aFloat195 * local9 - local15 * local18;
		this.aFloat190 = local24 * local9 + this.aFloat188 * local15;
		this.aFloat194 = local9 * this.aFloat194 - local21 * local15;
		this.aFloat188 = local9 * this.aFloat188 - local24 * local15;
		this.aFloat197 = local15 * this.aFloat191 + local9 * local37;
		this.aFloat191 = this.aFloat191 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0) {
		this.aFloat189 = 1.0F;
		this.aFloat199 = this.aFloat188 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat194 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat196 = this.aFloat190 = this.aFloat197 = this.aFloat193 = this.aFloat192 = this.aFloat195 = this.aFloat191 = 0.0F;
		this.aFloat198 = -this.aFloat194;
	}
}
