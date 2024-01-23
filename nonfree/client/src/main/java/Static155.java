import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt2464;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!fh;")
	public static Class58 aClass58_54;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString140 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
	public static void method1934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static24.anInt344 * arg0 >> 8;
		if (local5 != 0 && arg2 != -1) {
			Static204.method3264(local5, arg2, Static127.aClass58_57);
			Static153.aBoolean210 = true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	public static void method1937(@OriginalArg(1) boolean arg0) {
		Static178.method2795(Static9.anInt131, Static213.aFloat102, Static103.aFloat63, Static235.aFloat108);
		Static178.method2794(Static162.anInt3196, Static37.anInt611, arg0);
		Static178.method2788((float) Static156.anInt3068, (float) Static286.anInt5364, (float) Static272.anInt5212);
		Static178.method2790();
		Static49.aFloat27 = aFloat58;
		Static198.aClass4_Sub3_Sub10_6 = Static3.aClass4_Sub3_Sub10_1;
		Static49.aFloat25 = Static141.aFloat145;
		Static49.aFloat26 = Static167.aFloat85;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
	public static void method1938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class32 local7 = Static68.method1065(arg0);
		@Pc(10) int local10 = local7.anInt787;
		@Pc(13) int local13 = local7.anInt794;
		@Pc(16) int local16 = local7.anInt795;
		@Pc(23) int local23 = Class4_Sub3_Sub16.anIntArray455[local16 - local13];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static222.method3580(local10, arg1 << local13 & local23 | Static2.anIntArray2[local10] & ~local23);
	}
}
