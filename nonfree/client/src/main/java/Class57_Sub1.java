import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public int anInt1962;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public int anInt1963;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	public int anInt1964;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt1965;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	public int anInt1966;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	public int anInt1967;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt1969;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	public int anInt1970;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	public int anInt1972;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	public int anInt1973;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class57_Sub1() {
		this.method4193();
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
	@Override
	public void method4196(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class118_Sub1.anIntArray317[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class118_Sub1.anIntArray314[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1963;
		@Pc(17) int local17 = this.anInt1964;
		@Pc(20) int local20 = this.anInt1971;
		@Pc(23) int local23 = this.anInt1973;
		this.anInt1963 = local14 * local5 - this.anInt1965 * local11 >> 15;
		this.anInt1965 = local14 * local11 + this.anInt1965 * local5 >> 15;
		this.anInt1964 = local17 * local5 - this.anInt1966 * local11 >> 15;
		this.anInt1966 = local17 * local11 + this.anInt1966 * local5 >> 15;
		this.anInt1971 = local20 * local5 - this.anInt1968 * local11 >> 15;
		this.anInt1968 = local20 * local11 + this.anInt1968 * local5 >> 15;
		this.anInt1973 = local23 * local5 - this.anInt1967 * local11 >> 15;
		this.anInt1967 = local23 * local11 + this.anInt1967 * local5 >> 15;
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
	@Override
	public void method4199(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class118_Sub1.anIntArray317[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class118_Sub1.anIntArray314[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1970;
		@Pc(17) int local17 = this.anInt1972;
		@Pc(20) int local20 = this.anInt1962;
		@Pc(23) int local23 = this.anInt1969;
		this.anInt1970 = local14 * local5 + this.anInt1965 * local11 >> 15;
		this.anInt1965 = this.anInt1965 * local5 - local14 * local11 >> 15;
		this.anInt1972 = local17 * local5 + this.anInt1966 * local11 >> 15;
		this.anInt1966 = this.anInt1966 * local5 - local17 * local11 >> 15;
		this.anInt1962 = local20 * local5 + this.anInt1968 * local11 >> 15;
		this.anInt1968 = this.anInt1968 * local5 - local20 * local11 >> 15;
		this.anInt1969 = local23 * local5 + this.anInt1967 * local11 >> 15;
		this.anInt1967 = this.anInt1967 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!s;)V")
	@Override
	public void method4195(@OriginalArg(0) Class57 arg0) {
		@Pc(2) Class57_Sub1 local2 = (Class57_Sub1) arg0;
		this.anInt1970 = local2.anInt1970;
		this.anInt1972 = local2.anInt1972;
		this.anInt1962 = local2.anInt1962;
		this.anInt1969 = local2.anInt1969;
		this.anInt1963 = local2.anInt1963;
		this.anInt1964 = local2.anInt1964;
		this.anInt1971 = local2.anInt1971;
		this.anInt1973 = local2.anInt1973;
		this.anInt1965 = local2.anInt1965;
		this.anInt1966 = local2.anInt1966;
		this.anInt1968 = local2.anInt1968;
		this.anInt1967 = local2.anInt1967;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()Lclient!el;")
	public Class57_Sub1 method1787() {
		@Pc(3) Class57_Sub1 local3 = new Class57_Sub1();
		local3.anInt1970 = this.anInt1970;
		local3.anInt1972 = this.anInt1972;
		local3.anInt1962 = this.anInt1962;
		local3.anInt1969 = this.anInt1969;
		local3.anInt1963 = this.anInt1963;
		local3.anInt1964 = this.anInt1964;
		local3.anInt1971 = this.anInt1971;
		local3.anInt1973 = this.anInt1973;
		local3.anInt1965 = this.anInt1965;
		local3.anInt1966 = this.anInt1966;
		local3.anInt1968 = this.anInt1968;
		local3.anInt1967 = this.anInt1967;
		return local3;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
	@Override
	public void method4193() {
		this.anInt1963 = this.anInt1965 = this.anInt1972 = this.anInt1966 = this.anInt1962 = this.anInt1971 = this.anInt1969 = this.anInt1973 = this.anInt1967 = 0;
		this.anInt1970 = this.anInt1964 = this.anInt1968 = 32768;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V")
	@Override
	public void method4201(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1969;
		@Pc(13) int local13 = arg0[1] - this.anInt1973;
		@Pc(20) int local20 = arg0[2] - this.anInt1967;
		arg0[0] = this.anInt1970 * local6 + this.anInt1963 * local13 + this.anInt1965 * local20 >> 15;
		arg0[1] = this.anInt1972 * local6 + this.anInt1964 * local13 + this.anInt1966 * local20 >> 15;
		arg0[2] = this.anInt1962 * local6 + this.anInt1971 * local13 + this.anInt1968 * local20 >> 15;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class118_Sub1.anIntArray317[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class118_Sub1.anIntArray314[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class118_Sub1.anIntArray317[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class118_Sub1.anIntArray314[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class118_Sub1.anIntArray317[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class118_Sub1.anIntArray314[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1970 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1963 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1965 = local23 * local5 >> 15;
		this.anInt1972 = local5 * local35 >> 15;
		this.anInt1964 = local5 * local29 >> 15;
		this.anInt1966 = -local11;
		this.anInt1962 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1971 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1968 = local17 * local5 >> 15;
		this.anInt1969 = -arg0 * this.anInt1970 - arg1 * this.anInt1972 - arg2 * this.anInt1962 >> 15;
		this.anInt1973 = -arg0 * this.anInt1963 - arg1 * this.anInt1964 - arg2 * this.anInt1971 >> 15;
		this.anInt1967 = -arg0 * this.anInt1965 - arg1 * this.anInt1966 - arg2 * this.anInt1968 >> 15;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	@Override
	public void method4192(@OriginalArg(0) int arg0) {
		this.anInt1964 = 32768;
		this.anInt1970 = this.anInt1968 = Class118_Sub1.anIntArray317[arg0 & 0x3FFF];
		this.anInt1962 = Class118_Sub1.anIntArray314[arg0 & 0x3FFF];
		this.anInt1965 = -this.anInt1962;
		this.anInt1972 = this.anInt1969 = this.anInt1963 = this.anInt1971 = this.anInt1973 = this.anInt1966 = this.anInt1967 = 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	@Override
	public void method4189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1963 = this.anInt1965 = this.anInt1972 = this.anInt1966 = this.anInt1962 = this.anInt1971 = 0;
		this.anInt1970 = this.anInt1964 = this.anInt1968 = 32768;
		this.anInt1969 = arg0;
		this.anInt1973 = arg1;
		this.anInt1967 = arg2;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public void method4187(@OriginalArg(0) int arg0) {
		this.anInt1970 = 32768;
		this.anInt1964 = this.anInt1968 = Class118_Sub1.anIntArray317[arg0 & 0x3FFF];
		this.anInt1966 = Class118_Sub1.anIntArray314[arg0 & 0x3FFF];
		this.anInt1971 = -this.anInt1966;
		this.anInt1972 = this.anInt1962 = this.anInt1969 = this.anInt1963 = this.anInt1973 = this.anInt1965 = this.anInt1967 = 0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
	@Override
	public void method4190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1969 += arg0;
		this.anInt1973 += arg1;
		this.anInt1967 += arg2;
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
	@Override
	public void method4200(@OriginalArg(0) int arg0) {
		this.anInt1968 = 32768;
		this.anInt1970 = this.anInt1964 = Class118_Sub1.anIntArray317[arg0 & 0x3FFF];
		this.anInt1963 = Class118_Sub1.anIntArray314[arg0 & 0x3FFF];
		this.anInt1972 = -this.anInt1963;
		this.anInt1962 = this.anInt1969 = this.anInt1971 = this.anInt1973 = this.anInt1965 = this.anInt1966 = this.anInt1967 = 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1969 + (this.anInt1970 * arg0 + this.anInt1972 * arg1 + this.anInt1962 * arg2 >> 15);
		arg3[1] = this.anInt1973 + (this.anInt1963 * arg0 + this.anInt1964 * arg1 + this.anInt1971 * arg2 >> 15);
		arg3[2] = this.anInt1967 + (this.anInt1965 * arg0 + this.anInt1966 * arg1 + this.anInt1968 * arg2 >> 15);
	}
}
