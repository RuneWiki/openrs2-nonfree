import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static611 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "I")
	public static int anInt10309;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "F")
	public static float aFloat258;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
	public static final int[] anIntArray752 = new int[32];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(CB)I")
	public static int method8582(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class186.anIntArray395.length > arg0 ? Class186.anIntArray395[arg0] : -1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!cga;Z)V")
	public static void method8583(@OriginalArg(1) Class14_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean122) {
			if (arg0.anInt1589 < 0 || Static45.method951(arg0.anInt1583, arg0.anInt1589)) {
				if (arg1) {
					Static27.method619((Class232) null, arg0.anInt1586, arg0.anInt1591, arg0.anInt1584, arg0.anInt1592);
				} else {
					Static81.method1534(arg0.anInt1592, arg0.anInt1586, -1, arg0.anInt1583, arg0.anInt1591, arg0.anInt1589, arg0.anInt1582, arg0.anInt1584);
				}
				arg0.method9315();
			}
		} else if (arg0.aBoolean123 && arg0.anInt1584 >= 1 && arg0.anInt1586 >= 1 && Static26.anInt462 - 2 >= arg0.anInt1584 && Static445.anInt6140 - 2 >= arg0.anInt1586 && (arg0.anInt1593 < 0 || Static45.method951(arg0.anInt1590, arg0.anInt1593))) {
			if (arg1) {
				Static27.method619(arg0.aClass232_1, arg0.anInt1586, arg0.anInt1591, arg0.anInt1584, arg0.anInt1592);
			} else {
				Static81.method1534(arg0.anInt1592, arg0.anInt1586, -1, arg0.anInt1590, arg0.anInt1591, arg0.anInt1593, arg0.anInt1585, arg0.anInt1584);
			}
			arg0.aBoolean123 = false;
			if (!arg1 && arg0.anInt1593 == arg0.anInt1589 && arg0.anInt1589 == -1) {
				arg0.method9315();
			} else if (!arg1 && arg0.anInt1593 == arg0.anInt1589 && arg0.anInt1582 == arg0.anInt1585 && arg0.anInt1590 == arg0.anInt1583) {
				arg0.method9315();
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lclient!jc;")
	public static Class14_Sub5_Sub2 method8584() {
		return Static558.aClass14_Sub5_Sub2_2;
	}
}
