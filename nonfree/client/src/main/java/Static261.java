import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!cg;")
	public static Class22 aClass22_88;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!cg;")
	public static Class22 aClass22_89;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!kh;")
	public static Class91 aClass91_3;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[[[Lclient!k;")
	public static Class4_Sub21[][][] aClass4_Sub21ArrayArrayArray4;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_10;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString172 = "white:";

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public static int method4050() {
		if ((double) Static5.aFloat4 == 3.0D) {
			return 37;
		} else if ((double) Static5.aFloat4 == 4.0D) {
			return 50;
		} else if ((double) Static5.aFloat4 == 6.0D) {
			return 75;
		} else if ((double) Static5.aFloat4 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method4052() {
		Static256.aClass4_Sub24_Sub1_3.method3126();
		@Pc(13) int local13 = Static256.aClass4_Sub24_Sub1_3.method3132(8);
		@Pc(22) int local22;
		if (local13 < Static99.anInt1950) {
			for (local22 = local13; local22 < Static99.anInt1950; local22++) {
				Static3.anIntArray3[Static105.anInt2109++] = Static123.anIntArray214[local22];
			}
		}
		if (Static99.anInt1950 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static99.anInt1950 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(66) int local66 = Static123.anIntArray214[local22];
			@Pc(70) Class13_Sub5_Sub2 local70 = Static260.aClass13_Sub5_Sub2Array114[local66];
			@Pc(75) int local75 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			if (local75 == 0) {
				Static123.anIntArray214[Static99.anInt1950++] = local66;
				local70.anInt5329 = Static50.anInt1118;
			} else {
				@Pc(99) int local99 = Static256.aClass4_Sub24_Sub1_3.method3132(2);
				if (local99 == 0) {
					Static123.anIntArray214[Static99.anInt1950++] = local66;
					local70.anInt5329 = Static50.anInt1118;
					Static148.anIntArray237[Static291.anInt5649++] = local66;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local99 == 1) {
						Static123.anIntArray214[Static99.anInt1950++] = local66;
						local70.anInt5329 = Static50.anInt1118;
						local148 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
						local70.method4210(1, local148);
						local158 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
						if (local158 == 1) {
							Static148.anIntArray237[Static291.anInt5649++] = local66;
						}
					} else if (local99 == 2) {
						Static123.anIntArray214[Static99.anInt1950++] = local66;
						local70.anInt5329 = Static50.anInt1118;
						if (Static256.aClass4_Sub24_Sub1_3.method3132(1) == 1) {
							local148 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local70.method4210(2, local148);
							local158 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local70.method4210(2, local158);
						} else {
							local148 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
							local70.method4210(0, local148);
						}
						local148 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
						if (local148 == 1) {
							Static148.anIntArray237[Static291.anInt5649++] = local66;
						}
					} else if (local99 == 3) {
						Static3.anIntArray3[Static105.anInt2109++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	public static void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
		Static175.aClass4_Sub24_Sub1_1.method3116(20);
		Static175.aClass4_Sub24_Sub1_1.method3116(arg3);
		Static175.aClass4_Sub24_Sub1_1.method3116(arg1);
		Static175.aClass4_Sub24_Sub1_1.method3105(arg0);
		Static175.aClass4_Sub24_Sub1_1.method3105(arg2);
		Static195.anInt3936 = 0;
		Static170.anInt3406 = -3;
		Static228.anInt4576 = 1;
		Static238.anInt3859 = 0;
	}
}
