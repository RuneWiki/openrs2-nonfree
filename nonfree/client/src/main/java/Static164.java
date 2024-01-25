import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "Lclient!eb;")
	public static Class42 aClass42_22;

	@OriginalMember(owner = "client!kg", name = "Ob", descriptor = "Lclient!na;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!kg", name = "Pb", descriptor = "Lclient!qm;")
	public static Class174 aClass174_9;

	@OriginalMember(owner = "client!kg", name = "xc", descriptor = "I")
	public static int anInt3433;

	@OriginalMember(owner = "client!kg", name = "Ic", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!kg", name = "wb", descriptor = "[Lclient!mj;")
	public static Class135_Sub1[] aClass135_Sub1Array2 = new Class135_Sub1[0];

	@OriginalMember(owner = "client!kg", name = "cd", descriptor = "I")
	public static int anInt3449 = 2;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public static int method3100() {
		return 6;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)V")
	public static void method3104(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub4_Sub17 local14 = Static132.method2717(arg0, 2);
		local14.method3481();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg5 + arg0;
		for (@Pc(17) int local17 = arg5; local17 < local15; local17++) {
			Static367.method6081(arg3, arg2, Static43.anIntArrayArray57[local17], arg6);
		}
		@Pc(35) int local35 = arg0 + arg2;
		for (@Pc(37) int local37 = arg1; local37 > local10; local37--) {
			Static367.method6081(arg3, arg2, Static43.anIntArrayArray57[local37], arg6);
		}
		@Pc(56) int local56 = arg6 - arg0;
		for (@Pc(62) int local62 = local15; local62 <= local10; local62++) {
			@Pc(68) int[] local68 = Static43.anIntArrayArray57[local62];
			Static367.method6081(arg3, arg2, local68, local35);
			Static367.method6081(arg4, local35, local68, local56);
			Static367.method6081(arg3, local56, local68, arg6);
		}
	}
}
