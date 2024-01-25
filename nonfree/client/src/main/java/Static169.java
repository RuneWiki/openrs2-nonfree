import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_40 = new Class341(9, 3);

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public static int anInt3597 = 2;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public static void method3350() {
		if (Static347.aClass363ArrayArray1 == null) {
			return;
		}
		for (@Pc(3) int local3 = 0; local3 < Static347.aClass363ArrayArray1.length; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static347.aClass363ArrayArray1[local3].length; local6++) {
				Static347.aClass363ArrayArray1[local3][local6] = Static50.aClass363_1;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
	public static int method3352() {
		return Static11.anIntArray3 == null ? 0 : Static11.anIntArray3.length * 2;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Z")
	public static boolean method3353(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
