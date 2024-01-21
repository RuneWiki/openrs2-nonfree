import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!gd;")
	public static Class27 aClass27_30;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_833 = Static109.method1737("glow3:");

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!na;")
	private static Class53 aClass53_838 = Static109.method1737("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_834 = aClass53_838;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_835 = Static109.method1737("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!na;")
	private static Class53 aClass53_836 = Static109.method1737("Please contact customer support)3");

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub15 aClass3_Sub1_Sub15_4 = null;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_837 = Static109.method1737("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
	public static int[] anIntArray250 = new int[200];

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_839 = aClass53_833;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_840 = aClass53_833;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_841 = Static109.method1737("sl_button");

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	public static int anInt1862 = 0;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_842 = Static109.method1737("(X100(U(Y");

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_843 = aClass53_836;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!na;Lclient!vb;)Lclient!na;")
	public static Class53 method1246(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class3_Sub1_Sub15 arg1) {
		if (arg0.method1281(Static88.aClass53_1009) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(16) int local16 = arg0.method1281(Static50.aClass53_1382);
			if (local16 == -1) {
				while (true) {
					local16 = arg0.method1281(Static40.aClass53_517);
					if (local16 == -1) {
						while (true) {
							local16 = arg0.method1281(Static77.aClass53_868);
							if (local16 == -1) {
								while (true) {
									local16 = arg0.method1281(Static21.aClass53_266);
									if (local16 == -1) {
										while (true) {
											local16 = arg0.method1281(Static65.aClass53_733);
											if (local16 == -1) {
												while (true) {
													local16 = arg0.method1281(Static29.aClass53_391);
													if (local16 == -1) {
														return arg0;
													}
													@Pc(232) Class53 local232 = Static35.aClass53_476;
													if (Static16.aClass22_3 != null) {
														local232 = Static106.method1709(Static16.aClass22_3.anInt866);
														try {
															if (Static16.aClass22_3.anObject2 != null) {
																@Pc(248) byte[] local248 = ((String) Static16.aClass22_3.anObject2).getBytes("ISO-8859-1");
																local232 = Static111.method1787(local248, 0, local248.length);
															}
														} catch (@Pc(257) UnsupportedEncodingException local257) {
														}
													}
													arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), local232, arg0.method1289(local16 + 4) });
												}
											}
											arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), Static82.method653(Static97.method1632(4, arg1)), arg0.method1289(local16 + 2) });
										}
									}
									arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), Static82.method653(Static97.method1632(3, arg1)), arg0.method1289(local16 + 2) });
								}
							}
							arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), Static82.method653(Static97.method1632(2, arg1)), arg0.method1289(local16 + 2) });
						}
					}
					arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), Static82.method653(Static97.method1632(1, arg1)), arg0.method1289(local16 + 2) });
				}
			}
			arg0 = Static103.method1689(new Class53[] { arg0.method1267(local16, 0), Static82.method653(Static97.method1632(0, arg1)), arg0.method1289(local16 + 2) });
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1247() {
		anIntArray250 = null;
		aClass53_839 = null;
		aClass53_840 = null;
		aClass53_841 = null;
		aClass53_836 = null;
		aClass53_838 = null;
		aClass53_837 = null;
		aClass3_Sub1_Sub15_4 = null;
		aClass53_842 = null;
		aClass53_835 = null;
		aClass53_834 = null;
		aClass53_843 = null;
		aClass53_833 = null;
		aClass27_30 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)I")
	public static int method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return (arg2 / 4 << 10) - (-(arg1 / 32 << 7) - (arg0 / 2));
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
	public static int method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!vb;)Z")
	public static boolean method1250(@OriginalArg(1) Class3_Sub1_Sub15 arg0) {
		if (Static102.aBoolean101) {
			if (Static50.method1914(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2707 == 0) {
				return false;
			}
		}
		return arg0.aBoolean113;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method1251(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static109.aBoolean105) {
			try {
				@Pc(25) Class15 local25 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
				local25.method1701(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static109.aBoolean105 = true;
			}
		}
		return arg0;
	}
}
