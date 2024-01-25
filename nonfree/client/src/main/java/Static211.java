import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public static int anInt7126;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_71 = new Class269(83, -1);

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "[I")
	public static final int[] anIntArray493 = new int[8];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
	public static boolean method6033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIBI)Ljava/lang/String;")
	public static String method6034(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(64) int local64 = local37 - 1; local64 > 0; local64--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 < 10) {
				local56[local64] = (char) (local78 + 48);
			} else {
				local56[local64] = (char) (local78 + 87);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!rca;)V")
	public static void method6036(@OriginalArg(1) Class2_Sub34_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method6927();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static571.anInt9395; local12++) {
			local18 = Static131.anIntArray213[local12];
			if ((Static316.aByteArray59[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static316.aByteArray59[local18] = (byte) (Static316.aByteArray59[local18] | 0x2);
				} else {
					local46 = arg0.method6925(1);
					if (local46 == 0) {
						local7 = Static641.method8574(arg0);
						Static316.aByteArray59[local18] = (byte) (Static316.aByteArray59[local18] | 0x2);
					} else {
						Static369.method5568(local18, arg0);
					}
				}
			}
		}
		arg0.method6923();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method6927();
		@Pc(132) int local132;
		for (local18 = 0; local18 < Static571.anInt9395; local18++) {
			local46 = Static131.anIntArray213[local18];
			if ((Static316.aByteArray59[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static316.aByteArray59[local46] = (byte) (Static316.aByteArray59[local46] | 0x2);
				} else {
					local132 = arg0.method6925(1);
					if (local132 == 0) {
						local7 = Static641.method8574(arg0);
						Static316.aByteArray59[local46] = (byte) (Static316.aByteArray59[local46] | 0x2);
					} else {
						Static369.method5568(local46, arg0);
					}
				}
			}
		}
		arg0.method6923();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method6927();
		@Pc(216) int local216;
		for (local46 = 0; local46 < Static45.anInt6804; local46++) {
			local132 = Static528.anIntArray611[local46];
			if ((Static316.aByteArray59[local132] & 0x1) != 0) {
				if (local7 > 0) {
					Static316.aByteArray59[local132] = (byte) (Static316.aByteArray59[local132] | 0x2);
					local7--;
				} else {
					local216 = arg0.method6925(1);
					if (local216 == 0) {
						local7 = Static641.method8574(arg0);
						Static316.aByteArray59[local132] = (byte) (Static316.aByteArray59[local132] | 0x2);
					} else if (Static600.method8237(local132, arg0)) {
						Static316.aByteArray59[local132] = (byte) (Static316.aByteArray59[local132] | 0x2);
					}
				}
			}
		}
		arg0.method6923();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method6927();
		for (local132 = 0; local132 < Static45.anInt6804; local132++) {
			local216 = Static528.anIntArray611[local132];
			if ((Static316.aByteArray59[local216] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static316.aByteArray59[local216] = (byte) (Static316.aByteArray59[local216] | 0x2);
				} else {
					@Pc(303) int local303 = arg0.method6925(1);
					if (local303 == 0) {
						local7 = Static641.method8574(arg0);
						Static316.aByteArray59[local216] = (byte) (Static316.aByteArray59[local216] | 0x2);
					} else if (Static600.method8237(local216, arg0)) {
						Static316.aByteArray59[local216] = (byte) (Static316.aByteArray59[local216] | 0x2);
					}
				}
			}
		}
		arg0.method6923();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static45.anInt6804 = 0;
		Static571.anInt9395 = 0;
		for (local216 = 1; local216 < 2048; local216++) {
			Static316.aByteArray59[local216] = (byte) (Static316.aByteArray59[local216] >> 1);
			@Pc(371) Class11_Sub1_Sub1_Sub2_Sub1 local371 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local216];
			if (local371 == null) {
				Static528.anIntArray611[Static45.anInt6804++] = local216;
			} else {
				Static131.anIntArray213[Static571.anInt9395++] = local216;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Z")
	public static boolean method6037() {
		if (Static511.aBoolean580) {
			try {
				Static648.method3663("showVideoAd", Static234.anApplet2);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
