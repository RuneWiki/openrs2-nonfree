import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Lclient!q;")
	public static final Class79 aClass79_10 = new Class79(50);

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1221 = Static151.method2243("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1217 = aClass62_1221;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1218 = Static151.method2243(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1222 = Static151.method2243("To create a new account you need to");

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1219 = aClass62_1222;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1220 = Static151.method2243(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1223 = Static151.method2243("<img=1>");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method2384(@OriginalArg(0) Class71 arg0) {
		Static135.aClass71_27 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method2385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg3 - arg4;
		@Pc(20) int local20 = arg6 - arg0;
		@Pc(28) int local28 = (arg7 - arg1 << 16) / local15;
		@Pc(37) int local37 = (arg5 - arg2 << 16) / local20;
		if (Static173.anInt3686 > arg3) {
			local15++;
		}
		if (arg6 < Static104.anInt2340) {
			local20++;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(91) int local91;
		@Pc(117) int local117;
		@Pc(125) int local125;
		for (@Pc(51) int local51 = 0; local51 < local15; local51++) {
			local59 = local51 * local28 >> 16;
			local67 = local28 * (local51 + 1) >> 16;
			local72 = local67 - local59;
			if (local72 > 0) {
				local67 += arg1;
				local59 += arg1;
				local91 = arg4 + local51 >> 6;
				@Pc(95) int[][] local95 = Static46.anIntArrayArrayArray2[local91];
				@Pc(99) byte[][] local99 = Static139.aByteArrayArrayArray12[local91];
				@Pc(103) byte[][] local103 = Static42.aByteArrayArrayArray18[local91];
				@Pc(107) byte[][] local107 = Static29.aByteArrayArrayArray4[local91];
				@Pc(111) byte[][] local111 = Static68.aByteArrayArrayArray10[local91];
				@Pc(115) byte[][] local115 = Static20.aByteArrayArrayArray3[local91];
				for (local117 = 0; local117 < local20; local117++) {
					local125 = local37 * local117 >> 16;
					@Pc(133) int local133 = (local117 + 1) * local37 >> 16;
					@Pc(138) int local138 = local133 - local125;
					if (local138 > 0) {
						local133 += arg2;
						@Pc(153) int local153 = arg0 + local117 >> 6;
						local125 += arg2;
						@Pc(164) int local164 = local117 + arg0 & 0x3F;
						@Pc(171) int local171 = local51 + arg4 & 0x3F;
						@Pc(177) int local177 = local171 + (local164 << 6);
						@Pc(211) int local211;
						@Pc(193) int local193;
						@Pc(187) int local187;
						if (local95[local153] == null) {
							local187 = local117 + arg0 & 0x4;
							local193 = arg4 + local51 & 0x4;
							if ((local193 >= 2 || local187 <= 2) && (local193 <= 2 || local187 >= 2)) {
								local211 = Static191.anIntArray364[Static40.anInt964 + 1];
							} else {
								local211 = 4936552;
							}
						} else {
							local211 = local95[local153][local177];
						}
						local193 = local99[local153] == null ? 0 : Static191.anIntArray364[local99[local153][local177] & 0xFF];
						local187 = local107[local153] == null ? 0 : Static191.anIntArray364[local107[local153][local177] & 0xFF];
						@Pc(293) int local293;
						if (local193 == 0 && local187 == 0) {
							Static212.method3103(local59, local125, local72, local138, local211);
						} else {
							@Pc(289) byte local289;
							if (local193 != 0) {
								if (local193 == -1) {
									local193 = 1;
								}
								local289 = local115[local153] == null ? 0 : local115[local153][local177];
								local293 = local289 & 0xFC;
								if (local293 == 0 || local72 <= 1 || local138 <= 1) {
									Static212.method3103(local59, local125, local72, local138, local193);
								} else {
									Static23.method421(local211, local289 & 0x3, local138, true, Static212.anIntArray398, local59, local293 >> 2, local72, local193, local125);
								}
							}
							if (local187 != 0) {
								local289 = local103[local153][local177];
								if (local187 == -1) {
									local187 = local211;
								}
								local293 = local289 & 0xFC;
								if (local293 == 0 || local72 <= 1 || local138 <= 1) {
									Static212.method3103(local59, local125, local72, local138, local187);
								}
								Static23.method421(0, local289 & 0x3, local138, local193 == 0, Static212.anIntArray398, local59, local293 >> 2, local72, local187, local125);
							}
						}
						if (local111[local153] != null) {
							@Pc(406) int local406 = local111[local153][local177] & 0xFF;
							if (local406 != 0) {
								if (local72 == 1) {
									local293 = local59;
								} else {
									local293 = local67 - 1;
								}
								@Pc(428) int local428;
								if (local138 == 1) {
									local428 = local125;
								} else {
									local428 = local133 - 1;
								}
								@Pc(434) int local434 = 13421772;
								if (local406 >= 5 && local406 <= 8 || local406 >= 13 && local406 <= 16 || local406 >= 21 && local406 <= 24 || local406 == 27 || local406 == 28) {
									local406 -= 4;
									local434 = 13369344;
								}
								if (local406 == 1) {
									Static212.method3107(local59, local125, local138, local434);
								} else if (local406 == 2) {
									Static212.method3090(local59, local125, local72, local434);
								} else if (local406 == 3) {
									Static212.method3107(local293, local125, local138, local434);
								} else if (local406 == 4) {
									Static212.method3090(local59, local428, local72, local434);
								} else if (local406 == 9) {
									Static212.method3107(local59, local125, local138, 16777215);
									Static212.method3090(local59, local125, local72, local434);
								} else if (local406 == 10) {
									Static212.method3107(local293, local125, local138, 16777215);
									Static212.method3090(local59, local125, local72, local434);
								} else if (local406 == 11) {
									Static212.method3107(local293, local125, local138, 16777215);
									Static212.method3090(local59, local428, local72, local434);
								} else if (local406 == 12) {
									Static212.method3107(local59, local125, local138, 16777215);
									Static212.method3090(local59, local428, local72, local434);
								} else if (local406 == 17) {
									Static212.method3090(local59, local125, 1, local434);
								} else if (local406 == 18) {
									Static212.method3090(local293, local125, 1, local434);
								} else if (local406 == 19) {
									Static212.method3090(local293, local428, 1, local434);
								} else if (local406 == 20) {
									Static212.method3090(local59, local428, 1, local434);
								} else {
									@Pc(581) int local581;
									if (local406 == 25) {
										for (local581 = 0; local581 < local138; local581++) {
											Static212.method3090(local581 + local59, -local581 + local428, 1, local434);
										}
									} else if (local406 == 26) {
										for (local581 = 0; local581 < local138; local581++) {
											Static212.method3090(local59 + local581, local125 - -local581, 1, local434);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local59 = 0; local59 < local15; local59++) {
			local72 = local28 * (local59 + 1) >> 16;
			local67 = local28 * local59 >> 16;
			local91 = local72 - local67;
			if (local91 > 0) {
				@Pc(725) byte[][] local725 = Static178.aByteArrayArrayArray15[arg4 + local59 >> 6];
				local67 += arg1;
				for (@Pc(731) int local731 = 0; local731 < local20; local731++) {
					@Pc(739) int local739 = local37 * local731 >> 16;
					@Pc(747) int local747 = local37 * (local731 + 1) >> 16;
					@Pc(752) int local752 = local747 - local739;
					if (local752 > 0) {
						local739 += arg2;
						local117 = ((local731 + arg0 & 0x3F) << 6) + (local59 + arg4 & 0x3F);
						@Pc(784) int local784 = arg0 + local731 >> 6;
						if (local725[local784] != null) {
							local125 = local725[local784][local117] & 0xFF;
							if (local125 != 0) {
								if (local125 == 47 || local125 == 53) {
									Static16.aClass42_Sub1Array1[local125 - 1].method2478(local67, local739, local91 * 2 + 1, local752 * 2 + 1);
								} else {
									Static16.aClass42_Sub1Array1[local125 - 1].method2478(local67 - local91 / 2, -(local752 / 2) + local739, local91 * 2, local752 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!pb;III)[Lclient!vi;")
	public static Class2_Sub1_Sub2[] method2387(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static157.method2317(arg2, arg0, arg1) ? Static209.method3053() : null;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIII)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static19.method345(arg2, Static55.anIntArrayArray8[arg1], arg0, arg3);
		} else {
			Static19.method345(arg2, Static55.anIntArrayArray8[arg1], arg3, arg0);
		}
	}
}
