import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!tu", name = "H", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!tu", name = "J", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!tu", name = "P", descriptor = "F")
	public float aFloat209;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class31_Sub1() {
		this.xa();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)[F")
	public float[] method5155() {
		Static309.aFloatArray25[2] = this.aFloat206;
		Static309.aFloatArray25[0] = this.aFloat202;
		Static309.aFloatArray25[12] = 0.0F;
		Static309.aFloatArray25[13] = 0.0F;
		Static309.aFloatArray25[9] = this.aFloat201;
		Static309.aFloatArray25[5] = this.aFloat204;
		Static309.aFloatArray25[1] = this.aFloat200;
		Static309.aFloatArray25[4] = this.aFloat207;
		Static309.aFloatArray25[6] = this.aFloat203;
		Static309.aFloatArray25[14] = 0.0F;
		Static309.aFloatArray25[10] = this.aFloat199;
		Static309.aFloatArray25[8] = this.aFloat208;
		return Static309.aFloatArray25;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat208 * (float) arg2 + (float) arg0 * this.aFloat202 + (float) arg1 * this.aFloat207 + this.aFloat209);
		arg3[1] = (int) (this.aFloat205 + this.aFloat201 * (float) arg2 + this.aFloat204 * (float) arg1 + (float) arg0 * this.aFloat200);
		arg3[2] = (int) (this.aFloat206 * (float) arg0 + this.aFloat203 * (float) arg1 + this.aFloat199 * (float) arg2 + this.aFloat198);
	}

	@OriginalMember(owner = "client!tu", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class21.aFloatArray3[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class21.aFloatArray2[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat200;
		@Pc(21) float local21 = this.aFloat204;
		@Pc(24) float local24 = this.aFloat201;
		@Pc(27) float local27 = this.aFloat205;
		this.aFloat200 = local18 * local9 - this.aFloat206 * local15;
		this.aFloat206 = local9 * this.aFloat206 + local18 * local15;
		this.aFloat204 = local21 * local9 - this.aFloat203 * local15;
		this.aFloat203 = local15 * local21 + local9 * this.aFloat203;
		this.aFloat201 = local24 * local9 - local15 * this.aFloat199;
		this.aFloat199 = local15 * local24 + local9 * this.aFloat199;
		this.aFloat205 = local27 * local9 - local15 * this.aFloat198;
		this.aFloat198 = local9 * this.aFloat198 + local15 * local27;
	}

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class21.aFloatArray3[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class21.aFloatArray2[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class21.aFloatArray3[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class21.aFloatArray2[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class21.aFloatArray3[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class21.aFloatArray2[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat201 = local21 * local43 + local27 * local39;
		this.aFloat199 = local9 * local21;
		this.aFloat202 = local47 * local27 + local21 * local33;
		this.aFloat200 = local39 * -local21 + local27 * local43;
		this.aFloat206 = local27 * local9;
		this.aFloat203 = -local15;
		this.aFloat207 = local39 * local9;
		this.aFloat204 = local33 * local9;
		this.aFloat208 = local47 * local21 + local33 * -local27;
		this.aFloat209 = this.aFloat202 * (float) -arg0 - (float) arg1 * this.aFloat207 - (float) arg2 * this.aFloat208;
		this.aFloat205 = (float) -arg0 * this.aFloat200 - this.aFloat204 * (float) arg1 - (float) arg2 * this.aFloat201;
		this.aFloat198 = -((float) arg2 * this.aFloat199) + this.aFloat206 * (float) -arg0 - (float) arg1 * this.aFloat203;
	}

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat209;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat205;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat198;
		arg0[2] = (int) (local11 * this.aFloat208 + local20 * this.aFloat201 + local28 * this.aFloat199);
		arg0[1] = (int) (this.aFloat207 * local11 + this.aFloat204 * local20 + local28 * this.aFloat203);
		arg0[0] = (int) (local28 * this.aFloat206 + this.aFloat202 * local11 + local20 * this.aFloat200);
	}

	@OriginalMember(owner = "client!tu", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aFloat202 = this.aFloat204 = this.aFloat199 = 1.0F;
		this.aFloat200 = this.aFloat206 = this.aFloat207 = this.aFloat203 = this.aFloat208 = this.aFloat201 = this.aFloat209 = this.aFloat205 = this.aFloat198 = 0.0F;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!c;Z)V")
	public void method5158(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub1 local6 = (Class31_Sub1) arg0;
		this.aFloat208 = local6.aFloat206;
		this.aFloat207 = local6.aFloat200;
		this.aFloat202 = local6.aFloat202;
		this.aFloat201 = local6.aFloat203;
		this.aFloat206 = local6.aFloat208;
		this.aFloat200 = local6.aFloat207;
		this.aFloat204 = local6.aFloat204;
		this.aFloat209 = -(local6.aFloat205 * this.aFloat207 + local6.aFloat209 * this.aFloat202 + this.aFloat208 * local6.aFloat198);
		this.aFloat203 = local6.aFloat201;
		this.aFloat199 = local6.aFloat199;
		this.aFloat205 = -(this.aFloat201 * local6.aFloat198 + this.aFloat200 * local6.aFloat209 + this.aFloat204 * local6.aFloat205);
		this.aFloat198 = -(this.aFloat206 * local6.aFloat209 + this.aFloat203 * local6.aFloat205 + this.aFloat199 * local6.aFloat198);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIFIFF)V")
	public void method5159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat199 = 1.0F;
			this.aFloat200 = this.aFloat206 = this.aFloat207 = this.aFloat203 = this.aFloat208 = this.aFloat201 = 0.0F;
			this.aFloat202 = arg1;
			this.aFloat204 = arg3;
		} else {
			@Pc(10) float local10 = Class21.aFloatArray3[arg0 & 0x3FFF];
			@Pc(16) float local16 = Class21.aFloatArray2[arg0 & 0x3FFF];
			this.aFloat199 = 1.0F;
			this.aFloat207 = -local16 * (float) arg3;
			this.aFloat204 = (float) arg3 * local10;
			this.aFloat202 = local10 * (float) arg1;
			this.aFloat206 = this.aFloat203 = this.aFloat208 = this.aFloat201 = 0.0F;
			this.aFloat200 = local16 * (float) arg1;
		}
		this.aFloat209 = arg4;
		this.aFloat198 = arg5;
		this.aFloat205 = arg2;
	}

	@OriginalMember(owner = "client!tu", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub1 local6 = (Class31_Sub1) arg0;
		this.aFloat203 = local6.aFloat203;
		this.aFloat199 = local6.aFloat199;
		this.aFloat205 = local6.aFloat205;
		this.aFloat198 = local6.aFloat198;
		this.aFloat204 = local6.aFloat204;
		this.aFloat201 = local6.aFloat201;
		this.aFloat200 = local6.aFloat200;
		this.aFloat207 = local6.aFloat207;
		this.aFloat202 = local6.aFloat202;
		this.aFloat208 = local6.aFloat208;
		this.aFloat209 = local6.aFloat209;
		this.aFloat206 = local6.aFloat206;
	}

	@OriginalMember(owner = "client!tu", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class21.aFloatArray3[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class21.aFloatArray2[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat202;
		@Pc(21) float local21 = this.aFloat207;
		@Pc(24) float local24 = this.aFloat208;
		this.aFloat202 = local15 * this.aFloat206 + local9 * local18;
		@Pc(37) float local37 = this.aFloat209;
		this.aFloat207 = local9 * local21 + this.aFloat203 * local15;
		this.aFloat206 = local9 * this.aFloat206 - local18 * local15;
		this.aFloat203 = this.aFloat203 * local9 - local21 * local15;
		this.aFloat208 = local9 * local24 + local15 * this.aFloat199;
		this.aFloat199 = this.aFloat199 * local9 - local15 * local24;
		this.aFloat209 = this.aFloat198 * local15 + local9 * local37;
		this.aFloat198 = this.aFloat198 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat205 += arg1;
		this.aFloat198 += arg2;
		this.aFloat209 += arg0;
	}

	@OriginalMember(owner = "client!tu", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat204 = 1.0F;
		this.aFloat202 = this.aFloat199 = Class21.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat208 = Class21.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat207 = this.aFloat209 = this.aFloat200 = this.aFloat201 = this.aFloat205 = this.aFloat203 = this.aFloat198 = 0.0F;
		this.aFloat206 = -this.aFloat208;
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat200 + (float) arg1 * this.aFloat204 + (float) arg2 * this.aFloat201);
		arg3[0] = (int) (this.aFloat207 * (float) arg1 + this.aFloat202 * (float) arg0 + (float) arg2 * this.aFloat208);
		arg3[2] = (int) ((float) arg2 * this.aFloat199 + (float) arg1 * this.aFloat203 + this.aFloat206 * (float) arg0);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)[F")
	public float[] method5161() {
		Static309.aFloatArray25[14] = this.aFloat198;
		Static309.aFloatArray25[1] = this.aFloat200;
		Static309.aFloatArray25[0] = this.aFloat202;
		Static309.aFloatArray25[8] = this.aFloat208;
		Static309.aFloatArray25[13] = this.aFloat205;
		Static309.aFloatArray25[10] = this.aFloat199;
		Static309.aFloatArray25[2] = this.aFloat206;
		Static309.aFloatArray25[5] = this.aFloat204;
		Static309.aFloatArray25[9] = this.aFloat201;
		Static309.aFloatArray25[12] = this.aFloat209;
		Static309.aFloatArray25[4] = this.aFloat207;
		Static309.aFloatArray25[6] = this.aFloat203;
		return Static309.aFloatArray25;
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat200 = this.aFloat206 = this.aFloat207 = this.aFloat203 = this.aFloat208 = this.aFloat201 = 0.0F;
		this.aFloat202 = this.aFloat204 = this.aFloat199 = 1.0F;
		this.aFloat198 = arg2;
		this.aFloat209 = arg0;
		this.aFloat205 = arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5657() {
		@Pc(7) Class31_Sub1 local7 = new Class31_Sub1();
		local7.aFloat198 = this.aFloat198;
		local7.aFloat203 = this.aFloat203;
		local7.aFloat202 = this.aFloat202;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat201 = this.aFloat201;
		local7.aFloat209 = this.aFloat209;
		local7.aFloat200 = this.aFloat200;
		local7.aFloat205 = this.aFloat205;
		local7.aFloat208 = this.aFloat208;
		local7.aFloat207 = this.aFloat207;
		local7.aFloat204 = this.aFloat204;
		return local7;
	}

	@OriginalMember(owner = "client!tu", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat199 = 1.0F;
		this.aFloat202 = this.aFloat204 = Class21.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat200 = Class21.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat208 = this.aFloat209 = this.aFloat201 = this.aFloat205 = this.aFloat206 = this.aFloat203 = this.aFloat198 = 0.0F;
		this.aFloat207 = -this.aFloat200;
	}

	@OriginalMember(owner = "client!tu", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.aFloat202 = 1.0F;
		this.aFloat204 = this.aFloat199 = Class21.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat203 = Class21.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat207 = this.aFloat208 = this.aFloat209 = this.aFloat200 = this.aFloat205 = this.aFloat206 = this.aFloat198 = 0.0F;
		this.aFloat201 = -this.aFloat203;
	}
}
