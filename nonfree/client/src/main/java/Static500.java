import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!us", name = "N", descriptor = "Lclient!sv;")
	public static Class124 aClass124_3;

	@OriginalMember(owner = "client!us", name = "U", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!us", name = "Q", descriptor = "F")
	public static float aFloat186 = 0.0F;

	@OriginalMember(owner = "client!us", name = "R", descriptor = "I")
	public static int anInt9029 = 0;

	@OriginalMember(owner = "client!us", name = "V", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_142 = new Class45(106, 4);

	@OriginalMember(owner = "client!us", name = "W", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
	public static void method7435() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static284.aClass37ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static284.aClass37ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static537.anInt9566; local6++) {
					for (local9 = 0; local9 < Static509.anInt9164; local9++) {
						if (Static284.aClass37ArrayArrayArray3[local3][local6][local9] != null) {
							Static284.aClass37ArrayArrayArray3[local3][local6][local9].method850();
						}
						Static284.aClass37ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static284.aClass37ArrayArrayArray3 = null;
		Static155.aClass215Array5 = null;
		if (Static141.aClass37ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static141.aClass37ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static537.anInt9566; local6++) {
					for (local9 = 0; local9 < Static509.anInt9164; local9++) {
						if (Static141.aClass37ArrayArrayArray2[local3][local6][local9] != null) {
							Static141.aClass37ArrayArrayArray2[local3][local6][local9].method850();
						}
						Static141.aClass37ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static141.aClass37ArrayArrayArray2 = null;
		Static67.aClass215Array2 = null;
		Static120.aClass37ArrayArrayArray1 = null;
		Static51.aClass215Array6 = null;
		Static127.anInt2935 = 0;
		if (Static176.aClass103Array2 != null) {
			for (local3 = 0; local3 < Static127.anInt2935; local3++) {
				Static176.aClass103Array2[local3] = null;
			}
		}
		if (Static9.aClass30_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static261.anInt5286; local3++) {
				Static9.aClass30_Sub1Array1[local3] = null;
			}
			Static261.anInt5286 = 0;
		}
		if (Static485.aClass97Array1 != null) {
			for (local3 = 0; local3 < Static423.anInt78; local3++) {
				Static485.aClass97Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static36.anInt8450; local6++) {
				for (local9 = 0; local9 < Static537.anInt9566; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static509.anInt9164; local160++) {
						Static130.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static423.anInt78 = 0;
		}
		Static369.anIntArrayArrayArray7 = null;
		Static113.method2344();
		Static246.aClass149_3.method3983();
		Static51.aByteArrayArray28 = null;
		Static287.anIntArrayArray52 = null;
		Static119.aShortArrayArray1 = null;
		Static308.aClass126_1 = null;
		Static71.aClass91_3 = null;
		Static286.aClass42_5 = null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method7437(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static115.aClass16_29.anInt295 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static150.aClass254_2.anInt7610; local18++) {
			@Pc(25) Class56 local25 = Static150.aClass254_2.method6340(local18);
			if ((!arg0 || local25.aBoolean127) && local25.anInt1632 == -1 && local25.anInt1631 == -1 && local25.anInt1625 == 0 && local25.aString12.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static292.anInt5650 = -1;
					Static428.aShortArray105 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(78) short[] local78 = new short[local14.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local16; local80++) {
						local78[local80] = local14[local80];
					}
					local14 = local78;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static358.anInt6699 = 0;
		Static428.aShortArray105 = local14;
		Static292.anInt5650 = local16;
		@Pc(114) String[] local114 = new String[Static292.anInt5650];
		for (@Pc(116) int local116 = 0; local116 < Static292.anInt5650; local116++) {
			local114[local116] = Static150.aClass254_2.method6340(local14[local116]).aString12;
		}
		Static13.method353(Static428.aShortArray105, local114);
		Static115.aClass16_29.method385();
		Static115.aClass16_29.anInt295 = 2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
	public static void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static336.anInt6435 == 1) {
			Static253.aClass84Array8[Static352.anInt6599 / 100].method7487(Static30.anInt9643 - 8, Static403.anInt7574 + -8);
		}
		if (Static336.anInt6435 == 2) {
			Static253.aClass84Array8[Static352.anInt6599 / 100 + 4].method7487(Static30.anInt9643 - 8, Static403.anInt7574 + -8);
		}
		Static209.method3865();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method7439(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		@Pc(40) int local40 = arg0 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(55) char[] local55 = new char[local36];
		local55[0] = '+';
		for (@Pc(63) int local63 = local36 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 >= 10) {
				local55[local63] = (char) (local78 + 87);
			} else {
				local55[local63] = (char) (local78 + 48);
			}
		}
		return new String(local55);
	}
}
