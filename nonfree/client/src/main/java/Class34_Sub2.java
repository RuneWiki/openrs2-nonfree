import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public int anInt7319;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public int anInt7320;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public int anInt7321;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public int anInt7322;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public int anInt7323;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	public int anInt7326;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public int anInt7327;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
	public int anInt7328;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public int anInt7329;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!vr", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class250.anIntArray674[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class250.anIntArray675[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7323;
		@Pc(17) int local17 = this.anInt7319;
		@Pc(20) int local20 = this.anInt7320;
		@Pc(23) int local23 = this.anInt7324;
		this.anInt7323 = local14 * local5 + this.anInt7325 * local11 >> 15;
		this.anInt7325 = this.anInt7325 * local5 - local14 * local11 >> 15;
		this.anInt7319 = local17 * local5 + this.anInt7321 * local11 >> 15;
		this.anInt7321 = this.anInt7321 * local5 - local17 * local11 >> 15;
		this.anInt7320 = local20 * local5 + this.anInt7326 * local11 >> 15;
		this.anInt7326 = this.anInt7326 * local5 - local20 * local11 >> 15;
		this.anInt7324 = local23 * local5 + this.anInt7327 * local11 >> 15;
		this.anInt7327 = this.anInt7327 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt7329 = this.anInt7325 = this.anInt7319 = this.anInt7321 = this.anInt7320 = this.anInt7322 = this.anInt7324 = this.anInt7328 = this.anInt7327 = 0;
		this.anInt7323 = this.anInt7318 = this.anInt7326 = 32768;
	}

	@OriginalMember(owner = "client!vr", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class34 arg0) {
		@Pc(2) Class34_Sub2 local2 = (Class34_Sub2) arg0;
		this.anInt7323 = local2.anInt7323;
		this.anInt7319 = local2.anInt7319;
		this.anInt7320 = local2.anInt7320;
		this.anInt7324 = local2.anInt7324;
		this.anInt7329 = local2.anInt7329;
		this.anInt7318 = local2.anInt7318;
		this.anInt7322 = local2.anInt7322;
		this.anInt7328 = local2.anInt7328;
		this.anInt7325 = local2.anInt7325;
		this.anInt7321 = local2.anInt7321;
		this.anInt7326 = local2.anInt7326;
		this.anInt7327 = local2.anInt7327;
	}

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7323 * arg0 + this.anInt7319 * arg1 + this.anInt7320 * arg2 >> 15;
		arg3[1] = this.anInt7329 * arg0 + this.anInt7318 * arg1 + this.anInt7322 * arg2 >> 15;
		arg3[2] = this.anInt7325 * arg0 + this.anInt7321 * arg1 + this.anInt7326 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!vr", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class250.anIntArray674[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class250.anIntArray675[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7329;
		@Pc(17) int local17 = this.anInt7318;
		@Pc(20) int local20 = this.anInt7322;
		@Pc(23) int local23 = this.anInt7328;
		this.anInt7329 = local14 * local5 - this.anInt7325 * local11 >> 15;
		this.anInt7325 = local14 * local11 + this.anInt7325 * local5 >> 15;
		this.anInt7318 = local17 * local5 - this.anInt7321 * local11 >> 15;
		this.anInt7321 = local17 * local11 + this.anInt7321 * local5 >> 15;
		this.anInt7322 = local20 * local5 - this.anInt7326 * local11 >> 15;
		this.anInt7326 = local20 * local11 + this.anInt7326 * local5 >> 15;
		this.anInt7328 = local23 * local5 - this.anInt7327 * local11 >> 15;
		this.anInt7327 = local23 * local11 + this.anInt7327 * local5 >> 15;
	}

	@OriginalMember(owner = "client!vr", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt7324;
		@Pc(13) int local13 = arg0[1] - this.anInt7328;
		@Pc(20) int local20 = arg0[2] - this.anInt7327;
		arg0[0] = this.anInt7323 * local6 + this.anInt7329 * local13 + this.anInt7325 * local20 >> 15;
		arg0[1] = this.anInt7319 * local6 + this.anInt7318 * local13 + this.anInt7321 * local20 >> 15;
		arg0[2] = this.anInt7320 * local6 + this.anInt7322 * local13 + this.anInt7326 * local20 >> 15;
	}

	@OriginalMember(owner = "client!vr", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt7318 = 32768;
		this.anInt7323 = this.anInt7326 = Class250.anIntArray674[arg0 & 0x3FFF];
		this.anInt7320 = Class250.anIntArray675[arg0 & 0x3FFF];
		this.anInt7325 = -this.anInt7320;
		this.anInt7319 = this.anInt7324 = this.anInt7329 = this.anInt7322 = this.anInt7328 = this.anInt7321 = this.anInt7327 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5777() {
		@Pc(3) Class34_Sub2 local3 = new Class34_Sub2();
		local3.anInt7323 = this.anInt7323;
		local3.anInt7319 = this.anInt7319;
		local3.anInt7320 = this.anInt7320;
		local3.anInt7324 = this.anInt7324;
		local3.anInt7329 = this.anInt7329;
		local3.anInt7318 = this.anInt7318;
		local3.anInt7322 = this.anInt7322;
		local3.anInt7328 = this.anInt7328;
		local3.anInt7325 = this.anInt7325;
		local3.anInt7321 = this.anInt7321;
		local3.anInt7326 = this.anInt7326;
		local3.anInt7327 = this.anInt7327;
		return local3;
	}

	@OriginalMember(owner = "client!vr", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7324 += arg0;
		this.anInt7328 += arg1;
		this.anInt7327 += arg2;
	}

	@OriginalMember(owner = "client!vr", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7329 = this.anInt7325 = this.anInt7319 = this.anInt7321 = this.anInt7320 = this.anInt7322 = 0;
		this.anInt7323 = this.anInt7318 = this.anInt7326 = 32768;
		this.anInt7324 = arg0;
		this.anInt7328 = arg1;
		this.anInt7327 = arg2;
	}

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt7326 = 32768;
		this.anInt7323 = this.anInt7318 = Class250.anIntArray674[arg0 & 0x3FFF];
		this.anInt7329 = Class250.anIntArray675[arg0 & 0x3FFF];
		this.anInt7319 = -this.anInt7329;
		this.anInt7320 = this.anInt7324 = this.anInt7322 = this.anInt7328 = this.anInt7325 = this.anInt7321 = this.anInt7327 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7324 + (this.anInt7323 * arg0 + this.anInt7319 * arg1 + this.anInt7320 * arg2 >> 15);
		arg3[1] = this.anInt7328 + (this.anInt7329 * arg0 + this.anInt7318 * arg1 + this.anInt7322 * arg2 >> 15);
		arg3[2] = this.anInt7327 + (this.anInt7325 * arg0 + this.anInt7321 * arg1 + this.anInt7326 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt7323 = 32768;
		this.anInt7318 = this.anInt7326 = Class250.anIntArray674[arg0 & 0x3FFF];
		this.anInt7321 = Class250.anIntArray675[arg0 & 0x3FFF];
		this.anInt7322 = -this.anInt7321;
		this.anInt7319 = this.anInt7320 = this.anInt7324 = this.anInt7329 = this.anInt7328 = this.anInt7325 = this.anInt7327 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class250.anIntArray674[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class250.anIntArray675[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class250.anIntArray674[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class250.anIntArray675[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class250.anIntArray674[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class250.anIntArray675[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt7323 = local17 * local29 + local23 * local47 >> 15;
		this.anInt7329 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt7325 = local23 * local5 >> 15;
		this.anInt7319 = local5 * local35 >> 15;
		this.anInt7318 = local5 * local29 >> 15;
		this.anInt7321 = -local11;
		this.anInt7320 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt7322 = local23 * local35 + local17 * local41 >> 15;
		this.anInt7326 = local17 * local5 >> 15;
		this.anInt7324 = -arg0 * this.anInt7323 - arg1 * this.anInt7319 - arg2 * this.anInt7320 >> 15;
		this.anInt7328 = -arg0 * this.anInt7329 - arg1 * this.anInt7318 - arg2 * this.anInt7322 >> 15;
		this.anInt7327 = -arg0 * this.anInt7325 - arg1 * this.anInt7321 - arg2 * this.anInt7326 >> 15;
	}
}
