import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_26;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!de;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
	public static int[] anIntArray69 = new int[50];

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_615 = Static33.method650("b12_full");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_616 = Static33.method650("titlebox");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!oa;")
	private static Class56 aClass56_617 = Static33.method650("K");

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_618 = Static33.method650("Mem:");

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_619 = aClass56_617;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_620 = Static33.method650("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_621 = aClass56_617;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public static int anInt1064 = 0;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_622 = Static33.method650("compass");

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Z")
	public static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_623 = Static33.method650("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!oa;")
	public static Class56 aClass56_624 = Static33.method650("mapback");

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_625 = Static33.method650("leuchten3:");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!td;ILclient!oa;)Lclient!oa;")
	public static Class56 method750(@OriginalArg(0) Class3_Sub1_Sub16 arg0, @OriginalArg(2) Class56 arg1) {
		if (arg1.method1424(Static12.aClass56_177) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.method1424(Static80.aClass56_1160);
			if (local21 == -1) {
				while (true) {
					local21 = arg1.method1424(Static11.aClass56_168);
					if (local21 == -1) {
						while (true) {
							local21 = arg1.method1424(Static43.aClass56_688);
							if (local21 == -1) {
								while (true) {
									local21 = arg1.method1424(Static8.aClass56_115);
									if (local21 == -1) {
										while (true) {
											local21 = arg1.method1424(Static70.aClass56_1028);
											if (local21 == -1) {
												while (true) {
													local21 = arg1.method1424(Static69.aClass56_1015);
													if (local21 == -1) {
														return arg1;
													}
													@Pc(241) Class56 local241 = Static122.aClass56_1633;
													if (Static38.aClass54_3 != null) {
														local241 = Static75.method1349(Static38.aClass54_3.anInt2076);
														try {
															if (Static38.aClass54_3.anObject2 != null) {
																@Pc(257) byte[] local257 = ((String) Static38.aClass54_3.anObject2).getBytes("ISO-8859-1");
																local241 = Static127.method2041(local257.length, 0, local257);
															}
														} catch (@Pc(266) UnsupportedEncodingException local266) {
														}
													}
													arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), local241, arg1.method1417(local21 + 4) });
												}
											}
											arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), Static5.method46(Static88.method1611(arg0, 4)), arg1.method1417(local21 + 2) });
										}
									}
									arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), Static5.method46(Static88.method1611(arg0, 3)), arg1.method1417(local21 + 2) });
								}
							}
							arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), Static5.method46(Static88.method1611(arg0, 2)), arg1.method1417(local21 + 2) });
						}
					}
					arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), Static5.method46(Static88.method1611(arg0, 1)), arg1.method1417(local21 + 2) });
				}
			}
			arg1 = Static84.method1524(new Class56[] { arg1.method1451(local21, 0), Static5.method46(Static88.method1611(arg0, 0)), arg1.method1417(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method751() {
		aClass17_1 = null;
		aClass56_620 = null;
		aClass3_Sub1_Sub1_Sub4_26 = null;
		aClass56_617 = null;
		aClass56_619 = null;
		aClass56_625 = null;
		aClass56_615 = null;
		aClass56_624 = null;
		aClass56_623 = null;
		aClass56_621 = null;
		aClass56_618 = null;
		anIntArray69 = null;
		aClass56_622 = null;
		aClass56_616 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method752() {
		@Pc(5) int local5 = Static77.anInt3137 * 128 + 64;
		@Pc(11) int local11 = Static69.anInt1917 * 128 + 64;
		@Pc(19) int local19 = Static27.method560(local11, Static94.anInt2470, local5) - Static33.anInt960;
		if (Static57.anInt1615 < local5) {
			Static57.anInt1615 += (local5 - Static57.anInt1615) * Static79.anInt2113 / 1000 + Static14.anInt328;
			if (Static57.anInt1615 > local5) {
				Static57.anInt1615 = local5;
			}
		}
		if (local5 < Static57.anInt1615) {
			Static57.anInt1615 -= Static14.anInt328 + (Static57.anInt1615 - local5) * Static79.anInt2113 / 1000;
			if (Static57.anInt1615 < local5) {
				Static57.anInt1615 = local5;
			}
		}
		if (local11 > Static15.anInt433) {
			Static15.anInt433 += Static14.anInt328 + Static79.anInt2113 * (local11 - Static15.anInt433) / 1000;
			if (Static15.anInt433 > local11) {
				Static15.anInt433 = local11;
			}
		}
		if (local19 > Static111.anInt2863) {
			Static111.anInt2863 += (local19 - Static111.anInt2863) * Static79.anInt2113 / 1000 + Static14.anInt328;
			if (local19 < Static111.anInt2863) {
				Static111.anInt2863 = local19;
			}
		}
		if (Static15.anInt433 > local11) {
			Static15.anInt433 -= Static14.anInt328 + Static79.anInt2113 * (Static15.anInt433 - local11) / 1000;
			if (Static15.anInt433 < local11) {
				Static15.anInt433 = local11;
			}
		}
		local5 = Static31.anInt924 * 128 + 64;
		if (Static111.anInt2863 > local19) {
			Static111.anInt2863 -= (Static111.anInt2863 - local19) * Static79.anInt2113 / 1000 + Static14.anInt328;
			if (local19 > Static111.anInt2863) {
				Static111.anInt2863 = local19;
			}
		}
		local11 = Static100.anInt2569 * 128 + 64;
		local19 = Static27.method560(local11, Static94.anInt2470, local5) - Static125.anInt3194;
		@Pc(208) int local208 = local11 - Static15.anInt433;
		@Pc(212) int local212 = local5 - Static57.anInt1615;
		@Pc(217) int local217 = local19 - Static111.anInt2863;
		@Pc(228) int local228 = (int) Math.sqrt((double) (local212 * local212 + local208 * local208));
		@Pc(239) int local239 = (int) (Math.atan2((double) local217, (double) local228) * 325.949D) & 0x7FF;
		@Pc(250) int local250 = (int) (Math.atan2((double) local212, (double) local208) * -325.949D) & 0x7FF;
		if (local239 < 128) {
			local239 = 128;
		}
		@Pc(260) int local260 = local250 - Static94.anInt2474;
		if (local239 > 383) {
			local239 = 383;
		}
		if (local239 > Static97.anInt2547) {
			Static97.anInt2547 += Static68.anInt1865 + (local239 - Static97.anInt2547) * Static53.anInt1523 / 1000;
			if (Static97.anInt2547 > local239) {
				Static97.anInt2547 = local239;
			}
		}
		if (local260 > 1024) {
			local260 -= 2048;
		}
		if (local260 < -1024) {
			local260 += 2048;
		}
		if (local260 > 0) {
			Static94.anInt2474 += Static53.anInt1523 * local260 / 1000 + Static68.anInt1865;
			Static94.anInt2474 &= 0x7FF;
		}
		if (Static97.anInt2547 > local239) {
			Static97.anInt2547 -= (Static97.anInt2547 - local239) * Static53.anInt1523 / 1000 + Static68.anInt1865;
			if (local239 > Static97.anInt2547) {
				Static97.anInt2547 = local239;
			}
		}
		if (local260 < 0) {
			Static94.anInt2474 -= Static68.anInt1865 + -local260 * Static53.anInt1523 / 1000;
			Static94.anInt2474 &= 0x7FF;
		}
		@Pc(369) int local369 = local250 - Static94.anInt2474;
		if (local369 > 1024) {
			local369 -= 2048;
		}
		if (local369 < -1024) {
			local369 += 2048;
		}
		if (local369 < 0 && local260 > 0 || local369 > 0 && local260 < 0) {
			Static94.anInt2474 = local250;
		}
	}
}
