import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt5350 = 2;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString193 = "";

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
	public static final int[] anIntArray446 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
	public static int method4427() {
		return 6;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method4428() {
		Static229.anImage2 = null;
		Static109.aFont1 = null;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public static void method4431() {
		if (Static181.aClass51_5 == null) {
			return;
		}
		if (Static181.aClass51_5.anInt1229 == 1) {
			Static181.aClass51_5 = null;
			return;
		}
		if (Static181.aClass51_5.anInt1229 == 2) {
			Static184.method3415(2, Static211.aString160, Static281.aClass120_5);
			Static181.aClass51_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	public static void method4432() {
		for (@Pc(8) int local8 = 0; local8 < Static104.anInt6829; local8++) {
			@Pc(14) int local14 = Static49.anIntArray122[local8];
			@Pc(18) Class2_Sub2_Sub1_Sub1 local18 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local14];
			@Pc(22) int local22 = Static200.aClass4_Sub7_Sub1_2.method2380();
			if ((local22 & 0x8) != 0) {
				local22 += Static200.aClass4_Sub7_Sub1_2.method2380() << 8;
			}
			Static55.method1014(local22, local18, local14);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIBI)V")
	public static void method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static338.anInt5369 <= arg2 - arg0 && Static295.anInt5964 >= arg0 + arg2 && arg3 - arg0 >= Static229.anInt4777 && arg3 + arg0 <= Static165.anInt3366) {
			Static136.method2721(arg2, arg1, arg3, arg0);
		} else {
			Static273.method4754(arg0, arg1, arg3, arg2);
		}
	}
}
