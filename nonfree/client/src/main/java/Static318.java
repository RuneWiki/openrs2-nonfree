import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	public static int anInt5491;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_97 = new Class322(3, -2);

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Z")
	public static boolean aBoolean411 = true;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Lclient!pp;")
	public static Class6_Sub44 method5009() {
		@Pc(7) Class320 local7 = null;
		@Pc(13) Class6_Sub44 local13 = new Class6_Sub44(Static129.aClass121_1, 0);
		try {
			@Pc(19) Class380 local19 = Static651.aClass122_38.method3356("");
			while (local19.anInt10067 == 0) {
				Static255.method4444(1L);
			}
			if (local19.anInt10067 == 1) {
				local7 = (Class320) local19.anObject25;
				@Pc(50) byte[] local50 = new byte[(int) local7.method7686()];
				@Pc(65) int local65;
				for (@Pc(52) int local52 = 0; local52 < local50.length; local52 += local65) {
					local65 = local7.method7695(local50.length - local52, local50, local52);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class6_Sub44(new Class6_Sub15(local50), Static129.aClass121_1, 0);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (local7 != null) {
				local7.method7693();
			}
		} catch (@Pc(109) Exception local109) {
		}
		return local13;
	}
}
