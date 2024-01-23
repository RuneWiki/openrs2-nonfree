import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public static int anInt3643;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "[I")
	public static int[] anIntArray306 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
	public static boolean method2900() {
		@Pc(6) Class61 local6 = Static210.aClass61_1;
		synchronized (Static210.aClass61_1) {
			if (Static205.anInt3999 == Static89.anInt1842) {
				return false;
			} else {
				Static28.anInt525 = Static24.anIntArray44[Static205.anInt3999];
				Static69.aChar1 = Static57.aCharArray9[Static205.anInt3999];
				Static205.anInt3999 = Static205.anInt3999 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	public static void method2901() {
		Static220.anInt4353 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static241.anInt4625; local3++) {
			@Pc(10) Class145 local10 = Static237.aClass145Array2[local3];
			@Pc(14) int local14;
			if (Static67.anIntArray138 != null) {
				for (local14 = 0; local14 < Static67.anIntArray138.length; local14++) {
					if (Static67.anIntArray138[local14] != -1000000 && (local10.anInt4478 <= Static67.anIntArray138[local14] || local10.anInt4470 <= Static67.anIntArray138[local14]) && (local10.anInt4481 <= Static217.anIntArray388[local14] || local10.anInt4457 <= Static217.anIntArray388[local14]) && (local10.anInt4481 >= Static225.anIntArray399[local14] || local10.anInt4457 >= Static225.anIntArray399[local14]) && (local10.anInt4477 <= Static227.anIntArray349[local14] || local10.anInt4479 <= Static227.anIntArray349[local14]) && (local10.anInt4477 >= Static234.anIntArray424[local14] || local10.anInt4479 >= Static234.anIntArray424[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt4476 == 1) {
				local14 = local10.anInt4480 + Static225.anInt4462 - Static273.anInt1119;
				if (local14 >= 0 && local14 <= Static225.anInt4462 + Static225.anInt4462) {
					local115 = local10.anInt4465 + Static225.anInt4462 - Static89.anInt1839;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4466 + Static225.anInt4462 - Static89.anInt1839;
					if (local126 > Static225.anInt4462 + Static225.anInt4462) {
						local126 = Static225.anInt4462 + Static225.anInt4462;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static191.aBooleanArrayArray8[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static175.anInt3456 - local10.anInt4481;
						if (local158 > 32) {
							local10.anInt4469 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4469 = 2;
							local158 = -local158;
						}
						local10.anInt4461 = (local10.anInt4477 - Static165.anInt3299 << 8) / local158;
						local10.anInt4468 = (local10.anInt4479 - Static165.anInt3299 << 8) / local158;
						local10.anInt4458 = (local10.anInt4478 - Static27.anInt1303 << 8) / local158;
						local10.anInt4459 = (local10.anInt4470 - Static27.anInt1303 << 8) / local158;
						Static11.aClass145Array1[Static220.anInt4353++] = local10;
					}
				}
			} else if (local10.anInt4476 == 2) {
				local14 = local10.anInt4465 + Static225.anInt4462 - Static89.anInt1839;
				if (local14 >= 0 && local14 <= Static225.anInt4462 + Static225.anInt4462) {
					local115 = local10.anInt4480 + Static225.anInt4462 - Static273.anInt1119;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4473 + Static225.anInt4462 - Static273.anInt1119;
					if (local126 > Static225.anInt4462 + Static225.anInt4462) {
						local126 = Static225.anInt4462 + Static225.anInt4462;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static191.aBooleanArrayArray8[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static165.anInt3299 - local10.anInt4477;
						if (local158 > 32) {
							local10.anInt4469 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4469 = 4;
							local158 = -local158;
						}
						local10.anInt4472 = (local10.anInt4481 - Static175.anInt3456 << 8) / local158;
						local10.anInt4460 = (local10.anInt4457 - Static175.anInt3456 << 8) / local158;
						local10.anInt4458 = (local10.anInt4478 - Static27.anInt1303 << 8) / local158;
						local10.anInt4459 = (local10.anInt4470 - Static27.anInt1303 << 8) / local158;
						Static11.aClass145Array1[Static220.anInt4353++] = local10;
					}
				}
			} else if (local10.anInt4476 == 4) {
				local14 = local10.anInt4478 - Static27.anInt1303;
				if (local14 > 128) {
					local115 = local10.anInt4465 + Static225.anInt4462 - Static89.anInt1839;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4466 + Static225.anInt4462 - Static89.anInt1839;
					if (local126 > Static225.anInt4462 + Static225.anInt4462) {
						local126 = Static225.anInt4462 + Static225.anInt4462;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4480 + Static225.anInt4462 - Static273.anInt1119;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4473 + Static225.anInt4462 - Static273.anInt1119;
						if (local158 > Static225.anInt4462 + Static225.anInt4462) {
							local158 = Static225.anInt4462 + Static225.anInt4462;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static191.aBooleanArrayArray8[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt4469 = 5;
							local10.anInt4472 = (local10.anInt4481 - Static175.anInt3456 << 8) / local14;
							local10.anInt4460 = (local10.anInt4457 - Static175.anInt3456 << 8) / local14;
							local10.anInt4461 = (local10.anInt4477 - Static165.anInt3299 << 8) / local14;
							local10.anInt4468 = (local10.anInt4479 - Static165.anInt3299 << 8) / local14;
							Static11.aClass145Array1[Static220.anInt4353++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	public static int method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method2904(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) char local3 = ',';
		@Pc(9) char local9 = '.';
		@Pc(11) boolean local11 = false;
		@Pc(21) StringBuffer local21 = new StringBuffer(26);
		if (arg1 == 0) {
			local9 = ',';
			local3 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		if (arg0 < 0L) {
			local11 = true;
			arg0 = -arg0;
		}
		@Pc(51) int local51;
		@Pc(57) int local57;
		if (arg2 > 0) {
			for (local51 = 0; local51 < arg2; local51++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local21.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local21.append(local3);
		}
		local51 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local21.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local11) {
					local21.append('-');
				}
				return local21.reverse().toString();
			}
			if (arg3) {
				local51++;
				if (local51 % 3 == 0) {
					local21.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method2907(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method2908() {
		anIntArray306 = null;
		anIntArray307 = null;
	}
}
