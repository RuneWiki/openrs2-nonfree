import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!c;")
	public static Class10 aClass10_17;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!od;")
	private static Class60 aClass60_543 = Static41.method597("Loading wordpack )2 ");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_533 = aClass60_543;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_534 = Static41.method597("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_535 = Static41.method597(" x ");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_536 = Static41.method597(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_537 = Static41.method597(" more options");

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!od;")
	private static Class60 aClass60_538 = Static41.method597("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_539 = aClass60_537;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt1494 = 1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public static volatile int anInt1495 = 0;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public static final int anInt1496 = 20;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_540 = Static41.method597("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array7 = new Class60[1000];

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_541 = aClass60_538;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_542 = Static41.method597("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method878() {
		aClass60_539 = null;
		aClass60_536 = null;
		anIntArray147 = null;
		aClass60_543 = null;
		aClass60_537 = null;
		aBooleanArray8 = null;
		aClass60_542 = null;
		aClass60_535 = null;
		aClass60_534 = null;
		aClass60_533 = null;
		aClass60_540 = null;
		aClass60Array7 = null;
		aClass60_538 = null;
		aClass60_541 = null;
		aClass10_17 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZILclient!sa;)V")
	public static void method879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub14 arg2) {
		if (arg2.anInt2400 == 1) {
			Static113.method814(Static23.aClass60_253, arg2.aClass60_957, 0, 39, arg2.anInt2388, 0);
		}
		if (arg2.anInt2400 == 2 && !Static86.aBoolean71) {
			@Pc(37) Class60 local37 = Static71.method1230(arg2);
			if (local37 != null) {
				Static113.method814(Static12.method1761(new Class60[] { Static71.aClass60_748, arg2.aClass60_955 }), local37, -1, 3, arg2.anInt2388, 0);
			}
		}
		if (arg2.anInt2400 == 3) {
			Static113.method814(Static23.aClass60_253, Static51.aClass60_490, 0, 32, arg2.anInt2388, 0);
		}
		if (arg2.anInt2400 == 4) {
			Static113.method814(Static23.aClass60_253, arg2.aClass60_957, 0, 48, arg2.anInt2388, 0);
		}
		if (arg2.anInt2400 == 5) {
			Static113.method814(Static23.aClass60_253, arg2.aClass60_957, 0, 19, arg2.anInt2388, 0);
		}
		if (arg2.anInt2400 == 6 && Static27.aClass4_Sub14_6 == null) {
			Static113.method814(Static23.aClass60_253, arg2.aClass60_957, -1, 23, arg2.anInt2388, 0);
		}
		@Pc(160) int local160;
		@Pc(154) int local154;
		if (arg2.anInt2389 == 2) {
			local154 = 0;
			for (@Pc(156) int local156 = 0; local156 < arg2.anInt2440; local156++) {
				for (local160 = 0; local160 < arg2.anInt2392; local160++) {
					@Pc(169) int local169 = local156 * (arg2.anInt2365 + 32);
					@Pc(177) int local177 = (arg2.anInt2423 + 32) * local160;
					if (local154 < 20) {
						local169 += arg2.anIntArray308[local154];
						local177 += arg2.anIntArray310[local154];
					}
					if (local177 <= arg0 && local169 <= arg1 && arg0 < local177 + 32 && arg1 < local169 + 32) {
						Static72.aClass4_Sub14_11 = arg2;
						Static46.anInt1139 = local154;
						if (arg2.anIntArray312[local154] > 0) {
							@Pc(241) Class4_Sub3_Sub16 local241 = Static112.method1854(arg2.anIntArray312[local154] - 1);
							if (Static44.anInt2167 == 1 && Static18.method349(Static38.method575(arg2))) {
								if (Static108.anInt2580 != arg2.anInt2388 || local154 != Static9.anInt125) {
									Static113.method814(Static12.method1761(new Class60[] { Static108.aClass60_1004, Static71.aClass60_752, local241.aClass60_1128 }), Static83.aClass60_819, local154, 38, arg2.anInt2388, local241.anInt2871);
								}
							} else if (!Static86.aBoolean71 || !Static18.method349(Static38.method575(arg2))) {
								@Pc(304) Class60[] local304 = local241.aClass60Array22;
								if (Static98.aBoolean84) {
									local304 = Static23.method427(local304);
								}
								@Pc(322) int local322;
								@Pc(335) byte local335;
								if (Static18.method349(Static38.method575(arg2))) {
									for (local322 = 4; local322 >= 3; local322--) {
										if (local304 != null && local304[local322] != null) {
											if (local322 == 3) {
												local335 = 12;
											} else {
												local335 = 17;
											}
											Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), local304[local322], local154, local335, arg2.anInt2388, local241.anInt2871);
										} else if (local322 == 4) {
											Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), Static76.aClass60_768, local154, 17, arg2.anInt2388, local241.anInt2871);
										}
									}
								}
								if (Static130.method1961(Static38.method575(arg2))) {
									Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), Static83.aClass60_819, local154, 47, arg2.anInt2388, local241.anInt2871);
								}
								if (Static18.method349(Static38.method575(arg2)) && local304 != null) {
									for (local322 = 2; local322 >= 0; local322--) {
										if (local304[local322] != null) {
											local335 = 0;
											if (local322 == 0) {
												local335 = 9;
											}
											if (local322 == 1) {
												local335 = 42;
											}
											if (local322 == 2) {
												local335 = 34;
											}
											Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), local304[local322], local154, local335, arg2.anInt2388, local241.anInt2871);
										}
									}
								}
								local304 = arg2.aClass60Array17;
								if (Static98.aBoolean84) {
									local304 = Static23.method427(local304);
								}
								if (local304 != null) {
									for (local322 = 4; local322 >= 0; local322--) {
										if (local304[local322] != null) {
											local335 = 0;
											if (local322 == 0) {
												local335 = 26;
											}
											if (local322 == 1) {
												local335 = 31;
											}
											if (local322 == 2) {
												local335 = 16;
											}
											if (local322 == 3) {
												local335 = 18;
											}
											if (local322 == 4) {
												local335 = 50;
											}
											Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), local304[local322], local154, local335, arg2.anInt2388, local241.anInt2871);
										}
									}
								}
								Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local241.aClass60_1128 }), Static23.aClass60_258, local154, 1004, arg2.anInt2388, local241.anInt2871);
							} else if ((Static111.anInt2632 & 0x10) == 16) {
								Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static71.aClass60_752, local241.aClass60_1128 }), Static124.aClass60_1108, local154, 6, arg2.anInt2388, local241.anInt2871);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg2.aBoolean95) {
			return;
		}
		if (!Static86.aBoolean71) {
			@Pc(686) Class60 local686;
			for (local154 = 9; local154 >= 5; local154--) {
				local686 = Static109.method1805(arg2, local154);
				if (local686 != null) {
					Static113.method814(arg2.aClass60_953, local686, arg2.anInt2403, 1001, arg2.anInt2388, local154 + 1);
				}
			}
			local686 = Static71.method1230(arg2);
			if (local686 != null) {
				Static113.method814(arg2.aClass60_953, local686, arg2.anInt2403, 3, arg2.anInt2388, 0);
			}
			for (local160 = 4; local160 >= 0; local160--) {
				@Pc(741) Class60 local741 = Static109.method1805(arg2, local160);
				if (local741 != null) {
					Static113.method814(arg2.aClass60_953, local741, arg2.anInt2403, 2, arg2.anInt2388, local160 + 1);
				}
			}
			if (Static103.method1712(Static38.method575(arg2))) {
				Static113.method814(Static23.aClass60_253, Static113.aClass60_483, arg2.anInt2403, 23, arg2.anInt2388, 0);
				return;
			}
			return;
		}
		if (Static86.method1379(Static38.method575(arg2)) && (Static111.anInt2632 & 0x20) == 32) {
			Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static116.aClass60_1052, arg2.aClass60_953 }), Static124.aClass60_1108, arg2.anInt2403, 10, arg2.anInt2388, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method880(@OriginalArg(0) Class10 arg0) {
		Static105.aClass10_27 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)I")
	public static int method881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg3;
			arg3 = arg4;
			arg4 = local19;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 8 - arg1 - arg3;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZ)I")
	public static int method882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local16 < 0 || local3 < 0 || local16 > 103 || local3 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg2;
		if (arg2 < 3 && (Static69.aByteArrayArrayArray5[1][local16][local3] & 0x2) == 2) {
			local38 = arg2 + 1;
		}
		@Pc(57) int local57 = arg1 & 0x7F;
		@Pc(61) int local61 = arg0 & 0x7F;
		@Pc(87) int local87 = Static16.anIntArrayArrayArray1[local38][local16 + 1][local3] * local57 + Static16.anIntArrayArrayArray1[local38][local16][local3] * (128 - local57) >> 7;
		@Pc(117) int local117 = Static16.anIntArrayArrayArray1[local38][local16][local3 + 1] * (128 - local57) + Static16.anIntArrayArrayArray1[local38][local16 + 1][local3 + 1] * local57 >> 7;
		return local117 * local61 + (128 - local61) * local87 >> 7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ve;)V")
	public static void method883(@OriginalArg(0) Object arg0, @OriginalArg(2) Class81 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static103.method1711(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
