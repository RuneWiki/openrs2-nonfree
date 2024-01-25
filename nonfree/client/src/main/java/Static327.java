import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
	public static int anInt6213;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_88 = new Class98(60, 6);

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "Lclient!of;")
	public static final Class230 aClass230_38 = new Class230(6, 7);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5033(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static186.aClass266_1.anInt7495 : Static186.aClass266_1.anInt7501) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub5_Sub14 local38 = Static186.aClass266_1.method5987(local31);
			if (local38.aBoolean491 && local38.method5751().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static173.aShortArray46 = null;
					Static391.anInt7133 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static391.anInt7133 = local13;
		Static173.aShortArray46 = local11;
		anInt6213 = 0;
		@Pc(116) String[] local116 = new String[Static391.anInt7133];
		for (@Pc(118) int local118 = 0; local118 < Static391.anInt7133; local118++) {
			local116[local118] = Static186.aClass266_1.method5987(local11[local118]).method5751();
		}
		Static170.method2692(Static173.aShortArray46, local116);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(III)V")
	public static void method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static490.aFloat33 > Static490.aFloat34) {
			Static490.aFloat34 = (float) ((double) Static490.aFloat34 + (double) Static490.aFloat34 / 30.0D);
			if (Static490.aFloat34 > Static490.aFloat33) {
				Static490.aFloat34 = Static490.aFloat33;
			}
			Static563.method7799();
			Static490.anInt1909 = (int) Static490.aFloat34 >> 1;
			Static490.aByteArrayArrayArray3 = Static69.method978(Static490.anInt1909);
		} else if (Static490.aFloat34 > Static490.aFloat33) {
			Static490.aFloat34 = (float) ((double) Static490.aFloat34 - (double) Static490.aFloat34 / 30.0D);
			if (Static490.aFloat33 > Static490.aFloat34) {
				Static490.aFloat34 = Static490.aFloat33;
			}
			Static563.method7799();
			Static490.anInt1909 = (int) Static490.aFloat34 >> 1;
			Static490.aByteArrayArrayArray3 = Static69.method978(Static490.anInt1909);
		}
		if (Static175.anInt3184 != -1 && Static26.anInt444 != -1) {
			@Pc(79) int local79 = Static175.anInt3184 - Static441.anInt3925;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static26.anInt444 - Static30.anInt535;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static441.anInt3925 -= -local79;
			Static30.anInt535 += local96;
			if (local79 == 0 && local96 == 0) {
				Static26.anInt444 = -1;
				Static175.anInt3184 = -1;
			}
			Static563.method7799();
		}
		if (Static49.anInt883 <= 0) {
			Static50.anInt8645 = -1;
			Static119.anInt7220 = -1;
		} else {
			Static190.anInt7946--;
			if (Static190.anInt7946 == 0) {
				Static49.anInt883--;
				Static190.anInt7946 = 100;
			}
		}
		if (!Static40.aBoolean587 || Static288.aClass298_170 == null) {
			return;
		}
		for (@Pc(169) Class6_Sub38 local169 = (Class6_Sub38) Static288.aClass298_170.method6809(); local169 != null; local169 = (Class6_Sub38) Static288.aClass298_170.method6821()) {
			@Pc(178) Class336 local178 = Static490.aClass320_2.method7209(local169.aClass6_Sub22_1.anInt4399);
			if (local169.method5819(arg1, arg0)) {
				if (local178.aStringArray40 != null) {
					if (local178.aStringArray40[4] != null) {
						Static133.method2173(local178.aString90, local178.anInt9756, 1011, -1, 0, (long) local169.aClass6_Sub22_1.anInt4399, -1, true, local178.aStringArray40[4], false);
					}
					if (local178.aStringArray40[3] != null) {
						Static133.method2173(local178.aString90, local178.anInt9756, 1006, -1, 0, (long) local169.aClass6_Sub22_1.anInt4399, -1, true, local178.aStringArray40[3], false);
					}
					if (local178.aStringArray40[2] != null) {
						Static133.method2173(local178.aString90, local178.anInt9756, 1010, -1, 0, (long) local169.aClass6_Sub22_1.anInt4399, -1, true, local178.aStringArray40[2], false);
					}
					if (local178.aStringArray40[1] != null) {
						Static133.method2173(local178.aString90, local178.anInt9756, 1001, -1, 0, (long) local169.aClass6_Sub22_1.anInt4399, -1, true, local178.aStringArray40[1], false);
					}
					if (local178.aStringArray40[0] != null) {
						Static133.method2173(local178.aString90, local178.anInt9756, 1003, -1, 0, (long) local169.aClass6_Sub22_1.anInt4399, -1, true, local178.aStringArray40[0], false);
					}
				}
				if (!local169.aClass6_Sub22_1.aBoolean323) {
					local169.aClass6_Sub22_1.aBoolean323 = true;
					Static199.method3318(Static166.aClass195_6, local169.aClass6_Sub22_1.anInt4399, local178.anInt9756);
				}
				if (local169.aClass6_Sub22_1.aBoolean323) {
					Static199.method3318(Static256.aClass195_7, local169.aClass6_Sub22_1.anInt4399, local178.anInt9756);
				}
			} else if (local169.aClass6_Sub22_1.aBoolean323) {
				local169.aClass6_Sub22_1.aBoolean323 = false;
				Static199.method3318(Static307.aClass195_10, local169.aClass6_Sub22_1.anInt4399, local178.anInt9756);
			}
		}
	}
}
