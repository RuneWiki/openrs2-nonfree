import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ca;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Z")
	public static boolean aBoolean9;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_200 = Static28.method504("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!ja;")
	private static Class39 aClass39_201 = Static28.method504("OFF");

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_202 = aClass39_201;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_203 = Static28.method504("Hidden)2use");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_204 = Static28.method504("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method183() {
		try {
			if (Static83.aClass47_1 == null) {
				Static83.aClass47_1 = new Class47(Static126.aClass29_63, Static62.method1123(new Class39[] { Static94.aClass39_1142, Static72.aClass39_426, Static54.aClass39_795 }).method947());
			} else {
				@Pc(32) byte[] local32 = Static83.aClass47_1.method1154();
				if (local32 != null) {
					@Pc(39) Class4_Sub16 local39 = new Class4_Sub16(local32);
					Static70.anInt1733 = local39.method1490();
					Static106.aClass76Array1 = new Class76[Static70.anInt1733];
					for (@Pc(48) int local48 = 0; local48 < Static70.anInt1733; local48++) {
						@Pc(58) Class76 local58 = Static106.aClass76Array1[local48] = new Class76();
						@Pc(64) int local64 = local39.method1490();
						local58.anInt2951 = local64 & 0x7FFF;
						local58.aBoolean145 = (local64 & 0x8000) != 0;
						local58.aClass39_1544 = local39.method1464();
						local58.anInt2948 = local39.method1476();
						local58.anInt2950 = local48;
						local58.anInt2952 = Static65.method1153(local58.aClass39_1544);
					}
					Static103.method1848(Static130.anIntArray366, Static106.aClass76Array1.length - 1, 0, Static49.anIntArray137, Static106.aClass76Array1);
					Static46.aBoolean54 = true;
					Static83.aClass47_1 = null;
				}
			}
		} catch (@Pc(122) Exception local122) {
			local122.printStackTrace();
			Static83.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method184() {
		aClass39_202 = null;
		aClass39_200 = null;
		aClass39_201 = null;
		aLongArray1 = null;
		aClass39_203 = null;
		aClass13_1 = null;
		aClass39_204 = null;
	}
}
