import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[200];

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public static void method6754(@OriginalArg(0) int arg0) {
		Static518.anInt3345 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static80.anInt1391; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static164.anInt2881; local6++) {
				if (Static208.aClass9ArrayArrayArray3[arg0][local3][local6] == null) {
					Static208.aClass9ArrayArrayArray3[arg0][local3][local6] = new Class9(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI)Z")
	public static boolean method6755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static519.method7319(arg1, arg0) || Static143.method6496(arg1, arg0);
	}
}
