import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	public static int anInt9788;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Lclient!uu;")
	public static Class343 aClass343_260;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!st;")
	public static final Class314 aClass314_143 = new Class314(26, 11);

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "S")
	public static short aShort121 = 32767;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method8319() {
		if (Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0 && Static282.anInt5422 != Static65.anInt1298) {
			Static442.method6636(Static263.anInt5102, Static270.anInt5273, 11, false);
		} else {
			Static523.method7605(Static266.aClass82_8);
			if (Static47.anInt949 != Static65.anInt1298) {
				Static212.method3299();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZC)B")
	public static byte method8320(@OriginalArg(1) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([SI)[S")
	public static short[] method8321(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static651.method755(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8322(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static119.method2188(Static196.method3129(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!uv;)V")
	public static void method8323(@OriginalArg(1) Class344 arg0) {
		if (arg0.anInt9620 == Static472.anInt8085) {
			Static110.aBooleanArray5[arg0.anInt9589] = true;
		}
	}
}
