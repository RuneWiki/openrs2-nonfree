import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array18;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "Lclient!fj;")
	public static Class79 aClass79_5;

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "Lclient!s;")
	public static Class217 aClass217_120;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
	public static int anInt5509 = 0;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_81 = new Class27(65, 2);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
	public static void method4389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class184 local13 = Static58.aClass184ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static19.anInt349 = local13.anInt5297;
			Static34.anInt560 = local13.anInt5298;
			Static191.anInt3841 = local13.anInt5300;
		}
		Static350.method4745();
	}
}
