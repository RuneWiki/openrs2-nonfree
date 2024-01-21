import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "Lclient!jb;")
	public static Class32 aClass32_2;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!db;")
	public static Class14 aClass14_3 = new Class14(4096);

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	public static int anInt850 = 0;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	public static int anInt851 = 0;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!hb;")
	private static Class27 aClass27_424 = Static87.method1648("Please contact customer support)3");

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "Lclient!hb;")
	public static Class27 aClass27_425 = Static87.method1648("::fpson");

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "Lclient!hb;")
	public static Class27 aClass27_426 = Static87.method1648("");

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "[I")
	public static int[] anIntArray158 = new int[100];

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_427 = aClass27_424;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method685() {
		for (@Pc(10) Class3_Sub9 local10 = (Class3_Sub9) Static40.aClass28_9.method884(); local10 != null; local10 = (Class3_Sub9) Static40.aClass28_9.method875()) {
			if (local10.aClass3_Sub1_Sub2_2 != null) {
				Static36.aClass3_Sub1_Sub1_1.method57(local10.aClass3_Sub1_Sub2_2);
				local10.aClass3_Sub1_Sub2_2 = null;
			}
			if (local10.aClass3_Sub1_Sub2_1 != null) {
				Static36.aClass3_Sub1_Sub1_1.method57(local10.aClass3_Sub1_Sub2_1);
				local10.aClass3_Sub1_Sub2_1 = null;
			}
		}
		Static40.aClass28_9.method891();
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method686() {
		@Pc(9) int local9 = Static42.anInt1234 * 128 + 64;
		@Pc(15) int local15 = Static46.anInt1259 * 128 + 64;
		@Pc(23) int local23 = Static48.method1675(local15, Static68.anInt1747, local9) - Static32.anInt808;
		if (Static75.anInt2122 < local23) {
			Static75.anInt2122 += (local23 - Static75.anInt2122) * Static41.anInt1220 / 1000 + Static36.anInt869;
			if (local23 < Static75.anInt2122) {
				Static75.anInt2122 = local23;
			}
		}
		if (local15 > Static45.anInt371) {
			Static45.anInt371 += Static36.anInt869 + (local15 - Static45.anInt371) * Static41.anInt1220 / 1000;
			if (local15 < Static45.anInt371) {
				Static45.anInt371 = local15;
			}
		}
		if (Static108.anInt2777 < local9) {
			Static108.anInt2777 += Static36.anInt869 + Static41.anInt1220 * (local9 - Static108.anInt2777) / 1000;
			if (Static108.anInt2777 > local9) {
				Static108.anInt2777 = local9;
			}
		}
		if (local23 < Static75.anInt2122) {
			Static75.anInt2122 -= Static36.anInt869 + (Static75.anInt2122 - local23) * Static41.anInt1220 / 1000;
			if (local23 > Static75.anInt2122) {
				Static75.anInt2122 = local23;
			}
		}
		if (local15 < Static45.anInt371) {
			Static45.anInt371 -= (Static45.anInt371 - local15) * Static41.anInt1220 / 1000 + Static36.anInt869;
			if (Static45.anInt371 < local15) {
				Static45.anInt371 = local15;
			}
		}
		if (local9 < Static108.anInt2777) {
			Static108.anInt2777 -= Static36.anInt869 + (Static108.anInt2777 - local9) * Static41.anInt1220 / 1000;
			if (local9 > Static108.anInt2777) {
				Static108.anInt2777 = local9;
			}
		}
		local15 = Static65.anInt1671 * 128 + 64;
		local9 = Static13.anInt772 * 128 + 64;
		local23 = Static48.method1675(local15, Static68.anInt1747, local9) - Static7.anInt177;
		@Pc(207) int local207 = local9 - Static108.anInt2777;
		@Pc(212) int local212 = local23 - Static75.anInt2122;
		@Pc(216) int local216 = local15 - Static45.anInt371;
		@Pc(227) int local227 = (int) Math.sqrt((double) (local207 * local207 + local216 * local216));
		@Pc(238) int local238 = (int) (Math.atan2((double) local212, (double) local227) * 325.949D) & 0x7FF;
		if (local238 < 128) {
			local238 = 128;
		}
		if (local238 > 383) {
			local238 = 383;
		}
		@Pc(261) int local261 = (int) (Math.atan2((double) local207, (double) local216) * -325.949D) & 0x7FF;
		@Pc(266) int local266 = local261 - Static86.anInt2328;
		if (Static81.anInt2195 < local238) {
			Static81.anInt2195 += Static57.anInt1498 + (local238 - Static81.anInt2195) * Static32.anInt807 / 1000;
			if (Static81.anInt2195 > local238) {
				Static81.anInt2195 = local238;
			}
		}
		if (Static81.anInt2195 > local238) {
			Static81.anInt2195 -= (Static81.anInt2195 - local238) * Static32.anInt807 / 1000 + Static57.anInt1498;
			if (Static81.anInt2195 < local238) {
				Static81.anInt2195 = local238;
			}
		}
		if (local266 > 1024) {
			local266 -= 2048;
		}
		if (local266 < -1024) {
			local266 += 2048;
		}
		if (local266 > 0) {
			Static86.anInt2328 += Static57.anInt1498 + Static32.anInt807 * local266 / 1000;
			Static86.anInt2328 &= 0x7FF;
		}
		if (local266 < 0) {
			Static86.anInt2328 -= -local266 * Static32.anInt807 / 1000 + Static57.anInt1498;
			Static86.anInt2328 &= 0x7FF;
		}
		@Pc(370) int local370 = local261 - Static86.anInt2328;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local266 > 0 || local370 > 0 && local266 < 0) {
			Static86.anInt2328 = local261;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!hb;BZLclient!hb;)V")
	public static void method687(@OriginalArg(0) Class27 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class27 arg2) {
		if (Static89.aBoolean121) {
			Static89.aBoolean121 = false;
			Static11.method1872();
			Static50.method985();
			Static18.method314();
			Static82.method1556();
			Static24.method480(Static61.anInt1554, Static88.aClass3_Sub3_Sub2_Sub1_2, Static76.anInt2134, Static34.anInt828);
			Static25.method489(Static34.anInt825, Static41.anInt1210 == -1, -1, Static91.anIntArray372);
			Static98.aBoolean125 = true;
			Static24.aBoolean35 = true;
			Static55.aBoolean74 = true;
		}
		@Pc(41) short local41 = 151;
		Static50.method978();
		@Pc(44) int local44 = local41 - 3;
		Static88.aClass3_Sub3_Sub2_Sub1_2.method603(arg0, 257, 148, 0);
		Static88.aClass3_Sub3_Sub2_Sub1_2.method603(arg0, 256, 147, 16777215);
		if (arg2 != null) {
			local44 += 15;
			if (arg1) {
				@Pc(74) int local74 = Static88.aClass3_Sub3_Sub2_Sub1_2.method606(arg2) + 4;
				Static95.method1322(257 - local74 / 2, 152, local74, 11, 0);
			}
			Static88.aClass3_Sub3_Sub2_Sub1_2.method603(arg2, 257, 163, 0);
			Static88.aClass3_Sub3_Sub2_Sub1_2.method603(arg2, 256, 162, 16777215);
		}
		Static31.method662();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I")
	public static int method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!m;B)V")
	public static void method690(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		@Pc(8) int local8 = arg0.anInt1601;
		@Pc(79) int local79;
		if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
			if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
				if (local8 > 800) {
					local8 -= 701;
				} else {
					local8 -= 101;
				}
				local79 = Static43.anInt1241;
				if (Static90.anInt2496 != 2) {
					local79 = 0;
				}
				if (local8 >= local79) {
					arg0.anInt1594 = 0;
					arg0.aClass27_788 = Static45.aClass27_182;
				} else {
					if (Static22.anIntArray116[local8] == 0) {
						arg0.aClass27_788 = Static98.method1779(new Class27[] { Static79.aClass27_407, Static55.aClass27_709 });
					} else if (Static22.anIntArray116[local8] < 5000) {
						if (Static72.anInt1911 == Static22.anIntArray116[local8]) {
							arg0.aClass27_788 = Static98.method1779(new Class27[] { Static92.aClass27_1211, Static3.aClass27_36, Static97.method1616(Static22.anIntArray116[local8]) });
						} else {
							arg0.aClass27_788 = Static98.method1779(new Class27[] { Static85.aClass27_1086, Static3.aClass27_36, Static97.method1616(Static22.anIntArray116[local8]) });
						}
					} else if (Static22.anIntArray116[local8] == Static72.anInt1911) {
						arg0.aClass27_788 = Static98.method1779(new Class27[] { Static92.aClass27_1211, Static99.aClass27_1256, Static97.method1616(Static22.anIntArray116[local8] - 5000) });
					} else {
						arg0.aClass27_788 = Static98.method1779(new Class27[] { Static85.aClass27_1086, Static99.aClass27_1256, Static97.method1616(Static22.anIntArray116[local8] - 5000) });
					}
					arg0.anInt1594 = 1;
				}
			} else if (local8 == 203) {
				local79 = Static43.anInt1241;
				if (Static90.anInt2496 != 2) {
					local79 = 0;
				}
				arg0.anInt1611 = local79 * 15 + 20;
				if (arg0.anInt1611 <= arg0.anInt1579) {
					arg0.anInt1611 = arg0.anInt1579 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static90.anInt2496 == 0) {
					arg0.aClass27_788 = Static74.aClass27_968;
					arg0.anInt1594 = 0;
				} else if (local8 == 1 && Static90.anInt2496 == 0) {
					arg0.aClass27_788 = Static24.aClass27_323;
					arg0.anInt1594 = 0;
				} else {
					local79 = Static38.anInt910;
					if (Static90.anInt2496 == 0) {
						local79 = 0;
					}
					if (local8 >= local79) {
						arg0.aClass27_788 = Static45.aClass27_182;
						arg0.anInt1594 = 0;
					} else {
						arg0.aClass27_788 = Static38.method712(Static45.aLongArray5[local8]).method746();
						arg0.anInt1594 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt1611 = Static38.anInt910 * 15 + 20;
				if (arg0.anInt1611 <= arg0.anInt1579) {
					arg0.anInt1611 = arg0.anInt1579 + 1;
				}
			} else if (local8 == 327) {
				arg0.anInt1613 = 150;
				arg0.anInt1606 = (int) (Math.sin((double) Static2.anInt38 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1615 = 5;
				arg0.anInt1607 = 0;
			} else if (local8 == 324) {
				if (Static102.anInt2660 == -1) {
					Static102.anInt2660 = arg0.anInt1600;
					Static39.anInt955 = arg0.anInt1580;
				}
				if (Static81.aClass15_1.aBoolean28) {
					arg0.anInt1600 = Static102.anInt2660;
				} else {
					arg0.anInt1600 = Static39.anInt955;
				}
			} else if (local8 == 325) {
				if (Static102.anInt2660 == -1) {
					Static102.anInt2660 = arg0.anInt1600;
					Static39.anInt955 = arg0.anInt1580;
				}
				if (Static81.aClass15_1.aBoolean28) {
					arg0.anInt1600 = Static39.anInt955;
				} else {
					arg0.anInt1600 = Static102.anInt2660;
				}
			} else if (local8 == 600) {
				arg0.aClass27_788 = Static98.method1779(new Class27[] { Static45.aClass27_178, Static24.aClass27_322 });
			} else if (local8 == 620) {
				if (Static45.anInt345 < 1) {
					arg0.aClass27_788 = Static45.aClass27_182;
				} else if (Static13.aBoolean41) {
					arg0.aClass27_788 = Static67.aClass27_848;
					arg0.anInt1620 = 16711680;
				} else {
					arg0.anInt1620 = 16777215;
					arg0.aClass27_788 = Static71.aClass27_903;
				}
			}
		} else if (local8 == 1 && Static90.anInt2496 == 0) {
			arg0.anInt1594 = 0;
			arg0.aClass27_788 = Static71.aClass27_898;
		} else if (local8 == 1 && Static90.anInt2496 == 1) {
			arg0.aClass27_788 = Static81.aClass27_1047;
			arg0.anInt1594 = 0;
		} else if (local8 == 2 && Static90.anInt2496 != 2) {
			arg0.aClass27_788 = Static24.aClass27_323;
			arg0.anInt1594 = 0;
		} else {
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local79 = Static43.anInt1241;
			if (Static90.anInt2496 != 2) {
				local79 = 0;
			}
			if (local79 <= local8) {
				arg0.anInt1594 = 0;
				arg0.aClass27_788 = Static45.aClass27_182;
			} else {
				arg0.aClass27_788 = Static46.aClass27Array5[local8];
				arg0.anInt1594 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method691() {
		anIntArray157 = null;
		anIntArray158 = null;
		aClass27_425 = null;
		aClass14_3 = null;
		aClass27_424 = null;
		aClass32_2 = null;
		aClass27_426 = null;
		aClass27_427 = null;
	}
}
