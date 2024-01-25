import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!js", name = "h", descriptor = "Lclient!oh;")
	public static Class237 aClass237_69;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "I")
	public static int anInt5648;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	public static int method4608(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	public static void method4609() {
		if (!Static211.aBoolean370) {
			Static577.aBoolean710 = Static201.anInt4619 != -1 && Static201.anInt4619 <= Static548.anInt9471 || (Static238.aBoolean398 ? 26 : 22) + Static548.anInt9471 * 16 > Static313.anInt6355;
		}
		Static321.aClass43_33.method1431();
		Static449.aClass43_53.method1431();
		@Pc(55) int local55;
		for (@Pc(50) Class8_Sub5_Sub7 local50 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local50 != null; local50 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
			local55 = local50.anInt3779;
			if (local55 < 1000) {
				local50.method8640();
				if (local55 == 6 || local55 == 50 || local55 == 59 || local55 == 45 || local55 == 18 || local55 == 11 || local55 == 13) {
					Static449.aClass43_53.method1424(local50);
				} else {
					Static321.aClass43_33.method1424(local50);
				}
			}
		}
		Static321.aClass43_33.method1427(Static72.aClass43_17);
		Static449.aClass43_53.method1427(Static72.aClass43_17);
		if (Static548.anInt9471 <= 1) {
			Static393.aClass8_Sub5_Sub7_2 = null;
			Static193.aClass8_Sub5_Sub7_1 = null;
		} else {
			if (Static131.aBoolean255 && Static295.aClass209_1.method5482(81) && Static548.anInt9471 > 2) {
				Static193.aClass8_Sub5_Sub7_1 = (Class8_Sub5_Sub7) Static72.aClass43_17.aClass8_37.aClass8_299.aClass8_299;
			} else {
				Static193.aClass8_Sub5_Sub7_1 = (Class8_Sub5_Sub7) Static72.aClass43_17.aClass8_37.aClass8_299;
			}
			Static393.aClass8_Sub5_Sub7_2 = (Class8_Sub5_Sub7) Static72.aClass43_17.aClass8_37.aClass8_299;
		}
		local55 = -1;
		@Pc(163) Class8_Sub33 local163 = (Class8_Sub33) Static188.aClass43_24.method1422();
		if (local163 != null) {
			local55 = local163.method7204();
		}
		if (!Static211.aBoolean370) {
			if (local55 == 0 && (Static580.anInt5357 == 1 && Static548.anInt9471 > 2 || Static596.method8230())) {
				local55 = 2;
			}
			if (local55 == 2 && Static548.anInt9471 > 0 && local163 != null) {
				if (Static10.aClass331_3 == null && Static88.anInt2513 == 0) {
					Static546.method7689(local163.method7202(), local163.method7207());
				} else {
					Static468.anInt10554 = 2;
				}
			}
			if (local55 == 0) {
				if (Static193.aClass8_Sub5_Sub7_1 != null) {
					Static58.method1628();
				} else if (Static147.aBoolean270) {
					Static8.method91();
				}
			}
			if (Static10.aClass331_3 == null && Static88.anInt2513 == 0) {
				Static416.aClass8_Sub5_Sub7_3 = null;
				Static468.anInt10554 = 0;
			}
			return;
		}
		@Pc(245) int local245;
		@Pc(249) int local249;
		@Pc(338) int local338;
		@Pc(340) int local340;
		@Pc(342) int local342;
		if (local55 == -1) {
			local245 = Static288.aClass35_6.method5764();
			local249 = Static288.aClass35_6.method5761();
			@Pc(251) boolean local251 = false;
			if (Static479.aClass8_Sub5_Sub6_1 != null) {
				if (anInt5648 - 10 <= local245 && anInt5648 + Static358.anInt6868 + 10 >= local245 && local249 >= Static528.anInt9126 - 10 && Static331.anInt10704 + Static528.anInt9126 + 10 >= local249) {
					local251 = true;
				} else {
					Static359.method5654();
				}
			}
			if (!local251) {
				if (local245 < Static465.anInt8462 - 10 || local245 > Static306.anInt6216 + Static465.anInt8462 + 10 || Static122.anInt3308 - 10 > local249 || Static122.anInt3308 + Static359.anInt6890 + 10 < local249) {
					Static108.method2413();
				} else if (Static577.aBoolean710) {
					local338 = -1;
					local340 = -1;
					@Pc(354) int local354;
					for (local342 = 0; local342 < Static156.anInt3931; local342++) {
						if (Static238.aBoolean398) {
							local354 = Static122.anInt3308 + local342 * 16 + 33;
							if (local354 - 13 < local249 && local354 + 4 > local249) {
								local338 = local342;
								local340 = local354 - 13;
								break;
							}
						} else {
							local354 = Static122.anInt3308 + local342 * 16 + 31;
							if (local354 - 13 < local249 && local354 + 3 > local249) {
								local340 = local354 - 13;
								local338 = local342;
								break;
							}
						}
					}
					if (local338 != -1) {
						local354 = 0;
						@Pc(417) Class62 local417 = new Class62(Static414.aClass302_11);
						for (@Pc(422) Class8_Sub5_Sub6 local422 = (Class8_Sub5_Sub6) local417.method2109(); local422 != null; local422 = (Class8_Sub5_Sub6) local417.method2112()) {
							if (local338 == local354) {
								if (local422.anInt3391 > 1) {
									Static255.method4544(local340, local422, local249);
								}
								break;
							}
							local354++;
						}
					}
				}
			}
		}
		if (local55 != 0) {
			return;
		}
		local245 = local163.method7202();
		local249 = local163.method7207();
		@Pc(518) int local518;
		@Pc(746) Class8_Sub5_Sub7 local746;
		if (Static479.aClass8_Sub5_Sub6_1 != null && local245 >= anInt5648 && anInt5648 + Static358.anInt6868 >= local245 && local249 >= Static528.anInt9126 && Static331.anInt10704 + Static528.anInt9126 >= local249) {
			local518 = -1;
			for (local338 = 0; local338 < Static479.aClass8_Sub5_Sub6_1.anInt3391; local338++) {
				if (Static238.aBoolean398) {
					local340 = local338 * 16 + Static528.anInt9126 + 33;
					if (local249 > local340 - 13 && local249 < local340 + 4) {
						local518 = local338;
					}
				} else {
					local340 = local338 * 16 + Static528.anInt9126 + 31;
					if (local249 > local340 - 13 && local340 + 3 > local249) {
						local518 = local338;
					}
				}
			}
			if (local518 != -1) {
				local340 = 0;
				@Pc(839) Class62 local839 = new Class62(Static479.aClass8_Sub5_Sub6_1.aClass302_2);
				for (local746 = (Class8_Sub5_Sub7) local839.method2109(); local746 != null; local746 = (Class8_Sub5_Sub7) local839.method2112()) {
					if (local340 == local518) {
						Static575.method7980(local245, local746, local249);
						break;
					}
					local340++;
				}
			}
			Static108.method2413();
			return;
		}
		if (Static465.anInt8462 > local245 || local245 > Static465.anInt8462 + Static306.anInt6216 || Static122.anInt3308 > local249 || Static122.anInt3308 + Static359.anInt6890 < local249) {
			return;
		}
		if (Static577.aBoolean710) {
			local518 = -1;
			local338 = -1;
			for (local340 = 0; local340 < Static156.anInt3931; local340++) {
				if (Static238.aBoolean398) {
					local342 = local340 * 16 + Static122.anInt3308 + 33;
					if (local342 - 13 < local249 && local249 < local342 + 4) {
						local338 = local342 - 13;
						local518 = local340;
						break;
					}
				} else {
					local342 = local340 * 16 + Static122.anInt3308 + 31;
					if (local249 > local342 - 13 && local249 < local342 + 3) {
						local518 = local340;
						local338 = local342 - 13;
						break;
					}
				}
			}
			if (local518 != -1) {
				local342 = 0;
				@Pc(605) Class62 local605 = new Class62(Static414.aClass302_11);
				for (@Pc(610) Class8_Sub5_Sub6 local610 = (Class8_Sub5_Sub6) local605.method2109(); local610 != null; local610 = (Class8_Sub5_Sub6) local605.method2112()) {
					if (local342 == local518) {
						if (local610.anInt3391 != 1) {
							Static255.method4544(local338, local610, local249);
							return;
						}
						Static575.method7980(local245, (Class8_Sub5_Sub7) local610.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66, local249);
						Static108.method2413();
						return;
					}
					local342++;
				}
				return;
			}
		} else {
			local518 = -1;
			for (local338 = 0; local338 < Static548.anInt9471; local338++) {
				if (Static238.aBoolean398) {
					local340 = (Static548.anInt9471 - local338 - 1) * 16 + Static122.anInt3308 + 33;
					if (local340 - 13 < local249 && local249 < local340 + 4) {
						local518 = local338;
					}
				} else {
					local340 = (Static548.anInt9471 - local338 - 1) * 16 + Static122.anInt3308 + 31;
					if (local340 - 13 < local249 && local249 < local340 + 3) {
						local518 = local338;
					}
				}
			}
			if (local518 != -1) {
				local340 = 0;
				@Pc(741) Class307 local741 = new Class307(Static72.aClass43_17);
				for (local746 = (Class8_Sub5_Sub7) local741.method7373(); local746 != null; local746 = (Class8_Sub5_Sub7) local741.method7375()) {
					if (local340 == local518) {
						Static575.method7980(local245, local746, local249);
						break;
					}
					local340++;
				}
			}
			Static108.method2413();
		}
		return;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
	public static void method4612() {
		@Pc(1) Class236 local1 = Static505.aClass236_85;
		synchronized (Static505.aClass236_85) {
			Static505.aClass236_85.method6253();
		}
	}
}
