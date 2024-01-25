import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_9 = new Class213("", 16);

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_18 = new Class227(8);

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
	public static final int[] anIntArray256 = new int[14];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!fi;Lclient!fi;)V")
	public static void method1645(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_244 != null) {
			arg0.method5577();
		}
		arg0.aClass1_244 = arg1.aClass1_244;
		arg0.aClass1_243 = arg1;
		arg0.aClass1_244.aClass1_243 = arg0;
		arg0.aClass1_243.aClass1_244 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1647() {
		if (Static237.anInt3958 == 2) {
			Static294.anInt5063 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static294.anInt5063 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
	public static boolean method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static83.method1224(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static365.anInt5876;
		@Pc(14) int local14 = arg2 << Static365.anInt5876;
		@Pc(23) int local23 = Static229.aClass42Array3[arg0].method3060(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static227.anInt4750) {
				if (!Static251.method3878(local10, local23, local14)) {
					return false;
				}
				if (!Static251.method3878(local10, local23, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static251.method3878(local10, local27, local14)) {
					return false;
				}
				if (!Static251.method3878(local10, local27, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (Static251.method3878(local10, local31, local14)) {
				return Static251.method3878(local10, local31, local14 + Static53.anInt1116);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static12.anInt170) {
				if (!Static251.method3878(local10, local23, local14 + Static53.anInt1116)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local23, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static251.method3878(local10, local27, local14 + Static53.anInt1116)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local27, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (Static251.method3878(local10, local31, local14 + Static53.anInt1116)) {
				return Static251.method3878(local10 + Static53.anInt1116, local31, local14 + Static53.anInt1116);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static227.anInt4750) {
				if (!Static251.method3878(local10 + Static53.anInt1116, local23, local14)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local23, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static251.method3878(local10 + Static53.anInt1116, local27, local14)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local27, local14 + Static53.anInt1116)) {
					return false;
				}
			}
			if (Static251.method3878(local10 + Static53.anInt1116, local31, local14)) {
				return Static251.method3878(local10 + Static53.anInt1116, local31, local14 + Static53.anInt1116);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static12.anInt170) {
				if (!Static251.method3878(local10, local23, local14)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static251.method3878(local10, local27, local14)) {
					return false;
				}
				if (!Static251.method3878(local10 + Static53.anInt1116, local27, local14)) {
					return false;
				}
			}
			if (Static251.method3878(local10, local31, local14)) {
				return Static251.method3878(local10 + Static53.anInt1116, local31, local14);
			} else {
				return false;
			}
		} else if (!Static251.method3878(local10 + Static276.anInt5131, local35, local14 + Static276.anInt5131)) {
			return false;
		} else if (arg3 == 16) {
			return Static251.method3878(local10, local31, local14 + Static53.anInt1116);
		} else if (arg3 == 32) {
			return Static251.method3878(local10 + Static53.anInt1116, local31, local14 + Static53.anInt1116);
		} else if (arg3 == 64) {
			return Static251.method3878(local10 + Static53.anInt1116, local31, local14);
		} else if (arg3 == 128) {
			return Static251.method3878(local10, local31, local14);
		} else {
			return true;
		}
	}
}
