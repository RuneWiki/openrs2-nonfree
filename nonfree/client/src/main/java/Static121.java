import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_34 = new Class231("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method1984() {
		for (@Pc(7) int local7 = 0; local7 < Static78.aClass125ArrayArray1.length; local7++) {
			for (@Pc(13) int local13 = 0; local13 < Static78.aClass125ArrayArray1[local7].length; local13++) {
				Static78.aClass125ArrayArray1[local7][local13] = Static350.aClass125_2;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method1986() {
		Static408.aBoolean463 = true;
	}
}
