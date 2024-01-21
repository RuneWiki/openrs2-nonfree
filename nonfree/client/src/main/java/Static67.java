import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_860 = Static23.method501("compass");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!kc;")
	public static Class37 aClass37_19 = new Class37(64);

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!mc;")
	private static Class42 aClass42_861 = Static23.method501("World");

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_865 = Static23.method501("Use");

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_862 = aClass42_865;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_863 = Static23.method501("m");

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_864 = Static23.method501("Menge eingeben:");

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public static int anInt1636 = 0;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_866 = Static23.method501("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_867 = aClass42_861;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!mc;")
	public static Class42 aClass42_868 = Static23.method501("*6n");

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_869 = Static23.method501("Schlie-8en");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	public static void method1149(@OriginalArg(0) boolean arg0) {
		Static105.anInt2733++;
		if (Static105.anInt2733 < 50 && !arg0) {
			return;
		}
		Static105.anInt2733 = 0;
		if (Static27.aBoolean37 || Static58.aClass47_17 == null) {
			return;
		}
		Static98.aClass1_Sub8_Sub1_3.method1236(195);
		try {
			Static58.aClass47_17.method1343(Static98.aClass1_Sub8_Sub1_3.anInt1692, Static98.aClass1_Sub8_Sub1_3.aByteArray24);
			Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
		} catch (@Pc(44) IOException local44) {
			Static27.aBoolean37 = true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qc;II)I")
	public static int method1150(@OriginalArg(0) Class1_Sub1_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray26 == null || arg1 >= arg0.anIntArrayArray26.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg0.anIntArrayArray26[arg1];
			@Pc(31) int local31 = 0;
			@Pc(33) byte local33 = 0;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local31++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local35;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 1) {
					local42 = Static73.anIntArray264[local29[local31++]];
				}
				if (local40 == 2) {
					local42 = Static108.anIntArray405[local29[local31++]];
				}
				if (local40 == 3) {
					local42 = Static64.anIntArray225[local29[local31++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(111) int local111;
				@Pc(122) Class1_Sub1_Sub12 local122;
				@Pc(127) int local127;
				@Pc(142) int local142;
				if (local40 == 4) {
					local111 = local29[local31++] << 16;
					@Pc(118) int local118 = local111 + local29[local31++];
					local122 = Static33.method578(local118);
					local127 = local29[local31++];
					if (local127 != -1 && (!Static36.method617(local127).aBoolean9 || Static90.aBoolean133)) {
						for (local142 = 0; local142 < local122.anIntArray332.length; local142++) {
							if (local122.anIntArray332[local142] == local127 + 1) {
								local42 += local122.anIntArray330[local142];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static51.anIntArray200[local29[local31++]];
				}
				if (local40 == 6) {
					local42 = Class37.anIntArray207[Static108.anIntArray405[local29[local31++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static51.anIntArray200[local29[local31++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2622;
				}
				if (local40 == 9) {
					for (local111 = 0; local111 < 25; local111++) {
						if (Static15.aBooleanArray4[local111]) {
							local42 += Static108.anIntArray405[local111];
						}
					}
				}
				if (local40 == 10) {
					local111 = local29[local31++] << 16;
					local111 += local29[local31++];
					local122 = Static33.method578(local111);
					local127 = local29[local31++];
					if (local127 != -1 && (!Static36.method617(local127).aBoolean9 || Static90.aBoolean133)) {
						for (local142 = 0; local142 < local122.anIntArray332.length; local142++) {
							if (local122.anIntArray332[local142] == local127 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static51.anInt1378;
				}
				if (local40 == 12) {
					local42 = Static48.anInt1217;
				}
				if (local40 == 13) {
					local111 = Static51.anIntArray200[local29[local31++]];
					@Pc(330) int local330 = local29[local31++];
					local42 = (local111 & 0x1 << local330) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local111 = local29[local31++];
					local42 = Static52.method973(local111);
				}
				if (local40 == 18) {
					local42 = Static51.anInt1373 + (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 >> 7);
				}
				if (local40 == 19) {
					local42 = (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 >> 7) + Static45.anInt1843;
				}
				if (local40 == 20) {
					local42 = local29[local31++];
				}
				if (local44 == 0) {
					if (local33 == 0) {
						local35 += local42;
					}
					if (local33 == 1) {
						local35 -= local42;
					}
					if (local33 == 2 && local42 != 0) {
						local35 /= local42;
					}
					if (local33 == 3) {
						local35 *= local42;
					}
					local33 = 0;
				} else {
					local33 = local44;
				}
			}
		} catch (@Pc(436) Exception local436) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1151() {
		Static34.method589();
		Static37.method630();
		Static12.method276();
		Static12.method273();
		Static33.method580();
		Static33.method581();
		Static12.method274();
		Static49.method886();
		Static101.method1768();
		Static16.method413();
		Static5.method104();
		Static75.method992();
		((Class11) Static41.anInterface4_1).method269();
		Static59.aClass33_Sub1_15.method1318();
		Static24.aClass33_Sub1_9.method1318();
		Static93.aClass33_Sub1_19.method1318();
		Static7.aClass33_Sub1_1.method1318();
		Static33.aClass33_Sub1_11.method1318();
		Static7.aClass33_Sub1_2.method1318();
		Static38.aClass33_Sub1_12.method1318();
		Static8.aClass33_Sub1_5.method1318();
		Static47.aClass33_Sub1_18.method1318();
		Static25.aClass33_Sub1_10.method1318();
		Static83.aClass33_Sub1_16.method1318();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1152() {
		aClass1_Sub1_Sub1_Sub4_17 = null;
		aClass42_867 = null;
		aClass42_868 = null;
		aClass42_863 = null;
		aClass1_Sub8_1 = null;
		aClass42_861 = null;
		aClass42_865 = null;
		aClass42_860 = null;
		aClass42_862 = null;
		aClass42_869 = null;
		aClass42_864 = null;
		aClass37_19 = null;
		aClass42_866 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!ja;I)Z")
	public static boolean method1153(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte[] local18 = arg1.method1305(arg2, arg0);
		if (local18 == null) {
			return false;
		} else {
			Static23.method504(local18);
			return true;
		}
	}
}
