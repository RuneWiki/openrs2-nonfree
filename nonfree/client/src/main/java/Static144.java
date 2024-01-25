import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "S")
	public static short aShort36 = 32767;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt2893 = 3;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!tj;Lclient!sj;I)V")
	public static void method2365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) Class181 arg3) {
		@Pc(10) Class74 local10 = arg3.method4918(arg2);
		if (local10 == null) {
			return;
		}
		arg2.method4768(arg1, arg0, arg1 + arg3.anInt5704, arg0 - -arg3.anInt5721);
		if (Static251.anInt4974 == 2 || Static251.anInt4974 == 5 || Static323.aClass57_22 == null) {
			arg2.method4711(local10, arg1, arg0);
			return;
		}
		@Pc(64) int local64;
		@Pc(46) int local46;
		@Pc(61) int local61;
		@Pc(53) int local53;
		if (Static261.anInt5200 == 4) {
			local53 = 4096;
			local61 = (int) -Static57.aFloat3 & 0x3FFF;
			local46 = Static350.anInt6803;
			local64 = Static189.anInt3967;
		} else {
			local46 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905;
			local53 = 4096 - Static12.anInt309 * 16;
			local61 = (int) -Static57.aFloat3 + Static42.anInt892 & 0x3FFF;
			local64 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901;
		}
		@Pc(91) int local91 = local64 / 32 + 48 - (Static162.anInt2152 + -104) * 2;
		@Pc(108) int local108 = Static122.anInt2632 * 4 + 48 + 208 - local46 / 32 - Static122.anInt2632 * 2;
		Static323.aClass57_22.method5450((float) arg3.anInt5704 / 2.0F + (float) arg1, (float) arg3.anInt5721 / 2.0F + (float) arg0, (float) local91, (float) local108, local53, local61 << 2, local10, arg1, arg0);
		@Pc(161) int local161;
		@Pc(170) int local170;
		@Pc(181) int local181;
		@Pc(192) int local192;
		for (@Pc(144) Class3_Sub22 local144 = (Class3_Sub22) Static233.aClass127_25.method3402(); local144 != null; local144 = (Class3_Sub22) Static233.aClass127_25.method3400()) {
			@Pc(149) int local149 = local144.anInt2181;
			local161 = (Static247.aClass146_5.anIntArray357[local149] >> 14 & 0x3FFF) - Static186.anInt3094;
			local170 = (Static247.aClass146_5.anIntArray357[local149] & 0x3FFF) - Static296.anInt5889;
			local181 = local161 * 4 + 2 - local64 / 32;
			local192 = local170 * 4 + 2 - local46 / 32;
			Static261.method4411(local192, local10, Static247.aClass146_5.anIntArray356[local149], arg0, arg2, arg3, local181, arg1);
		}
		for (local161 = 0; local161 < Static77.anInt1525; local161++) {
			local170 = Static348.anIntArray564[local161] * 4 + 2 - local64 / 32;
			local181 = Static40.anIntArray537[local161] * 4 + 2 - local46 / 32;
			@Pc(249) Class170 local249 = Static268.method4553(Static184.anIntArray529[local161]);
			if (local249.anIntArray424 != null) {
				local249 = local249.method4398();
				if (local249 == null || local249.anInt5231 == -1) {
					continue;
				}
			}
			Static261.method4411(local181, local10, local249.anInt5231, arg0, arg2, arg3, local170, arg1);
		}
		for (@Pc(288) Class3_Sub40 local288 = (Class3_Sub40) Static128.aClass24_18.method595(); local288 != null; local288 = (Class3_Sub40) Static128.aClass24_18.method602()) {
			local181 = (int) (local288.aLong211 >> 28 & 0x3L);
			if (local181 == Static208.anInt4202) {
				local192 = (int) (local288.aLong211 & 0x3FFFL) * 4 + 2 - local64 / 32;
				@Pc(332) int local332 = (int) (local288.aLong211 >> 14 & 0x3FFFL) * 4 + 2 - local46 / 32;
				Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[0], local332, local192, local10);
			}
		}
		@Pc(396) int local396;
		@Pc(405) int local405;
		for (local181 = 0; local181 < Static42.anInt897; local181++) {
			@Pc(360) Class5_Sub4_Sub4_Sub2 local360 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local181]];
			if (local360 != null && local360.method4217()) {
				@Pc(369) Class119 local369 = local360.aClass119_1;
				if (local369 != null && local369.anIntArray248 != null) {
					local369 = local369.method2882();
				}
				if (local369 != null && local369.aBoolean201 && local369.aBoolean205) {
					local396 = local360.anInt5901 / 32 - local64 / 32;
					local405 = local360.anInt5905 / 32 - local46 / 32;
					if (local369.anInt3656 == -1) {
						Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[1], local405, local396, local10);
					} else {
						Static261.method4411(local405, local10, local369.anInt3656, arg0, arg2, arg3, local396, arg1);
					}
				}
			}
		}
		@Pc(480) int local480;
		for (local192 = 0; local192 < Static170.anInt6275; local192++) {
			@Pc(450) Class5_Sub4_Sub4_Sub1 local450 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local192]];
			if (local450 != null && local450.method2676()) {
				local396 = local450.anInt5901 / 32 - local64 / 32;
				local405 = local450.anInt5905 / 32 - local46 / 32;
				@Pc(478) boolean local478 = false;
				for (local480 = 0; local480 < Static220.anInt4548; local480++) {
					if (local450.aString126.equals(Static12.aStringArray1[local480]) && Static267.anIntArray430[local480] != 0) {
						local478 = true;
						break;
					}
				}
				@Pc(507) boolean local507 = false;
				for (@Pc(509) int local509 = 0; local509 < Static170.anInt6278; local509++) {
					if (local450.aString126.equals(Static339.aClass116Array3[local509].aString132)) {
						local507 = true;
						break;
					}
				}
				@Pc(533) boolean local533 = false;
				if (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3419 != 0 && local450.anInt3419 != 0 && local450.anInt3419 == Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3419) {
					local533 = true;
				}
				if (local478) {
					Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[3], local405, local396, local10);
				} else if (local507) {
					Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[5], local405, local396, local10);
				} else if (local533) {
					Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[4], local405, local396, local10);
				} else {
					Static47.method811(arg3, arg0, arg1, Static232.aClass57Array15[2], local405, local396, local10);
				}
			}
		}
		@Pc(616) Class125[] local616 = Static108.aClass125Array11;
		@Pc(709) int local709;
		for (local396 = 0; local396 < local616.length; local396++) {
			@Pc(624) Class125 local624 = local616[local396];
			if (local624 != null && local624.anInt3931 != 0 && Static51.anInt1101 % 20 < 10) {
				@Pc(678) int local678;
				if (local624.anInt3931 == 1 && local624.anInt3922 >= 0 && Static244.aClass5_Sub4_Sub4_Sub2Array1.length > local624.anInt3922) {
					@Pc(656) Class5_Sub4_Sub4_Sub2 local656 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local624.anInt3922];
					if (local656 != null) {
						local480 = local656.anInt5901 / 32 - local64 / 32;
						local678 = local656.anInt5905 / 32 - local46 / 32;
						Static116.method2031(local480, local624.anInt3924, 360000, arg3, arg0, arg1, local10, local678);
					}
				}
				if (local624.anInt3931 == 2) {
					local709 = (local624.anInt3929 - Static186.anInt3094) * 4 + 2 - local64 / 32;
					local480 = (local624.anInt3926 - Static296.anInt5889) * 4 + 2 - local46 / 32;
					local678 = local624.anInt3925 * 4;
					local678 *= local678;
					Static116.method2031(local709, local624.anInt3924, local678, arg3, arg0, arg1, local10, local480);
				}
				if (local624.anInt3931 == 10 && local624.anInt3922 >= 0 && Static254.aClass5_Sub4_Sub4_Sub1Array1.length > local624.anInt3922) {
					@Pc(768) Class5_Sub4_Sub4_Sub1 local768 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local624.anInt3922];
					if (local768 != null) {
						local480 = local768.anInt5901 / 32 - local64 / 32;
						local678 = local768.anInt5905 / 32 - local46 / 32;
						Static116.method2031(local480, local624.anInt3924, 360000, arg3, arg0, arg1, local10, local678);
					}
				}
			}
		}
		if (Static261.anInt5200 == 4) {
			return;
		}
		if (Static154.anInt6365 != 0) {
			local405 = Static154.anInt6365 * 4 + Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() * 2 - local64 / 32;
			local709 = Static355.anInt6865 * 4 + (Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() + -1) * 2 + 2 - local46 / 32;
			Static47.method811(arg3, arg0, arg1, Static322.aClass57Array25[Static312.aBoolean427 ? 1 : 0], local709, local405, local10);
		}
		arg2.method4801(3, arg1 + arg3.anInt5704 / 2 - 1, arg3.anInt5721 / 2 + arg0 + -1, 3, -1);
		return;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method2366() {
		Static254.aClass127_26 = new Class127();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!sj;II)V")
	public static void method2367(@OriginalArg(1) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5750 == 1) {
			Static271.method4580(arg0.anInt5761, arg0.aString209, "", -1, 0L, 0, 22);
		}
		if (arg0.anInt5750 == 2 && !Static155.aBoolean96) {
			@Pc(34) String local34 = Static68.method1085(arg0);
			if (local34 != null) {
				Static271.method4580(arg0.anInt5761, local34, "<col=00ff00>" + arg0.aString204, -1, 0L, -1, 50);
			}
		}
		if (arg0.anInt5750 == 3) {
			Static271.method4580(arg0.anInt5761, Static297.aString219, "", -1, 0L, 0, 11);
		}
		if (arg0.anInt5750 == 4) {
			Static271.method4580(arg0.anInt5761, arg0.aString209, "", -1, 0L, 0, 2);
		}
		if (arg0.anInt5750 == 5) {
			Static271.method4580(arg0.anInt5761, arg0.aString209, "", -1, 0L, 0, 26);
		}
		if (arg0.anInt5750 == 6 && Static346.aClass181_57 == null) {
			Static271.method4580(arg0.anInt5761, arg0.aString209, "", -1, 0L, -1, 59);
		}
		@Pc(144) int local144;
		@Pc(157) int local157;
		if (arg0.anInt5715 == 2) {
			@Pc(142) int local142 = 0;
			for (local144 = 0; local144 < arg0.anInt5773; local144++) {
				for (@Pc(148) int local148 = 0; local148 < arg0.anInt5723; local148++) {
					local157 = (arg0.anInt5697 + 32) * local148;
					@Pc(164) int local164 = (arg0.anInt5775 + 32) * local144;
					if (local142 < 20) {
						local164 += arg0.anIntArray467[local142];
						local157 += arg0.anIntArray465[local142];
					}
					if (arg1 >= local157 && arg2 >= local164 && arg1 < local157 + 32 && arg2 < local164 + 32) {
						Static198.aClass181_34 = arg0;
						Static29.anInt732 = local142;
						if (arg0.anIntArray469[local142] > 0) {
							@Pc(216) Class3_Sub15 local216 = Static47.method819(arg0);
							@Pc(225) Class41 local225 = Static230.method5537(arg0.anIntArray469[local142] - 1);
							if (Static235.anInt4719 == 1 && local216.method1148()) {
								if (Static331.anInt6460 != arg0.anInt5761 || local142 != Static67.anInt1361) {
									Static271.method4580(arg0.anInt5761, Static87.aString57, Static200.aString156 + " -> <col=ff9040>" + local225.aString36, Static274.anInt5908, (long) local225.anInt1202, local142, 21);
								}
							} else if (Static155.aBoolean96 && local216.method1148()) {
								@Pc(249) Class3_Sub7_Sub4 local249 = Static58.anInt1273 == -1 ? null : Static11.method177(Static58.anInt1273);
								if ((Static299.anInt5948 & 0x10) != 0 && (local249 == null || local225.method926(Static58.anInt1273, local249.anInt808) != local249.anInt808)) {
									Static271.method4580(arg0.anInt5761, Static303.aString199, Static309.aString229 + " -> <col=ff9040>" + local225.aString36, Static244.anInt4838, (long) local225.anInt1202, local142, 33);
								}
							} else {
								@Pc(295) String[] local295 = local225.aStringArray7;
								@Pc(301) int local301;
								@Pc(318) byte local318;
								@Pc(311) int local311;
								if (local216.method1148()) {
									for (local301 = 4; local301 >= 3; local301--) {
										if (local295 != null && local295[local301] != null) {
											local311 = -1;
											if (local301 == 3) {
												local318 = 15;
											} else {
												local318 = 30;
											}
											if (local225.anInt1194 == local301) {
												local311 = local225.anInt1198;
											}
											if (local225.anInt1222 == local301) {
												local311 = local225.anInt1231;
											}
											Static271.method4580(arg0.anInt5761, local295[local301], "<col=ff9040>" + local225.aString36, local311, (long) local225.anInt1202, local142, local318);
										}
									}
								}
								if (local216.method1143()) {
									Static271.method4580(arg0.anInt5761, Static87.aString57, "<col=ff9040>" + local225.aString36, Static274.anInt5908, (long) local225.anInt1202, local142, 3);
								}
								if (local216.method1148() && local295 != null) {
									for (local301 = 2; local301 >= 0; local301--) {
										if (local295[local301] != null) {
											local318 = 0;
											if (local301 == 0) {
												local318 = 8;
											}
											local311 = -1;
											if (local301 == 1) {
												local318 = 4;
											}
											if (local301 == 2) {
												local318 = 47;
											}
											if (local225.anInt1194 == local301) {
												local311 = local225.anInt1198;
											}
											if (local301 == local225.anInt1222) {
												local311 = local225.anInt1231;
											}
											Static271.method4580(arg0.anInt5761, local295[local301], "<col=ff9040>" + local225.aString36, local311, (long) local225.anInt1202, local142, local318);
										}
									}
								}
								local295 = arg0.aStringArray38;
								if (local295 != null) {
									for (local301 = 4; local301 >= 0; local301--) {
										if (local295[local301] != null) {
											local318 = 0;
											local311 = -1;
											if (local301 == 0) {
												local318 = 1;
											}
											if (local301 == 1) {
												local318 = 41;
											}
											if (local301 == 2) {
												local318 = 60;
											}
											if (local301 == 3) {
												local318 = 5;
											}
											if (local301 == 4) {
												local318 = 13;
											}
											if (local225.anInt1194 == local301) {
												local311 = local225.anInt1198;
											}
											if (local225.anInt1222 == local301) {
												local311 = local225.anInt1231;
											}
											Static271.method4580(arg0.anInt5761, local295[local301], "<col=ff9040>" + local225.aString36, local311, (long) local225.anInt1202, local142, local318);
										}
									}
								}
								Static271.method4580(arg0.anInt5761, Static334.aString243, "<col=ff9040>" + local225.aString36, Static344.anInt6694, (long) local225.anInt1202, local142, 1002);
							}
						}
					}
					local142++;
				}
			}
		}
		if (!arg0.aBoolean381) {
			return;
		}
		if (Static155.aBoolean96) {
			if (Static47.method819(arg0).method1150() && (Static299.anInt5948 & 0x20) != 0) {
				Static271.method4580(arg0.anInt5761, Static303.aString199, Static309.aString229 + " -> " + arg0.aString206, Static244.anInt4838, 0L, arg0.anInt5688, 51);
				return;
			}
			return;
		}
		@Pc(701) String local701;
		for (local144 = 9; local144 >= 5; local144--) {
			local701 = Static271.method4585(local144, arg0);
			if (local701 != null) {
				Static271.method4580(arg0.anInt5761, local701, arg0.aString206, Static210.method3683(local144, arg0), (long) (local144 + 1), arg0.anInt5688, 1008);
			}
		}
		local701 = Static68.method1085(arg0);
		if (local701 != null) {
			Static271.method4580(arg0.anInt5761, local701, arg0.aString206, -1, 0L, arg0.anInt5688, 50);
		}
		for (local157 = 4; local157 >= 0; local157--) {
			@Pc(760) String local760 = Static271.method4585(local157, arg0);
			if (local760 != null) {
				Static271.method4580(arg0.anInt5761, local760, arg0.aString206, Static210.method3683(local157, arg0), (long) (local157 + 1), arg0.anInt5688, 6);
			}
		}
		if (!Static47.method819(arg0).method1149()) {
			return;
		}
		if (arg0.aString210 == null) {
			Static271.method4580(arg0.anInt5761, Static20.aString11, "", -1, 0L, arg0.anInt5688, 59);
		} else {
			Static271.method4580(arg0.anInt5761, arg0.aString210, "", -1, 0L, arg0.anInt5688, 59);
		}
		return;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method2368() {
		@Pc(1) Class198 local1 = Static270.aClass198_50;
		synchronized (Static270.aClass198_50) {
			Static270.aClass198_50.method5230();
		}
	}
}
