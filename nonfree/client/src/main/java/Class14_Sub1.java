import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public int anInt498;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public int anInt499;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 177)
	public Class14_Sub1() {
		this.method3933();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([I)V", line = 7)
	@Override
	public void method3936(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt498;
		@Pc(13) int local13 = arg0[1] - this.anInt496;
		@Pc(20) int local20 = arg0[2] - this.anInt501;
		arg0[0] = this.anInt505 * local6 + this.anInt507 * local13 + this.anInt504 * local20 >> 15;
		arg0[1] = this.anInt500 * local6 + this.anInt506 * local13 + this.anInt502 * local20 >> 15;
		arg0[2] = this.anInt497 * local6 + this.anInt499 * local13 + this.anInt503 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 17)
	@Override
	public void method3932(@OriginalArg(0) int arg0) {
		this.anInt503 = 32768;
		this.anInt505 = this.anInt506 = Class19.anIntArray177[arg0 & 0x3FFF];
		this.anInt507 = Class19.anIntArray178[arg0 & 0x3FFF];
		this.anInt500 = -this.anInt507;
		this.anInt497 = this.anInt498 = this.anInt499 = this.anInt496 = this.anInt504 = this.anInt502 = this.anInt501 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()V", line = 24)
	@Override
	public void method3933() {
		this.anInt507 = this.anInt504 = this.anInt500 = this.anInt502 = this.anInt497 = this.anInt499 = this.anInt498 = this.anInt496 = this.anInt501 = 0;
		this.anInt505 = this.anInt506 = this.anInt503 = 32768;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII)V", line = 32)
	@Override
	public void method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class19.anIntArray177[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray178[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class19.anIntArray177[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class19.anIntArray178[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class19.anIntArray177[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class19.anIntArray178[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt505 = local17 * local29 + local23 * local47 >> 15;
		this.anInt507 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt504 = local23 * local5 >> 15;
		this.anInt500 = local5 * local35 >> 15;
		this.anInt506 = local5 * local29 >> 15;
		this.anInt502 = -local11;
		this.anInt497 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt499 = local23 * local35 + local17 * local41 >> 15;
		this.anInt503 = local17 * local5 >> 15;
		this.anInt498 = -arg0 * this.anInt505 - arg1 * this.anInt500 - arg2 * this.anInt497 >> 15;
		this.anInt496 = -arg0 * this.anInt507 - arg1 * this.anInt506 - arg2 * this.anInt499 >> 15;
		this.anInt501 = -arg0 * this.anInt504 - arg1 * this.anInt502 - arg2 * this.anInt503 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 61)
	@Override
	public void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt507 = this.anInt504 = this.anInt500 = this.anInt502 = this.anInt497 = this.anInt499 = 0;
		this.anInt505 = this.anInt506 = this.anInt503 = 32768;
		this.anInt498 = arg0;
		this.anInt496 = arg1;
		this.anInt501 = arg2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 70)
	@Override
	public void method3926(@OriginalArg(0) int arg0) {
		this.anInt506 = 32768;
		this.anInt505 = this.anInt503 = Class19.anIntArray177[arg0 & 0x3FFF];
		this.anInt497 = Class19.anIntArray178[arg0 & 0x3FFF];
		this.anInt504 = -this.anInt497;
		this.anInt500 = this.anInt498 = this.anInt507 = this.anInt499 = this.anInt496 = this.anInt502 = this.anInt501 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 78)
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class19.anIntArray177[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray178[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt507;
		@Pc(17) int local17 = this.anInt506;
		@Pc(20) int local20 = this.anInt499;
		@Pc(23) int local23 = this.anInt496;
		this.anInt507 = local14 * local5 - this.anInt504 * local11 >> 15;
		this.anInt504 = local14 * local11 + this.anInt504 * local5 >> 15;
		this.anInt506 = local17 * local5 - this.anInt502 * local11 >> 15;
		this.anInt502 = local17 * local11 + this.anInt502 * local5 >> 15;
		this.anInt499 = local20 * local5 - this.anInt503 * local11 >> 15;
		this.anInt503 = local20 * local11 + this.anInt503 * local5 >> 15;
		this.anInt496 = local23 * local5 - this.anInt501 * local11 >> 15;
		this.anInt501 = local23 * local11 + this.anInt501 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!on;)V", line = 100)
	@Override
	public void method3925(@OriginalArg(0) Class14 arg0) {
		@Pc(2) Class14_Sub1 local2 = (Class14_Sub1) arg0;
		this.anInt505 = local2.anInt505;
		this.anInt500 = local2.anInt500;
		this.anInt497 = local2.anInt497;
		this.anInt498 = local2.anInt498;
		this.anInt507 = local2.anInt507;
		this.anInt506 = local2.anInt506;
		this.anInt499 = local2.anInt499;
		this.anInt496 = local2.anInt496;
		this.anInt504 = local2.anInt504;
		this.anInt502 = local2.anInt502;
		this.anInt503 = local2.anInt503;
		this.anInt501 = local2.anInt501;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 118)
	@Override
	public void method3934(@OriginalArg(0) int arg0) {
		this.anInt505 = 32768;
		this.anInt506 = this.anInt503 = Class19.anIntArray177[arg0 & 0x3FFF];
		this.anInt502 = Class19.anIntArray178[arg0 & 0x3FFF];
		this.anInt499 = -this.anInt502;
		this.anInt500 = this.anInt497 = this.anInt498 = this.anInt507 = this.anInt496 = this.anInt504 = this.anInt501 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V", line = 125)
	@Override
	public void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt498 += arg0;
		this.anInt496 += arg1;
		this.anInt501 += arg2;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 132)
	@Override
	public void method3927(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class19.anIntArray177[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray178[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt505;
		@Pc(17) int local17 = this.anInt500;
		@Pc(20) int local20 = this.anInt497;
		@Pc(23) int local23 = this.anInt498;
		this.anInt505 = local14 * local5 + this.anInt504 * local11 >> 15;
		this.anInt504 = this.anInt504 * local5 - local14 * local11 >> 15;
		this.anInt500 = local17 * local5 + this.anInt502 * local11 >> 15;
		this.anInt502 = this.anInt502 * local5 - local17 * local11 >> 15;
		this.anInt497 = local20 * local5 + this.anInt503 * local11 >> 15;
		this.anInt503 = this.anInt503 * local5 - local20 * local11 >> 15;
		this.anInt498 = local23 * local5 + this.anInt501 * local11 >> 15;
		this.anInt501 = this.anInt501 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[I)V", line = 153)
	@Override
	public void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt498 + (this.anInt505 * arg0 + this.anInt500 * arg1 + this.anInt497 * arg2 >> 15);
		arg3[1] = this.anInt496 + (this.anInt507 * arg0 + this.anInt506 * arg1 + this.anInt499 * arg2 >> 15);
		arg3[2] = this.anInt501 + (this.anInt504 * arg0 + this.anInt502 * arg1 + this.anInt503 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lclient!ba;", line = 162)
	public Class14_Sub1 method531() {
		@Pc(3) Class14_Sub1 local3 = new Class14_Sub1();
		local3.anInt505 = this.anInt505;
		local3.anInt500 = this.anInt500;
		local3.anInt497 = this.anInt497;
		local3.anInt498 = this.anInt498;
		local3.anInt507 = this.anInt507;
		local3.anInt506 = this.anInt506;
		local3.anInt499 = this.anInt499;
		local3.anInt496 = this.anInt496;
		local3.anInt504 = this.anInt504;
		local3.anInt502 = this.anInt502;
		local3.anInt503 = this.anInt503;
		local3.anInt501 = this.anInt501;
		return local3;
	}
}
