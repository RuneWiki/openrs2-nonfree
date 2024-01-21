import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!pe;")
	private static Class65 aClass65_653 = Static119.method1462("Members object");

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static final int anInt1507 = 7759444;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_654 = Static119.method1462("Angreifen");

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_655 = aClass65_653;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_656 = Static119.method1462("M");

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_657 = Static119.method1462(")1");

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_658 = Static119.method1462("<col=00ff00>");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!wa;Lclient!pe;B)Lclient!pe;")
	public static Class65 method1115(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) Class65 arg1) {
		if (arg1.method1500(Static93.aClass65_872) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(12) int local12 = arg1.method1500(Static93.aClass65_874);
			if (local12 == -1) {
				while (true) {
					local12 = arg1.method1500(Static107.aClass65_1011);
					if (local12 == -1) {
						while (true) {
							local12 = arg1.method1500(Static18.aClass65_141);
							if (local12 == -1) {
								while (true) {
									local12 = arg1.method1500(Static110.aClass65_1044);
									if (local12 == -1) {
										while (true) {
											local12 = arg1.method1500(Static43.aClass65_475);
											if (local12 == -1) {
												while (true) {
													local12 = arg1.method1500(Static126.aClass65_1174);
													if (local12 == -1) {
														return arg1;
													}
													@Pc(223) Class65 local223 = Static110.aClass65_1038;
													if (Static107.aClass15_9 != null) {
														local223 = Static133.method2039(Static107.aClass15_9.anInt403);
														try {
															if (Static107.aClass15_9.anObject9 != null) {
																@Pc(239) byte[] local239 = ((String) Static107.aClass15_9.anObject9).getBytes("ISO-8859-1");
																local223 = Static33.method626(local239, local239.length, 0);
															}
														} catch (@Pc(248) UnsupportedEncodingException local248) {
														}
													}
													arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), local223, arg1.method1501(local12 + 4) });
												}
											}
											arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), Static72.method1241(Static53.method890(4, arg0)), arg1.method1501(local12 + 2) });
										}
									}
									arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), Static72.method1241(Static53.method890(3, arg0)), arg1.method1501(local12 + 2) });
								}
							}
							arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), Static72.method1241(Static53.method890(2, arg0)), arg1.method1501(local12 + 2) });
						}
					}
					arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), Static72.method1241(Static53.method890(1, arg0)), arg1.method1501(local12 + 2) });
				}
			}
			arg1 = Static35.method647(new Class65[] { arg1.method1476(local12, 0), Static72.method1241(Static53.method890(0, arg0)), arg1.method1501(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg2;
			arg2 = local6;
		}
		@Pc(14) int local14 = arg0 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 7 + 1 - arg1 - arg3;
		} else {
			return 8 - arg2 - arg5;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lclient!la;II[BIIIIII)V")
	public static void method1117(@OriginalArg(0) Class46[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg1 + local3 > 0 && local3 + arg1 < 103 && arg6 + local7 > 0 && arg6 + local7 < 103) {
					arg0[arg4].anIntArrayArray13[arg1 + local3][arg6 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(73) Class2_Sub4 local73 = new Class2_Sub4(arg2);
		for (@Pc(79) int local79 = 0; local79 < 4; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
					if (arg5 == local79 && arg8 <= local83 && local83 < arg8 + 8 && local87 >= arg3 && arg3 + 8 > local87) {
						Static35.method642(local73, arg7, 0, arg4, arg1 + Static16.method1600(arg7, local87 & 0x7, local83 & 0x7), arg6 + Static100.method1646(arg7, local87 & 0x7, local83 & 0x7), 0);
					} else {
						Static35.method642(local73, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1118() {
		aClass65_657 = null;
		aClass65_656 = null;
		aClass65_653 = null;
		aClass65_654 = null;
		aClass65_655 = null;
		aClass65_658 = null;
		aClass2_Sub1_Sub4_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1120() {
		Static47.anInt1129 = 0;
		Static33.anInt761 = 0;
		Static122.method1882();
		Static38.method669();
		Static12.method251();
		Static34.method639();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static47.anInt1129; local19++) {
			local25 = Static98.anIntArray290[local19];
			if (Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25].anInt1969 != Static10.anInt2951) {
				Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25] = null;
			}
		}
		if (Static66.aClass2_Sub4_Sub1_2.anInt1298 != Static90.anInt1997) {
			throw new RuntimeException("gpp1 pos:" + Static66.aClass2_Sub4_Sub1_2.anInt1298 + " psize:" + Static90.anInt1997);
		}
		for (local25 = 0; local25 < Static35.anInt795; local25++) {
			if (Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static35.anInt795);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Z")
	public static boolean method1121(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!na;)V")
	public static void method1123(@OriginalArg(1) Class56 arg0) {
		Static40.aClass56_15 = arg0;
	}
}
