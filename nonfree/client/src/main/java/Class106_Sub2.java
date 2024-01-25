import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class106_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!sf", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat80 = 1.0F;
		this.aFloat78 = this.aFloat85 = Class80.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat87 = Class80.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat79 = this.aFloat83 = this.aFloat84 = this.aFloat86 = this.aFloat81 = this.aFloat77 = this.aFloat76 = 0.0F;
		this.aFloat82 = -this.aFloat87;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat83 + this.aFloat78 * (float) arg0 + (float) arg1 * this.aFloat82 + (float) arg2 * this.aFloat79);
		arg3[2] = (int) (this.aFloat77 * (float) arg1 + (float) arg0 * this.aFloat81 + this.aFloat80 * (float) arg2 + this.aFloat76);
		arg3[1] = (int) (this.aFloat86 + (float) arg2 * this.aFloat84 + this.aFloat85 * (float) arg1 + (float) arg0 * this.aFloat87);
	}

	@OriginalMember(owner = "client!sf", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat85 = this.aFloat80 = Class80.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat77 = Class80.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat84 = -this.aFloat77;
		this.aFloat82 = this.aFloat79 = this.aFloat83 = this.aFloat87 = this.aFloat86 = this.aFloat81 = this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method5109(@OriginalArg(0) Class106 arg0) {
		@Pc(6) Class106_Sub2 local6 = (Class106_Sub2) arg0;
		this.aFloat79 = local6.aFloat81;
		this.aFloat78 = local6.aFloat78;
		this.aFloat82 = local6.aFloat87;
		this.aFloat87 = local6.aFloat82;
		this.aFloat85 = local6.aFloat85;
		this.aFloat84 = local6.aFloat77;
		this.aFloat81 = local6.aFloat79;
		this.aFloat83 = -(this.aFloat79 * local6.aFloat76 + local6.aFloat83 * this.aFloat78 + local6.aFloat86 * this.aFloat82);
		this.aFloat80 = local6.aFloat80;
		this.aFloat77 = local6.aFloat84;
		this.aFloat86 = -(this.aFloat85 * local6.aFloat86 + local6.aFloat83 * this.aFloat87 + local6.aFloat76 * this.aFloat84);
		this.aFloat76 = -(this.aFloat80 * local6.aFloat76 + local6.aFloat86 * this.aFloat77 + local6.aFloat83 * this.aFloat81);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class80.aFloatArray19[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class80.aFloatArray18[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat78;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat79;
		@Pc(27) float local27 = this.aFloat83;
		this.aFloat78 = this.aFloat81 * local15 + local18 * local9;
		this.aFloat82 = local21 * local9 + this.aFloat77 * local15;
		this.aFloat81 = local9 * this.aFloat81 - local15 * local18;
		this.aFloat77 = this.aFloat77 * local9 - local15 * local21;
		this.aFloat79 = this.aFloat80 * local15 + local9 * local24;
		this.aFloat80 = this.aFloat80 * local9 - local24 * local15;
		this.aFloat83 = this.aFloat76 * local15 + local27 * local9;
		this.aFloat76 = local9 * this.aFloat76 - local27 * local15;
	}

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat85 * (float) arg1 + (float) arg0 * this.aFloat87 + (float) arg2 * this.aFloat84);
		arg3[0] = (int) (this.aFloat78 * (float) arg0 + this.aFloat82 * (float) arg1 + (float) arg2 * this.aFloat79);
		arg3[2] = (int) ((float) arg2 * this.aFloat80 + (float) arg1 * this.aFloat77 + this.aFloat81 * (float) arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method5103() {
		@Pc(7) Class106_Sub2 local7 = new Class106_Sub2();
		local7.aFloat82 = this.aFloat82;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat76 = this.aFloat76;
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat83;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat86;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat76;
		arg0[0] = (int) (local30 * this.aFloat81 + this.aFloat78 * local12 + local21 * this.aFloat87);
		arg0[1] = (int) (local30 * this.aFloat77 + local21 * this.aFloat85 + this.aFloat82 * local12);
		arg0[2] = (int) (local30 * this.aFloat80 + local12 * this.aFloat79 + this.aFloat84 * local21);
	}

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat85 = 1.0F;
		this.aFloat78 = this.aFloat80 = Class80.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat79 = Class80.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat82 = this.aFloat83 = this.aFloat87 = this.aFloat84 = this.aFloat86 = this.aFloat77 = this.aFloat76 = 0.0F;
		this.aFloat81 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)[F")
	public float[] method5111() {
		Static132.aFloatArray22[2] = this.aFloat81;
		Static132.aFloatArray22[14] = 0.0F;
		Static132.aFloatArray22[0] = this.aFloat78;
		Static132.aFloatArray22[13] = 0.0F;
		Static132.aFloatArray22[9] = this.aFloat84;
		Static132.aFloatArray22[5] = this.aFloat85;
		Static132.aFloatArray22[4] = this.aFloat82;
		Static132.aFloatArray22[12] = 0.0F;
		Static132.aFloatArray22[1] = this.aFloat87;
		Static132.aFloatArray22[6] = this.aFloat77;
		Static132.aFloatArray22[10] = this.aFloat80;
		Static132.aFloatArray22[8] = this.aFloat79;
		return Static132.aFloatArray22;
	}

	@OriginalMember(owner = "client!sf", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class106 arg0) {
		@Pc(6) Class106_Sub2 local6 = (Class106_Sub2) arg0;
		this.aFloat87 = local6.aFloat87;
		this.aFloat79 = local6.aFloat79;
		this.aFloat77 = local6.aFloat77;
		this.aFloat85 = local6.aFloat85;
		this.aFloat84 = local6.aFloat84;
		this.aFloat76 = local6.aFloat76;
		this.aFloat83 = local6.aFloat83;
		this.aFloat80 = local6.aFloat80;
		this.aFloat78 = local6.aFloat78;
		this.aFloat86 = local6.aFloat86;
		this.aFloat81 = local6.aFloat81;
		this.aFloat82 = local6.aFloat82;
	}

	@OriginalMember(owner = "client!sf", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat76 += arg2;
		this.aFloat83 += arg0;
		this.aFloat86 += arg1;
	}

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat78 = this.aFloat85 = this.aFloat80 = 1.0F;
		this.aFloat83 = arg0;
		this.aFloat76 = arg2;
		this.aFloat86 = arg1;
		this.aFloat87 = this.aFloat81 = this.aFloat82 = this.aFloat77 = this.aFloat79 = this.aFloat84 = 0.0F;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FIFIBFI)V")
	public void method5113(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat87 = this.aFloat81 = this.aFloat82 = this.aFloat77 = this.aFloat79 = this.aFloat84 = 0.0F;
			this.aFloat78 = arg1;
			this.aFloat85 = arg3;
			this.aFloat80 = 1.0F;
		} else {
			@Pc(15) float local15 = Class80.aFloatArray19[arg5 & 0x3FFF];
			@Pc(21) float local21 = Class80.aFloatArray18[arg5 & 0x3FFF];
			this.aFloat87 = local21 * (float) arg1;
			this.aFloat82 = (float) arg3 * -local21;
			this.aFloat81 = this.aFloat77 = this.aFloat79 = this.aFloat84 = 0.0F;
			this.aFloat78 = (float) arg1 * local15;
			this.aFloat85 = local15 * (float) arg3;
			this.aFloat80 = 1.0F;
		}
		this.aFloat83 = arg4;
		this.aFloat86 = arg0;
		this.aFloat76 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat87 = this.aFloat81 = this.aFloat82 = this.aFloat77 = this.aFloat79 = this.aFloat84 = this.aFloat83 = this.aFloat86 = this.aFloat76 = 0.0F;
		this.aFloat78 = this.aFloat85 = this.aFloat80 = 1.0F;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)[F")
	public float[] method5114() {
		Static132.aFloatArray22[4] = this.aFloat82;
		Static132.aFloatArray22[13] = this.aFloat86;
		Static132.aFloatArray22[6] = this.aFloat77;
		Static132.aFloatArray22[5] = this.aFloat85;
		Static132.aFloatArray22[0] = this.aFloat78;
		Static132.aFloatArray22[12] = this.aFloat83;
		Static132.aFloatArray22[8] = this.aFloat79;
		Static132.aFloatArray22[1] = this.aFloat87;
		Static132.aFloatArray22[14] = this.aFloat76;
		Static132.aFloatArray22[2] = this.aFloat81;
		Static132.aFloatArray22[9] = this.aFloat84;
		Static132.aFloatArray22[10] = this.aFloat80;
		return Static132.aFloatArray22;
	}

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class80.aFloatArray19[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class80.aFloatArray18[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class80.aFloatArray19[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class80.aFloatArray18[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class80.aFloatArray19[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class80.aFloatArray18[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat80 = local21 * local9;
		this.aFloat79 = local21 * local47 + local33 * -local27;
		this.aFloat81 = local9 * local27;
		this.aFloat84 = local43 * local21 + local27 * local39;
		this.aFloat77 = -local15;
		this.aFloat85 = local9 * local33;
		this.aFloat82 = local9 * local39;
		this.aFloat78 = local27 * local47 + local21 * local33;
		this.aFloat87 = local39 * -local21 + local43 * local27;
		this.aFloat83 = -(this.aFloat79 * (float) arg2) + (float) -arg0 * this.aFloat78 - (float) arg1 * this.aFloat82;
		this.aFloat76 = -((float) arg2 * this.aFloat80) + (float) -arg0 * this.aFloat81 - this.aFloat77 * (float) arg1;
		this.aFloat86 = -((float) arg2 * this.aFloat84) - (float) arg1 * this.aFloat85 + this.aFloat87 * (float) -arg0;
	}

	@OriginalMember(owner = "client!sf", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class80.aFloatArray19[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class80.aFloatArray18[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat87;
		@Pc(21) float local21 = this.aFloat85;
		@Pc(24) float local24 = this.aFloat84;
		this.aFloat87 = local18 * local9 - local15 * this.aFloat81;
		@Pc(37) float local37 = this.aFloat86;
		this.aFloat81 = local9 * this.aFloat81 + local15 * local18;
		this.aFloat85 = local21 * local9 - local15 * this.aFloat77;
		this.aFloat84 = local9 * local24 - local15 * this.aFloat80;
		this.aFloat77 = local9 * this.aFloat77 + local15 * local21;
		this.aFloat86 = local9 * local37 - local15 * this.aFloat76;
		this.aFloat80 = local9 * this.aFloat80 + local24 * local15;
		this.aFloat76 = this.aFloat76 * local9 + local37 * local15;
	}
}
