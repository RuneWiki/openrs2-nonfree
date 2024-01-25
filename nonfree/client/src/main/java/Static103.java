import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!ft", name = "X", descriptor = "[[S")
	public static short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_118 = new Class221(50, 8);

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_24 = new Class180();

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_86 = new Class140("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)I")
	public static int method3239() {
		if ((double) Static202.aFloat49 == 3.0D) {
			return 37;
		} else if ((double) Static202.aFloat49 == 4.0D) {
			return 50;
		} else if ((double) Static202.aFloat49 == 6.0D) {
			return 75;
		} else if ((double) Static202.aFloat49 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
