import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class132_Sub2 extends Class132 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class132_Sub2() {
		this.method3978();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	@Override
	public void method3980(@OriginalArg(0) int arg0) {
		this.aFloat82 = 1.0F;
		this.aFloat80 = this.aFloat73 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat75 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat78 = -this.aFloat75;
		this.aFloat74 = this.aFloat81 = this.aFloat72 = this.aFloat77 = this.aFloat76 = this.aFloat79 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat72 + (float) arg1 * this.aFloat74 + this.aFloat82 * (float) arg0 + this.aFloat81 * (float) arg2);
		arg3[1] = (int) (this.aFloat76 + this.aFloat77 * (float) arg0 + (float) arg1 * this.aFloat80 + (float) arg2 * this.aFloat78);
		arg3[2] = (int) (this.aFloat71 + (float) arg2 * this.aFloat73 + (float) arg0 * this.aFloat79 + (float) arg1 * this.aFloat75);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method3982(@OriginalArg(0) Class132 arg0) {
		@Pc(6) Class132_Sub2 local6 = (Class132_Sub2) arg0;
		this.aFloat80 = local6.aFloat80;
		this.aFloat71 = local6.aFloat71;
		this.aFloat76 = local6.aFloat76;
		this.aFloat82 = local6.aFloat82;
		this.aFloat78 = local6.aFloat78;
		this.aFloat74 = local6.aFloat74;
		this.aFloat72 = local6.aFloat72;
		this.aFloat81 = local6.aFloat81;
		this.aFloat77 = local6.aFloat77;
		this.aFloat75 = local6.aFloat75;
		this.aFloat73 = local6.aFloat73;
		this.aFloat79 = local6.aFloat79;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([I)V")
	@Override
	public void method3989(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat72;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat76;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat71;
		arg0[2] = (int) (this.aFloat73 * local29 + this.aFloat81 * local11 + this.aFloat78 * local20);
		arg0[1] = (int) (this.aFloat75 * local29 + this.aFloat80 * local20 + local11 * this.aFloat74);
		arg0[0] = (int) (local11 * this.aFloat82 + local20 * this.aFloat77 + local29 * this.aFloat79);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ql;I)V")
	public void method3992(@OriginalArg(0) Class132 arg0) {
		@Pc(6) Class132_Sub2 local6 = (Class132_Sub2) arg0;
		this.aFloat82 = local6.aFloat82;
		this.aFloat81 = local6.aFloat79;
		this.aFloat74 = local6.aFloat77;
		this.aFloat80 = local6.aFloat80;
		this.aFloat79 = local6.aFloat81;
		this.aFloat77 = local6.aFloat74;
		this.aFloat78 = local6.aFloat75;
		this.aFloat73 = local6.aFloat73;
		this.aFloat72 = -(local6.aFloat76 * this.aFloat74 + local6.aFloat72 * this.aFloat82 + this.aFloat81 * local6.aFloat71);
		this.aFloat75 = local6.aFloat78;
		this.aFloat76 = -(this.aFloat80 * local6.aFloat76 + local6.aFloat72 * this.aFloat77 + local6.aFloat71 * this.aFloat78);
		this.aFloat71 = -(local6.aFloat71 * this.aFloat73 + local6.aFloat72 * this.aFloat79 + local6.aFloat76 * this.aFloat75);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat81 * (float) arg2 + (float) arg0 * this.aFloat82 + this.aFloat74 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat78 + (float) arg1 * this.aFloat80 + (float) arg0 * this.aFloat77);
		arg3[2] = (int) ((float) arg2 * this.aFloat73 + (float) arg0 * this.aFloat79 + (float) arg1 * this.aFloat75);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)[F")
	public float[] method3993() {
		Static417.aFloatArray32[8] = this.aFloat81;
		Static417.aFloatArray32[4] = this.aFloat74;
		Static417.aFloatArray32[14] = 0.0F;
		Static417.aFloatArray32[6] = this.aFloat75;
		Static417.aFloatArray32[12] = 0.0F;
		Static417.aFloatArray32[13] = 0.0F;
		Static417.aFloatArray32[10] = this.aFloat73;
		Static417.aFloatArray32[9] = this.aFloat78;
		Static417.aFloatArray32[5] = this.aFloat80;
		Static417.aFloatArray32[0] = this.aFloat82;
		Static417.aFloatArray32[1] = this.aFloat77;
		Static417.aFloatArray32[2] = this.aFloat79;
		return Static417.aFloatArray32;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub2_Sub28.aFloatArray23[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub2_Sub28.aFloatArray22[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub2_Sub28.aFloatArray23[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub2_Sub28.aFloatArray22[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub2_Sub28.aFloatArray23[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub2_Sub28.aFloatArray22[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat82 = local21 * local33 + local47 * local27;
		this.aFloat79 = local27 * local9;
		this.aFloat73 = local9 * local21;
		this.aFloat78 = local21 * local43 + local27 * local39;
		this.aFloat81 = local21 * local47 + local33 * -local27;
		this.aFloat80 = local33 * local9;
		this.aFloat74 = local9 * local39;
		this.aFloat75 = -local15;
		this.aFloat77 = -local21 * local39 + local43 * local27;
		this.aFloat72 = -((float) arg2 * this.aFloat81) - this.aFloat74 * (float) arg1 + (float) -arg0 * this.aFloat82;
		this.aFloat76 = (float) -arg0 * this.aFloat77 - this.aFloat80 * (float) arg1 - this.aFloat78 * (float) arg2;
		this.aFloat71 = -((float) arg2 * this.aFloat73) - (float) arg1 * this.aFloat75 + this.aFloat79 * (float) -arg0;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)[F")
	public float[] method3994() {
		Static417.aFloatArray32[13] = this.aFloat76;
		Static417.aFloatArray32[1] = this.aFloat77;
		Static417.aFloatArray32[8] = this.aFloat81;
		Static417.aFloatArray32[14] = this.aFloat71;
		Static417.aFloatArray32[0] = this.aFloat82;
		Static417.aFloatArray32[4] = this.aFloat74;
		Static417.aFloatArray32[5] = this.aFloat80;
		Static417.aFloatArray32[6] = this.aFloat75;
		Static417.aFloatArray32[9] = this.aFloat78;
		Static417.aFloatArray32[12] = this.aFloat72;
		Static417.aFloatArray32[2] = this.aFloat79;
		Static417.aFloatArray32[10] = this.aFloat73;
		return Static417.aFloatArray32;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	public void method3976(@OriginalArg(0) int arg0) {
		this.aFloat80 = 1.0F;
		this.aFloat82 = this.aFloat73 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat81 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat74 = this.aFloat72 = this.aFloat77 = this.aFloat78 = this.aFloat76 = this.aFloat75 = this.aFloat71 = 0.0F;
		this.aFloat79 = -this.aFloat81;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	@Override
	public void method3978() {
		this.aFloat82 = this.aFloat80 = this.aFloat73 = 1.0F;
		this.aFloat77 = this.aFloat79 = this.aFloat74 = this.aFloat75 = this.aFloat81 = this.aFloat78 = this.aFloat72 = this.aFloat76 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	@Override
	public void method3987(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat82;
		@Pc(21) float local21 = this.aFloat74;
		@Pc(24) float local24 = this.aFloat81;
		@Pc(27) float local27 = this.aFloat72;
		this.aFloat82 = local9 * local18 + local15 * this.aFloat79;
		this.aFloat74 = this.aFloat75 * local15 + local21 * local9;
		this.aFloat79 = this.aFloat79 * local9 - local18 * local15;
		this.aFloat81 = this.aFloat73 * local15 + local9 * local24;
		this.aFloat75 = local9 * this.aFloat75 - local15 * local21;
		this.aFloat72 = local9 * local27 + this.aFloat71 * local15;
		this.aFloat73 = this.aFloat73 * local9 - local24 * local15;
		this.aFloat71 = local9 * this.aFloat71 - local27 * local15;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	@Override
	public void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat76 = arg1;
		this.aFloat82 = this.aFloat80 = this.aFloat73 = 1.0F;
		this.aFloat71 = arg2;
		this.aFloat72 = arg0;
		this.aFloat77 = this.aFloat79 = this.aFloat74 = this.aFloat75 = this.aFloat81 = this.aFloat78 = 0.0F;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	@Override
	public void method3983(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat77;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat78;
		this.aFloat77 = local18 * local9 - this.aFloat79 * local15;
		@Pc(38) float local38 = this.aFloat76;
		this.aFloat79 = this.aFloat79 * local9 + local18 * local15;
		this.aFloat80 = local9 * local21 - local15 * this.aFloat75;
		this.aFloat78 = local9 * local24 - this.aFloat73 * local15;
		this.aFloat75 = local15 * local21 + this.aFloat75 * local9;
		this.aFloat73 = local15 * local24 + this.aFloat73 * local9;
		this.aFloat76 = local38 * local9 - local15 * this.aFloat71;
		this.aFloat71 = local15 * local38 + local9 * this.aFloat71;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat72 += arg0;
		this.aFloat76 += arg1;
		this.aFloat71 += arg2;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZFIFIF)V")
	public void method3997(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat82 = arg2;
			this.aFloat73 = 1.0F;
			this.aFloat80 = arg4;
			this.aFloat77 = this.aFloat79 = this.aFloat74 = this.aFloat75 = this.aFloat81 = this.aFloat78 = 0.0F;
		} else {
			@Pc(38) float local38 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
			@Pc(44) float local44 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
			this.aFloat79 = this.aFloat75 = this.aFloat81 = this.aFloat78 = 0.0F;
			this.aFloat73 = 1.0F;
			this.aFloat77 = local44 * (float) arg2;
			this.aFloat74 = -local44 * (float) arg4;
			this.aFloat80 = local38 * (float) arg4;
			this.aFloat82 = local38 * (float) arg2;
		}
		this.aFloat71 = arg5;
		this.aFloat72 = arg3;
		this.aFloat76 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()Lclient!ql;")
	public Class132 method3998() {
		@Pc(7) Class132_Sub2 local7 = new Class132_Sub2();
		local7.aFloat76 = this.aFloat76;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat72 = this.aFloat72;
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	@Override
	public void method3979(@OriginalArg(0) int arg0) {
		this.aFloat73 = 1.0F;
		this.aFloat82 = this.aFloat80 = Class6_Sub2_Sub28.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat77 = Class6_Sub2_Sub28.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat74 = -this.aFloat77;
		this.aFloat81 = this.aFloat72 = this.aFloat78 = this.aFloat76 = this.aFloat79 = this.aFloat75 = this.aFloat71 = 0.0F;
	}
}
