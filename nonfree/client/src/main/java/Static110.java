import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_20;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1552 = Static75.method1216("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1553 = Static75.method1216("yellow:");

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1554 = aClass4_1553;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
	public static int anInt2775 = -1;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
	public static int anInt2777 = -1;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1555 = Static75.method1216("Classic");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!rd;Z)V")
	public static void method1894(@OriginalArg(0) Class64 arg0) {
		Static69.aClass64_65 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method1895() {
		aClass4_1555 = null;
		aClass64_Sub1_20 = null;
		aClass4_1553 = null;
		aClass4_1554 = null;
		aClass4_1552 = null;
	}
}
