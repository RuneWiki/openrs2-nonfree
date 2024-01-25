import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!dm", name = "X", descriptor = "Lclient!iq;")
	public static Class104 aClass104_43;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_48 = new Class221(61, 3);

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_8 = new Class107(128);

	@OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[II[IIILclient!ek;IIZIIIB)I")
	public static int method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class61 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static182.anIntArrayArray26[local3][local7] = 0;
				Static233.anIntArrayArray47[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg1 == 1) {
			local51 = Static343.method3358(arg5, arg6, arg7, arg9, arg3, arg12, arg8, arg11, arg0, arg13);
		} else if (arg1 == 2) {
			local51 = Static191.method3579(arg5, arg7, arg0, arg6, arg11, arg13, arg9, arg12, arg3, arg8);
		} else {
			local51 = Static247.method4393(arg6, arg5, arg0, arg11, arg12, arg7, arg1, arg9, arg13, arg8, arg3);
		}
		@Pc(111) int local111 = arg13 - 64;
		@Pc(115) int local115 = arg11 - 64;
		@Pc(117) int local117 = Static49.anInt821;
		@Pc(119) int local119 = Static152.anInt3473;
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(136) int local136;
		if (!local51) {
			if (!arg10) {
				return -1;
			}
			local127 = Integer.MAX_VALUE;
			local129 = Integer.MAX_VALUE;
			for (local136 = arg5 - 10; local136 <= arg5 + 10; local136++) {
				for (@Pc(142) int local142 = arg0 - 10; local142 <= arg0 + 10; local142++) {
					@Pc(149) int local149 = local136 - local111;
					@Pc(154) int local154 = local142 - local115;
					if (local149 >= 0 && local154 >= 0 && local149 < 128 && local154 < 128 && Static233.anIntArrayArray47[local149][local154] < 100) {
						@Pc(175) int local175 = 0;
						if (arg5 > local136) {
							local175 = arg5 - local136;
						} else if (arg5 + arg6 - 1 < local136) {
							local175 = local136 + 1 - arg6 - arg5;
						}
						@Pc(211) int local211 = 0;
						if (local142 < arg0) {
							local211 = arg0 - local142;
						} else if (arg3 + arg0 - 1 < local142) {
							local211 = local142 + 1 - arg0 - arg3;
						}
						@Pc(246) int local246 = local211 * local211 + local175 * local175;
						if (local127 > local246 || local127 == local246 && Static233.anIntArrayArray47[local149][local154] < local129) {
							local119 = local142;
							local117 = local136;
							local129 = Static233.anIntArrayArray47[local149][local154];
							local127 = local246;
						}
					}
				}
			}
			if (local127 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg13 == local117 && arg11 == local119) {
			return 0;
		}
		@Pc(314) byte local314 = 0;
		Static309.anIntArray471[0] = local117;
		local127 = local314 + 1;
		Static270.anIntArray432[0] = local119;
		@Pc(336) int local336;
		local129 = local336 = Static182.anIntArrayArray26[local117 - local111][local119 - local115];
		while (local117 != arg13 || local119 != arg11) {
			if (local336 != local129) {
				Static309.anIntArray471[local127] = local117;
				local336 = local129;
				Static270.anIntArray432[local127++] = local119;
			}
			if ((local129 & 0x2) != 0) {
				local117++;
			} else if ((local129 & 0x8) != 0) {
				local117--;
			}
			if ((local129 & 0x1) != 0) {
				local119++;
			} else if ((local129 & 0x4) != 0) {
				local119--;
			}
			local129 = Static182.anIntArrayArray26[local117 - local111][local119 - local115];
		}
		local136 = 0;
		while (local127-- > 0) {
			arg4[local136] = Static309.anIntArray471[local127];
			arg2[local136++] = Static270.anIntArray432[local127];
			if (arg4.length <= local136) {
				break;
			}
		}
		return local136;
	}

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V")
	public static void method1318() {
		for (@Pc(14) Class2_Sub33 local14 = (Class2_Sub33) Static108.aClass180_15.method4919(); local14 != null; local14 = (Class2_Sub33) Static108.aClass180_15.method4916()) {
			if (local14.anInt5553 > 0) {
				local14.anInt5553--;
			}
			if (local14.anInt5553 != 0) {
				if (local14.anInt5556 > 0) {
					local14.anInt5556--;
				}
				if (local14.anInt5556 == 0 && local14.anInt5552 >= 1 && local14.anInt5558 >= 1 && Static66.anInt1177 - 2 >= local14.anInt5552 && Static12.anInt213 - 2 >= local14.anInt5558 && (local14.anInt5549 < 0 || Static139.method2703(local14.anInt5550, local14.anInt5549))) {
					Static177.method3428(local14.anInt5548, local14.anInt5558, -1, local14.anInt5550, local14.anInt5560, local14.anInt5552, local14.anInt5554, local14.anInt5549);
					local14.anInt5556 = -1;
					if (local14.anInt5555 == local14.anInt5549 && local14.anInt5555 == -1) {
						local14.method5723();
					} else if (local14.anInt5549 == local14.anInt5555 && local14.anInt5554 == local14.anInt5557 && local14.anInt5550 == local14.anInt5559) {
						local14.method5723();
					}
				}
			} else if (local14.anInt5555 < 0 || Static139.method2703(local14.anInt5559, local14.anInt5555)) {
				Static177.method3428(local14.anInt5548, local14.anInt5558, -1, local14.anInt5559, local14.anInt5560, local14.anInt5552, local14.anInt5557, local14.anInt5555);
				local14.method5723();
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
	public static void method1320() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static62.aBooleanArray7[local11] = false;
		}
		Static58.anInt1028 = -1;
		Static135.anInt2910 = 1;
		Static133.anInt2845 = 0;
		Static309.anInt6122 = 0;
		Static295.anInt5862 = -1;
	}
}
