import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public static int anInt4102 = 0;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
	public static boolean method3398(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class3_Sub11 local18 = (Class3_Sub11) Static255.aClass71_43.method2089(); local18 != null; local18 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			if (Static153.method2639(local18.anInt1419) && (long) arg0 == local18.aLong48) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ[Lclient!qf;III)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class245[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) Class245 local13 = arg2[local7];
			if (local13 != null && local13.anInt7238 == arg3) {
				Static132.method2301(arg0, arg1, arg4, local13);
				Static254.method4345(local13, arg0, arg4);
				if (local13.anInt7287 - local13.anInt7249 < local13.anInt7268) {
					local13.anInt7268 = local13.anInt7287 - local13.anInt7249;
				}
				if (local13.anInt7268 < 0) {
					local13.anInt7268 = 0;
				}
				if (local13.anInt7309 > local13.anInt7243 - local13.anInt7229) {
					local13.anInt7309 = local13.anInt7243 - local13.anInt7229;
				}
				if (local13.anInt7309 < 0) {
					local13.anInt7309 = 0;
				}
				if (local13.anInt7223 == 0) {
					Static264.method4639(arg1, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;IBLjava/lang/String;)V")
	public static void method3400(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		Static244.method4213(-1, arg1, true, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
	public static boolean method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static363.method5711(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static33.anInt880;
		@Pc(14) int local14 = arg2 << Static33.anInt880;
		@Pc(23) int local23 = Static511.aClass52Array3[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static33.anInt880 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static33.anInt880 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static33.anInt880 - 7);
		if (arg3 == 1) {
			if (local10 > Static184.anInt4224) {
				if (!Static434.method6594(local10, local23, local14)) {
					return false;
				}
				if (!Static434.method6594(local10, local23, local14 + Static467.anInt8424)) {
					return false;
				}
				if (!Static434.method6594(local10, local23, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static434.method6594(local10, local31, local14)) {
					return false;
				}
				if (!Static434.method6594(local10, local31, local14 + Static467.anInt8424)) {
					return false;
				}
				if (!Static434.method6594(local10, local31, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (!Static434.method6594(local10, local39, local14)) {
				return false;
			} else if (Static434.method6594(local10, local39, local14 + Static467.anInt8424)) {
				return Static434.method6594(local10, local39, local14 + Static219.anInt4777);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static371.anInt6982) {
				if (!Static434.method6594(local10, local23, local14 + Static219.anInt4777)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static467.anInt8424, local23, local14 + Static219.anInt4777)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local23, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static434.method6594(local10, local31, local14 + Static219.anInt4777)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static467.anInt8424, local31, local14 + Static219.anInt4777)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local31, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (!Static434.method6594(local10, local39, local14 + Static219.anInt4777)) {
				return false;
			} else if (Static434.method6594(local10 + Static467.anInt8424, local39, local14 + Static219.anInt4777)) {
				return Static434.method6594(local10 + Static219.anInt4777, local39, local14 + Static219.anInt4777);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static184.anInt4224) {
				if (!Static434.method6594(local10 + Static219.anInt4777, local23, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local23, local14 + Static467.anInt8424)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local23, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static434.method6594(local10 + Static219.anInt4777, local31, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local31, local14 + Static467.anInt8424)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local31, local14 + Static219.anInt4777)) {
					return false;
				}
			}
			if (!Static434.method6594(local10 + Static219.anInt4777, local39, local14)) {
				return false;
			} else if (Static434.method6594(local10 + Static219.anInt4777, local39, local14 + Static467.anInt8424)) {
				return Static434.method6594(local10 + Static219.anInt4777, local39, local14 + Static219.anInt4777);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static371.anInt6982) {
				if (!Static434.method6594(local10, local23, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static467.anInt8424, local23, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static434.method6594(local10, local31, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static467.anInt8424, local31, local14)) {
					return false;
				}
				if (!Static434.method6594(local10 + Static219.anInt4777, local31, local14)) {
					return false;
				}
			}
			if (!Static434.method6594(local10, local39, local14)) {
				return false;
			} else if (Static434.method6594(local10 + Static467.anInt8424, local39, local14)) {
				return Static434.method6594(local10 + Static219.anInt4777, local39, local14);
			} else {
				return false;
			}
		} else if (!Static434.method6594(local10 + Static467.anInt8424, local47, local14 + Static467.anInt8424)) {
			return false;
		} else if (arg3 == 16) {
			return Static434.method6594(local10, local39, local14 + Static219.anInt4777);
		} else if (arg3 == 32) {
			return Static434.method6594(local10 + Static219.anInt4777, local39, local14 + Static219.anInt4777);
		} else if (arg3 == 64) {
			return Static434.method6594(local10 + Static219.anInt4777, local39, local14);
		} else if (arg3 == 128) {
			return Static434.method6594(local10, local39, local14);
		} else {
			return true;
		}
	}
}
