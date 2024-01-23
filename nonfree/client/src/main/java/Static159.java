import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "Lclient!jg;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
	public static int anInt3706 = 0;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "Ljava/lang/String;")
	public static String aString108 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
	public static void method2995(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 12);
		local8.method1189();
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
	public static void method2996() {
		Static110.aClass1_Sub2_Sub21_4 = null;
		Static16.aClass1_Sub2_Sub21_1 = null;
		Static236.aClass1_Sub2_Sub21_7 = null;
		Static66.aClass1_Sub2_Sub21_5 = null;
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V")
	public static void method2997() {
		@Pc(7) int local7 = Static204.anInt4548;
		@Pc(9) int local9 = Static82.anInt1976;
		@Pc(11) int local11 = Static35.anInt922;
		@Pc(15) int local15 = Static66.anInt3695 - 3;
		if (Static270.aClass1_Sub2_Sub14_10 == null || Static217.aClass1_Sub2_Sub14_6 == null) {
			if (Static33.aClass83_20.method2302(Static253.anInt5524) && Static33.aClass83_20.method2302(Static26.anInt738)) {
				Static270.aClass1_Sub2_Sub14_10 = Static57.method1137(Static253.anInt5524, Static33.aClass83_20);
				Static217.aClass1_Sub2_Sub14_6 = Static57.method1137(Static26.anInt738, Static33.aClass83_20);
				if (Static296.aBoolean335) {
					if (Static270.aClass1_Sub2_Sub14_10 instanceof Class1_Sub2_Sub14_Sub1_Sub1) {
						Static270.aClass1_Sub2_Sub14_10 = new Class1_Sub2_Sub14_Sub2_Sub1((Class1_Sub2_Sub14_Sub1) Static270.aClass1_Sub2_Sub14_10);
					} else {
						Static270.aClass1_Sub2_Sub14_10 = new Class1_Sub2_Sub14_Sub2((Class1_Sub2_Sub14_Sub1) Static270.aClass1_Sub2_Sub14_10);
					}
					if (Static217.aClass1_Sub2_Sub14_6 instanceof Class1_Sub2_Sub14_Sub1_Sub1) {
						Static217.aClass1_Sub2_Sub14_6 = new Class1_Sub2_Sub14_Sub2_Sub1((Class1_Sub2_Sub14_Sub1) Static217.aClass1_Sub2_Sub14_6);
					} else {
						Static217.aClass1_Sub2_Sub14_6 = new Class1_Sub2_Sub14_Sub2((Class1_Sub2_Sub14_Sub1) Static217.aClass1_Sub2_Sub14_6);
					}
				}
			} else if (Static296.aBoolean335) {
				Static288.method4716(local7, local11, local9, 20, Static37.anInt1133, 256 - Static241.anInt5293);
			} else {
				Static203.method3603(local7, local11, local9, 20, Static37.anInt1133, 256 - Static241.anInt5293);
			}
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		if (Static270.aClass1_Sub2_Sub14_10 != null && Static217.aClass1_Sub2_Sub14_6 != null) {
			local127 = (local9 - Static217.aClass1_Sub2_Sub14_6.anInt3438 * 2) / Static270.aClass1_Sub2_Sub14_10.anInt3438;
			for (local129 = 0; local129 < local127; local129++) {
				Static270.aClass1_Sub2_Sub14_10.method2727(Static270.aClass1_Sub2_Sub14_10.anInt3438 * local129 + local7 + Static217.aClass1_Sub2_Sub14_6.anInt3438, local11);
			}
			Static217.aClass1_Sub2_Sub14_6.method2727(local7, local11);
			Static217.aClass1_Sub2_Sub14_6.method2720(local9 + local7 - Static217.aClass1_Sub2_Sub14_6.anInt3438, local11);
		}
		Static156.aClass1_Sub2_Sub16_3.method3981(Static141.aString94, local7 + 3, local11 + 14, Static208.anInt4630, -1);
		if (Static296.aBoolean335) {
			Static288.method4716(local7, local11 + 20, local9, local15 - 20, Static37.anInt1133, 256 - Static241.anInt5293);
		} else {
			Static203.method3603(local7, local11 + 20, local9, local15 - 20, Static37.anInt1133, 256 - Static241.anInt5293);
		}
		local127 = Static84.anInt1989;
		local129 = Static212.anInt4711;
		@Pc(209) int local209;
		@Pc(228) int local228;
		for (local209 = 0; local209 < Static111.anInt2398; local209++) {
			local228 = local11 + (-local209 + -1 + Static111.anInt2398) * 15 + 33;
			if (local127 > local7 && local127 < local9 + local7 && local129 > local228 - 13 && local228 + 3 > local129) {
				if (Static296.aBoolean335) {
					Static288.method4716(local7, local228 - 12, local9, 15, Static133.anInt3014, 256 - Static24.anInt489);
				} else {
					Static203.method3603(local7, local228 - 12, local9, 15, Static133.anInt3014, 256 - Static24.anInt489);
				}
			}
		}
		if ((Static156.aClass1_Sub2_Sub14_3 == null || Static188.aClass1_Sub2_Sub14_4 == null || Static38.aClass1_Sub2_Sub14_1 == null) && Static33.aClass83_20.method2302(Static245.anInt5368) && Static33.aClass83_20.method2302(Static9.anInt273) && Static33.aClass83_20.method2302(Static79.anInt1894)) {
			Static156.aClass1_Sub2_Sub14_3 = Static57.method1137(Static245.anInt5368, Static33.aClass83_20);
			Static188.aClass1_Sub2_Sub14_4 = Static57.method1137(Static9.anInt273, Static33.aClass83_20);
			Static38.aClass1_Sub2_Sub14_1 = Static57.method1137(Static79.anInt1894, Static33.aClass83_20);
			if (Static296.aBoolean335) {
				if (Static156.aClass1_Sub2_Sub14_3 instanceof Class1_Sub2_Sub14_Sub1_Sub1) {
					Static156.aClass1_Sub2_Sub14_3 = new Class1_Sub2_Sub14_Sub2_Sub1((Class1_Sub2_Sub14_Sub1) Static156.aClass1_Sub2_Sub14_3);
				} else {
					Static156.aClass1_Sub2_Sub14_3 = new Class1_Sub2_Sub14_Sub2((Class1_Sub2_Sub14_Sub1) Static156.aClass1_Sub2_Sub14_3);
				}
				if (Static188.aClass1_Sub2_Sub14_4 instanceof Class1_Sub2_Sub14_Sub1_Sub1) {
					Static188.aClass1_Sub2_Sub14_4 = new Class1_Sub2_Sub14_Sub2_Sub1((Class1_Sub2_Sub14_Sub1) Static188.aClass1_Sub2_Sub14_4);
				} else {
					Static188.aClass1_Sub2_Sub14_4 = new Class1_Sub2_Sub14_Sub2((Class1_Sub2_Sub14_Sub1) Static188.aClass1_Sub2_Sub14_4);
				}
				if (Static38.aClass1_Sub2_Sub14_1 instanceof Class1_Sub2_Sub14_Sub1_Sub1) {
					Static38.aClass1_Sub2_Sub14_1 = new Class1_Sub2_Sub14_Sub2_Sub1((Class1_Sub2_Sub14_Sub1) Static38.aClass1_Sub2_Sub14_1);
				} else {
					Static38.aClass1_Sub2_Sub14_1 = new Class1_Sub2_Sub14_Sub2((Class1_Sub2_Sub14_Sub1) Static38.aClass1_Sub2_Sub14_1);
				}
			}
		}
		@Pc(444) int local444;
		if (Static156.aClass1_Sub2_Sub14_3 != null && Static188.aClass1_Sub2_Sub14_4 != null && Static38.aClass1_Sub2_Sub14_1 != null) {
			local209 = (local9 - Static38.aClass1_Sub2_Sub14_1.anInt3438 * 2) / Static156.aClass1_Sub2_Sub14_3.anInt3438;
			for (local228 = 0; local228 < local209; local228++) {
				Static156.aClass1_Sub2_Sub14_3.method2727(local7 + Static38.aClass1_Sub2_Sub14_1.anInt3438 + local228 * Static156.aClass1_Sub2_Sub14_3.anInt3438, local15 + local11 + -Static156.aClass1_Sub2_Sub14_3.anInt3430);
			}
			local228 = (local15 - Static38.aClass1_Sub2_Sub14_1.anInt3430 - 20) / Static188.aClass1_Sub2_Sub14_4.anInt3430;
			for (local444 = 0; local444 < local228; local444++) {
				Static188.aClass1_Sub2_Sub14_4.method2727(local7, local11 + Static188.aClass1_Sub2_Sub14_4.anInt3430 * local444 + 20);
				Static188.aClass1_Sub2_Sub14_4.method2720(local9 + local7 - Static188.aClass1_Sub2_Sub14_4.anInt3438, local11 + 20 + Static188.aClass1_Sub2_Sub14_4.anInt3430 * local444);
			}
			Static38.aClass1_Sub2_Sub14_1.method2727(local7, local15 + local11 - Static38.aClass1_Sub2_Sub14_1.anInt3430);
			Static38.aClass1_Sub2_Sub14_1.method2720(local9 + local7 - Static38.aClass1_Sub2_Sub14_1.anInt3438, -Static38.aClass1_Sub2_Sub14_1.anInt3430 + local15 + local11);
		}
		for (local209 = 0; local209 < Static111.anInt2398; local209++) {
			local228 = (Static111.anInt2398 - local209 - 1) * 15 + local11 + 33;
			local444 = Static208.anInt4630;
			if (local7 < local127 && local127 < local7 + local9 && local228 - 13 < local129 && local228 + 3 > local129) {
				local444 = Static267.anInt3431;
			}
			Static156.aClass1_Sub2_Sub16_3.method3981(Static254.method4242(local209), local7 + 3, local228, local444, 0);
		}
		Static180.method3276(Static204.anInt4548, Static35.anInt922, Static66.anInt3695, Static82.anInt1976);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
	public static void method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static11.anInt2931 == 0 || arg1 == 0 || Static111.anInt2392 >= 50 || arg0 == -1) {
			return;
		}
		Static128.anIntArray263[Static111.anInt2392] = arg0;
		Static13.anIntArray22[Static111.anInt2392] = arg1;
		Static116.anIntArray248[Static111.anInt2392] = arg3;
		Static49.aClass118Array1[Static111.anInt2392] = null;
		Static222.anIntArray513[Static111.anInt2392] = 0;
		Static40.anIntArray202[Static111.anInt2392] = arg2;
		Static111.anInt2392++;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	public static void method3000(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static266.anInt5789;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(16) int local16;
		@Pc(23) Class25_Sub1_Sub1 local23;
		@Pc(70) int local70;
		@Pc(170) int local170;
		@Pc(190) int local190;
		@Pc(206) int local206;
		@Pc(215) int local215;
		@Pc(100) int local100;
		for (local16 = 0; local16 < local7; local16++) {
			if (arg0 == 0) {
				local23 = Static239.aClass25_Sub1_Sub1_2;
			} else {
				local23 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local16]];
			}
			if (local23 != null && local23.method1244()) {
				@Pc(41) int local41 = local23.method1243();
				if (arg0 == 0 || local41 == arg0) {
					@Pc(75) int local75;
					if (local41 == 1) {
						if ((local23.anInt1635 & 0x7F) == 64 && (local23.anInt1604 & 0x7F) == 64) {
							local70 = local23.anInt1604 >> 7;
							local75 = local23.anInt1635 >> 7;
							if (local75 >= 0 && local75 < 104 && local70 >= 0 && local70 < 104) {
								local100 = Static150.anIntArrayArray12[local75][local70]++;
							}
						}
					} else if (((local41 & 0x1) != 0 || (local23.anInt1635 & 0x7F) == 0 && (local23.anInt1604 & 0x7F) == 0) && ((local41 & 0x1) != 1 || (local23.anInt1635 & 0x7F) == 64 && (local23.anInt1604 & 0x7F) == 64)) {
						local75 = local23.anInt1635 - local41 * 64 >> 7;
						local70 = local23.anInt1604 - local41 * 64 >> 7;
						local170 = local23.method1243() + local75;
						if (local75 < 0) {
							local75 = 0;
						}
						if (local170 > 104) {
							local170 = 104;
						}
						local190 = local70 + local23.method1243();
						if (local70 < 0) {
							local70 = 0;
						}
						if (local190 > 104) {
							local190 = 104;
						}
						for (local206 = local75; local206 < local170; local206++) {
							for (local215 = local70; local215 < local190; local215++) {
								local100 = Static150.anIntArrayArray12[local206][local215]++;
							}
						}
					}
				}
			}
		}
		label223: for (local16 = 0; local16 < local7; local16++) {
			@Pc(261) long local261;
			if (arg0 == 0) {
				local23 = Static239.aClass25_Sub1_Sub1_2;
				local261 = 8791798054912L;
			} else {
				local23 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local16]];
				local261 = (long) Static39.anIntArray108[local16] << 32;
			}
			if (local23 != null && local23.method1244()) {
				local70 = local23.method1243();
				if (arg0 == 0 || local70 == arg0) {
					local23.aBoolean40 = false;
					local23.aBoolean89 = true;
					if ((Static64.aBoolean92 && Static266.anInt5789 > 200 || Static266.anInt5789 > 50) && arg0 != 0 && local23.anInt1646 == local23.method1232().anInt4578) {
						local23.aBoolean40 = true;
					}
					if (local70 == 1) {
						if ((local23.anInt1635 & 0x7F) == 64 && (local23.anInt1604 & 0x7F) == 64) {
							local190 = local23.anInt1604 >> 7;
							local170 = local23.anInt1635 >> 7;
							if (local170 < 0 || local170 >= 104 || local190 < 0 || local190 >= 104) {
								continue;
							}
							if (Static150.anIntArrayArray12[local170][local190] > 1) {
								local100 = Static150.anIntArrayArray12[local170][local190]--;
								continue;
							}
						}
					} else if ((local70 & 0x1) == 0 && (local23.anInt1635 & 0x7F) == 0 && (local23.anInt1604 & 0x7F) == 0 || (local70 & 0x1) == 1 && (local23.anInt1635 & 0x7F) == 64 && (local23.anInt1604 & 0x7F) == 0) {
						local190 = local23.anInt1604 - local70 * 64 >> 7;
						@Pc(439) boolean local439 = true;
						local215 = local70 + local190;
						if (local215 > 104) {
							local215 = 104;
						}
						local170 = local23.anInt1635 - local70 * 64 >> 7;
						if (local190 < 0) {
							local190 = 0;
						}
						local206 = local70 + local170;
						if (local170 < 0) {
							local170 = 0;
						}
						if (local206 > 104) {
							local206 = 104;
						}
						@Pc(483) int local483;
						@Pc(492) int local492;
						for (local483 = local170; local483 < local206; local483++) {
							for (local492 = local190; local492 < local215; local492++) {
								if (Static150.anIntArrayArray12[local483][local492] <= 1) {
									local439 = false;
									break;
								}
							}
						}
						if (local439) {
							local483 = local170;
							while (true) {
								if (local483 >= local206) {
									continue label223;
								}
								for (local492 = local190; local492 < local215; local492++) {
									local100 = Static150.anIntArrayArray12[local483][local492]--;
								}
								local483++;
							}
						}
					}
					if (local23.anObject5 == null || local23.anInt1637 > Static32.anInt809 || local23.anInt1651 <= Static32.anInt809) {
						local23.aBoolean89 = false;
						local23.anInt1603 = Static220.method3905(local23.anInt1635, local23.anInt1604, Static145.anInt3477);
						Static227.method3944(Static145.anInt3477, local23.anInt1635, local23.anInt1604, local23.anInt1603, (local70 - 1) * 64 + 60, local23, local23.anInt1681, local261, local23.aBoolean86);
					} else {
						local23.aBoolean89 = false;
						local23.aBoolean40 = false;
						local23.anInt1603 = Static220.method3905(local23.anInt1635, local23.anInt1604, Static145.anInt3477);
						Static209.method3684(Static145.anInt3477, local23.anInt1635, local23.anInt1604, local23.anInt1603, local23, local23.anInt1681, local261, local23.anInt1680, local23.anInt1627, local23.anInt1624, local23.anInt1622);
					}
				}
			}
		}
	}
}
