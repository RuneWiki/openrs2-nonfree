import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Lclient!dk;")
	public static Class54 aClass54_109;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public static int anInt6678;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public static int anInt6680;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_94 = new Class134("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
	public static int anInt6684 = 2;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_197 = new Class102(28, -1);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method5176(@OriginalArg(1) int arg0) {
		if (Static263.anInt3675 == 1) {
			Static422.anInt6874 = arg0;
		} else if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
			Static252.anInt4057 = arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IJ)V")
	public static void method5177(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static294.anInt1008;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (local12 != Static133.anInt2393) {
			local20 = local12 - Static133.anInt2393;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local28 > local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static133.anInt2393 += local28;
		}
		@Pc(63) int local63 = Static136.anInt2424;
		if (!Static2.aClass148_Sub1_1.aBoolean245) {
			Static113.aFloat19 += (float) arg0 * Static126.aFloat5 / 40.0F * 8.0F;
			Static332.aFloat80 += (float) arg0 * Static371.aFloat96 / 40.0F * 8.0F;
		}
		if (local63 != Static153.anInt2665) {
			local20 = local63 - Static153.anInt2665;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static153.anInt2665 += local28;
		}
		Static442.method5596();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IC)B")
	public static byte method5179(@OriginalArg(1) char arg0) {
		@Pc(40) byte local40;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local40 = (byte) arg0;
		} else if (arg0 == '€') {
			local40 = -128;
		} else if (arg0 == '‚') {
			local40 = -126;
		} else if (arg0 == 'ƒ') {
			local40 = -125;
		} else if (arg0 == '„') {
			local40 = -124;
		} else if (arg0 == '…') {
			local40 = -123;
		} else if (arg0 == '†') {
			local40 = -122;
		} else if (arg0 == '‡') {
			local40 = -121;
		} else if (arg0 == 'ˆ') {
			local40 = -120;
		} else if (arg0 == '‰') {
			local40 = -119;
		} else if (arg0 == 'Š') {
			local40 = -118;
		} else if (arg0 == '‹') {
			local40 = -117;
		} else if (arg0 == 'Œ') {
			local40 = -116;
		} else if (arg0 == 'Ž') {
			local40 = -114;
		} else if (arg0 == '‘') {
			local40 = -111;
		} else if (arg0 == '’') {
			local40 = -110;
		} else if (arg0 == '“') {
			local40 = -109;
		} else if (arg0 == '”') {
			local40 = -108;
		} else if (arg0 == '•') {
			local40 = -107;
		} else if (arg0 == '–') {
			local40 = -106;
		} else if (arg0 == '—') {
			local40 = -105;
		} else if (arg0 == '˜') {
			local40 = -104;
		} else if (arg0 == '™') {
			local40 = -103;
		} else if (arg0 == 'š') {
			local40 = -102;
		} else if (arg0 == '›') {
			local40 = -101;
		} else if (arg0 == 'œ') {
			local40 = -100;
		} else if (arg0 == 'ž') {
			local40 = -98;
		} else if (arg0 == 'Ÿ') {
			local40 = -97;
		} else {
			local40 = 63;
		}
		return local40;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5180(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}
}
