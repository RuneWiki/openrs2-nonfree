import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	public static int anInt1902;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_855 = Static24.method441(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_856 = Static24.method441("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!ge;")
	public static Class21 aClass21_27 = new Class21(100);

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_857 = Static24.method441("null");

	@OriginalMember(owner = "client!m", name = "G", descriptor = "Lclient!wb;")
	private static Class65 aClass65_858 = Static24.method441("K");

	@OriginalMember(owner = "client!m", name = "J", descriptor = "[J")
	public static long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!m", name = "P", descriptor = "Lclient!wb;")
	public static Class65 aClass65_859 = aClass65_858;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_860 = aClass65_858;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!wb;")
	private static Class65 aClass65_861 = Static24.method441("Loaded input handler");

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Lclient!wb;")
	public static Class65 aClass65_862 = Static24.method441("");

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Lclient!wb;")
	private static Class65 aClass65_866 = Static24.method441("Friends");

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Lclient!wb;")
	public static Class65 aClass65_863 = aClass65_866;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "[I")
	public static int[] anIntArray258 = new int[25];

	@OriginalMember(owner = "client!m", name = "X", descriptor = "Lclient!wb;")
	public static Class65 aClass65_864 = Static24.method441("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_865 = Static24.method441("Lade Texturen )2 ");

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	public static int anInt1905 = 128;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "Lclient!wb;")
	private static Class65 aClass65_868 = Static24.method441("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_867 = aClass65_868;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_869 = Static24.method441("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_870 = Static24.method441("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_871 = aClass65_861;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static void method1107() {
		aClass65_863 = null;
		aClass21_27 = null;
		aClass65_860 = null;
		aClass65_869 = null;
		aClass65_855 = null;
		aClass65_871 = null;
		anIntArray258 = null;
		aClass65_865 = null;
		aClass65_861 = null;
		aByteArrayArray6 = null;
		aLongArray9 = null;
		aClass65_857 = null;
		aClass65_858 = null;
		aClass65_864 = null;
		aClass65_859 = null;
		aClass65_862 = null;
		aClass65_856 = null;
		aClass65_866 = null;
		aClass65_867 = null;
		aClass65_870 = null;
		aClass65_868 = null;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	public static void method1108() {
		Static25.aClass21_7.method743();
		Static6.aClass21_4.method743();
		Static45.aClass21_15.method743();
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
	public static int method1109() {
		return 5;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
	public static void method1111(@OriginalArg(0) boolean arg0) {
		if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 >> 7 == Static99.anInt2533 && Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 >> 7 == Static54.anInt1641) {
			Static99.anInt2533 = 0;
		}
		@Pc(25) int local25 = Static54.anInt1640;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(43) Class2_Sub1_Sub1_Sub2_Sub2 local43;
			@Pc(49) int local49;
			if (arg0) {
				local49 = 33538048;
				local43 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1;
			} else {
				local43 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local31]];
				local49 = Static24.anIntArray99[local31] << 14;
			}
			if (local43 != null && local43.method925()) {
				local43.aBoolean87 = false;
				@Pc(69) int local69 = local43.anInt1518 >> 7;
				@Pc(74) int local74 = local43.anInt1562 >> 7;
				if ((Static4.aBoolean16 && Static54.anInt1640 > 50 || Static54.anInt1640 > 200) && !arg0 && local43.anInt1515 == local43.anInt1542) {
					local43.aBoolean87 = true;
				}
				if (local69 >= 0 && local69 < 104 && local74 >= 0 && local74 < 104) {
					if (local43.aClass2_Sub1_Sub1_Sub6_1 == null || Static108.anInt2902 < local43.anInt1588 || Static108.anInt2902 >= local43.anInt1596) {
						if ((local43.anInt1518 & 0x7F) == 64 && (local43.anInt1562 & 0x7F) == 64) {
							if (Static79.anIntArrayArray19[local69][local74] == Static100.anInt2785) {
								continue;
							}
							Static79.anIntArrayArray19[local69][local74] = Static100.anInt2785;
						}
						local43.anInt1591 = Static25.method447(Static62.anInt1879, local43.anInt1562, local43.anInt1518);
						Static67.aClass18_1.method576(Static62.anInt1879, local43.anInt1518, local43.anInt1562, local43.anInt1591, 60, local43, local43.anInt1540, local49, local43.aBoolean86);
					} else {
						local43.aBoolean87 = false;
						local43.anInt1591 = Static25.method447(Static62.anInt1879, local43.anInt1562, local43.anInt1518);
						Static67.aClass18_1.method606(Static62.anInt1879, local43.anInt1518, local43.anInt1562, local43.anInt1591, local43, local43.anInt1540, local49, local43.anInt1575, local43.anInt1598, local43.anInt1576, local43.anInt1595);
					}
				}
			}
		}
	}
}
