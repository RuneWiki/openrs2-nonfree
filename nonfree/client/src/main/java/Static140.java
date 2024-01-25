import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Z")
	public static boolean aBoolean250;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt3127;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method2819() {
		Static497.aClass42_9.method5803(Static520.aFloat189, Static425.aFloat178, Static141.aFloat78);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)[Lclient!tl;")
	public static Class285[] method2820() {
		return new Class285[] { Static171.aClass285_4, Static497.aClass285_6, Class12_Sub13_Sub2.lb, Static66.aClass285_1, Static143.aClass285_3, Static401.aClass285_5 };
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public static void method2821() {
		@Pc(11) Class125 local11 = Static156.aClass125_21;
		synchronized (Static156.aClass125_21) {
			Static156.aClass125_21.method3447(5);
		}
		local11 = Static268.aClass125_41;
		synchronized (Static268.aClass125_41) {
			Static268.aClass125_41.method3447(5);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!mc;B)V")
	public static void method2822(@OriginalArg(0) Class198 arg0) {
		@Pc(7) Class198 local7 = Static116.method2393(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static169.anInt3893;
			local13 = Static127.anInt2936;
		} else {
			local11 = local7.anInt5762;
			local13 = local7.anInt5715;
		}
		Static322.method7800(local13, local11, arg0, false);
		Static188.method3653(local13, local11, arg0);
	}
}
