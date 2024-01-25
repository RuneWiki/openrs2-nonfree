import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt88;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public static int anInt92;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_1 = new Class177(39, 3);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public static int method81(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!nv;I)V")
	public static void method82(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class183 arg1) {
		while (true) {
			@Pc(8) Class157 local8 = arg1.method4159(arg0);
			while (local8.anInt4667 == 0) {
				Static289.method4249(10L);
			}
			if (local8.anInt4667 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static289.method4249(100L);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[Lclient!me;")
	public static Class167[] method84() {
		if (Static385.aClass167Array1 == null) {
			@Pc(5) Class167[] local5 = Static418.method5681(Static150.aClass183_3);
			@Pc(9) Class167[] local9 = new Class167[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(63) int local63;
			@Pc(68) Class167 local68;
			label63: for (@Pc(13) int local13 = 0; local13 < local5.length; local13++) {
				@Pc(18) Class167 local18 = local5[local13];
				if ((local18.anInt4758 <= 0 || local18.anInt4758 >= 24) && local18.anInt4759 >= 800 && local18.anInt4757 >= 600 && (Static155.anInt3339 >= 96 || Static262.anInt2805 != 0 || local18.anInt4759 <= 1024 && local18.anInt4757 <= 768)) {
					for (local63 = 0; local63 < local11; local63++) {
						local68 = local9[local63];
						if (local18.anInt4759 == local68.anInt4759 && local18.anInt4757 == local68.anInt4757) {
							if (local18.anInt4758 > local68.anInt4758) {
								local9[local63] = local18;
							}
							continue label63;
						}
					}
					local9[local11] = local18;
					local11++;
				}
			}
			Static385.aClass167Array1 = new Class167[local11];
			Static469.method6019(local9, 0, Static385.aClass167Array1, 0, local11);
			@Pc(127) int[] local127 = new int[Static385.aClass167Array1.length];
			for (local63 = 0; local63 < Static385.aClass167Array1.length; local63++) {
				local68 = Static385.aClass167Array1[local63];
				local127[local63] = local68.anInt4759 * local68.anInt4757;
			}
			Static270.method4034(Static385.aClass167Array1, local127);
		}
		return Static385.aClass167Array1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z")
	public static boolean method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static215.method3366(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static198.anInt7947;
		@Pc(14) int local14 = arg2 << Static198.anInt7947;
		@Pc(23) int local23 = Static396.aClass96Array5[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static198.anInt7947 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static198.anInt7947 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static198.anInt7947 - 7);
		if (arg3 == 1) {
			if (local10 > Static17.anInt393) {
				if (!Static333.method4696(local10, local23, local14)) {
					return false;
				}
				if (!Static333.method4696(local10, local23, local14 + Static333.anInt6111)) {
					return false;
				}
				if (!Static333.method4696(local10, local23, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static333.method4696(local10, local31, local14)) {
					return false;
				}
				if (!Static333.method4696(local10, local31, local14 + Static333.anInt6111)) {
					return false;
				}
				if (!Static333.method4696(local10, local31, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (!Static333.method4696(local10, local39, local14)) {
				return false;
			} else if (Static333.method4696(local10, local39, local14 + Static333.anInt6111)) {
				return Static333.method4696(local10, local39, local14 + Static251.anInt4890);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static237.anInt4683) {
				if (!Static333.method4696(local10, local23, local14 + Static251.anInt4890)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static333.anInt6111, local23, local14 + Static251.anInt4890)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local23, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static333.method4696(local10, local31, local14 + Static251.anInt4890)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static333.anInt6111, local31, local14 + Static251.anInt4890)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local31, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (!Static333.method4696(local10, local39, local14 + Static251.anInt4890)) {
				return false;
			} else if (Static333.method4696(local10 + Static333.anInt6111, local39, local14 + Static251.anInt4890)) {
				return Static333.method4696(local10 + Static251.anInt4890, local39, local14 + Static251.anInt4890);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static17.anInt393) {
				if (!Static333.method4696(local10 + Static251.anInt4890, local23, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local23, local14 + Static333.anInt6111)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local23, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static333.method4696(local10 + Static251.anInt4890, local31, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local31, local14 + Static333.anInt6111)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local31, local14 + Static251.anInt4890)) {
					return false;
				}
			}
			if (!Static333.method4696(local10 + Static251.anInt4890, local39, local14)) {
				return false;
			} else if (Static333.method4696(local10 + Static251.anInt4890, local39, local14 + Static333.anInt6111)) {
				return Static333.method4696(local10 + Static251.anInt4890, local39, local14 + Static251.anInt4890);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static237.anInt4683) {
				if (!Static333.method4696(local10, local23, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static333.anInt6111, local23, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static333.method4696(local10, local31, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static333.anInt6111, local31, local14)) {
					return false;
				}
				if (!Static333.method4696(local10 + Static251.anInt4890, local31, local14)) {
					return false;
				}
			}
			if (!Static333.method4696(local10, local39, local14)) {
				return false;
			} else if (Static333.method4696(local10 + Static333.anInt6111, local39, local14)) {
				return Static333.method4696(local10 + Static251.anInt4890, local39, local14);
			} else {
				return false;
			}
		} else if (!Static333.method4696(local10 + Static333.anInt6111, local47, local14 + Static333.anInt6111)) {
			return false;
		} else if (arg3 == 16) {
			return Static333.method4696(local10, local39, local14 + Static251.anInt4890);
		} else if (arg3 == 32) {
			return Static333.method4696(local10 + Static251.anInt4890, local39, local14 + Static251.anInt4890);
		} else if (arg3 == 64) {
			return Static333.method4696(local10 + Static251.anInt4890, local39, local14);
		} else if (arg3 == 128) {
			return Static333.method4696(local10, local39, local14);
		} else {
			return true;
		}
	}
}
