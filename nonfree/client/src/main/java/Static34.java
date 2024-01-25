import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
	public static int anInt730;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_17 = new Class32("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
	public static final int[] anIntArray166 = new int[1000];

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	public static int anInt731 = 0;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_19 = new Class205(88, -2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method626(@OriginalArg(1) String arg0) {
		return Static38.method683(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method627(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(24) char local24 = arg0.charAt(local13);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local13] = (byte) local24;
			} else if (local24 == '€') {
				local11[local13] = -128;
			} else if (local24 == '‚') {
				local11[local13] = -126;
			} else if (local24 == 'ƒ') {
				local11[local13] = -125;
			} else if (local24 == '„') {
				local11[local13] = -124;
			} else if (local24 == '…') {
				local11[local13] = -123;
			} else if (local24 == '†') {
				local11[local13] = -122;
			} else if (local24 == '‡') {
				local11[local13] = -121;
			} else if (local24 == 'ˆ') {
				local11[local13] = -120;
			} else if (local24 == '‰') {
				local11[local13] = -119;
			} else if (local24 == 'Š') {
				local11[local13] = -118;
			} else if (local24 == '‹') {
				local11[local13] = -117;
			} else if (local24 == 'Œ') {
				local11[local13] = -116;
			} else if (local24 == 'Ž') {
				local11[local13] = -114;
			} else if (local24 == '‘') {
				local11[local13] = -111;
			} else if (local24 == '’') {
				local11[local13] = -110;
			} else if (local24 == '“') {
				local11[local13] = -109;
			} else if (local24 == '”') {
				local11[local13] = -108;
			} else if (local24 == '•') {
				local11[local13] = -107;
			} else if (local24 == '–') {
				local11[local13] = -106;
			} else if (local24 == '—') {
				local11[local13] = -105;
			} else if (local24 == '˜') {
				local11[local13] = -104;
			} else if (local24 == '™') {
				local11[local13] = -103;
			} else if (local24 == 'š') {
				local11[local13] = -102;
			} else if (local24 == '›') {
				local11[local13] = -101;
			} else if (local24 == 'œ') {
				local11[local13] = -100;
			} else if (local24 == 'ž') {
				local11[local13] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}
}
