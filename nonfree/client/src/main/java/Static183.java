import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
	public static int anInt3630;

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "Lclient!ln;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!hba", name = "D", descriptor = "Lclient!em;")
	public static final Class83 aClass83_78 = new Class83(30, -1);

	@OriginalMember(owner = "client!hba", name = "E", descriptor = "Lclient!em;")
	public static final Class83 aClass83_79 = new Class83(39, 6);

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)I")
	public static int method2973() {
		if (Static406.aBoolean553) {
			return 6;
		} else if (Static231.aClass1_Sub40_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static231.aClass1_Sub40_1.anInt7819;
			if (Static28.method560(local19)) {
				return 1;
			} else if (Static176.method2783(local19)) {
				return 2;
			} else if (Static13.method257(local19)) {
				return 3;
			} else if (Static308.method4628(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
