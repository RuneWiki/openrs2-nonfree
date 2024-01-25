import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!ro;")
	public static Class306 aClass306_36 = new Class306();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wu;Lclient!wu;Lclient!ft;ILclient!wu;Lclient!uu;)Z")
	public static boolean method6196(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class5_Sub16_Sub1 arg2, @OriginalArg(4) Class384 arg3, @OriginalArg(5) Class63 arg4) {
		Static186.aClass384_47 = arg0;
		Static477.aClass63_3 = arg4;
		Static79.aClass384_111 = arg3;
		Static276.aClass384_126 = arg1;
		Static275.aClass5_Sub16_Sub1_5 = arg2;
		Static68.anIntArray95 = new int[16];
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static68.anIntArray95[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method6197(@OriginalArg(0) int arg0) {
		if (Static571.anInt9391 == 0) {
			Static275.aClass5_Sub16_Sub1_5.method2567(arg0);
		} else {
			Static210.anInt3640 = arg0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method6198() {
		for (@Pc(6) Class14_Sub4 local6 = (Class14_Sub4) Static441.aClass363_8.method8483(); local6 != null; local6 = (Class14_Sub4) Static441.aClass363_8.method8483()) {
			Static229.method3588(local6);
		}
		@Pc(38) int local38;
		@Pc(37) int local37;
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 1) {
			local38 = 0;
			local37 = 3;
		} else {
			local37 = Static315.anInt5514;
			local38 = Static315.anInt5514;
		}
		Static74.method1227();
		for (@Pc(47) int local47 = local38; local47 <= local37; local47++) {
			Static74.method1228();
			Static74.method1224(local47);
			Static74.method1221(local47);
		}
		Static74.method1222();
		Static74.method1217();
	}
}
