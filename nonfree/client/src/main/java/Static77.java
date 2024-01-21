import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1012 = Static24.method441("Cabbage");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt2240 = 0;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1013 = Static24.method441("Stufe)2");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1014 = Static24.method441("Lade Sprites )2 ");

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt2244 = -1;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public static int anInt2245 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!k;IIIB)[B")
	public static byte[] method1332(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(28) long local28 = (long) (arg1 << 16) + ((long) arg2 << 32) + ((long) (arg3 + arg1 * 37 & 0xFFFF));
		if (Static62.aClass21_26 != null) {
			@Pc(36) Class2_Sub1_Sub10 local36 = (Class2_Sub1_Sub10) Static62.aClass21_26.method744(local28);
			if (local36 != null) {
				return local36.aByteArray51;
			}
		}
		@Pc(49) byte[] local49 = arg0.method1150(arg3, arg1);
		if (local49 == null) {
			return null;
		} else {
			if (Static62.aClass21_26 != null) {
				Static62.aClass21_26.method745(local28, new Class2_Sub1_Sub10(local49));
			}
			return local49;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z")
	public static boolean method1333() {
		@Pc(8) long local8 = Static76.method1306();
		@Pc(14) int local14 = (int) (local8 - Static5.aLong15);
		if (local14 > 200) {
			local14 = 200;
		}
		Static5.aLong15 = local8;
		Static87.anInt2519 += local14;
		if (Static20.anInt628 == 0 && Static20.anInt622 == 0 && Static107.anInt2852 == 0 && Static67.anInt2021 == 0) {
			return true;
		} else if (Static39.aClass13_2 == null) {
			return false;
		} else {
			try {
				if (Static87.anInt2519 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class2_Sub1_Sub13 local60;
				@Pc(65) Class2_Sub8 local65;
				while (Static20.anInt622 < 20 && Static67.anInt2021 > 0) {
					local60 = (Class2_Sub1_Sub13) Static13.aClass7_1.method162();
					local65 = new Class2_Sub8(4);
					local65.method1375(1);
					local65.method1384((int) local60.aLong82);
					Static39.aClass13_2.method313(4, local65.aByteArray59);
					Static102.aClass7_6.method167(local60.aLong82, local60);
					Static67.anInt2021--;
					Static20.anInt622++;
				}
				while (Static20.anInt628 < 20 && Static107.anInt2852 > 0) {
					local60 = (Class2_Sub1_Sub13) Static90.aClass28_4.method824();
					local65 = new Class2_Sub8(4);
					local65.method1375(0);
					local65.method1384((int) local60.aLong82);
					Static39.aClass13_2.method313(4, local65.aByteArray59);
					local60.method1803();
					Static46.aClass7_3.method167(local60.aLong82, local60);
					Static107.anInt2852--;
					Static20.anInt628++;
				}
				for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
					@Pc(167) int local167 = Static39.aClass13_2.method323();
					if (local167 < 0) {
						throw new IOException();
					}
					if (local167 == 0) {
						break;
					}
					Static87.anInt2519 = 0;
					@Pc(182) byte local182 = 0;
					if (Static12.aClass2_Sub1_Sub13_1 == null) {
						local182 = 8;
					} else if (Static24.anInt711 == 0) {
						local182 = 1;
					}
					@Pc(203) int local203;
					@Pc(220) int local220;
					@Pc(270) int local270;
					@Pc(286) int local286;
					if (local182 > 0) {
						local203 = local182 - Static70.aClass2_Sub8_3.anInt2342;
						if (local167 < local203) {
							local203 = local167;
						}
						Static39.aClass13_2.method317(local203, Static70.aClass2_Sub8_3.anInt2342, Static70.aClass2_Sub8_3.aByteArray59);
						if (Static41.aByte2 != 0) {
							for (local220 = 0; local220 < local203; local220++) {
								Static70.aClass2_Sub8_3.aByteArray59[local220 + Static70.aClass2_Sub8_3.anInt2342] ^= Static41.aByte2;
							}
						}
						Static70.aClass2_Sub8_3.anInt2342 += local203;
						if (local182 > Static70.aClass2_Sub8_3.anInt2342) {
							break;
						}
						if (Static12.aClass2_Sub1_Sub13_1 == null) {
							Static70.aClass2_Sub8_3.anInt2342 = 0;
							local220 = Static70.aClass2_Sub8_3.method1410();
							local270 = Static70.aClass2_Sub8_3.method1396();
							@Pc(278) long local278 = (long) ((local220 << 16) + local270);
							@Pc(282) int local282 = Static70.aClass2_Sub8_3.method1410();
							local286 = Static70.aClass2_Sub8_3.method1406();
							@Pc(292) Class2_Sub1_Sub13 local292 = (Class2_Sub1_Sub13) Static102.aClass7_6.method165(local278);
							Static5.aBoolean18 = true;
							if (local292 == null) {
								local292 = (Class2_Sub1_Sub13) Static46.aClass7_3.method165(local278);
								Static5.aBoolean18 = false;
							}
							if (local292 == null) {
								throw new IOException();
							}
							Static12.aClass2_Sub1_Sub13_1 = local292;
							@Pc(321) int local321 = local282 == 0 ? 5 : 9;
							Static93.aClass2_Sub8_5 = new Class2_Sub8(Static12.aClass2_Sub1_Sub13_1.aByte3 + local286 + local321);
							Static93.aClass2_Sub8_5.method1375(local282);
							Static93.aClass2_Sub8_5.method1370(local286);
							Static70.aClass2_Sub8_3.anInt2342 = 0;
							Static24.anInt711 = 8;
						} else if (Static24.anInt711 == 0) {
							if (Static70.aClass2_Sub8_3.aByteArray59[0] == -1) {
								Static24.anInt711 = 1;
								Static70.aClass2_Sub8_3.anInt2342 = 0;
							} else {
								Static12.aClass2_Sub1_Sub13_1 = null;
							}
						}
					} else {
						local203 = Static93.aClass2_Sub8_5.aByteArray59.length - Static12.aClass2_Sub1_Sub13_1.aByte3;
						local220 = 512 - Static24.anInt711;
						if (local203 - Static93.aClass2_Sub8_5.anInt2342 < local220) {
							local220 = local203 - Static93.aClass2_Sub8_5.anInt2342;
						}
						if (local167 < local220) {
							local220 = local167;
						}
						Static39.aClass13_2.method317(local220, Static93.aClass2_Sub8_5.anInt2342, Static93.aClass2_Sub8_5.aByteArray59);
						if (Static41.aByte2 != 0) {
							for (local270 = 0; local270 < local220; local270++) {
								Static93.aClass2_Sub8_5.aByteArray59[Static93.aClass2_Sub8_5.anInt2342 + local270] ^= Static41.aByte2;
							}
						}
						Static93.aClass2_Sub8_5.anInt2342 += local220;
						Static24.anInt711 += local220;
						if (local203 == Static93.aClass2_Sub8_5.anInt2342) {
							if (Static12.aClass2_Sub1_Sub13_1.aLong82 == 16711935L) {
								Static27.aClass2_Sub8_2 = Static93.aClass2_Sub8_5;
								for (local270 = 0; local270 < 256; local270++) {
									@Pc(551) Class33_Sub1 local551 = Static110.aClass33_Sub1Array1[local270];
									if (local551 != null) {
										Static27.aClass2_Sub8_2.anInt2342 = local270 * 4 + 5;
										local286 = Static27.aClass2_Sub8_2.method1406();
										local551.method1160(local286);
									}
								}
							} else {
								Static80.aCRC32_5.reset();
								Static80.aCRC32_5.update(Static93.aClass2_Sub8_5.aByteArray59, 0, local203);
								local270 = (int) Static80.aCRC32_5.getValue();
								if (local270 != Static12.aClass2_Sub1_Sub13_1.anInt2405) {
									try {
										Static39.aClass13_2.method316();
									} catch (@Pc(497) Exception local497) {
									}
									Static99.anInt2547++;
									Static39.aClass13_2 = null;
									Static41.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static26.anInt2924 = 0;
								Static99.anInt2547 = 0;
								Static12.aClass2_Sub1_Sub13_1.aClass33_Sub1_40.method1157((int) (Static12.aClass2_Sub1_Sub13_1.aLong82 & 0xFFFFL), Static5.aBoolean18, Static93.aClass2_Sub8_5.aByteArray59, (Static12.aClass2_Sub1_Sub13_1.aLong82 & 0xFF0000L) == 16711680L);
							}
							Static12.aClass2_Sub1_Sub13_1.method1794();
							Static93.aClass2_Sub8_5 = null;
							Static12.aClass2_Sub1_Sub13_1 = null;
							Static24.anInt711 = 0;
							if (Static5.aBoolean18) {
								Static20.anInt622--;
							} else {
								Static20.anInt628--;
							}
						} else {
							if (Static24.anInt711 != 512) {
								break;
							}
							Static24.anInt711 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(600) IOException local600) {
				try {
					Static39.aClass13_2.method316();
				} catch (@Pc(607) Exception local607) {
				}
				Static26.anInt2924++;
				Static39.aClass13_2 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1334() {
		aClass65_1012 = null;
		aClass65_1013 = null;
		aByteArrayArray8 = null;
		aClass65_1014 = null;
		anIntArray303 = null;
	}
}
