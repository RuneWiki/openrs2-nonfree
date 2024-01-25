import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
	public int anInt3377;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public int anInt3378;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public int anInt3379;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public int anInt3380;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public int anInt3382;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public int anInt3383;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	public int anInt3384;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	public int anInt3385;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	public int anInt3387;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	public int anInt3388;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class112_Sub1() {
		this.method3591();
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V")
	@Override
	public void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3384 = this.anInt3388 = this.anInt3382 = this.anInt3387 = this.anInt3385 = this.anInt3381 = 0;
		this.anInt3378 = this.anInt3383 = this.anInt3386 = 32768;
		this.anInt3379 = arg0;
		this.anInt3380 = arg1;
		this.anInt3377 = arg2;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
	@Override
	public void method3595(@OriginalArg(0) int arg0) {
		this.anInt3383 = 32768;
		this.anInt3378 = this.anInt3386 = Class5_Sub9_Sub12.anIntArray170[arg0 & 0x3FFF];
		this.anInt3385 = Class5_Sub9_Sub12.anIntArray169[arg0 & 0x3FFF];
		this.anInt3388 = -this.anInt3385;
		this.anInt3382 = this.anInt3379 = this.anInt3384 = this.anInt3381 = this.anInt3380 = this.anInt3387 = this.anInt3377 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	@Override
	public void method3585(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5_Sub9_Sub12.anIntArray170[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub9_Sub12.anIntArray169[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3384;
		@Pc(17) int local17 = this.anInt3383;
		@Pc(20) int local20 = this.anInt3381;
		@Pc(23) int local23 = this.anInt3380;
		this.anInt3384 = local14 * local5 - this.anInt3388 * local11 >> 15;
		this.anInt3388 = local14 * local11 + this.anInt3388 * local5 >> 15;
		this.anInt3383 = local17 * local5 - this.anInt3387 * local11 >> 15;
		this.anInt3387 = local17 * local11 + this.anInt3387 * local5 >> 15;
		this.anInt3381 = local20 * local5 - this.anInt3386 * local11 >> 15;
		this.anInt3386 = local20 * local11 + this.anInt3386 * local5 >> 15;
		this.anInt3380 = local23 * local5 - this.anInt3377 * local11 >> 15;
		this.anInt3377 = local23 * local11 + this.anInt3377 * local5 >> 15;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method3598(@OriginalArg(0) Class112 arg0) {
		@Pc(2) Class112_Sub1 local2 = (Class112_Sub1) arg0;
		this.anInt3378 = local2.anInt3378;
		this.anInt3382 = local2.anInt3382;
		this.anInt3385 = local2.anInt3385;
		this.anInt3379 = local2.anInt3379;
		this.anInt3384 = local2.anInt3384;
		this.anInt3383 = local2.anInt3383;
		this.anInt3381 = local2.anInt3381;
		this.anInt3380 = local2.anInt3380;
		this.anInt3388 = local2.anInt3388;
		this.anInt3387 = local2.anInt3387;
		this.anInt3386 = local2.anInt3386;
		this.anInt3377 = local2.anInt3377;
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V")
	@Override
	public void method3597(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5_Sub9_Sub12.anIntArray170[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub9_Sub12.anIntArray169[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3378;
		@Pc(17) int local17 = this.anInt3382;
		@Pc(20) int local20 = this.anInt3385;
		@Pc(23) int local23 = this.anInt3379;
		this.anInt3378 = local14 * local5 + this.anInt3388 * local11 >> 15;
		this.anInt3388 = this.anInt3388 * local5 - local14 * local11 >> 15;
		this.anInt3382 = local17 * local5 + this.anInt3387 * local11 >> 15;
		this.anInt3387 = this.anInt3387 * local5 - local17 * local11 >> 15;
		this.anInt3385 = local20 * local5 + this.anInt3386 * local11 >> 15;
		this.anInt3386 = this.anInt3386 * local5 - local20 * local11 >> 15;
		this.anInt3379 = local23 * local5 + this.anInt3377 * local11 >> 15;
		this.anInt3377 = this.anInt3377 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)V")
	@Override
	public void method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3379 += arg0;
		this.anInt3380 += arg1;
		this.anInt3377 += arg2;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "()Lclient!kp;")
	public Class112_Sub1 method3131() {
		@Pc(3) Class112_Sub1 local3 = new Class112_Sub1();
		local3.anInt3378 = this.anInt3378;
		local3.anInt3382 = this.anInt3382;
		local3.anInt3385 = this.anInt3385;
		local3.anInt3379 = this.anInt3379;
		local3.anInt3384 = this.anInt3384;
		local3.anInt3383 = this.anInt3383;
		local3.anInt3381 = this.anInt3381;
		local3.anInt3380 = this.anInt3380;
		local3.anInt3388 = this.anInt3388;
		local3.anInt3387 = this.anInt3387;
		local3.anInt3386 = this.anInt3386;
		local3.anInt3377 = this.anInt3377;
		return local3;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0) {
		this.anInt3378 = 32768;
		this.anInt3383 = this.anInt3386 = Class5_Sub9_Sub12.anIntArray170[arg0 & 0x3FFF];
		this.anInt3387 = Class5_Sub9_Sub12.anIntArray169[arg0 & 0x3FFF];
		this.anInt3381 = -this.anInt3387;
		this.anInt3382 = this.anInt3385 = this.anInt3379 = this.anInt3384 = this.anInt3380 = this.anInt3388 = this.anInt3377 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
	@Override
	public void method3591() {
		this.anInt3384 = this.anInt3388 = this.anInt3382 = this.anInt3387 = this.anInt3385 = this.anInt3381 = this.anInt3379 = this.anInt3380 = this.anInt3377 = 0;
		this.anInt3378 = this.anInt3383 = this.anInt3386 = 32768;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0) {
		this.anInt3386 = 32768;
		this.anInt3378 = this.anInt3383 = Class5_Sub9_Sub12.anIntArray170[arg0 & 0x3FFF];
		this.anInt3384 = Class5_Sub9_Sub12.anIntArray169[arg0 & 0x3FFF];
		this.anInt3382 = -this.anInt3384;
		this.anInt3385 = this.anInt3379 = this.anInt3381 = this.anInt3380 = this.anInt3388 = this.anInt3387 = this.anInt3377 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class5_Sub9_Sub12.anIntArray170[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub9_Sub12.anIntArray169[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class5_Sub9_Sub12.anIntArray170[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class5_Sub9_Sub12.anIntArray169[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class5_Sub9_Sub12.anIntArray170[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class5_Sub9_Sub12.anIntArray169[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3378 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3384 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3388 = local23 * local5 >> 15;
		this.anInt3382 = local5 * local35 >> 15;
		this.anInt3383 = local5 * local29 >> 15;
		this.anInt3387 = -local11;
		this.anInt3385 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3381 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3386 = local17 * local5 >> 15;
		this.anInt3379 = -arg0 * this.anInt3378 - arg1 * this.anInt3382 - arg2 * this.anInt3385 >> 15;
		this.anInt3380 = -arg0 * this.anInt3384 - arg1 * this.anInt3383 - arg2 * this.anInt3381 >> 15;
		this.anInt3377 = -arg0 * this.anInt3388 - arg1 * this.anInt3387 - arg2 * this.anInt3386 >> 15;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([I)V")
	@Override
	public void method3599(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3379;
		@Pc(13) int local13 = arg0[1] - this.anInt3380;
		@Pc(20) int local20 = arg0[2] - this.anInt3377;
		arg0[0] = this.anInt3378 * local6 + this.anInt3384 * local13 + this.anInt3388 * local20 >> 15;
		arg0[1] = this.anInt3382 * local6 + this.anInt3383 * local13 + this.anInt3387 * local20 >> 15;
		arg0[2] = this.anInt3385 * local6 + this.anInt3381 * local13 + this.anInt3386 * local20 >> 15;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3379 + (this.anInt3378 * arg0 + this.anInt3382 * arg1 + this.anInt3385 * arg2 >> 15);
		arg3[1] = this.anInt3380 + (this.anInt3384 * arg0 + this.anInt3383 * arg1 + this.anInt3381 * arg2 >> 15);
		arg3[2] = this.anInt3377 + (this.anInt3388 * arg0 + this.anInt3387 * arg1 + this.anInt3386 * arg2 >> 15);
	}
}
