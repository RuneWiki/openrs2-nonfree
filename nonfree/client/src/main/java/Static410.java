import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt7145;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!qn;")
	public static final Class204 aClass204_1 = Static212.method3724();

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_92 = new Class212(6, -1);

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	public static final int[] anIntArray578 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_93 = new Class212(58, 7);

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method5695() {
		Static48.method1078();
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	public static void method5701() {
		Static273.method4374(Static65.aClass240_4);
		Static422.anInt7303++;
		if (Static62.aBoolean112 && Static77.aBoolean131) {
			@Pc(26) int local26 = Static329.aClass95_1.method5170();
			@Pc(30) int local30 = Static329.aClass95_1.method5175();
			local26 -= Static255.anInt4930;
			local30 -= Static270.anInt5898;
			if (local26 < Static458.anInt7818) {
				local26 = Static458.anInt7818;
			}
			if (local30 < Static4.anInt49) {
				local30 = Static4.anInt49;
			}
			if (Static458.anInt7818 + Static186.aClass240_10.anInt6904 < Static65.aClass240_4.anInt6904 + local26) {
				local26 = Static186.aClass240_10.anInt6904 + Static458.anInt7818 - Static65.aClass240_4.anInt6904;
			}
			if (Static4.anInt49 + Static186.aClass240_10.anInt6894 < local30 - -Static65.aClass240_4.anInt6894) {
				local30 = Static4.anInt49 + Static186.aClass240_10.anInt6894 - Static65.aClass240_4.anInt6894;
			}
			@Pc(101) int local101 = Static186.aClass240_10.anInt6897 + local26 - Static458.anInt7818;
			@Pc(114) int local114 = Static186.aClass240_10.anInt6845 + local30 - Static4.anInt49;
			@Pc(176) Class4_Sub10 local176;
			if (Static329.aClass95_1.method5167()) {
				if (Static422.anInt7303 > Static65.aClass240_4.anInt6865) {
					@Pc(131) int local131 = local26 - Static302.anInt5615;
					@Pc(135) int local135 = local30 - Static251.anInt4843;
					if (local131 > Static65.aClass240_4.anInt6899 || -Static65.aClass240_4.anInt6899 > local131 || Static65.aClass240_4.anInt6899 < local135 || -Static65.aClass240_4.anInt6899 > local135) {
						Static149.aBoolean207 = true;
					}
				}
				if (Static65.aClass240_4.anObjectArray12 != null && Static149.aBoolean207) {
					local176 = new Class4_Sub10();
					local176.anInt1686 = local114;
					local176.anInt1688 = local101;
					local176.aClass240_5 = Static65.aClass240_4;
					local176.anObjectArray4 = Static65.aClass240_4.anObjectArray12;
					Static64.method1462(local176);
					return;
				}
			} else {
				if (Static149.aBoolean207) {
					Static294.method4500();
					if (Static65.aClass240_4.anObjectArray17 != null) {
						local176 = new Class4_Sub10();
						local176.aClass240_6 = Static47.aClass240_1;
						local176.anInt1686 = local114;
						local176.anObjectArray4 = Static65.aClass240_4.anObjectArray17;
						local176.anInt1688 = local101;
						local176.aClass240_5 = Static65.aClass240_4;
						Static64.method1462(local176);
					}
					if (Static47.aClass240_1 != null && Static50.method1131(Static65.aClass240_4) != null) {
						Static55.method1211(Static47.aClass240_1, Static65.aClass240_4);
					}
				} else if ((Static80.anInt1921 == 1 || Static145.method2647()) && Static352.anInt6233 > 2) {
					Static210.method3696(Static302.anInt5615 + Static255.anInt4930, Static251.anInt4843 + Static270.anInt5898);
				} else if (Static170.method2989()) {
					Static210.method3696(Static302.anInt5615 + Static255.anInt4930, Static251.anInt4843 + Static270.anInt5898);
				}
				Static65.aClass240_4 = null;
			}
		} else if (Static422.anInt7303 > 1) {
			Static65.aClass240_4 = null;
		}
	}
}
