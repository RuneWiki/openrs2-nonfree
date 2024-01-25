import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!via", name = "z", descriptor = "I")
	public static int anInt9861;

	@OriginalMember(owner = "client!via", name = "B", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_199 = new Class126(118, -1);

	@OriginalMember(owner = "client!via", name = "f", descriptor = "(I)I")
	public static int method8399() {
		@Pc(12) int local12 = Static137.aClass370_1.method8274();
		if (Static424.aClass370Array1.length - 1 > local12) {
			Static137.aClass370_1 = Static424.aClass370Array1[local12 + 1];
		}
		return 100;
	}
}
