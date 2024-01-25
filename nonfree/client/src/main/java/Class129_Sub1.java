import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public int anInt4560;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public int anInt4561;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
	public int anInt4563;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
	public int anInt4564;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public int anInt4565;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
	public int anInt4567;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	public int anInt4568;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
	public int anInt4569;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
	public int anInt4571;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class129_Sub1() {
		this.method5779();
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	@Override
	public void method5783(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class208.anIntArray478[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class208.anIntArray479[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4570;
		@Pc(17) int local17 = this.anInt4569;
		@Pc(20) int local20 = this.anInt4567;
		@Pc(23) int local23 = this.anInt4564;
		this.anInt4570 = local14 * local5 + this.anInt4565 * local11 >> 15;
		this.anInt4565 = this.anInt4565 * local5 - local14 * local11 >> 15;
		this.anInt4569 = local17 * local5 + this.anInt4563 * local11 >> 15;
		this.anInt4563 = this.anInt4563 * local5 - local17 * local11 >> 15;
		this.anInt4567 = local20 * local5 + this.anInt4568 * local11 >> 15;
		this.anInt4568 = this.anInt4568 * local5 - local20 * local11 >> 15;
		this.anInt4564 = local23 * local5 + this.anInt4562 * local11 >> 15;
		this.anInt4562 = this.anInt4562 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class208.anIntArray478[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class208.anIntArray479[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class208.anIntArray478[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class208.anIntArray479[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class208.anIntArray478[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class208.anIntArray479[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4570 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4571 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4565 = local23 * local5 >> 15;
		this.anInt4569 = local5 * local35 >> 15;
		this.anInt4560 = local5 * local29 >> 15;
		this.anInt4563 = -local11;
		this.anInt4567 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4561 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4568 = local17 * local5 >> 15;
		this.anInt4564 = -arg0 * this.anInt4570 - arg1 * this.anInt4569 - arg2 * this.anInt4567 >> 15;
		this.anInt4566 = -arg0 * this.anInt4571 - arg1 * this.anInt4560 - arg2 * this.anInt4561 >> 15;
		this.anInt4562 = -arg0 * this.anInt4565 - arg1 * this.anInt4563 - arg2 * this.anInt4568 >> 15;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V")
	@Override
	public void method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4564 += arg0;
		this.anInt4566 += arg1;
		this.anInt4562 += arg2;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()Lclient!oi;")
	public Class129_Sub1 method4211() {
		@Pc(3) Class129_Sub1 local3 = new Class129_Sub1();
		local3.anInt4570 = this.anInt4570;
		local3.anInt4569 = this.anInt4569;
		local3.anInt4567 = this.anInt4567;
		local3.anInt4564 = this.anInt4564;
		local3.anInt4571 = this.anInt4571;
		local3.anInt4560 = this.anInt4560;
		local3.anInt4561 = this.anInt4561;
		local3.anInt4566 = this.anInt4566;
		local3.anInt4565 = this.anInt4565;
		local3.anInt4563 = this.anInt4563;
		local3.anInt4568 = this.anInt4568;
		local3.anInt4562 = this.anInt4562;
		return local3;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([I)V")
	@Override
	public void method5785(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4564;
		@Pc(13) int local13 = arg0[1] - this.anInt4566;
		@Pc(20) int local20 = arg0[2] - this.anInt4562;
		arg0[0] = this.anInt4570 * local6 + this.anInt4571 * local13 + this.anInt4565 * local20 >> 15;
		arg0[1] = this.anInt4569 * local6 + this.anInt4560 * local13 + this.anInt4563 * local20 >> 15;
		arg0[2] = this.anInt4567 * local6 + this.anInt4561 * local13 + this.anInt4568 * local20 >> 15;
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	@Override
	public void method5788(@OriginalArg(0) int arg0) {
		this.anInt4570 = 32768;
		this.anInt4560 = this.anInt4568 = Class208.anIntArray478[arg0 & 0x3FFF];
		this.anInt4563 = Class208.anIntArray479[arg0 & 0x3FFF];
		this.anInt4561 = -this.anInt4563;
		this.anInt4569 = this.anInt4567 = this.anInt4564 = this.anInt4571 = this.anInt4566 = this.anInt4565 = this.anInt4562 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	@Override
	public void method5779() {
		this.anInt4571 = this.anInt4565 = this.anInt4569 = this.anInt4563 = this.anInt4567 = this.anInt4561 = this.anInt4564 = this.anInt4566 = this.anInt4562 = 0;
		this.anInt4570 = this.anInt4560 = this.anInt4568 = 32768;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
	@Override
	public void method5787(@OriginalArg(0) int arg0) {
		this.anInt4560 = 32768;
		this.anInt4570 = this.anInt4568 = Class208.anIntArray478[arg0 & 0x3FFF];
		this.anInt4567 = Class208.anIntArray479[arg0 & 0x3FFF];
		this.anInt4565 = -this.anInt4567;
		this.anInt4569 = this.anInt4564 = this.anInt4571 = this.anInt4561 = this.anInt4566 = this.anInt4563 = this.anInt4562 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4564 + (this.anInt4570 * arg0 + this.anInt4569 * arg1 + this.anInt4567 * arg2 >> 15);
		arg3[1] = this.anInt4566 + (this.anInt4571 * arg0 + this.anInt4560 * arg1 + this.anInt4561 * arg2 >> 15);
		arg3[2] = this.anInt4562 + (this.anInt4565 * arg0 + this.anInt4563 * arg1 + this.anInt4568 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	@Override
	public void method5781(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class208.anIntArray478[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class208.anIntArray479[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4571;
		@Pc(17) int local17 = this.anInt4560;
		@Pc(20) int local20 = this.anInt4561;
		@Pc(23) int local23 = this.anInt4566;
		this.anInt4571 = local14 * local5 - this.anInt4565 * local11 >> 15;
		this.anInt4565 = local14 * local11 + this.anInt4565 * local5 >> 15;
		this.anInt4560 = local17 * local5 - this.anInt4563 * local11 >> 15;
		this.anInt4563 = local17 * local11 + this.anInt4563 * local5 >> 15;
		this.anInt4561 = local20 * local5 - this.anInt4568 * local11 >> 15;
		this.anInt4568 = local20 * local11 + this.anInt4568 * local5 >> 15;
		this.anInt4566 = local23 * local5 - this.anInt4562 * local11 >> 15;
		this.anInt4562 = local23 * local11 + this.anInt4562 * local5 >> 15;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	@Override
	public void method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4571 = this.anInt4565 = this.anInt4569 = this.anInt4563 = this.anInt4567 = this.anInt4561 = 0;
		this.anInt4570 = this.anInt4560 = this.anInt4568 = 32768;
		this.anInt4564 = arg0;
		this.anInt4566 = arg1;
		this.anInt4562 = arg2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method5784(@OriginalArg(0) Class129 arg0) {
		@Pc(2) Class129_Sub1 local2 = (Class129_Sub1) arg0;
		this.anInt4570 = local2.anInt4570;
		this.anInt4569 = local2.anInt4569;
		this.anInt4567 = local2.anInt4567;
		this.anInt4564 = local2.anInt4564;
		this.anInt4571 = local2.anInt4571;
		this.anInt4560 = local2.anInt4560;
		this.anInt4561 = local2.anInt4561;
		this.anInt4566 = local2.anInt4566;
		this.anInt4565 = local2.anInt4565;
		this.anInt4563 = local2.anInt4563;
		this.anInt4568 = local2.anInt4568;
		this.anInt4562 = local2.anInt4562;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	@Override
	public void method5778(@OriginalArg(0) int arg0) {
		this.anInt4568 = 32768;
		this.anInt4570 = this.anInt4560 = Class208.anIntArray478[arg0 & 0x3FFF];
		this.anInt4571 = Class208.anIntArray479[arg0 & 0x3FFF];
		this.anInt4569 = -this.anInt4571;
		this.anInt4567 = this.anInt4564 = this.anInt4561 = this.anInt4566 = this.anInt4565 = this.anInt4563 = this.anInt4562 = 0;
	}
}
