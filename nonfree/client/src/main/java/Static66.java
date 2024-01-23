import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_12;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
	public static int[] anIntArray190 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!kh;")
	private static Class60 aClass60_518 = Static200.method3116("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_519 = aClass60_518;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[I)[I")
	public static int[] method1179(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static221.method32(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lclient!ce;")
	public static Class16 method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass16_1 == null ? null : local7.aClass16_1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!dd;IIIII)V")
	public static void method1181(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static55.anInt1475) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static83.anInt1959) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static150.anInt3350 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub22 local62 = Static100.aClass1_Sub22ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static138.anIntArrayArrayArray17[local17][local23][local32] + Static138.anIntArrayArrayArray17[local17][local23 + 1][local32] + Static138.anIntArrayArrayArray17[local17][local23][local32 + 1] + Static138.anIntArrayArrayArray17[local17][local23 + 1][local32 + 1]) / 4 - (Static138.anIntArrayArrayArray17[arg1][arg2][arg3] + Static138.anIntArrayArrayArray17[arg1][arg2 + 1][arg3] + Static138.anIntArrayArrayArray17[arg1][arg2][arg3 + 1] + Static138.anIntArrayArrayArray17[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class47 local151 = local62.aClass47_1;
									if (local151 != null) {
										if (local151.aClass9_4.method2896()) {
											arg0.method2900(local151.aClass9_4, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass9_5 != null && local151.aClass9_5.method2896()) {
											arg0.method2900(local151.aClass9_5, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt3358; local222++) {
										@Pc(228) Class29 local228 = local62.aClass29Array3[local222];
										if (local228 != null && local228.aClass9_3.method2896() && (local23 == local228.anInt1437 || local23 == local3) && (local32 == local228.anInt1423 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt1430 + 1 - local228.anInt1437;
											@Pc(265) int local265 = local228.anInt1431 + 1 - local228.anInt1423;
											arg0.method2900(local228.aClass9_3, (local228.anInt1437 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt1423 - arg3) * 128 + (local265 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V")
	public static void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static67.anInt1657 == 0 || arg1 == 0 || Static196.anInt4181 >= 50 || arg0 == -1) {
			return;
		}
		Static158.anIntArray456[Static196.anInt4181] = arg0;
		Static4.anIntArray12[Static196.anInt4181] = arg1;
		Static32.anIntArray112[Static196.anInt4181] = arg2;
		Static73.aClass30Array1[Static196.anInt4181] = null;
		Static154.anIntArray446[Static196.anInt4181] = 0;
		Static196.anInt4181++;
	}
}
