import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt7829;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!et;")
	public static Class91 aClass91_14 = null;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
	public static final int[] anIntArray727 = new int[1];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
	public static void method6924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static296.anInt7159 == 1) {
			Static407.aClass104Array70[Static417.anInt7303 / 100].method7716(Static127.anInt2590 - 8, Static464.anInt8000 + -8);
		}
		if (Static296.anInt7159 == 2) {
			Static407.aClass104Array70[Static417.anInt7303 / 100 + 4].method7716(Static127.anInt2590 - 8, Static464.anInt8000 + -8);
		}
		Static211.method3918();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)Z")
	public static boolean method6927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
