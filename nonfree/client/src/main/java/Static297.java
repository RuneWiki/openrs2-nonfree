import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!oq;")
	public static final Class183 aClass183_4 = new Class183("stellardawn", 1);

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public static int anInt5327 = -1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method4164(@OriginalArg(0) int arg0) {
		Static430.anInt3308 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static405.anInt6684; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static37.anInt1025; local6++) {
				if (Static263.aClass118ArrayArrayArray2[arg0][local3][local6] == null) {
					Static263.aClass118ArrayArrayArray2[arg0][local3][local6] = new Class118(arg0, local3, local6);
				}
			}
		}
	}
}
