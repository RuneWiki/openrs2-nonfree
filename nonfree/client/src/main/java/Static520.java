import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray86 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_163 = new Class133(18, -1);

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[200];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)V")
	public static void method7395(@OriginalArg(1) int arg0) {
		if (Static249.anInt5108 == arg0) {
			return;
		}
		Static118.anInt2527 = Static549.anInt9482 = Static230.anIntArray442[arg0];
		Static249.method4286();
		Static109.anIntArrayArrayArray4 = new int[4][Static118.anInt2527 >> 3][Static549.anInt9482 >> 3];
		Static405.anIntArrayArray72 = new int[Static118.anInt2527][Static549.anInt9482];
		Static169.anIntArrayArray42 = new int[Static118.anInt2527][Static549.anInt9482];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static95.aClass306Array1[local45] = Static486.method6552(Static118.anInt2527, Static549.anInt9482);
		}
		Static58.aByteArrayArrayArray2 = new byte[4][Static118.anInt2527][Static549.anInt9482];
		Static62.method7107(Static549.anInt9482, Static118.anInt2527);
		Static89.method1813(Static118.anInt2527 >> 3, Static121.aClass5_7, Static549.anInt9482 >> 3);
		Static249.anInt5108 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BIZI)[B")
	public static byte[] method7396(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static559.method5957(arg0, arg1, local11, 0, 32768);
		return local11;
	}
}
