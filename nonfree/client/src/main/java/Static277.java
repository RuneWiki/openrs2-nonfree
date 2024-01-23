import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array121;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	public static boolean aBoolean477 = true;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public static int anInt5666 = 0;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt5667 = 0;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public static int anInt5673 = 1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method4271(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(15) int local15 = Static108.anInt2268 >> 2 << 10;
		@Pc(19) int local19 = Static139.anInt2775 >> 1;
		@Pc(23) byte[][] local23 = new byte[Static156.anInt3157][Static221.anInt4539];
		@Pc(35) int local35;
		@Pc(128) int local128;
		@Pc(139) int local139;
		while (arg0.anInt2955 < arg0.aByteArray24.length) {
			local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			if (arg0.method2334() == 1) {
				local35 = arg0.method2334();
				local37 = arg0.method2334();
				local39 = true;
			}
			@Pc(61) int local61 = arg0.method2334();
			@Pc(65) int local65 = arg0.method2334();
			@Pc(72) int local72 = local61 * 64 - Static220.anInt4522;
			@Pc(83) int local83 = Static221.anInt4539 + Static140.anInt2782 - local65 * 64 - 1;
			if (local72 >= 0 && local83 - 63 >= 0 && local72 + 63 < Static156.anInt3157 && Static221.anInt4539 > local83) {
				for (local128 = 0; local128 < 64; local128++) {
					@Pc(137) byte[] local137 = local23[local72 + local128];
					for (local139 = 0; local139 < 64; local139++) {
						if (!local39 || local35 * 8 <= local128 && local35 * 8 + 8 > local128 && local37 * 8 <= local139 && local37 * 8 + 8 > local139) {
							local137[local83 - local139] = arg0.method2374();
						}
					}
				}
			} else if (local39) {
				arg0.anInt2955 += 64;
			} else {
				arg0.anInt2955 += 4096;
			}
		}
		@Pc(191) int local191 = Static156.anInt3157;
		local35 = Static221.anInt4539;
		@Pc(196) int[] local196 = new int[local35];
		@Pc(199) int[] local199 = new int[local35];
		@Pc(202) int[] local202 = new int[local35];
		@Pc(205) int[] local205 = new int[local35];
		@Pc(208) int[] local208 = new int[local35];
		for (local128 = -5; local128 < local191; local128++) {
			@Pc(241) int local241;
			@Pc(305) int local305;
			for (@Pc(215) int local215 = 0; local215 < local35; local215++) {
				local139 = local128 + 5;
				@Pc(288) int local288;
				if (local139 < local191) {
					local241 = local23[local139][local215] & 0xFF;
					if (local241 > 0) {
						@Pc(252) Class97 local252 = Static200.method3092(local241 - 1);
						local196[local215] += local252.anInt2802;
						local202[local215] += local252.anInt2803;
						local208[local215] += local252.anInt2806;
						local199[local215] += local252.anInt2804;
						local288 = local205[local215]++;
					}
				}
				local241 = local128 - 5;
				if (local241 >= 0) {
					local305 = local23[local241][local215] & 0xFF;
					if (local305 > 0) {
						@Pc(317) Class97 local317 = Static200.method3092(local305 - 1);
						local196[local215] -= local317.anInt2802;
						local202[local215] -= local317.anInt2803;
						local208[local215] -= local317.anInt2806;
						local199[local215] -= local317.anInt2804;
						local288 = local205[local215]--;
					}
				}
			}
			if (local128 >= 0) {
				@Pc(371) int[][] local371 = Static81.anIntArrayArrayArray4[local128 >> 6];
				local139 = 0;
				local305 = 0;
				local241 = 0;
				@Pc(379) int local379 = 0;
				@Pc(381) int local381 = 0;
				for (@Pc(383) int local383 = -5; local383 < local35; local383++) {
					@Pc(394) int local394 = local383 - 5;
					@Pc(398) int local398 = local383 + 5;
					if (local398 < local35) {
						local305 += local208[local398];
						local139 += local196[local398];
						local379 += local199[local398];
						local381 += local205[local398];
						local241 += local202[local398];
					}
					if (local394 >= 0) {
						local241 -= local202[local394];
						local379 -= local199[local394];
						local305 -= local208[local394];
						local381 -= local205[local394];
						local139 -= local196[local394];
					}
					if (local383 >= 0 && local381 > 0) {
						@Pc(477) int[] local477 = local371[local383 >> 6];
						@Pc(495) int local495 = local379 == 0 ? 0 : Static17.method320(local241 / local381, local139 * 256 / local379, local305 / local381);
						if (local23[local128][local383] != 0) {
							if (local477 == null) {
								local477 = local371[local383 >> 6] = new int[4096];
							}
							@Pc(541) int local541 = local19 + (local495 & 0x7F);
							if (local541 < 0) {
								local541 = 0;
							} else if (local541 > 127) {
								local541 = 127;
							}
							@Pc(567) int local567 = (local15 + local495 & 0xFC00) + (local495 & 0x380) + local541;
							local477[((local383 & 0x3F) << 6) + (local128 & 0x3F)] = Static96.anIntArray135[Static181.method2780(local567, 96)];
						} else if (local477 != null) {
							local477[((local383 & 0x3F) << 6) + (local128 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZC)Z")
	public static boolean method4274(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
