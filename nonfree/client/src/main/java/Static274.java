import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	public static void method4520() {
		Static147.aClass136_104.method3470();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BB)Z")
	public static boolean method4522(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static422.aCharArray8[local12 - 128] != '\u0000';
		}
	}
}
