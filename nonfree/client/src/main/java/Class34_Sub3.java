import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!km", name = "Y", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!km", name = "ab", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class34_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public void method3753() {
		this.aFloat70 = -this.aFloat70;
		this.aFloat69 = -this.aFloat69;
		this.aFloat72 = -this.aFloat72;
		this.aFloat76 = -this.aFloat76;
		this.aFloat74 = -this.aFloat74;
		this.aFloat81 = -this.aFloat81;
		this.aFloat78 = -this.aFloat78;
		this.aFloat75 = -this.aFloat75;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFFI)F")
	public float method3754(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat72 * arg1 + arg0 * this.aFloat81 + arg2 * this.aFloat78 + this.aFloat70;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B[F)[F")
	public float[] method3755(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat76;
		arg0[5] = this.aFloat78;
		arg0[1] = this.aFloat80;
		arg0[8] = this.aFloat75;
		arg0[11] = this.aFloat74;
		arg0[3] = this.aFloat73;
		arg0[9] = this.aFloat69;
		arg0[2] = this.aFloat71;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat77;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[7] = this.aFloat70;
		arg0[4] = this.aFloat81;
		arg0[6] = this.aFloat72;
		return arg0;
	}

	@OriginalMember(owner = "client!km", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub1_Sub1.aFloatArray15[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub1.aFloatArray16[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat77;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat71;
		this.aFloat77 = local18 * local9 + this.aFloat75 * local15;
		@Pc(37) float local37 = this.aFloat73;
		this.aFloat75 = local9 * this.aFloat75 - local18 * local15;
		this.aFloat80 = local9 * local21 + this.aFloat69 * local15;
		this.aFloat69 = this.aFloat69 * local9 - local21 * local15;
		this.aFloat71 = local24 * local9 + local15 * this.aFloat76;
		this.aFloat76 = this.aFloat76 * local9 - local24 * local15;
		this.aFloat73 = this.aFloat74 * local15 + local9 * local37;
		this.aFloat74 = local9 * this.aFloat74 - local37 * local15;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!q;I)V")
	public void method3756(@OriginalArg(0) Class34 arg0) {
		@Pc(16) Class34_Sub3 local16 = (Class34_Sub3) arg0;
		this.aFloat73 = 0.0F;
		this.aFloat75 = local16.aFloat75;
		this.aFloat72 = local16.aFloat72;
		this.aFloat71 = local16.aFloat71;
		this.aFloat78 = local16.aFloat78;
		this.aFloat80 = local16.aFloat80;
		this.aFloat77 = local16.aFloat77;
		this.aFloat74 = 0.0F;
		this.aFloat81 = local16.aFloat81;
		this.aFloat69 = local16.aFloat69;
		this.aFloat70 = 0.0F;
		this.aFloat76 = local16.aFloat76;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!q;B)V")
	public void method3757(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub3 local6 = (Class34_Sub3) arg0;
		this.aFloat80 = local6.aFloat81;
		this.aFloat71 = local6.aFloat75;
		this.aFloat77 = local6.aFloat77;
		this.aFloat78 = local6.aFloat78;
		this.aFloat72 = local6.aFloat69;
		this.aFloat81 = local6.aFloat80;
		this.aFloat75 = local6.aFloat71;
		this.aFloat76 = local6.aFloat76;
		this.aFloat69 = local6.aFloat72;
		this.aFloat73 = -(local6.aFloat70 * this.aFloat80 + this.aFloat77 * local6.aFloat73 + this.aFloat71 * local6.aFloat74);
		this.aFloat70 = -(local6.aFloat73 * this.aFloat81 + this.aFloat78 * local6.aFloat70 + this.aFloat72 * local6.aFloat74);
		this.aFloat74 = -(local6.aFloat74 * this.aFloat76 + local6.aFloat70 * this.aFloat69 + local6.aFloat73 * this.aFloat75);
	}

	@OriginalMember(owner = "client!km", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat73;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat70;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat74;
		arg0[1] = (int) (this.aFloat80 * local11 + local19 * this.aFloat78 + local28 * this.aFloat69);
		arg0[0] = (int) (local28 * this.aFloat75 + local11 * this.aFloat77 + this.aFloat81 * local19);
		arg0[2] = (int) (local28 * this.aFloat76 + local11 * this.aFloat71 + this.aFloat72 * local19);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat70 + (float) arg2 * this.aFloat72 + this.aFloat81 * (float) arg0 + (float) arg1 * this.aFloat78);
		arg3[2] = (int) (this.aFloat74 + this.aFloat75 * (float) arg0 + (float) arg1 * this.aFloat69 + this.aFloat76 * (float) arg2);
		arg3[0] = (int) (this.aFloat71 * (float) arg2 + this.aFloat80 * (float) arg1 + this.aFloat77 * (float) arg0 + this.aFloat73);
	}

	@OriginalMember(owner = "client!km", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat76 = 1.0F;
		this.aFloat77 = this.aFloat78 = Class6_Sub1_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat81 = Class6_Sub1_Sub1.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat80 = -this.aFloat81;
		this.aFloat71 = this.aFloat73 = this.aFloat72 = this.aFloat70 = this.aFloat75 = this.aFloat69 = this.aFloat74 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub3 local6 = (Class34_Sub3) arg0;
		this.aFloat76 = local6.aFloat76;
		this.aFloat78 = local6.aFloat78;
		this.aFloat77 = local6.aFloat77;
		this.aFloat72 = local6.aFloat72;
		this.aFloat75 = local6.aFloat75;
		this.aFloat80 = local6.aFloat80;
		this.aFloat70 = local6.aFloat70;
		this.aFloat74 = local6.aFloat74;
		this.aFloat81 = local6.aFloat81;
		this.aFloat73 = local6.aFloat73;
		this.aFloat69 = local6.aFloat69;
		this.aFloat71 = local6.aFloat71;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFFFFBFFFF)V")
	public void method3759(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat75 = arg7;
		this.aFloat77 = arg2;
		this.aFloat76 = arg6;
		this.aFloat72 = arg4;
		this.aFloat69 = arg5;
		this.aFloat81 = arg8;
		this.aFloat78 = arg0;
		this.aFloat73 = 0.0F;
		this.aFloat70 = 0.0F;
		this.aFloat74 = 0.0F;
		this.aFloat80 = arg1;
		this.aFloat71 = arg3;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFBF)V")
	public void method3760(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat72 = 0.0F;
		this.aFloat70 = 0.0F;
		this.aFloat75 = 0.0F;
		this.aFloat80 = 0.0F;
		this.aFloat76 = arg1;
		this.aFloat78 = arg0;
		this.aFloat73 = 0.0F;
		this.aFloat69 = 0.0F;
		this.aFloat74 = 0.0F;
		this.aFloat77 = arg2;
		this.aFloat81 = 0.0F;
		this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method3761(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(6) Class34_Sub3 local6 = (Class34_Sub3) arg0;
		@Pc(9) Class34_Sub3 local9 = (Class34_Sub3) arg1;
		this.aFloat77 = local9.aFloat75 * local6.aFloat71 + local9.aFloat81 * local6.aFloat80 + local6.aFloat77 * local9.aFloat77;
		this.aFloat81 = local9.aFloat75 * local6.aFloat72 + local9.aFloat81 * local6.aFloat78 + local6.aFloat81 * local9.aFloat77;
		this.aFloat80 = local6.aFloat77 * local9.aFloat80 + local9.aFloat78 * local6.aFloat80 + local6.aFloat71 * local9.aFloat69;
		this.aFloat75 = local6.aFloat76 * local9.aFloat75 + local6.aFloat75 * local9.aFloat77 + local9.aFloat81 * local6.aFloat69;
		this.aFloat78 = local6.aFloat72 * local9.aFloat69 + local6.aFloat81 * local9.aFloat80 + local6.aFloat78 * local9.aFloat78;
		this.aFloat69 = local6.aFloat76 * local9.aFloat69 + local9.aFloat78 * local6.aFloat69 + local6.aFloat75 * local9.aFloat80;
		this.aFloat71 = local9.aFloat71 * local6.aFloat77 + local6.aFloat80 * local9.aFloat72 + local9.aFloat76 * local6.aFloat71;
		this.aFloat72 = local9.aFloat71 * local6.aFloat81 + local9.aFloat72 * local6.aFloat78 + local9.aFloat76 * local6.aFloat72;
		this.aFloat76 = local9.aFloat76 * local6.aFloat76 + local6.aFloat69 * local9.aFloat72 + local9.aFloat71 * local6.aFloat75;
		this.aFloat73 = local6.aFloat71 * local9.aFloat74 + local6.aFloat80 * local9.aFloat70 + local9.aFloat73 * local6.aFloat77 + local6.aFloat73;
		this.aFloat70 = local9.aFloat70 * local6.aFloat78 + local6.aFloat81 * local9.aFloat73 + local9.aFloat74 * local6.aFloat72 + local6.aFloat70;
		this.aFloat74 = local6.aFloat76 * local9.aFloat74 + local9.aFloat70 * local6.aFloat69 + local9.aFloat73 * local6.aFloat75 + local6.aFloat74;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([FB)[F")
	public float[] method3762(@OriginalArg(0) float[] arg0) {
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat74;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat81;
		arg0[3] = 0.0F;
		arg0[6] = 0.0F;
		arg0[13] = 0.0F;
		arg0[2] = 0.0F;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat73;
		arg0[4] = this.aFloat80;
		arg0[9] = this.aFloat70;
		arg0[0] = this.aFloat77;
		arg0[5] = this.aFloat78;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7612() {
		@Pc(7) Class34_Sub3 local7 = new Class34_Sub3();
		local7.aFloat81 = this.aFloat81;
		local7.aFloat69 = this.aFloat69;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat72 = this.aFloat72;
		return local7;
	}

	@OriginalMember(owner = "client!km", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat73 = arg0;
		this.aFloat81 = this.aFloat75 = this.aFloat80 = this.aFloat69 = this.aFloat71 = this.aFloat72 = 0.0F;
		this.aFloat77 = this.aFloat78 = this.aFloat76 = 1.0F;
		this.aFloat74 = arg2;
		this.aFloat70 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat81 = this.aFloat75 = this.aFloat80 = this.aFloat69 = this.aFloat71 = this.aFloat72 = this.aFloat73 = this.aFloat70 = this.aFloat74 = 0.0F;
		this.aFloat77 = this.aFloat78 = this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FIFF)V")
	public void method3763(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat77 = this.aFloat78 = this.aFloat76 = 1.0F;
		this.aFloat70 = arg1;
		this.aFloat73 = arg0;
		this.aFloat74 = arg2;
		this.aFloat81 = this.aFloat75 = this.aFloat80 = this.aFloat69 = this.aFloat71 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(FIFF)V")
	public void method3764(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat70 += arg1;
		this.aFloat74 += arg2;
		this.aFloat73 += arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFIFIII)V")
	public void method3765(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			this.aFloat76 = 1.0F;
			this.aFloat81 = this.aFloat75 = this.aFloat80 = this.aFloat69 = this.aFloat71 = this.aFloat72 = 0.0F;
			this.aFloat73 = (float) -arg4 + arg1;
			this.aFloat78 = arg2 * 2;
			this.aFloat74 = arg0;
			this.aFloat70 = (float) -arg2 + arg3;
			this.aFloat77 = arg4 * 2;
			return;
		}
		@Pc(12) float local12 = Class6_Sub1_Sub1.aFloatArray15[arg5 & 0x3FFF];
		@Pc(18) float local18 = Class6_Sub1_Sub1.aFloatArray16[arg5 & 0x3FFF];
		this.aFloat74 = arg0;
		this.aFloat75 = this.aFloat69 = this.aFloat71 = this.aFloat72 = 0.0F;
		this.aFloat80 = (float) arg2 * -2.0F * local18;
		this.aFloat73 = (local18 * 0.5F - local12 * 0.5F) * (float) (arg4 * 2) + arg1;
		this.aFloat70 = arg3 + (-0.5F * local18 - local12 * 0.5F) * (float) (arg2 * 2);
		this.aFloat77 = local12 * 2.0F * (float) arg4;
		this.aFloat78 = (float) arg2 * local12 * 2.0F;
		this.aFloat81 = local18 * 2.0F * (float) arg4;
		this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFB[FF)V")
	public void method3766(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[2] = arg1 * this.aFloat76 + this.aFloat69 * arg0 + arg3 * this.aFloat75;
		arg2[0] = arg0 * this.aFloat80 + this.aFloat77 * arg3 + this.aFloat71 * arg1;
		arg2[1] = arg3 * this.aFloat81 + this.aFloat78 * arg0 + this.aFloat72 * arg1;
	}

	@OriginalMember(owner = "client!km", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub1_Sub1.aFloatArray15[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub1.aFloatArray16[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub1_Sub1.aFloatArray15[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub1_Sub1.aFloatArray16[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub1_Sub1.aFloatArray15[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub1_Sub1.aFloatArray16[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat81 = -local21 * local39 + local27 * local43;
		this.aFloat71 = local47 * local21 + local33 * -local27;
		this.aFloat72 = local43 * local21 + local27 * local39;
		this.aFloat80 = local9 * local39;
		this.aFloat75 = local27 * local9;
		this.aFloat69 = -local15;
		this.aFloat77 = local27 * local47 + local33 * local21;
		this.aFloat78 = local9 * local33;
		this.aFloat76 = local9 * local21;
		this.aFloat73 = -(this.aFloat71 * (float) arg2) - (float) arg1 * this.aFloat80 + this.aFloat77 * (float) -arg0;
		this.aFloat70 = -((float) arg1 * this.aFloat78) + (float) -arg0 * this.aFloat81 - (float) arg2 * this.aFloat72;
		this.aFloat74 = -((float) arg2 * this.aFloat76) + (float) -arg0 * this.aFloat75 - (float) arg1 * this.aFloat69;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([FI)[F")
	public float[] method3768(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat80;
		arg0[7] = this.aFloat70;
		arg0[4] = this.aFloat81;
		arg0[3] = this.aFloat73;
		arg0[2] = this.aFloat71;
		arg0[0] = this.aFloat77;
		arg0[5] = this.aFloat78;
		arg0[6] = this.aFloat72;
		return arg0;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(FFBF)V")
	public void method3769(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat75 *= arg1;
		this.aFloat80 *= arg2;
		this.aFloat81 *= arg0;
		this.aFloat77 *= arg2;
		this.aFloat71 *= arg2;
		this.aFloat70 *= arg0;
		this.aFloat74 *= arg1;
		this.aFloat72 *= arg0;
		this.aFloat78 *= arg0;
		this.aFloat73 *= arg2;
		this.aFloat69 *= arg1;
		this.aFloat76 *= arg1;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Lclient!q;B)V")
	public void method3770(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub3 local6 = (Class34_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat77;
		@Pc(12) float local12 = this.aFloat81;
		@Pc(15) float local15 = this.aFloat80;
		@Pc(18) float local18 = this.aFloat78;
		@Pc(27) float local27 = this.aFloat71;
		@Pc(30) float local30 = this.aFloat72;
		@Pc(33) float local33 = this.aFloat73;
		@Pc(36) float local36 = this.aFloat70;
		this.aFloat77 = local6.aFloat71 * this.aFloat75 + local12 * local6.aFloat80 + local6.aFloat77 * local9;
		this.aFloat81 = local9 * local6.aFloat81 + local12 * local6.aFloat78 + this.aFloat75 * local6.aFloat72;
		this.aFloat75 = this.aFloat75 * local6.aFloat76 + local6.aFloat69 * local12 + local9 * local6.aFloat75;
		this.aFloat80 = local6.aFloat71 * this.aFloat69 + local6.aFloat80 * local18 + local6.aFloat77 * local15;
		this.aFloat78 = local15 * local6.aFloat81 + local18 * local6.aFloat78 + this.aFloat69 * local6.aFloat72;
		this.aFloat69 = local6.aFloat76 * this.aFloat69 + local6.aFloat69 * local18 + local6.aFloat75 * local15;
		this.aFloat71 = local27 * local6.aFloat77 + local6.aFloat80 * local30 + local6.aFloat71 * this.aFloat76;
		this.aFloat72 = local6.aFloat72 * this.aFloat76 + local6.aFloat78 * local30 + local27 * local6.aFloat81;
		this.aFloat76 = this.aFloat76 * local6.aFloat76 + local6.aFloat69 * local30 + local6.aFloat75 * local27;
		this.aFloat70 = local6.aFloat70 + local6.aFloat81 * local33 + local6.aFloat78 * local36 + this.aFloat74 * local6.aFloat72;
		this.aFloat73 = local6.aFloat80 * local36 + local33 * local6.aFloat77 + this.aFloat74 * local6.aFloat71 + local6.aFloat73;
		this.aFloat74 = local6.aFloat76 * this.aFloat74 + local6.aFloat75 * local33 + local6.aFloat69 * local36 + local6.aFloat74;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat77 = this.aFloat76 = Class6_Sub1_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat71 = Class6_Sub1_Sub1.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat80 = this.aFloat73 = this.aFloat81 = this.aFloat72 = this.aFloat70 = this.aFloat69 = this.aFloat74 = 0.0F;
		this.aFloat75 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!km", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat75 + (float) arg1 * this.aFloat69 + this.aFloat76 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat71 + this.aFloat77 * (float) arg0 + this.aFloat80 * (float) arg1);
		arg3[1] = (int) (this.aFloat72 * (float) arg2 + (float) arg1 * this.aFloat78 + this.aFloat81 * (float) arg0);
	}

	@OriginalMember(owner = "client!km", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat73 += arg0;
		this.aFloat74 += arg2;
		this.aFloat70 += arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IF[FFFF)V")
	public void method3771(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(6) float local6 = -arg2;
		@Pc(10) float local10 = local6 * arg3;
		@Pc(14) float local14 = local6 * arg0;
		@Pc(18) float local18 = local6 * arg4;
		@Pc(36) float local36 = local14 * this.aFloat80 + this.aFloat77 * local10 + this.aFloat71 * local18 + this.aFloat73;
		@Pc(54) float local54 = this.aFloat72 * local18 + this.aFloat81 * local10 + local14 * this.aFloat78 + this.aFloat70;
		arg1[2] = this.aFloat69 * arg0 + arg3 * this.aFloat75 + arg4 * this.aFloat76;
		arg1[0] = arg3 * this.aFloat77 + arg0 * this.aFloat80 + arg4 * this.aFloat71;
		@Pc(111) float local111 = this.aFloat76 * local18 + local14 * this.aFloat69 + local10 * this.aFloat75 + this.aFloat74;
		arg1[1] = arg4 * this.aFloat72 + arg0 * this.aFloat78 + arg3 * this.aFloat81;
		arg1[3] = -(local36 * arg1[0] + local54 * arg1[1] + local111 * arg1[2]);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "([FB)[F")
	public float[] method3772(@OriginalArg(0) float[] arg0) {
		arg0[10] = this.aFloat76;
		arg0[6] = this.aFloat69;
		arg0[5] = this.aFloat78;
		arg0[8] = this.aFloat71;
		arg0[15] = 1.0F;
		arg0[9] = this.aFloat72;
		arg0[14] = this.aFloat74;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat70;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat75;
		arg0[0] = this.aFloat77;
		arg0[12] = this.aFloat73;
		arg0[1] = this.aFloat81;
		arg0[4] = this.aFloat80;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IFFF)F")
	public float method3774(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat73 + arg1 * this.aFloat71 + this.aFloat80 * arg2 + this.aFloat77 * arg0;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(IFFF)F")
	public float method3775(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat75 * arg1 + this.aFloat69 * arg2 + this.aFloat76 * arg0 + this.aFloat74;
	}

	@OriginalMember(owner = "client!km", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub1_Sub1.aFloatArray15[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub1_Sub1.aFloatArray16[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat78;
		@Pc(24) float local24 = this.aFloat72;
		this.aFloat81 = local18 * local9 - local15 * this.aFloat75;
		@Pc(38) float local38 = this.aFloat70;
		this.aFloat78 = local9 * local21 - this.aFloat69 * local15;
		this.aFloat75 = this.aFloat75 * local9 + local18 * local15;
		this.aFloat72 = local24 * local9 - local15 * this.aFloat76;
		this.aFloat69 = this.aFloat69 * local9 + local21 * local15;
		this.aFloat70 = local38 * local9 - local15 * this.aFloat74;
		this.aFloat76 = local9 * this.aFloat76 + local15 * local24;
		this.aFloat74 = local9 * this.aFloat74 + local38 * local15;
	}

	@OriginalMember(owner = "client!km", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat78 = this.aFloat76 = Class6_Sub1_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat69 = Class6_Sub1_Sub1.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat80 = this.aFloat71 = this.aFloat73 = this.aFloat81 = this.aFloat70 = this.aFloat75 = this.aFloat74 = 0.0F;
		this.aFloat72 = -this.aFloat69;
	}
}
