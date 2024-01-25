import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "Lclient!hl;")
	public static Class156 aClass156_92 = new Class156(101, 4);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILclient!mk;I)V")
	public static void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub13 arg2) {
		if (arg2 == null || Static399.aClass20_33.aClass5_19 == arg2) {
			return;
		}
		@Pc(18) int local18 = arg2.anInt6066;
		@Pc(21) int local21 = arg2.anInt6069;
		@Pc(31) int local31 = arg2.anInt6068;
		@Pc(35) int local35 = (int) arg2.aLong176;
		if (local31 >= 2000) {
			local31 -= 2000;
		}
		@Pc(44) long local44 = arg2.aLong176;
		@Pc(67) Class5_Sub41 local67;
		if (local31 == 50) {
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			local67 = Static647.method8905(Static493.aClass381_206, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			local67.aClass5_Sub36_Sub2_1.method7286((int) (local44 >>> 32) & Integer.MAX_VALUE);
			local67.aClass5_Sub36_Sub2_1.method7296(local21 + Static290.anInt5128);
			local67.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 1009) {
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			local67 = Static647.method8905(Static92.aClass381_249, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7285(Integer.MAX_VALUE & (int) (local44 >>> 32));
			local67.aClass5_Sub36_Sub2_1.method7296(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 22 || local31 == 1007) {
			Static504.method6987(local35, arg2.aString74, local21, local18);
		}
		@Pc(235) Class5_Sub41 local235;
		@Pc(215) Class4_Sub1_Sub1_Sub2_Sub1 local215;
		if (local31 == 49) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static80.anInt1424 = 2;
				Static465.anInt7544 = arg0;
				Static90.anInt1510 = arg1;
				Static362.anInt9813 = 0;
				local235 = Static647.method8905(Static369.aClass381_157, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7285(local35);
				local235.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		@Pc(315) Class5_Sub41 local315;
		@Pc(292) Class5_Sub9 local292;
		@Pc(307) Class4_Sub1_Sub1_Sub2_Sub2 local307;
		if (local31 == 12) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				Static362.anInt9813 = 0;
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static465.anInt7544 = arg0;
				local315 = Static647.method8905(Static140.aClass381_66, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7285(local35);
				local315.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 10) {
			if (Static296.anInt5190 > 0 && Static53.aClass297_1.method6737(82) && Static53.aClass297_1.method6737(81)) {
				Static543.method7446(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, local21 + Static290.anInt5128, local18 + Static315.anInt5380);
			} else {
				local67 = Static209.method3400(local21, local18, local35);
				if (local35 == 1) {
					local67.aClass5_Sub36_Sub2_1.method7324(-1);
					local67.aClass5_Sub36_Sub2_1.method7324(-1);
					local67.aClass5_Sub36_Sub2_1.method7296((int) Static243.aFloat117);
					local67.aClass5_Sub36_Sub2_1.method7324(57);
					local67.aClass5_Sub36_Sub2_1.method7324(Static271.anInt4907);
					local67.aClass5_Sub36_Sub2_1.method7324(Static283.anInt5029);
					local67.aClass5_Sub36_Sub2_1.method7324(89);
					local67.aClass5_Sub36_Sub2_1.method7296(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805);
					local67.aClass5_Sub36_Sub2_1.method7296(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803);
					local67.aClass5_Sub36_Sub2_1.method7324(63);
				} else {
					Static80.anInt1424 = 1;
					Static90.anInt1510 = arg1;
					Static465.anInt7544 = arg0;
					Static362.anInt9813 = 0;
				}
				Static4.aClass389_17.method9079(local67);
				Static467.method6578(0, local21, local18, 1, 1, 0, true, -4);
			}
		}
		if (local31 == 30) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static80.anInt1424 = 2;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				Static90.anInt1510 = arg1;
				local235 = Static647.method8905(Static116.aClass381_228, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local235.aClass5_Sub36_Sub2_1.method7277(local35);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 15) {
			Static465.anInt7544 = arg0;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 1;
			Static90.anInt1510 = arg1;
			local67 = Static647.method8905(Static215.aClass381_91, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7296(Static268.anInt4795);
			local67.aClass5_Sub36_Sub2_1.method7296(local18 + Static315.anInt5380);
			local67.aClass5_Sub36_Sub2_1.method7277(Static516.anInt8202);
			local67.aClass5_Sub36_Sub2_1.method7307(Static14.anInt171);
			local67.aClass5_Sub36_Sub2_1.method7285(Static290.anInt5128 + local21);
			Static4.aClass389_17.method9079(local67);
			Static467.method6578(0, local21, local18, 1, 1, 0, true, -4);
		}
		if (local31 == 44) {
			Static465.anInt7544 = arg0;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static566.aClass381_235, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(local21 + Static290.anInt5128);
			local67.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7277(Integer.MAX_VALUE & (int) (local44 >>> 32));
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 4) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static90.anInt1510 = arg1;
				Static80.anInt1424 = 2;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				local315 = Static647.method8905(Static199.aClass381_86, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7296(local35);
				local315.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 3) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				Static362.anInt9813 = 0;
				Static80.anInt1424 = 2;
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static465.anInt7544 = arg0;
				Static90.anInt1510 = arg1;
				local315 = Static647.method8905(Static30.aClass381_16, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7285(local35);
				local315.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 46) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static362.anInt9813 = 0;
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				Static465.anInt7544 = arg0;
				local235 = Static647.method8905(Static246.aClass381_110, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local235.aClass5_Sub36_Sub2_1.method7285(local35);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 13) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				local235 = Static647.method8905(Static519.aClass381_215, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local235.aClass5_Sub36_Sub2_1.method7326(Static14.anInt171);
				local235.aClass5_Sub36_Sub2_1.method7296(local35);
				local235.aClass5_Sub36_Sub2_1.method7286(Static268.anInt4795);
				local235.aClass5_Sub36_Sub2_1.method7277(Static516.anInt8202);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		@Pc(1065) Class238 local1065;
		if (local31 == 53) {
			local1065 = Static333.method5035(local18, local21);
			if (local1065 != null) {
				Static55.method973();
				@Pc(1072) Class5_Sub18 local1072 = Static73.method1209(local1065);
				Static137.method2548(local1065, local1072.anInt2204, local1072.method1972());
				Static570.aString102 = Static70.method1151(local1065);
				Static47.aString9 = local1065.aString69 + "<col=ffffff>";
				if (Static570.aString102 == null) {
					Static570.aString102 = "Null";
				}
			}
			return;
		}
		if (local31 == 59) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				Static90.anInt1510 = arg1;
				Static80.anInt1424 = 2;
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				local315 = Static647.method8905(Static399.aClass381_172, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7277(local35);
				local315.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local315.aClass5_Sub36_Sub2_1.method7326(Static14.anInt171);
				local315.aClass5_Sub36_Sub2_1.method7285(Static516.anInt8202);
				local315.aClass5_Sub36_Sub2_1.method7277(Static268.anInt4795);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 8) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static362.anInt9813 = 0;
				Static465.anInt7544 = arg0;
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				local235 = Static647.method8905(Static36.aClass381_19, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7277(local35);
				local235.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 2) {
			Static465.anInt7544 = arg0;
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static284.aClass381_125, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7277(local35);
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			local67.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (local31 == 57) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static362.anInt9813 = 0;
				Static90.anInt1510 = arg1;
				Static465.anInt7544 = arg0;
				Static80.anInt1424 = 2;
				local235 = Static647.method8905(Static165.aClass381_77, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7285(local35);
				local235.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 1002) {
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				@Pc(1449) Class105 local1449 = local307.aClass105_1;
				if (local1449.anIntArray134 != null) {
					local1449 = local1449.method2622(Static23.aClass247_1);
				}
				if (local1449 != null) {
					@Pc(1469) Class5_Sub41 local1469 = Static647.method8905(Static479.aClass381_204, Static4.aClass389_17.aClass393_2);
					local1469.aClass5_Sub36_Sub2_1.method7296(local1449.anInt2836);
					Static4.aClass389_17.method9079(local1469);
				}
			}
		}
		if (local31 == 47) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static465.anInt7544 = arg0;
				Static90.anInt1510 = arg1;
				Static80.anInt1424 = 2;
				Static362.anInt9813 = 0;
				local315 = Static647.method8905(Static378.aClass381_162, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7296(local35);
				local315.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 60) {
			Static465.anInt7544 = arg0;
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static529.aClass381_223, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7285(local35);
			local67.aClass5_Sub36_Sub2_1.method7286(Static315.anInt5380 + local18);
			local67.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (local31 == 23) {
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			local67 = Static647.method8905(Static522.aClass381_217, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7285((int) (local44 >>> 32) & Integer.MAX_VALUE);
			local67.aClass5_Sub36_Sub2_1.method7277(local21 + Static290.anInt5128);
			local67.aClass5_Sub36_Sub2_1.method7286(local18 + Static315.anInt5380);
			local67.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 20) {
			Static465.anInt7544 = arg0;
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static524.aClass381_219, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7285(local35);
			local67.aClass5_Sub36_Sub2_1.method7277(local18 + Static315.anInt5380);
			local67.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7286(Static290.anInt5128 + local21);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (local31 == 48 && Static64.aClass238_1 == null) {
			Static272.method4455(local18, local21);
			Static64.aClass238_1 = Static333.method5035(local18, local21);
			Static333.method5032(Static64.aClass238_1);
		}
		if (local31 == 6) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static362.anInt9813 = 0;
				Static465.anInt7544 = arg0;
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				local235 = Static647.method8905(Static570.aClass381_237, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7285(local35);
				local235.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 16) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static90.anInt1510 = arg1;
				Static80.anInt1424 = 2;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				local235 = Static647.method8905(Static187.aClass381_82, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local235.aClass5_Sub36_Sub2_1.method7285(local35);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 21) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static465.anInt7544 = arg0;
				Static80.anInt1424 = 2;
				Static90.anInt1510 = arg1;
				Static362.anInt9813 = 0;
				local235 = Static647.method8905(Static336.aClass381_144, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7286(local35);
				local235.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 1006 || local31 == 1008 || local31 == 1011 || local31 == 1012 || local31 == 1004) {
			Static399.method5831(local31, local18, local35);
		}
		if (local31 == 1001) {
			Static465.anInt7544 = arg0;
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static404.aClass381_175, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7296(local35);
			Static4.aClass389_17.method9079(local67);
		}
		if (local31 == 45) {
			Static465.anInt7544 = arg0;
			Static80.anInt1424 = 2;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			local67 = Static647.method8905(Static158.aClass381_71, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(local18 + Static315.anInt5380);
			local67.aClass5_Sub36_Sub2_1.method7285((int) (local44 >>> 32) & Integer.MAX_VALUE);
			local67.aClass5_Sub36_Sub2_1.method7285(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7285(Static268.anInt4795);
			local67.aClass5_Sub36_Sub2_1.method7296(Static516.anInt8202);
			local67.aClass5_Sub36_Sub2_1.method7287(Static14.anInt171);
			local67.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 19) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static80.anInt1424 = 2;
				Static362.anInt9813 = 0;
				Static465.anInt7544 = arg0;
				Static90.anInt1510 = arg1;
				local235 = Static647.method8905(Static223.aClass381_97, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7286(local35);
				local235.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 52) {
			Static80.anInt1424 = 2;
			Static90.anInt1510 = arg1;
			Static362.anInt9813 = 0;
			Static465.anInt7544 = arg0;
			local67 = Static647.method8905(Static404.aClass381_176, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			local67.aClass5_Sub36_Sub2_1.method7286(Static516.anInt8202);
			local67.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7285(Static268.anInt4795);
			local67.aClass5_Sub36_Sub2_1.method7296(local35);
			local67.aClass5_Sub36_Sub2_1.method7286(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7284(Static14.anInt171);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (local31 == 51) {
			if (Static296.anInt5190 > 0 && Static53.aClass297_1.method6737(82) && Static53.aClass297_1.method6737(81)) {
				Static543.method7446(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, Static290.anInt5128 + local21, local18 + Static315.anInt5380);
			} else {
				Static80.anInt1424 = 1;
				Static90.anInt1510 = arg1;
				Static465.anInt7544 = arg0;
				Static362.anInt9813 = 0;
				local67 = Static647.method8905(Static341.aClass381_147, Static4.aClass389_17.aClass393_2);
				local67.aClass5_Sub36_Sub2_1.method7277(Static290.anInt5128 + local21);
				local67.aClass5_Sub36_Sub2_1.method7285(Static315.anInt5380 + local18);
				Static4.aClass389_17.method9079(local67);
			}
		}
		if (local31 == 9) {
			local1065 = Static333.method5035(local18, local21);
			if (local1065 != null) {
				Static147.method2743(local1065);
			}
		}
		if (local31 == 5) {
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			local67 = Static647.method8905(Static519.aClass381_215, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7326(Static14.anInt171);
			local67.aClass5_Sub36_Sub2_1.method7296(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt6843);
			local67.aClass5_Sub36_Sub2_1.method7286(Static268.anInt4795);
			local67.aClass5_Sub36_Sub2_1.method7277(Static516.anInt8202);
			Static4.aClass389_17.method9079(local67);
		}
		if (local31 == 25) {
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			Static465.anInt7544 = arg0;
			Static80.anInt1424 = 2;
			local67 = Static647.method8905(Static654.aClass381_264, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7286(local21 + Static290.anInt5128);
			local67.aClass5_Sub36_Sub2_1.method7285((int) (local44 >>> 32) & Integer.MAX_VALUE);
			local67.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
			local67.aClass5_Sub36_Sub2_1.method7296(Static315.anInt5380 + local18);
			Static4.aClass389_17.method9079(local67);
			Static353.method5197(local44, local18, local21);
		}
		if (local31 == 18) {
			local215 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local35];
			if (local215 != null) {
				Static362.anInt9813 = 0;
				Static465.anInt7544 = arg0;
				Static90.anInt1510 = arg1;
				Static80.anInt1424 = 2;
				local235 = Static647.method8905(Static661.aClass381_269, Static4.aClass389_17.aClass393_2);
				local235.aClass5_Sub36_Sub2_1.method7309(Static53.aClass297_1.method6737(82) ? 1 : 0);
				local235.aClass5_Sub36_Sub2_1.method7277(local35);
				Static4.aClass389_17.method9079(local235);
				Static467.method6578(0, local215.anIntArray404[0], local215.anIntArray405[0], local215.method5932(), local215.method5932(), 0, true, -2);
			}
		}
		if (local31 == 1003) {
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			Static80.anInt1424 = 2;
			Static465.anInt7544 = arg0;
			local67 = Static647.method8905(Static76.aClass381_37, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7296(local35);
			Static4.aClass389_17.method9079(local67);
		}
		if (local31 == 11) {
			Static465.anInt7544 = arg0;
			Static90.anInt1510 = arg1;
			Static80.anInt1424 = 2;
			Static362.anInt9813 = 0;
			local67 = Static647.method8905(Static5.aClass381_278, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7277(Static315.anInt5380 + local18);
			local67.aClass5_Sub36_Sub2_1.method7286(local35);
			local67.aClass5_Sub36_Sub2_1.method7296(local21 + Static290.anInt5128);
			local67.aClass5_Sub36_Sub2_1.method7293(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (local31 == 58) {
			local292 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local35);
			if (local292 != null) {
				local307 = local292.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static90.anInt1510 = arg1;
				Static362.anInt9813 = 0;
				Static80.anInt1424 = 2;
				Static465.anInt7544 = arg0;
				local315 = Static647.method8905(Static86.aClass381_42, Static4.aClass389_17.aClass393_2);
				local315.aClass5_Sub36_Sub2_1.method7285(local35);
				local315.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
				Static4.aClass389_17.method9079(local315);
				Static467.method6578(0, local307.anIntArray404[0], local307.anIntArray405[0], local307.method5932(), local307.method5932(), 0, true, -2);
			}
		}
		if (local31 == 17) {
			Static465.anInt7544 = arg0;
			Static80.anInt1424 = 2;
			Static362.anInt9813 = 0;
			Static90.anInt1510 = arg1;
			local67 = Static647.method8905(Static627.aClass381_256, Static4.aClass389_17.aClass393_2);
			local67.aClass5_Sub36_Sub2_1.method7285(local35);
			local67.aClass5_Sub36_Sub2_1.method7296(Static290.anInt5128 + local21);
			local67.aClass5_Sub36_Sub2_1.method7286(local18 + Static315.anInt5380);
			local67.aClass5_Sub36_Sub2_1.method7324(Static53.aClass297_1.method6737(82) ? 1 : 0);
			Static4.aClass389_17.method9079(local67);
			Static124.method1852(local18, local21);
		}
		if (Static421.aBoolean472) {
			Static55.method973();
		}
		if (Static447.aClass238_13 != null && Static438.anInt7238 == 0) {
			Static333.method5032(Static447.aClass238_13);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lclient!wq;")
	public static Class5_Sub36 method4443() {
		@Pc(8) Class5_Sub36 local8 = new Class5_Sub36(518);
		Static642.anIntArray596 = new int[4];
		Static642.anIntArray596[2] = (int) (Math.random() * 9.9999999E7D);
		Static642.anIntArray596[3] = (int) (Math.random() * 9.9999999E7D);
		Static642.anIntArray596[0] = (int) (Math.random() * 9.9999999E7D);
		Static642.anIntArray596[1] = (int) (Math.random() * 9.9999999E7D);
		local8.method7324(10);
		local8.method7287(Static642.anIntArray596[0]);
		local8.method7287(Static642.anIntArray596[1]);
		local8.method7287(Static642.anIntArray596[2]);
		local8.method7287(Static642.anIntArray596[3]);
		return local8;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IC)Z")
	public static boolean method4444(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
