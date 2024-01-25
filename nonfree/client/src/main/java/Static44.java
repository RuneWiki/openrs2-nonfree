import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_34;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "[J")
	public static final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
