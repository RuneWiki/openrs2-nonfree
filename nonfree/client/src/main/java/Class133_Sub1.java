import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public int anInt4325;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public int anInt4326;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public int anInt4327;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public int anInt4330;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public int anInt4331;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public int anInt4332;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	public int anInt4333;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public int anInt4336;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class133_Sub1() {
		this.method4337();
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	@Override
	public void method4336(@OriginalArg(0) int arg0) {
		this.anInt4334 = 32768;
		this.anInt4329 = this.anInt4332 = Class24.anIntArray36[arg0 & 0x3FFF];
		this.anInt4330 = Class24.anIntArray35[arg0 & 0x3FFF];
		this.anInt4336 = -this.anInt4330;
		this.anInt4331 = this.anInt4335 = this.anInt4333 = this.anInt4328 = this.anInt4325 = this.anInt4326 = this.anInt4327 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method4340(@OriginalArg(0) Class133 arg0) {
		@Pc(2) Class133_Sub1 local2 = (Class133_Sub1) arg0;
		this.anInt4334 = local2.anInt4334;
		this.anInt4331 = local2.anInt4331;
		this.anInt4335 = local2.anInt4335;
		this.anInt4333 = local2.anInt4333;
		this.anInt4328 = local2.anInt4328;
		this.anInt4329 = local2.anInt4329;
		this.anInt4336 = local2.anInt4336;
		this.anInt4325 = local2.anInt4325;
		this.anInt4326 = local2.anInt4326;
		this.anInt4330 = local2.anInt4330;
		this.anInt4332 = local2.anInt4332;
		this.anInt4327 = local2.anInt4327;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	@Override
	public void method4331(@OriginalArg(0) int arg0) {
		this.anInt4329 = 32768;
		this.anInt4334 = this.anInt4332 = Class24.anIntArray36[arg0 & 0x3FFF];
		this.anInt4335 = Class24.anIntArray35[arg0 & 0x3FFF];
		this.anInt4326 = -this.anInt4335;
		this.anInt4331 = this.anInt4333 = this.anInt4328 = this.anInt4336 = this.anInt4325 = this.anInt4330 = this.anInt4327 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V")
	@Override
	public void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4333 += arg0;
		this.anInt4325 += arg1;
		this.anInt4327 += arg2;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()V")
	@Override
	public void method4337() {
		this.anInt4328 = this.anInt4326 = this.anInt4331 = this.anInt4330 = this.anInt4335 = this.anInt4336 = this.anInt4333 = this.anInt4325 = this.anInt4327 = 0;
		this.anInt4334 = this.anInt4329 = this.anInt4332 = 32768;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method4327(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class24.anIntArray36[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class24.anIntArray35[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4334;
		@Pc(17) int local17 = this.anInt4331;
		@Pc(20) int local20 = this.anInt4335;
		@Pc(23) int local23 = this.anInt4333;
		this.anInt4334 = local14 * local5 + this.anInt4326 * local11 >> 15;
		this.anInt4326 = this.anInt4326 * local5 - local14 * local11 >> 15;
		this.anInt4331 = local17 * local5 + this.anInt4330 * local11 >> 15;
		this.anInt4330 = this.anInt4330 * local5 - local17 * local11 >> 15;
		this.anInt4335 = local20 * local5 + this.anInt4332 * local11 >> 15;
		this.anInt4332 = this.anInt4332 * local5 - local20 * local11 >> 15;
		this.anInt4333 = local23 * local5 + this.anInt4327 * local11 >> 15;
		this.anInt4327 = this.anInt4327 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([I)V")
	@Override
	public void method4329(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4333;
		@Pc(13) int local13 = arg0[1] - this.anInt4325;
		@Pc(20) int local20 = arg0[2] - this.anInt4327;
		arg0[0] = this.anInt4334 * local6 + this.anInt4328 * local13 + this.anInt4326 * local20 >> 15;
		arg0[1] = this.anInt4331 * local6 + this.anInt4329 * local13 + this.anInt4330 * local20 >> 15;
		arg0[2] = this.anInt4335 * local6 + this.anInt4336 * local13 + this.anInt4332 * local20 >> 15;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	@Override
	public void method4338(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class24.anIntArray36[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class24.anIntArray35[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4328;
		@Pc(17) int local17 = this.anInt4329;
		@Pc(20) int local20 = this.anInt4336;
		@Pc(23) int local23 = this.anInt4325;
		this.anInt4328 = local14 * local5 - this.anInt4326 * local11 >> 15;
		this.anInt4326 = local14 * local11 + this.anInt4326 * local5 >> 15;
		this.anInt4329 = local17 * local5 - this.anInt4330 * local11 >> 15;
		this.anInt4330 = local17 * local11 + this.anInt4330 * local5 >> 15;
		this.anInt4336 = local20 * local5 - this.anInt4332 * local11 >> 15;
		this.anInt4332 = local20 * local11 + this.anInt4332 * local5 >> 15;
		this.anInt4325 = local23 * local5 - this.anInt4327 * local11 >> 15;
		this.anInt4327 = local23 * local11 + this.anInt4327 * local5 >> 15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4328 = this.anInt4326 = this.anInt4331 = this.anInt4330 = this.anInt4335 = this.anInt4336 = 0;
		this.anInt4334 = this.anInt4329 = this.anInt4332 = 32768;
		this.anInt4333 = arg0;
		this.anInt4325 = arg1;
		this.anInt4327 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4333 + (this.anInt4334 * arg0 + this.anInt4331 * arg1 + this.anInt4335 * arg2 >> 15);
		arg3[1] = this.anInt4325 + (this.anInt4328 * arg0 + this.anInt4329 * arg1 + this.anInt4336 * arg2 >> 15);
		arg3[2] = this.anInt4327 + (this.anInt4326 * arg0 + this.anInt4330 * arg1 + this.anInt4332 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class24.anIntArray36[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class24.anIntArray35[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class24.anIntArray36[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class24.anIntArray35[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class24.anIntArray36[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class24.anIntArray35[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4334 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4328 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4326 = local23 * local5 >> 15;
		this.anInt4331 = local5 * local35 >> 15;
		this.anInt4329 = local5 * local29 >> 15;
		this.anInt4330 = -local11;
		this.anInt4335 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4336 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4332 = local17 * local5 >> 15;
		this.anInt4333 = -arg0 * this.anInt4334 - arg1 * this.anInt4331 - arg2 * this.anInt4335 >> 15;
		this.anInt4325 = -arg0 * this.anInt4328 - arg1 * this.anInt4329 - arg2 * this.anInt4336 >> 15;
		this.anInt4327 = -arg0 * this.anInt4326 - arg1 * this.anInt4330 - arg2 * this.anInt4332 >> 15;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	@Override
	public void method4328(@OriginalArg(0) int arg0) {
		this.anInt4332 = 32768;
		this.anInt4334 = this.anInt4329 = Class24.anIntArray36[arg0 & 0x3FFF];
		this.anInt4328 = Class24.anIntArray35[arg0 & 0x3FFF];
		this.anInt4331 = -this.anInt4328;
		this.anInt4335 = this.anInt4333 = this.anInt4336 = this.anInt4325 = this.anInt4326 = this.anInt4330 = this.anInt4327 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lclient!oc;")
	public Class133_Sub1 method3963() {
		@Pc(3) Class133_Sub1 local3 = new Class133_Sub1();
		local3.anInt4334 = this.anInt4334;
		local3.anInt4331 = this.anInt4331;
		local3.anInt4335 = this.anInt4335;
		local3.anInt4333 = this.anInt4333;
		local3.anInt4328 = this.anInt4328;
		local3.anInt4329 = this.anInt4329;
		local3.anInt4336 = this.anInt4336;
		local3.anInt4325 = this.anInt4325;
		local3.anInt4326 = this.anInt4326;
		local3.anInt4330 = this.anInt4330;
		local3.anInt4332 = this.anInt4332;
		local3.anInt4327 = this.anInt4327;
		return local3;
	}
}
