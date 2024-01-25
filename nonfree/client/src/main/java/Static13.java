import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public static int anInt399 = 2;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method317(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 - 64;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 - 96;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIZ)V")
	public static void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static58.anInt4348 == 1) {
			Static327.aClass3Array10[Static189.anInt3636 / 100].method5877(Static292.anInt5295 - 8, Static200.anInt3844 + -8);
		}
		if (Static58.anInt4348 == 2) {
			Static327.aClass3Array10[Static189.anInt3636 / 100 + 4].method5877(Static292.anInt5295 - 8, Static200.anInt3844 + -8);
		}
		Static368.method5079();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)[Lclient!dl;")
	public static Class49[] method319() {
		return new Class49[] { Static8.aClass49_1, Static105.aClass49_2, Static107.aClass49_3 };
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method320(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static346.aClass146Array2 == Static117.aClass146Array1) {
			return;
		}
		@Pc(9) int local9 = Static422.aClass146Array3[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class146 local22 = Static422.aClass146Array3[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZBIII)V")
	public static void method322(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static413.method5427(arg2)) {
			Static17.method401(-1, Static320.aClass126ArrayArray2[arg2], arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BZZ)V")
	public static void method323(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static243.anInt4420++;
			Static312.method4315();
		}
		if (arg0) {
			Static374.anInt6580++;
			Static275.method3713();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)V")
	public static void method324() {
		Static157.aClass3_9 = null;
		Static414.aClass3_24 = null;
		Static362.aClass3_20 = null;
		Static345.aClass3_19 = null;
		Static277.aClass3_14 = null;
		Static105.aClass3_6 = null;
		Static314.aClass3_15 = null;
		Static133.aClass3_7 = null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method325() {
		Static62.aClass112_1.method2334();
		Static339.aClass23_4.method637();
		Static116.aClass50_1.method1386();
		Static2.aClass74_13.method1690();
		Static388.aClass211_1.method4934();
		Static390.aClass204_2.method4622();
		Static269.aClass10_1.method283();
		Static92.aClass89_1.method1915();
		Static73.aClass252_1.method5478();
		Static186.aClass54_1.method1424();
		Static8.aClass226_1.method5108();
		Static70.aClass212_6.method4937();
		Static236.aClass198_3.method4490();
		Static85.aClass157_1.method3420();
		Static110.aClass262_1.method5692();
		Static447.aClass78_1.method1813();
		Static316.aClass88_4.method1908();
		Static419.aClass81_1.method1848();
		Static232.aClass138_2.method2992();
		Static311.aClass174_1.method3997();
		Static405.method5344();
		Static361.method3234();
		Static46.method4081();
		if (Static427.aClass239_7 != Static130.aClass239_4) {
			for (@Pc(76) int local76 = 0; local76 < Static190.aByteArrayArray5.length; local76++) {
				Static190.aByteArrayArray5[local76] = null;
			}
			Static333.anInt5829 = 0;
		}
		Static278.method5612();
		Static298.method4131();
		Static395.method5281();
		Static343.method4795();
		Static23.method487();
		Static172.aClass69_35.method1593();
		Static16.aClass30_11.method4635();
		Static358.aClass24_3.method658();
		Static180.method2644();
		Static375.aClass166_207.method3671();
		Static359.aClass166_251.method3671();
		Static430.aClass166_284.method3671();
		Static349.aClass166_240.method3671();
		Static354.aClass166_247.method3671();
		Static193.aClass166_291.method3671();
		Static273.aClass166_193.method3671();
		Static207.aClass166_151.method3671();
		Static149.aClass166_105.method3671();
		Static28.aClass166_28.method3671();
		Static320.aClass166_226.method3671();
		Static300.aClass166_212.method3671();
		Static4.aClass166_6.method3671();
		Static439.aClass166_293.method3671();
		Static240.aClass166_165.method3671();
		Static77.aClass166_60.method3671();
		Static376.aClass166_259.method3671();
		Static224.aClass166_162.method3671();
		Static195.aClass166_106.method3671();
		Static102.aClass166_75.method3671();
		Static416.aClass166_278.method3671();
		Static78.aClass166_61.method3671();
		Static81.aClass166_66.method3671();
		Static260.aClass166_302.method3671();
		Static289.aClass166_205.method3671();
		Static160.aClass166_118.method3671();
		Static278.aClass166_290.method3671();
		Static192.aClass166_304.method3671();
		Static12.aClass166_20.method3671();
		Static408.aClass166_271.method3671();
		Static213.aClass69_39.method1593();
		Static32.aClass69_7.method1593();
		Static110.aClass69_27.method1593();
		Static103.aClass69_22.method1593();
	}
}
