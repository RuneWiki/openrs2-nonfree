import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class40_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)[F")
	public float[] method3908() {
		Static331.aFloatArray25[6] = this.aFloat81;
		Static331.aFloatArray25[1] = this.aFloat76;
		Static331.aFloatArray25[13] = this.aFloat80;
		Static331.aFloatArray25[9] = this.aFloat73;
		Static331.aFloatArray25[8] = this.aFloat77;
		Static331.aFloatArray25[5] = this.aFloat82;
		Static331.aFloatArray25[0] = this.aFloat72;
		Static331.aFloatArray25[4] = this.aFloat71;
		Static331.aFloatArray25[10] = this.aFloat79;
		Static331.aFloatArray25[14] = this.aFloat75;
		Static331.aFloatArray25[2] = this.aFloat74;
		Static331.aFloatArray25[12] = this.aFloat78;
		return Static331.aFloatArray25;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat72 = 1.0F;
		this.aFloat82 = this.aFloat79 = Class258.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat81 = Class258.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat71 = this.aFloat77 = this.aFloat78 = this.aFloat76 = this.aFloat80 = this.aFloat74 = this.aFloat75 = 0.0F;
		this.aFloat73 = -this.aFloat81;
	}

	@OriginalMember(owner = "client!nb", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class258.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class258.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat72;
		@Pc(21) float local21 = this.aFloat71;
		@Pc(24) float local24 = this.aFloat77;
		this.aFloat72 = local9 * local18 + this.aFloat74 * local15;
		@Pc(37) float local37 = this.aFloat78;
		this.aFloat71 = local21 * local9 + local15 * this.aFloat81;
		this.aFloat74 = this.aFloat74 * local9 - local18 * local15;
		this.aFloat77 = local24 * local9 + this.aFloat79 * local15;
		this.aFloat81 = local9 * this.aFloat81 - local21 * local15;
		this.aFloat78 = local9 * local37 + local15 * this.aFloat75;
		this.aFloat79 = this.aFloat79 * local9 - local24 * local15;
		this.aFloat75 = this.aFloat75 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat72 = this.aFloat82 = this.aFloat79 = 1.0F;
		this.aFloat76 = this.aFloat74 = this.aFloat71 = this.aFloat81 = this.aFloat77 = this.aFloat73 = this.aFloat78 = this.aFloat80 = this.aFloat75 = 0.0F;
	}

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat74 + (float) arg1 * this.aFloat81 + this.aFloat79 * (float) arg2);
		arg3[1] = (int) ((float) arg1 * this.aFloat82 + (float) arg0 * this.aFloat76 + (float) arg2 * this.aFloat73);
		arg3[0] = (int) ((float) arg2 * this.aFloat77 + (float) arg0 * this.aFloat72 + (float) arg1 * this.aFloat71);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!c;)V")
	public void method3911(@OriginalArg(1) Class40 arg0) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg0;
		this.aFloat71 = local6.aFloat76;
		this.aFloat72 = local6.aFloat72;
		this.aFloat77 = local6.aFloat74;
		this.aFloat76 = local6.aFloat71;
		this.aFloat74 = local6.aFloat77;
		this.aFloat73 = local6.aFloat81;
		this.aFloat82 = local6.aFloat82;
		this.aFloat81 = local6.aFloat73;
		this.aFloat79 = local6.aFloat79;
		this.aFloat78 = -(this.aFloat77 * local6.aFloat75 + this.aFloat72 * local6.aFloat78 + this.aFloat71 * local6.aFloat80);
		this.aFloat80 = -(this.aFloat73 * local6.aFloat75 + local6.aFloat78 * this.aFloat76 + this.aFloat82 * local6.aFloat80);
		this.aFloat75 = -(local6.aFloat75 * this.aFloat79 + local6.aFloat80 * this.aFloat81 + this.aFloat74 * local6.aFloat78);
	}

	@OriginalMember(owner = "client!nb", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat78;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat80;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat75;
		arg0[1] = (int) (this.aFloat81 * local29 + this.aFloat82 * local21 + this.aFloat71 * local12);
		arg0[0] = (int) (this.aFloat74 * local29 + local12 * this.aFloat72 + this.aFloat76 * local21);
		arg0[2] = (int) (local12 * this.aFloat77 + this.aFloat73 * local21 + local29 * this.aFloat79);
	}

	@OriginalMember(owner = "client!nb", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class258.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class258.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat76;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat73;
		this.aFloat76 = local18 * local9 - this.aFloat74 * local15;
		@Pc(37) float local37 = this.aFloat80;
		this.aFloat82 = local9 * local21 - local15 * this.aFloat81;
		this.aFloat74 = local9 * this.aFloat74 + local18 * local15;
		this.aFloat73 = local24 * local9 - this.aFloat79 * local15;
		this.aFloat81 = local15 * local21 + local9 * this.aFloat81;
		this.aFloat80 = local9 * local37 - local15 * this.aFloat75;
		this.aFloat79 = local24 * local15 + this.aFloat79 * local9;
		this.aFloat75 = local15 * local37 + this.aFloat75 * local9;
	}

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 += arg2;
		this.aFloat80 += arg1;
		this.aFloat78 += arg0;
	}

	@OriginalMember(owner = "client!nb", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat82 = 1.0F;
		this.aFloat72 = this.aFloat79 = Class258.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat77 = Class258.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat71 = this.aFloat78 = this.aFloat76 = this.aFloat73 = this.aFloat80 = this.aFloat81 = this.aFloat75 = 0.0F;
		this.aFloat74 = -this.aFloat77;
	}

	@OriginalMember(owner = "client!nb", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class40 arg0) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg0;
		this.aFloat72 = local6.aFloat72;
		this.aFloat80 = local6.aFloat80;
		this.aFloat76 = local6.aFloat76;
		this.aFloat73 = local6.aFloat73;
		this.aFloat78 = local6.aFloat78;
		this.aFloat74 = local6.aFloat74;
		this.aFloat77 = local6.aFloat77;
		this.aFloat71 = local6.aFloat71;
		this.aFloat79 = local6.aFloat79;
		this.aFloat81 = local6.aFloat81;
		this.aFloat82 = local6.aFloat82;
		this.aFloat75 = local6.aFloat75;
	}

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat79 = 1.0F;
		this.aFloat72 = this.aFloat82 = Class258.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat76 = Class258.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat71 = -this.aFloat76;
		this.aFloat77 = this.aFloat78 = this.aFloat73 = this.aFloat80 = this.aFloat74 = this.aFloat81 = this.aFloat75 = 0.0F;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(FIFIIFI)V")
	public void method3912(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		if (arg4 == 0) {
			this.aFloat72 = arg3;
			this.aFloat82 = arg1;
			this.aFloat79 = 1.0F;
			this.aFloat76 = this.aFloat74 = this.aFloat71 = this.aFloat81 = this.aFloat77 = this.aFloat73 = 0.0F;
		} else {
			@Pc(10) float local10 = Class258.aFloatArray28[arg4 & 0x3FFF];
			@Pc(16) float local16 = Class258.aFloatArray29[arg4 & 0x3FFF];
			this.aFloat79 = 1.0F;
			this.aFloat76 = (float) arg3 * local16;
			this.aFloat72 = local10 * (float) arg3;
			this.aFloat82 = (float) arg1 * local10;
			this.aFloat71 = -local16 * (float) arg1;
			this.aFloat74 = this.aFloat81 = this.aFloat77 = this.aFloat73 = 0.0F;
		}
		this.aFloat75 = arg5;
		this.aFloat80 = arg2;
		this.aFloat78 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class258.aFloatArray28[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class258.aFloatArray29[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class258.aFloatArray28[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class258.aFloatArray29[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class258.aFloatArray28[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class258.aFloatArray29[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat79 = local21 * local9;
		this.aFloat81 = -local15;
		this.aFloat72 = local33 * local21 + local27 * local47;
		this.aFloat77 = local47 * local21 + local33 * -local27;
		this.aFloat74 = local27 * local9;
		this.aFloat82 = local9 * local33;
		this.aFloat71 = local9 * local39;
		this.aFloat73 = local27 * local39 + local43 * local21;
		this.aFloat76 = local43 * local27 + -local21 * local39;
		this.aFloat75 = -((float) arg2 * this.aFloat79) + (float) -arg0 * this.aFloat74 - (float) arg1 * this.aFloat81;
		this.aFloat80 = -((float) arg2 * this.aFloat73) + this.aFloat76 * (float) -arg0 - (float) arg1 * this.aFloat82;
		this.aFloat78 = -(this.aFloat77 * (float) arg2) - (float) arg1 * this.aFloat71 + (float) -arg0 * this.aFloat72;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)[F")
	public float[] method3913() {
		Static331.aFloatArray25[2] = this.aFloat74;
		Static331.aFloatArray25[14] = 0.0F;
		Static331.aFloatArray25[12] = 0.0F;
		Static331.aFloatArray25[13] = 0.0F;
		Static331.aFloatArray25[4] = this.aFloat71;
		Static331.aFloatArray25[5] = this.aFloat82;
		Static331.aFloatArray25[0] = this.aFloat72;
		Static331.aFloatArray25[6] = this.aFloat81;
		Static331.aFloatArray25[8] = this.aFloat77;
		Static331.aFloatArray25[1] = this.aFloat76;
		Static331.aFloatArray25[9] = this.aFloat73;
		Static331.aFloatArray25[10] = this.aFloat79;
		return Static331.aFloatArray25;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class40 method4576() {
		@Pc(7) Class40_Sub2 local7 = new Class40_Sub2();
		local7.aFloat80 = this.aFloat80;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat76 = this.aFloat76;
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat75 + this.aFloat79 * (float) arg2 + (float) arg0 * this.aFloat74 + this.aFloat81 * (float) arg1);
		arg3[0] = (int) (this.aFloat78 + this.aFloat77 * (float) arg2 + this.aFloat71 * (float) arg1 + this.aFloat72 * (float) arg0);
		arg3[1] = (int) (this.aFloat80 + this.aFloat73 * (float) arg2 + (float) arg0 * this.aFloat76 + (float) arg1 * this.aFloat82);
	}

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat72 = this.aFloat82 = this.aFloat79 = 1.0F;
		this.aFloat76 = this.aFloat74 = this.aFloat71 = this.aFloat81 = this.aFloat77 = this.aFloat73 = 0.0F;
		this.aFloat80 = arg1;
		this.aFloat75 = arg2;
		this.aFloat78 = arg0;
	}
}
