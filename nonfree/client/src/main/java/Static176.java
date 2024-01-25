import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_21 = new Class126(8);

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
	public static void method2812() {
		if (Static226.anInt4225 == -1) {
			return;
		}
		@Pc(11) int local11 = Static290.aClass100_1.method3218();
		@Pc(15) int local15 = Static290.aClass100_1.method3213();
		@Pc(20) Class3_Sub23 local20 = (Class3_Sub23) Static79.aClass243_34.method5208();
		if (local20 != null) {
			local11 = local20.method3475();
			local15 = local20.method3474();
		}
		Static325.method4386(0, 0, 0, local11, Static123.anInt2625, Static226.anInt4225, 0, Static333.anInt5712, local15);
		if (Static443.aClass156_8 != null) {
			Static189.method3477(local11, local15);
		}
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)V")
	public static void method2814() {
		@Pc(5) int local5 = 0;
		if (Static374.aClass20_Sub1_1.method1805(Static105.anInt2382)) {
			local5 = 55;
		}
		if (!Static374.aClass20_Sub1_1.aBoolean193) {
			local5 |= 0x40;
		}
		Static298.method4486(local5);
		Static435.aClass30_4.method763(local5);
		Static314.aClass12_2.method325(local5);
		Static364.aClass96_2.method2198(local5);
		Static96.aClass41_2.method1135(local5);
		Static369.method4841(local5);
		Static43.method833(local5);
		Static124.method5964(local5);
		Static38.method760(local5);
		if (Static120.anInt2584 == 10) {
			Static230.method3465(28);
		} else if (Static120.anInt2584 == 30) {
			Static230.method3465(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
	public static void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static291.method4104(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(22) int local22 = arg5;
		@Pc(25) int local25 = -arg5;
		@Pc(27) int local27 = local15;
		@Pc(30) int local30 = -local15;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (arg4 >= Static341.anInt5789 && Static309.anInt5495 >= arg4) {
			@Pc(48) int[] local48 = Static262.anIntArrayArray31[arg4];
			local57 = Static108.method1849(Static452.anInt7626, arg3 - arg5, Static82.anInt3956);
			local66 = Static108.method1849(Static452.anInt7626, arg3 + arg5, Static82.anInt3956);
			local75 = Static108.method1849(Static452.anInt7626, arg3 - local15, Static82.anInt3956);
			local83 = Static108.method1849(Static452.anInt7626, local15 + arg3, Static82.anInt3956);
			Static412.method5293(local48, arg2, local57, local75);
			Static412.method5293(local48, arg0, local75, local83);
			Static412.method5293(local48, arg2, local83, local66);
		}
		while (local22 > local10) {
			local34 += 2;
			local32 += 2;
			local30 += local34;
			local25 += local32;
			if (local30 >= 0 && local27 >= 1) {
				local27--;
				local30 -= local27 << 1;
				Static171.anIntArray223[local27] = local10;
			}
			local10++;
			@Pc(200) int local200;
			@Pc(208) int local208;
			@Pc(219) int[] local219;
			@Pc(149) int local149;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				local149 = arg4 - local22;
				local57 = local22 + arg4;
				if (Static341.anInt5789 <= local57 && local149 <= Static309.anInt5495) {
					if (local22 < local15) {
						local66 = Static171.anIntArray223[local22];
						local75 = Static108.method1849(Static452.anInt7626, arg3 + local10, Static82.anInt3956);
						local83 = Static108.method1849(Static452.anInt7626, arg3 - local10, Static82.anInt3956);
						local200 = Static108.method1849(Static452.anInt7626, arg3 + local66, Static82.anInt3956);
						local208 = Static108.method1849(Static452.anInt7626, arg3 - local66, Static82.anInt3956);
						if (local57 <= Static309.anInt5495) {
							local219 = Static262.anIntArrayArray31[local57];
							Static412.method5293(local219, arg2, local83, local208);
							Static412.method5293(local219, arg0, local208, local200);
							Static412.method5293(local219, arg2, local200, local75);
						}
						if (Static341.anInt5789 <= local149) {
							local219 = Static262.anIntArrayArray31[local149];
							Static412.method5293(local219, arg2, local83, local208);
							Static412.method5293(local219, arg0, local208, local200);
							Static412.method5293(local219, arg2, local200, local75);
						}
					} else {
						local66 = Static108.method1849(Static452.anInt7626, local10 + arg3, Static82.anInt3956);
						local75 = Static108.method1849(Static452.anInt7626, arg3 - local10, Static82.anInt3956);
						if (Static309.anInt5495 >= local57) {
							Static412.method5293(Static262.anIntArrayArray31[local57], arg2, local75, local66);
						}
						if (Static341.anInt5789 <= local149) {
							Static412.method5293(Static262.anIntArrayArray31[local149], arg2, local75, local66);
						}
					}
				}
			}
			local149 = arg4 - local10;
			local57 = arg4 + local10;
			if (local57 >= Static341.anInt5789 && local149 <= Static309.anInt5495) {
				local66 = local22 + arg3;
				local75 = arg3 - local22;
				if (Static452.anInt7626 <= local66 && local75 <= Static82.anInt3956) {
					local66 = Static108.method1849(Static452.anInt7626, local66, Static82.anInt3956);
					local75 = Static108.method1849(Static452.anInt7626, local75, Static82.anInt3956);
					if (local10 >= local15) {
						if (local57 <= Static309.anInt5495) {
							Static412.method5293(Static262.anIntArrayArray31[local57], arg2, local75, local66);
						}
						if (Static341.anInt5789 <= local149) {
							Static412.method5293(Static262.anIntArrayArray31[local149], arg2, local75, local66);
						}
					} else {
						local83 = local10 > local27 ? Static171.anIntArray223[local10] : local27;
						local200 = Static108.method1849(Static452.anInt7626, arg3 + local83, Static82.anInt3956);
						local208 = Static108.method1849(Static452.anInt7626, arg3 - local83, Static82.anInt3956);
						if (Static309.anInt5495 >= local57) {
							local219 = Static262.anIntArrayArray31[local57];
							Static412.method5293(local219, arg2, local75, local208);
							Static412.method5293(local219, arg0, local208, local200);
							Static412.method5293(local219, arg2, local200, local66);
						}
						if (local149 >= Static341.anInt5789) {
							local219 = Static262.anIntArrayArray31[local149];
							Static412.method5293(local219, arg2, local75, local208);
							Static412.method5293(local219, arg0, local208, local200);
							Static412.method5293(local219, arg2, local200, local66);
						}
					}
				}
			}
		}
	}
}
