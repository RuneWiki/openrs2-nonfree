import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3700(@OriginalArg(0) String arg0) {
		if (Static301.aStringArray32 == null) {
			Static555.method7928();
		}
		@Pc(14) String[] local14 = Static288.method4721(arg0, '\n');
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static211.anInt9770; local25 > 0; local25--) {
				Static301.aStringArray32[local25] = Static301.aStringArray32[local25 - 1];
			}
			Static301.aStringArray32[0] = local14[local21];
			if (Static211.anInt9770 < Static301.aStringArray32.length - 1) {
				if (Static63.anInt1505 > 0) {
					Static63.anInt1505++;
				}
				Static211.anInt9770++;
			}
		}
	}
}
