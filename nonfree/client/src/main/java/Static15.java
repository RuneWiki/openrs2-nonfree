import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!jd;")
	public static Class36 aClass36_74;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static int anInt2852 = 0;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!ie;")
	public static Class34 aClass34_55 = new Class34();

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1291 = Static2.method66("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1292 = Static2.method66("Please try again)3");

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1293 = aClass39_1292;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1294 = Static2.method66("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1295 = Static2.method66("blinken3:");

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt2857 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method2038() {
		if (Static45.aClass55_1 != null) {
			@Pc(8) Class55 local8 = Static45.aClass55_1;
			synchronized (Static45.aClass55_1) {
				Static45.aClass55_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public static boolean method2039(@OriginalArg(0) int arg0) {
		if (!Static23.method442(arg0)) {
			return false;
		}
		@Pc(15) Class2_Sub1_Sub6[] local15 = Static76.aClass2_Sub1_Sub6ArrayArray1[arg0];
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(33) Class2_Sub1_Sub6 local33 = local15[local19];
			if (local33 != null && local33.anInt700 == 6) {
				@Pc(58) int local58;
				if (local33.anInt731 != -1 || local33.anInt709 != -1) {
					@Pc(53) boolean local53 = Static81.method1570(local33);
					if (local53) {
						local58 = local33.anInt709;
					} else {
						local58 = local33.anInt731;
					}
					if (local58 != -1) {
						@Pc(70) Class2_Sub1_Sub1 local70 = Static69.method1439(local58);
						local33.anInt702 += Static17.anInt489;
						label50: while (true) {
							do {
								do {
									if (local70.anIntArray8[local33.anInt689] >= local33.anInt702) {
										break label50;
									}
									local17 = true;
									local33.anInt702 -= local70.anIntArray8[local33.anInt689];
									local33.anInt689++;
								} while (local70.anIntArray7.length > local33.anInt689);
								local33.anInt689 -= local70.anInt67;
							} while (local33.anInt689 >= 0 && local33.anInt689 < local70.anIntArray7.length);
							local33.anInt689 = 0;
						}
					}
				}
				if (local33.anInt737 != 0) {
					local58 = local33.anInt737 << 16 >> 16;
					@Pc(152) int local152 = local33.anInt737 >> 16;
					local17 = true;
					local58 *= Static17.anInt489;
					local33.anInt724 = local33.anInt724 + local58 & 0x7FF;
					@Pc(171) int local171 = local152 * Static17.anInt489;
					local33.anInt693 = local33.anInt693 + local171 & 0x7FF;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZILclient!jd;)Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 method2040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2) {
		return Static84.method2047(arg1, arg2, arg0) ? Static25.method510() : null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method2041() {
		Static95.anInt2513 = -1;
		Static50.aClass2_Sub5_Sub1_2.anInt1772 = 0;
		Static12.anInt322 = 0;
		Static8.anInt185 = -1;
		Static104.anInt2782 = 0;
		Static22.aBoolean36 = false;
		Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
		Static2.anInt90 = -1;
		Static45.anInt1235 = 0;
		Static102.anInt2774 = -1;
		Static101.anInt2753 = 0;
		Static48.anInt1342 = 0;
		Static12.anInt325 = 0;
		Static60.method1127(30);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZII)V")
	public static void method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static77.aClass43_1.method1195(arg0, arg1, arg2);
		@Pc(21) int local21;
		@Pc(37) int local37;
		@Pc(25) int local25;
		@Pc(39) int local39;
		@Pc(61) int local61;
		@Pc(31) int local31;
		if (local9 != 0) {
			local21 = Static77.aClass43_1.method1189(arg0, arg1, arg2, local9);
			local25 = local21 & 0x1F;
			local31 = local9 >> 14 & 0x7FFF;
			local37 = local21 >> 6 & 0x3;
			local39 = arg4;
			@Pc(42) int[] local42 = Static42.aClass2_Sub1_Sub4_Sub2_4.anIntArray209;
			if (local9 > 0) {
				local39 = arg3;
			}
			local61 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
			@Pc(65) Class2_Sub1_Sub5 local65 = Static48.method916(local31);
			if (local65.anInt534 == -1) {
				if (local25 == 0 || local25 == 2) {
					if (local37 == 0) {
						local42[local61] = local39;
						local42[local61 + 512] = local39;
						local42[local61 + 1024] = local39;
						local42[local61 + 1536] = local39;
					} else if (local37 == 1) {
						local42[local61] = local39;
						local42[local61 + 1] = local39;
						local42[local61 + 2] = local39;
						local42[local61 + 3] = local39;
					} else if (local37 == 2) {
						local42[local61 + 3] = local39;
						local42[local61 + 512 + 3] = local39;
						local42[local61 + 3 + 1024] = local39;
						local42[local61 + 1536 + 3] = local39;
					} else if (local37 == 3) {
						local42[local61 + 1536] = local39;
						local42[local61 + 1536 + 1] = local39;
						local42[local61 + 1536 + 2] = local39;
						local42[local61 + 1539] = local39;
					}
				}
				if (local25 == 3) {
					if (local37 == 0) {
						local42[local61] = local39;
					} else if (local37 == 1) {
						local42[local61 + 3] = local39;
					} else if (local37 == 2) {
						local42[local61 + 1536 + 3] = local39;
					} else if (local37 == 3) {
						local42[local61 + 1536] = local39;
					}
				}
				if (local25 == 2) {
					if (local37 == 3) {
						local42[local61] = local39;
						local42[local61 + 512] = local39;
						local42[local61 + 1024] = local39;
						local42[local61 + 1536] = local39;
					} else if (local37 == 0) {
						local42[local61] = local39;
						local42[local61 + 1] = local39;
						local42[local61 + 2] = local39;
						local42[local61 + 3] = local39;
					} else if (local37 == 1) {
						local42[local61 + 3] = local39;
						local42[local61 + 3 + 512] = local39;
						local42[local61 + 1027] = local39;
						local42[local61 + 1536 + 3] = local39;
					} else if (local37 == 2) {
						local42[local61 + 1536] = local39;
						local42[local61 + 1536 + 1] = local39;
						local42[local61 + 1536 + 2] = local39;
						local42[local61 + 1536 + 3] = local39;
					}
				}
			} else {
				@Pc(374) Class2_Sub1_Sub4_Sub3 local374 = Static83.aClass2_Sub1_Sub4_Sub3Array4[local65.anInt534];
				if (local374 != null) {
					@Pc(387) int local387 = (local65.anInt528 * 4 - local374.anInt2733) / 2;
					@Pc(398) int local398 = (local65.anInt537 * 4 - local374.anInt2729) / 2;
					local374.method1946(local387 + arg1 * 4 + 48, local398 + (48 - -((-arg2 + 104 + -local65.anInt537) * 4)));
				}
			}
		}
		local9 = Static77.aClass43_1.method1200(arg0, arg1, arg2);
		if (local9 != 0) {
			local21 = Static77.aClass43_1.method1189(arg0, arg1, arg2, local9);
			local25 = local21 & 0x1F;
			local37 = local21 >> 6 & 0x3;
			local39 = local9 >> 14 & 0x7FFF;
			@Pc(457) Class2_Sub1_Sub5 local457 = Static48.method916(local39);
			@Pc(478) int local478;
			if (local457.anInt534 != -1) {
				@Pc(466) Class2_Sub1_Sub4_Sub3 local466 = Static83.aClass2_Sub1_Sub4_Sub3Array4[local457.anInt534];
				if (local466 != null) {
					local478 = (local457.anInt537 * 4 - local466.anInt2729) / 2;
					local31 = (local457.anInt528 * 4 - local466.anInt2733) / 2;
					local466.method1946(local31 + arg1 * 4 + 48, (-arg2 + (104 - local457.anInt537)) * 4 + 48 + local478);
				}
			} else if (local25 == 9) {
				@Pc(518) int[] local518 = Static42.aClass2_Sub1_Sub4_Sub2_4.anIntArray209;
				local61 = 15658734;
				if (local9 > 0) {
					local61 = 15597568;
				}
				local478 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
				if (local37 == 0 || local37 == 2) {
					local518[local478 + 1536] = local61;
					local518[local478 + 1 + 1024] = local61;
					local518[local478 + 514] = local61;
					local518[local478 + 3] = local61;
				} else {
					local518[local478] = local61;
					local518[local478 + 512 + 1] = local61;
					local518[local478 + 1024 + 2] = local61;
					local518[local478 + 3 + 1536] = local61;
				}
			}
		}
		local9 = Static77.aClass43_1.method1166(arg0, arg1, arg2);
		if (local9 == 0) {
			return;
		}
		local21 = local9 >> 14 & 0x7FFF;
		@Pc(628) Class2_Sub1_Sub5 local628 = Static48.method916(local21);
		if (local628.anInt534 == -1) {
			return;
		}
		@Pc(638) Class2_Sub1_Sub4_Sub3 local638 = Static83.aClass2_Sub1_Sub4_Sub3Array4[local628.anInt534];
		if (local638 != null) {
			local39 = (local628.anInt528 * 4 - local638.anInt2733) / 2;
			@Pc(662) int local662 = (local628.anInt537 * 4 - local638.anInt2729) / 2;
			local638.method1946(local39 + arg1 * 4 + 48, local662 + 48 + (-local628.anInt537 + (104 - arg2)) * 4);
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method2043() {
		aClass39_1295 = null;
		aClass39_1292 = null;
		aClass39_1293 = null;
		aClass39_1291 = null;
		aClass34_55 = null;
		aClass36_74 = null;
		aClass39_1294 = null;
		Class2.anIntArray361 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method2044(@OriginalArg(1) Class36 arg0) {
		Static54.aClass36_36 = arg0;
	}
}
