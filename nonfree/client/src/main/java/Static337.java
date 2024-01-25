import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_81 = new Class267("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Lclient!um;")
	public static final Class244 aClass244_28 = new Class244();

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_118 = new Class92(2, 6);

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method4900() {
		@Pc(14) int local14 = (int) ((double) Static181.anInt3574 * 34.46D);
		local14 <<= 0x0;
		if (Static126.aClass66_5.method5008()) {
			local14 += 128;
		}
		Static126.aClass66_5.method5048(50, local14);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!he;B)V")
	public static void method4903(@OriginalArg(0) Class100 arg0) {
		Static225.aClass100_44 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!he;IZII)V")
	public static void method4904(@OriginalArg(2) Class100 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static336.anInt5845 = 2;
		Static342.aBoolean369 = false;
		Static387.anInt6869 = arg1;
		Static386.anInt6865 = 0;
		Static35.aClass100_7 = arg0;
		Static399.anInt7157 = arg2;
		Static445.anInt7975 = 1;
	}
}
