import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public static int anInt5499 = 0;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_115 = new Class119(98, 3);

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public static final int anInt5509 = 1337;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;[BIBI)I")
	public static int method4316(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(13) int local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg1[local15 + arg3] = (byte) local22;
			} else if (local22 == '€') {
				arg1[arg3 + local15] = -128;
			} else if (local22 == '‚') {
				arg1[local15 + arg3] = -126;
			} else if (local22 == 'ƒ') {
				arg1[arg3 + local15] = -125;
			} else if (local22 == '„') {
				arg1[arg3 + local15] = -124;
			} else if (local22 == '…') {
				arg1[local15 + arg3] = -123;
			} else if (local22 == '†') {
				arg1[local15 + arg3] = -122;
			} else if (local22 == '‡') {
				arg1[local15 + arg3] = -121;
			} else if (local22 == 'ˆ') {
				arg1[arg3 + local15] = -120;
			} else if (local22 == '‰') {
				arg1[arg3 + local15] = -119;
			} else if (local22 == 'Š') {
				arg1[local15 + arg3] = -118;
			} else if (local22 == '‹') {
				arg1[arg3 + local15] = -117;
			} else if (local22 == 'Œ') {
				arg1[local15 + arg3] = -116;
			} else if (local22 == 'Ž') {
				arg1[local15 + arg3] = -114;
			} else if (local22 == '‘') {
				arg1[local15 + arg3] = -111;
			} else if (local22 == '’') {
				arg1[local15 + arg3] = -110;
			} else if (local22 == '“') {
				arg1[arg3 + local15] = -109;
			} else if (local22 == '”') {
				arg1[arg3 + local15] = -108;
			} else if (local22 == '•') {
				arg1[local15 + arg3] = -107;
			} else if (local22 == '–') {
				arg1[local15 + arg3] = -106;
			} else if (local22 == '—') {
				arg1[arg3 + local15] = -105;
			} else if (local22 == '˜') {
				arg1[local15 + arg3] = -104;
			} else if (local22 == '™') {
				arg1[local15 + arg3] = -103;
			} else if (local22 == 'š') {
				arg1[local15 + arg3] = -102;
			} else if (local22 == '›') {
				arg1[arg3 + local15] = -101;
			} else if (local22 == 'œ') {
				arg1[local15 + arg3] = -100;
			} else if (local22 == 'ž') {
				arg1[local15 + arg3] = -98;
			} else if (local22 == 'Ÿ') {
				arg1[arg3 + local15] = -97;
			} else {
				arg1[local15 + arg3] = 63;
			}
		}
		return local13;
	}
}
