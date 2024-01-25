import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_45 = new Class67("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_46 = new Class67("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_59 = new Class133(114, 8);

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "Lclient!os;")
	public static final Class223 aClass223_1 = new Class223();

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
	public static int anInt2947 = -1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class98 local13 = local7.aClass98_3; local13 != null; local13 = local13.aClass98_1) {
			@Pc(17) Class6_Sub1 local17 = local13.aClass6_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort123 == arg1 && local17.aShort120 == arg2) {
				Static326.method5208(local17);
				return;
			}
		}
	}
}
