import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_52 = new Class2(19, 6);

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	public static int anInt2920 = 0;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_64 = new Class55("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_65 = new Class55("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_6 = new Class229("", 10);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method2340() {
		@Pc(7) Class266 local7 = null;
		try {
			@Pc(18) Class236 local18 = Static230.aClass61_4.method1456("2", true);
			while (local18.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (local18.anInt6178 == 1) {
				local7 = (Class266) local18.anObject8;
				@Pc(46) Class7_Sub14 local46 = new Class7_Sub14(Static369.anInt5897 * 6 + 3);
				local46.method3970(1);
				local46.method3993(Static369.anInt5897);
				for (@Pc(56) int local56 = 0; local56 < Static101.anIntArray136.length; local56++) {
					if (Static196.aBooleanArray18[local56]) {
						local46.method3993(local56);
						local46.method3933(Static101.anIntArray136[local56]);
					}
				}
				local7.method5678(0, local46.anInt4989, local46.aByteArray75);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local7 != null) {
				local7.method5674();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static44.aLong33 = Static158.method2342();
		Static351.aBoolean381 = false;
	}
}
