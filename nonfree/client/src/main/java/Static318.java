import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Lclient!bk;")
	public static final Class31 aClass31_4 = new Class31();

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!jj;II)V")
	public static void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub25 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1 == Static105.aClass295_10.aClass1_260) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt4363;
		@Pc(18) int local18 = arg1.anInt4371;
		@Pc(21) int local21 = arg1.anInt4365;
		@Pc(25) int local25 = (int) arg1.aLong114;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg1.aLong114;
		@Pc(46) Class1_Sub41 local46;
		@Pc(57) Class20_Sub1_Sub1_Sub2 local57;
		if (local21 == 25) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				Static464.anInt8000 = arg2;
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static237.aClass252_66);
				Static259.aClass1_Sub17_Sub2_1.method4506(Static189.anInt3926);
				Static259.aClass1_Sub17_Sub2_1.method4506(local25);
				Static259.aClass1_Sub17_Sub2_1.method4506(Static119.anInt2478);
				Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4488(Static49.anInt1304);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 30 && Static447.aClass91_14 == null) {
			Static274.method4852(local15, local18);
			Static447.aClass91_14 = Static429.method6657(local18, local15);
			Static243.method4316(Static447.aClass91_14);
		}
		if (local21 == 15) {
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 1;
			Static417.anInt7303 = 0;
			Static216.method3997(Static349.aClass252_91);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static189.anInt3926);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4459(local18 + Static282.anInt5380);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static119.anInt2478);
			Static259.aClass1_Sub17_Sub2_1.method4488(Static49.anInt1304);
			Static355.method5833(0, 0, 1, local15, local18, 1, -4, true);
		}
		@Pc(200) Class20_Sub1_Sub1_Sub1 local200;
		if (local21 == 50) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				Static127.anInt2590 = arg0;
				Static464.anInt8000 = arg2;
				Static216.method3997(Static286.aClass252_83);
				Static259.aClass1_Sub17_Sub2_1.method4473(local25);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 46) {
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static216.method3997(Static58.aClass252_25);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4473(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4473(local25);
			Static11.method481(local15, local18);
		}
		if (local21 == 45) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				Static464.anInt8000 = arg2;
				Static296.anInt7159 = 2;
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static127.anInt2590 = arg0;
				Static417.anInt7303 = 0;
				Static216.method3997(Static160.aClass252_133);
				Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4473(local25);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 4) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static464.anInt8000 = arg2;
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static65.aClass252_29);
				Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4473(local25);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 1002) {
			Static296.anInt7159 = 2;
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static464.anInt8000 = arg2;
			Static216.method3997(Static459.aClass252_122);
			Static259.aClass1_Sub17_Sub2_1.method4473((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 23) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static464.anInt8000 = arg2;
				Static127.anInt2590 = arg0;
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				Static216.method3997(Static465.aClass252_124);
				Static259.aClass1_Sub17_Sub2_1.method4473(local25);
				Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 58) {
			Static417.anInt7303 = 0;
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static216.method3997(Static405.aClass252_106);
			Static259.aClass1_Sub17_Sub2_1.method4469(Static49.anInt1304);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8969);
			Static259.aClass1_Sub17_Sub2_1.method4474(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static119.anInt2478);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static189.anInt3926);
		}
		if (local21 == 51) {
			if (Static378.anInt6739 > 0 && Static25.aClass241_1.method6303(82) && Static25.aClass241_1.method6303(81)) {
				Static89.method1899(Static538.anInt9485 + local15, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108, local18 + Static282.anInt5380);
			} else {
				Static464.anInt8000 = arg2;
				Static127.anInt2590 = arg0;
				Static296.anInt7159 = 1;
				Static417.anInt7303 = 0;
				Static216.method3997(Static373.aClass252_94);
				Static259.aClass1_Sub17_Sub2_1.method4446(Static282.anInt5380 + local18);
				Static259.aClass1_Sub17_Sub2_1.method4506(local15 + Static538.anInt9485);
			}
		}
		if (local21 == 1010) {
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static417.anInt7303 = 0;
			Static216.method3997(Static284.aClass252_82);
			Static259.aClass1_Sub17_Sub2_1.method4473(local25);
		}
		if (local21 == 44) {
			Static417.anInt7303 = 0;
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static216.method3997(Static276.aClass252_130);
			Static259.aClass1_Sub17_Sub2_1.method4473(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static119.anInt2478);
			Static259.aClass1_Sub17_Sub2_1.method4506(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static259.aClass1_Sub17_Sub2_1.method4473(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4466(Static49.anInt1304);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static189.anInt3926);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 10) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static464.anInt8000 = arg2;
				Static296.anInt7159 = 2;
				Static417.anInt7303 = 0;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static405.aClass252_106);
				Static259.aClass1_Sub17_Sub2_1.method4469(Static49.anInt1304);
				Static259.aClass1_Sub17_Sub2_1.method4459(local25);
				Static259.aClass1_Sub17_Sub2_1.method4474(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4459(Static119.anInt2478);
				Static259.aClass1_Sub17_Sub2_1.method4506(Static189.anInt3926);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 5) {
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static216.method3997(Static22.aClass252_7);
			Static259.aClass1_Sub17_Sub2_1.method4446(local25);
			Static259.aClass1_Sub17_Sub2_1.method4506(local15 + Static538.anInt9485);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static11.method481(local15, local18);
		}
		@Pc(926) Class91 local926;
		if (local21 == 47) {
			local926 = Static429.method6657(local18, local15);
			if (local926 != null) {
				Static417.method6564();
				@Pc(933) Class1_Sub9 local933 = Static63.method1580(local926);
				Static37.method1113(local933.method1741(), local933.anInt1812, local926);
				Static151.aString116 = Static455.method6992(local926);
				Static201.aString84 = local926.aString54 + "<col=ffffff>";
				if (Static151.aString116 == null) {
					Static151.aString116 = "Null";
				}
			}
			return;
		}
		if (local21 == 22) {
			Static296.anInt7159 = 2;
			Static417.anInt7303 = 0;
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static216.method3997(Static211.aClass252_63);
			Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4506(local25);
			Static259.aClass1_Sub17_Sub2_1.method4459(local15 + Static538.anInt9485);
			Static11.method481(local15, local18);
		}
		if (local21 == 21) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static464.anInt8000 = arg2;
				Static296.anInt7159 = 2;
				Static127.anInt2590 = arg0;
				Static417.anInt7303 = 0;
				Static216.method3997(Static49.aClass252_22);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 2) {
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static216.method3997(Static113.aClass252_43);
			Static259.aClass1_Sub17_Sub2_1.method4459(local15 + Static538.anInt9485);
			Static259.aClass1_Sub17_Sub2_1.method4459((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 20 || local21 == 1009) {
			Static465.method7075(local25, arg1.aString95, local18, local15);
		}
		if (local21 == 9) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static417.anInt7303 = 0;
				Static127.anInt2590 = arg0;
				Static296.anInt7159 = 2;
				Static464.anInt8000 = arg2;
				Static216.method3997(Static504.aClass252_131);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 12) {
			Static127.anInt2590 = arg0;
			Static464.anInt8000 = arg2;
			Static296.anInt7159 = 2;
			Static417.anInt7303 = 0;
			Static216.method3997(Static517.aClass252_134);
			Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4459(local18 + Static282.anInt5380);
			Static259.aClass1_Sub17_Sub2_1.method4446(local25);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static538.anInt9485 + local15);
			Static11.method481(local15, local18);
		}
		if (local21 == 60) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static464.anInt8000 = arg2;
				Static296.anInt7159 = 2;
				Static417.anInt7303 = 0;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static313.aClass252_88);
				Static259.aClass1_Sub17_Sub2_1.method4473(local25);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 8) {
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static216.method3997(Static87.aClass252_38);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4459(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static259.aClass1_Sub17_Sub2_1.method4473(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4473(Static538.anInt9485 + local15);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 1011) {
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static417.anInt7303 = 0;
			Static296.anInt7159 = 2;
			Static216.method3997(Static206.aClass252_60);
			Static259.aClass1_Sub17_Sub2_1.method4473(local25);
		}
		if (local21 == 49) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static296.anInt7159 = 2;
				Static464.anInt8000 = arg2;
				Static417.anInt7303 = 0;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static200.aClass252_58);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 16) {
			Static464.anInt8000 = arg2;
			Static296.anInt7159 = 2;
			Static127.anInt2590 = arg0;
			Static417.anInt7303 = 0;
			Static216.method3997(Static542.aClass252_141);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static189.anInt3926);
			Static259.aClass1_Sub17_Sub2_1.method4446(local25);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static119.anInt2478);
			Static259.aClass1_Sub17_Sub2_1.method4446(local18 + Static282.anInt5380);
			Static259.aClass1_Sub17_Sub2_1.method4459(local15 + Static538.anInt9485);
			Static259.aClass1_Sub17_Sub2_1.method4489(Static49.anInt1304);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static11.method481(local15, local18);
		}
		if (local21 == 17) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				Static296.anInt7159 = 2;
				Static417.anInt7303 = 0;
				Static127.anInt2590 = arg0;
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static464.anInt8000 = arg2;
				Static216.method3997(Static31.aClass252_126);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static259.aClass1_Sub17_Sub2_1.method4474(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 6) {
			Static296.anInt7159 = 2;
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static464.anInt8000 = arg2;
			Static216.method3997(Static190.aClass252_55);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4446(local25);
			Static259.aClass1_Sub17_Sub2_1.method4506(local15 + Static538.anInt9485);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static282.anInt5380 + local18);
			Static11.method481(local15, local18);
		}
		if (local21 == 3) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static417.anInt7303 = 0;
				Static464.anInt8000 = arg2;
				Static296.anInt7159 = 2;
				Static127.anInt2590 = arg0;
				Static216.method3997(Static343.aClass252_137);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4459(local25);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 59) {
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				Static417.anInt7303 = 0;
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				Static296.anInt7159 = 2;
				Static127.anInt2590 = arg0;
				Static464.anInt8000 = arg2;
				Static216.method3997(Static320.aClass252_90);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local57.method7808(), local57.anIntArray780[0], local57.anIntArray781[0], local57.method7808(), -2, true);
			}
		}
		if (local21 == 1012) {
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static417.anInt7303 = 0;
			Static464.anInt8000 = arg2;
			local46 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local25);
			if (local46 != null) {
				local57 = local46.aClass20_Sub1_Sub1_Sub2_2;
				@Pc(1818) Class283 local1818 = local57.aClass283_1;
				if (local1818.anIntArray743 != null) {
					local1818 = local1818.method7368(Static417.aClass10_1);
				}
				if (local1818 != null) {
					Static216.method3997(Static486.aClass252_129);
					Static259.aClass1_Sub17_Sub2_1.method4473(local1818.anInt8422);
				}
			}
		}
		if (local21 == 48) {
			local926 = Static429.method6657(local18, local15);
			if (local926 != null) {
				Static295.method5141(local926);
			}
		}
		if (local21 == 13) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static127.anInt2590 = arg0;
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				Static464.anInt8000 = arg2;
				Static216.method3997(Static297.aClass252_85);
				Static259.aClass1_Sub17_Sub2_1.method4459(local25);
				Static259.aClass1_Sub17_Sub2_1.method4474(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 1003 || local21 == 1006 || local21 == 1004 || local21 == 1001 || local21 == 1007) {
			Static437.method4252(local15, local25, local21);
		}
		if (local21 == 19) {
			Static464.anInt8000 = arg2;
			Static417.anInt7303 = 0;
			Static127.anInt2590 = arg0;
			Static296.anInt7159 = 2;
			Static216.method3997(Static313.aClass252_89);
			Static259.aClass1_Sub17_Sub2_1.method4459(Static282.anInt5380 + local18);
			Static259.aClass1_Sub17_Sub2_1.method4484(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4473(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4459((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 57) {
			Static296.anInt7159 = 2;
			Static464.anInt8000 = arg2;
			Static127.anInt2590 = arg0;
			Static417.anInt7303 = 0;
			Static216.method3997(Static255.aClass252_73);
			Static259.aClass1_Sub17_Sub2_1.method4446((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static259.aClass1_Sub17_Sub2_1.method4446(Static538.anInt9485 + local15);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static25.aClass241_1.method6303(82) ? 1 : 0);
			Static259.aClass1_Sub17_Sub2_1.method4506(Static282.anInt5380 + local18);
			Static406.method6472(local18, local34, local15);
		}
		if (local21 == 18) {
			local200 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local25];
			if (local200 != null) {
				Static127.anInt2590 = arg0;
				Static464.anInt8000 = arg2;
				Static417.anInt7303 = 0;
				Static296.anInt7159 = 2;
				Static216.method3997(Static52.aClass252_70);
				Static259.aClass1_Sub17_Sub2_1.method4500(Static25.aClass241_1.method6303(82) ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4446(local25);
				Static355.method5833(0, 0, local200.method7808(), local200.anIntArray780[0], local200.anIntArray781[0], local200.method7808(), -2, true);
			}
		}
		if (local21 == 11) {
			if (Static378.anInt6739 > 0 && Static25.aClass241_1.method6303(82) && Static25.aClass241_1.method6303(81)) {
				Static89.method1899(Static538.anInt9485 + local15, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108, Static282.anInt5380 + local18);
			} else {
				Static305.method5363(local15, local25, local18);
				if (local25 == 1) {
					Static259.aClass1_Sub17_Sub2_1.method4451(-1);
					Static259.aClass1_Sub17_Sub2_1.method4451(-1);
					Static259.aClass1_Sub17_Sub2_1.method4473((int) Static135.aFloat193);
					Static259.aClass1_Sub17_Sub2_1.method4451(57);
					Static259.aClass1_Sub17_Sub2_1.method4451(Static445.anInt7798);
					Static259.aClass1_Sub17_Sub2_1.method4451(Static220.anInt4325);
					Static259.aClass1_Sub17_Sub2_1.method4451(89);
					Static259.aClass1_Sub17_Sub2_1.method4473(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954);
					Static259.aClass1_Sub17_Sub2_1.method4473(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949);
					Static259.aClass1_Sub17_Sub2_1.method4451(63);
				} else {
					Static417.anInt7303 = 0;
					Static296.anInt7159 = 1;
					Static464.anInt8000 = arg2;
					Static127.anInt2590 = arg0;
				}
				Static355.method5833(0, 0, 1, local15, local18, 1, -4, true);
			}
		}
		if (Static181.aBoolean310) {
			Static417.method6564();
		}
		if (Static237.aClass91_8 != null && Static36.anInt1096 == 0) {
			Static243.method4316(Static237.aClass91_8);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)Z")
	public static boolean method5464(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static478.anInt8507; local1 < Static63.anInt1587; local1++) {
			@Pc(6) Class64[][] local6 = Static263.aClass64ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static466.anInt8044; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static539.anInt9517 + local9;
				@Pc(18) int local18 = Static539.anInt9517 - local9;
				if (local14 >= Static395.anInt6943 || local18 < Static332.anInt6223) {
					for (@Pc(27) int local27 = -Static466.anInt8044; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static421.anInt7325 + local27;
						@Pc(36) int local36 = Static421.anInt7325 - local27;
						@Pc(48) Class64 local48;
						if (local14 >= Static395.anInt6943) {
							if (local32 >= Static301.anInt5882) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean154) {
									Static210.aBoolean326 = arg0;
									Static164.aClass40_1.method8213(local48);
									Static164.aClass40_1.method8209();
								}
							}
							if (local36 < Static287.anInt7764) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean154) {
									Static210.aBoolean326 = arg0;
									Static164.aClass40_1.method8213(local48);
									Static164.aClass40_1.method8209();
								}
							}
						}
						if (local18 < Static332.anInt6223) {
							if (local32 >= Static301.anInt5882) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean154) {
									Static210.aBoolean326 = arg0;
									Static164.aClass40_1.method8213(local48);
									Static164.aClass40_1.method8209();
								}
							}
							if (local36 < Static287.anInt7764) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean154) {
									Static210.aBoolean326 = arg0;
									Static164.aClass40_1.method8213(local48);
									Static164.aClass40_1.method8209();
								}
							}
						}
						if (Static90.anInt2018 == 0) {
							if (Static402.aBoolean543) {
								Static164.aClass40_1.method8219(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BIIII)V")
	public static void method5466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static260.anInt5066; local3++) {
			@Pc(9) Rectangle local9 = Class194.aRectangleArray2[local3];
			if (arg2 < local9.width + local9.x && arg1 + arg2 > local9.x && arg3 < local9.y + local9.height && local9.y < arg0 + arg3) {
				Static266.aBooleanArray18[local3] = true;
			}
		}
	}
}
