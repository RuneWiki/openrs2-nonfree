import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_46 = new Class56(45, -1);

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public static int anInt1056 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(JIBI)V")
	public static void method819(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static344.method4581(local15, true, arg2, 0, arg1, 0, 0, local22);
			return;
		}
		@Pc(45) Class114 local45 = Static51.aClass151_1.method2917(local29);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local22 == 0 || local22 == 2) {
			local55 = local45.anInt2857;
			local58 = local45.anInt2851;
		} else {
			local58 = local45.anInt2857;
			local55 = local45.anInt2851;
		}
		@Pc(69) int local69 = local45.anInt2870;
		if (local22 != 0) {
			local69 = (local69 << local22 & 0xF) + (local69 >> 4 - local22);
		}
		Static344.method4581(0, true, arg2, local55, arg1, local69, local58, 0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)Lclient!bf;")
	public static Class8_Sub3_Sub1 method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class75 local16 = Static432.aClass75ArrayArrayArray6[arg0][arg2][arg1];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class8_Sub3_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class251 local27 = local16.aClass251_2; local27 != null; local27 = local27.aClass251_3) {
			@Pc(31) Class8_Sub3 local31 = local27.aClass8_Sub3_2;
			if (local31 instanceof Class8_Sub3_Sub1) {
				@Pc(37) Class8_Sub3_Sub1 local37 = (Class8_Sub3_Sub1) local31;
				@Pc(45) int local45 = local37.method5894() * 64 - 4;
				@Pc(53) int local53 = local37.anInt7339 - local45 >> 7;
				@Pc(61) int local61 = local37.anInt7343 - local45 >> 7;
				@Pc(68) int local68 = local45 + local37.anInt7339 >> 7;
				@Pc(76) int local76 = local37.anInt7343 + local45 >> 7;
				if (local53 <= arg2 && arg1 >= local61 && arg2 <= local68 && arg1 <= local76) {
					@Pc(109) int local109 = (local68 + 1 - arg2) * (-arg1 + 1 + local76);
					if (local109 > local24) {
						local22 = local37;
						local24 = local109;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZIIILclient!ma;ILclient!hd;Lclient!ya;I)V")
	public static void method821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class110 arg5, @OriginalArg(7) Class135 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class100 local10 = Static82.aClass235_1.method4957(arg0);
		if (local10 == null || !local10.aBoolean161 || !local10.method1962(Static52.aClass81_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local10.anIntArray207 != null) {
			@Pc(33) int[] local33 = new int[local10.anIntArray207.length];
			@Pc(49) int local49;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static97.anInt1791 == 4) {
					local49 = (int) Static109.aFloat75 & 0x3FFF;
				} else {
					local49 = Static35.anInt575 + (int) Static109.aFloat75 & 0x3FFF;
				}
				@Pc(60) int local60 = Class100.anIntArray206[local49];
				@Pc(64) int local64 = Class100.anIntArray208[local49];
				if (Static97.anInt1791 != 4) {
					local64 = local64 * 256 / (Static380.anInt6188 + 256);
					local60 = local60 * 256 / (Static380.anInt6188 + 256);
				}
				local33[local35 * 2] = (local60 * (local10.anIntArray207[local35 * 2 + 1] * 4 + arg7) + (local10.anIntArray207[local35 * 2] * 4 + arg1) * local64 >> 15) + arg5.anInt2617 / 2 + arg2;
				local33[local35 * 2 + 1] = arg4 + arg5.anInt2590 / 2 - (-((local10.anIntArray207[local35 * 2] * 4 + arg1) * local60) + (local10.anIntArray207[local35 * 2 + 1] * 4 + arg7) * local64 >> 15);
			}
			Static42.method557(arg6, local33, local10.anInt2459, arg5.anIntArray217, arg5.anIntArray214);
			for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
				arg6.method5370(local33[local49 * 2], local33[local49 * 2 + 1], local33[local49 * 2 + 2], local33[(local49 + 1) * 2 + 1], local10.anInt2481, arg3, arg2, arg4);
			}
			arg6.method5370(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local10.anInt2481, arg3, arg2, arg4);
		}
		@Pc(273) Class95 local273 = null;
		if (local10.anInt2483 != -1) {
			local273 = local10.method1953(false, arg6);
			if (local273 != null) {
				Static119.method4570(arg4, arg1, arg3, local273, arg2, arg7, arg5);
			}
		}
		if (local10.aString15 == null) {
			return;
		}
		local35 = 0;
		if (local273 != null) {
			local35 = local273.ma();
		}
		@Pc(306) Class123 local306 = Static378.aClass123_7;
		@Pc(308) Class158 local308 = Static261.aClass158_9;
		if (local10.anInt2486 == 1) {
			local306 = Static283.aClass123_6;
			local308 = Static221.aClass158_6;
		}
		if (local10.anInt2486 == 2) {
			local306 = Static49.aClass123_1;
			local308 = Static363.aClass158_11;
		}
		Static99.method1501(arg1, arg3, local306, arg4, local308, arg2, local35, local10.anInt2462, arg7, local10.aString15, arg5);
		return;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	public static void method823(@OriginalArg(0) int arg0) {
		if (Static350.anInt5812 == 0) {
			Static383.aClass4_Sub14_Sub1_2.method1896(arg0);
		} else {
			Static417.anInt7023 = arg0;
		}
	}
}
