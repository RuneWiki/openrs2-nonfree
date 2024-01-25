import java.awt.Color;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!ul;")
	public static Class246 aClass246_24;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static final int anInt653 = 0;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_25 = new Class107(68, 6);

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!gu;")
	public static final Class96 aClass96_9 = new Class96(16);

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method600() {
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("availableProcessors");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Integer local34 = (Integer) local24.invoke(local28, (Object[]) null);
					Static71.anInt3035 = local34;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!wq;B)V")
	public static void method603(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class31_Sub2_Sub1_Sub2 arg1) {
		if (Static217.anInt4004 >= 400) {
			return;
		}
		@Pc(20) Class53 local20 = arg1.aClass53_1;
		if (local20.anIntArray131 != null) {
			local20 = local20.method1508(Static394.aClass23_1);
			if (local20 == null) {
				return;
			}
		}
		if (!local20.aBoolean95) {
			return;
		}
		@Pc(38) String local38 = local20.aString12;
		if (local20.anInt1734 != 0) {
			@Pc(57) String local57 = Static147.aClass61_4 == Static337.aClass61_5 ? Static432.aClass7_152.method331(Static341.anInt5770) : Static46.aClass7_23.method331(Static341.anInt5770);
			local38 = local38 + Static75.method1501(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289, local20.anInt1734) + " (" + local57 + local20.anInt1734 + ")";
		}
		if (!Static355.aBoolean412) {
			if (!arg0) {
				@Pc(87) String[] local87 = local20.aStringArray11;
				if (Static437.aBoolean278) {
					local87 = Static409.method5475(local87);
				}
				@Pc(97) int local97;
				if (local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && (local20.aByte35 == 0 || !local87[local97].equalsIgnoreCase(Static276.aClass7_114.method331(Static341.anInt5770)))) {
							@Pc(120) byte local120 = 0;
							if (local97 == 0) {
								local120 = 44;
							}
							@Pc(129) int local129 = Static145.anInt2797;
							if (local97 == 1) {
								local120 = 9;
							}
							if (local97 == 2) {
								local120 = 19;
							}
							if (local97 == 3) {
								local120 = 16;
							}
							if (local20.anInt1701 == local97) {
								local129 = local20.anInt1711;
							}
							if (local97 == 4) {
								local120 = 12;
							}
							if (local20.anInt1712 == local97) {
								local129 = local20.anInt1700;
							}
							Static373.method5165(-1, "<col=ffff00>" + local38, 0, 0, true, local120, false, local87[local97], local129, (long) arg1.anInt7301);
						}
					}
				}
				if (local20.aByte35 == 1 && local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && local87[local97].equalsIgnoreCase(Static276.aClass7_114.method331(Static341.anInt5770))) {
							@Pc(228) short local228 = 0;
							if (local20.anInt1734 > Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289) {
								local228 = 2000;
							}
							@Pc(237) short local237 = 0;
							if (local97 == 0) {
								local237 = 44;
							}
							if (local97 == 1) {
								local237 = 9;
							}
							if (local97 == 2) {
								local237 = 19;
							}
							if (local97 == 3) {
								local237 = 16;
							}
							if (local97 == 4) {
								local237 = 12;
							}
							if (local237 != 0) {
								local237 += local228;
							}
							Static373.method5165(-1, "<col=ffff00>" + local38, 0, 0, true, local237, false, local87[local97], local20.anInt1718, (long) arg1.anInt7301);
						}
					}
				}
			}
			Static373.method5165(-1, "<col=ffff00>" + local38, 0, 0, true, 1006, arg0, Static256.aClass7_107.method331(Static341.anInt5770), Static138.anInt6310, (long) arg1.anInt7301);
		} else if (!arg0) {
			@Pc(352) Class184 local352 = Static161.anInt3018 == -1 ? null : Static400.aClass35_2.method867(Static161.anInt3018);
			if ((Static410.anInt6626 & 0x2) != 0) {
				if (local352 == null || local20.method1507(local352.anInt5018, Static161.anInt3018) != local352.anInt5018) {
					Static373.method5165(-1, Static289.aString63 + " -> <col=ffff00>" + local38, 0, 0, true, 25, false, Static139.aString22, Static347.anInt5821, (long) arg1.anInt7301);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ya;IIIII)Lclient!t;")
	public static Class105 method604(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14 = (long) arg2;
		@Pc(20) Class105 local20 = (Class105) Static80.aClass134_14.method3266(local14);
		if (local20 == null) {
			@Pc(30) Class236 local30 = Static74.method1492(arg2, Static144.aClass246_86);
			if (local30 == null) {
				return null;
			}
			if (local30.anInt6297 < 13) {
				local30.method5247();
			}
			local20 = arg1.method4540(local30, 2055, Static4.anInt113, 64, 768);
			Static80.aClass134_14.method3263(local14, local20);
		}
		local20 = local20.method3548((byte) 2, 2055, true);
		if (arg5 != 0) {
			local20.Q(arg5);
		}
		if (arg3 != 0) {
			local20.Z(arg3);
		}
		if (arg0 != 0) {
			local20.R(arg0);
		}
		if (arg4 != 0) {
			local20.JA(0, arg4, 0);
		}
		return local20;
	}
}
