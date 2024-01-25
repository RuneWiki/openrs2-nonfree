import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[I")
	public static final int[] anIntArray547 = new int[4096];

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public static int anInt6428 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([[IB)V")
	public static void method4993(@OriginalArg(0) int[][] arg0) {
		Static229.anIntArrayArray26 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)[Lclient!sn;")
	public static Class225[] method4995() {
		return new Class225[] { Static7.aClass225_1, Static251.aClass225_12, Static351.aClass225_15, Static83.aClass225_4, Static128.aClass225_9, Static289.aClass225_13, Static21.aClass225_3, Static378.aClass225_17, Static364.aClass225_16, Static115.aClass225_8, Static350.aClass225_14, Static194.aClass225_10, Static99.aClass225_5, Static323.aClass225_7, Static200.aClass225_11 };
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
	public static void method4996() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static138.aBooleanArray11[local3] = false;
		}
		Static334.anInt5640 = 0;
		Static414.anInt6776 = 1;
		Static27.anInt2471 = -1;
		Static98.anInt1863 = 0;
		Static96.anInt1857 = -1;
	}
}
