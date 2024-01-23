import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt2760;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	public static int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString175 = "flash2:";

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString177 = "glow3:";

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lclient!td;")
	public static Class1_Sub2_Sub16 method2100(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static238.aClass58_12.method2093((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static200.aClass51_64.method1874(Static232.method3872(arg0), Static264.method4212(arg0));
		local10 = new Class1_Sub2_Sub16();
		if (local29 != null) {
			local10.method3704(new Class1_Sub13(local29));
		}
		Static238.aClass58_12.method2089((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!e;IIIIIIIZ)V")
	public static void method2102(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static68.anInt1403;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static112.anInt2954;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static38.anIntArrayArrayArray6[arg1][arg6][arg7] - Static24.anInt815;
		@Pc(49) int local49 = Static38.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static24.anInt815;
		@Pc(63) int local63 = Static38.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static24.anInt815;
		@Pc(75) int local75 = Static38.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static24.anInt815;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static235.anInt5119 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static235.anInt5117 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static235.anInt5119 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static235.anInt5117 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static235.anInt5119 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static235.anInt5117 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static235.anInt5119 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static235.anInt5117 + (local85 << 9) / local261;
		Static235.anInt5120 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static112.aBoolean162 && Static134.method2499(Static230.anInt5408 + Static235.anInt5119, Static134.anInt3303 + Static235.anInt5117, local315, local331, local299, local307, local323, local291)) {
				Static58.anInt1619 = arg6;
				Static266.anInt5559 = arg7;
			}
			if (!arg8) {
				Static235.aBoolean258 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static235.anInt5116 || local323 > Static235.anInt5116 || local291 > Static235.anInt5116) {
					Static235.aBoolean258 = true;
				}
				if (arg0.anInt1462 == -1) {
					if (arg0.anInt1465 != 12345678) {
						Static235.method3896(local315, local331, local299, local307, local323, local291, arg0.anInt1465, arg0.anInt1459, arg0.anInt1466);
					}
				} else if (!Static140.aBoolean181) {
					local473 = Static235.anInterface1_1.method391(arg0.anInt1462);
					Static235.method3896(local315, local331, local299, local307, local323, local291, Static170.method2959(local473, arg0.anInt1465), Static170.method2959(local473, arg0.anInt1459), Static170.method2959(local473, arg0.anInt1466));
				} else if (arg0.aBoolean86) {
					Static235.method3911(local315, local331, local299, local307, local323, local291, arg0.anInt1465, arg0.anInt1459, arg0.anInt1466, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1462);
				} else {
					Static235.method3911(local315, local331, local299, local307, local323, local291, arg0.anInt1465, arg0.anInt1459, arg0.anInt1466, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1462);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static112.aBoolean162 && Static134.method2499(Static230.anInt5408 + Static235.anInt5119, Static134.anInt3303 + Static235.anInt5117, local283, local299, local331, local275, local291, local323)) {
			Static58.anInt1619 = arg6;
			Static266.anInt5559 = arg7;
		}
		if (arg8) {
			return;
		}
		Static235.aBoolean258 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static235.anInt5116 || local291 > Static235.anInt5116 || local323 > Static235.anInt5116) {
			Static235.aBoolean258 = true;
		}
		if (arg0.anInt1462 != -1) {
			if (Static140.aBoolean181) {
				Static235.method3911(local283, local299, local331, local275, local291, local323, arg0.anInt1467, arg0.anInt1466, arg0.anInt1459, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1462);
				return;
			}
			local473 = Static235.anInterface1_1.method391(arg0.anInt1462);
			Static235.method3896(local283, local299, local331, local275, local291, local323, Static170.method2959(local473, arg0.anInt1467), Static170.method2959(local473, arg0.anInt1466), Static170.method2959(local473, arg0.anInt1459));
		} else if (arg0.anInt1467 != 12345678) {
			Static235.method3896(local283, local299, local331, local275, local291, local323, arg0.anInt1467, arg0.anInt1466, arg0.anInt1459);
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZ)V")
	public static void method2103() {
		@Pc(3) byte[][] local3 = Static240.aByteArrayArray11;
		@Pc(6) int local6 = Static254.aByteArrayArray13.length;
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(22) byte[] local22 = local3[local16];
			if (local22 != null) {
				@Pc(35) int local35 = (Static169.anIntArray298[local16] >> 8) * 64 - Static64.anInt1786;
				@Pc(46) int local46 = (Static169.anIntArray298[local16] & 0xFF) * 64 - Static29.anInt907;
				Static98.method2086();
				Static175.method3006(Static47.aClass65Array1, local46, local22, local35);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method2104() {
		Static63.aClass79_9.method2489();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)J")
	public static long method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass85_1 == null ? 0L : local7.aClass85_1.aLong111;
	}
}
