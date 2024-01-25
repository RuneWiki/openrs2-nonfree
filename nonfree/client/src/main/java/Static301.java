import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!qa;")
	public static Class30 aClass30_16;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public static int anInt5585 = 104;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIIIIII)V")
	public static void method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg5);
		@Pc(25) int local25 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg4);
		@Pc(31) int local31 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg1);
		@Pc(37) int local37 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3);
		@Pc(46) int local46 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg5 + arg0);
		@Pc(55) int local55 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg4 - arg0);
		for (@Pc(57) int local57 = local11; local57 < local46; local57++) {
			Static236.method3990(local37, local31, Static400.anIntArrayArray54[local57], arg2);
		}
		for (@Pc(73) int local73 = local25; local73 > local55; local73--) {
			Static236.method3990(local37, local31, Static400.anIntArrayArray54[local73], arg2);
		}
		@Pc(95) int local95 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 + arg1);
		@Pc(103) int local103 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - arg0);
		for (@Pc(105) int local105 = local46; local105 <= local55; local105++) {
			@Pc(111) int[] local111 = Static400.anIntArrayArray54[local105];
			Static236.method3990(local95, local31, local111, arg2);
			Static236.method3990(local37, local103, local111, arg2);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void method4653() {
		Static29.aClass38_93.anInt1056 = 1;
		Static48.method1078();
		Static293.aBoolean387 = true;
		Static155.aBoolean211 = true;
		Static169.method4395();
		for (@Pc(5711) int local5711 = 0; local5711 < Static209.aClass51Array1.length; local5711++) {
			Static209.aClass51Array1[local5711] = null;
		}
		Static449.aBoolean564 = false;
		Static368.method5234();
		Static437.anInt7473 = (int) (Math.random() * 30.0D) - 20;
		Static53.anInt4624 = (int) (Math.random() * 120.0D) - 60;
		Static326.anInt5852 = (int) (Math.random() * 100.0D) - 50;
		Static270.anInt5902 = (int) (Math.random() * 80.0D) - 40;
		Static26.anInt470 = (int) (Math.random() * 110.0D) - 55;
		Static322.aFloat82 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static166.method5268();
		for (@Pc(5785) int local5785 = 0; local5785 < 2048; local5785++) {
			Static39.aClass11_Sub5_Sub2_Sub1Array1[local5785] = null;
		}
		Static328.anInt5871 = 0;
		Static77.anInt1870 = 0;
		Static80.aClass96_8.method2799();
		Static354.aClass91_42.method2582();
		Static325.aClass91_36.method2582();
		Static412.aClass273_5.method6243();
		Static377.aClass96_31.method2799();
		Static190.aClass91_25 = new Class91();
		Static67.aClass224_1.method5155();
		Static219.method3808();
		Static136.anInt2817 = 0;
		Static67.anInt1637 = 0;
		Static285.anInt5311 = 0;
		Static335.anInt5944 = 0;
		Static5.anInt65 = 0;
		Static242.anInt4727 = 0;
		Static372.anInt6454 = 0;
		Static54.anInt1312 = 0;
		Static412.anInt7174 = 0;
		Static111.anInt2407 = 0;
		for (@Pc(5847) int local5847 = 0; local5847 < Static355.anIntArray503.length; local5847++) {
			if (!Static241.aBooleanArray89[local5847]) {
				Static355.anIntArray503[local5847] = -1;
			}
		}
		if (Static248.anInt4793 != -1) {
			Static106.method6188(Static248.anInt4793);
		}
		for (@Pc(5875) Class4_Sub39 local5875 = (Class4_Sub39) Static157.aClass96_22.method2798(); local5875 != null; local5875 = (Class4_Sub39) Static157.aClass96_22.method2796()) {
			if (!local5875.method6325()) {
				local5875 = (Class4_Sub39) Static157.aClass96_22.method2798();
				if (local5875 == null) {
					break;
				}
			}
			Static298.method4546(local5875, true, false);
		}
		Static248.anInt4793 = -1;
		Static157.aClass96_22 = new Class96(8);
		Static193.method3454();
		Static341.aClass240_13 = null;
		for (@Pc(5915) int local5915 = 0; local5915 < 8; local5915++) {
			Static342.aStringArray31[local5915] = null;
			Static390.aBooleanArray134[local5915] = false;
			Static182.anIntArray287[local5915] = -1;
		}
		Static197.method3492();
		Static367.aBoolean547 = true;
		for (@Pc(5941) int local5941 = 0; local5941 < 100; local5941++) {
			Static353.aBooleanArray124[local5941] = true;
		}
		for (@Pc(5955) int local5955 = 0; local5955 < 6; local5955++) {
			Static329.aClass155Array1[local5955] = new Class155();
		}
		for (@Pc(5971) int local5971 = 0; local5971 < 25; local5971++) {
			Static19.anIntArray23[local5971] = 0;
			Static103.anIntArray193[local5971] = 0;
			Static155.anIntArray262[local5971] = 0;
		}
		Static94.method1834();
		Static268.aShortArray86 = Static226.aShortArray66 = Static215.aShortArray72 = Static261.aShortArray78 = new short[256];
		Static110.aBoolean165 = true;
		Static424.aString76 = Static266.aClass21_73.method362(Static168.anInt3290);
		Static424.anInt7324 = 0;
		Static157.aClass185_Sub1_1.aBoolean412 = false;
		Static157.aClass185_Sub1_1.aBoolean411 = false;
		Static402.method5649();
		Static83.method5665();
		Static42.aClass4_Sub23_1 = null;
		Static29.aClass38_93.anInt1056 = 2;
		Static364.aLong187 = 0L;
	}
}
