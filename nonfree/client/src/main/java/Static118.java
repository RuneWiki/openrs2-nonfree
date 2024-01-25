import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_53 = new Class217(23, 1);

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public static final int anInt2407 = 2;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
	public static int method2053(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[local17 + arg2] = (byte) local25;
			} else if (local25 == '€') {
				arg1[local17 + arg2] = -128;
			} else if (local25 == '‚') {
				arg1[arg2 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg1[local17 + arg2] = -125;
			} else if (local25 == '„') {
				arg1[local17 + arg2] = -124;
			} else if (local25 == '…') {
				arg1[local17 + arg2] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg2] = -122;
			} else if (local25 == '‡') {
				arg1[arg2 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg2 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[arg2 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[arg2 + local17] = -118;
			} else if (local25 == '‹') {
				arg1[local17 + arg2] = -117;
			} else if (local25 == 'Œ') {
				arg1[local17 + arg2] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg2] = -114;
			} else if (local25 == '‘') {
				arg1[arg2 + local17] = -111;
			} else if (local25 == '’') {
				arg1[arg2 + local17] = -110;
			} else if (local25 == '“') {
				arg1[local17 + arg2] = -109;
			} else if (local25 == '”') {
				arg1[arg2 + local17] = -108;
			} else if (local25 == '•') {
				arg1[local17 + arg2] = -107;
			} else if (local25 == '–') {
				arg1[arg2 + local17] = -106;
			} else if (local25 == '—') {
				arg1[local17 + arg2] = -105;
			} else if (local25 == '˜') {
				arg1[local17 + arg2] = -104;
			} else if (local25 == '™') {
				arg1[arg2 + local17] = -103;
			} else if (local25 == 'š') {
				arg1[local17 + arg2] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg1[arg2 + local17] = -100;
			} else if (local25 == 'ž') {
				arg1[local17 + arg2] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[arg2 + local17] = -97;
			} else {
				arg1[arg2 + local17] = 63;
			}
		}
		return local10;
	}
}
