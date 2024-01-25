import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!ica", name = "L", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!ica", name = "M", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!ica", name = "O", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!ica", name = "Q", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!ica", name = "S", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!ica", name = "T", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V")
	public Class25_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!ica", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class113.aFloatArray10[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class113.aFloatArray9[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class113.aFloatArray10[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class113.aFloatArray9[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat80 = local27 * local9;
		this.aFloat81 = local27 * local47 + local33 * local21;
		this.aFloat77 = local39 * -local21 + local27 * local43;
		this.aFloat78 = local9 * local21;
		this.aFloat76 = local39 * local9;
		this.aFloat75 = local9 * local33;
		this.aFloat73 = -local15;
		this.aFloat74 = local39 * local27 + local43 * local21;
		this.aFloat82 = -local27 * local33 + local21 * local47;
		this.aFloat79 = -(this.aFloat82 * (float) arg2) - (float) arg1 * this.aFloat76 + this.aFloat81 * (float) -arg0;
		this.aFloat71 = -((float) arg1 * this.aFloat75) + (float) -arg0 * this.aFloat77 - this.aFloat74 * (float) arg2;
		this.aFloat72 = -(this.aFloat78 * (float) arg2) + this.aFloat80 * (float) -arg0 - (float) arg1 * this.aFloat73;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFI)V")
	public void method2696(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat79 = 0.0F;
		this.aFloat76 = 0.0F;
		this.aFloat71 = 0.0F;
		this.aFloat78 = arg1;
		this.aFloat72 = 0.0F;
		this.aFloat75 = arg2;
		this.aFloat81 = arg0;
		this.aFloat82 = 0.0F;
		this.aFloat73 = 0.0F;
		this.aFloat77 = 0.0F;
		this.aFloat80 = 0.0F;
		this.aFloat74 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat81 = this.aFloat75 = this.aFloat78 = 1.0F;
		this.aFloat77 = this.aFloat80 = this.aFloat76 = this.aFloat73 = this.aFloat82 = this.aFloat74 = this.aFloat79 = this.aFloat71 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat74 * (float) arg2 + this.aFloat77 * (float) arg0 + (float) arg1 * this.aFloat75);
		arg3[2] = (int) ((float) arg0 * this.aFloat80 + this.aFloat73 * (float) arg1 + (float) arg2 * this.aFloat78);
		arg3[0] = (int) ((float) arg1 * this.aFloat76 + (float) arg0 * this.aFloat81 + this.aFloat82 * (float) arg2);
	}

	@OriginalMember(owner = "client!ica", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat79;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat71;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat72;
		arg0[0] = (int) (this.aFloat77 * local20 + local12 * this.aFloat81 + local29 * this.aFloat80);
		arg0[1] = (int) (this.aFloat73 * local29 + local20 * this.aFloat75 + this.aFloat76 * local12);
		arg0[2] = (int) (this.aFloat78 * local29 + this.aFloat74 * local20 + local12 * this.aFloat82);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([FI)[F")
	public float[] method2697(@OriginalArg(0) float[] arg0) {
		arg0[11] = this.aFloat72;
		arg0[10] = this.aFloat78;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[2] = this.aFloat82;
		arg0[9] = this.aFloat73;
		arg0[5] = this.aFloat75;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat80;
		arg0[6] = this.aFloat74;
		arg0[1] = this.aFloat76;
		arg0[3] = this.aFloat79;
		arg0[7] = this.aFloat71;
		arg0[0] = this.aFloat81;
		arg0[4] = this.aFloat77;
		return arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IFIIFFI)V")
	public void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat71 = (float) -arg2 + arg3;
			this.aFloat78 = 1.0F;
			this.aFloat75 = arg2 * 2;
			this.aFloat72 = arg4;
			this.aFloat81 = arg5 * 2;
			this.aFloat79 = (float) -arg5 + arg1;
			this.aFloat77 = this.aFloat80 = this.aFloat76 = this.aFloat73 = this.aFloat82 = this.aFloat74 = 0.0F;
			return;
		}
		@Pc(8) float local8 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(14) float local14 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat77 = local14 * 2.0F * (float) arg5;
		this.aFloat76 = -2.0F * local14 * (float) arg2;
		this.aFloat81 = (float) arg5 * local8 * 2.0F;
		this.aFloat72 = arg4;
		this.aFloat71 = arg3 + (local14 * -0.5F - local8 * 0.5F) * (float) (arg2 * 2);
		this.aFloat79 = (float) (arg5 * 2) * (local14 * 0.5F - local8 * 0.5F) + arg1;
		this.aFloat75 = local8 * 2.0F * (float) arg2;
		this.aFloat78 = 1.0F;
		this.aFloat80 = this.aFloat73 = this.aFloat82 = this.aFloat74 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FIFF)V")
	public void method2699(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat79 += arg2;
		this.aFloat72 += arg0;
		this.aFloat71 += arg1;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public void method2700() {
		this.aFloat72 = -this.aFloat72;
		this.aFloat73 = -this.aFloat73;
		this.aFloat77 = -this.aFloat77;
		this.aFloat74 = -this.aFloat74;
		this.aFloat80 = -this.aFloat80;
		this.aFloat75 = -this.aFloat75;
		this.aFloat78 = -this.aFloat78;
		this.aFloat71 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method2701(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		@Pc(6) Class25_Sub2 local6 = (Class25_Sub2) arg0;
		@Pc(9) Class25_Sub2 local9 = (Class25_Sub2) arg1;
		this.aFloat81 = local9.aFloat80 * local6.aFloat82 + local9.aFloat77 * local6.aFloat76 + local9.aFloat81 * local6.aFloat81;
		this.aFloat77 = local6.aFloat74 * local9.aFloat80 + local6.aFloat75 * local9.aFloat77 + local6.aFloat77 * local9.aFloat81;
		this.aFloat80 = local6.aFloat73 * local9.aFloat77 + local9.aFloat81 * local6.aFloat80 + local9.aFloat80 * local6.aFloat78;
		this.aFloat76 = local9.aFloat73 * local6.aFloat82 + local6.aFloat76 * local9.aFloat75 + local9.aFloat76 * local6.aFloat81;
		this.aFloat75 = local9.aFloat73 * local6.aFloat74 + local6.aFloat75 * local9.aFloat75 + local9.aFloat76 * local6.aFloat77;
		this.aFloat82 = local6.aFloat82 * local9.aFloat78 + local6.aFloat76 * local9.aFloat74 + local9.aFloat82 * local6.aFloat81;
		this.aFloat73 = local9.aFloat73 * local6.aFloat78 + local9.aFloat76 * local6.aFloat80 + local9.aFloat75 * local6.aFloat73;
		this.aFloat74 = local9.aFloat74 * local6.aFloat75 + local6.aFloat77 * local9.aFloat82 + local9.aFloat78 * local6.aFloat74;
		this.aFloat79 = local6.aFloat79 + local9.aFloat79 * local6.aFloat81 + local6.aFloat76 * local9.aFloat71 + local9.aFloat72 * local6.aFloat82;
		this.aFloat78 = local9.aFloat74 * local6.aFloat73 + local9.aFloat82 * local6.aFloat80 + local6.aFloat78 * local9.aFloat78;
		this.aFloat71 = local6.aFloat74 * local9.aFloat72 + local9.aFloat79 * local6.aFloat77 + local6.aFloat75 * local9.aFloat71 + local6.aFloat71;
		this.aFloat72 = local6.aFloat72 + local6.aFloat73 * local9.aFloat71 + local9.aFloat79 * local6.aFloat80 + local9.aFloat72 * local6.aFloat78;
	}

	@OriginalMember(owner = "client!ica", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat81 = 1.0F;
		this.aFloat75 = this.aFloat78 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat73 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat74 = -this.aFloat73;
		this.aFloat76 = this.aFloat82 = this.aFloat79 = this.aFloat77 = this.aFloat71 = this.aFloat80 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat79 + this.aFloat82 * (float) arg2 + (float) arg0 * this.aFloat81 + this.aFloat76 * (float) arg1);
		arg3[1] = (int) (this.aFloat71 + this.aFloat74 * (float) arg2 + this.aFloat75 * (float) arg1 + this.aFloat77 * (float) arg0);
		arg3[2] = (int) (this.aFloat78 * (float) arg2 + this.aFloat80 * (float) arg0 + (float) arg1 * this.aFloat73 + this.aFloat72);
	}

	@OriginalMember(owner = "client!ica", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat71 += arg1;
		this.aFloat72 += arg2;
		this.aFloat79 += arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFFFFIF)V")
	public void method2702(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat75 = arg2;
		this.aFloat74 = arg8;
		this.aFloat72 = 0.0F;
		this.aFloat73 = arg0;
		this.aFloat76 = arg4;
		this.aFloat71 = 0.0F;
		this.aFloat81 = arg5;
		this.aFloat82 = arg6;
		this.aFloat79 = 0.0F;
		this.aFloat80 = arg3;
		this.aFloat77 = arg7;
		this.aFloat78 = arg1;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B[FFFF)V")
	public void method2703(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat82 * arg1 + this.aFloat81 * arg3 + this.aFloat76 * arg2;
		arg0[2] = this.aFloat73 * arg2 + arg3 * this.aFloat80 + arg1 * this.aFloat78;
		arg0[1] = this.aFloat75 * arg2 + this.aFloat77 * arg3 + arg1 * this.aFloat74;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class25 method5883() {
		@Pc(7) Class25_Sub2 local7 = new Class25_Sub2();
		local7.aFloat82 = this.aFloat82;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat73 = this.aFloat73;
		return local7;
	}

	@OriginalMember(owner = "client!ica", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat77;
		@Pc(21) float local21 = this.aFloat75;
		@Pc(24) float local24 = this.aFloat74;
		@Pc(27) float local27 = this.aFloat71;
		this.aFloat77 = local9 * local18 - local15 * this.aFloat80;
		this.aFloat80 = local15 * local18 + local9 * this.aFloat80;
		this.aFloat75 = local21 * local9 - local15 * this.aFloat73;
		this.aFloat74 = local24 * local9 - local15 * this.aFloat78;
		this.aFloat73 = local21 * local15 + this.aFloat73 * local9;
		this.aFloat78 = this.aFloat78 * local9 + local24 * local15;
		this.aFloat71 = local27 * local9 - this.aFloat72 * local15;
		this.aFloat72 = this.aFloat72 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat81 = this.aFloat78 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat82 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat80 = -this.aFloat82;
		this.aFloat76 = this.aFloat79 = this.aFloat77 = this.aFloat74 = this.aFloat71 = this.aFloat73 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I[F)[F")
	public float[] method2704(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat82;
		arg0[9] = this.aFloat74;
		arg0[11] = 0.0F;
		arg0[14] = this.aFloat72;
		arg0[10] = this.aFloat78;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat81;
		arg0[13] = this.aFloat71;
		arg0[1] = this.aFloat77;
		arg0[6] = this.aFloat73;
		arg0[4] = this.aFloat76;
		arg0[3] = 0.0F;
		arg0[2] = this.aFloat80;
		arg0[5] = this.aFloat75;
		arg0[12] = this.aFloat79;
		return arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFZF)F")
	public float method2705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * this.aFloat73 + this.aFloat80 * arg1 + this.aFloat78 * arg2 + this.aFloat72;
	}

	@OriginalMember(owner = "client!ica", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat76;
		@Pc(24) float local24 = this.aFloat82;
		this.aFloat81 = local18 * local9 - local15 * this.aFloat77;
		@Pc(38) float local38 = this.aFloat79;
		this.aFloat76 = local21 * local9 - local15 * this.aFloat75;
		this.aFloat77 = this.aFloat77 * local9 + local15 * local18;
		this.aFloat75 = local9 * this.aFloat75 + local21 * local15;
		this.aFloat82 = local24 * local9 - this.aFloat74 * local15;
		this.aFloat79 = local38 * local9 - local15 * this.aFloat71;
		this.aFloat74 = local9 * this.aFloat74 + local24 * local15;
		this.aFloat71 = this.aFloat71 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!q;I)V")
	public void method2706(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub2 local6 = (Class25_Sub2) arg0;
		this.aFloat81 = local6.aFloat81;
		this.aFloat82 = local6.aFloat80;
		this.aFloat76 = local6.aFloat77;
		this.aFloat74 = local6.aFloat73;
		this.aFloat75 = local6.aFloat75;
		this.aFloat80 = local6.aFloat82;
		this.aFloat77 = local6.aFloat76;
		this.aFloat79 = -(local6.aFloat79 * this.aFloat81 + local6.aFloat71 * this.aFloat76 + this.aFloat82 * local6.aFloat72);
		this.aFloat73 = local6.aFloat74;
		this.aFloat78 = local6.aFloat78;
		this.aFloat71 = -(this.aFloat77 * local6.aFloat79 + this.aFloat75 * local6.aFloat71 + this.aFloat74 * local6.aFloat72);
		this.aFloat72 = -(local6.aFloat72 * this.aFloat78 + local6.aFloat79 * this.aFloat80 + local6.aFloat71 * this.aFloat73);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFIF)F")
	public float method2707(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat71 + this.aFloat77 * arg0 + arg1 * this.aFloat75 + arg2 * this.aFloat74;
	}

	@OriginalMember(owner = "client!ica", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub2 local6 = (Class25_Sub2) arg0;
		this.aFloat78 = local6.aFloat78;
		this.aFloat73 = local6.aFloat73;
		this.aFloat74 = local6.aFloat74;
		this.aFloat75 = local6.aFloat75;
		this.aFloat76 = local6.aFloat76;
		this.aFloat77 = local6.aFloat77;
		this.aFloat71 = local6.aFloat71;
		this.aFloat72 = local6.aFloat72;
		this.aFloat80 = local6.aFloat80;
		this.aFloat82 = local6.aFloat82;
		this.aFloat79 = local6.aFloat79;
		this.aFloat81 = local6.aFloat81;
	}

	@OriginalMember(owner = "client!ica", name = "A", descriptor = "(III[I)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat71);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat79);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat72);
		arg3[2] = (int) (this.aFloat78 * (float) local20 + (float) local6 * this.aFloat74 + this.aFloat82 * (float) local13);
		arg3[0] = (int) (this.aFloat80 * (float) local20 + this.aFloat77 * (float) local6 + (float) local13 * this.aFloat81);
		arg3[1] = (int) ((float) local20 * this.aFloat73 + (float) local6 * this.aFloat75 + (float) local13 * this.aFloat76);
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(FFIF)F")
	public float method2708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat79 + this.aFloat76 * arg1 + this.aFloat81 * arg2 + arg0 * this.aFloat82;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I[F)[F")
	public float[] method2709(@OriginalArg(1) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat75;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat76;
		arg0[9] = this.aFloat71;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat77;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat79;
		arg0[2] = 0.0F;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat81;
		arg0[10] = this.aFloat72;
		return arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZLclient!q;)V")
	public void method2710(@OriginalArg(1) Class25 arg0) {
		@Pc(6) Class25_Sub2 local6 = (Class25_Sub2) arg0;
		this.aFloat72 = 0.0F;
		this.aFloat73 = local6.aFloat73;
		this.aFloat82 = local6.aFloat82;
		this.aFloat81 = local6.aFloat81;
		this.aFloat75 = local6.aFloat75;
		this.aFloat74 = local6.aFloat74;
		this.aFloat78 = local6.aFloat78;
		this.aFloat77 = local6.aFloat77;
		this.aFloat76 = local6.aFloat76;
		this.aFloat80 = local6.aFloat80;
		this.aFloat71 = 0.0F;
		this.aFloat79 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!q;)V")
	public void method2712(@OriginalArg(1) Class25 arg0) {
		@Pc(11) Class25_Sub2 local11 = (Class25_Sub2) arg0;
		@Pc(14) float local14 = this.aFloat81;
		@Pc(17) float local17 = this.aFloat77;
		@Pc(20) float local20 = this.aFloat76;
		@Pc(23) float local23 = this.aFloat75;
		@Pc(26) float local26 = this.aFloat82;
		@Pc(29) float local29 = this.aFloat74;
		@Pc(32) float local32 = this.aFloat79;
		@Pc(35) float local35 = this.aFloat71;
		this.aFloat77 = local11.aFloat77 * local14 + local11.aFloat75 * local17 + local11.aFloat74 * this.aFloat80;
		this.aFloat81 = local11.aFloat82 * this.aFloat80 + local11.aFloat76 * local17 + local14 * local11.aFloat81;
		this.aFloat80 = local17 * local11.aFloat73 + local11.aFloat80 * local14 + this.aFloat80 * local11.aFloat78;
		this.aFloat75 = this.aFloat73 * local11.aFloat74 + local11.aFloat75 * local23 + local20 * local11.aFloat77;
		this.aFloat76 = local11.aFloat82 * this.aFloat73 + local11.aFloat76 * local23 + local11.aFloat81 * local20;
		this.aFloat74 = this.aFloat78 * local11.aFloat74 + local11.aFloat75 * local29 + local26 * local11.aFloat77;
		this.aFloat73 = local11.aFloat78 * this.aFloat73 + local11.aFloat80 * local20 + local11.aFloat73 * local23;
		this.aFloat82 = local26 * local11.aFloat81 + local29 * local11.aFloat76 + local11.aFloat82 * this.aFloat78;
		this.aFloat78 = local11.aFloat80 * local26 + local29 * local11.aFloat73 + this.aFloat78 * local11.aFloat78;
		this.aFloat79 = local11.aFloat79 + local35 * local11.aFloat76 + local32 * local11.aFloat81 + local11.aFloat82 * this.aFloat72;
		this.aFloat71 = local11.aFloat77 * local32 + local35 * local11.aFloat75 + local11.aFloat74 * this.aFloat72 + local11.aFloat71;
		this.aFloat72 = local11.aFloat72 + local11.aFloat80 * local32 + local11.aFloat73 * local35 + local11.aFloat78 * this.aFloat72;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([FB)[F")
	public float[] method2713(@OriginalArg(0) float[] arg0) {
		arg0[2] = this.aFloat82;
		arg0[3] = this.aFloat79;
		arg0[4] = this.aFloat77;
		arg0[5] = this.aFloat75;
		arg0[6] = this.aFloat74;
		arg0[0] = this.aFloat81;
		arg0[1] = this.aFloat76;
		arg0[7] = this.aFloat71;
		return arg0;
	}

	@OriginalMember(owner = "client!ica", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat79 = arg0;
		this.aFloat72 = arg2;
		this.aFloat71 = arg1;
		this.aFloat81 = this.aFloat75 = this.aFloat78 = 1.0F;
		this.aFloat77 = this.aFloat80 = this.aFloat76 = this.aFloat73 = this.aFloat82 = this.aFloat74 = 0.0F;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(FFIF)V")
	public void method2714(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat80 *= arg2;
		this.aFloat73 *= arg2;
		this.aFloat75 *= arg0;
		this.aFloat82 *= arg1;
		this.aFloat74 *= arg0;
		this.aFloat71 *= arg0;
		this.aFloat79 *= arg1;
		this.aFloat72 *= arg2;
		this.aFloat76 *= arg1;
		this.aFloat81 *= arg1;
		this.aFloat77 *= arg0;
		this.aFloat78 *= arg2;
	}

	@OriginalMember(owner = "client!ica", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat76;
		@Pc(24) float local24 = this.aFloat82;
		@Pc(27) float local27 = this.aFloat79;
		this.aFloat81 = local18 * local9 + this.aFloat80 * local15;
		this.aFloat80 = this.aFloat80 * local9 - local15 * local18;
		this.aFloat76 = local15 * this.aFloat73 + local21 * local9;
		this.aFloat82 = local9 * local24 + local15 * this.aFloat78;
		this.aFloat73 = local9 * this.aFloat73 - local15 * local21;
		this.aFloat79 = local9 * local27 + local15 * this.aFloat72;
		this.aFloat78 = this.aFloat78 * local9 - local15 * local24;
		this.aFloat72 = this.aFloat72 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I[F)[F")
	public float[] method2715(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat81;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat74;
		arg0[15] = 0.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat78;
		arg0[2] = this.aFloat82;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat73;
		arg0[5] = this.aFloat75;
		arg0[4] = this.aFloat77;
		arg0[8] = this.aFloat80;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat76;
		return arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FF[FIFF)V")
	public void method2716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[1] = arg1 * this.aFloat74 + this.aFloat77 * arg0 + arg4 * this.aFloat75;
		arg2[0] = arg1 * this.aFloat82 + arg4 * this.aFloat76 + arg0 * this.aFloat81;
		@Pc(76) float local76;
		@Pc(68) float local68;
		@Pc(60) float local60;
		@Pc(52) float local52;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local52 = -arg3 / arg0;
			local60 = local52 * this.aFloat80 + this.aFloat72;
			local68 = this.aFloat71 + local52 * this.aFloat77;
			local76 = this.aFloat79 + local52 * this.aFloat81;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local52 = -arg3 / arg4;
			local76 = this.aFloat79 + local52 * this.aFloat76;
			local60 = this.aFloat72 + this.aFloat73 * local52;
			local68 = this.aFloat71 + local52 * this.aFloat75;
		} else {
			local52 = -arg3 / arg1;
			local68 = this.aFloat71 + local52 * this.aFloat74;
			local76 = this.aFloat79 + this.aFloat82 * local52;
			local60 = local52 * this.aFloat78 + this.aFloat72;
		}
		arg2[2] = arg1 * this.aFloat78 + arg0 * this.aFloat80 + arg4 * this.aFloat73;
		arg2[3] = -(arg2[1] * local68 + local76 * arg2[0] + local60 * arg2[2]);
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(FFFI)V")
	public void method2717(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat81 = this.aFloat75 = this.aFloat78 = 1.0F;
		this.aFloat77 = this.aFloat80 = this.aFloat76 = this.aFloat73 = this.aFloat82 = this.aFloat74 = 0.0F;
		this.aFloat71 = arg0;
		this.aFloat79 = arg2;
		this.aFloat72 = arg1;
	}

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat81 = this.aFloat75 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat77 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat76 = -this.aFloat77;
		this.aFloat82 = this.aFloat79 = this.aFloat74 = this.aFloat71 = this.aFloat80 = this.aFloat73 = this.aFloat72 = 0.0F;
	}
}
