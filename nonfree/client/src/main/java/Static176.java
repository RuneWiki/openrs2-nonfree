import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static176 {

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Lclient!je;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	public static int anInt3611 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I")
	public static int method2997(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!qa;Lclient!dn;Lclient!dn;)V")
	public static void method2998(@OriginalArg(1) Class75 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class56 arg2) {
		Static87.aClass179_7 = Static334.method4856(arg1, Static31.anInt838);
		Static183.aClass65_3 = arg0.method2601(Static87.aClass179_7, Static460.method3984(arg2, Static31.anInt838));
		Static230.aClass179_11 = Static334.method4856(arg1, Static126.anInt3503);
		Static277.aClass65_5 = arg0.method2601(Static230.aClass179_11, Static460.method3984(arg2, Static126.anInt3503));
		Static222.aClass179_10 = Static334.method4856(arg1, Static215.anInt4228);
		Static399.aClass65_7 = arg0.method2601(Static222.aClass179_10, Static460.method3984(arg2, Static215.anInt4228));
	}
}
