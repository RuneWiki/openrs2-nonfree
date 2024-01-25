import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!ru", name = "cb", descriptor = "I")
	public static int anInt7945;

	@OriginalMember(owner = "client!ru", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([[IB)V")
	public static void method6374(@OriginalArg(0) int[][] arg0) {
		Static171.anIntArrayArray79 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
	public static int method6376() {
		if (Static554.aBoolean708) {
			return 6;
		} else if (Static446.aClass1_Sub51_5 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static446.aClass1_Sub51_5.anInt9638;
			if (Static479.method6516(local14)) {
				return 1;
			} else if (Static195.method2977(local14)) {
				return 2;
			} else if (Static270.method3853(local14)) {
				return 3;
			} else if (Static416.method5728(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
	public static void method6378() {
		@Pc(14) Class1_Sub11 local14 = Static276.method3885(Static413.aClass70_72, Static481.aClass276_2);
		Static48.method743(local14);
		for (@Pc(30) Class1_Sub44 local30 = (Class1_Sub44) Static78.aClass187_8.method3799(); local30 != null; local30 = (Class1_Sub44) Static78.aClass187_8.method3805()) {
			if (!local30.method7856()) {
				local30 = (Class1_Sub44) Static78.aClass187_8.method3799();
				if (local30 == null) {
					break;
				}
			}
			if (local30.anInt7686 == 0) {
				Static157.method2283(true, true, local30);
			}
		}
		if (Static205.aClass341_21 != null) {
			Static442.method6111(Static205.aClass341_21);
			Static205.aClass341_21 = null;
		}
	}
}
