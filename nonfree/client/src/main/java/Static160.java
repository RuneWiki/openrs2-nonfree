import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
	public static int[] anIntArray301 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2575(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < Static272.anInt5215; local20++) {
			if (arg0.equalsIgnoreCase(Static181.aStringArray23[local20])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static154.aClass53_Sub1_Sub1_2.aString88)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method2576() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static137.aBooleanArray13[local7] = false;
		}
		Static194.anInt5196 = -1;
		Static253.anInt4839 = 0;
		Static11.anInt212 = 0;
		Static153.anInt3024 = -1;
		Static41.anInt772 = 1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([II)[I")
	public static int[] method2579(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) int[] local18 = new int[arg0.length];
			Static316.method74(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public static void method2580() {
		if (!Static94.aBoolean138 || Static143.aBoolean189) {
			return;
		}
		@Pc(22) Class4_Sub19[][][] local22 = Static6.aClass4_Sub19ArrayArrayArray1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(32) Class4_Sub19[][] local32 = local22[local24];
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				for (@Pc(44) int local44 = 0; local44 < local32[local34].length; local44++) {
					@Pc(60) Class4_Sub19 local60 = local32[local34][local44];
					if (local60 != null) {
						@Pc(76) Class53_Sub4_Sub2 local76;
						if (local60.aClass42_1 != null && local60.aClass42_1.aClass53_2 instanceof Class53_Sub4_Sub2) {
							local76 = (Class53_Sub4_Sub2) local60.aClass42_1.aClass53_2;
							if ((Long.MIN_VALUE & local60.aClass42_1.aLong45) == 0L) {
								local76.method3909(false, true, true, false, true, true);
							} else {
								local76.method3909(true, true, true, true, true, true);
							}
						}
						if (local60.aClass186_1 != null) {
							if (local60.aClass186_1.aClass53_10 instanceof Class53_Sub4_Sub2) {
								local76 = (Class53_Sub4_Sub2) local60.aClass186_1.aClass53_10;
								if ((local60.aClass186_1.aLong199 & Long.MIN_VALUE) == 0L) {
									local76.method3909(false, true, true, false, true, true);
								} else {
									local76.method3909(true, true, true, true, true, true);
								}
							}
							if (local60.aClass186_1.aClass53_9 instanceof Class53_Sub4_Sub2) {
								local76 = (Class53_Sub4_Sub2) local60.aClass186_1.aClass53_9;
								if ((Long.MIN_VALUE & local60.aClass186_1.aLong199) == 0L) {
									local76.method3909(false, true, true, false, true, true);
								} else {
									local76.method3909(true, true, true, true, true, true);
								}
							}
						}
						if (local60.aClass182_1 != null) {
							if (local60.aClass182_1.aClass53_5 instanceof Class53_Sub4_Sub2) {
								local76 = (Class53_Sub4_Sub2) local60.aClass182_1.aClass53_5;
								if ((Long.MIN_VALUE & local60.aClass182_1.aLong193) == 0L) {
									local76.method3909(false, true, true, false, true, true);
								} else {
									local76.method3909(true, true, true, true, true, true);
								}
							}
							if (local60.aClass182_1.aClass53_4 instanceof Class53_Sub4_Sub2) {
								local76 = (Class53_Sub4_Sub2) local60.aClass182_1.aClass53_4;
								if ((local60.aClass182_1.aLong193 & Long.MIN_VALUE) == 0L) {
									local76.method3909(false, true, true, false, true, true);
								} else {
									local76.method3909(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(269) int local269 = 0; local269 < local60.anInt3554; local269++) {
							if (local60.aClass33Array3[local269].aClass53_1 instanceof Class53_Sub4_Sub2) {
								@Pc(288) Class53_Sub4_Sub2 local288 = (Class53_Sub4_Sub2) local60.aClass33Array3[local269].aClass53_1;
								if ((Long.MIN_VALUE & local60.aClass33Array3[local269].aLong38) == 0L) {
									local288.method3909(false, true, true, false, true, true);
								} else {
									local288.method3909(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static143.aBoolean189 = true;
	}
}
