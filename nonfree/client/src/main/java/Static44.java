import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_7;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!eh;")
	public static Class28 aClass28_49;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_8;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_356 = Static181.method2795("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "[I")
	public static final int[] anIntArray92 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "Lclient!qe;")
	public static Class83 aClass83_357 = aClass83_356;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
	public static int anInt1171 = 0;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_358 = Static181.method2795(" loggt sich aus)3");

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_359 = Static181.method2795("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
	public static int anInt1173 = 0;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)[Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1[] method905() {
		@Pc(8) Class2_Sub2_Sub17_Sub1[] local8 = new Class2_Sub2_Sub17_Sub1[Static200.anInt3968];
		for (@Pc(10) int local10 = 0; local10 < Static200.anInt3968; local10++) {
			@Pc(20) int local20 = Static163.anIntArray314[local10] * Static131.anIntArray284[local10];
			@Pc(24) byte[] local24 = Static151.aByteArrayArray14[local10];
			@Pc(27) int[] local27 = new int[local20];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local27[local29] = Static153.anIntArray317[local24[local29] & 0xFF];
			}
			local8[local10] = new Class2_Sub2_Sub17_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[local10], Static124.anIntArray251[local10], Static163.anIntArray314[local10], Static131.anIntArray284[local10], local27);
		}
		Static17.method372();
		return local8;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
	public static void method907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 - arg0;
		@Pc(11) int local11 = arg4 - arg2;
		if (local6 == 0) {
			if (local11 != 0) {
				Static92.method1600(arg3, arg0, arg2, arg4);
			}
		} else if (local11 == 0) {
			Static163.method2502(arg2, arg0, arg3, arg1);
		} else {
			@Pc(44) int local44 = (local11 << 12) / local6;
			@Pc(52) int local52 = arg2 - (arg0 * local44 >> 12);
			@Pc(64) int local64;
			@Pc(66) int local66;
			if (Static209.anInt4155 > arg0) {
				local66 = local52 + (local44 * Static209.anInt4155 >> 12);
				local64 = Static209.anInt4155;
			} else if (Static36.anInt940 >= arg0) {
				local64 = arg0;
				local66 = arg2;
			} else {
				local66 = (Static36.anInt940 * local44 >> 12) + local52;
				local64 = Static36.anInt940;
			}
			if (local66 < Static147.anInt4074) {
				local66 = Static147.anInt4074;
				local64 = (Static147.anInt4074 - local52 << 12) / local44;
			} else if (Static61.anInt1501 < local66) {
				local66 = Static61.anInt1501;
				local64 = (Static61.anInt1501 - local52 << 12) / local44;
			}
			@Pc(136) int local136;
			@Pc(145) int local145;
			if (Static209.anInt4155 > arg1) {
				local145 = (Static209.anInt4155 * local44 >> 12) + local52;
				local136 = Static209.anInt4155;
			} else if (Static36.anInt940 < arg1) {
				local136 = Static36.anInt940;
				local145 = local52 + (Static36.anInt940 * local44 >> 12);
			} else {
				local136 = arg1;
				local145 = arg4;
			}
			if (local145 < Static147.anInt4074) {
				local136 = (Static147.anInt4074 - local52 << 12) / local44;
				local145 = Static147.anInt4074;
			} else if (Static61.anInt1501 < local145) {
				local145 = Static61.anInt1501;
				local136 = (Static61.anInt1501 - local52 << 12) / local44;
			}
			Static69.method1300(local64, local136, local66, local145, arg3);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!rb;IIIII)V")
	public static void method908(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static135.anInt2895) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static35.anInt916) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static31.anInt825 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub23 local62 = Static203.aClass2_Sub23ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static27.anIntArrayArrayArray3[local17][local23][local32] + Static27.anIntArrayArrayArray3[local17][local23 + 1][local32] + Static27.anIntArrayArrayArray3[local17][local23][local32 + 1] + Static27.anIntArrayArrayArray3[local17][local23 + 1][local32 + 1]) / 4 - (Static27.anIntArrayArrayArray3[arg1][arg2][arg3] + Static27.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + Static27.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + Static27.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class105 local151 = local62.aClass105_1;
									if (local151 != null) {
										if (local151.aClass24_11.method2979()) {
											arg0.method2976(local151.aClass24_11, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass24_10 != null && local151.aClass24_10.method2979()) {
											arg0.method2976(local151.aClass24_10, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt3554; local222++) {
										@Pc(228) Class78 local228 = local62.aClass78Array3[local222];
										if (local228 != null && local228.aClass24_4.method2979() && (local23 == local228.anInt3028 || local23 == local3) && (local32 == local228.anInt3036 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt3031 + 1 - local228.anInt3028;
											@Pc(265) int local265 = local228.anInt3040 + 1 - local228.anInt3036;
											arg0.method2976(local228.aClass24_4, (local228.anInt3028 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt3036 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
