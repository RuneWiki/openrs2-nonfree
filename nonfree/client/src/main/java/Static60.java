import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "Lclient!db;")
	public static Class4_Sub7_Sub2 aClass4_Sub7_Sub2_1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILclient!ku;II)V")
	public static void method1398(@OriginalArg(1) int arg0, @OriginalArg(2) Class139 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class4_Sub6 local15 = (Class4_Sub6) Static324.aClass91_35.method2584(); local15 != null; local15 = (Class4_Sub6) Static324.aClass91_35.method2586()) {
			if (arg0 == local15.anInt989 && local15.anInt986 == arg2 << 7 && local15.anInt987 == arg3 << 7 && arg1.anInt4366 == local15.aClass139_1.anInt4366) {
				if (local15.aClass4_Sub7_Sub1_3 != null) {
					Static132.aClass4_Sub7_Sub4_1.method5474(local15.aClass4_Sub7_Sub1_3);
					local15.aClass4_Sub7_Sub1_3 = null;
				}
				if (local15.aClass4_Sub7_Sub1_2 != null) {
					Static132.aClass4_Sub7_Sub4_1.method5474(local15.aClass4_Sub7_Sub1_2);
					local15.aClass4_Sub7_Sub1_2 = null;
				}
				local15.method6330();
				return;
			}
		}
	}
}
