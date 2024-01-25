import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public static int anInt3858;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString230 = "Loading fonts - ";

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[Lclient!ja;")
	public static final Class5_Sub9_Sub11[] aClass5_Sub9_Sub11Array5 = new Class5_Sub9_Sub11[14];

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)V")
	public static void method3527(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static207.anInt4106 != -1) {
				Static132.method2686(Static207.anInt4106);
			}
			for (@Pc(19) Class5_Sub40 local19 = (Class5_Sub40) Static265.aClass42_53.method1060(); local19 != null; local19 = (Class5_Sub40) Static265.aClass42_53.method1055()) {
				if (!local19.method5802()) {
					local19 = (Class5_Sub40) Static265.aClass42_53.method1060();
					if (local19 == null) {
						break;
					}
				}
				Static339.method5623(true, local19, false);
			}
			Static207.anInt4106 = -1;
			Static265.aClass42_53 = new Class42(8);
			Static222.method3886();
			Static207.anInt4106 = Static213.anInt4221;
			Static101.method2032(false);
			Static241.method4110();
			Static223.method3892(Static207.anInt4106);
		}
		Static161.method2997();
		Static156.anInt3126 = -1;
		Static103.method2061(Static112.anInt2425);
		Static85.aClass25_Sub1_Sub1_Sub1_1 = new Class25_Sub1_Sub1_Sub1();
		Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 = 6656;
		Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 = 6656;
		Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] = 52;
		Static347.anInt6471 = 0;
		Static347.anInt6472 = 0;
		Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] = 52;
		if (Static215.anInt4279 == 2) {
			Static347.anInt6472 = Static54.anInt1333 << 7;
			Static347.anInt6471 = Class25_Sub1_Sub4.lb << 7;
		} else {
			Static286.method4901();
		}
		Static310.method5282();
		if (Static347.anInt6472 == 0 || Static347.anInt6471 == 0) {
			Static293.method4971(10);
		} else {
			Static25.method611();
			Static293.method4971(28);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	public static void method3529() {
		if (Static354.method5830() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static117.anInt2497 - 4 & 0xFF);
		@Pc(31) int local31 = Static117.anInt2497 % Static266.anInt5101;
		@Pc(37) int local37;
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			for (local37 = 0; local37 < Static339.anInt6352; local37++) {
				Static293.aByteArrayArrayArray25[local33][local31][local37] = local19;
			}
		}
		if (Static156.anInt3123 == 3) {
			return;
		}
		for (local37 = 0; local37 < 2; local37++) {
			Static28.anIntArray40[local37] = -1000000;
			Static346.anIntArray555[local37] = 1000000;
			Static203.anIntArray285[local37] = 0;
			Static75.anIntArray97[local37] = 1000000;
			Static302.anIntArray447[local37] = 0;
		}
		@Pc(100) int local100;
		if (Static215.anInt4279 != 1) {
			local100 = Static66.method1393(Static347.anInt6471, Static156.anInt3123, Static347.anInt6472);
			if (local100 - Static339.anInt6354 < 800 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][Static347.anInt6472 >> 7][Static347.anInt6471 >> 7] & 0x4) != 0) {
				Static46.method1044(1, false, Static138.aClass51ArrayArrayArray1, Static347.anInt6472 >> 7, Static347.anInt6471 >> 7);
				return;
			}
			return;
		}
		if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7][Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7] & 0x4) != 0) {
			Static46.method1044(0, false, Static138.aClass51ArrayArrayArray1, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7);
		}
		if (Static311.anInt6461 >= 2560) {
			return;
		}
		local100 = Static347.anInt6472 >> 7;
		@Pc(181) int local181 = Static347.anInt6471 >> 7;
		@Pc(186) int local186 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7;
		@Pc(191) int local191 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7;
		@Pc(202) int local202;
		if (local186 > local100) {
			local202 = local186 - local100;
		} else {
			local202 = local100 - local186;
		}
		@Pc(216) int local216;
		if (local181 < local191) {
			local216 = local191 - local181;
		} else {
			local216 = local181 - local191;
		}
		if (local202 == 0 && local216 == 0 || local202 <= -Static266.anInt5101 || local202 >= Static266.anInt5101 || local216 <= -Static339.anInt6352 || Static339.anInt6352 <= local216) {
			Static113.method2252(null, "RC: " + local100 + "," + local181 + " " + local186 + "," + local191 + " " + Static263.anInt5063 + "," + Static28.anInt773);
			return;
		}
		@Pc(296) int local296;
		@Pc(298) int local298;
		if (local216 >= local202) {
			local296 = local202 * 65536 / local216;
			local298 = 32768;
			while (local191 != local181) {
				if (local181 < local191) {
					local181++;
				} else if (local181 > local191) {
					local181--;
				}
				if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][local100][local181] & 0x4) != 0) {
					Static46.method1044(1, false, Static138.aClass51ArrayArrayArray1, local100, local181);
					return;
				}
				local298 += local296;
				if (local298 >= 65536) {
					local298 -= 65536;
					if (local186 > local100) {
						local100++;
					} else if (local100 > local186) {
						local100--;
					}
					if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][local100][local181] & 0x4) != 0) {
						Static46.method1044(1, false, Static138.aClass51ArrayArrayArray1, local100, local181);
						return;
					}
				}
			}
			return;
		}
		local296 = local216 * 65536 / local202;
		local298 = 32768;
		while (local186 != local100) {
			if (local186 > local100) {
				local100++;
			} else if (local186 < local100) {
				local100--;
			}
			if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][local100][local181] & 0x4) != 0) {
				Static46.method1044(1, false, Static138.aClass51ArrayArrayArray1, local100, local181);
				return;
			}
			local298 += local296;
			if (local298 >= 65536) {
				if (local181 < local191) {
					local181++;
				} else if (local181 > local191) {
					local181--;
				}
				local298 -= 65536;
				if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][local100][local181] & 0x4) != 0) {
					Static46.method1044(1, false, Static138.aClass51ArrayArrayArray1, local100, local181);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	public static boolean method3530(@OriginalArg(1) int arg0) {
		if (arg0 == 7 || arg0 == 42 || arg0 == 32 || arg0 == 24 || arg0 == 1005) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 33 || arg0 == 1002;
		}
	}
}
