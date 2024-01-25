import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public int anInt2516;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public int anInt2518;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public int anInt2520;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	public int anInt2523;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	public int anInt2524;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
	public int anInt2525;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
	public int anInt2526;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	public int anInt2527;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class93_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2518 += arg0;
		this.anInt2517 += arg1;
		this.anInt2526 += arg2;
	}

	@OriginalMember(owner = "client!eq", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class22.anIntArray19[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class22.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2516;
		@Pc(17) int local17 = this.anInt2519;
		@Pc(20) int local20 = this.anInt2521;
		@Pc(23) int local23 = this.anInt2517;
		this.anInt2516 = local14 * local5 - this.anInt2527 * local11 >> 14;
		this.anInt2527 = local14 * local11 + this.anInt2527 * local5 >> 14;
		this.anInt2519 = local17 * local5 - this.anInt2523 * local11 >> 14;
		this.anInt2523 = local17 * local11 + this.anInt2523 * local5 >> 14;
		this.anInt2521 = local20 * local5 - this.anInt2520 * local11 >> 14;
		this.anInt2520 = local20 * local11 + this.anInt2520 * local5 >> 14;
		this.anInt2517 = local23 * local5 - this.anInt2526 * local11 >> 14;
		this.anInt2526 = local23 * local11 + this.anInt2526 * local5 >> 14;
	}

	@OriginalMember(owner = "client!eq", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2522 * arg0 + this.anInt2524 * arg1 + this.anInt2525 * arg2 >> 14;
		arg3[1] = this.anInt2516 * arg0 + this.anInt2519 * arg1 + this.anInt2521 * arg2 >> 14;
		arg3[2] = this.anInt2527 * arg0 + this.anInt2523 * arg1 + this.anInt2520 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!eq", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2516 = this.anInt2527 = this.anInt2524 = this.anInt2523 = this.anInt2525 = this.anInt2521 = 0;
		this.anInt2522 = this.anInt2519 = this.anInt2520 = 16384;
		this.anInt2518 = arg0;
		this.anInt2517 = arg1;
		this.anInt2526 = arg2;
	}

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2518;
		@Pc(13) int local13 = arg0[1] - this.anInt2517;
		@Pc(20) int local20 = arg0[2] - this.anInt2526;
		arg0[0] = this.anInt2522 * local6 + this.anInt2516 * local13 + this.anInt2527 * local20 >> 14;
		arg0[1] = this.anInt2524 * local6 + this.anInt2519 * local13 + this.anInt2523 * local20 >> 14;
		arg0[2] = this.anInt2525 * local6 + this.anInt2521 * local13 + this.anInt2520 * local20 >> 14;
	}

	@OriginalMember(owner = "client!eq", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class22.anIntArray19[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class22.anIntArray20[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class22.anIntArray19[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class22.anIntArray20[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class22.anIntArray19[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class22.anIntArray20[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt2522 = local17 * local29 + local23 * local47 >> 14;
		this.anInt2516 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt2527 = local23 * local5 >> 14;
		this.anInt2524 = local5 * local35 >> 14;
		this.anInt2519 = local5 * local29 >> 14;
		this.anInt2523 = -local11;
		this.anInt2525 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt2521 = local23 * local35 + local17 * local41 >> 14;
		this.anInt2520 = local17 * local5 >> 14;
		this.anInt2518 = -arg0 * this.anInt2522 - arg1 * this.anInt2524 - arg2 * this.anInt2525 >> 14;
		this.anInt2517 = -arg0 * this.anInt2516 - arg1 * this.anInt2519 - arg2 * this.anInt2521 >> 14;
		this.anInt2526 = -arg0 * this.anInt2527 - arg1 * this.anInt2523 - arg2 * this.anInt2520 >> 14;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2518 + (this.anInt2522 * arg0 + this.anInt2524 * arg1 + this.anInt2525 * arg2 >> 14);
		arg3[1] = this.anInt2517 + (this.anInt2516 * arg0 + this.anInt2519 * arg1 + this.anInt2521 * arg2 >> 14);
		arg3[2] = this.anInt2526 + (this.anInt2527 * arg0 + this.anInt2523 * arg1 + this.anInt2520 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!eq", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt2520 = 16384;
		this.anInt2522 = this.anInt2519 = Class22.anIntArray19[arg0 & 0x3FFF];
		this.anInt2516 = Class22.anIntArray20[arg0 & 0x3FFF];
		this.anInt2524 = -this.anInt2516;
		this.anInt2525 = this.anInt2518 = this.anInt2521 = this.anInt2517 = this.anInt2527 = this.anInt2523 = this.anInt2526 = 0;
	}

	@OriginalMember(owner = "client!eq", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt2522 = 16384;
		this.anInt2519 = this.anInt2520 = Class22.anIntArray19[arg0 & 0x3FFF];
		this.anInt2523 = Class22.anIntArray20[arg0 & 0x3FFF];
		this.anInt2521 = -this.anInt2523;
		this.anInt2524 = this.anInt2525 = this.anInt2518 = this.anInt2516 = this.anInt2517 = this.anInt2527 = this.anInt2526 = 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt2519 = 16384;
		this.anInt2522 = this.anInt2520 = Class22.anIntArray19[arg0 & 0x3FFF];
		this.anInt2525 = Class22.anIntArray20[arg0 & 0x3FFF];
		this.anInt2527 = -this.anInt2525;
		this.anInt2524 = this.anInt2518 = this.anInt2516 = this.anInt2521 = this.anInt2517 = this.anInt2523 = this.anInt2526 = 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7795() {
		@Pc(3) Class93_Sub1 local3 = new Class93_Sub1();
		local3.anInt2522 = this.anInt2522;
		local3.anInt2524 = this.anInt2524;
		local3.anInt2525 = this.anInt2525;
		local3.anInt2518 = this.anInt2518;
		local3.anInt2516 = this.anInt2516;
		local3.anInt2519 = this.anInt2519;
		local3.anInt2521 = this.anInt2521;
		local3.anInt2517 = this.anInt2517;
		local3.anInt2527 = this.anInt2527;
		local3.anInt2523 = this.anInt2523;
		local3.anInt2520 = this.anInt2520;
		local3.anInt2526 = this.anInt2526;
		return local3;
	}

	@OriginalMember(owner = "client!eq", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt2516 = this.anInt2527 = this.anInt2524 = this.anInt2523 = this.anInt2525 = this.anInt2521 = this.anInt2518 = this.anInt2517 = this.anInt2526 = 0;
		this.anInt2522 = this.anInt2519 = this.anInt2520 = 16384;
	}

	@OriginalMember(owner = "client!eq", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class22.anIntArray19[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class22.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2522;
		@Pc(17) int local17 = this.anInt2524;
		@Pc(20) int local20 = this.anInt2525;
		@Pc(23) int local23 = this.anInt2518;
		this.anInt2522 = local14 * local5 + this.anInt2527 * local11 >> 14;
		this.anInt2527 = this.anInt2527 * local5 - local14 * local11 >> 14;
		this.anInt2524 = local17 * local5 + this.anInt2523 * local11 >> 14;
		this.anInt2523 = this.anInt2523 * local5 - local17 * local11 >> 14;
		this.anInt2525 = local20 * local5 + this.anInt2520 * local11 >> 14;
		this.anInt2520 = this.anInt2520 * local5 - local20 * local11 >> 14;
		this.anInt2518 = local23 * local5 + this.anInt2526 * local11 >> 14;
		this.anInt2526 = this.anInt2526 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!eq", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class93 arg0) {
		@Pc(2) Class93_Sub1 local2 = (Class93_Sub1) arg0;
		this.anInt2522 = local2.anInt2522;
		this.anInt2524 = local2.anInt2524;
		this.anInt2525 = local2.anInt2525;
		this.anInt2518 = local2.anInt2518;
		this.anInt2516 = local2.anInt2516;
		this.anInt2519 = local2.anInt2519;
		this.anInt2521 = local2.anInt2521;
		this.anInt2517 = local2.anInt2517;
		this.anInt2527 = local2.anInt2527;
		this.anInt2523 = local2.anInt2523;
		this.anInt2520 = local2.anInt2520;
		this.anInt2526 = local2.anInt2526;
	}
}
