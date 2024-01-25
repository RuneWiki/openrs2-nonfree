import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt972 = 0;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
	public static final int[] anIntArray44 = new int[14];

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public static int anInt981 = 500;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public static int method713() {
		if (Static229.aFrame1 == null) {
			return Static155.aBoolean267 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public static void method716() {
		@Pc(5) byte local5 = 0;
		if (Static237.aBoolean480) {
			local5 = 55;
		}
		Static192.method3642(local5);
		Static80.method1994(local5);
		Static107.method5416(local5);
		Static110.method2369(local5);
		Static339.method13(local5);
		Static47.method950(local5);
		Static51.method1020(local5);
		Static232.method4125(local5);
		Static23.method381(local5);
		if (Static139.anInt3199 == 10) {
			Static243.method5095(28);
		} else if (Static139.anInt3199 == 30) {
			Static243.method5095(25);
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public static void method717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub4_Sub18 local15 = Static302.method4961(arg1, 16);
		local15.method4908();
		local15.anInt5705 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	public static void method718() {
		@Pc(9) Class198 local9 = Static140.aClass198_108;
		synchronized (Static140.aClass198_108) {
			Static140.aClass198_108.method5202(5);
		}
		local9 = Static349.aClass198_243;
		synchronized (Static349.aClass198_243) {
			Static349.aClass198_243.method5202(5);
		}
		local9 = Static325.aClass198_228;
		synchronized (Static325.aClass198_228) {
			Static325.aClass198_228.method5202(5);
		}
		local9 = Static265.aClass198_192;
		synchronized (Static265.aClass198_192) {
			Static265.aClass198_192.method5202(5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method719() {
		@Pc(5) Class198 local5 = Static204.aClass198_154;
		synchronized (Static204.aClass198_154) {
			Static204.aClass198_154.method5213();
		}
		local5 = Static349.aClass198_242;
		synchronized (Static349.aClass198_242) {
			Static349.aClass198_242.method5213();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(CZ)Z")
	public static boolean method720(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static271.method4638(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static64.aCharArray4;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static16.aCharArray2;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(56) char local56 = local48[local50];
				if (arg0 == local56) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBLclient!br;)V")
	public static void method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class21 arg2) {
		if (!Static344.aBoolean219) {
			@Pc(51) String local51;
			for (@Pc(44) int local44 = 9; local44 >= 5; local44--) {
				local51 = Static168.method5626(local44, arg2);
				if (local51 != null) {
					Static138.method2617((long) (local44 + 1), arg2.aString9, 1008, Static199.method3739(arg2, local44), local51, arg2.anInt791, arg2.anInt728);
				}
			}
			local51 = Static8.method192(arg2);
			if (local51 != null) {
				Static138.method2617(0L, arg2.aString9, 18, arg2.anInt707, local51, arg2.anInt791, arg2.anInt728);
			}
			for (@Pc(106) int local106 = 4; local106 >= 0; local106--) {
				@Pc(113) String local113 = Static168.method5626(local106, arg2);
				if (local113 != null) {
					Static138.method2617((long) (local106 + 1), arg2.aString9, 44, Static199.method3739(arg2, local106), local113, arg2.anInt791, arg2.anInt728);
				}
			}
			if (Static44.method877(arg2).method1026()) {
				if (arg2.aString11 == null) {
					Static138.method2617(0L, "", 11, -1, Static140.aClass159_159.method4311(Static180.anInt3835), arg2.anInt791, arg2.anInt728);
				} else {
					Static138.method2617(0L, "", 11, -1, arg2.aString11, arg2.anInt791, arg2.anInt728);
				}
			}
		} else if (Static44.method877(arg2).method1025() && (Static48.anInt1288 & 0x20) != 0) {
			Static138.method2617(0L, Static194.aString36 + " -> " + arg2.aString9, 23, Static169.anInt3596, Static171.aString34, arg2.anInt791, arg2.anInt728);
		}
	}
}
