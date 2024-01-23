import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt4339;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1370 = Static186.method3527("details");

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Lclient!mi;")
	public static Class75 aClass75_22 = new Class75();

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt4340 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "[I")
	public static int[] anIntArray500 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt4341 = 0;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public static int anInt4343 = 0;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1371 = Static186.method3527("<)4col>");

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method3421(@OriginalArg(0) Class86 arg0) {
		Static69.anInt1314 = arg0.method3336(Static203.aClass50_274);
		Static58.anInt1159 = arg0.method3336(Static71.aClass50_486);
		Static12.anInt235 = arg0.method3336(Static43.aClass50_326);
		Static34.anInt661 = arg0.method3336(Static140.aClass50_969);
		Static150.anInt3127 = arg0.method3336(Static226.aClass50_1375);
		Static56.anInt1101 = arg0.method3336(Static115.aClass50_788);
		Static104.anInt2076 = arg0.method3336(Static73.aClass50_1067);
		Static62.anInt1227 = arg0.method3336(Static76.aClass50_499);
		Static83.anInt2313 = arg0.method3336(Static145.aClass50_1002);
		Static79.anInt3171 = arg0.method3336(Static88.aClass50_589);
		Static8.anInt184 = arg0.method3336(Static163.aClass50_1101);
		Static4.anInt91 = arg0.method3336(Static135.aClass50_940);
		Static135.anInt2792 = arg0.method3336(Static48.aClass50_375);
		Static173.anInt3574 = arg0.method3336(Static60.aClass50_426);
		Static230.anInt3198 = arg0.method3336(Static88.aClass50_588);
		Static132.anInt2746 = arg0.method3336(Static227.aClass50_1380);
		arg0.method3336(Static197.aClass50_1414);
		Static219.anInt2994 = arg0.method3336(Static18.aClass50_148);
		Static17.anInt326 = arg0.method3336(Static229.aClass50_1413);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!pg;B)V")
	public static void method3423(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(11) int local11 = Static1.anInt40 >> 2 << 10;
		@Pc(15) int local15 = Static100.anInt2017 >> 1;
		@Pc(19) byte[][] local19 = new byte[Static164.anInt3383][Static12.anInt239];
		@Pc(25) int local25;
		@Pc(93) int local93;
		@Pc(103) int local103;
		while (arg0.anInt2656 < arg0.aByteArray40.length) {
			@Pc(23) boolean local23 = false;
			local25 = 0;
			@Pc(27) int local27 = 0;
			if (arg0.method2142() == 1) {
				local23 = true;
				local25 = arg0.method2142();
				local27 = arg0.method2142();
			}
			@Pc(48) int local48 = arg0.method2142();
			@Pc(52) int local52 = arg0.method2142();
			@Pc(58) int local58 = local48 * 64 - Static121.anInt2393;
			@Pc(69) int local69 = Static195.anInt3969 + Static12.anInt239 - local52 * 64 - 1;
			if (local58 >= 0 && local69 - 63 >= 0 && local58 + 63 < Static164.anInt3383 && Static12.anInt239 > local69) {
				for (local93 = 0; local93 < 64; local93++) {
					@Pc(101) byte[] local101 = local19[local58 + local93];
					for (local103 = 0; local103 < 64; local103++) {
						if (!local23 || local93 >= local25 * 8 && local25 * 8 + 8 > local93 && local103 >= local27 * 8 && local27 * 8 + 8 > local103) {
							local101[local69 - local103] = arg0.method2155();
						}
					}
				}
			} else if (local23) {
				arg0.anInt2656 += 64;
			} else {
				arg0.anInt2656 += 4096;
			}
		}
		@Pc(185) int local185 = Static164.anInt3383;
		local25 = Static12.anInt239;
		@Pc(196) int[] local196 = new int[local25];
		@Pc(199) int[] local199 = new int[local25];
		@Pc(202) int[] local202 = new int[local25];
		@Pc(205) int[] local205 = new int[local25];
		@Pc(208) int[] local208 = new int[local25];
		for (local93 = -5; local93 < local185; local93++) {
			@Pc(235) int local235;
			@Pc(299) int local299;
			for (@Pc(214) int local214 = 0; local214 < local25; local214++) {
				local103 = local93 + 5;
				@Pc(282) int local282;
				if (local103 < local185) {
					local235 = local19[local103][local214] & 0xFF;
					if (local235 > 0) {
						@Pc(246) Class9 local246 = Static203.method541(local235 - 1);
						local196[local214] += local246.anInt255;
						local205[local214] += local246.anInt252;
						local208[local214] += local246.anInt251;
						local202[local214] += local246.anInt260;
						local282 = local199[local214]++;
					}
				}
				local235 = local93 - 5;
				if (local235 >= 0) {
					local299 = local19[local235][local214] & 0xFF;
					if (local299 > 0) {
						@Pc(307) Class9 local307 = Static203.method541(local299 - 1);
						local196[local214] -= local307.anInt255;
						local205[local214] -= local307.anInt252;
						local208[local214] -= local307.anInt251;
						local202[local214] -= local307.anInt260;
						local282 = local199[local214]--;
					}
				}
			}
			if (local93 >= 0) {
				local235 = 0;
				@Pc(363) int[][] local363 = Static172.anIntArrayArrayArray11[local93 >> 6];
				local299 = 0;
				@Pc(367) int local367 = 0;
				@Pc(369) int local369 = 0;
				@Pc(371) int local371 = 0;
				for (@Pc(373) int local373 = -5; local373 < local25; local373++) {
					@Pc(379) int local379 = local373 + 5;
					if (local25 > local379) {
						local369 += local199[local379];
						local371 += local208[local379];
						local235 += local196[local379];
						local367 += local202[local379];
						local299 += local205[local379];
					}
					@Pc(420) int local420 = local373 - 5;
					if (local420 >= 0) {
						local367 -= local202[local420];
						local299 -= local205[local420];
						local371 -= local208[local420];
						local235 -= local196[local420];
						local369 -= local199[local420];
					}
					if (local373 >= 0 && local369 > 0) {
						@Pc(465) int[] local465 = local363[local373 >> 6];
						@Pc(486) int local486 = local367 == 0 ? 0 : Static120.method1908(local235 * 256 / local367, local371 / local369, local299 / local369);
						if (local19[local93][local373] != 0) {
							if (local465 == null) {
								local465 = local363[local373 >> 6] = new int[4096];
							}
							@Pc(510) int local510 = (local486 & 0x7F) + local15;
							if (local510 < 0) {
								local510 = 0;
							} else if (local510 > 127) {
								local510 = 127;
							}
							@Pc(536) int local536 = local510 + (local11 + local486 & 0xFC00) + (local486 & 0x380);
							local465[((local373 & 0x3F) << 6) + (local93 & 0x3F)] = Static215.anIntArray494[Static231.method3482(96, local536)];
						} else if (local465 != null) {
							local465[(local93 & 0x3F) + ((local373 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!pa;B)V")
	public static void method3424(@OriginalArg(0) Class86 arg0) {
		Static35.anInt744 = arg0.method3336(Static201.aClass50_1315);
		Static23.anInt466 = arg0.method3336(Static8.aClass50_84);
		Static206.anInt4118 = arg0.method3336(Static55.aClass50_386);
		Static147.anInt3083 = arg0.method3336(Static4.aClass50_34);
	}
}
