import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static494 {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public static int anInt8656;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
	public static int[] anIntArray759;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	public static int anInt8660 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z")
	public static boolean method7576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static336.method5672(arg0, arg1) || Static263.method4733(arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)I")
	public static int method7577(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
