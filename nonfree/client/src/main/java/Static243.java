import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "t", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!iha", name = "n", descriptor = "F")
	public static float aFloat117 = 0.0F;

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()V")
	public static void method3846() {
		for (@Pc(1) int local1 = 0; local1 < Static257.anInt4639; local1++) {
			if (!Static488.aBooleanArray22[local1]) {
				@Pc(10) Class204 local10 = Static665.aClass204Array3[local1];
				@Pc(13) Class5_Sub12 local13 = local10.aClass5_Sub12_2;
				@Pc(16) int local16 = local10.anInt5222;
				@Pc(22) int local22 = local13.method4531() - Static377.anInt6337;
				@Pc(30) int local30 = (local22 * 2 >> Static314.anInt5377) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4537() - local22 >> Static314.anInt5377;
				@Pc(53) int local53 = local13.method4534() - local22 >> Static314.anInt5377;
				@Pc(61) int local61 = local13.method4534() + local22 >> Static314.anInt5377;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static532.anInt8517) {
					local61 = Static532.anInt8517 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray73[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static672.anInt10829) {
						local108 = Static672.anInt10829 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class4_Sub1_Sub1 local144 = Static367.method5340(local16, local125, local78, aClass15 == null ? (aClass15 = Class168.a("aba")) : aClass15);
						if (local144 != null && local144.aByte125 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte125 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray73[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray73[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray73[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray73[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static488.aBooleanArray22[local1] = true;
				Static177.aClass84Array2[local16].method7623(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!rfa;ILclient!sg;Lclient!ha;Lclient!vb;IIZI)V")
	public static void method3849(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub49 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class371 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg6 - arg7 / 2 - 5;
		@Pc(18) int local18 = arg5 + 2;
		if (arg0.anInt8166 != 0) {
			arg3.method8644(local18, arg0.anInt8166, arg7 + 10, local14, arg4.method8490() * arg1 + arg5 + 1 - local18);
		}
		if (arg0.anInt8190 != 0) {
			arg3.method8620(local18, arg0.anInt8190, arg7 + 10, local14, arg4.method8490() * arg1 + arg5 + 1 - local18);
		}
		@Pc(85) int local85 = arg0.anInt8173;
		if (arg2.aBoolean571 && arg0.anInt8167 != -1) {
			local85 = arg0.anInt8167;
		}
		for (@Pc(99) int local99 = 0; local99 < arg1; local99++) {
			@Pc(105) String local105 = Static20.aStringArray4[local99];
			if (arg1 - 1 > local99) {
				local105 = local105.substring(0, local105.length() - 4);
			}
			arg4.method8489(arg3, local105, arg6, arg5, local85);
			arg5 += arg4.method8490();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)Z")
	public static boolean method3857(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class5_Sub1_Sub13 local10 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local10 != null; local10 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
			if (Static250.method4080(local10.anInt6068) && (long) arg0 == local10.aLong176) {
				return true;
			}
		}
		if (123 <= 101) {
			return true;
		} else {
			return false;
		}
	}
}
