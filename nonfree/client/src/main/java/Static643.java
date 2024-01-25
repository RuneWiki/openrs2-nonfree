import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vea", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BZI)V")
	public static void method3509(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub29 local10 = arg0 ? Static488.aClass6_Sub29_3 : Static99.aClass6_Sub29_1;
		if (local10 == null || arg1 < 0 || local10.anInt5466 <= arg1) {
			return;
		}
		@Pc(32) Class200 local32 = local10.aClass200Array1[arg1];
		if (local32.aByte80 != -1) {
			return;
		}
		@Pc(41) String local41 = local32.aString58;
		@Pc(44) Class260 local44 = Static629.method8573();
		@Pc(50) Class6_Sub13 local50 = Static30.method353(Static649.aClass241_117, local44.aClass270_2);
		local50.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(local41) + 3);
		local50.aClass6_Sub15_Sub1_1.method3016(arg0 ? 1 : 0);
		local50.aClass6_Sub15_Sub1_1.method3040(arg1);
		local50.aClass6_Sub15_Sub1_1.method2991(local41);
		local44.method6404(local50);
	}

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "(I)V")
	public static void method3511() {
		Static307.method4889(12);
		Static91.method1335();
		System.gc();
	}
}
