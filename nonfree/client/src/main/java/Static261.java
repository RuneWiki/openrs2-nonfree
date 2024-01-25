import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public static int anInt4992;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!hm;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!ws;")
	public static Class2_Sub43 aClass2_Sub43_2;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_144 = new Class208(90, 6);

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "J")
	public static long aLong156 = 0L;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_180 = new Class62("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public static void method4484() {
		if (Static329.anInt6063 <= 0) {
			Static231.aString41 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static389.aStringArray45.length; local15++) {
			if (Static389.aStringArray45[local15].startsWith("--> ")) {
				@Pc(26) int local26 = ~Static329.anInt6063;
				local13++;
				if (local26 == ~local13) {
					Static231.aString41 = Static389.aStringArray45[local15].substring(4);
					break;
				}
			}
		}
	}
}
