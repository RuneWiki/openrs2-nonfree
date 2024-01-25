import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "Lclient!wc;")
	public static Class387 aClass387_9;

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "Lclient!gda;")
	public static Class126 aClass126_284;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "Lclient!eh;")
	public static final Class94 aClass94_4 = new Class94();

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
	public static void method8479() {
		if (!Static571.aBoolean596) {
			return;
		}
		while (true) {
			while (Static592.aClass51_Sub1Array2.length > Static336.anInt5636) {
				@Pc(29) Class51_Sub1 local29 = Static592.aClass51_Sub1Array2[Static336.anInt5636];
				if (local29 != null && local29.anInt3951 == -1) {
					if (Static311.aClass5_Sub16_1 == null) {
						Static311.aClass5_Sub16_1 = Static184.aClass273_1.method6216(local29.aString37);
					}
					@Pc(58) int local58 = Static311.aClass5_Sub16_1.anInt1946;
					if (local58 == -1) {
						return;
					}
					Static336.anInt5636++;
					Static311.aClass5_Sub16_1 = null;
					local29.anInt3951 = local58;
				} else {
					Static336.anInt5636++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method8480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg6 && arg3 == arg8 && arg7 == arg4 && arg1 == arg5) {
			Static149.method2750(arg5, arg8, arg4, arg6, arg2);
			return;
		}
		@Pc(44) int local44 = arg6;
		@Pc(46) int local46 = arg8;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(66) int local66 = arg7 * 3;
		@Pc(70) int local70 = arg1 * 3;
		@Pc(80) int local80 = local58 + arg4 - local66 - arg6;
		@Pc(89) int local89 = arg5 + local62 - local70 - arg8;
		@Pc(98) int local98 = local50 + local66 - local58 - local58;
		@Pc(108) int local108 = local70 + local54 - local62 - local62;
		@Pc(113) int local113 = local58 - local50;
		@Pc(118) int local118 = local62 - local54;
		for (@Pc(120) int local120 = 128; local120 <= 4096; local120 += 128) {
			@Pc(128) int local128 = local120 * local120 >> 12;
			@Pc(134) int local134 = local120 * local128 >> 12;
			@Pc(138) int local138 = local134 * local80;
			@Pc(142) int local142 = local134 * local89;
			@Pc(146) int local146 = local98 * local128;
			@Pc(150) int local150 = local108 * local128;
			@Pc(154) int local154 = local120 * local113;
			@Pc(158) int local158 = local118 * local120;
			@Pc(168) int local168 = arg6 + (local138 + local146 + local154 >> 12);
			@Pc(180) int local180 = arg8 + (local158 + local142 + local150 >> 12);
			Static149.method2750(local180, local46, local168, local44, arg2);
			local44 = local168;
			local46 = local180;
		}
	}
}
