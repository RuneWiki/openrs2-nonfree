import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_158 = new Class349(93, 6);

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public static int anInt9302 = 0;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
	public static boolean aBoolean771 = false;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
	public static boolean aBoolean772 = false;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method7432(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static539.method7064();
		Static327.method4753();
		Static8.method174();
		Static483.method6232(arg1, arg0);
		Static483.method6230();
		Static323.method4695(Static417.aClass162_17);
		Static47.method842(Static417.aClass162_17);
		Static217.method2656(Static241.aClass229_54, Static417.aClass162_17);
		Static238.method3428();
		Static328.method4756(Static331.aClass38Array18);
		Static549.method7175();
		Static514.method6643();
		if (Static540.anInt8912 == 3) {
			Static115.method1686(4);
		} else if (Static540.anInt8912 == 7) {
			Static115.method1686(8);
		} else if (Static540.anInt8912 == 10) {
			Static115.method1686(11);
		} else if (Static540.anInt8912 == 1 || Static540.anInt8912 == 2) {
			Static33.method557();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI[IIIII)Z")
	public static boolean method7434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 > Static457.anInt7352) {
			arg0 = Static457.anInt7352;
		}
		if (arg0 <= arg1) {
			return true;
		}
		arg3 += arg1 - 1;
		@Pc(44) int local44 = arg0 - arg1 >> 2;
		arg5 += arg4 * arg1;
		@Pc(61) int local61;
		@Pc(71) int local71;
		if (Static487.anInt7739 == 1) {
			Static427.anInt6937 += local44;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg0 - arg1 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg3++;
						if (arg2[arg3] > arg5) {
							arg2[arg3] = arg5;
						}
						arg5 += arg4;
					}
				}
				local61 = arg3 + 1;
				if (arg5 < arg2[local61]) {
					arg2[local61] = arg5;
				}
				local71 = arg5 + arg4;
				local61++;
				if (arg2[local61] > local71) {
					arg2[local61] = local71;
				}
				local71 += arg4;
				local61++;
				if (arg2[local61] > local71) {
					arg2[local61] = local71;
				}
				local71 += arg4;
				arg3 = local61 + 1;
				if (arg2[arg3] > local71) {
					arg2[arg3] = local71;
				}
				arg5 = local71 + arg4;
			}
		} else {
			arg5 -= 38400;
			while (true) {
				local44--;
				if (local44 < 0) {
					local44 = arg0 - arg1 & 0x3;
					while (true) {
						local44--;
						if (local44 < 0) {
							return true;
						}
						arg3++;
						if (arg2[arg3] > arg5) {
							return false;
						}
						arg5 += arg4;
					}
				}
				local61 = arg3 + 1;
				if (arg2[local61] > arg5) {
					return false;
				}
				local71 = arg5 + arg4;
				local61++;
				if (arg2[local61] > local71) {
					return false;
				}
				local71 += arg4;
				local61++;
				if (local71 < arg2[local61]) {
					return false;
				}
				local71 += arg4;
				arg3 = local61 + 1;
				if (local71 < arg2[arg3]) {
					return false;
				}
				arg5 = local71 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method7435(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) String arg7) {
		@Pc(9) Class243 local9 = Static40.aClass243Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static40.aClass243Array1[local11] = Static40.aClass243Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class243(arg4, arg1, arg7, arg2, arg0, arg6, arg3, arg5);
		} else {
			local9.method5139(arg3, arg4, arg7, arg5, arg0, arg6, arg2, arg1);
		}
		Static487.anInt7732 = Static390.anInt6454;
		Static255.anInt4255++;
		Static40.aClass243Array1[0] = local9;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)V")
	public static void method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg2 + Static485.anInt7725;
		@Pc(15) int local15 = arg1 + Static310.anInt5129;
		if (Static469.aClass228ArrayArrayArray6 == null || arg2 < 0 || arg1 < 0 || Static281.anInt4822 <= arg2 || arg1 >= Static29.anInt491 || !Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 != arg0) {
			return;
		}
		@Pc(60) long local60 = (long) (local10 | arg0 << 28 | local15 << 14);
		@Pc(66) Class2_Sub6 local66 = (Class2_Sub6) Static531.aClass90_39.method1685(local60);
		if (local66 == null) {
			Static210.method2581(arg0, arg2, arg1);
			return;
		}
		@Pc(80) Class2_Sub32 local80 = (Class2_Sub32) local66.aClass70_1.method1264();
		if (local80 == null) {
			Static210.method2581(arg0, arg2, arg1);
			return;
		}
		@Pc(99) Class12_Sub2_Sub3_Sub1 local99 = (Class12_Sub2_Sub3_Sub1) Static210.method2581(arg0, arg2, arg1);
		if (local99 == null) {
			local99 = new Class12_Sub2_Sub3_Sub1(arg2 << 9, Static114.aClass151Array1[arg0].method7676(arg1, arg2), arg1 << 9, arg0, arg0);
		} else {
			local99.anInt2217 = local99.anInt2222 = -1;
		}
		local99.anInt2214 = local80.anInt5953;
		local99.anInt2230 = local80.anInt5954;
		label56: while (true) {
			@Pc(142) Class2_Sub32 local142 = (Class2_Sub32) local66.aClass70_1.method1261();
			if (local142 == null) {
				break;
			}
			if (local142.anInt5953 != local99.anInt2214) {
				local99.anInt2217 = local142.anInt5953;
				local99.anInt2213 = local142.anInt5954;
				while (true) {
					@Pc(163) Class2_Sub32 local163 = (Class2_Sub32) local66.aClass70_1.method1261();
					if (local163 == null) {
						break label56;
					}
					if (local99.anInt2214 != local163.anInt5953 && local163.anInt5953 != local99.anInt2217) {
						local99.anInt2222 = local163.anInt5953;
						local99.anInt2225 = local163.anInt5954;
					}
				}
			}
		}
		@Pc(207) int local207 = Static24.method347((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		local99.aByte128 = (byte) arg0;
		local99.anInt2232 = 0;
		local99.aByte127 = (byte) arg0;
		local99.anInt9374 = arg2 << 9;
		local99.anInt9373 = local207;
		local99.anInt9375 = arg1 << 9;
		if (Static562.method7350(arg2, arg1)) {
			local99.aByte127++;
		}
		Static438.method5749(arg0, arg2, arg1, local207, local99);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 + arg5 > arg0 && arg5 < arg0 + arg2) {
			return arg6 < arg3 + arg4 && arg3 < arg1 + arg6;
		} else {
			return false;
		}
	}
}
