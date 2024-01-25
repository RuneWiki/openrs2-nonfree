import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!lt;")
	public static Class158 aClass158_43;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_59 = new Class231(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IC)B")
	public static byte method3145(@OriginalArg(1) char arg0) {
		@Pc(40) byte local40;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local40 = (byte) arg0;
		} else if (arg0 == '€') {
			local40 = -128;
		} else if (arg0 == '‚') {
			local40 = -126;
		} else if (arg0 == 'ƒ') {
			local40 = -125;
		} else if (arg0 == '„') {
			local40 = -124;
		} else if (arg0 == '…') {
			local40 = -123;
		} else if (arg0 == '†') {
			local40 = -122;
		} else if (arg0 == '‡') {
			local40 = -121;
		} else if (arg0 == 'ˆ') {
			local40 = -120;
		} else if (arg0 == '‰') {
			local40 = -119;
		} else if (arg0 == 'Š') {
			local40 = -118;
		} else if (arg0 == '‹') {
			local40 = -117;
		} else if (arg0 == 'Œ') {
			local40 = -116;
		} else if (arg0 == 'Ž') {
			local40 = -114;
		} else if (arg0 == '‘') {
			local40 = -111;
		} else if (arg0 == '’') {
			local40 = -110;
		} else if (arg0 == '“') {
			local40 = -109;
		} else if (arg0 == '”') {
			local40 = -108;
		} else if (arg0 == '•') {
			local40 = -107;
		} else if (arg0 == '–') {
			local40 = -106;
		} else if (arg0 == '—') {
			local40 = -105;
		} else if (arg0 == '˜') {
			local40 = -104;
		} else if (arg0 == '™') {
			local40 = -103;
		} else if (arg0 == 'š') {
			local40 = -102;
		} else if (arg0 == '›') {
			local40 = -101;
		} else if (arg0 == 'œ') {
			local40 = -100;
		} else if (arg0 == 'ž') {
			local40 = -98;
		} else if (arg0 == 'Ÿ') {
			local40 = -97;
		} else {
			local40 = 63;
		}
		return local40;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method3148() {
		if (Static270.aBoolean332) {
			return;
		}
		if (Static8.aClass173_Sub1_1.aBoolean311) {
			Static397.aFloat99 = (int) Static397.aFloat99 + 191 & 0xFFFFFF80;
		} else {
			Static201.aFloat66 += (24.0F - Static201.aFloat66) / 2.0F;
		}
		Static165.aBoolean204 = true;
		Static270.aBoolean332 = true;
	}
}
