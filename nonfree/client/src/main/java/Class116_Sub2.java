import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "F")
	public float aFloat176;

	static {
		new Class242("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class116_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat175 = arg2;
		this.aFloat167 = this.aFloat172 = this.aFloat171 = this.aFloat174 = this.aFloat165 = this.aFloat173 = 0.0F;
		this.aFloat169 = this.aFloat166 = this.aFloat170 = 1.0F;
		this.aFloat176 = arg0;
		this.aFloat168 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class111.aFloatArray18[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class111.aFloatArray17[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class111.aFloatArray18[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class111.aFloatArray17[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class111.aFloatArray18[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class111.aFloatArray17[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat171 = local9 * local39;
		this.aFloat167 = local27 * local43 + -local21 * local39;
		this.aFloat169 = local27 * local47 + local33 * local21;
		this.aFloat173 = local43 * local21 + local27 * local39;
		this.aFloat170 = local9 * local21;
		this.aFloat165 = local47 * local21 + local33 * -local27;
		this.aFloat172 = local27 * local9;
		this.aFloat174 = -local15;
		this.aFloat166 = local9 * local33;
		this.aFloat176 = -((float) arg2 * this.aFloat165) - (float) arg1 * this.aFloat171 + this.aFloat169 * (float) -arg0;
		this.aFloat168 = -(this.aFloat166 * (float) arg1) + (float) -arg0 * this.aFloat167 - this.aFloat173 * (float) arg2;
		this.aFloat175 = -((float) arg1 * this.aFloat174) + (float) -arg0 * this.aFloat172 - this.aFloat170 * (float) arg2;
	}

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat169 = this.aFloat170 = Class111.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat165 = Class111.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat172 = -this.aFloat165;
		this.aFloat171 = this.aFloat176 = this.aFloat167 = this.aFloat173 = this.aFloat168 = this.aFloat174 = this.aFloat175 = 0.0F;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)[F")
	public float[] method4594() {
		Static33.aFloatArray7[6] = this.aFloat174;
		Static33.aFloatArray7[5] = this.aFloat166;
		Static33.aFloatArray7[13] = this.aFloat168;
		Static33.aFloatArray7[12] = this.aFloat176;
		Static33.aFloatArray7[14] = this.aFloat175;
		Static33.aFloatArray7[8] = this.aFloat165;
		Static33.aFloatArray7[10] = this.aFloat170;
		Static33.aFloatArray7[0] = this.aFloat169;
		Static33.aFloatArray7[2] = this.aFloat172;
		Static33.aFloatArray7[1] = this.aFloat167;
		Static33.aFloatArray7[9] = this.aFloat173;
		Static33.aFloatArray7[4] = this.aFloat171;
		return Static33.aFloatArray7;
	}

	@OriginalMember(owner = "client!rc", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class111.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class111.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat166;
		@Pc(24) float local24 = this.aFloat173;
		this.aFloat167 = local18 * local9 - this.aFloat172 * local15;
		@Pc(38) float local38 = this.aFloat168;
		this.aFloat172 = local15 * local18 + this.aFloat172 * local9;
		this.aFloat166 = local21 * local9 - local15 * this.aFloat174;
		this.aFloat173 = local24 * local9 - local15 * this.aFloat170;
		this.aFloat174 = local9 * this.aFloat174 + local21 * local15;
		this.aFloat170 = local24 * local15 + this.aFloat170 * local9;
		this.aFloat168 = local9 * local38 - local15 * this.aFloat175;
		this.aFloat175 = local38 * local15 + local9 * this.aFloat175;
	}

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat176;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat168;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat175;
		arg0[1] = (int) (local20 * this.aFloat166 + this.aFloat171 * local12 + this.aFloat174 * local28);
		arg0[2] = (int) (local28 * this.aFloat170 + this.aFloat165 * local12 + local20 * this.aFloat173);
		arg0[0] = (int) (local28 * this.aFloat172 + local12 * this.aFloat169 + this.aFloat167 * local20);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method4596(@OriginalArg(0) Class116 arg0) {
		@Pc(6) Class116_Sub2 local6 = (Class116_Sub2) arg0;
		this.aFloat169 = local6.aFloat169;
		this.aFloat165 = local6.aFloat172;
		this.aFloat171 = local6.aFloat167;
		this.aFloat166 = local6.aFloat166;
		this.aFloat173 = local6.aFloat174;
		this.aFloat172 = local6.aFloat165;
		this.aFloat167 = local6.aFloat171;
		this.aFloat174 = local6.aFloat173;
		this.aFloat170 = local6.aFloat170;
		this.aFloat176 = -(local6.aFloat176 * this.aFloat169 + this.aFloat171 * local6.aFloat168 + local6.aFloat175 * this.aFloat165);
		this.aFloat168 = -(this.aFloat167 * local6.aFloat176 + local6.aFloat168 * this.aFloat166 + local6.aFloat175 * this.aFloat173);
		this.aFloat175 = -(this.aFloat172 * local6.aFloat176 + this.aFloat174 * local6.aFloat168 + local6.aFloat175 * this.aFloat170);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)[F")
	public float[] method4597() {
		Static33.aFloatArray7[5] = this.aFloat166;
		Static33.aFloatArray7[8] = this.aFloat165;
		Static33.aFloatArray7[2] = this.aFloat172;
		Static33.aFloatArray7[10] = this.aFloat170;
		Static33.aFloatArray7[6] = this.aFloat174;
		Static33.aFloatArray7[9] = this.aFloat173;
		Static33.aFloatArray7[0] = this.aFloat169;
		Static33.aFloatArray7[14] = 0.0F;
		Static33.aFloatArray7[13] = 0.0F;
		Static33.aFloatArray7[1] = this.aFloat167;
		Static33.aFloatArray7[12] = 0.0F;
		Static33.aFloatArray7[4] = this.aFloat171;
		return Static33.aFloatArray7;
	}

	@OriginalMember(owner = "client!rc", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat168 += arg1;
		this.aFloat175 += arg2;
		this.aFloat176 += arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIFFIIF)V")
	public void method4598(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat167 = this.aFloat172 = this.aFloat171 = this.aFloat174 = this.aFloat165 = this.aFloat173 = 0.0F;
			this.aFloat166 = arg0;
			this.aFloat169 = arg3;
			this.aFloat170 = 1.0F;
		} else {
			@Pc(45) float local45 = Class111.aFloatArray18[arg4 & 0x3FFF];
			@Pc(51) float local51 = Class111.aFloatArray17[arg4 & 0x3FFF];
			this.aFloat166 = (float) arg0 * local45;
			this.aFloat169 = (float) arg3 * local45;
			this.aFloat167 = local51 * (float) arg3;
			this.aFloat172 = this.aFloat174 = this.aFloat165 = this.aFloat173 = 0.0F;
			this.aFloat170 = 1.0F;
			this.aFloat171 = -local51 * (float) arg0;
		}
		this.aFloat175 = arg5;
		this.aFloat176 = arg1;
		this.aFloat168 = arg2;
	}

	@OriginalMember(owner = "client!rc", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat169 = 1.0F;
		this.aFloat166 = this.aFloat170 = Class111.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat174 = Class111.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat173 = -this.aFloat174;
		this.aFloat171 = this.aFloat165 = this.aFloat176 = this.aFloat167 = this.aFloat168 = this.aFloat172 = this.aFloat175 = 0.0F;
	}

	@OriginalMember(owner = "client!rc", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat170 = 1.0F;
		this.aFloat169 = this.aFloat166 = Class111.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat167 = Class111.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat171 = -this.aFloat167;
		this.aFloat165 = this.aFloat176 = this.aFloat173 = this.aFloat168 = this.aFloat172 = this.aFloat174 = this.aFloat175 = 0.0F;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat172 * (float) arg0 + (float) arg1 * this.aFloat174 + (float) arg2 * this.aFloat170 + this.aFloat175);
		arg3[1] = (int) ((float) arg1 * this.aFloat166 + this.aFloat167 * (float) arg0 + (float) arg2 * this.aFloat173 + this.aFloat168);
		arg3[0] = (int) (this.aFloat176 + this.aFloat169 * (float) arg0 + this.aFloat171 * (float) arg1 + this.aFloat165 * (float) arg2);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4951() {
		@Pc(7) Class116_Sub2 local7 = new Class116_Sub2();
		local7.aFloat168 = this.aFloat168;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat170 = this.aFloat170;
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat167 = this.aFloat172 = this.aFloat171 = this.aFloat174 = this.aFloat165 = this.aFloat173 = this.aFloat176 = this.aFloat168 = this.aFloat175 = 0.0F;
		this.aFloat169 = this.aFloat166 = this.aFloat170 = 1.0F;
	}

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat170 * (float) arg2 + this.aFloat172 * (float) arg0 + this.aFloat174 * (float) arg1);
		arg3[0] = (int) ((float) arg1 * this.aFloat171 + this.aFloat169 * (float) arg0 + (float) arg2 * this.aFloat165);
		arg3[1] = (int) ((float) arg2 * this.aFloat173 + (float) arg0 * this.aFloat167 + (float) arg1 * this.aFloat166);
	}

	@OriginalMember(owner = "client!rc", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class116 arg0) {
		@Pc(6) Class116_Sub2 local6 = (Class116_Sub2) arg0;
		this.aFloat166 = local6.aFloat166;
		this.aFloat173 = local6.aFloat173;
		this.aFloat175 = local6.aFloat175;
		this.aFloat168 = local6.aFloat168;
		this.aFloat165 = local6.aFloat165;
		this.aFloat172 = local6.aFloat172;
		this.aFloat176 = local6.aFloat176;
		this.aFloat174 = local6.aFloat174;
		this.aFloat171 = local6.aFloat171;
		this.aFloat167 = local6.aFloat167;
		this.aFloat169 = local6.aFloat169;
		this.aFloat170 = local6.aFloat170;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class111.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class111.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat169;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat165;
		this.aFloat169 = local15 * this.aFloat172 + local9 * local18;
		@Pc(37) float local37 = this.aFloat176;
		this.aFloat171 = this.aFloat174 * local15 + local21 * local9;
		this.aFloat172 = this.aFloat172 * local9 - local18 * local15;
		this.aFloat174 = this.aFloat174 * local9 - local21 * local15;
		this.aFloat165 = local24 * local9 + this.aFloat170 * local15;
		this.aFloat176 = local15 * this.aFloat175 + local37 * local9;
		this.aFloat170 = local9 * this.aFloat170 - local15 * local24;
		this.aFloat175 = local9 * this.aFloat175 - local37 * local15;
	}
}
