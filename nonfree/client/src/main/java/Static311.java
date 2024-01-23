import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!fh;")
	public static Class58 aClass58_104;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt6034;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public static int anInt6035 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIZII)Z")
	public static boolean method4817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(21) long local21 = Static174.method2739(arg1, arg4 + 0, arg3);
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(46) int local46;
		@Pc(50) Class184 local50;
		@Pc(56) int local56;
		@Pc(58) int[] local58;
		@Pc(75) int local75;
		if (local21 != 0L) {
			local32 = (int) local21 >> 20 & 0x3;
			local39 = (int) local21 >> 14 & 0x1F;
			local46 = Integer.MAX_VALUE & (int) (local21 >>> 32);
			local50 = Static6.method99(local46);
			if (local50.anInt5516 == -1) {
				local56 = arg0;
				local58 = Static270.anIntArray561;
				local75 = arg4 * 4 + (52736 - arg3 * 512) * 4 + 24624;
				if (local21 > 0L) {
					local56 = arg2;
				}
				if (local39 == 0 || local39 == 2) {
					if (local32 == 0) {
						local58[local75] = local56;
						local58[local75 + 512] = local56;
						local58[local75 + 1024] = local56;
						local58[local75 + 1536] = local56;
					} else if (local32 == 1) {
						local58[local75] = local56;
						local58[local75 + 1] = local56;
						local58[local75 + 2] = local56;
						local58[local75 + 3] = local56;
					} else if (local32 == 2) {
						local58[local75 + 3] = local56;
						local58[local75 + 512 + 3] = local56;
						local58[local75 + 1024 + 3] = local56;
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 3) {
						local58[local75 + 1536] = local56;
						local58[local75 + 1536 + 1] = local56;
						local58[local75 + 2 + 1536] = local56;
						local58[local75 + 1536 + 3] = local56;
					}
				}
				if (local39 == 3) {
					if (local32 == 0) {
						local58[local75] = local56;
					} else if (local32 == 1) {
						local58[local75 + 3] = local56;
					} else if (local32 == 2) {
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 3) {
						local58[local75 + 1536] = local56;
					}
				}
				if (local39 == 2) {
					if (local32 == 3) {
						local58[local75] = local56;
						local58[local75 + 512] = local56;
						local58[local75 + 1024] = local56;
						local58[local75 + 1536] = local56;
					} else if (local32 == 0) {
						local58[local75] = local56;
						local58[local75 + 1] = local56;
						local58[local75 + 2] = local56;
						local58[local75 + 3] = local56;
					} else if (local32 == 1) {
						local58[local75 + 3] = local56;
						local58[local75 + 512 + 3] = local56;
						local58[local75 + 1024 + 3] = local56;
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 2) {
						local58[local75 + 1536] = local56;
						local58[local75 + 1536 + 1] = local56;
						local58[local75 + 2 + 1536] = local56;
						local58[local75 + 1539] = local56;
					}
				}
			} else if (!Static266.method4192(arg3, local50, arg4, local32)) {
				return false;
			}
		}
		local21 = Static128.method1961(arg1, arg4 + 0, arg3);
		if (local21 != 0L) {
			local32 = (int) local21 >> 20 & 0x3;
			local46 = Integer.MAX_VALUE & (int) (local21 >>> 32);
			local39 = (int) local21 >> 14 & 0x1F;
			local50 = Static6.method99(local46);
			if (local50.anInt5516 == -1) {
				if (local39 == 9) {
					local56 = 15658734;
					local58 = Static270.anIntArray561;
					if (local21 > 0L) {
						local56 = 15597568;
					}
					local75 = arg4 * 4 + (52736 - arg3 * 512) * 4 + 24624;
					if (local32 == 0 || local32 == 2) {
						local58[local75 + 1536] = local56;
						local58[local75 + 1024 + 1] = local56;
						local58[local75 + 512 + 2] = local56;
						local58[local75 + 3] = local56;
					} else {
						local58[local75] = local56;
						local58[local75 + 1 + 512] = local56;
						local58[local75 + 1024 + 2] = local56;
						local58[local75 + 3 + 1536] = local56;
					}
				}
			} else if (!Static266.method4192(arg3, local50, arg4, local32)) {
				return false;
			}
		}
		local21 = Static150.method2421(arg1, arg4 + 0, arg3);
		if (local21 != 0L) {
			local39 = (int) (local21 >>> 32) & Integer.MAX_VALUE;
			local32 = (int) local21 >> 20 & 0x3;
			@Pc(596) Class184 local596 = Static6.method99(local39);
			if (local596.anInt5516 != -1 && !Static266.method4192(arg3, local596, arg4, local32)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public static void method4819(@OriginalArg(0) int arg0) {
		Static4.anInt80 = 1000 / arg0;
	}
}
