import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_206 = new Class151("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "[I")
	public static final int[] anIntArray450 = new int[1];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)I")
	public static int method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static329.method4205(local17, local7);
		@Pc(35) int local35 = Static329.method4205(local17, local7 + 1);
		@Pc(42) int local42 = Static329.method4205(local17 + 1, local7);
		@Pc(51) int local51 = Static329.method4205(local17 + 1, local7 - -1);
		@Pc(58) int local58 = Static149.method5576(local35, local28, arg1, local13);
		@Pc(67) int local67 = Static149.method5576(local51, local42, arg1, local13);
		return Static149.method5576(local67, local58, arg1, local23);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!bv;")
	public static Class31 method5162(@OriginalArg(1) Component arg0) {
		return new Class31_Sub1(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
	public static void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static26.method483(true, local35);
	}
}
