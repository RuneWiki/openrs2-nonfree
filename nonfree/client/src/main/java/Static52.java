import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
	public static int anInt1464;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method1200(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)Z")
	public static boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static411.method6068(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static62.anInt1705;
		@Pc(14) int local14 = arg2 << Static62.anInt1705;
		@Pc(23) int local23 = Static55.aClass86Array1[arg0].method6594(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static62.anInt1705 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static62.anInt1705 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static62.anInt1705 - 7);
		if (arg3 == 1) {
			if (local10 > Static332.anInt5784) {
				if (!Static75.method1489(local10, local23, local14)) {
					return false;
				}
				if (!Static75.method1489(local10, local23, local14 + Static437.anInt7761)) {
					return false;
				}
				if (!Static75.method1489(local10, local23, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static75.method1489(local10, local31, local14)) {
					return false;
				}
				if (!Static75.method1489(local10, local31, local14 + Static437.anInt7761)) {
					return false;
				}
				if (!Static75.method1489(local10, local31, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (!Static75.method1489(local10, local39, local14)) {
				return false;
			} else if (Static75.method1489(local10, local39, local14 + Static437.anInt7761)) {
				return Static75.method1489(local10, local39, local14 + Static168.anInt3377);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static440.anInt7781) {
				if (!Static75.method1489(local10, local23, local14 + Static168.anInt3377)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static437.anInt7761, local23, local14 + Static168.anInt3377)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local23, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static75.method1489(local10, local31, local14 + Static168.anInt3377)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static437.anInt7761, local31, local14 + Static168.anInt3377)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local31, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (!Static75.method1489(local10, local39, local14 + Static168.anInt3377)) {
				return false;
			} else if (Static75.method1489(local10 + Static437.anInt7761, local39, local14 + Static168.anInt3377)) {
				return Static75.method1489(local10 + Static168.anInt3377, local39, local14 + Static168.anInt3377);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static332.anInt5784) {
				if (!Static75.method1489(local10 + Static168.anInt3377, local23, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local23, local14 + Static437.anInt7761)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local23, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static75.method1489(local10 + Static168.anInt3377, local31, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local31, local14 + Static437.anInt7761)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local31, local14 + Static168.anInt3377)) {
					return false;
				}
			}
			if (!Static75.method1489(local10 + Static168.anInt3377, local39, local14)) {
				return false;
			} else if (Static75.method1489(local10 + Static168.anInt3377, local39, local14 + Static437.anInt7761)) {
				return Static75.method1489(local10 + Static168.anInt3377, local39, local14 + Static168.anInt3377);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static440.anInt7781) {
				if (!Static75.method1489(local10, local23, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static437.anInt7761, local23, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static75.method1489(local10, local31, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static437.anInt7761, local31, local14)) {
					return false;
				}
				if (!Static75.method1489(local10 + Static168.anInt3377, local31, local14)) {
					return false;
				}
			}
			if (!Static75.method1489(local10, local39, local14)) {
				return false;
			} else if (Static75.method1489(local10 + Static437.anInt7761, local39, local14)) {
				return Static75.method1489(local10 + Static168.anInt3377, local39, local14);
			} else {
				return false;
			}
		} else if (!Static75.method1489(local10 + Static437.anInt7761, local47, local14 + Static437.anInt7761)) {
			return false;
		} else if (arg3 == 16) {
			return Static75.method1489(local10, local39, local14 + Static168.anInt3377);
		} else if (arg3 == 32) {
			return Static75.method1489(local10 + Static168.anInt3377, local39, local14 + Static168.anInt3377);
		} else if (arg3 == 64) {
			return Static75.method1489(local10 + Static168.anInt3377, local39, local14);
		} else if (arg3 == 128) {
			return Static75.method1489(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIZI)V")
	public static void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static350.anInt6300 = arg2;
		Static329.anInt5678 = arg3;
		Static255.anInt4644 = arg5;
		Static286.anInt5115 = arg4;
		Static59.anInt1662 = arg1;
		Static413.anInt7421 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)I")
	public static int method1203(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1204(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if ((long) 0 == arg0 % 37L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static155.aCharArray1[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(74) int local74 = local48.length() - 1;
					local66 = ' ';
					local48.setCharAt(local74, Character.toUpperCase(local48.charAt(local74)));
				}
				local48.append(local66);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}
}
