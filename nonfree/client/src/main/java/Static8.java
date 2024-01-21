import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_5;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public static final int anInt341 = 7759444;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_215 = Static106.method1849("button near the top of that page)3");

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_213 = aClass66_215;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_214 = Static106.method1849(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "Lclient!rb;")
	public static Class60 aClass60_22 = new Class60(30);

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_216 = Static106.method1849("Hier wechseln");

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "[I")
	public static int[] anIntArray55 = new int[200];

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "Lclient!rb;")
	public static Class60 aClass60_23 = new Class60(100);

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_217 = Static106.method1849("mn");

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_218 = Static106.method1849("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lclient!pd;")
	public static Class1_Sub1_Sub11 method297(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub11 local14 = (Class1_Sub1_Sub11) aClass60_23.method1745((long) arg0);
		if (local14 != null) {
			return local14;
		}
		local14 = Static38.method2004(Static63.aClass5_56, arg0, Static4.aClass5_7);
		if (local14 != null) {
			aClass60_23.method1741((long) arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public static void method299(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = Static111.anInt2653;
		if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7 == Static52.anInt1607 && Static13.anInt451 == Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7) {
			Static52.anInt1607 = 0;
		}
		if (arg0) {
			local7 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub1_Sub1_Sub5_Sub2 local37;
			@Pc(39) int local39;
			if (arg0) {
				local37 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1;
				local39 = 33538048;
			} else {
				local39 = Static51.anIntArray239[local31] << 14;
				local37 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local31]];
			}
			if (local37 != null && local37.method931()) {
				local37.aBoolean45 = false;
				if ((Static87.aBoolean96 && Static111.anInt2653 > 50 || Static111.anInt2653 > 200) && !arg0 && local37.anInt1288 == local37.anInt1247) {
					local37.aBoolean45 = true;
				}
				@Pc(85) int local85 = local37.anInt1261 >> 7;
				@Pc(90) int local90 = local37.anInt1271 >> 7;
				if (local85 >= 0 && local85 < 104 && local90 >= 0 && local90 < 104) {
					if (local37.aClass1_Sub1_Sub1_Sub6_1 == null || Static22.anInt636 < local37.anInt1302 || Static22.anInt636 >= local37.anInt1322) {
						if ((local37.anInt1261 & 0x7F) == 64 && (local37.anInt1271 & 0x7F) == 64) {
							if (Static45.anInt1444 == Static41.anIntArrayArray13[local85][local90]) {
								continue;
							}
							Static41.anIntArrayArray13[local85][local90] = Static45.anInt1444;
						}
						local37.anInt1308 = Static77.method1476(local37.anInt1271, Static22.anInt635, local37.anInt1261);
						Static129.aClass9_1.method315(Static22.anInt635, local37.anInt1261, local37.anInt1271, local37.anInt1308, 60, local37, local37.anInt1290, local39, local37.aBoolean44);
					} else {
						local37.aBoolean45 = false;
						local37.anInt1308 = Static77.method1476(local37.anInt1271, Static22.anInt635, local37.anInt1261);
						Static129.aClass9_1.method338(Static22.anInt635, local37.anInt1261, local37.anInt1271, local37.anInt1308, local37, local37.anInt1290, local39, local37.anInt1307, local37.anInt1300, local37.anInt1298, local37.anInt1310);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public static void method300() {
		anIntArray55 = null;
		aClass66_215 = null;
		aClass60_23 = null;
		aShortArray10 = null;
		aClass66_218 = null;
		aClass5_Sub1_5 = null;
		aClass66_217 = null;
		aClass66_214 = null;
		aClass60_22 = null;
		aClass66_216 = null;
		aClass66_213 = null;
	}
}
