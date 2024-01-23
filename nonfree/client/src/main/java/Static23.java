import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
	public static int anInt5823 = 0;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "[I")
	public static int[] anIntArray686 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z")
	public static boolean method4488() {
		if (Static49.aBoolean90) {
			try {
				return !((Boolean) Static301.method946("showingVideoAd", Static13.aClass84_3.anApplet1));
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method4490(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static176.aBooleanArray13[arg0]) {
			return;
		}
		Static55.aClass7_49.method243(arg0);
		if (Static86.aClass127ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(35) boolean local35 = true;
		for (@Pc(37) int local37 = 0; local37 < Static86.aClass127ArrayArray1[arg0].length; local37++) {
			if (Static86.aClass127ArrayArray1[arg0][local37] != null) {
				if (Static86.aClass127ArrayArray1[arg0][local37].anInt3570 == 2) {
					local35 = false;
				} else {
					Static86.aClass127ArrayArray1[arg0][local37] = null;
				}
			}
		}
		if (local35) {
			Static86.aClass127ArrayArray1[arg0] = null;
		}
		Static176.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
	public static void method4493() {
		Static47.aClass31_45.method856(5);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILjava/lang/String;[BI)I")
	public static int method4494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(6) int local6 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local6; local17++) {
			@Pc(26) char local26 = arg2.charAt(local17);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				arg3[local17 + arg1] = (byte) local26;
			} else if (local26 == '€') {
				arg3[local17 + arg1] = -128;
			} else if (local26 == '‚') {
				arg3[arg1 + local17] = -126;
			} else if (local26 == 'ƒ') {
				arg3[arg1 + local17] = -125;
			} else if (local26 == '„') {
				arg3[arg1 + local17] = -124;
			} else if (local26 == '…') {
				arg3[local17 + arg1] = -123;
			} else if (local26 == '†') {
				arg3[arg1 + local17] = -122;
			} else if (local26 == '‡') {
				arg3[arg1 + local17] = -121;
			} else if (local26 == 'ˆ') {
				arg3[arg1 + local17] = -120;
			} else if (local26 == '‰') {
				arg3[local17 + arg1] = -119;
			} else if (local26 == 'Š') {
				arg3[arg1 + local17] = -118;
			} else if (local26 == '‹') {
				arg3[local17 + arg1] = -117;
			} else if (local26 == 'Œ') {
				arg3[arg1 + local17] = -116;
			} else if (local26 == 'Ž') {
				arg3[local17 + arg1] = -114;
			} else if (local26 == '‘') {
				arg3[local17 + arg1] = -111;
			} else if (local26 == '’') {
				arg3[local17 + arg1] = -110;
			} else if (local26 == '“') {
				arg3[local17 + arg1] = -109;
			} else if (local26 == '”') {
				arg3[local17 + arg1] = -108;
			} else if (local26 == '•') {
				arg3[arg1 + local17] = -107;
			} else if (local26 == '–') {
				arg3[arg1 + local17] = -106;
			} else if (local26 == '—') {
				arg3[arg1 + local17] = -105;
			} else if (local26 == '˜') {
				arg3[local17 + arg1] = -104;
			} else if (local26 == '™') {
				arg3[arg1 + local17] = -103;
			} else if (local26 == 'š') {
				arg3[arg1 + local17] = -102;
			} else if (local26 == '›') {
				arg3[arg1 + local17] = -101;
			} else if (local26 == 'œ') {
				arg3[local17 + arg1] = -100;
			} else if (local26 == 'ž') {
				arg3[local17 + arg1] = -98;
			} else if (local26 == 'Ÿ') {
				arg3[arg1 + local17] = -97;
			} else {
				arg3[local17 + arg1] = 63;
			}
		}
		return local6;
	}
}
