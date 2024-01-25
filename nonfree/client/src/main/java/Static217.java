import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	public static int anInt4016;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString171 = "M";

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString172 = " has logged out.";

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
	public static int anInt4022 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[BLjava/lang/String;ZII)I")
	public static int method3876(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3) {
		@Pc(14) int local14 = arg3;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) char local24 = arg2.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg1[local16 + arg0] = (byte) local24;
			} else if (local24 == '€') {
				arg1[arg0 + local16] = -128;
			} else if (local24 == '‚') {
				arg1[arg0 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg1[local16 + arg0] = -125;
			} else if (local24 == '„') {
				arg1[local16 + arg0] = -124;
			} else if (local24 == '…') {
				arg1[local16 + arg0] = -123;
			} else if (local24 == '†') {
				arg1[local16 + arg0] = -122;
			} else if (local24 == '‡') {
				arg1[local16 + arg0] = -121;
			} else if (local24 == 'ˆ') {
				arg1[arg0 + local16] = -120;
			} else if (local24 == '‰') {
				arg1[arg0 + local16] = -119;
			} else if (local24 == 'Š') {
				arg1[local16 + arg0] = -118;
			} else if (local24 == '‹') {
				arg1[local16 + arg0] = -117;
			} else if (local24 == 'Œ') {
				arg1[arg0 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg1[local16 + arg0] = -114;
			} else if (local24 == '‘') {
				arg1[arg0 + local16] = -111;
			} else if (local24 == '’') {
				arg1[local16 + arg0] = -110;
			} else if (local24 == '“') {
				arg1[local16 + arg0] = -109;
			} else if (local24 == '”') {
				arg1[arg0 + local16] = -108;
			} else if (local24 == '•') {
				arg1[local16 + arg0] = -107;
			} else if (local24 == '–') {
				arg1[local16 + arg0] = -106;
			} else if (local24 == '—') {
				arg1[arg0 + local16] = -105;
			} else if (local24 == '˜') {
				arg1[local16 + arg0] = -104;
			} else if (local24 == '™') {
				arg1[arg0 + local16] = -103;
			} else if (local24 == 'š') {
				arg1[local16 + arg0] = -102;
			} else if (local24 == '›') {
				arg1[arg0 + local16] = -101;
			} else if (local24 == 'œ') {
				arg1[arg0 + local16] = -100;
			} else if (local24 == 'ž') {
				arg1[local16 + arg0] = -98;
			} else if (local24 == 'Ÿ') {
				arg1[arg0 + local16] = -97;
			} else {
				arg1[arg0 + local16] = 63;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I")
	public static int method3878() {
		return 15;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V")
	public static void method3879(@OriginalArg(0) int arg0) {
		Static29.anInt558 = arg0;
		@Pc(7) Class70 local7 = Static66.aClass70_27;
		synchronized (Static66.aClass70_27) {
			Static66.aClass70_27.method1399();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3880(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
