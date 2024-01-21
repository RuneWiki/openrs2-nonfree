import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_7;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Lclient!ca;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_560 = Static65.method1172("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public static int[] anIntArray155 = new int[50];

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_561 = Static65.method1172("Angreifen");

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Lclient!kb;")
	private static Class46 aClass46_563 = Static65.method1172("Existing User");

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!kb;")
	public static Class46 aClass46_562 = aClass46_563;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_564 = Static65.method1172("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_565 = Static65.method1172("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_566 = Static65.method1172("null");

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Lclient!h;")
	public static Class33 aClass33_5 = null;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Lclient!kb;")
	private static Class46 aClass46_570 = Static65.method1172("glow2:");

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_567 = aClass46_570;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_568 = Static65.method1172("Lade Sprites )2 ");

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_569 = aClass46_570;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kb;Lclient!h;B)Lclient!kb;")
	public static Class46 method1141(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class33 arg1) {
		if (arg0.method1355(Static21.aClass46_1050) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(24) int local24 = arg0.method1355(Static175.aClass46_1382);
			if (local24 == -1) {
				while (true) {
					local24 = arg0.method1355(Static118.aClass46_965);
					if (local24 == -1) {
						while (true) {
							local24 = arg0.method1355(Static54.aClass46_474);
							if (local24 == -1) {
								while (true) {
									local24 = arg0.method1355(Static31.aClass46_234);
									if (local24 == -1) {
										while (true) {
											local24 = arg0.method1355(Static67.aClass46_607);
											if (local24 == -1) {
												while (true) {
													local24 = arg0.method1355(Static154.aClass46_1206);
													if (local24 == -1) {
														return arg0;
													}
													@Pc(238) Class46 local238 = Static38.aClass46_298;
													if (Static29.aClass14_3 != null) {
														local238 = Static102.method1675(Static29.aClass14_3.anInt515);
														try {
															if (Static29.aClass14_3.anObject1 != null) {
																@Pc(254) byte[] local254 = ((String) Static29.aClass14_3.anObject1).getBytes("ISO-8859-1");
																local238 = Static98.method1604(local254.length, local254, 0);
															}
														} catch (@Pc(263) UnsupportedEncodingException local263) {
														}
													}
													arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), local238, arg0.method1380(local24 + 4) });
												}
											}
											arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), Static162.method2589(Static102.method1677(arg1, 4)), arg0.method1380(local24 + 2) });
										}
									}
									arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), Static162.method2589(Static102.method1677(arg1, 3)), arg0.method1380(local24 + 2) });
								}
							}
							arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), Static162.method2589(Static102.method1677(arg1, 2)), arg0.method1380(local24 + 2) });
						}
					}
					arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), Static162.method2589(Static102.method1677(arg1, 1)), arg0.method1380(local24 + 2) });
				}
			}
			arg0 = Static178.method2860(new Class46[] { arg0.method1363(local24, 0), Static162.method2589(Static102.method1677(arg1, 0)), arg0.method1380(local24 + 2) });
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method1142() {
		aClass46_563 = null;
		aClass46_564 = null;
		aClass46_568 = null;
		anIntArray157 = null;
		aClass46_565 = null;
		aShortArrayArray5 = null;
		aClass44_Sub1_7 = null;
		aClass46_560 = null;
		anIntArray154 = null;
		aClass33_5 = null;
		aClass46_566 = null;
		aClass46_569 = null;
		aClass46_570 = null;
		aClass46_562 = null;
		Class34.anIntArray156 = null;
		aClass46_567 = null;
		aClass46_561 = null;
		aClass14_4 = null;
		anIntArray155 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!rd;I)Lclient!kb;")
	public static Class46 method1143(@OriginalArg(1) Class3_Sub4 arg0) {
		try {
			@Pc(7) Class46 local7 = new Class46();
			local7.anInt2034 = arg0.method209();
			if (local7.anInt2034 > 32767) {
				local7.anInt2034 = 32767;
			}
			local7.aByteArray17 = new byte[local7.anInt2034];
			arg0.anInt232 += Static54.aClass75_1.method2517(local7.anInt2034, 0, arg0.anInt232, local7.aByteArray17, arg0.aByteArray5);
			return local7;
		} catch (@Pc(48) Exception local48) {
			return Static123.aClass46_1011;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method1144() {
		while (true) {
			@Pc(9) Class59 local9 = Static161.aClass59_13;
			@Pc(16) Class3_Sub20 local16;
			synchronized (Static161.aClass59_13) {
				local16 = (Class3_Sub20) Static146.aClass59_9.method1733();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass44_Sub1_12.method1645(local16.aClass30_3, local16.aByteArray39, (int) local16.aLong143, false);
		}
	}
}
