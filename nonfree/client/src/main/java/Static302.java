import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "Lclient!jj;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_29 = new Class244();

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "[Lclient!wv;")
	public static final Class272[] aClass272Array1 = new Class272[2048];

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
	public static final int[] anIntArray394 = new int[5];

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method3943() {
		Static185.method2556((long) Static265.anInt4371, Static39.aClass135_1);
		if (Static182.anInt3346 != -1) {
			Static44.method584(Static182.anInt3346);
		}
		for (@Pc(19) int local19 = 0; local19 < Static177.anInt3224; local19++) {
			if (Static72.aBooleanArray7[local19]) {
				Static324.aBooleanArray26[local19] = true;
			}
			Static154.aBooleanArray15[local19] = Static72.aBooleanArray7[local19];
			Static72.aBooleanArray7[local19] = false;
		}
		Static173.anInt3128 = Static265.anInt4371;
		if (Static39.aClass135_1.method5367()) {
			Static50.aBoolean47 = true;
		}
		if (Static182.anInt3346 != -1) {
			Static177.anInt3224 = 0;
			Static57.method812();
		}
		Static39.aClass135_1.e();
		Static56.method778(Static39.aClass135_1);
		@Pc(70) int local70 = Static373.method4910();
		if (local70 == -1) {
			local70 = Static340.anInt5535;
		}
		if (local70 == -1) {
			local70 = Static373.anInt6115;
		}
		Static322.method4261(local70);
		Static298.anInt4895 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!tg;Z)V")
	public static void method3944(@OriginalArg(0) Class236 arg0) {
		Static439.aClass236_1 = arg0;
	}
}
