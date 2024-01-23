import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "Lclient!fh;")
	public static Class58 aClass58_38;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Lclient!cc;")
	public static Class26 aClass26_11 = new Class26(4);

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Loaded world list data";

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
	public static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1054(@OriginalArg(0) String arg0) {
		@Pc(17) String local17 = Static282.method4356(Static108.method1747(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!pm;)V")
	public static void method1055(@OriginalArg(1) Class139 arg0) {
		@Pc(3) Class105 local3 = null;
		try {
			@Pc(12) Class185 local12 = arg0.method3508("runescape");
			while (local12.anInt5623 == 0) {
				Static303.method4677(1L);
			}
			if (local12.anInt5623 == 1) {
				local3 = (Class105) local12.anObject7;
				@Pc(36) Class4_Sub10 local36 = Static79.method1347();
				local3.method2244(local36.anInt5713, 0, local36.aByteArray71);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local3 != null) {
				local3.method2246();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	public static int method1056(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method1059() {
		Static83.anInt1943++;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static79.method1364(arg0)) {
			Static41.method693(Static188.aClass189ArrayArray115[arg0], -1, arg5, arg3, arg1, arg6, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method1061(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(13) byte[] local13 = new byte[local4];
		for (@Pc(19) int local19 = 0; local19 < local4; local19++) {
			@Pc(30) char local30 = arg0.charAt(local19);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				local13[local19] = (byte) local30;
			} else if (local30 == '€') {
				local13[local19] = -128;
			} else if (local30 == '‚') {
				local13[local19] = -126;
			} else if (local30 == 'ƒ') {
				local13[local19] = -125;
			} else if (local30 == '„') {
				local13[local19] = -124;
			} else if (local30 == '…') {
				local13[local19] = -123;
			} else if (local30 == '†') {
				local13[local19] = -122;
			} else if (local30 == '‡') {
				local13[local19] = -121;
			} else if (local30 == 'ˆ') {
				local13[local19] = -120;
			} else if (local30 == '‰') {
				local13[local19] = -119;
			} else if (local30 == 'Š') {
				local13[local19] = -118;
			} else if (local30 == '‹') {
				local13[local19] = -117;
			} else if (local30 == 'Œ') {
				local13[local19] = -116;
			} else if (local30 == 'Ž') {
				local13[local19] = -114;
			} else if (local30 == '‘') {
				local13[local19] = -111;
			} else if (local30 == '’') {
				local13[local19] = -110;
			} else if (local30 == '“') {
				local13[local19] = -109;
			} else if (local30 == '”') {
				local13[local19] = -108;
			} else if (local30 == '•') {
				local13[local19] = -107;
			} else if (local30 == '–') {
				local13[local19] = -106;
			} else if (local30 == '—') {
				local13[local19] = -105;
			} else if (local30 == '˜') {
				local13[local19] = -104;
			} else if (local30 == '™') {
				local13[local19] = -103;
			} else if (local30 == 'š') {
				local13[local19] = -102;
			} else if (local30 == '›') {
				local13[local19] = -101;
			} else if (local30 == 'œ') {
				local13[local19] = -100;
			} else if (local30 == 'ž') {
				local13[local19] = -98;
			} else if (local30 == 'Ÿ') {
				local13[local19] = -97;
			} else {
				local13[local19] = 63;
			}
		}
		return local13;
	}
}
