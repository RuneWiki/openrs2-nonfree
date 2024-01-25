import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_113 = new Class254(33, -1);

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "S")
	public static short aShort94 = 256;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "[I")
	public static final int[] anIntArray445 = new int[200];

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public static int anInt6024 = 0;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_114 = new Class254(13, -1);

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_15 = new Class60(3, 14);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method4771() {
		if (Static222.aBoolean314) {
			return;
		}
		if (Static327.aClass230_Sub1_1.aBoolean621) {
			Static147.aFloat59 = (int) Static147.aFloat59 - 65 & 0xFFFFFF80;
		} else {
			Static285.aFloat4 += (-Static285.aFloat4 - 24.0F) / 2.0F;
		}
		Static5.aBoolean541 = true;
		Static222.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
	public static void method4776(@OriginalArg(1) int arg0) {
		Static347.anIntArray461 = new int[arg0];
		Static194.anIntArray571 = new int[arg0];
		Static162.anIntArray219 = new int[arg0];
		Static148.anIntArray547 = new int[arg0];
		Static213.anIntArray299 = new int[arg0];
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	public static void method4777() {
		Static47.anImage1 = null;
		Static240.aFont1 = null;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method4778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 128 || arg5 < 128 || Static80.anInt6558 * 128 - 256 < arg3 || (Static104.anInt2048 - 2) * 128 < arg5) {
			Static116.anIntArray114[0] = Static116.anIntArray114[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static405.method5510(arg5, arg3, arg4) - arg0;
		Static198.aClass43_2.ZA(arg6, 0, 0);
		Static447.aClass121_11.m(Static198.aClass43_2);
		Static447.aClass121_11.ia(arg3, local53, arg5, Static116.anIntArray114);
		Static198.aClass43_2.ZA(-arg6, 0, 0);
		Static447.aClass121_11.m(Static198.aClass43_2);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)I")
	public static int method4779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static346.anInt6354 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(22) int local22 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg0 - Static350.anInt6639;
		@Pc(31) int local31 = arg2 - Static350.anInt6636;
		for (@Pc(36) Class1_Sub8 local36 = (Class1_Sub8) Static350.aClass142_46.method3199(); local36 != null; local36 = (Class1_Sub8) Static350.aClass142_46.method3198()) {
			if (local36.anInt1168 == arg1) {
				@Pc(49) int local49 = local36.anInt1163;
				@Pc(52) int local52 = local36.anInt1160;
				@Pc(62) int local62 = Static350.anInt6636 + local52 | Static350.anInt6639 + local49 << 14;
				@Pc(83) int local83 = (local26 - local49) * (-local49 + local26) + (local31 - local52) * (-local52 + local31);
				if (local12 < 0 || local22 > local83) {
					local22 = local83;
					local12 = local62;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method4780(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub21 local7 = null;
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) Static280.aClass142_29.method3199(); local12 != null; local12 = (Class1_Sub21) Static280.aClass142_29.method3198()) {
			if (local12.anInt3378 == arg0 && local12.anInt3367 == arg4 && local12.anInt3366 == arg6 && arg2 == local12.anInt3374) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub21();
			local7.anInt3367 = arg4;
			local7.anInt3378 = arg0;
			local7.anInt3374 = arg2;
			local7.anInt3366 = arg6;
			if (arg4 >= 0 && arg6 >= 0 && arg4 < Static80.anInt6558 && arg6 < Static104.anInt2048) {
				Static38.method506(local7);
			}
			Static280.aClass142_29.method3212(local7);
		}
		local7.anInt3375 = 0;
		local7.anInt3376 = arg1;
		local7.anInt3381 = arg3;
		local7.anInt3368 = arg5;
		local7.anInt3370 = -1;
	}
}
