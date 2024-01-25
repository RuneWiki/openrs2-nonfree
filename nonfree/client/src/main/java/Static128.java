import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!efa", name = "B", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
	public static int anInt2638 = 999999;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method2418(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local21] = (byte) local27;
			} else if (local27 == '€') {
				local11[local21] = -128;
			} else if (local27 == '‚') {
				local11[local21] = -126;
			} else if (local27 == 'ƒ') {
				local11[local21] = -125;
			} else if (local27 == '„') {
				local11[local21] = -124;
			} else if (local27 == '…') {
				local11[local21] = -123;
			} else if (local27 == '†') {
				local11[local21] = -122;
			} else if (local27 == '‡') {
				local11[local21] = -121;
			} else if (local27 == 'ˆ') {
				local11[local21] = -120;
			} else if (local27 == '‰') {
				local11[local21] = -119;
			} else if (local27 == 'Š') {
				local11[local21] = -118;
			} else if (local27 == '‹') {
				local11[local21] = -117;
			} else if (local27 == 'Œ') {
				local11[local21] = -116;
			} else if (local27 == 'Ž') {
				local11[local21] = -114;
			} else if (local27 == '‘') {
				local11[local21] = -111;
			} else if (local27 == '’') {
				local11[local21] = -110;
			} else if (local27 == '“') {
				local11[local21] = -109;
			} else if (local27 == '”') {
				local11[local21] = -108;
			} else if (local27 == '•') {
				local11[local21] = -107;
			} else if (local27 == '–') {
				local11[local21] = -106;
			} else if (local27 == '—') {
				local11[local21] = -105;
			} else if (local27 == '˜') {
				local11[local21] = -104;
			} else if (local27 == '™') {
				local11[local21] = -103;
			} else if (local27 == 'š') {
				local11[local21] = -102;
			} else if (local27 == '›') {
				local11[local21] = -101;
			} else if (local27 == 'œ') {
				local11[local21] = -100;
			} else if (local27 == 'ž') {
				local11[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local21] = -97;
			} else {
				local11[local21] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)V")
	public static void method2419() {
		@Pc(1) Class165 local1 = Static643.aClass165_77;
		synchronized (Static643.aClass165_77) {
			Static643.aClass165_77.method4394(5);
		}
		local1 = Static291.aClass165_34;
		synchronized (Static291.aClass165_34) {
			Static291.aClass165_34.method4394(5);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method2420(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static356.method5249(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)V")
	public static void method2422() {
		if (Static474.anInt7831 <= 1) {
			Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub14_1);
		} else {
			Static24.aClass3_Sub22_4.method2840(4, Static24.aClass3_Sub22_4.aClass6_Sub14_1);
		}
	}
}
