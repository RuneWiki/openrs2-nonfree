import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public static int anInt1326;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
	public static final int[] anIntArray127 = new int[1000];

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Lclient!pd;")
	public static final Class247 aClass247_2 = new Class247();

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_26 = new Class73(14, 3);

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Lclient!ls;")
	public static final Class199 aClass199_1 = new Class199("LIVE", 0);

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public static int anInt1325 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method1306() {
		if (Static423.aBoolean509) {
			return;
		}
		Static488.method4440(Static572.aClass276ArrayArrayArray3);
		if (Static48.aClass276ArrayArrayArray1 != null) {
			Static488.method4440(Static48.aClass276ArrayArrayArray1);
		}
		Static423.aBoolean509 = true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(CB)Z")
	public static boolean method1309(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static503.method6799(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static498.aCharArray10;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (arg0 == local33) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static392.aCharArray9;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(57) char local57 = local49[local51];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)Z")
	public static boolean method1312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static167.method3163(arg1, arg0) || Static297.method992(arg1, arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIII)V")
	public static void method1315(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg3 == Static447.anInt7737 && arg2 == Static455.anInt7847 && (Static97.anInt1863 == Static294.anInt5492 || Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242))) {
			return;
		}
		Static447.anInt7737 = arg3;
		Static294.anInt5492 = Static97.anInt1863;
		Static455.anInt7847 = arg2;
		if (Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242)) {
			Static294.anInt5492 = 0;
		}
		Static449.method6350(arg1);
		Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769), Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
		@Pc(54) int local54 = Static39.anInt4952;
		@Pc(56) int local56 = Static138.anInt3088;
		Static39.anInt4952 = (Static447.anInt7737 - (Static473.anInt8075 >> 4)) * 8;
		Static138.anInt3088 = (Static455.anInt7847 - (Static165.anInt6749 >> 4)) * 8;
		Static407.aClass6_Sub2_Sub6_3 = Static217.method3357(Static447.anInt7737 * 8, Static455.anInt7847 * 8);
		Static216.aClass303_3 = null;
		@Pc(88) int local88 = Static39.anInt4952 - local54;
		@Pc(93) int local93 = Static138.anInt3088 - local56;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(162) int local162;
		@Pc(270) int local270;
		if (arg1 == 11) {
			for (local270 = 0; local270 < Static535.anInt8885; local270++) {
				@Pc(276) Class6_Sub34 local276 = Static76.aClass6_Sub34Array7[local270];
				if (local276 != null) {
					@Pc(281) Class4_Sub1_Sub1_Sub1 local281 = local276.aClass4_Sub1_Sub1_Sub1_2;
					for (local114 = 0; local114 < 10; local114++) {
						local281.anIntArray521[local114] -= local88;
						local281.anIntArray522[local114] -= local93;
					}
					local281.anInt9540 -= local93 * 512;
					local281.anInt9542 -= local88 * 512;
				}
			}
		} else {
			@Pc(98) boolean local98 = false;
			Static464.anInt7995 = 0;
			@Pc(106) int local106 = Static473.anInt8075 * 512 - 512;
			local112 = (Static165.anInt6749 - 1) * 512;
			for (local114 = 0; local114 < Static535.anInt8885; local114++) {
				@Pc(120) Class6_Sub34 local120 = Static76.aClass6_Sub34Array7[local114];
				if (local120 != null) {
					@Pc(125) Class4_Sub1_Sub1_Sub1 local125 = local120.aClass4_Sub1_Sub1_Sub1_2;
					local125.anInt9542 -= local88 * 512;
					local125.anInt9540 -= local93 * 512;
					if (local125.anInt9542 >= 0 && local106 >= local125.anInt9542 && local125.anInt9540 >= 0 && local125.anInt9540 <= local112) {
						@Pc(160) boolean local160 = true;
						for (local162 = 0; local162 < 10; local162++) {
							local125.anIntArray521[local162] -= local88;
							local125.anIntArray522[local162] -= local93;
							if (local125.anIntArray521[local162] < 0 || local125.anIntArray521[local162] >= Static473.anInt8075 || local125.anIntArray522[local162] < 0 || local125.anIntArray522[local162] >= Static165.anInt6749) {
								local160 = false;
							}
						}
						if (local160) {
							Static291.anIntArray405[Static464.anInt7995++] = local125.anInt7126;
						} else {
							local125.method152(null);
							local120.method7804();
							local98 = true;
						}
					} else {
						local125.method152(null);
						local120.method7804();
						local98 = true;
					}
				}
			}
			if (local98) {
				Static535.anInt8885 = Static593.aClass128_43.method3268();
				Static593.aClass128_43.method3271(Static76.aClass6_Sub34Array7);
			}
		}
		for (local270 = 0; local270 < 2048; local270++) {
			@Pc(337) Class4_Sub1_Sub1_Sub2 local337 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local270];
			if (local337 != null) {
				for (local112 = 0; local112 < 10; local112++) {
					local337.anIntArray521[local112] -= local88;
					local337.anIntArray522[local112] -= local93;
				}
				local337.anInt9542 -= local88 * 512;
				local337.anInt9540 -= local93 * 512;
			}
		}
		@Pc(387) Class262[] local387 = Static434.aClass262Array1;
		for (local112 = 0; local112 < local387.length; local112++) {
			@Pc(395) Class262 local395 = local387[local112];
			if (local395 != null) {
				local395.anInt7232 -= local88 * 512;
				local395.anInt7231 -= local93 * 512;
			}
		}
		for (@Pc(423) Class6_Sub41 local423 = (Class6_Sub41) Static413.aClass361_53.method7838(); local423 != null; local423 = (Class6_Sub41) Static413.aClass361_53.method7845()) {
			local423.anInt8205 -= local93;
			local423.anInt8201 -= local88;
			if (Static367.anInt6493 != 4 && (local423.anInt8201 < 0 || local423.anInt8205 < 0 || local423.anInt8201 >= Static473.anInt8075 || local423.anInt8205 >= Static165.anInt6749)) {
				local423.method7804();
			}
		}
		if (Static367.anInt6493 != 4) {
			for (@Pc(479) Class6_Sub51 local479 = (Class6_Sub51) Static478.aClass128_40.method3265(); local479 != null; local479 = (Class6_Sub51) Static478.aClass128_40.method3273()) {
				@Pc(487) int local487 = (int) (local479.aLong263 & 0x3FFFL);
				@Pc(492) int local492 = local487 - Static39.anInt4952;
				local162 = (int) (local479.aLong263 >> 14 & 0x3FFFL);
				@Pc(505) int local505 = local162 - Static138.anInt3088;
				if (local492 < 0 || local505 < 0 || local492 >= Static473.anInt8075 || Static165.anInt6749 <= local505) {
					local479.method7804();
				}
			}
		}
		if (Static530.anInt8828 != 0) {
			Static530.anInt8828 -= local88;
			Static210.anInt4254 -= local93;
		}
		Static428.method6153();
		if (arg1 != 11) {
			Static190.anInt3955 -= local88;
			Static322.anInt5904 -= local93 * 512;
			Static109.anInt2112 -= local93;
			Static526.anInt8805 -= local88;
			Static42.anInt1021 -= local93;
			Static371.anInt6572 -= local88 * 512;
			if (Math.abs(local88) > Static473.anInt8075 || Math.abs(local93) > Static165.anInt6749) {
				Static425.method6109();
			}
		} else if (Static346.anInt6215 == 4) {
			Static220.anInt4550 -= local93 * 512;
			Static405.anInt7184 -= local88 * 512;
			Static468.anInt8032 -= local93 * 512;
			Static157.anInt3359 -= local88 * 512;
		} else {
			Static346.anInt6215 = 1;
		}
		Static50.method1123();
		Static510.method7081();
		Static79.aClass361_9.method7842();
		Static83.aClass361_10.method7842();
		Static328.aClass40_5.method1133();
		Static116.method2030();
	}
}
