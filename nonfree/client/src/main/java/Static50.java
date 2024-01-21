import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "Lclient!re;")
	public static Class9 aClass9_25;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_35;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "Lclient!u;")
	private static Class74 aClass74_875 = Static72.method1077("OFF");

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_863 = aClass74_875;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!u;")
	private static Class74 aClass74_864 = Static72.method1077("Username: ");

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "Lclient!u;")
	private static Class74 aClass74_870 = Static72.method1077("scroll:");

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_865 = aClass74_870;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Lclient!u;")
	public static Class74 aClass74_866 = Static72.method1077("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public static int anInt1174 = 0;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "Lclient!u;")
	private static Class74 aClass74_867 = Static72.method1077(" more options");

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_868 = aClass74_870;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_869 = aClass74_867;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "Lclient!u;")
	public static Class74 aClass74_871 = Static72.method1077("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "[Lclient!ob;")
	public static Class55[] aClass55Array1 = new Class55[4];

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "Lclient!u;")
	private static Class74 aClass74_872 = Static72.method1077("Password: ");

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lclient!u;")
	public static Class74 aClass74_873 = aClass74_872;

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_874 = aClass74_864;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)I")
	public static int method806(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!hf;IIII)V")
	public static void method808(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static112.anInt2421 >= 400) {
			return;
		}
		if (arg0.anIntArray130 != null) {
			arg0 = arg0.method767();
		}
		if (arg0 == null || !arg0.aBoolean47) {
			return;
		}
		@Pc(31) Class74 local31 = arg0.aClass74_806;
		if (arg0.anInt1093 != 0) {
			local31 = Static91.method1340(new Class74[] { local31, Static107.method1600(arg0.anInt1093, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2734), Static34.aClass74_624, Static15.aClass74_409, Static56.method940(arg0.anInt1093), Static61.aClass74_1109 });
		}
		if (Static40.anInt960 == 1) {
			Static79.method1250(arg1, arg3, Static91.method1340(new Class74[] { Static121.aClass74_1619, Static20.aClass74_462, local31 }), Static92.aClass74_1315, arg2, 9);
		} else if (!Static6.aBoolean7) {
			@Pc(113) Class74[] local113 = arg0.aClass74Array8;
			if (Static1.aBoolean85) {
				local113 = Static12.method276(local113);
			}
			@Pc(127) int local127;
			if (local113 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local113[local127] != null && !local113[local127].method1701(Static67.aClass74_1045)) {
						@Pc(146) byte local146 = 0;
						if (local127 == 0) {
							local146 = 39;
						}
						if (local127 == 1) {
							local146 = 5;
						}
						if (local127 == 2) {
							local146 = 7;
						}
						if (local127 == 3) {
							local146 = 12;
						}
						if (local127 == 4) {
							local146 = 4;
						}
						Static79.method1250(arg1, arg3, Static91.method1340(new Class74[] { Static20.aClass74_469, local31 }), local113[local127], arg2, local146);
					}
				}
			}
			if (local113 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local113[local127] != null && local113[local127].method1701(Static67.aClass74_1045)) {
						@Pc(226) short local226 = 0;
						if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2734 < arg0.anInt1093) {
							local226 = 2000;
						}
						@Pc(235) int local235 = 0;
						if (local127 == 0) {
							local235 = local226 + 39;
						}
						if (local127 == 1) {
							local235 = local226 + 5;
						}
						if (local127 == 2) {
							local235 = local226 + 7;
						}
						if (local127 == 3) {
							local235 = local226 + 12;
						}
						if (local127 == 4) {
							local235 = local226 + 4;
						}
						Static79.method1250(arg1, arg3, Static91.method1340(new Class74[] { Static20.aClass74_469, local31 }), local113[local127], arg2, local235);
					}
				}
			}
			Static79.method1250(arg1, arg3, Static91.method1340(new Class74[] { Static20.aClass74_469, local31 }), Static2.aClass74_27, arg2, 1006);
		} else if ((Static65.anInt1451 & 0x2) == 2) {
			Static79.method1250(arg1, arg3, Static91.method1340(new Class74[] { Static4.aClass74_41, Static20.aClass74_462, local31 }), Static25.aClass74_526, arg2, 43);
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method809() {
		aClass74_870 = null;
		aClass74_872 = null;
		aClass74_873 = null;
		aClass74_869 = null;
		aClass9_25 = null;
		aClass74_868 = null;
		aClass74_874 = null;
		aClass74_866 = null;
		aClass74_865 = null;
		aClass74_863 = null;
		aClass74_867 = null;
		aClass74_871 = null;
		aClass26_Sub1_35 = null;
		aClass55Array1 = null;
		aClass74_864 = null;
		aClass74_875 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
	public static boolean method810() {
		@Pc(13) long local13 = Static10.method244();
		@Pc(18) int local18 = (int) (local13 - Static34.aLong41);
		if (local18 > 200) {
			local18 = 200;
		}
		Static116.anInt2474 += local18;
		Static34.aLong41 = local13;
		if (Static16.anInt456 == 0 && Static10.anInt324 == 0 && Static67.anInt1476 == 0 && Static68.anInt1493 == 0) {
			return true;
		} else if (Static6.aClass62_1 == null) {
			return false;
		} else {
			try {
				if (Static116.anInt2474 > 30000) {
					throw new IOException();
				}
				@Pc(66) Class2_Sub2_Sub15 local66;
				@Pc(71) Class2_Sub10 local71;
				while (Static10.anInt324 < 20 && Static68.anInt1493 > 0) {
					local66 = (Class2_Sub2_Sub15) Static35.aClass58_69.method1305();
					local71 = new Class2_Sub10(4);
					local71.method1486(1);
					local71.method1512((int) local66.aLong96);
					Static6.aClass62_1.method1343(4, local71.aByteArray27);
					Static33.aClass58_24.method1301(local66.aLong96, local66);
					Static10.anInt324++;
					Static68.anInt1493--;
				}
				while (Static16.anInt456 < 20 && Static67.anInt1476 > 0) {
					local66 = (Class2_Sub2_Sub15) Static84.aClass56_2.method1285();
					local71 = new Class2_Sub10(4);
					local71.method1486(0);
					local71.method1512((int) local66.aLong96);
					Static6.aClass62_1.method1343(4, local71.aByteArray27);
					local66.method1935();
					Static25.aClass58_21.method1301(local66.aLong96, local66);
					Static67.anInt1476--;
					Static16.anInt456++;
				}
				for (@Pc(160) int local160 = 0; local160 < 100; local160++) {
					@Pc(166) int local166 = Static6.aClass62_1.method1350();
					if (local166 < 0) {
						throw new IOException();
					}
					if (local166 == 0) {
						break;
					}
					@Pc(176) byte local176 = 0;
					if (Static55.aClass2_Sub2_Sub15_2 == null) {
						local176 = 8;
					} else if (Static75.anInt1599 == 0) {
						local176 = 1;
					}
					Static116.anInt2474 = 0;
					@Pc(206) int local206;
					@Pc(198) int local198;
					@Pc(243) int local243;
					@Pc(319) int local319;
					if (local176 <= 0) {
						local198 = 512 - Static75.anInt1599;
						local206 = Static35.aClass2_Sub10_61.aByteArray27.length - Static55.aClass2_Sub2_Sub15_2.aByte4;
						if (local206 - Static35.aClass2_Sub10_61.anInt2187 < local198) {
							local198 = local206 - Static35.aClass2_Sub10_61.anInt2187;
						}
						if (local198 > local166) {
							local198 = local166;
						}
						Static6.aClass62_1.method1345(Static35.aClass2_Sub10_61.aByteArray27, local198, Static35.aClass2_Sub10_61.anInt2187);
						if (Static49.aByte1 != 0) {
							for (local243 = 0; local243 < local198; local243++) {
								Static35.aClass2_Sub10_61.aByteArray27[local243 + Static35.aClass2_Sub10_61.anInt2187] ^= Static49.aByte1;
							}
						}
						Static35.aClass2_Sub10_61.anInt2187 += local198;
						Static75.anInt1599 += local198;
						if (Static35.aClass2_Sub10_61.anInt2187 == local206) {
							if (Static55.aClass2_Sub2_Sub15_2.aLong96 == 16711935L) {
								Static116.aClass2_Sub10_54 = Static35.aClass2_Sub10_61;
								for (local243 = 0; local243 < 256; local243++) {
									@Pc(306) Class26_Sub1 local306 = Static65.aClass26_Sub1Array1[local243];
									if (local306 != null) {
										Static116.aClass2_Sub10_54.anInt2187 = local243 * 8 + 5;
										local319 = Static116.aClass2_Sub10_54.method1532();
										@Pc(323) int local323 = Static116.aClass2_Sub10_54.method1532();
										local306.method1385(local323, local319);
									}
								}
							} else {
								Static45.aCRC32_1.reset();
								Static45.aCRC32_1.update(Static35.aClass2_Sub10_61.aByteArray27, 0, local206);
								local243 = (int) Static45.aCRC32_1.getValue();
								if (Static55.aClass2_Sub2_Sub15_2.anInt2396 != local243) {
									try {
										Static6.aClass62_1.method1347();
									} catch (@Pc(361) Exception local361) {
									}
									Static47.anInt1092++;
									Static49.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static6.aClass62_1 = null;
									return false;
								}
								Static47.anInt1092 = 0;
								Static30.anInt724 = 0;
								Static55.aClass2_Sub2_Sub15_2.aClass26_Sub1_65.method1379(Static19.aBoolean19, Static35.aClass2_Sub10_61.aByteArray27, (int) (Static55.aClass2_Sub2_Sub15_2.aLong96 & 0xFFFFL), (Static55.aClass2_Sub2_Sub15_2.aLong96 & 0xFF0000L) == 16711680L);
							}
							Static55.aClass2_Sub2_Sub15_2.method1930();
							Static75.anInt1599 = 0;
							Static35.aClass2_Sub10_61 = null;
							if (Static19.aBoolean19) {
								Static10.anInt324--;
							} else {
								Static16.anInt456--;
							}
							Static55.aClass2_Sub2_Sub15_2 = null;
						} else {
							if (Static75.anInt1599 != 512) {
								break;
							}
							Static75.anInt1599 = 0;
						}
					} else {
						local206 = local176 - Static47.aClass2_Sub10_26.anInt2187;
						if (local166 < local206) {
							local206 = local166;
						}
						Static6.aClass62_1.method1345(Static47.aClass2_Sub10_26.aByteArray27, local206, Static47.aClass2_Sub10_26.anInt2187);
						if (Static49.aByte1 != 0) {
							for (local198 = 0; local198 < local206; local198++) {
								Static47.aClass2_Sub10_26.aByteArray27[Static47.aClass2_Sub10_26.anInt2187 + local198] = (byte) (Static47.aClass2_Sub10_26.aByteArray27[Static47.aClass2_Sub10_26.anInt2187 + local198] ^ Static49.aByte1);
							}
						}
						Static47.aClass2_Sub10_26.anInt2187 += local206;
						if (local176 > Static47.aClass2_Sub10_26.anInt2187) {
							break;
						}
						if (Static55.aClass2_Sub2_Sub15_2 == null) {
							Static47.aClass2_Sub10_26.anInt2187 = 0;
							local198 = Static47.aClass2_Sub10_26.method1514();
							local243 = Static47.aClass2_Sub10_26.method1517();
							@Pc(507) int local507 = Static47.aClass2_Sub10_26.method1514();
							@Pc(514) long local514 = (long) (local243 + (local198 << 16));
							local319 = Static47.aClass2_Sub10_26.method1532();
							@Pc(524) Class2_Sub2_Sub15 local524 = (Class2_Sub2_Sub15) Static33.aClass58_24.method1307(local514);
							Static19.aBoolean19 = true;
							if (local524 == null) {
								local524 = (Class2_Sub2_Sub15) Static25.aClass58_21.method1307(local514);
								Static19.aBoolean19 = false;
							}
							if (local524 == null) {
								throw new IOException();
							}
							@Pc(548) int local548 = local507 == 0 ? 5 : 9;
							Static55.aClass2_Sub2_Sub15_2 = local524;
							Static35.aClass2_Sub10_61 = new Class2_Sub10(local319 + local548 + Static55.aClass2_Sub2_Sub15_2.aByte4);
							Static35.aClass2_Sub10_61.method1486(local507);
							Static35.aClass2_Sub10_61.method1497(local319);
							Static47.aClass2_Sub10_26.anInt2187 = 0;
							Static75.anInt1599 = 8;
						} else if (Static75.anInt1599 == 0) {
							if (Static47.aClass2_Sub10_26.aByteArray27[0] == -1) {
								Static75.anInt1599 = 1;
								Static47.aClass2_Sub10_26.anInt2187 = 0;
							} else {
								Static55.aClass2_Sub2_Sub15_2 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(601) IOException local601) {
				try {
					Static6.aClass62_1.method1347();
				} catch (@Pc(606) Exception local606) {
				}
				Static30.anInt724++;
				Static6.aClass62_1 = null;
				return false;
			}
		}
	}
}
