import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class17_Sub1() {
		this.method6239();
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	@Override
	public void method6238(@OriginalArg(0) int arg0) {
		this.aFloat57 = 1.0F;
		this.aFloat56 = this.aFloat50 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat46 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat48 = -this.aFloat46;
		this.aFloat54 = this.aFloat55 = this.aFloat52 = this.aFloat53 = this.aFloat51 = this.aFloat47 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat53 + (float) arg2 * this.aFloat52 + this.aFloat50 * (float) arg1 + (float) arg0 * this.aFloat46);
		arg3[2] = (int) (this.aFloat49 + (float) arg1 * this.aFloat47 + this.aFloat51 * (float) arg0 + this.aFloat57 * (float) arg2);
		arg3[0] = (int) (this.aFloat54 * (float) arg2 + this.aFloat56 * (float) arg0 + this.aFloat48 * (float) arg1 + this.aFloat55);
	}

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat48;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat55;
		this.aFloat56 = local18 * local9 - this.aFloat46 * local15;
		this.aFloat46 = local18 * local15 + this.aFloat46 * local9;
		this.aFloat48 = local9 * local21 - this.aFloat50 * local15;
		this.aFloat54 = local24 * local9 - this.aFloat52 * local15;
		this.aFloat50 = local15 * local21 + this.aFloat50 * local9;
		this.aFloat52 = local9 * this.aFloat52 + local15 * local24;
		this.aFloat55 = local9 * local27 - this.aFloat53 * local15;
		this.aFloat53 = local9 * this.aFloat53 + local27 * local15;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	@Override
	public void method6228(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat46;
		@Pc(21) float local21 = this.aFloat50;
		@Pc(24) float local24 = this.aFloat52;
		@Pc(27) float local27 = this.aFloat53;
		this.aFloat46 = local9 * local18 - local15 * this.aFloat51;
		this.aFloat50 = local21 * local9 - local15 * this.aFloat47;
		this.aFloat51 = local18 * local15 + local9 * this.aFloat51;
		this.aFloat47 = local9 * this.aFloat47 + local21 * local15;
		this.aFloat52 = local24 * local9 - this.aFloat57 * local15;
		this.aFloat53 = local27 * local9 - this.aFloat49 * local15;
		this.aFloat57 = local9 * this.aFloat57 + local24 * local15;
		this.aFloat49 = local9 * this.aFloat49 + local27 * local15;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat54 + (float) arg0 * this.aFloat56 + (float) arg1 * this.aFloat48);
		arg3[2] = (int) ((float) arg2 * this.aFloat57 + this.aFloat51 * (float) arg0 + (float) arg1 * this.aFloat47);
		arg3[1] = (int) ((float) arg2 * this.aFloat52 + (float) arg1 * this.aFloat50 + (float) arg0 * this.aFloat46);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([I)V")
	@Override
	public void method6226(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat55;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat53;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat49;
		arg0[0] = (int) (local19 * this.aFloat46 + local11 * this.aFloat56 + this.aFloat51 * local27);
		arg0[2] = (int) (local27 * this.aFloat57 + this.aFloat54 * local11 + this.aFloat52 * local19);
		arg0[1] = (int) (this.aFloat48 * local11 + this.aFloat50 * local19 + local27 * this.aFloat47);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method6233(@OriginalArg(0) Class17 arg0) {
		@Pc(6) Class17_Sub1 local6 = (Class17_Sub1) arg0;
		this.aFloat49 = local6.aFloat49;
		this.aFloat52 = local6.aFloat52;
		this.aFloat57 = local6.aFloat57;
		this.aFloat48 = local6.aFloat48;
		this.aFloat47 = local6.aFloat47;
		this.aFloat56 = local6.aFloat56;
		this.aFloat55 = local6.aFloat55;
		this.aFloat46 = local6.aFloat46;
		this.aFloat51 = local6.aFloat51;
		this.aFloat54 = local6.aFloat54;
		this.aFloat50 = local6.aFloat50;
		this.aFloat53 = local6.aFloat53;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	@Override
	public void method6234(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat48;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat55;
		this.aFloat56 = this.aFloat51 * local15 + local18 * local9;
		this.aFloat51 = this.aFloat51 * local9 - local18 * local15;
		this.aFloat48 = local9 * local21 + local15 * this.aFloat47;
		this.aFloat47 = local9 * this.aFloat47 - local21 * local15;
		this.aFloat54 = local24 * local9 + local15 * this.aFloat57;
		this.aFloat57 = this.aFloat57 * local9 - local15 * local24;
		this.aFloat55 = local9 * local27 + local15 * this.aFloat49;
		this.aFloat49 = this.aFloat49 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat56 = this.aFloat50 = this.aFloat57 = 1.0F;
		this.aFloat53 = (float) arg1;
		this.aFloat49 = (float) arg2;
		this.aFloat46 = this.aFloat51 = this.aFloat48 = this.aFloat47 = this.aFloat54 = this.aFloat52 = 0.0F;
		this.aFloat55 = (float) arg0;
	}

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat50 = this.aFloat57 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat47 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat52 = -this.aFloat47;
		this.aFloat48 = this.aFloat54 = this.aFloat55 = this.aFloat46 = this.aFloat53 = this.aFloat51 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
	@Override
	public void method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat55 += (float) arg0;
		this.aFloat49 += (float) arg2;
		this.aFloat53 += (float) arg1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	@Override
	public void method6227(@OriginalArg(0) int arg0) {
		this.aFloat50 = 1.0F;
		this.aFloat56 = this.aFloat57 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat54 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat48 = this.aFloat55 = this.aFloat46 = this.aFloat52 = this.aFloat53 = this.aFloat47 = this.aFloat49 = 0.0F;
		this.aFloat51 = -this.aFloat54;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "()V")
	@Override
	public void method6239() {
		this.aFloat56 = this.aFloat50 = this.aFloat57 = 1.0F;
		this.aFloat46 = this.aFloat51 = this.aFloat48 = this.aFloat47 = this.aFloat54 = this.aFloat52 = this.aFloat55 = this.aFloat53 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method6230() {
		@Pc(7) Class17_Sub1 local7 = new Class17_Sub1();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat53 = this.aFloat53;
		return local7;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class117.aFloatArray21[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class117.aFloatArray22[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class117.aFloatArray21[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class117.aFloatArray22[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat54 = local33 * -local27 + local47 * local21;
		this.aFloat56 = local47 * local27 + local33 * local21;
		this.aFloat51 = local9 * local27;
		this.aFloat57 = local9 * local21;
		this.aFloat48 = local9 * local39;
		this.aFloat47 = -local15;
		this.aFloat52 = local27 * local39 + local43 * local21;
		this.aFloat50 = local33 * local9;
		this.aFloat46 = -local21 * local39 + local43 * local27;
		this.aFloat53 = -((float) arg2 * this.aFloat52) + (float) -arg0 * this.aFloat46 - this.aFloat50 * (float) arg1;
		this.aFloat49 = -((float) arg2 * this.aFloat57) + (float) -arg0 * this.aFloat51 - (float) arg1 * this.aFloat47;
		this.aFloat55 = this.aFloat56 * (float) -arg0 - (float) arg1 * this.aFloat48 - (float) arg2 * this.aFloat54;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat55);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat49);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat53);
		arg3[2] = (int) (this.aFloat54 * (float) local6 + this.aFloat52 * (float) local24 + (float) local13 * this.aFloat57);
		arg3[1] = (int) (this.aFloat50 * (float) local24 + (float) local6 * this.aFloat48 + (float) local13 * this.aFloat47);
		arg3[0] = (int) (this.aFloat51 * (float) local13 + this.aFloat46 * (float) local24 + (float) local6 * this.aFloat56);
	}
}
