import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray30;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_198 = Static199.method3560(" GMT");

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!qe;")
	private static Class78 aClass78_199 = Static199.method3560("Loaded textures");

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_200 = aClass78_199;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!mj;IZ)Lclient!qe;")
	public static Class78 method771(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		if (!Static3.method78(Static36.method473(arg0), arg1) && arg0.anObjectArray16 == null) {
			return null;
		} else if (arg0.aClass78Array23 == null || arg1 >= arg0.aClass78Array23.length || arg0.aClass78Array23[arg1] == null || arg0.aClass78Array23[arg1].method3018().method3041() == 0) {
			return Static57.aBoolean21 ? Static94.method1640(new Class78[] { Static133.aClass78_595, Static19.method268(arg1) }) : null;
		} else {
			return arg0.aClass78Array23[arg1];
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
	public static int method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(28) int local28 = arg5;
			arg5 = arg0;
			arg0 = local28;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method774() {
		try {
			if (Static112.aClass47_1 == null) {
				Static112.aClass47_1 = new Class47(Static133.aClass41_2, Static94.method1640(new Class78[] { Static130.method2367(), Static215.aClass78_844 }).method3003());
			}
		} catch (@Pc(32) Exception local32) {
			local32.printStackTrace();
			Static112.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method775() {
		Static224.anIntArrayArrayArray14 = null;
		Static55.anIntArray154 = null;
		Static128.aByteArrayArrayArray8 = null;
		Static12.aByteArrayArrayArray1 = null;
		Static193.anIntArray712 = null;
		Static126.aByteArrayArrayArray7 = null;
		Static220.aByteArrayArrayArray15 = null;
		Static170.aByteArrayArrayArray13 = null;
		Static9.anIntArray33 = null;
		Static169.anIntArray647 = null;
		Static226.anIntArray794 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V")
	public static void method776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static105.method1814(arg2, arg0, arg4);
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(67) int local67;
		@Pc(54) int local54;
		if (local10 != 0L) {
			local28 = (int) local10 >> 20 & 0x3;
			local35 = (int) local10 >> 14 & 0x1F;
			local37 = arg1;
			if (local10 > 0L) {
				local37 = arg3;
			}
			@Pc(47) int[] local47 = Static217.anIntArray752;
			local54 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local67 = (103 - arg4) * 2048 + arg0 * 4 + 24624;
			@Pc(71) Class2_Sub3_Sub17 local71 = Static121.method3984(local54);
			if (local71.anInt2377 == -1) {
				if (local35 == 0 || local35 == 2) {
					if (local28 == 0) {
						local47[local67] = local37;
						local47[local67 + 512] = local37;
						local47[local67 + 1024] = local37;
						local47[local67 + 1536] = local37;
					} else if (local28 == 1) {
						local47[local67] = local37;
						local47[local67 + 1] = local37;
						local47[local67 + 2] = local37;
						local47[local67 + 3] = local37;
					} else if (local28 == 2) {
						local47[local67 + 3] = local37;
						local47[local67 + 3 + 512] = local37;
						local47[local67 + 1024 + 3] = local37;
						local47[local67 + 1536 + 3] = local37;
					} else if (local28 == 3) {
						local47[local67 + 1536] = local37;
						local47[local67 + 1536 + 1] = local37;
						local47[local67 + 2 + 1536] = local37;
						local47[local67 + 1536 + 3] = local37;
					}
				}
				if (local35 == 3) {
					if (local28 == 0) {
						local47[local67] = local37;
					} else if (local28 == 1) {
						local47[local67 + 3] = local37;
					} else if (local28 == 2) {
						local47[local67 + 3 + 1536] = local37;
					} else if (local28 == 3) {
						local47[local67 + 1536] = local37;
					}
				}
				if (local35 == 2) {
					if (local28 == 3) {
						local47[local67] = local37;
						local47[local67 + 512] = local37;
						local47[local67 + 1024] = local37;
						local47[local67 + 1536] = local37;
					} else if (local28 == 0) {
						local47[local67] = local37;
						local47[local67 + 1] = local37;
						local47[local67 + 2] = local37;
						local47[local67 + 3] = local37;
					} else if (local28 == 1) {
						local47[local67 + 3] = local37;
						local47[local67 + 512 + 3] = local37;
						local47[local67 + 1024 + 3] = local37;
						local47[local67 + 1536 + 3] = local37;
					} else if (local28 == 2) {
						local47[local67 + 1536] = local37;
						local47[local67 + 1536 + 1] = local37;
						local47[local67 + 2 + 1536] = local37;
						local47[local67 + 1536 + 3] = local37;
					}
				}
			} else {
				@Pc(81) Class79_Sub1 local81 = Static67.aClass79_Sub1Array3[local71.anInt2377];
				if (local81 != null) {
					@Pc(94) int local94 = (local71.anInt2394 * 4 - local81.anInt3900) / 2;
					@Pc(104) int local104 = (local71.anInt2387 * 4 - local81.anInt3901) / 2;
					local81.method3071(local94 + arg0 * 4 + 48, (-arg4 + 104 + -local71.anInt2387) * 4 + 48 + local104);
				}
			}
		}
		local10 = Static188.method3485(arg2, arg0, arg4);
		if (local10 != 0L) {
			local37 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			local35 = (int) local10 >> 14 & 0x1F;
			@Pc(462) Class2_Sub3_Sub17 local462 = Static121.method3984(local37);
			local28 = (int) local10 >> 20 & 0x3;
			@Pc(493) int local493;
			if (local462.anInt2377 != -1) {
				@Pc(576) Class79_Sub1 local576 = Static67.aClass79_Sub1Array3[local462.anInt2377];
				if (local576 != null) {
					local54 = (local462.anInt2394 * 4 - local576.anInt3900) / 2;
					local493 = (local462.anInt2387 * 4 - local576.anInt3901) / 2;
					local576.method3071(local54 + arg0 * 4 + 48, local493 + (48 - -((-local462.anInt2387 + -arg4 + 104) * 4)));
				}
			} else if (local35 == 9) {
				local493 = 4 * 512 * (103 - arg4) + arg0 * 4 + 24624;
				@Pc(495) int[] local495 = Static217.anIntArray752;
				local67 = 15658734;
				if (local10 > 0L) {
					local67 = 15597568;
				}
				if (local28 == 0 || local28 == 2) {
					local495[local493 + 1536] = local67;
					local495[local493 + 1024 + 1] = local67;
					local495[local493 + 2 + 512] = local67;
					local495[local493 + 3] = local67;
				} else {
					local495[local493] = local67;
					local495[local493 + 512 + 1] = local67;
					local495[local493 + 1024 + 2] = local67;
					local495[local493 + 1536 + 3] = local67;
				}
			}
		}
		local10 = Static144.method2568(arg2, arg0, arg4);
		if (local10 == 0L) {
			return;
		}
		local28 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(644) Class2_Sub3_Sub17 local644 = Static121.method3984(local28);
		if (local644.anInt2377 == -1) {
			return;
		}
		@Pc(653) Class79_Sub1 local653 = Static67.aClass79_Sub1Array3[local644.anInt2377];
		if (local653 != null) {
			@Pc(666) int local666 = (local644.anInt2394 * 4 - local653.anInt3900) / 2;
			local67 = (local644.anInt2387 * 4 - local653.anInt3901) / 2;
			local653.method3071(local666 + arg0 * 4 + 48, local67 + 48 + (-local644.anInt2387 + 104 + -arg4) * 4);
			return;
		}
	}
}
