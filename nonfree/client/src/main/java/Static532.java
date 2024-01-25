import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!nq;")
	public static Class255 aClass255_2;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	public static int anInt8252 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public static void method7158(@OriginalArg(0) int arg0) {
		if (arg0 == Static564.anInt8656) {
			return;
		}
		Static224.anInt3557 = Static267.anInt4309 = Static662.anIntArray719[arg0];
		Static591.method7777();
		Static430.anIntArrayArray39 = new int[Static224.anInt3557][Static267.anInt4309];
		Static71.anIntArrayArray6 = new int[Static224.anInt3557][Static267.anInt4309];
		Static418.anIntArrayArrayArray17 = new int[4][Static224.anInt3557 >> 3][Static267.anInt4309 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static263.aClass389Array1[local36] = Static564.method7466(Static224.anInt3557, Static267.anInt4309);
		}
		Static558.aByteArrayArrayArray18 = new byte[4][Static224.anInt3557][Static267.anInt4309];
		Static230.method3345(Static224.anInt3557, Static267.anInt4309);
		Static65.method1432(Static582.aClass33_13, Static267.anInt4309 >> 3, Static224.anInt3557 >> 3);
		Static564.anInt8656 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZIIZ)V")
	public static void method7159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(51) int local51 = Static445.aShort96 + local21 * (Static595.aShort115 - Static445.aShort96) / 100;
		if (local51 < Static53.aShort15) {
			local51 = Static53.aShort15;
		} else if (Static112.aShort39 < local51) {
			local51 = Static112.aShort39;
		}
		@Pc(81) int local81 = local51 * 512 * arg0 / (arg3 * 334);
		@Pc(119) int local119;
		@Pc(126) int local126;
		@Pc(90) short local90;
		if (Static362.aShort86 > local81) {
			local90 = Static362.aShort86;
			local51 = local90 * 334 * arg3 / (arg0 * 512);
			if (Static112.aShort39 < local51) {
				local51 = Static112.aShort39;
				local119 = arg0 * local51 * 512 / (local90 * 334);
				local126 = (arg3 - local119) / 2;
				if (arg4) {
					Static582.aClass33_13.la();
					Static582.aClass33_13.method8103(arg2, arg1, -16777216, arg0, local126);
					Static582.aClass33_13.method8103(arg3 + arg2 - local126, arg1, -16777216, arg0, local126);
				}
				arg3 -= local126 * 2;
				arg2 += local126;
			}
		} else if (Static379.aShort89 < local81) {
			local90 = Static379.aShort89;
			local51 = arg3 * 334 * local90 / (arg0 * 512);
			if (local51 < Static53.aShort15) {
				local51 = Static53.aShort15;
				local119 = local90 * 334 * arg3 / (local51 * 512);
				local126 = (arg0 - local119) / 2;
				if (arg4) {
					Static582.aClass33_13.la();
					Static582.aClass33_13.method8103(arg2, arg1, -16777216, local126, arg3);
					Static582.aClass33_13.method8103(arg2, arg1 + arg0 - local126, -16777216, local126, arg3);
				}
				arg0 -= local126 * 2;
				arg1 += local126;
			}
		}
		Static174.anInt3061 = arg2;
		Static184.anInt3146 = local51 * arg0 / 334;
		Static509.anInt7968 = (short) arg0;
		Static211.anInt10621 = (short) arg3;
		Static31.anInt9762 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
	public static int method7160() {
		return Static141.anInt2583;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)V")
	public static void method7162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static620.method7581();
		Static426.aLong194 = 0L;
		@Pc(16) int local16 = Static324.method4462();
		if (arg0 == 3 || local16 == 3) {
			arg3 = true;
		}
		if (!Static582.aClass33_13.method8130()) {
			arg3 = true;
		}
		Static77.method1621(arg0, arg1, arg2, local16, arg3);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[J[IIZ)V")
	public static void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) int local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg0; local60++) {
			if (arg1[local60] < local24 + (long) (local58 & local60)) {
				@Pc(81) long local81 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20] = local81;
				@Pc(95) int local95 = arg2[local60];
				arg2[local60] = arg2[local20];
				arg2[local20++] = local95;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method7163(local20 - 1, arg1, arg2, arg3);
		method7163(arg0, arg1, arg2, local20 + 1);
	}
}
