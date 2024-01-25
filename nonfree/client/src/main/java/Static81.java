import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!en", name = "L", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!en", name = "U", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array13;

	@OriginalMember(owner = "client!en", name = "W", descriptor = "I")
	public static int anInt1525;

	@OriginalMember(owner = "client!en", name = "X", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!en", name = "Y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_35 = new Class140("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!en", name = "S", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!en", name = "T", descriptor = "S")
	public static short aShort29 = 1;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)V")
	public static void method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static49.anInt819 = arg1 - Static202.anInt4952;
		Static160.anInt3750 = arg0 - Static202.anInt4958;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!s;)V")
	public static void method1659(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		Static9.aClass105Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V")
	public static void method1661() {
		Static235.aClass46_16 = null;
		Static148.anInt3213 = -1;
	}
}
