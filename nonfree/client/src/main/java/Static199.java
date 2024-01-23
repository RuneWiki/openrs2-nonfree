import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt3859 = 1;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "J")
	public static long aLong129 = 0L;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString134 = "shake:";

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method3037() {
		if (Static293.anInt5837 == -1 || Static146.anInt2693 == -1) {
			return;
		}
		@Pc(32) int local32 = (Static174.anInt3207 * (Static273.anInt5458 - Static286.anInt5075) >> 16) + Static286.anInt5075;
		Static174.anInt3207 += local32;
		@Pc(39) float[] local39 = new float[3];
		if (Static174.anInt3207 < 65535) {
			Static153.aBoolean212 = false;
			Static165.aBoolean228 = false;
		} else {
			Static174.anInt3207 = 65535;
			if (Static153.aBoolean212) {
				Static165.aBoolean228 = false;
			} else {
				Static165.aBoolean228 = true;
			}
			Static153.aBoolean212 = true;
		}
		@Pc(65) float local65 = (float) Static174.anInt3207 / 65535.0F;
		@Pc(69) int local69 = Static283.anInt5621 * 2;
		@Pc(84) int local84;
		@Pc(96) int local96;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(142) int local142;
		@Pc(151) int local151;
		@Pc(169) int local169;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			local84 = Static241.anIntArrayArrayArray17[Static293.anInt5837][local69][local71] * 3;
			local96 = Static241.anIntArrayArrayArray17[Static293.anInt5837][local69 + 1][local71] * 3;
			local129 = (Static241.anIntArrayArrayArray17[Static293.anInt5837][local69 + 2][local71] + Static241.anIntArrayArrayArray17[Static293.anInt5837][local69 + 2][local71] - Static241.anIntArrayArrayArray17[Static293.anInt5837][local69 + 3][local71]) * 3;
			local137 = Static241.anIntArrayArrayArray17[Static293.anInt5837][local69][local71];
			local142 = local96 - local84;
			local151 = local84 + local129 - local96 * 2;
			local169 = local96 + Static241.anIntArrayArrayArray17[Static293.anInt5837][local69 + 2][local71] - local129 - local137;
			local39[local71] = local65 * ((float) local142 + (local65 * (float) local169 + (float) local151) * local65) + (float) local137;
		}
		Static185.anInt3457 = (int) local39[1] * -1;
		Static68.anInt4743 = (int) local39[2] - Static158.anInt2961 * 128;
		Static182.anInt3398 = (int) local39[0] - Static224.anInt4695 * 128;
		@Pc(222) float[] local222 = new float[3];
		local84 = Static131.anInt2514 * 2;
		for (local96 = 0; local96 < 3; local96++) {
			local129 = Static241.anIntArrayArrayArray17[Static146.anInt2693][local84][local96] * 3;
			local142 = (Static241.anIntArrayArrayArray17[Static146.anInt2693][local84 + 2][local96] + Static241.anIntArrayArrayArray17[Static146.anInt2693][local84 + 2][local96] - Static241.anIntArrayArrayArray17[Static146.anInt2693][local84 + 3][local96]) * 3;
			local137 = Static241.anIntArrayArrayArray17[Static146.anInt2693][local84 + 1][local96] * 3;
			local151 = Static241.anIntArrayArrayArray17[Static146.anInt2693][local84][local96];
			local169 = local137 - local129;
			@Pc(309) int local309 = local142 + local129 - local137 * 2;
			@Pc(327) int local327 = local137 + Static241.anIntArrayArrayArray17[Static146.anInt2693][local84 + 2][local96] - local151 - local142;
			local222[local96] = (((float) local309 + (float) local327 * local65) * local65 + (float) local169) * local65 + (float) local151;
		}
		@Pc(360) float local360 = (local222[1] - local39[1]) * -1.0F;
		@Pc(368) float local368 = local222[0] - local39[0];
		@Pc(376) float local376 = local222[2] - local39[2];
		@Pc(386) double local386 = Math.sqrt((double) (local368 * local368 + local376 * local376));
		Static177.aFloat98 = (float) Math.atan2((double) local360, local386);
		Static61.aFloat33 = -((float) Math.atan2((double) local368, (double) local376));
		Static77.anInt1548 = (int) ((double) Static177.aFloat98 * 325.949D) & 0x7FF;
		Static56.anInt1177 = (int) ((double) Static61.aFloat33 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3038(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(32) char local32 = arg0.charAt(local21);
			if (local13 == 0) {
				local32 = Character.toLowerCase(local32);
			} else if (local13 == 2 || Character.isUpperCase(local32)) {
				local32 = Static171.method2599(local32);
			}
			if (Character.isLetter(local32)) {
				local13 = 0;
			} else if (local32 == '.' || local32 == '?' || local32 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local32)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local21] = local32;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIZ)I")
	public static int method3040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg5;
			arg5 = local8;
		}
		@Pc(22) int local22 = arg0 & 0x3;
		if (local22 == 0) {
			return arg2;
		} else if (local22 == 1) {
			return arg3;
		} else if (local22 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method3041(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(16) int local16 = arg3;
		@Pc(22) int local22 = (arg3 + arg1) / 2;
		@Pc(26) String local26 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local26;
		@Pc(40) short local40 = arg2[local22];
		arg2[local22] = arg2[arg1];
		arg2[arg1] = local40;
		for (@Pc(52) int local52 = arg3; local52 < arg1; local52++) {
			if (local26 == null || arg0[local52] != null && arg0[local52].compareTo(local26) < (local52 & 0x1)) {
				@Pc(78) String local78 = arg0[local52];
				arg0[local52] = arg0[local16];
				arg0[local16] = local78;
				@Pc(92) short local92 = arg2[local52];
				arg2[local52] = arg2[local16];
				arg2[local16++] = local92;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local26;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local40;
		method3041(arg0, local16 - 1, arg2, arg3);
		method3041(arg0, arg1, arg2, local16 + 1);
	}
}
