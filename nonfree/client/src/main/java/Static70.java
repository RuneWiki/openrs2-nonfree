import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 aClass1_Sub2_Sub8_Sub1_Sub1_6;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public static int anInt3207;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_946 = Static81.method1507("Sorry invited players only)3");

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_945 = aClass24_946;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public static int anInt3206 = 0;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt3208 = -1;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public static int anInt3210 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!vc;IIBII)V")
	public static void method2484(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg5 * arg5 + arg3 * arg3;
		if (local12 > 360000) {
			return;
		}
		@Pc(29) int local29 = Math.min(arg1.anInt4400 / 2, arg1.anInt4403 / 2);
		if (local29 * local29 >= local12) {
			Static102.method1758(arg0, Static135.aClass1_Sub2_Sub8_Sub3Array17[arg2], arg3, arg1, arg4, arg5);
			return;
		}
		local29 -= 10;
		@Pc(45) int local45 = Static115.anInt2586 + Static66.anInt1655 & 0x7FF;
		@Pc(49) int local49 = Class1_Sub2_Sub8_Sub4.anIntArray355[local45];
		@Pc(53) int local53 = Class1_Sub2_Sub8_Sub4.anIntArray350[local45];
		@Pc(61) int local61 = local49 * 256 / (Static192.anInt4308 + 256);
		@Pc(69) int local69 = local53 * 256 / (Static192.anInt4308 + 256);
		@Pc(80) int local80 = arg3 * local61 - arg5 * local69 >> 16;
		@Pc(90) int local90 = arg5 * local61 + local69 * arg3 >> 16;
		@Pc(96) double local96 = Math.atan2((double) local90, (double) local80);
		@Pc(103) int local103 = (int) ((double) local29 * Math.sin(local96));
		@Pc(110) int local110 = (int) (Math.cos(local96) * (double) local29);
		Static52.aClass1_Sub2_Sub8_Sub3Array10[arg2].method2350(arg1.anInt4400 / 2 + arg0 + local103 - 10, -local110 + arg4 + arg1.anInt4403 / 2 + -10, local96);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	public static void method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) long local6 = Static195.method3315(arg2, arg4, arg0);
		@Pc(24) int local24;
		@Pc(17) int local17;
		@Pc(48) int local48;
		@Pc(46) int local46;
		@Pc(31) int local31;
		if (local6 != 0L) {
			local17 = (int) local6 >> 14 & 0x1F;
			local24 = (int) local6 >> 20 & 0x3;
			local31 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
			local46 = (52736 - arg0 * 512) * 4 + arg4 * 4 + 24624;
			local48 = arg3;
			if (local6 > 0L) {
				local48 = arg1;
			}
			@Pc(57) int[] local57 = Static169.aClass1_Sub2_Sub8_Sub3_3.anIntArray246;
			@Pc(61) Class1_Sub2_Sub5 local61 = Static37.method702(local31);
			if (local61.anInt950 == -1) {
				if (local17 == 0 || local17 == 2) {
					if (local24 == 0) {
						local57[local46] = local48;
						local57[local46 + 512] = local48;
						local57[local46 + 1024] = local48;
						local57[local46 + 1536] = local48;
					} else if (local24 == 1) {
						local57[local46] = local48;
						local57[local46 + 1] = local48;
						local57[local46 + 2] = local48;
						local57[local46 + 3] = local48;
					} else if (local24 == 2) {
						local57[local46 + 3] = local48;
						local57[local46 + 515] = local48;
						local57[local46 + 1027] = local48;
						local57[local46 + 1536 + 3] = local48;
					} else if (local24 == 3) {
						local57[local46 + 1536] = local48;
						local57[local46 + 1536 + 1] = local48;
						local57[local46 + 2 + 1536] = local48;
						local57[local46 + 1536 + 3] = local48;
					}
				}
				if (local17 == 3) {
					if (local24 == 0) {
						local57[local46] = local48;
					} else if (local24 == 1) {
						local57[local46 + 3] = local48;
					} else if (local24 == 2) {
						local57[local46 + 3 + 1536] = local48;
					} else if (local24 == 3) {
						local57[local46 + 1536] = local48;
					}
				}
				if (local17 == 2) {
					if (local24 == 3) {
						local57[local46] = local48;
						local57[local46 + 512] = local48;
						local57[local46 + 1024] = local48;
						local57[local46 + 1536] = local48;
					} else if (local24 == 0) {
						local57[local46] = local48;
						local57[local46 + 1] = local48;
						local57[local46 + 2] = local48;
						local57[local46 + 3] = local48;
					} else if (local24 == 1) {
						local57[local46 + 3] = local48;
						local57[local46 + 3 + 512] = local48;
						local57[local46 + 1024 + 3] = local48;
						local57[local46 + 1539] = local48;
					} else if (local24 == 2) {
						local57[local46 + 1536] = local48;
						local57[local46 + 1536 + 1] = local48;
						local57[local46 + 2 + 1536] = local48;
						local57[local46 + 3 + 1536] = local48;
					}
				}
			} else {
				@Pc(376) Class1_Sub2_Sub8_Sub2 local376 = Static186.aClass1_Sub2_Sub8_Sub2Array2[local61.anInt950];
				if (local376 != null) {
					@Pc(389) int local389 = (local61.anInt976 * 4 - local376.anInt2563) / 2;
					@Pc(400) int local400 = (local61.anInt958 * 4 - local376.anInt2562) / 2;
					local376.method1960(arg4 * 4 + local389 + 48, (-local61.anInt958 + 104 + -arg0) * 4 + 48 + local400);
				}
			}
		}
		local6 = Static78.method1463(arg2, arg4, arg0);
		if (local6 != 0L) {
			local17 = (int) local6 >> 14 & 0x1F;
			local48 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
			local24 = (int) local6 >> 20 & 0x3;
			@Pc(458) Class1_Sub2_Sub5 local458 = Static37.method702(local48);
			@Pc(483) int local483;
			if (local458.anInt950 != -1) {
				@Pc(565) Class1_Sub2_Sub8_Sub2 local565 = Static186.aClass1_Sub2_Sub8_Sub2Array2[local458.anInt950];
				if (local565 != null) {
					local483 = (local458.anInt958 * 4 - local565.anInt2562) / 2;
					local31 = (local458.anInt976 * 4 - local565.anInt2563) / 2;
					local565.method1960(local31 + arg4 * 4 + 48, local483 + 48 + (-arg0 + (104 - local458.anInt958)) * 4);
				}
			} else if (local17 == 9) {
				local483 = arg4 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
				local46 = 15658734;
				@Pc(488) int[] local488 = Static169.aClass1_Sub2_Sub8_Sub3_3.anIntArray246;
				if (local6 > 0L) {
					local46 = 15597568;
				}
				if (local24 == 0 || local24 == 2) {
					local488[local483 + 1536] = local46;
					local488[local483 + 1025] = local46;
					local488[local483 + 514] = local46;
					local488[local483 + 3] = local46;
				} else {
					local488[local483] = local46;
					local488[local483 + 1 + 512] = local46;
					local488[local483 + 2 + 1024] = local46;
					local488[local483 + 1536 + 3] = local46;
				}
			}
		}
		local6 = Static212.method3586(arg2, arg4, arg0);
		if (local6 == 0L) {
			return;
		}
		local17 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
		@Pc(642) Class1_Sub2_Sub5 local642 = Static37.method702(local17);
		if (local642.anInt950 == -1) {
			return;
		}
		@Pc(651) Class1_Sub2_Sub8_Sub2 local651 = Static186.aClass1_Sub2_Sub8_Sub2Array2[local642.anInt950];
		if (local651 != null) {
			local46 = (local642.anInt976 * 4 - local651.anInt2563) / 2;
			local31 = (local642.anInt958 * 4 - local651.anInt2562) / 2;
			local651.method1960(arg4 * 4 + local46 + 48, local31 + 48 - -((-arg0 + 104 + -local642.anInt958) * 4));
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass19_1 != null && local7.aClass19_1.aLong26 == arg3) {
			return true;
		} else if (local7.aClass49_1 != null && local7.aClass49_1.aLong62 == arg3) {
			return true;
		} else if (local7.aClass96_1 != null && local7.aClass96_1.aLong137 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1550; local46++) {
				if (local7.aClass51Array1[local46].aLong68 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
