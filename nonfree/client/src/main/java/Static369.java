import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt5966;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[[Lclient!mn;")
	public static Class160[][] aClass160ArrayArray1;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "S")
	public static short aShort92 = 1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method4805() {
		if (Static346.aBoolean505) {
			return;
		}
		Static77.method954(Static71.aClass216ArrayArrayArray1);
		if (Static165.aClass216ArrayArrayArray2 != null) {
			Static77.method954(Static165.aClass216ArrayArrayArray2);
		}
		Static346.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/lang/String;II[B)I")
	public static int method4806(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg3[local17 + arg0] = (byte) local25;
			} else if (local25 == '€') {
				arg3[local17 + arg0] = -128;
			} else if (local25 == '‚') {
				arg3[local17 + arg0] = -126;
			} else if (local25 == 'ƒ') {
				arg3[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg3[local17 + arg0] = -124;
			} else if (local25 == '…') {
				arg3[local17 + arg0] = -123;
			} else if (local25 == '†') {
				arg3[arg0 + local17] = -122;
			} else if (local25 == '‡') {
				arg3[local17 + arg0] = -121;
			} else if (local25 == 'ˆ') {
				arg3[arg0 + local17] = -120;
			} else if (local25 == '‰') {
				arg3[arg0 + local17] = -119;
			} else if (local25 == 'Š') {
				arg3[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg3[arg0 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg3[arg0 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg3[arg0 + local17] = -114;
			} else if (local25 == '‘') {
				arg3[arg0 + local17] = -111;
			} else if (local25 == '’') {
				arg3[arg0 + local17] = -110;
			} else if (local25 == '“') {
				arg3[arg0 + local17] = -109;
			} else if (local25 == '”') {
				arg3[arg0 + local17] = -108;
			} else if (local25 == '•') {
				arg3[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg3[arg0 + local17] = -106;
			} else if (local25 == '—') {
				arg3[arg0 + local17] = -105;
			} else if (local25 == '˜') {
				arg3[local17 + arg0] = -104;
			} else if (local25 == '™') {
				arg3[local17 + arg0] = -103;
			} else if (local25 == 'š') {
				arg3[local17 + arg0] = -102;
			} else if (local25 == '›') {
				arg3[arg0 + local17] = -101;
			} else if (local25 == 'œ') {
				arg3[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg3[local17 + arg0] = -98;
			} else if (local25 == 'Ÿ') {
				arg3[arg0 + local17] = -97;
			} else {
				arg3[local17 + arg0] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!l;Lclient!oi;)V")
	public static void method4809(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class185 arg1) {
		Static70.aClass185_77 = arg1;
		Static86.anInterface4_11 = arg0;
	}
}
