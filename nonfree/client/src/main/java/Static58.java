import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!qg;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "[Lclient!fa;")
	public static final Class50_Sub1[] aClass50_Sub1Array1 = new Class50_Sub1[30];

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_9 = new Class5(10);

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_8 = new Class229();

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_45 = new Class92(39, 3);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)Z")
	public static boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static220.method3499(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static287.anInt5248;
		@Pc(14) int local14 = arg2 << Static287.anInt5248;
		@Pc(23) int local23 = Static120.aClass64Array1[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static287.anInt5248 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static287.anInt5248 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static287.anInt5248 - 7);
		if (arg3 == 1) {
			if (local10 > Static28.anInt787) {
				if (!Static386.method5263(local10, local23, local14)) {
					return false;
				}
				if (!Static386.method5263(local10, local23, local14 + Static340.anInt6290)) {
					return false;
				}
				if (!Static386.method5263(local10, local23, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static386.method5263(local10, local31, local14)) {
					return false;
				}
				if (!Static386.method5263(local10, local31, local14 + Static340.anInt6290)) {
					return false;
				}
				if (!Static386.method5263(local10, local31, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (!Static386.method5263(local10, local39, local14)) {
				return false;
			} else if (Static386.method5263(local10, local39, local14 + Static340.anInt6290)) {
				return Static386.method5263(local10, local39, local14 + Static122.anInt2633);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static91.anInt1938) {
				if (!Static386.method5263(local10, local23, local14 + Static122.anInt2633)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static340.anInt6290, local23, local14 + Static122.anInt2633)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local23, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static386.method5263(local10, local31, local14 + Static122.anInt2633)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static340.anInt6290, local31, local14 + Static122.anInt2633)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local31, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (!Static386.method5263(local10, local39, local14 + Static122.anInt2633)) {
				return false;
			} else if (Static386.method5263(local10 + Static340.anInt6290, local39, local14 + Static122.anInt2633)) {
				return Static386.method5263(local10 + Static122.anInt2633, local39, local14 + Static122.anInt2633);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static28.anInt787) {
				if (!Static386.method5263(local10 + Static122.anInt2633, local23, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local23, local14 + Static340.anInt6290)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local23, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static386.method5263(local10 + Static122.anInt2633, local31, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local31, local14 + Static340.anInt6290)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local31, local14 + Static122.anInt2633)) {
					return false;
				}
			}
			if (!Static386.method5263(local10 + Static122.anInt2633, local39, local14)) {
				return false;
			} else if (Static386.method5263(local10 + Static122.anInt2633, local39, local14 + Static340.anInt6290)) {
				return Static386.method5263(local10 + Static122.anInt2633, local39, local14 + Static122.anInt2633);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static91.anInt1938) {
				if (!Static386.method5263(local10, local23, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static340.anInt6290, local23, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static386.method5263(local10, local31, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static340.anInt6290, local31, local14)) {
					return false;
				}
				if (!Static386.method5263(local10 + Static122.anInt2633, local31, local14)) {
					return false;
				}
			}
			if (!Static386.method5263(local10, local39, local14)) {
				return false;
			} else if (Static386.method5263(local10 + Static340.anInt6290, local39, local14)) {
				return Static386.method5263(local10 + Static122.anInt2633, local39, local14);
			} else {
				return false;
			}
		} else if (!Static386.method5263(local10 + Static340.anInt6290, local47, local14 + Static340.anInt6290)) {
			return false;
		} else if (arg3 == 16) {
			return Static386.method5263(local10, local39, local14 + Static122.anInt2633);
		} else if (arg3 == 32) {
			return Static386.method5263(local10 + Static122.anInt2633, local39, local14 + Static122.anInt2633);
		} else if (arg3 == 64) {
			return Static386.method5263(local10 + Static122.anInt2633, local39, local14);
		} else if (arg3 == 128) {
			return Static386.method5263(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIZ)V")
	public static void method1177(@OriginalArg(0) boolean arg0) {
		Static413.anInt3900++;
		Static208.method3392();
		if (arg0) {
			Static344.anInt6255++;
			Static301.method4450();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1178(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static317.anInt5757; local9++) {
			if (arg0.equalsIgnoreCase(Static170.aStringArray78[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47);
	}
}
