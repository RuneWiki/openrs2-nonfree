import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "Lclient!tca;")
	public static Class1_Sub12_Sub4 aClass1_Sub12_Sub4_3;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "Lclient!h;")
	public static final Class114 aClass114_169 = new Class114("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "S")
	public static short aShort126 = 1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!hu;Lclient!hu;)V")
	public static void method7846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub4 arg3, @OriginalArg(4) Class47_Sub4 arg4) {
		@Pc(4) Class206 local4 = Static64.method1808(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub4_2 = arg3;
			local4.aClass47_Sub4_1 = arg4;
		}
	}
}
