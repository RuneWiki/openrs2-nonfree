import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt240;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt242;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public static void method193() {
		Static100.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 * arg3;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local15 << 1;
		@Pc(45) int local45 = arg3 - arg5;
		@Pc(49) int local49 = local45 * local45;
		@Pc(53) int local53 = local36 << 1;
		@Pc(57) int local57 = local49 << 1;
		@Pc(61) int local61 = local24 << 1;
		@Pc(65) int local65 = arg3 << 1;
		@Pc(69) int local69 = local45 << 1;
		@Pc(77) int local77 = local40 + (1 - local65) * local24;
		@Pc(86) int local86 = local57 + local36 * (1 - local69);
		@Pc(95) int local95 = local15 - local61 * (local65 - 1);
		@Pc(104) int local104 = local49 - (local69 - 1) * local53;
		@Pc(108) int local108 = local24 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local15 << 2;
		@Pc(120) int local120 = local49 << 2;
		@Pc(124) int local124 = local40 * 3;
		@Pc(130) int local130 = local61 * (local65 - 3);
		@Pc(134) int local134 = local57 * 3;
		@Pc(140) int local140 = (local69 - 3) * local53;
		@Pc(142) int local142 = local116;
		@Pc(148) int local148 = local108 * (arg3 - 1);
		@Pc(154) int local154 = local112 * (local45 - 1);
		@Pc(156) int local156 = local120;
		@Pc(160) int[] local160 = Static129.anIntArrayArray40[arg0];
		Static235.method3988(arg6, local160, arg2 - local20, -arg1 + arg2);
		Static235.method3988(arg4, local160, local20 + arg2, -local20 + arg2);
		Static235.method3988(arg6, local160, arg2 + arg1, arg2 - -local20);
		while (local7 > 0) {
			if (local77 < 0) {
				while (local77 < 0) {
					local9++;
					local95 += local142;
					local142 += local116;
					local77 += local124;
					local124 += local116;
				}
			}
			if (local95 < 0) {
				local95 += local142;
				local9++;
				local142 += local116;
				local77 += local124;
				local124 += local116;
			}
			@Pc(251) boolean local251 = local7 <= local45;
			local7--;
			@Pc(256) int local256 = local7 + arg0;
			if (local251) {
				if (local86 < 0) {
					while (local86 < 0) {
						local104 += local156;
						local156 += local120;
						local86 += local134;
						local134 += local120;
						local11++;
					}
				}
				if (local104 < 0) {
					local86 += local134;
					local134 += local120;
					local104 += local156;
					local156 += local120;
					local11++;
				}
				local104 += -local140;
				local140 -= local112;
				local86 += -local154;
				local154 -= local112;
			}
			@Pc(326) int local326 = arg2 + local9;
			@Pc(331) int local331 = arg2 - local9;
			local77 += -local148;
			local148 -= local108;
			local95 += -local130;
			local130 -= local108;
			@Pc(354) int local354 = arg0 - local7;
			if (local251) {
				@Pc(360) int local360 = local11 + arg2;
				@Pc(364) int local364 = arg2 - local11;
				Static235.method3988(arg6, Static129.anIntArrayArray40[local354], local364, local331);
				Static235.method3988(arg4, Static129.anIntArrayArray40[local354], local360, local364);
				Static235.method3988(arg6, Static129.anIntArrayArray40[local354], local326, local360);
				Static235.method3988(arg6, Static129.anIntArrayArray40[local256], local364, local331);
				Static235.method3988(arg4, Static129.anIntArrayArray40[local256], local360, local364);
				Static235.method3988(arg6, Static129.anIntArrayArray40[local256], local326, local360);
			} else {
				Static235.method3988(arg6, Static129.anIntArrayArray40[local354], local326, local331);
				Static235.method3988(arg6, Static129.anIntArrayArray40[local256], local326, local331);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public static void method195(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub16 local14 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg0);
		if (local14 != null) {
			local14.method5013();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public static void method197() {
		if (Static208.method3462() || Static187.anInt3700 == Static99.anInt1826) {
			Static200.method3309();
			if (Static130.anInt2465 != Static99.anInt1826) {
				Static103.method1664();
			}
		} else {
			Static278.method4201(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], Static99.anInt1826, Static3.anInt70, Static131.anInt2471, false, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], false);
		}
	}
}
