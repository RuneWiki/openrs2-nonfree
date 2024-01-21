import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_91 = Static63.method1251("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
	public static int anInt199 = 0;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	public static int anInt201 = 1;

	@OriginalMember(owner = "client!bc", name = "vb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_94 = Static63.method1251("Welcome to RuneScape");

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_92 = aClass45_94;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_93 = aClass45_91;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[112];

	@OriginalMember(owner = "client!bc", name = "wb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_95 = Static63.method1251("Titelbild geladen)3");

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	public static void method133() {
		@Pc(7) Class45 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static14.anInt426; local9++) {
			if (Static35.aClass45Array10[local9].method1328(Static68.aClass45_830) != -1) {
				local7 = Static35.aClass45Array10[local9].method1296(Static35.aClass45Array10[local9].method1328(Static68.aClass45_830));
				break;
			}
		}
		if (local7 == null) {
			Static14.method271();
			return;
		}
		@Pc(43) int local43 = Static90.anInt2532;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(52) int local52 = Static74.anInt2511;
		@Pc(54) int local54 = Static102.anInt2742;
		@Pc(56) int local56 = Static40.anInt1178;
		if (local54 > 190) {
			local54 = 190;
		}
		Static118.method1858(local43, local56, local54, local52, 6116423);
		Static118.method1858(local43 + 1, local56 + 1, local54 - 2, 16, 0);
		Static118.method1867(local43 + 1, local56 + 18, local54 - 2, local52 + -19, 0);
		Static8.aClass5_Sub2_Sub6_Sub1_1.method524(local7, local43 + 3, local56 + 14, 6116423, false);
		@Pc(110) int local110 = Static14.anInt425;
		@Pc(112) int local112 = Static47.anInt1354;
		if (Static97.anInt2635 == 0) {
			local112 -= 4;
			local110 -= 4;
		}
		if (Static97.anInt2635 == 1) {
			local112 -= 205;
			local110 -= 553;
		}
		if (Static97.anInt2635 == 2) {
			local112 -= 357;
			local110 -= 17;
		}
		for (@Pc(130) int local130 = 0; local130 < Static14.anInt426; local130++) {
			@Pc(146) int local146 = local56 + (Static14.anInt426 - local130 - 1) * 15 + 31;
			@Pc(148) int local148 = 16777215;
			if (local110 > local43 && local54 + local43 > local110 && local146 - 13 < local112 && local146 + 3 > local112) {
				local148 = 16776960;
			}
			@Pc(176) Class45 local176 = Static35.aClass45Array10[local130];
			if (local176.method1321(local7)) {
				local176 = local176.method1322(local176.method1317() - local7.method1317(), 0);
				if (local176.method1321(Static74.aClass45_1047)) {
					local176 = local176.method1322(local176.method1317() - Static74.aClass45_1047.method1317(), 0);
				}
			}
			Static8.aClass5_Sub2_Sub6_Sub1_1.method524(local176, local43 + 3, local146, local148, true);
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	public static void method134() {
		anIntArray25 = null;
		aClass2_1 = null;
		aClass45_91 = null;
		aBooleanArray1 = null;
		aClass45_93 = null;
		aClass45_95 = null;
		aClass45_94 = null;
		aClass45_92 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ia;Lclient!mb;I)Lclient!mb;")
	public static Class45 method135(@OriginalArg(0) Class5_Sub2_Sub8 arg0, @OriginalArg(1) Class45 arg1) {
		if (arg1.method1328(Static99.aClass45_1140) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.method1328(Static73.aClass45_901);
			if (local14 == -1) {
				while (true) {
					local14 = arg1.method1328(Static122.aClass45_1387);
					if (local14 == -1) {
						while (true) {
							local14 = arg1.method1328(Static78.aClass45_924);
							if (local14 == -1) {
								while (true) {
									local14 = arg1.method1328(Static79.aClass45_948);
									if (local14 == -1) {
										while (true) {
											local14 = arg1.method1328(Static97.aClass45_1121);
											if (local14 == -1) {
												while (true) {
													local14 = arg1.method1328(Static23.aClass45_372);
													if (local14 == -1) {
														return arg1;
													}
													@Pc(241) Class45 local241 = Static78.aClass45_929;
													if (Static54.aClass46_2 != null) {
														local241 = Static69.method1347(Static54.aClass46_2.anInt1962);
														try {
															if (Static54.aClass46_2.anObject4 != null) {
																@Pc(257) byte[] local257 = ((String) Static54.aClass46_2.anObject4).getBytes("ISO-8859-1");
																local241 = Static111.method1988(local257.length, 0, local257);
															}
														} catch (@Pc(266) UnsupportedEncodingException local266) {
														}
													}
													arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), local241, arg1.method1296(local14 + 4) });
												}
											}
											arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), Static17.method321(Static93.method1728(arg0, 4)), arg1.method1296(local14 + 2) });
										}
									}
									arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), Static17.method321(Static93.method1728(arg0, 3)), arg1.method1296(local14 + 2) });
								}
							}
							arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), Static17.method321(Static93.method1728(arg0, 2)), arg1.method1296(local14 + 2) });
						}
					}
					arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), Static17.method321(Static93.method1728(arg0, 1)), arg1.method1296(local14 + 2) });
				}
			}
			arg1 = Static39.method1443(new Class45[] { arg1.method1322(local14, 0), Static17.method321(Static93.method1728(arg0, 0)), arg1.method1296(local14 + 2) });
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method136(@OriginalArg(1) Class45 arg0) {
		if (arg0 == null || arg0.method1317() == 0) {
			Static88.anInt2502 = 0;
			return;
		}
		@Pc(16) Class45 local16 = arg0;
		@Pc(19) Class45[] local19 = new Class45[100];
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(26) int local26 = local16.method1325();
			if (local26 == -1) {
				local16 = local16.method1297();
				if (local16.method1317() > 0) {
					local19[local21++] = local16.method1327();
				}
				Static88.anInt2502 = 0;
				label46: for (local26 = 0; local26 < Static70.anInt2008; local26++) {
					@Pc(94) Class5_Sub2_Sub3 local94 = Static81.method1515(local26);
					if (local94.anInt275 == -1 && local94.aClass45_108 != null) {
						@Pc(107) Class45 local107 = local94.aClass45_108.method1327();
						for (@Pc(109) int local109 = 0; local109 < local21; local109++) {
							if (local107.method1328(local19[local109]) == -1) {
								continue label46;
							}
						}
						Static16.aClass45Array5[Static88.anInt2502] = local107;
						Static53.anIntArray347[Static88.anInt2502] = local26;
						Static88.anInt2502++;
						if (Static88.anInt2502 >= Static16.aClass45Array5.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(37) Class45 local37 = local16.method1322(local26, 0).method1297();
			if (local37.method1317() > 0) {
				local19[local21++] = local37.method1327();
			}
			local16 = local16.method1296(local26 + 1);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;II)V")
	public static void method138(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(3) int arg2) {
		if (Static67.anInt1909 == -1) {
			Static51.aBoolean81 = true;
		}
		if (arg2 == 0 && Static100.anInt2693 != -1) {
			Static28.anInt881 = 0;
			Static53.aClass45_1006 = arg0;
		}
		for (@Pc(23) int local23 = 99; local23 > 0; local23--) {
			Static12.anIntArray486[local23] = Static12.anIntArray486[local23 - 1];
			Static37.aClass45Array11[local23] = Static37.aClass45Array11[local23 - 1];
			Static59.aClass45Array16[local23] = Static59.aClass45Array16[local23 - 1];
		}
		Static37.aClass45Array11[0] = arg1;
		Static12.anIntArray486[0] = arg2;
		Static59.aClass45Array16[0] = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZIIII)V")
	public static void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static36.method768(arg2)) {
			Static72.method1463(Static19.aClass5_Sub2_Sub8ArrayArray1[arg2], arg5, -1, arg1, 0, arg0, arg4, arg3, 0);
		}
	}
}
