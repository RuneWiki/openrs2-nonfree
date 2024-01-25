import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Lclient!mv;")
	public static Class167 aClass167_1;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public static int anInt5435 = 0;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
	public static final int anInt5448 = 1405;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public static boolean method4482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static212.anInt3976; local1++) {
			@Pc(6) Class128 local6 = Static303.aClass128Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3450 == 1) {
				local15 = local6.anInt3436 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3440 + (local6.anInt3433 * local15 >> 8);
					local37 = local6.anInt3448 + (local6.anInt3439 * local15 >> 8);
					local47 = local6.anInt3445 + (local6.anInt3441 * local15 >> 8);
					local57 = local6.anInt3446 + (local6.anInt3449 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3450 == 2) {
				local15 = arg0 - local6.anInt3436;
				if (local15 > 0) {
					local27 = local6.anInt3440 + (local6.anInt3433 * local15 >> 8);
					local37 = local6.anInt3448 + (local6.anInt3439 * local15 >> 8);
					local47 = local6.anInt3445 + (local6.anInt3441 * local15 >> 8);
					local57 = local6.anInt3446 + (local6.anInt3449 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3450 == 3) {
				local15 = local6.anInt3440 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3436 + (local6.anInt3444 * local15 >> 8);
					local37 = local6.anInt3438 + (local6.anInt3432 * local15 >> 8);
					local47 = local6.anInt3445 + (local6.anInt3441 * local15 >> 8);
					local57 = local6.anInt3446 + (local6.anInt3449 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3450 == 4) {
				local15 = arg2 - local6.anInt3440;
				if (local15 > 0) {
					local27 = local6.anInt3436 + (local6.anInt3444 * local15 >> 8);
					local37 = local6.anInt3438 + (local6.anInt3432 * local15 >> 8);
					local47 = local6.anInt3445 + (local6.anInt3441 * local15 >> 8);
					local57 = local6.anInt3446 + (local6.anInt3449 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3450 == 5) {
				local15 = arg1 - local6.anInt3445;
				if (local15 > 0) {
					local27 = local6.anInt3436 + (local6.anInt3444 * local15 >> 8);
					local37 = local6.anInt3438 + (local6.anInt3432 * local15 >> 8);
					local47 = local6.anInt3440 + (local6.anInt3433 * local15 >> 8);
					local57 = local6.anInt3448 + (local6.anInt3439 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public static void method4484() {
		Static167.aClass143_17 = null;
		Static176.aClass143_18 = null;
		Static211.aClass143_23 = null;
		Static247.aClass143_33 = null;
		Static3.aClass143_1 = null;
		Static64.aClass143_11 = null;
		Static212.aClass143Array6 = null;
		Static75.aClass143_14 = null;
		Static338.aClass143_29 = null;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)[Lclient!rd;")
	public static Class206[] method4485() {
		if (Static376.aClass206Array1 == null) {
			@Pc(14) Class206[] local14 = Static357.method4899(Static77.aClass180_1);
			@Pc(18) Class206[] local18 = new Class206[local14.length];
			@Pc(20) int local20 = 0;
			@Pc(74) int local74;
			@Pc(79) Class206 local79;
			label63: for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
				@Pc(27) Class206 local27 = local14[local22];
				if ((local27.anInt5766 <= 0 || local27.anInt5766 >= 24) && local27.anInt5763 >= 800 && local27.anInt5765 >= 600 && (Static79.anInt1766 >= 96 || Static143.anInt2766 != 0 || local27.anInt5763 <= 1024 && local27.anInt5765 <= 768)) {
					for (local74 = 0; local74 < local20; local74++) {
						local79 = local18[local74];
						if (local27.anInt5763 == local79.anInt5763 && local79.anInt5765 == local27.anInt5765) {
							if (local27.anInt5766 > local79.anInt5766) {
								local18[local74] = local27;
							}
							continue label63;
						}
					}
					local18[local20] = local27;
					local20++;
				}
			}
			Static376.aClass206Array1 = new Class206[local20];
			Static468.method4330(local18, 0, Static376.aClass206Array1, 0, local20);
			@Pc(138) int[] local138 = new int[Static376.aClass206Array1.length];
			for (local74 = 0; local74 < Static376.aClass206Array1.length; local74++) {
				local79 = Static376.aClass206Array1[local74];
				local138[local74] = local79.anInt5763 * local79.anInt5765;
			}
			Static105.method1876(local138, Static376.aClass206Array1);
		}
		return Static376.aClass206Array1;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method4486(@OriginalArg(0) Class39 arg0) {
		if (Static385.aBoolean436) {
			Static164.method2644(arg0);
		} else {
			Static47.method861(arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method4487(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static113.aClass246_73.anInt6592 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static165.aClass19_1.anInt579; local16++) {
			@Pc(22) Class152 local22 = Static165.aClass19_1.method560(local16);
			if ((!arg1 || local22.aBoolean296) && local22.anInt4202 == -1 && local22.anInt4188 == -1 && local22.anInt4206 == 0 && local22.aString34.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static54.anInt1016 = -1;
					Static296.aShortArray85 = null;
					return;
				}
				if (local12.length <= local14) {
					@Pc(67) short[] local67 = new short[local12.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local14; local69++) {
						local67[local69] = local12[local69];
					}
					local12 = local67;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static330.anInt5656 = 0;
		Static54.anInt1016 = local14;
		Static296.aShortArray85 = local12;
		@Pc(111) String[] local111 = new String[Static54.anInt1016];
		for (@Pc(113) int local113 = 0; local113 < Static54.anInt1016; local113++) {
			local111[local113] = Static165.aClass19_1.method560(local12[local113]).aString34;
		}
		Static35.method5796(local111, Static296.aShortArray85);
		Static113.aClass246_73.method5474();
		Static113.aClass246_73.anInt6592 = 2;
	}
}
