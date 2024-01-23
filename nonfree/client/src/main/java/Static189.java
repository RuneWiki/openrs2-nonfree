import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
	public static boolean aBoolean320 = true;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public static int anInt4950 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)I")
	public static int method3929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg0;
			arg0 = local14;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 7 + 1 - arg1 - arg4;
		} else if (local7 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method3930() {
		Static218.aByteArrayArrayArray21 = null;
		Static121.anIntArray239 = null;
		Static200.aByteArrayArrayArray12 = null;
		Static179.anIntArray299 = null;
		Static227.aByteArrayArrayArray14 = null;
		Static210.anIntArray373 = null;
		Static126.anIntArray243 = null;
		Static84.anIntArrayArrayArray6 = null;
		Static280.anIntArray472 = null;
		Static81.aByteArrayArrayArray15 = null;
		Static125.anIntArray242 = null;
		Static84.aByteArrayArrayArray4 = null;
	}
}
