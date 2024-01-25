import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)V")
	public static void method1914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5 local9 = Static368.aClass5ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static491.anInt8623 = local9.anInt68;
			Static128.anInt2210 = local9.anInt74;
			Static265.anInt4731 = local9.anInt77;
		}
		Static245.method3828();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIZI)V")
	public static void method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
		Static340.aClass6_Sub12_Sub2_1.method6047(Static321.aClass252_7.anInt7316);
		Static340.aClass6_Sub12_Sub2_1.method6047(arg3);
		Static340.aClass6_Sub12_Sub2_1.method6047(arg2);
		Static340.aClass6_Sub12_Sub2_1.method6032(arg0);
		Static340.aClass6_Sub12_Sub2_1.method6032(arg1);
		Static500.anInt8692 = 0;
		Static402.anInt7273 = 1;
		Static331.anInt6271 = -3;
		Static516.anInt8870 = 0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1919(@OriginalArg(0) String arg0) {
		Static315.aString50 = arg0;
		if (Static198.anApplet1 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static198.anApplet1.getParameter("cookieprefix");
			@Pc(16) String local16 = Static198.anApplet1.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static213.method3436(Static416.method5922() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static594.method6346(Static198.anApplet1, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(82) Throwable local82) {
		}
	}
}
