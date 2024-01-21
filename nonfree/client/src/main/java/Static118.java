import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!ke;")
	public static Class43 aClass43_8;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array10;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!od;")
	private static Class60 aClass60_1064 = Static41.method597("Ok");

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
	public static int[] anIntArray336 = new int[2048];

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_1065 = Static41.method597("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_1066 = Static41.method597("<col=ff7000>");

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	public static int anInt2731 = 0;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
	public static int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_1067 = aClass60_1064;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	public static int anInt2741 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!be;BII)V")
	public static void method1890(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1 == arg1 || Static48.anInt1184 >= 400) {
			return;
		}
		@Pc(45) Class60 local45;
		if (arg1.anInt415 == 0) {
			local45 = Static12.method1761(new Class60[] { arg1.aClass60_139, Static128.method1947(arg1.anInt413, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt413), Static97.aClass60_922, Static44.aClass60_893, Static65.method1051(arg1.anInt413), Static47.aClass60_435 });
		} else {
			local45 = Static12.method1761(new Class60[] { arg1.aClass60_139, Static97.aClass60_922, Static117.aClass60_1060, Static65.method1051(arg1.anInt415), Static47.aClass60_435 });
		}
		if (Static44.anInt2167 == 1) {
			Static113.method814(Static12.method1761(new Class60[] { Static108.aClass60_1004, Static55.aClass60_536, local45 }), Static83.aClass60_819, arg0, 22, arg2, arg3);
		} else if (!Static86.aBoolean71) {
			for (@Pc(92) int local92 = 7; local92 >= 0; local92--) {
				if (Static79.aClass60Array13[local92] != null) {
					@Pc(104) short local104 = 0;
					if (Static79.aClass60Array13[local92].method1318(Static91.aClass60_880)) {
						if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt413 < arg1.anInt413) {
							local104 = 2000;
						}
						if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt426 != 0 && arg1.anInt426 != 0) {
							if (arg1.anInt426 == Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt426) {
								local104 = 2000;
							} else {
								local104 = 0;
							}
						}
					} else if (Static23.aBooleanArray3[local92]) {
						local104 = 2000;
					}
					@Pc(160) int local160 = Static46.anIntArray117[local92] + local104;
					Static113.method814(Static12.method1761(new Class60[] { Static72.aClass60_755, local45 }), Static79.aClass60Array13[local92], arg0, local160, arg2, arg3);
				}
			}
		} else if ((Static111.anInt2632 & 0x8) == 8) {
			Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static55.aClass60_536, local45 }), Static124.aClass60_1108, arg0, 35, arg2, arg3);
		}
		for (@Pc(260) int local260 = 0; local260 < Static48.anInt1184; local260++) {
			if (Static82.anIntArray226[local260] == 29) {
				Static128.aClass60Array20[local260] = Static12.method1761(new Class60[] { Static72.aClass60_755, local45 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method1893() {
		aClass60_1067 = null;
		aClass4_Sub3_Sub6_Sub3Array10 = null;
		aClass43_8 = null;
		aClass60_1066 = null;
		aClass60_1065 = null;
		anIntArray336 = null;
		anIntArray337 = null;
		aClass60_1064 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public static boolean method1894(@OriginalArg(1) int arg0) {
		if (Static56.aBooleanArray9[arg0]) {
			return true;
		} else if (Static32.aClass10_12.method1780(arg0)) {
			@Pc(23) int local23 = Static32.aClass10_12.method1772(arg0);
			if (local23 == 0) {
				Static56.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static82.aClass4_Sub14ArrayArray1[arg0] == null) {
				Static82.aClass4_Sub14ArrayArray1[arg0] = new Class4_Sub14[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static82.aClass4_Sub14ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static32.aClass10_12.method1774(arg0, local42);
					if (local56 != null) {
						Static82.aClass4_Sub14ArrayArray1[arg0][local42] = new Class4_Sub14();
						Static82.aClass4_Sub14ArrayArray1[arg0][local42].anInt2388 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static82.aClass4_Sub14ArrayArray1[arg0][local42].method1696(new Class4_Sub9(local56));
						} else {
							Static82.aClass4_Sub14ArrayArray1[arg0][local42].method1691(new Class4_Sub9(local56));
						}
					}
				}
			}
			Static56.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method1895() {
		for (@Pc(11) Class4_Sub24 local11 = (Class4_Sub24) Static16.aClass45_2.method982(); local11 != null; local11 = (Class4_Sub24) Static16.aClass45_2.method986()) {
			if (local11.aClass4_Sub3_Sub3_1 != null) {
				local11.method1986();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	public static int method1898() {
		@Pc(9) int local9 = Static55.method882(Static109.anInt2592, Static98.anInt2286, Static77.anInt1866);
		return local9 - Static23.anInt816 >= 800 || (Static69.aByteArrayArrayArray5[Static77.anInt1866][Static98.anInt2286 >> 7][Static109.anInt2592 >> 7] & 0x4) == 0 ? 3 : Static77.anInt1866;
	}
}
