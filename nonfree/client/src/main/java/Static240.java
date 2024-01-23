import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public static int anInt5001;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public static int anInt5002;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	public static int anInt5003;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!jl;")
	public static Class89 aClass89_37 = new Class89(260);

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString347 = "glow2:";

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
	public static boolean aBoolean314 = true;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString348 = "white:";

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "[Lclient!dd;")
	public static Class35[] aClass35Array1 = new Class35[50];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
	public static void method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static170.anInt3814 <= arg2 && Static310.anInt6206 >= arg3 && Static206.anInt4449 <= arg0 && arg4 <= Static90.anInt2088) {
			Static293.method4481(arg3, arg1, arg4, arg2, arg0);
		} else {
			Static189.method3052(arg4, arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method3776(@OriginalArg(1) int arg0) {
		Static299.anInt5944 = arg0;
		Static202.anInt4408 = -1;
		Static202.anInt4408 = -1;
		Static278.method4757();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public static boolean method3778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static14.anInt379; local1++) {
			@Pc(8) Class9 local8 = Static80.aClass9Array2[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt297 == 1) {
				local17 = local8.anInt292 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt287 + (local8.anInt294 * local17 >> 8);
					local39 = local8.anInt277 + (local8.anInt296 * local17 >> 8);
					local49 = local8.anInt289 + (local8.anInt284 * local17 >> 8);
					local59 = local8.anInt282 + (local8.anInt293 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt297 == 2) {
				local17 = arg0 - local8.anInt292;
				if (local17 > 0) {
					local29 = local8.anInt287 + (local8.anInt294 * local17 >> 8);
					local39 = local8.anInt277 + (local8.anInt296 * local17 >> 8);
					local49 = local8.anInt289 + (local8.anInt284 * local17 >> 8);
					local59 = local8.anInt282 + (local8.anInt293 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt297 == 3) {
				local17 = local8.anInt287 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt292 + (local8.anInt290 * local17 >> 8);
					local39 = local8.anInt278 + (local8.anInt281 * local17 >> 8);
					local49 = local8.anInt289 + (local8.anInt284 * local17 >> 8);
					local59 = local8.anInt282 + (local8.anInt293 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt297 == 4) {
				local17 = arg2 - local8.anInt287;
				if (local17 > 0) {
					local29 = local8.anInt292 + (local8.anInt290 * local17 >> 8);
					local39 = local8.anInt278 + (local8.anInt281 * local17 >> 8);
					local49 = local8.anInt289 + (local8.anInt284 * local17 >> 8);
					local59 = local8.anInt282 + (local8.anInt293 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt297 == 5) {
				local17 = arg1 - local8.anInt289;
				if (local17 > 0) {
					local29 = local8.anInt292 + (local8.anInt290 * local17 >> 8);
					local39 = local8.anInt278 + (local8.anInt281 * local17 >> 8);
					local49 = local8.anInt287 + (local8.anInt294 * local17 >> 8);
					local59 = local8.anInt277 + (local8.anInt296 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!hk;)V")
	public static void method3779(@OriginalArg(1) Class70 arg0) {
		Static12.aClass70_2 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Lclient!pc;")
	public static Class1_Sub3_Sub17 method3781(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub17 local10 = (Class1_Sub3_Sub17) Static133.aClass162_4.method4003((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = Static206.aClass168_150.method4058(arg0, 1);
		} else {
			local32 = Static147.aClass168_110.method4058(arg0 & 0x7FFF, 1);
		}
		local10 = new Class1_Sub3_Sub17();
		if (local32 != null) {
			local10.method3302(new Class1_Sub14(local32));
		}
		if (arg0 >= 32768) {
			local10.method3303();
		}
		Static133.aClass162_4.method4005(local10, (long) arg0);
		return local10;
	}
}
