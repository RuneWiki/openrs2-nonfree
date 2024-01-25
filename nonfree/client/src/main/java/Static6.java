import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "v", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
	public static final int[] anIntArray5 = new int[5];

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	public static int anInt150 = 2;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	public static void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static124.anInt4221 <= arg2 && Static96.anInt2180 >= arg3 && arg0 >= Static228.anInt920 && arg1 <= Static307.anInt6214) {
			Static141.method2768(arg2, arg0, arg4, arg3, arg1);
		} else {
			Static276.method5029(arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
	public static void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1007) {
			Static72.method1649(10, arg1, arg2);
		} else if (arg0 == 1004) {
			Static72.method1649(11, arg1, arg2);
		} else if (arg0 == 1011) {
			Static72.method1649(12, arg1, arg2);
		} else if (arg0 == 1012) {
			Static72.method1649(13, arg1, arg2);
		} else if (arg0 == 1002) {
			Static72.method1649(14, arg1, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public static boolean method208() {
		return Static183.anInt3622 != 0 || Static295.anInt5969 >= 2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)I")
	public static int method209(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ae;IILclient!bk;IIIIIZLclient!kb;III)Lclient!bk;")
	public static Class7 method210(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class107 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg10 != null) {
			local11 = arg10.method3045(-1, arg6, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(51) long local51 = (long) (arg13 + (arg8 << 16) + (arg3 << 24)) + ((long) arg7 << 32) + ((long) arg0 << 48);
		@Pc(53) Class119 local53 = Static287.aClass119_173;
		@Pc(61) Class7 local61;
		synchronized (Static287.aClass119_173) {
			local61 = (Class7) Static287.aClass119_173.method3311(local51);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local61 == null || arg1.method4276(local61.method1435(), local11) != 0) {
			if (local61 != null) {
				local11 = arg1.method4256(local11, local61.method1435());
			}
			@Pc(88) byte local88;
			if (arg13 == 1) {
				local88 = 9;
			} else if (arg13 == 2) {
				local88 = 12;
			} else if (arg13 == 3) {
				local88 = 15;
			} else if (arg13 == 4) {
				local88 = 18;
			} else {
				local88 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(145) Class192 local145 = new Class192(local88 * 3 + 1, local88 * 3 * 2 + -local88, 0);
			local152 = local145.method5466(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local88];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local126[local158];
				local168 = local126[local158];
				for (local170 = 0; local170 < local88; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local88;
					@Pc(186) int local186 = Class24.anIntArray35[local178] * local164 >> 15;
					local194 = Class24.anIntArray36[local178] * local168 >> 15;
					local156[local158][local170] = local145.method5466(0, local186, local194);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(249) byte local249 = (byte) (local170 * arg8 + local168 * arg3 >> 8);
				@Pc(294) short local294 = (short) (((arg7 & 0xFC00) * local170 + local168 * (arg0 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local168 + local170 * (arg7 & 0x380) & 0x38000) + (local170 * (arg7 & 0x7F) + (arg0 & 0x7F) * local168 & 0x7F00) >> 8);
				for (local194 = 0; local194 < local88; local194++) {
					if (local164 == 0) {
						local145.method5470(local152, local294, (byte) -1, local249, local156[0][(local194 + 1) % local88], (short) -1, local156[0][local194], (byte) 1);
					} else {
						local145.method5470(local156[local164 - 1][local194], local294, (byte) -1, local249, local156[local164 - 1][(local194 + 1) % local88], (short) -1, local156[local164][(local194 + 1) % local88], (byte) 1);
						local145.method5470(local156[local164 - 1][local194], local294, (byte) -1, local249, local156[local164][(local194 + 1) % local88], (short) -1, local156[local164][local194], (byte) 1);
					}
				}
			}
			local61 = arg1.method4237(local145, local11, Static264.anInt5417, 64, 768);
			@Pc(418) Class119 local418 = Static287.aClass119_173;
			synchronized (Static287.aClass119_173) {
				Static287.aClass119_173.method3308(local61, local51);
			}
		}
		@Pc(437) int local437 = arg13 * 64 - 1;
		@Pc(440) int local440 = -local437;
		@Pc(443) int local443 = -local437;
		@Pc(445) int local445 = local437;
		local152 = local437;
		if (arg9) {
			if (arg2 > 1024 && arg2 < 7168) {
				local440 -= 128;
			}
			if (arg2 > 13312 || arg2 < 3072) {
				local443 -= 128;
			}
			if (arg2 > 5120 && arg2 < 11264) {
				local152 = local437 + 128;
			}
			if (arg2 > 9216 && arg2 < 15360) {
				local445 = local437 + 128;
			}
		}
		@Pc(488) int local488 = arg4.method1447();
		local158 = arg4.method1440();
		local164 = arg4.method1420();
		local168 = arg4.method1402();
		if (local445 < local158) {
			local158 = local445;
		}
		if (local443 > local164) {
			local164 = local443;
		}
		if (local440 > local488) {
			local488 = local440;
		}
		if (local168 > local152) {
			local168 = local152;
		}
		@Pc(527) Class2_Sub11_Sub1 local527 = null;
		if (arg10 != null) {
			@Pc(534) int local534 = arg10.anIntArray280[arg6];
			local527 = Static99.method2234(local534 >> 16);
			arg6 = local534 & 0xFFFF;
		}
		if (local527 == null) {
			local61 = local61.method1436((byte) 3, local11, true);
			local61.method1445((local158 - local488) / 2, 128, (local168 - local164) / 2);
			local61.method1413((local488 + local158) / 2, 0, (local164 + local168) / 2);
		} else {
			local61 = local61.method1436((byte) 3, local11, true);
			local61.method1445((local158 - local488) / 2, 128, (local168 - local164) / 2);
			local61.method1413((local158 + local488) / 2, 0, (local168 + local164) / 2);
			local61.method1421(arg6, local527);
		}
		if (arg11 != 0) {
			local61.method1428(arg11);
		}
		if (arg5 != 0) {
			local61.method1432(arg5);
		}
		if (arg12 != 0) {
			local61.method1413(0, arg12, 0);
		}
		return local61;
	}
}
