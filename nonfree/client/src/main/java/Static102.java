import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	public static int anInt2644;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!v", name = "M", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
	public static final int anInt2651 = 50;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
	public static int[] anIntArray286 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "[I")
	public static int[] anIntArray287 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
	public static int[] anIntArray288 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1215 = Static45.method753("@or3@");

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	public static int anInt2650 = 0;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1216 = Static45.method753("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!v", name = "db", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array13 = new Class62[anInt2651];

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1217 = Static45.method753("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	public static int[] anIntArray289 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_32 = new Class34(50);

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
	public static int[] anIntArray290 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	public static int[] anIntArray291 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
	public static int[] anIntArray293 = new int[anInt2651];

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
	public static int anInt2652 = 0;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1218 = Static45.method753("Maximale Anmelde)2Versuche \u001c1berschritten)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method1676() {
		anIntArray287 = null;
		anIntArray291 = null;
		anIntArray286 = null;
		anIntArray292 = null;
		anIntArray288 = null;
		aClass62_1218 = null;
		anIntArray290 = null;
		aBigInteger2 = null;
		aClass62_1217 = null;
		aClass34_32 = null;
		anIntArray293 = null;
		anIntArray289 = null;
		aClass62_1215 = null;
		aClass62Array13 = null;
		aClass62_1216 = null;
		anIntArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIILclient!ja;)V")
	public static void method1687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub3_Sub1_Sub1 arg3) {
		if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1 == arg3 || Static41.anInt1209 >= 400) {
			return;
		}
		@Pc(49) Class62 local49;
		if (arg3.anInt1356 == 0) {
			local49 = Static49.method782(new Class62[] { arg3.aClass62_570, Static22.method494(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1359, arg3.anInt1359), Static95.aClass62_1158, Static54.aClass62_1246, Static99.method1662(arg3.anInt1359), Static90.aClass62_1087 });
		} else {
			local49 = Static49.method782(new Class62[] { arg3.aClass62_570, Static95.aClass62_1158, Static12.aClass62_165, Static99.method1662(arg3.anInt1356), Static90.aClass62_1087 });
		}
		@Pc(104) int local104;
		if (anInt2653 == 1) {
			Static91.method1543(Static83.aClass62_209, arg0, 16, arg2, Static49.method782(new Class62[] { Static51.aClass62_1035, Static24.aClass62_323, local49 }), arg1);
		} else if (Static77.anInt2067 != 1) {
			for (local104 = 4; local104 >= 0; local104--) {
				if (Static62.aClass62Array9[local104] != null) {
					@Pc(116) short local116 = 0;
					@Pc(118) int local118 = 0;
					if (Static62.aClass62Array9[local104].method1680(Static96.aClass62_1174)) {
						if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1359 < arg3.anInt1359) {
							local116 = 2000;
						}
						if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1352 != 0 && arg3.anInt1352 != 0) {
							if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1352 == arg3.anInt1352) {
								local116 = 2000;
							} else {
								local116 = 0;
							}
						}
					} else if (Static77.aBooleanArray9[local104]) {
						local116 = 2000;
					}
					if (local104 == 0) {
						local118 = local116 + 22;
					}
					if (local104 == 1) {
						local118 = local116 + 20;
					}
					if (local104 == 2) {
						local118 = local116 + 10;
					}
					if (local104 == 3) {
						local118 = local116 + 34;
					}
					if (local104 == 4) {
						local118 = local116 + 32;
					}
					Static91.method1543(Static62.aClass62Array9[local104], arg0, local118, arg2, Static49.method782(new Class62[] { Static75.aClass62_890, local49 }), arg1);
				}
			}
		} else if ((Static25.anInt771 & 0x8) == 8) {
			Static91.method1543(Static16.aClass62_266, arg0, 12, arg2, Static49.method782(new Class62[] { Static59.aClass62_704, Static24.aClass62_323, local49 }), arg1);
		}
		for (local104 = 0; local104 < Static41.anInt1209; local104++) {
			if (Static46.anIntArray108[local104] == 28) {
				Static18.aClass62Array6[local104] = Static49.method782(new Class62[] { Static71.aClass62_849, Static16.aClass62_269, Static75.aClass62_890, local49 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method1705() {
		for (@Pc(12) int local12 = 0; local12 < Static71.anInt1938; local12++) {
			@Pc(18) int local18 = Static40.anIntArray82[local12]--;
			if (Static40.anIntArray82[local12] >= -10) {
				@Pc(83) Class49 local83 = Static8.aClass49Array1[local12];
				if (local83 == null) {
					local83 = Static114.method1190(Static19.aClass42_Sub1_62, Static5.anIntArray19[local12]);
					if (local83 == null) {
						continue;
					}
					Static40.anIntArray82[local12] += local83.method1192();
					Static8.aClass49Array1[local12] = local83;
				}
				if (Static40.anIntArray82[local12] < 0) {
					@Pc(116) Class3_Sub5_Sub1 local116 = local83.method1189().method554(Static104.aClass12_1);
					@Pc(121) Class3_Sub4_Sub1 local121 = Static111.method410(local116, Static46.anInt1364);
					local121.method413(Static22.anIntArray56[local12] - 1);
					Static53.aClass3_Sub4_Sub2_1.method1574(local121);
					Static40.anIntArray82[local12] = -100;
				}
			} else {
				Static71.anInt1938--;
				for (@Pc(34) int local34 = local12; local34 < Static71.anInt1938; local34++) {
					Static5.anIntArray19[local34] = Static5.anIntArray19[local34 + 1];
					Static8.aClass49Array1[local34] = Static8.aClass49Array1[local34 + 1];
					Static22.anIntArray56[local34] = Static22.anIntArray56[local34 + 1];
					Static40.anIntArray82[local34] = Static40.anIntArray82[local34 + 1];
				}
				local12--;
			}
		}
		if (Static55.anInt1546 <= 0) {
			return;
		}
		Static55.anInt1546 -= 20;
		if (Static55.anInt1546 < 0) {
			Static55.anInt1546 = 0;
		}
		if (Static55.anInt1546 == 0 && Static44.anInt1234 != 0 && Static90.anInt2425 != -1) {
			Static92.method1552(0, Static79.aClass42_Sub1_46, Static90.anInt2425, Static44.anInt1234);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1706() {
		Static29.aClass9_16.method682();
		Static74.anIntArray225 = Static66.method1120(Static74.anIntArray225);
	}
}
