import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "Lclient!dg;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lclient!g;")
	public static Class83 aClass83_72;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!eg;")
	public static Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "Lclient!fc;")
	public static Class73 aClass73_8;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "J")
	public static long aLong117 = -1L;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "[I")
	public static final int[] anIntArray302 = new int[14];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z")
	public static boolean method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static69.method1256(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static162.anInt3362;
		@Pc(14) int local14 = arg2 << Static162.anInt3362;
		@Pc(23) int local23 = Static128.aClass149Array1[arg0].method5837(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static181.anInt3807) {
				if (!Static151.method3887(local10, local23, local14)) {
					return false;
				}
				if (!Static151.method3887(local10, local23, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static151.method3887(local10, local27, local14)) {
					return false;
				}
				if (!Static151.method3887(local10, local27, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (Static151.method3887(local10, local31, local14)) {
				return Static151.method3887(local10, local31, local14 + Static169.anInt5687);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static200.anInt4146) {
				if (!Static151.method3887(local10, local23, local14 + Static169.anInt5687)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local23, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static151.method3887(local10, local27, local14 + Static169.anInt5687)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local27, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (Static151.method3887(local10, local31, local14 + Static169.anInt5687)) {
				return Static151.method3887(local10 + Static169.anInt5687, local31, local14 + Static169.anInt5687);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static181.anInt3807) {
				if (!Static151.method3887(local10 + Static169.anInt5687, local23, local14)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local23, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static151.method3887(local10 + Static169.anInt5687, local27, local14)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local27, local14 + Static169.anInt5687)) {
					return false;
				}
			}
			if (Static151.method3887(local10 + Static169.anInt5687, local31, local14)) {
				return Static151.method3887(local10 + Static169.anInt5687, local31, local14 + Static169.anInt5687);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static200.anInt4146) {
				if (!Static151.method3887(local10, local23, local14)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static151.method3887(local10, local27, local14)) {
					return false;
				}
				if (!Static151.method3887(local10 + Static169.anInt5687, local27, local14)) {
					return false;
				}
			}
			if (Static151.method3887(local10, local31, local14)) {
				return Static151.method3887(local10 + Static169.anInt5687, local31, local14);
			} else {
				return false;
			}
		} else if (!Static151.method3887(local10 + Static291.anInt5453, local35, local14 + Static291.anInt5453)) {
			return false;
		} else if (arg3 == 16) {
			return Static151.method3887(local10, local31, local14 + Static169.anInt5687);
		} else if (arg3 == 32) {
			return Static151.method3887(local10 + Static169.anInt5687, local31, local14 + Static169.anInt5687);
		} else if (arg3 == 64) {
			return Static151.method3887(local10 + Static169.anInt5687, local31, local14);
		} else if (arg3 == 128) {
			return Static151.method3887(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method3544() {
		try {
			if (Static348.anInt6384 == 1) {
				@Pc(10) int local10 = Static67.aClass2_Sub11_Sub1_1.method1788();
				if (local10 > 0 && Static67.aClass2_Sub11_Sub1_1.method1770()) {
					local10 -= Static333.anInt6164;
					if (local10 < 0) {
						local10 = 0;
					}
					Static67.aClass2_Sub11_Sub1_1.method1792(local10);
					return;
				}
				Static67.aClass2_Sub11_Sub1_1.method1800();
				Static67.aClass2_Sub11_Sub1_1.method1775();
				Static322.aClass186_1 = null;
				Static235.aClass2_Sub39_2 = null;
				if (aClass83_72 == null) {
					Static348.anInt6384 = 0;
				} else {
					Static348.anInt6384 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static67.aClass2_Sub11_Sub1_1.method1800();
			Static235.aClass2_Sub39_2 = null;
			Static348.anInt6384 = 0;
			aClass83_72 = null;
			Static322.aClass186_1 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!eg;ILjava/awt/Canvas;)Lclient!oj;")
	public static Class48 method3545(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class48_Sub1(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lclient!ud;")
	public static Class225 method3546(@OriginalArg(0) int arg0) {
		@Pc(8) Class225[] local8 = Static297.method4860();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class225 local21 = local8[local15];
			if (local21.anInt6371 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
