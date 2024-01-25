import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	public static int anInt4731;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)Z")
	public static boolean method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Interface9 local18 = (Interface9) Static334.method4742(arg2, arg0, arg1);
		@Pc(20) boolean local20 = true;
		if (local18 != null) {
			local20 = Static292.method4286(local18) & true;
		}
		local18 = (Interface9) Static80.method1405(arg2, arg0, arg1, np.class);
		if (local18 != null) {
			local20 &= Static292.method4286(local18);
		}
		local18 = (Interface9) Static325.method4667(arg2, arg0, arg1);
		if (local18 != null) {
			local20 &= Static292.method4286(local18);
		}
		return local20;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public static void method3825(@OriginalArg(0) int arg0) {
		Static94.anInt2152 = arg0;
		@Pc(13) Class129 local13 = Static88.aClass129_14;
		synchronized (Static88.aClass129_14) {
			Static88.aClass129_14.method3025();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public static void method3826() {
		Static359.aStringArray25 = new String[500];
		Static386.anInt6717 = Static56.aClass210_2.anInt5944 + Static56.aClass210_2.anInt5946 + 2;
		Static316.anInt5581 = Static55.aClass210_1.anInt5946 + Static55.aClass210_1.anInt5944 + 2;
		for (@Pc(33) int local33 = 0; local33 < Static359.aStringArray25.length; local33++) {
			Static359.aStringArray25[local33] = "";
		}
	}
}
