import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_180 = new Class103(64, -1);

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_36 = new Class102(10);

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
	public static final int[] anIntArray320 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!za;IIIII)Lclient!e;")
	public static Class57 method3909(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class57 local12 = (Class57) Static25.aClass102_4.method2258(local6);
		if (local12 == null) {
			@Pc(22) Class193 local22 = Static149.method2219(arg1, Static145.aClass82_27);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5431 < 13) {
				local22.method4254();
			}
			local12 = arg0.method5792(local22, 2055, Static203.anInt6056, 64, 768);
			Static25.aClass102_4.method2272(local6, local12);
		}
		local12 = local12.method5966((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.ma(arg5);
		}
		if (arg4 != 0) {
			local12.W(arg4);
		}
		if (arg3 != 0) {
			local12.K(arg3);
		}
		if (arg2 != 0) {
			local12.a(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBI)V")
	public static void method3915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub5_Sub11 local13 = Static188.method2688(arg2, 4);
		local13.method2661();
		local13.anInt3213 = arg0;
		local13.anInt3212 = arg1;
		local13.anInt3209 = arg3;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!fo;Lclient!qm;ILclient!fo;Lclient!fo;)Z")
	public static boolean method3917(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1_Sub6_Sub2 arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) Class82 arg3) {
		Static420.aClass1_Sub6_Sub2_3 = arg1;
		Static459.aClass82_99 = arg2;
		Static151.aClass82_41 = arg3;
		Static53.aClass82_15 = arg0;
		return true;
	}
}
