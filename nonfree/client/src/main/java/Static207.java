import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public static int anInt4342;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt4343;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt4345 = 0;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	public static final int anInt4347 = 12;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([[BZLclient!bl;Lclient!bl;IILclient!vm;[[B[[BZ[[II[[B)V")
	public static void method3645(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
				if (Static313.method5257() || Static213.method3693(local16, arg10, Static45.anInt5654, local12)) {
					@Pc(36) byte local36 = arg6[local12][local16];
					@Pc(42) byte local42 = arg7[local12][local16];
					@Pc(50) int local50 = arg11[local12][local16] & 0xFF;
					@Pc(58) int local58 = arg0[local12][local16] & 0xFF;
					@Pc(68) Class71 local68 = local50 == 0 ? null : Static125.method5092(local50 - 1);
					@Pc(78) Class172 local78 = local58 == 0 ? null : Static128.method2580(local58 - 1);
					@Pc(80) int local80 = 0;
					@Pc(82) int local82 = 0;
					if (local36 != 0) {
						local80 = local78 == null ? 0 : Static89.anIntArray201[local36];
						local82 = local68 == null ? 0 : Static329.anIntArray520[local36];
					} else if (local68 != null) {
						local82 = Static329.anIntArray520[local36];
					} else if (local78 != null) {
						local80 = Static329.anIntArray520[local36];
					}
					@Pc(120) int local120 = local80 + local82;
					@Pc(122) int local122 = 0;
					if (local120 != 0) {
						@Pc(130) int[] local130 = new int[local120];
						@Pc(133) int[] local133 = new int[local120];
						@Pc(136) int[] local136 = new int[local120];
						@Pc(139) int[] local139 = new int[local120];
						@Pc(141) boolean local141 = false;
						@Pc(166) int local166;
						@Pc(172) int local172;
						if (local68 == null || local68.anInt1792 == -1 && local68.anInt1789 == -1 && local68.anInt1788 == -1) {
							for (local166 = 0; local166 < local82; local166++) {
								local130[local122] = -1;
								local122++;
							}
						} else {
							local166 = arg5.method4463() ? local68.anInt1788 : local68.anInt1784;
							if (!Static318.aBoolean552) {
								local166 = -1;
							}
							for (local172 = 0; local172 < local82; local172++) {
								local136[local122] = local166;
								local139[local122] = local68.anInt1793;
								if (local68.anInt1792 == -1) {
									local130[local122] = -1;
								} else {
									local130[local122] = local68.anInt1792;
								}
								if (local68.anInt1789 == -1) {
									local133[local122] = -1;
								} else {
									local133[local122] = local68.anInt1789;
									local141 = true;
								}
								local122++;
							}
							if (!arg8 && arg10 == 0) {
								Static101.method2749(local12, local16, local68.anInt1786, local68.anInt1790 * 8);
							}
						}
						if (!local141) {
							local133 = null;
						}
						if (local78 == null) {
							for (local166 = 0; local166 < local80; local166++) {
								local130[local122] = -1;
								local122++;
							}
						} else {
							local166 = local78.anInt5444;
							if (!Static318.aBoolean552) {
								local166 = -1;
							}
							for (local172 = 0; local172 < local80; local172++) {
								local136[local122] = local166;
								local139[local122] = local78.anInt5451;
								local130[local122] = arg9[local12][local16];
								if (local133 != null) {
									local133[local122] = -1;
								}
								local122++;
							}
						}
						local166 = Static327.anIntArray510.length;
						@Pc(333) int[] local333 = arg8 ? new int[local166] : null;
						@Pc(336) int[] local336 = new int[local166];
						@Pc(339) int[] local339 = new int[local166];
						@Pc(347) int local347;
						@Pc(351) int local351;
						@Pc(435) int local435;
						@Pc(443) int local443;
						for (@Pc(341) int local341 = 0; local341 < local166; local341++) {
							local347 = Static327.anIntArray510[local341];
							local351 = Static182.anIntArray345[local341];
							if (local42 == 0) {
								local336[local341] = local347;
								local339[local341] = local351;
							} else if (local42 == 1) {
								local336[local341] = local351;
								local339[local341] = 128 - local347;
							} else if (local42 == 2) {
								local336[local341] = 128 - local347;
								local339[local341] = 128 - local351;
							} else if (local42 == 3) {
								local336[local341] = 128 - local351;
								local339[local341] = local347;
							}
							if (arg8 && Static281.aBooleanArrayArray5[local36][local341]) {
								local435 = (local12 << 7) + local336[local341];
								local443 = local339[local341] + (local16 << 7);
								local333[local341] = arg2.method4990(local435, local443) - arg1.method4990(local435, local443);
							}
						}
						local347 = arg1.method4996(local12, local16);
						local351 = arg1.method4996(local12 + 1, local16);
						local435 = arg1.method4996(local12 + 1, local16 + 1);
						local443 = arg1.method4996(local12, local16 + 1);
						if (arg10 > 0) {
							@Pc(495) boolean local495 = true;
							if (local58 == 0 && local36 != 0) {
								local495 = false;
							}
							if (local50 > 0 && local68 != null && !local68.aBoolean144) {
								local495 = false;
							}
							if (local495 && local351 == local347 && local435 == local347 && local443 == local347) {
								Static83.aByteArrayArrayArray2[arg10][local12][local16] = (byte) (Static83.aByteArrayArrayArray2[arg10][local12][local16] | 0x4);
							}
						}
						@Pc(548) int local548 = 0;
						@Pc(550) int local550 = 0;
						if (arg8) {
							local548 = Static94.method1676(local12, local16);
							local550 = Static243.method4214(local12, local16);
						}
						arg1.method4992(local12, local16, local336, local333, local339, Static107.anIntArrayArray62[local36], Static297.anIntArrayArray59[local36], Static226.anIntArrayArray42[local36], local130, local133, local136, local139, local548, local550);
						Static333.method78(arg10, local12, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method3647() {
		Static232.method3950();
		Static313.method5255();
		Static288.method4930();
		Static36.method673();
		Static124.method3068();
		Static206.method3644();
		Static121.method2448();
		Static352.method5476();
		Static330.method5399();
		Static220.method3780();
		Static79.method1437();
		Static313.method5253();
		Static311.method5229();
		Static244.method4231();
		Static265.method4631();
		Static7.method238();
		Static130.method2627();
		Static208.method3648();
		Static196.method3545();
		Static192.method3496();
		Static286.method4910();
		Static272.method4740();
		if (Static189.anInt4083 != 0) {
			for (@Pc(68) int local68 = 0; local68 < Static329.aByteArrayArray24.length; local68++) {
				Static329.aByteArrayArray24[local68] = null;
			}
			Static120.anInt2722 = 0;
		}
		Static257.method4399();
		Static177.method4967();
		Static342.method5576();
		Static37.method719();
		Static197.method3568();
		Static97.aClass154_34.method4219();
		Static164.aClass92_7.method4531();
		Static205.aClass15_8.method354();
		Static337.method4916();
		Static16.aClass11_3.method285();
		Static114.aClass11_52.method285();
		Static266.aClass11_113.method285();
		Static52.aClass11_19.method285();
		Static60.aClass11_28.method285();
		Static159.aClass11_72.method285();
		Static20.aClass11_9.method285();
		Static67.aClass11_31.method285();
		Static292.aClass11_130.method285();
		Static5.aClass11_2.method285();
		Static316.aClass11_114.method285();
		Static203.aClass11_84.method285();
		Static54.aClass11_21.method285();
		Static58.aClass11_24.method285();
		Static234.aClass11_97.method285();
		Static292.aClass11_129.method285();
		Static191.aClass11_80.method285();
		Static112.aClass11_51.method285();
		Static150.aClass11_148.method285();
		Static54.aClass11_20.method285();
		Static144.aClass11_68.method285();
		Static78.aClass11_39.method285();
		Static55.aClass11_22.method285();
		Static150.aClass11_147.method285();
		Static237.aClass11_98.method285();
		Static19.aClass11_150.method285();
		Static349.aClass11_154.method285();
		Static309.aClass11_138.method285();
		Static230.aClass11_94.method285();
		Static296.aClass154_90.method4219();
		Static14.aClass154_6.method4219();
		Static46.aClass154_14.method4219();
		Static83.aClass154_27.method4219();
	}
}
