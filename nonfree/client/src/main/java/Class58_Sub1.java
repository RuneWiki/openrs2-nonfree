import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class58_Sub1() {
		this.method9508();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9516(@OriginalArg(0) Class58 arg0) {
		@Pc(6) Class58_Sub1 local6 = (Class58_Sub1) arg0;
		this.aFloat54 = local6.aFloat54;
		this.aFloat46 = local6.aFloat46;
		this.aFloat56 = local6.aFloat56;
		this.aFloat47 = local6.aFloat47;
		this.aFloat45 = local6.aFloat45;
		this.aFloat48 = local6.aFloat48;
		this.aFloat52 = local6.aFloat52;
		this.aFloat53 = local6.aFloat53;
		this.aFloat50 = local6.aFloat50;
		this.aFloat49 = local6.aFloat49;
		this.aFloat55 = local6.aFloat55;
		this.aFloat51 = local6.aFloat51;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat45 * (float) arg0 + (float) arg1 * this.aFloat47 + this.aFloat46 * (float) arg2 + this.aFloat50);
		arg3[0] = (int) (this.aFloat48 + this.aFloat52 * (float) arg1 + this.aFloat55 * (float) arg0 + (float) arg2 * this.aFloat56);
		arg3[2] = (int) ((float) arg2 * this.aFloat54 + (float) arg0 * this.aFloat51 + this.aFloat49 * (float) arg1 + this.aFloat53);
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
	@Override
	public void method9525(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat55 = this.aFloat54 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat56 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat52 = this.aFloat48 = this.aFloat45 = this.aFloat46 = this.aFloat50 = this.aFloat49 = this.aFloat53 = 0.0F;
		this.aFloat51 = -this.aFloat56;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat49 + this.aFloat51 * (float) arg0 + (float) arg2 * this.aFloat54);
		arg3[0] = (int) (this.aFloat56 * (float) arg2 + (float) arg0 * this.aFloat55 + (float) arg1 * this.aFloat52);
		arg3[1] = (int) ((float) arg1 * this.aFloat47 + (float) arg0 * this.aFloat45 + (float) arg2 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
	@Override
	public void method9521(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat55;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat56;
		@Pc(27) float local27 = this.aFloat48;
		this.aFloat55 = this.aFloat51 * local15 + local18 * local9;
		this.aFloat51 = this.aFloat51 * local9 - local18 * local15;
		this.aFloat52 = local15 * this.aFloat49 + local21 * local9;
		this.aFloat49 = local9 * this.aFloat49 - local15 * local21;
		this.aFloat56 = local15 * this.aFloat54 + local24 * local9;
		this.aFloat54 = this.aFloat54 * local9 - local24 * local15;
		this.aFloat48 = local27 * local9 + this.aFloat53 * local15;
		this.aFloat53 = this.aFloat53 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9522() {
		@Pc(7) Class58_Sub1 local7 = new Class58_Sub1();
		local7.aFloat45 = this.aFloat45;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat51 = this.aFloat51;
		return local7;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat53);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat48);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat50);
		arg3[0] = (int) (this.aFloat45 * (float) local24 + this.aFloat55 * (float) local17 + this.aFloat51 * (float) local6);
		arg3[1] = (int) (this.aFloat49 * (float) local6 + this.aFloat47 * (float) local24 + (float) local17 * this.aFloat52);
		arg3[2] = (int) ((float) local6 * this.aFloat54 + this.aFloat56 * (float) local17 + (float) local24 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	@Override
	public void method9513(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat55 = this.aFloat47 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat45 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat52 = -this.aFloat45;
		this.aFloat56 = this.aFloat48 = this.aFloat46 = this.aFloat50 = this.aFloat51 = this.aFloat49 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	@Override
	public void method9517(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat55;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat56;
		this.aFloat55 = local9 * local18 - this.aFloat45 * local15;
		@Pc(37) float local37 = this.aFloat48;
		this.aFloat45 = local9 * this.aFloat45 + local18 * local15;
		this.aFloat52 = local21 * local9 - this.aFloat47 * local15;
		this.aFloat56 = local24 * local9 - this.aFloat46 * local15;
		this.aFloat47 = local9 * this.aFloat47 + local15 * local21;
		this.aFloat48 = local9 * local37 - local15 * this.aFloat50;
		this.aFloat46 = local15 * local24 + this.aFloat46 * local9;
		this.aFloat50 = this.aFloat50 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	@Override
	public void method9508() {
		this.aFloat45 = this.aFloat51 = this.aFloat52 = this.aFloat49 = this.aFloat56 = this.aFloat46 = this.aFloat48 = this.aFloat50 = this.aFloat53 = 0.0F;
		this.aFloat55 = this.aFloat47 = this.aFloat54 = 1.0F;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub1_Sub17.aFloatArray47[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub1_Sub17.aFloatArray46[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub1_Sub17.aFloatArray47[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub1_Sub17.aFloatArray46[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat56 = local47 * local21 + local33 * -local27;
		this.aFloat49 = -local15;
		this.aFloat54 = local21 * local9;
		this.aFloat46 = local27 * local39 + local21 * local43;
		this.aFloat55 = local27 * local47 + local33 * local21;
		this.aFloat51 = local27 * local9;
		this.aFloat45 = -local21 * local39 + local27 * local43;
		this.aFloat52 = local39 * local9;
		this.aFloat47 = local9 * local33;
		this.aFloat53 = -((float) arg2 * this.aFloat54) + (float) -arg0 * this.aFloat51 - this.aFloat49 * (float) arg1;
		this.aFloat48 = (float) -arg0 * this.aFloat55 - this.aFloat52 * (float) arg1 - this.aFloat56 * (float) arg2;
		this.aFloat50 = -(this.aFloat46 * (float) arg2) - this.aFloat47 * (float) arg1 + this.aFloat45 * (float) -arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	@Override
	public void method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 = (float) arg1;
		this.aFloat55 = this.aFloat47 = this.aFloat54 = 1.0F;
		this.aFloat48 = (float) arg0;
		this.aFloat45 = this.aFloat51 = this.aFloat52 = this.aFloat49 = this.aFloat56 = this.aFloat46 = 0.0F;
		this.aFloat53 = (float) arg2;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	@Override
	public void method9518(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat45;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat46;
		this.aFloat45 = local9 * local18 - this.aFloat51 * local15;
		@Pc(38) float local38 = this.aFloat50;
		this.aFloat47 = local9 * local21 - this.aFloat49 * local15;
		this.aFloat51 = local18 * local15 + this.aFloat51 * local9;
		this.aFloat49 = local21 * local15 + local9 * this.aFloat49;
		this.aFloat46 = local9 * local24 - this.aFloat54 * local15;
		this.aFloat54 = local9 * this.aFloat54 + local15 * local24;
		this.aFloat50 = local9 * local38 - local15 * this.aFloat53;
		this.aFloat53 = local9 * this.aFloat53 + local38 * local15;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([I)V")
	@Override
	public void method9507(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat48;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat50;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat53;
		arg0[2] = (int) (this.aFloat46 * local20 + local11 * this.aFloat56 + local29 * this.aFloat54);
		arg0[1] = (int) (local20 * this.aFloat47 + local11 * this.aFloat52 + this.aFloat49 * local29);
		arg0[0] = (int) (local29 * this.aFloat51 + local11 * this.aFloat55 + local20 * this.aFloat45);
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
	@Override
	public void method9510(@OriginalArg(0) int arg0) {
		this.aFloat55 = 1.0F;
		this.aFloat47 = this.aFloat54 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat49 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat52 = this.aFloat56 = this.aFloat48 = this.aFloat45 = this.aFloat50 = this.aFloat51 = this.aFloat53 = 0.0F;
		this.aFloat46 = -this.aFloat49;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V")
	@Override
	public void method9509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 += (float) arg2;
		this.aFloat48 += (float) arg0;
		this.aFloat50 += (float) arg1;
	}
}
