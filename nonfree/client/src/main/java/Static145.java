import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!et", name = "J", descriptor = "I")
	public static int anInt2783;

	@OriginalMember(owner = "client!et", name = "M", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!et", name = "O", descriptor = "Lclient!hfa;")
	public static final Class141 aClass141_4 = new Class141();

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(III)V")
	public static void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static635.aClass77_9 == Static630.aClass77_8) {
			if (!Static380.method5625(1, -2, 1, arg1, false, arg0, 0, 0)) {
				Static380.method5625(1, -3, 1, arg1, false, arg0, 0, 0);
			}
		} else if (!Static380.method5625(1, -3, 1, arg1, false, arg0, 0, 0)) {
			Static380.method5625(1, -2, 1, arg1, false, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!qe;ILclient!br;ILclient!ha;I)Z")
	public static boolean method2318(@OriginalArg(0) Class14_Sub46 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(4) Class137 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray91 != null) {
			local11 = Static498.anInt8804 - (arg1.anInt1292 + arg0.anInt8307 - Static498.anInt8799) * (Static498.anInt8804 + -Static498.anInt8805) / (Static498.anInt8798 - Static498.anInt8799);
			local7 = Static498.anInt8802 + (Static498.anInt8803 - Static498.anInt8802) * (arg0.anInt8308 + (arg1.anInt1306 - Static498.anInt8800)) / (Static498.anInt8797 - Static498.anInt8800);
			local9 = Static498.anInt8802 + (Static498.anInt8803 - Static498.anInt8802) * (-Static498.anInt8800 + arg1.anInt1288 - -arg0.anInt8308) / (Static498.anInt8797 - Static498.anInt8800);
			local13 = Static498.anInt8804 - (arg0.anInt8307 + arg1.anInt1298 - Static498.anInt8799) * (-Static498.anInt8805 + Static498.anInt8804) / (Static498.anInt8798 - Static498.anInt8799);
		}
		@Pc(105) Class20 local105 = null;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg1.anInt1281 != -1) {
			if (arg0.aBoolean575 && arg1.anInt1301 != -1) {
				local105 = arg1.method1111(true, arg2);
			} else {
				local105 = arg1.method1111(false, arg2);
			}
			if (local105 != null) {
				local107 = arg0.anInt8310 - (local105.method7394() + 1 >> 1);
				local109 = arg0.anInt8310 + (local105.method7394() + 1 >> 1);
				if (local7 > local107) {
					local7 = local107;
				}
				if (local109 > local9) {
					local9 = local109;
				}
				local111 = arg0.anInt8312 - (local105.method7408() + 1 >> 1);
				if (local11 > local111) {
					local11 = local111;
				}
				local113 = arg0.anInt8312 + (local105.method7408() + 1 >> 1);
				if (local13 < local113) {
					local13 = local113;
				}
			}
		}
		@Pc(215) Class124 local215 = null;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(311) int local311;
		if (arg1.aString12 != null) {
			local215 = Static319.method5061(arg1.anInt1279);
			if (local215 != null) {
				local217 = Static254.aClass158_7.method3596((int[]) null, Static135.aStringArray8, (Class20[]) null, arg1.aString12);
				local221 = arg0.anInt8312 - arg1.anInt1272 * (Static498.anInt8804 - Static498.anInt8805) / (Static498.anInt8798 - Static498.anInt8799);
				local219 = (Static498.anInt8803 - Static498.anInt8802) * arg1.anInt1285 / (Static498.anInt8797 - Static498.anInt8800) + arg0.anInt8310;
				if (local105 == null) {
					local221 -= local217 * local215.method2948() / 2;
				} else {
					local221 -= (local105.method7408() >> 1) + local217 * local215.method2947();
				}
				for (local311 = 0; local311 < local217; local311++) {
					@Pc(317) String local317 = Static135.aStringArray8[local311];
					if (local217 - 1 > local311) {
						local317 = local317.substring(0, local317.length() - 4);
					}
					@Pc(334) int local334 = local215.method2950(local317);
					if (local334 > local223) {
						local223 = local334;
					}
				}
				local225 = local219 - local223 / 2;
				if (local7 > local225) {
					local7 = local225;
				}
				local227 = local219 + local223 / 2;
				if (local9 < local227) {
					local9 = local227;
				}
				local229 = local221;
				if (local229 < local11) {
					local11 = local229;
				}
				local231 = local215.method2947() * local217 + local221;
				if (local13 < local231) {
					local13 = local231;
				}
			}
		}
		if (local9 < Static498.anInt8802 || Static498.anInt8803 < local7 || Static498.anInt8805 > local13 || Static498.anInt8804 < local11) {
			return true;
		}
		Static498.method7311(arg2, arg0, arg1);
		if (local105 != null) {
			if (Static241.anInt4364 > 0 && (Static255.anInt4512 != -1 && arg0.anInt8309 == Static255.anInt4512 || Static159.anInt8121 != -1 && arg1.anInt1303 == Static159.anInt8121)) {
				if (Static149.anInt6799 > 50) {
					local311 = (100 - Static149.anInt6799) * 2;
				} else {
					local311 = Static149.anInt6799 * 2;
				}
				@Pc(474) int local474 = local311 << 24 | 0xFFFF00;
				arg2.method7876(arg0.anInt8312, arg0.anInt8310, local105.method7412() / 2 + 7, local474);
				arg2.method7876(arg0.anInt8312, arg0.anInt8310, local105.method7412() / 2 + 5, local474);
				arg2.method7876(arg0.anInt8312, arg0.anInt8310, local105.method7412() / 2 + 3, local474);
				arg2.method7876(arg0.anInt8312, arg0.anInt8310, local105.method7412() / 2 + 1, local474);
				arg2.method7876(arg0.anInt8312, arg0.anInt8310, local105.method7412() / 2, local474);
			}
			local105.method7399(arg0.anInt8310 - (local105.method7394() >> 1), arg0.anInt8312 + -(local105.method7408() >> 1));
		}
		if (arg1.aString12 != null && local215 != null) {
			Static182.method2906(local223, local219, arg0, arg1, local215, arg2, local221, local217);
		}
		if (arg1.anInt1281 != -1 || arg1.aString12 != null) {
			@Pc(589) Class14_Sub54 local589 = new Class14_Sub54(arg0);
			local589.anInt10881 = local113;
			local589.anInt10882 = local109;
			local589.anInt10880 = local227;
			local589.anInt10889 = local111;
			local589.anInt10887 = local231;
			local589.anInt10891 = local229;
			local589.anInt10888 = local225;
			local589.anInt10892 = local107;
			Static461.aClass262_48.method6314(local589);
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	public static void method2319() {
		Static527.aBoolean641 = false;
		Static31.method720();
	}
}
