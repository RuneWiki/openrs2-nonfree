import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_170 = new Class186(40, 12);

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Lclient!go;")
	public static Class95 aClass95_5 = null;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!jo;Lclient!jo;)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub3 arg3, @OriginalArg(4) Class6_Sub3 arg4) {
		@Pc(4) Class53 local4 = Static444.method5715(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub3_1 = arg3;
			local4.aClass6_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public static boolean method3963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method3967(@OriginalArg(0) Class126 arg0) {
		if (!Static222.aBoolean305) {
			return;
		}
		if (arg0.anObjectArray31 != null) {
			@Pc(14) Class126 local14 = Static299.method4154(Static8.anInt336, Static14.anInt5474);
			if (local14 != null) {
				@Pc(20) Class4_Sub40 local20 = new Class4_Sub40();
				local20.aClass126_15 = local14;
				local20.anObjectArray35 = arg0.anObjectArray31;
				local20.aClass126_16 = arg0;
				Static172.method2513(local20);
			}
		}
		Static209.method2982(Static110.aClass36_55);
		Static116.aClass4_Sub30_Sub1_1.method4861(arg0.anInt3397);
		Static116.aClass4_Sub30_Sub1_1.method4828(Static14.anInt5474);
		Static116.aClass4_Sub30_Sub1_1.method4861(Static8.anInt336);
		Static116.aClass4_Sub30_Sub1_1.method4828(arg0.anInt3395);
		Static116.aClass4_Sub30_Sub1_1.method4828(Static384.anInt6284);
		Static116.aClass4_Sub30_Sub1_1.method4883(arg0.anInt3392);
	}
}
