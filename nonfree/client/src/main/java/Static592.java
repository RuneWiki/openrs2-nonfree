import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Lclient!jia;")
	public static final Class171 aClass171_10 = new Class171();

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_332 = new Class288(53, 8);

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
	public static int anInt9602 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/net/Socket;I)Lclient!ge;")
	public static Class121 method8037(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class121_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(CI)C")
	public static char method8039(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
