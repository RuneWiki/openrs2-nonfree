import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBII)Lclient!qb;")
	public static Class6_Sub1_Sub2 method2106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class290 local11 = Static279.aClass290ArrayArrayArray7[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class6_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class98 local22 = local11.aClass98_3; local22 != null; local22 = local22.aClass98_1) {
			@Pc(26) Class6_Sub1 local26 = local22.aClass6_Sub1_1;
			if (local26 instanceof Class6_Sub1_Sub2) {
				@Pc(32) Class6_Sub1_Sub2 local32 = (Class6_Sub1_Sub2) local26;
				@Pc(42) int local42 = (local32.method7083() - 1) * 256 + 252;
				@Pc(50) int local50 = local32.anInt8811 - local42 >> 9;
				@Pc(58) int local58 = local32.anInt8813 - local42 >> 9;
				@Pc(65) int local65 = local42 + local32.anInt8811 >> 9;
				@Pc(72) int local72 = local32.anInt8813 + local42 >> 9;
				if (arg2 >= local50 && arg0 >= local58 && arg2 <= local65 && arg0 <= local72) {
					@Pc(102) int local102 = (local72 + 1 - arg0) * (-arg2 + 1 + local65);
					if (local19 < local102) {
						local17 = local32;
						local19 = local102;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIB)V")
	public static void method2109(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static382.anInt7091 == 0) {
			Static308.method5029(false);
		} else {
			Static484.anInt8684 = Static382.anInt7091;
			Static269.method4698(0);
		}
		Static340.anInt6417 = arg2;
		Static356.aBoolean426 = arg0;
		Static338.anInt6411 = arg3;
		Static55.method1841(arg1);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method2114() {
		if (Static30.aBoolean194) {
			return;
		}
		Static256.aBoolean354 = true;
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean604) {
			Static343.aFloat198 = (int) Static343.aFloat198 - 17 & 0xFFFFFFF0;
		} else {
			Static481.aFloat254 += (-12.0F - Static481.aFloat254) / 2.0F;
		}
		Static30.aBoolean194 = true;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V")
	public static void method2115() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static270.aClass284Array1[local12] = null;
		}
		Static211.anInt4643 = 0;
	}
}
