import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!vf;")
	public static Class2_Sub1_Sub16 aClass2_Sub1_Sub16_1;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!g;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_385 = Static119.method1462("Neuer Benutzer");

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!pe;")
	private static Class65 aClass65_386 = Static119.method1462("button near the top of that page)3");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public static int anInt808 = 0;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_387 = aClass65_386;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!pe;")
	private static Class65 aClass65_388 = Static119.method1462("Loading )2 please wait)3");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!pe;")
	private static Class65 aClass65_391 = Static119.method1462("Loading wordpack )2 ");

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_389 = aClass65_391;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_390 = aClass65_388;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public static volatile int anInt814 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLclient!ha;I)V")
	public static void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1 == arg2 || Static49.anInt1205 >= 400) {
			return;
		}
		@Pc(61) Class65 local61;
		if (arg2.anInt1018 == 0) {
			local61 = Static35.method647(new Class65[] { arg2.aClass65_457, Static105.method1706(arg2.anInt1024, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1024), Static33.aClass65_366, Static70.aClass65_700, Static120.method1871(arg2.anInt1024), Static21.aClass65_254 });
		} else {
			local61 = Static35.method647(new Class65[] { arg2.aClass65_457, Static33.aClass65_366, Static53.aClass65_558, Static120.method1871(arg2.anInt1018), Static21.aClass65_254 });
		}
		@Pc(103) int local103;
		if (Static113.anInt2520 == 1) {
			Static101.method1657(arg3, Static76.aClass65_725, arg1, arg0, 2, Static35.method647(new Class65[] { Static18.aClass65_143, Static72.aClass65_710, local61 }));
		} else if (!Static117.aBoolean103) {
			for (local103 = 7; local103 >= 0; local103--) {
				if (Static41.aClass65Array21[local103] != null) {
					@Pc(117) short local117 = 0;
					if (Static41.aClass65Array21[local103].method1488(Static22.aClass65_263)) {
						if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1024 < arg2.anInt1024) {
							local117 = 2000;
						}
						if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1031 != 0 && arg2.anInt1031 != 0) {
							if (arg2.anInt1031 == Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1031) {
								local117 = 2000;
							} else {
								local117 = 0;
							}
						}
					} else if (Static54.aBooleanArray10[local103]) {
						local117 = 2000;
					}
					@Pc(169) int local169 = local117 + Static132.anIntArray413[local103];
					Static101.method1657(arg3, Static41.aClass65Array21[local103], arg1, arg0, local169, Static35.method647(new Class65[] { Static106.aClass65_1003, local61 }));
				}
			}
		} else if ((Static16.anInt2217 & 0x8) == 8) {
			Static101.method1657(arg3, Static103.aClass65_984, arg1, arg0, 9, Static35.method647(new Class65[] { Static22.aClass65_262, Static72.aClass65_710, local61 }));
		}
		for (local103 = 0; local103 < Static49.anInt1205; local103++) {
			if (Static126.anIntArray355[local103] == 40) {
				Static83.aClass65Array40[local103] = Static35.method647(new Class65[] { Static106.aClass65_1003, local61 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method654() {
		aClass65_388 = null;
		aClass65_389 = null;
		aClass65_387 = null;
		aClass29_1 = null;
		aClass65_386 = null;
		aClass2_Sub1_Sub16_1 = null;
		aClass65_385 = null;
		aClass65_391 = null;
		aClass65_390 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method655() {
		Static128.anIntArray359 = null;
		Static110.anIntArray328 = null;
		Static76.aByteArrayArray6 = null;
		Static100.anIntArray294 = null;
		Static88.anIntArray256 = null;
		Static45.anIntArray130 = null;
	}
}
