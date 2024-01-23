import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	public static int anInt4636;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public static int anInt4630 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!tk;)Z")
	public static boolean method3512(@OriginalArg(1) Class159 arg0) {
		if (arg0.anInt5188 == 205) {
			Static137.anInt1765 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!tk;)V")
	public static void method3513(@OriginalArg(1) Class159 arg0) {
		@Pc(15) Class159 local15 = Static215.method3368(arg0);
		@Pc(21) int local21;
		@Pc(19) int local19;
		if (local15 == null) {
			local19 = Static13.anInt356;
			local21 = Static250.anInt4959;
		} else {
			local19 = local15.anInt5121;
			local21 = local15.anInt5123;
		}
		Static9.method77(arg0, local19, local21, false);
		Static182.method2788(local21, arg0, local19);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method3514(@OriginalArg(0) Class132 arg0) {
		Static295.aClass132_66 = arg0;
		Static149.anInt3006 = Static295.aClass132_66.method3189(16);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(JB)V")
	public static void method3515(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static173.anInt3444; local12++) {
			if (arg0 == Static98.aLongArray7[local12]) {
				Static173.anInt3444--;
				for (@Pc(43) int local43 = local12; local43 < Static173.anInt3444; local43++) {
					Static47.aStringArray15[local43] = Static47.aStringArray15[local43 + 1];
					Static63.anIntArray95[local43] = Static63.anIntArray95[local43 + 1];
					Static173.aStringArray51[local43] = Static173.aStringArray51[local43 + 1];
					Static98.aLongArray7[local43] = Static98.aLongArray7[local43 + 1];
					Static220.anIntArray340[local43] = Static220.anIntArray340[local43 + 1];
					Static57.aBooleanArray4[local43] = Static57.aBooleanArray4[local43 + 1];
				}
				Static295.anInt3737 = Static157.anInt5706;
				Static66.aClass8_Sub2_Sub1_4.method2398(243);
				Static66.aClass8_Sub2_Sub1_4.method2378(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3516(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) long local14 = Static153.method2452(arg0, arg2 + 0, arg4);
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(37) int local37;
		@Pc(48) Class70 local48;
		@Pc(74) int local74;
		@Pc(56) int[] local56;
		@Pc(72) int local72;
		if (local14 != 0L) {
			local30 = (int) local14 >> 20 & 0x3;
			local37 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local44 = (int) local14 >> 14 & 0x1F;
			local48 = Static235.method3578(local37);
			if (local48.anInt2095 == -1) {
				local56 = Static103.anIntArray155;
				local72 = (52736 - arg4 * 512) * 4 + arg2 * 4 + 24624;
				local74 = arg1;
				if (local14 > 0L) {
					local74 = arg3;
				}
				if (local44 == 0 || local44 == 2) {
					if (local30 == 0) {
						local56[local72] = local74;
						local56[local72 + 512] = local74;
						local56[local72 + 1024] = local74;
						local56[local72 + 1536] = local74;
					} else if (local30 == 1) {
						local56[local72] = local74;
						local56[local72 + 1] = local74;
						local56[local72 + 2] = local74;
						local56[local72 + 3] = local74;
					} else if (local30 == 2) {
						local56[local72 + 3] = local74;
						local56[local72 + 512 + 3] = local74;
						local56[local72 + 3 + 1024] = local74;
						local56[local72 + 1536 + 3] = local74;
					} else if (local30 == 3) {
						local56[local72 + 1536] = local74;
						local56[local72 + 1536 + 1] = local74;
						local56[local72 + 2 + 1536] = local74;
						local56[local72 + 1536 + 3] = local74;
					}
				}
				if (local44 == 3) {
					if (local30 == 0) {
						local56[local72] = local74;
					} else if (local30 == 1) {
						local56[local72 + 3] = local74;
					} else if (local30 == 2) {
						local56[local72 + 1539] = local74;
					} else if (local30 == 3) {
						local56[local72 + 1536] = local74;
					}
				}
				if (local44 == 2) {
					if (local30 == 3) {
						local56[local72] = local74;
						local56[local72 + 512] = local74;
						local56[local72 + 1024] = local74;
						local56[local72 + 1536] = local74;
					} else if (local30 == 0) {
						local56[local72] = local74;
						local56[local72 + 1] = local74;
						local56[local72 + 2] = local74;
						local56[local72 + 3] = local74;
					} else if (local30 == 1) {
						local56[local72 + 3] = local74;
						local56[local72 + 515] = local74;
						local56[local72 + 1024 + 3] = local74;
						local56[local72 + 3 + 1536] = local74;
					} else if (local30 == 2) {
						local56[local72 + 1536] = local74;
						local56[local72 + 1536 + 1] = local74;
						local56[local72 + 1536 + 2] = local74;
						local56[local72 + 1539] = local74;
					}
				}
			} else if (!Static109.method1778(local48, arg4, arg2, local30)) {
				return false;
			}
		}
		local14 = Static136.method2197(arg0, arg2 + 0, arg4);
		if (local14 != 0L) {
			local30 = (int) local14 >> 20 & 0x3;
			local37 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local44 = (int) local14 >> 14 & 0x1F;
			local48 = Static235.method3578(local37);
			if (local48.anInt2095 == -1) {
				if (local44 == 9) {
					local74 = 15658734;
					if (local14 > 0L) {
						local74 = 15597568;
					}
					local72 = (103 - arg4) * 4 * 512 + arg2 * 4 + 24624;
					local56 = Static103.anIntArray155;
					if (local30 == 0 || local30 == 2) {
						local56[local72 + 1536] = local74;
						local56[local72 + 1 + 1024] = local74;
						local56[local72 + 2 + 512] = local74;
						local56[local72 + 3] = local74;
					} else {
						local56[local72] = local74;
						local56[local72 + 512 + 1] = local74;
						local56[local72 + 2 + 1024] = local74;
						local56[local72 + 1536 + 3] = local74;
					}
				}
			} else if (!Static109.method1778(local48, arg4, arg2, local30)) {
				return false;
			}
		}
		local14 = Static210.method3402(arg0, arg2 + 0, arg4);
		if (local14 != 0L) {
			local44 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local30 = (int) local14 >> 20 & 0x3;
			@Pc(581) Class70 local581 = Static235.method3578(local44);
			if (local581.anInt2095 != -1 && !Static109.method1778(local581, arg4, arg2, local30)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IC)C")
	public static char method3517(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
