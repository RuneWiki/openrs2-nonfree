import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class33_Sub2() {
		this.xa();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class33 method2435() {
		@Pc(7) Class33_Sub2 local7 = new Class33_Sub2();
		local7.aFloat76 = this.aFloat76;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat81 = this.aFloat81;
		return local7;
	}

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat80 * (float) arg0 + (float) arg1 * this.aFloat78 + (float) arg2 * this.aFloat74);
		arg3[0] = (int) ((float) arg2 * this.aFloat81 + this.aFloat82 * (float) arg0 + (float) arg1 * this.aFloat76);
		arg3[1] = (int) (this.aFloat73 * (float) arg0 + this.aFloat71 * (float) arg1 + this.aFloat77 * (float) arg2);
	}

	@OriginalMember(owner = "client!hs", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aFloat82 = this.aFloat71 = this.aFloat74 = 1.0F;
		this.aFloat73 = this.aFloat80 = this.aFloat76 = this.aFloat78 = this.aFloat81 = this.aFloat77 = this.aFloat75 = this.aFloat79 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat75 + (float) arg1 * this.aFloat76 + this.aFloat82 * (float) arg0 + (float) arg2 * this.aFloat81);
		arg3[1] = (int) (this.aFloat73 * (float) arg0 + (float) arg1 * this.aFloat71 + (float) arg2 * this.aFloat77 + this.aFloat79);
		arg3[2] = (int) (this.aFloat72 + (float) arg2 * this.aFloat74 + this.aFloat80 * (float) arg0 + this.aFloat78 * (float) arg1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(FIIIFFI)V")
	public void method2384(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat74 = 1.0F;
			this.aFloat71 = arg2;
			this.aFloat82 = arg1;
			this.aFloat73 = this.aFloat80 = this.aFloat76 = this.aFloat78 = this.aFloat81 = this.aFloat77 = 0.0F;
		} else {
			@Pc(7) float local7 = Class186.aFloatArray10[arg5 & 0x3FFF];
			@Pc(13) float local13 = Class186.aFloatArray11[arg5 & 0x3FFF];
			this.aFloat74 = 1.0F;
			this.aFloat76 = (float) arg2 * -local13;
			this.aFloat82 = (float) arg1 * local7;
			this.aFloat71 = (float) arg2 * local7;
			this.aFloat80 = this.aFloat78 = this.aFloat81 = this.aFloat77 = 0.0F;
			this.aFloat73 = (float) arg1 * local13;
		}
		this.aFloat75 = arg3;
		this.aFloat72 = arg4;
		this.aFloat79 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.aFloat82 = 1.0F;
		this.aFloat71 = this.aFloat74 = Class186.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat78 = Class186.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat77 = -this.aFloat78;
		this.aFloat76 = this.aFloat81 = this.aFloat75 = this.aFloat73 = this.aFloat79 = this.aFloat80 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)[F")
	public float[] method2385() {
		Static324.aFloatArray22[14] = 0.0F;
		Static324.aFloatArray22[10] = this.aFloat74;
		Static324.aFloatArray22[8] = this.aFloat81;
		Static324.aFloatArray22[6] = this.aFloat78;
		Static324.aFloatArray22[13] = 0.0F;
		Static324.aFloatArray22[12] = 0.0F;
		Static324.aFloatArray22[2] = this.aFloat80;
		Static324.aFloatArray22[1] = this.aFloat73;
		Static324.aFloatArray22[4] = this.aFloat76;
		Static324.aFloatArray22[9] = this.aFloat77;
		Static324.aFloatArray22[0] = this.aFloat82;
		Static324.aFloatArray22[5] = this.aFloat71;
		return Static324.aFloatArray22;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!c;)V")
	public void method2386(@OriginalArg(1) Class33 arg0) {
		@Pc(11) Class33_Sub2 local11 = (Class33_Sub2) arg0;
		this.aFloat81 = local11.aFloat80;
		this.aFloat82 = local11.aFloat82;
		this.aFloat76 = local11.aFloat73;
		this.aFloat71 = local11.aFloat71;
		this.aFloat80 = local11.aFloat81;
		this.aFloat77 = local11.aFloat78;
		this.aFloat73 = local11.aFloat76;
		this.aFloat75 = -(local11.aFloat72 * this.aFloat81 + local11.aFloat75 * this.aFloat82 + this.aFloat76 * local11.aFloat79);
		this.aFloat74 = local11.aFloat74;
		this.aFloat78 = local11.aFloat77;
		this.aFloat79 = -(this.aFloat77 * local11.aFloat72 + local11.aFloat75 * this.aFloat73 + this.aFloat71 * local11.aFloat79);
		this.aFloat72 = -(local11.aFloat75 * this.aFloat80 + this.aFloat78 * local11.aFloat79 + local11.aFloat72 * this.aFloat74);
	}

	@OriginalMember(owner = "client!hs", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class186.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class186.aFloatArray11[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat82;
		@Pc(21) float local21 = this.aFloat76;
		@Pc(24) float local24 = this.aFloat81;
		@Pc(27) float local27 = this.aFloat75;
		this.aFloat82 = local9 * local18 + this.aFloat80 * local15;
		this.aFloat80 = this.aFloat80 * local9 - local15 * local18;
		this.aFloat76 = local9 * local21 + local15 * this.aFloat78;
		this.aFloat81 = this.aFloat74 * local15 + local9 * local24;
		this.aFloat78 = local9 * this.aFloat78 - local21 * local15;
		this.aFloat74 = this.aFloat74 * local9 - local24 * local15;
		this.aFloat75 = local15 * this.aFloat72 + local27 * local9;
		this.aFloat72 = local9 * this.aFloat72 - local27 * local15;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)[F")
	public float[] method2389() {
		Static324.aFloatArray22[10] = this.aFloat74;
		Static324.aFloatArray22[12] = this.aFloat75;
		Static324.aFloatArray22[1] = this.aFloat73;
		Static324.aFloatArray22[13] = this.aFloat79;
		Static324.aFloatArray22[14] = this.aFloat72;
		Static324.aFloatArray22[6] = this.aFloat78;
		Static324.aFloatArray22[8] = this.aFloat81;
		Static324.aFloatArray22[0] = this.aFloat82;
		Static324.aFloatArray22[9] = this.aFloat77;
		Static324.aFloatArray22[5] = this.aFloat71;
		Static324.aFloatArray22[4] = this.aFloat76;
		Static324.aFloatArray22[2] = this.aFloat80;
		return Static324.aFloatArray22;
	}

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat75;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat79;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat72;
		arg0[0] = (int) (this.aFloat82 * local11 + local20 * this.aFloat73 + this.aFloat80 * local28);
		arg0[1] = (int) (this.aFloat76 * local11 + this.aFloat71 * local20 + local28 * this.aFloat78);
		arg0[2] = (int) (this.aFloat81 * local11 + this.aFloat77 * local20 + this.aFloat74 * local28);
	}

	@OriginalMember(owner = "client!hs", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat71 = 1.0F;
		this.aFloat82 = this.aFloat74 = Class186.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat81 = Class186.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat76 = this.aFloat75 = this.aFloat73 = this.aFloat77 = this.aFloat79 = this.aFloat78 = this.aFloat72 = 0.0F;
		this.aFloat80 = -this.aFloat81;
	}

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 = arg0;
		this.aFloat72 = arg2;
		this.aFloat82 = this.aFloat71 = this.aFloat74 = 1.0F;
		this.aFloat73 = this.aFloat80 = this.aFloat76 = this.aFloat78 = this.aFloat81 = this.aFloat77 = 0.0F;
		this.aFloat79 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class186.aFloatArray10[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class186.aFloatArray11[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class186.aFloatArray10[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class186.aFloatArray11[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class186.aFloatArray10[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class186.aFloatArray11[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat80 = local9 * local27;
		this.aFloat82 = local27 * local47 + local33 * local21;
		this.aFloat71 = local9 * local33;
		this.aFloat81 = local47 * local21 + local33 * -local27;
		this.aFloat78 = -local15;
		this.aFloat77 = local39 * local27 + local21 * local43;
		this.aFloat73 = local43 * local27 + -local21 * local39;
		this.aFloat76 = local9 * local39;
		this.aFloat74 = local9 * local21;
		this.aFloat75 = this.aFloat82 * (float) -arg0 - this.aFloat76 * (float) arg1 - (float) arg2 * this.aFloat81;
		this.aFloat79 = -((float) arg1 * this.aFloat71) + this.aFloat73 * (float) -arg0 - (float) arg2 * this.aFloat77;
		this.aFloat72 = -(this.aFloat78 * (float) arg1) + this.aFloat80 * (float) -arg0 - (float) arg2 * this.aFloat74;
	}

	@OriginalMember(owner = "client!hs", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class186.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class186.aFloatArray11[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat73;
		@Pc(21) float local21 = this.aFloat71;
		@Pc(24) float local24 = this.aFloat77;
		@Pc(27) float local27 = this.aFloat79;
		this.aFloat73 = local9 * local18 - this.aFloat80 * local15;
		this.aFloat80 = this.aFloat80 * local9 + local15 * local18;
		this.aFloat71 = local9 * local21 - this.aFloat78 * local15;
		this.aFloat78 = local15 * local21 + local9 * this.aFloat78;
		this.aFloat77 = local24 * local9 - this.aFloat74 * local15;
		this.aFloat79 = local9 * local27 - this.aFloat72 * local15;
		this.aFloat74 = local9 * this.aFloat74 + local24 * local15;
		this.aFloat72 = local9 * this.aFloat72 + local15 * local27;
	}

	@OriginalMember(owner = "client!hs", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class33 arg0) {
		@Pc(6) Class33_Sub2 local6 = (Class33_Sub2) arg0;
		this.aFloat76 = local6.aFloat76;
		this.aFloat71 = local6.aFloat71;
		this.aFloat73 = local6.aFloat73;
		this.aFloat77 = local6.aFloat77;
		this.aFloat80 = local6.aFloat80;
		this.aFloat81 = local6.aFloat81;
		this.aFloat72 = local6.aFloat72;
		this.aFloat79 = local6.aFloat79;
		this.aFloat75 = local6.aFloat75;
		this.aFloat78 = local6.aFloat78;
		this.aFloat82 = local6.aFloat82;
		this.aFloat74 = local6.aFloat74;
	}

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat74 = 1.0F;
		this.aFloat82 = this.aFloat71 = Class186.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat73 = Class186.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat76 = -this.aFloat73;
		this.aFloat81 = this.aFloat75 = this.aFloat77 = this.aFloat79 = this.aFloat80 = this.aFloat78 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 += arg0;
		this.aFloat72 += arg2;
		this.aFloat79 += arg1;
	}
}
