import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!ku", name = "C", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ku", name = "E", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!ku", name = "J", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ku", name = "Q", descriptor = "F")
	public float aFloat56;

	static {
		new Class119("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class32_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat56 + (float) arg1 * this.aFloat46 + (float) arg2 * this.aFloat47 + this.aFloat51);
		arg3[0] = (int) (this.aFloat52 * (float) arg1 + (float) arg0 * this.aFloat54 + (float) arg2 * this.aFloat50 + this.aFloat48);
		arg3[1] = (int) ((float) arg0 * this.aFloat45 + (float) arg1 * this.aFloat53 + (float) arg2 * this.aFloat49 + this.aFloat55);
	}

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat45 = this.aFloat56 = this.aFloat52 = this.aFloat46 = this.aFloat50 = this.aFloat49 = this.aFloat48 = this.aFloat55 = this.aFloat51 = 0.0F;
		this.aFloat54 = this.aFloat53 = this.aFloat47 = 1.0F;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!c;)V")
	public void method3233(@OriginalArg(1) Class32 arg0) {
		@Pc(6) Class32_Sub2 local6 = (Class32_Sub2) arg0;
		this.aFloat52 = local6.aFloat45;
		this.aFloat50 = local6.aFloat56;
		this.aFloat54 = local6.aFloat54;
		this.aFloat49 = local6.aFloat46;
		this.aFloat56 = local6.aFloat50;
		this.aFloat45 = local6.aFloat52;
		this.aFloat53 = local6.aFloat53;
		this.aFloat46 = local6.aFloat49;
		this.aFloat48 = -(this.aFloat54 * local6.aFloat48 + this.aFloat52 * local6.aFloat55 + local6.aFloat51 * this.aFloat50);
		this.aFloat47 = local6.aFloat47;
		this.aFloat55 = -(this.aFloat45 * local6.aFloat48 + local6.aFloat55 * this.aFloat53 + local6.aFloat51 * this.aFloat49);
		this.aFloat51 = -(local6.aFloat48 * this.aFloat56 + this.aFloat46 * local6.aFloat55 + this.aFloat47 * local6.aFloat51);
	}

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat49 + (float) arg1 * this.aFloat53 + (float) arg0 * this.aFloat45);
		arg3[2] = (int) ((float) arg1 * this.aFloat46 + this.aFloat56 * (float) arg0 + this.aFloat47 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat50 + this.aFloat52 * (float) arg1 + this.aFloat54 * (float) arg0);
	}

	@OriginalMember(owner = "client!ku", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class25_Sub3_Sub1.aFloatArray5[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class25_Sub3_Sub1.aFloatArray6[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class25_Sub3_Sub1.aFloatArray5[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class25_Sub3_Sub1.aFloatArray6[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class25_Sub3_Sub1.aFloatArray5[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class25_Sub3_Sub1.aFloatArray6[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat50 = local21 * local47 + -local27 * local33;
		this.aFloat56 = local9 * local27;
		this.aFloat53 = local9 * local33;
		this.aFloat46 = -local15;
		this.aFloat47 = local9 * local21;
		this.aFloat52 = local39 * local9;
		this.aFloat54 = local47 * local27 + local33 * local21;
		this.aFloat49 = local43 * local21 + local27 * local39;
		this.aFloat45 = local39 * -local21 + local43 * local27;
		this.aFloat55 = this.aFloat45 * (float) -arg0 - this.aFloat53 * (float) arg1 - this.aFloat49 * (float) arg2;
		this.aFloat51 = -(this.aFloat46 * (float) arg1) + this.aFloat56 * (float) -arg0 - (float) arg2 * this.aFloat47;
		this.aFloat48 = -(this.aFloat50 * (float) arg2) - this.aFloat52 * (float) arg1 + (float) -arg0 * this.aFloat54;
	}

	@OriginalMember(owner = "client!ku", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat48 = arg0;
		this.aFloat55 = arg1;
		this.aFloat51 = arg2;
		this.aFloat54 = this.aFloat53 = this.aFloat47 = 1.0F;
		this.aFloat45 = this.aFloat56 = this.aFloat52 = this.aFloat46 = this.aFloat50 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!ku", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat48 += arg0;
		this.aFloat55 += arg1;
		this.aFloat51 += arg2;
	}

	@OriginalMember(owner = "client!ku", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat48;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat55;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat51;
		arg0[2] = (int) (local19 * this.aFloat49 + this.aFloat50 * local11 + this.aFloat47 * local27);
		arg0[1] = (int) (this.aFloat46 * local27 + this.aFloat52 * local11 + this.aFloat53 * local19);
		arg0[0] = (int) (local11 * this.aFloat54 + local19 * this.aFloat45 + local27 * this.aFloat56);
	}

	@OriginalMember(owner = "client!ku", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class25_Sub3_Sub1.aFloatArray5[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class25_Sub3_Sub1.aFloatArray6[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat45;
		@Pc(21) float local21 = this.aFloat53;
		@Pc(24) float local24 = this.aFloat49;
		this.aFloat45 = local9 * local18 - local15 * this.aFloat56;
		@Pc(37) float local37 = this.aFloat55;
		this.aFloat56 = local18 * local15 + this.aFloat56 * local9;
		this.aFloat53 = local21 * local9 - local15 * this.aFloat46;
		this.aFloat49 = local9 * local24 - this.aFloat47 * local15;
		this.aFloat46 = local21 * local15 + local9 * this.aFloat46;
		this.aFloat47 = local24 * local15 + local9 * this.aFloat47;
		this.aFloat55 = local37 * local9 - this.aFloat51 * local15;
		this.aFloat51 = local9 * this.aFloat51 + local37 * local15;
	}

	@OriginalMember(owner = "client!ku", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat54 = this.aFloat53 = Class25_Sub3_Sub1.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat45 = Class25_Sub3_Sub1.aFloatArray6[arg0 & 0x3FFF];
		this.aFloat50 = this.aFloat48 = this.aFloat49 = this.aFloat55 = this.aFloat56 = this.aFloat46 = this.aFloat51 = 0.0F;
		this.aFloat52 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(FIIFFII)V")
	public void method3235(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat54 = arg5;
			this.aFloat47 = 1.0F;
			this.aFloat45 = this.aFloat56 = this.aFloat52 = this.aFloat46 = this.aFloat50 = this.aFloat49 = 0.0F;
			this.aFloat53 = arg1;
		} else {
			@Pc(41) float local41 = Class25_Sub3_Sub1.aFloatArray5[arg4 & 0x3FFF];
			@Pc(47) float local47 = Class25_Sub3_Sub1.aFloatArray6[arg4 & 0x3FFF];
			this.aFloat56 = this.aFloat46 = this.aFloat50 = this.aFloat49 = 0.0F;
			this.aFloat54 = local41 * (float) arg5;
			this.aFloat52 = (float) arg1 * -local47;
			this.aFloat47 = 1.0F;
			this.aFloat45 = (float) arg5 * local47;
			this.aFloat53 = (float) arg1 * local41;
		}
		this.aFloat55 = arg2;
		this.aFloat48 = arg3;
		this.aFloat51 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat53 = this.aFloat47 = Class25_Sub3_Sub1.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat46 = Class25_Sub3_Sub1.aFloatArray6[arg0 & 0x3FFF];
		this.aFloat52 = this.aFloat50 = this.aFloat48 = this.aFloat45 = this.aFloat55 = this.aFloat56 = this.aFloat51 = 0.0F;
		this.aFloat49 = -this.aFloat46;
	}

	@OriginalMember(owner = "client!ku", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat53 = 1.0F;
		this.aFloat54 = this.aFloat47 = Class25_Sub3_Sub1.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat50 = Class25_Sub3_Sub1.aFloatArray6[arg0 & 0x3FFF];
		this.aFloat56 = -this.aFloat50;
		this.aFloat52 = this.aFloat48 = this.aFloat45 = this.aFloat49 = this.aFloat55 = this.aFloat46 = this.aFloat51 = 0.0F;
	}

	@OriginalMember(owner = "client!ku", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class25_Sub3_Sub1.aFloatArray5[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class25_Sub3_Sub1.aFloatArray6[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat54;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat50;
		@Pc(27) float local27 = this.aFloat48;
		this.aFloat54 = this.aFloat56 * local15 + local9 * local18;
		this.aFloat56 = local9 * this.aFloat56 - local15 * local18;
		this.aFloat52 = this.aFloat46 * local15 + local9 * local21;
		this.aFloat50 = local9 * local24 + this.aFloat47 * local15;
		this.aFloat46 = local9 * this.aFloat46 - local21 * local15;
		this.aFloat47 = this.aFloat47 * local9 - local24 * local15;
		this.aFloat48 = local27 * local9 + this.aFloat51 * local15;
		this.aFloat51 = this.aFloat51 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class32 method4315() {
		@Pc(7) Class32_Sub2 local7 = new Class32_Sub2();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat51 = this.aFloat51;
		return local7;
	}

	@OriginalMember(owner = "client!ku", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class32 arg0) {
		@Pc(6) Class32_Sub2 local6 = (Class32_Sub2) arg0;
		this.aFloat50 = local6.aFloat50;
		this.aFloat47 = local6.aFloat47;
		this.aFloat54 = local6.aFloat54;
		this.aFloat51 = local6.aFloat51;
		this.aFloat56 = local6.aFloat56;
		this.aFloat52 = local6.aFloat52;
		this.aFloat46 = local6.aFloat46;
		this.aFloat49 = local6.aFloat49;
		this.aFloat53 = local6.aFloat53;
		this.aFloat48 = local6.aFloat48;
		this.aFloat55 = local6.aFloat55;
		this.aFloat45 = local6.aFloat45;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)[F")
	public float[] method3239() {
		Static263.aFloatArray20[6] = this.aFloat46;
		Static263.aFloatArray20[8] = this.aFloat50;
		Static263.aFloatArray20[13] = this.aFloat55;
		Static263.aFloatArray20[9] = this.aFloat49;
		Static263.aFloatArray20[4] = this.aFloat52;
		Static263.aFloatArray20[12] = this.aFloat48;
		Static263.aFloatArray20[5] = this.aFloat53;
		Static263.aFloatArray20[10] = this.aFloat47;
		Static263.aFloatArray20[1] = this.aFloat45;
		Static263.aFloatArray20[14] = this.aFloat51;
		Static263.aFloatArray20[2] = this.aFloat56;
		Static263.aFloatArray20[0] = this.aFloat54;
		return Static263.aFloatArray20;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)[F")
	public float[] method3240() {
		Static263.aFloatArray20[5] = this.aFloat53;
		Static263.aFloatArray20[0] = this.aFloat54;
		Static263.aFloatArray20[8] = this.aFloat50;
		Static263.aFloatArray20[9] = this.aFloat49;
		Static263.aFloatArray20[4] = this.aFloat52;
		Static263.aFloatArray20[6] = this.aFloat46;
		Static263.aFloatArray20[10] = this.aFloat47;
		Static263.aFloatArray20[13] = 0.0F;
		Static263.aFloatArray20[12] = 0.0F;
		Static263.aFloatArray20[14] = 0.0F;
		Static263.aFloatArray20[1] = this.aFloat45;
		Static263.aFloatArray20[2] = this.aFloat56;
		return Static263.aFloatArray20;
	}
}
