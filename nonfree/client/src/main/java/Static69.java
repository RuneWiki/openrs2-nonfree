import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "Lclient!lg;")
	public static Class60 aClass60_5;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLclient!am;ZIII)V")
	public static void method1292(@OriginalArg(2) Class11 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static160.anInt3616 = 2;
		Static177.anInt5898 = 1;
		Static252.aBoolean443 = false;
		Static74.aClass11_38 = arg0;
		Static138.anInt3121 = arg1;
		Static297.anInt6002 = 0;
		Static59.anInt1267 = arg2;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1293(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static363.method4761(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!fd;III)V")
	public static void method1294(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1826 == 1) {
			Static285.method4888(0, "", 0L, -1, arg0.aString63, arg0.anInt1830, 42);
		}
		if (arg0.anInt1826 == 2 && !Static247.aBoolean436) {
			@Pc(38) String local38 = Static226.method3893(arg0);
			if (local38 != null) {
				Static285.method4888(-1, "<col=00ff00>" + arg0.aString58, 0L, -1, local38, arg0.anInt1830, 4);
			}
		}
		if (arg0.anInt1826 == 3) {
			Static285.method4888(0, "", 0L, -1, Static293.aString223, arg0.anInt1830, 24);
		}
		if (arg0.anInt1826 == 4) {
			Static285.method4888(0, "", 0L, -1, arg0.aString63, arg0.anInt1830, 36);
		}
		if (arg0.anInt1826 == 5) {
			Static285.method4888(0, "", 0L, -1, arg0.aString63, arg0.anInt1830, 10);
		}
		if (arg0.anInt1826 == 6 && Static251.aClass72_16 == null) {
			Static285.method4888(-1, "", 0L, -1, arg0.aString63, arg0.anInt1830, 44);
		}
		@Pc(157) int local157;
		@Pc(151) int local151;
		if (arg0.anInt1825 == 2) {
			local151 = 0;
			for (@Pc(153) int local153 = 0; local153 < arg0.anInt1799; local153++) {
				for (local157 = 0; local157 < arg0.anInt1827; local157++) {
					@Pc(166) int local166 = (arg0.anInt1881 + 32) * local157;
					@Pc(173) int local173 = (arg0.anInt1848 + 32) * local153;
					if (local151 < 20) {
						local173 += arg0.anIntArray193[local151];
						local166 += arg0.anIntArray186[local151];
					}
					if (local166 <= arg2 && local173 <= arg1 && local166 + 32 > arg2 && local173 + 32 > arg1) {
						Static63.aClass72_6 = arg0;
						Static77.anInt1681 = local151;
						if (arg0.anIntArray179[local151] > 0) {
							@Pc(235) Class4_Sub2 local235 = Static46.method876(arg0);
							@Pc(244) Class142 local244 = Static247.method4270(arg0.anIntArray179[local151] - 1);
							if (Static315.anInt1642 == 1 && local235.method258()) {
								if (arg0.anInt1830 != Static309.anInt6211 || local151 != Static165.anInt3377) {
									Static285.method4888(local151, Static243.aString186 + " -> <col=ff9040>" + local244.aString165, (long) local244.anInt4505, Static107.anInt6873, Static277.aString206, arg0.anInt1830, 51);
								}
							} else if (Static247.aBoolean436 && local235.method258()) {
								@Pc(592) Class4_Sub1_Sub21 local592 = Static81.anInt1731 == -1 ? null : Static98.method5502(Static81.anInt1731);
								if ((Static184.anInt4052 & 0x10) != 0 && (local592 == null || local244.method3729(local592.anInt6695, Static81.anInt1731) != local592.anInt6695)) {
									Static285.method4888(local151, Static195.aString145 + " -> <col=ff9040>" + local244.aString165, (long) local244.anInt4505, Static232.anInt4817, Static316.aString197, arg0.anInt1830, 59);
								}
							} else {
								@Pc(262) String[] local262 = local244.aStringArray37;
								@Pc(268) int local268;
								@Pc(283) byte local283;
								@Pc(289) int local289;
								if (local235.method258()) {
									for (local268 = 4; local268 >= 3; local268--) {
										if (local262 != null && local262[local268] != null) {
											if (local268 == 3) {
												local283 = 13;
											} else {
												local283 = 1;
											}
											local289 = -1;
											if (local268 == local244.anInt4456) {
												local289 = local244.anInt4489;
											}
											if (local244.anInt4503 == local268) {
												local289 = local244.anInt4494;
											}
											Static285.method4888(local151, "<col=ff9040>" + local244.aString165, (long) local244.anInt4505, local289, local262[local268], arg0.anInt1830, local283);
										}
									}
								}
								if (local235.method264()) {
									Static285.method4888(local151, "<col=ff9040>" + local244.aString165, (long) local244.anInt4505, Static107.anInt6873, Static277.aString206, arg0.anInt1830, 16);
								}
								if (local235.method258() && local262 != null) {
									for (local268 = 2; local268 >= 0; local268--) {
										if (local262[local268] != null) {
											local283 = 0;
											if (local268 == 0) {
												local283 = 15;
											}
											local289 = -1;
											if (local268 == 1) {
												local283 = 32;
											}
											if (local268 == local244.anInt4456) {
												local289 = local244.anInt4489;
											}
											if (local268 == 2) {
												local283 = 5;
											}
											if (local268 == local244.anInt4503) {
												local289 = local244.anInt4494;
											}
											Static285.method4888(local151, "<col=ff9040>" + local244.aString165, (long) local244.anInt4505, local289, local262[local268], arg0.anInt1830, local283);
										}
									}
								}
								local262 = arg0.aStringArray18;
								if (local262 != null) {
									for (local268 = 4; local268 >= 0; local268--) {
										if (local262[local268] != null) {
											local283 = 0;
											if (local268 == 0) {
												local283 = 41;
											}
											local289 = -1;
											if (local268 == 1) {
												local283 = 26;
											}
											if (local268 == 2) {
												local283 = 35;
											}
											if (local268 == 3) {
												local283 = 43;
											}
											if (local268 == 4) {
												local283 = 31;
											}
											if (local244.anInt4456 == local268) {
												local289 = local244.anInt4489;
											}
											if (local268 == local244.anInt4503) {
												local289 = local244.anInt4494;
											}
											Static285.method4888(local151, "<col=ff9040>" + local244.aString165, (long) local244.anInt4505, local289, local262[local268], arg0.anInt1830, local283);
										}
									}
								}
								Static285.method4888(local151, "<col=ff9040>" + local244.aString165, (long) local244.anInt4505, Static225.anInt4711, Static8.aString8, arg0.anInt1830, 1001);
							}
						}
					}
					local151++;
				}
			}
		}
		if (!arg0.aBoolean159) {
			return;
		}
		if (!Static247.aBoolean436) {
			@Pc(712) String local712;
			for (local151 = 9; local151 >= 5; local151--) {
				local712 = Static54.method1002(arg0, local151);
				if (local712 != null) {
					Static285.method4888(arg0.anInt1849, arg0.aString59, (long) (local151 + 1), Static203.method3611(local151, arg0), local712, arg0.anInt1830, 1006);
				}
			}
			local712 = Static226.method3893(arg0);
			if (local712 != null) {
				Static285.method4888(arg0.anInt1849, arg0.aString59, 0L, -1, local712, arg0.anInt1830, 4);
			}
			for (local157 = 4; local157 >= 0; local157--) {
				@Pc(771) String local771 = Static54.method1002(arg0, local157);
				if (local771 != null) {
					Static285.method4888(arg0.anInt1849, arg0.aString59, (long) (local157 + 1), Static203.method3611(local157, arg0), local771, arg0.anInt1830, 45);
				}
			}
			if (Static46.method876(arg0).method260()) {
				if (arg0.aString60 == null) {
					Static285.method4888(arg0.anInt1849, "", 0L, -1, Static347.aString250, arg0.anInt1830, 44);
				} else {
					Static285.method4888(arg0.anInt1849, "", 0L, -1, arg0.aString60, arg0.anInt1830, 44);
				}
				return;
			}
			return;
		}
		if (Static46.method876(arg0).method262() && (Static184.anInt4052 & 0x20) != 0) {
			Static285.method4888(arg0.anInt1849, Static195.aString145 + " -> " + arg0.aString59, 0L, Static232.anInt4817, Static316.aString197, arg0.anInt1830, 18);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z")
	public static boolean method1295(@OriginalArg(0) int arg0) {
		Static191.anInt4118 = arg0 + 1 & 0xFFFF;
		Static350.aBoolean591 = true;
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)Lclient!hi;")
	public static Class91 method1296(@OriginalArg(1) int arg0) {
		@Pc(10) Class91 local10 = (Class91) Static224.aClass154_72.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static345.aClass11_151.method288(arg0, 0);
		local10 = new Class91();
		if (local20 != null) {
			local10.method2095(new Class4_Sub7(local20));
		}
		local10.method2097();
		Static224.aClass154_72.method4221((long) arg0, local10);
		return local10;
	}
}
