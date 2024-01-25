import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hd", name = "Qc", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!hd", name = "bd", descriptor = "Lclient!sg;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_97 = new Class56(31, 4);

	@OriginalMember(owner = "client!hd", name = "Bc", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_98 = new Class56(33, 3);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method2051() {
		Static395.method5207();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZILclient!la;IIILclient!ya;)V")
	public static void method2052(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class123 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class135 arg5) {
		if (arg0) {
			Static65.aClass95_9.method5821((Static345.anInt5723 - Static65.aClass95_9.j()) / 2, (Static120.anInt2134 - Static65.aClass95_9.T()) / 2);
			Static223.aClass95_10.method5821((Static345.anInt5723 - Static223.aClass95_10.j()) / 2, 18);
		}
		@Pc(33) String local33 = "";
		if (Static43.aClass6_6 == Static231.aClass6_7) {
			local33 = Static363.aClass15_101.method180(Static429.anInt6999);
		} else if (Static231.aClass6_7 == Static15.aClass6_1) {
			local33 = Static370.aClass15_111.method180(Static429.anInt6999);
		}
		arg1.method5788(Static120.anInt2134 / 2 - 26, Static345.anInt5723 / 2, -1, local33, arg4);
		@Pc(75) int local75 = Static120.anInt2134 / 2 - 18;
		arg5.method5354(Static345.anInt5723 / 2 - 152, local75, 304, 34, arg2, 0);
		arg5.method5354(Static345.anInt5723 / 2 - 151, local75 + 1, 302, 32, 0, 0);
		arg5.O(Static345.anInt5723 / 2 - 150, local75 + 2, Static90.anInt1726 * 3, 30, arg3, 0);
		arg5.O(Static90.anInt1726 * 3 + Static345.anInt5723 / 2 - 150, local75 + 2, 300 - Static90.anInt1726 * 3, 30, 0, 0);
		arg1.method5788(Static120.anInt2134 / 2 + 4, Static345.anInt5723 / 2, -1, Static166.aString26, arg4);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	public static void method2058(@OriginalArg(0) int arg0) {
		Static324.method4285();
		@Pc(11) int local11 = Static438.aClass143_5.method2848(arg0).anInt7333;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static52.aClass81_1.anIntArray159[arg0];
		if (local11 == 5) {
			Static443.anInt7447 = local20;
		}
		if (local11 == 6) {
			Static220.anInt3783 = local20;
		}
	}
}
