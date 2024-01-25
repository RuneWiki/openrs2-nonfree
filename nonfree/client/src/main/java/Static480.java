import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt10369;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt10368 = -1;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt10375 = 0;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public static void method8645() {
		Static493.aClass32_72.method640();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!mha;")
	public static Class222 method8646(@OriginalArg(0) int arg0) {
		@Pc(10) Class222[] local10 = Static291.method1822();
		for (@Pc(17) int local17 = 0; local17 < local10.length; local17++) {
			if (arg0 == local10[local17].anInt5480) {
				return local10[local17];
			}
		}
		return null;
	}
}
