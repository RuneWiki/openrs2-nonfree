import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
	public static int anInt2352;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_8;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_564 = Static8.method128("Hidden)2use");

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	public static int anInt2355 = 0;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_565 = Static8.method128("Select a world");

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_566 = aClass18_565;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_567 = Static8.method128("<br>");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
	public static void method1682() {
		Static145.anIntArray375 = null;
		Static22.aByteArrayArray4 = null;
		Static131.anIntArray333 = null;
		Static129.anIntArray331 = null;
		Static26.anIntArray54 = null;
		Static9.anIntArray13 = null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Z")
	public static boolean method1683() {
		try {
			if (Static41.anInt1326 == 2) {
				if (Static92.aClass1_Sub20_1 == null) {
					Static92.aClass1_Sub20_1 = Static186.method2432(Static171.aClass16_37, Static7.anInt199, Static47.anInt4240);
					if (Static92.aClass1_Sub20_1 == null) {
						return false;
					}
				}
				if (Static45.aClass73_1 == null) {
					Static45.aClass73_1 = new Class73(Static133.aClass16_25, Static106.aClass16_14);
				}
				if (Static47.aClass1_Sub5_Sub3_12.method1241(Static45.aClass73_1, Static92.aClass1_Sub20_1, Static108.aClass16_21)) {
					Static47.aClass1_Sub5_Sub3_12.method1240();
					Static47.aClass1_Sub5_Sub3_12.method1239(Static91.anInt2765);
					Static47.aClass1_Sub5_Sub3_12.method1224(Static92.aClass1_Sub20_1, Static78.aBoolean96);
					Static171.aClass16_37 = null;
					Static92.aClass1_Sub20_1 = null;
					Static41.anInt1326 = 0;
					Static45.aClass73_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static47.aClass1_Sub5_Sub3_12.method1218();
			Static41.anInt1326 = 0;
			Static45.aClass73_1 = null;
			Static92.aClass1_Sub20_1 = null;
			Static171.aClass16_37 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)V")
	public static void method1684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static95.aClass1_Sub6_Sub1_1.method555(64);
		Static95.aClass1_Sub6_Sub1_1.method528(arg0);
		Static95.aClass1_Sub6_Sub1_1.method532(arg1);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V")
	public static void method1685() {
		aClass18_564 = null;
		aClass16_8 = null;
		aClass18_565 = null;
		aClass18_566 = null;
		aClass18_567 = null;
	}
}
