import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public static int anInt4591 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
	public static int method3615(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!km;)V")
	public static void method3616(@OriginalArg(1) Class91 arg0) {
		Static84.anInt1889 = arg0.method2504("runes");
	}
}
