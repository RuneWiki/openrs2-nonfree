import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt1532;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_393 = Static60.method1113("::fpsoff");

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_394 = Static60.method1113("titlebox");

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_397 = Static60.method1113("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_395 = aClass22_397;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!ec;")
	private static Class22 aClass22_400 = Static60.method1113("No reply from loginserver)3");

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_396 = aClass22_400;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[I")
	public static int[] anIntArray158 = new int[4000];

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_398 = Static60.method1113("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_399 = Static60.method1113(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
	public static boolean method1030() {
		@Pc(8) long local8 = Static44.method861();
		@Pc(14) int local14 = (int) (local8 - Static114.aLong85);
		if (local14 > 200) {
			local14 = 200;
		}
		Static111.anInt2753 += local14;
		Static114.aLong85 = local8;
		if (Static55.anInt1109 == 0 && Static53.anInt1498 == 0 && Static29.anInt686 == 0 && Static133.anInt3145 == 0) {
			return true;
		} else if (Static4.aClass6_1 == null) {
			return false;
		} else {
			try {
				if (Static111.anInt2753 > 30000) {
					throw new IOException();
				}
				@Pc(69) Class4_Sub1_Sub11 local69;
				@Pc(74) Class4_Sub11 local74;
				while (Static53.anInt1498 < 20 && Static133.anInt3145 > 0) {
					local69 = (Class4_Sub1_Sub11) Static79.aClass81_10.method2017();
					local74 = new Class4_Sub11(4);
					local74.method701(1);
					local74.method737((int) local69.aLong99);
					Static4.aClass6_1.method133(local74.aByteArray9, 4);
					Static93.aClass81_13.method2015(local69.aLong99, local69);
					Static53.anInt1498++;
					Static133.anInt3145--;
				}
				while (Static55.anInt1109 < 20 && Static29.anInt686 > 0) {
					local69 = (Class4_Sub1_Sub11) Static105.aClass78_2.method1974();
					local74 = new Class4_Sub11(4);
					local74.method701(0);
					local74.method737((int) local69.aLong99);
					Static4.aClass6_1.method133(local74.aByteArray9, 4);
					local69.method1906();
					Static27.aClass81_3.method2015(local69.aLong99, local69);
					Static55.anInt1109++;
					Static29.anInt686--;
				}
				for (@Pc(173) int local173 = 0; local173 < 100; local173++) {
					@Pc(179) int local179 = Static4.aClass6_1.method135();
					if (local179 < 0) {
						throw new IOException();
					}
					if (local179 == 0) {
						break;
					}
					Static111.anInt2753 = 0;
					@Pc(194) byte local194 = 0;
					if (Static126.aClass4_Sub1_Sub11_1 == null) {
						local194 = 8;
					} else if (Static33.anInt842 == 0) {
						local194 = 1;
					}
					@Pc(212) int local212;
					@Pc(233) int local233;
					@Pc(279) int local279;
					@Pc(294) int local294;
					if (local194 > 0) {
						local212 = local194 - Static50.aClass4_Sub11_1.anInt1099;
						if (local179 < local212) {
							local212 = local179;
						}
						Static4.aClass6_1.method134(Static50.aClass4_Sub11_1.anInt1099, Static50.aClass4_Sub11_1.aByteArray9, local212);
						if (Static76.aByte3 != 0) {
							for (local233 = 0; local233 < local212; local233++) {
								Static50.aClass4_Sub11_1.aByteArray9[local233 + Static50.aClass4_Sub11_1.anInt1099] ^= Static76.aByte3;
							}
						}
						Static50.aClass4_Sub11_1.anInt1099 += local212;
						if (Static50.aClass4_Sub11_1.anInt1099 < local194) {
							break;
						}
						if (Static126.aClass4_Sub1_Sub11_1 == null) {
							Static50.aClass4_Sub11_1.anInt1099 = 0;
							local233 = Static50.aClass4_Sub11_1.method719();
							local279 = Static50.aClass4_Sub11_1.method718();
							@Pc(286) long local286 = (long) (local279 + (local233 << 16));
							@Pc(290) int local290 = Static50.aClass4_Sub11_1.method719();
							local294 = Static50.aClass4_Sub11_1.method725();
							@Pc(300) Class4_Sub1_Sub11 local300 = (Class4_Sub1_Sub11) Static93.aClass81_13.method2010(local286);
							Static11.aBoolean270 = true;
							if (local300 == null) {
								local300 = (Class4_Sub1_Sub11) Static27.aClass81_3.method2010(local286);
								Static11.aBoolean270 = false;
							}
							if (local300 == null) {
								throw new IOException();
							}
							Static126.aClass4_Sub1_Sub11_1 = local300;
							@Pc(329) int local329 = local290 == 0 ? 5 : 9;
							Static88.aClass4_Sub11_2 = new Class4_Sub11(Static126.aClass4_Sub1_Sub11_1.aByte7 + local294 + local329);
							Static88.aClass4_Sub11_2.method701(local290);
							Static88.aClass4_Sub11_2.method717(local294);
							Static50.aClass4_Sub11_1.anInt1099 = 0;
							Static33.anInt842 = 8;
						} else if (Static33.anInt842 == 0) {
							if (Static50.aClass4_Sub11_1.aByteArray9[0] == -1) {
								Static50.aClass4_Sub11_1.anInt1099 = 0;
								Static33.anInt842 = 1;
							} else {
								Static126.aClass4_Sub1_Sub11_1 = null;
							}
						}
					} else {
						local212 = Static88.aClass4_Sub11_2.aByteArray9.length - Static126.aClass4_Sub1_Sub11_1.aByte7;
						local233 = 512 - Static33.anInt842;
						if (local212 - Static88.aClass4_Sub11_2.anInt1099 < local233) {
							local233 = local212 - Static88.aClass4_Sub11_2.anInt1099;
						}
						if (local233 > local179) {
							local233 = local179;
						}
						Static4.aClass6_1.method134(Static88.aClass4_Sub11_2.anInt1099, Static88.aClass4_Sub11_2.aByteArray9, local233);
						if (Static76.aByte3 != 0) {
							for (local279 = 0; local279 < local233; local279++) {
								Static88.aClass4_Sub11_2.aByteArray9[Static88.aClass4_Sub11_2.anInt1099 + local279] = (byte) (Static88.aClass4_Sub11_2.aByteArray9[Static88.aClass4_Sub11_2.anInt1099 + local279] ^ Static76.aByte3);
							}
						}
						Static33.anInt842 += local233;
						Static88.aClass4_Sub11_2.anInt1099 += local233;
						if (local212 == Static88.aClass4_Sub11_2.anInt1099) {
							if (Static126.aClass4_Sub1_Sub11_1.aLong99 == 16711935L) {
								Static99.aClass4_Sub11_3 = Static88.aClass4_Sub11_2;
								for (local279 = 0; local279 < 256; local279++) {
									@Pc(546) Class20_Sub1 local546 = Static73.aClass20_Sub1Array1[local279];
									if (local546 != null) {
										Static99.aClass4_Sub11_3.anInt1099 = local279 * 8 + 5;
										local294 = Static99.aClass4_Sub11_3.method725();
										@Pc(563) int local563 = Static99.aClass4_Sub11_3.method725();
										local546.method614(local563, local294);
									}
								}
							} else {
								Static19.aCRC32_1.reset();
								Static19.aCRC32_1.update(Static88.aClass4_Sub11_2.aByteArray9, 0, local212);
								local279 = (int) Static19.aCRC32_1.getValue();
								if (local279 != Static126.aClass4_Sub1_Sub11_1.anInt2417) {
									try {
										Static4.aClass6_1.method136();
									} catch (@Pc(492) Exception local492) {
									}
									Static18.anInt509++;
									Static76.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static4.aClass6_1 = null;
									return false;
								}
								Static18.anInt509 = 0;
								Static50.anInt1407 = 0;
								Static126.aClass4_Sub1_Sub11_1.aClass20_Sub1_62.method613(Static11.aBoolean270, (int) (Static126.aClass4_Sub1_Sub11_1.aLong99 & 0xFFFFL), (Static126.aClass4_Sub1_Sub11_1.aLong99 & 0xFF0000L) == 16711680L, Static88.aClass4_Sub11_2.aByteArray9);
							}
							Static126.aClass4_Sub1_Sub11_1.method1999();
							if (Static11.aBoolean270) {
								Static53.anInt1498--;
							} else {
								Static55.anInt1109--;
							}
							Static88.aClass4_Sub11_2 = null;
							Static126.aClass4_Sub1_Sub11_1 = null;
							Static33.anInt842 = 0;
						} else {
							if (Static33.anInt842 != 512) {
								break;
							}
							Static33.anInt842 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(611) IOException local611) {
				try {
					Static4.aClass6_1.method136();
				} catch (@Pc(616) Exception local616) {
				}
				Static4.aClass6_1 = null;
				Static50.anInt1407++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1031() {
		aClass22_399 = null;
		aClass22_396 = null;
		aClass22_393 = null;
		aClass22_398 = null;
		aClass22_397 = null;
		aClass22_394 = null;
		anIntArray157 = null;
		anIntArray158 = null;
		aClass22_395 = null;
		aClass22_400 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1033() {
		Static69.aClass4_Sub4_Sub1_2.method228();
		Static30.aClass20_17 = null;
		Static80.anInt2197 = 1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public static void method1036(@OriginalArg(0) int arg0) {
		if (Static80.anInt2197 == 0) {
			Static69.aClass4_Sub4_Sub1_2.method205(arg0);
		} else {
			Static49.anInt1330 = arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1037() {
		for (@Pc(11) int local11 = -1; local11 < Static51.anInt1461; local11++) {
			@Pc(19) int local19;
			if (local11 == -1) {
				local19 = 2047;
			} else {
				local19 = Static115.anIntArray310[local11];
			}
			@Pc(29) Class4_Sub1_Sub3_Sub2_Sub1 local29 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local19];
			if (local29 != null) {
				Static27.method436(1, local29);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1039(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString5 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local24 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(83) String local83 = local59.substring(local65 + 1, local72);
					@Pc(87) int local87 = local83.indexOf(".java:");
					if (local87 >= 0) {
						local83 = local83.substring(0, local87) + local83.substring(local87 + 5);
						local24 = local24 + local83 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local24 = local24 + local59 + ' ';
			}
		}
	}
}
