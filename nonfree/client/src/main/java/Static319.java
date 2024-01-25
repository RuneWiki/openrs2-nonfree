import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_92 = new Class183(60, -1);

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_213 = new Class62("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_167 = new Class208(2, -2);

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
	public static int anInt5841 = 0;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_168 = new Class208(80, 2);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IC)Z")
	public static boolean method5149(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static322.aCharArray6;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	public static void method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub1_2 != null) {
			local7.aClass1_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method5151(@OriginalArg(0) Class2_Sub24_Sub2 arg0) {
		arg0.method5792();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static97.anInt2139; local12++) {
			local18 = Static321.anIntArray512[local12];
			if ((Static154.aByteArray37[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static154.aByteArray37[local18] = (byte) (Static154.aByteArray37[local18] | 0x2);
				} else {
					local46 = arg0.method5793(1);
					if (local46 == 0) {
						local10 = Static50.method733(arg0);
						Static154.aByteArray37[local18] = (byte) (Static154.aByteArray37[local18] | 0x2);
					} else {
						Static110.method2011(local18, arg0);
					}
				}
			}
		}
		arg0.method5782();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5792();
		@Pc(126) int local126;
		for (local18 = 0; local18 < Static97.anInt2139; local18++) {
			local46 = Static321.anIntArray512[local18];
			if ((Static154.aByteArray37[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static154.aByteArray37[local46] = (byte) (Static154.aByteArray37[local46] | 0x2);
					local10--;
				} else {
					local126 = arg0.method5793(1);
					if (local126 == 0) {
						local10 = Static50.method733(arg0);
						Static154.aByteArray37[local46] = (byte) (Static154.aByteArray37[local46] | 0x2);
					} else {
						Static110.method2011(local46, arg0);
					}
				}
			}
		}
		arg0.method5782();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5792();
		@Pc(217) int local217;
		for (local46 = 0; local46 < Static345.anInt6348; local46++) {
			local126 = Static134.anIntArray224[local46];
			if ((Static154.aByteArray37[local126] & 0x1) != 0) {
				if (local10 > 0) {
					Static154.aByteArray37[local126] = (byte) (Static154.aByteArray37[local126] | 0x2);
					local10--;
				} else {
					local217 = arg0.method5793(1);
					if (local217 == 0) {
						local10 = Static50.method733(arg0);
						Static154.aByteArray37[local126] = (byte) (Static154.aByteArray37[local126] | 0x2);
					} else if (Static288.method4744(arg0, local126)) {
						Static154.aByteArray37[local126] = (byte) (Static154.aByteArray37[local126] | 0x2);
					}
				}
			}
		}
		arg0.method5782();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5792();
		for (local126 = 0; local126 < Static345.anInt6348; local126++) {
			local217 = Static134.anIntArray224[local126];
			if ((Static154.aByteArray37[local217] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static154.aByteArray37[local217] = (byte) (Static154.aByteArray37[local217] | 0x2);
				} else {
					@Pc(301) int local301 = arg0.method5793(1);
					if (local301 == 0) {
						local10 = Static50.method733(arg0);
						Static154.aByteArray37[local217] = (byte) (Static154.aByteArray37[local217] | 0x2);
					} else if (Static288.method4744(arg0, local217)) {
						Static154.aByteArray37[local217] = (byte) (Static154.aByteArray37[local217] | 0x2);
					}
				}
			}
		}
		arg0.method5782();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static345.anInt6348 = 0;
		Static97.anInt2139 = 0;
		for (local217 = 1; local217 < 2048; local217++) {
			Static154.aByteArray37[local217] = (byte) (Static154.aByteArray37[local217] >> 1);
			@Pc(370) Class1_Sub2_Sub1_Sub1 local370 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local217];
			if (local370 == null) {
				Static134.anIntArray224[Static345.anInt6348++] = local217;
			} else {
				Static321.anIntArray512[Static97.anInt2139++] = local217;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!qe;Z)V")
	public static void method5152(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1) {
		if (Static198.aBoolean294) {
			arg0 = 0;
			Static198.aBoolean294 = false;
		}
		if (Static279.aClass189_1 != null && Static279.aClass189_1.method4694(arg1)) {
			return;
		}
		Static279.aClass189_1 = arg1;
		Static211.aLong128 = Static101.method1805();
		Static383.anInt6966 = arg0;
		Static372.anInt6828 = arg0;
		if (Static372.anInt6828 == 0) {
			Static391.method6123();
			return;
		}
		Static344.aFloat73 = Static312.aFloat69;
		Static374.aFloat76 = Static111.aFloat9;
		Static47.aFloat3 = Static274.aFloat55;
		Static190.aFloat47 = Static297.aFloat62;
		Static7.aClass10_1 = Static382.aClass10_4;
		Static251.aFloat53 = Static195.aFloat48;
		Static335.anInt6209 = Static100.anInt2240;
		Static266.anInt5035 = Static226.anInt4567;
		Static59.anInt1262 = Static153.anInt3208;
		Static322.aFloat70 = Static268.aFloat54;
	}
}
