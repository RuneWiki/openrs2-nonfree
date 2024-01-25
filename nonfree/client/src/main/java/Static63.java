import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_31 = new Class36(72, 2);

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
	public static int anInt1619 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)I")
	public static int method1230(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
