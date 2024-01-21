import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lclient!wg;")
	public static Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_16;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public static int anInt2895;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
	public static int anInt2897;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_857 = Static181.method2795("cyan:");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_856 = aClass83_857;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!nc;")
	public static Class63 aClass63_10 = new Class63(32);

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!qe;")
	public static Class83 aClass83_858 = aClass83_857;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_859 = Static181.method2795("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_860 = Static181.method2795("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
	public static int anInt2896 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!qe;I)Z")
	public static boolean method2226(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static177.anInt3618; local19++) {
			if (arg0.method2398(Static133.aClass83Array49[local19])) {
				return true;
			}
		}
		return arg0.method2398(Static54.aClass24_Sub4_Sub1_1.aClass83_664);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method2228() {
		if (!Static159.aBoolean152) {
			Static189.aClass83Array55[0] = Static165.aClass83_979;
			Static22.aShortArray9[0] = 1005;
			Static22.aClass83Array12[0] = Static182.aClass83_1067;
			Static98.anInt2124 = 1;
		}
		if (Static138.anInt2942 != -1) {
			Static213.method3231(Static138.anInt2942);
		}
		for (@Pc(30) int local30 = 0; local30 < Static139.anInt2948; local30++) {
			if (Static124.aBooleanArray16[local30]) {
				Static162.aBooleanArray28[local30] = true;
			}
			Static128.aBooleanArray17[local30] = Static124.aBooleanArray16[local30];
			Static124.aBooleanArray16[local30] = false;
		}
		Static86.anInt1878 = -1;
		Static100.anInt2309 = Static13.anInt386;
		Static87.aClass5_10 = null;
		Static113.anInt2594 = -1;
		if (Static138.anInt2942 != -1) {
			Static139.anInt2948 = 0;
			Static91.method1588(Static138.anInt2942, Static190.anInt3767, -1, 0, 0, 0, 0, Static89.anInt4290);
		}
		Static126.method2116();
		Static137.method2232();
		if (Static159.aBoolean152) {
			Static108.method1871();
		} else if (Static86.anInt1878 != -1) {
			Static53.method1037(Static86.anInt1878, Static113.anInt2594);
		}
		if (Static95.anInt2022 == 3) {
			for (@Pc(110) int local110 = 0; local110 < Static139.anInt2948; local110++) {
				if (Static128.aBooleanArray17[local110]) {
					Static126.method2124(Static86.anIntArray181[local110], Static101.anIntArray226[local110], Static71.anIntArray167[local110], Static15.anIntArray27[local110], 16711935, 128);
				} else if (Static162.aBooleanArray28[local110]) {
					Static126.method2124(Static86.anIntArray181[local110], Static101.anIntArray226[local110], Static71.anIntArray167[local110], Static15.anIntArray27[local110], 16711680, 128);
				}
			}
		}
		Static180.method2783(Static43.anInt1126, Static57.anInt1427, Static54.aClass24_Sub4_Sub1_1.anInt3316, Static54.aClass24_Sub4_Sub1_1.anInt3349);
		Static57.anInt1427 = 0;
	}
}
