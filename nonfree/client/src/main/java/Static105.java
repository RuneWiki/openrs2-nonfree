import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!fb;")
	public static Class20 aClass20_49;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!pc;")
	public static Class12 aClass12_81;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_110;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_111;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray73 = new int[104][104];

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt2744 = 78;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1324 = Static87.method1648("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1325 = Static87.method1648("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1326 = aClass27_1324;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1327 = Static87.method1648("Hierhin gehen");

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1328 = Static87.method1648("@or3@");

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt2752 = 500;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method1884() {
		aClass27_1325 = null;
		aClass3_Sub3_Sub2_Sub4_111 = null;
		aClass3_Sub3_Sub2_Sub4_110 = null;
		aClass12_81 = null;
		anIntArrayArray73 = null;
		aClass27_1328 = null;
		anIntArray398 = null;
		aClass27_1327 = null;
		aClass27_1326 = null;
		aClass27_1324 = null;
		aClass20_49 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	public static boolean method1885() {
		return Static88.aClass5_1 != null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I")
	public static int method1886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 256 - arg1;
		return (arg1 * (arg0 & 0xFF00) + local16 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local16 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!hb;)V")
	public static void method1887(@OriginalArg(1) Class27 arg0) {
		if (arg0 == null || arg0.method765() == 0) {
			Static87.anInt2340 = 0;
			return;
		}
		@Pc(16) Class27 local16 = arg0;
		@Pc(19) Class27[] local19 = new Class27[100];
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(31) int local31 = local16.method732();
			if (local31 == -1) {
				local16 = local16.method735();
				if (local16.method765() > 0) {
					local19[local21++] = local16.method742();
				}
				Static87.anInt2340 = 0;
				label46: for (local31 = 0; local31 < Static81.anInt2193; local31++) {
					@Pc(96) Class3_Sub3_Sub9 local96 = Static37.method696(local31);
					if (local96.anInt1796 == -1 && local96.aClass27_869 != null) {
						@Pc(108) Class27 local108 = local96.aClass27_869.method742();
						for (@Pc(110) int local110 = 0; local110 < local21; local110++) {
							if (local108.method739(local19[local110]) == -1) {
								continue label46;
							}
						}
						Static101.aClass27Array15[Static87.anInt2340] = local108;
						Static35.anIntArray158[Static87.anInt2340] = local31;
						Static87.anInt2340++;
						if (Static101.aClass27Array15.length <= Static87.anInt2340) {
							return;
						}
					}
				}
				return;
			}
			@Pc(63) Class27 local63 = local16.method747(0, local31).method735();
			if (local63.method765() > 0) {
				local19[local21++] = local63.method742();
			}
			local16 = local16.method731(local31 + 1);
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	public static void method1889() {
		Static47.aClass21_17.method663();
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
	public static int method1890() {
		return 5;
	}
}
