import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!e", name = "kb", descriptor = "Lclient!nl;")
	public static Class171 aClass171_26;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "[I")
	public static final int[] anIntArray283 = new int[13];

	@OriginalMember(owner = "client!e", name = "mb", descriptor = "Lclient!ae;")
	public static Class4 aClass4_8 = null;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	public static void method1081(@OriginalArg(1) int arg0) {
		if (!Static278.aBoolean357) {
			arg0 = -1;
		}
		if (arg0 == Static244.anInt4347) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class232 local23 = Static332.aClass210_1.method4439(arg0);
			@Pc(27) Class86 local27 = local23.method5195();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static359.aClass111_5.method2816(Static257.aCanvas4, local27.method2329(), new Point(local23.anInt5953, local23.anInt5954), local27.method2337(), local27.method2328());
				Static244.anInt4347 = arg0;
			}
		}
		if (arg0 == -1 && Static244.anInt4347 != -1) {
			Static359.aClass111_5.method2816(Static257.aCanvas4, -1, new Point(), null, -1);
			Static244.anInt4347 = -1;
		}
	}
}
