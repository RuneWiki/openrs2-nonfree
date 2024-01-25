import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_21 = new Class158("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_17 = new Class177(19, 8);

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ih;Z[IIZ)Lclient!gq;")
	public static Class8_Sub1_Sub1 method769(@OriginalArg(0) int arg0, @OriginalArg(1) Class106_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean236 || Static25.method518(arg0) && Static25.method518(arg3)) {
			return new Class8_Sub1_Sub1(arg1, 3553, arg0, arg3, false, arg2);
		} else if (arg1.aBoolean216) {
			return new Class8_Sub1_Sub1(arg1, 34037, arg0, arg3, false, arg2);
		} else {
			return new Class8_Sub1_Sub1(arg1, arg0, arg3, Static427.method5762(arg0), Static427.method5762(arg3), arg2);
		}
	}
}
