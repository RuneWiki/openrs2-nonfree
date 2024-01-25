import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class263_Sub3 extends Class263 {

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!tr", name = "H", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!tr", name = "I", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class263_Sub3() {
		this.method8432();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([I)V")
	@Override
	public void method8443(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat202;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat197;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat201;
		arg0[2] = (int) (local28 * this.aFloat193 + this.aFloat198 * local11 + local19 * this.aFloat192);
		arg0[1] = (int) (this.aFloat200 * local19 + local11 * this.aFloat195 + this.aFloat199 * local28);
		arg0[0] = (int) (this.aFloat196 * local11 + local19 * this.aFloat191 + this.aFloat194 * local28);
	}

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat196;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat198;
		@Pc(27) float local27 = this.aFloat202;
		this.aFloat196 = local18 * local9 - this.aFloat191 * local15;
		this.aFloat191 = local18 * local15 + this.aFloat191 * local9;
		this.aFloat195 = local21 * local9 - local15 * this.aFloat200;
		this.aFloat200 = local9 * this.aFloat200 + local21 * local15;
		this.aFloat198 = local24 * local9 - this.aFloat192 * local15;
		this.aFloat192 = this.aFloat192 * local9 + local15 * local24;
		this.aFloat202 = local27 * local9 - local15 * this.aFloat197;
		this.aFloat197 = this.aFloat197 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class98.aFloatArray11[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class98.aFloatArray10[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class98.aFloatArray11[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class98.aFloatArray10[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat195 = local9 * local39;
		this.aFloat196 = local33 * local21 + local47 * local27;
		this.aFloat198 = local21 * local47 + -local27 * local33;
		this.aFloat192 = local27 * local39 + local21 * local43;
		this.aFloat191 = local39 * -local21 + local43 * local27;
		this.aFloat199 = -local15;
		this.aFloat193 = local21 * local9;
		this.aFloat200 = local9 * local33;
		this.aFloat194 = local9 * local27;
		this.aFloat202 = -((float) arg2 * this.aFloat198) - this.aFloat195 * (float) arg1 + this.aFloat196 * (float) -arg0;
		this.aFloat197 = -((float) arg2 * this.aFloat192) - (float) arg1 * this.aFloat200 + (float) -arg0 * this.aFloat191;
		this.aFloat201 = -((float) arg2 * this.aFloat193) + (float) -arg0 * this.aFloat194 - this.aFloat199 * (float) arg1;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat199 * (float) arg1 + this.aFloat194 * (float) arg0 + this.aFloat193 * (float) arg2);
		arg3[0] = (int) (this.aFloat196 * (float) arg0 + (float) arg1 * this.aFloat195 + (float) arg2 * this.aFloat198);
		arg3[1] = (int) ((float) arg1 * this.aFloat200 + this.aFloat191 * (float) arg0 + (float) arg2 * this.aFloat192);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "()V")
	@Override
	public void method8432() {
		this.aFloat196 = this.aFloat200 = this.aFloat193 = 1.0F;
		this.aFloat191 = this.aFloat194 = this.aFloat195 = this.aFloat199 = this.aFloat198 = this.aFloat192 = this.aFloat202 = this.aFloat197 = this.aFloat201 = 0.0F;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method8437(@OriginalArg(0) Class263 arg0) {
		@Pc(6) Class263_Sub3 local6 = (Class263_Sub3) arg0;
		this.aFloat199 = local6.aFloat199;
		this.aFloat202 = local6.aFloat202;
		this.aFloat195 = local6.aFloat195;
		this.aFloat201 = local6.aFloat201;
		this.aFloat194 = local6.aFloat194;
		this.aFloat193 = local6.aFloat193;
		this.aFloat200 = local6.aFloat200;
		this.aFloat196 = local6.aFloat196;
		this.aFloat198 = local6.aFloat198;
		this.aFloat191 = local6.aFloat191;
		this.aFloat192 = local6.aFloat192;
		this.aFloat197 = local6.aFloat197;
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat201);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat202);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat197);
		arg3[2] = (int) (this.aFloat193 * (float) local6 + this.aFloat198 * (float) local13 + (float) local20 * this.aFloat192);
		arg3[1] = (int) ((float) local6 * this.aFloat199 + this.aFloat200 * (float) local20 + this.aFloat195 * (float) local13);
		arg3[0] = (int) ((float) local13 * this.aFloat196 + (float) local20 * this.aFloat191 + this.aFloat194 * (float) local6);
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V")
	@Override
	public void method8435(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat196;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat198;
		this.aFloat196 = local18 * local9 + local15 * this.aFloat194;
		@Pc(37) float local37 = this.aFloat202;
		this.aFloat195 = local9 * local21 + local15 * this.aFloat199;
		this.aFloat194 = local9 * this.aFloat194 - local18 * local15;
		this.aFloat198 = local24 * local9 + local15 * this.aFloat193;
		this.aFloat199 = this.aFloat199 * local9 - local21 * local15;
		this.aFloat202 = this.aFloat201 * local15 + local37 * local9;
		this.aFloat193 = local9 * this.aFloat193 - local24 * local15;
		this.aFloat201 = local9 * this.aFloat201 - local15 * local37;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
	@Override
	public void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat197 = (float) arg1;
		this.aFloat202 = (float) arg0;
		this.aFloat191 = this.aFloat194 = this.aFloat195 = this.aFloat199 = this.aFloat198 = this.aFloat192 = 0.0F;
		this.aFloat201 = (float) arg2;
		this.aFloat196 = this.aFloat200 = this.aFloat193 = 1.0F;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	@Override
	public void method8436(@OriginalArg(0) int arg0) {
		this.aFloat196 = 1.0F;
		this.aFloat200 = this.aFloat193 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat199 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat195 = this.aFloat198 = this.aFloat202 = this.aFloat191 = this.aFloat197 = this.aFloat194 = this.aFloat201 = 0.0F;
		this.aFloat192 = -this.aFloat199;
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)V")
	@Override
	public void method8449(@OriginalArg(0) int arg0) {
		this.aFloat193 = 1.0F;
		this.aFloat196 = this.aFloat200 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat191 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat198 = this.aFloat202 = this.aFloat192 = this.aFloat197 = this.aFloat194 = this.aFloat199 = this.aFloat201 = 0.0F;
		this.aFloat195 = -this.aFloat191;
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
	@Override
	public void method8439(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class98.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class98.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat191;
		@Pc(21) float local21 = this.aFloat200;
		@Pc(24) float local24 = this.aFloat192;
		@Pc(27) float local27 = this.aFloat197;
		this.aFloat191 = local9 * local18 - this.aFloat194 * local15;
		this.aFloat200 = local21 * local9 - local15 * this.aFloat199;
		this.aFloat194 = local15 * local18 + local9 * this.aFloat194;
		this.aFloat192 = local24 * local9 - this.aFloat193 * local15;
		this.aFloat199 = this.aFloat199 * local9 + local15 * local21;
		this.aFloat193 = local24 * local15 + this.aFloat193 * local9;
		this.aFloat197 = local27 * local9 - local15 * this.aFloat201;
		this.aFloat201 = local9 * this.aFloat201 + local15 * local27;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat202 + this.aFloat195 * (float) arg1 + (float) arg0 * this.aFloat196 + (float) arg2 * this.aFloat198);
		arg3[2] = (int) (this.aFloat194 * (float) arg0 + this.aFloat199 * (float) arg1 + this.aFloat193 * (float) arg2 + this.aFloat201);
		arg3[1] = (int) (this.aFloat197 + (float) arg0 * this.aFloat191 + this.aFloat200 * (float) arg1 + this.aFloat192 * (float) arg2);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method8434() {
		@Pc(7) Class263_Sub3 local7 = new Class263_Sub3();
		local7.aFloat196 = this.aFloat196;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat201 = this.aFloat201;
		local7.aFloat192 = this.aFloat192;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat202 = this.aFloat202;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat200 = this.aFloat200;
		local7.aFloat191 = this.aFloat191;
		return local7;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat197 += (float) arg1;
		this.aFloat201 += (float) arg2;
		this.aFloat202 += (float) arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0) {
		this.aFloat200 = 1.0F;
		this.aFloat196 = this.aFloat193 = Class98.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat198 = Class98.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat194 = -this.aFloat198;
		this.aFloat195 = this.aFloat202 = this.aFloat191 = this.aFloat192 = this.aFloat197 = this.aFloat199 = this.aFloat201 = 0.0F;
	}
}
