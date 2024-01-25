import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!vb;")
	public static Class251 aClass251_4;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	public static int anInt1453 = 2;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1145(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static459.method1552(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZ)I")
	public static int method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(44) int local44 = Static182.method2942(arg0 - 1, arg1 + -1) + Static182.method2942(arg0 + 1, arg1 + -1) + Static182.method2942(arg0 - 1, arg1 + 1) + Static182.method2942(arg0 + 1, arg1 + 1);
		@Pc(74) int local74 = Static182.method2942(arg0 - 1, arg1) + Static182.method2942(arg0 + 1, arg1) + Static182.method2942(arg0, arg1 + -1) + Static182.method2942(arg0, arg1 + 1);
		@Pc(84) int local84 = Static182.method2942(arg0, arg1);
		return local44 / 16 + local74 / 8 + local84 / 4;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static60.method911(arg0, arg1) | (arg1 & 0x2000) != 0 | Static155.method2471(arg1, arg0)) & Static233.method3384(arg0, arg1);
	}
}
