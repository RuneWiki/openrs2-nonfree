import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static173 {

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public static final int anInt3042 = 328;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z")
	public static boolean method2843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V")
	public static void method2844(@OriginalArg(0) int arg0) {
		Static591.anInt9102 = arg0;
		Static294.anInt4646 = -1;
		Static300.anInt4711 = 100;
		Static215.anInt3479 = 3;
	}
}
