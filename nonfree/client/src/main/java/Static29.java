import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array1;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lclient!da;")
	public static Class15 aClass15_21;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Lclient!da;")
	public static Class15 aClass15_22;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "Z")
	public static boolean aBoolean57;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!wb;")
	public static Class65 aClass65_387 = null;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "Lclient!wb;")
	public static Class65 aClass65_388 = Static24.method441("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "Lclient!wb;")
	public static Class65 aClass65_389 = Static24.method441("null");

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
	public static int anInt817 = 2;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
	public static int anInt818 = 0;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Lclient!wb;")
	private static Class65 aClass65_390 = Static24.method441("Public chat");

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
	public static int anInt819 = 0;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Lclient!wb;")
	public static Class65 aClass65_391 = aClass65_390;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method514() {
		aClass65_390 = null;
		aClass65_387 = null;
		aClass65_388 = null;
		aClass2_Sub1_Sub4_Sub3Array1 = null;
		Class2_Sub7.anIntArray114 = null;
		aClass65_389 = null;
		aClass15_21 = null;
		aClass65_391 = null;
		aClass15_22 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method515(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt180;
		@Pc(84) int local84;
		if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
			if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
				if (local8 <= 800) {
					local8 -= 101;
				} else {
					local8 -= 701;
				}
				local84 = Static32.anInt1047;
				if (Static37.anInt1225 != 2) {
					local84 = 0;
				}
				if (local8 >= local84) {
					arg0.anInt159 = 0;
					arg0.aClass65_89 = Static8.aClass65_145;
				} else {
					if (Static12.anIntArray71[local8] == 0) {
						arg0.aClass65_89 = Static13.method282(new Class65[] { Static41.aClass65_571, Static52.aClass65_725 });
					} else if (Static12.anIntArray71[local8] >= 5000) {
						if (Static41.anInt1300 == Static12.anIntArray71[local8]) {
							arg0.aClass65_89 = Static13.method282(new Class65[] { Static47.aClass65_621, Static30.aClass65_452, Static93.method1617(Static12.anIntArray71[local8] - 5000) });
						} else {
							arg0.aClass65_89 = Static13.method282(new Class65[] { Static98.aClass65_1234, Static30.aClass65_452, Static93.method1617(Static12.anIntArray71[local8] - 5000) });
						}
					} else if (Static12.anIntArray71[local8] == Static41.anInt1300) {
						arg0.aClass65_89 = Static13.method282(new Class65[] { Static47.aClass65_621, Static4.aClass65_100, Static93.method1617(Static12.anIntArray71[local8]) });
					} else {
						arg0.aClass65_89 = Static13.method282(new Class65[] { Static98.aClass65_1234, Static4.aClass65_100, Static93.method1617(Static12.anIntArray71[local8]) });
					}
					arg0.anInt159 = 1;
				}
			} else if (local8 == 203) {
				local84 = Static32.anInt1047;
				if (Static37.anInt1225 != 2) {
					local84 = 0;
				}
				arg0.anInt153 = local84 * 15 + 20;
				if (arg0.anInt170 >= arg0.anInt153) {
					arg0.anInt153 = arg0.anInt170 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static37.anInt1225 == 0) {
					arg0.anInt159 = 0;
					arg0.aClass65_89 = Static95.aClass65_899;
				} else if (local8 == 1 && Static37.anInt1225 == 0) {
					arg0.anInt159 = 0;
					arg0.aClass65_89 = Static6.aClass65_118;
				} else {
					local84 = Static93.anInt2629;
					if (Static37.anInt1225 == 0) {
						local84 = 0;
					}
					if (local84 <= local8) {
						arg0.anInt159 = 0;
						arg0.aClass65_89 = Static8.aClass65_145;
					} else {
						arg0.aClass65_89 = Static24.method442(Static52.aLongArray6[local8]).method1787();
						arg0.anInt159 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt153 = Static93.anInt2629 * 15 + 20;
				if (arg0.anInt170 >= arg0.anInt153) {
					arg0.anInt153 = arg0.anInt170 + 1;
				}
			} else if (local8 == 324) {
				if (Static69.anInt2068 == -1) {
					Static69.anInt2068 = arg0.anInt174;
					Static103.anInt2820 = arg0.anInt164;
				}
				if (Static67.aClass49_2.aBoolean124) {
					arg0.anInt174 = Static69.anInt2068;
				} else {
					arg0.anInt174 = Static103.anInt2820;
				}
			} else if (local8 == 325) {
				if (Static69.anInt2068 == -1) {
					Static103.anInt2820 = arg0.anInt164;
					Static69.anInt2068 = arg0.anInt174;
				}
				if (Static67.aClass49_2.aBoolean124) {
					arg0.anInt174 = Static103.anInt2820;
				} else {
					arg0.anInt174 = Static69.anInt2068;
				}
			} else if (local8 == 327) {
				arg0.anInt195 = 150;
				arg0.anInt165 = (int) (Math.sin((double) Static108.anInt2902 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt194 = 5;
				arg0.anInt152 = 0;
			} else if (local8 == 328) {
				arg0.anInt195 = 150;
				arg0.anInt165 = (int) (Math.sin((double) Static108.anInt2902 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt194 = 5;
				arg0.anInt152 = 1;
			} else if (local8 == 600) {
				arg0.aClass65_89 = Static13.method282(new Class65[] { Static8.aClass65_142, Static102.aClass65_1262 });
			} else if (local8 == 620) {
				if (Static20.anInt629 < 1) {
					arg0.aClass65_89 = Static8.aClass65_145;
				} else if (Static17.aBoolean39) {
					arg0.anInt205 = 16711680;
					arg0.aClass65_89 = Static33.aClass65_1054;
				} else {
					arg0.aClass65_89 = Static34.aClass65_486;
					arg0.anInt205 = 16777215;
				}
			}
		} else if (local8 == 1 && Static37.anInt1225 == 0) {
			arg0.aClass65_89 = Static97.aClass65_1209;
			arg0.anInt159 = 0;
		} else if (local8 == 1 && Static37.anInt1225 == 1) {
			arg0.anInt159 = 0;
			arg0.aClass65_89 = Static101.aClass65_1252;
		} else if (local8 == 2 && Static37.anInt1225 != 2) {
			arg0.anInt159 = 0;
			arg0.aClass65_89 = Static6.aClass65_118;
		} else {
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local84 = Static32.anInt1047;
			if (Static37.anInt1225 != 2) {
				local84 = 0;
			}
			if (local84 <= local8) {
				arg0.aClass65_89 = Static8.aClass65_145;
				arg0.anInt159 = 0;
			} else {
				arg0.aClass65_89 = Static67.aClass65Array9[local8];
				arg0.anInt159 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BB)V")
	public static void method516(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg0);
		local10.anInt2342 = arg0.length - 2;
		Static78.anInt565 = local10.method1396();
		Static101.aByteArrayArray9 = new byte[Static78.anInt565][];
		Static28.anIntArray110 = new int[Static78.anInt565];
		Static98.anIntArray404 = new int[Static78.anInt565];
		Static24.anIntArray98 = new int[Static78.anInt565];
		Static17.anIntArray79 = new int[Static78.anInt565];
		local10.anInt2342 = arg0.length - Static78.anInt565 * 8 - 7;
		Static90.anInt1399 = local10.method1396();
		Static82.anInt2367 = local10.method1396();
		@Pc(70) int local70 = (local10.method1410() & 0xFF) + 1;
		for (@Pc(72) int local72 = 0; local72 < Static78.anInt565; local72++) {
			Static28.anIntArray110[local72] = local10.method1396();
		}
		for (@Pc(90) int local90 = 0; local90 < Static78.anInt565; local90++) {
			Static17.anIntArray79[local90] = local10.method1396();
		}
		for (@Pc(104) int local104 = 0; local104 < Static78.anInt565; local104++) {
			Static98.anIntArray404[local104] = local10.method1396();
		}
		for (@Pc(122) int local122 = 0; local122 < Static78.anInt565; local122++) {
			Static24.anIntArray98[local122] = local10.method1396();
		}
		local10.anInt2342 = arg0.length - (local70 - 1) * 3 - Static78.anInt565 * 8 - 7;
		Static28.anIntArray109 = new int[local70];
		for (@Pc(161) int local161 = 1; local161 < local70; local161++) {
			Static28.anIntArray109[local161] = local10.method1388();
			if (Static28.anIntArray109[local161] == 0) {
				Static28.anIntArray109[local161] = 1;
			}
		}
		local10.anInt2342 = 0;
		for (@Pc(193) int local193 = 0; local193 < Static78.anInt565; local193++) {
			@Pc(199) int local199 = Static24.anIntArray98[local193];
			@Pc(203) int local203 = Static98.anIntArray404[local193];
			@Pc(207) int local207 = local199 * local203;
			@Pc(210) byte[] local210 = new byte[local207];
			Static101.aByteArrayArray9[local193] = local210;
			@Pc(218) int local218 = local10.method1410();
			@Pc(225) int local225;
			if (local218 == 0) {
				for (local225 = 0; local225 < local207; local225++) {
					local210[local225] = local10.method1380();
				}
			} else if (local218 == 1) {
				for (local225 = 0; local225 < local203; local225++) {
					for (@Pc(254) int local254 = 0; local254 < local199; local254++) {
						local210[local203 * local254 + local225] = local10.method1380();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method517() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!sa;")
	public static Class2_Sub1_Sub14 method518(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) Static6.aClass21_3.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static84.aClass33_37.method1150(arg0, 6);
		local10 = new Class2_Sub1_Sub14();
		local10.anInt2620 = arg0;
		if (local22 != null) {
			local10.method1609(new Class2_Sub8(local22));
		}
		local10.method1621();
		if (local10.aBoolean144) {
			local10.aBoolean139 = false;
			local10.aBoolean140 = false;
		}
		Static6.aClass21_3.method745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!od;I)V")
	public static void method520(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0) {
		arg0.anInt1567 = 0;
		if (arg0.anInt1539 == 0) {
			arg0.anInt1545 = 1024;
		}
		if (arg0.anInt1539 == 1) {
			arg0.anInt1545 = 1536;
		}
		@Pc(28) int local28 = arg0.anInt1565 - Static108.anInt2902;
		if (arg0.anInt1539 == 2) {
			arg0.anInt1545 = 0;
		}
		@Pc(46) int local46 = arg0.anInt1519 * 128 + arg0.anInt1521 * 64;
		@Pc(57) int local57 = arg0.anInt1572 * 128 + arg0.anInt1521 * 64;
		if (arg0.anInt1539 == 3) {
			arg0.anInt1545 = 512;
		}
		arg0.anInt1562 += (local57 - arg0.anInt1562) / local28;
		arg0.anInt1518 += (local46 - arg0.anInt1518) / local28;
	}
}
