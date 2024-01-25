import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_20 = new Class74(10, 8);

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_323 = new Class196(8, 6);

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_105 = new Class187(22, 18);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method8445(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(14) byte[] local14 = new byte[local6];
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local14[local16] = (byte) local21;
			} else if (local21 == '€') {
				local14[local16] = -128;
			} else if (local21 == '‚') {
				local14[local16] = -126;
			} else if (local21 == 'ƒ') {
				local14[local16] = -125;
			} else if (local21 == '„') {
				local14[local16] = -124;
			} else if (local21 == '…') {
				local14[local16] = -123;
			} else if (local21 == '†') {
				local14[local16] = -122;
			} else if (local21 == '‡') {
				local14[local16] = -121;
			} else if (local21 == 'ˆ') {
				local14[local16] = -120;
			} else if (local21 == '‰') {
				local14[local16] = -119;
			} else if (local21 == 'Š') {
				local14[local16] = -118;
			} else if (local21 == '‹') {
				local14[local16] = -117;
			} else if (local21 == 'Œ') {
				local14[local16] = -116;
			} else if (local21 == 'Ž') {
				local14[local16] = -114;
			} else if (local21 == '‘') {
				local14[local16] = -111;
			} else if (local21 == '’') {
				local14[local16] = -110;
			} else if (local21 == '“') {
				local14[local16] = -109;
			} else if (local21 == '”') {
				local14[local16] = -108;
			} else if (local21 == '•') {
				local14[local16] = -107;
			} else if (local21 == '–') {
				local14[local16] = -106;
			} else if (local21 == '—') {
				local14[local16] = -105;
			} else if (local21 == '˜') {
				local14[local16] = -104;
			} else if (local21 == '™') {
				local14[local16] = -103;
			} else if (local21 == 'š') {
				local14[local16] = -102;
			} else if (local21 == '›') {
				local14[local16] = -101;
			} else if (local21 == 'œ') {
				local14[local16] = -100;
			} else if (local21 == 'ž') {
				local14[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local14[local16] = -97;
			} else {
				local14[local16] = 63;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!nba;I)I")
	public static int method8446(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		@Pc(7) String local7 = Static554.method3435(arg0);
		@Pc(9) int[] local9 = null;
		if (Static613.method8234(arg0.anInt6711)) {
			local9 = Static259.aClass135_1.method2776((int) arg0.aLong198).anIntArray351;
		} else if (arg0.anInt6709 != -1) {
			local9 = Static259.aClass135_1.method2776(arg0.anInt6709).anIntArray351;
		} else if (Static152.method2244(arg0.anInt6711)) {
			@Pc(84) Class5_Sub34 local84 = (Class5_Sub34) Static223.aClass335_19.method7766((long) (int) arg0.aLong198);
			if (local84 != null) {
				@Pc(89) Class41_Sub1_Sub1_Sub3_Sub1 local89 = local84.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				@Pc(92) Class311 local92 = local89.aClass311_1;
				if (local92.anIntArray476 != null) {
					local92 = local92.method7325(Static413.aClass63_1);
				}
				if (local92 != null) {
					local9 = local92.anIntArray474;
				}
			}
		} else if (Static63.method930(arg0.anInt6711)) {
			@Pc(53) Class81 local53;
			if (arg0.anInt6711 == 1007) {
				local53 = Static400.aClass140_4.method2839((int) arg0.aLong198);
			} else {
				local53 = Static400.aClass140_4.method2839((int) (arg0.aLong198 >>> 32 & 0x7FFFFFFFL));
			}
			if (local53.anIntArray100 != null) {
				local53 = local53.method1760(Static413.aClass63_1);
			}
			if (local53 != null) {
				local9 = local53.anIntArray96;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static216.method3090(local9);
		}
		@Pc(133) int local133 = Static358.aClass198_7.method4083(Static113.aClass59Array2, local7);
		if (arg0.aBoolean481) {
			local133 += Static649.aClass59_39.method8049() + 4;
		}
		return local133;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I")
	public static int method8448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}
}
