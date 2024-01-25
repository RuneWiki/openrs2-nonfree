import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_48 = new Class208(46, -1);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public static void method3172() {
		if (Static55.anInt1068 == 3) {
			Static318.method4726(4);
		} else if (Static55.anInt1068 == 7) {
			Static318.method4726(8);
		} else if (Static55.anInt1068 == 10) {
			Static318.method4726(11);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub43 local7 = null;
		for (@Pc(14) Class1_Sub43 local14 = (Class1_Sub43) Static64.aClass111_5.method2547(); local14 != null; local14 = (Class1_Sub43) Static64.aClass111_5.method2554()) {
			if (arg6 == local14.anInt8109 && arg0 == local14.anInt8101 && arg3 == local14.anInt8102 && local14.anInt8107 == arg1) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub43();
			local7.anInt8107 = arg1;
			local7.anInt8109 = arg6;
			local7.anInt8102 = arg3;
			local7.anInt8101 = arg0;
			if (arg0 >= 0 && arg3 >= 0 && Static458.anInt9736 > arg0 && arg3 < Static378.anInt6747) {
				Static80.method1331(local7);
			}
			Static64.aClass111_5.method2552(local7);
		}
		local7.anInt8103 = arg4;
		local7.anInt8098 = arg2;
		local7.anInt8096 = -1;
		local7.anInt8097 = arg5;
		local7.anInt8104 = 0;
	}
}
