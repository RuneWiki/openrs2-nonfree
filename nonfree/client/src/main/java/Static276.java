import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!ra;")
	public static Class170 aClass170_91;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	public static int anInt5396 = 0;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString310 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	public static int anInt5400 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!jf;)Lclient!jf;")
	public static Class96 method4702(@OriginalArg(1) Class96 arg0) {
		@Pc(11) Class96 local11 = Static43.method983(arg0);
		if (local11 == null) {
			local11 = arg0.aClass96_8;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method4703(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub19 local10 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg0);
		if (local10 != null) {
			local10.method5803();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!am;)[Lclient!d;")
	public static Class43[] method4705(@OriginalArg(1) Class10 arg0) {
		if (!arg0.method313()) {
			return new Class43[0];
		}
		@Pc(16) Class60 local16 = arg0.method315();
		while (local16.anInt1838 == 0) {
			Static105.method2138(10L);
		}
		if (local16.anInt1838 == 2) {
			return new Class43[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject2;
		@Pc(46) Class43[] local46 = new Class43[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(61) Class43 local61 = new Class43();
			local46[local48] = local61;
			local61.anInt1217 = local40[local48 << 2];
			local61.anInt1214 = local40[(local48 << 2) + 1];
			local61.anInt1213 = local40[(local48 << 2) + 2];
			local61.anInt1215 = local40[(local48 << 2) + 3];
		}
		return local46;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static189.method3465(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static130.aClass3Array2[arg0].method5638(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static10.anInt345) {
					if (!Static49.method1101(local10, local23, local14)) {
						return false;
					}
					if (!Static49.method1101(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static49.method1101(local10, local27, local14)) {
						return false;
					}
					if (!Static49.method1101(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static49.method1101(local10, local31, local14)) {
					return false;
				}
				if (!Static49.method1101(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static21.anInt6206) {
					if (!Static49.method1101(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static49.method1101(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static49.method1101(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static49.method1101(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static10.anInt345) {
					if (!Static49.method1101(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static49.method1101(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static49.method1101(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static49.method1101(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static21.anInt6206) {
					if (!Static49.method1101(local10, local23, local14)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static49.method1101(local10, local27, local14)) {
						return false;
					}
					if (!Static49.method1101(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static49.method1101(local10, local31, local14)) {
					return false;
				}
				if (!Static49.method1101(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static49.method1101(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static49.method1101(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static49.method1101(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static49.method1101(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static49.method1101(local10, local31, local14);
		} else {
			return true;
		}
	}
}
