import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
	public static boolean aBoolean429;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_162 = new Class221(74, 12);

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "[Lclient!ml;")
	public static final Class135[] aClass135Array1 = new Class135[50];

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!bl;")
	public static Class26 aClass26_7 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIBII)V")
	public static void method4192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg3 + arg0;
		@Pc(19) int local19 = arg1 - arg3;
		for (@Pc(21) int local21 = arg0; local21 < local14; local21++) {
			Static115.method2278(Static364.anIntArrayArray57[local21], arg6, arg2, arg5);
		}
		@Pc(40) int local40 = arg6 - arg3;
		for (@Pc(42) int local42 = arg1; local42 > local19; local42--) {
			Static115.method2278(Static364.anIntArrayArray57[local42], arg6, arg2, arg5);
		}
		@Pc(65) int local65 = arg5 + arg3;
		for (@Pc(67) int local67 = local14; local67 <= local19; local67++) {
			@Pc(73) int[] local73 = Static364.anIntArrayArray57[local67];
			Static115.method2278(local73, local65, arg2, arg5);
			Static115.method2278(local73, local40, arg4, local65);
			Static115.method2278(local73, arg6, arg2, local40);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method4193() {
		if (Static48.anInt4159 != -1) {
			Static273.method4729(Static48.anInt4159, false, -1, -1);
			Static48.anInt4159 = -1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!wn;B)V")
	public static void method4194(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub2 arg1) {
		if (Static225.anInt4918 >= 400) {
			return;
		}
		@Pc(16) Class139 local16 = arg1.aClass139_1;
		if (local16.anIntArray350 != null) {
			local16 = local16.method4120();
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean415) {
			return;
		}
		@Pc(33) String local33 = local16.aString45;
		if (local16.anInt4779 != 0) {
			@Pc(49) String local49 = Static13.aClass172_1 == Static150.aClass172_3 ? Static166.aClass140_90.method4155(Static239.anInt2803) : Static171.aClass140_92.method4155(Static239.anInt2803);
			local33 = local33 + Static334.method5450(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388, local16.anInt4779) + " (" + local49 + local16.anInt4779 + ")";
		}
		if (!Static60.aBoolean109) {
			if (!arg0) {
				@Pc(79) String[] local79 = local16.aStringArray32;
				if (Static361.aBoolean610) {
					local79 = Static139.method2702(local79);
				}
				@Pc(89) int local89;
				if (local79 != null) {
					for (local89 = 4; local89 >= 0; local89--) {
						if (local79[local89] != null && (Static30.aClass172_2 != Static13.aClass172_1 || !local79[local89].equalsIgnoreCase(Static243.aClass140_122.method4155(Static239.anInt2803)))) {
							@Pc(109) byte local109 = 0;
							if (local89 == 0) {
								local109 = 8;
							}
							@Pc(118) int local118 = Static189.anInt4126;
							if (local89 == 1) {
								local109 = 30;
							}
							if (local89 == 2) {
								local109 = 6;
							}
							if (local89 == 3) {
								local109 = 13;
							}
							if (local89 == 4) {
								local109 = 47;
							}
							if (local89 == local16.anInt4798) {
								local118 = local16.anInt4789;
							}
							if (local89 == local16.anInt4777) {
								local118 = local16.anInt4802;
							}
							Static104.method2071(0, local109, 0, false, local79[local89], "<col=ffff00>" + local33, local118, (long) arg1.anInt6896, true);
						}
					}
				}
				if (Static13.aClass172_1 == Static30.aClass172_2 && local79 != null) {
					for (local89 = 4; local89 >= 0; local89--) {
						if (local79[local89] != null && local79[local89].equalsIgnoreCase(Static243.aClass140_122.method4155(Static239.anInt2803))) {
							@Pc(219) short local219 = 0;
							if (local16.anInt4779 > Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388) {
								local219 = 2000;
							}
							@Pc(232) short local232 = 0;
							if (local89 == 0) {
								local232 = 8;
							}
							if (local89 == 1) {
								local232 = 30;
							}
							if (local89 == 2) {
								local232 = 6;
							}
							if (local89 == 3) {
								local232 = 13;
							}
							if (local89 == 4) {
								local232 = 47;
							}
							if (local232 != 0) {
								local232 += local219;
							}
							Static104.method2071(0, local232, 0, false, local79[local89], "<col=ffff00>" + local33, local16.anInt4793, (long) arg1.anInt6896, true);
						}
					}
				}
			}
			Static104.method2071(0, 1003, 0, arg0, Static341.aClass140_11.method4155(Static239.anInt2803), "<col=ffff00>" + local33, Static176.anInt3967, (long) arg1.anInt6896, true);
		} else if (!arg0) {
			@Pc(342) Class2_Sub9_Sub15 local342 = Static134.anInt2876 == -1 ? null : Static176.method3422(Static134.anInt2876);
			if ((Static7.anInt142 & 0x2) != 0) {
				if (local342 == null || local16.method4124(local342.anInt4464, Static134.anInt2876) != local342.anInt4464) {
					Static104.method2071(0, 50, 0, false, Static295.aString63, Static228.aString46 + " -> <col=ffff00>" + local33, Static333.anInt6459, (long) arg1.anInt6896, true);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method4196() {
		Static41.aClass107_40.method3015();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)I")
	public static int method4197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26 = 65536 - Class101.anIntArray235[arg0 * 8192 / arg1] >> 1;
		return (arg2 * (65536 - local26) >> 16) + (local26 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(CZ)Z")
	public static boolean method4198(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method4199() {
		if (Static288.aClass88_2 != null) {
			Static288.aClass88_2.method2712();
		}
		if (Static77.aClass88_1 != null) {
			Static77.aClass88_1.method2712();
		}
		Static133.method2576(Static145.aBoolean285);
		Static288.aClass88_2 = Static77.method1590(0, Static95.aCanvas3, Static62.aClass179_2, 22050);
		Static288.aClass88_2.method2714(Static159.aClass2_Sub11_Sub1_4);
		Static77.aClass88_1 = Static77.method1590(1, Static95.aCanvas3, Static62.aClass179_2, 2048);
		Static77.aClass88_1.method2714(Static31.aClass2_Sub11_Sub3_1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!iq;I)I")
	public static int method4201(@OriginalArg(0) Class104 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2755(Static128.anInt2761)) {
			local5++;
		}
		if (arg0.method2755(Static224.anInt6535)) {
			local5++;
		}
		if (arg0.method2755(Static160.anInt3748)) {
			local5++;
		}
		if (arg0.method2755(Static275.anInt5639)) {
			local5++;
		}
		if (arg0.method2755(Static108.anInt2250)) {
			local5++;
		}
		if (arg0.method2755(Static123.anInt2609)) {
			local5++;
		}
		if (arg0.method2755(Static9.anInt175)) {
			local5++;
		}
		if (arg0.method2755(Static74.anInt3608)) {
			local5++;
		}
		if (arg0.method2755(Static152.anInt3474)) {
			local5++;
		}
		if (arg0.method2755(Static121.anInt2556)) {
			local5++;
		}
		if (arg0.method2755(Static101.anInt2079)) {
			local5++;
		}
		if (arg0.method2755(Static133.anInt2846)) {
			local5++;
		}
		if (arg0.method2755(Static36.anInt552)) {
			local5++;
		}
		if (arg0.method2755(Static300.anInt5976)) {
			local5++;
		}
		if (arg0.method2755(Static162.anInt3756)) {
			local5++;
		}
		if (arg0.method2755(Static112.anInt2360)) {
			local5++;
		}
		return local5;
	}
}
