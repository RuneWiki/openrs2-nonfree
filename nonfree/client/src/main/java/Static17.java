import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "Lclient!et;")
	public static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
	public static int anInt193;

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "Lclient!mq;")
	public static Class218 aClass218_2 = null;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)Z")
	public static boolean method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static199.method3939(arg1, arg0) || Static420.method6551(arg0, arg1);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!rq;")
	public static Class2_Sub3_Sub1 method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class243 local14 = local7.aClass243_1; local14 != null; local14 = local14.aClass243_3) {
			@Pc(18) Class2_Sub3_Sub1 local18 = local14.aClass2_Sub3_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort121 == arg1 && local18.aShort124 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(III)V")
	public static void method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static269.anInt5798 == 1) {
			Static422.method8088(arg0, Static156.aClass3_Sub1_Sub4_2, arg1);
		} else if (Static269.anInt5798 == 2) {
			if (Static349.aBoolean590) {
				Static73.method1846(Static10.method114() + arg1, arg0 - -Static477.method7033());
			} else {
				Static73.method1846(arg1, arg0);
			}
		}
		Static269.anInt5798 = 0;
		Static156.aClass3_Sub1_Sub4_2 = null;
	}
}
