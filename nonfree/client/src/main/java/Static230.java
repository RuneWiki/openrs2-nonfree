import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_58 = new Class25(30, 7);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIBIZII)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static319.anInt5203 = arg4;
		Static11.anInt180 = arg0;
		Static220.anInt3786 = arg5;
		Static363.anInt6129 = arg1;
		Static259.anInt4457 = arg2;
		if (arg3 && Static220.anInt3786 >= 100) {
			Static214.anInt3730 = Static363.anInt6129 * 128 + 64;
			Static32.anInt521 = Static319.anInt5203 * 128 + 64;
			Static354.anInt5973 = Static165.method2689(Static32.anInt521, Static4.anInt30, Static214.anInt3730) - Static11.anInt180;
		}
		Static9.anInt164 = 2;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(21) int local21 = arg6 - arg0;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg6 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local21 - 1);
		@Pc(152) int[] local152 = Static347.anIntArrayArray54[arg1];
		Static73.method1404(local152, arg4 - local16, arg2, arg4 - arg5);
		Static73.method1404(local152, local16 + arg4, arg3, arg4 - local16);
		Static73.method1404(local152, arg4 + arg5, arg2, local16 + arg4);
		while (local9 > 0) {
			@Pc(194) boolean local194 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local134;
					local70 += local116;
					local7++;
					local116 += local104;
					local134 += local104;
				}
			}
			if (local194) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local11++;
						local142 += local112;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local142;
					local126 += local112;
					local142 += local112;
					local11++;
				}
				local87 += -local148;
				local96 += -local132;
				local132 -= local108;
				local148 -= local108;
			}
			if (local78 < 0) {
				local70 += local116;
				local78 += local134;
				local134 += local104;
				local116 += local104;
				local7++;
			}
			local70 += -local140;
			local78 += -local122;
			local140 -= local100;
			local122 -= local100;
			local9--;
			@Pc(330) int local330 = arg1 - local9;
			@Pc(335) int local335 = arg1 + local9;
			@Pc(339) int local339 = local7 + arg4;
			@Pc(344) int local344 = arg4 - local7;
			if (local194) {
				@Pc(350) int local350 = local11 + arg4;
				@Pc(354) int local354 = arg4 - local11;
				Static73.method1404(Static347.anIntArrayArray54[local330], local354, arg2, local344);
				Static73.method1404(Static347.anIntArrayArray54[local330], local350, arg3, local354);
				Static73.method1404(Static347.anIntArrayArray54[local330], local339, arg2, local350);
				Static73.method1404(Static347.anIntArrayArray54[local335], local354, arg2, local344);
				Static73.method1404(Static347.anIntArrayArray54[local335], local350, arg3, local354);
				Static73.method1404(Static347.anIntArrayArray54[local335], local339, arg2, local350);
			} else {
				Static73.method1404(Static347.anIntArrayArray54[local330], local339, arg2, local344);
				Static73.method1404(Static347.anIntArrayArray54[local335], local339, arg2, local344);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!vl;IILclient!qq;I)V")
	public static void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5) {
		if (Static126.anInt4528 < 100) {
			Static84.method1520(arg2, arg4);
		}
		arg4.method3570(arg0, arg3, arg5 + arg0, arg1 + arg3);
		@Pc(35) int local35;
		@Pc(53) int local53;
		if (Static126.anInt4528 < 100) {
			local35 = arg5 / 2 + arg0;
			arg4.method3559(arg0, arg3, arg5, arg1, -16777216, 0);
			local53 = arg1 / 2 + arg3 - 38;
			arg4.method3506(local35 - 152, local53, 304, 34, Static431.aColorArray8[Static146.anInt2651].getRGB(), 0);
			arg4.method3559(local35 - 150, local53 + 2, Static126.anInt4528 * 3, 30, Static192.aColorArray6[Static146.anInt2651].getRGB(), 0);
			Static45.aClass92_1.method5633(local35, local53 + 20, Static10.aColorArray9[Static146.anInt2651].getRGB(), -1, Static265.aClass231_83.method5138(Static382.anInt6289));
			return;
		}
		@Pc(108) int local108 = Static187.anInt3261 - (int) ((float) arg5 / Static36.aFloat47);
		local35 = Static70.anInt1464 + (int) ((float) arg1 / Static36.aFloat47);
		local53 = Static187.anInt3261 + (int) ((float) arg5 / Static36.aFloat47);
		Static368.anInt6142 = Static187.anInt3261 - (int) ((float) arg5 / Static36.aFloat47);
		Static337.anInt5671 = (int) ((float) (arg1 * 2) / Static36.aFloat47);
		@Pc(154) int local154 = Static70.anInt1464 - (int) ((float) arg1 / Static36.aFloat47);
		Static442.anInt6181 = (int) ((float) (arg5 * 2) / Static36.aFloat47);
		Static171.anInt1651 = Static70.anInt1464 - (int) ((float) arg1 / Static36.aFloat47);
		Static36.method2046(local108 + Static36.anInt2246, Static36.anInt2243 + local35, Static36.anInt2246 + local53, Static36.anInt2243 + local154, arg0, arg3, arg0 + arg5, arg3 + 1 + arg1);
		Static36.method2063(arg4);
		@Pc(200) Class88 local200 = Static36.method2060(arg4);
		Static59.method1103(local200, arg4);
		if (Static71.anInt1487 > 0) {
			Static119.anInt2070--;
			if (Static119.anInt2070 == 0) {
				Static119.anInt2070 = 20;
				Static71.anInt1487--;
			}
		}
		if (!Static412.aBoolean472) {
			return;
		}
		@Pc(229) int local229 = arg0 + arg5 - 5;
		@Pc(235) int local235 = arg1 + arg3 - 8;
		Static60.aClass92_2.method5647(local229, 16776960, "Fps:" + Static288.anInt4836, local235);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static60.aClass92_2.method5647(local229, local264, "Mem:" + local262 + "k", local250);
		local235 = local250 - 15;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIILclient!hf;)Ljava/awt/Frame;")
	public static Frame method3609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class103 arg3) {
		if (!arg3.method2356()) {
			return null;
		}
		@Pc(17) Class117[] local17 = Static102.method4405(arg3);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg1 == local17[local25].anInt2944 && local17[local25].anInt2939 == arg0 && (!local23 || local17[local25].anInt2947 > arg2)) {
				arg2 = local17[local25].anInt2947;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(94) Class249 local94 = arg3.method2377(arg1, arg2, arg0);
		while (local94.anInt6929 == 0) {
			Static170.method1617(10L);
		}
		@Pc(106) Frame local106 = (Frame) local94.anObject10;
		if (local106 == null) {
			return null;
		} else if (local94.anInt6929 == 2) {
			Static223.method3407(arg3, local106);
			return null;
		} else {
			return local106;
		}
	}
}
