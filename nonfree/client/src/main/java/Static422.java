import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_138 = new Class218(4, -1);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILclient!et;I)V")
	public static void method8088(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static187.aClass276_28.aClass3_231) {
			return;
		}
		@Pc(20) int local20 = arg1.anInt3487;
		@Pc(23) int local23 = arg1.anInt3483;
		@Pc(26) int local26 = arg1.anInt3485;
		@Pc(30) int local30 = (int) arg1.aLong74;
		@Pc(33) long local33 = arg1.aLong74;
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(48) Class2_Sub3_Sub1_Sub2_Sub2 local48;
		@Pc(67) Class3_Sub26 local67;
		if (local26 == 46) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				local67 = Static640.method8636(Static125.aClass344_53, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8408(Static60.anInt1272);
				local67.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local67.aClass3_Sub15_Sub1_3.method8408(local30);
				local67.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
				local67.aClass3_Sub15_Sub1_3.method8423(Static33.anInt612);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (local26 == 16) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				Static489.anInt8687 = 0;
				Static338.anInt6676 = arg0;
				local67 = Static640.method8636(Static260.aClass344_64, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8464(local30);
				local67.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		@Pc(218) Class3_Sub26 local218;
		if (local26 == 10) {
			Static412.anInt7699 = 1;
			Static338.anInt6676 = arg0;
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			local218 = Static640.method8636(Static65.aClass344_21, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
			local218.aClass3_Sub15_Sub1_3.method8431(Static446.anInt8090 + local20);
			local218.aClass3_Sub15_Sub1_3.method8423(Static60.anInt1272);
			local218.aClass3_Sub15_Sub1_3.method8408(Static33.anInt612);
			local218.aClass3_Sub15_Sub1_3.method8408(local23 + Static124.anInt3150);
			Static472.method5189(local218);
			Static167.method3514(0, 0, true, 1, -4, local23, 1, local20);
		}
		if (local26 == 1007 || local26 == 1008 || local26 == 1009 || local26 == 1006 || local26 == 1004) {
			Static456.method6865(local30, local20, local26);
		}
		if (local26 == 5) {
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			Static412.anInt7699 = 2;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static410.aClass344_89, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8399(Static461.anInt8388);
			local218.aClass3_Sub15_Sub1_3.method8431(Static60.anInt1272);
			local218.aClass3_Sub15_Sub1_3.method8431(Static33.anInt612);
			local218.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8423(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local218.aClass3_Sub15_Sub1_3.method8431(Static446.anInt8090 + local20);
			local218.aClass3_Sub15_Sub1_3.method8408(local23 + Static124.anInt3150);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 2) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				Static412.anInt7699 = 2;
				Static489.anInt8687 = 0;
				local67 = Static640.method8636(Static133.aClass344_34, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local67.aClass3_Sub15_Sub1_3.method8431(local30);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		@Pc(458) Class3_Sub49 local458;
		@Pc(463) Class2_Sub3_Sub1_Sub2_Sub1 local463;
		if (local26 == 1012) {
			Static489.anInt8687 = 0;
			Static412.anInt7699 = 2;
			Static555.anInt9456 = arg2;
			Static338.anInt6676 = arg0;
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				@Pc(466) Class22 local466 = local463.aClass22_1;
				if (local466.anIntArray29 != null) {
					local466 = local466.method425(Static514.aClass166_1);
				}
				if (local466 != null) {
					@Pc(485) Class3_Sub26 local485 = Static640.method8636(Static263.aClass344_67, Static403.aClass294_3);
					local485.aClass3_Sub15_Sub1_3.method8464(local466.anInt397);
					Static472.method5189(local485);
				}
			}
		}
		if (local26 == 50) {
			Static412.anInt7699 = 2;
			Static555.anInt9456 = arg2;
			Static338.anInt6676 = arg0;
			Static489.anInt8687 = 0;
			local218 = Static640.method8636(Static595.aClass344_118, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8431(Static446.anInt8090 + local20);
			local218.aClass3_Sub15_Sub1_3.method8464(local23 + Static124.anInt3150);
			local218.aClass3_Sub15_Sub1_3.method8423(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local218.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 48) {
			if (Static106.anInt2660 > 0 && Static326.aClass238_1.method6948(82) && Static326.aClass238_1.method6948(81)) {
				Static481.method2825(local20 + Static446.anInt8090, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, Static124.anInt3150 + local23);
			} else {
				local218 = Static13.method197(local23, local30, local20);
				if (local30 == 1) {
					local218.aClass3_Sub15_Sub1_3.method8448(-1);
					local218.aClass3_Sub15_Sub1_3.method8448(-1);
					local218.aClass3_Sub15_Sub1_3.method8464((int) Static502.aFloat230);
					local218.aClass3_Sub15_Sub1_3.method8448(57);
					local218.aClass3_Sub15_Sub1_3.method8448(Static30.anInt575);
					local218.aClass3_Sub15_Sub1_3.method8448(Static127.anInt3186);
					local218.aClass3_Sub15_Sub1_3.method8448(89);
					local218.aClass3_Sub15_Sub1_3.method8464(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428);
					local218.aClass3_Sub15_Sub1_3.method8464(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424);
					local218.aClass3_Sub15_Sub1_3.method8448(63);
				} else {
					Static412.anInt7699 = 1;
					Static489.anInt8687 = 0;
					Static555.anInt9456 = arg2;
					Static338.anInt6676 = arg0;
				}
				Static472.method5189(local218);
				Static167.method3514(0, 0, true, 1, -4, local23, 1, local20);
			}
		}
		@Pc(717) Class3_Sub26 local717;
		if (local26 == 17) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				Static412.anInt7699 = 2;
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static489.anInt8687 = 0;
				Static338.anInt6676 = arg0;
				Static555.anInt9456 = arg2;
				local717 = Static640.method8636(Static68.aClass344_22, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local717.aClass3_Sub15_Sub1_3.method8464(local30);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 9) {
			Static412.anInt7699 = 2;
			Static489.anInt8687 = 0;
			Static555.anInt9456 = arg2;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static465.aClass344_97, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8423(Static124.anInt3150 + local23);
			local218.aClass3_Sub15_Sub1_3.method8408(local30);
			local218.aClass3_Sub15_Sub1_3.method8423(Static446.anInt8090 + local20);
			local218.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 1003) {
			Static338.anInt6676 = arg0;
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			Static489.anInt8687 = 0;
			local218 = Static640.method8636(Static327.aClass344_79, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8431(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local218.aClass3_Sub15_Sub1_3.method8464(local23 + Static124.anInt3150);
			local218.aClass3_Sub15_Sub1_3.method8408(local20 + Static446.anInt8090);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 21 || local26 == 1011) {
			Static349.method5731(local23, local30, arg1.aString27, local20);
		}
		if (local26 == 60) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				local717 = Static640.method8636(Static319.aClass344_77, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8431(local30);
				local717.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 6) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static489.anInt8687 = 0;
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				local67 = Static640.method8636(Static238.aClass344_60, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local67.aClass3_Sub15_Sub1_3.method8464(local30);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (local26 == 12) {
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			local218 = Static640.method8636(Static7.aClass344_1, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8431(local30);
			local218.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8423(Static124.anInt3150 + local23);
			local218.aClass3_Sub15_Sub1_3.method8423(Static446.anInt8090 + local20);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 19) {
			Static338.anInt6676 = arg0;
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			Static489.anInt8687 = 0;
			local218 = Static640.method8636(Static131.aClass344_33, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8408(Static446.anInt8090 + local20);
			local218.aClass3_Sub15_Sub1_3.method8464(local30);
			local218.aClass3_Sub15_Sub1_3.method8408(Static124.anInt3150 + local23);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 3) {
			Static338.anInt6676 = arg0;
			Static489.anInt8687 = 0;
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			local218 = Static640.method8636(Static507.aClass344_108, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8431(local23 + Static124.anInt3150);
			local218.aClass3_Sub15_Sub1_3.method8431(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local218.aClass3_Sub15_Sub1_3.method8431(local20 + Static446.anInt8090);
			local218.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 58) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				Static489.anInt8687 = 0;
				Static338.anInt6676 = arg0;
				Static555.anInt9456 = arg2;
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static412.anInt7699 = 2;
				local717 = Static640.method8636(Static388.aClass344_86, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8464(Static60.anInt1272);
				local717.aClass3_Sub15_Sub1_3.method8454(Static461.anInt8388);
				local717.aClass3_Sub15_Sub1_3.method8464(local30);
				local717.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local717.aClass3_Sub15_Sub1_3.method8408(Static33.anInt612);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 57) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				Static412.anInt7699 = 2;
				Static489.anInt8687 = 0;
				local67 = Static640.method8636(Static457.aClass344_94, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local67.aClass3_Sub15_Sub1_3.method8431(local30);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (local26 == 59 && Static529.aClass108_11 == null) {
			Static104.method2563(local23, local20);
			Static529.aClass108_11 = Static526.method6818(local20, local23);
			Static139.method3135(Static529.aClass108_11);
		}
		if (local26 == 45) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				local67 = Static640.method8636(Static348.aClass344_26, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8408(local30);
				local67.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		@Pc(1506) Class108 local1506;
		if (local26 == 11) {
			local1506 = Static526.method6818(local20, local23);
			if (local1506 != null) {
				Static253.method4772(local1506);
			}
		}
		if (local26 == 15) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				Static412.anInt7699 = 2;
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				local717 = Static640.method8636(Static644.aClass344_128, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local717.aClass3_Sub15_Sub1_3.method8464(local30);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 30) {
			local1506 = Static526.method6818(local20, local23);
			if (local1506 != null) {
				Static32.method596();
				@Pc(1605) Class3_Sub11 local1605 = Static71.method1836(local1506);
				Static386.method6952(local1605.anInt1135, local1506, local1605.method1191());
				Static330.aString71 = Static351.method5755(local1506);
				Static275.aString60 = local1506.aString37 + "<col=ffffff>";
				if (Static330.aString71 == null) {
					Static330.aString71 = "Null";
				}
			}
			return;
		}
		if (local26 == 49) {
			if (Static106.anInt2660 > 0 && Static326.aClass238_1.method6948(82) && Static326.aClass238_1.method6948(81)) {
				Static481.method2825(local20 + Static446.anInt8090, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, Static124.anInt3150 + local23);
			} else {
				Static412.anInt7699 = 1;
				Static489.anInt8687 = 0;
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				local218 = Static640.method8636(Static458.aClass344_95, Static403.aClass294_3);
				local218.aClass3_Sub15_Sub1_3.method8464(local23 + Static124.anInt3150);
				local218.aClass3_Sub15_Sub1_3.method8464(local20 + Static446.anInt8090);
				Static472.method5189(local218);
			}
		}
		if (local26 == 44) {
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			Static412.anInt7699 = 2;
			local218 = Static640.method8636(Static472.aClass344_76, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8464(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local218.aClass3_Sub15_Sub1_3.method8423(local20 + Static446.anInt8090);
			local218.aClass3_Sub15_Sub1_3.method8408(local23 + Static124.anInt3150);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 23) {
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static447.aClass344_93, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8423(local23 + Static124.anInt3150);
			local218.aClass3_Sub15_Sub1_3.method8431(local30);
			local218.aClass3_Sub15_Sub1_3.method8464(local20 + Static446.anInt8090);
			local218.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 13) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				Static412.anInt7699 = 2;
				local67 = Static640.method8636(Static480.aClass344_102, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8464(local30);
				local67.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (local26 == 1002) {
			Static412.anInt7699 = 2;
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static234.aClass344_59, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8464(local30);
			Static472.method5189(local218);
		}
		if (local26 == 22) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				Static489.anInt8687 = 0;
				Static338.anInt6676 = arg0;
				local717 = Static640.method8636(Static527.aClass344_112, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8408(local30);
				local717.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 4) {
			Static489.anInt8687 = 0;
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static35.aClass344_13, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8464(Static124.anInt3150 + local23);
			local218.aClass3_Sub15_Sub1_3.method8423(local30);
			local218.aClass3_Sub15_Sub1_3.method8408(local20 + Static446.anInt8090);
			local218.aClass3_Sub15_Sub1_3.method8448(Static326.aClass238_1.method6948(82) ? 1 : 0);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 18) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static412.anInt7699 = 2;
				Static489.anInt8687 = 0;
				Static555.anInt9456 = arg2;
				Static338.anInt6676 = arg0;
				local67 = Static640.method8636(Static70.aClass344_23, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8431(local30);
				local67.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (local26 == 51) {
			Static489.anInt8687 = 0;
			Static555.anInt9456 = arg2;
			Static338.anInt6676 = arg0;
			Static412.anInt7699 = 2;
			local218 = Static640.method8636(Static224.aClass344_54, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8408(local23 + Static124.anInt3150);
			local218.aClass3_Sub15_Sub1_3.method8431((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local218.aClass3_Sub15_Sub1_3.method8408(local20 + Static446.anInt8090);
			Static472.method5189(local218);
			Static541.method7682(local20, local23, local33);
		}
		if (local26 == 8) {
			local458 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local30);
			if (local458 != null) {
				Static412.anInt7699 = 2;
				local463 = local458.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static489.anInt8687 = 0;
				Static338.anInt6676 = arg0;
				Static555.anInt9456 = arg2;
				local717 = Static640.method8636(Static274.aClass344_68, Static403.aClass294_3);
				local717.aClass3_Sub15_Sub1_3.method8464(local30);
				local717.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
				Static472.method5189(local717);
				Static167.method3514(0, 0, true, local463.method5308(), -2, local463.anIntArray377[0], local463.method5308(), local463.anIntArray378[0]);
			}
		}
		if (local26 == 25) {
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			Static412.anInt7699 = 2;
			local218 = Static640.method8636(Static263.aClass344_66, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8431(Static124.anInt3150 + local23);
			local218.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
			local218.aClass3_Sub15_Sub1_3.method8464(local30);
			local218.aClass3_Sub15_Sub1_3.method8423(Static33.anInt612);
			local218.aClass3_Sub15_Sub1_3.method8464(Static60.anInt1272);
			local218.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8423(local20 + Static446.anInt8090);
			Static472.method5189(local218);
			Static282.method4631(local20, local23);
		}
		if (local26 == 1010) {
			Static412.anInt7699 = 2;
			Static555.anInt9456 = arg2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static112.aClass344_28, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8464(local30);
			Static472.method5189(local218);
		}
		if (local26 == 47) {
			Static555.anInt9456 = arg2;
			Static412.anInt7699 = 2;
			Static489.anInt8687 = 0;
			Static338.anInt6676 = arg0;
			local218 = Static640.method8636(Static125.aClass344_53, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8408(Static60.anInt1272);
			local218.aClass3_Sub15_Sub1_3.method8441(Static326.aClass238_1.method6948(82) ? 1 : 0);
			local218.aClass3_Sub15_Sub1_3.method8408(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6289);
			local218.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
			local218.aClass3_Sub15_Sub1_3.method8423(Static33.anInt612);
			Static472.method5189(local218);
		}
		if (local26 == 20) {
			local48 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local30];
			if (local48 != null) {
				Static338.anInt6676 = arg0;
				Static489.anInt8687 = 0;
				Static412.anInt7699 = 2;
				Static555.anInt9456 = arg2;
				local67 = Static640.method8636(Static82.aClass344_24, Static403.aClass294_3);
				local67.aClass3_Sub15_Sub1_3.method8428(Static326.aClass238_1.method6948(82) ? 1 : 0);
				local67.aClass3_Sub15_Sub1_3.method8431(local30);
				Static472.method5189(local67);
				Static167.method3514(0, 0, true, local48.method5308(), -2, local48.anIntArray377[0], local48.method5308(), local48.anIntArray378[0]);
			}
		}
		if (Static82.aBoolean192) {
			Static32.method596();
		}
		if (Static186.aClass108_6 != null && Static3.anInt10484 == 0) {
			Static139.method3135(Static186.aClass108_6);
		}
	}
}
