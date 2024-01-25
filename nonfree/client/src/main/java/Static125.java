import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt2609;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public static int anInt2611 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIBII)V")
	public static void method2418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		Static247.method3552(arg1, arg0 - arg3, Static332.anIntArrayArray56[arg2], arg0 + arg3);
		while (local7 < local14) {
			local19 += 2;
			local17 += local19;
			local7++;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(56) int[] local56 = Static332.anIntArrayArray56[local14 + arg2];
				@Pc(63) int[] local63 = Static332.anIntArrayArray56[arg2 - local14];
				@Pc(67) int local67 = local7 + arg0;
				@Pc(72) int local72 = arg0 - local7;
				Static247.method3552(arg1, local72, local56, local67);
				Static247.method3552(arg1, local72, local63, local67);
			}
			@Pc(90) int local90 = arg0 + local14;
			@Pc(95) int local95 = arg0 - local14;
			@Pc(101) int[] local101 = Static332.anIntArrayArray56[arg2 + local7];
			@Pc(108) int[] local108 = Static332.anIntArrayArray56[arg2 - local7];
			Static247.method3552(arg1, local95, local101, local90);
			Static247.method3552(arg1, local95, local108, local90);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2419() {
		Static335.aClass5_Sub1_Sub1_3.method174(39);
		Static335.aClass5_Sub1_Sub1_3.method1886(Static315.method5371());
		Static335.aClass5_Sub1_Sub1_3.method1870(Static17.anInt5991);
		Static335.aClass5_Sub1_Sub1_3.method1870(Static246.anInt4801);
		Static335.aClass5_Sub1_Sub1_3.method1886(Static275.anInt5386);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method2420() {
		@Pc(5) Class109 local5 = Static250.aClass109_1;
		synchronized (Static250.aClass109_1) {
			Static250.aClass109_1.method2989();
		}
	}
}
