import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!ai;")
	public static Class9 aClass9_1 = Static25.method468();

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
	public static int[] anIntArray449 = new int[50];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3873(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method3874(@OriginalArg(1) int arg0) {
		if (arg0 == Static224.anInt4349) {
			@Pc(15) Interface2 local15 = Static278.anInterface2Array1[arg0];
			local15.method3763(Static106.anInt2117);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public static void method3876(@OriginalArg(0) int arg0) {
		Static312.method4591();
		Static10.method151();
		@Pc(17) int local17 = Static93.method1378(arg0).anInt1016;
		if (local17 == 0) {
			return;
		}
		@Pc(25) int local25 = Static46.anIntArray78[arg0];
		if (local17 == 6) {
			Static114.anInt2268 = local25;
		}
		if (local17 == 9) {
			Static203.anInt4053 = local25;
		}
		if (local17 == 5) {
			Static287.anInt5451 = local25;
		}
	}
}
