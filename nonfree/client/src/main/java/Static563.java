import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method7341() {
		@Pc(7) Class288 local7 = null;
		try {
			local7 = Static60.method1392("2");
			@Pc(20) Class3_Sub2 local20 = new Class3_Sub2(Static209.anInt3450 * 6 + 3);
			local20.method2065(1);
			local20.method2032(Static209.anInt3450);
			for (@Pc(30) int local30 = 0; local30 < Static227.anIntArray269.length; local30++) {
				if (Static317.aBooleanArray10[local30]) {
					local20.method2032(local30);
					local20.method2018(Static227.anIntArray269[local30]);
				}
			}
			local7.method6777(local20.aByteArray20, 0, local20.anInt2178);
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method6780();
			}
		} catch (@Pc(81) Exception local81) {
		}
		Static346.aLong189 = Static517.method6965();
		Static652.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public static void method7342() {
		Static441.aString88 = "";
		Static66.anInt1579 = -1;
		Static605.aLong302 = (long) 0;
	}
}
