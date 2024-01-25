import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public static final int[] anIntArray507 = new int[64];

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt6163 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!nq;Lclient!nq;I)V")
	public static void method5278(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1) {
		Static284.aClass144_91 = arg1;
		Static126.aClass144_61 = arg0;
		Static284.aClass144_91.method3890(34);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
	public static int method5280() {
		if (Static45.aClass137_4 == null) {
			if (!Static38.aBoolean40 && Static13.anInt245 > 0) {
				if (Static204.aBoolean280 && Static278.aClass143_20.method4857(81) && Static13.anInt245 > 2) {
					return ((Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252.aClass11_252).anInt1766;
				}
				return ((Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252).anInt1766;
			}
			@Pc(46) int local46 = Static214.aClass29_1.method384();
			@Pc(50) int local50 = Static214.aClass29_1.method381();
			@Pc(52) int local52 = Static204.anInt4174;
			@Pc(54) int local54 = Static24.anInt452;
			@Pc(56) int local56 = Static101.anInt1790;
			if (local46 > local52 && local46 < local52 + local56) {
				@Pc(71) int local71 = -1;
				@Pc(90) int local90;
				for (@Pc(73) int local73 = 0; local73 < Static13.anInt245; local73++) {
					if (Static206.aBoolean282) {
						local90 = (Static13.anInt245 - local73 - 1) * 16 + local54 + 33;
						if (local50 > local90 - 13 && local50 <= local90 + 3) {
							local71 = local73;
						}
					} else {
						local90 = local54 + (Static13.anInt245 + -1 + -local73) * 16 + 31;
						if (local90 - 13 < local50 && local50 <= local90 + 3) {
							local71 = local73;
						}
					}
				}
				if (local71 != -1) {
					local90 = 0;
					@Pc(148) Class41 local148 = new Class41(Static119.aClass16_21);
					for (@Pc(155) Class11_Sub14 local155 = (Class11_Sub14) local148.method655(); local155 != null; local155 = (Class11_Sub14) local148.method652()) {
						if (local71 == local90++) {
							return local155.anInt1766;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIBI)V")
	public static void method5281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static222.method3979(arg3, arg0, arg2, arg4);
			}
		} else if (local10 == 0) {
			Static108.method1653(arg0, arg1, arg4, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local10 > local15;
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (local65) {
				local69 = arg3;
				local71 = arg1;
				arg3 = arg0;
				arg1 = arg2;
				arg0 = local69;
				arg2 = local71;
			}
			if (arg1 < arg3) {
				local69 = arg3;
				local71 = arg0;
				arg3 = arg1;
				arg0 = arg2;
				arg1 = local69;
				arg2 = local71;
			}
			local69 = arg0;
			local71 = arg1 - arg3;
			@Pc(109) int local109 = arg2 - arg0;
			@Pc(114) int local114 = -(local71 >> 1);
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(140) int local140 = arg2 <= arg0 ? -1 : 1;
			@Pc(144) int local144;
			if (local65) {
				for (local144 = arg3; local144 <= arg1; local144++) {
					Static73.anIntArrayArray6[local144][local69] = arg4;
					local114 += local109;
					if (local114 > 0) {
						local114 -= local71;
						local69 += local140;
					}
				}
			} else {
				for (local144 = arg3; local144 <= arg1; local144++) {
					local114 += local109;
					Static73.anIntArrayArray6[local69][local144] = arg4;
					if (local114 > 0) {
						local114 -= local71;
						local69 += local140;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method5282(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static226.method4026(arg1, arg1.length - 1, arg0, 0);
	}
}
