import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!vh;")
	public static Class177 aClass177_3;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!lg;IIIZ)V")
	public static void method1884(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) int local4 = arg0.anInt3201;
		@Pc(7) int local7 = arg0.anInt3190;
		if (arg0.aByte7 == 0) {
			arg0.anInt3201 = arg0.anInt3147;
		} else if (arg0.aByte7 == 1) {
			arg0.anInt3201 = arg2 - arg0.anInt3147;
		} else if (arg0.aByte7 == 2) {
			arg0.anInt3201 = arg2 * arg0.anInt3147 >> 14;
		} else if (arg0.aByte7 == 3) {
			if (arg0.anInt3177 == 2) {
				arg0.anInt3201 = arg0.anInt3147 * 32 + arg0.anInt3112 * (arg0.anInt3147 - 1);
			} else if (arg0.anInt3177 == 7) {
				arg0.anInt3201 = arg0.anInt3147 * 115 + arg0.anInt3112 * (arg0.anInt3147 - 1);
			}
		}
		if (arg0.aByte8 == 0) {
			arg0.anInt3190 = arg0.anInt3151;
		} else if (arg0.aByte8 == 1) {
			arg0.anInt3190 = arg1 - arg0.anInt3151;
		} else if (arg0.aByte8 == 2) {
			arg0.anInt3190 = arg0.anInt3151 * arg1 >> 14;
		} else if (arg0.aByte8 == 3) {
			if (arg0.anInt3177 == 2) {
				arg0.anInt3190 = (arg0.anInt3151 - 1) * arg0.anInt3206 + arg0.anInt3151 * 32;
			} else if (arg0.anInt3177 == 7) {
				arg0.anInt3190 = (arg0.anInt3151 - 1) * arg0.anInt3206 + arg0.anInt3151 * 12;
			}
		}
		if (arg0.aByte7 == 4) {
			arg0.anInt3201 = arg0.anInt3190 * arg0.anInt3203 / arg0.anInt3115;
		}
		if (arg0.aByte8 == 4) {
			arg0.anInt3190 = arg0.anInt3201 * arg0.anInt3115 / arg0.anInt3203;
		}
		if (Static14.aBoolean26 && (Static41.method791(arg0).anInt3271 != 0 || arg0.anInt3177 == 0)) {
			if (arg0.anInt3190 < 5 && arg0.anInt3201 < 5) {
				arg0.anInt3201 = 5;
				arg0.anInt3190 = 5;
			} else {
				if (arg0.anInt3201 <= 0) {
					arg0.anInt3201 = 5;
				}
				if (arg0.anInt3190 <= 0) {
					arg0.anInt3190 = 5;
				}
			}
		}
		if (arg0.anInt3123 == 1337) {
			Static304.aClass97_23 = arg0;
		}
		if (arg3 && arg0.anObjectArray11 != null && (arg0.anInt3201 != local4 || arg0.anInt3190 != local7)) {
			@Pc(283) Class4_Sub23 local283 = new Class4_Sub23();
			local283.aClass97_15 = arg0;
			local283.anObjectArray32 = arg0.anObjectArray11;
			Static56.aClass17_6.method619(local283);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIII)V")
	public static void method1885(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static200.aLong143 = 0L;
		@Pc(8) int local8 = Static284.method4440();
		if (arg1 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (Static300.aString195.startsWith("mac") && arg1 > 0) {
			arg0 = true;
		}
		@Pc(34) boolean local34 = false;
		if (local8 > 0 != arg1 > 0) {
			local34 = true;
		}
		if (arg0 && arg1 > 0) {
			local34 = true;
		}
		Static296.method4590(arg1, arg0, arg3, arg2, local8, local34);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method1887() {
		if (Static64.aFloat35 < Static5.aFloat4) {
			Static64.aFloat35 = (float) ((double) Static64.aFloat35 + (double) Static64.aFloat35 / 30.0D);
			if (Static64.aFloat35 > Static5.aFloat4) {
				Static64.aFloat35 = Static5.aFloat4;
			}
			Static72.method1221();
		} else if (Static64.aFloat35 > Static5.aFloat4) {
			Static64.aFloat35 = (float) ((double) Static64.aFloat35 - (double) Static64.aFloat35 / 30.0D);
			if (Static5.aFloat4 > Static64.aFloat35) {
				Static64.aFloat35 = Static5.aFloat4;
			}
			Static72.method1221();
		}
		if (Static165.anInt3317 == -1 || Static230.anInt4619 == -1) {
			return;
		}
		@Pc(57) int local57 = Static165.anInt3317 - Static208.anInt4072;
		if (local57 < 2 || local57 > 2) {
			local57 >>= 0x4;
		}
		@Pc(75) int local75 = Static230.anInt4619 - Static104.anInt2092;
		Static208.anInt4072 += local57;
		if (local75 < 2 || local75 > 2) {
			local75 >>= 0x4;
		}
		if (local57 == 0 && local75 == 0) {
			Static165.anInt3317 = -1;
			Static230.anInt4619 = -1;
		}
		Static104.anInt2092 += local75;
		Static72.method1221();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		@Pc(15) long local15 = Static108.method1836(arg2, arg3 + 0, arg0);
		@Pc(29) int local29;
		@Pc(36) int local36;
		@Pc(43) int local43;
		@Pc(47) Class73 local47;
		@Pc(70) int local70;
		@Pc(68) int[] local68;
		@Pc(66) int local66;
		if (local15 != 0L) {
			local29 = (int) local15 >> 20 & 0x3;
			local36 = (int) local15 >> 14 & 0x1F;
			local43 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local47 = Static296.method4591(local43);
			if (local47.anInt2245 == -1) {
				local66 = (52736 - arg0 * 512) * 4 + arg3 * 4 + 24624;
				local68 = Static258.anIntArray399;
				local70 = arg4;
				if (local15 > 0L) {
					local70 = arg1;
				}
				if (local36 == 0 || local36 == 2) {
					if (local29 == 0) {
						local68[local66] = local70;
						local68[local66 + 512] = local70;
						local68[local66 + 1024] = local70;
						local68[local66 + 1536] = local70;
					} else if (local29 == 1) {
						local68[local66] = local70;
						local68[local66 + 1] = local70;
						local68[local66 + 2] = local70;
						local68[local66 + 3] = local70;
					} else if (local29 == 2) {
						local68[local66 + 3] = local70;
						local68[local66 + 515] = local70;
						local68[local66 + 1024 + 3] = local70;
						local68[local66 + 1536 + 3] = local70;
					} else if (local29 == 3) {
						local68[local66 + 1536] = local70;
						local68[local66 + 1 + 1536] = local70;
						local68[local66 + 2 + 1536] = local70;
						local68[local66 + 1539] = local70;
					}
				}
				if (local36 == 3) {
					if (local29 == 0) {
						local68[local66] = local70;
					} else if (local29 == 1) {
						local68[local66 + 3] = local70;
					} else if (local29 == 2) {
						local68[local66 + 3 + 1536] = local70;
					} else if (local29 == 3) {
						local68[local66 + 1536] = local70;
					}
				}
				if (local36 == 2) {
					if (local29 == 3) {
						local68[local66] = local70;
						local68[local66 + 512] = local70;
						local68[local66 + 1024] = local70;
						local68[local66 + 1536] = local70;
					} else if (local29 == 0) {
						local68[local66] = local70;
						local68[local66 + 1] = local70;
						local68[local66 + 2] = local70;
						local68[local66 + 3] = local70;
					} else if (local29 == 1) {
						local68[local66 + 3] = local70;
						local68[local66 + 3 + 512] = local70;
						local68[local66 + 3 + 1024] = local70;
						local68[local66 + 1536 + 3] = local70;
					} else if (local29 == 2) {
						local68[local66 + 1536] = local70;
						local68[local66 + 1536 + 1] = local70;
						local68[local66 + 1538] = local70;
						local68[local66 + 1536 + 3] = local70;
					}
				}
			} else if (!Static121.method2008(local29, arg0, arg3, local47)) {
				return false;
			}
		}
		local15 = Static4.method65(arg2, arg3 + 0, arg0);
		if (local15 != 0L) {
			local29 = (int) local15 >> 20 & 0x3;
			local43 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local47 = Static296.method4591(local43);
			local36 = (int) local15 >> 14 & 0x1F;
			if (local47.anInt2245 == -1) {
				if (local36 == 9) {
					local70 = 15658734;
					if (local15 > 0L) {
						local70 = 15597568;
					}
					local68 = Static258.anIntArray399;
					local66 = arg3 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
					if (local29 == 0 || local29 == 2) {
						local68[local66 + 1536] = local70;
						local68[local66 + 1 + 1024] = local70;
						local68[local66 + 512 + 2] = local70;
						local68[local66 + 3] = local70;
					} else {
						local68[local66] = local70;
						local68[local66 + 1 + 512] = local70;
						local68[local66 + 1024 + 2] = local70;
						local68[local66 + 1536 + 3] = local70;
					}
				}
			} else if (!Static121.method2008(local29, arg0, arg3, local47)) {
				return false;
			}
		}
		local15 = Static32.method638(arg2, arg3 + 0, arg0);
		if (local15 != 0L) {
			local29 = (int) local15 >> 20 & 0x3;
			local36 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(597) Class73 local597 = Static296.method4591(local36);
			if (local597.anInt2245 != -1 && !Static121.method2008(local29, arg0, arg3, local597)) {
				return false;
			}
		}
		return true;
	}
}
