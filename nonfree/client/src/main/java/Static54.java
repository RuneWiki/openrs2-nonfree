import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public static int anInt1076;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	public static int anInt1070 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!qb;Lclient!hc;IILclient!fc;I)V")
	public static void method872(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub3_Sub2 arg1, @OriginalArg(3) Class12_Sub3_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class47 arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class4_Sub23 local14 = new Class4_Sub23();
		local14.anInt3418 = arg4 * 128;
		local14.anInt3420 = arg6;
		local14.anInt3417 = arg0 * 128;
		if (arg5 != null) {
			local14.aClass47_1 = arg5;
			local14.anInt3430 = arg5.anInt1372 * 128;
			local14.anInt3422 = arg5.anInt1359;
			local14.anIntArray297 = arg5.anIntArray143;
			local14.anInt3431 = arg5.anInt1373;
			local14.anInt3421 = arg5.anInt1353;
			local14.anInt3423 = arg5.anInt1346;
			@Pc(172) int local172 = arg5.anInt1327;
			@Pc(175) int local175 = arg5.anInt1354;
			if (arg3 == 1 || arg3 == 3) {
				local172 = arg5.anInt1354;
				local175 = arg5.anInt1327;
			}
			local14.anInt3419 = (local172 + arg4) * 128;
			local14.anInt3429 = (arg0 + local175) * 128;
			if (arg5.anIntArray142 != null) {
				local14.aBoolean212 = true;
				local14.method2708();
			}
			if (local14.anIntArray297 != null) {
				local14.anInt3428 = (int) ((double) (local14.anInt3423 - local14.anInt3421) * Math.random()) + local14.anInt3421;
			}
			Static47.aClass10_8.method184(local14);
		} else if (arg2 != null) {
			local14.aClass12_Sub3_Sub1_1 = arg2;
			@Pc(86) Class175 local86 = arg2.aClass175_1;
			if (local86.anIntArray462 != null) {
				local14.aBoolean212 = true;
				local86 = local86.method4133();
			}
			if (local86 != null) {
				local14.anInt3419 = (arg4 + local86.anInt5217) * 128;
				local14.anInt3429 = (arg0 + local86.anInt5217) * 128;
				local14.anInt3422 = Static170.method2677(arg2);
				local14.anInt3430 = local86.anInt5215 * 128;
				local14.anInt3431 = local86.anInt5205;
			}
			Static118.aClass10_27.method184(local14);
		} else if (arg1 != null) {
			local14.aClass12_Sub3_Sub2_1 = arg1;
			local14.anInt3419 = (arg1.method3375() + arg4) * 128;
			local14.anInt3429 = (arg0 + arg1.method3375()) * 128;
			local14.anInt3422 = Static147.method2370(arg1);
			local14.anInt3430 = arg1.anInt4221 * 128;
			local14.anInt3431 = arg1.anInt4207;
			Static262.aClass97_22.method2364(local14, Static34.method491(arg1.aString132));
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public static void method873() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static231.aBooleanArray21[local7] = false;
		}
		Static297.anInt5494 = -1;
		Static47.anInt951 = 0;
		Static126.anInt2695 = -1;
		Static239.anInt4616 = 5;
		Static121.anInt2644 = 0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	public static void method874() {
		Static281.aClass97_24.method2356();
		Static75.aClass177_3.method4270();
		Static115.aClass177_5.method4270();
	}
}
