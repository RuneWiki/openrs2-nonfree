import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_29;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "[I")
	public static int[] anIntArray255 = new int[200];

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_696 = Static169.method2903("Loading title screen )2 ");

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_697 = Static169.method2903("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_698 = aClass23_696;

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_699 = Static169.method2903("(U0a )2 via: ");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method1249() {
		aClass23_699 = null;
		aClass23_696 = null;
		aClass23_697 = null;
		anIntArray255 = null;
		aLongArray4 = null;
		aClass30_29 = null;
		aClass23_698 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(BII)I")
	public static int method1250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static106.method1842(4, arg0 + 91923, arg1 + 45365) + (Static106.method1842(2, arg0 + 37821, arg1 - -10294) - 128 >> 1) + (Static106.method1842(1, arg0, arg1) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1251(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(5) byte[] local5 = new byte[local2];
		Static184.method628(arg0, 0, local5, 0, local2);
		return local5;
	}
}
