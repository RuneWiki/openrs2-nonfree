import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public static int anInt6796;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	public static int anInt6799;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_92 = new Class100(33, 3);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method5512(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static198.method3031(arg4, arg2, arg3, arg0, (String) null, arg5, arg1, -1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!so;)Lclient!om;")
	public static Class263 method5513(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(9) String local9 = arg0.method5898();
		@Pc(16) Class168 local16 = Static191.method2989()[arg0.method5866()];
		@Pc(23) Class339 local23 = Static324.method5108()[arg0.method5866()];
		@Pc(27) int local27 = arg0.method5890();
		@Pc(33) int local33 = arg0.method5890();
		@Pc(37) int local37 = arg0.method5866();
		@Pc(41) int local41 = arg0.method5866();
		@Pc(45) int local45 = arg0.method5866();
		@Pc(49) int local49 = arg0.method5900();
		@Pc(53) int local53 = arg0.method5900();
		@Pc(61) int local61 = arg0.method5878();
		@Pc(65) int local65 = arg0.method5878();
		@Pc(69) int local69 = arg0.method5878();
		return new Class263(local9, local16, local23, local27, local33, local37, local41, local45, local49, local53, local61, local65, local69);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method5514(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static224.method3464(arg1, arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!lq;Lclient!lq;)V")
	public static void method5515(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class14 arg1) {
		if (arg0.aClass14_337 != null) {
			arg0.method9315();
		}
		arg0.aClass14_337 = arg1.aClass14_337;
		arg0.aClass14_338 = arg1;
		arg0.aClass14_337.aClass14_338 = arg0;
		arg0.aClass14_338.aClass14_337 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method5516() {
		if (!Static505.aBoolean629) {
			Static436.aBoolean534 = Static408.anInt7105 != -1 && Static313.anInt9044 >= Static408.anInt7105 || Static639.anInt10685 < (Static575.aBoolean699 ? 26 : 22) + Static313.anInt9044 * 16;
		}
		Static40.aClass262_6.method6316();
		Static174.aClass262_73.method6316();
		@Pc(45) int local45;
		for (@Pc(40) Class14_Sub3_Sub11 local40 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local40 != null; local40 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
			local45 = local40.anInt4752;
			if (local45 < 1000) {
				local40.method9315();
				if (local45 == 51 || local45 == 9 || local45 == 45 || local45 == 48 || local45 == 18 || local45 == 49 || local45 == 6) {
					Static174.aClass262_73.method6314(local40);
				} else {
					Static40.aClass262_6.method6314(local40);
				}
			}
		}
		Static40.aClass262_6.method6317(Static16.aClass262_68);
		Static174.aClass262_73.method6317(Static16.aClass262_68);
		if (Static313.anInt9044 > 1) {
			if (Static538.aBoolean652 && Static68.aClass65_1.method1565(81) && Static313.anInt9044 > 2) {
				Static12.aClass14_Sub3_Sub11_1 = (Class14_Sub3_Sub11) Static16.aClass262_68.aClass14_230.aClass14_337.aClass14_337;
			} else {
				Static12.aClass14_Sub3_Sub11_1 = (Class14_Sub3_Sub11) Static16.aClass262_68.aClass14_230.aClass14_337;
			}
			Static678.aClass14_Sub3_Sub11_4 = (Class14_Sub3_Sub11) Static16.aClass262_68.aClass14_230.aClass14_337;
		} else {
			Static12.aClass14_Sub3_Sub11_1 = null;
			Static678.aClass14_Sub3_Sub11_4 = null;
		}
		local45 = -1;
		@Pc(157) Class14_Sub30 local157 = (Class14_Sub30) Static425.aClass262_44.method6318();
		if (local157 != null) {
			local45 = local157.method8572();
		}
		if (!Static505.aBoolean629) {
			if (local45 == 0 && (Static113.anInt2288 == 1 && Static313.anInt9044 > 2 || Static297.method4375())) {
				local45 = 2;
			}
			if (local45 == 2 && Static313.anInt9044 > 0 && local157 != null) {
				if (Static299.aClass230_4 == null && Static119.anInt2451 == 0) {
					Static581.method8289(local157.method8571(), local157.method8578());
				} else {
					Static277.anInt4826 = 2;
				}
			}
			if (local45 == 0) {
				if (Static12.aClass14_Sub3_Sub11_1 != null) {
					Static65.method1316();
				} else if (Static238.aBoolean302) {
					Static141.method1563();
				}
			}
			if (Static299.aClass230_4 == null && Static119.anInt2451 == 0) {
				Static633.aClass14_Sub3_Sub11_3 = null;
				Static277.anInt4826 = 0;
			}
			return;
		}
		@Pc(243) int local243;
		@Pc(247) int local247;
		@Pc(331) int local331;
		@Pc(333) int local333;
		if (local45 == -1) {
			local243 = Static666.aClass79_1.method3361();
			local247 = Static666.aClass79_1.method3358();
			@Pc(249) boolean local249 = false;
			if (Static665.aClass14_Sub3_Sub21_4 != null) {
				if (Static652.anInt10893 - 10 <= local243 && Static652.anInt10893 + Static62.anInt9091 + 10 >= local243 && Static539.anInt9256 - 10 <= local247 && local247 <= Static539.anInt9256 + Static623.anInt10488 + 10) {
					local249 = true;
				} else {
					Static150.method2368();
				}
			}
			if (!local249) {
				if (local243 < Static222.anInt4164 - 10 || Static189.anInt3555 + Static222.anInt4164 + 10 < local243 || local247 < Static370.anInt10482 - 10 || Static370.anInt10482 + Static624.anInt10515 + 10 < local247) {
					Static224.method3462();
				} else if (Static436.aBoolean534) {
					local331 = -1;
					local333 = -1;
					@Pc(348) int local348;
					for (@Pc(335) int local335 = 0; local335 < Static569.anInt9810; local335++) {
						if (Static575.aBoolean699) {
							local348 = Static370.anInt10482 + local335 * 16 + 33;
							if (local247 > local348 - 13 && local348 + 4 > local247) {
								local331 = local335;
								local333 = local348 - 13;
								break;
							}
						} else {
							local348 = Static370.anInt10482 + local335 * 16 + 31;
							if (local247 > local348 - 13 && local247 < local348 + 3) {
								local333 = local348 - 13;
								local331 = local335;
								break;
							}
						}
					}
					if (local331 != -1) {
						local348 = 0;
						@Pc(419) Class280 local419 = new Class280(Static563.aClass73_11);
						for (@Pc(424) Class14_Sub3_Sub21 local424 = (Class14_Sub3_Sub21) local419.method6863(); local424 != null; local424 = (Class14_Sub3_Sub21) local419.method6860()) {
							if (local348 == local331) {
								if (local424.anInt11129 > 1) {
									Static414.method6185(local247, local333, local424);
								}
								break;
							}
							local348++;
						}
					}
				}
			}
		}
		if (local45 != 0) {
			return;
		}
		local243 = local157.method8578();
		local247 = local157.method8571();
		@Pc(500) int local500;
		@Pc(574) Class280 local574;
		@Pc(579) Class14_Sub3_Sub11 local579;
		if (Static665.aClass14_Sub3_Sub21_4 != null && local243 >= Static652.anInt10893 && Static652.anInt10893 + Static62.anInt9091 >= local243 && Static539.anInt9256 <= local247 && Static539.anInt9256 + Static623.anInt10488 >= local247) {
			local500 = -1;
			for (local331 = 0; local331 < Static665.aClass14_Sub3_Sub21_4.anInt11129; local331++) {
				if (Static575.aBoolean699) {
					local333 = Static539.anInt9256 + local331 * 16 + 33;
					if (local247 > local333 - 13 && local333 + 4 > local247) {
						local500 = local331;
					}
				} else {
					local333 = Static539.anInt9256 + local331 * 16 + 31;
					if (local247 > local333 - 13 && local247 < local333 + 3) {
						local500 = local331;
					}
				}
			}
			if (local500 != -1) {
				local333 = 0;
				local574 = new Class280(Static665.aClass14_Sub3_Sub21_4.aClass73_13);
				for (local579 = (Class14_Sub3_Sub11) local574.method6863(); local579 != null; local579 = (Class14_Sub3_Sub11) local574.method6860()) {
					if (local500 == local333) {
						Static192.method2991(local243, local247, local579);
						break;
					}
					local333++;
				}
			}
			Static224.method3462();
			return;
		}
		if (Static222.anInt4164 > local243 || local243 > Static222.anInt4164 + Static189.anInt3555 || Static370.anInt10482 > local247 || local247 > Static624.anInt10515 + Static370.anInt10482) {
			return;
		}
		if (Static436.aBoolean534) {
			local500 = -1;
			for (local331 = 0; local331 < Static569.anInt9810; local331++) {
				if (Static575.aBoolean699) {
					local333 = Static370.anInt10482 + local331 * 16 + 33;
					if (local247 > local333 - 13 && local247 < local333 + 4) {
						local500 = local331;
						break;
					}
				} else {
					local333 = local331 * 16 + Static370.anInt10482 + 31;
					if (local333 - 13 < local247 && local333 + 3 > local247) {
						local500 = local331;
						break;
					}
				}
			}
			if (local500 != -1) {
				local333 = 0;
				local574 = new Class280(Static563.aClass73_11);
				for (@Pc(725) Class14_Sub3_Sub21 local725 = (Class14_Sub3_Sub21) local574.method6863(); local725 != null; local725 = (Class14_Sub3_Sub21) local574.method6860()) {
					if (local333 == local500) {
						Static192.method2991(local243, local247, (Class14_Sub3_Sub11) local725.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67);
						Static224.method3462();
						return;
					}
					local333++;
				}
				return;
			}
		} else {
			local500 = -1;
			for (local331 = 0; local331 < Static313.anInt9044; local331++) {
				if (Static575.aBoolean699) {
					local333 = (Static313.anInt9044 - local331 - 1) * 16 + Static370.anInt10482 + 33;
					if (local333 - 13 < local247 && local333 + 4 > local247) {
						local500 = local331;
					}
				} else {
					local333 = (Static313.anInt9044 - local331 - 1) * 16 + Static370.anInt10482 + 31;
					if (local247 > local333 - 13 && local247 < local333 + 3) {
						local500 = local331;
					}
				}
			}
			if (local500 != -1) {
				local333 = 0;
				@Pc(830) Class118 local830 = new Class118(Static16.aClass262_68);
				for (local579 = (Class14_Sub3_Sub11) local830.method2831(); local579 != null; local579 = (Class14_Sub3_Sub11) local830.method2832()) {
					if (local500 == local333) {
						Static192.method2991(local243, local247, local579);
						break;
					}
					local333++;
				}
			}
			Static224.method3462();
		}
		return;
	}
}
