import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_14 = new Class117(6, 7);

	@OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
	public static int anInt8318 = -1;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)Z")
	public static boolean method6919() {
		return Static234.method4121("jaclib") ? Static234.method4121("hw3d") : false;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
	public static int method6921(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[local17 + arg3] = (byte) local25;
			} else if (local25 == '€') {
				arg1[arg3 + local17] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg1[local17 + arg3] = -125;
			} else if (local25 == '„') {
				arg1[arg3 + local17] = -124;
			} else if (local25 == '…') {
				arg1[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg1[arg3 + local17] = -122;
			} else if (local25 == '‡') {
				arg1[local17 + arg3] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg3 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg1[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg1[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg1[arg3 + local17] = -114;
			} else if (local25 == '‘') {
				arg1[local17 + arg3] = -111;
			} else if (local25 == '’') {
				arg1[local17 + arg3] = -110;
			} else if (local25 == '“') {
				arg1[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg1[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg1[arg3 + local17] = -107;
			} else if (local25 == '–') {
				arg1[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg1[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg1[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg1[arg3 + local17] = -103;
			} else if (local25 == 'š') {
				arg1[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg1[arg3 + local17] = -100;
			} else if (local25 == 'ž') {
				arg1[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[local17 + arg3] = -97;
			} else {
				arg1[local17 + arg3] = 63;
			}
		}
		return local15;
	}
}
