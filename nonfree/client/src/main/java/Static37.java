import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!d;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method637(@OriginalArg(1) Class53 arg0) {
		Static53.anInt1015 = arg0.method1037("p11_full");
		Static210.anInt3845 = arg0.method1037("p12_full");
		Static336.anInt6137 = arg0.method1037("b12_full");
		Static196.anInt3680 = arg0.method1037("hitmarks");
		Static142.anInt2558 = arg0.method1037("hitbar_default");
		Static127.anInt4327 = arg0.method1037("timerbar_default");
		Static211.anInt3848 = arg0.method1037("headicons_pk");
		Static295.anInt5560 = arg0.method1037("headicons_prayer");
		Static175.anInt3296 = arg0.method1037("hint_headicons");
		Static66.anInt1232 = arg0.method1037("hint_mapmarkers");
		Static298.anInt5635 = arg0.method1037("mapflag");
		Static289.anInt5436 = arg0.method1037("cross");
		Static306.anInt5793 = arg0.method1037("mapdots");
		Static52.anInt1005 = arg0.method1037("scrollbar");
		Static18.anInt312 = arg0.method1037("name_icons");
		Static276.anInt5208 = arg0.method1037("floorshadows");
		Static292.anInt5493 = arg0.method1037("compass");
		Static180.anInt3824 = arg0.method1037("hint_mapedge");
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method638() {
		@Pc(5) Class70 local5 = Static290.aClass70_91;
		synchronized (Static290.aClass70_91) {
			Static290.aClass70_91.method1397(5);
		}
		local5 = Static66.aClass70_27;
		synchronized (Static66.aClass70_27) {
			Static66.aClass70_27.method1397(5);
		}
		@Pc(38) Class137 local38 = Static270.aClass137_1;
		synchronized (Static270.aClass137_1) {
			Static270.aClass137_1.method3636();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V")
	public static void method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static41.anIntArray720[arg1] = arg0;
		@Pc(19) Class6_Sub37 local19 = (Class6_Sub37) Static56.aClass108_19.method2900((long) arg1);
		if (local19 == null) {
			local19 = new Class6_Sub37(4611686018427387905L);
			Static56.aClass108_19.method2898((long) arg1, local19);
		} else if (local19.aLong193 != 4611686018427387905L) {
			local19.aLong193 = Static245.method4300() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)Z")
	public static boolean method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static198.method3634(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static203.aClass106Array3[arg0].method5720(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static209.anInt3813) {
					if (!Static151.method3070(local10, local23, local14)) {
						return false;
					}
					if (!Static151.method3070(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static151.method3070(local10, local27, local14)) {
						return false;
					}
					if (!Static151.method3070(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static151.method3070(local10, local31, local14)) {
					return false;
				}
				if (!Static151.method3070(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static256.anInt4741) {
					if (!Static151.method3070(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static151.method3070(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static151.method3070(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static151.method3070(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static209.anInt3813) {
					if (!Static151.method3070(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static151.method3070(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static151.method3070(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static151.method3070(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static256.anInt4741) {
					if (!Static151.method3070(local10, local23, local14)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static151.method3070(local10, local27, local14)) {
						return false;
					}
					if (!Static151.method3070(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static151.method3070(local10, local31, local14)) {
					return false;
				}
				if (!Static151.method3070(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static151.method3070(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static151.method3070(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static151.method3070(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static151.method3070(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static151.method3070(local10, local31, local14);
		} else {
			return true;
		}
	}
}
