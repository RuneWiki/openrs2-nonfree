import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "Lclient!gf;")
	public static Class89 aClass89_10;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_181 = new Class12(32, -2);

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
	public static boolean aBoolean814 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIILclient!rv;)V")
	public static void method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25_Sub3 arg4) {
		@Pc(4) Class169 local4 = Static175.method2473(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1529 = (arg1 << Static215.anInt4460) + Static341.anInt5832;
		arg4.anInt1527 = arg3;
		arg4.anInt1534 = (arg2 << Static215.anInt4460) + Static341.anInt5832;
		for (@Pc(28) Class27 local28 = local4.aClass27_3; local28 != null; local28 = local28.aClass27_1) {
			if (local28.aClass25_Sub5_1.aBoolean625) {
				@Pc(38) int local38 = local28.aClass25_Sub5_1.method4341();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1527 += local8;
			arg4.aBoolean175 = true;
		} else if (local4.aClass25_Sub2_2 != null) {
			arg4.anInt1527 -= local4.aClass25_Sub2_2.aShort78;
		}
		local4.aClass25_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!za;ILclient!fo;Lclient!fo;)V")
	public static void method5905(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2) {
		Static58.aClass89_1 = Static341.method4571(Static378.anInt2799, arg2);
		Static80.aClass76_1 = arg0.method5754(Static58.aClass89_1, Static460.method1579(arg1, Static378.anInt2799));
		Static414.aClass89_9 = Static341.method4571(Static364.anInt3532, arg2);
		Static437.aClass76_4 = arg0.method5754(Static414.aClass89_9, Static460.method1579(arg1, Static364.anInt3532));
		aClass89_10 = Static341.method4571(Static179.anInt3130, arg2);
		Static121.aClass76_2 = arg0.method5754(aClass89_10, Static460.method1579(arg1, Static179.anInt3130));
	}
}
