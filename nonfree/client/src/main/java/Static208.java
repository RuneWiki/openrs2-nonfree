import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!db;")
	public static final Class64 aClass64_173 = new Class64(106, 4);

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Object;BLclient!ii;)V")
	public static void method3668(@OriginalArg(0) Object arg0, @OriginalArg(2) Class161 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static55.method845(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
	public static void method3669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub7_Sub5 local15 = Static218.method3780(16, arg0);
		local15.method3066();
		local15.anInt3348 = arg1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method3670(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(54) char local54;
			if (local17 == '\u0000') {
				local54 = arg1.charAt(local13++);
			} else {
				local54 = local17;
			}
			@Pc(70) char local70;
			if (local19 == '\u0000') {
				local70 = arg0.charAt(local15++);
			} else {
				local70 = local19;
			}
			local17 = Static193.method3538(local54);
			local19 = Static193.method3538(local70);
			local54 = Static326.method4914(arg2, local54);
			local70 = Static326.method4914(arg2, local70);
			if (local70 != local54 && Character.toUpperCase(local54) != Character.toUpperCase(local70)) {
				local54 = Character.toLowerCase(local54);
				local70 = Character.toLowerCase(local70);
				if (local70 != local54) {
					return Static545.method7553(arg2, local54) - Static545.method7553(arg2, local70);
				}
			}
		}
		@Pc(133) int local133 = Math.min(local8, local11);
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			if (arg2 == 2) {
				local13 = local8 - local135 - 1;
				local15 = local11 - local135 - 1;
			} else {
				local15 = local135;
				local13 = local135;
			}
			@Pc(165) char local165 = arg1.charAt(local13);
			@Pc(169) char local169 = arg0.charAt(local15);
			if (local165 != local169 && Character.toUpperCase(local165) != Character.toUpperCase(local169)) {
				local165 = Character.toLowerCase(local165);
				local169 = Character.toLowerCase(local169);
				if (local169 != local165) {
					return Static545.method7553(arg2, local165) - Static545.method7553(arg2, local169);
				}
			}
		}
		@Pc(210) int local210 = local8 - local11;
		if (local210 != 0) {
			return local210;
		}
		for (@Pc(219) int local219 = 0; local219 < local133; local219++) {
			@Pc(225) char local225 = arg1.charAt(local219);
			@Pc(229) char local229 = arg0.charAt(local219);
			if (local225 != local229) {
				return Static545.method7553(arg2, local225) - Static545.method7553(arg2, local229);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIILclient!wh;)V")
	public static void method3672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub3 arg4) {
		@Pc(4) Class100 local4 = Static279.method4433(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt2337 = (arg1 << Static41.anInt810) + Static436.anInt7494;
		arg4.anInt2343 = arg3;
		arg4.anInt2340 = (arg2 << Static41.anInt810) + Static436.anInt7494;
		for (@Pc(28) Class35 local28 = local4.aClass35_2; local28 != null; local28 = local28.aClass35_1) {
			if (local28.aClass10_Sub1_1.aBoolean618) {
				@Pc(38) int local38 = local28.aClass10_Sub1_1.method7342();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt2343 += local8;
			arg4.aBoolean193 = true;
		} else if (local4.aClass10_Sub5_1 != null) {
			arg4.anInt2343 -= local4.aClass10_Sub5_1.aShort125;
		}
		local4.aClass10_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIZIIILclient!ed;IIIII[I[I)I")
	public static int method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class84 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static456.anIntArrayArray66[local7][local11] = 0;
				Static518.anIntArrayArray74[local7][local11] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg7 == 1) {
			local53 = Static287.method4529(arg2, arg11, arg5, arg6, arg10, arg8, arg4, arg9, arg0, arg1);
		} else if (arg7 == 2) {
			local53 = Static49.method781(arg11, arg6, arg9, arg1, arg5, arg2, arg4, arg10, arg0, arg8);
		} else {
			local53 = Static267.method4358(arg11, arg10, arg9, arg6, arg0, arg1, arg7, arg5, arg8, arg2, arg4);
		}
		@Pc(87) int local87 = arg0 - 64;
		@Pc(91) int local91 = arg4 - 64;
		@Pc(93) int local93 = Static499.anInt8659;
		@Pc(95) int local95 = Static437.anInt7500;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (!local53) {
			if (!arg3) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local109 = arg2 - 10; local109 <= arg2 + 10; local109++) {
				for (@Pc(115) int local115 = arg9 - 10; local115 <= arg9 + 10; local115++) {
					@Pc(121) int local121 = local109 - local87;
					@Pc(126) int local126 = local115 - local91;
					if (local121 >= 0 && local126 >= 0 && local121 < 128 && local126 < 128 && Static518.anIntArrayArray74[local121][local126] < 100) {
						@Pc(152) int local152 = 0;
						if (arg2 > local109) {
							local152 = arg2 - local109;
						} else if (local109 > arg1 + arg2 - 1) {
							local152 = local109 + 1 - arg1 - arg2;
						}
						@Pc(185) int local185 = 0;
						if (local115 < arg9) {
							local185 = arg9 - local115;
						} else if (arg10 + arg9 - 1 < local115) {
							local185 = local115 + 1 - arg9 - arg10;
						}
						@Pc(228) int local228 = local185 * local185 + local152 * local152;
						if (local228 < local101 || local101 == local228 && Static518.anIntArrayArray74[local121][local126] < local103) {
							local101 = local228;
							local95 = local115;
							local103 = Static518.anIntArrayArray74[local121][local126];
							local93 = local109;
						}
					}
				}
			}
			if (~local101 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg0 == local93 && arg4 == local95) {
			return 0;
		}
		@Pc(296) byte local296 = 0;
		Static539.anIntArray693[0] = local93;
		local101 = local296 + 1;
		Static440.anIntArray616[0] = local95;
		@Pc(317) int local317;
		local103 = local317 = Static456.anIntArrayArray66[local93 - local87][local95 - local91];
		while (arg0 != local93 || arg4 != local95) {
			if (local103 != local317) {
				Static539.anIntArray693[local101] = local93;
				local317 = local103;
				Static440.anIntArray616[local101++] = local95;
			}
			if ((local103 & 0x2) != 0) {
				local93++;
			} else if ((local103 & 0x8) != 0) {
				local93--;
			}
			if ((local103 & 0x1) != 0) {
				local95++;
			} else if ((local103 & 0x4) != 0) {
				local95--;
			}
			local103 = Static456.anIntArrayArray66[local93 - local87][local95 - local91];
		}
		local109 = 0;
		while (local101-- > 0) {
			arg13[local109] = Static539.anIntArray693[local101];
			arg12[local109++] = Static440.anIntArray616[local101];
			if (arg13.length <= local109) {
				break;
			}
		}
		return local109;
	}
}
