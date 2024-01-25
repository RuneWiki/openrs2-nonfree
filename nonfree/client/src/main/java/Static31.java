import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!kh;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static final int anInt824 = 50;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt829 = 0;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!en;ZI)Z")
	public static boolean method760(@OriginalArg(0) Class59 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static266.anInt5101 - 104) / 2;
		@Pc(17) int local17 = (Static339.anInt6352 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static289.method4920(local21, arg1, local29, local25)) {
						local40 = local29;
						if (Static105.method2140(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static154.method2898(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static301.aClass54_21 = arg0.method4834(local84, 512, 512, 512);
		Static94.method1992();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) + 238 - 10 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(176) boolean[][] local176 = new boolean[Static289.anInt5546][Static289.anInt5546];
		@Pc(182) int local182;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(260) int local260;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(293) int local293;
		for (@Pc(178) int local178 = local11; local178 < local11 + 104; local178 += Static289.anInt5546) {
			for (local182 = local17; local182 < local17 + 104; local182 += Static289.anInt5546) {
				arg0.method4795(0, 0, Static289.anInt5546 * 4, Static289.anInt5546 * 4);
				arg0.method4823(-16777216);
				for (local199 = arg1; local199 <= 3; local199++) {
					for (local203 = 0; local203 < Static289.anInt5546; local203++) {
						for (local207 = 0; local207 < Static289.anInt5546; local207++) {
							local176[local203][local207] = Static289.method4920(local178 + local203, arg1, local199, local207 + local182);
						}
					}
					Static262.aClass3Array3[local199].method5634(local178, local182, Static289.anInt5546 + local178, Static289.anInt5546 + local182, local176);
					if (!Static70.aBoolean119) {
						for (local207 = -4; local207 < Static289.anInt5546; local207++) {
							for (local260 = -4; local260 < Static289.anInt5546; local260++) {
								local266 = local207 + local178;
								local270 = local182 + local260;
								if (local11 <= local266 && local270 >= local17 && Static289.method4920(local266, arg1, local199, local270)) {
									local293 = local199;
									if (Static105.method2140(local270, local266)) {
										local293 = local199 - 1;
									}
									if (local293 >= 0) {
										Static176.method1786((Static289.anInt5546 - local260) * 4 - 4, local153, local266, local270, local40, local293, local207 * 4, arg0);
									}
								}
							}
						}
					}
				}
				if (Static70.aBoolean119) {
					@Pc(347) Class49 local347 = Static117.aClass49Array1[arg1];
					for (local207 = 0; local207 < Static289.anInt5546; local207++) {
						for (local260 = 0; local260 < Static289.anInt5546; local260++) {
							local266 = local178 + local207;
							local270 = local260 + local182;
							local293 = local347.anIntArrayArray7[local266 - local347.anInt1413][local270 - local347.anInt1400];
							if ((local293 & 0x40240000) != 0) {
								arg0.method4835((Static289.anInt5546 - local260) * 4 - 4, local207 * 4, 4, 4, -1713569622);
							} else if ((local293 & 0x800000) != 0) {
								arg0.method4797(-1713569622, (Static289.anInt5546 - local260) * 4 - 4, 4, local207 * 4);
							} else if ((local293 & 0x2000000) != 0) {
								arg0.method4821(local207 * 4 + 3, -1713569622, 4, (Static289.anInt5546 - local260) * 4 - 4);
							} else if ((local293 & 0x8000000) != 0) {
								arg0.method4797(-1713569622, (Static289.anInt5546 - local260) * 4 - 1, 4, local207 * 4);
							} else if ((local293 & 0x20000000) != 0) {
								arg0.method4821(local207 * 4, -1713569622, 4, (Static289.anInt5546 - local260) * 4 - 4);
							}
						}
					}
				}
				arg0.method4877(0, 0, Static289.anInt5546 * 4, Static289.anInt5546 * 4, local172, 2);
				Static301.aClass54_21.method5562((local178 - local11) * 4 + 48, -(Static289.anInt5546 * 4) + -((-local17 + local182) * 4) + 464, Static289.anInt5546 * 4, Static289.anInt5546 * 4);
			}
		}
		arg0.method4810();
		arg0.method4823(-16777215);
		Static241.method4110();
		Static328.anInt6215 = 0;
		Static354.aClass211_42.method5600();
		if (!Static70.aBoolean119) {
			for (local182 = local11; local182 < local11 + 104; local182++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local203 = arg1; local203 <= arg1 + 1 && local203 <= 3; local203++) {
						if (Static289.method4920(local182, arg1, local203, local199)) {
							@Pc(615) Interface8 local615 = (Interface8) Static251.method4403(local203, local182, local199);
							if (local615 == null) {
								local615 = (Interface8) Static82.method1816(local203, local182, local199, sl.class);
							}
							if (local615 == null) {
								local615 = (Interface8) Static178.method3304(local203, local182, local199);
							}
							if (local615 == null) {
								local615 = (Interface8) Static258.method4479(local203, local182, local199);
							}
							if (local615 != null) {
								@Pc(655) Class137 local655 = Static228.method3923(local615.method5549());
								if (!local655.aBoolean304 || Static32.aBoolean63) {
									local266 = local655.anInt4147;
									if (local655.anIntArray296 != null) {
										for (local270 = 0; local270 < local655.anIntArray296.length; local270++) {
											if (local655.anIntArray296[local270] != -1) {
												@Pc(684) Class137 local684 = Static228.method3923(local655.anIntArray296[local270]);
												if (local684.anInt4147 >= 0) {
													local266 = local684.anInt4147;
												}
											}
										}
									}
									if (local266 >= 0) {
										@Pc(703) boolean local703 = false;
										if (local266 >= 0) {
											@Pc(712) Class121 local712 = Static299.method5085(local266);
											if (local712 != null && local712.aBoolean257) {
												local703 = true;
											}
										}
										local293 = local182;
										@Pc(723) int local723 = local199;
										if (local703) {
											@Pc(730) int[][] local730 = Static117.aClass49Array1[local203].anIntArrayArray7;
											@Pc(735) int local735 = Static117.aClass49Array1[local203].anInt1413;
											@Pc(740) int local740 = Static117.aClass49Array1[local203].anInt1400;
											for (@Pc(742) int local742 = 0; local742 < 10; local742++) {
												@Pc(749) int local749 = (int) (Math.random() * 4.0D);
												if (local749 == 0 && local11 < local293 && local182 - 3 < local293 && (local730[local293 - local735 - 1][local723 - local740] & 0x2C0108) == 0) {
													local293--;
												}
												if (local749 == 1 && local11 + 104 - 1 > local293 && local293 < local182 + 3 && (local730[local293 + 1 - local735][local723 - local740] & 0x2C0180) == 0) {
													local293++;
												}
												if (local749 == 2 && local723 > local17 && local723 > local199 - 3 && (local730[local293 - local735][local723 - local740 - 1] & 0x2C0102) == 0) {
													local723--;
												}
												if (local749 == 3 && local723 < local17 + 104 - 1 && local723 < local199 + 3 && (local730[local293 - local735][local723 + 1 - local740] & 0x2C0120) == 0) {
													local723++;
												}
											}
										}
										Static216.anIntArray306[Static328.anInt6215] = local655.anInt4114;
										Static302.anIntArray448[Static328.anInt6215] = local293;
										Static227.anIntArray319[Static328.anInt6215] = local723;
										Static328.anInt6215++;
									}
								}
							}
						}
					}
				}
			}
			if (Static334.aClass194_3 != null) {
				Static65.aClass170_36.anInt5179 = 1;
				Static270.method4560(1024, 64);
				for (local199 = 0; local199 < Static334.aClass194_3.anInt5914; local199++) {
					local203 = Static334.aClass194_3.anIntArray499[local199];
					if (local203 >> 28 == Static156.anInt3123) {
						local207 = (local203 >> 14 & 0x3FFF) - Static263.anInt5063;
						local260 = (local203 & 0x3FFF) - Static28.anInt773;
						if (local207 >= 0 && local207 < Static266.anInt5101 && local260 >= 0 && local260 < Static339.anInt6352) {
							Static354.aClass211_42.method5609(new Class5_Sub37(local199));
						} else {
							@Pc(1018) Class121 local1018 = Static299.method5085(Static334.aClass194_3.anIntArray500[local199]);
							if (local1018.anIntArray269 != null && local207 + local1018.anInt3584 >= 0 && Static266.anInt5101 > local207 + local1018.anInt3585 && local1018.anInt3586 + local260 >= 0 && Static339.anInt6352 > local260 + local1018.anInt3579) {
								Static354.aClass211_42.method5609(new Class5_Sub37(local199));
							}
						}
					}
				}
				Static270.method4560(128, 64);
				Static65.aClass170_36.anInt5179 = 2;
				Static65.aClass170_36.method4561();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method762() {
		@Pc(5) Class66 local5 = Static289.aClass66_97;
		synchronized (Static289.aClass66_97) {
			Static289.aClass66_97.method1942();
		}
		local5 = Static244.aClass66_84;
		synchronized (Static244.aClass66_84) {
			Static244.aClass66_84.method1942();
		}
		local5 = Static37.aClass66_9;
		synchronized (Static37.aClass66_9) {
			Static37.aClass66_9.method1942();
		}
		local5 = Static203.aClass66_69;
		synchronized (Static203.aClass66_69) {
			Static203.aClass66_69.method1942();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method765(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local39++;
		}
		@Pc(55) char[] local55 = new char[local39];
		local55[0] = '+';
		for (@Pc(63) int local63 = local39 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 >= 10) {
				local55[local63] = (char) (local78 + 87);
			} else {
				local55[local63] = (char) (local78 + 48);
			}
		}
		return new String(local55);
	}
}
