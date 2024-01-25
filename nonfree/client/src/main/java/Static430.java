import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public static int anInt7186;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static int anInt7189;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
	public static final int[] anIntArray481 = new int[1];

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt7184 = 0;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
	public static int anInt7185 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I")
	public static int method5416(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Lclient!vb;")
	public static Class247 method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class247 local7 = new Class247();
		local7.anInt6866 = -1;
		local7.anInt6878 = -1;
		local7.anInt6863 = arg0 + 5 + 1;
		local7.anInt6871 = arg1 + 6;
		local7.anIntArrayArray179 = new int[local7.anInt6863][local7.anInt6871];
		local7.method5261();
		return local7;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)B")
	public static byte method5418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public static void method5419() {
		Static38.aClass167_16.method3390();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method5421() {
		if (Static278.aFloat52 < 1024.0F) {
			Static278.aFloat52 = 1024.0F;
		}
		if (Static278.aFloat52 > 3072.0F) {
			Static278.aFloat52 = 3072.0F;
		}
		while (Static95.aFloat27 >= 16384.0F) {
			Static95.aFloat27 -= 16384.0F;
		}
		while (Static95.aFloat27 < 0.0F) {
			Static95.aFloat27 += 16384.0F;
		}
		@Pc(41) int local41 = Static327.anInt5372 >> 7;
		@Pc(45) int local45 = Static155.anInt2606 >> 7;
		@Pc(51) int local51 = Static183.method4175(Static155.anInt2606, Static327.anInt5372, Static138.anInt3548);
		@Pc(53) int local53 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && Static425.anInt6922 - 4 > local41 && local45 < Static251.anInt4072 - 4) {
			for (local79 = local41 - 4; local79 <= local41 + 4; local79++) {
				for (@Pc(85) int local85 = local45 - 4; local85 <= local45 + 4; local85++) {
					@Pc(89) int local89 = Static138.anInt3548;
					if (local89 < 3 && Static346.method4403(local85, local79)) {
						local89++;
					}
					@Pc(100) int local100 = 0;
					if (Static279.aClass148_Sub1_8.aByteArrayArrayArray12 != null && Static279.aClass148_Sub1_8.aByteArrayArrayArray12[local89] != null) {
						local100 = (Static279.aClass148_Sub1_8.aByteArrayArrayArray12[local89][local79][local85] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local100 + local51 - Static202.aClass163Array2[local89].I(local79, local85);
					if (local53 < local132) {
						local53 = local132;
					}
				}
			}
		}
		local79 = (local53 >> 0) * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (local79 > Static220.anInt3560) {
			Static220.anInt3560 += (local79 - Static220.anInt3560) / 24;
		} else if (Static220.anInt3560 > local79) {
			Static220.anInt3560 += (local79 - Static220.anInt3560) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)V")
	public static void method5422(@OriginalArg(1) int arg0) {
		if (arg0 == Static98.anInt1721) {
			return;
		}
		if (Static98.anInt1721 == 0) {
			Static295.method3884();
		}
		if (arg0 == 40) {
			Static17.method269();
		}
		if (arg0 != 40 && Static239.aClass3_4 != null) {
			Static239.aClass3_4.method63();
			Static239.aClass3_4 = null;
		}
		if (Static98.anInt1721 == 25 || Static98.anInt1721 == 28) {
			Static383.aClass113_117.anInt2734 = 2;
			Static383.aClass113_118.anInt2734 = 2;
			Static315.aClass113_99.anInt2734 = 2;
			Static28.aClass113_11.anInt2734 = 2;
			Static9.aClass113_5.anInt2734 = 2;
			Static66.aClass113_23.anInt2734 = 2;
			Static52.aClass113_20.anInt2734 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static61.anInt1095 = 0;
			Static124.anInt2155 = 1;
			Static74.anInt1415 = 0;
			anInt7185 = 0;
			Static215.anInt3455 = 1;
			Static240.method3130(true);
			Static383.aClass113_117.anInt2734 = 1;
			Static383.aClass113_118.anInt2734 = 1;
			Static315.aClass113_99.anInt2734 = 1;
			Static28.aClass113_11.anInt2734 = 1;
			Static9.aClass113_5.anInt2734 = 1;
			Static66.aClass113_23.anInt2734 = 1;
			Static52.aClass113_20.anInt2734 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static77.method1209();
		}
		if (arg0 == 5) {
			Static284.method3706(Static213.aClass128_22, Static169.aClass113_55);
		} else {
			Static316.method4090();
		}
		@Pc(144) boolean local144 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(161) boolean local161 = Static98.anInt1721 == 5 || Static98.anInt1721 == 10 || Static98.anInt1721 == 28;
		if (local144 != local161) {
			if (local144) {
				Static170.anInt2817 = Static343.anInt5596;
				if (Static336.aClass106_Sub1_1.anInt5694 == 0) {
					Static207.method2798();
				} else {
					Static122.method1693(Static116.aClass113_101, Static336.aClass106_Sub1_1.anInt5694, Static343.anInt5596);
				}
				Static316.aClass19_1.method402(false);
			} else {
				Static207.method2798();
				Static316.aClass19_1.method402(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static213.aClass128_22.method3556();
		}
		Static98.anInt1721 = arg0;
	}
}
