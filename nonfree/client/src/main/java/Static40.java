import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!jb;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public static int anInt1189;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_513 = Static109.method1737("System update in: ");

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_514 = Static109.method1737(" )2> ");

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public static int anInt1183 = 0;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!na;")
	private static Class53 aClass53_520 = Static109.method1737("Loaded sprites");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_515 = aClass53_520;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_516 = Static109.method1737("@cr1@");

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_517 = Static109.method1737("(U2");

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_518 = aClass53_513;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public static int anInt1185 = 0;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_519 = Static109.method1737("(Z");

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public static int anInt1186 = 0;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	public static int[] anIntArray141 = new int[1000];

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_521 = Static109.method1737("sch-Utteln:");

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public static int anInt1193 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!na;Lclient!we;BLclient!na;)Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 method819(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(8) int local8 = arg1.method1504(arg0);
		@Pc(19) int local19 = arg1.method1502(arg2, local8);
		return Static31.method693(local19, local8, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method820() {
		if (Static95.aClass1_2 != null) {
			Static95.aClass1_2.method1397();
		}
		if (Static42.aClass1_1 != null) {
			Static42.aClass1_1.method1397();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!we;II)Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 method821(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) int arg2) {
		return Static35.method756(arg2, arg0, arg1) ? Static54.method1952() : null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IJ)V")
	public static void method822(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static121.method1934(arg0 - 1L);
			Static121.method1934(1L);
		} else {
			Static121.method1934(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method823() {
		Static124.aClass75_80.method1724();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method824() {
		aClass53_514 = null;
		aClass53_516 = null;
		aClass37_2 = null;
		aClass53_519 = null;
		aByteArrayArrayArray9 = null;
		aClass53_521 = null;
		aClass53_517 = null;
		aClass53_518 = null;
		aClass53_520 = null;
		aClass53_515 = null;
		aClass53_513 = null;
		anIntArray141 = null;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public static void method825() {
		if (Static91.anInt2195 == 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		if (Static120.anInt2807 != 0) {
			local14 = 1;
		}
		for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
			if (Static94.aClass53Array16[local23] != null) {
				@Pc(33) int local33 = Static82.anIntArray110[local23];
				@Pc(37) Class53 local37 = Static15.aClass53Array4[local23];
				if (local37 != null && local37.method1291(aClass53_516)) {
					local37 = local37.method1289(5);
				}
				if (local37 != null && local37.method1291(Static126.aClass53_1045)) {
					local37 = local37.method1289(5);
				}
				if ((local33 == 3 || local33 == 7) && (local33 == 7 || Static9.anInt237 == 0 || Static9.anInt237 == 1 && Static125.method1973(local37))) {
					@Pc(93) int local93 = 329 - local14 * 13;
					local14++;
					if (Static99.anInt2348 > 4 && Static105.anInt2433 - 4 > local93 + -10 && Static105.anInt2433 - 4 <= local93 + 3) {
						@Pc(146) int local146 = Static89.aClass3_Sub1_Sub5_Sub2_3.method745(Static103.method1689(new Class53[] { Static65.aClass53_741, Static119.aClass53_166, local37, Static94.aClass53Array16[local23] })) + 25;
						if (local146 > 450) {
							local146 = 450;
						}
						if (Static99.anInt2348 < local146 + 4) {
							if (Static105.anInt2436 >= 1) {
								Static59.method1075(2014, Static102.aClass53_1164, Static103.method1689(new Class53[] { Static25.aClass53_333, local37 }), 0, 0, 0);
							}
							Static59.method1075(2009, Static103.aClass53_1200, Static103.method1689(new Class53[] { Static25.aClass53_333, local37 }), 0, 0, 0);
							Static59.method1075(2053, Static76.aClass53_855, Static103.method1689(new Class53[] { Static25.aClass53_333, local37 }), 0, 0, 0);
						}
					}
					if (local14 >= 5) {
						return;
					}
				}
				if ((local33 == 5 || local33 == 6) && Static9.anInt237 < 2) {
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
			}
		}
	}
}
