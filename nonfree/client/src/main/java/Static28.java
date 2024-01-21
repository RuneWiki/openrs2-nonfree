import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!ie;")
	public static Class32 aClass32_4;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_4;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_457 = Static106.method1849("hitmarks");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_458 = Static106.method1849("lila:");

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Lclient!sc;")
	private static Class66 aClass66_461 = Static106.method1849("Could not complete login)3");

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_459 = aClass66_461;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public static int anInt743 = 0;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_460 = Static106.method1849("Fallen lassen");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
	public static boolean method551() {
		@Pc(8) long local8 = Static54.method1236();
		@Pc(14) int local14 = (int) (local8 - Static68.aLong73);
		Static68.aLong73 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static26.anInt698 += local14;
		if (Static104.anInt2553 == 0 && Static79.anInt2165 == 0 && Static94.anInt2413 == 0 && Static15.anInt2943 == 0) {
			return true;
		} else if (Static73.aClass34_4 == null) {
			return false;
		} else {
			try {
				if (Static26.anInt698 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class1_Sub1_Sub4 local60;
				@Pc(65) Class1_Sub12 local65;
				while (Static79.anInt2165 < 20 && Static15.anInt2943 > 0) {
					local60 = (Class1_Sub1_Sub4) Static24.aClass65_9.method1803();
					local65 = new Class1_Sub12(4);
					local65.method1197(1);
					local65.method1170((int) local60.aLong130);
					Static73.aClass34_4.method1098(local65.aByteArray12, 4);
					Static74.aClass65_26.method1797(local60, local60.aLong130);
					Static79.anInt2165++;
					Static15.anInt2943--;
				}
				while (Static104.anInt2553 < 20 && Static94.anInt2413 > 0) {
					local60 = (Class1_Sub1_Sub4) Static34.aClass42_2.method1303();
					local65 = new Class1_Sub12(4);
					local65.method1197(0);
					local65.method1170((int) local60.aLong130);
					Static73.aClass34_4.method1098(local65.aByteArray12, 4);
					local60.method2003();
					Static79.aClass65_28.method1797(local60, local60.aLong130);
					Static104.anInt2553++;
					Static94.anInt2413--;
				}
				for (@Pc(165) int local165 = 0; local165 < 100; local165++) {
					@Pc(174) int local174 = Static73.aClass34_4.method1103();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static26.anInt698 = 0;
					@Pc(186) byte local186 = 0;
					if (Static74.aClass1_Sub1_Sub4_1 == null) {
						local186 = 8;
					} else if (Static101.anInt2506 == 0) {
						local186 = 1;
					}
					@Pc(209) int local209;
					@Pc(214) int local214;
					@Pc(248) int local248;
					@Pc(314) int local314;
					if (local186 <= 0) {
						local209 = Static71.aClass1_Sub12_9.aByteArray12.length - Static74.aClass1_Sub1_Sub4_1.aByte2;
						local214 = 512 - Static101.anInt2506;
						if (local209 - Static71.aClass1_Sub12_9.anInt1694 < local214) {
							local214 = local209 - Static71.aClass1_Sub12_9.anInt1694;
						}
						if (local174 < local214) {
							local214 = local174;
						}
						Static73.aClass34_4.method1102(Static71.aClass1_Sub12_9.anInt1694, local214, Static71.aClass1_Sub12_9.aByteArray12);
						if (Static11.aByte1 != 0) {
							for (local248 = 0; local248 < local214; local248++) {
								Static71.aClass1_Sub12_9.aByteArray12[Static71.aClass1_Sub12_9.anInt1694 + local248] = (byte) (Static71.aClass1_Sub12_9.aByteArray12[Static71.aClass1_Sub12_9.anInt1694 + local248] ^ Static11.aByte1);
							}
						}
						Static101.anInt2506 += local214;
						Static71.aClass1_Sub12_9.anInt1694 += local214;
						if (Static71.aClass1_Sub12_9.anInt1694 == local209) {
							if (Static74.aClass1_Sub1_Sub4_1.aLong130 == 16711935L) {
								Static99.aClass1_Sub12_7 = Static71.aClass1_Sub12_9;
								for (local248 = 0; local248 < 256; local248++) {
									@Pc(301) Class5_Sub1 local301 = Static48.aClass5_Sub1Array1[local248];
									if (local301 != null) {
										Static99.aClass1_Sub12_7.anInt1694 = local248 * 8 + 5;
										local314 = Static99.aClass1_Sub12_7.method1210();
										@Pc(318) int local318 = Static99.aClass1_Sub12_7.method1210();
										local301.method134(local314, local318);
									}
								}
							} else {
								Static101.aCRC32_2.reset();
								Static101.aCRC32_2.update(Static71.aClass1_Sub12_9.aByteArray12, 0, local209);
								local248 = (int) Static101.aCRC32_2.getValue();
								if (local248 != Static74.aClass1_Sub1_Sub4_1.anInt893) {
									try {
										Static73.aClass34_4.method1104();
									} catch (@Pc(358) Exception local358) {
									}
									Static73.aClass34_4 = null;
									Static77.anInt2147++;
									Static11.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static77.anInt2147 = 0;
								Static20.anInt618 = 0;
								Static74.aClass1_Sub1_Sub4_1.aClass5_Sub1_12.method137((int) (Static74.aClass1_Sub1_Sub4_1.aLong130 & 0xFFFFL), (Static74.aClass1_Sub1_Sub4_1.aLong130 & 0xFF0000L) == 16711680L, Static18.aBoolean25, Static71.aClass1_Sub12_9.aByteArray12);
							}
							Static74.aClass1_Sub1_Sub4_1.method2050();
							if (Static18.aBoolean25) {
								Static79.anInt2165--;
							} else {
								Static104.anInt2553--;
							}
							Static101.anInt2506 = 0;
							Static74.aClass1_Sub1_Sub4_1 = null;
							Static71.aClass1_Sub12_9 = null;
						} else {
							if (Static101.anInt2506 != 512) {
								break;
							}
							Static101.anInt2506 = 0;
						}
					} else {
						local209 = local186 - Static55.aClass1_Sub12_8.anInt1694;
						if (local174 < local209) {
							local209 = local174;
						}
						Static73.aClass34_4.method1102(Static55.aClass1_Sub12_8.anInt1694, local209, Static55.aClass1_Sub12_8.aByteArray12);
						if (Static11.aByte1 != 0) {
							for (local214 = 0; local214 < local209; local214++) {
								Static55.aClass1_Sub12_8.aByteArray12[local214 + Static55.aClass1_Sub12_8.anInt1694] ^= Static11.aByte1;
							}
						}
						Static55.aClass1_Sub12_8.anInt1694 += local209;
						if (local186 > Static55.aClass1_Sub12_8.anInt1694) {
							break;
						}
						if (Static74.aClass1_Sub1_Sub4_1 == null) {
							Static55.aClass1_Sub12_8.anInt1694 = 0;
							local214 = Static55.aClass1_Sub12_8.method1190();
							local248 = Static55.aClass1_Sub12_8.method1176();
							@Pc(519) long local519 = (long) (local248 + (local214 << 16));
							@Pc(525) int local525 = Static55.aClass1_Sub12_8.method1190();
							local314 = Static55.aClass1_Sub12_8.method1210();
							@Pc(539) Class1_Sub1_Sub4 local539 = (Class1_Sub1_Sub4) Static74.aClass65_26.method1802(local519);
							Static18.aBoolean25 = true;
							if (local539 == null) {
								local539 = (Class1_Sub1_Sub4) Static79.aClass65_28.method1802(local519);
								Static18.aBoolean25 = false;
							}
							if (local539 == null) {
								throw new IOException();
							}
							Static74.aClass1_Sub1_Sub4_1 = local539;
							@Pc(567) int local567 = local525 == 0 ? 5 : 9;
							Static71.aClass1_Sub12_9 = new Class1_Sub12(local567 + local314 + Static74.aClass1_Sub1_Sub4_1.aByte2);
							Static71.aClass1_Sub12_9.method1197(local525);
							Static71.aClass1_Sub12_9.method1193(local314);
							Static55.aClass1_Sub12_8.anInt1694 = 0;
							Static101.anInt2506 = 8;
						} else if (Static101.anInt2506 == 0) {
							if (Static55.aClass1_Sub12_8.aByteArray12[0] == -1) {
								Static101.anInt2506 = 1;
								Static55.aClass1_Sub12_8.anInt1694 = 0;
							} else {
								Static74.aClass1_Sub1_Sub4_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(619) IOException local619) {
				try {
					Static73.aClass34_4.method1104();
				} catch (@Pc(624) Exception local624) {
				}
				Static20.anInt618++;
				Static73.aClass34_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
	public static boolean method552(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] method553() {
		@Pc(8) Class1_Sub1_Sub2_Sub3[] local8 = new Class1_Sub1_Sub2_Sub3[Static35.anInt869];
		for (@Pc(15) int local15 = 0; local15 < Static35.anInt869; local15++) {
			@Pc(25) Class1_Sub1_Sub2_Sub3 local25 = local8[local15] = new Class1_Sub1_Sub2_Sub3();
			local25.anInt1431 = Static48.anInt1502;
			local25.anInt1430 = Static98.anInt2486;
			local25.anInt1433 = Static99.anIntArray181[local15];
			local25.anInt1434 = anIntArray105[local15];
			local25.anInt1432 = Static125.anIntArray493[local15];
			local25.anInt1429 = Static14.anIntArray80[local15];
			local25.anIntArray213 = Static16.anIntArray81;
			local25.aByteArray9 = Static29.aByteArrayArray2[local15];
		}
		Static22.method509();
		return local8;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static void method554() {
		aClass66_457 = null;
		aClass66_461 = null;
		anIntArray105 = null;
		aClass66_458 = null;
		aClass66_459 = null;
		aClass5_Sub1_8 = null;
		aClass66_460 = null;
		aClass1_Sub10_4 = null;
		aClass32_4 = null;
		anIntArrayArray12 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static void method555(@OriginalArg(0) int arg0) {
		if (Static20.anInt622 == 0) {
			Static38.aClass1_Sub9_Sub1_33.method829(arg0);
		} else {
			Static39.anInt988 = arg0;
		}
	}
}
