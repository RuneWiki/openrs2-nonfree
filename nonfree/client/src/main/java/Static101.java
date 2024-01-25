import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lclient!uu;")
	public static Class239 aClass239_2;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "Lclient!aj;")
	public static Class15 aClass15_27;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "Lclient!gia;")
	public static final Class118 aClass118_4 = new Class118("game4", "Game 4", 3);

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_2 = new Class147("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
	public static int anInt1853 = 0;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[200];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIBI)V")
	public static void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690() * arg1 >> 8;
		if (local17 == 0 || arg0 == -1) {
			return;
		}
		if (!Static278.aBoolean253 && Static214.anInt4080 != -1 && Static610.method8669() && !Static678.method9383()) {
			Static73.aClass3_Sub1_Sub3_1 = Static87.method1655();
			@Pc(41) Class3_Sub1_Sub3 local41 = Static267.method4374(Static73.aClass3_Sub1_Sub3_1);
			Static126.method2376(local41);
		}
		Static81.method1579(arg0, local17, Static64.aClass15_19);
		Static77.method1438(-1, 255);
		Static278.aBoolean253 = true;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1778(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, arg0.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(arg2.length() + local14);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)Z")
	public static boolean method1779() {
		if (Static663.aBoolean803) {
			try {
				Static686.method8109(Static124.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
