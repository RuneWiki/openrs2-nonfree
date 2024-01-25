import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!sg;")
	public static Class5_Sub5_Sub19 aClass5_Sub5_Sub19_2;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!sn;")
	public static Class324 aClass324_1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1918() {
		Static44.aClass90_1.method1633();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IC)B")
	public static byte method1920(@OriginalArg(1) char arg0) {
		@Pc(34) byte local34;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local34 = (byte) arg0;
		} else if (arg0 == '€') {
			local34 = -128;
		} else if (arg0 == '‚') {
			local34 = -126;
		} else if (arg0 == 'ƒ') {
			local34 = -125;
		} else if (arg0 == '„') {
			local34 = -124;
		} else if (arg0 == '…') {
			local34 = -123;
		} else if (arg0 == '†') {
			local34 = -122;
		} else if (arg0 == '‡') {
			local34 = -121;
		} else if (arg0 == 'ˆ') {
			local34 = -120;
		} else if (arg0 == '‰') {
			local34 = -119;
		} else if (arg0 == 'Š') {
			local34 = -118;
		} else if (arg0 == '‹') {
			local34 = -117;
		} else if (arg0 == 'Œ') {
			local34 = -116;
		} else if (arg0 == 'Ž') {
			local34 = -114;
		} else if (arg0 == '‘') {
			local34 = -111;
		} else if (arg0 == '’') {
			local34 = -110;
		} else if (arg0 == '“') {
			local34 = -109;
		} else if (arg0 == '”') {
			local34 = -108;
		} else if (arg0 == '•') {
			local34 = -107;
		} else if (arg0 == '–') {
			local34 = -106;
		} else if (arg0 == '—') {
			local34 = -105;
		} else if (arg0 == '˜') {
			local34 = -104;
		} else if (arg0 == '™') {
			local34 = -103;
		} else if (arg0 == 'š') {
			local34 = -102;
		} else if (arg0 == '›') {
			local34 = -101;
		} else if (arg0 == 'œ') {
			local34 = -100;
		} else if (arg0 == 'ž') {
			local34 = -98;
		} else if (arg0 == 'Ÿ') {
			local34 = -97;
		} else {
			local34 = 63;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public static void method1925(@OriginalArg(0) int arg0) {
		if (!Static354.method5310()) {
			return;
		}
		if (Static471.anInt7980 != arg0) {
			Static537.aString57 = "";
		}
		Static471.anInt7980 = arg0;
		if (Static492.aClass295_1 != null) {
			Static492.aClass295_1.method7023();
			Static492.aClass295_1 = null;
		}
		Static21.method316(5);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method1930(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg2.length() > 320 || !Static354.method5310()) {
			return;
		}
		Static400.method5892();
		Static43.aString11 = arg0;
		Static295.anInt5127 = arg1;
		Static289.aString139 = arg2;
		Static21.method316(6);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)Ljava/lang/String;")
	public static String method1931() {
		return Static526.aBoolean669 || aClass5_Sub5_Sub19_2 == null ? "" : aClass5_Sub5_Sub19_2.aString119;
	}
}
