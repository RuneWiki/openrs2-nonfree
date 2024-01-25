import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
	public static int anInt8765;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread5;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_83 = new Class344(61, 4);

	@OriginalMember(owner = "client!rk", name = "H", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_32 = new Class221(16);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBII)V")
	public static void method6736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class4_Sub39 local6 = Static504.method7252();
		local6.aClass4_Sub13_Sub2_1.method7052(Static58.aClass195_7.anInt5991);
		local6.aClass4_Sub13_Sub2_1.method7052(arg3);
		local6.aClass4_Sub13_Sub2_1.method7052(arg1);
		local6.aClass4_Sub13_Sub2_1.method7038(arg2);
		local6.aClass4_Sub13_Sub2_1.method7038(arg0);
		Static50.method1166(local6);
		Static209.anInt4424 = 0;
		Static423.anInt8145 = 0;
		Static232.anInt4898 = 1;
		Static457.anInt8737 = -3;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg5 - arg2;
		@Pc(30) int local30 = arg3 * arg3;
		@Pc(34) int local34 = arg5 * arg5;
		@Pc(38) int local38 = local16 * local16;
		@Pc(42) int local42 = local21 * local21;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg5 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local30;
		@Pc(84) int local84 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = local54 + local38 * (1 - local66);
		@Pc(102) int local102 = local42 - (local66 - 1) * local58;
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = (local62 - 3) * local50;
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg5 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(158) int[] local158 = Static442.anIntArrayArray48[arg4];
		Static238.method3886(local158, arg6 - local16, arg1, arg6 - arg3);
		Static238.method3886(local158, local16 + arg6, arg0, arg6 - local16);
		Static238.method3886(local158, arg3 + arg6, arg1, arg6 + local16);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local21 >= local9;
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local140;
					local75 += local122;
					local140 += local110;
					local7++;
					local122 += local110;
				}
			}
			if (local200) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local11++;
						local148 += local118;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local148 += local118;
					local132 += local118;
					local11++;
				}
				local102 += -local138;
				local93 += -local154;
				local154 -= local114;
				local138 -= local114;
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local122 += local110;
				local7++;
				local140 += local110;
			}
			local75 += -local146;
			local84 += -local128;
			local9--;
			local128 -= local106;
			local146 -= local106;
			@Pc(337) int local337 = arg4 - local9;
			@Pc(342) int local342 = arg4 + local9;
			@Pc(347) int local347 = arg6 + local7;
			@Pc(352) int local352 = arg6 - local7;
			if (local200) {
				@Pc(358) int local358 = local11 + arg6;
				@Pc(363) int local363 = arg6 - local11;
				Static238.method3886(Static442.anIntArrayArray48[local337], local363, arg1, local352);
				Static238.method3886(Static442.anIntArrayArray48[local337], local358, arg0, local363);
				Static238.method3886(Static442.anIntArrayArray48[local337], local347, arg1, local358);
				Static238.method3886(Static442.anIntArrayArray48[local342], local363, arg1, local352);
				Static238.method3886(Static442.anIntArrayArray48[local342], local358, arg0, local363);
				Static238.method3886(Static442.anIntArrayArray48[local342], local347, arg1, local358);
			} else {
				Static238.method3886(Static442.anIntArrayArray48[local337], local347, arg1, local352);
				Static238.method3886(Static442.anIntArrayArray48[local342], local347, arg1, local352);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	public static void method6740() {
		Static31.method987();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static526.aClass232Array1[local12].method5276();
		}
		Static571.method8034();
		Static276.method4458();
		System.gc();
		Static39.aClass7_2.ya();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(CI)Z")
	public static boolean method6741(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
	public static void method6742(@OriginalArg(0) int arg0) {
		if (!Static455.aClass4_Sub35_Sub1_1.aBoolean679) {
			arg0 = -1;
		}
		if (arg0 == Static362.anInt7000) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class166 local25 = Static198.aClass338_1.method7710(arg0);
			@Pc(29) Class103 local29 = local25.method3958();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static372.aClass366_5.method8278(local29.method2458(), new Point(local25.anInt5088, local25.anInt5085), local29.method2460(), local29.method2452(), Static201.aCanvas7);
				Static362.anInt7000 = arg0;
			}
		}
		if (arg0 == -1 && Static362.anInt7000 != -1) {
			Static372.aClass366_5.method8278(null, new Point(), -1, -1, Static201.aCanvas7);
			Static362.anInt7000 = -1;
		}
	}
}
