import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!b;")
	public static Class20 aClass20_89;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!tr;")
	public static Class110 aClass110_17;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[200];

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public static int anInt5849 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZILclient!bd;ZLclient!bd;I)I")
	public static int method5245(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class23_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static341.method5165(arg1, arg2, arg4, arg3);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static341.method5165(arg5, arg2, arg4, arg0);
			return arg0 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
	public static int method5246(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(15) int local15 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg2 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg1[arg2 + local17] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg2] = -126;
			} else if (local25 == 'ƒ') {
				arg1[arg2 + local17] = -125;
			} else if (local25 == '„') {
				arg1[arg2 + local17] = -124;
			} else if (local25 == '…') {
				arg1[local17 + arg2] = -123;
			} else if (local25 == '†') {
				arg1[arg2 + local17] = -122;
			} else if (local25 == '‡') {
				arg1[arg2 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg2 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[local17 + arg2] = -119;
			} else if (local25 == 'Š') {
				arg1[arg2 + local17] = -118;
			} else if (local25 == '‹') {
				arg1[arg2 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg1[arg2 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg2] = -114;
			} else if (local25 == '‘') {
				arg1[arg2 + local17] = -111;
			} else if (local25 == '’') {
				arg1[arg2 + local17] = -110;
			} else if (local25 == '“') {
				arg1[local17 + arg2] = -109;
			} else if (local25 == '”') {
				arg1[arg2 + local17] = -108;
			} else if (local25 == '•') {
				arg1[arg2 + local17] = -107;
			} else if (local25 == '–') {
				arg1[arg2 + local17] = -106;
			} else if (local25 == '—') {
				arg1[arg2 + local17] = -105;
			} else if (local25 == '˜') {
				arg1[arg2 + local17] = -104;
			} else if (local25 == '™') {
				arg1[arg2 + local17] = -103;
			} else if (local25 == 'š') {
				arg1[arg2 + local17] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg2] = -100;
			} else if (local25 == 'ž') {
				arg1[arg2 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[arg2 + local17] = -97;
			} else {
				arg1[arg2 + local17] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	public static void method5247() {
		Static20.aClass44_3.method952();
		Static25.aClass44_5.method952();
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)Ljava/lang/String;")
	public static String method5252() {
		@Pc(7) String local7 = "www";
		if (Static199.aClass171_3 == Static291.aClass171_5) {
			local7 = "www-wtrc";
		} else if (Static178.aClass171_2 == Static291.aClass171_5) {
			local7 = "www-wtqa";
		} else if (Static291.aClass171_5 == Static63.aClass171_1) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static368.aString57 != null) {
			local33 = "/p=" + Static368.aString57;
		}
		return "http://" + local7 + "." + Static121.aClass63_2.aString23 + ".com/l=" + Static66.anInt1307 + "/a=" + Static68.anInt1341 + local33 + "/";
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!np;Lclient!in;III)V")
	public static void method5253(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class48 local12;
		if (arg3 < Static44.anInt791) {
			local12 = Static69.aClass48ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass28_Sub2_2 != null && local12.aClass28_Sub2_2.method5413()) {
				arg1.method5410(0, local12.aClass28_Sub2_2, 0, arg0, true, Static258.anInt4653);
			}
		}
		if (arg4 < Static44.anInt791) {
			local12 = Static69.aClass48ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass28_Sub2_2 != null && local12.aClass28_Sub2_2.method5413()) {
				arg1.method5410(Static258.anInt4653, local12.aClass28_Sub2_2, 0, arg0, true, 0);
			}
		}
		if (arg3 < Static44.anInt791 && arg4 < Static103.anInt2050) {
			local12 = Static69.aClass48ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass28_Sub2_2 != null && local12.aClass28_Sub2_2.method5413()) {
				arg1.method5410(Static258.anInt4653, local12.aClass28_Sub2_2, 0, arg0, true, Static258.anInt4653);
			}
		}
		if (arg3 < Static44.anInt791 && arg4 > 0) {
			local12 = Static69.aClass48ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass28_Sub2_2 != null && local12.aClass28_Sub2_2.method5413()) {
				arg1.method5410(-Static258.anInt4653, local12.aClass28_Sub2_2, 0, arg0, true, Static258.anInt4653);
			}
		}
	}
}
