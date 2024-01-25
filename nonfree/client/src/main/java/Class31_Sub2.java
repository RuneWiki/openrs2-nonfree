import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
	public int anInt7323;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public int anInt7326;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public int anInt7327;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	public int anInt7328;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	public int anInt7329;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
	public int anInt7330;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	public int anInt7331;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
	public int anInt7332;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	public int anInt7333;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
	public int anInt7334;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class31_Sub2() {
		this.xa();
	}

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.anInt7334 = 32768;
		this.anInt7326 = this.anInt7325 = Class50_Sub1.anIntArray224[arg0 & 0x3FFF];
		this.anInt7330 = Class50_Sub1.anIntArray225[arg0 & 0x3FFF];
		this.anInt7327 = -this.anInt7330;
		this.anInt7328 = this.anInt7332 = this.anInt7329 = this.anInt7331 = this.anInt7324 = this.anInt7323 = this.anInt7333 = 0;
	}

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt7325 = 32768;
		this.anInt7334 = this.anInt7326 = Class50_Sub1.anIntArray224[arg0 & 0x3FFF];
		this.anInt7331 = Class50_Sub1.anIntArray225[arg0 & 0x3FFF];
		this.anInt7328 = -this.anInt7331;
		this.anInt7332 = this.anInt7329 = this.anInt7327 = this.anInt7324 = this.anInt7323 = this.anInt7330 = this.anInt7333 = 0;
	}

	@OriginalMember(owner = "client!wp", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class50_Sub1.anIntArray224[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class50_Sub1.anIntArray225[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7331;
		@Pc(17) int local17 = this.anInt7326;
		@Pc(20) int local20 = this.anInt7327;
		@Pc(23) int local23 = this.anInt7324;
		this.anInt7331 = local14 * local5 - this.anInt7323 * local11 >> 15;
		this.anInt7323 = local14 * local11 + this.anInt7323 * local5 >> 15;
		this.anInt7326 = local17 * local5 - this.anInt7330 * local11 >> 15;
		this.anInt7330 = local17 * local11 + this.anInt7330 * local5 >> 15;
		this.anInt7327 = local20 * local5 - this.anInt7325 * local11 >> 15;
		this.anInt7325 = local20 * local11 + this.anInt7325 * local5 >> 15;
		this.anInt7324 = local23 * local5 - this.anInt7333 * local11 >> 15;
		this.anInt7333 = local23 * local11 + this.anInt7333 * local5 >> 15;
	}

	@OriginalMember(owner = "client!wp", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.anInt7331 = this.anInt7323 = this.anInt7328 = this.anInt7330 = this.anInt7332 = this.anInt7327 = this.anInt7329 = this.anInt7324 = this.anInt7333 = 0;
		this.anInt7334 = this.anInt7326 = this.anInt7325 = 32768;
	}

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt7329;
		@Pc(13) int local13 = arg0[1] - this.anInt7324;
		@Pc(20) int local20 = arg0[2] - this.anInt7333;
		arg0[0] = this.anInt7334 * local6 + this.anInt7331 * local13 + this.anInt7323 * local20 >> 15;
		arg0[1] = this.anInt7328 * local6 + this.anInt7326 * local13 + this.anInt7330 * local20 >> 15;
		arg0[2] = this.anInt7332 * local6 + this.anInt7327 * local13 + this.anInt7325 * local20 >> 15;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5657() {
		@Pc(3) Class31_Sub2 local3 = new Class31_Sub2();
		local3.anInt7334 = this.anInt7334;
		local3.anInt7328 = this.anInt7328;
		local3.anInt7332 = this.anInt7332;
		local3.anInt7329 = this.anInt7329;
		local3.anInt7331 = this.anInt7331;
		local3.anInt7326 = this.anInt7326;
		local3.anInt7327 = this.anInt7327;
		local3.anInt7324 = this.anInt7324;
		local3.anInt7323 = this.anInt7323;
		local3.anInt7330 = this.anInt7330;
		local3.anInt7325 = this.anInt7325;
		local3.anInt7333 = this.anInt7333;
		return local3;
	}

	@OriginalMember(owner = "client!wp", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class50_Sub1.anIntArray224[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class50_Sub1.anIntArray225[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7334;
		@Pc(17) int local17 = this.anInt7328;
		@Pc(20) int local20 = this.anInt7332;
		@Pc(23) int local23 = this.anInt7329;
		this.anInt7334 = local14 * local5 + this.anInt7323 * local11 >> 15;
		this.anInt7323 = this.anInt7323 * local5 - local14 * local11 >> 15;
		this.anInt7328 = local17 * local5 + this.anInt7330 * local11 >> 15;
		this.anInt7330 = this.anInt7330 * local5 - local17 * local11 >> 15;
		this.anInt7332 = local20 * local5 + this.anInt7325 * local11 >> 15;
		this.anInt7325 = this.anInt7325 * local5 - local20 * local11 >> 15;
		this.anInt7329 = local23 * local5 + this.anInt7333 * local11 >> 15;
		this.anInt7333 = this.anInt7333 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7334 * arg0 + this.anInt7328 * arg1 + this.anInt7332 * arg2 >> 15;
		arg3[1] = this.anInt7331 * arg0 + this.anInt7326 * arg1 + this.anInt7327 * arg2 >> 15;
		arg3[2] = this.anInt7323 * arg0 + this.anInt7330 * arg1 + this.anInt7325 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7329 += arg0;
		this.anInt7324 += arg1;
		this.anInt7333 += arg2;
	}

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7331 = this.anInt7323 = this.anInt7328 = this.anInt7330 = this.anInt7332 = this.anInt7327 = 0;
		this.anInt7334 = this.anInt7326 = this.anInt7325 = 32768;
		this.anInt7329 = arg0;
		this.anInt7324 = arg1;
		this.anInt7333 = arg2;
	}

	@OriginalMember(owner = "client!wp", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt7326 = 32768;
		this.anInt7334 = this.anInt7325 = Class50_Sub1.anIntArray224[arg0 & 0x3FFF];
		this.anInt7332 = Class50_Sub1.anIntArray225[arg0 & 0x3FFF];
		this.anInt7323 = -this.anInt7332;
		this.anInt7328 = this.anInt7329 = this.anInt7331 = this.anInt7327 = this.anInt7324 = this.anInt7330 = this.anInt7333 = 0;
	}

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class50_Sub1.anIntArray224[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class50_Sub1.anIntArray225[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class50_Sub1.anIntArray224[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class50_Sub1.anIntArray225[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class50_Sub1.anIntArray224[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class50_Sub1.anIntArray225[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt7334 = local17 * local29 + local23 * local47 >> 15;
		this.anInt7331 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt7323 = local23 * local5 >> 15;
		this.anInt7328 = local5 * local35 >> 15;
		this.anInt7326 = local5 * local29 >> 15;
		this.anInt7330 = -local11;
		this.anInt7332 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt7327 = local23 * local35 + local17 * local41 >> 15;
		this.anInt7325 = local17 * local5 >> 15;
		this.anInt7329 = -arg0 * this.anInt7334 - arg1 * this.anInt7328 - arg2 * this.anInt7332 >> 15;
		this.anInt7324 = -arg0 * this.anInt7331 - arg1 * this.anInt7326 - arg2 * this.anInt7327 >> 15;
		this.anInt7333 = -arg0 * this.anInt7323 - arg1 * this.anInt7330 - arg2 * this.anInt7325 >> 15;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7329 + (this.anInt7334 * arg0 + this.anInt7328 * arg1 + this.anInt7332 * arg2 >> 15);
		arg3[1] = this.anInt7324 + (this.anInt7331 * arg0 + this.anInt7326 * arg1 + this.anInt7327 * arg2 >> 15);
		arg3[2] = this.anInt7333 + (this.anInt7323 * arg0 + this.anInt7330 * arg1 + this.anInt7325 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!wp", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class31 arg0) {
		@Pc(2) Class31_Sub2 local2 = (Class31_Sub2) arg0;
		this.anInt7334 = local2.anInt7334;
		this.anInt7328 = local2.anInt7328;
		this.anInt7332 = local2.anInt7332;
		this.anInt7329 = local2.anInt7329;
		this.anInt7331 = local2.anInt7331;
		this.anInt7326 = local2.anInt7326;
		this.anInt7327 = local2.anInt7327;
		this.anInt7324 = local2.anInt7324;
		this.anInt7323 = local2.anInt7323;
		this.anInt7330 = local2.anInt7330;
		this.anInt7325 = local2.anInt7325;
		this.anInt7333 = local2.anInt7333;
	}
}
