import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!rv;")
	public static final Class5_Sub15 aClass5_Sub15_4 = new Class5_Sub15(1350);

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_16 = new Class265(4);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public static void method2845() {
		for (@Pc(4) Class5_Sub27 local4 = (Class5_Sub27) Static298.aClass335_23.method7768(); local4 != null; local4 = (Class5_Sub27) Static298.aClass335_23.method7777()) {
			Static314.method4802(local4.anInt3825);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)Z")
	public static boolean method2848(@OriginalArg(1) int arg0) {
		return arg0 == 12 || arg0 == 25 || arg0 == 23 || arg0 == 3 || arg0 == 45 || arg0 == 13 || arg0 == 57;
	}
}
