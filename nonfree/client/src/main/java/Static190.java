import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array11;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_176;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_20 = new Class19();

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1099 = Static181.method2795("(U5");

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1100 = Static181.method2795("hitmarks");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!gg;B)V")
	public static void method2864(@OriginalArg(0) Class29_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static44.anIntArray91.length; local7++) {
			Static44.anIntArray91[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static44.anIntArray91[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(63) int local63;
		for (local32 = 0; local32 < 20; local32++) {
			for (local51 = 1; local51 < 255; local51++) {
				for (local55 = 1; local55 < 127; local55++) {
					local63 = (local51 << 7) + local55;
					Static26.anIntArray45[local63] = (Static44.anIntArray91[local63 + 1] + Static44.anIntArray91[local63 - 1] + Static44.anIntArray91[local63 + -128] + Static44.anIntArray91[local63 + 128]) / 4;
				}
			}
			@Pc(106) int[] local106 = Static44.anIntArray91;
			Static44.anIntArray91 = Static26.anIntArray45;
			Static26.anIntArray45 = local106;
		}
		if (arg0 == null) {
			return;
		}
		local51 = 0;
		for (local55 = 0; local55 < arg0.anInt1517; local55++) {
			for (local63 = 0; local63 < arg0.anInt1518; local63++) {
				if (arg0.aByteArray17[local51++] != 0) {
					@Pc(144) int local144 = arg0.anInt1514 + local63 + 16;
					@Pc(151) int local151 = arg0.anInt1516 + local55 + 16;
					@Pc(157) int local157 = (local151 << 7) + local144;
					Static44.anIntArray91[local157] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
	public static boolean method2865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static101.method1745(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static166.method2577(local10 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg2] + arg3, local14 + 1) && Static166.method2577(local10 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static166.method2577(local10 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static166.method2577(local10 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method2866(@OriginalArg(0) int arg0) {
		Static74.anInt1724 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static35.anInt916; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static31.anInt825; local6++) {
				if (Static203.aClass2_Sub23ArrayArrayArray1[arg0][local3][local6] == null) {
					Static203.aClass2_Sub23ArrayArrayArray1[arg0][local3][local6] = new Class2_Sub23(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public static void method2867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < 0) {
			local12 = 0;
		}
		Static63.method2583(arg0);
		@Pc(21) int local21 = arg0;
		@Pc(23) int local23 = local12;
		@Pc(26) int local26 = -local12;
		@Pc(29) int local29 = -arg0;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		if (arg2 >= Static147.anInt4074 && arg2 <= Static61.anInt1501) {
			@Pc(47) int[] local47 = Static14.anIntArrayArray18[arg2];
			local56 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - arg0);
			local64 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg0 + arg3);
			local72 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local12);
			local81 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 + local12);
			Static22.method438(local72, arg4, local56, local47);
			Static22.method438(local81, arg5, local72, local47);
			Static22.method438(local64, arg4, local81, local47);
		}
		while (local7 < local21) {
			local31 += 2;
			local29 += local31;
			local33 += 2;
			local26 += local33;
			if (local26 >= 0 && local23 >= 1) {
				local23--;
				local26 -= local23 << 1;
				Static129.anIntArray282[local23] = local7;
			}
			local7++;
			@Pc(257) int local257;
			@Pc(266) int local266;
			@Pc(273) int[] local273;
			@Pc(158) int local158;
			if (local29 >= 0) {
				local21--;
				local29 -= local21 << 1;
				local158 = arg2 - local21;
				local56 = local21 + arg2;
				if (Static147.anInt4074 <= local56 && local158 <= Static61.anInt1501) {
					if (local21 >= local12) {
						local64 = Static50.method998(Static36.anInt940, Static209.anInt4155, local7 + arg3);
						local72 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local7);
						if (Static61.anInt1501 >= local56) {
							Static22.method438(local64, arg4, local72, Static14.anIntArrayArray18[local56]);
						}
						if (local158 >= Static147.anInt4074) {
							Static22.method438(local64, arg4, local72, Static14.anIntArrayArray18[local158]);
						}
					} else {
						local64 = Static129.anIntArray282[local21];
						local72 = Static50.method998(Static36.anInt940, Static209.anInt4155, local7 + arg3);
						local81 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local7);
						local257 = Static50.method998(Static36.anInt940, Static209.anInt4155, local64 + arg3);
						local266 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local64);
						if (Static61.anInt1501 >= local56) {
							local273 = Static14.anIntArrayArray18[local56];
							Static22.method438(local266, arg4, local81, local273);
							Static22.method438(local257, arg5, local266, local273);
							Static22.method438(local72, arg4, local257, local273);
						}
						if (local158 >= Static147.anInt4074) {
							local273 = Static14.anIntArrayArray18[local158];
							Static22.method438(local266, arg4, local81, local273);
							Static22.method438(local257, arg5, local266, local273);
							Static22.method438(local72, arg4, local257, local273);
						}
					}
				}
			}
			local56 = arg2 + local7;
			local158 = arg2 - local7;
			if (local56 >= Static147.anInt4074 && local158 <= Static61.anInt1501) {
				local64 = arg3 + local21;
				local72 = arg3 - local21;
				if (local64 >= Static209.anInt4155 && local72 <= Static36.anInt940) {
					local64 = Static50.method998(Static36.anInt940, Static209.anInt4155, local64);
					local72 = Static50.method998(Static36.anInt940, Static209.anInt4155, local72);
					if (local12 <= local7) {
						if (local56 <= Static61.anInt1501) {
							Static22.method438(local64, arg4, local72, Static14.anIntArrayArray18[local56]);
						}
						if (local158 >= Static147.anInt4074) {
							Static22.method438(local64, arg4, local72, Static14.anIntArrayArray18[local158]);
						}
					} else {
						local81 = local7 > local23 ? Static129.anIntArray282[local7] : local23;
						local257 = Static50.method998(Static36.anInt940, Static209.anInt4155, local81 + arg3);
						local266 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local81);
						if (Static61.anInt1501 >= local56) {
							local273 = Static14.anIntArrayArray18[local56];
							Static22.method438(local266, arg4, local72, local273);
							Static22.method438(local257, arg5, local266, local273);
							Static22.method438(local64, arg4, local257, local273);
						}
						if (local158 >= Static147.anInt4074) {
							local273 = Static14.anIntArrayArray18[local158];
							Static22.method438(local266, arg4, local72, local273);
							Static22.method438(local257, arg5, local266, local273);
							Static22.method438(local64, arg4, local257, local273);
						}
					}
				}
			}
		}
	}
}
