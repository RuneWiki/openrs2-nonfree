import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "[I")
	public static final int[] anIntArray129 = new int[25];

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public static int anInt2198 = -1;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	public static int anInt2199 = 0;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	public static int anInt2201 = -1;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = null;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	public static int anInt2204 = 1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method2025() {
		Static354.aClass66_109.method1944(5);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method2026(@OriginalArg(1) Class170 arg0) {
		Static72.aClass170_24 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!ra;Lclient!ra;Lclient!la;Lclient!ra;)Z")
	public static boolean method2028(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(3) Class5_Sub17_Sub2 arg2, @OriginalArg(4) Class170 arg3) {
		Static352.aClass5_Sub17_Sub2_3 = arg2;
		Static250.aClass170_88 = arg3;
		Static86.aClass170_38 = arg1;
		Static244.aClass170_84 = arg0;
		return true;
	}
}
