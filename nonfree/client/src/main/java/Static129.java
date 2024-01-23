import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt2519;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!fh;")
	public static Class58 aClass58_58;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BLjava/lang/String;IIII)I")
	public static int method1967(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6 = arg2;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(17) char local17 = arg1.charAt(local8);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg0[local8 + arg3] = (byte) local17;
			} else if (local17 == '€') {
				arg0[local8 + arg3] = -128;
			} else if (local17 == '‚') {
				arg0[arg3 + local8] = -126;
			} else if (local17 == 'ƒ') {
				arg0[arg3 + local8] = -125;
			} else if (local17 == '„') {
				arg0[local8 + arg3] = -124;
			} else if (local17 == '…') {
				arg0[local8 + arg3] = -123;
			} else if (local17 == '†') {
				arg0[local8 + arg3] = -122;
			} else if (local17 == '‡') {
				arg0[local8 + arg3] = -121;
			} else if (local17 == 'ˆ') {
				arg0[local8 + arg3] = -120;
			} else if (local17 == '‰') {
				arg0[arg3 + local8] = -119;
			} else if (local17 == 'Š') {
				arg0[arg3 + local8] = -118;
			} else if (local17 == '‹') {
				arg0[local8 + arg3] = -117;
			} else if (local17 == 'Œ') {
				arg0[local8 + arg3] = -116;
			} else if (local17 == 'Ž') {
				arg0[arg3 + local8] = -114;
			} else if (local17 == '‘') {
				arg0[arg3 + local8] = -111;
			} else if (local17 == '’') {
				arg0[local8 + arg3] = -110;
			} else if (local17 == '“') {
				arg0[arg3 + local8] = -109;
			} else if (local17 == '”') {
				arg0[local8 + arg3] = -108;
			} else if (local17 == '•') {
				arg0[arg3 + local8] = -107;
			} else if (local17 == '–') {
				arg0[local8 + arg3] = -106;
			} else if (local17 == '—') {
				arg0[local8 + arg3] = -105;
			} else if (local17 == '˜') {
				arg0[arg3 + local8] = -104;
			} else if (local17 == '™') {
				arg0[arg3 + local8] = -103;
			} else if (local17 == 'š') {
				arg0[local8 + arg3] = -102;
			} else if (local17 == '›') {
				arg0[arg3 + local8] = -101;
			} else if (local17 == 'œ') {
				arg0[local8 + arg3] = -100;
			} else if (local17 == 'ž') {
				arg0[arg3 + local8] = -98;
			} else if (local17 == 'Ÿ') {
				arg0[arg3 + local8] = -97;
			} else {
				arg0[local8 + arg3] = 63;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method1970() {
		Static263.aClass26_53.method515();
		Static294.aClass26_49.method515();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static16.anInt929 = Static121.anInt2961 + Static121.anInt2960 - arg1 - 1;
		Static229.anInt4394 = arg0 - Static121.anInt2962;
	}
}
