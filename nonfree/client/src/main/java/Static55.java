import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt1260 = 0;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
	public static int[] anIntArray97 = new int[500];

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString63 = "Loading sprites - ";

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString64 = "purple:";

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method1084() {
		Static28.aClass46_5.method1077();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method1085() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static165.aBooleanArray16[local11] = true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public static int method1087(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
	public static int method1088(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
