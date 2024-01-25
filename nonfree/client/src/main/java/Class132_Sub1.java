import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public int anInt3312;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public int anInt3313;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	public int anInt3317;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public int anInt3318;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public int anInt3319;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
	public int anInt3320;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
	public int anInt3321;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
	public int anInt3322;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class132_Sub1() {
		this.method3978();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()V")
	@Override
	public void method3978() {
		this.anInt3318 = this.anInt3321 = this.anInt3312 = this.anInt3317 = this.anInt3320 = this.anInt3313 = this.anInt3319 = this.anInt3314 = this.anInt3316 = 0;
		this.anInt3322 = this.anInt3323 = this.anInt3315 = 32768;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method3982(@OriginalArg(0) Class132 arg0) {
		@Pc(2) Class132_Sub1 local2 = (Class132_Sub1) arg0;
		this.anInt3322 = local2.anInt3322;
		this.anInt3312 = local2.anInt3312;
		this.anInt3320 = local2.anInt3320;
		this.anInt3319 = local2.anInt3319;
		this.anInt3318 = local2.anInt3318;
		this.anInt3323 = local2.anInt3323;
		this.anInt3313 = local2.anInt3313;
		this.anInt3314 = local2.anInt3314;
		this.anInt3321 = local2.anInt3321;
		this.anInt3317 = local2.anInt3317;
		this.anInt3315 = local2.anInt3315;
		this.anInt3316 = local2.anInt3316;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3319 + (this.anInt3322 * arg0 + this.anInt3312 * arg1 + this.anInt3320 * arg2 >> 15);
		arg3[1] = this.anInt3314 + (this.anInt3318 * arg0 + this.anInt3323 * arg1 + this.anInt3313 * arg2 >> 15);
		arg3[2] = this.anInt3316 + (this.anInt3321 * arg0 + this.anInt3317 * arg1 + this.anInt3315 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(III)V")
	@Override
	public void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3318 = this.anInt3321 = this.anInt3312 = this.anInt3317 = this.anInt3320 = this.anInt3313 = 0;
		this.anInt3322 = this.anInt3323 = this.anInt3315 = 32768;
		this.anInt3319 = arg0;
		this.anInt3314 = arg1;
		this.anInt3316 = arg2;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(III)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3319 += arg0;
		this.anInt3314 += arg1;
		this.anInt3316 += arg2;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
	@Override
	public void method3983(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class6_Sub1_Sub18.anIntArray643[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub1_Sub18.anIntArray642[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3318;
		@Pc(17) int local17 = this.anInt3323;
		@Pc(20) int local20 = this.anInt3313;
		@Pc(23) int local23 = this.anInt3314;
		this.anInt3318 = local14 * local5 - this.anInt3321 * local11 >> 15;
		this.anInt3321 = local14 * local11 + this.anInt3321 * local5 >> 15;
		this.anInt3323 = local17 * local5 - this.anInt3317 * local11 >> 15;
		this.anInt3317 = local17 * local11 + this.anInt3317 * local5 >> 15;
		this.anInt3313 = local20 * local5 - this.anInt3315 * local11 >> 15;
		this.anInt3315 = local20 * local11 + this.anInt3315 * local5 >> 15;
		this.anInt3314 = local23 * local5 - this.anInt3316 * local11 >> 15;
		this.anInt3316 = local23 * local11 + this.anInt3316 * local5 >> 15;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method3976(@OriginalArg(0) int arg0) {
		this.anInt3323 = 32768;
		this.anInt3322 = this.anInt3315 = Class6_Sub1_Sub18.anIntArray643[arg0 & 0x3FFF];
		this.anInt3320 = Class6_Sub1_Sub18.anIntArray642[arg0 & 0x3FFF];
		this.anInt3321 = -this.anInt3320;
		this.anInt3312 = this.anInt3319 = this.anInt3318 = this.anInt3313 = this.anInt3314 = this.anInt3317 = this.anInt3316 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
	@Override
	public void method3987(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class6_Sub1_Sub18.anIntArray643[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub1_Sub18.anIntArray642[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3322;
		@Pc(17) int local17 = this.anInt3312;
		@Pc(20) int local20 = this.anInt3320;
		@Pc(23) int local23 = this.anInt3319;
		this.anInt3322 = local14 * local5 + this.anInt3321 * local11 >> 15;
		this.anInt3321 = this.anInt3321 * local5 - local14 * local11 >> 15;
		this.anInt3312 = local17 * local5 + this.anInt3317 * local11 >> 15;
		this.anInt3317 = this.anInt3317 * local5 - local17 * local11 >> 15;
		this.anInt3320 = local20 * local5 + this.anInt3315 * local11 >> 15;
		this.anInt3315 = this.anInt3315 * local5 - local20 * local11 >> 15;
		this.anInt3319 = local23 * local5 + this.anInt3316 * local11 >> 15;
		this.anInt3316 = this.anInt3316 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class6_Sub1_Sub18.anIntArray643[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub1_Sub18.anIntArray642[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class6_Sub1_Sub18.anIntArray643[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class6_Sub1_Sub18.anIntArray642[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class6_Sub1_Sub18.anIntArray643[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class6_Sub1_Sub18.anIntArray642[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3322 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3318 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3321 = local23 * local5 >> 15;
		this.anInt3312 = local5 * local35 >> 15;
		this.anInt3323 = local5 * local29 >> 15;
		this.anInt3317 = -local11;
		this.anInt3320 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3313 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3315 = local17 * local5 >> 15;
		this.anInt3319 = -arg0 * this.anInt3322 - arg1 * this.anInt3312 - arg2 * this.anInt3320 >> 15;
		this.anInt3314 = -arg0 * this.anInt3318 - arg1 * this.anInt3323 - arg2 * this.anInt3313 >> 15;
		this.anInt3316 = -arg0 * this.anInt3321 - arg1 * this.anInt3317 - arg2 * this.anInt3315 >> 15;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3322 * arg0 + this.anInt3312 * arg1 + this.anInt3320 * arg2 >> 15;
		arg3[1] = this.anInt3318 * arg0 + this.anInt3323 * arg1 + this.anInt3313 * arg2 >> 15;
		arg3[2] = this.anInt3321 * arg0 + this.anInt3317 * arg1 + this.anInt3315 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method3980(@OriginalArg(0) int arg0) {
		this.anInt3322 = 32768;
		this.anInt3323 = this.anInt3315 = Class6_Sub1_Sub18.anIntArray643[arg0 & 0x3FFF];
		this.anInt3317 = Class6_Sub1_Sub18.anIntArray642[arg0 & 0x3FFF];
		this.anInt3313 = -this.anInt3317;
		this.anInt3312 = this.anInt3320 = this.anInt3319 = this.anInt3318 = this.anInt3314 = this.anInt3321 = this.anInt3316 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	@Override
	public void method3979(@OriginalArg(0) int arg0) {
		this.anInt3315 = 32768;
		this.anInt3322 = this.anInt3323 = Class6_Sub1_Sub18.anIntArray643[arg0 & 0x3FFF];
		this.anInt3318 = Class6_Sub1_Sub18.anIntArray642[arg0 & 0x3FFF];
		this.anInt3312 = -this.anInt3318;
		this.anInt3320 = this.anInt3319 = this.anInt3313 = this.anInt3314 = this.anInt3321 = this.anInt3317 = this.anInt3316 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()Lclient!ql;")
	public Class132 method2982() {
		@Pc(3) Class132_Sub1 local3 = new Class132_Sub1();
		local3.anInt3322 = this.anInt3322;
		local3.anInt3312 = this.anInt3312;
		local3.anInt3320 = this.anInt3320;
		local3.anInt3319 = this.anInt3319;
		local3.anInt3318 = this.anInt3318;
		local3.anInt3323 = this.anInt3323;
		local3.anInt3313 = this.anInt3313;
		local3.anInt3314 = this.anInt3314;
		local3.anInt3321 = this.anInt3321;
		local3.anInt3317 = this.anInt3317;
		local3.anInt3315 = this.anInt3315;
		local3.anInt3316 = this.anInt3316;
		return local3;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([I)V")
	@Override
	public void method3989(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3319;
		@Pc(13) int local13 = arg0[1] - this.anInt3314;
		@Pc(20) int local20 = arg0[2] - this.anInt3316;
		arg0[0] = this.anInt3322 * local6 + this.anInt3318 * local13 + this.anInt3321 * local20 >> 15;
		arg0[1] = this.anInt3312 * local6 + this.anInt3323 * local13 + this.anInt3317 * local20 >> 15;
		arg0[2] = this.anInt3320 * local6 + this.anInt3313 * local13 + this.anInt3315 * local20 >> 15;
	}
}
