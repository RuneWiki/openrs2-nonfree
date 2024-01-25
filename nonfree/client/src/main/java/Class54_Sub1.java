import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class54_Sub1() {
		this.method5135();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	@Override
	public void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat46 = this.aFloat51 = this.aFloat54 = 1.0F;
		this.aFloat55 = arg0;
		this.aFloat53 = arg2;
		this.aFloat50 = this.aFloat48 = this.aFloat52 = this.aFloat45 = this.aFloat47 = this.aFloat49 = 0.0F;
		this.aFloat56 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	@Override
	public void method5144(@OriginalArg(0) int arg0) {
		this.aFloat51 = 1.0F;
		this.aFloat46 = this.aFloat54 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat47 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat52 = this.aFloat55 = this.aFloat50 = this.aFloat49 = this.aFloat56 = this.aFloat45 = this.aFloat53 = 0.0F;
		this.aFloat48 = -this.aFloat47;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III[I)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat49 * (float) arg2 + (float) arg1 * this.aFloat51 + this.aFloat50 * (float) arg0);
		arg3[0] = (int) ((float) arg2 * this.aFloat47 + (float) arg1 * this.aFloat52 + (float) arg0 * this.aFloat46);
		arg3[2] = (int) (this.aFloat54 * (float) arg2 + (float) arg1 * this.aFloat45 + (float) arg0 * this.aFloat48);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	public void method5131(@OriginalArg(0) int arg0) {
		this.aFloat46 = 1.0F;
		this.aFloat51 = this.aFloat54 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat45 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat52 = this.aFloat47 = this.aFloat55 = this.aFloat50 = this.aFloat56 = this.aFloat48 = this.aFloat53 = 0.0F;
		this.aFloat49 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(III[I)V")
	@Override
	public void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat46 * (float) arg0 + (float) arg1 * this.aFloat52 + (float) arg2 * this.aFloat47 + this.aFloat55);
		arg3[1] = (int) ((float) arg0 * this.aFloat50 + this.aFloat51 * (float) arg1 + (float) arg2 * this.aFloat49 + this.aFloat56);
		arg3[2] = (int) (this.aFloat45 * (float) arg1 + this.aFloat48 * (float) arg0 + this.aFloat54 * (float) arg2 + this.aFloat53);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	@Override
	public void method5135() {
		this.aFloat50 = this.aFloat48 = this.aFloat52 = this.aFloat45 = this.aFloat47 = this.aFloat49 = this.aFloat55 = this.aFloat56 = this.aFloat53 = 0.0F;
		this.aFloat46 = this.aFloat51 = this.aFloat54 = 1.0F;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat53);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat55);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat56);
		arg3[1] = (int) ((float) local13 * this.aFloat52 + this.aFloat51 * (float) local20 + (float) local6 * this.aFloat45);
		arg3[2] = (int) ((float) local13 * this.aFloat47 + (float) local20 * this.aFloat49 + this.aFloat54 * (float) local6);
		arg3[0] = (int) ((float) local6 * this.aFloat48 + (float) local13 * this.aFloat46 + this.aFloat50 * (float) local20);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method5130(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat46 = this.aFloat51 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat50 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat52 = -this.aFloat50;
		this.aFloat47 = this.aFloat55 = this.aFloat49 = this.aFloat56 = this.aFloat48 = this.aFloat45 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	@Override
	public void method5141(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat46;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat47;
		this.aFloat46 = local9 * local18 - local15 * this.aFloat50;
		@Pc(37) float local37 = this.aFloat55;
		this.aFloat50 = this.aFloat50 * local9 + local18 * local15;
		this.aFloat52 = local9 * local21 - local15 * this.aFloat51;
		this.aFloat47 = local9 * local24 - local15 * this.aFloat49;
		this.aFloat51 = this.aFloat51 * local9 + local21 * local15;
		this.aFloat55 = local37 * local9 - local15 * this.aFloat56;
		this.aFloat49 = this.aFloat49 * local9 + local15 * local24;
		this.aFloat56 = this.aFloat56 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	@Override
	public void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat55 += arg0;
		this.aFloat56 += arg1;
		this.aFloat53 += arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method5133() {
		@Pc(7) Class54_Sub1 local7 = new Class54_Sub1();
		local7.aFloat45 = this.aFloat45;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat52 = this.aFloat52;
		return local7;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class8_Sub2_Sub7.aFloatArray25[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class8_Sub2_Sub7.aFloatArray26[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class8_Sub2_Sub7.aFloatArray25[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class8_Sub2_Sub7.aFloatArray26[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat54 = local21 * local9;
		this.aFloat45 = -local15;
		this.aFloat48 = local9 * local27;
		this.aFloat46 = local27 * local47 + local33 * local21;
		this.aFloat47 = local21 * local47 + local33 * -local27;
		this.aFloat52 = local39 * local9;
		this.aFloat49 = local21 * local43 + local39 * local27;
		this.aFloat51 = local9 * local33;
		this.aFloat50 = local43 * local27 + local39 * -local21;
		this.aFloat56 = -(this.aFloat49 * (float) arg2) - (float) arg1 * this.aFloat51 + this.aFloat50 * (float) -arg0;
		this.aFloat53 = -(this.aFloat45 * (float) arg1) + (float) -arg0 * this.aFloat48 - this.aFloat54 * (float) arg2;
		this.aFloat55 = this.aFloat46 * (float) -arg0 - (float) arg1 * this.aFloat52 - (float) arg2 * this.aFloat47;
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
	@Override
	public void method5145(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat46;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat47;
		this.aFloat46 = local15 * this.aFloat48 + local18 * local9;
		@Pc(37) float local37 = this.aFloat55;
		this.aFloat52 = this.aFloat45 * local15 + local21 * local9;
		this.aFloat48 = local9 * this.aFloat48 - local18 * local15;
		this.aFloat47 = local15 * this.aFloat54 + local24 * local9;
		this.aFloat45 = local9 * this.aFloat45 - local21 * local15;
		this.aFloat55 = local15 * this.aFloat53 + local37 * local9;
		this.aFloat54 = this.aFloat54 * local9 - local24 * local15;
		this.aFloat53 = this.aFloat53 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method5137(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub1 local6 = (Class54_Sub1) arg0;
		this.aFloat46 = local6.aFloat46;
		this.aFloat51 = local6.aFloat51;
		this.aFloat54 = local6.aFloat54;
		this.aFloat47 = local6.aFloat47;
		this.aFloat53 = local6.aFloat53;
		this.aFloat45 = local6.aFloat45;
		this.aFloat52 = local6.aFloat52;
		this.aFloat56 = local6.aFloat56;
		this.aFloat50 = local6.aFloat50;
		this.aFloat55 = local6.aFloat55;
		this.aFloat48 = local6.aFloat48;
		this.aFloat49 = local6.aFloat49;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	@Override
	public void method5134(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat50;
		@Pc(21) float local21 = this.aFloat51;
		@Pc(24) float local24 = this.aFloat49;
		@Pc(27) float local27 = this.aFloat56;
		this.aFloat50 = local18 * local9 - local15 * this.aFloat48;
		this.aFloat51 = local9 * local21 - local15 * this.aFloat45;
		this.aFloat48 = local9 * this.aFloat48 + local18 * local15;
		this.aFloat49 = local9 * local24 - this.aFloat54 * local15;
		this.aFloat45 = local9 * this.aFloat45 + local15 * local21;
		this.aFloat54 = local9 * this.aFloat54 + local24 * local15;
		this.aFloat56 = local9 * local27 - this.aFloat53 * local15;
		this.aFloat53 = local27 * local15 + this.aFloat53 * local9;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
	@Override
	public void method5136(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat55;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat56;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat53;
		arg0[2] = (int) (this.aFloat49 * local20 + local12 * this.aFloat47 + local29 * this.aFloat54);
		arg0[1] = (int) (this.aFloat45 * local29 + local12 * this.aFloat52 + local20 * this.aFloat51);
		arg0[0] = (int) (this.aFloat50 * local20 + this.aFloat46 * local12 + local29 * this.aFloat48);
	}
}
