import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "Lclient!c;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "[I")
	public static final int[] anIntArray84 = new int[1024];

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(ZII)Z")
	public static boolean method624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
