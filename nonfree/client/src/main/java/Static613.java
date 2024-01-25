import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
	public static int anInt9909 = 104;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
	public static void method8419(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub1_Sub18 local18 = Static123.method1827((long) arg0, 12);
		local18.method7444();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!wq;Z)Lclient!mja;")
	public static Class132_Sub1_Sub1 method8421(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(15) Class132_Sub1 local15 = Static70.method1152(arg0);
		@Pc(19) int local19 = arg0.method7303();
		return new Class132_Sub1_Sub1(local15.aClass189_13, local15.aClass346_14, local15.anInt10380, local15.anInt10382, local15.anInt10377, local15.anInt10374, local15.anInt10373, local15.anInt10383, local15.anInt10378, local15.anInt6050, local15.anInt6044, local15.anInt6048, local15.anInt6047, local15.anInt6045, local15.anInt6049, local19);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBII)V")
	public static void method8422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 * Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251() >> 8;
		if (arg1 == -1 && !Static76.aBoolean115) {
			Static179.method3122();
		} else if (arg1 != -1 && (Static603.anInt9717 != arg1 || !Static471.method6667(-1)) && local20 != 0 && !Static76.aBoolean115) {
			Static256.method4182(arg0, Static336.aClass126_156, local20, arg1);
			Static348.method5140();
		}
		if (Static603.anInt9717 != arg1) {
			Static210.aClass5_Sub4_Sub2_4 = null;
		}
		Static603.anInt9717 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
	public static void method8423() {
		if (Static285.method4551(false, Static652.anInt10664)) {
			Static452.method6395(false);
		} else {
			Static60.aClass50_1 = Static4.aClass389_17.aClass50_2;
			Static4.aClass389_17.aClass50_2 = null;
			Static411.method6060(14, -3);
		}
	}
}
