import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt3786;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static final int[] anIntArray320 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_54 = new Class25(4, -1);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public static boolean method3379(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method3381() {
		Static58.anInt1221 = -1;
		Static278.anInt4731 = -1;
		Static392.anInt6523 = 0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Z")
	public static boolean method3382() {
		return Static411.aBoolean471;
	}
}
