import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "[I")
	public static final int[] anIntArray142 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "[I")
	public static final int[] anIntArray145 = new int[1000];

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_40 = new Class2(15, 3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(CI)Z")
	public static boolean method1836(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static189.aCharArray8;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (local42 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIIII)V")
	public static void method1837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(28) int local28 = Static278.method3708(arg1 + arg3, Static137.anInt2576, Static293.anInt4886);
		@Pc(37) int local37 = Static278.method3708(arg1 - arg3, Static137.anInt2576, Static293.anInt4886);
		Static404.method5769(Static353.anIntArrayArray48[arg0], local37, local28, arg2);
		while (local14 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(66) int local66;
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local66 = arg0 - local14;
				local71 = arg0 + local14;
				if (Static316.anInt5188 <= local71 && Static82.anInt1667 >= local66) {
					local89 = Static278.method3708(arg1 + local7, Static137.anInt2576, Static293.anInt4886);
					local98 = Static278.method3708(arg1 - local7, Static137.anInt2576, Static293.anInt4886);
					if (Static82.anInt1667 >= local71) {
						Static404.method5769(Static353.anIntArrayArray48[local71], local98, local89, arg2);
					}
					if (Static316.anInt5188 <= local66) {
						Static404.method5769(Static353.anIntArrayArray48[local66], local98, local89, arg2);
					}
				}
			}
			local7++;
			local66 = arg0 - local7;
			local71 = arg0 + local7;
			if (local71 >= Static316.anInt5188 && local66 <= Static82.anInt1667) {
				local89 = Static278.method3708(arg1 + local14, Static137.anInt2576, Static293.anInt4886);
				local98 = Static278.method3708(arg1 - local14, Static137.anInt2576, Static293.anInt4886);
				if (local71 <= Static82.anInt1667) {
					Static404.method5769(Static353.anIntArrayArray48[local71], local98, local89, arg2);
				}
				if (local66 >= Static316.anInt5188) {
					Static404.method5769(Static353.anIntArrayArray48[local66], local98, local89, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public static void method1839() {
		Static389.aClass126_57.method2827();
	}
}
