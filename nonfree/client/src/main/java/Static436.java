import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)Z")
	public static boolean method6340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static333.method4610(arg1)) {
			return true;
		} else {
			return !Static333.method4610(arg0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
	public static void method6341(@OriginalArg(0) int arg0) {
		Static371.method5299(Static650.aClass273_17);
		Static278.anInt4344++;
		if (Static515.aBoolean708 && Static168.aBoolean286) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static392.aBoolean549) {
				local32 = Static637.method3733();
				local34 = Static400.method5900();
			}
			@Pc(48) int local48 = Static402.aClass138_1.method4767() + local32;
			@Pc(54) int local54 = local34 + Static402.aClass138_1.method4771();
			local54 -= Static358.anInt5727;
			local48 -= Static497.anInt7962;
			if (local48 < Static460.anInt10191) {
				local48 = Static460.anInt10191;
			}
			if (local48 + Static650.aClass273_17.anInt7402 > Static460.anInt10191 + Static175.aClass273_18.anInt7402) {
				local48 = Static460.anInt10191 + Static175.aClass273_18.anInt7402 - Static650.aClass273_17.anInt7402;
			}
			if (Static184.anInt3049 > local54) {
				local54 = Static184.anInt3049;
			}
			if (Static650.aClass273_17.anInt7385 + local54 > Static175.aClass273_18.anInt7385 + Static184.anInt3049) {
				local54 = Static175.aClass273_18.anInt7385 + Static184.anInt3049 - Static650.aClass273_17.anInt7385;
			}
			if (arg0 <= -74) {
				@Pc(133) int local133 = Static175.aClass273_18.anInt7347 + local48 - Static460.anInt10191;
				@Pc(141) int local141 = Static175.aClass273_18.anInt7342 + local54 - Static184.anInt3049;
				@Pc(210) Class2_Sub36 local210;
				if (Static402.aClass138_1.method4764()) {
					if (Static650.aClass273_17.anInt7341 < Static278.anInt4344) {
						@Pc(252) int local252 = local48 - Static154.anInt2563;
						@Pc(256) int local256 = local54 - Static238.anInt3744;
						if (local252 > Static650.aClass273_17.anInt7372 || -Static650.aClass273_17.anInt7372 > local252 || Static650.aClass273_17.anInt7372 < local256 || local256 < -Static650.aClass273_17.anInt7372) {
							Static642.aBoolean840 = true;
						}
					}
					if (Static650.aClass273_17.anObjectArray8 != null && Static642.aBoolean840) {
						local210 = new Class2_Sub36();
						local210.aClass273_6 = Static650.aClass273_17;
						local210.anObjectArray2 = Static650.aClass273_17.anObjectArray8;
						local210.anInt5073 = local141;
						local210.anInt5077 = local133;
						Static484.method6919(local210);
					}
				} else {
					if (Static642.aBoolean840) {
						Static643.method8704();
						if (Static650.aClass273_17.anObjectArray23 != null) {
							local210 = new Class2_Sub36();
							local210.anObjectArray2 = Static650.aClass273_17.anObjectArray23;
							local210.anInt5073 = local141;
							local210.anInt5077 = local133;
							local210.aClass273_6 = Static650.aClass273_17;
							local210.aClass273_7 = Static121.aClass273_2;
							Static484.method6919(local210);
						}
						if (Static121.aClass273_2 != null && Static91.method1399(Static650.aClass273_17) != null) {
							Static257.method3643(Static650.aClass273_17, Static121.aClass273_2);
						}
					} else if ((Static410.anInt6714 == 1 || Static174.method2605()) && Static535.anInt8486 > 2) {
						Static726.method9868(Static497.anInt7962 + Static154.anInt2563, Static238.anInt3744 + Static358.anInt5727);
					} else if (Static710.method9458()) {
						Static726.method9868(Static154.anInt2563 + Static497.anInt7962, Static358.anInt5727 - -Static238.anInt3744);
					}
					Static650.aClass273_17 = null;
				}
			}
		} else if (Static278.anInt4344 > 1) {
			Static650.aClass273_17 = null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)V")
	public static void method6342() {
		if (Static8.aBoolean11) {
			return;
		}
		Static259.method3684(Static618.aClass311ArrayArrayArray2);
		if (Static564.aClass311ArrayArrayArray1 != null) {
			Static259.method3684(Static564.aClass311ArrayArrayArray1);
		}
		Static8.aBoolean11 = true;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZB)V")
	public static void method6343(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class2_Sub38 local6 = (Class2_Sub38) Static594.aClass60_191.method1226(7); local6 != null; local6 = (Class2_Sub38) Static594.aClass60_191.method1228()) {
			if (local6.aClass2_Sub23_Sub2_3 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(local6.aClass2_Sub23_Sub2_3);
				local6.aClass2_Sub23_Sub2_3 = null;
			}
			if (local6.aClass2_Sub23_Sub2_4 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(local6.aClass2_Sub23_Sub2_4);
				local6.aClass2_Sub23_Sub2_4 = null;
			}
			local6.method9872();
		}
		if (-57 != -57) {
			method6341(-16);
		}
		if (!arg0) {
			return;
		}
		for (@Pc(66) Class2_Sub38 local66 = (Class2_Sub38) Static171.aClass60_56.method1226(7); local66 != null; local66 = (Class2_Sub38) Static171.aClass60_56.method1228()) {
			if (local66.aClass2_Sub23_Sub2_3 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(local66.aClass2_Sub23_Sub2_3);
				local66.aClass2_Sub23_Sub2_3 = null;
			}
			local66.method9872();
		}
		for (@Pc(97) Class2_Sub38 local97 = (Class2_Sub38) Static307.aClass218_22.method5092(); local97 != null; local97 = (Class2_Sub38) Static307.aClass218_22.method5096()) {
			if (local97.aClass2_Sub23_Sub2_3 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(local97.aClass2_Sub23_Sub2_3);
				local97.aClass2_Sub23_Sub2_3 = null;
			}
			local97.method9872();
		}
	}
}
