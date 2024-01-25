import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public int anInt2134;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	public int anInt2135;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	public int anInt2138;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	public int anInt2139;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class70_Sub1() {
		this.method3705();
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	@Override
	public void method3721(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class147.anIntArray603[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class147.anIntArray604[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2134;
		@Pc(17) int local17 = this.anInt2132;
		@Pc(20) int local20 = this.anInt2140;
		@Pc(23) int local23 = this.anInt2131;
		this.anInt2134 = local14 * local5 - this.anInt2129 * local11 >> 15;
		this.anInt2129 = local14 * local11 + this.anInt2129 * local5 >> 15;
		this.anInt2132 = local17 * local5 - this.anInt2136 * local11 >> 15;
		this.anInt2136 = local17 * local11 + this.anInt2136 * local5 >> 15;
		this.anInt2140 = local20 * local5 - this.anInt2138 * local11 >> 15;
		this.anInt2138 = local20 * local11 + this.anInt2138 * local5 >> 15;
		this.anInt2131 = local23 * local5 - this.anInt2130 * local11 >> 15;
		this.anInt2130 = local23 * local11 + this.anInt2130 * local5 >> 15;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	@Override
	public void method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2134 = this.anInt2129 = this.anInt2135 = this.anInt2136 = this.anInt2133 = this.anInt2140 = 0;
		this.anInt2139 = this.anInt2132 = this.anInt2138 = 32768;
		this.anInt2137 = arg0;
		this.anInt2131 = arg1;
		this.anInt2130 = arg2;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	@Override
	public void method3705() {
		this.anInt2134 = this.anInt2129 = this.anInt2135 = this.anInt2136 = this.anInt2133 = this.anInt2140 = this.anInt2137 = this.anInt2131 = this.anInt2130 = 0;
		this.anInt2139 = this.anInt2132 = this.anInt2138 = 32768;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class147.anIntArray603[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class147.anIntArray604[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class147.anIntArray603[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class147.anIntArray604[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class147.anIntArray603[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class147.anIntArray604[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2139 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2134 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2129 = local23 * local5 >> 15;
		this.anInt2135 = local5 * local35 >> 15;
		this.anInt2132 = local5 * local29 >> 15;
		this.anInt2136 = -local11;
		this.anInt2133 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2140 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2138 = local17 * local5 >> 15;
		this.anInt2137 = -arg0 * this.anInt2139 - arg1 * this.anInt2135 - arg2 * this.anInt2133 >> 15;
		this.anInt2131 = -arg0 * this.anInt2134 - arg1 * this.anInt2132 - arg2 * this.anInt2140 >> 15;
		this.anInt2130 = -arg0 * this.anInt2129 - arg1 * this.anInt2136 - arg2 * this.anInt2138 >> 15;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2137 + (this.anInt2139 * arg0 + this.anInt2135 * arg1 + this.anInt2133 * arg2 >> 15);
		arg3[1] = this.anInt2131 + (this.anInt2134 * arg0 + this.anInt2132 * arg1 + this.anInt2140 * arg2 >> 15);
		arg3[2] = this.anInt2130 + (this.anInt2129 * arg0 + this.anInt2136 * arg1 + this.anInt2138 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method3713(@OriginalArg(0) Class70 arg0) {
		@Pc(2) Class70_Sub1 local2 = (Class70_Sub1) arg0;
		this.anInt2139 = local2.anInt2139;
		this.anInt2135 = local2.anInt2135;
		this.anInt2133 = local2.anInt2133;
		this.anInt2137 = local2.anInt2137;
		this.anInt2134 = local2.anInt2134;
		this.anInt2132 = local2.anInt2132;
		this.anInt2140 = local2.anInt2140;
		this.anInt2131 = local2.anInt2131;
		this.anInt2129 = local2.anInt2129;
		this.anInt2136 = local2.anInt2136;
		this.anInt2138 = local2.anInt2138;
		this.anInt2130 = local2.anInt2130;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	@Override
	public void method3712(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class147.anIntArray603[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class147.anIntArray604[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2139;
		@Pc(17) int local17 = this.anInt2135;
		@Pc(20) int local20 = this.anInt2133;
		@Pc(23) int local23 = this.anInt2137;
		this.anInt2139 = local14 * local5 + this.anInt2129 * local11 >> 15;
		this.anInt2129 = this.anInt2129 * local5 - local14 * local11 >> 15;
		this.anInt2135 = local17 * local5 + this.anInt2136 * local11 >> 15;
		this.anInt2136 = this.anInt2136 * local5 - local17 * local11 >> 15;
		this.anInt2133 = local20 * local5 + this.anInt2138 * local11 >> 15;
		this.anInt2138 = this.anInt2138 * local5 - local20 * local11 >> 15;
		this.anInt2137 = local23 * local5 + this.anInt2130 * local11 >> 15;
		this.anInt2130 = this.anInt2130 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	@Override
	public void method3711(@OriginalArg(0) int arg0) {
		this.anInt2132 = 32768;
		this.anInt2139 = this.anInt2138 = Class147.anIntArray603[arg0 & 0x3FFF];
		this.anInt2133 = Class147.anIntArray604[arg0 & 0x3FFF];
		this.anInt2129 = -this.anInt2133;
		this.anInt2135 = this.anInt2137 = this.anInt2134 = this.anInt2140 = this.anInt2131 = this.anInt2136 = this.anInt2130 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()Lclient!fd;")
	public Class70_Sub1 method1749() {
		@Pc(3) Class70_Sub1 local3 = new Class70_Sub1();
		local3.anInt2139 = this.anInt2139;
		local3.anInt2135 = this.anInt2135;
		local3.anInt2133 = this.anInt2133;
		local3.anInt2137 = this.anInt2137;
		local3.anInt2134 = this.anInt2134;
		local3.anInt2132 = this.anInt2132;
		local3.anInt2140 = this.anInt2140;
		local3.anInt2131 = this.anInt2131;
		local3.anInt2129 = this.anInt2129;
		local3.anInt2136 = this.anInt2136;
		local3.anInt2138 = this.anInt2138;
		local3.anInt2130 = this.anInt2130;
		return local3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2137 += arg0;
		this.anInt2131 += arg1;
		this.anInt2130 += arg2;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([I)V")
	@Override
	public void method3714(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2137;
		@Pc(13) int local13 = arg0[1] - this.anInt2131;
		@Pc(20) int local20 = arg0[2] - this.anInt2130;
		arg0[0] = this.anInt2139 * local6 + this.anInt2134 * local13 + this.anInt2129 * local20 >> 15;
		arg0[1] = this.anInt2135 * local6 + this.anInt2132 * local13 + this.anInt2136 * local20 >> 15;
		arg0[2] = this.anInt2133 * local6 + this.anInt2140 * local13 + this.anInt2138 * local20 >> 15;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	@Override
	public void method3715(@OriginalArg(0) int arg0) {
		this.anInt2139 = 32768;
		this.anInt2132 = this.anInt2138 = Class147.anIntArray603[arg0 & 0x3FFF];
		this.anInt2136 = Class147.anIntArray604[arg0 & 0x3FFF];
		this.anInt2140 = -this.anInt2136;
		this.anInt2135 = this.anInt2133 = this.anInt2137 = this.anInt2134 = this.anInt2131 = this.anInt2129 = this.anInt2130 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public void method3709(@OriginalArg(0) int arg0) {
		this.anInt2138 = 32768;
		this.anInt2139 = this.anInt2132 = Class147.anIntArray603[arg0 & 0x3FFF];
		this.anInt2134 = Class147.anIntArray604[arg0 & 0x3FFF];
		this.anInt2135 = -this.anInt2134;
		this.anInt2133 = this.anInt2137 = this.anInt2140 = this.anInt2131 = this.anInt2129 = this.anInt2136 = this.anInt2130 = 0;
	}
}
