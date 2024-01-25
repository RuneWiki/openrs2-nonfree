import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
	public static int anInt8995;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_93 = new Class94(41, -1);

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "F")
	public static float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_94 = new Class94(46, 2);

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!wb;")
	public static final Class2_Sub50 aClass2_Sub50_2 = new Class2_Sub50(0, -1);

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_199 = new Class215(94, -1);

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "[I")
	public static final int[] anIntArray581 = new int[4096];

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method7546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static365.method6195(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(53) int local53;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		if (arg1 >= Static380.anInt7421 && arg1 <= Static237.anInt5159) {
			@Pc(44) int[] local44 = Static208.anIntArrayArray20[arg1];
			local53 = Static317.method5515(Static38.anInt823, arg5 - arg3, Static161.anInt7734);
			local64 = Static317.method5515(Static38.anInt823, arg5 + arg3, Static161.anInt7734);
			local72 = Static317.method5515(Static38.anInt823, arg5 - local15, Static161.anInt7734);
			local81 = Static317.method5515(Static38.anInt823, arg5 + local15, Static161.anInt7734);
			Static280.method5108(local72, local44, local53, arg0);
			Static280.method5108(local81, local44, local72, arg2);
			Static280.method5108(local64, local44, local81, arg0);
		}
		@Pc(101) int local101 = -1;
		while (local24 > local10) {
			local34 += 2;
			local101 += 2;
			local32 += local101;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static559.anIntArray650[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(254) int local254;
			@Pc(265) int[] local265;
			@Pc(146) int local146;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local146 = arg1 - local24;
				local53 = arg1 + local24;
				if (local53 >= Static380.anInt7421 && Static237.anInt5159 >= local146) {
					if (local15 <= local24) {
						local64 = Static317.method5515(Static38.anInt823, local10 + arg5, Static161.anInt7734);
						local72 = Static317.method5515(Static38.anInt823, arg5 - local10, Static161.anInt7734);
						if (Static237.anInt5159 >= local53) {
							Static280.method5108(local64, Static208.anIntArrayArray20[local53], local72, arg0);
						}
						if (local146 >= Static380.anInt7421) {
							Static280.method5108(local64, Static208.anIntArrayArray20[local146], local72, arg0);
						}
					} else {
						local64 = Static559.anIntArray650[local24];
						local72 = Static317.method5515(Static38.anInt823, local10 + arg5, Static161.anInt7734);
						local81 = Static317.method5515(Static38.anInt823, arg5 - local10, Static161.anInt7734);
						local246 = Static317.method5515(Static38.anInt823, local64 + arg5, Static161.anInt7734);
						local254 = Static317.method5515(Static38.anInt823, arg5 - local64, Static161.anInt7734);
						if (local53 <= Static237.anInt5159) {
							local265 = Static208.anIntArrayArray20[local53];
							Static280.method5108(local254, local265, local81, arg0);
							Static280.method5108(local246, local265, local254, arg2);
							Static280.method5108(local72, local265, local246, arg0);
						}
						if (Static380.anInt7421 <= local146) {
							local265 = Static208.anIntArrayArray20[local146];
							Static280.method5108(local254, local265, local81, arg0);
							Static280.method5108(local246, local265, local254, arg2);
							Static280.method5108(local72, local265, local246, arg0);
						}
					}
				}
			}
			local146 = arg1 - local10;
			local53 = arg1 + local10;
			if (local53 >= Static380.anInt7421 && local146 <= Static237.anInt5159) {
				local64 = local24 + arg5;
				local72 = arg5 - local24;
				if (Static161.anInt7734 <= local64 && local72 <= Static38.anInt823) {
					local64 = Static317.method5515(Static38.anInt823, local64, Static161.anInt7734);
					local72 = Static317.method5515(Static38.anInt823, local72, Static161.anInt7734);
					if (local15 <= local10) {
						if (local53 <= Static237.anInt5159) {
							Static280.method5108(local64, Static208.anIntArrayArray20[local53], local72, arg0);
						}
						if (Static380.anInt7421 <= local146) {
							Static280.method5108(local64, Static208.anIntArrayArray20[local146], local72, arg0);
						}
					} else {
						local81 = local29 < local10 ? Static559.anIntArray650[local10] : local29;
						local246 = Static317.method5515(Static38.anInt823, local81 + arg5, Static161.anInt7734);
						local254 = Static317.method5515(Static38.anInt823, arg5 - local81, Static161.anInt7734);
						if (local53 <= Static237.anInt5159) {
							local265 = Static208.anIntArrayArray20[local53];
							Static280.method5108(local254, local265, local72, arg0);
							Static280.method5108(local246, local265, local254, arg2);
							Static280.method5108(local64, local265, local246, arg0);
						}
						if (local146 >= Static380.anInt7421) {
							local265 = Static208.anIntArrayArray20[local146];
							Static280.method5108(local254, local265, local72, arg0);
							Static280.method5108(local246, local265, local254, arg2);
							Static280.method5108(local64, local265, local246, arg0);
						}
					}
				}
			}
		}
	}
}
