import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!js", name = "S", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!js", name = "U", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!js", name = "ab", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class177_Sub1() {
		this.method7876();
	}

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V")
	@Override
	public void method7883(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat84;
		@Pc(21) float local21 = this.aFloat81;
		@Pc(24) float local24 = this.aFloat76;
		this.aFloat84 = local18 * local9 - local15 * this.aFloat75;
		@Pc(37) float local37 = this.aFloat78;
		this.aFloat81 = local9 * local21 - local15 * this.aFloat77;
		this.aFloat75 = this.aFloat75 * local9 + local18 * local15;
		this.aFloat77 = this.aFloat77 * local9 + local15 * local21;
		this.aFloat76 = local9 * local24 - local15 * this.aFloat74;
		this.aFloat78 = local9 * local37 - local15 * this.aFloat73;
		this.aFloat74 = local24 * local15 + this.aFloat74 * local9;
		this.aFloat73 = local15 * local37 + this.aFloat73 * local9;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class314.aFloatArray76[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class314.aFloatArray75[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class314.aFloatArray76[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class314.aFloatArray75[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat74 = local21 * local9;
		this.aFloat80 = local9 * local39;
		this.aFloat83 = local27 * local47 + local21 * local33;
		this.aFloat81 = local33 * local9;
		this.aFloat75 = local27 * local9;
		this.aFloat82 = local21 * local47 + -local27 * local33;
		this.aFloat76 = local43 * local21 + local39 * local27;
		this.aFloat84 = local43 * local27 + local39 * -local21;
		this.aFloat77 = -local15;
		this.aFloat79 = -((float) arg2 * this.aFloat82) - (float) arg1 * this.aFloat80 + this.aFloat83 * (float) -arg0;
		this.aFloat73 = (float) -arg0 * this.aFloat75 - (float) arg1 * this.aFloat77 - this.aFloat74 * (float) arg2;
		this.aFloat78 = -(this.aFloat81 * (float) arg1) + this.aFloat84 * (float) -arg0 - this.aFloat76 * (float) arg2;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "()V")
	@Override
	public void method7876() {
		this.aFloat83 = this.aFloat81 = this.aFloat74 = 1.0F;
		this.aFloat84 = this.aFloat75 = this.aFloat80 = this.aFloat77 = this.aFloat82 = this.aFloat76 = this.aFloat79 = this.aFloat78 = this.aFloat73 = 0.0F;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method7868() {
		@Pc(7) Class177_Sub1 local7 = new Class177_Sub1();
		local7.aFloat75 = this.aFloat75;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat79 = this.aFloat79;
		return local7;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method7879(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub1 local6 = (Class177_Sub1) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat83 = local6.aFloat83;
		this.aFloat79 = local6.aFloat79;
		this.aFloat76 = local6.aFloat76;
		this.aFloat77 = local6.aFloat77;
		this.aFloat74 = local6.aFloat74;
		this.aFloat80 = local6.aFloat80;
		this.aFloat73 = local6.aFloat73;
		this.aFloat75 = local6.aFloat75;
		this.aFloat82 = local6.aFloat82;
		this.aFloat78 = local6.aFloat78;
		this.aFloat81 = local6.aFloat81;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([FI)[F")
	public float[] method3826(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloat84;
		arg0[7] = this.aFloat78;
		arg0[1] = this.aFloat80;
		arg0[2] = this.aFloat82;
		arg0[0] = this.aFloat83;
		arg0[6] = this.aFloat76;
		arg0[5] = this.aFloat81;
		arg0[3] = this.aFloat79;
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!uha;I)V")
	public void method3827(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub1 local6 = (Class177_Sub1) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat73 = 0.0F;
		this.aFloat80 = local6.aFloat80;
		this.aFloat78 = 0.0F;
		this.aFloat82 = local6.aFloat82;
		this.aFloat79 = 0.0F;
		this.aFloat77 = local6.aFloat77;
		this.aFloat81 = local6.aFloat81;
		this.aFloat74 = local6.aFloat74;
		this.aFloat76 = local6.aFloat76;
		this.aFloat83 = local6.aFloat83;
		this.aFloat75 = local6.aFloat75;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B[F)[F")
	public float[] method3828(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat82;
		arg0[4] = this.aFloat80;
		arg0[0] = this.aFloat83;
		arg0[6] = this.aFloat77;
		arg0[1] = this.aFloat84;
		arg0[13] = this.aFloat78;
		arg0[10] = this.aFloat74;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat81;
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat79;
		arg0[2] = this.aFloat75;
		arg0[14] = this.aFloat73;
		arg0[9] = this.aFloat76;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FFFFBFFFFF)V")
	public void method3829(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat76 = arg3;
		this.aFloat84 = arg1;
		this.aFloat79 = 0.0F;
		this.aFloat73 = 0.0F;
		this.aFloat78 = 0.0F;
		this.aFloat82 = arg8;
		this.aFloat81 = arg0;
		this.aFloat74 = arg4;
		this.aFloat75 = arg2;
		this.aFloat80 = arg7;
		this.aFloat77 = arg6;
		this.aFloat83 = arg5;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FFFI)V")
	public void method3830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat84 = this.aFloat75 = this.aFloat80 = this.aFloat77 = this.aFloat82 = this.aFloat76 = 0.0F;
		this.aFloat78 = arg0;
		this.aFloat83 = this.aFloat81 = this.aFloat74 = 1;
		this.aFloat79 = arg2;
		this.aFloat73 = arg1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIFIFIF)V")
	public void method3831(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat83 = arg2 * 2;
			this.aFloat84 = this.aFloat75 = this.aFloat80 = this.aFloat77 = this.aFloat82 = this.aFloat76 = 0.0F;
			this.aFloat81 = arg4 * 2;
			this.aFloat79 = (float) -arg2 + arg1;
			this.aFloat73 = arg5;
			this.aFloat74 = 1.0F;
			this.aFloat78 = arg3 - (float) arg4;
			return;
		}
		@Pc(61) float local61 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(67) float local67 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat84 = (float) arg2 * local67 * 2.0F;
		this.aFloat75 = this.aFloat77 = this.aFloat82 = this.aFloat76 = 0.0F;
		this.aFloat73 = arg5;
		this.aFloat80 = -2.0F * local67 * (float) arg4;
		this.aFloat81 = (float) arg4 * 2.0F * local61;
		this.aFloat78 = arg3 + (-0.5F * local67 - local61 * 0.5F) * (float) (arg4 * 2);
		this.aFloat74 = 1.0F;
		this.aFloat79 = (float) (arg2 * 2) * (local67 * 0.5F - local61 * 0.5F) + arg1;
		this.aFloat83 = (float) arg2 * 2.0F * local61;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!uha;)V")
	public void method3832(@OriginalArg(1) Class177 arg0) {
		@Pc(6) Class177_Sub1 local6 = (Class177_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat83;
		@Pc(12) float local12 = this.aFloat84;
		@Pc(15) float local15 = this.aFloat80;
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat76;
		@Pc(35) float local35 = this.aFloat79;
		this.aFloat83 = local6.aFloat82 * this.aFloat75 + local6.aFloat80 * local12 + local6.aFloat83 * local9;
		@Pc(55) float local55 = this.aFloat78;
		this.aFloat84 = this.aFloat75 * local6.aFloat76 + local6.aFloat84 * local9 + local6.aFloat81 * local12;
		this.aFloat75 = local9 * local6.aFloat75 + local6.aFloat77 * local12 + this.aFloat75 * local6.aFloat74;
		this.aFloat80 = this.aFloat77 * local6.aFloat82 + local6.aFloat80 * local18 + local15 * local6.aFloat83;
		this.aFloat81 = local6.aFloat81 * local18 + local6.aFloat84 * local15 + local6.aFloat76 * this.aFloat77;
		this.aFloat77 = local6.aFloat74 * this.aFloat77 + local6.aFloat77 * local18 + local15 * local6.aFloat75;
		this.aFloat82 = local24 * local6.aFloat80 + local6.aFloat83 * local21 + this.aFloat74 * local6.aFloat82;
		this.aFloat76 = local6.aFloat81 * local24 + local6.aFloat84 * local21 + this.aFloat74 * local6.aFloat76;
		this.aFloat78 = local6.aFloat78 + local55 * local6.aFloat81 + local35 * local6.aFloat84 + local6.aFloat76 * this.aFloat73;
		this.aFloat74 = this.aFloat74 * local6.aFloat74 + local24 * local6.aFloat77 + local21 * local6.aFloat75;
		this.aFloat79 = this.aFloat73 * local6.aFloat82 + local6.aFloat80 * local55 + local6.aFloat83 * local35 + local6.aFloat79;
		this.aFloat73 = this.aFloat73 * local6.aFloat74 + local6.aFloat77 * local55 + local35 * local6.aFloat75 + local6.aFloat73;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([FB)[F")
	public float[] method3833(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat76;
		arg0[2] = this.aFloat82;
		arg0[10] = this.aFloat74;
		arg0[12] = 0.0F;
		arg0[7] = 0.0F;
		arg0[15] = 0.0F;
		arg0[8] = this.aFloat75;
		arg0[14] = 0.0F;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat80;
		arg0[0] = this.aFloat83;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat77;
		arg0[4] = this.aFloat84;
		arg0[5] = this.aFloat81;
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	@Override
	public void method7874(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat83;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat82;
		this.aFloat83 = local18 * local9 + local15 * this.aFloat75;
		@Pc(37) float local37 = this.aFloat79;
		this.aFloat75 = local9 * this.aFloat75 - local18 * local15;
		this.aFloat80 = local15 * this.aFloat77 + local21 * local9;
		this.aFloat77 = this.aFloat77 * local9 - local21 * local15;
		this.aFloat82 = local9 * local24 + local15 * this.aFloat74;
		this.aFloat74 = this.aFloat74 * local9 - local15 * local24;
		this.aFloat79 = this.aFloat73 * local15 + local37 * local9;
		this.aFloat73 = this.aFloat73 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!uha;B)V")
	public void method3834(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub1 local6 = (Class177_Sub1) arg0;
		this.aFloat82 = local6.aFloat75;
		this.aFloat80 = local6.aFloat84;
		this.aFloat83 = local6.aFloat83;
		this.aFloat84 = local6.aFloat80;
		this.aFloat75 = local6.aFloat82;
		this.aFloat76 = local6.aFloat77;
		this.aFloat81 = local6.aFloat81;
		this.aFloat74 = local6.aFloat74;
		this.aFloat77 = local6.aFloat76;
		this.aFloat79 = -(local6.aFloat78 * this.aFloat80 + local6.aFloat79 * this.aFloat83 + local6.aFloat73 * this.aFloat82);
		this.aFloat78 = -(this.aFloat76 * local6.aFloat73 + local6.aFloat79 * this.aFloat84 + this.aFloat81 * local6.aFloat78);
		this.aFloat73 = -(local6.aFloat78 * this.aFloat77 + this.aFloat75 * local6.aFloat79 + this.aFloat74 * local6.aFloat73);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat84 = this.aFloat75 = this.aFloat80 = this.aFloat77 = this.aFloat82 = this.aFloat76 = 0.0F;
		this.aFloat78 = arg1;
		this.aFloat83 = this.aFloat81 = this.aFloat74 = 1.0F;
		this.aFloat73 = arg2;
		this.aFloat79 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FZFF)V")
	public void method3835(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat81 *= arg2;
		this.aFloat77 *= arg0;
		this.aFloat79 *= arg1;
		this.aFloat74 *= arg0;
		this.aFloat75 *= arg0;
		this.aFloat73 *= arg0;
		this.aFloat84 *= arg2;
		this.aFloat76 *= arg2;
		this.aFloat83 *= arg1;
		this.aFloat78 *= arg2;
		this.aFloat80 *= arg1;
		this.aFloat82 *= arg1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I[F)[F")
	public float[] method3836(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat84;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat80;
		arg0[13] = 0.0F;
		arg0[2] = 0;
		arg0[10] = this.aFloat73;
		arg0[9] = this.aFloat78;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat81;
		arg0[0] = this.aFloat83;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat79;
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FBFF)F")
	public float method3837(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat74 + arg0 * this.aFloat75 + this.aFloat77 * arg1 + this.aFloat73;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FFIF)F")
	public float method3838(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat80 * arg2 + arg0 * this.aFloat83 + arg1 * this.aFloat82 + this.aFloat79;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B[F)[F")
	public float[] method3839(@OriginalArg(1) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat84;
		arg0[0] = this.aFloat83;
		arg0[6] = this.aFloat76;
		arg0[3] = this.aFloat79;
		arg0[7] = this.aFloat78;
		arg0[2] = this.aFloat82;
		arg0[11] = this.aFloat73;
		arg0[1] = this.aFloat80;
		arg0[5] = this.aFloat81;
		arg0[8] = this.aFloat75;
		arg0[10] = this.aFloat74;
		arg0[9] = this.aFloat77;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([I)V")
	@Override
	public void method7878(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat79;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat78;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat73;
		arg0[1] = (int) (local30 * this.aFloat77 + local12 * this.aFloat80 + this.aFloat81 * local21);
		arg0[0] = (int) (local30 * this.aFloat75 + local21 * this.aFloat84 + local12 * this.aFloat83);
		arg0[2] = (int) (local21 * this.aFloat76 + local12 * this.aFloat82 + local30 * this.aFloat74);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(FFFI)V")
	public void method3840(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat84 = 0.0F;
		this.aFloat79 = 0.0F;
		this.aFloat83 = arg2;
		this.aFloat78 = 0.0F;
		this.aFloat82 = 0.0F;
		this.aFloat74 = arg1;
		this.aFloat77 = 0.0F;
		this.aFloat75 = 0.0F;
		this.aFloat80 = 0.0F;
		this.aFloat73 = 0.0F;
		this.aFloat81 = arg0;
		this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
	@Override
	public void method7880(@OriginalArg(0) int arg0) {
		this.aFloat83 = 1.0F;
		this.aFloat81 = this.aFloat74 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat77 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat76 = -this.aFloat77;
		this.aFloat80 = this.aFloat82 = this.aFloat79 = this.aFloat84 = this.aFloat78 = this.aFloat75 = this.aFloat73 = 0.0F;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat74 = 1.0F;
		this.aFloat83 = this.aFloat81 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat84 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat82 = this.aFloat79 = this.aFloat76 = this.aFloat78 = this.aFloat75 = this.aFloat77 = this.aFloat73 = 0.0F;
		this.aFloat80 = -this.aFloat84;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat79 += arg0;
		this.aFloat78 += arg1;
		this.aFloat73 += arg2;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
	@Override
	public void method7877(@OriginalArg(0) int arg0) {
		this.aFloat81 = 1.0F;
		this.aFloat83 = this.aFloat74 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat82 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat80 = this.aFloat79 = this.aFloat84 = this.aFloat76 = this.aFloat78 = this.aFloat77 = this.aFloat73 = 0.0F;
		this.aFloat75 = -this.aFloat82;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat77 + (float) arg0 * this.aFloat75 + (float) arg2 * this.aFloat74);
		arg3[1] = (int) (this.aFloat84 * (float) arg0 + (float) arg1 * this.aFloat81 + (float) arg2 * this.aFloat76);
		arg3[0] = (int) (this.aFloat80 * (float) arg1 + (float) arg0 * this.aFloat83 + this.aFloat82 * (float) arg2);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat83;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat82;
		@Pc(27) float local27 = this.aFloat79;
		this.aFloat83 = local9 * local18 - local15 * this.aFloat84;
		this.aFloat80 = local9 * local21 - local15 * this.aFloat81;
		this.aFloat84 = this.aFloat84 * local9 + local15 * local18;
		this.aFloat81 = this.aFloat81 * local9 + local15 * local21;
		this.aFloat82 = local24 * local9 - local15 * this.aFloat76;
		this.aFloat79 = local9 * local27 - this.aFloat78 * local15;
		this.aFloat76 = local24 * local15 + this.aFloat76 * local9;
		this.aFloat78 = this.aFloat78 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat78);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat73);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat79);
		arg3[1] = (int) (this.aFloat81 * (float) local6 + (float) local24 * this.aFloat80 + this.aFloat77 * (float) local17);
		arg3[2] = (int) ((float) local17 * this.aFloat74 + (float) local6 * this.aFloat76 + (float) local24 * this.aFloat82);
		arg3[0] = (int) (this.aFloat75 * (float) local17 + (float) local24 * this.aFloat83 + (float) local6 * this.aFloat84);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat73 + this.aFloat74 * (float) arg2 + (float) arg0 * this.aFloat75 + (float) arg1 * this.aFloat77);
		arg3[1] = (int) (this.aFloat78 + this.aFloat81 * (float) arg1 + this.aFloat84 * (float) arg0 + (float) arg2 * this.aFloat76);
		arg3[0] = (int) ((float) arg1 * this.aFloat80 + this.aFloat83 * (float) arg0 + this.aFloat82 * (float) arg2 + this.aFloat79);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FFBF)V")
	public void method3842(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat78 += arg0;
		this.aFloat79 += arg2;
		this.aFloat73 += arg1;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(FFFI)F")
	public float method3843(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat78 + this.aFloat84 * arg1 + arg0 * this.aFloat81 + this.aFloat76 * arg2;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
	public void method3844() {
		this.aFloat84 = -this.aFloat84;
		this.aFloat74 = -this.aFloat74;
		this.aFloat81 = -this.aFloat81;
		this.aFloat73 = -this.aFloat73;
		this.aFloat76 = -this.aFloat76;
		this.aFloat78 = -this.aFloat78;
		this.aFloat77 = -this.aFloat77;
		this.aFloat75 = -this.aFloat75;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([FFBFFF)V")
	public void method3845(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[1] = this.aFloat76 * arg2 + arg1 * this.aFloat81 + this.aFloat84 * arg3;
		arg0[2] = arg2 * this.aFloat74 + this.aFloat75 * arg3 + this.aFloat77 * arg1;
		arg0[0] = arg2 * this.aFloat82 + arg1 * this.aFloat80 + arg3 * this.aFloat83;
		@Pc(93) float local93;
		@Pc(109) float local109;
		@Pc(101) float local101;
		@Pc(85) float local85;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local85 = -arg4 / arg3;
			local101 = this.aFloat75 * local85 + this.aFloat73;
			local93 = local85 * this.aFloat83 + this.aFloat79;
			local109 = local85 * this.aFloat84 + this.aFloat78;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local85 = -arg4 / arg1;
			local101 = local85 * this.aFloat77 + this.aFloat73;
			local109 = this.aFloat81 * local85 + this.aFloat78;
			local93 = this.aFloat80 * local85 + this.aFloat79;
		} else {
			local85 = -arg4 / arg2;
			local93 = this.aFloat79 + this.aFloat82 * local85;
			local101 = this.aFloat73 + this.aFloat74 * local85;
			local109 = this.aFloat78 + local85 * this.aFloat76;
		}
		arg0[3] = -(arg0[2] * local101 + arg0[0] * local93 + arg0[1] * local109);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!uha;Lclient!uha;)V")
	public void method3846(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class177 arg1) {
		@Pc(6) Class177_Sub1 local6 = (Class177_Sub1) arg0;
		@Pc(9) Class177_Sub1 local9 = (Class177_Sub1) arg1;
		this.aFloat83 = local6.aFloat82 * local9.aFloat75 + local9.aFloat83 * local6.aFloat83 + local9.aFloat84 * local6.aFloat80;
		this.aFloat84 = local6.aFloat84 * local9.aFloat83 + local9.aFloat84 * local6.aFloat81 + local6.aFloat76 * local9.aFloat75;
		this.aFloat75 = local9.aFloat75 * local6.aFloat74 + local9.aFloat83 * local6.aFloat75 + local6.aFloat77 * local9.aFloat84;
		this.aFloat80 = local6.aFloat82 * local9.aFloat77 + local9.aFloat81 * local6.aFloat80 + local6.aFloat83 * local9.aFloat80;
		this.aFloat81 = local6.aFloat76 * local9.aFloat77 + local9.aFloat80 * local6.aFloat84 + local9.aFloat81 * local6.aFloat81;
		this.aFloat77 = local6.aFloat74 * local9.aFloat77 + local6.aFloat75 * local9.aFloat80 + local9.aFloat81 * local6.aFloat77;
		this.aFloat82 = local9.aFloat76 * local6.aFloat80 + local6.aFloat83 * local9.aFloat82 + local6.aFloat82 * local9.aFloat74;
		this.aFloat76 = local6.aFloat76 * local9.aFloat74 + local6.aFloat84 * local9.aFloat82 + local6.aFloat81 * local9.aFloat76;
		this.aFloat79 = local6.aFloat82 * local9.aFloat73 + local6.aFloat80 * local9.aFloat78 + local9.aFloat79 * local6.aFloat83 + local6.aFloat79;
		this.aFloat74 = local9.aFloat82 * local6.aFloat75 + local6.aFloat77 * local9.aFloat76 + local9.aFloat74 * local6.aFloat74;
		this.aFloat78 = local6.aFloat78 + local6.aFloat81 * local9.aFloat78 + local6.aFloat84 * local9.aFloat79 + local9.aFloat73 * local6.aFloat76;
		this.aFloat73 = local9.aFloat79 * local6.aFloat75 + local9.aFloat78 * local6.aFloat77 + local9.aFloat73 * local6.aFloat74 + local6.aFloat73;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BFFF[F)V")
	public void method3847(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = this.aFloat75 * arg1 + this.aFloat77 * arg2 + this.aFloat74 * arg0;
		arg3[1] = this.aFloat81 * arg2 + this.aFloat84 * arg1 + arg0 * this.aFloat76;
		arg3[0] = arg1 * this.aFloat83 + this.aFloat80 * arg2 + this.aFloat82 * arg0;
	}
}
