import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!jr;")
	public static Class126 aClass126_2;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZB)V")
	public static void method5404(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class4_Sub6 local6 = (Class4_Sub6) Static324.aClass91_35.method2584(); local6 != null; local6 = (Class4_Sub6) Static324.aClass91_35.method2586()) {
			if (local6.aClass4_Sub7_Sub1_3 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(local6.aClass4_Sub7_Sub1_3);
				local6.aClass4_Sub7_Sub1_3 = null;
			}
			if (local6.aClass4_Sub7_Sub1_2 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(local6.aClass4_Sub7_Sub1_2);
				local6.aClass4_Sub7_Sub1_2 = null;
			}
			local6.method6330();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class4_Sub6 local57 = (Class4_Sub6) Static429.aClass91_52.method2584(); local57 != null; local57 = (Class4_Sub6) Static429.aClass91_52.method2586()) {
			if (local57.aClass4_Sub7_Sub1_3 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(local57.aClass4_Sub7_Sub1_3);
				local57.aClass4_Sub7_Sub1_3 = null;
			}
			local57.method6330();
		}
		for (@Pc(84) Class4_Sub6 local84 = (Class4_Sub6) Static48.aClass96_3.method2798(); local84 != null; local84 = (Class4_Sub6) Static48.aClass96_3.method2796()) {
			if (local84.aClass4_Sub7_Sub1_3 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(local84.aClass4_Sub7_Sub1_3);
				local84.aClass4_Sub7_Sub1_3 = null;
			}
			local84.method6330();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
	public static boolean method5405(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 48 || arg0 == 8 || arg0 == 46 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1010;
		}
	}
}
