import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_16 = new Class94(26, 7);

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)Z")
	public static boolean method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static216.aClass30_7.method4652(arg2, arg0, arg1, Static442.anIntArray540);
		@Pc(13) int local13 = Static442.anIntArray540[2];
		if (local13 < 50) {
			return false;
		} else {
			Static442.anIntArray540[2] = local13;
			Static442.anIntArray540[0] = Static390.anInt7498 * Static442.anIntArray540[0] / local13 + Static288.anInt6151;
			Static442.anIntArray540[1] = Static559.anInt10083 + Static442.anIntArray540[1] * Static360.anInt7140 / local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!ii;Lclient!lga;ILclient!ha;I)Z")
	public static boolean method1771(@OriginalArg(1) Class153 arg0, @OriginalArg(2) Class2_Sub32 arg1, @OriginalArg(4) Class20 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray273 != null) {
			local9 = Static303.anInt113 + (arg1.anInt6572 + arg0.anInt5238 - Static303.anInt114) * (Static303.anInt115 - Static303.anInt113) / (Static303.anInt109 - Static303.anInt114);
			local11 = Static303.anInt112 - (Static303.anInt112 - Static303.anInt107) * (arg0.anInt5219 + (arg1.anInt6571 - Static303.anInt105)) / (Static303.anInt116 - Static303.anInt105);
			local13 = Static303.anInt112 - (Static303.anInt112 - Static303.anInt107) * (arg1.anInt6571 + arg0.anInt5248 + -Static303.anInt105) / (Static303.anInt116 - Static303.anInt105);
			local7 = (Static303.anInt115 - Static303.anInt113) * (arg1.anInt6572 + arg0.anInt5244 - Static303.anInt114) / (Static303.anInt109 - Static303.anInt114) + Static303.anInt113;
		}
		@Pc(101) Class46 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg0.anInt5224 != -1) {
			if (arg1.aBoolean491 && arg0.anInt5246 != -1) {
				local101 = arg0.method4494(true, arg2);
			} else {
				local101 = arg0.method4494(false, arg2);
			}
			if (local101 != null) {
				local103 = arg1.anInt6573 - (local101.method6205() + 1 >> 1);
				local110 = arg1.anInt6573 + (local101.method6205() + 1 >> 1);
				if (local103 < local7) {
					local7 = local103;
				}
				if (local110 > local9) {
					local9 = local110;
				}
				local112 = arg1.anInt6574 - (local101.method6219() + 1 >> 1);
				if (local112 < local11) {
					local11 = local112;
				}
				local114 = arg1.anInt6574 + (local101.method6219() + 1 >> 1);
				if (local114 > local13) {
					local13 = local114;
				}
			}
		}
		@Pc(203) Class66 local203 = null;
		@Pc(205) int local205 = 0;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(297) int local297;
		if (arg0.aString51 != null) {
			local203 = Static438.method6939(arg0.anInt5223);
			if (local203 != null) {
				local205 = Static187.aClass239_8.method6487(arg0.aString51, null, Static626.aStringArray8, null);
				local209 = arg1.anInt6574 - arg0.anInt5218 * (Static303.anInt112 - Static303.anInt107) / (Static303.anInt116 - Static303.anInt105);
				local207 = arg1.anInt6573 + (Static303.anInt115 - Static303.anInt113) * arg0.anInt5216 / (Static303.anInt109 - Static303.anInt114);
				if (local101 == null) {
					local209 -= local205 * local203.method2364() / 2;
				} else {
					local209 -= (local101.method6219() >> 1) + (local205 * local203.method2369());
				}
				for (local297 = 0; local297 < local205; local297++) {
					@Pc(303) String local303 = Static626.aStringArray8[local297];
					if (local297 < local205 - 1) {
						local303 = local303.substring(0, local303.length() - 4);
					}
					@Pc(320) int local320 = local203.method2368(local303);
					if (local211 < local320) {
						local211 = local320;
					}
				}
				local213 = local207 - local211 / 2;
				local215 = local207 + local211 / 2;
				if (local213 < local7) {
					local7 = local213;
				}
				local217 = local209;
				if (local215 > local9) {
					local9 = local215;
				}
				local219 = local209 + local203.method2369() * local205;
				if (local11 > local217) {
					local11 = local217;
				}
				if (local219 > local13) {
					local13 = local219;
				}
			}
		}
		if (Static303.anInt113 > local9 || Static303.anInt115 < local7 || Static303.anInt107 > local13 || local11 > Static303.anInt112) {
			return true;
		}
		Static303.method142(arg2, arg1, arg0);
		if (local101 != null) {
			if (Static302.anInt6299 > 0 && (Static604.anInt10636 != -1 && Static604.anInt10636 == arg1.anInt6568 || Static232.anInt5106 != -1 && arg0.anInt5239 == Static232.anInt5106)) {
				if (Static422.anInt7962 <= 50) {
					local297 = Static422.anInt7962 * 2;
				} else {
					local297 = 200 - Static422.anInt7962 * 2;
				}
				@Pc(457) int local457 = local297 << 24 | 0xFFFF00;
				arg2.method7259(local457, local101.method6210() / 2 + 7, arg1.anInt6573, arg1.anInt6574);
				arg2.method7259(local457, local101.method6210() / 2 + 5, arg1.anInt6573, arg1.anInt6574);
				arg2.method7259(local457, local101.method6210() / 2 + 3, arg1.anInt6573, arg1.anInt6574);
				arg2.method7259(local457, local101.method6210() / 2 + 1, arg1.anInt6573, arg1.anInt6574);
				arg2.method7259(local457, local101.method6210() / 2, arg1.anInt6573, arg1.anInt6574);
			}
			local101.method6213(arg1.anInt6573 - (local101.method6205() >> 1), arg1.anInt6574 + -(local101.method6219() >> 1));
		}
		if (arg0.aString51 != null && local203 != null) {
			Static118.method2907(local203, arg1, local207, local205, arg2, local209, local211, arg0);
		}
		if (arg0.anInt5224 != -1 || arg0.aString51 != null) {
			@Pc(570) Class2_Sub4 local570 = new Class2_Sub4(arg1);
			local570.anInt414 = local112;
			local570.anInt417 = local217;
			local570.anInt415 = local103;
			local570.anInt411 = local219;
			local570.anInt413 = local213;
			local570.anInt409 = local114;
			local570.anInt410 = local215;
			local570.anInt416 = local110;
			Static612.aClass341_69.method8528(local570);
		}
		return false;
	}
}
