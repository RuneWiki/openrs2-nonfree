import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array13;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public static int anInt5649 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(JB)V")
	public static void method5076(@OriginalArg(0) long arg0) {
		if (Static69.aClass48ArrayArrayArray1 != null) {
			if (Static88.anInt1815 == 1 || Static88.anInt1815 == 5) {
				Static252.method4106(arg0);
			} else if (Static88.anInt1815 == 4) {
				Static273.method4272(arg0);
			}
		}
		Static318.method1783(Static347.aClass155_9, (long) Static76.anInt1617);
		if (Static68.anInt1346 != -1) {
			Static269.method4264(Static68.anInt1346);
		}
		for (@Pc(37) int local37 = 0; local37 < Static298.anInt5150; local37++) {
			if (Static109.aBooleanArray45[local37]) {
				Static160.aBooleanArray129[local37] = true;
			}
			Static245.aBooleanArray106[local37] = Static109.aBooleanArray45[local37];
			Static109.aBooleanArray45[local37] = false;
		}
		Static298.anInt5152 = Static76.anInt1617;
		if (Static347.aClass155_9.method4882()) {
			Static301.aBoolean408 = true;
		}
		if (Static68.anInt1346 != -1) {
			Static298.anInt5150 = 0;
			Static126.method2018();
		}
		Static347.aClass155_9.method4902();
		Static163.method2303(Static347.aClass155_9);
		@Pc(83) int local83 = Static393.method5718();
		if (local83 == -1) {
			local83 = Static93.anInt1914;
		}
		Static183.method2872(local83);
		Static37.method610(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774, Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, Static38.anInt702, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766);
		Static38.anInt702 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method5077() {
		if (Static218.anInt3887 != 3) {
			Static41.anInt765 = -1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBZ)V")
	public static void method5081(@OriginalArg(0) boolean arg0) {
		Static329.anInt5571++;
		Static99.method1654();
		if (arg0) {
			Static78.anInt1627++;
			Static312.method4793();
		}
	}
}
