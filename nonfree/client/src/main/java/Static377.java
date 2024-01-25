import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!ta;ILclient!za;IIILclient!at;)V")
	public static void method3544(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class163 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class16 arg7) {
		@Pc(10) Class78 local10 = Static193.aClass120_2.method2512(arg0);
		if (local10 == null || !local10.aBoolean143 || !local10.method1749(Static138.aClass268_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray161 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray161.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static414.anInt6776 == 4) {
					local42 = (int) Static113.aFloat19 & 0x3FFF;
				} else {
					local42 = Static363.anInt6120 + (int) Static113.aFloat19 & 0x3FFF;
				}
				@Pc(55) int local55 = Class155.anIntArray342[local42];
				@Pc(59) int local59 = Class155.anIntArray341[local42];
				if (Static414.anInt6776 != 4) {
					local59 = local59 * 256 / (Static454.anInt7274 + 256);
					local55 = local55 * 256 / (Static454.anInt7274 + 256);
				}
				local28[local30 * 2] = arg4 + arg7.anInt294 / 2 + (local55 * (arg5 + local10.anIntArray161[local30 * 2 + 1] * 4) + local59 * (arg2 + local10.anIntArray161[local30 * 2] * 4) >> 15);
				local28[local30 * 2 + 1] = arg6 + arg7.anInt285 / 2 - (local59 * (arg5 + local10.anIntArray161[local30 * 2 + 1] * 4) - (local10.anIntArray161[local30 * 2] * 4 + arg2) * local55 >> 15);
			}
			Static66.method972(arg3, local28, local10.anInt2160, arg7.anIntArray30, arg7.anIntArray22);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg3.method5546(local28[local42 * 2], local28[local42 * 2 + 1], local28[(local42 + 1) * 2], local28[(local42 + 1) * 2 + 1], local10.anInt2136, arg1, arg4, arg6);
			}
			arg3.method5546(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt2136, arg1, arg4, arg6);
		}
		@Pc(270) Class13 local270 = null;
		if (local10.anInt2137 != -1) {
			local270 = local10.method1750(arg3, false);
			if (local270 != null) {
				Static30.method455(arg1, arg7, arg4, local270, arg2, arg5, arg6);
			}
		}
		if (local10.aString66 == null) {
			return;
		}
		local30 = 0;
		if (local270 != null) {
			local30 = local270.ZA();
		}
		@Pc(304) Class92 local304 = Static46.aClass92_2;
		@Pc(306) Class141 local306 = Static251.aClass141_6;
		if (local10.anInt2164 == 1) {
			local304 = Static43.aClass92_1;
			local306 = Static278.aClass141_8;
		}
		if (local10.anInt2164 == 2) {
			local306 = Static241.aClass141_5;
			local304 = Static143.aClass92_3;
		}
		Static424.method5114(arg7, arg6, arg5, local10.aString66, local304, arg1, local30, local306, arg4, arg2, local10.anInt2167);
	}

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "(I)V")
	public static void method3604() {
		if (!Static215.aBoolean217) {
			return;
		}
		@Pc(11) Class16 local11 = Static4.method73(Static368.anInt6200, Static368.anInt6201);
		if (local11 != null && local11.anObjectArray5 != null) {
			@Pc(20) Class2_Sub44 local20 = new Class2_Sub44();
			local20.aClass16_20 = local11;
			local20.anObjectArray36 = local11.anObjectArray5;
			Static191.method2562(local20);
		}
		Static215.aBoolean217 = false;
		Static279.anInt6428 = -1;
		Static96.anInt1855 = -1;
		if (local11 != null) {
			Static176.method70(local11);
		}
	}
}
