import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public static int anInt940;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt943;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method708(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static178.method2898(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
	public static void method709(@OriginalArg(0) int arg0) {
		Static237.anInt4759 = arg0;
		Static325.aClass26_7.method333();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)Lclient!co;")
	public static Class11_Sub8 method710() {
		if (Static271.aClass16_37 == null || Static33.aClass41_1 == null) {
			return null;
		}
		for (@Pc(21) Class11_Sub8 local21 = (Class11_Sub8) Static33.aClass41_1.method652(); local21 != null; local21 = (Class11_Sub8) Static33.aClass41_1.method652()) {
			@Pc(28) Class23 local28 = Static212.method3827(local21.anInt863);
			if (local28 != null && local28.aBoolean18 && local28.method250()) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method711(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local11[local20] = (byte) local26;
			} else if (local26 == '€') {
				local11[local20] = -128;
			} else if (local26 == '‚') {
				local11[local20] = -126;
			} else if (local26 == 'ƒ') {
				local11[local20] = -125;
			} else if (local26 == '„') {
				local11[local20] = -124;
			} else if (local26 == '…') {
				local11[local20] = -123;
			} else if (local26 == '†') {
				local11[local20] = -122;
			} else if (local26 == '‡') {
				local11[local20] = -121;
			} else if (local26 == 'ˆ') {
				local11[local20] = -120;
			} else if (local26 == '‰') {
				local11[local20] = -119;
			} else if (local26 == 'Š') {
				local11[local20] = -118;
			} else if (local26 == '‹') {
				local11[local20] = -117;
			} else if (local26 == 'Œ') {
				local11[local20] = -116;
			} else if (local26 == 'Ž') {
				local11[local20] = -114;
			} else if (local26 == '‘') {
				local11[local20] = -111;
			} else if (local26 == '’') {
				local11[local20] = -110;
			} else if (local26 == '“') {
				local11[local20] = -109;
			} else if (local26 == '”') {
				local11[local20] = -108;
			} else if (local26 == '•') {
				local11[local20] = -107;
			} else if (local26 == '–') {
				local11[local20] = -106;
			} else if (local26 == '—') {
				local11[local20] = -105;
			} else if (local26 == '˜') {
				local11[local20] = -104;
			} else if (local26 == '™') {
				local11[local20] = -103;
			} else if (local26 == 'š') {
				local11[local20] = -102;
			} else if (local26 == '›') {
				local11[local20] = -101;
			} else if (local26 == 'œ') {
				local11[local20] = -100;
			} else if (local26 == 'ž') {
				local11[local20] = -98;
			} else if (local26 == 'Ÿ') {
				local11[local20] = -97;
			} else {
				local11[local20] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method712() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static311.aBooleanArray4[local7] = false;
		}
		Static319.anInt6196 = 0;
		Static204.anInt4169 = -1;
		Static24.anInt455 = 0;
		Static22.anInt416 = -1;
		Static81.anInt1498 = 1;
	}
}
