import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static174 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!ln;")
	public static Class204 aClass204_3;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)Z")
	public static boolean method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
