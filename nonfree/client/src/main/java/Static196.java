import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!om", name = "P", descriptor = "Lclient!kb;")
	public static Class4_Sub18 aClass4_Sub18_2;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[200];

	@OriginalMember(owner = "client!om", name = "M", descriptor = "[I")
	public static int[] anIntArray322 = new int[500];

	@OriginalMember(owner = "client!om", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean249 = true;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)V")
	public static void method3055() {
		aBooleanArray17 = null;
		aClass4_Sub18_2 = null;
		anIntArray322 = null;
		aStringArray31 = null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I")
	public static int method3056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(19) int local19 = arg0 - 1 & arg2;
		@Pc(23) int local23 = arg2 / arg0;
		@Pc(28) int local28 = Static100.method1636(local7, local23);
		@Pc(35) int local35 = Static100.method1636(local7 + 1, local23);
		@Pc(42) int local42 = Static100.method1636(local7, local23 + 1);
		@Pc(51) int local51 = Static100.method1636(local7 + 1, local23 + 1);
		@Pc(58) int local58 = Static258.method3888(local13, local28, local35, arg0);
		@Pc(65) int local65 = Static258.method3888(local13, local42, local51, arg0);
		return Static258.method3888(local19, local58, local65, arg0);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3057() {
		Static145.aClass33_24.method843();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
	public static void method3058() {
		Static269.anInt5030 = 0;
		Static142.aBoolean192 = false;
		Static60.anInt1152 = 0;
		Static207.anInt4065 = 0;
		Static92.anInt1908 = -1;
		Static251.anInt4741 = -1;
		Static53.anInt1060 = -1;
		Static47.anInt949 = 0;
		Static131.anInt2781 = 0;
		Static235.anInt4579 = -1;
		Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
		Static114.anInt2474 = 0;
		Static101.aClass4_Sub17_Sub1_4.anInt2400 = 0;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static257.aClass12_Sub3_Sub2Array1.length; local35++) {
			if (Static257.aClass12_Sub3_Sub2Array1[local35] != null) {
				Static257.aClass12_Sub3_Sub2Array1[local35].anInt4184 = -1;
			}
		}
		for (local35 = 0; local35 < Static100.aClass12_Sub3_Sub1Array1.length; local35++) {
			if (Static100.aClass12_Sub3_Sub1Array1[local35] != null) {
				Static100.aClass12_Sub3_Sub1Array1[local35].anInt4184 = -1;
			}
		}
		Static2.method14();
		Static239.anInt4616 = 1;
		Static264.method3976(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static222.aBooleanArray20[local35] = true;
		}
		Static183.method2858();
	}
}
