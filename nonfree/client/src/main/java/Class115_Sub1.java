import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!gca", name = "N", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class115_Sub1() {
		this.method6281();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V")
	@Override
	public void method6290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat77 = (float) arg0;
		this.aFloat80 = (float) arg2;
		this.aFloat84 = (float) arg1;
		this.aFloat81 = this.aFloat85 = this.aFloat82 = this.aFloat79 = this.aFloat83 = this.aFloat87 = 0.0F;
		this.aFloat86 = this.aFloat78 = this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IFFFF[F)V")
	public void method3373(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[0] = arg3 * this.aFloat82 + arg2 * this.aFloat86 + this.aFloat83 * arg0;
		@Pc(59) float local59;
		@Pc(43) float local43;
		@Pc(51) float local51;
		@Pc(35) float local35;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local35 = -arg1 / arg2;
			local43 = this.aFloat84 + this.aFloat81 * local35;
			local51 = this.aFloat80 + this.aFloat85 * local35;
			local59 = local35 * this.aFloat86 + this.aFloat77;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg1 / arg3;
			local59 = this.aFloat77 + local35 * this.aFloat82;
			local43 = this.aFloat84 + local35 * this.aFloat78;
			local51 = local35 * this.aFloat79 + this.aFloat80;
		} else {
			local35 = -arg1 / arg0;
			local43 = local35 * this.aFloat87 + this.aFloat84;
			local59 = this.aFloat77 + this.aFloat83 * local35;
			local51 = this.aFloat76 * local35 + this.aFloat80;
		}
		arg4[2] = arg0 * this.aFloat76 + arg2 * this.aFloat85 + this.aFloat79 * arg3;
		arg4[1] = this.aFloat87 * arg0 + arg2 * this.aFloat81 + arg3 * this.aFloat78;
		arg4[3] = -(arg4[0] * local59 + local43 * arg4[1] + local51 * arg4[2]);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat77);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat84);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat80);
		arg3[1] = (int) ((float) local24 * this.aFloat79 + (float) local6 * this.aFloat82 + this.aFloat78 * (float) local13);
		arg3[0] = (int) ((float) local13 * this.aFloat81 + (float) local6 * this.aFloat86 + this.aFloat85 * (float) local24);
		arg3[2] = (int) ((float) local24 * this.aFloat76 + (float) local6 * this.aFloat83 + (float) local13 * this.aFloat87);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(FIIFIBF)V")
	public void method3374(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat86 = (float) arg4;
			this.aFloat81 = this.aFloat85 = this.aFloat82 = this.aFloat79 = this.aFloat83 = this.aFloat87 = 0.0F;
			this.aFloat78 = (float) arg1;
			this.aFloat76 = 1.0F;
		} else {
			@Pc(7) float local7 = Class6_Sub1_Sub36.aFloatArray74[arg2 & 0x3FFF];
			@Pc(13) float local13 = Class6_Sub1_Sub36.aFloatArray75[arg2 & 0x3FFF];
			this.aFloat86 = local7 * (float) arg4;
			this.aFloat82 = -local13 * (float) arg1;
			this.aFloat81 = local13 * (float) arg4;
			this.aFloat85 = this.aFloat79 = this.aFloat83 = this.aFloat87 = 0.0F;
			this.aFloat78 = local7 * (float) arg1;
			this.aFloat76 = 1.0F;
		}
		this.aFloat84 = arg0;
		this.aFloat77 = arg5;
		this.aFloat80 = arg3;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	@Override
	public void method6280(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat86;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat83;
		@Pc(27) float local27 = this.aFloat77;
		this.aFloat86 = local9 * local18 - local15 * this.aFloat81;
		this.aFloat81 = local15 * local18 + local9 * this.aFloat81;
		this.aFloat82 = local21 * local9 - this.aFloat78 * local15;
		this.aFloat83 = local24 * local9 - local15 * this.aFloat87;
		this.aFloat78 = local9 * this.aFloat78 + local21 * local15;
		this.aFloat87 = local24 * local15 + this.aFloat87 * local9;
		this.aFloat77 = local9 * local27 - local15 * this.aFloat84;
		this.aFloat84 = this.aFloat84 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub1_Sub36.aFloatArray74[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub36.aFloatArray75[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub1_Sub36.aFloatArray74[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub1_Sub36.aFloatArray75[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub1_Sub36.aFloatArray74[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub1_Sub36.aFloatArray75[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat85 = local27 * local9;
		this.aFloat79 = -local15;
		this.aFloat82 = local9 * local39;
		this.aFloat76 = local21 * local9;
		this.aFloat86 = local33 * local21 + local47 * local27;
		this.aFloat87 = local39 * local27 + local21 * local43;
		this.aFloat81 = local27 * local43 + -local21 * local39;
		this.aFloat83 = -local27 * local33 + local47 * local21;
		this.aFloat78 = local9 * local33;
		this.aFloat80 = -((float) arg2 * this.aFloat76) - (float) arg1 * this.aFloat79 + this.aFloat85 * (float) -arg0;
		this.aFloat84 = -((float) arg2 * this.aFloat87) - this.aFloat78 * (float) arg1 + this.aFloat81 * (float) -arg0;
		this.aFloat77 = this.aFloat86 * (float) -arg0 - this.aFloat82 * (float) arg1 - (float) arg2 * this.aFloat83;
	}

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V")
	@Override
	public void method6295(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat78;
		@Pc(24) float local24 = this.aFloat87;
		@Pc(27) float local27 = this.aFloat84;
		this.aFloat81 = local18 * local9 - local15 * this.aFloat85;
		this.aFloat85 = local18 * local15 + local9 * this.aFloat85;
		this.aFloat78 = local9 * local21 - this.aFloat79 * local15;
		this.aFloat87 = local24 * local9 - local15 * this.aFloat76;
		this.aFloat79 = local21 * local15 + local9 * this.aFloat79;
		this.aFloat84 = local27 * local9 - local15 * this.aFloat80;
		this.aFloat76 = local15 * local24 + local9 * this.aFloat76;
		this.aFloat80 = this.aFloat80 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "()V")
	@Override
	public void method6281() {
		this.aFloat81 = this.aFloat85 = this.aFloat82 = this.aFloat79 = this.aFloat83 = this.aFloat87 = this.aFloat77 = this.aFloat84 = this.aFloat80 = 0.0F;
		this.aFloat86 = this.aFloat78 = this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(I)V")
	public void method3375() {
		this.aFloat85 = -this.aFloat85;
		this.aFloat84 = -this.aFloat84;
		this.aFloat87 = -this.aFloat87;
		this.aFloat79 = -this.aFloat79;
		this.aFloat80 = -this.aFloat80;
		this.aFloat81 = -this.aFloat81;
		this.aFloat76 = -this.aFloat76;
		this.aFloat78 = -this.aFloat78;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!hba;B)V")
	public void method3376(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115_Sub1 local6 = (Class115_Sub1) arg0;
		this.aFloat86 = local6.aFloat86;
		this.aFloat83 = local6.aFloat85;
		this.aFloat82 = local6.aFloat81;
		this.aFloat85 = local6.aFloat83;
		this.aFloat78 = local6.aFloat78;
		this.aFloat81 = local6.aFloat82;
		this.aFloat87 = local6.aFloat79;
		this.aFloat79 = local6.aFloat87;
		this.aFloat76 = local6.aFloat76;
		this.aFloat77 = -(local6.aFloat80 * this.aFloat83 + this.aFloat86 * local6.aFloat77 + local6.aFloat84 * this.aFloat82);
		this.aFloat84 = -(local6.aFloat80 * this.aFloat87 + this.aFloat78 * local6.aFloat84 + this.aFloat81 * local6.aFloat77);
		this.aFloat80 = -(local6.aFloat80 * this.aFloat76 + this.aFloat79 * local6.aFloat84 + local6.aFloat77 * this.aFloat85);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat87 + this.aFloat78 * (float) arg1 + (float) arg0 * this.aFloat81);
		arg3[0] = (int) ((float) arg2 * this.aFloat83 + this.aFloat82 * (float) arg1 + this.aFloat86 * (float) arg0);
		arg3[2] = (int) (this.aFloat76 * (float) arg2 + this.aFloat85 * (float) arg0 + (float) arg1 * this.aFloat79);
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
	@Override
	public void method6294(@OriginalArg(0) int arg0) {
		this.aFloat76 = 1.0F;
		this.aFloat86 = this.aFloat78 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat81 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat83 = this.aFloat77 = this.aFloat87 = this.aFloat84 = this.aFloat85 = this.aFloat79 = this.aFloat80 = 0.0F;
		this.aFloat82 = -this.aFloat81;
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)[F")
	public float[] method3377() {
		Static473.aFloatArray69[4] = this.aFloat82;
		Static473.aFloatArray69[8] = this.aFloat83;
		Static473.aFloatArray69[14] = this.aFloat80;
		Static473.aFloatArray69[10] = this.aFloat76;
		Static473.aFloatArray69[6] = this.aFloat79;
		Static473.aFloatArray69[1] = this.aFloat81;
		Static473.aFloatArray69[13] = this.aFloat84;
		Static473.aFloatArray69[2] = this.aFloat85;
		Static473.aFloatArray69[0] = this.aFloat86;
		Static473.aFloatArray69[5] = this.aFloat78;
		Static473.aFloatArray69[9] = this.aFloat87;
		Static473.aFloatArray69[12] = this.aFloat77;
		return Static473.aFloatArray69;
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)V")
	@Override
	public void method6297(@OriginalArg(0) int arg0) {
		this.aFloat86 = 1.0F;
		this.aFloat78 = this.aFloat76 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat79 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat87 = -this.aFloat79;
		this.aFloat82 = this.aFloat83 = this.aFloat77 = this.aFloat81 = this.aFloat84 = this.aFloat85 = this.aFloat80 = 0.0F;
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
	@Override
	public void method6291(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat86 = this.aFloat76 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat83 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat82 = this.aFloat77 = this.aFloat81 = this.aFloat87 = this.aFloat84 = this.aFloat79 = this.aFloat80 = 0.0F;
		this.aFloat85 = -this.aFloat83;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	@Override
	public void method6287(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub1_Sub36.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub36.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat86;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat83;
		this.aFloat86 = this.aFloat85 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat77;
		this.aFloat82 = local21 * local9 + local15 * this.aFloat79;
		this.aFloat85 = this.aFloat85 * local9 - local15 * local18;
		this.aFloat79 = local9 * this.aFloat79 - local15 * local21;
		this.aFloat83 = local24 * local9 + local15 * this.aFloat76;
		this.aFloat77 = this.aFloat80 * local15 + local37 * local9;
		this.aFloat76 = this.aFloat76 * local9 - local24 * local15;
		this.aFloat80 = this.aFloat80 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(III)V")
	@Override
	public void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat84 += (float) arg1;
		this.aFloat80 += (float) arg2;
		this.aFloat77 += (float) arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method6282(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115_Sub1 local6 = (Class115_Sub1) arg0;
		this.aFloat83 = local6.aFloat83;
		this.aFloat81 = local6.aFloat81;
		this.aFloat87 = local6.aFloat87;
		this.aFloat77 = local6.aFloat77;
		this.aFloat86 = local6.aFloat86;
		this.aFloat84 = local6.aFloat84;
		this.aFloat80 = local6.aFloat80;
		this.aFloat79 = local6.aFloat79;
		this.aFloat78 = local6.aFloat78;
		this.aFloat76 = local6.aFloat76;
		this.aFloat85 = local6.aFloat85;
		this.aFloat82 = local6.aFloat82;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([I)V")
	@Override
	public void method6298(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat77;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat84;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat80;
		arg0[1] = (int) (local30 * this.aFloat79 + this.aFloat78 * local21 + this.aFloat82 * local12);
		arg0[0] = (int) (local12 * this.aFloat86 + local21 * this.aFloat81 + local30 * this.aFloat85);
		arg0[2] = (int) (this.aFloat76 * local30 + local21 * this.aFloat87 + this.aFloat83 * local12);
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat83 + (float) arg1 * this.aFloat82 + this.aFloat86 * (float) arg0 + this.aFloat77);
		arg3[1] = (int) (this.aFloat84 + this.aFloat87 * (float) arg2 + this.aFloat78 * (float) arg1 + this.aFloat81 * (float) arg0);
		arg3[2] = (int) (this.aFloat76 * (float) arg2 + (float) arg0 * this.aFloat85 + (float) arg1 * this.aFloat79 + this.aFloat80);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6292() {
		@Pc(7) Class115_Sub1 local7 = new Class115_Sub1();
		local7.aFloat80 = this.aFloat80;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat87 = this.aFloat87;
		return local7;
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(I)[F")
	public float[] method3380() {
		Static473.aFloatArray69[13] = 0.0F;
		Static473.aFloatArray69[8] = this.aFloat83;
		Static473.aFloatArray69[2] = this.aFloat85;
		Static473.aFloatArray69[10] = this.aFloat76;
		Static473.aFloatArray69[9] = this.aFloat87;
		Static473.aFloatArray69[1] = this.aFloat81;
		Static473.aFloatArray69[14] = 0.0F;
		Static473.aFloatArray69[0] = this.aFloat86;
		Static473.aFloatArray69[4] = this.aFloat82;
		Static473.aFloatArray69[6] = this.aFloat79;
		Static473.aFloatArray69[12] = 0.0F;
		Static473.aFloatArray69[5] = this.aFloat78;
		return Static473.aFloatArray69;
	}
}
