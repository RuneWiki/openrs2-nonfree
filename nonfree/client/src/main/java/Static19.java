import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!vc;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_329 = Static34.method846("Enter amount:");

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_330 = Static34.method846("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_331 = Static34.method846("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_332 = Static34.method846("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
	public static int[] anIntArray60 = new int[32768];

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt945 = 0;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_333 = aClass55_329;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_334 = Static34.method846("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt946 = 0;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_335 = Static34.method846("logo");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_336 = Static34.method846("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt948 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class55 method586(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static58.method1196(arg0);
		} else if (arg0 < 10000000) {
			return Static89.method1698(new Class55[] { Static58.method1196(arg0 / 1000), Static112.aClass55_1359 });
		} else {
			return Static89.method1698(new Class55[] { Static58.method1196(arg0 / 1000000), Static78.aClass55_895 });
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method587(@OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg0) {
		if (arg0.anInt2728 == 0) {
			return;
		}
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg0.anInt2698 != -1 && arg0.anInt2698 < 32768) {
			@Pc(29) Class6_Sub2_Sub3_Sub1_Sub2 local29 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[arg0.anInt2698];
			if (local29 != null) {
				local38 = arg0.anInt2710 - local29.anInt2710;
				local45 = arg0.anInt2744 - local29.anInt2744;
				if (local38 != 0 || local45 != 0) {
					arg0.anInt2727 = (int) (Math.atan2((double) local38, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt2698 >= 32768) {
			local75 = arg0.anInt2698 - 32768;
			if (local75 == Static41.anInt1401) {
				local75 = 2047;
			}
			@Pc(84) Class6_Sub2_Sub3_Sub1_Sub1 local84 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local75];
			if (local84 != null) {
				@Pc(93) int local93 = arg0.anInt2744 - local84.anInt2744;
				local45 = arg0.anInt2710 - local84.anInt2710;
				if (local45 != 0 || local93 != 0) {
					arg0.anInt2727 = (int) (Math.atan2((double) local45, (double) local93) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2746 != 0 || arg0.anInt2743 != 0) && (arg0.anInt2737 == 0 || arg0.anInt2720 > 0)) {
			local75 = arg0.anInt2710 - (arg0.anInt2746 - Static18.anInt938 - Static18.anInt938) * 64;
			local38 = arg0.anInt2744 - (arg0.anInt2743 - Static88.anInt3276 - Static88.anInt3276) * 64;
			if (local75 != 0 || local38 != 0) {
				arg0.anInt2727 = (int) (Math.atan2((double) local75, (double) local38) * 325.949D) & 0x7FF;
			}
			arg0.anInt2746 = 0;
			arg0.anInt2743 = 0;
		}
		local75 = arg0.anInt2727 - arg0.anInt2707 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt2729 = 0;
			return;
		}
		arg0.anInt2729++;
		@Pc(214) boolean local214;
		if (local75 <= 1024) {
			arg0.anInt2707 += arg0.anInt2728;
			local214 = true;
			if (local75 < arg0.anInt2728 || 2048 - arg0.anInt2728 < local75) {
				arg0.anInt2707 = arg0.anInt2727;
				local214 = false;
			}
			if (arg0.anInt2741 == arg0.anInt2756 && (arg0.anInt2729 > 25 || local214)) {
				if (arg0.anInt2709 == -1) {
					arg0.anInt2741 = arg0.anInt2747;
				} else {
					arg0.anInt2741 = arg0.anInt2709;
				}
			}
		} else {
			arg0.anInt2707 -= arg0.anInt2728;
			local214 = true;
			if (arg0.anInt2728 > local75 || local75 > 2048 - arg0.anInt2728) {
				local214 = false;
				arg0.anInt2707 = arg0.anInt2727;
			}
			if (arg0.anInt2756 == arg0.anInt2741 && (arg0.anInt2729 > 25 || local214)) {
				if (arg0.anInt2701 == -1) {
					arg0.anInt2741 = arg0.anInt2747;
				} else {
					arg0.anInt2741 = arg0.anInt2701;
				}
			}
		}
		arg0.anInt2707 &= 0x7FF;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method588() {
		aClass55_336 = null;
		aClass55_335 = null;
		aClass55_330 = null;
		aClass55_331 = null;
		aClass55_332 = null;
		aClass65_1 = null;
		aClass55_334 = null;
		aClass55_329 = null;
		anIntArray60 = null;
		aClass55_333 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!rc;BLclient!te;)Lclient!rc;")
	public static Class55 method589(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class6_Sub2_Sub14 arg1) {
		if (arg0.method1645(Static7.aClass55_125) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(25) int local25 = arg0.method1645(Static45.aClass55_570);
			if (local25 == -1) {
				while (true) {
					local25 = arg0.method1645(Static61.aClass55_743);
					if (local25 == -1) {
						while (true) {
							local25 = arg0.method1645(Static87.aClass55_1004);
							if (local25 == -1) {
								while (true) {
									local25 = arg0.method1645(Static18.aClass55_323);
									if (local25 == -1) {
										while (true) {
											local25 = arg0.method1645(Static88.aClass55_1371);
											if (local25 == -1) {
												while (true) {
													local25 = arg0.method1645(Static3.aClass55_15);
													if (local25 == -1) {
														return arg0;
													}
													@Pc(236) Class55 local236 = Static34.aClass55_502;
													if (Static79.aClass25_7 != null) {
														local236 = Static75.method1441(Static79.aClass25_7.anInt1213);
														try {
															if (Static79.aClass25_7.anObject3 != null) {
																@Pc(252) byte[] local252 = ((String) Static79.aClass25_7.anObject3).getBytes("ISO-8859-1");
																local236 = Static7.method245(local252, 0, local252.length);
															}
														} catch (@Pc(261) UnsupportedEncodingException local261) {
														}
													}
													arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), local236, arg0.method1673(local25 + 4) });
												}
											}
											arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), Static63.method1320(Static101.method1934(4, arg1)), arg0.method1673(local25 + 2) });
										}
									}
									arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), Static63.method1320(Static101.method1934(3, arg1)), arg0.method1673(local25 + 2) });
								}
							}
							arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), Static63.method1320(Static101.method1934(2, arg1)), arg0.method1673(local25 + 2) });
						}
					}
					arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), Static63.method1320(Static101.method1934(1, arg1)), arg0.method1673(local25 + 2) });
				}
			}
			arg0 = Static89.method1698(new Class55[] { arg0.method1671(0, local25), Static63.method1320(Static101.method1934(0, arg1)), arg0.method1673(local25 + 2) });
		}
	}
}
