import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
	public static int[] anIntArray346 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	public static int[] anIntArray348 = new int[5];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method3496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static312.anInt5850 <= arg4 && Static214.anInt4216 >= arg6 && Static240.anInt1319 <= arg2 && Static59.anInt1155 >= arg1) {
			Static129.method2031(arg0, arg4, arg6, arg2, arg5, arg3, arg1);
		} else {
			Static262.method1883(arg3, arg5, arg0, arg6, arg4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method3497() {
		Static247.aClass156_23 = new Class156(32);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILclient!qf;)V")
	public static void method3499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class146 arg2) {
		if (Static316.anInt5941 < 2 && Static197.anInt3990 == 0 && !Static91.aBoolean136) {
			return;
		}
		@Pc(22) String local22 = Static108.method1781();
		if (arg2 == null) {
			@Pc(39) int local39 = Static245.aClass1_Sub1_Sub12_2.method4434(local22, arg0 + 4, arg1 - -15, Static295.aRandom1, Static295.anInt5587);
			Static94.method1387(arg1, arg0 + 4, local39 + Static245.aClass1_Sub1_Sub12_2.method4438(local22), 15);
			return;
		}
		@Pc(58) Class1_Sub1_Sub12 local58 = arg2.method3518(Static197.aClass103Array3);
		if (local58 == null) {
			local58 = Static245.aClass1_Sub1_Sub12_2;
		}
		local58.method4426(local22, arg0, arg1, arg2.anInt4345, arg2.anInt4371, arg2.anInt4422, arg2.anInt4381, arg2.anInt4429, arg2.anInt4430, Static295.aRandom1, Static295.anInt5587, Static101.anIntArray166);
		Static94.method1387(Static101.anIntArray166[1], Static101.anIntArray166[0], Static101.anIntArray166[2], Static101.anIntArray166[3]);
	}
}
