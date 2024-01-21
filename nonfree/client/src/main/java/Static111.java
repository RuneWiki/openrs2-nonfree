import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_12;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_912 = Static120.method2057(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt2516 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_914 = Static120.method2057("Existing User");

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_913 = aClass81_914;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt2520 = -1;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public static int[] anIntArray270 = new int[200];

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_915 = Static120.method2057("::rect_debug");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class1_Sub23 local3 = null;
		for (@Pc(12) Class1_Sub23 local12 = (Class1_Sub23) Static70.aClass30_11.method1115(); local12 != null; local12 = (Class1_Sub23) Static70.aClass30_11.method1125()) {
			if (local12.anInt3733 == arg4 && local12.anInt3742 == arg1 && local12.anInt3739 == arg3 && arg6 == local12.anInt3729) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class1_Sub23();
			local3.anInt3729 = arg6;
			local3.anInt3733 = arg4;
			local3.anInt3742 = arg1;
			local3.anInt3739 = arg3;
			Static132.method2251(local3);
			Static70.aClass30_11.method1113(local3);
		}
		local3.anInt3734 = arg2;
		local3.anInt3735 = arg5;
		local3.anInt3726 = arg7;
		local3.anInt3737 = arg0;
		local3.anInt3728 = arg8;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1959() {
		aClass81_913 = null;
		anIntArray270 = null;
		aClass81_914 = null;
		aClass82_Sub1_12 = null;
		aClass81_912 = null;
		aClass81_915 = null;
	}
}
