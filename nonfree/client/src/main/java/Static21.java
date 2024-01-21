import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!nb;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "Lclient!vc;")
	public static Class71 aClass71_399 = Static38.method736("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	public static int anInt698 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	public static int anInt700 = 0;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Lclient!vc;")
	private static Class71 aClass71_400 = Static38.method736("Too many connections from your address)3");

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_401 = Static38.method736("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_402 = aClass71_400;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method520() {
		aClass71_400 = null;
		aClass71_399 = null;
		aClass24_4 = null;
		aClass71_402 = null;
		aClass71_401 = null;
		aBooleanArray5 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLclient!qe;)Lclient!vc;")
	public static Class71 method522(@OriginalArg(2) Class5_Sub11 arg0) {
		try {
			@Pc(7) Class71 local7 = new Class71();
			local7.anInt2736 = arg0.method1535();
			if (local7.anInt2736 > 32767) {
				local7.anInt2736 = 32767;
			}
			local7.aByteArray28 = new byte[local7.anInt2736];
			arg0.anInt2233 += Static35.aClass23_1.method591(local7.aByteArray28, arg0.aByteArray23, local7.anInt2736, 0, arg0.anInt2233);
			return local7;
		} catch (@Pc(56) Exception local56) {
			return Static73.aClass71_892;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!me;Lclient!vc;I)Lclient!vc;")
	public static Class71 method523(@OriginalArg(0) Class5_Sub1_Sub11 arg0, @OriginalArg(1) Class71 arg1) {
		if (arg1.method1790(Static97.aClass71_1144) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method1790(Static81.aClass71_986);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method1790(Static90.aClass71_1423);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method1790(Static76.aClass71_911);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method1790(Static27.aClass71_442);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method1790(Static101.aClass71_1187);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method1790(Static17.aClass71_341);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(247) Class71 local247 = Static38.aClass71_568;
													if (Static31.aClass70_1 != null) {
														local247 = Static38.method735(Static31.aClass70_1.anInt2694);
														try {
															if (Static31.aClass70_1.anObject3 != null) {
																@Pc(265) byte[] local265 = ((String) Static31.aClass70_1.anObject3).getBytes("ISO-8859-1");
																local247 = Static54.method976(0, local265, local265.length);
															}
														} catch (@Pc(274) UnsupportedEncodingException local274) {
														}
													}
													arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), local247, arg1.method1822(local18 + 4) });
												}
											}
											arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), Static32.method618(Static114.method1774(4, arg0)), arg1.method1822(local18 + 2) });
										}
									}
									arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), Static32.method618(Static114.method1774(3, arg0)), arg1.method1822(local18 + 2) });
								}
							}
							arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), Static32.method618(Static114.method1774(2, arg0)), arg1.method1822(local18 + 2) });
						}
					}
					arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), Static32.method618(Static114.method1774(1, arg0)), arg1.method1822(local18 + 2) });
				}
			}
			arg1 = Static74.method677(new Class71[] { arg1.method1800(local18, 0), Static32.method618(Static114.method1774(0, arg0)), arg1.method1822(local18 + 2) });
		}
	}
}
