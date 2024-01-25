import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_1 = new Class193(0, 3, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_2 = new Class193(1, 3, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_3 = new Class193(2, 4, Static554.aClass340_14);

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_4 = new Class193(3, 1, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_5 = new Class193(4, 2, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_6 = new Class193(5, 3, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!ko;")
	public static final Class193 aClass193_7 = new Class193(6, 4, Static554.aClass340_18);

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	public static final int anInt5110 = Static267.method4195(16);

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public static int anInt5111 = 100;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Z")
	public static boolean method4290() {
		@Pc(7) boolean local7 = true;
		if (Static554.aClass318_4 == null) {
			if (Static141.aClass111_32.method2434(Static291.anInt5360)) {
				Static554.aClass318_4 = Static604.method7064(Static141.aClass111_32, Static291.anInt5360);
			} else {
				local7 = false;
			}
		}
		if (Static92.aClass318_2 == null) {
			if (Static141.aClass111_32.method2434(Static548.anInt9028)) {
				Static92.aClass318_2 = Static604.method7064(Static141.aClass111_32, Static548.anInt9028);
			} else {
				local7 = false;
			}
		}
		if (Static115.aClass318_3 == null) {
			if (Static141.aClass111_32.method2434(Static218.anInt4226)) {
				Static115.aClass318_3 = Static604.method7064(Static141.aClass111_32, Static218.anInt4226);
			} else {
				local7 = false;
			}
		}
		if (Static394.aClass13_9 == null) {
			if (Static530.aClass111_114.method2434(Static9.anInt153)) {
				Static394.aClass13_9 = Static252.method7834(Static530.aClass111_114, Static9.anInt153);
			} else {
				local7 = false;
			}
		}
		if (Static247.aClass318Array1 == null) {
			if (Static141.aClass111_32.method2434(Static9.anInt153)) {
				Static247.aClass318Array1 = Static604.method7069(Static141.aClass111_32, Static9.anInt153);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)Lclient!ko;")
	public static Class193 method4291(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass193_1;
		} else if (arg0 == 1) {
			return aClass193_2;
		} else if (arg0 == 2) {
			return aClass193_3;
		} else if (arg0 == 3) {
			return aClass193_4;
		} else if (arg0 == 4) {
			return aClass193_5;
		} else if (arg0 == 5) {
			return aClass193_6;
		} else if (arg0 == 6) {
			return aClass193_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BII)[B")
	public static byte[] method4292(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(25) byte[] local25 = new byte[arg1];
		Static600.method3768(arg0, 0, local25, 0, arg1);
		return local25;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!da;Lclient!hca;ILclient!r;IIBIIIIII)Lclient!da;")
	public static Class61 method4293(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg2 != null) {
			local11 = arg2.method3243(arg11, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg7 << 48) + ((long) (arg9 + (arg8 << 16) + (arg12 << 24)) + ((long) arg10 << 32));
		@Pc(51) Class326 local51 = Static421.aClass326_42;
		@Pc(59) Class61 local59;
		synchronized (Static421.aClass326_42) {
			local59 = (Class61) Static421.aClass326_42.method7238(local49);
		}
		if (local59 == null || arg4.method6467(local59.PA(), local11) != 0) {
			if (local59 != null) {
				local11 = arg4.method6445(local11, local59.PA());
			}
			@Pc(116) byte local116;
			if (arg9 == 1) {
				local116 = 9;
			} else if (arg9 == 2) {
				local116 = 12;
			} else if (arg9 == 3) {
				local116 = 15;
			} else if (arg9 == 4) {
				local116 = 18;
			} else {
				local116 = 21;
			}
			@Pc(145) int[] local145 = new int[] { 64, 96, 128 };
			@Pc(163) Class43 local163 = new Class43(local116 * 3 + 1, -local116 + 2 * 3 * local116, 0);
			@Pc(170) int local170 = local163.method1372(0, 0, 0);
			@Pc(174) int[][] local174 = new int[3][local116];
			@Pc(182) int local182;
			@Pc(186) int local186;
			@Pc(188) int local188;
			@Pc(212) int local212;
			for (@Pc(176) int local176 = 0; local176 < 3; local176++) {
				local182 = local145[local176];
				local186 = local145[local176];
				for (local188 = 0; local188 < local116; local188++) {
					@Pc(196) int local196 = (local188 << 14) / local116;
					@Pc(204) int local204 = local182 * Class151.anIntArray244[local196] >> 14;
					local212 = Class151.anIntArray245[local196] * local186 >> 14;
					local174[local176][local188] = local163.method1372(local212, local204, 0);
				}
			}
			for (local182 = 0; local182 < 3; local182++) {
				local186 = (local182 * 256 + 128) / 3;
				local188 = 256 - local186;
				@Pc(263) byte local263 = (byte) (arg12 * local186 + arg8 * local188 >> 8);
				@Pc(308) short local308 = (short) (((arg10 & 0x380) * local188 + (arg7 & 0x380) * local186 & 0x38000) + ((arg7 & 0xFC00) * local186 + (arg10 & 0xFC00) * local188 & 0xFC0000) + (local186 * (arg7 & 0x7F) + (arg10 & 0x7F) * local188 & 0x7F00) >> 8);
				for (local212 = 0; local212 < local116; local212++) {
					if (local182 == 0) {
						local163.method1373(local263, local308, local174[0][local212], (byte) -1, local170, (short) -1, (byte) 1, local174[0][(local212 + 1) % local116]);
					} else {
						local163.method1373(local263, local308, local174[local182][(local212 + 1) % local116], (byte) -1, local174[local182 - 1][local212], (short) -1, (byte) 1, local174[local182 - 1][(local212 + 1) % local116]);
						local163.method1373(local263, local308, local174[local182][local212], (byte) -1, local174[local182 - 1][local212], (short) -1, (byte) 1, local174[local182][(local212 + 1) % local116]);
					}
				}
			}
			local59 = arg4.method6407(local163, local11, Static344.anInt6075, 64, 768);
			@Pc(431) Class326 local431 = Static421.aClass326_42;
			synchronized (Static421.aClass326_42) {
				Static421.aClass326_42.method7236(local59, local49);
			}
		}
		@Pc(447) int local447 = arg1.KA();
		@Pc(450) int local450 = arg1.l();
		@Pc(453) int local453 = arg1.OA();
		@Pc(456) int local456 = arg1.za();
		@Pc(458) Class1_Sub3_Sub13 local458 = null;
		if (arg2 != null) {
			@Pc(465) int local465 = arg2.anIntArray202[arg11];
			local458 = Static594.aClass311_2.method7006(local465 >> 16);
			arg11 = local465 & 0xFFFF;
		}
		if (local458 == null) {
			local59 = local59.method7591((byte) 3, local11, true);
			local59.R(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local59.oa(local450 + local447 >> 1, 0, local453 + local456 >> 1);
		} else {
			local59 = local59.method7591((byte) 3, local11, true);
			local59.R(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local59.oa(local450 + local447 >> 1, 0, local453 + local456 >> 1);
			local59.method7594(arg11, local458);
		}
		if (arg3 != 0) {
			local59.MA(arg3);
		}
		if (arg5 != 0) {
			local59.W(arg5);
		}
		if (arg0 != 0) {
			local59.oa(0, arg0, 0);
		}
		return local59;
	}
}
