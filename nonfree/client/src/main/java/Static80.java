import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!om;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_54 = new Class62("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method1373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(10, arg1);
		local8.method1198();
		local8.anInt1468 = arg3;
		local8.anInt1462 = arg0;
		local8.anInt1465 = arg2;
	}
}
