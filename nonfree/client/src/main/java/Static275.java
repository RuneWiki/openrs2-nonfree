import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt4732 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
	public static boolean method3737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static367.method4802(arg0, arg1)) {
			return Static206.method2989(arg1, arg0) | (arg1 & 0xB000) != 0 | Static86.method5984(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static421.method5391(arg0, arg1) | Static220.method3165(arg1, arg0));
		} else {
			return false;
		}
	}
}
