import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "Lclient!bea;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_109 = new Class363(21, 7);

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	public static int anInt4133 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!kp;IZI)V")
	public static void method3470(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt5130;
		if (arg1.aByte72 == 0) {
			arg1.anInt5130 = arg1.anInt5148;
		} else if (arg1.aByte72 == 1) {
			arg1.anInt5130 = arg3 - arg1.anInt5148;
		} else if (arg1.aByte72 == 2) {
			arg1.anInt5130 = arg3 * arg1.anInt5148 >> 14;
		}
		@Pc(45) int local45 = arg1.anInt5078;
		if (arg1.aByte73 == 0) {
			arg1.anInt5078 = arg1.anInt5081;
		} else if (arg1.aByte73 == 1) {
			arg1.anInt5078 = arg0 - arg1.anInt5081;
		} else if (arg1.aByte73 == 2) {
			arg1.anInt5078 = arg1.anInt5081 * arg0 >> 14;
		}
		if (arg1.aByte72 == 4) {
			arg1.anInt5130 = arg1.anInt5078 * arg1.anInt5131 / arg1.anInt5161;
		}
		if (arg1.aByte73 == 4) {
			arg1.anInt5078 = arg1.anInt5130 * arg1.anInt5161 / arg1.anInt5131;
		}
		if (Static298.aBoolean425 && (Static67.method1102(arg1).anInt6464 != 0 || arg1.anInt5098 == 0)) {
			if (arg1.anInt5078 < 5 && arg1.anInt5130 < 5) {
				arg1.anInt5130 = 5;
				arg1.anInt5078 = 5;
			} else {
				if (arg1.anInt5078 <= 0) {
					arg1.anInt5078 = 5;
				}
				if (arg1.anInt5130 <= 0) {
					arg1.anInt5130 = 5;
				}
			}
		}
		if (arg1.anInt5090 == Static315.anInt8437) {
			Static512.aClass196_11 = arg1;
		}
		if (arg2 && arg1.anObjectArray31 != null && (local8 != arg1.anInt5130 || arg1.anInt5078 != local45)) {
			@Pc(200) Class2_Sub31 local200 = new Class2_Sub31();
			local200.anObjectArray32 = arg1.anObjectArray31;
			local200.aClass196_4 = arg1;
			Static516.aClass8_60.method212(local200);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(23) int local23 = -(arg0 & 0x3);
		for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg7++;
				arg2[local34] = (byte) (arg2[local34] - arg4[arg3++]);
				@Pc(47) int local47 = arg7++;
				arg2[local47] = (byte) (arg2[local47] - arg4[arg3++]);
				@Pc(60) int local60 = arg7++;
				arg2[local60] = (byte) (arg2[local60] - arg4[arg3++]);
				@Pc(73) int local73 = arg7++;
				arg2[local73] = (byte) (arg2[local73] - arg4[arg3++]);
			}
			for (@Pc(89) int local89 = local23; local89 < 0; local89++) {
				local34 = arg7++;
				arg2[local34] = (byte) (arg2[local34] - arg4[arg3++]);
			}
			arg7 += arg5;
			arg3 += arg1;
		}
	}
}
