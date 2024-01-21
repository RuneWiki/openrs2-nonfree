import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray45;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray46;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!nb;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_4;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_756 = Static181.method2795("Please try using a different world)3");

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!qe;")
	public static Class83 aClass83_750 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	public static int anInt2550 = 0;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!qe;")
	public static Class83 aClass83_751 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_752 = Static181.method2795("hint_mapmarkers");

	@OriginalMember(owner = "client!li", name = "B", descriptor = "Lclient!qe;")
	public static Class83 aClass83_753 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "Lclient!qe;")
	public static Class83 aClass83_754 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!qe;")
	public static Class83 aClass83_755 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "Lclient!qe;")
	public static Class83 aClass83_757 = aClass83_756;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg7 - arg3;
		@Pc(15) int local15 = arg2 - arg1;
		@Pc(23) int local23 = (arg5 - arg6 << 16) / local10;
		if (Static127.anInt2810 > arg7) {
			local10++;
		}
		@Pc(36) int local36 = (arg0 - arg4 << 16) / local15;
		if (arg2 < Static177.anInt3615) {
			local15++;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(67) int local67;
		@Pc(79) int local79;
		@Pc(113) int local113;
		@Pc(121) int local121;
		for (@Pc(46) int local46 = 0; local46 < local10; local46++) {
			local54 = local23 * local46 >> 16;
			local62 = local23 * (local46 + 1) >> 16;
			local67 = local62 - local54;
			if (local67 > 0) {
				local79 = local46 + arg3 >> 6;
				local62 += arg6;
				local54 += arg6;
				@Pc(91) int[][] local91 = Static211.anIntArrayArrayArray11[local79];
				@Pc(95) byte[][] local95 = Static89.aByteArrayArrayArray95[local79];
				@Pc(99) byte[][] local99 = Static176.aByteArrayArrayArray68[local79];
				@Pc(103) byte[][] local103 = Static89.aByteArrayArrayArray94[local79];
				@Pc(107) byte[][] local107 = aByteArrayArrayArray45[local79];
				@Pc(111) byte[][] local111 = Static77.aByteArrayArrayArray33[local79];
				for (local113 = 0; local113 < local15; local113++) {
					local121 = local113 * local36 >> 16;
					@Pc(129) int local129 = local36 * (local113 + 1) >> 16;
					@Pc(134) int local134 = local129 - local121;
					if (local134 > 0) {
						local121 += arg4;
						@Pc(146) int local146 = arg1 + local113 >> 6;
						@Pc(152) int local152 = local113 + arg1 & 0x3F;
						local129 += arg4;
						@Pc(163) int local163 = local46 + arg3 & 0x3F;
						@Pc(169) int local169 = local163 + (local152 << 6);
						@Pc(205) int local205;
						@Pc(185) int local185;
						@Pc(179) int local179;
						if (local91[local146] == null) {
							local179 = arg1 + local113 & 0x4;
							local185 = arg3 + local46 & 0x4;
							if ((local185 >= 2 || local179 <= 2) && (local185 <= 2 || local179 >= 2)) {
								local205 = Static135.anIntArray289[Static152.anInt3093 + 1];
							} else {
								local205 = 4936552;
							}
						} else {
							local205 = local91[local146][local169];
						}
						local185 = local95[local146] == null ? 0 : Static135.anIntArray289[local95[local146][local169] & 0xFF];
						local179 = local103[local146] == null ? 0 : Static135.anIntArray289[local103[local146][local169] & 0xFF];
						@Pc(295) int local295;
						if (local185 == 0 && local179 == 0) {
							Static126.method2138(local54, local121, local67, local134, local205);
						} else {
							@Pc(291) byte local291;
							if (local185 != 0) {
								if (local185 == -1) {
									local185 = 1;
								}
								local291 = local99[local146] == null ? 0 : local99[local146][local169];
								local295 = local291 & 0xFC;
								if (local295 == 0 || local67 <= 1 || local134 <= 1) {
									Static126.method2138(local54, local121, local67, local134, local185);
								} else {
									Static125.method2106(local291 & 0x3, local134, true, local185, local54, Static126.anIntArray279, local121, local205, local67, local295 >> 2);
								}
							}
							if (local179 != 0) {
								if (local179 == -1) {
									local179 = local205;
								}
								local291 = local107[local146][local169];
								local295 = local291 & 0xFC;
								if (local295 == 0 || local67 <= 1 || local134 <= 1) {
									Static126.method2138(local54, local121, local67, local134, local179);
								}
								Static125.method2106(local291 & 0x3, local134, local185 == 0, local179, local54, Static126.anIntArray279, local121, 0, local67, local295 >> 2);
							}
						}
						if (local111[local146] != null) {
							@Pc(399) int local399 = local111[local146][local169] & 0xFF;
							if (local399 != 0) {
								if (local67 == 1) {
									local295 = local54;
								} else {
									local295 = local62 - 1;
								}
								@Pc(421) int local421;
								if (local134 == 1) {
									local421 = local121;
								} else {
									local421 = local129 - 1;
								}
								@Pc(427) int local427 = 13421772;
								if (local399 >= 5 && local399 <= 8 || local399 >= 13 && local399 <= 16 || local399 >= 21 && local399 <= 24 || local399 == 27 || local399 == 28) {
									local427 = 13369344;
									local399 -= 4;
								}
								if (local399 == 1) {
									Static126.method2137(local54, local121, local134, local427);
								} else if (local399 == 2) {
									Static126.method2132(local54, local121, local67, local427);
								} else if (local399 == 3) {
									Static126.method2137(local295, local121, local134, local427);
								} else if (local399 == 4) {
									Static126.method2132(local54, local421, local67, local427);
								} else if (local399 == 9) {
									Static126.method2137(local54, local121, local134, 16777215);
									Static126.method2132(local54, local121, local67, local427);
								} else if (local399 == 10) {
									Static126.method2137(local295, local121, local134, 16777215);
									Static126.method2132(local54, local121, local67, local427);
								} else if (local399 == 11) {
									Static126.method2137(local295, local121, local134, 16777215);
									Static126.method2132(local54, local421, local67, local427);
								} else if (local399 == 12) {
									Static126.method2137(local54, local121, local134, 16777215);
									Static126.method2132(local54, local421, local67, local427);
								} else if (local399 == 17) {
									Static126.method2132(local54, local121, 1, local427);
								} else if (local399 == 18) {
									Static126.method2132(local295, local121, 1, local427);
								} else if (local399 == 19) {
									Static126.method2132(local295, local421, 1, local427);
								} else if (local399 == 20) {
									Static126.method2132(local54, local421, 1, local427);
								} else {
									@Pc(578) int local578;
									if (local399 == 25) {
										for (local578 = 0; local578 < local134; local578++) {
											Static126.method2132(local578 + local54, -local578 + local421, 1, local427);
										}
									} else if (local399 == 26) {
										for (local578 = 0; local578 < local134; local578++) {
											Static126.method2132(local54 + local578, local578 + local121, 1, local427);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local54 = 0; local54 < local10; local54++) {
			local67 = local23 * (local54 + 1) >> 16;
			local62 = local23 * local54 >> 16;
			local79 = local67 - local62;
			if (local79 > 0) {
				@Pc(728) byte[][] local728 = Static164.aByteArrayArrayArray57[local54 + arg3 >> 6];
				local62 += arg6;
				for (@Pc(734) int local734 = 0; local734 < local15; local734++) {
					@Pc(742) int local742 = local734 * local36 >> 16;
					@Pc(750) int local750 = (local734 + 1) * local36 >> 16;
					@Pc(755) int local755 = local750 - local742;
					if (local755 > 0) {
						local742 += arg4;
						@Pc(771) int local771 = arg1 + local734 >> 6;
						local113 = (local54 + arg3 & 0x3F) + ((arg1 + local734 & 0x3F) << 6);
						if (local728[local771] != null) {
							local121 = local728[local771][local113] & 0xFF;
							if (local121 != 0) {
								if (local121 == 47 || local121 == 53) {
									Static87.aClass29_Sub1Array1[local121 - 1].method1191(local62, local742, local79 * 2 + 1, local755 * 2 - -1);
								} else {
									Static87.aClass29_Sub1Array1[local121 - 1].method1191(local62 - local79 / 2, -(local755 / 2) + local742, local79 * 2, local755 * 2);
								}
							}
						}
					}
				}
			}
		}
	}
}
