import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt3008;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public int anInt3009;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	public int anInt3010;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public int anInt3011;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public int anInt3017;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	public int anInt3019;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class118_Sub2() {
		this.method2665();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class226.anIntArray613[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class226.anIntArray614[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class226.anIntArray613[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class226.anIntArray614[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class226.anIntArray613[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class226.anIntArray614[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3017 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3010 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3015 = local23 * local5 >> 15;
		this.anInt3013 = local5 * local35 >> 15;
		this.anInt3012 = local5 * local29 >> 15;
		this.anInt3008 = -local11;
		this.anInt3018 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3014 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3016 = local17 * local5 >> 15;
		this.anInt3009 = -arg0 * this.anInt3017 - arg1 * this.anInt3013 - arg2 * this.anInt3018 >> 15;
		this.anInt3019 = -arg0 * this.anInt3010 - arg1 * this.anInt3012 - arg2 * this.anInt3014 >> 15;
		this.anInt3011 = -arg0 * this.anInt3015 - arg1 * this.anInt3008 - arg2 * this.anInt3016 >> 15;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "()Lclient!jl;")
	public Class118_Sub2 method2671() {
		@Pc(3) Class118_Sub2 local3 = new Class118_Sub2();
		local3.anInt3017 = this.anInt3017;
		local3.anInt3013 = this.anInt3013;
		local3.anInt3018 = this.anInt3018;
		local3.anInt3009 = this.anInt3009;
		local3.anInt3010 = this.anInt3010;
		local3.anInt3012 = this.anInt3012;
		local3.anInt3014 = this.anInt3014;
		local3.anInt3019 = this.anInt3019;
		local3.anInt3015 = this.anInt3015;
		local3.anInt3008 = this.anInt3008;
		local3.anInt3016 = this.anInt3016;
		local3.anInt3011 = this.anInt3011;
		return local3;
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
	@Override
	public void method2669(@OriginalArg(0) int arg0) {
		this.anInt3016 = 32768;
		this.anInt3017 = this.anInt3012 = Class226.anIntArray613[arg0 & 0x3FFF];
		this.anInt3010 = Class226.anIntArray614[arg0 & 0x3FFF];
		this.anInt3013 = -this.anInt3010;
		this.anInt3018 = this.anInt3009 = this.anInt3014 = this.anInt3019 = this.anInt3015 = this.anInt3008 = this.anInt3011 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	@Override
	public void method2656(@OriginalArg(0) int arg0) {
		this.anInt3012 = 32768;
		this.anInt3017 = this.anInt3016 = Class226.anIntArray613[arg0 & 0x3FFF];
		this.anInt3018 = Class226.anIntArray614[arg0 & 0x3FFF];
		this.anInt3015 = -this.anInt3018;
		this.anInt3013 = this.anInt3009 = this.anInt3010 = this.anInt3014 = this.anInt3019 = this.anInt3008 = this.anInt3011 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
	@Override
	public void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3009 += arg0;
		this.anInt3019 += arg1;
		this.anInt3011 += arg2;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([I)V")
	@Override
	public void method2667(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3009;
		@Pc(13) int local13 = arg0[1] - this.anInt3019;
		@Pc(20) int local20 = arg0[2] - this.anInt3011;
		arg0[0] = this.anInt3017 * local6 + this.anInt3010 * local13 + this.anInt3015 * local20 >> 15;
		arg0[1] = this.anInt3013 * local6 + this.anInt3012 * local13 + this.anInt3008 * local20 >> 15;
		arg0[2] = this.anInt3018 * local6 + this.anInt3014 * local13 + this.anInt3016 * local20 >> 15;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!os;)V")
	@Override
	public void method2657(@OriginalArg(0) Class118 arg0) {
		@Pc(2) Class118_Sub2 local2 = (Class118_Sub2) arg0;
		this.anInt3017 = local2.anInt3017;
		this.anInt3013 = local2.anInt3013;
		this.anInt3018 = local2.anInt3018;
		this.anInt3009 = local2.anInt3009;
		this.anInt3010 = local2.anInt3010;
		this.anInt3012 = local2.anInt3012;
		this.anInt3014 = local2.anInt3014;
		this.anInt3019 = local2.anInt3019;
		this.anInt3015 = local2.anInt3015;
		this.anInt3008 = local2.anInt3008;
		this.anInt3016 = local2.anInt3016;
		this.anInt3011 = local2.anInt3011;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	@Override
	public void method2660(@OriginalArg(0) int arg0) {
		this.anInt3017 = 32768;
		this.anInt3012 = this.anInt3016 = Class226.anIntArray613[arg0 & 0x3FFF];
		this.anInt3008 = Class226.anIntArray614[arg0 & 0x3FFF];
		this.anInt3014 = -this.anInt3008;
		this.anInt3013 = this.anInt3018 = this.anInt3009 = this.anInt3010 = this.anInt3019 = this.anInt3015 = this.anInt3011 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3009 + (this.anInt3017 * arg0 + this.anInt3013 * arg1 + this.anInt3018 * arg2 >> 15);
		arg3[1] = this.anInt3019 + (this.anInt3010 * arg0 + this.anInt3012 * arg1 + this.anInt3014 * arg2 >> 15);
		arg3[2] = this.anInt3011 + (this.anInt3015 * arg0 + this.anInt3008 * arg1 + this.anInt3016 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	@Override
	public void method2665() {
		this.anInt3010 = this.anInt3015 = this.anInt3013 = this.anInt3008 = this.anInt3018 = this.anInt3014 = this.anInt3009 = this.anInt3019 = this.anInt3011 = 0;
		this.anInt3017 = this.anInt3012 = this.anInt3016 = 32768;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	@Override
	public void method2666(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class226.anIntArray613[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class226.anIntArray614[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3010;
		@Pc(17) int local17 = this.anInt3012;
		@Pc(20) int local20 = this.anInt3014;
		@Pc(23) int local23 = this.anInt3019;
		this.anInt3010 = local14 * local5 - this.anInt3015 * local11 >> 15;
		this.anInt3015 = local14 * local11 + this.anInt3015 * local5 >> 15;
		this.anInt3012 = local17 * local5 - this.anInt3008 * local11 >> 15;
		this.anInt3008 = local17 * local11 + this.anInt3008 * local5 >> 15;
		this.anInt3014 = local20 * local5 - this.anInt3016 * local11 >> 15;
		this.anInt3016 = local20 * local11 + this.anInt3016 * local5 >> 15;
		this.anInt3019 = local23 * local5 - this.anInt3011 * local11 >> 15;
		this.anInt3011 = local23 * local11 + this.anInt3011 * local5 >> 15;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V")
	@Override
	public void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3010 = this.anInt3015 = this.anInt3013 = this.anInt3008 = this.anInt3018 = this.anInt3014 = 0;
		this.anInt3017 = this.anInt3012 = this.anInt3016 = 32768;
		this.anInt3009 = arg0;
		this.anInt3019 = arg1;
		this.anInt3011 = arg2;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	@Override
	public void method2670(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class226.anIntArray613[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class226.anIntArray614[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3017;
		@Pc(17) int local17 = this.anInt3013;
		@Pc(20) int local20 = this.anInt3018;
		@Pc(23) int local23 = this.anInt3009;
		this.anInt3017 = local14 * local5 + this.anInt3015 * local11 >> 15;
		this.anInt3015 = this.anInt3015 * local5 - local14 * local11 >> 15;
		this.anInt3013 = local17 * local5 + this.anInt3008 * local11 >> 15;
		this.anInt3008 = this.anInt3008 * local5 - local17 * local11 >> 15;
		this.anInt3018 = local20 * local5 + this.anInt3016 * local11 >> 15;
		this.anInt3016 = this.anInt3016 * local5 - local20 * local11 >> 15;
		this.anInt3009 = local23 * local5 + this.anInt3011 * local11 >> 15;
		this.anInt3011 = this.anInt3011 * local5 - local23 * local11 >> 15;
	}
}
