import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "[Lclient!nn;")
	public static Class2_Sub26_Sub1[] aClass2_Sub26_Sub1Array2;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)V", line = 16)
	public static void method5251(@OriginalArg(0) byte arg0) {
		if (Static213.aByteArrayArrayArray13 == null) {
			Static213.aByteArrayArrayArray13 = new byte[4][Class241.anInt7020][OutputStream_Sub1.anInt4442];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Class241.anInt7020; local18++) {
				for (@Pc(22) int local22 = 0; local22 < OutputStream_Sub1.anInt4442; local22++) {
					Static213.aByteArrayArrayArray13[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!id;)Z", line = 85)
	public static boolean method5253(@OriginalArg(1) Interface6 arg0) {
		@Pc(10) Class41 local10 = Static334.aClass202_4.method5164(arg0.method6086());
		if (local10.anInt1315 == -1) {
			return true;
		} else {
			@Pc(22) Class146 local22 = Static297.aClass104_2.method2710(local10.anInt1315);
			return local22.anInt3747 == -1 ? true : local22.method3709();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIBII)V", line = 128)
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class12_Sub3 local6 = (Class12_Sub3) Class190.aClass36_7.method1417(); local6 != null; local6 = (Class12_Sub3) Class190.aClass36_7.method1422()) {
			if (Class83.anInt2345 >= local6.anInt3197) {
				local6.method5685();
			} else {
				Static114.method2396(local6.anInt3203, arg2 >> 1, (local6.anInt3196 << 7) + 64, local6.anInt3200 * 2, arg1 >> 1, (local6.anInt3204 << 7) + 64);
				Static49.aClass130_1.method5901(local6.aString26, 0, arg0 + Class153.anIntArray231[1], local6.anInt3202 | 0xFF000000, Class153.anIntArray231[0] + arg3);
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIB)V", line = 155)
	public static void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static15.anInt366 = arg3;
		Static292.anInt5918 = arg1;
		Static144.anInt2789 = arg0;
		Static71.anInt1735 = arg2;
	}
}
