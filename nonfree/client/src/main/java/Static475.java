import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array20;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_152 = new Class73(82, 12);

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_124 = new Class47(5, -1);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wv;Lclient!wv;IIIIIIII)V")
	public static void method6589(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) Class4_Sub1_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method5899();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class58 local20 = (Class58) Static282.aClass136_60.method3473((long) local7);
		if (local20 == null) {
			@Pc(27) Class140[] local27 = Static604.method3627(Static398.aClass251_94, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static240.aClass14_7.method6889(local27[0], true);
			Static282.aClass136_60.method3482((long) local7, local20);
		}
		Static297.method991(arg1.anInt9542, arg1.method5892() * 256, arg1.anInt9540, arg6 >> 1, 0, arg1.aByte108, arg5 >> 1);
		@Pc(75) int local75 = arg4 + Static373.anIntArray490[0] - 18;
		@Pc(83) int local83 = arg2 + Static373.anIntArray490[1] - 70;
		@Pc(91) int local91 = local75 + arg3 / 4 * 18;
		@Pc(99) int local99 = local83 + arg3 % 4 * 18;
		local20.method7666(local91, local99);
		if (arg0 == arg1) {
			Static240.aClass14_7.method6904(18, -256, local91 - 1, local99 + -1, 18);
		}
		@Pc(121) Class98_Sub4 local121 = Static152.method6447();
		local121.anInt5725 = local91;
		local121.anInt5726 = local99 + 16;
		local121.anInt5723 = local91 + 16;
		local121.anInt5724 = local99;
		local121.aClass4_Sub1_Sub1_1 = arg0;
		Static158.aClass40_3.method1131(local121);
	}
}
