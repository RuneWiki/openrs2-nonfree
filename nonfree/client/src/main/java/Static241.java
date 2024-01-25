import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_109 = new Class209("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt4898 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3947(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg1, 2);
		local8.method4547();
		local8.aString52 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)Z")
	public static boolean method3949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
