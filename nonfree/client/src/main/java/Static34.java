import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_365 = Static187.method3089("Registrierter Benutzer");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg5) {
			Static31.method572(arg0, arg2, arg4, arg3, arg6, arg1);
		} else if (arg3 - arg4 >= Static102.anInt2207 && arg4 + arg3 <= Static116.anInt2488 && arg2 - arg5 >= Static118.anInt2521 && arg2 + arg5 <= Static204.anInt2389) {
			Static83.method1266(arg2, arg4, arg0, arg6, arg3, arg5, arg1);
		} else {
			Static48.method860(arg4, arg6, arg2, arg0, arg1, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!d;ZLclient!ka;I)V")
	public static void method617(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub27 local9 = new Class1_Sub27();
		local9.anInt4514 = arg1.method3010();
		local9.anInt4512 = arg1.method3058();
		local9.aClass65Array2 = new Class65[local9.anInt4514];
		local9.aByteArrayArrayArray53 = new byte[local9.anInt4514][][];
		local9.anIntArray370 = new int[local9.anInt4514];
		local9.aClass65Array1 = new Class65[local9.anInt4514];
		local9.anIntArray368 = new int[local9.anInt4514];
		local9.anIntArray369 = new int[local9.anInt4514];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt4514; local55++) {
			try {
				@Pc(61) int local61 = arg1.method3010();
				@Pc(85) String local85;
				@Pc(94) String local94;
				@Pc(76) int local76;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local76 = 0;
					local85 = new String(arg1.method3022().method3228());
					local94 = new String(arg1.method3022().method3228());
					if (local61 == 1) {
						local76 = arg1.method3058();
					}
					local9.anIntArray369[local55] = local61;
					local9.anIntArray368[local55] = local76;
					local9.aClass65Array1[local55] = arg0.method563(Static124.method1831(local85), local94);
				} else if (local61 == 3 || local61 == 4) {
					local85 = new String(arg1.method3022().method3228());
					local94 = new String(arg1.method3022().method3228());
					local76 = arg1.method3010();
					@Pc(161) String[] local161 = new String[local76];
					for (@Pc(163) int local163 = 0; local163 < local76; local163++) {
						local161[local163] = new String(arg1.method3022().method3228());
					}
					@Pc(187) byte[][] local187 = new byte[local76][];
					@Pc(198) int local198;
					if (local61 == 3) {
						for (@Pc(192) int local192 = 0; local192 < local76; local192++) {
							local198 = arg1.method3058();
							local187[local192] = new byte[local198];
							arg1.method3017(local198, local187[local192]);
						}
					}
					local9.anIntArray369[local55] = local61;
					@Pc(223) Class[] local223 = new Class[local76];
					for (local198 = 0; local198 < local76; local198++) {
						local223[local198] = Static124.method1831(local161[local198]);
					}
					local9.aClass65Array2[local55] = arg0.method561(Static124.method1831(local85), local94, local223);
					local9.aByteArrayArrayArray53[local55] = local187;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local9.anIntArray370[local55] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local9.anIntArray370[local55] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local9.anIntArray370[local55] = -3;
			} catch (@Pc(283) Exception local283) {
				local9.anIntArray370[local55] = -4;
			} catch (@Pc(290) Throwable local290) {
				local9.anIntArray370[local55] = -5;
			}
		}
		Static107.aClass20_13.method466(local9);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!vd;I)V")
	public static void method618(@OriginalArg(0) Class92 arg0) {
		Static104.aClass92_1016 = arg0;
		Static115.method1717();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIBII)V")
	public static void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static133.method1972(arg1, arg2, arg0);
		@Pc(21) int local21;
		@Pc(39) int local39;
		@Pc(23) int local23;
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (local10 != 0L) {
			local21 = (int) local10 >> 20 & 0x3;
			local23 = arg3;
			@Pc(26) int[] local26 = Static141.aClass1_Sub3_Sub1_Sub1_4.anIntArray44;
			if (local10 > 0L) {
				local23 = arg4;
			}
			local39 = (int) local10 >> 14 & 0x1F;
			local54 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
			local61 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(65) Class1_Sub3_Sub5 local65 = Static154.method2362(local61);
			if (local65.anInt1418 == -1) {
				if (local39 == 0 || local39 == 2) {
					if (local21 == 0) {
						local26[local54] = local23;
						local26[local54 + 512] = local23;
						local26[local54 + 1024] = local23;
						local26[local54 + 1536] = local23;
					} else if (local21 == 1) {
						local26[local54] = local23;
						local26[local54 + 1] = local23;
						local26[local54 + 2] = local23;
						local26[local54 + 3] = local23;
					} else if (local21 == 2) {
						local26[local54 + 3] = local23;
						local26[local54 + 512 + 3] = local23;
						local26[local54 + 1024 + 3] = local23;
						local26[local54 + 3 + 1536] = local23;
					} else if (local21 == 3) {
						local26[local54 + 1536] = local23;
						local26[local54 + 1 + 1536] = local23;
						local26[local54 + 1538] = local23;
						local26[local54 + 3 + 1536] = local23;
					}
				}
				if (local39 == 3) {
					if (local21 == 0) {
						local26[local54] = local23;
					} else if (local21 == 1) {
						local26[local54 + 3] = local23;
					} else if (local21 == 2) {
						local26[local54 + 3 + 1536] = local23;
					} else if (local21 == 3) {
						local26[local54 + 1536] = local23;
					}
				}
				if (local39 == 2) {
					if (local21 == 3) {
						local26[local54] = local23;
						local26[local54 + 512] = local23;
						local26[local54 + 1024] = local23;
						local26[local54 + 1536] = local23;
					} else if (local21 == 0) {
						local26[local54] = local23;
						local26[local54 + 1] = local23;
						local26[local54 + 2] = local23;
						local26[local54 + 3] = local23;
					} else if (local21 == 1) {
						local26[local54 + 3] = local23;
						local26[local54 + 3 + 512] = local23;
						local26[local54 + 1024 + 3] = local23;
						local26[local54 + 3 + 1536] = local23;
					} else if (local21 == 2) {
						local26[local54 + 1536] = local23;
						local26[local54 + 1537] = local23;
						local26[local54 + 1538] = local23;
						local26[local54 + 1539] = local23;
					}
				}
			} else {
				@Pc(75) Class1_Sub3_Sub1_Sub5 local75 = Static18.aClass1_Sub3_Sub1_Sub5Array1[local65.anInt1418];
				if (local75 != null) {
					@Pc(88) int local88 = (local65.anInt1399 * 4 - local75.anInt4204) / 2;
					@Pc(99) int local99 = (local65.anInt1408 * 4 - local75.anInt4208) / 2;
					local75.method3183(arg2 * 4 + local88 + 48, 48 - (-((-local65.anInt1408 + 104 - arg0) * 4) + -local99));
				}
			}
		}
		local10 = Static175.method2876(arg1, arg2, arg0);
		if (local10 != 0L) {
			local21 = (int) local10 >> 20 & 0x3;
			local39 = (int) local10 >> 14 & 0x1F;
			local23 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(473) Class1_Sub3_Sub5 local473 = Static154.method2362(local23);
			@Pc(507) int local507;
			if (local473.anInt1418 != -1) {
				@Pc(483) Class1_Sub3_Sub1_Sub5 local483 = Static18.aClass1_Sub3_Sub1_Sub5Array1[local473.anInt1418];
				if (local483 != null) {
					local61 = (local473.anInt1399 * 4 - local483.anInt4204) / 2;
					local507 = (local473.anInt1408 * 4 - local483.anInt4208) / 2;
					local483.method3183(arg2 * 4 + local61 + 48, local507 + (-arg0 + 104 + -local473.anInt1408) * 4 + 48);
				}
			} else if (local39 == 9) {
				@Pc(542) int[] local542 = Static141.aClass1_Sub3_Sub1_Sub1_4.anIntArray44;
				local54 = 15658734;
				local507 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
				if (local10 > 0L) {
					local54 = 15597568;
				}
				if (local21 == 0 || local21 == 2) {
					local542[local507 + 1536] = local54;
					local542[local507 + 1 + 1024] = local54;
					local542[local507 + 2 + 512] = local54;
					local542[local507 + 3] = local54;
				} else {
					local542[local507] = local54;
					local542[local507 + 1 + 512] = local54;
					local542[local507 + 1026] = local54;
					local542[local507 + 3 + 1536] = local54;
				}
			}
		}
		local10 = Static85.method1283(arg1, arg2, arg0);
		if (local10 == 0L) {
			return;
		}
		local21 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(651) Class1_Sub3_Sub5 local651 = Static154.method2362(local21);
		if (local651.anInt1418 == -1) {
			return;
		}
		@Pc(661) Class1_Sub3_Sub1_Sub5 local661 = Static18.aClass1_Sub3_Sub1_Sub5Array1[local651.anInt1418];
		if (local661 != null) {
			@Pc(674) int local674 = (local651.anInt1399 * 4 - local661.anInt4204) / 2;
			local54 = (local651.anInt1408 * 4 - local661.anInt4208) / 2;
			local661.method3183(local674 + arg2 * 4 + 48, local54 + 48 + (-local651.anInt1408 + 104 - arg0) * 4);
			return;
		}
	}
}
