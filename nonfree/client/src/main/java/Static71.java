import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_27;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_28;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "Lclient!fb;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_694 = Static161.method2971("leuchten2:");

	@OriginalMember(owner = "client!i", name = "U", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_695 = Static161.method2971("<col=ff3000>");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method1484() {
		aClass13_694 = null;
		aClass19_1 = null;
		aClass4_Sub1_27 = null;
		aClass4_Sub1_28 = null;
		aClass13_695 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!fd;B)Lclient!fd;")
	public static Class20 method1486(@OriginalArg(0) Class20 arg0) {
		@Pc(11) int local11 = Static60.method1400(Static53.method1292(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(28) int local28 = 0; local28 < local11; local28++) {
			arg0 = Static119.method2230(arg0.anInt1623);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub7 local7 = null;
		for (@Pc(16) Class1_Sub7 local16 = (Class1_Sub7) Static124.aClass82_9.method2849(); local16 != null; local16 = (Class1_Sub7) Static124.aClass82_9.method2855()) {
			if (arg5 == local16.anInt729 && local16.anInt718 == arg3 && arg0 == local16.anInt727 && local16.anInt717 == arg7) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub7();
			local7.anInt718 = arg3;
			local7.anInt727 = arg0;
			local7.anInt717 = arg7;
			local7.anInt729 = arg5;
			Static28.method840(local7);
			Static124.aClass82_9.method2853(local7);
		}
		local7.anInt719 = arg4;
		local7.anInt712 = arg1;
		local7.anInt713 = arg6;
		local7.anInt728 = arg2;
		local7.anInt725 = arg8;
	}
}
