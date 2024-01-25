import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_176 = new Class254(111, 6);

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public static int anInt9648 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public static void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class224 local28 = Static256.aClass224ArrayArrayArray1[local9][arg0][arg1] = Static256.aClass224ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte68--;
				for (@Pc(40) Class270 local40 = local28.aClass270_1; local40 != null; local40 = local40.aClass270_2) {
					@Pc(44) Class11_Sub1 local44 = local40.aClass11_Sub1_2;
					if (local44.aShort78 == arg0 && local44.aShort80 == arg1) {
						local44.aByte77--;
					}
				}
			}
		}
		if (Static256.aClass224ArrayArrayArray1[0][arg0][arg1] == null) {
			Static256.aClass224ArrayArrayArray1[0][arg0][arg1] = new Class224(0, arg0, arg1);
			Static256.aClass224ArrayArrayArray1[0][arg0][arg1].aByte69 = 1;
		}
		Static256.aClass224ArrayArrayArray1[0][arg0][arg1].aClass224_1 = local7;
		Static256.aClass224ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "()V")
	public static void method8052() {
		for (@Pc(1) int local1 = 0; local1 < Static258.anInt5217; local1++) {
			if (!Static262.aBooleanArray17[local1]) {
				@Pc(10) Class342 local10 = Static470.aClass342Array1[local1];
				@Pc(13) Class6_Sub29 local13 = local10.aClass6_Sub29_2;
				@Pc(16) int local16 = local10.anInt9576;
				@Pc(22) int local22 = local13.method6160() - Static406.anInt9843;
				@Pc(30) int local30 = (local22 * 2 >> Static494.anInt8859) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6164() - local22 >> Static494.anInt8859;
				@Pc(53) int local53 = local13.method6165() - local22 >> Static494.anInt8859;
				@Pc(61) int local61 = local13.method6165() + local22 >> Static494.anInt8859;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static54.anInt1441) {
					local61 = Static54.anInt1441 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray161[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static396.anInt7505) {
						local108 = Static396.anInt7505 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub1 local141 = Static178.method3532(local16, local125, local78, fu.class);
						if (local141 != null && local141.aByte78 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte78 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray161[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray161[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray161[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray161[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static262.aBooleanArray17[local1] = true;
				Static47.aClass62Array1[local16].method8203(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[IIIIBII)V")
	public static void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static85.method1890(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static85.method1890(arg2)) {
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg3 < arg2 ? arg3 : arg2;
			@Pc(60) int local60 = arg3 >> 1;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(66) int[] local66 = arg1;
			@Pc(71) int[] local71 = new int[local60 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local45, arg0, arg3, arg2, 0, 32993, arg4, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(96) int local96 = arg3;
				@Pc(98) int[] local98 = local71;
				for (@Pc(100) int local100 = 0; local100 < local64; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local60; local104++) {
						@Pc(111) int local111 = local66[local92++];
						@Pc(116) int local116 = local66[local92++];
						@Pc(121) int local121 = local66[local96++];
						@Pc(125) int local125 = local111 & 0xFF;
						@Pc(131) int local131 = local111 >> 8 & 0xFF;
						@Pc(137) int local137 = local111 >> 16 & 0xFF;
						@Pc(143) int local143 = local111 >> 24 & 0xFF;
						@Pc(148) int local148 = local66[local96++];
						@Pc(156) int local156 = local143 + (local116 >> 24 & 0xFF);
						@Pc(162) int local162 = local125 + (local116 & 0xFF);
						@Pc(170) int local170 = local137 + (local116 >> 16 & 0xFF);
						@Pc(178) int local178 = local131 + (local116 >> 8 & 0xFF);
						@Pc(186) int local186 = local156 + (local121 >> 24 & 0xFF);
						@Pc(194) int local194 = local178 + (local121 >> 8 & 0xFF);
						@Pc(200) int local200 = local162 + (local121 & 0xFF);
						@Pc(208) int local208 = local170 + (local121 >> 16 & 0xFF);
						@Pc(216) int local216 = local194 + (local148 >> 8 & 0xFF);
						@Pc(224) int local224 = local208 + (local148 >> 16 & 0xFF);
						@Pc(230) int local230 = local200 + (local148 & 0xFF);
						@Pc(238) int local238 = local186 + (local148 >> 24 & 0xFF);
						local71[local90++] = (local216 & 0x3FC) << 6 | (local238 & 0x3FC) << 22 | (local224 & 0x3FC) << 14 | local230 >> 2 & 0xFF;
					}
					local96 += arg3;
					local92 += arg3;
				}
				local71 = local66;
				arg2 = local64;
				local66 = local98;
				arg3 = local60;
				local56 >>= 0x1;
				local64 >>= 0x1;
				local45++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
