import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "Lclient!jl;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public static int anInt1106 = 0;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V")
	public static void method1057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static14.anInt433 = arg2;
		Static6.anInt223 = arg0;
		Static250.anInt4333 = arg3;
		Static359.anInt6157 = arg1;
		Static282.anInt4836 = arg4;
		if (Static359.anInt6157 >= 100) {
			@Pc(26) int local26 = Static250.anInt4333 * 512 + 256;
			@Pc(32) int local32 = Static6.anInt223 * 512 + 256;
			@Pc(40) int local40 = Static284.method4118(local26, Static253.anInt4353, local32) - Static282.anInt4836;
			@Pc(44) int local44 = local26 - Static23.anInt564;
			@Pc(49) int local49 = local40 - Static170.anInt2855;
			@Pc(54) int local54 = local32 - Static542.anInt9140;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local44 * local44 + local54 * local54));
			Static598.anInt9788 = (int) (Math.atan2((double) local49, (double) local66) * 2607.5945876176133D) & 0x3FFF;
			Static672.anInt10375 = (int) (-2607.5945876176133D * Math.atan2((double) local44, (double) local54)) & 0x3FFF;
			Static536.anInt8770 = 0;
			if (Static598.anInt9788 < 1024) {
				Static598.anInt9788 = 1024;
			}
			if (Static598.anInt9788 > 3072) {
				Static598.anInt9788 = 3072;
			}
		}
		Static258.anInt4491 = -1;
		Static601.anInt9806 = -1;
		Static407.anInt6820 = 2;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIII)V")
	public static void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static528.anInt5369 / (float) Static528.anInt5364;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(44) int local44 = arg1 - (arg0 - local13) / 2;
		@Pc(53) int local53 = arg3 - (arg2 - local11) / 2;
		Static428.anInt7352 = -1;
		Static417.anInt7258 = local53 * Static528.anInt5364 / local11;
		Static360.anInt9757 = -1;
		Static490.anInt8337 = Static528.anInt5369 - local44 * Static528.anInt5369 / local13;
		Static524.method7853();
	}
}
