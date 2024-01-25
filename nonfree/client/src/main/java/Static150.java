import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ffa", name = "w", descriptor = "Lclient!hj;")
	public static final Class134 aClass134_3 = new Class134();

	@OriginalMember(owner = "client!ffa", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString93 = null;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class243 local13 = local7.aClass243_1; local13 != null; local13 = local13.aClass243_3) {
			@Pc(17) Class3_Sub1_Sub3 local17 = local13.aClass3_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort118 == arg1 && local17.aShort120 == arg2) {
				Static633.method9183(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILclient!qfa;Lclient!qfa;)V")
	public static void method7139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub5 arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4) {
		@Pc(4) Class100 local4 = Static633.method9184(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub5_2 = arg3;
		local4.aClass3_Sub1_Sub5_1 = arg4;
		@Pc(19) int local19 = Static9.aClass65Array1 == Static103.aClass65Array3 ? 1 : 0;
		if (!arg3.method8600()) {
			arg3.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local19];
			Static359.aClass3_Sub1Array94[local19] = arg3;
		} else if (arg3.method8601()) {
			arg3.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local19];
			Static548.aClass3_Sub1Array129[local19] = arg3;
		} else {
			arg3.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local19];
			Static124.aClass3_Sub1Array151[local19] = arg3;
			Static240.aBoolean380 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8600()) {
			if (arg4.method8601()) {
				arg4.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local19];
				Static548.aClass3_Sub1Array129[local19] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local19];
			Static124.aClass3_Sub1Array151[local19] = arg4;
			Static240.aBoolean380 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local19];
		Static359.aClass3_Sub1Array94[local19] = arg4;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[BIZLjava/lang/String;I)I")
	public static int method7140(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg0[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg0[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg0[arg3 + local17] = -124;
			} else if (local25 == '…') {
				arg0[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg0[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg0[local17 + arg3] = -121;
			} else if (local25 == 'ˆ') {
				arg0[arg3 + local17] = -120;
			} else if (local25 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg0[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg0[arg3 + local17] = -114;
			} else if (local25 == '‘') {
				arg0[arg3 + local17] = -111;
			} else if (local25 == '’') {
				arg0[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg0[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg0[arg3 + local17] = -107;
			} else if (local25 == '–') {
				arg0[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg0[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg3] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg0[arg3 + local17] = -101;
			} else if (local25 == 'œ') {
				arg0[arg3 + local17] = -100;
			} else if (local25 == 'ž') {
				arg0[arg3 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[arg3 + local17] = -97;
			} else {
				arg0[local17 + arg3] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)I")
	public static int method7141() {
		return Static2.anIntArray229 == null ? 0 : Static2.anIntArray229.length * 2;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[F)[F")
	public static float[] method7143(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static653.method7720(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
