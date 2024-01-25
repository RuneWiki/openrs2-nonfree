import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
	public static int anInt5912;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	public static int anInt5916;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_48 = new Class126(8);

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "[I")
	public static final int[] anIntArray391 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)Z")
	public static boolean method4623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static452.method5952(arg1, arg0) || Static40.method776(arg0, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)Z")
	public static boolean method4624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static164.method2715(arg1, arg0) | Static223.method5947(arg0, arg1)) & Static332.method4457(arg1, arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
	public static void method4626(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static9.aByteArrayArrayArray1 = new byte[4][arg1][arg0];
	}
}
