import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt1290 = 0;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "[Lclient!jr;")
	public static final Class6_Sub12[] aClass6_Sub12Array1 = new Class6_Sub12[2048];

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "[I")
	public static final int[] anIntArray114 = new int[8];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method1082(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static146.aClass103_80.method2355(Static188.anInt28) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static146.aClass103_82.method2355(Static188.anInt28) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Z")
	public static boolean method1083(@OriginalArg(0) int arg0) {
		if (Static431.aBooleanArray26[arg0]) {
			return true;
		} else if (Static24.aClass248_4.method5802(arg0)) {
			@Pc(28) int local28 = Static24.aClass248_4.method5793(arg0);
			if (local28 == 0) {
				Static431.aBooleanArray26[arg0] = true;
				return true;
			}
			if (Static360.aClass97ArrayArray2[arg0] == null) {
				Static360.aClass97ArrayArray2[arg0] = new Class97[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static360.aClass97ArrayArray2[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static24.aClass248_4.method5797(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class97 local73 = Static360.aClass97ArrayArray2[arg0][local47] = new Class97();
						local73.anInt2678 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method2283(new Class6_Sub12(local61));
					}
				}
			}
			Static431.aBooleanArray26[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method1084() {
		for (@Pc(6) Class6_Sub34 local6 = (Class6_Sub34) Static315.aClass298_124.method6809(); local6 != null; local6 = (Class6_Sub34) Static315.aClass298_124.method6821()) {
			if (local6.aBoolean472) {
				local6.method5517();
			}
		}
		for (@Pc(30) Class6_Sub34 local30 = (Class6_Sub34) Static377.aClass298_144.method6809(); local30 != null; local30 = (Class6_Sub34) Static377.aClass298_144.method6821()) {
			if (local30.aBoolean472) {
				local30.method5517();
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Lclient!faa;")
	public static Class97 method1088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class97 local12 = Static495.method7281(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass97Array2 == null || arg1 >= local12.aClass97Array2.length) {
			return null;
		} else {
			return local12.aClass97Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)Z")
	public static boolean method1089() {
		@Pc(7) Class6 local7 = Static408.aClass298_154.aClass6_246.aClass6_283;
		if (local7 == null || Static408.aClass298_154.aClass6_246 == local7) {
			return false;
		}
		@Pc(24) Class6_Sub26 local24 = (Class6_Sub26) local7;
		if (local24.anInt5472 >= 2000) {
			local24.anInt5472 -= 2000;
		}
		return local24.anInt5472 == 1012;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;BII[BI)I")
	public static int method1092(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				arg2[arg3 + local19] = (byte) local27;
			} else if (local27 == '€') {
				arg2[local19 + arg3] = -128;
			} else if (local27 == '‚') {
				arg2[arg3 + local19] = -126;
			} else if (local27 == 'ƒ') {
				arg2[arg3 + local19] = -125;
			} else if (local27 == '„') {
				arg2[arg3 + local19] = -124;
			} else if (local27 == '…') {
				arg2[arg3 + local19] = -123;
			} else if (local27 == '†') {
				arg2[arg3 + local19] = -122;
			} else if (local27 == '‡') {
				arg2[arg3 + local19] = -121;
			} else if (local27 == 'ˆ') {
				arg2[arg3 + local19] = -120;
			} else if (local27 == '‰') {
				arg2[arg3 + local19] = -119;
			} else if (local27 == 'Š') {
				arg2[arg3 + local19] = -118;
			} else if (local27 == '‹') {
				arg2[local19 + arg3] = -117;
			} else if (local27 == 'Œ') {
				arg2[arg3 + local19] = -116;
			} else if (local27 == 'Ž') {
				arg2[local19 + arg3] = -114;
			} else if (local27 == '‘') {
				arg2[local19 + arg3] = -111;
			} else if (local27 == '’') {
				arg2[arg3 + local19] = -110;
			} else if (local27 == '“') {
				arg2[arg3 + local19] = -109;
			} else if (local27 == '”') {
				arg2[arg3 + local19] = -108;
			} else if (local27 == '•') {
				arg2[local19 + arg3] = -107;
			} else if (local27 == '–') {
				arg2[local19 + arg3] = -106;
			} else if (local27 == '—') {
				arg2[local19 + arg3] = -105;
			} else if (local27 == '˜') {
				arg2[local19 + arg3] = -104;
			} else if (local27 == '™') {
				arg2[arg3 + local19] = -103;
			} else if (local27 == 'š') {
				arg2[arg3 + local19] = -102;
			} else if (local27 == '›') {
				arg2[local19 + arg3] = -101;
			} else if (local27 == 'œ') {
				arg2[arg3 + local19] = -100;
			} else if (local27 == 'ž') {
				arg2[local19 + arg3] = -98;
			} else if (local27 == 'Ÿ') {
				arg2[local19 + arg3] = -97;
			} else {
				arg2[arg3 + local19] = 63;
			}
		}
		return local9;
	}
}
