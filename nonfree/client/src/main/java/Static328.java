import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Z")
	public static boolean aBoolean493;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
	public static int anInt6627;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
	public static int anInt6626 = 0;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "[S")
	public static short[] aShortArray76 = new short[256];

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_129 = new Class215(9, -1);

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "[I")
	public static final int[] anIntArray396 = new int[3];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZBI)V")
	public static void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = (Static50.aShort4 - Static356.aShort73) * local21 / 100 + Static356.aShort73;
		if (Static461.aShort98 > local45) {
			local45 = Static461.aShort98;
		} else if (Static248.aShort53 < local45) {
			local45 = Static248.aShort53;
		}
		@Pc(71) int local71 = local45 * 512 * arg4 / (arg2 * 334);
		@Pc(112) int local112;
		@Pc(119) int local119;
		@Pc(83) short local83;
		if (local71 < Static299.aShort67) {
			local83 = Static299.aShort67;
			local45 = local83 * arg2 * 334 / (arg4 * 512);
			if (local45 > Static248.aShort53) {
				local45 = Static248.aShort53;
				local112 = local45 * arg4 * 512 / (local83 * 334);
				local119 = (arg2 - local112) / 2;
				if (arg3) {
					Static186.aClass20_4.la();
					Static186.aClass20_4.method7278(local119, arg0, arg1, arg4, -16777216);
					Static186.aClass20_4.method7278(local119, arg0 + arg2 - local119, arg1, arg4, -16777216);
				}
				arg0 += local119;
				arg2 -= local119 * 2;
			}
		} else if (Static432.aShort100 < local71) {
			local83 = Static432.aShort100;
			local45 = arg2 * local83 * 334 / (arg4 * 512);
			if (Static461.aShort98 > local45) {
				local45 = Static461.aShort98;
				local112 = local83 * arg2 * 334 / (local45 * 512);
				local119 = (arg4 - local112) / 2;
				if (arg3) {
					Static186.aClass20_4.la();
					Static186.aClass20_4.method7278(arg2, arg0, arg1, local119, -16777216);
					Static186.aClass20_4.method7278(arg2, arg0, arg4 + arg1 - local119, local119, -16777216);
				}
				arg1 += local119;
				arg4 -= local119 * 2;
			}
		}
		Static339.anInt6843 = arg4 * local45 / 334;
		Static523.anInt9519 = arg1;
		Static595.anInt10488 = (short) arg4;
		Static375.anInt3312 = (short) arg2;
		Static619.anInt10832 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)V")
	public static void method5639() {
		if (Static461.method6813(Static529.anInt9623) || Static115.method2851(Static529.anInt9623)) {
			Static598.method8788(5000, Static135.anInt3347 >> 12, Static621.anInt10870 >> 12);
		} else {
			@Pc(16) int local16 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] >> 3;
			@Pc(23) int local23 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] >> 3;
			if (local16 >= 0 && Static47.anInt1794 >> 3 > local16 && local23 >= 0 && local23 < Static209.anInt4742 >> 3) {
				Static598.method8788(5000, local16, local23);
			} else {
				Static598.method8788(0, Static47.anInt1794 >> 4, Static209.anInt4742 >> 4);
			}
		}
		Static629.method9129();
		Static554.method8268();
		Static604.method8882();
		Static21.method593();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	public static void method5641(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static303.aClass2_Sub6_Sub4_2 != null) {
			Static426.anInt8018 = Static303.aClass2_Sub6_Sub4_2.anInt2711;
		} else {
			Static426.anInt8018 = -1;
		}
		Static303.aClass2_Sub6_Sub4_2 = null;
		Static50.aClass24_5 = null;
		Static124.anInt11089 = 0;
		Static612.aClass341_69 = null;
		Static303.method146();
		Static303.aClass341_2.method8525();
		Static603.aClass66_6 = null;
		Static50.aClass66_3 = null;
		Static285.aClass46_16 = null;
		Static372.aClass66_7 = null;
		Static439.aClass66_8 = null;
		Static138.aClass66_4 = null;
		Static238.aClass66_5 = null;
		Static303.aClass333_2 = null;
		Static557.aClass66_10 = null;
		Static248.anInt5350 = -1;
		Static535.anInt9666 = -1;
		Static529.aClass66_9 = null;
		if (Static303.aClass248_2 != null) {
			Static303.aClass248_2.method6578();
			Static303.aClass248_2.method6579(64, 128);
		}
		if (Static303.aClass237_2 != null) {
			Static303.aClass237_2.method6471(64, 64);
		}
		if (Static303.aClass342_2 != null) {
			Static303.aClass342_2.method8543(64);
		}
		Static517.aClass284_1.method7409(64);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!in;I[ILclient!in;)V")
	public static void method5642(@OriginalArg(0) Class157 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class157 arg2) {
		if (arg1 != null) {
			Static2.anIntArray229 = arg1;
		}
		Static502.aClass157_259 = arg0;
		Static238.aClass157_118 = arg2;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method5643() {
		Static185.method3872();
		@Pc(12) int local12 = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676();
		if (local12 == 2) {
			Static369.method6237(Static186.aClass20_4, Static423.anInt7984, Static81.anInt2497);
		} else if (local12 == 3) {
			Static210.method4136(Static186.aClass20_4, Static81.anInt2497, Static246.anInt5330, Static310.anInt6428, Static423.anInt7984);
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4684()) {
			Static502.method7993(Static639.aCanvas10);
		}
		if (Static186.aClass20_4 != null) {
			Static63.method1964();
		}
		Static639.aBoolean753 = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676() != 0;
		Static487.aBoolean676 = Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4684();
	}
}
