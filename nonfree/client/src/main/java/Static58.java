import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public static int anInt1118;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Z")
	public static boolean aBoolean72;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static360.aByteArrayArrayArray16[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static360.aByteArrayArrayArray16[arg3][arg2][arg0] & 0x10) == 0) {
			return arg1 == Static294.method4206(arg2, arg0, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ga;Z)V")
	public static void method1109(@OriginalArg(0) Class82 arg0) {
		if (!Static73.aBoolean88) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(14) Class82 local14 = Static360.method5048(Static102.anInt1846, Static327.anInt5460);
			if (local14 != null) {
				@Pc(20) Class3_Sub15 local20 = new Class3_Sub15();
				local20.aClass82_1 = arg0;
				local20.aClass82_2 = local14;
				local20.anObjectArray3 = arg0.anObjectArray30;
				Static219.method3217(local20);
			}
		}
		Static307.method4633(Static328.aClass163_137);
		Static243.aClass3_Sub25_Sub1_7.method4082(arg0.anInt2208);
		Static243.aClass3_Sub25_Sub1_7.method4071(Static327.anInt5460);
		Static243.aClass3_Sub25_Sub1_7.method4093(Static102.anInt1846);
		Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
		Static243.aClass3_Sub25_Sub1_7.method4077(arg0.anInt2200);
		Static243.aClass3_Sub25_Sub1_7.method4093(arg0.anInt2209);
	}
}
