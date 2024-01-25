import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!iba", name = "S", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!iba", name = "D", descriptor = "Lclient!rw;")
	public static final Class269 aClass269_2 = new Class269("RC", 1);

	@OriginalMember(owner = "client!iba", name = "T", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II[Lclient!mc;)V")
	public static void method3806(@OriginalArg(1) int arg0, @OriginalArg(2) Class198[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class198 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt5776 == 0) {
					if (local13.aClass198Array1 != null) {
						method3806(arg0, local13.aClass198Array1);
					}
					@Pc(34) Class12_Sub34 local34 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local13.anInt5739);
					if (local34 != null) {
						Static376.method7936(arg0, local34.anInt5831);
					}
				}
				@Pc(50) Class12_Sub6 local50;
				if (arg0 == 0 && local13.anObjectArray18 != null) {
					local50 = new Class12_Sub6();
					local50.aClass198_2 = local13;
					local50.anObjectArray2 = local13.anObjectArray18;
					Static312.method5029(local50);
				}
				if (arg0 == 1 && local13.anObjectArray35 != null) {
					if (local13.anInt5705 >= 0) {
						@Pc(73) Class198 local73 = Static104.method2137(local13.anInt5739);
						if (local73 == null || local73.aClass198Array1 == null || local13.anInt5705 >= local73.aClass198Array1.length || local13 != local73.aClass198Array1[local13.anInt5705]) {
							continue;
						}
					}
					local50 = new Class12_Sub6();
					local50.anObjectArray2 = local13.anObjectArray35;
					local50.aClass198_2 = local13;
					Static312.method5029(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(III)Z")
	public static boolean method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3811(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(III)Lclient!bo;")
	public static Class37 method3812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static120.aClass37ArrayArrayArray1[0][arg1][arg2] != null && Static120.aClass37ArrayArrayArray1[0][arg1][arg2].aClass37_1 != null;
			if (local28 && arg0 >= Static36.anInt8450 - 1) {
				return null;
			}
			Static375.method5783(arg0, arg1, arg2);
		}
		return Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
	public static void method3814(@OriginalArg(1) int arg0) {
		Static426.method5122();
		Static452.method6812();
		Static349.method5477(true, arg0);
		Static235.method7346(Static440.aClass16_103, Static466.aClass16_109, Static243.aClass42_4);
		Static155.method3050(Static243.aClass42_4, Static440.aClass16_103);
		Static502.method7463();
		Static117.method2450(Static275.aClass84Array9);
		Static445.method6725();
		Static261.method4418();
		if (Static96.anInt2243 == 2) {
			Static9.method278(3);
		} else if (Static96.anInt2243 == 6) {
			Static9.method278(7);
		} else if (Static96.anInt2243 == 9) {
			Static9.method278(10);
		} else if (Static96.anInt2243 == 1) {
			Static72.method1646(Static440.aClass16_103, Static243.aClass42_4);
		}
	}
}
