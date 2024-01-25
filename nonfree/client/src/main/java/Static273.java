import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_38 = new Class193();

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static final int anInt4566 = 1339;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public static void method3786(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static343.anInt5785 != -1) {
				Static292.method4190(Static343.anInt5785);
			}
			for (@Pc(19) Class3_Sub10 local19 = (Class3_Sub10) Static32.aClass140_5.method3486(); local19 != null; local19 = (Class3_Sub10) Static32.aClass140_5.method3485()) {
				if (!local19.method6287()) {
					local19 = (Class3_Sub10) Static32.aClass140_5.method3486();
					if (local19 == null) {
						break;
					}
				}
				Static87.method1538(local19, false, true);
			}
			Static343.anInt5785 = -1;
			Static32.aClass140_5 = new Class140(8);
			Static247.method5474();
			Static343.anInt5785 = Static404.anInt6677;
			Static213.method3196(false);
			Static174.method2784();
			Static219.method3209(Static343.anInt5785);
		}
		Static187.aBoolean258 = false;
		Static217.aString10 = "";
		Static378.aString60 = "";
		Static357.method4973();
		Static302.anInt5198 = -1;
		Static371.method5206(Static122.anInt2179);
		Static203.aClass1_Sub2_Sub6_Sub2_1 = new Class1_Sub2_Sub6_Sub2();
		Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] = Static373.anInt6324 / 2;
		Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 = Static373.anInt6324 * 128 / 2;
		Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 = Static291.anInt5062 * 128 / 2;
		Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] = Static291.anInt5062 / 2;
		Static152.anInt7561 = 0;
		Static266.anInt4433 = 0;
		if (Static27.anInt490 == 2) {
			Static266.anInt4433 = Static87.anInt1583 << 7;
			Static152.anInt7561 = Static359.anInt6118 << 7;
		} else {
			Static4.method65();
		}
		Static106.method4449();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)V")
	public static void method3790(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) Static163.aClass193_67.method4519(); local15 != null; local15 = (Class3_Sub29) Static163.aClass193_67.method4525()) {
			if (local15.aClass3_Sub1_Sub3_2 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(local15.aClass3_Sub1_Sub3_2);
				local15.aClass3_Sub1_Sub3_2 = null;
			}
			if (local15.aClass3_Sub1_Sub3_1 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(local15.aClass3_Sub1_Sub3_1);
				local15.aClass3_Sub1_Sub3_1 = null;
			}
			local15.method6288();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class3_Sub29 local56 = (Class3_Sub29) Static163.aClass193_68.method4519(); local56 != null; local56 = (Class3_Sub29) Static163.aClass193_68.method4525()) {
			if (local56.aClass3_Sub1_Sub3_2 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(local56.aClass3_Sub1_Sub3_2);
				local56.aClass3_Sub1_Sub3_2 = null;
			}
			local56.method6288();
		}
		for (@Pc(83) Class3_Sub29 local83 = (Class3_Sub29) Static307.aClass140_32.method3486(); local83 != null; local83 = (Class3_Sub29) Static307.aClass140_32.method3485()) {
			if (local83.aClass3_Sub1_Sub3_2 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(local83.aClass3_Sub1_Sub3_2);
				local83.aClass3_Sub1_Sub3_2 = null;
			}
			local83.method6288();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!qa;IIII)V")
	public static void method3791(@OriginalArg(1) Class167 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.w(arg1, arg2, arg4 + arg1, arg2 + arg3);
		arg0.method5951(arg3, arg2, -16777216, arg1, arg4);
		if (Static264.anInt4384 < 100) {
			return;
		}
		@Pc(40) float local40 = (float) Static211.anInt277 / (float) Static211.anInt273;
		@Pc(42) int local42 = arg4;
		@Pc(44) int local44 = arg3;
		if (local40 < 1.0F) {
			local44 = (int) (local40 * (float) arg4);
		} else {
			local42 = (int) ((float) arg3 / local40);
		}
		@Pc(70) int local70 = arg1 + (arg4 - local42) / 2;
		@Pc(78) int local78 = arg2 + (arg3 - local44) / 2;
		if (Static442.aClass2_20 == null || arg4 != Static442.aClass2_20.TA() || Static442.aClass2_20.V() != arg3) {
			Static211.method306(Static211.anInt278, Static211.anInt276 + Static211.anInt277, Static211.anInt273 + Static211.anInt278, Static211.anInt276, local70, local78, local42 + local70, local78 - -local44);
			Static211.method298(arg0);
			Static442.aClass2_20 = arg0.method5974(local70, local78, local42, local44, false);
		}
		Static442.aClass2_20.method5829(local70, local78);
		@Pc(131) int local131 = local42 * Static181.anInt5110 / Static211.anInt273;
		@Pc(137) int local137 = local44 * Static414.anInt7475 / Static211.anInt277;
		@Pc(146) int local146 = local70 + local42 * Static204.anInt4638 / Static211.anInt273;
		@Pc(160) int local160 = local44 + local78 - local137 - local44 * Static172.anInt3106 / Static211.anInt277;
		@Pc(162) int local162 = -1996554240;
		if (Static427.aClass113_4 == Static154.aClass113_3) {
			local162 = -1996488705;
		}
		arg0.M(local146, local160, local131, local137, local162, 1);
		arg0.method5996(local146, local160, local131, local137, local162, 0);
		if (Static110.anInt1953 <= 0) {
			return;
		}
		@Pc(200) int local200;
		if (Static285.anInt5015 > 50) {
			local200 = (100 - Static285.anInt5015) * 5;
		} else {
			local200 = Static285.anInt5015 * 5;
		}
		for (@Pc(211) Class3_Sub16 local211 = (Class3_Sub16) Static211.aClass193_3.method4519(); local211 != null; local211 = (Class3_Sub16) Static211.aClass193_3.method4525()) {
			@Pc(219) Class152 local219 = Static211.aClass45_2.method1255(local211.anInt1896);
			if (Static289.method3819(local219)) {
				@Pc(237) int local237;
				@Pc(249) int local249;
				if (Static235.anInt4023 == local211.anInt1896) {
					local237 = local70 + local42 * local211.anInt1893 / Static211.anInt273;
					local249 = (Static211.anInt277 - local211.anInt1897) * local44 / Static211.anInt277 + local78;
					arg0.method5951(4, local249 - 2, local200 << 24 | 0xFFFF00, local237 - 2, 4);
				} else if (Static130.anInt2354 != -1 && local219.anInt4347 == Static130.anInt2354) {
					local237 = local70 + local42 * local211.anInt1893 / Static211.anInt273;
					local249 = (Static211.anInt277 - local211.anInt1897) * local44 / Static211.anInt277 + local78;
					arg0.method5951(4, local249 - 2, local200 << 24 | 0xFFFF00, local237 - 2, 4);
				}
			}
		}
	}
}
