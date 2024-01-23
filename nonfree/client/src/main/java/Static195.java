import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!pk;")
	public static Class132 aClass132_54;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt2790 = 0;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
	public static void method2231() {
		Static206.anInt4273 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static153.anInt3126; local3++) {
			@Pc(10) Class50 local10 = Static236.aClass50Array2[local3];
			@Pc(14) int local14;
			if (Static204.anIntArray317 != null) {
				for (local14 = 0; local14 < Static204.anIntArray317.length; local14++) {
					if (Static204.anIntArray317[local14] != -1000000 && (local10.anInt1550 <= Static204.anIntArray317[local14] || local10.anInt1553 <= Static204.anIntArray317[local14]) && (local10.anInt1540 <= Static137.anIntArray119[local14] || local10.anInt1544 <= Static137.anIntArray119[local14]) && (local10.anInt1540 >= Static202.anIntArray316[local14] || local10.anInt1544 >= Static202.anIntArray316[local14]) && (local10.anInt1549 <= Static95.anIntArray132[local14] || local10.anInt1560 <= Static95.anIntArray132[local14]) && (local10.anInt1549 >= Static146.anIntArray235[local14] || local10.anInt1560 >= Static146.anIntArray235[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt1555 == 1) {
				local14 = local10.anInt1545 + Static260.anInt5236 - Static212.anInt4369;
				if (local14 >= 0 && local14 <= Static260.anInt5236 + Static260.anInt5236) {
					local115 = local10.anInt1557 + Static260.anInt5236 - Static136.anInt2745;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1542 + Static260.anInt5236 - Static136.anInt2745;
					if (local126 > Static260.anInt5236 + Static260.anInt5236) {
						local126 = Static260.anInt5236 + Static260.anInt5236;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static41.aBooleanArrayArray2[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static228.anInt4644 - local10.anInt1540;
						if (local158 > 32) {
							local10.anInt1559 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1559 = 2;
							local158 = -local158;
						}
						local10.anInt1546 = (local10.anInt1549 - Static64.anInt1382 << 8) / local158;
						local10.anInt1543 = (local10.anInt1560 - Static64.anInt1382 << 8) / local158;
						local10.anInt1561 = (local10.anInt1550 - Static256.anInt5058 << 8) / local158;
						local10.anInt1556 = (local10.anInt1553 - Static256.anInt5058 << 8) / local158;
						Static201.aClass50Array1[Static206.anInt4273++] = local10;
					}
				}
			} else if (local10.anInt1555 == 2) {
				local14 = local10.anInt1557 + Static260.anInt5236 - Static136.anInt2745;
				if (local14 >= 0 && local14 <= Static260.anInt5236 + Static260.anInt5236) {
					local115 = local10.anInt1545 + Static260.anInt5236 - Static212.anInt4369;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1547 + Static260.anInt5236 - Static212.anInt4369;
					if (local126 > Static260.anInt5236 + Static260.anInt5236) {
						local126 = Static260.anInt5236 + Static260.anInt5236;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static41.aBooleanArrayArray2[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static64.anInt1382 - local10.anInt1549;
						if (local158 > 32) {
							local10.anInt1559 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1559 = 4;
							local158 = -local158;
						}
						local10.anInt1548 = (local10.anInt1540 - Static228.anInt4644 << 8) / local158;
						local10.anInt1552 = (local10.anInt1544 - Static228.anInt4644 << 8) / local158;
						local10.anInt1561 = (local10.anInt1550 - Static256.anInt5058 << 8) / local158;
						local10.anInt1556 = (local10.anInt1553 - Static256.anInt5058 << 8) / local158;
						Static201.aClass50Array1[Static206.anInt4273++] = local10;
					}
				}
			} else if (local10.anInt1555 == 4) {
				local14 = local10.anInt1550 - Static256.anInt5058;
				if (local14 > 128) {
					local115 = local10.anInt1557 + Static260.anInt5236 - Static136.anInt2745;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1542 + Static260.anInt5236 - Static136.anInt2745;
					if (local126 > Static260.anInt5236 + Static260.anInt5236) {
						local126 = Static260.anInt5236 + Static260.anInt5236;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt1545 + Static260.anInt5236 - Static212.anInt4369;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt1547 + Static260.anInt5236 - Static212.anInt4369;
						if (local158 > Static260.anInt5236 + Static260.anInt5236) {
							local158 = Static260.anInt5236 + Static260.anInt5236;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static41.aBooleanArrayArray2[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt1559 = 5;
							local10.anInt1548 = (local10.anInt1540 - Static228.anInt4644 << 8) / local14;
							local10.anInt1552 = (local10.anInt1544 - Static228.anInt4644 << 8) / local14;
							local10.anInt1546 = (local10.anInt1549 - Static64.anInt1382 << 8) / local14;
							local10.anInt1543 = (local10.anInt1560 - Static64.anInt1382 << 8) / local14;
							Static201.aClass50Array1[Static206.anInt4273++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public static int method2233() {
		if (Static65.aBoolean465) {
			return 0;
		} else if (Static158.method2553()) {
			return Static11.aBoolean244 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
