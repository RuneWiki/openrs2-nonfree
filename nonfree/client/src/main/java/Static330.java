import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	public static int anInt6858 = -1;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "Lclient!eg;")
	public static final Class82 aClass82_6 = new Class82();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ol;B)I")
	public static int method5722(@OriginalArg(0) Class245 arg0) {
		if (Static207.aClass245_1 == arg0) {
			return 9216;
		} else if (Static408.aClass245_3 == arg0) {
			return 34065;
		} else if (arg0 == Static311.aClass245_2) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
