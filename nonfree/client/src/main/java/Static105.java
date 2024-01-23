import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!fh;")
	public static Class58 aClass58_48;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt2162;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public static int anInt2165;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[[Lclient!ih;")
	public static Class4_Sub12[][] aClass4_Sub12ArrayArray1;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!cc;")
	public static Class26 aClass26_21 = new Class26(64);

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString121 = "Loaded wordpack";

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
	public static boolean aBoolean147 = true;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString122 = "Please remove ";

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method1714() {
		Static250.aClass26_50.method515();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1715() {
		Static184.method2977((long) Static50.anInt954);
		if (Static107.anInt5399 != -1) {
			Static194.method4280(Static107.anInt5399);
		}
		for (@Pc(17) int local17 = 0; local17 < Static6.anInt113; local17++) {
			if (Static85.aBooleanArray8[local17]) {
				Static259.aBooleanArray24[local17] = true;
			}
			Static9.aBooleanArray2[local17] = Static85.aBooleanArray8[local17];
			Static85.aBooleanArray8[local17] = false;
		}
		Static130.anInt2522 = Static50.anInt954;
		Static246.aClass189_13 = null;
		Static91.anInt2047 = -1;
		if (Static94.aBoolean138) {
			Static273.aBoolean123 = true;
		}
		Static246.anInt4680 = -1;
		if (Static107.anInt5399 != -1) {
			Static6.anInt113 = 0;
			Static91.method1563();
		}
		if (Static94.aBoolean138) {
			Static104.method1699();
		} else {
			Static270.method4266();
		}
		Static211.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	public static void method1717() {
		Static131.aClass26_25.method517(5);
	}
}
