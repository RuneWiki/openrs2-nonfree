import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int anInt4847;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int anInt4846 = 0;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_9 = new Class165(2, 4, 4, 0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!wm;)V")
	public static void method3867(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(9) int local9 = arg0.method2883();
		Static313.aClass103Array1 = new Class103[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static313.aClass103Array1[local14] = new Class103();
			Static313.aClass103Array1[local14].anInt2306 = arg0.method2883();
			Static313.aClass103Array1[local14].aString19 = arg0.method2925();
		}
		Static376.anInt6063 = arg0.method2883();
		Static137.anInt2141 = arg0.method2883();
		Static44.anInt634 = arg0.method2883();
		Static105.aClass239_Sub1Array2 = new Class239_Sub1[Static137.anInt2141 + 1 - Static376.anInt6063];
		for (@Pc(74) int local74 = 0; local74 < Static44.anInt634; local74++) {
			@Pc(80) int local80 = arg0.method2883();
			@Pc(88) Class239_Sub1 local88 = Static105.aClass239_Sub1Array2[local80] = new Class239_Sub1();
			local88.anInt6354 = arg0.method2915();
			local88.anInt6357 = arg0.method2877();
			local88.anInt6362 = local80 + Static376.anInt6063;
			local88.aString66 = arg0.method2925();
			local88.aString65 = arg0.method2925();
		}
		Static30.anInt442 = arg0.method2877();
		Static47.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public static void method3869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg4 + arg0;
		@Pc(20) int local20 = arg1 - arg0;
		for (@Pc(22) int local22 = arg4; local22 < local15; local22++) {
			Static298.method3977(arg2, arg5, arg3, Static194.anIntArrayArray28[local22]);
		}
		for (@Pc(40) int local40 = arg1; local40 > local20; local40--) {
			Static298.method3977(arg2, arg5, arg3, Static194.anIntArrayArray28[local40]);
		}
		@Pc(59) int local59 = arg3 - arg0;
		@Pc(64) int local64 = arg2 + arg0;
		for (@Pc(66) int local66 = local15; local66 <= local20; local66++) {
			@Pc(72) int[] local72 = Static194.anIntArrayArray28[local66];
			Static298.method3977(arg2, arg5, local64, local72);
			Static298.method3977(local59, arg5, arg3, local72);
		}
	}
}
