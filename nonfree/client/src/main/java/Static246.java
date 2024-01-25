import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "Lclient!it;")
	public static final Class149 aClass149_3 = new Class149();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIILclient!hv;)V")
	public static void method4224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub20 arg2) {
		if (arg2 == null || arg2 == Static192.aClass73_33.aClass12_47) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt4327;
		@Pc(18) int local18 = arg2.anInt4325;
		@Pc(21) int local21 = arg2.anInt4329;
		@Pc(25) int local25 = (int) arg2.aLong116;
		@Pc(28) long local28 = arg2.aLong116;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 2) {
			Static352.anInt6599 = 0;
			Static336.anInt6435 = 2;
			Static30.anInt9643 = arg0;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static28.aClass77_45);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static514.anInt1498);
			Static383.aClass12_Sub8_Sub2_1.method5190(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5215(local15 + Static61.anInt1459);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static148.anInt6865);
			Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
			Static383.aClass12_Sub8_Sub2_1.method5197(local25);
			Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static90.method1966(local15, local18);
		}
		@Pc(105) Class30_Sub1_Sub1_Sub1 local105;
		if (local21 == 15) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static352.anInt6599 = 0;
				Static30.anInt9643 = arg0;
				Static336.anInt6435 = 2;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static11.aClass77_1);
				Static383.aClass12_Sub8_Sub2_1.method5197(local25);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 1007) {
			Static403.anInt7574 = arg1;
			Static336.anInt6435 = 2;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static332.method5312(Static150.aClass77_32);
			Static383.aClass12_Sub8_Sub2_1.method5190(local25);
		}
		if (local21 == 49) {
			if (Static59.anInt1442 > 0 && Static23.aClass5_3.method211(82) && Static23.aClass5_3.method211(81)) {
				Static301.method4835(local15 + Static61.anInt1459, Static203.anInt4534 - -local18, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99);
			} else {
				Static30.anInt9643 = arg0;
				Static336.anInt6435 = 1;
				Static352.anInt6599 = 0;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static163.aClass77_34);
				Static383.aClass12_Sub8_Sub2_1.method5190(Static203.anInt4534 + local18);
				Static383.aClass12_Sub8_Sub2_1.method5215(local15 + Static61.anInt1459);
			}
		}
		if (local21 == 48) {
			Static403.anInt7574 = arg1;
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static336.anInt6435 = 2;
			Static332.method5312(Static439.aClass77_74);
			Static383.aClass12_Sub8_Sub2_1.method5182(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5197(local25);
			Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static90.method1966(local15, local18);
		}
		if (local21 == 58) {
			Static403.anInt7574 = arg1;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static336.anInt6435 = 2;
			Static332.method5312(Static277.aClass77_50);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static514.anInt1498);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5223(Static155.anInt3381);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static148.anInt6865);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static203.anInt4534 + local18);
			Static383.aClass12_Sub8_Sub2_1.method5197(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static218.method4009(local15, local18, local28);
		}
		if (local21 == 5) {
			if (Static59.anInt1442 > 0 && Static23.aClass5_3.method211(82) && Static23.aClass5_3.method211(81)) {
				Static301.method4835(local15 + Static61.anInt1459, local18 + Static203.anInt4534, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99);
			} else {
				Static303.method4927(local18, local25, local15);
				if (local25 == 1) {
					Static383.aClass12_Sub8_Sub2_1.method5214(-1);
					Static383.aClass12_Sub8_Sub2_1.method5214(-1);
					Static383.aClass12_Sub8_Sub2_1.method5190((int) Static500.aFloat186);
					Static383.aClass12_Sub8_Sub2_1.method5214(57);
					Static383.aClass12_Sub8_Sub2_1.method5214(Static432.anInt7990);
					Static383.aClass12_Sub8_Sub2_1.method5214(Static339.anInt6470);
					Static383.aClass12_Sub8_Sub2_1.method5214(89);
					Static383.aClass12_Sub8_Sub2_1.method5190(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418);
					Static383.aClass12_Sub8_Sub2_1.method5190(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416);
					Static383.aClass12_Sub8_Sub2_1.method5214(63);
				} else {
					Static336.anInt6435 = 1;
					Static30.anInt9643 = arg0;
					Static403.anInt7574 = arg1;
					Static352.anInt6599 = 0;
				}
				Static9.method274(1, local15, -4, local18, 0, true, 0, 1);
			}
		}
		if (local21 == 1008) {
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static332.method5312(Static512.aClass77_89);
			Static383.aClass12_Sub8_Sub2_1.method5190(local25);
		}
		if (local21 == 46) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static336.anInt6435 = 2;
				Static352.anInt6599 = 0;
				Static332.method5312(Static511.aClass77_88);
				Static383.aClass12_Sub8_Sub2_1.method5230(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5190(local25);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 1003 || local21 == 1012 || local21 == 1001 || local21 == 1006 || local21 == 1004) {
			Static522.method7743(local15, local21, local25);
		}
		if (local21 == 8) {
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static332.method5312(Static185.aClass77_38);
			Static383.aClass12_Sub8_Sub2_1.method5197(local15 + Static61.anInt1459);
			Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static203.anInt4534 + local18);
			Static383.aClass12_Sub8_Sub2_1.method5182(local25);
			Static90.method1966(local15, local18);
		}
		if (local21 == 57) {
			Static352.anInt6599 = 0;
			Static403.anInt7574 = arg1;
			Static30.anInt9643 = arg0;
			Static336.anInt6435 = 2;
			Static332.method5312(Static473.aClass77_85);
			Static383.aClass12_Sub8_Sub2_1.method5197((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static383.aClass12_Sub8_Sub2_1.method5190(local15 + Static61.anInt1459);
			Static383.aClass12_Sub8_Sub2_1.method5190(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static218.method4009(local15, local18, local28);
		}
		if (local21 == 22) {
			Static352.anInt6599 = 0;
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static30.anInt9643 = arg0;
			Static332.method5312(Static70.aClass77_16);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static203.anInt4534 + local18);
			Static383.aClass12_Sub8_Sub2_1.method5182(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static218.method4009(local15, local18, local28);
		}
		@Pc(748) Class198 local748;
		if (local21 == 51) {
			local748 = Static428.method6579(local18, local15);
			if (local748 != null) {
				Static386.method6842(local748);
			}
		}
		if (local21 == 59) {
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static403.anInt7574 = arg1;
			Static336.anInt6435 = 2;
			Static332.method5312(Static165.aClass77_36);
			Static383.aClass12_Sub8_Sub2_1.method5197(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5197(local15 + Static61.anInt1459);
			Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5215(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static218.method4009(local15, local18, local28);
		}
		@Pc(830) Class30_Sub1_Sub1_Sub2 local830;
		@Pc(825) Class12_Sub41 local825;
		if (local21 == 21) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static352.anInt6599 = 0;
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static336.anInt6435 = 2;
				Static332.method5312(Static48.aClass77_9);
				Static383.aClass12_Sub8_Sub2_1.method5190(local25);
				Static383.aClass12_Sub8_Sub2_1.method5183(Static155.anInt3381);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5197(Static514.anInt1498);
				Static383.aClass12_Sub8_Sub2_1.method5197(Static148.anInt6865);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 25 || local21 == 1009) {
			Static532.method7874(local15, arg2.aString41, local18, local25);
		}
		if (local21 == 6) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static403.anInt7574 = arg1;
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				Static352.anInt6599 = 0;
				Static332.method5312(Static320.aClass77_57);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5190(local25);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 10) {
			Static336.anInt6435 = 2;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static164.aClass77_35);
			Static383.aClass12_Sub8_Sub2_1.method5215(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5215((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static218.method4009(local15, local18, local28);
		}
		if (local21 == 45) {
			Static336.anInt6435 = 1;
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static286.aClass77_52);
			Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
			Static383.aClass12_Sub8_Sub2_1.method5182(Static514.anInt1498);
			Static383.aClass12_Sub8_Sub2_1.method5190(Static203.anInt4534 + local18);
			Static383.aClass12_Sub8_Sub2_1.method5190(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static148.anInt6865);
			Static9.method274(1, local15, -4, local18, 0, true, 0, 1);
		}
		if (local21 == 47 && Static188.aClass198_5 == null) {
			Static184.method3615(local18, local15);
			Static188.aClass198_5 = Static428.method6579(local18, local15);
			Static331.method5282(Static188.aClass198_5);
		}
		if (local21 == 17) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static352.anInt6599 = 0;
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static12.aClass77_2);
				Static383.aClass12_Sub8_Sub2_1.method5182(local25);
				Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 11) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static352.anInt6599 = 0;
				Static336.anInt6435 = 2;
				Static332.method5312(Static334.aClass77_60);
				Static383.aClass12_Sub8_Sub2_1.method5215(local25);
				Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 3) {
			local748 = Static428.method6579(local18, local15);
			if (local748 != null) {
				Static227.method4101();
				@Pc(1249) Class12_Sub42 local1249 = Static67.method1529(local748);
				Static274.method4603(local748, local1249.anInt6906, local1249.method5780());
				Static274.aString59 = Static14.method356(local748);
				if (Static274.aString59 == null) {
					Static274.aString59 = "Null";
				}
				Static497.aString104 = local748.aString65 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 50) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static30.anInt9643 = arg0;
				Static352.anInt6599 = 0;
				Static403.anInt7574 = arg1;
				Static336.anInt6435 = 2;
				Static332.method5312(Static133.aClass77_28);
				Static383.aClass12_Sub8_Sub2_1.method5230(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5182(local25);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 23) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static352.anInt6599 = 0;
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static329.aClass77_59);
				Static383.aClass12_Sub8_Sub2_1.method5230(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5197(local25);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 1011) {
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static332.method5312(Static464.aClass77_82);
			Static383.aClass12_Sub8_Sub2_1.method5182(local15 + Static61.anInt1459);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static203.anInt4534 + local18);
			Static383.aClass12_Sub8_Sub2_1.method5182(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static218.method4009(local15, local18, local28);
		}
		if (local21 == 30) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				Static352.anInt6599 = 0;
				Static403.anInt7574 = arg1;
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				Static332.method5312(Static262.aClass77_48);
				Static383.aClass12_Sub8_Sub2_1.method5230(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5215(local25);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 44) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static30.anInt9643 = arg0;
				Static352.anInt6599 = 0;
				Static336.anInt6435 = 2;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static136.aClass77_30);
				Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
				Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5215(Static148.anInt6865);
				Static383.aClass12_Sub8_Sub2_1.method5197(Static514.anInt1498);
				Static383.aClass12_Sub8_Sub2_1.method5215(local25);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 19) {
			Static403.anInt7574 = arg1;
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static336.anInt6435 = 2;
			Static332.method5312(Static49.aClass77_10);
			Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static61.anInt1459 + local15);
			Static383.aClass12_Sub8_Sub2_1.method5182(local25);
			Static383.aClass12_Sub8_Sub2_1.method5197(local18 + Static203.anInt4534);
			Static90.method1966(local15, local18);
		}
		if (local21 == 60) {
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static136.aClass77_30);
			Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
			Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static148.anInt6865);
			Static383.aClass12_Sub8_Sub2_1.method5197(Static514.anInt1498);
			Static383.aClass12_Sub8_Sub2_1.method5215(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt4197);
		}
		if (local21 == 1010) {
			Static352.anInt6599 = 0;
			Static30.anInt9643 = arg0;
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				@Pc(1752) Class130 local1752 = local830.aClass130_1;
				if (local1752.anIntArray308 != null) {
					local1752 = local1752.method3570(Static393.aClass31_1);
				}
				if (local1752 != null) {
					Static332.method5312(Static434.aClass77_73);
					Static383.aClass12_Sub8_Sub2_1.method5190(local1752.anInt4110);
				}
			}
		}
		if (local21 == 20) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static352.anInt6599 = 0;
				Static336.anInt6435 = 2;
				Static332.method5312(Static388.aClass77_67);
				Static383.aClass12_Sub8_Sub2_1.method5182(local25);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (local21 == 18) {
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static336.anInt6435 = 2;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static209.aClass77_42);
			Static383.aClass12_Sub8_Sub2_1.method5197(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5190(local25);
			Static383.aClass12_Sub8_Sub2_1.method5190(Static61.anInt1459 + local15);
			Static90.method1966(local15, local18);
		}
		if (local21 == 13) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static352.anInt6599 = 0;
				Static332.method5312(Static133.aClass77_29);
				Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5182(local25);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 12) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				Static30.anInt9643 = arg0;
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static336.anInt6435 = 2;
				Static403.anInt7574 = arg1;
				Static352.anInt6599 = 0;
				Static332.method5312(Static225.aClass77_43);
				Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5215(local25);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 16) {
			local825 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local25);
			if (local825 != null) {
				Static403.anInt7574 = arg1;
				Static336.anInt6435 = 2;
				Static30.anInt9643 = arg0;
				local830 = local825.aClass30_Sub1_Sub1_Sub2_2;
				Static352.anInt6599 = 0;
				Static332.method5312(Static46.aClass77_8);
				Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5182(local25);
				Static9.method274(local830.method3591(), local830.anIntArray316[0], -2, local830.anIntArray317[0], 0, true, 0, local830.method3591());
			}
		}
		if (local21 == 9) {
			Static336.anInt6435 = 2;
			Static30.anInt9643 = arg0;
			Static352.anInt6599 = 0;
			Static403.anInt7574 = arg1;
			Static332.method5312(Static293.aClass77_83);
			Static383.aClass12_Sub8_Sub2_1.method5178(Static23.aClass5_3.method211(82) ? 1 : 0);
			Static383.aClass12_Sub8_Sub2_1.method5197(local18 + Static203.anInt4534);
			Static383.aClass12_Sub8_Sub2_1.method5215(local25);
			Static383.aClass12_Sub8_Sub2_1.method5215(local15 + Static61.anInt1459);
			Static90.method1966(local15, local18);
		}
		if (local21 == 4) {
			local105 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local25];
			if (local105 != null) {
				Static336.anInt6435 = 2;
				Static352.anInt6599 = 0;
				Static30.anInt9643 = arg0;
				Static403.anInt7574 = arg1;
				Static332.method5312(Static453.aClass77_77);
				Static383.aClass12_Sub8_Sub2_1.method5197(local25);
				Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
				Static9.method274(local105.method3591(), local105.anIntArray316[0], -2, local105.anIntArray317[0], 0, true, 0, local105.method3591());
			}
		}
		if (Static73.aBoolean136) {
			Static227.method4101();
		}
		if (Static445.aClass198_14 != null && Static47.anInt890 == 0) {
			Static331.method5282(Static445.aClass198_14);
		}
	}
}
