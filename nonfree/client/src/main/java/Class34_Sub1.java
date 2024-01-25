import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!oq", name = "K", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!oq", name = "P", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!oq", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat83 = arg2;
		this.aFloat89 = this.aFloat84 = this.aFloat82 = this.aFloat79 = this.aFloat81 = this.aFloat88 = 0.0F;
		this.aFloat80 = arg0;
		this.aFloat90 = arg1;
		this.aFloat86 = this.aFloat87 = this.aFloat85 = 1.0F;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5777() {
		@Pc(7) Class34_Sub1 local7 = new Class34_Sub1();
		local7.aFloat82 = this.aFloat82;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat81 = this.aFloat81;
		return local7;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat90 + this.aFloat89 * (float) arg0 + this.aFloat87 * (float) arg1 + this.aFloat88 * (float) arg2);
		arg3[0] = (int) (this.aFloat80 + this.aFloat81 * (float) arg2 + this.aFloat86 * (float) arg0 + (float) arg1 * this.aFloat82);
		arg3[2] = (int) (this.aFloat83 + (float) arg2 * this.aFloat85 + this.aFloat84 * (float) arg0 + this.aFloat79 * (float) arg1);
	}

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat85 = 1.0F;
		this.aFloat86 = this.aFloat87 = Class102.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat89 = Class102.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat82 = -this.aFloat89;
		this.aFloat81 = this.aFloat80 = this.aFloat88 = this.aFloat90 = this.aFloat84 = this.aFloat79 = this.aFloat83 = 0.0F;
	}

	@OriginalMember(owner = "client!oq", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class102.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class102.aFloatArray24[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat89;
		@Pc(21) float local21 = this.aFloat87;
		@Pc(24) float local24 = this.aFloat88;
		@Pc(27) float local27 = this.aFloat90;
		this.aFloat89 = local18 * local9 - this.aFloat84 * local15;
		this.aFloat87 = local21 * local9 - local15 * this.aFloat79;
		this.aFloat84 = this.aFloat84 * local9 + local15 * local18;
		this.aFloat79 = local21 * local15 + local9 * this.aFloat79;
		this.aFloat88 = local9 * local24 - this.aFloat85 * local15;
		this.aFloat85 = local9 * this.aFloat85 + local24 * local15;
		this.aFloat90 = local9 * local27 - this.aFloat83 * local15;
		this.aFloat83 = this.aFloat83 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!c;)V")
	public void method4147(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		this.aFloat81 = local6.aFloat84;
		this.aFloat86 = local6.aFloat86;
		this.aFloat82 = local6.aFloat89;
		this.aFloat84 = local6.aFloat81;
		this.aFloat88 = local6.aFloat79;
		this.aFloat87 = local6.aFloat87;
		this.aFloat89 = local6.aFloat82;
		this.aFloat80 = -(local6.aFloat80 * this.aFloat86 + local6.aFloat90 * this.aFloat82 + this.aFloat81 * local6.aFloat83);
		this.aFloat79 = local6.aFloat88;
		this.aFloat85 = local6.aFloat85;
		this.aFloat90 = -(this.aFloat88 * local6.aFloat83 + this.aFloat87 * local6.aFloat90 + this.aFloat89 * local6.aFloat80);
		this.aFloat83 = -(local6.aFloat83 * this.aFloat85 + this.aFloat84 * local6.aFloat80 + local6.aFloat90 * this.aFloat79);
	}

	@OriginalMember(owner = "client!oq", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat80;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat90;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat83;
		arg0[2] = (int) (this.aFloat85 * local28 + local11 * this.aFloat81 + this.aFloat88 * local19);
		arg0[1] = (int) (this.aFloat79 * local28 + local11 * this.aFloat82 + this.aFloat87 * local19);
		arg0[0] = (int) (local19 * this.aFloat89 + local11 * this.aFloat86 + this.aFloat84 * local28);
	}

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat86 = 1.0F;
		this.aFloat87 = this.aFloat85 = Class102.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat79 = Class102.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat82 = this.aFloat81 = this.aFloat80 = this.aFloat89 = this.aFloat90 = this.aFloat84 = this.aFloat83 = 0.0F;
		this.aFloat88 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!oq", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat81 * (float) arg2 + (float) arg1 * this.aFloat82 + this.aFloat86 * (float) arg0);
		arg3[1] = (int) ((float) arg1 * this.aFloat87 + this.aFloat89 * (float) arg0 + this.aFloat88 * (float) arg2);
		arg3[2] = (int) ((float) arg0 * this.aFloat84 + this.aFloat79 * (float) arg1 + this.aFloat85 * (float) arg2);
	}

	@OriginalMember(owner = "client!oq", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat90 += arg1;
		this.aFloat80 += arg0;
		this.aFloat83 += arg2;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)[F")
	public float[] method4148() {
		Static203.aFloatArray26[10] = this.aFloat85;
		Static203.aFloatArray26[0] = this.aFloat86;
		Static203.aFloatArray26[2] = this.aFloat84;
		Static203.aFloatArray26[12] = 0.0F;
		Static203.aFloatArray26[6] = this.aFloat79;
		Static203.aFloatArray26[8] = this.aFloat81;
		Static203.aFloatArray26[5] = this.aFloat87;
		Static203.aFloatArray26[9] = this.aFloat88;
		Static203.aFloatArray26[14] = 0.0F;
		Static203.aFloatArray26[13] = 0.0F;
		Static203.aFloatArray26[1] = this.aFloat89;
		Static203.aFloatArray26[4] = this.aFloat82;
		return Static203.aFloatArray26;
	}

	@OriginalMember(owner = "client!oq", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat87 = 1.0F;
		this.aFloat86 = this.aFloat85 = Class102.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat81 = Class102.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat84 = -this.aFloat81;
		this.aFloat82 = this.aFloat80 = this.aFloat89 = this.aFloat88 = this.aFloat90 = this.aFloat79 = this.aFloat83 = 0.0F;
	}

	@OriginalMember(owner = "client!oq", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat79 = local6.aFloat79;
		this.aFloat86 = local6.aFloat86;
		this.aFloat89 = local6.aFloat89;
		this.aFloat90 = local6.aFloat90;
		this.aFloat82 = local6.aFloat82;
		this.aFloat83 = local6.aFloat83;
		this.aFloat88 = local6.aFloat88;
		this.aFloat85 = local6.aFloat85;
		this.aFloat81 = local6.aFloat81;
		this.aFloat87 = local6.aFloat87;
		this.aFloat80 = local6.aFloat80;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(FFFIIII)V")
	public void method4149(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat86 = arg3;
			this.aFloat85 = 1.0F;
			this.aFloat89 = this.aFloat84 = this.aFloat82 = this.aFloat79 = this.aFloat81 = this.aFloat88 = 0.0F;
			this.aFloat87 = arg5;
		} else {
			@Pc(10) float local10 = Class102.aFloatArray25[arg4 & 0x3FFF];
			@Pc(16) float local16 = Class102.aFloatArray24[arg4 & 0x3FFF];
			this.aFloat89 = (float) arg3 * local16;
			this.aFloat84 = this.aFloat79 = this.aFloat81 = this.aFloat88 = 0.0F;
			this.aFloat86 = (float) arg3 * local10;
			this.aFloat82 = -local16 * (float) arg5;
			this.aFloat87 = local10 * (float) arg5;
			this.aFloat85 = 1.0F;
		}
		this.aFloat90 = arg0;
		this.aFloat80 = arg1;
		this.aFloat83 = arg2;
	}

	@OriginalMember(owner = "client!oq", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class102.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class102.aFloatArray24[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat86;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat81;
		@Pc(27) float local27 = this.aFloat80;
		this.aFloat86 = this.aFloat84 * local15 + local18 * local9;
		this.aFloat82 = local15 * this.aFloat79 + local21 * local9;
		this.aFloat84 = local9 * this.aFloat84 - local18 * local15;
		this.aFloat79 = local9 * this.aFloat79 - local21 * local15;
		this.aFloat81 = local24 * local9 + local15 * this.aFloat85;
		this.aFloat85 = this.aFloat85 * local9 - local15 * local24;
		this.aFloat80 = local27 * local9 + this.aFloat83 * local15;
		this.aFloat83 = this.aFloat83 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)[F")
	public float[] method4151() {
		Static203.aFloatArray26[9] = this.aFloat88;
		Static203.aFloatArray26[4] = this.aFloat82;
		Static203.aFloatArray26[5] = this.aFloat87;
		Static203.aFloatArray26[6] = this.aFloat79;
		Static203.aFloatArray26[10] = this.aFloat85;
		Static203.aFloatArray26[8] = this.aFloat81;
		Static203.aFloatArray26[13] = this.aFloat90;
		Static203.aFloatArray26[0] = this.aFloat86;
		Static203.aFloatArray26[2] = this.aFloat84;
		Static203.aFloatArray26[1] = this.aFloat89;
		Static203.aFloatArray26[14] = this.aFloat83;
		Static203.aFloatArray26[12] = this.aFloat80;
		return Static203.aFloatArray26;
	}

	@OriginalMember(owner = "client!oq", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class102.aFloatArray25[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class102.aFloatArray24[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class102.aFloatArray25[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class102.aFloatArray24[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class102.aFloatArray25[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class102.aFloatArray24[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat88 = local27 * local39 + local43 * local21;
		this.aFloat81 = -local27 * local33 + local21 * local47;
		this.aFloat82 = local39 * local9;
		this.aFloat79 = -local15;
		this.aFloat84 = local9 * local27;
		this.aFloat85 = local9 * local21;
		this.aFloat86 = local27 * local47 + local33 * local21;
		this.aFloat87 = local9 * local33;
		this.aFloat89 = local39 * -local21 + local27 * local43;
		this.aFloat83 = -(this.aFloat85 * (float) arg2) - (float) arg1 * this.aFloat79 + (float) -arg0 * this.aFloat84;
		this.aFloat80 = (float) -arg0 * this.aFloat86 - this.aFloat82 * (float) arg1 - this.aFloat81 * (float) arg2;
		this.aFloat90 = (float) -arg0 * this.aFloat89 - this.aFloat87 * (float) arg1 - (float) arg2 * this.aFloat88;
	}

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat86 = this.aFloat87 = this.aFloat85 = 1.0F;
		this.aFloat89 = this.aFloat84 = this.aFloat82 = this.aFloat79 = this.aFloat81 = this.aFloat88 = this.aFloat80 = this.aFloat90 = this.aFloat83 = 0.0F;
	}
}
