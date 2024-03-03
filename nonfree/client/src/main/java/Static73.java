import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	public static int anInt1754;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 81)
	public static void method1858(@OriginalArg(0) int arg0) {
		Class2_Sub3_Sub9.anInt1622 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static68.anInt1682; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static196.anInt3769; local6++) {
				if (Static307.aClass67ArrayArrayArray3[arg0][local3][local6] == null) {
					Static307.aClass67ArrayArrayArray3[arg0][local3][local6] = new Class67(arg0, local3, local6);
				}
			}
		}
	}
}
