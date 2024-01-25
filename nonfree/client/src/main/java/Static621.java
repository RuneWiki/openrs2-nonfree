import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!uka", name = "e", descriptor = "I")
	public static int anInt10188;

	@OriginalMember(owner = "client!uka", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString117 = null;

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(ZI)Z")
	public static boolean method8720(@OriginalArg(1) int arg0) {
		if (arg0 == 45 || arg0 == 52 || arg0 == 21 || arg0 == 25 || arg0 == 57 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 60;
		}
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(ZC)B")
	public static byte method8722(@OriginalArg(1) char arg0) {
		@Pc(32) byte local32;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local32 = (byte) arg0;
		} else if (arg0 == '€') {
			local32 = -128;
		} else if (arg0 == '‚') {
			local32 = -126;
		} else if (arg0 == 'ƒ') {
			local32 = -125;
		} else if (arg0 == '„') {
			local32 = -124;
		} else if (arg0 == '…') {
			local32 = -123;
		} else if (arg0 == '†') {
			local32 = -122;
		} else if (arg0 == '‡') {
			local32 = -121;
		} else if (arg0 == 'ˆ') {
			local32 = -120;
		} else if (arg0 == '‰') {
			local32 = -119;
		} else if (arg0 == 'Š') {
			local32 = -118;
		} else if (arg0 == '‹') {
			local32 = -117;
		} else if (arg0 == 'Œ') {
			local32 = -116;
		} else if (arg0 == 'Ž') {
			local32 = -114;
		} else if (arg0 == '‘') {
			local32 = -111;
		} else if (arg0 == '’') {
			local32 = -110;
		} else if (arg0 == '“') {
			local32 = -109;
		} else if (arg0 == '”') {
			local32 = -108;
		} else if (arg0 == '•') {
			local32 = -107;
		} else if (arg0 == '–') {
			local32 = -106;
		} else if (arg0 == '—') {
			local32 = -105;
		} else if (arg0 == '˜') {
			local32 = -104;
		} else if (arg0 == '™') {
			local32 = -103;
		} else if (arg0 == 'š') {
			local32 = -102;
		} else if (arg0 == '›') {
			local32 = -101;
		} else if (arg0 == 'œ') {
			local32 = -100;
		} else if (arg0 == 'ž') {
			local32 = -98;
		} else if (arg0 == 'Ÿ') {
			local32 = -97;
		} else {
			local32 = 63;
		}
		return local32;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(III)I")
	public static int method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static314.anIntArray309[arg0 & 0x3] : Static448.anIntArray399[arg0 & 0x3];
	}
}
