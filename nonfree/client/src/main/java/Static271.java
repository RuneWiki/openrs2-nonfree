import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[[[Lclient!dk;")
	public static Class4_Sub11[][][] aClass4_Sub11ArrayArrayArray3;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
	public static int[] anIntArray451;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "Lclient!lc;")
	public static Class98 aClass98_159;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method4058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class181 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class181(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub11(local14, arg1, arg2);
				}
			}
			Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass181_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class181(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub11(local14, arg1, arg2);
				}
			}
			Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass181_1 = local12;
		} else {
			@Pc(134) Class147 local134 = new Class147(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static127.aClass4_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub11(local14, arg1, arg2);
				}
			}
			Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass147_1 = local134;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	public static void method4059() {
		Static105.aClass33_17.method838(5);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(10) long local10 = Static215.method3428(arg4, arg1 + 0, arg2);
		@Pc(25) int local25;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(43) Class47 local43;
		@Pc(50) int local50;
		@Pc(52) int[] local52;
		@Pc(72) int local72;
		if (local10 != 0L) {
			local25 = (int) local10 >> 20 & 0x3;
			local32 = (int) local10 >> 14 & 0x1F;
			local39 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			local43 = Static170.method2683(local39);
			if (local43.anInt1363 == -1) {
				local50 = arg0;
				local52 = Static166.anIntArray293;
				if (local10 > 0L) {
					local50 = arg3;
				}
				local72 = (52736 - arg2 * 512) * 4 + arg1 * 4 + 24624;
				if (local32 == 0 || local32 == 2) {
					if (local25 == 0) {
						local52[local72] = local50;
						local52[local72 + 512] = local50;
						local52[local72 + 1024] = local50;
						local52[local72 + 1536] = local50;
					} else if (local25 == 1) {
						local52[local72] = local50;
						local52[local72 + 1] = local50;
						local52[local72 + 2] = local50;
						local52[local72 + 3] = local50;
					} else if (local25 == 2) {
						local52[local72 + 3] = local50;
						local52[local72 + 512 + 3] = local50;
						local52[local72 + 1024 + 3] = local50;
						local52[local72 + 1536 + 3] = local50;
					} else if (local25 == 3) {
						local52[local72 + 1536] = local50;
						local52[local72 + 1536 + 1] = local50;
						local52[local72 + 2 + 1536] = local50;
						local52[local72 + 3 + 1536] = local50;
					}
				}
				if (local32 == 3) {
					if (local25 == 0) {
						local52[local72] = local50;
					} else if (local25 == 1) {
						local52[local72 + 3] = local50;
					} else if (local25 == 2) {
						local52[local72 + 1539] = local50;
					} else if (local25 == 3) {
						local52[local72 + 1536] = local50;
					}
				}
				if (local32 == 2) {
					if (local25 == 3) {
						local52[local72] = local50;
						local52[local72 + 512] = local50;
						local52[local72 + 1024] = local50;
						local52[local72 + 1536] = local50;
					} else if (local25 == 0) {
						local52[local72] = local50;
						local52[local72 + 1] = local50;
						local52[local72 + 2] = local50;
						local52[local72 + 3] = local50;
					} else if (local25 == 1) {
						local52[local72 + 3] = local50;
						local52[local72 + 3 + 512] = local50;
						local52[local72 + 1027] = local50;
						local52[local72 + 3 + 1536] = local50;
					} else if (local25 == 2) {
						local52[local72 + 1536] = local50;
						local52[local72 + 1536 + 1] = local50;
						local52[local72 + 1536 + 2] = local50;
						local52[local72 + 3 + 1536] = local50;
					}
				}
			} else if (!Static87.method1399(local25, arg2, local43, arg1)) {
				return false;
			}
		}
		local10 = Static154.method2467(arg4, arg1 + 0, arg2);
		if (local10 != 0L) {
			local32 = (int) local10 >> 14 & 0x1F;
			local39 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local25 = (int) local10 >> 20 & 0x3;
			local43 = Static170.method2683(local39);
			if (local43.anInt1363 == -1) {
				if (local32 == 9) {
					local72 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
					local52 = Static166.anIntArray293;
					local50 = 15658734;
					if (local10 > 0L) {
						local50 = 15597568;
					}
					if (local25 == 0 || local25 == 2) {
						local52[local72 + 1536] = local50;
						local52[local72 + 1024 + 1] = local50;
						local52[local72 + 512 + 2] = local50;
						local52[local72 + 3] = local50;
					} else {
						local52[local72] = local50;
						local52[local72 + 1 + 512] = local50;
						local52[local72 + 1024 + 2] = local50;
						local52[local72 + 3 + 1536] = local50;
					}
				}
			} else if (!Static87.method1399(local25, arg2, local43, arg1)) {
				return false;
			}
		}
		local10 = Static65.method1011(arg4, arg1 + 0, arg2);
		if (local10 != 0L) {
			local25 = (int) local10 >> 20 & 0x3;
			local32 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			@Pc(595) Class47 local595 = Static170.method2683(local32);
			if (local595.anInt1363 != -1 && !Static87.method1399(local25, arg2, local595, arg1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	public static void method4061() {
		aClass4_Sub11ArrayArrayArray3 = null;
		aClass98_159 = null;
		anIntArray451 = null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V")
	public static void method4062(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static25.method381(-1, arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
	public static void method4063(@OriginalArg(0) boolean arg0) {
		@Pc(10) Class4_Sub23 local10;
		for (local10 = (Class4_Sub23) Static47.aClass10_8.method190(); local10 != null; local10 = (Class4_Sub23) Static47.aClass10_8.method191()) {
			if (local10.aClass4_Sub9_Sub1_3 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_3);
				local10.aClass4_Sub9_Sub1_3 = null;
			}
			if (local10.aClass4_Sub9_Sub1_2 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_2);
				local10.aClass4_Sub9_Sub1_2 = null;
			}
			local10.method4391();
		}
		if (!arg0) {
			return;
		}
		for (local10 = (Class4_Sub23) Static118.aClass10_27.method190(); local10 != null; local10 = (Class4_Sub23) Static118.aClass10_27.method191()) {
			if (local10.aClass4_Sub9_Sub1_3 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_3);
				local10.aClass4_Sub9_Sub1_3 = null;
			}
			local10.method4391();
		}
		for (local10 = (Class4_Sub23) Static262.aClass97_22.method2363(); local10 != null; local10 = (Class4_Sub23) Static262.aClass97_22.method2367()) {
			if (local10.aClass4_Sub9_Sub1_3 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_3);
				local10.aClass4_Sub9_Sub1_3 = null;
			}
			local10.method4391();
		}
	}
}
