import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!id;")
	public static Class99 aClass99_7;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
	public static boolean aBoolean255 = true;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;ZIII[B)I")
	public static int method3175(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(12) int local12 = arg1;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				arg3[local14 + arg2] = (byte) local21;
			} else if (local21 == '€') {
				arg3[arg2 + local14] = -128;
			} else if (local21 == '‚') {
				arg3[local14 + arg2] = -126;
			} else if (local21 == 'ƒ') {
				arg3[local14 + arg2] = -125;
			} else if (local21 == '„') {
				arg3[arg2 + local14] = -124;
			} else if (local21 == '…') {
				arg3[arg2 + local14] = -123;
			} else if (local21 == '†') {
				arg3[local14 + arg2] = -122;
			} else if (local21 == '‡') {
				arg3[local14 + arg2] = -121;
			} else if (local21 == 'ˆ') {
				arg3[local14 + arg2] = -120;
			} else if (local21 == '‰') {
				arg3[arg2 + local14] = -119;
			} else if (local21 == 'Š') {
				arg3[arg2 + local14] = -118;
			} else if (local21 == '‹') {
				arg3[local14 + arg2] = -117;
			} else if (local21 == 'Œ') {
				arg3[local14 + arg2] = -116;
			} else if (local21 == 'Ž') {
				arg3[arg2 + local14] = -114;
			} else if (local21 == '‘') {
				arg3[local14 + arg2] = -111;
			} else if (local21 == '’') {
				arg3[arg2 + local14] = -110;
			} else if (local21 == '“') {
				arg3[local14 + arg2] = -109;
			} else if (local21 == '”') {
				arg3[arg2 + local14] = -108;
			} else if (local21 == '•') {
				arg3[arg2 + local14] = -107;
			} else if (local21 == '–') {
				arg3[local14 + arg2] = -106;
			} else if (local21 == '—') {
				arg3[arg2 + local14] = -105;
			} else if (local21 == '˜') {
				arg3[local14 + arg2] = -104;
			} else if (local21 == '™') {
				arg3[arg2 + local14] = -103;
			} else if (local21 == 'š') {
				arg3[arg2 + local14] = -102;
			} else if (local21 == '›') {
				arg3[local14 + arg2] = -101;
			} else if (local21 == 'œ') {
				arg3[arg2 + local14] = -100;
			} else if (local21 == 'ž') {
				arg3[local14 + arg2] = -98;
			} else if (local21 == 'Ÿ') {
				arg3[arg2 + local14] = -97;
			} else {
				arg3[local14 + arg2] = 63;
			}
		}
		return local12;
	}
}
