import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
	public static int anInt6510 = 0;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)Z")
	public static boolean method4972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
