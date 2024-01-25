import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!so", name = "y", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_19 = new Class183(14, 19);

	@OriginalMember(owner = "client!so", name = "A", descriptor = "Lclient!la;")
	public static final Class136 aClass136_175 = new Class136(55, 0);

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	public static int anInt6398 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIB)I")
	public static int method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!qa;BI)Z")
	public static boolean method5266(@OriginalArg(0) Class167 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static373.anInt6324 - 104) / 2;
		@Pc(17) int local17 = (Static291.anInt5062 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static58.method1107(local25, arg1, local21, local29)) {
						local40 = local29;
						if (Static24.method2475(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static377.method5246(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(82) int[] local82 = new int[262144];
		for (local29 = 0; local29 < local82.length; local29++) {
			local82[local29] = -16777216;
		}
		Static391.aClass2_16 = arg0.method6021(local82, 512, 512, 512);
		Static216.method3203();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(149) int local149 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(168) int local168 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(172) boolean[][] local172 = new boolean[Static442.anInt7415][Static442.anInt7415];
		@Pc(178) int local178;
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(262) int local262;
		@Pc(268) int local268;
		@Pc(273) int local273;
		@Pc(288) int local288;
		for (@Pc(174) int local174 = local11; local174 < local11 + 104; local174 += Static442.anInt7415) {
			for (local178 = local17; local178 < local17 + 104; local178 += Static442.anInt7415) {
				arg0.w(0, 0, Static442.anInt7415 * 4, Static442.anInt7415 * 4);
				arg0.l(-16777216);
				for (local195 = arg1; local195 <= 3; local195++) {
					for (local199 = 0; local199 < Static442.anInt7415; local199++) {
						for (local203 = 0; local203 < Static442.anInt7415; local203++) {
							local172[local199][local203] = Static58.method1107(local203 + local178, arg1, local174 + local199, local195);
						}
					}
					Static182.aClass55Array2[local195].method3813(local174, local178, local174 + Static442.anInt7415, local178 + Static442.anInt7415, local172);
					if (!Static431.aBoolean491) {
						for (local203 = -4; local203 < Static442.anInt7415; local203++) {
							for (local262 = -4; local262 < Static442.anInt7415; local262++) {
								local268 = local174 + local203;
								local273 = local178 + local262;
								if (local268 >= local11 && local17 <= local273 && Static58.method1107(local273, arg1, local268, local195)) {
									local288 = local195;
									if (Static24.method2475(local268, local273)) {
										local288 = local195 - 1;
									}
									if (local288 >= 0) {
										Static419.method5745(arg0, (Static442.anInt7415 - local262) * 4 - 4, local149, local203 * 4, local40, local268, local273, local288);
									}
								}
							}
						}
					}
				}
				if (Static431.aBoolean491) {
					@Pc(340) Class128 local340 = Static250.aClass128Array1[arg1];
					for (local203 = 0; local203 < Static442.anInt7415; local203++) {
						for (local262 = 0; local262 < Static442.anInt7415; local262++) {
							local268 = local203 + local174;
							local273 = local262 + local178;
							local288 = local340.anIntArrayArray27[local268 - local340.anInt3691][local273 - local340.anInt3692];
							if ((local288 & 0x40240000) != 0) {
								arg0.method5951(4, (Static442.anInt7415 - local262) * 4 - 4, -1713569622, local203 * 4, 4);
							} else if ((local288 & 0x800000) != 0) {
								arg0.method6018(4, (Static442.anInt7415 - local262) * 4 - 4, -1713569622, local203 * 4);
							} else if ((local288 & 0x2000000) != 0) {
								arg0.method5960(-1713569622, (Static442.anInt7415 - local262) * 4 - 4, 4, local203 * 4 + 3);
							} else if ((local288 & 0x8000000) != 0) {
								arg0.method6018(4, (Static442.anInt7415 - local262) * 4 + 3 - 4, -1713569622, local203 * 4);
							} else if ((local288 & 0x20000000) != 0) {
								arg0.method5960(-1713569622, (Static442.anInt7415 - local262) * 4 - 4, 4, local203 * 4);
							}
						}
					}
				}
				arg0.M(0, 0, Static442.anInt7415 * 4, Static442.anInt7415 * 4, local168, 2);
				Static391.aClass2_16.D((local174 - local11) * 4 + 48, -(Static442.anInt7415 * 4) + 464 + -((-local17 + local178) * 4), Static442.anInt7415 * 4, Static442.anInt7415 * 4, 0, 0);
			}
		}
		arg0.H();
		arg0.l(-16777215);
		Static174.method2784();
		Static230.anInt3922 = 0;
		Static336.aClass193_55.method4524();
		if (!Static431.aBoolean491) {
			for (local178 = local11; local178 < local11 + 104; local178++) {
				for (local195 = local17; local195 < local17 + 104; local195++) {
					for (local199 = arg1; local199 <= arg1 + 1 && local199 <= 3; local199++) {
						if (Static58.method1107(local195, arg1, local178, local199)) {
							@Pc(611) Interface5 local611 = (Interface5) Static112.method1824(local199, local178, local195);
							if (local611 == null) {
								local611 = (Interface5) Static313.method4388(local199, local178, local195, jt.class);
							}
							if (local611 == null) {
								local611 = (Interface5) Static392.method5427(local199, local178, local195);
							}
							if (local611 == null) {
								local611 = (Interface5) Static222.method4446(local199, local178, local195);
							}
							if (local611 != null) {
								@Pc(652) Class31 local652 = Static9.aClass149_1.method3573(local611.method6263());
								if (!local652.aBoolean47 || Static182.aBoolean253) {
									local268 = local652.anInt796;
									if (local652.anIntArray44 != null) {
										for (local273 = 0; local273 < local652.anIntArray44.length; local273++) {
											if (local652.anIntArray44[local273] != -1) {
												@Pc(682) Class31 local682 = Static9.aClass149_1.method3573(local652.anIntArray44[local273]);
												if (local682.anInt796 >= 0) {
													local268 = local682.anInt796;
												}
											}
										}
									}
									if (local268 >= 0) {
										@Pc(705) boolean local705 = false;
										if (local268 >= 0) {
											@Pc(715) Class152 local715 = Static212.aClass45_3.method1255(local268);
											if (local715 != null && local715.aBoolean314) {
												local705 = true;
											}
										}
										local288 = local178;
										@Pc(726) int local726 = local195;
										if (local705) {
											@Pc(733) int[][] local733 = Static250.aClass128Array1[local199].anIntArrayArray27;
											@Pc(738) int local738 = Static250.aClass128Array1[local199].anInt3691;
											@Pc(743) int local743 = Static250.aClass128Array1[local199].anInt3692;
											for (@Pc(745) int local745 = 0; local745 < 10; local745++) {
												@Pc(752) int local752 = (int) (Math.random() * 4.0D);
												if (local752 == 0 && local288 > local11 && local178 - 3 < local288 && (local733[local288 - local738 - 1][local726 - local743] & 0x2C0108) == 0) {
													local288--;
												}
												if (local752 == 1 && local11 + 104 - 1 > local288 && local288 < local178 + 3 && (local733[local288 + 1 - local738][local726 - local743] & 0x2C0180) == 0) {
													local288++;
												}
												if (local752 == 2 && local17 < local726 && local195 - 3 < local726 && (local733[local288 - local738][local726 - local743 - 1] & 0x2C0102) == 0) {
													local726--;
												}
												if (local752 == 3 && local17 + 104 - 1 > local726 && local195 + 3 > local726 && (local733[local288 - local738][local726 + 1 - local743] & 0x2C0120) == 0) {
													local726++;
												}
											}
										}
										Static182.anIntArray198[Static230.anInt3922] = local652.anInt791;
										Static420.anIntArray454[Static230.anInt3922] = local288;
										Static130.anIntArray119[Static230.anInt3922] = local726;
										Static230.anInt3922++;
									}
								}
							}
						}
					}
				}
			}
			if (Static329.aClass118_3 != null) {
				Static326.aClass250_81.anInt7168 = 1;
				Static212.aClass45_3.method1254(1024, 64);
				for (local195 = 0; local195 < Static329.aClass118_3.anInt3450; local195++) {
					local199 = Static329.aClass118_3.anIntArray216[local195];
					if (Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local199 >> 28) {
						local203 = (local199 >> 14 & 0x3FFF) - Static59.anInt1127;
						local262 = (local199 & 0x3FFF) - Static49.anInt873;
						if (local203 >= 0 && local203 < Static373.anInt6324 && local262 >= 0 && Static291.anInt5062 > local262) {
							Static336.aClass193_55.method4527(new Class3_Sub30(local195));
						} else {
							@Pc(1028) Class152 local1028 = Static212.aClass45_3.method1255(Static329.aClass118_3.anIntArray215[local195]);
							if (local1028.anIntArray285 != null && local203 + local1028.anInt4320 >= 0 && Static373.anInt6324 > local1028.anInt4338 + local203 && local1028.anInt4348 + local262 >= 0 && Static291.anInt5062 > local262 + local1028.anInt4346) {
								Static336.aClass193_55.method4527(new Class3_Sub30(local195));
							}
						}
					}
				}
				Static212.aClass45_3.method1254(128, 64);
				Static326.aClass250_81.anInt7168 = 2;
				Static326.aClass250_81.method5794();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5267(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(3, arg0);
		local8.method1003();
		local8.aString7 = arg1;
	}
}
