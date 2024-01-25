import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loading textures - ";

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method1318(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)V")
	public static void method1319(@OriginalArg(1) long arg0) {
		if (Static138.aClass204ArrayArrayArray1 != null) {
			if (Static81.anInt1609 == 1 || Static81.anInt1609 == 5) {
				Static80.method1555(arg0);
			} else if (Static81.anInt1609 == 4) {
				Static71.method1420(arg0);
			}
		}
		Static231.method4162(Static34.aClass2_6, (long) Static215.anInt4246);
		if (Static100.anInt2086 != -1) {
			Static217.method3977(Static100.anInt2086);
		}
		for (@Pc(43) int local43 = 0; local43 < Static118.anInt4791; local43++) {
			if (Static313.aBooleanArray30[local43]) {
				Static253.aBooleanArray27[local43] = true;
			}
			Static30.aBooleanArray4[local43] = Static313.aBooleanArray30[local43];
			Static313.aBooleanArray30[local43] = false;
		}
		Static32.anInt790 = Static215.anInt4246;
		if (Static34.aClass2_6.method3305()) {
			Static61.aBoolean124 = true;
		}
		Static193.aClass177_12 = null;
		if (Static100.anInt2086 != -1) {
			Static118.anInt4791 = 0;
			Static156.method2955();
		}
		Static34.aClass2_6.method3327();
		Static230.method4160(Static34.aClass2_6);
		@Pc(96) int local96 = Static255.method4551();
		if (local96 == -1) {
			local96 = Static147.anInt2901;
		}
		Static129.method2436(local96);
		Static24.method735(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047, Static78.anInt1579, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050, Static285.anInt5511);
		Static78.anInt1579 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method1323(@OriginalArg(1) int arg0) {
		Static145.anInt2845 = arg0;
		Static310.aClass140_157.method3819();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JIII)V")
	public static void method1324(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = (int) arg0 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg0 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], local25, true, 0, local18, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, 0, arg1, arg2);
			return;
		}
		@Pc(45) Class188 local45 = Static126.method2405(local32);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local25 == 0 || local25 == 2) {
			local58 = local45.anInt5541;
			local55 = local45.anInt5533;
		} else {
			local55 = local45.anInt5541;
			local58 = local45.anInt5533;
		}
		@Pc(69) int local69 = local45.anInt5553;
		if (local25 != 0) {
			local69 = (local69 << local25 & 0xF) + (local69 >> 4 - local25);
		}
		Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local58, 0, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], local69, local55, arg1, arg2);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BII)I")
	public static int method1325(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static324.method5447(arg1, 0, arg0);
	}
}
