import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static int anInt9028;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
	public static boolean aBoolean705 = false;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	public static void method7504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static69.anInt1918 < arg4 || Static385.anInt6630 > arg0) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static110.anInt2597 > arg1) {
			arg1 = Static110.anInt2597;
			local27 = false;
		} else if (Static459.anInt7524 >= arg1) {
			local27 = true;
		} else {
			arg1 = Static459.anInt7524;
			local27 = false;
		}
		@Pc(46) boolean local46;
		if (arg3 < Static110.anInt2597) {
			arg3 = Static110.anInt2597;
			local46 = false;
		} else if (arg3 > Static459.anInt7524) {
			local46 = false;
			arg3 = Static459.anInt7524;
		} else {
			local46 = true;
		}
		if (arg4 >= Static385.anInt6630) {
			Static337.method5150(arg3, arg2, arg1, Static176.anIntArrayArray28[arg4++]);
		} else {
			arg4 = Static385.anInt6630;
		}
		if (Static69.anInt1918 >= arg0) {
			Static337.method5150(arg3, arg2, arg1, Static176.anIntArrayArray28[arg0--]);
		} else {
			arg0 = Static69.anInt1918;
		}
		@Pc(105) int local105;
		if (local27 && local46) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				@Pc(145) int[] local145 = Static176.anIntArrayArray28[local105];
				local145[arg1] = local145[arg3] = arg2;
			}
		} else if (local27) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				Static176.anIntArrayArray28[local105][arg1] = arg2;
			}
		} else if (local46) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				Static176.anIntArrayArray28[local105][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!lk;)V")
	public static void method7505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray12 != null) {
			@Pc(18) Class3_Sub45 local18 = new Class3_Sub45();
			local18.aClass203_136 = arg2;
			local18.anObjectArray33 = arg2.anObjectArray12;
			Static149.method2778(local18);
		}
		Static212.anInt4226 = arg2.anInt5479;
		Static472.anInt7697 = arg1;
		Static301.anInt5410 = arg0;
		Static550.anInt7639 = arg2.anInt5531;
		Static345.anInt6055 = arg2.anInt5504;
		Static380.aBoolean537 = true;
		Static63.anInt1712 = arg2.anInt5507;
		Static456.anInt8051 = arg2.anInt5522;
		Static138.method2656(arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method7506() {
		Static280.aClass10_27.method263();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method7512(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6430 - Static305.anInt5560;
		@Pc(19) int local19 = arg0.anInt6450 * 512 + arg0.method5569() * 256;
		@Pc(31) int local31 = arg0.anInt6449 * 512 + arg0.method5569() * 256;
		arg0.anInt6467 = 0;
		arg0.anInt8975 += (local19 - arg0.anInt8975) / local8;
		arg0.anInt8980 += (local31 - arg0.anInt8980) / local8;
		if (arg0.anInt6417 == 0) {
			arg0.method5557(8192);
		}
		if (arg0.anInt6417 == 1) {
			arg0.method5557(12288);
		}
		if (arg0.anInt6417 == 2) {
			arg0.method5557(0);
		}
		if (arg0.anInt6417 == 3) {
			arg0.method5557(4096);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIII)V")
	public static void method7518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class3_Sub34 local6 = Static17.method293();
		local6.aClass3_Sub11_Sub1_2.method3079(Static115.aClass92_7.anInt2893);
		local6.aClass3_Sub11_Sub1_2.method3079(arg2);
		local6.aClass3_Sub11_Sub1_2.method3079(arg0);
		local6.aClass3_Sub11_Sub1_2.method3131(arg3);
		local6.aClass3_Sub11_Sub1_2.method3131(arg1);
		Static131.method2572(local6);
		Static221.anInt5801 = 0;
		Static5.anInt98 = -3;
		Static144.anInt3061 = 1;
		Static268.anInt5017 = 0;
	}
}
