import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_78 = new Class61(75, 2);

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_16 = new Class284(12, 19);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static474.method3731(arg4)) {
			return;
		}
		if (Static355.aClass115ArrayArray1[arg4] == null) {
			Static69.method1218(Static458.aClass115ArrayArray2[arg4], -1, arg0, arg6, arg1, arg8, arg3, arg2, arg5, arg7);
		} else {
			Static69.method1218(Static355.aClass115ArrayArray1[arg4], -1, arg0, arg6, arg1, arg8, arg3, arg2, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIBI)Lclient!bi;")
	public static Class31 method5538(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class47 local5 = null;
		if (Static454.aClass56_5 != null) {
			local5 = new Class47(arg1, Static454.aClass56_5, Static566.aClass56Array1[arg1], 1000000);
		}
		Static7.aClass235_Sub1Array1[arg1] = Static96.aClass219_1.method4894(arg1, local5, Static309.aClass47_2);
		Static7.aClass235_Sub1Array1[arg1].method5087();
		return new Class31(Static7.aClass235_Sub1Array1[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class18[] local3 = Static186.aClass18Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class18 local11 = local3[local5];
			if (local11 != null && local11.anInt388 == 2) {
				Static86.method2042(local11.anInt385, arg0 >> 1, arg2 >> 1, local11.anInt382, local11.anInt393, local11.anInt380 * 2);
				if (Static458.anIntArray627[0] > -1 && Static237.anInt7561 % 20 < 10) {
					Static315.aClass13Array20[local11.anInt392].method8019(arg1 + Static458.anIntArray627[0] - 12, Static458.anIntArray627[1] + -28 + arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZILclient!r;)V")
	public static void method5541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class285 arg2) {
		Static522.aClass285ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[B)V")
	public static void method5542(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method6015();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(34) int[] local34 = Static4.anIntArray7 = new int[6];
					local34[0] = local14.method5982();
					local34[1] = local14.method5982();
					local34[2] = local14.method5982();
					local34[3] = local14.method5982();
					local34[4] = local14.method5982();
					local34[5] = local14.method5982();
				} else {
					@Pc(84) int local84;
					@Pc(89) int local89;
					if (local18 == 4) {
						local84 = local14.method6015();
						Static427.anIntArray603 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static427.anIntArray603[local89] = local14.method5982();
							if (Static427.anIntArray603[local89] == 65535) {
								Static427.anIntArray603[local89] = -1;
							}
						}
					} else if (local18 == 5) {
						local84 = local14.method6015();
						Static202.anIntArray395 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static202.anIntArray395[local89] = local14.method5982();
							if (Static202.anIntArray395[local89] == 65535) {
								Static202.anIntArray395[local89] = -1;
							}
						}
					}
				}
			}
		}
	}
}
