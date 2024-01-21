import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "Lclient!sd;")
	public static Class29 aClass29_78;

	@OriginalMember(owner = "client!vb", name = "db", descriptor = "Lclient!sd;")
	public static Class29 aClass29_79;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	public static int anInt3008;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1307 = Static63.method1251("@cya@");

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1308 = Static63.method1251("shake:");

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "[I")
	public static int[] anIntArray472 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1309 = Static63.method1251("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1310 = Static63.method1251("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1315 = Static63.method1251("Create a free account");

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1311 = aClass45_1315;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!vb", name = "fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1312 = aClass45_1308;

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1313 = Static63.method1251("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "[I")
	public static int[] anIntArray473 = new int[2000];

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1314 = Static63.method1251("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ka;IB)V")
	public static void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub9 arg2, @OriginalArg(3) int arg3) {
		if (Static101.anInt1025 >= 50 || Static116.anInt3035 == 0 || (arg2.anIntArray251 == null || arg2.anIntArray251.length <= arg1)) {
			return;
		}
		@Pc(27) int local27 = arg2.anIntArray251[arg1];
		if (local27 == 0) {
			return;
		}
		@Pc(39) int local39 = local27 >> 4 & 0x7;
		@Pc(43) int local43 = local27 >> 8;
		Static38.anIntArray177[Static101.anInt1025] = local43;
		@Pc(51) int local51 = local27 & 0xF;
		Static40.anIntArray182[Static101.anInt1025] = local39;
		@Pc(66) int local66 = (arg3 - 64) / 128;
		@Pc(72) int local72 = (arg0 - 64) / 128;
		Static30.anIntArray68[Static101.anInt1025] = 0;
		Static93.aClass8Array1[Static101.anInt1025] = null;
		Static1.anIntArray1[Static101.anInt1025] = local51 + (local66 << 8) + (local72 << 16);
		Static101.anInt1025++;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z")
	public static boolean method2085() {
		@Pc(4) long local4 = Static62.method1228();
		@Pc(14) int local14 = (int) (local4 - Static78.aLong99);
		Static78.aLong99 = local4;
		if (local14 > 200) {
			local14 = 200;
		}
		Static19.anInt629 += local14;
		if (Static7.anInt199 == 0 && Static84.anInt2339 == 0 && Static52.anInt3132 == 0 && Static75.anInt2176 == 0) {
			return true;
		} else if (Static1.aClass7_1 == null) {
			return false;
		} else {
			try {
				if (Static19.anInt629 > 30000) {
					throw new IOException();
				}
				@Pc(67) Class5_Sub2_Sub11 local67;
				@Pc(72) Class5_Sub9 local72;
				while (Static84.anInt2339 < 20 && Static75.anInt2176 > 0) {
					local67 = (Class5_Sub2_Sub11) Static27.aClass66_2.method1815();
					local72 = new Class5_Sub9(4);
					local72.method1428(1);
					local72.method1421((int) local67.aLong146);
					Static1.aClass7_1.method80(4, local72.aByteArray28);
					Static45.aClass66_7.method1811(local67.aLong146, local67);
					Static84.anInt2339++;
					Static75.anInt2176--;
				}
				while (Static7.anInt199 < 20 && Static52.anInt3132 > 0) {
					local67 = (Class5_Sub2_Sub11) Static101.aClass49_2.method1474();
					local72 = new Class5_Sub9(4);
					local72.method1428(0);
					local72.method1421((int) local67.aLong146);
					Static1.aClass7_1.method80(4, local72.aByteArray28);
					local67.method2116();
					Static34.aClass66_4.method1811(local67.aLong146, local67);
					Static52.anInt3132--;
					Static7.anInt199++;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static1.aClass7_1.method72();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static19.anInt629 = 0;
					@Pc(192) byte local192 = 0;
					if (Static107.aClass5_Sub2_Sub11_1 == null) {
						local192 = 8;
					} else if (Static13.anInt415 == 0) {
						local192 = 1;
					}
					@Pc(215) int local215;
					@Pc(220) int local220;
					@Pc(250) int local250;
					@Pc(388) int local388;
					if (local192 <= 0) {
						local215 = Static104.aClass5_Sub9_5.aByteArray28.length - Static107.aClass5_Sub2_Sub11_1.aByte3;
						local220 = 512 - Static13.anInt415;
						if (local215 - Static104.aClass5_Sub9_5.anInt2140 < local220) {
							local220 = local215 - Static104.aClass5_Sub9_5.anInt2140;
						}
						if (local174 < local220) {
							local220 = local174;
						}
						Static1.aClass7_1.method75(Static104.aClass5_Sub9_5.anInt2140, local220, Static104.aClass5_Sub9_5.aByteArray28);
						if (Static99.aByte5 != 0) {
							for (local250 = 0; local250 < local220; local250++) {
								Static104.aClass5_Sub9_5.aByteArray28[local250 + Static104.aClass5_Sub9_5.anInt2140] ^= Static99.aByte5;
							}
						}
						Static13.anInt415 += local220;
						Static104.aClass5_Sub9_5.anInt2140 += local220;
						if (Static104.aClass5_Sub9_5.anInt2140 == local215) {
							if (Static107.aClass5_Sub2_Sub11_1.aLong146 == 16711935L) {
								Static104.aClass5_Sub9_4 = Static104.aClass5_Sub9_5;
								for (local250 = 0; local250 < 256; local250++) {
									@Pc(375) Class29_Sub1 local375 = Static29.aClass29_Sub1Array1[local250];
									if (local375 != null) {
										Static104.aClass5_Sub9_4.anInt2140 = local250 * 4 + 5;
										local388 = Static104.aClass5_Sub9_4.method1434();
										local375.method769(local388);
									}
								}
							} else {
								Static102.aCRC32_2.reset();
								Static102.aCRC32_2.update(Static104.aClass5_Sub9_5.aByteArray28, 0, local215);
								local250 = (int) Static102.aCRC32_2.getValue();
								if (local250 != Static107.aClass5_Sub2_Sub11_1.anInt2238) {
									try {
										Static1.aClass7_1.method73();
									} catch (@Pc(319) Exception local319) {
									}
									Static99.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static1.aClass7_1 = null;
									Static5.anInt110++;
									return false;
								}
								Static45.anInt1314 = 0;
								Static5.anInt110 = 0;
								Static107.aClass5_Sub2_Sub11_1.aClass29_Sub1_35.method767(Static104.aClass5_Sub9_5.aByteArray28, (Static107.aClass5_Sub2_Sub11_1.aLong146 & 0xFF0000L) == 16711680L, (int) (Static107.aClass5_Sub2_Sub11_1.aLong146 & 0xFFFFL), Static14.aBoolean15);
							}
							Static107.aClass5_Sub2_Sub11_1.method2144();
							Static107.aClass5_Sub2_Sub11_1 = null;
							Static13.anInt415 = 0;
							Static104.aClass5_Sub9_5 = null;
							if (Static14.aBoolean15) {
								Static84.anInt2339--;
							} else {
								Static7.anInt199--;
							}
						} else {
							if (Static13.anInt415 != 512) {
								break;
							}
							Static13.anInt415 = 0;
						}
					} else {
						local215 = local192 - Static57.aClass5_Sub9_2.anInt2140;
						if (local215 > local174) {
							local215 = local174;
						}
						Static1.aClass7_1.method75(Static57.aClass5_Sub9_2.anInt2140, local215, Static57.aClass5_Sub9_2.aByteArray28);
						if (Static99.aByte5 != 0) {
							for (local220 = 0; local220 < local215; local220++) {
								Static57.aClass5_Sub9_2.aByteArray28[Static57.aClass5_Sub9_2.anInt2140 + local220] ^= Static99.aByte5;
							}
						}
						Static57.aClass5_Sub9_2.anInt2140 += local215;
						if (Static57.aClass5_Sub9_2.anInt2140 < local192) {
							break;
						}
						if (Static107.aClass5_Sub2_Sub11_1 == null) {
							Static57.aClass5_Sub9_2.anInt2140 = 0;
							local220 = Static57.aClass5_Sub9_2.method1408();
							local250 = Static57.aClass5_Sub9_2.method1418();
							@Pc(508) int local508 = Static57.aClass5_Sub9_2.method1408();
							local388 = Static57.aClass5_Sub9_2.method1434();
							@Pc(520) long local520 = (long) ((local220 << 16) + local250);
							@Pc(526) Class5_Sub2_Sub11 local526 = (Class5_Sub2_Sub11) Static45.aClass66_7.method1812(local520);
							Static14.aBoolean15 = true;
							if (local526 == null) {
								local526 = (Class5_Sub2_Sub11) Static34.aClass66_4.method1812(local520);
								Static14.aBoolean15 = false;
							}
							if (local526 == null) {
								throw new IOException();
							}
							Static107.aClass5_Sub2_Sub11_1 = local526;
							@Pc(552) int local552 = local508 == 0 ? 5 : 9;
							Static104.aClass5_Sub9_5 = new Class5_Sub9(local552 + local388 + Static107.aClass5_Sub2_Sub11_1.aByte3);
							Static104.aClass5_Sub9_5.method1428(local508);
							Static104.aClass5_Sub9_5.method1413(local388);
							Static13.anInt415 = 8;
							Static57.aClass5_Sub9_2.anInt2140 = 0;
						} else if (Static13.anInt415 == 0) {
							if (Static57.aClass5_Sub9_2.aByteArray28[0] == -1) {
								Static57.aClass5_Sub9_2.anInt2140 = 0;
								Static13.anInt415 = 1;
							} else {
								Static107.aClass5_Sub2_Sub11_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(604) IOException local604) {
				try {
					Static1.aClass7_1.method73();
				} catch (@Pc(609) Exception local609) {
				}
				Static1.aClass7_1 = null;
				Static45.anInt1314++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public static void method2086() {
		anIntArray472 = null;
		aClass29_78 = null;
		aClass45_1308 = null;
		anIntArray473 = null;
		aClass45_1309 = null;
		aClass45_1312 = null;
		aClass45_1307 = null;
		aClass45_1313 = null;
		aClass29_79 = null;
		aClass45_1314 = null;
		aClass45_1311 = null;
		aClass45_1315 = null;
		aClass45_1310 = null;
	}
}
