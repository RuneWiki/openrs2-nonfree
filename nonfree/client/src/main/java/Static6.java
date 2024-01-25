import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public static int anInt110;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public static int anInt113;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	public static int anInt131;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public static int anInt107 = -1;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
	public static final int[] anIntArray6 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
	public static final int[] anIntArray7 = new int[8];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)Z")
	public static boolean method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static243.method3145(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static419.anInt6980;
		@Pc(14) int local14 = arg2 << Static419.anInt6980;
		@Pc(23) int local23 = Static410.aClass125Array3[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static419.anInt6980 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static419.anInt6980 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static419.anInt6980 - 7);
		if (arg3 == 1) {
			if (local10 > Static267.anInt4663) {
				if (!Static408.method5397(local10, local23, local14)) {
					return false;
				}
				if (!Static408.method5397(local10, local23, local14 + Static301.anInt4709)) {
					return false;
				}
				if (!Static408.method5397(local10, local23, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static408.method5397(local10, local31, local14)) {
					return false;
				}
				if (!Static408.method5397(local10, local31, local14 + Static301.anInt4709)) {
					return false;
				}
				if (!Static408.method5397(local10, local31, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (!Static408.method5397(local10, local39, local14)) {
				return false;
			} else if (Static408.method5397(local10, local39, local14 + Static301.anInt4709)) {
				return Static408.method5397(local10, local39, local14 + Static92.anInt1592);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static109.anInt1835) {
				if (!Static408.method5397(local10, local23, local14 + Static92.anInt1592)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static301.anInt4709, local23, local14 + Static92.anInt1592)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local23, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static408.method5397(local10, local31, local14 + Static92.anInt1592)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static301.anInt4709, local31, local14 + Static92.anInt1592)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local31, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (!Static408.method5397(local10, local39, local14 + Static92.anInt1592)) {
				return false;
			} else if (Static408.method5397(local10 + Static301.anInt4709, local39, local14 + Static92.anInt1592)) {
				return Static408.method5397(local10 + Static92.anInt1592, local39, local14 + Static92.anInt1592);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static267.anInt4663) {
				if (!Static408.method5397(local10 + Static92.anInt1592, local23, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local23, local14 + Static301.anInt4709)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local23, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static408.method5397(local10 + Static92.anInt1592, local31, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local31, local14 + Static301.anInt4709)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local31, local14 + Static92.anInt1592)) {
					return false;
				}
			}
			if (!Static408.method5397(local10 + Static92.anInt1592, local39, local14)) {
				return false;
			} else if (Static408.method5397(local10 + Static92.anInt1592, local39, local14 + Static301.anInt4709)) {
				return Static408.method5397(local10 + Static92.anInt1592, local39, local14 + Static92.anInt1592);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static109.anInt1835) {
				if (!Static408.method5397(local10, local23, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static301.anInt4709, local23, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static408.method5397(local10, local31, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static301.anInt4709, local31, local14)) {
					return false;
				}
				if (!Static408.method5397(local10 + Static92.anInt1592, local31, local14)) {
					return false;
				}
			}
			if (!Static408.method5397(local10, local39, local14)) {
				return false;
			} else if (Static408.method5397(local10 + Static301.anInt4709, local39, local14)) {
				return Static408.method5397(local10 + Static92.anInt1592, local39, local14);
			} else {
				return false;
			}
		} else if (!Static408.method5397(local10 + Static301.anInt4709, local47, local14 + Static301.anInt4709)) {
			return false;
		} else if (arg3 == 16) {
			return Static408.method5397(local10, local39, local14 + Static92.anInt1592);
		} else if (arg3 == 32) {
			return Static408.method5397(local10 + Static92.anInt1592, local39, local14 + Static92.anInt1592);
		} else if (arg3 == 64) {
			return Static408.method5397(local10 + Static92.anInt1592, local39, local14);
		} else if (arg3 == 128) {
			return Static408.method5397(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jq;Lclient!um;Lclient!um;Lclient!um;B)Z")
	public static boolean method93(@OriginalArg(0) Class5_Sub22_Sub1 arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		Static133.aClass243_75 = arg3;
		Static260.aClass243_141 = arg2;
		Static331.aClass243_184 = arg1;
		Static210.aClass5_Sub22_Sub1_1 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method94(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, local9 + arg0.length())) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(local9 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!tr;")
	public static Class5_Sub2_Sub17 method96(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub17 local10 = (Class5_Sub2_Sub17) Static347.aClass261_3.method5897((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static29.aClass243_24.method5455(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static142.method2032(local20);
			Static347.aClass261_3.method5900((long) arg0, local10);
			return local10;
		}
	}
}
