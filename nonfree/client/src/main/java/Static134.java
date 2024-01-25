import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!o;")
	public static Class41 aClass41_6;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public static int anInt2522;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_30 = new Class208(7, -1);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method2135() {
		if (Static286.anInt5137 <= 0) {
			Static216.aString73 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static20.aStringArray8.length; local11++) {
			if (Static20.aStringArray8[local11].startsWith("--> ")) {
				local9++;
				if (local9 == Static286.anInt5137) {
					Static216.aString73 = Static20.aStringArray8[local11].substring(4);
					break;
				}
			}
		}
	}
}
