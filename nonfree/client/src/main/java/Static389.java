import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!pia;")
	public static final Class291 aClass291_6 = new Class291();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)Z")
	public static boolean method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static267.method3771(arg1, arg0) || Static13.method212(arg1, arg0);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	public static int method5820() {
		return Static167.anIntArray217 == null ? 0 : Static167.anIntArray217.length * 2;
	}
}
