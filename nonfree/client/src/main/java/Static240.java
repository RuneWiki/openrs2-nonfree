import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
	public static int anInt4257;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "[I")
	public static final int[] anIntArray252 = new int[2];

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray253 = new int[8];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBIII[B)Z")
	public static boolean method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub4 local17 = new Class3_Sub4(arg4);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method7930();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(44) int local44;
				while (!local36) {
					local44 = local17.method7896();
					if (local44 == 0) {
						continue label56;
					}
					local34 += local44 - 1;
					@Pc(68) int local68 = local34 & 0x3F;
					@Pc(74) int local74 = local34 >> 6 & 0x3F;
					@Pc(80) int local80 = local17.method7954() >> 2;
					@Pc(84) int local84 = local74 + arg0;
					@Pc(88) int local88 = arg2 + local68;
					if (local84 > 0 && local88 > 0 && local84 < arg1 - 1 && local88 < arg3 - 1) {
						@Pc(117) Class216 local117 = Static466.aClass340_6.method7665(local19);
						if (local80 != 22 || Static336.aClass3_Sub41_18.aClass14_Sub23_1.method6428() != 0 || local117.anInt5978 != 0 || local117.anInt5972 == 1 || local117.aBoolean407) {
							if (!local117.method5052()) {
								Static483.anInt7695++;
								local12 = false;
							}
							local36 = true;
						}
					}
				}
				local44 = local17.method7896();
				if (local44 == 0) {
					break;
				}
				local17.method7954();
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg4 && arg6 == arg5 && arg8 == arg7 && arg3 == arg2) {
			Static473.method6295(arg7, arg2, arg0, arg6, arg1);
			return;
		}
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg6;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(73) int local73 = arg7 + local50 - arg1 - local58;
		@Pc(84) int local84 = arg2 + local54 - arg6 - local62;
		@Pc(94) int local94 = local58 + local42 - local50 - local50;
		@Pc(104) int local104 = local62 + local46 - local54 - local54;
		@Pc(109) int local109 = local50 - local42;
		@Pc(114) int local114 = local54 - local46;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local124 * local116 >> 12;
			@Pc(134) int local134 = local73 * local130;
			@Pc(138) int local138 = local130 * local84;
			@Pc(142) int local142 = local94 * local124;
			@Pc(146) int local146 = local104 * local124;
			@Pc(150) int local150 = local109 * local116;
			@Pc(154) int local154 = local116 * local114;
			@Pc(164) int local164 = (local134 + local142 + local150 >> 12) + arg1;
			@Pc(176) int local176 = arg6 + (local154 + local138 + local146 >> 12);
			Static473.method6295(local164, local176, arg0, local38, local36);
			local36 = local164;
			local38 = local176;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIII)V")
	public static void method3645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1006) {
			Static250.method3776(Static5.aClass343_1, arg0, arg1);
		} else if (arg2 == 1007) {
			Static250.method3776(Static133.aClass343_2, arg0, arg1);
		} else if (arg2 == 1010) {
			Static250.method3776(Static484.aClass343_10, arg0, arg1);
		} else if (arg2 == 1011) {
			Static250.method3776(Static228.aClass343_3, arg0, arg1);
		} else if (arg2 == 1001) {
			Static250.method3776(Static508.aClass343_12, arg0, arg1);
		}
	}
}
