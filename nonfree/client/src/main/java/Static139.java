import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static int anInt2631;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt2633 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2438(@OriginalArg(0) Class101 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static450.aBoolean606) {
			local7 = Static106.method1934();
			local9 = Static207.method3926();
		}
		arg0.KA(local7, local9, Static406.anInt7570 + local7, local9 + 350);
		arg0.aa(local7, local9, Static406.anInt7570, 350, Static318.anInt5802 << 24 | 0x332277, 1);
		Static220.method4070(local9 + 350, local9, local7, Static406.anInt7570 + local7);
		@Pc(53) int local53 = 350 / Static494.anInt8820;
		@Pc(62) int local62;
		if (Static491.anInt8810 > 0) {
			local62 = 346 - Static494.anInt8820 - 4;
			@Pc(72) int local72 = local62 * local53 / (Static491.anInt8810 + local53 - 1);
			@Pc(74) int local74 = 4;
			if (Static491.anInt8810 > 1) {
				local74 = (local62 - local72) * (-Static211.anInt4367 + -1 + Static491.anInt8810) / (Static491.anInt8810 - 1) + 4;
			}
			arg0.aa(local7 + Static406.anInt7570 - 16, local9 - -local74, 12, local72, Static318.anInt5802 << 24 | 0x332277, 2);
			for (@Pc(116) int local116 = Static211.anInt4367; local116 < Static211.anInt4367 + local53 && local116 < Static491.anInt8810; local116++) {
				@Pc(125) String[] local125 = Static184.method3569('\b', Static244.aStringArray82[local116]);
				@Pc(134) int local134 = (Static406.anInt7570 - 16 - 8) / local125.length;
				for (@Pc(136) int local136 = 0; local136 < local125.length; local136++) {
					@Pc(145) int local145 = local134 * local136 + 8;
					arg0.KA(local7 + local145, local9, local134 + local145 + local7 - 8, local9 + 350);
					Static230.aClass59_3.method9577(-1, Static359.method6152(local125[local136]), local7 + local145, -((local116 - Static211.anInt4367) * Static494.anInt8820) + -Static455.aClass324_11.anInt9271 + -Static200.anInt4201 + 350 + local9 + -2, -16777216);
				}
			}
		}
		Static514.aClass59_13.method9570(-1, "Build: 643", -16777216, local7 + Static406.anInt7570 - 25, local9 + 350 + -20);
		arg0.KA(local7, local9, Static406.anInt7570 + local7, local9 + 350);
		arg0.method8099(local9 + 350 - Static200.anInt4201, Static406.anInt7570, local7, -1);
		Static253.aClass59_5.method9577(-1, "--> " + Static359.method6152(Static356.aString80), local7 + 10, local9 + 350 + (-Static648.aClass324_12.anInt9271 - 1), -16777216);
		if (!Static494.aBoolean638) {
			return;
		}
		local62 = -1;
		if (Static62.anInt1184 % 30 > 15) {
			local62 = 16777215;
		}
		arg0.method8113(12, Static648.aClass324_12.method8181("--> " + Static359.method6152(Static356.aString80).substring(0, Static154.anInt3391)) + local7 + 10, local62, local9 + 339 - Static648.aClass324_12.anInt9271);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!dr;)I")
	public static int method2439(@OriginalArg(1) Class79 arg0) {
		if (Static114.aClass79_4 == arg0) {
			return 5120;
		} else if (arg0 == Static114.aClass79_5) {
			return 5122;
		} else if (Static114.aClass79_6 == arg0) {
			return 5124;
		} else if (Static114.aClass79_7 == arg0) {
			return 5121;
		} else if (arg0 == Static114.aClass79_8) {
			return 5123;
		} else if (Static114.aClass79_9 == arg0) {
			return 5125;
		} else if (arg0 == Static114.aClass79_10) {
			return 5131;
		} else if (arg0 == Static114.aClass79_11) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
	public static void method2440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(161) Class291 local161 = Static193.aClass291ArrayArrayArray2[arg0][arg4][arg1];
			if (local161 == null) {
				local161 = new Class291(arg0);
			}
			if (arg3 == 1) {
				local161.aShort81 = (short) arg5;
				local161.aShort83 = (short) arg2;
			} else if (arg3 == 2) {
				local161.aShort80 = (short) arg2;
				local161.aShort82 = (short) arg5;
			}
			if (Static533.aBoolean679) {
				Static306.method5022();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(52) int local52;
		if (arg3 != 8) {
			local16 = Static536.anInt4502 + (arg4 << Static170.anInt3602);
			local21 = local16 - Static536.anInt4502;
			local25 = arg1 << Static170.anInt3602;
			local30 = local25 + Static536.anInt4502;
			local40 = Static549.aClass18Array30[arg0].method8537(arg1, arg4 + 1);
			local52 = Static549.aClass18Array30[arg0].method8537(arg1 + 1, arg4);
			Static544.aClass348Array3[Static527.anInt9295++] = new Class348(arg3, arg0, local16, local21, local21, local16, local40, local52, local52 - arg5, -arg5 + local40, local25, local30, local30, local25);
			return;
		}
		local16 = arg4 << Static170.anInt3602;
		local21 = Static536.anInt4502 + local16;
		local25 = arg1 << Static170.anInt3602;
		local30 = local25 + Static536.anInt4502;
		local40 = Static549.aClass18Array30[arg0].method8537(arg1, arg4);
		local52 = Static549.aClass18Array30[arg0].method8537(arg1 + 1, arg4 + 1);
		Static544.aClass348Array3[Static527.anInt9295++] = new Class348(arg3, arg0, local16, local21, local21, local16, local40, local52, local52 - arg5, -arg5 + local40, local25, local30, local30, local25);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)V")
	public static void method2441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static249.method4411(arg3, arg2, arg0, Static604.aClass234_Sub1Array2.length - 1, arg1, 0);
		Static641.anInt11087 = 0;
		Static396.aClass2_Sub22_2 = null;
	}
}
