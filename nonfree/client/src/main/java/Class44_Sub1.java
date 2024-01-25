import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public int anInt3388;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt3389;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public int anInt3392;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public int anInt3393;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt3394;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int anInt3395;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt3396;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int anInt3397;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	public int anInt3398;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int anInt3399;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class44_Sub1() {
		this.method3538();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public void method3531(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class177.anIntArray844[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class177.anIntArray843[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3398;
		@Pc(17) int local17 = this.anInt3389;
		@Pc(20) int local20 = this.anInt3391;
		@Pc(23) int local23 = this.anInt3394;
		this.anInt3398 = local14 * local5 + this.anInt3392 * local11 >> 15;
		this.anInt3392 = this.anInt3392 * local5 - local14 * local11 >> 15;
		this.anInt3389 = local17 * local5 + this.anInt3395 * local11 >> 15;
		this.anInt3395 = this.anInt3395 * local5 - local17 * local11 >> 15;
		this.anInt3391 = local20 * local5 + this.anInt3397 * local11 >> 15;
		this.anInt3397 = this.anInt3397 * local5 - local20 * local11 >> 15;
		this.anInt3394 = local23 * local5 + this.anInt3396 * local11 >> 15;
		this.anInt3396 = this.anInt3396 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!de;)V")
	@Override
	public void method3530(@OriginalArg(0) Class44 arg0) {
		@Pc(2) Class44_Sub1 local2 = (Class44_Sub1) arg0;
		this.anInt3398 = local2.anInt3398;
		this.anInt3389 = local2.anInt3389;
		this.anInt3391 = local2.anInt3391;
		this.anInt3394 = local2.anInt3394;
		this.anInt3390 = local2.anInt3390;
		this.anInt3399 = local2.anInt3399;
		this.anInt3388 = local2.anInt3388;
		this.anInt3393 = local2.anInt3393;
		this.anInt3392 = local2.anInt3392;
		this.anInt3395 = local2.anInt3395;
		this.anInt3397 = local2.anInt3397;
		this.anInt3396 = local2.anInt3396;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	@Override
	public void method3536(@OriginalArg(0) int arg0) {
		this.anInt3399 = 32768;
		this.anInt3398 = this.anInt3397 = Class177.anIntArray844[arg0 & 0x3FFF];
		this.anInt3391 = Class177.anIntArray843[arg0 & 0x3FFF];
		this.anInt3392 = -this.anInt3391;
		this.anInt3389 = this.anInt3394 = this.anInt3390 = this.anInt3388 = this.anInt3393 = this.anInt3395 = this.anInt3396 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()Lclient!kf;")
	public Class44_Sub1 method3120() {
		@Pc(3) Class44_Sub1 local3 = new Class44_Sub1();
		local3.anInt3398 = this.anInt3398;
		local3.anInt3389 = this.anInt3389;
		local3.anInt3391 = this.anInt3391;
		local3.anInt3394 = this.anInt3394;
		local3.anInt3390 = this.anInt3390;
		local3.anInt3399 = this.anInt3399;
		local3.anInt3388 = this.anInt3388;
		local3.anInt3393 = this.anInt3393;
		local3.anInt3392 = this.anInt3392;
		local3.anInt3395 = this.anInt3395;
		local3.anInt3397 = this.anInt3397;
		local3.anInt3396 = this.anInt3396;
		return local3;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	@Override
	public void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3394 += arg0;
		this.anInt3393 += arg1;
		this.anInt3396 += arg2;
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0) {
		this.anInt3398 = 32768;
		this.anInt3399 = this.anInt3397 = Class177.anIntArray844[arg0 & 0x3FFF];
		this.anInt3395 = Class177.anIntArray843[arg0 & 0x3FFF];
		this.anInt3388 = -this.anInt3395;
		this.anInt3389 = this.anInt3391 = this.anInt3394 = this.anInt3390 = this.anInt3393 = this.anInt3392 = this.anInt3396 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
	@Override
	public void method3539(@OriginalArg(0) int arg0) {
		this.anInt3397 = 32768;
		this.anInt3398 = this.anInt3399 = Class177.anIntArray844[arg0 & 0x3FFF];
		this.anInt3390 = Class177.anIntArray843[arg0 & 0x3FFF];
		this.anInt3389 = -this.anInt3390;
		this.anInt3391 = this.anInt3394 = this.anInt3388 = this.anInt3393 = this.anInt3392 = this.anInt3395 = this.anInt3396 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class177.anIntArray844[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class177.anIntArray843[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class177.anIntArray844[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class177.anIntArray843[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class177.anIntArray844[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class177.anIntArray843[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3398 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3390 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3392 = local23 * local5 >> 15;
		this.anInt3389 = local5 * local35 >> 15;
		this.anInt3399 = local5 * local29 >> 15;
		this.anInt3395 = -local11;
		this.anInt3391 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3388 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3397 = local17 * local5 >> 15;
		this.anInt3394 = -arg0 * this.anInt3398 - arg1 * this.anInt3389 - arg2 * this.anInt3391 >> 15;
		this.anInt3393 = -arg0 * this.anInt3390 - arg1 * this.anInt3399 - arg2 * this.anInt3388 >> 15;
		this.anInt3396 = -arg0 * this.anInt3392 - arg1 * this.anInt3395 - arg2 * this.anInt3397 >> 15;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([I)V")
	@Override
	public void method3542(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3394;
		@Pc(13) int local13 = arg0[1] - this.anInt3393;
		@Pc(20) int local20 = arg0[2] - this.anInt3396;
		arg0[0] = this.anInt3398 * local6 + this.anInt3390 * local13 + this.anInt3392 * local20 >> 15;
		arg0[1] = this.anInt3389 * local6 + this.anInt3399 * local13 + this.anInt3395 * local20 >> 15;
		arg0[2] = this.anInt3391 * local6 + this.anInt3388 * local13 + this.anInt3397 * local20 >> 15;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3390 = this.anInt3392 = this.anInt3389 = this.anInt3395 = this.anInt3391 = this.anInt3388 = 0;
		this.anInt3398 = this.anInt3399 = this.anInt3397 = 32768;
		this.anInt3394 = arg0;
		this.anInt3393 = arg1;
		this.anInt3396 = arg2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3394 + (this.anInt3398 * arg0 + this.anInt3389 * arg1 + this.anInt3391 * arg2 >> 15);
		arg3[1] = this.anInt3393 + (this.anInt3390 * arg0 + this.anInt3399 * arg1 + this.anInt3388 * arg2 >> 15);
		arg3[2] = this.anInt3396 + (this.anInt3392 * arg0 + this.anInt3395 * arg1 + this.anInt3397 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	@Override
	public void method3533(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class177.anIntArray844[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class177.anIntArray843[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3390;
		@Pc(17) int local17 = this.anInt3399;
		@Pc(20) int local20 = this.anInt3388;
		@Pc(23) int local23 = this.anInt3393;
		this.anInt3390 = local14 * local5 - this.anInt3392 * local11 >> 15;
		this.anInt3392 = local14 * local11 + this.anInt3392 * local5 >> 15;
		this.anInt3399 = local17 * local5 - this.anInt3395 * local11 >> 15;
		this.anInt3395 = local17 * local11 + this.anInt3395 * local5 >> 15;
		this.anInt3388 = local20 * local5 - this.anInt3397 * local11 >> 15;
		this.anInt3397 = local20 * local11 + this.anInt3397 * local5 >> 15;
		this.anInt3393 = local23 * local5 - this.anInt3396 * local11 >> 15;
		this.anInt3396 = local23 * local11 + this.anInt3396 * local5 >> 15;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	@Override
	public void method3538() {
		this.anInt3390 = this.anInt3392 = this.anInt3389 = this.anInt3395 = this.anInt3391 = this.anInt3388 = this.anInt3394 = this.anInt3393 = this.anInt3396 = 0;
		this.anInt3398 = this.anInt3399 = this.anInt3397 = 32768;
	}
}
