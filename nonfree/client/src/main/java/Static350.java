import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_82 = new Class84(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
	public static final int[] anIntArray477 = new int[32];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 == arg4 && arg0 == arg7 && arg2 == arg5 && arg3 == arg6) {
			Static358.method4933(arg7, arg8, arg6, arg5, arg1);
			return;
		}
		@Pc(35) int local35 = arg8;
		@Pc(37) int local37 = arg7;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(72) int local72 = arg5 + local49 - arg8 - local57;
		@Pc(82) int local82 = local53 + arg6 - local61 - arg7;
		@Pc(93) int local93 = local57 + local41 - local49 - local49;
		@Pc(101) int local101 = local45 + local61 - local53 - local53;
		@Pc(106) int local106 = local49 - local41;
		@Pc(111) int local111 = local53 - local45;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local72 * local127;
			@Pc(135) int local135 = local82 * local127;
			@Pc(139) int local139 = local93 * local121;
			@Pc(143) int local143 = local121 * local101;
			@Pc(147) int local147 = local106 * local113;
			@Pc(151) int local151 = local111 * local113;
			@Pc(162) int local162 = arg8 + (local131 + local139 + local147 >> 12);
			@Pc(173) int local173 = arg7 + (local135 + local143 + local151 >> 12);
			Static358.method4933(local37, local35, local173, local162, arg1);
			local37 = local173;
			local35 = local162;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZIIZ)I")
	public static int method4845(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class1_Sub45 local10 = Static193.method906(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray680.length; local23++) {
			if (local10.anIntArray680[local23] >= 0 && local10.anIntArray680[local23] < Static196.aClass139_1.anInt3869) {
				@Pc(52) Class268 local52 = Static196.aClass139_1.method3228(local10.anIntArray680[local23]);
				@Pc(62) int local62 = local52.method6032(arg0, Static228.aClass243_2.method5551(arg0).anInt7437);
				if (arg2) {
					local16 += local62 * local10.anIntArray681[local23];
				} else {
					local16 += local62;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!a;B)V")
	public static void method4846(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		arg0.method144();
		@Pc(10) int local10 = Static453.anInt7845;
		@Pc(20) Class26_Sub2_Sub2_Sub1 local20 = Static196.aClass26_Sub2_Sub2_Sub1_1 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local10] = new Class26_Sub2_Sub2_Sub1();
		local20.anInt7097 = local10;
		@Pc(36) int local36 = arg0.method146(30);
		@Pc(41) byte local41 = (byte) (local36 >> 28);
		@Pc(47) int local47 = local36 >> 14 & 0x3FFF;
		local20.anIntArray590[0] = local47 - Static437.anInt7555;
		@Pc(59) int local59 = local36 & 0x3FFF;
		local20.anInt7068 = (local20.anIntArray590[0] << 7) + (local20.method5535() << 6);
		local20.anIntArray589[0] = local59 - Static134.anInt5502;
		local20.anInt7065 = (local20.anIntArray589[0] << 7) + (local20.method5535() << 6);
		Static152.anInt2600 = local20.aByte95 = local41;
		if (Static154.aClass1_Sub1Array1[local10] != null) {
			local20.method5262(Static154.aClass1_Sub1Array1[local10]);
		}
		Static187.anInt4913 = 0;
		Static256.anIntArray370[Static187.anInt4913++] = local10;
		Static291.aByteArray67[local10] = 0;
		Static288.anInt5040 = 0;
		for (@Pc(130) int local130 = 1; local130 < 2048; local130++) {
			if (local130 != local10) {
				@Pc(140) int local140 = arg0.method146(18);
				@Pc(144) int local144 = local140 >> 16;
				@Pc(150) int local150 = local140 >> 8 & 0xFF;
				@Pc(154) int local154 = local140 & 0xFF;
				@Pc(162) Class174 local162 = Static455.aClass174Array3[local130] = new Class174();
				local162.anInt4948 = 0;
				local162.anInt4949 = -1;
				local162.aBoolean330 = false;
				local162.anInt4946 = local154 + (local144 << 28) + (local150 << 14);
				Static122.anIntArray196[Static288.anInt5040++] = local130;
				Static291.aByteArray67[local130] = 0;
			}
		}
		arg0.method148();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZLclient!uo;)V")
	public static void method4847(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class26_Sub2_Sub2_Sub2 arg1) {
		if (Static82.anInt1627 >= 400) {
			return;
		}
		@Pc(12) Class66 local12 = arg1.aClass66_1;
		if (local12.anIntArray152 != null) {
			local12 = local12.method1454(Static51.aClass79_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean88) {
			return;
		}
		@Pc(30) String local30 = local12.aString10;
		if (local12.anInt1710 != 0) {
			@Pc(46) String local46 = Static248.aClass145_2 == Static96.aClass145_1 ? Static132.aClass84_32.method1678(Static167.anInt3118) : Static440.aClass84_101.method1678(Static167.anInt3118);
			local30 = local30 + Static161.method2441(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652, local12.anInt1710) + " (" + local46 + local12.anInt1710 + ")";
		}
		if (!Static138.aBoolean128) {
			if (!arg0) {
				@Pc(76) String[] local76 = local12.aStringArray17;
				if (Static327.aBoolean372) {
					local76 = Static384.method5251(local76);
				}
				@Pc(86) int local86;
				if (local76 != null) {
					for (local86 = 4; local86 >= 0; local86--) {
						if (local76[local86] != null && (Static248.aClass145_2 != Static288.aClass145_3 || !local76[local86].equalsIgnoreCase(Static86.aClass84_22.method1678(Static167.anInt3118)))) {
							@Pc(106) byte local106 = 0;
							if (local86 == 0) {
								local106 = 16;
							}
							@Pc(115) int local115 = Static449.anInt7703;
							if (local86 == 1) {
								local106 = 46;
							}
							if (local86 == 2) {
								local106 = 2;
							}
							if (local86 == 3) {
								local106 = 22;
							}
							if (local86 == 4) {
								local106 = 15;
							}
							if (local86 == local12.anInt1691) {
								local115 = local12.anInt1692;
							}
							if (local86 == local12.anInt1684) {
								local115 = local12.anInt1711;
							}
							Static423.method5681(0, 0, (long) arg1.anInt7097, local106, local115, -1, false, "<col=ffff00>" + local30, local76[local86], true);
						}
					}
				}
				if (Static288.aClass145_3 == Static248.aClass145_2 && local76 != null) {
					for (local86 = 4; local86 >= 0; local86--) {
						if (local76[local86] != null && local76[local86].equalsIgnoreCase(Static86.aClass84_22.method1678(Static167.anInt3118))) {
							@Pc(210) short local210 = 0;
							if (local12.anInt1710 > Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652) {
								local210 = 2000;
							}
							@Pc(219) short local219 = 0;
							if (local86 == 0) {
								local219 = 16;
							}
							if (local86 == 1) {
								local219 = 46;
							}
							if (local86 == 2) {
								local219 = 2;
							}
							if (local86 == 3) {
								local219 = 22;
							}
							if (local86 == 4) {
								local219 = 15;
							}
							if (local219 != 0) {
								local219 += local210;
							}
							Static423.method5681(0, 0, (long) arg1.anInt7097, local219, local12.anInt1701, -1, false, "<col=ffff00>" + local30, local76[local86], true);
						}
					}
				}
			}
			Static423.method5681(0, 0, (long) arg1.anInt7097, 1012, Static425.anInt7378, -1, arg0, "<col=ffff00>" + local30, Static292.aClass84_63.method1678(Static167.anInt3118), true);
		} else if (!arg0) {
			@Pc(339) Class256 local339 = Static323.anInt5670 == -1 ? null : Static228.aClass243_2.method5551(Static323.anInt5670);
			if ((Static333.anInt5795 & 0x2) != 0 && (local339 == null || local12.method1451(Static323.anInt5670, local339.anInt7437) != local339.anInt7437)) {
				Static423.method5681(0, 0, (long) arg1.anInt7097, 25, Static370.anInt6307, -1, false, Static254.aString36 + " -> <col=ffff00>" + local30, Static233.aString33, true);
			}
		}
	}
}
