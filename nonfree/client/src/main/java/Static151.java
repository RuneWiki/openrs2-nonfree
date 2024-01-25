import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
	public static void method2143() {
		Static430.method5422(25);
		Static155.method2183();
		System.gc();
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)V")
	public static void method2146() {
		for (@Pc(11) int local11 = 0; local11 < Static357.aByteArrayArrayArray11.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static357.aByteArrayArrayArray11[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static357.aByteArrayArrayArray11[0][0].length; local19++) {
					Static357.aByteArrayArrayArray11[local11][local15][local19] = 0;
				}
			}
		}
	}
}
