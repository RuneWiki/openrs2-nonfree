import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt2751;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_20 = new Class47(64);

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_8 = new Class77(5);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBIII)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(19) int local19 = Static19.method429(Static102.anInt2207, arg2 + arg3, Static116.anInt2488);
		@Pc(22) int local22 = -arg2;
		@Pc(24) int local24 = -1;
		@Pc(41) int local41 = Static19.method429(Static102.anInt2207, arg3 - arg2, Static116.anInt2488);
		Static74.method1123(local41, arg0, Static142.anIntArrayArray25[arg1], local19);
		while (local9 > local7) {
			local24 += 2;
			local22 += local24;
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (local22 > 0) {
				local9--;
				local22 -= local9 << 1;
				local70 = arg1 - local9;
				local74 = local9 + arg1;
				if (local74 >= Static118.anInt2521 && local70 <= Static204.anInt2389) {
					local96 = Static19.method429(Static102.anInt2207, arg3 + local7, Static116.anInt2488);
					local104 = Static19.method429(Static102.anInt2207, arg3 - local7, Static116.anInt2488);
					if (Static204.anInt2389 >= local74) {
						Static74.method1123(local104, arg0, Static142.anIntArrayArray25[local74], local96);
					}
					if (Static118.anInt2521 <= local70) {
						Static74.method1123(local104, arg0, Static142.anIntArrayArray25[local70], local96);
					}
				}
			}
			local7++;
			local74 = arg1 + local7;
			local70 = arg1 - local7;
			if (Static118.anInt2521 <= local74 && local70 <= Static204.anInt2389) {
				local96 = Static19.method429(Static102.anInt2207, local9 + arg3, Static116.anInt2488);
				local104 = Static19.method429(Static102.anInt2207, arg3 - local9, Static116.anInt2488);
				if (local74 <= Static204.anInt2389) {
					Static74.method1123(local104, arg0, Static142.anIntArrayArray25[local74], local96);
				}
				if (local70 >= Static118.anInt2521) {
					Static74.method1123(local104, arg0, Static142.anIntArrayArray25[local70], local96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)J")
	public static long method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass48_1 == null ? 0L : local7.aClass48_1.aLong94;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ab;BI)Lclient!jd;")
	public static Class1_Sub13 method1973(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3260(arg1);
		return local9 == null ? null : new Class1_Sub13(local9);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)Lclient!ca;")
	public static Class16 method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2380; local13++) {
			@Pc(19) Class16 local19 = local7.aClass16Array3[local13];
			if ((local19.aLong30 >> 29 & 0x3L) == 2L && local19.anInt536 == arg1 && local19.anInt540 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
