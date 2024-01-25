import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public static int anInt3495;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public static int anInt3497;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	public static int anInt3498;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	public static int anInt3501;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
	public static void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static427.anIntArrayArray176 != null) {
			Static427.anIntArrayArray176[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static131.aShortArrayArray3 != null) {
			Static131.aShortArrayArray3[arg0][arg1] = (short) arg3;
		}
		if (Static182.aByteArrayArray11 != null) {
			Static182.aByteArrayArray11[arg0][arg1] = (byte) arg4;
		}
	}
}
