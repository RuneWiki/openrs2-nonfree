import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	public static int anInt6245;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array10;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
	public static final int[] anIntArray454 = new int[5];

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	public static int anInt6242 = 0;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public static int anInt6247 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!tn;IILclient!qa;)V")
	public static void method4930(@OriginalArg(1) Class229 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class121 arg3) {
		@Pc(14) Class34 local14 = arg0.method5378(arg3);
		if (local14 == null) {
			return;
		}
		arg3.pa(arg1, arg2, arg1 + arg0.anInt6905, arg2 + arg0.anInt6895);
		if (Static417.anInt7328 == 2 || Static417.anInt7328 == 5 || Static319.aClass78_18 == null) {
			arg3.j(-16777216, local14, arg1, arg2);
			return;
		}
		@Pc(46) int local46;
		@Pc(44) int local44;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (Static57.anInt883 == 4) {
			local44 = Static263.anInt4468;
			local46 = Static370.anInt7662;
			local52 = (int) -Static147.aFloat59 & 0x3FFF;
			local54 = 4096;
		} else {
			local44 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
			local54 = 4096 - Static25.anInt430 * 16;
			local46 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060;
			local52 = (int) -Static147.aFloat59 + Static388.anInt7297 & 0x3FFF;
		}
		@Pc(90) int local90 = local46 / 32 + 208 + 48 - Static80.anInt6558 * 2;
		@Pc(107) int local107 = Static104.anInt2048 * 4 + 48 + 208 - Static104.anInt2048 * 2 - local44 / 32;
		Static319.aClass78_18.method5999((float) arg0.anInt6905 / 2.0F + (float) arg1, (float) arg0.anInt6895 / 2.0F + (float) arg2, (float) local90, (float) local107, local54, local52 << 2, local14, arg1, arg2);
		@Pc(158) int local158;
		@Pc(168) int local168;
		@Pc(179) int local179;
		@Pc(190) int local190;
		for (@Pc(141) Class1_Sub37 local141 = (Class1_Sub37) Static216.aClass142_21.method3199(); local141 != null; local141 = (Class1_Sub37) Static216.aClass142_21.method3198()) {
			@Pc(146) int local146 = local141.anInt6451;
			local158 = (Static212.aClass84_1.anIntArray108[local146] >> 14 & 0x3FFF) - Static190.anInt3507;
			local168 = (Static212.aClass84_1.anIntArray108[local146] & 0x3FFF) - Static331.anInt6034;
			local179 = local158 * 4 + 2 - local46 / 32;
			local190 = local168 * 4 + 2 - local44 / 32;
			Static248.method3568(arg0, local14, arg2, arg1, local179, arg3, Static212.aClass84_1.anIntArray109[local146], local190);
		}
		for (local158 = 0; local158 < Static444.anInt7690; local158++) {
			local168 = Static310.anIntArray398[local158] * 4 + 2 - local46 / 32;
			local179 = Static58.anIntArray53[local158] * 4 + 2 - local44 / 32;
			@Pc(249) Class29 local249 = Static251.aClass207_2.method4977(Static264.anIntArray352[local158]);
			if (local249.anIntArray36 != null) {
				local249 = local249.method475(Static237.aClass80_1);
				if (local249 == null || local249.anInt573 == -1) {
					continue;
				}
			}
			Static248.method3568(arg0, local14, arg2, arg1, local168, arg3, local249.anInt573, local179);
		}
		for (@Pc(292) Class1_Sub34 local292 = (Class1_Sub34) Static346.aClass51_22.method928(); local292 != null; local292 = (Class1_Sub34) Static346.aClass51_22.method926()) {
			local179 = (int) (local292.aLong237 >> 28 & 0x3L);
			if (Static136.anInt2492 == local179) {
				local190 = (int) (local292.aLong237 & 0x3FFFL) * 4 + 2 - local46 / 32;
				@Pc(337) int local337 = (int) (local292.aLong237 >> 14 & 0x3FFFL) * 4 + 2 - local44 / 32;
				Static257.method3643(arg1, Static33.aClass78Array2[0], local337, arg2, arg0, local190, local14);
			}
		}
		@Pc(410) int local410;
		for (local179 = 0; local179 < Static47.anInt760; local179++) {
			@Pc(365) Class47_Sub1_Sub5_Sub1 local365 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local179]];
			if (local365 != null && local365.method3156() && Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local365.aByte97) {
				@Pc(383) Class196 local383 = local365.aClass196_1;
				if (local383 != null && local383.anIntArray419 != null) {
					local383 = local383.method4412(Static237.aClass80_1);
				}
				if (local383 != null && local383.aBoolean444 && local383.aBoolean441) {
					local410 = local365.anInt7060 / 32 - local46 / 32;
					@Pc(420) int local420 = local365.anInt7066 / 32 - local44 / 32;
					if (local383.anInt5564 == -1) {
						Static257.method3643(arg1, Static33.aClass78Array2[1], local420, arg2, arg0, local410, local14);
					} else {
						Static248.method3568(arg0, local14, arg2, arg1, local410, arg3, local383.anInt5564, local420);
					}
				}
			}
		}
		local190 = Static97.anInt1902;
		@Pc(458) int[] local458 = Static105.anIntArray107;
		@Pc(492) int local492;
		@Pc(502) int local502;
		@Pc(506) int local506;
		for (local410 = 0; local410 < local190; local410++) {
			@Pc(468) Class47_Sub1_Sub5_Sub2 local468 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local458[local410]];
			if (local468 != null && local468.method4341() && local468 != Static255.aClass47_Sub1_Sub5_Sub2_2 && Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local468.aByte97) {
				local492 = local468.anInt7060 / 32 - local46 / 32;
				local502 = local468.anInt7066 / 32 - local44 / 32;
				@Pc(504) boolean local504 = false;
				for (local506 = 0; local506 < Static342.anInt6234; local506++) {
					if (local468.aString66.equals(Static396.aStringArray40[local506]) && Static435.anIntArray445[local506] != 0) {
						local504 = true;
						break;
					}
				}
				@Pc(529) boolean local529 = false;
				for (@Pc(531) int local531 = 0; local531 < Static175.anInt5411; local531++) {
					if (local468.aString66.equals(Static345.aClass152Array1[local531].aString53)) {
						local529 = true;
						break;
					}
				}
				@Pc(555) boolean local555 = false;
				if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5422 != 0 && local468.anInt5422 != 0 && local468.anInt5422 == Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5422) {
					local555 = true;
				}
				if (local468.aBoolean438) {
					Static257.method3643(arg1, Static33.aClass78Array2[6], local502, arg2, arg0, local492, local14);
				} else if (local504) {
					Static257.method3643(arg1, Static33.aClass78Array2[3], local502, arg2, arg0, local492, local14);
				} else if (local529) {
					Static257.method3643(arg1, Static33.aClass78Array2[5], local502, arg2, arg0, local492, local14);
				} else if (local555) {
					Static257.method3643(arg1, Static33.aClass78Array2[4], local502, arg2, arg0, local492, local14);
				} else {
					Static257.method3643(arg1, Static33.aClass78Array2[2], local502, arg2, arg0, local492, local14);
				}
			}
		}
		@Pc(653) Class262[] local653 = Static416.aClass262Array1;
		@Pc(737) int local737;
		for (local492 = 0; local492 < local653.length; local492++) {
			@Pc(661) Class262 local661 = local653[local492];
			if (local661 != null && local661.anInt7695 != 0 && Static123.anInt2333 % 20 < 10) {
				@Pc(713) int local713;
				if (local661.anInt7695 == 1 && local661.anInt7698 >= 0 && local661.anInt7698 < Static307.aClass47_Sub1_Sub5_Sub1Array1.length) {
					@Pc(691) Class47_Sub1_Sub5_Sub1 local691 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local661.anInt7698];
					if (local691 != null) {
						local506 = local691.anInt7060 / 32 - local46 / 32;
						local713 = local691.anInt7066 / 32 - local44 / 32;
						Static263.method3701(local506, local661.anInt7701, arg2, arg1, local14, arg0, 360000L, local713);
					}
				}
				if (local661.anInt7695 == 2) {
					local737 = local661.anInt7697 / 32 - local46 / 32;
					local506 = local661.anInt7694 / 32 - local44 / 32;
					@Pc(752) long local752 = (long) (local661.anInt7700 << 5);
					@Pc(756) long local756 = local752 * local752;
					Static263.method3701(local737, local661.anInt7701, arg2, arg1, local14, arg0, local756, local506);
				}
				if (local661.anInt7695 == 10 && local661.anInt7698 >= 0 && Static362.aClass47_Sub1_Sub5_Sub2Array1.length > local661.anInt7698) {
					@Pc(790) Class47_Sub1_Sub5_Sub2 local790 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local661.anInt7698];
					if (local790 != null) {
						local506 = local790.anInt7060 / 32 - local46 / 32;
						local713 = local790.anInt7066 / 32 - local44 / 32;
						Static263.method3701(local506, local661.anInt7701, arg2, arg1, local14, arg0, 360000L, local713);
					}
				}
			}
		}
		if (Static57.anInt883 == 4) {
			return;
		}
		if (Static57.anInt866 != 0) {
			local502 = Static57.anInt866 * 4 + (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() + -1) * 2 + 2 - local46 / 32;
			local737 = Static326.anInt5983 * 4 + (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() + -1) * 2 + 2 - local44 / 32;
			Static257.method3643(arg1, Static312.aClass78Array9[Static334.aBoolean489 ? 1 : 0], local737, arg2, arg0, local502, local14);
		}
		arg3.method4600(3, arg1 + arg0.anInt6905 / 2 - 1, -1, 3, arg2 + arg0.anInt6895 / 2 - 1);
		return;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
	public static int method4931(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qf;II)V")
	public static void method4932(@OriginalArg(0) Class1_Sub14_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static204.anInt3633 = 0;
		Static208.aBoolean304 = false;
		Static279.method5851(arg0);
		Static314.method4293(arg0);
		if (Static208.aBoolean304) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt5695) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5695 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)Z")
	public static boolean method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static406.method5515(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static58.anInt1051;
		@Pc(14) int local14 = arg2 << Static58.anInt1051;
		@Pc(23) int local23 = Static256.aClass70Array2[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static58.anInt1051 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static58.anInt1051 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static58.anInt1051 - 7);
		if (arg3 == 1) {
			if (local10 > Static81.anInt1480) {
				if (!Static87.method4374(local10, local23, local14)) {
					return false;
				}
				if (!Static87.method4374(local10, local23, local14 + Static86.anInt1530)) {
					return false;
				}
				if (!Static87.method4374(local10, local23, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static87.method4374(local10, local31, local14)) {
					return false;
				}
				if (!Static87.method4374(local10, local31, local14 + Static86.anInt1530)) {
					return false;
				}
				if (!Static87.method4374(local10, local31, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (!Static87.method4374(local10, local39, local14)) {
				return false;
			} else if (Static87.method4374(local10, local39, local14 + Static86.anInt1530)) {
				return Static87.method4374(local10, local39, local14 + Static297.anInt4985);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static150.anInt2703) {
				if (!Static87.method4374(local10, local23, local14 + Static297.anInt4985)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static86.anInt1530, local23, local14 + Static297.anInt4985)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local23, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static87.method4374(local10, local31, local14 + Static297.anInt4985)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static86.anInt1530, local31, local14 + Static297.anInt4985)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local31, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (!Static87.method4374(local10, local39, local14 + Static297.anInt4985)) {
				return false;
			} else if (Static87.method4374(local10 + Static86.anInt1530, local39, local14 + Static297.anInt4985)) {
				return Static87.method4374(local10 + Static297.anInt4985, local39, local14 + Static297.anInt4985);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static81.anInt1480) {
				if (!Static87.method4374(local10 + Static297.anInt4985, local23, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local23, local14 + Static86.anInt1530)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local23, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static87.method4374(local10 + Static297.anInt4985, local31, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local31, local14 + Static86.anInt1530)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local31, local14 + Static297.anInt4985)) {
					return false;
				}
			}
			if (!Static87.method4374(local10 + Static297.anInt4985, local39, local14)) {
				return false;
			} else if (Static87.method4374(local10 + Static297.anInt4985, local39, local14 + Static86.anInt1530)) {
				return Static87.method4374(local10 + Static297.anInt4985, local39, local14 + Static297.anInt4985);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static150.anInt2703) {
				if (!Static87.method4374(local10, local23, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static86.anInt1530, local23, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static87.method4374(local10, local31, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static86.anInt1530, local31, local14)) {
					return false;
				}
				if (!Static87.method4374(local10 + Static297.anInt4985, local31, local14)) {
					return false;
				}
			}
			if (!Static87.method4374(local10, local39, local14)) {
				return false;
			} else if (Static87.method4374(local10 + Static86.anInt1530, local39, local14)) {
				return Static87.method4374(local10 + Static297.anInt4985, local39, local14);
			} else {
				return false;
			}
		} else if (!Static87.method4374(local10 + Static86.anInt1530, local47, local14 + Static86.anInt1530)) {
			return false;
		} else if (arg3 == 16) {
			return Static87.method4374(local10, local39, local14 + Static297.anInt4985);
		} else if (arg3 == 32) {
			return Static87.method4374(local10 + Static297.anInt4985, local39, local14 + Static297.anInt4985);
		} else if (arg3 == 64) {
			return Static87.method4374(local10 + Static297.anInt4985, local39, local14);
		} else if (arg3 == 128) {
			return Static87.method4374(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method4934() {
		if (Static225.anInt3905 > 1) {
			Static392.anInt7048 = Static270.anInt2350;
			Static225.anInt3905--;
		}
		if (Static114.anInt2193 > 0) {
			Static114.anInt2193--;
		}
		if (Static158.aBoolean226) {
			Static158.aBoolean226 = false;
			Static205.method4048();
			return;
		}
		if (!Static378.aBoolean549) {
			Static176.method2834();
		}
		for (@Pc(47) int local47 = 0; local47 < 100 && Static80.method5129(); local47++) {
		}
		if (Static40.anInt629 != 30) {
			return;
		}
		Static279.method5835(Static201.aClass1_Sub14_Sub2_2, Static6.aClass254_5.method5804());
		if (Static205.aClass1_Sub4_4 == null) {
			if (Static107.method1707() >= Static396.aLong208) {
				Static205.aClass1_Sub4_4 = Static438.aClass268_1.method5997(Static63.aString24);
			}
		} else if (Static205.aClass1_Sub4_4.anInt464 != -1) {
			Static224.method3272(Static254.aClass254_88);
			Static201.aClass1_Sub14_Sub2_2.method4504(Static205.aClass1_Sub4_4.anInt464);
			Static205.aClass1_Sub4_4 = null;
			Static396.aLong208 = Static107.method1707() + 30000L;
		}
		@Pc(108) Class1_Sub22 local108 = (Class1_Sub22) Static335.aClass142_42.method3199();
		@Pc(122) int local122;
		@Pc(144) int local144;
		@Pc(162) int local162;
		@Pc(177) boolean local177;
		@Pc(227) int local227;
		@Pc(233) int local233;
		@Pc(245) int local245;
		if (local108 != null || Static107.method1707() - 2000L > Static371.aLong198) {
			@Pc(119) boolean local119 = false;
			local122 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
			for (@Pc(127) Class1_Sub22 local127 = (Class1_Sub22) Static392.aClass142_47.method3199(); local127 != null && Static201.aClass1_Sub14_Sub2_2.anInt5695 - local122 < 240; local127 = (Class1_Sub22) Static392.aClass142_47.method3198()) {
				local127.method5965();
				local144 = local127.method2936();
				if (local144 < 0) {
					local144 = 0;
				} else if (local144 > 65534) {
					local144 = 65534;
				}
				local162 = local127.method2939();
				if (local162 < 0) {
					local162 = 0;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local177 = false;
				if (local127.method2936() == -1 && local127.method2939() == -1) {
					local177 = true;
					local162 = -1;
					local144 = -1;
				}
				if (Static33.anInt526 != local162 || local144 != Static424.anInt7403) {
					if (!local119) {
						Static224.method3272(Static88.aClass254_32);
						Static201.aClass1_Sub14_Sub2_2.method4553(0);
						local119 = true;
						local122 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
					}
					local227 = local162 - Static33.anInt526;
					Static33.anInt526 = local162;
					local233 = local144 - Static424.anInt7403;
					Static424.anInt7403 = local144;
					local245 = (int) ((local127.method2938() - Static371.aLong198) / 20L);
					if (local245 < 8 && local227 >= -32 && local227 <= 31 && local233 >= -32 && local233 <= 31) {
						local233 += 32;
						local227 += 32;
						Static201.aClass1_Sub14_Sub2_2.method4504((local245 << 12) - (-(local227 << 6) - local233));
					} else if (local245 < 32 && local227 >= -128 && local227 <= 127 && local233 >= -128 && local233 <= 127) {
						local233 += 128;
						Static201.aClass1_Sub14_Sub2_2.method4553(local245 + 128);
						local227 += 128;
						Static201.aClass1_Sub14_Sub2_2.method4504((local227 << 8) + local233);
					} else if (local245 >= 32) {
						Static201.aClass1_Sub14_Sub2_2.method4504(local245 + 57344);
						if (local177) {
							Static201.aClass1_Sub14_Sub2_2.method4522(Integer.MIN_VALUE);
						} else {
							Static201.aClass1_Sub14_Sub2_2.method4522(local162 | local144 << 16);
						}
					} else {
						Static201.aClass1_Sub14_Sub2_2.method4553(local245 + 192);
						if (local177) {
							Static201.aClass1_Sub14_Sub2_2.method4522(Integer.MIN_VALUE);
						} else {
							Static201.aClass1_Sub14_Sub2_2.method4522(local144 << 16 | local162);
						}
					}
					Static371.aLong198 = local127.method2938();
				}
			}
			if (local119) {
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local122);
			}
		}
		@Pc(424) int local424;
		@Pc(468) int local468;
		if (local108 != null) {
			@Pc(408) long local408 = (local108.method2938() - Static271.aLong131) / 50L;
			if (local408 > 32767L) {
				local408 = 32767L;
			}
			Static271.aLong131 = local108.method2938();
			local424 = local108.method2936();
			if (local424 < 0) {
				local424 = 0;
			} else if (local424 > 65535) {
				local424 = 65535;
			}
			local144 = local108.method2939();
			if (local144 < 0) {
				local144 = 0;
			} else if (local144 > 65535) {
				local144 = 65535;
			}
			@Pc(458) byte local458 = 0;
			if (local108.method2937() == 2) {
				local458 = 1;
			}
			local468 = (int) local408;
			Static224.method3272(Static83.aClass254_103);
			Static201.aClass1_Sub14_Sub2_2.method4504(local468 | local458 << 15);
			Static201.aClass1_Sub14_Sub2_2.method4508(local144 | local424 << 16);
		}
		@Pc(498) int local498;
		if (Static64.anInt1162 > 0) {
			local498 = 0;
			for (local122 = 0; local122 < Static64.anInt1162; local122++) {
				if (Static209.aClass22Array3[local122].method370()) {
					local498++;
				}
			}
			if (local498 > 0) {
				if (local498 > 75) {
					local498 = 75;
				}
				Static224.method3272(Static385.aClass254_127);
				Static201.aClass1_Sub14_Sub2_2.method4553(local498 * 3);
				for (local424 = 0; local424 < Static64.anInt1162; local424++) {
					@Pc(550) Class22 local550 = Static209.aClass22Array3[local424];
					if (local550.method370()) {
						@Pc(563) long local563 = (local550.method364() - Static352.aLong184) / 50L;
						if (local563 > 65535L) {
							local563 = 65535L;
						}
						Static352.aLong184 = local550.method364();
						Static201.aClass1_Sub14_Sub2_2.method4553(local550.method367());
						Static201.aClass1_Sub14_Sub2_2.method4504((int) local563);
					}
				}
			}
		}
		if (Static311.anInt6535 > 0) {
			Static311.anInt6535--;
		}
		if (Static5.aBoolean541 && Static311.anInt6535 <= 0) {
			Static5.aBoolean541 = false;
			Static311.anInt6535 = 20;
			Static224.method3272(Static93.aClass254_36);
			Static201.aClass1_Sub14_Sub2_2.method4535((int) Static90.aFloat25 >> 3);
			Static201.aClass1_Sub14_Sub2_2.method4535((int) Static147.aFloat59 >> 3);
		}
		if (Static135.aBoolean196 && !Static381.aBoolean28) {
			Static381.aBoolean28 = true;
			Static224.method3272(Static190.aClass254_76);
			Static201.aClass1_Sub14_Sub2_2.method4553(1);
		}
		if (!Static135.aBoolean196 && Static381.aBoolean28) {
			Static381.aBoolean28 = false;
			Static224.method3272(Static190.aClass254_76);
			Static201.aClass1_Sub14_Sub2_2.method4553(0);
		}
		if (!Static291.aBoolean656) {
			Static224.method3272(Static386.aClass254_128);
			Static201.aClass1_Sub14_Sub2_2.method4553(0);
			local498 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
			@Pc(692) Class1_Sub14 local692 = Static327.aClass230_Sub1_1.method5648();
			Static201.aClass1_Sub14_Sub2_2.method4506(local692.aByteArray65, local692.anInt5695);
			Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local498);
			Static291.aBoolean656 = true;
		}
		if (Static131.aClass137ArrayArrayArray2 != null) {
			if (Static57.anInt883 == 2) {
				Static338.method4861();
			} else if (Static57.anInt883 == 3) {
				Static413.method5599();
			}
		}
		if (Static222.aBoolean314) {
			Static222.aBoolean314 = false;
		} else {
			Static285.aFloat4 /= 2.0F;
		}
		if (Static418.aBoolean626) {
			Static418.aBoolean626 = false;
		} else {
			Static1.aFloat2 /= 2.0F;
		}
		Static165.method3937();
		if (Static40.anInt629 != 30) {
			return;
		}
		Static420.method5671();
		Static334.method4809();
		Static311.method5113();
		Static212.method3191();
		Static108.anInt2094++;
		if (Static108.anInt2094 > 750) {
			Static205.method4048();
			return;
		}
		Static30.method426();
		Static138.method5726();
		Static154.method2452();
		for (local498 = Static237.aClass80_1.method1615(true); local498 != -1; local498 = Static237.aClass80_1.method1615(false)) {
			Static158.method2501(local498);
			Static163.anIntArray220[Static271.anInt4570++ & 0x1F] = local498;
		}
		@Pc(876) Class229 local876;
		for (@Pc(811) Class1_Sub1_Sub1 local811 = Static254.method3625(); local811 != null; local811 = Static254.method3625()) {
			local424 = local811.method30();
			local144 = local811.method24();
			if (local424 == 1) {
				Static103.anIntArray102[local144] = local811.anInt35;
				Static330.aBoolean487 |= Static342.aBooleanArray23[local144];
				Static452.anIntArray584[Static357.anInt6539++ & 0x1F] = local144;
			} else if (local424 == 2) {
				Static431.aStringArray43[local144] = local811.aString1;
				Static290.anIntArray377[Static330.anInt6005++ & 0x1F] = local144;
			} else if (local424 == 3) {
				local876 = Static203.method1670(local144);
				if (!local811.aString1.equals(local876.aString79)) {
					local876.aString79 = local811.aString1;
					Static373.method5289(local876);
				}
			} else if (local424 == 4) {
				local876 = Static203.method1670(local144);
				local468 = local811.anInt35;
				local227 = local811.anInt39;
				local233 = local811.anInt32;
				if (local468 != local876.anInt6917 || local227 != local876.anInt6929 || local876.anInt6894 != local233) {
					local876.anInt6917 = local468;
					local876.anInt6894 = local233;
					local876.anInt6929 = local227;
					Static373.method5289(local876);
				}
			} else if (local424 == 5) {
				local876 = Static203.method1670(local144);
				if (local876.anInt6901 != local811.anInt35 || local811.anInt35 == -1) {
					local876.anInt6901 = local811.anInt35;
					local876.anInt6879 = 0;
					local876.anInt6898 = 1;
					local876.anInt6916 = 0;
					Static373.method5289(local876);
				}
			} else if (local424 == 6) {
				local162 = local811.anInt35;
				local468 = local162 >> 10 & 0x1F;
				local227 = local162 >> 5 & 0x1F;
				local233 = local162 & 0x1F;
				local245 = (local468 << 19) + (local227 << 11) + (local233 << 3);
				@Pc(972) Class229 local972 = Static203.method1670(local144);
				if (local972.anInt6915 != local245) {
					local972.anInt6915 = local245;
					Static373.method5289(local972);
				}
			} else if (local424 == 7) {
				local876 = Static203.method1670(local144);
				local177 = local811.anInt35 == 1;
				if (local876.aBoolean557 != local177) {
					local876.aBoolean557 = local177;
					Static373.method5289(local876);
				}
			} else if (local424 == 8) {
				local876 = Static203.method1670(local144);
				if (local811.anInt35 != local876.anInt6942 || local811.anInt39 != local876.anInt6881 || local811.anInt32 != local876.anInt6857) {
					local876.anInt6881 = local811.anInt39;
					local876.anInt6857 = local811.anInt32;
					local876.anInt6942 = local811.anInt35;
					if (local876.anInt6918 != -1) {
						if (local876.anInt6872 > 0) {
							local876.anInt6857 = local876.anInt6857 * 32 / local876.anInt6872;
						} else if (local876.anInt6883 > 0) {
							local876.anInt6857 = local876.anInt6857 * 32 / local876.anInt6883;
						}
					}
					Static373.method5289(local876);
				}
			} else if (local424 == 9) {
				local876 = Static203.method1670(local144);
				if (local876.anInt6918 != local811.anInt35 || local876.anInt6933 != local811.anInt39) {
					local876.anInt6933 = local811.anInt39;
					local876.anInt6918 = local811.anInt35;
					Static373.method5289(local876);
				}
			} else if (local424 == 10) {
				local876 = Static203.method1670(local144);
				if (local811.anInt35 != local876.anInt6866 || local811.anInt39 != local876.anInt6880 || local811.anInt32 != local876.anInt6909) {
					local876.anInt6909 = local811.anInt32;
					local876.anInt6880 = local811.anInt39;
					local876.anInt6866 = local811.anInt35;
					Static373.method5289(local876);
				}
			} else if (local424 == 11) {
				local876 = Static203.method1670(local144);
				local876.anInt6896 = local876.anInt6865 = local811.anInt39;
				local876.aByte92 = 0;
				local876.anInt6864 = local876.anInt6887 = local811.anInt35;
				local876.aByte93 = 0;
				Static373.method5289(local876);
			} else if (local424 == 12) {
				local876 = Static203.method1670(local144);
				local468 = local811.anInt35;
				if (local876 != null && local876.anInt6863 == 0) {
					if (local468 > local876.anInt6884 - local876.anInt6895) {
						local468 = local876.anInt6884 - local876.anInt6895;
					}
					if (local468 < 0) {
						local468 = 0;
					}
					if (local876.anInt6871 != local468) {
						local876.anInt6871 = local468;
						Static373.method5289(local876);
					}
				}
			} else if (local424 == 14) {
				local876 = Static203.method1670(local144);
				local876.anInt6934 = local811.anInt35;
			} else if (local424 == 15) {
				Static334.aBoolean489 = true;
				Static326.anInt5983 = local811.anInt39;
				Static57.anInt866 = local811.anInt35;
			} else if (local424 == 16) {
				local876 = Static203.method1670(local144);
				local876.anInt6892 = local811.anInt35;
			}
		}
		if (Static282.anInt4734 != 0) {
			Static290.anInt4875 += 20;
			if (Static290.anInt4875 >= 400) {
				Static282.anInt4734 = 0;
			}
		}
		Static384.anInt6843++;
		if (Static40.aClass229_1 != null) {
			Static92.anInt1801++;
			if (Static92.anInt1801 >= 15) {
				Static373.method5289(Static40.aClass229_1);
				Static40.aClass229_1 = null;
			}
		}
		Static297.aClass229_8 = null;
		Static104.aBoolean164 = false;
		Static413.aClass229_13 = null;
		Static196.aBoolean280 = false;
		Static130.method3751(-1, -1, null);
		Static296.method4063(-1, null, -1);
		if (!Static217.aBoolean311) {
			Static139.anInt2525 = -1;
		}
		Static175.method4328();
		Static270.anInt2350++;
		if (Static257.aBoolean347) {
			Static224.method3272(Static413.aClass254_135);
			Static201.aClass1_Sub14_Sub2_2.method4508(Static15.anInt284 | Static253.anInt1024 << 28 | Static394.anInt7050 << 14);
			Static257.aBoolean347 = false;
		}
		while (true) {
			@Pc(1448) Class1_Sub16 local1448;
			@Pc(1453) Class229 local1453;
			do {
				local1448 = (Class1_Sub16) Static306.aClass142_31.method3196();
				if (local1448 == null) {
					while (true) {
						do {
							local1448 = (Class1_Sub16) Static135.aClass142_16.method3196();
							if (local1448 == null) {
								while (true) {
									do {
										local1448 = (Class1_Sub16) Static38.aClass142_8.method3196();
										if (local1448 == null) {
											if (Static413.aClass229_13 == null) {
												Static105.anInt2085 = 0;
											}
											if (Static206.aClass229_6 != null) {
												Static420.method5672();
											}
											if (Static64.anInt1161 > 0 && Static254.aClass10_1.method221(82) && Static254.aClass10_1.method221(81) && Static152.anInt2736 != 0) {
												local424 = Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 - Static152.anInt2736;
												if (local424 < 0) {
													local424 = 0;
												} else if (local424 > 3) {
													local424 = 3;
												}
												Static228.method3290(Static331.anInt6034 + Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0], Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] + Static190.anInt3507, local424);
											}
											Static323.method4448();
											for (local424 = 0; local424 < 5; local424++) {
												@Pc(1640) int local1640 = Static253.anIntArray50[local424]++;
											}
											if (Static330.aBoolean487 && Static107.method1707() - 60000L > Static443.aLong233) {
												Static51.method746();
											}
											Static410.anInt7200++;
											if (Static410.anInt7200 > 500) {
												Static410.anInt7200 = 0;
												local144 = (int) (Math.random() * 8.0D);
												if ((local144 & 0x1) == 1) {
													Static242.anInt4632 += Static78.anInt1453;
												}
												if ((local144 & 0x4) == 4) {
													Static402.anInt7349 += Static451.anInt7776;
												}
												if ((local144 & 0x2) == 2) {
													Static378.anInt6795 += Static62.anInt1137;
												}
											}
											if (Static242.anInt4632 < -50) {
												Static78.anInt1453 = 2;
											}
											if (Static242.anInt4632 > 50) {
												Static78.anInt1453 = -2;
											}
											if (Static378.anInt6795 < -55) {
												Static62.anInt1137 = 2;
											}
											if (Static378.anInt6795 > 55) {
												Static62.anInt1137 = -2;
											}
											if (Static402.anInt7349 < -40) {
												Static451.anInt7776 = 1;
											}
											if (Static402.anInt7349 > 40) {
												Static451.anInt7776 = -1;
											}
											Static235.anInt4108++;
											if (Static235.anInt4108 > 500) {
												Static235.anInt4108 = 0;
												local144 = (int) (Math.random() * 8.0D);
												if ((local144 & 0x2) == 2) {
													Static25.anInt430 += Static106.anInt2089;
												}
												if ((local144 & 0x1) == 1) {
													Static388.anInt7297 += Static73.anInt1379;
												}
											}
											if (Static388.anInt7297 < -60) {
												Static73.anInt1379 = 2;
											}
											if (Static388.anInt7297 > 60) {
												Static73.anInt1379 = -2;
											}
											if (Static25.anInt430 < -20) {
												Static106.anInt2089 = 1;
											}
											if (Static25.anInt430 > 10) {
												Static106.anInt2089 = -1;
											}
											anInt6247++;
											if (anInt6247 > 50) {
												Static224.method3272(Static133.aClass254_49);
											}
											if (Static286.aBoolean380) {
												Static112.method1766();
												Static286.aBoolean380 = false;
											}
											try {
												if (Static169.aClass114_4 != null && Static201.aClass1_Sub14_Sub2_2.anInt5695 > 0) {
													Static9.anInt212 += Static201.aClass1_Sub14_Sub2_2.anInt5695;
													Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
													anInt6247 = 0;
													Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
													return;
												}
												return;
											} catch (@Pc(1846) IOException local1846) {
												Static205.method4048();
												return;
											}
										}
										local1453 = local1448.aClass229_4;
										if (local1453.anInt6860 < 0) {
											break;
										}
										local876 = Static203.method1670(local1453.anInt6882);
									} while (local876 == null || local876.aClass229Array2 == null || local1453.anInt6860 >= local876.aClass229Array2.length || local1453 != local876.aClass229Array2[local1453.anInt6860]);
									Static354.method5070(local1448);
								}
							}
							local1453 = local1448.aClass229_4;
							if (local1453.anInt6860 < 0) {
								break;
							}
							local876 = Static203.method1670(local1453.anInt6882);
						} while (local876 == null || local876.aClass229Array2 == null || local1453.anInt6860 >= local876.aClass229Array2.length || local876.aClass229Array2[local1453.anInt6860] != local1453);
						Static354.method5070(local1448);
					}
				}
				local1453 = local1448.aClass229_4;
				if (local1453.anInt6860 < 0) {
					break;
				}
				local876 = Static203.method1670(local1453.anInt6882);
			} while (local876 == null || local876.aClass229Array2 == null || local1453.anInt6860 >= local876.aClass229Array2.length || local1453 != local876.aClass229Array2[local1453.anInt6860]);
			Static354.method5070(local1448);
		}
	}
}
