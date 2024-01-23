import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lh", name = "Wb", descriptor = "I")
	public static int anInt3329;

	@OriginalMember(owner = "client!lh", name = "Nb", descriptor = "I")
	public static int anInt3320 = 99;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "(B)J")
	public static long method2696() {
		return Static124.aClass77_1.method4029();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ[BIILjava/lang/String;)I")
	public static int method2698(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(5) int local5 = arg1;
		for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
			@Pc(20) char local20 = arg3.charAt(local7);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[local7 + arg2] = (byte) local20;
			} else if (local20 == '€') {
				arg0[arg2 + local7] = -128;
			} else if (local20 == '‚') {
				arg0[local7 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg0[local7 + arg2] = -125;
			} else if (local20 == '„') {
				arg0[local7 + arg2] = -124;
			} else if (local20 == '…') {
				arg0[local7 + arg2] = -123;
			} else if (local20 == '†') {
				arg0[local7 + arg2] = -122;
			} else if (local20 == '‡') {
				arg0[arg2 + local7] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg2 + local7] = -120;
			} else if (local20 == '‰') {
				arg0[arg2 + local7] = -119;
			} else if (local20 == 'Š') {
				arg0[local7 + arg2] = -118;
			} else if (local20 == '‹') {
				arg0[local7 + arg2] = -117;
			} else if (local20 == 'Œ') {
				arg0[local7 + arg2] = -116;
			} else if (local20 == 'Ž') {
				arg0[local7 + arg2] = -114;
			} else if (local20 == '‘') {
				arg0[local7 + arg2] = -111;
			} else if (local20 == '’') {
				arg0[arg2 + local7] = -110;
			} else if (local20 == '“') {
				arg0[local7 + arg2] = -109;
			} else if (local20 == '”') {
				arg0[arg2 + local7] = -108;
			} else if (local20 == '•') {
				arg0[arg2 + local7] = -107;
			} else if (local20 == '–') {
				arg0[local7 + arg2] = -106;
			} else if (local20 == '—') {
				arg0[arg2 + local7] = -105;
			} else if (local20 == '˜') {
				arg0[arg2 + local7] = -104;
			} else if (local20 == '™') {
				arg0[arg2 + local7] = -103;
			} else if (local20 == 'š') {
				arg0[arg2 + local7] = -102;
			} else if (local20 == '›') {
				arg0[local7 + arg2] = -101;
			} else if (local20 == 'œ') {
				arg0[arg2 + local7] = -100;
			} else if (local20 == 'ž') {
				arg0[local7 + arg2] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[arg2 + local7] = -97;
			} else {
				arg0[arg2 + local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "(I)V")
	public static void method2700() {
		Static227.aClass135_27.method3317();
		Static140.aClass135_14.method3317();
		Static71.aClass135_5.method3317();
	}
}
