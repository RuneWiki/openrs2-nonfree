import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
	public static int anInt5158 = 0;

	@OriginalMember(owner = "client!ji", name = "Ib", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(II)V")
	public static void method4407(@OriginalArg(1) int arg0) {
		Static205.aLong118 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(I)V")
	public static void method4415() {
		Static387.anInt7430 = -1;
		Static55.anInt1301 = -1;
		Static327.anInt6815 = 0;
		Static567.anInt10049 = -1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BBLjava/lang/String;I)I")
	public static int method4434(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(8) int local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(17) char local17 = arg2.charAt(local10);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg1[arg3 + local10] = (byte) local17;
			} else if (local17 == '€') {
				arg1[arg3 + local10] = -128;
			} else if (local17 == '‚') {
				arg1[local10 + arg3] = -126;
			} else if (local17 == 'ƒ') {
				arg1[local10 + arg3] = -125;
			} else if (local17 == '„') {
				arg1[local10 + arg3] = -124;
			} else if (local17 == '…') {
				arg1[local10 + arg3] = -123;
			} else if (local17 == '†') {
				arg1[arg3 + local10] = -122;
			} else if (local17 == '‡') {
				arg1[local10 + arg3] = -121;
			} else if (local17 == 'ˆ') {
				arg1[arg3 + local10] = -120;
			} else if (local17 == '‰') {
				arg1[arg3 + local10] = -119;
			} else if (local17 == 'Š') {
				arg1[local10 + arg3] = -118;
			} else if (local17 == '‹') {
				arg1[local10 + arg3] = -117;
			} else if (local17 == 'Œ') {
				arg1[arg3 + local10] = -116;
			} else if (local17 == 'Ž') {
				arg1[arg3 + local10] = -114;
			} else if (local17 == '‘') {
				arg1[arg3 + local10] = -111;
			} else if (local17 == '’') {
				arg1[arg3 + local10] = -110;
			} else if (local17 == '“') {
				arg1[local10 + arg3] = -109;
			} else if (local17 == '”') {
				arg1[local10 + arg3] = -108;
			} else if (local17 == '•') {
				arg1[local10 + arg3] = -107;
			} else if (local17 == '–') {
				arg1[arg3 + local10] = -106;
			} else if (local17 == '—') {
				arg1[local10 + arg3] = -105;
			} else if (local17 == '˜') {
				arg1[local10 + arg3] = -104;
			} else if (local17 == '™') {
				arg1[local10 + arg3] = -103;
			} else if (local17 == 'š') {
				arg1[local10 + arg3] = -102;
			} else if (local17 == '›') {
				arg1[arg3 + local10] = -101;
			} else if (local17 == 'œ') {
				arg1[local10 + arg3] = -100;
			} else if (local17 == 'ž') {
				arg1[local10 + arg3] = -98;
			} else if (local17 == 'Ÿ') {
				arg1[arg3 + local10] = -97;
			} else {
				arg1[local10 + arg3] = 63;
			}
		}
		return local8;
	}
}
