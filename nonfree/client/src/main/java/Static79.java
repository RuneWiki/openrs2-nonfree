import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public static int anInt2161;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method1581() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static128.method2426(true, local7, Static142.aClass1_Sub16ArrayArrayArray4, local18, local14)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static156.method2772(arg6)) {
			Static39.method706(Static80.aClass122ArrayArray1[arg6], -1, arg3, arg1, arg2, arg4, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!se;II)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		if (Static230.anInt5417 < 2 && Static183.anInt5174 == 0 && !Static88.aBoolean138) {
			return;
		}
		@Pc(25) String local25 = Static176.method3014();
		if (arg1 == null) {
			@Pc(41) int local41 = Static120.aClass1_Sub2_Sub7_2.method1935(local25, arg0 + 4, arg2 + 15, Static10.aRandom1, Static47.anInt1386);
			Static199.method3321(arg0 + 4, 15, Static120.aClass1_Sub2_Sub7_2.method1922(local25) + local41, arg2);
			return;
		}
		@Pc(60) Class1_Sub2_Sub7 local60 = arg1.method3517(Static33.aClass7Array5);
		if (local60 == null) {
			local60 = Static120.aClass1_Sub2_Sub7_2;
		}
		local60.method1925(local25, arg0, arg2, arg1.anInt4695, arg1.anInt4726, arg1.anInt4719, arg1.anInt4667, arg1.anInt4710, arg1.anInt4640, Static10.aRandom1, Static47.anInt1386, Static66.anIntArray139);
		Static199.method3321(Static66.anIntArray139[0], Static66.anIntArray139[3], Static66.anIntArray139[2], Static66.anIntArray139[1]);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIILclient!nj;Z)Lclient!ke;")
	public static Class1_Sub2_Sub4 method1584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class94 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(22) int local22 = (arg0 << 17) + (arg5 ? 65536 : 0) + arg1 + (arg2 << 19);
		@Pc(37) long local37 = (long) local22 * 3849834839L + (long) arg3 * 3147483667L;
		@Pc(43) Class1_Sub2_Sub4 local43 = (Class1_Sub2_Sub4) Static17.aClass79_2.method2483(local37);
		if (local43 != null) {
			return local43;
		}
		Static235.aBoolean259 = false;
		local43 = Static140.method2551(arg0, false, arg2, arg4, arg1, arg5, arg3);
		if (local43 != null && !Static235.aBoolean259) {
			Static17.aClass79_2.method2486(local43, local37);
		}
		return local43;
	}
}
