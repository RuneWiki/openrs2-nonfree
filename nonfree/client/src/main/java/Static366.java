import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!mfa", name = "y", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!mfa", name = "z", descriptor = "Lclient!jj;")
	public static Class182 aClass182_2;

	@OriginalMember(owner = "client!mfa", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
	public static int anInt6248 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)Z")
	public static boolean method5268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static489.method6455(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static131.method2235(arg0, arg1) | Static35.method721(arg1, arg0));
	}
}
