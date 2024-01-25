import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "J")
	public static long aLong280;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public static int anInt9720 = 0;

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "[I")
	public static final int[] anIntArray668 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "[I")
	public static final int[] anIntArray669 = new int[32];

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
	public static int anInt9724 = -1;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!mga;)I")
	public static int method8335(@OriginalArg(1) Class230 arg0) {
		if (arg0 == Static41.aClass230_1) {
			return 5890;
		} else if (arg0 == Static621.aClass230_4) {
			return 34167;
		} else if (arg0 == Static238.aClass230_3) {
			return 34168;
		} else if (arg0 == Static228.aClass230_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBIIIII)V")
	public static void method8337(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class3_Sub9 local15 = (Class3_Sub9) Static505.aClass236_6.method4958(); local15 != null; local15 = (Class3_Sub9) Static505.aClass236_6.method4950()) {
			if (local15.anInt10328 <= Static177.anInt3088) {
				local15.method8898();
			} else {
				Static28.method643((local15.anInt10338 << 9) + 256, local15.anInt10330 * 2, (local15.anInt10334 << 9) + 256, local15.anInt10337, arg0 >> 1, arg3 >> 1);
				Static344.aClass56_10.method8054(local15.aString123, 0, local15.anInt10332 | 0xFF000000, Static519.anIntArray552[1] + arg2, Static519.anIntArray552[0] + arg1);
			}
		}
	}
}
