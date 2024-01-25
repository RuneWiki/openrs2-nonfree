import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!ft;")
	public static Class122 aClass122_38;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "J")
	public static long aLong340 = 20000000L;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BZI)I")
	public static int method8915(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static170.method3323(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(ILclient!ha;)V")
	public static void method8917(@OriginalArg(1) Class75 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static93.aBoolean113) {
			local7 = Static24.method290();
			local9 = Static488.method7227();
		}
		@Pc(21) int local21 = local7 + Static25.anInt354;
		@Pc(25) int local25 = Static243.anInt4678 + local9;
		@Pc(27) int local27 = Static406.anInt7073;
		@Pc(31) int local31 = Static49.anInt592 - 3;
		Static229.method4088(Static50.aClass43_24.method596(Static601.anInt9518), Static406.anInt7073, local9 + Static243.anInt4678, arg0, Static25.anInt354 + local7, Static49.anInt592);
		@Pc(56) int local56 = local7 + Static331.aClass42_8.method6019();
		@Pc(67) int local67 = local9 + Static331.aClass42_8.method6014();
		@Pc(71) int local71;
		@Pc(76) Class6_Sub2_Sub2 local76;
		@Pc(89) int local89;
		@Pc(210) int local210;
		@Pc(292) Class6_Sub2_Sub11 local292;
		@Pc(196) Class6_Sub2_Sub11 local196;
		if (Static84.aBoolean110) {
			local71 = 0;
			for (local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local76 != null; local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
				local89 = local71 * 16 + local25 + 13 + 20;
				if (Static25.anInt354 + local7 < local56 && local56 < Static406.anInt7073 + local7 + Static25.anInt354 && local89 - 13 < local67 && local67 < local89 + 4 && (local76.anInt618 > 1 || ((Class6_Sub2_Sub11) local76.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65).aBoolean391)) {
					arg0.aa(Static25.anInt354 + local7, local89 + -12, Static406.anInt7073, 16, 255 - Static541.anInt9251 << 24 | Static539.anInt8777, 1);
				}
				local71++;
			}
			if (Static310.aClass6_Sub2_Sub2_1 != null) {
				Static229.method4088(Static310.aClass6_Sub2_Sub2_1.aString10, Static69.anInt919, Static145.anInt3045, arg0, Static421.anInt7230, Static587.anInt9342);
				local71 = 0;
				for (local196 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2071(); local196 != null; local196 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2078()) {
					local210 = local71 * 16 + Static145.anInt3045 + 13 + 20;
					local71++;
					if (local56 > Static421.anInt7230 && Static69.anInt919 + Static421.anInt7230 > local56 && local67 > local210 - 13 && local210 + 4 > local67 && local196.aBoolean391) {
						arg0.aa(Static421.anInt7230, local210 - 12, Static69.anInt919, 16, Static539.anInt8777 | 255 - Static541.anInt9251 << 24, 1);
					}
				}
				Static41.method529(Static69.anInt919, Static421.anInt7230, arg0, Static587.anInt9342, Static145.anInt3045);
			}
		} else {
			local71 = 0;
			for (local292 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local292 != null; local292 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				local89 = (Static539.anInt8776 - local71 - 1) * 16 + local25 + 13 + 20;
				local71++;
				if (Static25.anInt354 + local7 < local56 && local56 < Static406.anInt7073 + local7 + Static25.anInt354 && local67 > local89 - 13 && local67 < local89 + 4 && local292.aBoolean391) {
					arg0.aa(Static25.anInt354 + local7, local89 + -12, Static406.anInt7073, 16, 255 - Static541.anInt9251 << 24 | Static539.anInt8777, 1);
				}
			}
		}
		Static41.method529(Static406.anInt7073, local7 + Static25.anInt354, arg0, Static49.anInt592, local9 + Static243.anInt4678);
		if (Static84.aBoolean110) {
			local71 = 0;
			for (local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local76 != null; local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
				local89 = local9 + Static243.anInt4678 + local71 * 16 + 20 + 13;
				local71++;
				if (local76.anInt618 == 1) {
					Static77.method1038(local89, local67, Static243.anInt4678 + local9, Static49.anInt592, local56, (Class6_Sub2_Sub11) local76.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65, Static92.anInt1369 | 0xFF000000, Static265.anInt5022 | 0xFF000000, Static406.anInt7073, arg0, local7 + Static25.anInt354);
				} else {
					Static140.method2720(local56, Static49.anInt592, local89, local76, local67, local7 + Static25.anInt354, Static92.anInt1369 | 0xFF000000, Static406.anInt7073, arg0, Static243.anInt4678 + local9, Static265.anInt5022 | 0xFF000000);
				}
			}
			if (Static310.aClass6_Sub2_Sub2_1 != null) {
				local71 = 0;
				for (local196 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2071(); local196 != null; local196 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2078()) {
					local210 = Static145.anInt3045 + local71 * 16 + 20 + 13;
					local71++;
					Static77.method1038(local210, local67, Static145.anInt3045, Static587.anInt9342, local56, local196, Static92.anInt1369 | 0xFF000000, Static265.anInt5022 | 0xFF000000, Static69.anInt919, arg0, Static421.anInt7230);
				}
				Static315.method4981(Static69.anInt919, Static145.anInt3045, Static587.anInt9342, Static421.anInt7230);
			}
		} else {
			local71 = 0;
			for (local292 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local292 != null; local292 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				local89 = (Static539.anInt8776 - local71 - 1) * 16 + local25 + 13 + 20;
				Static77.method1038(local89, local67, local25, local31, local56, local292, Static92.anInt1369 | 0xFF000000, Static265.anInt5022 | 0xFF000000, local27, arg0, local21);
				local71++;
			}
		}
		Static315.method4981(Static406.anInt7073, Static243.anInt4678 + local9, Static49.anInt592, local7 + Static25.anInt354);
	}
}
