import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
	public static int[] anIntArray538;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_102 = new Class100(16, -1);

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public static int anInt7413 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I")
	public static int method6008(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
