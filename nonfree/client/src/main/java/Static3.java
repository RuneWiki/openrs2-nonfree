import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!qo;")
	public static Class279 aClass279_4;

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_129 = new Class56(75, -1);

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lclient!vn;")
	public static final Class83 aClass83_3 = Static496.method6703();

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "Lclient!nd;")
	public static final Class222 aClass222_12 = new Class222();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method5705(@OriginalArg(0) Class45 arg0) {
		Static544.aClass54_15 = Static103.method1875(arg0, true, Static132.anInt9450);
		Static2.aClass134_1 = Static221.method3502(arg0, Static132.anInt9450);
		Static569.aClass54_9 = Static103.method1875(arg0, true, Static334.anInt5599);
		Static521.aClass134_12 = Static221.method3502(arg0, Static334.anInt5599);
		Static460.aClass54_10 = Static103.method1875(arg0, true, Static189.anInt3600);
		Static75.aClass134_7 = Static221.method3502(arg0, Static189.anInt3600);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)I")
	public static int method5706() {
		return Static389.anInt410;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)[Lclient!nfa;")
	public static Class224[] method5707() {
		return new Class224[] { Static546.aClass224_1, Static546.aClass224_2, Static546.aClass224_3, Static546.aClass224_4, Static546.aClass224_5, Static546.aClass224_6, Static546.aClass224_7, Static546.aClass224_8, Static546.aClass224_9, Static546.aClass224_10, Static546.aClass224_11, Static546.aClass224_12, Static546.aClass224_13, Static546.aClass224_14 };
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZBIII)V")
	public static void method5708(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static329.aLong225 = 0L;
		@Pc(8) int local8 = Static38.method626();
		if (arg3 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static505.aClass45_11.method7391()) {
			arg0 = true;
		}
		Static97.method1805(arg3, arg2, arg0, arg1, local8);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
	public static void method5710(@OriginalArg(1) int arg0) {
		Static282.anInt4861 = arg0;
		@Pc(11) Class6 local11 = Static475.aClass6_58;
		synchronized (Static475.aClass6_58) {
			Static475.aClass6_58.method102();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IC)Z")
	public static boolean method5712(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
