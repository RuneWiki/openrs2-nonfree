import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class33_Sub2() {
		this.xa();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat86 + this.aFloat84 * (float) arg0 + this.aFloat83 * (float) arg1 + (float) arg2 * this.aFloat77);
		arg3[0] = (int) (this.aFloat79 + this.aFloat82 * (float) arg1 + this.aFloat81 * (float) arg0 + this.aFloat78 * (float) arg2);
		arg3[1] = (int) (this.aFloat85 + (float) arg2 * this.aFloat88 + (float) arg1 * this.aFloat87 + this.aFloat80 * (float) arg0);
	}

	@OriginalMember(owner = "client!qg", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aFloat80 = this.aFloat84 = this.aFloat82 = this.aFloat83 = this.aFloat78 = this.aFloat88 = this.aFloat79 = this.aFloat85 = this.aFloat86 = 0.0F;
		this.aFloat81 = this.aFloat87 = this.aFloat77 = 1.0F;
	}

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat79;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat85;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat86;
		arg0[0] = (int) (local19 * this.aFloat80 + this.aFloat81 * local11 + local27 * this.aFloat84);
		arg0[2] = (int) (this.aFloat77 * local27 + this.aFloat78 * local11 + local19 * this.aFloat88);
		arg0[1] = (int) (this.aFloat83 * local27 + local19 * this.aFloat87 + this.aFloat82 * local11);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4612() {
		@Pc(7) Class33_Sub2 local7 = new Class33_Sub2();
		local7.aFloat86 = this.aFloat86;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat81 = this.aFloat81;
		return local7;
	}

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.aFloat81 = 1.0F;
		this.aFloat87 = this.aFloat77 = Class17_Sub9.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat83 = Class17_Sub9.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat88 = -this.aFloat83;
		this.aFloat82 = this.aFloat78 = this.aFloat79 = this.aFloat80 = this.aFloat85 = this.aFloat84 = this.aFloat86 = 0.0F;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)[F")
	public float[] method4615() {
		Static244.aFloatArray15[0] = this.aFloat81;
		Static244.aFloatArray15[13] = 0.0F;
		Static244.aFloatArray15[12] = 0.0F;
		Static244.aFloatArray15[2] = this.aFloat84;
		Static244.aFloatArray15[10] = this.aFloat77;
		Static244.aFloatArray15[1] = this.aFloat80;
		Static244.aFloatArray15[5] = this.aFloat87;
		Static244.aFloatArray15[4] = this.aFloat82;
		Static244.aFloatArray15[8] = this.aFloat78;
		Static244.aFloatArray15[14] = 0.0F;
		Static244.aFloatArray15[6] = this.aFloat83;
		Static244.aFloatArray15[9] = this.aFloat88;
		return Static244.aFloatArray15;
	}

	@OriginalMember(owner = "client!qg", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat87 = 1.0F;
		this.aFloat81 = this.aFloat77 = Class17_Sub9.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat78 = Class17_Sub9.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat84 = -this.aFloat78;
		this.aFloat82 = this.aFloat79 = this.aFloat80 = this.aFloat88 = this.aFloat85 = this.aFloat83 = this.aFloat86 = 0.0F;
	}

	@OriginalMember(owner = "client!qg", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class17_Sub9.aFloatArray31[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class17_Sub9.aFloatArray30[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat80;
		@Pc(21) float local21 = this.aFloat87;
		@Pc(24) float local24 = this.aFloat88;
		this.aFloat80 = local18 * local9 - local15 * this.aFloat84;
		@Pc(38) float local38 = this.aFloat85;
		this.aFloat84 = local18 * local15 + local9 * this.aFloat84;
		this.aFloat87 = local9 * local21 - this.aFloat83 * local15;
		this.aFloat83 = this.aFloat83 * local9 + local15 * local21;
		this.aFloat88 = local9 * local24 - local15 * this.aFloat77;
		this.aFloat77 = local24 * local15 + local9 * this.aFloat77;
		this.aFloat85 = local9 * local38 - this.aFloat86 * local15;
		this.aFloat86 = local15 * local38 + local9 * this.aFloat86;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BFFFIII)V")
	public void method4618(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat81 = arg4;
			this.aFloat77 = 1.0F;
			this.aFloat87 = arg5;
			this.aFloat80 = this.aFloat84 = this.aFloat82 = this.aFloat83 = this.aFloat78 = this.aFloat88 = 0.0F;
		} else {
			@Pc(38) float local38 = Class17_Sub9.aFloatArray31[arg3 & 0x3FFF];
			@Pc(44) float local44 = Class17_Sub9.aFloatArray30[arg3 & 0x3FFF];
			this.aFloat77 = 1.0F;
			this.aFloat80 = local44 * (float) arg4;
			this.aFloat87 = (float) arg5 * local38;
			this.aFloat84 = this.aFloat83 = this.aFloat78 = this.aFloat88 = 0.0F;
			this.aFloat81 = local38 * (float) arg4;
			this.aFloat82 = (float) arg5 * -local44;
		}
		this.aFloat86 = arg2;
		this.aFloat85 = arg1;
		this.aFloat79 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat81 = this.aFloat87 = Class17_Sub9.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat80 = Class17_Sub9.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat82 = -this.aFloat80;
		this.aFloat78 = this.aFloat79 = this.aFloat88 = this.aFloat85 = this.aFloat84 = this.aFloat83 = this.aFloat86 = 0.0F;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat79 += arg0;
		this.aFloat85 += arg1;
		this.aFloat86 += arg2;
	}

	@OriginalMember(owner = "client!qg", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class33 arg0) {
		@Pc(6) Class33_Sub2 local6 = (Class33_Sub2) arg0;
		this.aFloat88 = local6.aFloat88;
		this.aFloat81 = local6.aFloat81;
		this.aFloat83 = local6.aFloat83;
		this.aFloat85 = local6.aFloat85;
		this.aFloat86 = local6.aFloat86;
		this.aFloat77 = local6.aFloat77;
		this.aFloat78 = local6.aFloat78;
		this.aFloat79 = local6.aFloat79;
		this.aFloat82 = local6.aFloat82;
		this.aFloat87 = local6.aFloat87;
		this.aFloat84 = local6.aFloat84;
		this.aFloat80 = local6.aFloat80;
	}

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat83 + (float) arg0 * this.aFloat84 + this.aFloat77 * (float) arg2);
		arg3[1] = (int) ((float) arg2 * this.aFloat88 + this.aFloat80 * (float) arg0 + (float) arg1 * this.aFloat87);
		arg3[0] = (int) ((float) arg1 * this.aFloat82 + this.aFloat81 * (float) arg0 + this.aFloat78 * (float) arg2);
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat79 = arg0;
		this.aFloat86 = arg2;
		this.aFloat81 = this.aFloat87 = this.aFloat77 = 1.0F;
		this.aFloat80 = this.aFloat84 = this.aFloat82 = this.aFloat83 = this.aFloat78 = this.aFloat88 = 0.0F;
		this.aFloat85 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class17_Sub9.aFloatArray31[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class17_Sub9.aFloatArray30[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat78;
		@Pc(27) float local27 = this.aFloat79;
		this.aFloat81 = local9 * local18 + this.aFloat84 * local15;
		this.aFloat82 = local15 * this.aFloat83 + local21 * local9;
		this.aFloat84 = local9 * this.aFloat84 - local15 * local18;
		this.aFloat78 = local24 * local9 + this.aFloat77 * local15;
		this.aFloat83 = this.aFloat83 * local9 - local15 * local21;
		this.aFloat79 = local15 * this.aFloat86 + local9 * local27;
		this.aFloat77 = local9 * this.aFloat77 - local24 * local15;
		this.aFloat86 = local9 * this.aFloat86 - local27 * local15;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)[F")
	public float[] method4621() {
		Static244.aFloatArray15[4] = this.aFloat82;
		Static244.aFloatArray15[14] = this.aFloat86;
		Static244.aFloatArray15[8] = this.aFloat78;
		Static244.aFloatArray15[13] = this.aFloat85;
		Static244.aFloatArray15[10] = this.aFloat77;
		Static244.aFloatArray15[6] = this.aFloat83;
		Static244.aFloatArray15[5] = this.aFloat87;
		Static244.aFloatArray15[9] = this.aFloat88;
		Static244.aFloatArray15[1] = this.aFloat80;
		Static244.aFloatArray15[0] = this.aFloat81;
		Static244.aFloatArray15[12] = this.aFloat79;
		Static244.aFloatArray15[2] = this.aFloat84;
		return Static244.aFloatArray15;
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class17_Sub9.aFloatArray31[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class17_Sub9.aFloatArray30[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class17_Sub9.aFloatArray31[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class17_Sub9.aFloatArray30[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class17_Sub9.aFloatArray31[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class17_Sub9.aFloatArray30[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat82 = local39 * local9;
		this.aFloat88 = local21 * local43 + local27 * local39;
		this.aFloat87 = local33 * local9;
		this.aFloat81 = local47 * local27 + local33 * local21;
		this.aFloat83 = -local15;
		this.aFloat80 = local43 * local27 + -local21 * local39;
		this.aFloat78 = local33 * -local27 + local47 * local21;
		this.aFloat84 = local27 * local9;
		this.aFloat77 = local9 * local21;
		this.aFloat86 = -((float) arg2 * this.aFloat77) - this.aFloat83 * (float) arg1 + (float) -arg0 * this.aFloat84;
		this.aFloat79 = (float) -arg0 * this.aFloat81 - (float) arg1 * this.aFloat82 - this.aFloat78 * (float) arg2;
		this.aFloat85 = (float) -arg0 * this.aFloat80 - this.aFloat87 * (float) arg1 - this.aFloat88 * (float) arg2;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!c;)V")
	public void method4622(@OriginalArg(1) Class33 arg0) {
		@Pc(6) Class33_Sub2 local6 = (Class33_Sub2) arg0;
		this.aFloat81 = local6.aFloat81;
		this.aFloat78 = local6.aFloat84;
		this.aFloat82 = local6.aFloat80;
		this.aFloat87 = local6.aFloat87;
		this.aFloat88 = local6.aFloat83;
		this.aFloat84 = local6.aFloat78;
		this.aFloat80 = local6.aFloat82;
		this.aFloat77 = local6.aFloat77;
		this.aFloat83 = local6.aFloat88;
		this.aFloat79 = -(this.aFloat82 * local6.aFloat85 + this.aFloat81 * local6.aFloat79 + this.aFloat78 * local6.aFloat86);
		this.aFloat85 = -(local6.aFloat79 * this.aFloat80 + local6.aFloat85 * this.aFloat87 + local6.aFloat86 * this.aFloat88);
		this.aFloat86 = -(this.aFloat77 * local6.aFloat86 + local6.aFloat79 * this.aFloat84 + this.aFloat83 * local6.aFloat85);
	}
}
