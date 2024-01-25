import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!faa", name = "ec", descriptor = "J")
	public static long aLong132;

	@OriginalMember(owner = "client!faa", name = "L", descriptor = "I")
	public static int anInt5008 = 0;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)Z")
	public static boolean method4352(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)I")
	public static int method4359(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "(B)Z")
	public static boolean method4362() {
		return Static531.method7565("jaclib") ? Static531.method7565("hw3d") : false;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method4369(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local9[local16] = (byte) local21;
			} else if (local21 == '€') {
				local9[local16] = -128;
			} else if (local21 == '‚') {
				local9[local16] = -126;
			} else if (local21 == 'ƒ') {
				local9[local16] = -125;
			} else if (local21 == '„') {
				local9[local16] = -124;
			} else if (local21 == '…') {
				local9[local16] = -123;
			} else if (local21 == '†') {
				local9[local16] = -122;
			} else if (local21 == '‡') {
				local9[local16] = -121;
			} else if (local21 == 'ˆ') {
				local9[local16] = -120;
			} else if (local21 == '‰') {
				local9[local16] = -119;
			} else if (local21 == 'Š') {
				local9[local16] = -118;
			} else if (local21 == '‹') {
				local9[local16] = -117;
			} else if (local21 == 'Œ') {
				local9[local16] = -116;
			} else if (local21 == 'Ž') {
				local9[local16] = -114;
			} else if (local21 == '‘') {
				local9[local16] = -111;
			} else if (local21 == '’') {
				local9[local16] = -110;
			} else if (local21 == '“') {
				local9[local16] = -109;
			} else if (local21 == '”') {
				local9[local16] = -108;
			} else if (local21 == '•') {
				local9[local16] = -107;
			} else if (local21 == '–') {
				local9[local16] = -106;
			} else if (local21 == '—') {
				local9[local16] = -105;
			} else if (local21 == '˜') {
				local9[local16] = -104;
			} else if (local21 == '™') {
				local9[local16] = -103;
			} else if (local21 == 'š') {
				local9[local16] = -102;
			} else if (local21 == '›') {
				local9[local16] = -101;
			} else if (local21 == 'œ') {
				local9[local16] = -100;
			} else if (local21 == 'ž') {
				local9[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local9[local16] = -97;
			} else {
				local9[local16] = 63;
			}
		}
		return local9;
	}
}
