import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		@Pc(14) long local14 = Static11.method222(arg1, arg0 + 0, arg4);
		@Pc(40) int local40;
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(46) Class31 local46;
		@Pc(66) int local66;
		@Pc(89) int[] local89;
		@Pc(87) int local87;
		if (local14 != (long) 0) {
			local26 = (int) local14 >> 14 & 0x1F;
			local33 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local40 = (int) local14 >> 20 & 0x3;
			local46 = Static77.method1518(local33);
			if (local46.anInt1310 == -1) {
				local66 = arg2;
				if (local14 > 0L) {
					local66 = arg3;
				}
				local87 = (52736 - arg4 * 512) * 4 + arg0 * 4 + 24624;
				local89 = Static189.anIntArray319;
				if (local26 == 0 || local26 == 2) {
					if (local40 == 0) {
						local89[local87] = local66;
						local89[local87 + 512] = local66;
						local89[local87 + 1024] = local66;
						local89[local87 + 1536] = local66;
					} else if (local40 == 1) {
						local89[local87] = local66;
						local89[local87 + 1] = local66;
						local89[local87 + 2] = local66;
						local89[local87 + 3] = local66;
					} else if (local40 == 2) {
						local89[local87 + 3] = local66;
						local89[local87 + 512 + 3] = local66;
						local89[local87 + 1024 + 3] = local66;
						local89[local87 + 3 + 1536] = local66;
					} else if (local40 == 3) {
						local89[local87 + 1536] = local66;
						local89[local87 + 1537] = local66;
						local89[local87 + 1536 + 2] = local66;
						local89[local87 + 1536 + 3] = local66;
					}
				}
				if (local26 == 3) {
					if (local40 == 0) {
						local89[local87] = local66;
					} else if (local40 == 1) {
						local89[local87 + 3] = local66;
					} else if (local40 == 2) {
						local89[local87 + 3 + 1536] = local66;
					} else if (local40 == 3) {
						local89[local87 + 1536] = local66;
					}
				}
				if (local26 == 2) {
					if (local40 == 3) {
						local89[local87] = local66;
						local89[local87 + 512] = local66;
						local89[local87 + 1024] = local66;
						local89[local87 + 1536] = local66;
					} else if (local40 == 0) {
						local89[local87] = local66;
						local89[local87 + 1] = local66;
						local89[local87 + 2] = local66;
						local89[local87 + 3] = local66;
					} else if (local40 == 1) {
						local89[local87 + 3] = local66;
						local89[local87 + 512 + 3] = local66;
						local89[local87 + 1024 + 3] = local66;
						local89[local87 + 1536 + 3] = local66;
					} else if (local40 == 2) {
						local89[local87 + 1536] = local66;
						local89[local87 + 1536 + 1] = local66;
						local89[local87 + 1538] = local66;
						local89[local87 + 1536 + 3] = local66;
					}
				}
			} else if (!Static148.method217(arg4, local46, local40, arg0)) {
				return false;
			}
		}
		local14 = Static60.method1145(arg1, arg0 + 0, arg4);
		if (local14 != 0L) {
			local26 = (int) local14 >> 14 & 0x1F;
			local40 = (int) local14 >> 20 & 0x3;
			local33 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local46 = Static77.method1518(local33);
			if (local46.anInt1310 == -1) {
				if (local26 == 9) {
					local66 = 15658734;
					local87 = arg0 * 4 + (-arg4 + 103) * 4 * 512 + 24624;
					if (local14 > 0L) {
						local66 = 15597568;
					}
					local89 = Static189.anIntArray319;
					if (local40 == 0 || local40 == 2) {
						local89[local87 + 1536] = local66;
						local89[local87 + 1024 + 1] = local66;
						local89[local87 + 2 + 512] = local66;
						local89[local87 + 3] = local66;
					} else {
						local89[local87] = local66;
						local89[local87 + 1 + 512] = local66;
						local89[local87 + 2 + 1024] = local66;
						local89[local87 + 3 + 1536] = local66;
					}
				}
			} else if (!Static148.method217(arg4, local46, local40, arg0)) {
				return false;
			}
		}
		local14 = Static201.method3337(arg1, arg0 + 0, arg4);
		if (local14 != 0L) {
			local26 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			@Pc(570) Class31 local570 = Static77.method1518(local26);
			local40 = (int) local14 >> 20 & 0x3;
			if (local570.anInt1310 != -1 && !Static148.method217(arg4, local570, local40, arg0)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
	public static int method1141(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (arg0 * local15 >> 12) + 40960;
		return local23 * local9 >> 12;
	}
}
