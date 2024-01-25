import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class54_Sub2() {
		this.method5135();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat69);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat63);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat66);
		arg3[1] = (int) ((float) local20 * this.aFloat74 + this.aFloat67 * (float) local13 + this.aFloat64 * (float) local6);
		arg3[2] = (int) ((float) local20 * this.aFloat65 + (float) local13 * this.aFloat72 + this.aFloat73 * (float) local6);
		arg3[0] = (int) ((float) local13 * this.aFloat68 + this.aFloat70 * (float) local20 + this.aFloat71 * (float) local6);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method5137(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub2 local6 = (Class54_Sub2) arg0;
		this.aFloat73 = local6.aFloat73;
		this.aFloat72 = local6.aFloat72;
		this.aFloat71 = local6.aFloat71;
		this.aFloat65 = local6.aFloat65;
		this.aFloat74 = local6.aFloat74;
		this.aFloat68 = local6.aFloat68;
		this.aFloat70 = local6.aFloat70;
		this.aFloat63 = local6.aFloat63;
		this.aFloat67 = local6.aFloat67;
		this.aFloat69 = local6.aFloat69;
		this.aFloat66 = local6.aFloat66;
		this.aFloat64 = local6.aFloat64;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub2.aFloatArray23[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub2.aFloatArray24[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub2.aFloatArray23[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub2.aFloatArray24[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub2.aFloatArray23[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub2.aFloatArray24[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat64 = -local15;
		this.aFloat71 = local9 * local27;
		this.aFloat70 = local27 * local43 + local39 * -local21;
		this.aFloat65 = local27 * local39 + local21 * local43;
		this.aFloat68 = local27 * local47 + local33 * local21;
		this.aFloat73 = local21 * local9;
		this.aFloat72 = local21 * local47 + local33 * -local27;
		this.aFloat74 = local9 * local33;
		this.aFloat67 = local9 * local39;
		this.aFloat66 = -((float) arg1 * this.aFloat74) + (float) -arg0 * this.aFloat70 - (float) arg2 * this.aFloat65;
		this.aFloat63 = -(this.aFloat72 * (float) arg2) + this.aFloat68 * (float) -arg0 - (float) arg1 * this.aFloat67;
		this.aFloat69 = this.aFloat71 * (float) -arg0 - (float) arg1 * this.aFloat64 - (float) arg2 * this.aFloat73;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	@Override
	public void method5131(@OriginalArg(0) int arg0) {
		this.aFloat68 = 1.0F;
		this.aFloat74 = this.aFloat73 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat64 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat67 = this.aFloat72 = this.aFloat63 = this.aFloat70 = this.aFloat66 = this.aFloat71 = this.aFloat69 = 0.0F;
		this.aFloat65 = -this.aFloat64;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFIIIFI)V")
	public void method2592(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat68 = arg5;
			this.aFloat73 = 1.0F;
			this.aFloat74 = arg3;
			this.aFloat70 = this.aFloat71 = this.aFloat67 = this.aFloat64 = this.aFloat72 = this.aFloat65 = 0.0F;
		} else {
			@Pc(7) float local7 = Class5_Sub2.aFloatArray23[arg2 & 0x3FFF];
			@Pc(13) float local13 = Class5_Sub2.aFloatArray24[arg2 & 0x3FFF];
			this.aFloat68 = local7 * (float) arg5;
			this.aFloat70 = (float) arg5 * local13;
			this.aFloat71 = this.aFloat64 = this.aFloat72 = this.aFloat65 = 0.0F;
			this.aFloat67 = -local13 * (float) arg3;
			this.aFloat73 = 1.0F;
			this.aFloat74 = local7 * (float) arg3;
		}
		this.aFloat69 = arg4;
		this.aFloat63 = arg1;
		this.aFloat66 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	@Override
	public void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat70 = this.aFloat71 = this.aFloat67 = this.aFloat64 = this.aFloat72 = this.aFloat65 = 0.0F;
		this.aFloat68 = this.aFloat74 = this.aFloat73 = 1.0F;
		this.aFloat63 = arg0;
		this.aFloat69 = arg2;
		this.aFloat66 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
	@Override
	public void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat69 += arg2;
		this.aFloat66 += arg1;
		this.aFloat63 += arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method5133() {
		@Pc(7) Class54_Sub2 local7 = new Class54_Sub2();
		local7.aFloat70 = this.aFloat70;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat67 = this.aFloat67;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat69 = this.aFloat69;
		return local7;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)[F")
	public float[] method2596() {
		Static554.aFloatArray74[6] = this.aFloat64;
		Static554.aFloatArray74[13] = this.aFloat66;
		Static554.aFloatArray74[1] = this.aFloat70;
		Static554.aFloatArray74[9] = this.aFloat65;
		Static554.aFloatArray74[14] = this.aFloat69;
		Static554.aFloatArray74[0] = this.aFloat68;
		Static554.aFloatArray74[4] = this.aFloat67;
		Static554.aFloatArray74[12] = this.aFloat63;
		Static554.aFloatArray74[5] = this.aFloat74;
		Static554.aFloatArray74[8] = this.aFloat72;
		Static554.aFloatArray74[2] = this.aFloat71;
		Static554.aFloatArray74[10] = this.aFloat73;
		return Static554.aFloatArray74;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III[I)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat72 * (float) arg2 + this.aFloat68 * (float) arg0 + (float) arg1 * this.aFloat67);
		arg3[1] = (int) (this.aFloat65 * (float) arg2 + this.aFloat74 * (float) arg1 + this.aFloat70 * (float) arg0);
		arg3[2] = (int) (this.aFloat71 * (float) arg0 + (float) arg1 * this.aFloat64 + (float) arg2 * this.aFloat73);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(III[I)V")
	@Override
	public void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat70 * (float) arg0 + (float) arg1 * this.aFloat74 + (float) arg2 * this.aFloat65 + this.aFloat66);
		arg3[0] = (int) ((float) arg2 * this.aFloat72 + (float) arg0 * this.aFloat68 + (float) arg1 * this.aFloat67 + this.aFloat63);
		arg3[2] = (int) (this.aFloat69 + this.aFloat73 * (float) arg2 + this.aFloat64 * (float) arg1 + (float) arg0 * this.aFloat71);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public void method2597() {
		this.aFloat64 = -this.aFloat64;
		this.aFloat69 = -this.aFloat69;
		this.aFloat65 = -this.aFloat65;
		this.aFloat74 = -this.aFloat74;
		this.aFloat73 = -this.aFloat73;
		this.aFloat71 = -this.aFloat71;
		this.aFloat70 = -this.aFloat70;
		this.aFloat66 = -this.aFloat66;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)[F")
	public float[] method2598() {
		Static554.aFloatArray74[4] = this.aFloat67;
		Static554.aFloatArray74[6] = this.aFloat64;
		Static554.aFloatArray74[0] = this.aFloat68;
		Static554.aFloatArray74[14] = 0.0F;
		Static554.aFloatArray74[5] = this.aFloat74;
		Static554.aFloatArray74[13] = 0.0F;
		Static554.aFloatArray74[2] = this.aFloat71;
		Static554.aFloatArray74[9] = this.aFloat65;
		Static554.aFloatArray74[8] = this.aFloat72;
		Static554.aFloatArray74[12] = 0.0F;
		Static554.aFloatArray74[10] = this.aFloat73;
		Static554.aFloatArray74[1] = this.aFloat70;
		return Static554.aFloatArray74;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	@Override
	public void method5144(@OriginalArg(0) int arg0) {
		this.aFloat74 = 1.0F;
		this.aFloat68 = this.aFloat73 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat72 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat67 = this.aFloat63 = this.aFloat70 = this.aFloat65 = this.aFloat66 = this.aFloat64 = this.aFloat69 = 0.0F;
		this.aFloat71 = -this.aFloat72;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I)V")
	@Override
	public void method5136(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat63;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat66;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat69;
		arg0[2] = (int) (this.aFloat73 * local28 + local20 * this.aFloat65 + local11 * this.aFloat72);
		arg0[1] = (int) (local28 * this.aFloat64 + this.aFloat67 * local11 + this.aFloat74 * local20);
		arg0[0] = (int) (local28 * this.aFloat71 + this.aFloat68 * local11 + local20 * this.aFloat70);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	@Override
	public void method5141(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat67;
		@Pc(24) float local24 = this.aFloat72;
		this.aFloat68 = local18 * local9 - this.aFloat70 * local15;
		@Pc(37) float local37 = this.aFloat63;
		this.aFloat67 = local9 * local21 - local15 * this.aFloat74;
		this.aFloat70 = local15 * local18 + local9 * this.aFloat70;
		this.aFloat74 = local21 * local15 + local9 * this.aFloat74;
		this.aFloat72 = local24 * local9 - local15 * this.aFloat65;
		this.aFloat65 = this.aFloat65 * local9 + local24 * local15;
		this.aFloat63 = local9 * local37 - this.aFloat66 * local15;
		this.aFloat66 = this.aFloat66 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	@Override
	public void method5130(@OriginalArg(0) int arg0) {
		this.aFloat73 = 1.0F;
		this.aFloat68 = this.aFloat74 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat70 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat67 = -this.aFloat70;
		this.aFloat72 = this.aFloat63 = this.aFloat65 = this.aFloat66 = this.aFloat71 = this.aFloat64 = this.aFloat69 = 0.0F;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	@Override
	public void method5134(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat70;
		@Pc(21) float local21 = this.aFloat74;
		@Pc(24) float local24 = this.aFloat65;
		this.aFloat70 = local18 * local9 - this.aFloat71 * local15;
		@Pc(38) float local38 = this.aFloat66;
		this.aFloat74 = local21 * local9 - this.aFloat64 * local15;
		this.aFloat71 = local18 * local15 + this.aFloat71 * local9;
		this.aFloat65 = local24 * local9 - this.aFloat73 * local15;
		this.aFloat64 = this.aFloat64 * local9 + local15 * local21;
		this.aFloat66 = local38 * local9 - local15 * this.aFloat69;
		this.aFloat73 = local9 * this.aFloat73 + local24 * local15;
		this.aFloat69 = local38 * local15 + this.aFloat69 * local9;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!dfa;)V")
	public void method2599(@OriginalArg(1) Class54 arg0) {
		@Pc(6) Class54_Sub2 local6 = (Class54_Sub2) arg0;
		this.aFloat67 = local6.aFloat70;
		this.aFloat72 = local6.aFloat71;
		this.aFloat68 = local6.aFloat68;
		this.aFloat65 = local6.aFloat64;
		this.aFloat70 = local6.aFloat67;
		this.aFloat71 = local6.aFloat72;
		this.aFloat74 = local6.aFloat74;
		this.aFloat63 = -(this.aFloat67 * local6.aFloat66 + local6.aFloat63 * this.aFloat68 + local6.aFloat69 * this.aFloat72);
		this.aFloat64 = local6.aFloat65;
		this.aFloat73 = local6.aFloat73;
		this.aFloat66 = -(local6.aFloat69 * this.aFloat65 + this.aFloat70 * local6.aFloat63 + local6.aFloat66 * this.aFloat74);
		this.aFloat69 = -(local6.aFloat69 * this.aFloat73 + this.aFloat71 * local6.aFloat63 + this.aFloat64 * local6.aFloat66);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	@Override
	public void method5145(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub2.aFloatArray23[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub2.aFloatArray24[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat67;
		@Pc(24) float local24 = this.aFloat72;
		@Pc(27) float local27 = this.aFloat63;
		this.aFloat68 = this.aFloat71 * local15 + local9 * local18;
		this.aFloat71 = local9 * this.aFloat71 - local18 * local15;
		this.aFloat67 = this.aFloat64 * local15 + local9 * local21;
		this.aFloat64 = local9 * this.aFloat64 - local15 * local21;
		this.aFloat72 = local15 * this.aFloat73 + local24 * local9;
		this.aFloat73 = local9 * this.aFloat73 - local15 * local24;
		this.aFloat63 = this.aFloat69 * local15 + local9 * local27;
		this.aFloat69 = this.aFloat69 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
	@Override
	public void method5135() {
		this.aFloat70 = this.aFloat71 = this.aFloat67 = this.aFloat64 = this.aFloat72 = this.aFloat65 = this.aFloat63 = this.aFloat66 = this.aFloat69 = 0.0F;
		this.aFloat68 = this.aFloat74 = this.aFloat73 = 1.0F;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FF[FFBF)V")
	public void method2600(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4) {
		@Pc(50) float local50;
		@Pc(34) float local34;
		@Pc(42) float local42;
		@Pc(26) float local26;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local26 = -arg3 / arg1;
			local50 = this.aFloat63 + this.aFloat68 * local26;
			local34 = this.aFloat70 * local26 + this.aFloat66;
			local42 = local26 * this.aFloat71 + this.aFloat69;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local26 = -arg3 / arg4;
			local34 = this.aFloat66 + this.aFloat74 * local26;
			local50 = this.aFloat63 + local26 * this.aFloat67;
			local42 = this.aFloat69 + this.aFloat64 * local26;
		} else {
			local26 = -arg3 / arg0;
			local34 = local26 * this.aFloat65 + this.aFloat66;
			local42 = this.aFloat73 * local26 + this.aFloat69;
			local50 = this.aFloat63 + local26 * this.aFloat72;
		}
		arg2[1] = this.aFloat74 * arg4 + arg1 * this.aFloat70 + this.aFloat65 * arg0;
		arg2[2] = arg0 * this.aFloat73 + arg1 * this.aFloat71 + arg4 * this.aFloat64;
		arg2[0] = this.aFloat72 * arg0 + this.aFloat68 * arg1 + this.aFloat67 * arg4;
		arg2[3] = -(local50 * arg2[0] + local34 * arg2[1] + local42 * arg2[2]);
	}
}
