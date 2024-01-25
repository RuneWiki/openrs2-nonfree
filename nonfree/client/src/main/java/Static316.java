import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt5775;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!g;")
	public static Class83 aClass83_113;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_208 = new Class62("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method5106(@OriginalArg(0) int arg0) {
		Static4.anInt135 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static176.anInt3742; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static285.anInt5263; local6++) {
				if (Static45.aClass188ArrayArrayArray5[arg0][local3][local6] == null) {
					Static45.aClass188ArrayArrayArray5[arg0][local3][local6] = new Class188(arg0, local3, local6);
				}
			}
		}
	}
}
