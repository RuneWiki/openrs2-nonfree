import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!o;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "Lclient!kf;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_64 = Static181.method2795(" ");

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "[S")
	public static final short[] aShortArray3 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_65 = Static181.method2795("Hier wechseln");

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_66 = Static181.method2795(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!eh;I)Z")
	public static boolean method222(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method853(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static207.method3117(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg3) {
			Static171.method2655(arg4, arg2, arg3, arg0, arg5, arg1);
		} else if (Static209.anInt4155 <= arg0 - arg3 && arg0 + arg3 <= Static36.anInt940 && arg2 - arg6 >= Static147.anInt4074 && arg6 + arg2 <= Static61.anInt1501) {
			Static12.method300(arg6, arg4, arg2, arg3, arg0, arg1, arg5);
		} else {
			Static47.method942(arg3, arg6, arg5, arg1, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
	public static void method252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static213.method3230(arg3, arg1, arg0);
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(23) int local23;
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (local10 != 0L) {
			local21 = (int) local10 >> 20 & 0x3;
			local23 = arg2;
			@Pc(25) int[] local25 = Static126.anIntArray279;
			local32 = (int) local10 >> 14 & 0x1F;
			if (local10 > 0L) {
				local23 = arg4;
			}
			local54 = arg1 * 4 + (103 - arg0) * 4 * 512 + 24624;
			local61 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(65) Class2_Sub2_Sub20 local65 = Static99.method1689(local61);
			if (local65.anInt2657 == -1) {
				if (local32 == 0 || local32 == 2) {
					if (local21 == 0) {
						local25[local54] = local23;
						local25[local54 + 512] = local23;
						local25[local54 + 1024] = local23;
						local25[local54 + 1536] = local23;
					} else if (local21 == 1) {
						local25[local54] = local23;
						local25[local54 + 1] = local23;
						local25[local54 + 2] = local23;
						local25[local54 + 3] = local23;
					} else if (local21 == 2) {
						local25[local54 + 3] = local23;
						local25[local54 + 3 + 512] = local23;
						local25[local54 + 1024 + 3] = local23;
						local25[local54 + 1536 + 3] = local23;
					} else if (local21 == 3) {
						local25[local54 + 1536] = local23;
						local25[local54 + 1536 + 1] = local23;
						local25[local54 + 2 + 1536] = local23;
						local25[local54 + 3 + 1536] = local23;
					}
				}
				if (local32 == 3) {
					if (local21 == 0) {
						local25[local54] = local23;
					} else if (local21 == 1) {
						local25[local54 + 3] = local23;
					} else if (local21 == 2) {
						local25[local54 + 3 + 1536] = local23;
					} else if (local21 == 3) {
						local25[local54 + 1536] = local23;
					}
				}
				if (local32 == 2) {
					if (local21 == 3) {
						local25[local54] = local23;
						local25[local54 + 512] = local23;
						local25[local54 + 1024] = local23;
						local25[local54 + 1536] = local23;
					} else if (local21 == 0) {
						local25[local54] = local23;
						local25[local54 + 1] = local23;
						local25[local54 + 2] = local23;
						local25[local54 + 3] = local23;
					} else if (local21 == 1) {
						local25[local54 + 3] = local23;
						local25[local54 + 3 + 512] = local23;
						local25[local54 + 1024 + 3] = local23;
						local25[local54 + 1539] = local23;
					} else if (local21 == 2) {
						local25[local54 + 1536] = local23;
						local25[local54 + 1536 + 1] = local23;
						local25[local54 + 1536 + 2] = local23;
						local25[local54 + 3 + 1536] = local23;
					}
				}
			} else {
				@Pc(390) Class29_Sub1 local390 = Static87.aClass29_Sub1Array1[local65.anInt2657];
				if (local390 != null) {
					@Pc(402) int local402 = (local65.anInt2665 * 4 - local390.anInt1517) / 2;
					@Pc(413) int local413 = (local65.anInt2670 * 4 - local390.anInt1518) / 2;
					local390.method1184(local413 + arg1 * 4 + 48, (-local65.anInt2665 + (104 - arg0)) * 4 + 48 - -local402);
				}
			}
		}
		local10 = Static175.method2694(arg3, arg1, arg0);
		if (local10 != 0L) {
			local32 = (int) local10 >> 14 & 0x1F;
			local23 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(466) Class2_Sub2_Sub20 local466 = Static99.method1689(local23);
			local21 = (int) local10 >> 20 & 0x3;
			@Pc(493) int local493;
			if (local466.anInt2657 != -1) {
				@Pc(573) Class29_Sub1 local573 = Static87.aClass29_Sub1Array1[local466.anInt2657];
				if (local573 != null) {
					local493 = (local466.anInt2665 * 4 - local573.anInt1517) / 2;
					local61 = (local466.anInt2670 * 4 - local573.anInt1518) / 2;
					local573.method1184(arg1 * 4 + local61 + 48, local493 + (48 - -((-arg0 + (104 - local466.anInt2665)) * 4)));
				}
			} else if (local32 == 9) {
				local493 = (103 - arg0) * 2048 + arg1 * 4 + 24624;
				local54 = 15658734;
				@Pc(497) int[] local497 = Static126.anIntArray279;
				if (local10 > 0L) {
					local54 = 15597568;
				}
				if (local21 == 0 || local21 == 2) {
					local497[local493 + 1536] = local54;
					local497[local493 + 1025] = local54;
					local497[local493 + 512 + 2] = local54;
					local497[local493 + 3] = local54;
				} else {
					local497[local493] = local54;
					local497[local493 + 512 + 1] = local54;
					local497[local493 + 2 + 1024] = local54;
					local497[local493 + 1539] = local54;
				}
			}
		}
		local10 = Static93.method1604(arg3, arg1, arg0);
		if (local10 == 0L) {
			return;
		}
		local21 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(647) Class2_Sub2_Sub20 local647 = Static99.method1689(local21);
		if (local647.anInt2657 == -1) {
			return;
		}
		@Pc(656) Class29_Sub1 local656 = Static87.aClass29_Sub1Array1[local647.anInt2657];
		if (local656 != null) {
			@Pc(669) int local669 = (local647.anInt2670 * 4 - local656.anInt1518) / 2;
			local54 = (local647.anInt2665 * 4 - local656.anInt1517) / 2;
			local656.method1184(local669 + arg1 * 4 + 48, local54 + 48 - -((-arg0 + (104 - local647.anInt2665)) * 4));
			return;
		}
	}
}
