import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_18 = new Class300(16);

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
	public static int anInt4619 = 0;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)I")
	public static int method3901(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = Static1.anInt9943;
		if (local12 == 0) {
			return arg0 ? 0 : Static25.anInt344;
		} else if (local12 == 1) {
			return Static25.anInt344;
		} else if (local12 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
