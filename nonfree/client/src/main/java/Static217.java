import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "Lclient!mc;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!haa;")
	public static Class153_Sub1 aClass153_Sub1_2;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!el;")
	public static final Class109 aClass109_79 = new Class109(106, -2);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)Lclient!tia;")
	public static Class5_Sub50 method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class5_Sub50 local5 = null;
		if (arg2 == 0) {
			local5 = Static457.method6722(Static655.aClass387_125, Static80.aClass313_1);
		}
		if (arg2 == 1) {
			local5 = Static457.method6722(Static602.aClass387_116, Static80.aClass313_1);
		}
		local5.aClass5_Sub23_Sub2_2.method8480(Static668.anInt10683 + arg1);
		local5.aClass5_Sub23_Sub2_2.method8492(Static622.anInt10188 + arg0);
		local5.aClass5_Sub23_Sub2_2.method8504(Static258.aClass89_1.method1617(82) ? 1 : 0);
		Static669.anInt10711 = arg1;
		Static437.aBoolean584 = false;
		Static86.anInt1451 = arg0;
		Static522.method7559();
		return local5;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public static void method3110() {
		if (!Static526.aBoolean669) {
			Static320.aBoolean437 = Static154.anInt2439 != -1 && Static481.anInt8130 >= Static154.anInt2439 || (Static519.aBoolean664 ? 26 : 22) + Static481.anInt8130 * 16 > Static631.anInt10283;
		}
		Static13.aClass102_4.method1932();
		Static680.aClass102_75.method1932();
		@Pc(59) int local59;
		for (@Pc(52) Class5_Sub5_Sub19 local52 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local52 != null; local52 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
			local59 = local52.anInt9210;
			if (local59 < 1000) {
				local52.method9327(1);
				if (local59 == 11 || local59 == 51 || local59 == 10 || local59 == 30 || local59 == 13 || local59 == 9 || local59 == 17) {
					Static680.aClass102_75.method1921(local52);
				} else {
					Static13.aClass102_4.method1921(local52);
				}
			}
		}
		Static13.aClass102_4.method1919(Static199.aClass102_63);
		Static680.aClass102_75.method1919(Static199.aClass102_63);
		if (Static481.anInt8130 <= 1) {
			Static612.aClass5_Sub5_Sub19_5 = null;
			Static133.aClass5_Sub5_Sub19_2 = null;
		} else {
			if (Static572.aBoolean460 && Static258.aClass89_1.method1617(81) && Static481.anInt8130 > 2) {
				Static133.aClass5_Sub5_Sub19_2 = (Class5_Sub5_Sub19) Static199.aClass102_63.aClass5_61.aClass5_337.aClass5_337;
			} else {
				Static133.aClass5_Sub5_Sub19_2 = (Class5_Sub5_Sub19) Static199.aClass102_63.aClass5_61.aClass5_337;
			}
			Static612.aClass5_Sub5_Sub19_5 = (Class5_Sub5_Sub19) Static199.aClass102_63.aClass5_61.aClass5_337;
		}
		local59 = -1;
		@Pc(210) Class5_Sub6 local210 = (Class5_Sub6) Static536.aClass102_65.method1916();
		if (local210 != null) {
			local59 = local210.method5806();
		}
		if (!Static526.aBoolean669) {
			if (local59 == 0 && (Static654.anInt10547 == 1 && Static481.anInt8130 > 2 || Static561.method8125())) {
				local59 = 2;
			}
			if (local59 == 2 && Static481.anInt8130 > 0 && local210 != null) {
				if (Static370.aClass73_22 == null && Static288.anInt5464 == 0) {
					Static275.method4065(local210.method5803(), local210.method5804());
				} else {
					Static216.anInt3515 = 2;
				}
			}
			if (local59 == 0) {
				if (Static133.aClass5_Sub5_Sub19_2 != null) {
					Static96.method1406();
				} else if (Static199.aBoolean706) {
					Static179.method2592();
				}
			}
			if (Static370.aClass73_22 != null || Static288.anInt5464 != 0) {
				return;
			}
			Static216.anInt3515 = 0;
			Static117.aClass5_Sub5_Sub19_1 = null;
			return;
		}
		@Pc(229) int local229;
		@Pc(233) int local233;
		@Pc(344) int local344;
		@Pc(346) int local346;
		if (local59 == -1) {
			local229 = Static205.aClass107_1.method4079();
			local233 = Static205.aClass107_1.method4072();
			@Pc(235) boolean local235 = false;
			if (Static604.aClass5_Sub5_Sub18_1 != null) {
				if (Static652.anInt10541 - 10 <= local229 && Static493.anInt8236 + Static652.anInt10541 + 10 >= local229 && local233 >= Static422.anInt7304 - 10 && local233 <= Static422.anInt7304 + Static101.anInt1607 + 10) {
					local235 = true;
				} else {
					Static476.method6932();
				}
			}
			if (!local235) {
				if (Static327.anInt5831 - 10 > local229 || local229 > Static498.anInt8306 + Static327.anInt5831 + 10 || local233 < Static507.anInt8693 - 10 || local233 > Static42.anInt1723 + Static507.anInt8693 + 10) {
					Static615.method8728();
				} else if (Static320.aBoolean437) {
					local344 = -1;
					local346 = -1;
					@Pc(362) int local362;
					for (@Pc(348) int local348 = 0; local348 < Static220.anInt3580; local348++) {
						if (Static519.aBoolean664) {
							local362 = local348 * 16 + Static507.anInt8693 + 33;
							if (local362 - 13 < local233 && local362 + 4 > local233) {
								local344 = local348;
								local346 = local362 - 13;
								break;
							}
						} else {
							local362 = Static507.anInt8693 + local348 * 16 + 31;
							if (local362 - 13 < local233 && local362 + 3 > local233) {
								local346 = local362 - 13;
								local344 = local348;
								break;
							}
						}
					}
					if (local344 != -1) {
						local362 = 0;
						@Pc(440) Class390 local440 = new Class390(Static86.aClass149_5);
						for (@Pc(445) Class5_Sub5_Sub18 local445 = (Class5_Sub5_Sub18) local440.method9272(); local445 != null; local445 = (Class5_Sub5_Sub18) local440.method9270()) {
							if (local344 == local362) {
								if (local445.anInt7610 > 1) {
									Static656.method9066(local346, local233, local445);
								}
								break;
							}
							local362++;
						}
					}
				}
			}
		}
		if (local59 != 0) {
			return;
		}
		local229 = local210.method5803();
		local233 = local210.method5804();
		@Pc(529) int local529;
		@Pc(616) Class390 local616;
		@Pc(621) Class5_Sub5_Sub19 local621;
		if (Static604.aClass5_Sub5_Sub18_1 != null && local229 >= Static652.anInt10541 && Static493.anInt8236 + Static652.anInt10541 >= local229 && Static422.anInt7304 <= local233 && Static422.anInt7304 + Static101.anInt1607 >= local233) {
			local529 = -1;
			for (local344 = 0; local344 < Static604.aClass5_Sub5_Sub18_1.anInt7610; local344++) {
				if (Static519.aBoolean664) {
					local346 = local344 * 16 + Static422.anInt7304 + 33;
					if (local346 - 13 < local233 && local233 < local346 + 4) {
						local529 = local344;
					}
				} else {
					local346 = local344 * 16 + Static422.anInt7304 + 31;
					if (local233 > local346 - 13 && local346 + 3 > local233) {
						local529 = local344;
					}
				}
			}
			if (local529 != -1) {
				local346 = 0;
				local616 = new Class390(Static604.aClass5_Sub5_Sub18_1.aClass149_8);
				for (local621 = (Class5_Sub5_Sub19) local616.method9272(); local621 != null; local621 = (Class5_Sub5_Sub19) local616.method9270()) {
					if (local529 == local346) {
						Static369.method5421(local621, local233, local229);
						break;
					}
					local346++;
				}
			}
			Static615.method8728();
			return;
		}
		if (Static327.anInt5831 > local229 || Static327.anInt5831 + Static498.anInt8306 < local229 || local233 < Static507.anInt8693 || Static42.anInt1723 + Static507.anInt8693 < local233) {
			return;
		}
		if (!Static320.aBoolean437) {
			local529 = -1;
			for (local344 = 0; local344 < Static481.anInt8130; local344++) {
				if (Static519.aBoolean664) {
					local346 = (Static481.anInt8130 - local344 - 1) * 16 + Static507.anInt8693 + 33;
					if (local346 - 13 < local233 && local346 + 4 > local233) {
						local529 = local344;
					}
				} else {
					local346 = (Static481.anInt8130 - local344 - 1) * 16 + Static507.anInt8693 + 31;
					if (local346 - 13 < local233 && local233 < local346 + 3) {
						local529 = local344;
					}
				}
			}
			if (local529 != -1) {
				local346 = 0;
				@Pc(780) Class238 local780 = new Class238(Static199.aClass102_63);
				for (local621 = (Class5_Sub5_Sub19) local780.method5463(); local621 != null; local621 = (Class5_Sub5_Sub19) local780.method5466()) {
					if (local346 == local529) {
						Static369.method5421(local621, local233, local229);
						break;
					}
					local346++;
				}
			}
			Static615.method8728();
			return;
		}
		local529 = -1;
		for (local344 = 0; local344 < Static220.anInt3580; local344++) {
			if (Static519.aBoolean664) {
				local346 = local344 * 16 + Static507.anInt8693 + 33;
				if (local233 > local346 - 13 && local346 + 4 > local233) {
					local529 = local344;
					break;
				}
			} else {
				local346 = Static507.anInt8693 + local344 * 16 + 31;
				if (local346 - 13 < local233 && local233 < local346 + 3) {
					local529 = local344;
					break;
				}
			}
		}
		if (local529 == -1) {
			return;
		}
		local346 = 0;
		local616 = new Class390(Static86.aClass149_5);
		for (@Pc(910) Class5_Sub5_Sub18 local910 = (Class5_Sub5_Sub18) local616.method9272(); local910 != null; local910 = (Class5_Sub5_Sub18) local616.method9270()) {
			if (local346 == local529) {
				Static369.method5421((Class5_Sub5_Sub19) local910.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66, local233, local229);
				Static615.method8728();
				return;
			}
			local346++;
		}
		return;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ha;BLclient!cn;)V")
	public static void method3112(@OriginalArg(0) Class57 arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(44) boolean local44 = Static201.aClass127_1.method2502(arg1.aBoolean131 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null, arg1.anInt1333 | 0xFF000000, arg1.anInt1369, arg1.anInt1411, arg0, arg1.anInt1348, arg1.anInt1419) == null;
		if (local44) {
			Static221.aClass102_30.method1921(new Class5_Sub31(arg1.anInt1419, arg1.anInt1369, arg1.anInt1348, arg1.anInt1333 | 0xFF000000, arg1.anInt1411, arg1.aBoolean131));
			Static298.method4399(arg1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!la;ZLjava/lang/String;Z)Lclient!kda;")
	public static Class197 method3114(@OriginalArg(0) Class208 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(17) int local17 = arg0.method4986(arg2, -107);
		if (local17 == -1) {
			return new Class197(0);
		}
		@Pc(31) int[] local31 = arg0.method4979(local17);
		@Pc(37) Class197 local37 = new Class197(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt5405) {
				@Pc(55) Class5_Sub23 local55 = new Class5_Sub23(arg0.method4991(local17, local31[local41++], -122));
				@Pc(59) int local59 = local55.method8527();
				@Pc(63) int local63 = local55.method8519();
				@Pc(67) int local67 = local55.method8529();
				if (!arg1 && local67 == 1) {
					local37.anInt5405--;
				} else {
					local37.anIntArray292[local39] = local59;
					local37.anIntArray291[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
