import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public static int anInt4294;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "S")
	public static short aShort29 = 256;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt4285 = -1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3411(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local4];
		for (@Pc(13) int local13 = 0; local13 < local4; local13++) {
			@Pc(24) char local24 = arg0.charAt(local13);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local13] = (byte) local24;
			} else if (local24 == '€') {
				local11[local13] = -128;
			} else if (local24 == '‚') {
				local11[local13] = -126;
			} else if (local24 == 'ƒ') {
				local11[local13] = -125;
			} else if (local24 == '„') {
				local11[local13] = -124;
			} else if (local24 == '…') {
				local11[local13] = -123;
			} else if (local24 == '†') {
				local11[local13] = -122;
			} else if (local24 == '‡') {
				local11[local13] = -121;
			} else if (local24 == 'ˆ') {
				local11[local13] = -120;
			} else if (local24 == '‰') {
				local11[local13] = -119;
			} else if (local24 == 'Š') {
				local11[local13] = -118;
			} else if (local24 == '‹') {
				local11[local13] = -117;
			} else if (local24 == 'Œ') {
				local11[local13] = -116;
			} else if (local24 == 'Ž') {
				local11[local13] = -114;
			} else if (local24 == '‘') {
				local11[local13] = -111;
			} else if (local24 == '’') {
				local11[local13] = -110;
			} else if (local24 == '“') {
				local11[local13] = -109;
			} else if (local24 == '”') {
				local11[local13] = -108;
			} else if (local24 == '•') {
				local11[local13] = -107;
			} else if (local24 == '–') {
				local11[local13] = -106;
			} else if (local24 == '—') {
				local11[local13] = -105;
			} else if (local24 == '˜') {
				local11[local13] = -104;
			} else if (local24 == '™') {
				local11[local13] = -103;
			} else if (local24 == 'š') {
				local11[local13] = -102;
			} else if (local24 == '›') {
				local11[local13] = -101;
			} else if (local24 == 'œ') {
				local11[local13] = -100;
			} else if (local24 == 'ž') {
				local11[local13] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(CI)B")
	public static byte method3412(@OriginalArg(0) char arg0) {
		@Pc(32) byte local32;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local32 = (byte) arg0;
		} else if (arg0 == '€') {
			local32 = -128;
		} else if (arg0 == '‚') {
			local32 = -126;
		} else if (arg0 == 'ƒ') {
			local32 = -125;
		} else if (arg0 == '„') {
			local32 = -124;
		} else if (arg0 == '…') {
			local32 = -123;
		} else if (arg0 == '†') {
			local32 = -122;
		} else if (arg0 == '‡') {
			local32 = -121;
		} else if (arg0 == 'ˆ') {
			local32 = -120;
		} else if (arg0 == '‰') {
			local32 = -119;
		} else if (arg0 == 'Š') {
			local32 = -118;
		} else if (arg0 == '‹') {
			local32 = -117;
		} else if (arg0 == 'Œ') {
			local32 = -116;
		} else if (arg0 == 'Ž') {
			local32 = -114;
		} else if (arg0 == '‘') {
			local32 = -111;
		} else if (arg0 == '’') {
			local32 = -110;
		} else if (arg0 == '“') {
			local32 = -109;
		} else if (arg0 == '”') {
			local32 = -108;
		} else if (arg0 == '•') {
			local32 = -107;
		} else if (arg0 == '–') {
			local32 = -106;
		} else if (arg0 == '—') {
			local32 = -105;
		} else if (arg0 == '˜') {
			local32 = -104;
		} else if (arg0 == '™') {
			local32 = -103;
		} else if (arg0 == 'š') {
			local32 = -102;
		} else if (arg0 == '›') {
			local32 = -101;
		} else if (arg0 == 'œ') {
			local32 = -100;
		} else if (arg0 == 'ž') {
			local32 = -98;
		} else if (arg0 == 'Ÿ') {
			local32 = -97;
		} else {
			local32 = 63;
		}
		return local32;
	}
}
