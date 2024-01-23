import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
	public static int anInt2061;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	public static int anInt2039 = 100;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[I")
	public static int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString82 = "scroll:";

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public static int anInt2048 = 0;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString83 = null;

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString84 = "Loading sprites - ";

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIII)I")
	public static int method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(28) int local28 = arg1;
			arg1 = arg2;
			arg2 = local28;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return arg3;
		} else if (local7 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return 7 + 1 - arg3 - arg2;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method1792(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) byte[] local17 = new byte[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(30) char local30 = arg0.charAt(local19);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				local17[local19] = (byte) local30;
			} else if (local30 == '€') {
				local17[local19] = -128;
			} else if (local30 == '‚') {
				local17[local19] = -126;
			} else if (local30 == 'ƒ') {
				local17[local19] = -125;
			} else if (local30 == '„') {
				local17[local19] = -124;
			} else if (local30 == '…') {
				local17[local19] = -123;
			} else if (local30 == '†') {
				local17[local19] = -122;
			} else if (local30 == '‡') {
				local17[local19] = -121;
			} else if (local30 == 'ˆ') {
				local17[local19] = -120;
			} else if (local30 == '‰') {
				local17[local19] = -119;
			} else if (local30 == 'Š') {
				local17[local19] = -118;
			} else if (local30 == '‹') {
				local17[local19] = -117;
			} else if (local30 == 'Œ') {
				local17[local19] = -116;
			} else if (local30 == 'Ž') {
				local17[local19] = -114;
			} else if (local30 == '‘') {
				local17[local19] = -111;
			} else if (local30 == '’') {
				local17[local19] = -110;
			} else if (local30 == '“') {
				local17[local19] = -109;
			} else if (local30 == '”') {
				local17[local19] = -108;
			} else if (local30 == '•') {
				local17[local19] = -107;
			} else if (local30 == '–') {
				local17[local19] = -106;
			} else if (local30 == '—') {
				local17[local19] = -105;
			} else if (local30 == '˜') {
				local17[local19] = -104;
			} else if (local30 == '™') {
				local17[local19] = -103;
			} else if (local30 == 'š') {
				local17[local19] = -102;
			} else if (local30 == '›') {
				local17[local19] = -101;
			} else if (local30 == 'œ') {
				local17[local19] = -100;
			} else if (local30 == 'ž') {
				local17[local19] = -98;
			} else if (local30 == 'Ÿ') {
				local17[local19] = -97;
			} else {
				local17[local19] = 63;
			}
		}
		return local17;
	}
}
