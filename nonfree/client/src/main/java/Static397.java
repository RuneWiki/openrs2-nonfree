import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static int anInt7610;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt7611;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_11 = new Class307(8, 1);

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
	public static long aLong196 = -1L;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static final int anInt7612 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!na;")
	public static Class1_Sub4_Sub2 method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class289 local14 = local7.aClass289_1; local14 != null; local14 = local14.aClass289_3) {
			@Pc(18) Class1_Sub4_Sub2 local18 = local14.aClass1_Sub4_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort121 == arg1 && local18.aShort120 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBIIILclient!ga;[III[IIIIII)I")
	public static int method6278(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class111 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static398.anIntArrayArray43[local3][local7] = 0;
				Static404.anIntArrayArray45[local3][local7] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg3 == 1) {
			local57 = Static173.method3153(arg1, arg13, arg6, arg10, arg12, arg7, arg9, arg2, arg11, arg4);
		} else if (arg3 == 2) {
			local57 = Static227.method3716(arg6, arg11, arg2, arg1, arg9, arg12, arg10, arg7, arg4, arg13);
		} else {
			local57 = Static450.method6961(arg6, arg2, arg12, arg1, arg13, arg3, arg9, arg4, arg7, arg10, arg11);
		}
		@Pc(91) int local91 = arg9 - 64;
		@Pc(95) int local95 = arg6 - 64;
		@Pc(97) int local97 = Static145.anInt3095;
		@Pc(99) int local99 = Static61.anInt985;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		if (!local57) {
			if (!arg0) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (local114 = arg1 - 10; local114 <= arg1 + 10; local114++) {
				for (@Pc(121) int local121 = arg2 - 10; local121 <= arg2 + 10; local121++) {
					@Pc(128) int local128 = local114 - local91;
					@Pc(133) int local133 = local121 - local95;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static404.anIntArrayArray45[local128][local133] < 100) {
						@Pc(159) int local159 = 0;
						if (arg1 > local114) {
							local159 = arg1 - local114;
						} else if (local114 > arg1 + arg13 - 1) {
							local159 = local114 + 1 - arg1 - arg13;
						}
						@Pc(190) int local190 = 0;
						if (arg2 > local121) {
							local190 = arg2 - local121;
						} else if (arg7 + arg2 - 1 < local121) {
							local190 = local121 + 1 - arg7 - arg2;
						}
						@Pc(229) int local229 = local190 * local190 + local159 * local159;
						if (local105 > local229 || local105 == local229 && local107 > Static404.anIntArrayArray45[local128][local133]) {
							local107 = Static404.anIntArrayArray45[local128][local133];
							local97 = local114;
							local99 = local121;
							local105 = local229;
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local97 == arg9 && local99 == arg6) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static242.anIntArray221[0] = local97;
		local105 = local297 + 1;
		Static478.anIntArray477[0] = local99;
		@Pc(318) int local318;
		local107 = local318 = Static398.anIntArrayArray43[local97 - local91][local99 - local95];
		while (local97 != arg9 || local99 != arg6) {
			if (local107 != local318) {
				Static242.anIntArray221[local105] = local97;
				local318 = local107;
				Static478.anIntArray477[local105++] = local99;
			}
			if ((local107 & 0x1) != 0) {
				local99++;
			} else if ((local107 & 0x4) != 0) {
				local99--;
			}
			if ((local107 & 0x2) != 0) {
				local97++;
			} else if ((local107 & 0x8) != 0) {
				local97--;
			}
			local107 = Static398.anIntArrayArray43[local97 - local91][local99 - local95];
		}
		local114 = 0;
		while (local105-- > 0) {
			arg5[local114] = Static242.anIntArray221[local105];
			arg8[local114++] = Static478.anIntArray477[local105];
			if (local114 >= arg5.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!rda;)V")
	public static void method6281(@OriginalArg(1) Class1_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) Class4_Sub36 local13 = (Class4_Sub36) Static583.aClass350_42.method8207((long) arg0.anInt8435);
		if (local13 == null) {
			return;
		}
		if (local13.aClass4_Sub7_Sub4_1 != null) {
			Static444.aClass4_Sub7_Sub1_2.method400(local13.aClass4_Sub7_Sub4_1);
			local13.aClass4_Sub7_Sub4_1 = null;
		}
		local13.method8379();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method6282() {
		Static419.aClass223_54.method5399(50);
	}
}
