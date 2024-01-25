import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ht", name = "D", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ht", name = "K", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ht", name = "N", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!ht", name = "Q", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ht", name = "T", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class43_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)[F")
	public float[] method2482() {
		Static244.aFloatArray45[5] = this.aFloat51;
		Static244.aFloatArray45[0] = this.aFloat50;
		Static244.aFloatArray45[9] = this.aFloat46;
		Static244.aFloatArray45[4] = this.aFloat43;
		Static244.aFloatArray45[2] = this.aFloat49;
		Static244.aFloatArray45[1] = this.aFloat41;
		Static244.aFloatArray45[6] = this.aFloat42;
		Static244.aFloatArray45[12] = 0.0F;
		Static244.aFloatArray45[14] = 0.0F;
		Static244.aFloatArray45[10] = this.aFloat47;
		Static244.aFloatArray45[8] = this.aFloat44;
		Static244.aFloatArray45[13] = 0.0F;
		return Static244.aFloatArray45;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat42 * (float) arg1 + this.aFloat49 * (float) arg0 + this.aFloat47 * (float) arg2 + this.aFloat45);
		arg3[0] = (int) (this.aFloat50 * (float) arg0 + (float) arg1 * this.aFloat43 + this.aFloat44 * (float) arg2 + this.aFloat48);
		arg3[1] = (int) ((float) arg2 * this.aFloat46 + (float) arg1 * this.aFloat51 + (float) arg0 * this.aFloat41 + this.aFloat40);
	}

	@OriginalMember(owner = "client!ht", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class43 arg0) {
		@Pc(6) Class43_Sub2 local6 = (Class43_Sub2) arg0;
		this.aFloat47 = local6.aFloat47;
		this.aFloat51 = local6.aFloat51;
		this.aFloat46 = local6.aFloat46;
		this.aFloat43 = local6.aFloat43;
		this.aFloat42 = local6.aFloat42;
		this.aFloat49 = local6.aFloat49;
		this.aFloat48 = local6.aFloat48;
		this.aFloat50 = local6.aFloat50;
		this.aFloat40 = local6.aFloat40;
		this.aFloat45 = local6.aFloat45;
		this.aFloat44 = local6.aFloat44;
		this.aFloat41 = local6.aFloat41;
	}

	@OriginalMember(owner = "client!ht", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat48;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat40;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat45;
		arg0[1] = (int) (local28 * this.aFloat42 + local11 * this.aFloat43 + this.aFloat51 * local19);
		arg0[0] = (int) (local19 * this.aFloat41 + this.aFloat50 * local11 + this.aFloat49 * local28);
		arg0[2] = (int) (this.aFloat44 * local11 + this.aFloat46 * local19 + local28 * this.aFloat47);
	}

	@OriginalMember(owner = "client!ht", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub20.aFloatArray12[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub20.aFloatArray11[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat41;
		@Pc(21) float local21 = this.aFloat51;
		@Pc(24) float local24 = this.aFloat46;
		@Pc(27) float local27 = this.aFloat40;
		this.aFloat41 = local18 * local9 - local15 * this.aFloat49;
		this.aFloat49 = local18 * local15 + local9 * this.aFloat49;
		this.aFloat51 = local9 * local21 - this.aFloat42 * local15;
		this.aFloat46 = local24 * local9 - local15 * this.aFloat47;
		this.aFloat42 = local15 * local21 + local9 * this.aFloat42;
		this.aFloat47 = local15 * local24 + local9 * this.aFloat47;
		this.aFloat40 = local9 * local27 - local15 * this.aFloat45;
		this.aFloat45 = this.aFloat45 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)[F")
	public float[] method2483() {
		Static244.aFloatArray45[12] = this.aFloat48;
		Static244.aFloatArray45[13] = this.aFloat40;
		Static244.aFloatArray45[1] = this.aFloat41;
		Static244.aFloatArray45[5] = this.aFloat51;
		Static244.aFloatArray45[9] = this.aFloat46;
		Static244.aFloatArray45[8] = this.aFloat44;
		Static244.aFloatArray45[4] = this.aFloat43;
		Static244.aFloatArray45[10] = this.aFloat47;
		Static244.aFloatArray45[2] = this.aFloat49;
		Static244.aFloatArray45[0] = this.aFloat50;
		Static244.aFloatArray45[6] = this.aFloat42;
		Static244.aFloatArray45[14] = this.aFloat45;
		return Static244.aFloatArray45;
	}

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat45 = arg2;
		this.aFloat50 = this.aFloat51 = this.aFloat47 = 1.0F;
		this.aFloat48 = arg0;
		this.aFloat40 = arg1;
		this.aFloat41 = this.aFloat49 = this.aFloat43 = this.aFloat42 = this.aFloat44 = this.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!ht", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat45 += arg2;
		this.aFloat48 += arg0;
		this.aFloat40 += arg1;
	}

	@OriginalMember(owner = "client!ht", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat50 = 1.0F;
		this.aFloat51 = this.aFloat47 = Class1_Sub20.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat42 = Class1_Sub20.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat43 = this.aFloat44 = this.aFloat48 = this.aFloat41 = this.aFloat40 = this.aFloat49 = this.aFloat45 = 0.0F;
		this.aFloat46 = -this.aFloat42;
	}

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat51 = 1.0F;
		this.aFloat50 = this.aFloat47 = Class1_Sub20.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat44 = Class1_Sub20.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat49 = -this.aFloat44;
		this.aFloat43 = this.aFloat48 = this.aFloat41 = this.aFloat46 = this.aFloat40 = this.aFloat42 = this.aFloat45 = 0.0F;
	}

	@OriginalMember(owner = "client!ht", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub20.aFloatArray12[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub20.aFloatArray11[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub20.aFloatArray12[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub20.aFloatArray11[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub20.aFloatArray12[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub20.aFloatArray11[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat47 = local9 * local21;
		this.aFloat51 = local33 * local9;
		this.aFloat42 = -local15;
		this.aFloat50 = local21 * local33 + local27 * local47;
		this.aFloat43 = local39 * local9;
		this.aFloat44 = local33 * -local27 + local47 * local21;
		this.aFloat49 = local9 * local27;
		this.aFloat41 = local43 * local27 + local39 * -local21;
		this.aFloat46 = local21 * local43 + local27 * local39;
		this.aFloat48 = -((float) arg2 * this.aFloat44) + (float) -arg0 * this.aFloat50 - (float) arg1 * this.aFloat43;
		this.aFloat45 = -(this.aFloat47 * (float) arg2) - (float) arg1 * this.aFloat42 + (float) -arg0 * this.aFloat49;
		this.aFloat40 = this.aFloat41 * (float) -arg0 - this.aFloat51 * (float) arg1 - this.aFloat46 * (float) arg2;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub20.aFloatArray12[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub20.aFloatArray11[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat50;
		@Pc(21) float local21 = this.aFloat43;
		@Pc(24) float local24 = this.aFloat44;
		this.aFloat50 = local15 * this.aFloat49 + local18 * local9;
		@Pc(37) float local37 = this.aFloat48;
		this.aFloat49 = this.aFloat49 * local9 - local18 * local15;
		this.aFloat43 = local9 * local21 + local15 * this.aFloat42;
		this.aFloat44 = local15 * this.aFloat47 + local9 * local24;
		this.aFloat42 = this.aFloat42 * local9 - local15 * local21;
		this.aFloat47 = local9 * this.aFloat47 - local15 * local24;
		this.aFloat48 = this.aFloat45 * local15 + local9 * local37;
		this.aFloat45 = local9 * this.aFloat45 - local37 * local15;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IFIFFBI)V")
	public void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat51 = arg0;
			this.aFloat50 = arg2;
			this.aFloat47 = 1.0F;
			this.aFloat41 = this.aFloat49 = this.aFloat43 = this.aFloat42 = this.aFloat44 = this.aFloat46 = 0.0F;
		} else {
			@Pc(42) float local42 = Class1_Sub20.aFloatArray12[arg5 & 0x3FFF];
			@Pc(48) float local48 = Class1_Sub20.aFloatArray11[arg5 & 0x3FFF];
			this.aFloat50 = local42 * (float) arg2;
			this.aFloat49 = this.aFloat42 = this.aFloat44 = this.aFloat46 = 0.0F;
			this.aFloat47 = 1.0F;
			this.aFloat43 = -local48 * (float) arg0;
			this.aFloat41 = (float) arg2 * local48;
			this.aFloat51 = local42 * (float) arg0;
		}
		this.aFloat40 = arg4;
		this.aFloat48 = arg1;
		this.aFloat45 = arg3;
	}

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat44 + this.aFloat50 * (float) arg0 + this.aFloat43 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat47 + this.aFloat49 * (float) arg0 + (float) arg1 * this.aFloat42);
		arg3[1] = (int) ((float) arg1 * this.aFloat51 + (float) arg0 * this.aFloat41 + (float) arg2 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!ia;)V")
	public void method2488(@OriginalArg(1) Class43 arg0) {
		@Pc(6) Class43_Sub2 local6 = (Class43_Sub2) arg0;
		this.aFloat44 = local6.aFloat49;
		this.aFloat50 = local6.aFloat50;
		this.aFloat43 = local6.aFloat41;
		this.aFloat51 = local6.aFloat51;
		this.aFloat46 = local6.aFloat42;
		this.aFloat49 = local6.aFloat44;
		this.aFloat41 = local6.aFloat43;
		this.aFloat47 = local6.aFloat47;
		this.aFloat48 = -(this.aFloat44 * local6.aFloat45 + local6.aFloat40 * this.aFloat43 + this.aFloat50 * local6.aFloat48);
		this.aFloat42 = local6.aFloat46;
		this.aFloat40 = -(this.aFloat46 * local6.aFloat45 + this.aFloat51 * local6.aFloat40 + this.aFloat41 * local6.aFloat48);
		this.aFloat45 = -(this.aFloat42 * local6.aFloat40 + this.aFloat49 * local6.aFloat48 + this.aFloat47 * local6.aFloat45);
	}

	@OriginalMember(owner = "client!ht", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat50 = this.aFloat51 = Class1_Sub20.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat41 = Class1_Sub20.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat43 = -this.aFloat41;
		this.aFloat44 = this.aFloat48 = this.aFloat46 = this.aFloat40 = this.aFloat49 = this.aFloat42 = this.aFloat45 = 0.0F;
	}

	@OriginalMember(owner = "client!ht", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat50 = this.aFloat51 = this.aFloat47 = 1.0F;
		this.aFloat41 = this.aFloat49 = this.aFloat43 = this.aFloat42 = this.aFloat44 = this.aFloat46 = this.aFloat48 = this.aFloat40 = this.aFloat45 = 0.0F;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method5107() {
		@Pc(7) Class43_Sub2 local7 = new Class43_Sub2();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat43 = this.aFloat43;
		return local7;
	}
}
