import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	public static final int[] anIntArray579 = new int[2500];

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString275 = "purple:";

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
	public static final int[] anIntArray580 = new int[25];

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[Lclient!ok;")
	public static final Class7_Sub1_Sub14[] aClass7_Sub1_Sub14Array5 = new Class7_Sub1_Sub14[14];

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public static int anInt4234 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method3767() {
		for (@Pc(8) Class7_Sub32 local8 = (Class7_Sub32) Static76.aClass74_8.method1793(); local8 != null; local8 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			if (Static214.method3782(local8.anInt5229)) {
				Static229.method4022(local8);
			}
		}
		if (Static33.anInt735 == 1) {
			Static169.aBoolean260 = false;
			Static352.method5647(Static263.anInt5172, Static279.anInt6648, Static220.anInt4389, Static343.anInt6507);
			return;
		}
		Static352.method5647(Static263.anInt5172, Static279.anInt6648, Static220.anInt4389, Static343.anInt6507);
		@Pc(57) int local57 = Static175.aClass208_3.method5385(Static254.aString312);
		for (@Pc(62) Class7_Sub32 local62 = (Class7_Sub32) Static76.aClass74_8.method1793(); local62 != null; local62 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			@Pc(69) int local69 = Static44.method984(local62);
			if (local57 < local69) {
				local57 = local69;
			}
		}
		Static343.anInt6507 = (Static274.aBoolean403 ? 26 : 22) + Static33.anInt735 * 16;
		Static220.anInt4389 = local57 + 8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method3768(@OriginalArg(1) Component arg0) {
		@Pc(13) Method local13 = Static22.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static239.aClass152_1);
		arg0.addFocusListener(Static239.aClass152_1);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method3771() {
		if (Static85.anInt2215 == 10 || Static85.anInt2215 == 28) {
			Static207.method3678(Static203.anInt4014 >> 10, Static24.anInt478 >> 10);
		} else {
			Static207.method3678(Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] >> 3, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] >> 3);
		}
		Static263.method4424();
		Static189.method3447();
		Static197.method3538();
		Static77.method1573();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!bi;B)V")
	public static void method3772(@OriginalArg(0) Class26 arg0) {
		@Pc(6) int local6 = arg0.anInt557;
		if (local6 == 324) {
			if (Static247.anInt4894 == -1) {
				Static247.anInt4894 = arg0.anInt573;
				Static100.anInt2434 = arg0.anInt551;
			}
			if (Static144.aClass214_2.aBoolean478) {
				arg0.anInt573 = Static247.anInt4894;
			} else {
				arg0.anInt573 = Static100.anInt2434;
			}
		} else if (local6 == 325) {
			if (Static247.anInt4894 == -1) {
				Static247.anInt4894 = arg0.anInt573;
				Static100.anInt2434 = arg0.anInt551;
			}
			if (Static144.aClass214_2.aBoolean478) {
				arg0.anInt573 = Static100.anInt2434;
			} else {
				arg0.anInt573 = Static247.anInt4894;
			}
		} else if (local6 == 327) {
			arg0.anInt525 = 150;
			arg0.anInt565 = (int) (Math.sin((double) anInt4234 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt516 = -1;
			arg0.anInt564 = 5;
		} else if (local6 == 328) {
			if (Static252.aClass22_Sub2_Sub1_Sub1_4.aString78 == null) {
				arg0.anInt516 = 0;
				arg0.anInt511 = 0;
			} else {
				arg0.anInt525 = 150;
				arg0.anInt565 = (int) (Math.sin((double) anInt4234 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt564 = 5;
				arg0.anInt516 = 2047;
				arg0.anInt511 = Static277.method4668(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78);
				arg0.anInt567 = 0;
				arg0.anInt554 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5132;
				arg0.anInt541 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5081;
				arg0.anInt488 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5100;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method3774() {
		@Pc(8) int local8 = Static200.aClass7_Sub3_Sub2_3.method2806(8);
		@Pc(17) int local17;
		if (local8 < Static223.anInt4466) {
			for (local17 = local8; local17 < Static223.anInt4466; local17++) {
				Static53.anIntArray207[Static69.anInt1716++] = Static314.anIntArray758[local17];
			}
		}
		if (Static223.anInt4466 < local8) {
			throw new RuntimeException("gppov1");
		}
		Static223.anInt4466 = 0;
		for (local17 = 0; local17 < local8; local17++) {
			@Pc(57) int local57 = Static314.anIntArray758[local17];
			@Pc(61) Class22_Sub2_Sub1_Sub1 local61 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local57];
			@Pc(66) int local66 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			if (local66 == 0) {
				Static314.anIntArray758[Static223.anInt4466++] = local57;
				local61.anInt5096 = anInt4234;
			} else {
				@Pc(88) int local88 = Static200.aClass7_Sub3_Sub2_3.method2806(2);
				if (local88 == 0) {
					Static314.anIntArray758[Static223.anInt4466++] = local57;
					local61.anInt5096 = anInt4234;
					Static71.anIntArray241[Static85.anInt2209++] = local57;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local88 == 1) {
						Static314.anIntArray758[Static223.anInt4466++] = local57;
						local61.anInt5096 = anInt4234;
						local134 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
						local61.method4406(local134, 1);
						local144 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
						if (local144 == 1) {
							Static71.anIntArray241[Static85.anInt2209++] = local57;
						}
					} else if (local88 == 2) {
						Static314.anIntArray758[Static223.anInt4466++] = local57;
						local61.anInt5096 = anInt4234;
						if (Static200.aClass7_Sub3_Sub2_3.method2806(1) == 1) {
							local134 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local61.method4406(local134, 2);
							local144 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local61.method4406(local144, 2);
						} else {
							local134 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local61.method4406(local134, 0);
						}
						local134 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
						if (local134 == 1) {
							Static71.anIntArray241[Static85.anInt2209++] = local57;
						}
					} else if (local88 == 3) {
						Static53.anIntArray207[Static69.anInt1716++] = local57;
					}
				}
			}
		}
	}
}
