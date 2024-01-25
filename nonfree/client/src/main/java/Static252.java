import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_67 = new Class74(4);

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
	public static final int[] anIntArray635 = new int[1];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8466(@OriginalArg(0) Class75 arg0) {
		if (Static356.aBoolean442) {
			Static651.method8917(arg0);
		} else {
			Static161.method3198(arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method8467(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static423.anInt7240 = -1;
		Static41.anInt544 = 1;
		Static305.aClass260_2 = Static525.aClass260_3;
		Static430.method3630(false, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method8468(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class381 local8 = Static347.method5333(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray28 != null) {
			@Pc(19) Class6_Sub53 local19 = new Class6_Sub53();
			local19.anInt9921 = arg0;
			local19.aClass381_11 = local8;
			local19.anObjectArray3 = local8.anObjectArray28;
			local19.aString119 = arg1;
			Static301.method4842(local19);
		}
		if (Static37.anInt498 != 11 || !Static78.method1061(local8).method5210(arg0 - 1)) {
			return;
		}
		@Pc(64) Class6_Sub13 local64;
		if (arg0 == 1) {
			local64 = Static30.method353(Static72.aClass241_19, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 2) {
			local64 = Static30.method353(Static426.aClass241_118, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 3) {
			local64 = Static30.method353(Static186.aClass241_48, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 4) {
			local64 = Static30.method353(Static553.aClass241_108, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 5) {
			local64 = Static30.method353(Static224.aClass241_62, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 6) {
			local64 = Static30.method353(Static401.aClass241_88, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 7) {
			local64 = Static30.method353(Static517.aClass241_101, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 8) {
			local64 = Static30.method353(Static178.aClass241_104, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 9) {
			local64 = Static30.method353(Static264.aClass241_68, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
		if (arg0 == 10) {
			local64 = Static30.method353(Static453.aClass241_96, Static525.aClass260_4.aClass270_2);
			Static641.method8643(local64, arg2, local8.anInt10149, arg3);
			Static525.aClass260_4.method6404(local64);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBIFFF[FII[FI)V")
	public static void method8469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg2 - arg0;
		@Pc(9) int local9 = arg9 - arg10;
		@Pc(25) int local25 = arg4 - arg3;
		@Pc(46) float local46 = (float) local9 * arg11[0] + arg11[1] * (float) local5 + arg11[2] * (float) local25;
		@Pc(67) float local67 = arg11[3] * (float) local9 + (float) local5 * arg11[4] + (float) local25 * arg11[5];
		@Pc(88) float local88 = arg11[6] * (float) local9 + (float) local5 * arg11[7] + (float) local25 * arg11[8];
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg1 == 0) {
			local96 = arg5 + local46 + 0.5F;
			local103 = arg6 + 0.5F - local88;
		} else if (arg1 == 1) {
			local103 = local88 + arg6 + 0.5F;
			local96 = local46 + arg5 + 0.5F;
		} else if (arg1 == 2) {
			local96 = arg5 + 0.5F - local46;
			local103 = arg7 + 0.5F - local67;
		} else if (arg1 == 3) {
			local103 = arg7 + 0.5F - local67;
			local96 = local46 + arg5 + 0.5F;
		} else if (arg1 == 4) {
			local103 = arg7 + 0.5F - local67;
			local96 = local88 + arg6 + 0.5F;
		} else {
			local96 = arg6 + 0.5F - local88;
			local103 = arg7 + 0.5F - local67;
		}
		@Pc(206) float local206;
		if (arg12 == 1) {
			local206 = local96;
			local96 = -local103;
			local103 = local206;
		} else if (arg12 == 2) {
			local96 = -local96;
			local103 = -local103;
		} else if (arg12 == 3) {
			local206 = local96;
			local96 = local103;
			local103 = -local206;
		}
		arg8[0] = local96;
		arg8[1] = local103;
	}
}
