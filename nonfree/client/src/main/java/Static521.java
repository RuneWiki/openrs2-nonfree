import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_39 = new Class25(16);

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt9520 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIBII)Z")
	public static boolean method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(10) int local10 = arg0; local10 <= arg2; local10++) {
			for (@Pc(13) int local13 = arg3; local13 <= arg1; local13++) {
				if (Static534.anIntArrayArray79[local10][local13] == arg4 && Static206.anIntArrayArray70[local10][local13] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method7718(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(19) int local19 = 0; local19 < local6; local19++) {
			@Pc(24) char local24 = arg0.charAt(local19);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local9[local19] = (byte) local24;
			} else if (local24 == '€') {
				local9[local19] = -128;
			} else if (local24 == '‚') {
				local9[local19] = -126;
			} else if (local24 == 'ƒ') {
				local9[local19] = -125;
			} else if (local24 == '„') {
				local9[local19] = -124;
			} else if (local24 == '…') {
				local9[local19] = -123;
			} else if (local24 == '†') {
				local9[local19] = -122;
			} else if (local24 == '‡') {
				local9[local19] = -121;
			} else if (local24 == 'ˆ') {
				local9[local19] = -120;
			} else if (local24 == '‰') {
				local9[local19] = -119;
			} else if (local24 == 'Š') {
				local9[local19] = -118;
			} else if (local24 == '‹') {
				local9[local19] = -117;
			} else if (local24 == 'Œ') {
				local9[local19] = -116;
			} else if (local24 == 'Ž') {
				local9[local19] = -114;
			} else if (local24 == '‘') {
				local9[local19] = -111;
			} else if (local24 == '’') {
				local9[local19] = -110;
			} else if (local24 == '“') {
				local9[local19] = -109;
			} else if (local24 == '”') {
				local9[local19] = -108;
			} else if (local24 == '•') {
				local9[local19] = -107;
			} else if (local24 == '–') {
				local9[local19] = -106;
			} else if (local24 == '—') {
				local9[local19] = -105;
			} else if (local24 == '˜') {
				local9[local19] = -104;
			} else if (local24 == '™') {
				local9[local19] = -103;
			} else if (local24 == 'š') {
				local9[local19] = -102;
			} else if (local24 == '›') {
				local9[local19] = -101;
			} else if (local24 == 'œ') {
				local9[local19] = -100;
			} else if (local24 == 'ž') {
				local9[local19] = -98;
			} else if (local24 == 'Ÿ') {
				local9[local19] = -97;
			} else {
				local9[local19] = 63;
			}
		}
		return local9;
	}
}
