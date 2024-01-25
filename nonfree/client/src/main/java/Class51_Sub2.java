import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!gk", name = "K", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!gk", name = "U", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!gk", name = "Y", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!gk", name = "fb", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class51_Sub2() {
		this.method6714();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!pda;I)V")
	public void method3230(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub2 local6 = (Class51_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat68;
		@Pc(12) float local12 = this.aFloat72;
		@Pc(23) float local23 = this.aFloat76;
		@Pc(26) float local26 = this.aFloat77;
		@Pc(29) float local29 = this.aFloat70;
		@Pc(32) float local32 = this.aFloat71;
		@Pc(35) float local35 = this.aFloat75;
		this.aFloat72 = this.aFloat74 * local6.aFloat71 + local6.aFloat77 * local12 + local6.aFloat72 * local9;
		this.aFloat68 = local9 * local6.aFloat68 + local6.aFloat76 * local12 + this.aFloat74 * local6.aFloat70;
		@Pc(72) float local72 = this.aFloat69;
		this.aFloat76 = local6.aFloat70 * this.aFloat73 + local6.aFloat76 * local26 + local23 * local6.aFloat68;
		this.aFloat77 = local6.aFloat71 * this.aFloat73 + local23 * local6.aFloat72 + local26 * local6.aFloat77;
		this.aFloat74 = this.aFloat74 * local6.aFloat78 + local12 * local6.aFloat73 + local9 * local6.aFloat74;
		this.aFloat70 = local6.aFloat68 * local29 + local6.aFloat76 * local32 + local6.aFloat70 * this.aFloat78;
		this.aFloat71 = local32 * local6.aFloat77 + local29 * local6.aFloat72 + local6.aFloat71 * this.aFloat78;
		this.aFloat73 = this.aFloat73 * local6.aFloat78 + local6.aFloat73 * local26 + local23 * local6.aFloat74;
		this.aFloat69 = local6.aFloat69 + local6.aFloat77 * local72 + local35 * local6.aFloat72 + local6.aFloat71 * this.aFloat79;
		this.aFloat78 = local6.aFloat73 * local32 + local6.aFloat74 * local29 + local6.aFloat78 * this.aFloat78;
		this.aFloat75 = local72 * local6.aFloat76 + local35 * local6.aFloat68 + local6.aFloat70 * this.aFloat79 + local6.aFloat75;
		this.aFloat79 = local6.aFloat79 + this.aFloat79 * local6.aFloat78 + local35 * local6.aFloat74 + local72 * local6.aFloat73;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method6703(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat76;
		@Pc(24) float local24 = this.aFloat70;
		@Pc(27) float local27 = this.aFloat75;
		this.aFloat68 = this.aFloat74 * local15 + local18 * local9;
		this.aFloat74 = this.aFloat74 * local9 - local15 * local18;
		this.aFloat76 = local21 * local9 + local15 * this.aFloat73;
		this.aFloat70 = this.aFloat78 * local15 + local24 * local9;
		this.aFloat73 = local9 * this.aFloat73 - local15 * local21;
		this.aFloat78 = this.aFloat78 * local9 - local15 * local24;
		this.aFloat75 = local27 * local9 + local15 * this.aFloat79;
		this.aFloat79 = this.aFloat79 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat75);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat79);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat69);
		arg3[0] = (int) (this.aFloat74 * (float) local13 + (float) local6 * this.aFloat68 + this.aFloat72 * (float) local20);
		arg3[2] = (int) (this.aFloat78 * (float) local13 + (float) local6 * this.aFloat70 + (float) local20 * this.aFloat71);
		arg3[1] = (int) ((float) local20 * this.aFloat77 + (float) local6 * this.aFloat76 + this.aFloat73 * (float) local13);
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
	@Override
	public void method6720(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat76;
		@Pc(24) float local24 = this.aFloat70;
		this.aFloat68 = local9 * local18 - local15 * this.aFloat72;
		@Pc(37) float local37 = this.aFloat75;
		this.aFloat76 = local9 * local21 - this.aFloat77 * local15;
		this.aFloat72 = local9 * this.aFloat72 + local15 * local18;
		this.aFloat77 = local15 * local21 + this.aFloat77 * local9;
		this.aFloat70 = local9 * local24 - local15 * this.aFloat71;
		this.aFloat71 = local15 * local24 + this.aFloat71 * local9;
		this.aFloat75 = local37 * local9 - this.aFloat69 * local15;
		this.aFloat69 = local9 * this.aFloat69 + local15 * local37;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([FB)[F")
	public float[] method3231(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat76;
		arg0[5] = this.aFloat77;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat72;
		arg0[12] = 0.0F;
		arg0[7] = this.aFloat69;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat68;
		arg0[3] = this.aFloat75;
		arg0[9] = this.aFloat73;
		arg0[2] = this.aFloat70;
		arg0[8] = this.aFloat74;
		arg0[11] = this.aFloat79;
		arg0[6] = this.aFloat71;
		arg0[10] = this.aFloat78;
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat78 * (float) arg2 + this.aFloat73 * (float) arg1 + this.aFloat74 * (float) arg0 + this.aFloat79);
		arg3[0] = (int) ((float) arg0 * this.aFloat68 + this.aFloat76 * (float) arg1 + this.aFloat70 * (float) arg2 + this.aFloat75);
		arg3[1] = (int) ((float) arg1 * this.aFloat77 + this.aFloat72 * (float) arg0 + this.aFloat71 * (float) arg2 + this.aFloat69);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class127_Sub2.aFloatArray66[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class127_Sub2.aFloatArray67[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class127_Sub2.aFloatArray66[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class127_Sub2.aFloatArray67[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat73 = -local15;
		this.aFloat78 = local9 * local21;
		this.aFloat70 = local21 * local47 + local33 * -local27;
		this.aFloat74 = local27 * local9;
		this.aFloat68 = local27 * local47 + local33 * local21;
		this.aFloat71 = local21 * local43 + local39 * local27;
		this.aFloat77 = local9 * local33;
		this.aFloat72 = local43 * local27 + -local21 * local39;
		this.aFloat76 = local9 * local39;
		this.aFloat75 = this.aFloat68 * (float) -arg0 - (float) arg1 * this.aFloat76 - this.aFloat70 * (float) arg2;
		this.aFloat69 = -(this.aFloat71 * (float) arg2) + (float) -arg0 * this.aFloat72 - (float) arg1 * this.aFloat77;
		this.aFloat79 = -(this.aFloat73 * (float) arg1) + (float) -arg0 * this.aFloat74 - (float) arg2 * this.aFloat78;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FIFF)V")
	public void method3232(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat75 += arg1;
		this.aFloat69 += arg2;
		this.aFloat79 += arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFFFIFFFFF)V")
	public void method3233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat68 = arg8;
		this.aFloat74 = arg1;
		this.aFloat70 = arg3;
		this.aFloat72 = arg0;
		this.aFloat75 = 0.0F;
		this.aFloat69 = 0.0F;
		this.aFloat76 = arg2;
		this.aFloat77 = arg5;
		this.aFloat73 = arg6;
		this.aFloat78 = arg7;
		this.aFloat71 = arg4;
		this.aFloat79 = 0.0F;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[F)[F")
	public float[] method3234(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat79;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat72;
		arg0[14] = 0.0F;
		arg0[3] = 0.0F;
		arg0[2] = 0.0F;
		arg0[8] = this.aFloat75;
		arg0[4] = this.aFloat76;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat68;
		arg0[5] = this.aFloat77;
		arg0[13] = 0.0F;
		arg0[9] = this.aFloat69;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([FFIFF)V")
	public void method3235(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat68 * arg1 + this.aFloat76 * arg2 + arg3 * this.aFloat70;
		arg0[2] = arg1 * this.aFloat74 + arg2 * this.aFloat73 + this.aFloat78 * arg3;
		arg0[1] = arg1 * this.aFloat72 + this.aFloat77 * arg2 + this.aFloat71 * arg3;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 += (float) arg0;
		this.aFloat69 += (float) arg1;
		this.aFloat79 += (float) arg2;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat72 + (float) arg1 * this.aFloat77 + this.aFloat71 * (float) arg2);
		arg3[2] = (int) (this.aFloat73 * (float) arg1 + this.aFloat74 * (float) arg0 + (float) arg2 * this.aFloat78);
		arg3[0] = (int) (this.aFloat68 * (float) arg0 + (float) arg1 * this.aFloat76 + (float) arg2 * this.aFloat70);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat68 = this.aFloat78 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat70 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat76 = this.aFloat75 = this.aFloat72 = this.aFloat71 = this.aFloat69 = this.aFloat73 = this.aFloat79 = 0.0F;
		this.aFloat74 = -this.aFloat70;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public void method3236() {
		this.aFloat79 = -this.aFloat79;
		this.aFloat72 = -this.aFloat72;
		this.aFloat69 = -this.aFloat69;
		this.aFloat73 = -this.aFloat73;
		this.aFloat77 = -this.aFloat77;
		this.aFloat71 = -this.aFloat71;
		this.aFloat78 = -this.aFloat78;
		this.aFloat74 = -this.aFloat74;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFFI)F")
	public float method3237(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat71 + arg2 * this.aFloat72 + this.aFloat77 * arg1 + this.aFloat69;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method6712() {
		@Pc(7) Class51_Sub2 local7 = new Class51_Sub2();
		local7.aFloat77 = this.aFloat77;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat69 = this.aFloat69;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat74 = this.aFloat74;
		return local7;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFIF)V")
	public void method3238(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat70 *= arg0;
		this.aFloat75 *= arg0;
		this.aFloat72 *= arg2;
		this.aFloat76 *= arg0;
		this.aFloat79 *= arg1;
		this.aFloat73 *= arg1;
		this.aFloat77 *= arg2;
		this.aFloat68 *= arg0;
		this.aFloat74 *= arg1;
		this.aFloat78 *= arg1;
		this.aFloat69 *= arg2;
		this.aFloat71 *= arg2;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIFFIFI)V")
	public void method3239(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat79 = arg1;
			this.aFloat68 = (float) (arg3 * 2);
			this.aFloat77 = (float) (arg0 * 2);
			this.aFloat78 = 1.0F;
			this.aFloat72 = this.aFloat74 = this.aFloat76 = this.aFloat73 = this.aFloat70 = this.aFloat71 = 0.0F;
			this.aFloat69 = (float) -arg0 + arg2;
			this.aFloat75 = (float) -arg3 + arg4;
			return;
		}
		@Pc(11) float local11 = Class127_Sub2.aFloatArray66[arg5 & 0x3FFF];
		@Pc(17) float local17 = Class127_Sub2.aFloatArray67[arg5 & 0x3FFF];
		this.aFloat76 = local17 * -2.0F * (float) arg0;
		this.aFloat75 = arg4 + (local17 * 0.5F - local11 * 0.5F) * (float) (arg3 * 2);
		this.aFloat72 = (float) arg3 * 2.0F * local17;
		this.aFloat74 = this.aFloat73 = this.aFloat70 = this.aFloat71 = 0.0F;
		this.aFloat77 = local11 * 2.0F * (float) arg0;
		this.aFloat78 = 1.0F;
		this.aFloat69 = arg2 + (local17 * -0.5F - local11 * 0.5F) * (float) (arg0 * 2);
		this.aFloat79 = arg1;
		this.aFloat68 = local11 * 2.0F * (float) arg3;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([I)V")
	@Override
	public void method6715(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat75;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat69;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat79;
		arg0[2] = (int) (this.aFloat78 * local28 + this.aFloat71 * local20 + local12 * this.aFloat70);
		arg0[0] = (int) (this.aFloat74 * local28 + local12 * this.aFloat68 + this.aFloat72 * local20);
		arg0[1] = (int) (local28 * this.aFloat73 + this.aFloat76 * local12 + local20 * this.aFloat77);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
	@Override
	public void method6718(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat68 = this.aFloat77 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat72 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat76 = -this.aFloat72;
		this.aFloat70 = this.aFloat75 = this.aFloat71 = this.aFloat69 = this.aFloat74 = this.aFloat73 = this.aFloat79 = 0.0F;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()V")
	@Override
	public void method6714() {
		this.aFloat68 = this.aFloat77 = this.aFloat78 = 1.0F;
		this.aFloat72 = this.aFloat74 = this.aFloat76 = this.aFloat73 = this.aFloat70 = this.aFloat71 = this.aFloat75 = this.aFloat69 = this.aFloat79 = 0.0F;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z[F)[F")
	public float[] method3240(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat68;
		arg0[10] = this.aFloat78;
		arg0[12] = this.aFloat75;
		arg0[14] = this.aFloat79;
		arg0[8] = this.aFloat70;
		arg0[5] = this.aFloat77;
		arg0[1] = this.aFloat72;
		arg0[15] = 1.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat73;
		arg0[9] = this.aFloat71;
		arg0[2] = this.aFloat74;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat76;
		arg0[13] = this.aFloat69;
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat72 = this.aFloat74 = this.aFloat76 = this.aFloat73 = this.aFloat70 = this.aFloat71 = 0.0F;
		this.aFloat75 = (float) arg0;
		this.aFloat79 = (float) arg2;
		this.aFloat68 = this.aFloat77 = this.aFloat78 = 1.0F;
		this.aFloat69 = (float) arg1;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lclient!pda;I)V")
	public void method3241(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub2 local6 = (Class51_Sub2) arg0;
		this.aFloat76 = local6.aFloat72;
		this.aFloat70 = local6.aFloat74;
		this.aFloat68 = local6.aFloat68;
		this.aFloat71 = local6.aFloat73;
		this.aFloat74 = local6.aFloat70;
		this.aFloat72 = local6.aFloat76;
		this.aFloat77 = local6.aFloat77;
		this.aFloat73 = local6.aFloat71;
		this.aFloat78 = local6.aFloat78;
		this.aFloat75 = -(this.aFloat70 * local6.aFloat79 + local6.aFloat75 * this.aFloat68 + this.aFloat76 * local6.aFloat69);
		this.aFloat69 = -(local6.aFloat79 * this.aFloat71 + local6.aFloat69 * this.aFloat77 + local6.aFloat75 * this.aFloat72);
		this.aFloat79 = -(this.aFloat73 * local6.aFloat69 + local6.aFloat75 * this.aFloat74 + local6.aFloat79 * this.aFloat78);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFBF)F")
	public float method3242(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat78 * arg0 + arg1 * this.aFloat73 + arg2 * this.aFloat74 + this.aFloat79;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[F)[F")
	public float[] method3243(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat71;
		arg0[7] = this.aFloat69;
		arg0[2] = this.aFloat70;
		arg0[1] = this.aFloat76;
		arg0[4] = this.aFloat72;
		arg0[0] = this.aFloat68;
		arg0[5] = this.aFloat77;
		arg0[3] = this.aFloat75;
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	@Override
	public void method6707(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat72;
		@Pc(21) float local21 = this.aFloat77;
		@Pc(24) float local24 = this.aFloat71;
		@Pc(27) float local27 = this.aFloat69;
		this.aFloat72 = local9 * local18 - this.aFloat74 * local15;
		this.aFloat74 = this.aFloat74 * local9 + local18 * local15;
		this.aFloat77 = local9 * local21 - this.aFloat73 * local15;
		this.aFloat71 = local9 * local24 - local15 * this.aFloat78;
		this.aFloat73 = local9 * this.aFloat73 + local21 * local15;
		this.aFloat69 = local9 * local27 - local15 * this.aFloat79;
		this.aFloat78 = local9 * this.aFloat78 + local15 * local24;
		this.aFloat79 = local9 * this.aFloat79 + local27 * local15;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		this.aFloat68 = 1.0F;
		this.aFloat77 = this.aFloat78 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat73 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat76 = this.aFloat70 = this.aFloat75 = this.aFloat72 = this.aFloat69 = this.aFloat74 = this.aFloat79 = 0.0F;
		this.aFloat71 = -this.aFloat73;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!pda;Lclient!pda;)V")
	public void method3244(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(6) Class51_Sub2 local6 = (Class51_Sub2) arg0;
		@Pc(9) Class51_Sub2 local9 = (Class51_Sub2) arg1;
		this.aFloat68 = local9.aFloat74 * local6.aFloat70 + local9.aFloat68 * local6.aFloat68 + local6.aFloat76 * local9.aFloat72;
		this.aFloat72 = local9.aFloat74 * local6.aFloat71 + local9.aFloat72 * local6.aFloat77 + local9.aFloat68 * local6.aFloat72;
		this.aFloat76 = local6.aFloat70 * local9.aFloat73 + local9.aFloat77 * local6.aFloat76 + local9.aFloat76 * local6.aFloat68;
		this.aFloat74 = local9.aFloat74 * local6.aFloat78 + local9.aFloat68 * local6.aFloat74 + local6.aFloat73 * local9.aFloat72;
		this.aFloat77 = local9.aFloat73 * local6.aFloat71 + local6.aFloat72 * local9.aFloat76 + local9.aFloat77 * local6.aFloat77;
		this.aFloat73 = local9.aFloat77 * local6.aFloat73 + local6.aFloat74 * local9.aFloat76 + local6.aFloat78 * local9.aFloat73;
		this.aFloat70 = local6.aFloat68 * local9.aFloat70 + local6.aFloat76 * local9.aFloat71 + local6.aFloat70 * local9.aFloat78;
		this.aFloat71 = local9.aFloat78 * local6.aFloat71 + local6.aFloat77 * local9.aFloat71 + local6.aFloat72 * local9.aFloat70;
		this.aFloat75 = local6.aFloat75 + local6.aFloat70 * local9.aFloat79 + local9.aFloat75 * local6.aFloat68 + local9.aFloat69 * local6.aFloat76;
		this.aFloat78 = local6.aFloat73 * local9.aFloat71 + local9.aFloat70 * local6.aFloat74 + local6.aFloat78 * local9.aFloat78;
		this.aFloat69 = local9.aFloat69 * local6.aFloat77 + local6.aFloat72 * local9.aFloat75 + local6.aFloat71 * local9.aFloat79 + local6.aFloat69;
		this.aFloat79 = local6.aFloat79 + local9.aFloat75 * local6.aFloat74 + local6.aFloat73 * local9.aFloat69 + local9.aFloat79 * local6.aFloat78;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!pda;B)V")
	public void method3245(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub2 local6 = (Class51_Sub2) arg0;
		this.aFloat74 = local6.aFloat74;
		this.aFloat71 = local6.aFloat71;
		this.aFloat79 = 0.0F;
		this.aFloat76 = local6.aFloat76;
		this.aFloat69 = 0.0F;
		this.aFloat73 = local6.aFloat73;
		this.aFloat68 = local6.aFloat68;
		this.aFloat78 = local6.aFloat78;
		this.aFloat70 = local6.aFloat70;
		this.aFloat75 = 0.0F;
		this.aFloat72 = local6.aFloat72;
		this.aFloat77 = local6.aFloat77;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([FI)[F")
	public float[] method3246(@OriginalArg(0) float[] arg0) {
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[9] = this.aFloat73;
		arg0[8] = this.aFloat74;
		arg0[5] = this.aFloat77;
		arg0[6] = this.aFloat71;
		arg0[2] = this.aFloat70;
		arg0[0] = this.aFloat68;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[15] = 0.0F;
		arg0[10] = this.aFloat78;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat76;
		arg0[4] = this.aFloat72;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6704(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub2 local6 = (Class51_Sub2) arg0;
		this.aFloat74 = local6.aFloat74;
		this.aFloat75 = local6.aFloat75;
		this.aFloat78 = local6.aFloat78;
		this.aFloat70 = local6.aFloat70;
		this.aFloat73 = local6.aFloat73;
		this.aFloat76 = local6.aFloat76;
		this.aFloat69 = local6.aFloat69;
		this.aFloat68 = local6.aFloat68;
		this.aFloat72 = local6.aFloat72;
		this.aFloat71 = local6.aFloat71;
		this.aFloat79 = local6.aFloat79;
		this.aFloat77 = local6.aFloat77;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IFFF)V")
	public void method3247(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat68 = arg0;
		this.aFloat76 = 0.0F;
		this.aFloat72 = 0.0F;
		this.aFloat71 = 0.0F;
		this.aFloat77 = arg1;
		this.aFloat75 = 0.0F;
		this.aFloat69 = 0.0F;
		this.aFloat73 = 0.0F;
		this.aFloat70 = 0.0F;
		this.aFloat74 = 0.0F;
		this.aFloat78 = arg2;
		this.aFloat79 = 0.0F;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFFB)F")
	public float method3249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat70 * arg2 + arg1 * this.aFloat68 + this.aFloat76 * arg0 + this.aFloat75;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(FFFB)V")
	public void method3250(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat79 = arg2;
		this.aFloat68 = this.aFloat77 = this.aFloat78 = 1.0F;
		this.aFloat72 = this.aFloat74 = this.aFloat76 = this.aFloat73 = this.aFloat70 = this.aFloat71 = 0.0F;
		this.aFloat75 = arg0;
		this.aFloat69 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FF[FBFF)V")
	public void method3251(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[2] = arg1 * this.aFloat74 + arg3 * this.aFloat73 + this.aFloat78 * arg4;
		@Pc(43) float local43;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(35) float local35;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local35 = -arg0 / arg1;
			local43 = this.aFloat68 * local35 + this.aFloat75;
			local51 = local35 * this.aFloat72 + this.aFloat69;
			local59 = local35 * this.aFloat74 + this.aFloat79;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg0 / arg3;
			local43 = this.aFloat76 * local35 + this.aFloat75;
			local51 = local35 * this.aFloat77 + this.aFloat69;
			local59 = this.aFloat79 + local35 * this.aFloat73;
		} else {
			local35 = -arg0 / arg4;
			local59 = this.aFloat78 * local35 + this.aFloat79;
			local43 = this.aFloat70 * local35 + this.aFloat75;
			local51 = this.aFloat71 * local35 + this.aFloat69;
		}
		arg2[1] = arg1 * this.aFloat72 + arg3 * this.aFloat77 + this.aFloat71 * arg4;
		arg2[0] = this.aFloat70 * arg4 + arg1 * this.aFloat68 + arg3 * this.aFloat76;
		arg2[3] = -(local51 * arg2[1] + arg2[0] * local43 + arg2[2] * local59);
	}
}
