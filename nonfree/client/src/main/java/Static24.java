import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!uh;")
	public static Class240 aClass240_1;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean22 = true;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	public static int[] anIntArray27 = new int[1];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)Z")
	public static boolean method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static10.method5666(arg1, arg0) || Static153.method3783(arg0, arg1) || Static188.method2984(arg0, arg1);
	}
}
