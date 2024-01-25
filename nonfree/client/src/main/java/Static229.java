import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_61 = new Class21("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!lo", name = "Q", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_62 = new Class21(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!wn;I)Lclient!pn;")
	public static Class4_Sub3 method3914(@OriginalArg(0) Class4_Sub20 arg0) {
		arg0.method4614();
		@Pc(13) int local13 = arg0.method4614();
		@Pc(17) Class4_Sub3 local17 = Static61.method1433(local13);
		local17.anInt8008 = arg0.method4614();
		@Pc(26) int local26 = arg0.method4614();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method4614();
			local17.method6340(local34, arg0);
		}
		local17.method6341();
		return local17;
	}
}
