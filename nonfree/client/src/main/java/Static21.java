import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public static int anInt335;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!wc;")
	public static Class213 aClass213_1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_10 = new Class70(10);

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
	public static final int[] anIntArray33 = new int[64];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method304() {
		if (Static124.anInt2286 > 0) {
			Static63.method1030();
		} else {
			Static278.aClass11_6 = Static216.aClass11_5;
			Static216.aClass11_5 = null;
			Static290.method4952(40);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!ja;)V")
	public static void method305(@OriginalArg(1) Class81 arg0) {
		@Pc(7) int local7 = Static194.anInt3666;
		@Pc(9) int local9 = Static267.anInt4963;
		@Pc(11) int local11 = Static25.anInt507;
		@Pc(15) int local15 = Static320.anInt5930 - 3;
		if (Static237.aClass40_13 == null || Static318.aClass40_17 == null) {
			if (Static269.aClass53_124.method1026(Static187.anInt3557) && Static269.aClass53_124.method1026(Static343.anInt6235)) {
				Static237.aClass40_13 = arg0.method3015(Static363.method2255(Static269.aClass53_124, Static187.anInt3557, 0));
				@Pc(61) Class88 local61 = Static363.method2255(Static269.aClass53_124, Static343.anInt6235, 0);
				Static318.aClass40_17 = arg0.method3015(local61);
				local61.method2260();
				Static327.aClass40_6 = arg0.method3015(local61);
			} else {
				arg0.method2962(local7, local9, local11, 20, Static286.anInt5399 | 255 - Static292.anInt5495 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static237.aClass40_13 != null && Static318.aClass40_17 != null) {
			local88 = (local11 - Static318.aClass40_17.method5071() * 2) / Static237.aClass40_13.method5071();
			for (local90 = 0; local90 < local88; local90++) {
				Static237.aClass40_13.method5077(Static318.aClass40_17.method5071() + local7 + Static237.aClass40_13.method5071() * local90, local9);
			}
			Static318.aClass40_17.method5077(local7, local9);
			Static327.aClass40_6.method5077(local7 + local11 - Static327.aClass40_6.method5071(), local9);
		}
		Static309.aClass30_5.method5340(local9 + 14, Static60.anInt1117 | 0xFF000000, -1, Static150.aString121, local7 + 3);
		arg0.method2962(local7, local9 + 20, local11, local15 - 20, -Static292.anInt5495 + 255 << 24 | Static286.anInt5399, 1);
		local88 = Static7.anInt149;
		local90 = Static79.anInt1449;
		@Pc(190) int local190;
		for (@Pc(172) int local172 = 0; local172 < Static256.anInt4749; local172++) {
			local190 = (Static256.anInt4749 - local172 - 1) * 16 + local9 + 13 + 20;
			if (local7 < local88 && local88 < local11 + local7 && local90 > local190 - 13 && local90 < local190 + 3) {
				arg0.method2962(local7, local190 - 12, local11, 16, 255 - Static284.anInt5377 << 24 | Static96.anInt1764, 1);
			}
		}
		if ((Static196.aClass40_12 == null || Static125.aClass40_4 == null || Static288.aClass40_15 == null) && Static269.aClass53_124.method1026(Static236.anInt2370) && Static269.aClass53_124.method1026(Static6.anInt123) && Static269.aClass53_124.method1026(Static144.anInt2567)) {
			@Pc(267) Class88 local267 = Static363.method2255(Static269.aClass53_124, Static6.anInt123, 0);
			Static125.aClass40_4 = arg0.method3015(local267);
			local267.method2260();
			Static253.aClass40_14 = arg0.method3015(local267);
			Static196.aClass40_12 = arg0.method3015(Static363.method2255(Static269.aClass53_124, Static236.anInt2370, 0));
			@Pc(292) Class88 local292 = Static363.method2255(Static269.aClass53_124, Static144.anInt2567, 0);
			Static288.aClass40_15 = arg0.method3015(local292);
			local292.method2260();
			Static353.aClass40_20 = arg0.method3015(local292);
		}
		@Pc(362) int local362;
		@Pc(364) int local364;
		if (Static196.aClass40_12 != null && Static125.aClass40_4 != null && Static288.aClass40_15 != null) {
			local190 = (local11 - Static288.aClass40_15.method5071() * 2) / Static196.aClass40_12.method5071();
			for (@Pc(323) int local323 = 0; local323 < local190; local323++) {
				Static196.aClass40_12.method5077(local7 + Static288.aClass40_15.method5071() + local323 * Static196.aClass40_12.method5071(), -Static196.aClass40_12.method5075() + local9 - -local15);
			}
			local362 = (local15 - Static288.aClass40_15.method5075() - 20) / Static125.aClass40_4.method5075();
			for (local364 = 0; local364 < local362; local364++) {
				Static125.aClass40_4.method5077(local7, local364 * Static125.aClass40_4.method5075() + local9 + 20);
				Static253.aClass40_14.method5077(local11 + local7 - Static253.aClass40_14.method5071(), Static125.aClass40_4.method5075() * local364 + 20 + local9);
			}
			Static288.aClass40_15.method5077(local7, local9 + local15 - Static288.aClass40_15.method5075());
			Static353.aClass40_20.method5077(local7 + local11 - Static288.aClass40_15.method5071(), -Static288.aClass40_15.method5075() + local15 + local9);
		}
		local190 = 0;
		for (@Pc(432) Class6_Sub32 local432 = (Class6_Sub32) Static214.aClass211_24.method5594(); local432 != null; local432 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			local362 = local9 + (-local190 + -1 + Static256.anInt4749) * 16 + 20 + 13;
			local364 = Static60.anInt1117 | 0xFF000000;
			if (local7 < local88 && local7 + local11 > local88 && local362 - 13 < local90 && local362 + 3 > local90) {
				local364 = Static256.anInt4747 | 0xFF000000;
			}
			@Pc(487) int[] local487 = null;
			if (Static153.method3085(local432.anInt4932)) {
				local487 = Static211.method3762((int) local432.aLong156).anIntArray465;
			} else if (Static166.method3284(local432.anInt4932)) {
				@Pc(503) Class44_Sub4_Sub4_Sub2 local503 = Static239.aClass44_Sub4_Sub4_Sub2Array8[(int) local432.aLong156];
				if (local503 != null) {
					local487 = local503.aClass18_1.anIntArray38;
				}
			} else if (Static341.method5621(local432.anInt4932)) {
				if (local432.anInt4932 == 1004) {
					local487 = Static196.method3622((int) local432.aLong156).anIntArray163;
				} else {
					local487 = Static196.method3622((int) (local432.aLong156 >>> 32 & 0x7FFFFFFFL)).anIntArray163;
				}
			}
			@Pc(552) String local552 = Static196.method3623(local432);
			if (local487 != null) {
				local552 = local552 + Static276.method4748(local487);
			}
			local190++;
			Static309.aClass30_5.method5345(Static233.anIntArray489, local362, 0, Static291.aClass40Array35, local7 + 3, local364, local552);
		}
		Static164.method3247(Static320.anInt5930, Static267.anInt4963, Static194.anInt3666, Static25.anInt507);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!dp;I)V")
	public static void method307(@OriginalArg(0) Class53 arg0) {
		Static83.aClass53_41 = arg0;
		Static206.anInt3783 = Static83.aClass53_41.method1011(19);
	}
}
