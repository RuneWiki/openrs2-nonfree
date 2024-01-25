import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	public static void method4662(@OriginalArg(0) int arg0) {
		Static151.anInt3097 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static595.anInt9881; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static389.anInt6693; local6++) {
				if (Static348.aClass84ArrayArrayArray5[arg0][local3][local6] == null) {
					Static348.aClass84ArrayArrayArray5[arg0][local3][local6] = new Class84(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lclient!sl;Z)Lclient!kd;")
	public static Class198 method4664(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(12) int local12 = arg0.method2825();
		return new Class198(local12);
	}
}
