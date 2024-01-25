import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
	public static boolean aBoolean618;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBILclient!efa;)V")
	public static void method7201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class15_Sub1_Sub2_Sub2_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray435[0];
		@Pc(15) int local15 = arg2.anIntArray436[0];
		if (local10 < 0 || Static372.anInt7082 <= local10 || local15 < 0 || Static218.anInt5023 <= local15 || (arg1 < 0 || Static372.anInt7082 <= arg1 || arg0 < 0 || Static218.anInt5023 <= arg0)) {
			return;
		}
		@Pc(59) int local59 = Static553.method7769(Static21.anIntArray25, arg0, local10, arg1, local15, Static204.aClass48Array1[arg2.aByte124], 0, 0, true, 0, -4, Static581.anIntArray582, 0, arg2.method6692());
		if (local59 >= 1 && local59 <= 3) {
			for (@Pc(73) int local73 = 0; local73 < local59 - 1; local73++) {
				arg2.method2758(Static21.anIntArray25[local73], Static581.anIntArray582[local73], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static110.aFloat176 < Static110.aFloat177) {
			Static110.aFloat176 = (float) ((double) Static110.aFloat176 + (double) Static110.aFloat176 / 30.0D);
			if (Static110.aFloat176 > Static110.aFloat177) {
				Static110.aFloat176 = Static110.aFloat177;
			}
			Static119.method2632();
			Static110.anInt7699 = (int) Static110.aFloat176 >> 1;
			Static110.aByteArrayArrayArray21 = Static550.method8312(Static110.anInt7699);
		} else if (Static110.aFloat176 > Static110.aFloat177) {
			Static110.aFloat176 = (float) ((double) Static110.aFloat176 - (double) Static110.aFloat176 / 30.0D);
			if (Static110.aFloat177 > Static110.aFloat176) {
				Static110.aFloat176 = Static110.aFloat177;
			}
			Static119.method2632();
			Static110.anInt7699 = (int) Static110.aFloat176 >> 1;
			Static110.aByteArrayArrayArray21 = Static550.method8312(Static110.anInt7699);
		}
		if (Static18.anInt872 != -1 && Static329.anInt6567 != -1) {
			@Pc(85) int local85 = Static18.anInt872 - Static227.anInt5187;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(104) int local104 = Static329.anInt6567 - Static561.anInt9691;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static227.anInt5187 += local85;
			if (local85 == 0 && local104 == 0) {
				Static329.anInt6567 = -1;
				Static18.anInt872 = -1;
			}
			Static561.anInt9691 += local104;
			Static119.method2632();
		}
		if (Static611.anInt10290 > 0) {
			Static100.anInt2681--;
			if (Static100.anInt2681 == 0) {
				Static611.anInt10290--;
				Static100.anInt2681 = 100;
			}
		} else {
			Static182.anInt4253 = -1;
			Static464.anInt8440 = -1;
		}
		if (!Static342.aBoolean462 || Static52.aClass43_15 == null) {
			return;
		}
		for (@Pc(169) Class8_Sub7 local169 = (Class8_Sub7) Static52.aClass43_15.method1422(); local169 != null; local169 = (Class8_Sub7) Static52.aClass43_15.method1426()) {
			@Pc(178) Class17 local178 = Static110.aClass12_3.method136(local169.aClass8_Sub35_1.anInt6533);
			if (local169.method1415(arg1, arg0)) {
				if (local178.aStringArray3 != null) {
					if (local178.aStringArray3[4] != null) {
						Static192.method3629((long) local169.aClass8_Sub35_1.anInt6533, false, -1, false, (long) local169.aClass8_Sub35_1.anInt6533, 1006, local178.aStringArray3[4], 0, local178.anInt811, true, -1, local178.aString5);
					}
					if (local178.aStringArray3[3] != null) {
						Static192.method3629((long) local169.aClass8_Sub35_1.anInt6533, false, -1, false, (long) local169.aClass8_Sub35_1.anInt6533, 1007, local178.aStringArray3[3], 0, local178.anInt811, true, -1, local178.aString5);
					}
					if (local178.aStringArray3[2] != null) {
						Static192.method3629((long) local169.aClass8_Sub35_1.anInt6533, false, -1, false, (long) local169.aClass8_Sub35_1.anInt6533, 1008, local178.aStringArray3[2], 0, local178.anInt811, true, -1, local178.aString5);
					}
					if (local178.aStringArray3[1] != null) {
						Static192.method3629((long) local169.aClass8_Sub35_1.anInt6533, false, -1, false, (long) local169.aClass8_Sub35_1.anInt6533, 1001, local178.aStringArray3[1], 0, local178.anInt811, true, -1, local178.aString5);
					}
					if (local178.aStringArray3[0] != null) {
						Static192.method3629((long) local169.aClass8_Sub35_1.anInt6533, false, -1, false, (long) local169.aClass8_Sub35_1.anInt6533, 1012, local178.aStringArray3[0], 0, local178.anInt811, true, -1, local178.aString5);
					}
				}
				if (!local169.aClass8_Sub35_1.aBoolean455) {
					local169.aClass8_Sub35_1.aBoolean455 = true;
					Static273.method4692(Static281.aClass165_3, local169.aClass8_Sub35_1.anInt6533, local178.anInt811);
				}
				if (local169.aClass8_Sub35_1.aBoolean455) {
					Static273.method4692(Static297.aClass165_4, local169.aClass8_Sub35_1.anInt6533, local178.anInt811);
				}
			} else if (local169.aClass8_Sub35_1.aBoolean455) {
				local169.aClass8_Sub35_1.aBoolean455 = false;
				Static273.method4692(Static162.aClass165_2, local169.aClass8_Sub35_1.anInt6533, local178.anInt811);
			}
		}
	}
}
