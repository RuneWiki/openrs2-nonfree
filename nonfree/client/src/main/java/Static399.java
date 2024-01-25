import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static399 {

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
	public static int anInt6930;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)Z")
	public static boolean method6178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
