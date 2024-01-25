import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_39 = new Class269(27, 4);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	public static void method3328() {
		if (Static287.aBoolean411) {
			return;
		}
		Static216.method3740(Static142.aClass217ArrayArrayArray1);
		if (Static204.aClass217ArrayArrayArray2 != null) {
			Static216.method3740(Static204.aClass217ArrayArrayArray2);
		}
		Static287.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)Z")
	public static boolean method3329(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static450.aCharArray8[local7 - 128] != '\u0000';
		}
	}
}
