import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	public int anInt2913;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public int anInt2914;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	public int anInt2917;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	public int anInt2918;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	public int anInt2919;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public int anInt2920;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	public int anInt2922;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class21_Sub2() {
		this.method2800();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method2798(@OriginalArg(0) int arg0) {
		this.anInt2917 = 32768;
		this.anInt2919 = this.anInt2914 = Class1_Sub1_Sub16.anIntArray586[arg0 & 0x3FFF];
		this.anInt2922 = Class1_Sub1_Sub16.anIntArray587[arg0 & 0x3FFF];
		this.anInt2920 = -this.anInt2922;
		this.anInt2918 = this.anInt2912 = this.anInt2911 = this.anInt2921 = this.anInt2913 = this.anInt2916 = this.anInt2915 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ci;)V")
	@Override
	public void method2813(@OriginalArg(0) Class21 arg0) {
		@Pc(2) Class21_Sub2 local2 = (Class21_Sub2) arg0;
		this.anInt2919 = local2.anInt2919;
		this.anInt2920 = local2.anInt2920;
		this.anInt2918 = local2.anInt2918;
		this.anInt2912 = local2.anInt2912;
		this.anInt2922 = local2.anInt2922;
		this.anInt2914 = local2.anInt2914;
		this.anInt2911 = local2.anInt2911;
		this.anInt2921 = local2.anInt2921;
		this.anInt2913 = local2.anInt2913;
		this.anInt2916 = local2.anInt2916;
		this.anInt2917 = local2.anInt2917;
		this.anInt2915 = local2.anInt2915;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	@Override
	public void method2815(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub1_Sub16.anIntArray586[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub16.anIntArray587[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2922;
		@Pc(17) int local17 = this.anInt2914;
		@Pc(20) int local20 = this.anInt2911;
		@Pc(23) int local23 = this.anInt2921;
		this.anInt2922 = local14 * local5 - this.anInt2913 * local11 >> 15;
		this.anInt2913 = local14 * local11 + this.anInt2913 * local5 >> 15;
		this.anInt2914 = local17 * local5 - this.anInt2916 * local11 >> 15;
		this.anInt2916 = local17 * local11 + this.anInt2916 * local5 >> 15;
		this.anInt2911 = local20 * local5 - this.anInt2917 * local11 >> 15;
		this.anInt2917 = local20 * local11 + this.anInt2917 * local5 >> 15;
		this.anInt2921 = local23 * local5 - this.anInt2915 * local11 >> 15;
		this.anInt2915 = local23 * local11 + this.anInt2915 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	@Override
	public void method2805(@OriginalArg(0) int arg0) {
		this.anInt2919 = 32768;
		this.anInt2914 = this.anInt2917 = Class1_Sub1_Sub16.anIntArray586[arg0 & 0x3FFF];
		this.anInt2916 = Class1_Sub1_Sub16.anIntArray587[arg0 & 0x3FFF];
		this.anInt2911 = -this.anInt2916;
		this.anInt2920 = this.anInt2918 = this.anInt2912 = this.anInt2922 = this.anInt2921 = this.anInt2913 = this.anInt2915 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2912 + (this.anInt2919 * arg0 + this.anInt2920 * arg1 + this.anInt2918 * arg2 >> 15);
		arg3[1] = this.anInt2921 + (this.anInt2922 * arg0 + this.anInt2914 * arg1 + this.anInt2911 * arg2 >> 15);
		arg3[2] = this.anInt2915 + (this.anInt2913 * arg0 + this.anInt2916 * arg1 + this.anInt2917 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub1_Sub16.anIntArray586[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub16.anIntArray587[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub1_Sub16.anIntArray586[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub1_Sub16.anIntArray587[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub1_Sub16.anIntArray586[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub1_Sub16.anIntArray587[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2919 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2922 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2913 = local23 * local5 >> 15;
		this.anInt2920 = local5 * local35 >> 15;
		this.anInt2914 = local5 * local29 >> 15;
		this.anInt2916 = -local11;
		this.anInt2918 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2911 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2917 = local17 * local5 >> 15;
		this.anInt2912 = -arg0 * this.anInt2919 - arg1 * this.anInt2920 - arg2 * this.anInt2918 >> 15;
		this.anInt2921 = -arg0 * this.anInt2922 - arg1 * this.anInt2914 - arg2 * this.anInt2911 >> 15;
		this.anInt2915 = -arg0 * this.anInt2913 - arg1 * this.anInt2916 - arg2 * this.anInt2917 >> 15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V")
	@Override
	public void method2799(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2912;
		@Pc(13) int local13 = arg0[1] - this.anInt2921;
		@Pc(20) int local20 = arg0[2] - this.anInt2915;
		arg0[0] = this.anInt2919 * local6 + this.anInt2922 * local13 + this.anInt2913 * local20 >> 15;
		arg0[1] = this.anInt2920 * local6 + this.anInt2914 * local13 + this.anInt2916 * local20 >> 15;
		arg0[2] = this.anInt2918 * local6 + this.anInt2911 * local13 + this.anInt2917 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	@Override
	public void method2809(@OriginalArg(0) int arg0) {
		this.anInt2914 = 32768;
		this.anInt2919 = this.anInt2917 = Class1_Sub1_Sub16.anIntArray586[arg0 & 0x3FFF];
		this.anInt2918 = Class1_Sub1_Sub16.anIntArray587[arg0 & 0x3FFF];
		this.anInt2913 = -this.anInt2918;
		this.anInt2920 = this.anInt2912 = this.anInt2922 = this.anInt2911 = this.anInt2921 = this.anInt2916 = this.anInt2915 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public void method2802(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub1_Sub16.anIntArray586[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub16.anIntArray587[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2919;
		@Pc(17) int local17 = this.anInt2920;
		@Pc(20) int local20 = this.anInt2918;
		@Pc(23) int local23 = this.anInt2912;
		this.anInt2919 = local14 * local5 + this.anInt2913 * local11 >> 15;
		this.anInt2913 = this.anInt2913 * local5 - local14 * local11 >> 15;
		this.anInt2920 = local17 * local5 + this.anInt2916 * local11 >> 15;
		this.anInt2916 = this.anInt2916 * local5 - local17 * local11 >> 15;
		this.anInt2918 = local20 * local5 + this.anInt2917 * local11 >> 15;
		this.anInt2917 = this.anInt2917 * local5 - local20 * local11 >> 15;
		this.anInt2912 = local23 * local5 + this.anInt2915 * local11 >> 15;
		this.anInt2915 = this.anInt2915 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	@Override
	public void method2800() {
		this.anInt2922 = this.anInt2913 = this.anInt2920 = this.anInt2916 = this.anInt2918 = this.anInt2911 = this.anInt2912 = this.anInt2921 = this.anInt2915 = 0;
		this.anInt2919 = this.anInt2914 = this.anInt2917 = 32768;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()Lclient!ji;")
	public Class21_Sub2 method2816() {
		@Pc(3) Class21_Sub2 local3 = new Class21_Sub2();
		local3.anInt2919 = this.anInt2919;
		local3.anInt2920 = this.anInt2920;
		local3.anInt2918 = this.anInt2918;
		local3.anInt2912 = this.anInt2912;
		local3.anInt2922 = this.anInt2922;
		local3.anInt2914 = this.anInt2914;
		local3.anInt2911 = this.anInt2911;
		local3.anInt2921 = this.anInt2921;
		local3.anInt2913 = this.anInt2913;
		local3.anInt2916 = this.anInt2916;
		local3.anInt2917 = this.anInt2917;
		local3.anInt2915 = this.anInt2915;
		return local3;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
	@Override
	public void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2922 = this.anInt2913 = this.anInt2920 = this.anInt2916 = this.anInt2918 = this.anInt2911 = 0;
		this.anInt2919 = this.anInt2914 = this.anInt2917 = 32768;
		this.anInt2912 = arg0;
		this.anInt2921 = arg1;
		this.anInt2915 = arg2;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	@Override
	public void method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2912 += arg0;
		this.anInt2921 += arg1;
		this.anInt2915 += arg2;
	}
}
