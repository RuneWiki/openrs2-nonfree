import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_807 = Static108.method1915("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!kd;")
	private static Class39 aClass39_810 = Static108.method1915("Please wait)3)3)3");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_808 = aClass39_810;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_809 = aClass39_810;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!le;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "J")
	public static volatile long aLong47 = 0L;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!kd;")
	private static Class39 aClass39_811 = Static108.method1915("Nov");

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!kd;")
	private static Class39 aClass39_812 = Static108.method1915("Mar");

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_813 = Static108.method1915("Sep");

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!jb;")
	public static Class33 aClass33_23 = new Class33(128);

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!kd;")
	private static Class39 aClass39_814 = Static108.method1915("Jul");

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!kd;")
	private static Class39 aClass39_815 = Static108.method1915("Apr");

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!kd;")
	private static Class39 aClass39_816 = Static108.method1915("Feb");

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!kd;")
	private static Class39 aClass39_817 = Static108.method1915("Dec");

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!kd;")
	private static Class39 aClass39_818 = Static108.method1915("Jan");

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!kd;")
	private static Class39 aClass39_820 = Static108.method1915("May");

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!kd;")
	private static Class39 aClass39_822 = Static108.method1915("Jun");

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!kd;")
	private static Class39 aClass39_819 = Static108.method1915("Aug");

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!kd;")
	private static Class39 aClass39_821 = Static108.method1915("Oct");

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array18 = new Class39[] { aClass39_818, aClass39_816, aClass39_812, aClass39_815, aClass39_820, aClass39_822, aClass39_814, aClass39_819, aClass39_813, aClass39_821, aClass39_811, aClass39_817 };

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!kd;")
	private static Class39 aClass39_823 = Static108.method1915("Prepared visibility map");

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_824 = aClass39_823;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public static int anInt1661 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	public static int method1134() {
		@Pc(9) int local9 = Static62.method2035(Static9.anInt2983, Static28.anInt2564, Static62.anInt2932);
		return local9 - Static22.anInt763 >= 800 || (Static51.aByteArrayArrayArray3[Static9.anInt2983][Static28.anInt2564 >> 7][Static62.anInt2932 >> 7] & 0x4) == 0 ? 3 : Static9.anInt2983;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1135() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!a;)Z")
	public static boolean method1136(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt93;
		if (Static113.anInt2820 == 2) {
			if (local6 == 201) {
				Static8.aClass39_155 = Static103.aClass39_1271;
				Static2.anInt133 = 0;
				Static90.aBoolean179 = true;
				Static113.aBoolean226 = true;
				Static8.aClass39_148 = Static8.aClass39_147;
				Static64.anInt1672 = 1;
			}
			if (local6 == 202) {
				Static90.aBoolean179 = true;
				Static2.anInt133 = 0;
				Static8.aClass39_148 = Static8.aClass39_147;
				Static8.aClass39_155 = Static43.aClass39_589;
				Static113.aBoolean226 = true;
				Static64.anInt1672 = 2;
			}
		}
		if (local6 == 205) {
			Static100.anInt2556 = 250;
			return true;
		}
		if (local6 == 501) {
			Static90.aBoolean179 = true;
			Static113.aBoolean226 = true;
			Static8.aClass39_148 = Static8.aClass39_147;
			Static8.aClass39_155 = Static22.aClass39_378;
			Static64.anInt1672 = 4;
			Static2.anInt133 = 0;
		}
		if (local6 == 502) {
			Static64.anInt1672 = 5;
			Static113.aBoolean226 = true;
			Static8.aClass39_155 = Static33.aClass39_486;
			Static90.aBoolean179 = true;
			Static2.anInt133 = 0;
			Static8.aClass39_148 = Static8.aClass39_147;
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local6 >= 300 && local6 <= 313) {
			local99 = (local6 - 300) / 2;
			local103 = local6 & 0x1;
			Static112.aClass28_2.method867(local99, local103 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local99 = (local6 - 314) / 2;
			local103 = local6 & 0x1;
			Static112.aClass28_2.method870(local103 == 1, local99);
		}
		if (local6 == 324) {
			Static112.aClass28_2.method865(false);
		}
		if (local6 == 325) {
			Static112.aClass28_2.method865(true);
		}
		if (local6 == 326) {
			Static103.aClass1_Sub18_Sub1_5.method2203(3);
			Static112.aClass28_2.method863(Static103.aClass1_Sub18_Sub1_5);
			return true;
		}
		if (local6 == 620) {
			Static46.aBoolean221 = !Static46.aBoolean221;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static20.method408();
			if (Static8.aClass39_152.method1175() > 0) {
				Static103.aClass1_Sub18_Sub1_5.method2203(71);
				Static103.aClass1_Sub18_Sub1_5.method2179(Static8.aClass39_152.method1186());
				Static103.aClass1_Sub18_Sub1_5.method2168(local6 - 601);
				Static103.aClass1_Sub18_Sub1_5.method2168(Static46.aBoolean221 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!kd;Lclient!a;)Lclient!kd;")
	public static Class39 method1137(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class1_Sub1_Sub1 arg1) {
		if (arg0.method1166(Static22.aClass39_380) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method1166(Static52.aClass39_699);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method1166(Static52.aClass39_697);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method1166(Static126.aClass39_1508);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method1166(Static35.aClass39_499);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method1166(Static58.aClass39_767);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method1166(Static1.aClass39_26);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(225) Class39 local225 = Static8.aClass39_147;
													if (Static119.aClass34_5 != null) {
														local225 = Static48.method833(Static119.aClass34_5.anInt1568);
														try {
															if (Static119.aClass34_5.anObject2 != null) {
																@Pc(241) byte[] local241 = ((String) Static119.aClass34_5.anObject2).getBytes("ISO-8859-1");
																local225 = Static118.method2043(0, local241, local241.length);
															}
														} catch (@Pc(250) UnsupportedEncodingException local250) {
														}
													}
													arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), local225, arg0.method1181(local12 + 4) });
												}
											}
											arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), Static8.method228(Static126.method2117(4, arg1)), arg0.method1181(local12 + 2) });
										}
									}
									arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), Static8.method228(Static126.method2117(3, arg1)), arg0.method1181(local12 + 2) });
								}
							}
							arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), Static8.method228(Static126.method2117(2, arg1)), arg0.method1181(local12 + 2) });
						}
					}
					arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), Static8.method228(Static126.method2117(1, arg1)), arg0.method1181(local12 + 2) });
				}
			}
			arg0 = Static30.method601(new Class39[] { arg0.method1173(local12, 0), Static8.method228(Static126.method2117(0, arg1)), arg0.method1181(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBII)I")
	public static int method1138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 179) {
			arg0 /= 2;
		}
		if (arg2 > 192) {
			arg0 /= 2;
		}
		if (arg2 > 217) {
			arg0 /= 2;
		}
		if (arg2 > 243) {
			arg0 /= 2;
		}
		return (arg1 / 4 << 10) + (arg0 / 32 << 7) + arg2 / 2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
	public static int method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1140() {
		aClass39_823 = null;
		aClass39_814 = null;
		aClass39_816 = null;
		aClass39_808 = null;
		aClass39_818 = null;
		aClass39_822 = null;
		aClass39_815 = null;
		aClass39_807 = null;
		aClass33_23 = null;
		aClass39_809 = null;
		aClass39Array18 = null;
		aClass39_820 = null;
		aClass39_810 = null;
		aClass39_811 = null;
		aClass39_824 = null;
		aClass39_817 = null;
		aClass39_819 = null;
		aClass45_1 = null;
		aClass39_812 = null;
		aClass39_821 = null;
		aClass39_813 = null;
	}
}
