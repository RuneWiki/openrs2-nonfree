import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_9;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!ed;")
	public static Class18 aClass18_6;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!oc;")
	public static Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_1503 = Static94.method1596("Connecting to update server");

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_1501 = aClass1_1503;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	private static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!a;")
	private static Class1 aClass1_1504 = Static94.method1596("Add friend");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1502 = aClass1_1504;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_1505 = Static94.method1596("blinken2:");

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_1506 = Static94.method1596("@red@");

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_1507 = null;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!a;")
	public static Class1 aClass1_1508 = Static94.method1596("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public static int anInt1555 = -1;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_1509 = Static94.method1596("huffman");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!nb;)V")
	public static void method1044(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub1 arg1) {
		Static33.method861(arg0, arg1.anInt2717, arg1.anInt2724);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
	public static void method1045(@OriginalArg(0) boolean arg0) {
		Static94.aBoolean140 = arg0;
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(51) int local51;
		@Pc(151) int local151;
		@Pc(155) int local155;
		if (!Static94.aBoolean140) {
			local11 = Static13.aClass2_Sub3_Sub1_1.method792();
			local15 = Static13.aClass2_Sub3_Sub1_1.method813();
			local19 = Static13.aClass2_Sub3_Sub1_1.method784();
			local23 = Static13.aClass2_Sub3_Sub1_1.method827();
			local29 = Static13.aClass2_Sub3_Sub1_1.method794();
			local36 = (Static83.anInt2224 - Static13.aClass2_Sub3_Sub1_1.anInt1168) / 16;
			Static73.anIntArrayArray13 = new int[local36][4];
			for (local40 = 0; local40 < local36; local40++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static73.anIntArrayArray13[local40][local44] = Static13.aClass2_Sub3_Sub1_1.method793();
				}
			}
			Static34.anIntArray128 = new int[local36];
			Static1.aByteArrayArray1 = new byte[local36][];
			@Pc(389) boolean local389 = false;
			Static87.aByteArrayArray7 = new byte[local36][];
			if ((local15 / 8 == 48 || local15 / 8 == 49) && local23 / 8 == 48) {
				local389 = true;
			}
			Static76.anIntArray265 = new int[local36];
			if (local15 / 8 == 48 && local23 / 8 == 148) {
				local389 = true;
			}
			Static22.anIntArray92 = new int[local36];
			local36 = 0;
			for (local51 = (local15 - 6) / 8; local51 <= (local15 + 6) / 8; local51++) {
				for (local151 = (local23 - 6) / 8; local151 <= (local23 + 6) / 8; local151++) {
					local155 = local151 + (local51 << 8);
					if (!local389 || local151 != 49 && local151 != 149 && local151 != 147 && local51 != 50 && (local51 != 49 || local151 != 47)) {
						Static34.anIntArray128[local36] = local155;
						Static76.anIntArray265[local36] = Static107.aClass8_Sub1_23.method1695(Static97.method1655(new Class1[] { Static76.aClass1_2149, Static43.method994(local51), Static12.aClass1_2753, Static43.method994(local151) }));
						Static22.anIntArray92[local36] = Static107.aClass8_Sub1_23.method1695(Static97.method1655(new Class1[] { Static43.aClass1_1436, Static43.method994(local51), Static12.aClass1_2753, Static43.method994(local151) }));
						local36++;
					}
				}
			}
			Static67.method1788(local19, local23, local15, local11, local29);
			return;
		}
		local11 = Static13.aClass2_Sub3_Sub1_1.method792();
		local15 = Static13.aClass2_Sub3_Sub1_1.method827();
		local19 = Static13.aClass2_Sub3_Sub1_1.method792();
		local23 = Static13.aClass2_Sub3_Sub1_1.method803();
		local29 = Static13.aClass2_Sub3_Sub1_1.method792();
		Static13.aClass2_Sub3_Sub1_1.method843();
		for (local36 = 0; local36 < 4; local36++) {
			for (local40 = 0; local40 < 13; local40++) {
				for (local44 = 0; local44 < 13; local44++) {
					local51 = Static13.aClass2_Sub3_Sub1_1.method838(1);
					if (local51 == 1) {
						Static29.anIntArrayArrayArray6[local36][local40][local44] = Static13.aClass2_Sub3_Sub1_1.method838(26);
					} else {
						Static29.anIntArrayArrayArray6[local36][local40][local44] = -1;
					}
				}
			}
		}
		Static13.aClass2_Sub3_Sub1_1.method834();
		local40 = (Static83.anInt2224 - Static13.aClass2_Sub3_Sub1_1.anInt1168) / 16;
		Static73.anIntArrayArray13 = new int[local40][4];
		for (local44 = 0; local44 < local40; local44++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static73.anIntArrayArray13[local44][local51] = Static13.aClass2_Sub3_Sub1_1.method830();
			}
		}
		Static76.anIntArray265 = new int[local40];
		Static1.aByteArrayArray1 = new byte[local40][];
		Static22.anIntArray92 = new int[local40];
		Static87.aByteArrayArray7 = new byte[local40][];
		Static34.anIntArray128 = new int[local40];
		local40 = 0;
		for (local51 = 0; local51 < 4; local51++) {
			for (local151 = 0; local151 < 13; local151++) {
				for (local155 = 0; local155 < 13; local155++) {
					@Pc(165) int local165 = Static29.anIntArrayArrayArray6[local51][local151][local155];
					if (local165 != -1) {
						@Pc(175) int local175 = local165 >> 14 & 0x3FF;
						@Pc(181) int local181 = local165 >> 3 & 0x7FF;
						@Pc(191) int local191 = local181 / 8 + (local175 / 8 << 8);
						for (@Pc(193) int local193 = 0; local193 < local40; local193++) {
							if (local191 == Static34.anIntArray128[local193]) {
								local191 = -1;
								break;
							}
						}
						if (local191 != -1) {
							Static34.anIntArray128[local40] = local191;
							@Pc(224) int local224 = local191 & 0xFF;
							@Pc(230) int local230 = local191 >> 8 & 0xFF;
							Static76.anIntArray265[local40] = Static107.aClass8_Sub1_23.method1695(Static97.method1655(new Class1[] { Static76.aClass1_2149, Static43.method994(local230), Static12.aClass1_2753, Static43.method994(local224) }));
							Static22.anIntArray92[local40] = Static107.aClass8_Sub1_23.method1695(Static97.method1655(new Class1[] { Static43.aClass1_1436, Static43.method994(local230), Static12.aClass1_2753, Static43.method994(local224) }));
							local40++;
						}
					}
				}
			}
		}
		Static67.method1788(local15, local29, local19, local11, local23);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1046() {
		if (!Static39.aBoolean157) {
			return;
		}
		Static8.anIntArray46 = null;
		Static39.aBoolean157 = false;
		Static53.anIntArray181 = null;
		Static62.aClass2_Sub1_Sub2_Sub2_17 = null;
		Static84.anIntArray285 = null;
		Static27.aClass4_18 = null;
		Static53.aClass4_39 = null;
		Static48.aClass4_34 = null;
		Static93.aClass2_Sub1_Sub2_Sub2_24 = null;
		aClass2_Sub1_Sub2_Sub2_12 = null;
		Static88.aClass2_Sub1_Sub2_Sub2_21 = null;
		Static95.aClass2_Sub1_Sub2_Sub2Array9 = null;
		Static22.aClass2_Sub1_Sub2_Sub2_8 = null;
		Static1.aClass4_1 = null;
		Static53.anIntArray180 = null;
		Static37.anIntArray137 = null;
		Static68.aClass4_45 = null;
		Static52.aClass2_Sub1_Sub2_Sub2_16 = null;
		Static91.aClass2_Sub1_Sub2_Sub2_23 = null;
		Static84.aClass4_51 = null;
		Static55.aClass2_Sub1_Sub2_Sub2_6 = null;
		Static50.aClass2_Sub1_Sub2_Sub2_14 = null;
		Static62.anIntArray202 = null;
		Static111.aClass4_63 = null;
		Static7.aClass2_Sub1_Sub2_Sub2_9 = null;
		Static39.aClass4_62 = null;
		Static91.aClass2_Sub1_Sub2_Sub2_22 = null;
		Static30.aClass4_22 = null;
		Static34.aClass2_Sub1_Sub2_Sub2_10 = null;
		Static53.aClass4_40 = null;
		Static61.aClass4_42 = null;
		Static32.aClass4_23 = null;
		Static14.aClass4_13 = null;
		Static102.aClass4_60 = null;
		Static63.aClass2_Sub1_Sub2_Sub2_18 = null;
		Static43.aClass2_Sub1_Sub2_Sub2_11 = null;
		Static107.aClass2_Sub1_Sub2_Sub2_28 = null;
		Static45.anIntArray155 = null;
		Static57.aClass4_41 = null;
		Static97.aClass4_59 = null;
		Static73.aClass2_Sub1_Sub2_Sub2_19 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!ba;)[Ljava/lang/Object;")
	public static Object[] method1047(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(5) int local5 = arg0.method791();
		if (local5 == 0) {
			return null;
		}
		@Pc(19) Object[] local19 = new Object[local5];
		for (@Pc(21) int local21 = 0; local21 < local5; local21++) {
			@Pc(27) int local27 = arg0.method791();
			if (local27 == 0) {
				local19[local21] = Integer.valueOf(arg0.method814());
			} else if (local27 == 1) {
				local19[local21] = arg0.method787();
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public static boolean method1048() {
		@Pc(8) long local8 = Static85.method1534();
		@Pc(13) int local13 = (int) (local8 - Static76.aLong68);
		Static76.aLong68 = local8;
		if (local13 > 200) {
			local13 = 200;
		}
		Static40.anInt1616 += local13;
		if (Static71.anInt1966 == 0 && Static27.anInt1038 == 0 && Static43.anInt1447 == 0 && Static113.anInt2233 == 0) {
			return true;
		} else if (Static93.aClass65_4 == null) {
			return false;
		} else {
			try {
				if (Static40.anInt1616 > 30000) {
					throw new IOException();
				}
				@Pc(59) Class2_Sub1_Sub15 local59;
				@Pc(64) Class2_Sub3 local64;
				while (Static27.anInt1038 < 20 && Static113.anInt2233 > 0) {
					local59 = (Class2_Sub1_Sub15) Static85.aClass25_6.method989();
					local64 = new Class2_Sub3(4);
					local64.method788(1);
					local64.method800((int) local59.aLong96);
					Static93.aClass65_4.method1759(4, local64.aByteArray7);
					Static65.aClass25_5.method990(local59, local59.aLong96);
					Static113.anInt2233--;
					Static27.anInt1038++;
				}
				while (Static71.anInt1966 < 20 && Static43.anInt1447 > 0) {
					local59 = (Class2_Sub1_Sub15) Static32.aClass30_2.method1228();
					local64 = new Class2_Sub3(4);
					local64.method788(0);
					local64.method800((int) local59.aLong96);
					Static93.aClass65_4.method1759(4, local64.aByteArray7);
					local59.method1773();
					Static62.aClass25_4.method990(local59, local59.aLong96);
					Static71.anInt1966++;
					Static43.anInt1447--;
				}
				for (@Pc(160) int local160 = 0; local160 < 100; local160++) {
					@Pc(166) int local166 = Static93.aClass65_4.method1763();
					if (local166 < 0) {
						throw new IOException();
					}
					if (local166 == 0) {
						break;
					}
					Static40.anInt1616 = 0;
					@Pc(181) byte local181 = 0;
					if (Static31.aClass2_Sub1_Sub15_1 == null) {
						local181 = 8;
					} else if (Static84.anInt2244 == 0) {
						local181 = 1;
					}
					@Pc(204) int local204;
					@Pc(209) int local209;
					@Pc(245) int local245;
					@Pc(389) int local389;
					if (local181 <= 0) {
						local204 = Static86.aClass2_Sub3_4.aByteArray7.length - Static31.aClass2_Sub1_Sub15_1.aByte6;
						local209 = 512 - Static84.anInt2244;
						if (local204 - Static86.aClass2_Sub3_4.anInt1168 < local209) {
							local209 = local204 - Static86.aClass2_Sub3_4.anInt1168;
						}
						if (local209 > local166) {
							local209 = local166;
						}
						Static93.aClass65_4.method1757(Static86.aClass2_Sub3_4.anInt1168, local209, Static86.aClass2_Sub3_4.aByteArray7);
						if (Static12.aByte7 != 0) {
							for (local245 = 0; local245 < local209; local245++) {
								Static86.aClass2_Sub3_4.aByteArray7[Static86.aClass2_Sub3_4.anInt1168 + local245] ^= Static12.aByte7;
							}
						}
						Static86.aClass2_Sub3_4.anInt1168 += local209;
						Static84.anInt2244 += local209;
						if (Static86.aClass2_Sub3_4.anInt1168 == local204) {
							if (Static31.aClass2_Sub1_Sub15_1.aLong96 == 16711935L) {
								Static81.aClass2_Sub3_3 = Static86.aClass2_Sub3_4;
								for (local245 = 0; local245 < 256; local245++) {
									@Pc(376) Class8_Sub1 local376 = Static45.aClass8_Sub1Array1[local245];
									if (local376 != null) {
										Static81.aClass2_Sub3_3.anInt1168 = local245 * 4 + 5;
										local389 = Static81.aClass2_Sub3_3.method814();
										local376.method1712(local389);
									}
								}
							} else {
								aCRC32_1.reset();
								aCRC32_1.update(Static86.aClass2_Sub3_4.aByteArray7, 0, local204);
								local245 = (int) aCRC32_1.getValue();
								if (Static31.aClass2_Sub1_Sub15_1.anInt2286 != local245) {
									try {
										Static93.aClass65_4.method1758();
									} catch (@Pc(322) Exception local322) {
									}
									Static12.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static93.aClass65_4 = null;
									Static62.anInt1863++;
									return false;
								}
								Static14.anInt681 = 0;
								Static62.anInt1863 = 0;
								Static31.aClass2_Sub1_Sub15_1.aClass8_Sub1_19.method1708((Static31.aClass2_Sub1_Sub15_1.aLong96 & 0xFF0000L) == 16711680L, (int) (Static31.aClass2_Sub1_Sub15_1.aLong96 & 0xFFFFL), Static109.aBoolean159, Static86.aClass2_Sub3_4.aByteArray7);
							}
							Static31.aClass2_Sub1_Sub15_1.method1820();
							Static31.aClass2_Sub1_Sub15_1 = null;
							Static86.aClass2_Sub3_4 = null;
							Static84.anInt2244 = 0;
							if (Static109.aBoolean159) {
								Static27.anInt1038--;
							} else {
								Static71.anInt1966--;
							}
						} else {
							if (Static84.anInt2244 != 512) {
								break;
							}
							Static84.anInt2244 = 0;
						}
					} else {
						local204 = local181 - Static76.aClass2_Sub3_2.anInt1168;
						if (local204 > local166) {
							local204 = local166;
						}
						Static93.aClass65_4.method1757(Static76.aClass2_Sub3_2.anInt1168, local204, Static76.aClass2_Sub3_2.aByteArray7);
						if (Static12.aByte7 != 0) {
							for (local209 = 0; local209 < local204; local209++) {
								Static76.aClass2_Sub3_2.aByteArray7[Static76.aClass2_Sub3_2.anInt1168 + local209] ^= Static12.aByte7;
							}
						}
						Static76.aClass2_Sub3_2.anInt1168 += local204;
						if (local181 > Static76.aClass2_Sub3_2.anInt1168) {
							break;
						}
						if (Static31.aClass2_Sub1_Sub15_1 == null) {
							Static76.aClass2_Sub3_2.anInt1168 = 0;
							local209 = Static76.aClass2_Sub3_2.method791();
							local245 = Static76.aClass2_Sub3_2.method792();
							@Pc(509) int local509 = Static76.aClass2_Sub3_2.method791();
							local389 = Static76.aClass2_Sub3_2.method814();
							@Pc(523) long local523 = (long) ((local209 << 16) + local245);
							@Pc(529) Class2_Sub1_Sub15 local529 = (Class2_Sub1_Sub15) Static65.aClass25_5.method991(local523);
							Static109.aBoolean159 = true;
							if (local529 == null) {
								local529 = (Class2_Sub1_Sub15) Static62.aClass25_4.method991(local523);
								Static109.aBoolean159 = false;
							}
							if (local529 == null) {
								throw new IOException();
							}
							Static31.aClass2_Sub1_Sub15_1 = local529;
							@Pc(555) int local555 = local509 == 0 ? 5 : 9;
							Static86.aClass2_Sub3_4 = new Class2_Sub3(Static31.aClass2_Sub1_Sub15_1.aByte6 + local555 + local389);
							Static86.aClass2_Sub3_4.method788(local509);
							Static86.aClass2_Sub3_4.method829(local389);
							Static84.anInt2244 = 8;
							Static76.aClass2_Sub3_2.anInt1168 = 0;
						} else if (Static84.anInt2244 == 0) {
							if (Static76.aClass2_Sub3_2.aByteArray7[0] == -1) {
								Static76.aClass2_Sub3_2.anInt1168 = 0;
								Static84.anInt2244 = 1;
							} else {
								Static31.aClass2_Sub1_Sub15_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(606) IOException local606) {
				try {
					Static93.aClass65_4.method1758();
				} catch (@Pc(611) Exception local611) {
				}
				Static14.anInt681++;
				Static93.aClass65_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!bd;ILclient!a;Lclient!a;)Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 method1049(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class1 arg2) {
		@Pc(8) int local8 = arg0.method1695(arg2);
		@Pc(21) int local21 = arg0.method1691(local8, arg1);
		return Static18.method521(local21, arg0, local8);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method1050() {
		aClass1_1503 = null;
		aClass2_Sub1_Sub2_Sub2_12 = null;
		aCRC32_1 = null;
		aClass1_1506 = null;
		aClass1_1507 = null;
		aClass1_1508 = null;
		aClass1_1504 = null;
		anIntArray162 = null;
		aClass1_1502 = null;
		aClass2_Sub1_Sub2_Sub4Array8 = null;
		aClass8_Sub1_9 = null;
		aClass1_1501 = null;
		aClass1_1509 = null;
		aClass1_1505 = null;
		aClass18_6 = null;
		aClass2_Sub2_1 = null;
	}
}
