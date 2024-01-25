import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static427 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt7834;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	public static boolean method6612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static269.method8258(arg0, arg1) | (arg1 & 0x40000) != 0 || Static290.method5003(arg0, arg1);
	}
}
