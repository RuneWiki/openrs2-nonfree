import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_20 = new Class242("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
	public static boolean method1367(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
