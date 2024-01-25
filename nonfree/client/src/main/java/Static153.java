import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
	public static int anInt2553;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
	public static int anInt2554 = 100;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public static boolean method2167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
