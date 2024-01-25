import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass26_Sub1_2 != null) {
			local7.aClass26_Sub1_2 = null;
		}
		if (local7.aClass26_Sub1_1 != null) {
			local7.aClass26_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1950(@OriginalArg(1) int arg0) {
		Static83.anInt7543 = arg0;
		Static47.aClass126_7.method2827();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method1951(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static231.method5182(arg0);
	}
}
