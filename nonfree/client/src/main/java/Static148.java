import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_26 = new Class144(90, 4);

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
	public static int method2487() {
		if ((double) Static327.aFloat31 == 3.0D) {
			return 37;
		} else if ((double) Static327.aFloat31 == 4.0D) {
			return 50;
		} else if ((double) Static327.aFloat31 == 6.0D) {
			return 75;
		} else if ((double) Static327.aFloat31 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!jo;Lclient!ha;ILclient!pm;BI)Z")
	public static boolean method2488(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) Class3_Sub48 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (arg0.anIntArray376 != null) {
			local9 = Static327.anInt1085 + (arg0.anInt5152 + arg2.anInt8047 - Static327.anInt1078) * (-Static327.anInt1085 + Static327.anInt1075) / (Static327.anInt1077 - Static327.anInt1078);
			local19 = Static327.anInt1083 - (arg0.anInt5131 + arg2.anInt8049 - Static327.anInt1082) * (Static327.anInt1083 - Static327.anInt1081) / (Static327.anInt1074 - Static327.anInt1082);
			local7 = Static327.anInt1085 + (Static327.anInt1075 - Static327.anInt1085) * (arg2.anInt8047 + (arg0.anInt5125 - Static327.anInt1078)) / (Static327.anInt1077 - Static327.anInt1078);
			local21 = Static327.anInt1083 - (arg2.anInt8049 + arg0.anInt5146 - Static327.anInt1082) * (-Static327.anInt1081 + Static327.anInt1083) / (Static327.anInt1074 - Static327.anInt1082);
		}
		@Pc(109) Class178 local109 = null;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		if (arg0.anInt5156 != -1) {
			if (arg2.aBoolean541 && arg0.anInt5140 != -1) {
				local109 = arg0.method4675(arg1, true);
			} else {
				local109 = arg0.method4675(arg1, false);
			}
			if (local109 != null) {
				local111 = arg2.anInt8045 - (local109.method7627() + 1 >> 1);
				if (local111 < local7) {
					local7 = local111;
				}
				local113 = arg2.anInt8045 + (local109.method7627() + 1 >> 1);
				if (local9 < local113) {
					local9 = local113;
				}
				local115 = arg2.anInt8046 - (local109.method7632() + 1 >> 1);
				if (local19 > local115) {
					local19 = local115;
				}
				local117 = arg2.anInt8046 + (local109.method7632() + 1 >> 1);
				if (local21 < local117) {
					local21 = local117;
				}
			}
		}
		@Pc(225) Class193 local225 = null;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(239) int local239 = 0;
		@Pc(241) int local241 = 0;
		@Pc(319) int local319;
		if (arg0.aString62 != null) {
			local225 = Static643.method8459(arg0.anInt5126);
			if (local225 != null) {
				local227 = Static286.aClass169_5.method3649((Class178[]) null, arg0.aString62, (int[]) null, Static486.aStringArray31);
				local231 = arg2.anInt8046 - (Static327.anInt1083 - Static327.anInt1081) * arg0.anInt5130 / (Static327.anInt1074 - Static327.anInt1082);
				local229 = arg0.anInt5129 * (Static327.anInt1075 - Static327.anInt1085) / (Static327.anInt1077 - Static327.anInt1078) + arg2.anInt8045;
				if (local109 == null) {
					local231 -= local225.method4592() * local227 / 2;
				} else {
					local231 -= (local109.method7632() >> 1) + local225.method4590() * local227;
				}
				for (local319 = 0; local319 < local227; local319++) {
					@Pc(325) String local325 = Static486.aStringArray31[local319];
					if (local227 - 1 > local319) {
						local325 = local325.substring(0, local325.length() - 4);
					}
					@Pc(346) int local346 = local225.method4589(local325);
					if (local346 > local233) {
						local233 = local346;
					}
				}
				local235 = local229 - local233 / 2;
				local237 = local233 / 2 + local229;
				if (local7 > local235) {
					local7 = local235;
				}
				local239 = local231;
				if (local9 < local237) {
					local9 = local237;
				}
				if (local239 < local19) {
					local19 = local239;
				}
				local241 = local231 + local225.method4590() * local227;
				if (local21 < local241) {
					local21 = local241;
				}
			}
		}
		if (Static327.anInt1085 > local9 || Static327.anInt1075 < local7 || Static327.anInt1081 > local21 || Static327.anInt1083 < local19) {
			return true;
		}
		Static327.method1010(arg1, arg2, arg0);
		if (local109 != null) {
			if (Static412.anInt6360 > 0 && (Static270.anInt4162 != -1 && arg2.anInt8050 == Static270.anInt4162 || Static496.anInt7889 != -1 && Static496.anInt7889 == arg0.anInt5135)) {
				if (Static489.anInt10872 <= 50) {
					local319 = Static489.anInt10872 * 2;
				} else {
					local319 = 200 - Static489.anInt10872 * 2;
				}
				@Pc(501) int local501 = local319 << 24 | 0xFFFF00;
				arg1.method9336(local109.method7636() / 2 + 7, arg2.anInt8045, arg2.anInt8046, local501);
				arg1.method9336(local109.method7636() / 2 + 5, arg2.anInt8045, arg2.anInt8046, local501);
				arg1.method9336(local109.method7636() / 2 + 3, arg2.anInt8045, arg2.anInt8046, local501);
				arg1.method9336(local109.method7636() / 2 + 1, arg2.anInt8045, arg2.anInt8046, local501);
				arg1.method9336(local109.method7636() / 2, arg2.anInt8045, arg2.anInt8046, local501);
			}
			local109.method7637(arg2.anInt8045 - (local109.method7627() >> 1), arg2.anInt8046 - (local109.method7632() >> 1));
		}
		if (arg0.aString62 != null && local225 != null) {
			Static582.method7517(local225, arg1, local227, arg0, arg2, local229, local231, local233);
		}
		if (arg0.anInt5156 != -1 || arg0.aString62 != null) {
			@Pc(620) Class3_Sub10 local620 = new Class3_Sub10(arg2);
			local620.anInt1318 = local117;
			local620.anInt1309 = local239;
			local620.anInt1312 = local235;
			local620.anInt1315 = local113;
			local620.anInt1313 = local111;
			local620.anInt1310 = local237;
			local620.anInt1317 = local115;
			local620.anInt1314 = local241;
			Static654.aClass342_80.method7654(local620);
		}
		return false;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!nda;")
	public static Class258 method2489(@OriginalArg(1) int arg0) {
		@Pc(8) Class258[] local8 = Static255.method3548();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class258 local16 = local8[local10];
			if (local16.anInt6580 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Z")
	public static boolean method2490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static106.method2118(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static524.method7014(arg1, arg0) | Static261.method3654(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static47.method1236(arg1, arg0) | Static317.method4644(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBZI)I")
	public static int method2491(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub38 local8 = Static14.method503(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray410.length) {
			return local8.anIntArray410[arg0];
		} else {
			return -1;
		}
	}
}
