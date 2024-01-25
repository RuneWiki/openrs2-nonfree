import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[[Lclient!tf;")
	public static Class240[][] aClass240ArrayArray2;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray51 = new boolean[100];

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt2551 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!ba;Ljava/lang/String;I)V")
	public static void method2305(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) String arg2) {
		@Pc(22) int local22 = Static115.aClass84_4.method2375(null, 250, arg2);
		@Pc(31) int local31 = Static115.aClass84_4.method2380(null, 250, arg2) * 13;
		Static30.aClass30_3.M(6, 6, local22 + 8, local31 + 4 + 4, -16777216, 0);
		Static30.aClass30_3.method2074(6, 6, local22 + 4 + 4, local31 - -4 + 4, -1, 0);
		arg1.method5768(-1, 10, 1, 10, 0, 0, local31, null, -1, null, local22, arg2, null);
		Static227.method3863(6, local22 + 4 + 4, local31 - -4 + 4, 6);
		if (arg0) {
			Static30.aClass30_3.method2042();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!qa;Lclient!au;Lclient!rg;B)V")
	public static void method2307(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(2) Class217 arg2) {
		@Pc(10) Class2 local10 = arg2.method5092(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.TA();
		if (local10.V() > local16) {
			local16 = local10.V();
		}
		@Pc(32) int local32 = arg1.anInt362;
		@Pc(35) int local35 = arg1.anInt365;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg2.aString53 != null) {
			local37 = Static94.aClass84_3.method2376(null, arg2.aString53, Static124.aStringArray13, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static124.aStringArray13[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static171.aClass122_2.method3403(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = Static171.aClass122_2.method3400() * local37 + Static171.aClass122_2.method3398() / 2;
		}
		local55 = local16 / 2 + arg1.anInt362;
		if (local32 < Static425.anInt3663 + local16) {
			local32 = Static425.anInt3663;
			local55 = local39 / 2 + local16 / 2 + Static425.anInt3663 + 5 + 10;
		} else if (Static425.anInt3660 - local16 < local32) {
			local32 = Static425.anInt3660 - local16;
			local55 = Static425.anInt3660 - local39 / 2 - local16 / 2 - 5 - 10;
		}
		@Pc(161) int local161 = arg1.anInt365;
		if (local16 + Static425.anInt3665 > local35) {
			local35 = Static425.anInt3665;
			local161 = local16 / 2 + Static425.anInt3665 + 10;
		} else if (local35 > Static425.anInt3666 - local16) {
			local35 = Static425.anInt3666 - local16;
			local161 = Static425.anInt3666 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt362), (double) (local35 - arg1.anInt365)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5920((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(245) int local245 = -2;
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		if (arg2.aString53 != null) {
			local247 = local161;
			local245 = local55 - local39 / 2 - 5;
			local251 = local161 + Static171.aClass122_2.method3400() * local37 + 3;
			local249 = local245 + local39 + 10;
			if (arg2.anInt6164 != 0) {
				arg0.method2072(local161, local245, local249 - local245, local251 - local161, arg2.anInt6164);
			}
			if (arg2.anInt6167 != 0) {
				arg0.method2095(local161, local245, arg2.anInt6167, local249 - local245, -local161 + local251);
			}
			for (@Pc(324) int local324 = 0; local324 < local37; local324++) {
				@Pc(330) String local330 = Static124.aStringArray13[local324];
				if (local37 - 1 > local324) {
					local330 = local330.substring(0, local330.length() - 4);
				}
				Static171.aClass122_2.method3399(arg0, local330, local55, local161, arg2.anInt6188);
				local161 += Static171.aClass122_2.method3400();
			}
		}
		if (arg2.anInt6181 == -1 && arg2.aString53 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(382) Class4_Sub43 local382 = new Class4_Sub43(arg1);
		local382.anInt7315 = local247;
		local382.anInt7314 = local251;
		local382.anInt7317 = local249;
		local382.anInt7320 = local32 - local16;
		local382.anInt7312 = local245;
		local382.anInt7322 = local35 + local16;
		local382.anInt7319 = local35 - local16;
		local382.anInt7313 = local16 + local32;
		Static345.aClass91_41.method2587(local382);
	}
}
