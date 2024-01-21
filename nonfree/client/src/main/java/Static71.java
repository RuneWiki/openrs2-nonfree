import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array7;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_747 = Static41.method597("wishes to trade with you)3");

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_748 = Static41.method597("<col=00ff00>");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!tf;")
	public static Class4_Sub9 aClass4_Sub9_3 = new Class4_Sub9(new byte[5000]);

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_749 = Static41.method597("(U0a )2 via: ");

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_750 = aClass60_747;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!od;")
	private static Class60 aClass60_753 = Static41.method597("Players");

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_751 = aClass60_753;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_752 = Static41.method597(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[Lclient!t;")
	public static Class10_Sub1[] aClass10_Sub1Array1 = new Class10_Sub1[256];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_2 = new Class49();

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_754 = Static41.method597("b12_full");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1225() {
		for (@Pc(18) Class4_Sub3_Sub1_Sub4 local18 = (Class4_Sub3_Sub1_Sub4) Static66.aClass45_12.method982(); local18 != null; local18 = (Class4_Sub3_Sub1_Sub4) Static66.aClass45_12.method986()) {
			if (Static77.anInt1866 != local18.anInt1708 || local18.aBoolean62) {
				local18.method1989();
			} else if (local18.anInt1714 <= Static118.anInt2741) {
				local18.method1096(Static116.anInt2713);
				if (local18.aBoolean62) {
					local18.method1989();
				} else {
					Static30.aClass48_1.method1046(local18.anInt1708, local18.anInt1712, local18.anInt1711, local18.anInt1705, 60, local18, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1226(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static39.anInt1047 > 0) {
			local19 = Static78.aByteArrayArray10[--Static39.anInt1047];
			Static78.aByteArrayArray10[Static39.anInt1047] = null;
			return local19;
		} else if (arg0 == 5000 && Static32.anInt939 > 0) {
			local19 = Static99.aByteArrayArray3[--Static32.anInt939];
			Static99.aByteArrayArray3[Static32.anInt939] = null;
			return local19;
		} else if (arg0 == 30000 && Static70.anInt1742 > 0) {
			@Pc(73) byte[] local73 = Static22.aByteArrayArray4[--Static70.anInt1742];
			Static22.aByteArrayArray4[Static70.anInt1742] = null;
			return local73;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!sa;)V")
	public static void method1227(@OriginalArg(1) Class4_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2432;
		if (local6 == 324) {
			if (Static35.anInt988 == -1) {
				Static60.anInt2961 = arg0.anInt2380;
				Static35.anInt988 = arg0.anInt2401;
			}
			if (aClass49_2.aBoolean57) {
				arg0.anInt2401 = Static35.anInt988;
			} else {
				arg0.anInt2401 = Static60.anInt2961;
			}
		} else if (local6 == 325) {
			if (Static35.anInt988 == -1) {
				Static35.anInt988 = arg0.anInt2401;
				Static60.anInt2961 = arg0.anInt2380;
			}
			if (aClass49_2.aBoolean57) {
				arg0.anInt2401 = Static60.anInt2961;
			} else {
				arg0.anInt2401 = Static35.anInt988;
			}
		} else if (local6 == 327) {
			arg0.anInt2386 = 150;
			arg0.anInt2373 = (int) (Math.sin((double) Static118.anInt2741 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2364 = 0;
			arg0.anInt2367 = 5;
		} else if (local6 == 328) {
			arg0.anInt2386 = 150;
			arg0.anInt2373 = (int) (Math.sin((double) Static118.anInt2741 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2364 = 1;
			arg0.anInt2367 = 5;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!od;ILclient!sa;)Lclient!od;")
	public static Class60 method1228(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class4_Sub14 arg1) {
		if (arg0.method1316(Static39.aClass60_392) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(18) int local18 = arg0.method1316(Static117.aClass60_1059);
			if (local18 == -1) {
				while (true) {
					local18 = arg0.method1316(Static26.aClass60_285);
					if (local18 == -1) {
						while (true) {
							local18 = arg0.method1316(Static94.aClass60_909);
							if (local18 == -1) {
								while (true) {
									local18 = arg0.method1316(Static130.aClass60_1127);
									if (local18 == -1) {
										while (true) {
											local18 = arg0.method1316(Static16.aClass60_179);
											if (local18 == -1) {
												while (true) {
													local18 = arg0.method1316(Static82.aClass60_813);
													if (local18 == -1) {
														return arg0;
													}
													@Pc(233) Class60 local233 = Static23.aClass60_253;
													if (Static105.aClass43_7 != null) {
														local233 = Static127.method637(Static105.aClass43_7.anInt1566);
														try {
															if (Static105.aClass43_7.anObject2 != null) {
																@Pc(251) byte[] local251 = ((String) Static105.aClass43_7.anObject2).getBytes("ISO-8859-1");
																local233 = Static6.method60(0, local251.length, local251);
															}
														} catch (@Pc(260) UnsupportedEncodingException local260) {
														}
													}
													arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), local233, arg0.method1315(local18 + 4) });
												}
											}
											arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), Static2.method10(Static119.method1900(4, arg1)), arg0.method1315(local18 + 2) });
										}
									}
									arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), Static2.method10(Static119.method1900(3, arg1)), arg0.method1315(local18 + 2) });
								}
							}
							arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), Static2.method10(Static119.method1900(2, arg1)), arg0.method1315(local18 + 2) });
						}
					}
					arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), Static2.method10(Static119.method1900(1, arg1)), arg0.method1315(local18 + 2) });
				}
			}
			arg0 = Static12.method1761(new Class60[] { arg0.method1333(0, local18), Static2.method10(Static119.method1900(0, arg1)), arg0.method1315(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method1229() {
		aClass60_753 = null;
		aClass60_748 = null;
		aClass4_Sub3_Sub6_Sub2Array7 = null;
		aClass60_750 = null;
		aClass60_751 = null;
		aClass60_747 = null;
		aClass49_2 = null;
		aClass4_Sub9_3 = null;
		aClass60_749 = null;
		aClass60_752 = null;
		aClass10_Sub1Array1 = null;
		aClass60_754 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!sa;I)Lclient!od;")
	public static Class60 method1230(@OriginalArg(0) Class4_Sub14 arg0) {
		if (Static43.method616(Static38.method575(arg0)) == 0) {
			return null;
		} else if (arg0.aClass60_959 == null || arg0.aClass60_959.method1334().method1345() == 0) {
			return Static62.aBoolean54 ? Static38.aClass60_388 : null;
		} else {
			return arg0.aClass60_959;
		}
	}
}
