import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!re", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "I")
	public static int anInt6234 = 0;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_97 = new Class96("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public static final int anInt6240 = 205;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)Ljava/lang/String;")
	public static String method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V")
	public static void method4927() {
		Static338.aClass151_145.method3297(50);
		Static331.aClass151_143.method3297(50);
		Static440.aClass151_183.method3297(50);
		Static293.aClass151_123.method3297(50);
		Static215.aClass151_100.method3297(50);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;[BIIB)I")
	public static int method4928(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg2[arg0 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg2[local17 + arg0] = -128;
			} else if (local25 == '‚') {
				arg2[local17 + arg0] = -126;
			} else if (local25 == 'ƒ') {
				arg2[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg2[local17 + arg0] = -124;
			} else if (local25 == '…') {
				arg2[arg0 + local17] = -123;
			} else if (local25 == '†') {
				arg2[arg0 + local17] = -122;
			} else if (local25 == '‡') {
				arg2[local17 + arg0] = -121;
			} else if (local25 == 'ˆ') {
				arg2[arg0 + local17] = -120;
			} else if (local25 == '‰') {
				arg2[arg0 + local17] = -119;
			} else if (local25 == 'Š') {
				arg2[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg2[local17 + arg0] = -117;
			} else if (local25 == 'Œ') {
				arg2[local17 + arg0] = -116;
			} else if (local25 == 'Ž') {
				arg2[local17 + arg0] = -114;
			} else if (local25 == '‘') {
				arg2[arg0 + local17] = -111;
			} else if (local25 == '’') {
				arg2[arg0 + local17] = -110;
			} else if (local25 == '“') {
				arg2[arg0 + local17] = -109;
			} else if (local25 == '”') {
				arg2[arg0 + local17] = -108;
			} else if (local25 == '•') {
				arg2[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg2[local17 + arg0] = -106;
			} else if (local25 == '—') {
				arg2[local17 + arg0] = -105;
			} else if (local25 == '˜') {
				arg2[local17 + arg0] = -104;
			} else if (local25 == '™') {
				arg2[local17 + arg0] = -103;
			} else if (local25 == 'š') {
				arg2[local17 + arg0] = -102;
			} else if (local25 == '›') {
				arg2[local17 + arg0] = -101;
			} else if (local25 == 'œ') {
				arg2[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg2[arg0 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg2[arg0 + local17] = -97;
			} else {
				arg2[arg0 + local17] = 63;
			}
		}
		return local15;
	}
}
