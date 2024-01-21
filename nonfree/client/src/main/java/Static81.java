import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!rf;")
	private static Class70 aClass70_824 = Static49.method1293("Please use a different world)3");

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt2479 = -1;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!rf;")
	public static Class70 aClass70_825 = aClass70_824;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Lclient!rf;")
	private static Class70 aClass70_826 = Static49.method1293("red:");

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_827 = aClass70_824;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!rf;")
	public static Class70 aClass70_828 = Static49.method1293("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!rf;")
	public static Class70 aClass70_829 = aClass70_826;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "Lclient!rf;")
	public static Class70 aClass70_830 = aClass70_826;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!ig;")
	public static Class39 aClass39_25 = null;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static31.anIntArrayArrayArray2[arg0][local16][local20] == -Static59.anInt1907) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static92.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static2.method144(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static2.method144(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static2.method144(local20, local156, local182)) {
				return false;
			} else if (Static2.method144(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static144.method2837(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static2.method144(local16 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static2.method144(local16 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static2.method144(local16 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static2.method144(local16 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method1832() {
		aClass70_824 = null;
		aClass70_830 = null;
		aClass70_825 = null;
		aLongArray5 = null;
		aClass39_25 = null;
		aClass70_829 = null;
		aClass70_828 = null;
		aClass70_826 = null;
		aClass70_827 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rf;ILclient!ig;)Lclient!rf;")
	public static Class70 method1833(@OriginalArg(0) Class70 arg0, @OriginalArg(2) Class39 arg1) {
		if (arg0.method2902(Static162.aClass70_1460) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(18) int local18 = arg0.method2902(Static79.aClass70_803);
			if (local18 == -1) {
				while (true) {
					local18 = arg0.method2902(Static104.aClass70_957);
					if (local18 == -1) {
						while (true) {
							local18 = arg0.method2902(Static86.aClass70_854);
							if (local18 == -1) {
								while (true) {
									local18 = arg0.method2902(Static34.aClass70_367);
									if (local18 == -1) {
										while (true) {
											local18 = arg0.method2902(Static172.aClass70_1501);
											if (local18 == -1) {
												while (true) {
													local18 = arg0.method2902(Static21.aClass70_205);
													if (local18 == -1) {
														return arg0;
													}
													@Pc(232) Class70 local232 = Static35.aClass70_632;
													if (Static117.aClass18_6 != null) {
														local232 = Static120.method2457(Static117.aClass18_6.anInt1404);
														try {
															if (Static117.aClass18_6.anObject2 != null) {
																@Pc(248) byte[] local248 = ((String) Static117.aClass18_6.anObject2).getBytes("ISO-8859-1");
																local232 = Static143.method2805(0, local248.length, local248);
															}
														} catch (@Pc(257) UnsupportedEncodingException local257) {
														}
													}
													arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), local232, arg0.method2906(local18 + 4) });
												}
											}
											arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), Static10.method301(Static147.method2884(arg1, 4)), arg0.method2906(local18 + 2) });
										}
									}
									arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), Static10.method301(Static147.method2884(arg1, 3)), arg0.method2906(local18 + 2) });
								}
							}
							arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), Static10.method301(Static147.method2884(arg1, 2)), arg0.method2906(local18 + 2) });
						}
					}
					arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), Static10.method301(Static147.method2884(arg1, 1)), arg0.method2906(local18 + 2) });
				}
			}
			arg0 = Static160.method3210(new Class70[] { arg0.method2903(local18, 0), Static10.method301(Static147.method2884(arg1, 0)), arg0.method2906(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	public static void method1834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4 local7 = Static64.aClass4ArrayArrayArray2[Static56.anInt1784][arg1][arg0];
		if (local7 == null) {
			Static56.method1379(Static56.anInt1784, arg1, arg0);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class1_Sub1_Sub4_Sub6 local22 = null;
		@Pc(27) Class1_Sub1_Sub4_Sub6 local27;
		for (local27 = (Class1_Sub1_Sub4_Sub6) local7.method174(); local27 != null; local27 = (Class1_Sub1_Sub4_Sub6) local7.method181()) {
			@Pc(33) Class1_Sub1_Sub2 local33 = Static90.method1963(local27.anInt3603);
			@Pc(36) int local36 = local33.anInt190;
			if (local33.anInt184 == 1) {
				local36 *= local27.anInt3602 + 1;
			}
			if (local36 > local20) {
				local20 = local36;
				local22 = local27;
			}
		}
		if (local22 == null) {
			Static56.method1379(Static56.anInt1784, arg1, arg0);
			return;
		}
		local7.method180(local22);
		@Pc(80) Class1_Sub1_Sub4_Sub6 local80 = null;
		@Pc(87) Class1_Sub1_Sub4_Sub6 local87 = null;
		for (local27 = (Class1_Sub1_Sub4_Sub6) local7.method174(); local27 != null; local27 = (Class1_Sub1_Sub4_Sub6) local7.method181()) {
			if (local27.anInt3603 != local22.anInt3603) {
				if (local80 == null) {
					local80 = local27;
				}
				if (local27.anInt3603 != local80.anInt3603 && local87 == null) {
					local87 = local27;
				}
			}
		}
		@Pc(132) long local132 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static21.method468(Static56.anInt1784, arg1, arg0, Static156.method3142(arg1 * 128 + 64, Static56.anInt1784, arg0 * 128 + 64), local22, local132, local80, local87);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I")
	public static int method1836(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
	public static void method1837() {
		Static162.aBoolean167 = true;
		Static79.aBoolean91 = true;
	}
}
