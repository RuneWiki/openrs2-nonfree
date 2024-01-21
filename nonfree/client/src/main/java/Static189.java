import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
	public static int anInt4212;

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!ud", name = "Vb", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1215 = Static81.method1507("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1216 = Static81.method1507("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1217 = Static81.method1507("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)Lclient!dj;")
	public static Class24 method3248(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static63.method1281(new Class24[] { Static87.aClass24_617, Static175.method3020(arg0), Static19.aClass24_156 });
		} else if (arg0 < 10000000) {
			return Static63.method1281(new Class24[] { Static92.aClass24_633, Static175.method3020(arg0 / 1000), Static74.aClass24_547, Static19.aClass24_156 });
		} else {
			return Static63.method1281(new Class24[] { Static78.aClass24_569, Static175.method3020(arg0 / 1000000), Static101.aClass24_675, Static19.aClass24_156 });
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	public static int method3256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static208.aClass1_Sub2_Sub24_1 != null && local15 == Static208.aClass1_Sub2_Sub24_1.aLong149 ? Static85.aClass1_Sub7_3.anInt3592 * 99 / (Static85.aClass1_Sub7_3.aByteArray38.length - Static208.aClass1_Sub2_Sub24_1.aByte13) + 1 : 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ca;IIIB)V")
	public static void method3258(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == Static87.aClass5_Sub2_Sub1_1 || Static156.anInt3437 >= 400) {
			return;
		}
		@Pc(52) Class24 local52;
		if (arg0.anInt623 == 0) {
			local52 = Static63.method1281(new Class24[] { arg0.aClass24_173, Static32.method626(arg0.anInt620, Static87.aClass5_Sub2_Sub1_1.anInt620), Static131.aClass24_883, Static145.aClass24_964, Static175.method3020(arg0.anInt620), Static165.aClass24_1063 });
		} else {
			local52 = Static63.method1281(new Class24[] { arg0.aClass24_173, Static131.aClass24_883, Static5.aClass24_38, Static175.method3020(arg0.anInt623), Static165.aClass24_1063 });
		}
		@Pc(98) int local98;
		if (Static36.anInt973 == 1) {
			Static104.method1811((long) arg2, Static163.aClass24_1053, (short) 45, arg1, Static63.method1281(new Class24[] { Static129.aClass24_858, Static46.aClass24_290, local52 }), arg3);
		} else if (!Static178.aBoolean185) {
			for (local98 = 7; local98 >= 0; local98--) {
				if (Static13.aClass24Array3[local98] != null) {
					@Pc(105) short local105 = 0;
					if (Static5.anInt123 == 0 && Static13.aClass24Array3[local98].method771(Static16.aClass24_123)) {
						if (arg0.anInt620 > Static87.aClass5_Sub2_Sub1_1.anInt620) {
							local105 = 2000;
						}
						if (Static87.aClass5_Sub2_Sub1_1.anInt617 != 0 && arg0.anInt617 != 0) {
							if (Static87.aClass5_Sub2_Sub1_1.anInt617 == arg0.anInt617) {
								local105 = 2000;
							} else {
								local105 = 0;
							}
						}
					} else if (Static82.aBooleanArray8[local98]) {
						local105 = 2000;
					}
					@Pc(157) short local157 = Static45.aShortArray24[local98];
					@Pc(162) short local162 = (short) (local157 + local105);
					Static104.method1811((long) arg2, Static13.aClass24Array3[local98], local162, arg1, Static63.method1281(new Class24[] { Static196.aClass24_1256, local52 }), arg3);
				}
			}
		} else if ((Static4.anInt4608 & 0x8) == 8) {
			Static104.method1811((long) arg2, Static102.aClass24_681, (short) 7, arg1, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static46.aClass24_290, local52 }), arg3);
		}
		for (local98 = 0; local98 < Static156.anInt3437; local98++) {
			if (Static98.aShortArray28[local98] == 38) {
				Static66.aClass24Array11[local98] = Static63.method1281(new Class24[] { Static196.aClass24_1256, local52 });
				return;
			}
		}
	}
}
