import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1272 = Static56.method972("auf der Hautpseite)3");

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt2820 = 0;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1273 = Static56.method972("Loaded sprites");

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1274 = Static56.method972("Nehmen");

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1275 = aClass5_1273;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public static int anInt2842 = 127;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method1867() {
		aClass5_1273 = null;
		aClass5_1275 = null;
		aClass3_Sub1_Sub2_Sub3_7 = null;
		aClass5_1272 = null;
		aClass5_1274 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method1873() {
		Static1.method6();
		if (Static47.anInt1308 != 10) {
			return;
		}
		@Pc(13) int local13 = Static76.anInt2563;
		@Pc(21) int local21 = Static45.anInt1269 - 202;
		@Pc(25) int local25 = Static99.anInt2491 - 171;
		if (Static11.anInt464 == 0) {
			if (local13 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 100 && local25 <= 140) {
				Static70.anInt1833 = 0;
				Static11.anInt464 = 3;
			}
			if (local13 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 100 && local25 <= 140) {
				Static11.anInt464 = 2;
				Static88.aClass5_1017 = Static15.aClass5_228;
				Static88.aClass5_1024 = Static15.aClass5_223;
				Static88.aClass5_1014 = Static35.aClass5_473;
				Static70.anInt1833 = 0;
				return;
			}
		} else if (Static11.anInt464 == 2) {
			@Pc(154) byte local154 = 60;
			@Pc(155) int local155 = local154 + 30;
			if (local13 == 1 && local25 >= 75 && local25 < 90) {
				Static70.anInt1833 = 0;
			}
			local155 += 15;
			if (local13 == 1 && local25 >= 90 && local25 < 105) {
				Static70.anInt1833 = 1;
			}
			local155 += 15;
			if (local13 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 130 && local25 <= 170) {
				Static88.aClass5_1015 = Static88.aClass5_1015.method155().method147();
				Static58.method1005(Static45.aClass5_601, Static15.aClass5_251, Static15.aClass5_226);
				Static116.method1971(20);
				return;
			}
			if (local13 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 130 && local25 <= 170) {
				Static11.anInt464 = 0;
				Static88.aClass5_1019 = Static88.aClass5_1020;
				Static88.aClass5_1015 = Static88.aClass5_1020;
			}
			while (true) {
				@Pc(290) boolean local290;
				label143: do {
					while (Static53.method933()) {
						local290 = false;
						for (@Pc(292) int local292 = 0; local292 < Static47.aClass5_627.method144(); local292++) {
							if (Static34.anInt970 == Static47.aClass5_627.method164(local292)) {
								local290 = true;
								break;
							}
						}
						if (Static70.anInt1833 != 0) {
							continue label143;
						}
						if (Static17.anInt619 == 85 && Static88.aClass5_1015.method144() > 0) {
							Static88.aClass5_1015 = Static88.aClass5_1015.method133(0, Static88.aClass5_1015.method144() - 1);
						}
						if (Static17.anInt619 == 84 || Static17.anInt619 == 80) {
							Static70.anInt1833 = 1;
						}
						if (local290 && Static88.aClass5_1015.method144() < 12) {
							Static88.aClass5_1015 = Static88.aClass5_1015.method160(Static34.anInt970);
						}
					}
					return;
				} while (Static70.anInt1833 != 1);
				if (Static17.anInt619 == 85 && Static88.aClass5_1019.method144() > 0) {
					Static88.aClass5_1019 = Static88.aClass5_1019.method133(0, Static88.aClass5_1019.method144() - 1);
				}
				if (Static17.anInt619 == 84 || Static17.anInt619 == 80) {
					Static70.anInt1833 = 0;
				}
				if (local290 && Static88.aClass5_1019.method144() < 20) {
					Static88.aClass5_1019 = Static88.aClass5_1019.method160(Static34.anInt970);
				}
			}
		} else if (Static11.anInt464 == 3 && local13 == 1 && local21 >= 105 && local21 <= 255 && local25 >= 130 && local25 <= 170) {
			Static11.anInt464 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!bf;I)[B")
	public static byte[] method1877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg0 + arg1 * 37 & 0xFFFF) + (long) (arg1 << 16) + ((long) arg3 << 32);
		if (Static2.aClass9_2 != null) {
			@Pc(35) Class3_Sub1_Sub8 local35 = (Class3_Sub1_Sub8) Static2.aClass9_2.method282(local23);
			if (local35 != null) {
				return local35.aByteArray10;
			}
		}
		@Pc(46) byte[] local46 = arg2.method1882(arg1, arg0);
		if (local46 == null) {
			return null;
		} else {
			if (Static2.aClass9_2 != null) {
				Static2.aClass9_2.method284(new Class3_Sub1_Sub8(local46), local23);
			}
			return local46;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	public static void method1879() {
		@Pc(10) int local10 = Static75.aClass3_Sub6_Sub1_2.method1646(8);
		@Pc(19) int local19;
		if (local10 < Static38.anInt1056) {
			for (local19 = local10; local19 < Static38.anInt1056; local19++) {
				Static37.anIntArray123[Static61.anInt1651++] = Static1.anIntArray6[local19];
			}
		}
		if (Static38.anInt1056 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static38.anInt1056 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(58) int local58 = Static1.anIntArray6[local19];
			@Pc(62) Class3_Sub1_Sub1_Sub1_Sub2 local62 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local58];
			@Pc(67) int local67 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			if (local67 == 0) {
				Static1.anIntArray6[Static38.anInt1056++] = local58;
				local62.anInt1556 = Static3.anInt289;
			} else {
				@Pc(90) int local90 = Static75.aClass3_Sub6_Sub1_2.method1646(2);
				if (local90 == 0) {
					Static1.anIntArray6[Static38.anInt1056++] = local58;
					local62.anInt1556 = Static3.anInt289;
					Static78.anIntArray224[Static83.anInt2051++] = local58;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local90 == 1) {
						Static1.anIntArray6[Static38.anInt1056++] = local58;
						local62.anInt1556 = Static3.anInt289;
						local135 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local62.method1001(local135, false);
						local145 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
						if (local145 == 1) {
							Static78.anIntArray224[Static83.anInt2051++] = local58;
						}
					} else if (local90 == 2) {
						Static1.anIntArray6[Static38.anInt1056++] = local58;
						local62.anInt1556 = Static3.anInt289;
						local135 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local62.method1001(local135, true);
						local145 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local62.method1001(local145, true);
						@Pc(197) int local197 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
						if (local197 == 1) {
							Static78.anIntArray224[Static83.anInt2051++] = local58;
						}
					} else if (local90 == 3) {
						Static37.anIntArray123[Static61.anInt1651++] = local58;
					}
				}
			}
		}
	}
}
