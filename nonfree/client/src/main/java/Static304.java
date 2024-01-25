import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lclient!pj;")
	public static Class283[] aClass283Array1;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_4 = new Class343("", 17);

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public static int anInt5127 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method4414() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static185.aBooleanArray13[local3] = false;
		}
		Static614.anInt10208 = -1;
		Static451.anInt7263 = 1;
		Static528.anInt8313 = 0;
		Static131.anInt2538 = 0;
		Static468.anInt7425 = -1;
		Static351.anInt6038 = -1;
		Static405.anInt6667 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method4415(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub5_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class35 local8 = Static556.aClass35Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static155.anInt2874; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static133.anInt2551; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static571.anInt9216;
							@Pc(32) int local32 = local12 << Static571.anInt9216;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class35 local41 = Static556.aClass35Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7461(local12, local15) - local41.method7461(local12, local15);
									@Pc(71) int local71 = local8.method7461(local12, local15 + 1) - local41.method7461(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7461(local12 + 1, local15 + 1) - local41.method7461(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7461(local12 + 1, local15) - local41.method7461(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;[II)V")
	public static void method4417(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Static389.method5450(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BILclient!ha;Lclient!oq;)V")
	public static void method4418(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) Class272 arg2) {
		@Pc(18) int local18;
		if (Static489.anIntArray420 != null && arg2.aByte112 >= arg0) {
			for (local18 = 0; local18 < Static489.anIntArray420.length; local18++) {
				if (Static489.anIntArray420[local18] != -1000000 && (arg2.anIntArray390[0] <= Static489.anIntArray420[local18] || arg2.anIntArray390[1] <= Static489.anIntArray420[local18] || arg2.anIntArray390[2] <= Static489.anIntArray420[local18] || Static489.anIntArray420[local18] >= arg2.anIntArray390[3]) && (Static477.anIntArray412[local18] >= arg2.anIntArray392[0] || Static477.anIntArray412[local18] >= arg2.anIntArray392[1] || Static477.anIntArray412[local18] >= arg2.anIntArray392[2] || Static477.anIntArray412[local18] >= arg2.anIntArray392[3]) && (Static485.anIntArray418[local18] <= arg2.anIntArray392[0] || arg2.anIntArray392[1] >= Static485.anIntArray418[local18] || Static485.anIntArray418[local18] <= arg2.anIntArray392[2] || arg2.anIntArray392[3] >= Static485.anIntArray418[local18]) && (Static557.anIntArray477[local18] >= arg2.anIntArray391[0] || Static557.anIntArray477[local18] >= arg2.anIntArray391[1] || Static557.anIntArray477[local18] >= arg2.anIntArray391[2] || Static557.anIntArray477[local18] >= arg2.anIntArray391[3]) && (Static537.anIntArray458[local18] <= arg2.anIntArray391[0] || arg2.anIntArray391[1] >= Static537.anIntArray458[local18] || arg2.anIntArray391[2] >= Static537.anIntArray458[local18] || arg2.anIntArray391[3] >= Static537.anIntArray458[local18])) {
					return;
				}
			}
		}
		@Pc(241) int local241;
		@Pc(261) int local261;
		@Pc(278) boolean local278;
		@Pc(310) float local310;
		if (arg2.aByte113 == 1) {
			local18 = Static362.anInt6205 + arg2.aShort63 - Static88.anInt1826;
			if (local18 >= 0 && Static362.anInt6205 + Static362.anInt6205 >= local18) {
				local241 = Static362.anInt6205 + arg2.aShort61 - Static353.anInt6041;
				if (local241 < 0) {
					local241 = 0;
				} else if (local241 > Static362.anInt6205 + Static362.anInt6205) {
					return;
				}
				local261 = arg2.aShort60 + Static362.anInt6205 - Static353.anInt6041;
				if (Static362.anInt6205 + Static362.anInt6205 < local261) {
					local261 = Static362.anInt6205 + Static362.anInt6205;
				} else if (local261 < 0) {
					return;
				}
				local278 = false;
				while (local261 >= local241) {
					if (Static375.aBooleanArrayArray6[local18][local241++]) {
						local278 = true;
						break;
					}
				}
				if (local278) {
					local310 = (float) (Static632.anInt10468 - arg2.anIntArray392[0]);
					if (local310 < 0.0F) {
						local310 *= -1.0F;
					}
					if (!(float) Static13.anInt308 > local310 && (Static155.method2481(0, arg2) && (Static155.method2481(1, arg2) && (Static155.method2481(2, arg2) && Static155.method2481(3, arg2))))) {
						Static589.aClass272Array37[Static232.anInt4115++] = arg2;
					}
				}
			}
		} else if (arg2.aByte113 == 2) {
			local18 = arg2.aShort61 + Static362.anInt6205 - Static353.anInt6041;
			if (local18 >= 0 && local18 <= Static362.anInt6205 + Static362.anInt6205) {
				local241 = Static362.anInt6205 + arg2.aShort63 - Static88.anInt1826;
				if (local241 < 0) {
					local241 = 0;
				} else if (Static362.anInt6205 + Static362.anInt6205 < local241) {
					return;
				}
				local261 = arg2.aShort62 + Static362.anInt6205 - Static88.anInt1826;
				if (Static362.anInt6205 + Static362.anInt6205 < local261) {
					local261 = Static362.anInt6205 + Static362.anInt6205;
				} else if (local261 < 0) {
					return;
				}
				local278 = false;
				while (local261 >= local241) {
					if (Static375.aBooleanArrayArray6[local241++][local18]) {
						local278 = true;
						break;
					}
				}
				if (local278) {
					local310 = (float) (Static332.anInt5506 - arg2.anIntArray391[0]);
					if (local310 < 0.0F) {
						local310 *= -1.0F;
					}
					if (!(local310 < (float) Static13.anInt308) && (Static155.method2481(0, arg2) && (Static155.method2481(1, arg2) && (Static155.method2481(2, arg2) && Static155.method2481(3, arg2))))) {
						Static589.aClass272Array37[Static232.anInt4115++] = arg2;
					}
				}
			}
		} else if (arg2.aByte113 == 16 || arg2.aByte113 == 8) {
			local18 = Static362.anInt6205 + arg2.aShort63 - Static88.anInt1826;
			if (local18 >= 0 && local18 <= Static362.anInt6205 + Static362.anInt6205) {
				local241 = Static362.anInt6205 + arg2.aShort61 - Static353.anInt6041;
				if (local241 >= 0 && Static362.anInt6205 + Static362.anInt6205 >= local241 && Static375.aBooleanArrayArray6[local18][local241]) {
					@Pc(585) float local585 = (float) (Static632.anInt10468 - arg2.anIntArray392[0]);
					if (local585 < 0.0F) {
						local585 *= -1.0F;
					}
					@Pc(602) float local602 = (float) (Static332.anInt5506 - arg2.anIntArray391[0]);
					if (local602 < 0.0F) {
						local602 *= -1.0F;
					}
					if ((!(local585 < (float) Static13.anInt308) || !(local602 < (float) Static13.anInt308)) && (Static155.method2481(0, arg2) && (Static155.method2481(1, arg2) && (Static155.method2481(2, arg2) && Static155.method2481(3, arg2))))) {
						Static589.aClass272Array37[Static232.anInt4115++] = arg2;
					}
				}
			}
		} else if (arg2.aByte113 == 4) {
			@Pc(671) float local671 = (float) (arg2.anIntArray390[0] - Static209.anInt3644);
			if (!((float) Static450.anInt7240 >= local671)) {
				local241 = arg2.aShort61 + Static362.anInt6205 - Static353.anInt6041;
				if (local241 < 0) {
					local241 = 0;
				} else if (local241 > Static362.anInt6205 + Static362.anInt6205) {
					return;
				}
				local261 = Static362.anInt6205 + arg2.aShort60 - Static353.anInt6041;
				if (Static362.anInt6205 + Static362.anInt6205 < local261) {
					local261 = Static362.anInt6205 + Static362.anInt6205;
				} else if (local261 < 0) {
					return;
				}
				@Pc(732) int local732 = arg2.aShort63 + Static362.anInt6205 - Static88.anInt1826;
				if (local732 < 0) {
					local732 = 0;
				} else if (Static362.anInt6205 + Static362.anInt6205 < local732) {
					return;
				}
				@Pc(753) int local753 = arg2.aShort62 + Static362.anInt6205 - Static88.anInt1826;
				if (Static362.anInt6205 + Static362.anInt6205 < local753) {
					local753 = Static362.anInt6205 + Static362.anInt6205;
				} else if (local753 < 0) {
					return;
				}
				@Pc(775) boolean local775 = false;
				label283: for (@Pc(777) int local777 = local732; local777 <= local753; local777++) {
					for (@Pc(781) int local781 = local241; local781 <= local261; local781++) {
						if (Static375.aBooleanArrayArray6[local777][local781]) {
							local775 = true;
							break label283;
						}
					}
				}
				if (local775 && (Static155.method2481(0, arg2) && (Static155.method2481(1, arg2) && (Static155.method2481(2, arg2) && Static155.method2481(3, arg2))))) {
					Static589.aClass272Array37[Static232.anInt4115++] = arg2;
				}
			}
		}
	}
}
