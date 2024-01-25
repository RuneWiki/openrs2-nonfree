import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static240 {

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array16;

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
	public static int anInt4900;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
	public static int anInt4897 = 2;

	@OriginalMember(owner = "client!pg", name = "V", descriptor = "S")
	public static short aShort70 = 320;

	@OriginalMember(owner = "client!pg", name = "bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)J")
	public static long method4475() {
		return Static224.aClass115_1.method4524();
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
	public static void method4476() {
		if (Static284.aClass48_12 != null) {
			Static284.aClass48_12.method1833();
		}
		if (Static61.aClass48_4 != null) {
			Static61.aClass48_4.method1833();
		}
		Static65.method5283(Static299.aBoolean302);
		Static284.aClass48_12 = Static353.method5813(22050, Static227.aClass75_5, 0, Static174.aCanvas3);
		Static284.aClass48_12.method1826(Static7.aClass1_Sub6_Sub4_1);
		Static61.aClass48_4 = Static353.method5813(2048, Static227.aClass75_5, 1, Static174.aCanvas3);
		Static61.aClass48_4.method1826(Static324.aClass1_Sub6_Sub3_2);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ct;ZLclient!ct;)V")
	public static void method4477(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		Static200.aClass30_59 = arg1;
		Static55.aClass30_12 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)I")
	public static int method4478(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
