import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	public static final int[] anIntArray131 = new int[14];

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_37 = new Class92(32, 3);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
	public static int method1832(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method1833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(17) int local17 = -arg1;
		@Pc(19) int local19 = -1;
		@Pc(28) int local28 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 + arg1);
		@Pc(39) int local39 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 - arg1);
		Static298.method4405(Static62.anIntArrayArray7[arg2], arg0, local28, local39);
		while (local14 > local12) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg2 - local14;
				local72 = local14 + arg2;
				if (Static172.anInt3442 <= local72 && local68 <= Static324.anInt5590) {
					local90 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local12 + arg3);
					local99 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 - local12);
					if (Static324.anInt5590 >= local72) {
						Static298.method4405(Static62.anIntArrayArray7[local72], arg0, local90, local99);
					}
					if (Static172.anInt3442 <= local68) {
						Static298.method4405(Static62.anIntArrayArray7[local68], arg0, local90, local99);
					}
				}
			}
			local12++;
			local68 = arg2 - local12;
			local72 = local12 + arg2;
			if (local72 >= Static172.anInt3442 && Static324.anInt5590 >= local68) {
				local90 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 + local14);
				local99 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 - local14);
				if (local72 <= Static324.anInt5590) {
					Static298.method4405(Static62.anIntArrayArray7[local72], arg0, local90, local99);
				}
				if (local68 >= Static172.anInt3442) {
					Static298.method4405(Static62.anIntArrayArray7[local68], arg0, local90, local99);
				}
			}
		}
	}
}
