import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public static int anInt5540;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_160 = new Class160(133, -2);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)I")
	public static int method5002() {
		@Pc(13) int local13 = Static18.aClass168_1.method4057();
		if (Static7.aClass168Array1.length - 1 > local13) {
			Static18.aClass168_1 = Static7.aClass168Array1[local13 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z")
	public static boolean method5006(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
