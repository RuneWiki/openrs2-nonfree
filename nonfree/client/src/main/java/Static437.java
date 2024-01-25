import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!mc;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!qo;")
	public static Class196 aClass196_41 = new Class196(64);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!qa;)V")
	public static void method5650(@OriginalArg(1) Class30 arg0) {
		if (Static83.anInt1893 < 2 && !Static222.aBoolean305 || Static15.aClass126_1 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static222.aBoolean305 && Static83.anInt1893 < 2) {
			local38 = Static279.aString50 + Static387.aClass242_96.method5320(Static139.anInt2670) + Static178.aString37 + " ->";
		} else if (Static416.aBoolean477 && Static23.aClass14_1.method1510(81) && Static83.anInt1893 > 2) {
			local38 = Static381.method5199((Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262.aClass4_262);
		} else {
			@Pc(57) Class4_Sub21 local57 = (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262;
			local38 = Static381.method5199(local57);
			@Pc(63) int[] local63 = null;
			if (Static390.method5265(local57.anInt3041)) {
				local63 = Static390.aClass204_2.method4629((int) local57.aLong82).anIntArray292;
			} else if (local57.anInt3046 != -1) {
				local63 = Static390.aClass204_2.method4629(local57.anInt3046).anIntArray292;
			} else if (Static41.method736(local57.anInt3041)) {
				@Pc(91) Class6_Sub2_Sub1_Sub2 local91 = Static176.aClass6_Sub2_Sub1_Sub2Array1[(int) local57.aLong82];
				if (local91 != null) {
					@Pc(96) Class243 local96 = local91.aClass243_1;
					if (local96.anIntArray613 != null) {
						local96 = local96.method5337(Static155.aClass149_1);
					}
					if (local96 != null) {
						local63 = local96.anIntArray610;
					}
				}
			} else if (Static286.method4000(local57.anInt3041)) {
				@Pc(132) Class71 local132;
				if (local57.anInt3041 == 1006) {
					local132 = Static2.aClass74_13.method1683((int) local57.aLong82);
				} else {
					local132 = Static2.aClass74_13.method1683((int) (local57.aLong82 >>> 32 & 0x7FFFFFFFL));
				}
				if (local132.anIntArray138 != null) {
					local132 = local132.method1626(Static155.aClass149_1);
				}
				if (local132 != null) {
					local63 = local132.anIntArray141;
				}
			}
			if (local63 != null) {
				local38 = local38 + Static54.method5870(local63);
			}
		}
		if (Static83.anInt1893 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static83.anInt1893 - 2) + Static329.aClass242_79.method5320(Static139.anInt2670);
		}
		if (Static107.aClass126_4 != null) {
			@Pc(219) Class105 local219 = Static107.aClass126_4.method2674(arg0);
			if (local219 == null) {
				local219 = Static245.aClass105_4;
			}
			local219.method5613(Static256.anInt5256, local38, Static107.aClass126_4.anInt3424, Static107.aClass126_4.anInt3442, Static257.anIntArray387, Static107.aClass126_4.anInt3459, Static107.aClass126_4.anInt3446, Static107.aClass126_4.anInt3421, Static208.aClass3Array9, Static107.aClass126_4.anInt3462, Static429.anInt7160, Static429.anIntArray630, Static274.aRandom1, Static220.anInt5566);
			Static436.method5629(Static257.anIntArray387[2], Static257.anIntArray387[1], Static257.anIntArray387[3], Static257.anIntArray387[0]);
		} else if (Static16.aClass126_14 != null && Static441.aClass95_5 == Static162.aClass95_7) {
			@Pc(284) int local284 = Static245.aClass105_4.method5616(local38, Static144.anInt2718 + 16, Static429.anIntArray630, Static208.aClass3Array9, Static214.anInt4022 + 4, Static274.aRandom1, Static256.anInt5256);
			Static436.method5629(Static266.aClass215_8.method4976(local38) + local284, Static144.anInt2718, 16, Static214.anInt4022 + 4);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)I")
	public static int method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static161.anIntArray251[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBLclient!ns;I)Lclient!se;")
	public static Class215 method5652(@OriginalArg(0) int arg0, @OriginalArg(2) Class166 arg1) {
		@Pc(9) byte[] local9 = arg1.method3696(0, arg0);
		return local9 == null ? null : new Class215(local9);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method5653(@OriginalArg(1) Class41_Sub5 arg0) {
		arg0.aClass6_Sub2_Sub1_1 = null;
		if (Static239.anInt4390 < 20) {
			Static299.aClass27_6.method725(arg0);
			Static239.anInt4390++;
		}
	}
}
