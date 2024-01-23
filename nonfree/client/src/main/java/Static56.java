import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lclient!wm;")
	public static Class3_Sub4_Sub24 aClass3_Sub4_Sub24_3;

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "Lclient!rn;")
	public static Class155 aClass155_29;

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "[I")
	public static int[] anIntArray99 = new int[500];

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "[I")
	public static int[] anIntArray100 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!me;IIIIIIZ)V")
	public static void method913(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray376.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray376[local5] - Static282.anInt5668;
			local22 = arg0.anIntArray371[local5] - Static112.anInt5733;
			local29 = arg0.anIntArray381[local5] - Static104.anInt1924;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray372 != null) {
				Static169.anIntArray369[local5] = local39;
				Static169.anIntArray379[local5] = local61;
				Static169.anIntArray382[local5] = local71;
			}
			Static169.anIntArray373[local5] = Static16.anInt325 + (local39 << 9) / local71;
			Static169.anIntArray383[local5] = Static16.anInt324 + (local61 << 9) / local71;
		}
		Static16.anInt321 = 0;
		local3 = arg0.anIntArray377.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray377[local5];
			local22 = arg0.anIntArray378[local5];
			local29 = arg0.anIntArray380[local5];
			local39 = Static169.anIntArray373[local15];
			@Pc(148) int local148 = Static169.anIntArray373[local22];
			@Pc(152) int local152 = Static169.anIntArray373[local29];
			@Pc(156) int local156 = Static169.anIntArray383[local15];
			@Pc(160) int local160 = Static169.anIntArray383[local22];
			@Pc(164) int local164 = Static169.anIntArray383[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static5.aBoolean8 && Static302.method4882(Static2.anInt34 + Static16.anInt325, Static278.anInt5067 + Static16.anInt324, local156, local160, local164, local39, local148, local152)) {
					Static115.anInt2150 = arg5;
					Static76.anInt1448 = arg6;
				}
				if (!Static283.aBoolean393 && !arg7) {
					Static16.aBoolean26 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static16.anInt322 || local148 > Static16.anInt322 || local152 > Static16.anInt322) {
						Static16.aBoolean26 = true;
					}
					if (arg0.anIntArray372 == null || arg0.anIntArray372[local5] == -1) {
						if (arg0.anIntArray374[local5] != 12345678) {
							Static16.method283(local156, local160, local164, local39, local148, local152, arg0.anIntArray374[local5], arg0.anIntArray370[local5], arg0.anIntArray375[local5]);
						}
					} else if (!Static241.aBoolean341) {
						@Pc(373) int local373 = Static16.anInterface4_1.method2906(arg0.anIntArray372[local5]);
						Static16.method283(local156, local160, local164, local39, local148, local152, Static59.method967(local373, arg0.anIntArray374[local5]), Static59.method967(local373, arg0.anIntArray370[local5]), Static59.method967(local373, arg0.anIntArray375[local5]));
					} else if (arg0.aBoolean229) {
						Static16.method287(local156, local160, local164, local39, local148, local152, arg0.anIntArray374[local5], arg0.anIntArray370[local5], arg0.anIntArray375[local5], Static169.anIntArray369[0], Static169.anIntArray369[1], Static169.anIntArray369[3], Static169.anIntArray379[0], Static169.anIntArray379[1], Static169.anIntArray379[3], Static169.anIntArray382[0], Static169.anIntArray382[1], Static169.anIntArray382[3], arg0.anIntArray372[local5]);
					} else {
						Static16.method287(local156, local160, local164, local39, local148, local152, arg0.anIntArray374[local5], arg0.anIntArray370[local5], arg0.anIntArray375[local5], Static169.anIntArray369[local15], Static169.anIntArray369[local22], Static169.anIntArray369[local29], Static169.anIntArray379[local15], Static169.anIntArray379[local22], Static169.anIntArray379[local29], Static169.anIntArray382[local15], Static169.anIntArray382[local22], Static169.anIntArray382[local29], arg0.anIntArray372[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Lclient!ga;")
	public static Class59 method914(@OriginalArg(1) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static175.aClass98_27.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static138.aClass155_57.method4121(29, arg0);
		local10 = new Class59();
		if (local21 != null) {
			local10.method1358(arg0, new Class3_Sub26(local21));
		}
		Static175.aClass98_27.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(III)J")
	public static long method917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass13_1 == null ? 0L : local7.aClass13_1.aLong15;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!rn;Lclient!rn;)V")
	public static void method918(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class155 arg1) {
		Static25.aClass3_Sub4_Sub2_4 = Static219.method3606(Static15.anInt4211, arg1, arg0);
		if (Static283.aBoolean393) {
			Static175.aClass3_Sub4_Sub2_Sub2_1 = Static139.method2893(arg0, arg1, Static15.anInt4211);
		} else {
			Static175.aClass3_Sub4_Sub2_Sub2_1 = (Class3_Sub4_Sub2_Sub2) Static25.aClass3_Sub4_Sub2_4;
		}
		Static248.aClass3_Sub4_Sub2_11 = Static219.method3606(Static269.anInt5495, arg1, arg0);
		Static224.aClass3_Sub4_Sub2_14 = Static219.method3606(Static145.anInt2764, arg1, arg0);
	}
}
