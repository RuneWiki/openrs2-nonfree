import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!u;")
	public static Class357 aClass357_3;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_227 = new Class160(75, 6);

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
	public static void method7911() {
		Static120.method1873(Static181.aClass14_Sub26_9.aClass43_Sub29_1.method8277());
		@Pc(19) int local19 = (Static70.anInt1085 >> 12) + (Static36.anInt617 >> 3);
		Static391.anInt6811 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 = 0;
		@Pc(32) int local32 = (Static550.anInt9242 >> 3) + (Static229.anInt4393 >> 12);
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2897(8, 8);
		Static634.anIntArray558 = new int[18];
		Static157.anIntArrayArray16 = new int[18][4];
		Static103.aByteArrayArray3 = new byte[18][];
		Static601.aByteArrayArray29 = new byte[18][];
		Static73.aByteArrayArray2 = new byte[18][];
		Static250.anIntArray238 = new int[18];
		Static511.aByteArrayArray23 = new byte[18][];
		Static495.anIntArray447 = new int[18];
		Static475.aByteArrayArray20 = new byte[18][];
		Static535.anIntArray475 = new int[18];
		Static365.anIntArray336 = new int[18];
		Static47.anIntArray50 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(97) int local97;
		for (@Pc(87) int local87 = (local19 - (Static380.anInt6689 >> 4)) / 8; local87 <= ((Static380.anInt6689 >> 4) + local19) / 8; local87++) {
			for (local97 = (local32 - (Static542.anInt9214 >> 4)) / 8; local97 <= (local32 + (Static542.anInt9214 >> 4)) / 8; local97++) {
				@Pc(105) int local105 = local97 + (local87 << 8);
				Static365.anIntArray336[local78] = local105;
				Static535.anIntArray475[local78] = Static655.aClass310_132.method7794("m" + local87 + "_" + local97);
				Static634.anIntArray558[local78] = Static655.aClass310_132.method7794("l" + local87 + "_" + local97);
				Static47.anIntArray50[local78] = Static655.aClass310_132.method7794("n" + local87 + "_" + local97);
				Static495.anIntArray447[local78] = Static655.aClass310_132.method7794("um" + local87 + "_" + local97);
				Static250.anIntArray238[local78] = Static655.aClass310_132.method7794("ul" + local87 + "_" + local97);
				if (Static47.anIntArray50[local78] == -1) {
					Static535.anIntArray475[local78] = -1;
					Static634.anIntArray558[local78] = -1;
					Static495.anIntArray447[local78] = -1;
					Static250.anIntArray238[local78] = -1;
				}
				local78++;
			}
		}
		for (local97 = local78; local97 < Static47.anIntArray50.length; local97++) {
			Static47.anIntArray50[local97] = -1;
			Static535.anIntArray475[local97] = -1;
			Static634.anIntArray558[local97] = -1;
			Static495.anIntArray447[local97] = -1;
			Static250.anIntArray238[local97] = -1;
		}
		@Pc(293) byte local293;
		if (Static387.anInt9114 == 3) {
			local293 = 4;
		} else if (Static387.anInt9114 == 9) {
			local293 = 10;
		} else if (Static387.anInt9114 == 7) {
			local293 = 8;
		} else {
			throw new RuntimeException(String.valueOf(Static387.anInt9114));
		}
		Static333.method8696(false, local293, local19, local32);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIFFF)F")
	public static float method7912(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static153.aFloatArrayArray1[arg0];
		return local7[0] * arg2 + arg3 * local7[1] + local7[2] * arg1;
	}
}
