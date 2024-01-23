import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_199 = Static186.method3527("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	public static int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Lclient!hh;")
	public static Class50 aClass50_200 = Static186.method3527(":assist:");

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	public static int method379() {
		return 16;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method381() {
		@Pc(5) Class22 local5 = Static158.aClass22_1;
		synchronized (Static158.aClass22_1) {
			Static175.anInt3594++;
			Static64.anInt1281 = Static153.anInt3175;
			Static117.anInt2301 = Static84.anInt1716;
			Static110.anInt2205 = Static65.anInt4122;
			Static2.anInt59 = Static192.anInt3940;
			Static70.anInt1323 = Static12.anInt243;
			Static163.anInt3374 = Static122.anInt2418;
			Static27.aLong26 = Static32.aLong28;
			Static192.anInt3940 = 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)J")
	public static long method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1072; local13++) {
			@Pc(19) Class94 local19 = local7.aClass94Array1[local13];
			if ((local19.aLong143 >> 29 & 0x3L) == 2L && local19.anInt3686 == arg1 && local19.anInt3683 == arg2) {
				return local19.aLong143;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public static void method383() {
		if (Static217.anInt4288 == -1 || Static144.anInt2937 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static6.anInt108 * (Static22.anInt422 - Static150.anInt3128) >> 16) + Static150.anInt3128;
		Static6.anInt108 += local24;
		if (Static6.anInt108 < 65535) {
			Static135.aBoolean118 = false;
			Static221.aBoolean207 = false;
		} else {
			if (Static221.aBoolean207) {
				Static135.aBoolean118 = false;
			} else {
				Static135.aBoolean118 = true;
			}
			Static6.anInt108 = 65535;
			Static221.aBoolean207 = true;
		}
		@Pc(54) float local54 = (float) Static6.anInt108 / 65535.0F;
		@Pc(58) int local58 = Static129.anInt2543 * 2;
		@Pc(61) float[] local61 = new float[3];
		@Pc(128) int local128;
		@Pc(106) int local106;
		@Pc(73) int local73;
		@Pc(133) int local133;
		@Pc(158) int local158;
		@Pc(149) int local149;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			local73 = Static220.anIntArrayArrayArray13[Static217.anInt4288][local58][local63];
			local106 = (Static220.anIntArrayArrayArray13[Static217.anInt4288][local58 + 2][local63] + Static220.anIntArrayArrayArray13[Static217.anInt4288][local58 + 2][local63] - Static220.anIntArrayArrayArray13[Static217.anInt4288][local58 + 3][local63]) * 3;
			@Pc(116) int local116 = Static220.anIntArrayArrayArray13[Static217.anInt4288][local58][local63] * 3;
			local128 = Static220.anIntArrayArrayArray13[Static217.anInt4288][local58 + 1][local63] * 3;
			local133 = local128 - local116;
			local149 = Static220.anIntArrayArrayArray13[Static217.anInt4288][local58 + 2][local63] + local128 - local73 - local106;
			local158 = local116 + local106 - local128 * 2;
			local61[local63] = (float) local73 + local54 * ((float) local133 + ((float) local158 + local54 * (float) local149) * local54);
		}
		if (Static91.anInt4078 == 0 && Static101.anInt2041 == 0) {
			Static101.anInt2041 = (((int) local61[2] >> 10) - 6) * 8;
			Static91.anInt4078 = (((int) local61[0] >> 10) - 6) * 8;
		}
		@Pc(214) float[] local214 = new float[3];
		Static159.anInt4227 = (int) local61[0] - Static91.anInt4078 * 128;
		Static32.anInt601 = (int) local61[1] * -1;
		Static137.anInt2804 = (int) local61[2] - Static101.anInt2041 * 128;
		local128 = Static196.anInt3983 * 2;
		for (local106 = 0; local106 < 3; local106++) {
			local73 = Static220.anIntArrayArrayArray13[Static144.anInt2937][local128][local106] * 3;
			local133 = Static220.anIntArrayArrayArray13[Static144.anInt2937][local128 + 1][local106] * 3;
			local158 = (Static220.anIntArrayArrayArray13[Static144.anInt2937][local128 + 2][local106] + Static220.anIntArrayArrayArray13[Static144.anInt2937][local128 + 2][local106] - Static220.anIntArrayArrayArray13[Static144.anInt2937][local128 + 3][local106]) * 3;
			@Pc(310) int local310 = local133 - local73;
			local149 = Static220.anIntArrayArrayArray13[Static144.anInt2937][local128][local106];
			@Pc(335) int local335 = local133 + Static220.anIntArrayArrayArray13[Static144.anInt2937][local128 + 2][local106] - local149 - local158;
			@Pc(344) int local344 = local158 + local73 - local133 * 2;
			local214[local106] = local54 * ((float) local310 + local54 * ((float) local335 * local54 + (float) local344)) + (float) local149;
		}
		@Pc(377) float local377 = local214[0] - local61[0];
		@Pc(387) float local387 = -1.0F * (local214[1] - local61[1]);
		@Pc(395) float local395 = local214[2] - local61[2];
		@Pc(405) double local405 = Math.sqrt((double) (local377 * local377 + local395 * local395));
		Static162.aFloat4 = (float) Math.atan2((double) local387, local405);
		Static86.aFloat2 = -((float) Math.atan2((double) local377, (double) local395));
		Static166.anInt3404 = (int) ((double) Static86.aFloat2 * 325.949D) & 0x7FF;
		Static218.anInt3563 = (int) ((double) Static162.aFloat4 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(BII)V")
	public static void method384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		if (Static76.anInt1531 != arg1) {
			Static106.anIntArray202 = new int[arg1];
			for (local20 = 0; local20 < arg1; local20++) {
				Static106.anIntArray202[local20] = (local20 << 12) / arg1;
			}
			Static72.anInt1346 = arg1 == 64 ? 2048 : 4096;
			Static76.anInt1531 = arg1;
			Static121.anInt2385 = arg1 - 1;
		}
		if (Static30.anInt572 == arg0) {
			return;
		}
		if (arg0 == Static76.anInt1531) {
			Static23.anIntArray47 = Static106.anIntArray202;
		} else {
			Static23.anIntArray47 = new int[arg0];
			for (local20 = 0; local20 < arg0; local20++) {
				Static23.anIntArray47[local20] = (local20 << 12) / arg0;
			}
		}
		Static30.anInt572 = arg0;
		Static171.anInt3496 = arg0 - 1;
	}
}
