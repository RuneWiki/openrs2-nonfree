import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!el;")
	public static final Class109 aClass109_128 = new Class109(95, -1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
	public static final int[] anIntArray347 = new int[4];

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public static void method5420() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static565.aBoolean768) {
			if (Static167.aBoolean238) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static138.aFloat18 < (float) local7) {
			Static138.aFloat18 = (float) local7;
		}
		if ((float) local9 < Static138.aFloat18) {
			Static138.aFloat18 = (float) local9;
		}
		while (Static429.aFloat132 >= 16384.0F) {
			Static429.aFloat132 -= 16384.0F;
		}
		while (Static429.aFloat132 < 0.0F) {
			Static429.aFloat132 += 16384.0F;
		}
		@Pc(69) int local69 = Static425.anInt7328 >> 9;
		@Pc(73) int local73 = Static349.anInt6137 >> 9;
		@Pc(79) int local79 = Static380.method5559(Static425.anInt7328, Static240.anInt3974, Static349.anInt6137, 0);
		@Pc(81) int local81 = 0;
		@Pc(111) int local111;
		if (local69 > 3 && local73 > 3 && local69 < Static544.anInt9261 - 4 && local73 < Static282.anInt4887 - 4) {
			for (local111 = local69 - 4; local111 <= local69 + 4; local111++) {
				for (@Pc(119) int local119 = local73 - 4; local119 <= local73 + 4; local119++) {
					@Pc(123) int local123 = Static240.anInt3974;
					if (local123 < 3 && Static90.method1353(16403 - 16402, local119, local111)) {
						local123++;
					}
					@Pc(140) int local140 = 0;
					if (Static38.aClass153_Sub1_1.aByteArrayArrayArray11 != null && Static38.aClass153_Sub1_1.aByteArrayArrayArray11[local123] != null) {
						local140 = (Static38.aClass153_Sub1_1.aByteArrayArrayArray11[local123][local111][local119] & 0xFF) * 8 << 2;
					}
					if (Static242.aClass22Array3 != null && Static242.aClass22Array3[local123] != null) {
						@Pc(189) int local189 = local140 + local79 - Static242.aClass22Array3[local123].method8038(local119, local111);
						if (local189 > local81) {
							local81 = local189;
						}
					}
				}
			}
		}
		local111 = (local81 >> 2) * 1536;
		if (local111 > 786432) {
			local111 = 786432;
		}
		if (local111 < 262144) {
			local111 = 262144;
		}
		if (Static322.anInt5769 < local111) {
			Static322.anInt5769 += (local111 - Static322.anInt5769) / 24;
		} else if (local111 < Static322.anInt5769) {
			Static322.anInt5769 += (local111 - Static322.anInt5769) / 80;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!sg;III)V")
	public static void method5421(@OriginalArg(0) Class5_Sub5_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static199.aClass102_63.aClass5_61) {
			return;
		}
		@Pc(18) int local18 = arg0.anInt9213;
		@Pc(21) int local21 = arg0.anInt9207;
		@Pc(24) int local24 = arg0.anInt9210;
		@Pc(36) int local36 = (int) arg0.aLong267;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(47) long local47 = arg0.aLong267;
		@Pc(69) Class5_Sub50 local69;
		if (local24 == 16) {
			Static258.anInt4467 = arg1;
			Static645.anInt10495 = arg2;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static593.aClass387_115, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8514((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8531(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8514(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8520(local18 + Static622.anInt10188);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		@Pc(144) Class5_Sub50 local144;
		@Pc(125) Class8_Sub1_Sub3_Sub2_Sub1 local125;
		if (local24 == 53) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static618.anInt10171 = 0;
				Static645.anInt10495 = arg2;
				Static258.anInt4467 = arg1;
				Static108.anInt1751 = 2;
				local144 = Static457.method6722(Static474.aClass387_85, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 20) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static618.anInt10171 = 0;
				Static645.anInt10495 = arg2;
				Static258.anInt4467 = arg1;
				Static108.anInt1751 = 2;
				local144 = Static457.method6722(Static642.aClass387_120, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8484(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8480(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 22) {
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			Static258.anInt4467 = arg1;
			Static645.anInt10495 = arg2;
			local69 = Static457.method6722(Static552.aClass387_102, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8480(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8514((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8520(local18 + Static622.anInt10188);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		if (local24 == 1002) {
			Static258.anInt4467 = arg1;
			Static108.anInt1751 = 2;
			Static618.anInt10171 = 0;
			Static645.anInt10495 = arg2;
			local69 = Static457.method6722(Static590.aClass387_114, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8520((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8492(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8492(Static668.anInt10683 + local21);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		if (local24 == 1012 || local24 == 1001 || local24 == 1011 || local24 == 1010 || local24 == 1006) {
			Static287.method4314(local36, local18, local24);
		}
		@Pc(456) Class5_Sub50 local456;
		@Pc(434) Class5_Sub35 local434;
		@Pc(439) Class8_Sub1_Sub3_Sub2_Sub2 local439;
		if (local24 == 21) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static258.anInt4467 = arg1;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				Static108.anInt1751 = 2;
				local456 = Static457.method6722(Static74.aClass387_19, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8492(local36);
				local456.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		if (local24 == 15) {
			Static108.anInt1751 = 2;
			Static258.anInt4467 = arg1;
			Static645.anInt10495 = arg2;
			Static618.anInt10171 = 0;
			local69 = Static457.method6722(Static443.aClass387_79, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8492(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8484(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8514((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8520(local18 + Static622.anInt10188);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		if (local24 == 9) {
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static205.aClass387_38, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8486(Static7.anInt85);
			local69.aClass5_Sub23_Sub2_2.method8492(Static395.anInt6753);
			local69.aClass5_Sub23_Sub2_2.method8480(Static400.anInt6886);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8514(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt6994);
			Static494.method7120(local69);
		}
		if (local24 == 59) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static258.anInt4467 = arg1;
				Static108.anInt1751 = 2;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				local144 = Static457.method6722(Static382.aClass387_112, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 44) {
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static584.aClass387_111, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8531(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8480(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8520(local36);
			local69.aClass5_Sub23_Sub2_2.method8514(local18 + Static622.anInt10188);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 6) {
			if (Static539.anInt9221 > 0 && Static258.aClass89_1.method1617(82) && Static258.aClass89_1.method1617(81)) {
				Static374.method5468(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, Static668.anInt10683 + local21, local18 + Static622.anInt10188);
			} else {
				Static108.anInt1751 = 1;
				Static618.anInt10171 = 0;
				Static258.anInt4467 = arg1;
				Static645.anInt10495 = arg2;
				local69 = Static457.method6722(Static414.aClass387_74, Static80.aClass313_1);
				local69.aClass5_Sub23_Sub2_2.method8480(Static668.anInt10683 + local21);
				local69.aClass5_Sub23_Sub2_2.method8492(local18 + Static622.anInt10188);
				Static494.method7120(local69);
			}
		}
		if (local24 == 1009) {
			Static108.anInt1751 = 2;
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			local69 = Static457.method6722(Static542.aClass387_99, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8480(local36);
			Static494.method7120(local69);
		}
		if (local24 == 11) {
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 1;
			Static645.anInt10495 = arg2;
			local69 = Static457.method6722(Static334.aClass387_61, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8514(Static395.anInt6753);
			local69.aClass5_Sub23_Sub2_2.method8490(Static7.anInt85);
			local69.aClass5_Sub23_Sub2_2.method8480(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8492(Static400.anInt6886);
			local69.aClass5_Sub23_Sub2_2.method8480(Static622.anInt10188 + local18);
			Static494.method7120(local69);
			Static597.method8258(true, 0, local21, -4, local18, 0, 1, 1);
		}
		if (local24 == 45) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				Static618.anInt10171 = 0;
				Static645.anInt10495 = arg2;
				local144 = Static457.method6722(Static568.aClass387_106, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 48) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				Static108.anInt1751 = 2;
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static645.anInt10495 = arg2;
				Static258.anInt4467 = arg1;
				Static618.anInt10171 = 0;
				local456 = Static457.method6722(Static654.aClass387_124, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8520(local36);
				local456.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		if (local24 == 52 || local24 == 1004) {
			Static564.method8144(arg0.aString120, local21, local18, local36);
		}
		if (local24 == 60) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				local456 = Static457.method6722(Static584.aClass387_110, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8480(local36);
				local456.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		@Pc(1170) Class73 local1170;
		if (local24 == 46) {
			local1170 = Static506.method9206(local21, local18);
			if (local1170 != null) {
				Static179.method2592();
				@Pc(1177) Class5_Sub45 local1177 = Static81.method1252(local1170);
				Static455.method6703(local1177.anInt8276, local1170, local1177.method7132());
				Static211.aString54 = Static277.method4084(local1170);
				if (Static211.aString54 == null) {
					Static211.aString54 = "Null";
				}
				Static352.aString75 = local1170.aString22 + "<col=ffffff>";
			}
			return;
		}
		if (local24 == 12) {
			if (Static539.anInt9221 > 0 && Static258.aClass89_1.method1617(82) && Static258.aClass89_1.method1617(81)) {
				Static374.method5468(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, local21 + Static668.anInt10683, local18 + Static622.anInt10188);
			} else {
				local69 = Static217.method3106(local18, local21, local36);
				if (local36 == 1) {
					local69.aClass5_Sub23_Sub2_2.method8502(-1);
					local69.aClass5_Sub23_Sub2_2.method8502(-1);
					local69.aClass5_Sub23_Sub2_2.method8480((int) Static429.aFloat132);
					local69.aClass5_Sub23_Sub2_2.method8502(57);
					local69.aClass5_Sub23_Sub2_2.method8502(Static609.anInt10107);
					local69.aClass5_Sub23_Sub2_2.method8502(Static438.anInt7509);
					local69.aClass5_Sub23_Sub2_2.method8502(89);
					local69.aClass5_Sub23_Sub2_2.method8480(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355);
					local69.aClass5_Sub23_Sub2_2.method8480(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363);
					local69.aClass5_Sub23_Sub2_2.method8502(63);
				} else {
					Static258.anInt4467 = arg1;
					Static108.anInt1751 = 1;
					Static618.anInt10171 = 0;
					Static645.anInt10495 = arg2;
				}
				Static494.method7120(local69);
				Static597.method8258(true, 0, local21, -4, local18, 0, 1, 1);
			}
		}
		if (local24 == 17) {
			local1170 = Static506.method9206(local21, local18);
			if (local1170 != null) {
				Static429.method6350(local1170);
			}
		}
		if (local24 == 1007) {
			Static108.anInt1751 = 2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static645.anInt10495 = arg2;
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				@Pc(1381) Class227 local1381 = local439.aClass227_1;
				if (local1381.anIntArray341 != null) {
					local1381 = local1381.method5322(Static413.aClass118_1);
				}
				if (local1381 != null) {
					@Pc(1400) Class5_Sub50 local1400 = Static457.method6722(Static222.aClass387_40, Static80.aClass313_1);
					local1400.aClass5_Sub23_Sub2_2.method8480(local1381.anInt6260);
					Static494.method7120(local1400);
				}
			}
		}
		if (local24 == 58) {
			Static258.anInt4467 = arg1;
			Static645.anInt10495 = arg2;
			Static108.anInt1751 = 2;
			Static618.anInt10171 = 0;
			local69 = Static457.method6722(Static177.aClass387_34, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8520(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8520(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8520(local36);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 2) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				local144 = Static457.method6722(Static106.aClass387_25, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8492(local36);
				local144.aClass5_Sub23_Sub2_2.method8531(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 50) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				Static645.anInt10495 = arg2;
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static108.anInt1751 = 2;
				Static618.anInt10171 = 0;
				Static258.anInt4467 = arg1;
				local456 = Static457.method6722(Static347.aClass387_62, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8531(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local456.aClass5_Sub23_Sub2_2.method8520(local36);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		if (local24 == 13) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static645.anInt10495 = arg2;
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				Static618.anInt10171 = 0;
				local144 = Static457.method6722(Static205.aClass387_38, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8486(Static7.anInt85);
				local144.aClass5_Sub23_Sub2_2.method8492(Static395.anInt6753);
				local144.aClass5_Sub23_Sub2_2.method8480(Static400.anInt6886);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8514(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 3) {
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static554.aClass387_103, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8520(local18 + Static622.anInt10188);
			local69.aClass5_Sub23_Sub2_2.method8514(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8492((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		if (local24 == 8) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static618.anInt10171 = 0;
				Static645.anInt10495 = arg2;
				Static258.anInt4467 = arg1;
				Static108.anInt1751 = 2;
				local144 = Static457.method6722(Static499.aClass387_92, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8480(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 5) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				local456 = Static457.method6722(Static462.aClass387_83, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8484(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local456.aClass5_Sub23_Sub2_2.method8480(local36);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		if (local24 == 51) {
			Static618.anInt10171 = 0;
			Static645.anInt10495 = arg2;
			Static108.anInt1751 = 2;
			Static258.anInt4467 = arg1;
			local69 = Static457.method6722(Static408.aClass387_72, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8514(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8492((int) (local47 >>> 32) & Integer.MAX_VALUE);
			local69.aClass5_Sub23_Sub2_2.method8492(Static400.anInt6886);
			local69.aClass5_Sub23_Sub2_2.method8535(Static7.anInt85);
			local69.aClass5_Sub23_Sub2_2.method8492(Static668.anInt10683 + local21);
			local69.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8520(Static395.anInt6753);
			Static494.method7120(local69);
			Static475.method6915(local21, local18, local47);
		}
		if (local24 == 49) {
			Static108.anInt1751 = 2;
			Static618.anInt10171 = 0;
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			local69 = Static457.method6722(Static464.aClass387_84, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8514(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8480(local36);
			local69.aClass5_Sub23_Sub2_2.method8520(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8484(Static258.aClass89_1.method1617(82) ? 1 : 0);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 10) {
			local434 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local36, 1);
			if (local434 != null) {
				Static258.anInt4467 = arg1;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				local439 = local434.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				Static108.anInt1751 = 2;
				local456 = Static457.method6722(Static664.aClass387_127, Static80.aClass313_1);
				local456.aClass5_Sub23_Sub2_2.method8514(Static400.anInt6886);
				local456.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local456.aClass5_Sub23_Sub2_2.method8490(Static7.anInt85);
				local456.aClass5_Sub23_Sub2_2.method8520(Static395.anInt6753);
				local456.aClass5_Sub23_Sub2_2.method8480(local36);
				Static494.method7120(local456);
				Static597.method8258(true, 0, local439.anIntArray415[0], -2, local439.anIntArray414[0], 0, local439.method5993(), local439.method5993());
			}
		}
		if (local24 == 23) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static258.anInt4467 = arg1;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				Static108.anInt1751 = 2;
				local144 = Static457.method6722(Static159.aClass387_32, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8531(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 47 && Static24.aClass73_3 == null) {
			Static586.method8422(local21, local18);
			Static24.aClass73_3 = Static506.method9206(local21, local18);
			Static298.method4399(Static24.aClass73_3);
		}
		if (local24 == 4) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static645.anInt10495 = arg2;
				Static108.anInt1751 = 2;
				Static618.anInt10171 = 0;
				Static258.anInt4467 = arg1;
				local144 = Static457.method6722(Static371.aClass387_65, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				local144.aClass5_Sub23_Sub2_2.method8514(local36);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 18) {
			Static258.anInt4467 = arg1;
			Static108.anInt1751 = 2;
			Static645.anInt10495 = arg2;
			Static618.anInt10171 = 0;
			local69 = Static457.method6722(Static646.aClass387_90, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8514(local36);
			local69.aClass5_Sub23_Sub2_2.method8514(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8520(Static668.anInt10683 + local21);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 1003) {
			Static645.anInt10495 = arg2;
			Static258.anInt4467 = arg1;
			Static618.anInt10171 = 0;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static562.aClass387_52, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8480(local36);
			Static494.method7120(local69);
		}
		if (local24 == 30) {
			Static618.anInt10171 = 0;
			Static258.anInt4467 = arg1;
			Static108.anInt1751 = 2;
			Static645.anInt10495 = arg2;
			local69 = Static457.method6722(Static653.aClass387_123, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8514(Static400.anInt6886);
			local69.aClass5_Sub23_Sub2_2.method8480(local36);
			local69.aClass5_Sub23_Sub2_2.method8514(Static395.anInt6753);
			local69.aClass5_Sub23_Sub2_2.method8480(Static668.anInt10683 + local21);
			local69.aClass5_Sub23_Sub2_2.method8514(Static622.anInt10188 + local18);
			local69.aClass5_Sub23_Sub2_2.method8486(Static7.anInt85);
			local69.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 57) {
			Static645.anInt10495 = arg2;
			Static618.anInt10171 = 0;
			Static258.anInt4467 = arg1;
			Static108.anInt1751 = 2;
			local69 = Static457.method6722(Static470.aClass387_95, Static80.aClass313_1);
			local69.aClass5_Sub23_Sub2_2.method8492(local21 + Static668.anInt10683);
			local69.aClass5_Sub23_Sub2_2.method8520(local36);
			local69.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
			local69.aClass5_Sub23_Sub2_2.method8492(Static622.anInt10188 + local18);
			Static494.method7120(local69);
			Static261.method3842(local18, local21);
		}
		if (local24 == 25) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				Static108.anInt1751 = 2;
				Static258.anInt4467 = arg1;
				local144 = Static457.method6722(Static453.aClass387_81, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				local144.aClass5_Sub23_Sub2_2.method8502(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (local24 == 19) {
			local125 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local36];
			if (local125 != null) {
				Static258.anInt4467 = arg1;
				Static108.anInt1751 = 2;
				Static645.anInt10495 = arg2;
				Static618.anInt10171 = 0;
				local144 = Static457.method6722(Static258.aClass387_47, Static80.aClass313_1);
				local144.aClass5_Sub23_Sub2_2.method8520(local36);
				local144.aClass5_Sub23_Sub2_2.method8484(Static258.aClass89_1.method1617(82) ? 1 : 0);
				Static494.method7120(local144);
				Static597.method8258(true, 0, local125.anIntArray415[0], -2, local125.anIntArray414[0], 0, local125.method5993(), local125.method5993());
			}
		}
		if (Static199.aBoolean706) {
			Static179.method2592();
		}
		if (Static207.aClass73_13 != null && Static318.anInt5634 == 0) {
			Static298.method4399(Static207.aClass73_13);
		}
	}
}
