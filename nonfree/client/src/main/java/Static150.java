import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!fp", name = "db", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!fp", name = "hb", descriptor = "I")
	public static int anInt7378 = -1;

	@OriginalMember(owner = "client!fp", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray525 = new int[4];

	@OriginalMember(owner = "client!fp", name = "dc", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_137 = new Class254(2, -2);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!cs;")
	public static Class6_Sub13 method6203(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub13_Sub1");
			@Pc(15) Class6_Sub13 local15 = (Class6_Sub13) local11.getDeclaredConstructor().newInstance();
			local15.method7241(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub13_Sub2 local26 = new Class6_Sub13_Sub2();
			local26.method7241(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[IIILclient!le;IIIZI[IIIII)I")
	public static int method6218(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class194 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static4.anIntArrayArray1[local3][local7] = 0;
				Static221.anIntArrayArray32[local3][local7] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg11 == 1) {
			local53 = Static83.method1833(arg4, arg8, arg12, arg2, arg5, arg3, arg10, arg13, arg0, arg6);
		} else if (arg11 == 2) {
			local53 = Static572.method8057(arg13, arg5, arg10, arg12, arg3, arg8, arg2, arg6, arg4, arg0);
		} else {
			local53 = Static177.method3525(arg5, arg0, arg11, arg4, arg12, arg2, arg10, arg13, arg3, arg8, arg6);
		}
		@Pc(91) int local91 = arg13 - 64;
		@Pc(95) int local95 = arg12 - 64;
		@Pc(97) int local97 = Static524.anInt9093;
		@Pc(99) int local99 = Static132.anInt9039;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local53) {
			if (!arg7) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg8 - 10; local116 <= arg8 + 10; local116++) {
				for (@Pc(123) int local123 = arg2 - 10; local123 <= arg2 + 10; local123++) {
					@Pc(130) int local130 = local116 - local91;
					@Pc(135) int local135 = local123 - local95;
					if (local130 >= 0 && local135 >= 0 && local130 < 128 && local135 < 128 && Static221.anIntArrayArray32[local130][local135] < 100) {
						@Pc(159) int local159 = 0;
						if (arg8 > local116) {
							local159 = arg8 - local116;
						} else if (arg8 + arg0 - 1 < local116) {
							local159 = local116 + 1 - arg0 - arg8;
						}
						@Pc(191) int local191 = 0;
						if (local123 < arg2) {
							local191 = arg2 - local123;
						} else if (local123 > arg2 + arg6 - 1) {
							local191 = local123 + 1 - arg2 - arg6;
						}
						@Pc(229) int local229 = local191 * local191 + local159 * local159;
						if (local107 > local229 || local107 == local229 && local109 > Static221.anIntArrayArray32[local130][local135]) {
							local107 = local229;
							local99 = local123;
							local97 = local116;
							local109 = Static221.anIntArrayArray32[local130][local135];
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg13 == local97 && local99 == arg12) {
			return 0;
		}
		@Pc(304) byte local304 = 0;
		Static506.anIntArray794[0] = local97;
		local107 = local304 + 1;
		Static88.anIntArray159[0] = local99;
		@Pc(326) int local326;
		local109 = local326 = Static4.anIntArrayArray1[local97 - local91][local99 - local95];
		while (local97 != arg13 || local99 != arg12) {
			if (local326 != local109) {
				local326 = local109;
				Static506.anIntArray794[local107] = local97;
				Static88.anIntArray159[local107++] = local99;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			local109 = Static4.anIntArrayArray1[local97 - local91][local99 - local95];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg1[local116] = Static506.anIntArray794[local107];
			arg9[local116++] = Static88.anIntArray159[local107];
			if (arg1.length <= local116) {
				break;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!xa;)V")
	public static void method6222(@OriginalArg(1) Class66[] arg0) {
		Static542.anInt9307 = arg0.length;
		Static235.anIntArray314 = new int[Static542.anInt9307 + 10];
		Static451.aClass66Array11 = new Class66[Static542.anInt9307 + 10];
		Static589.method5380(arg0, 0, Static451.aClass66Array11, 0, Static542.anInt9307);
		for (@Pc(26) int local26 = 0; local26 < Static542.anInt9307; local26++) {
			Static235.anIntArray314[local26] = Static451.aClass66Array11[local26].a();
		}
		for (@Pc(45) int local45 = Static542.anInt9307; local45 < Static451.aClass66Array11.length; local45++) {
			Static235.anIntArray314[local45] = 12;
		}
	}
}
