import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public static int anInt2038;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!ij;")
	public static Class93 aClass93_42;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ij;")
	public static Class93 aClass93_43;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "[B")
	public static final byte[] aByteArray20 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static final int[] anIntArray205 = new int[2500];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V")
	public static void method1921() {
		Static115.aClass109_26.method2859(5);
		Static37.aClass109_10.method2859(5);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIII)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg1 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = local50 * (arg1 - 1);
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg3 >= Static75.anInt1447 && Static346.anInt6668 >= arg3) {
			local96 = Static161.method2842(arg0 + arg2, Static353.anInt6760, Static163.anInt3234);
			local104 = Static161.method2842(arg2 - arg0, Static353.anInt6760, Static163.anInt3234);
			Static160.method2840(arg4, local96, local104, Static129.anIntArrayArray46[arg3]);
		}
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local62;
					local46 += local76;
					local7++;
					local62 += local54;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local37 += local62;
				local76 += local54;
				local62 += local54;
				local7++;
			}
			local46 += -local70;
			local37 += -local82;
			local82 -= local50;
			local70 -= local50;
			local9--;
			local96 = arg3 - local9;
			local104 = local9 + arg3;
			if (Static75.anInt1447 <= local104 && local96 <= Static346.anInt6668) {
				@Pc(209) int local209 = Static161.method2842(local7 + arg2, Static353.anInt6760, Static163.anInt3234);
				@Pc(217) int local217 = Static161.method2842(arg2 - local7, Static353.anInt6760, Static163.anInt3234);
				if (local96 >= Static75.anInt1447) {
					Static160.method2840(arg4, local209, local217, Static129.anIntArrayArray46[local96]);
				}
				if (local104 <= Static346.anInt6668) {
					Static160.method2840(arg4, local209, local217, Static129.anIntArrayArray46[local104]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ij;Lclient!ij;ZI)V")
	public static void method1925(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(4) int arg2) {
		Static17.aClass93_8 = arg0;
		Static70.aClass93_26 = arg1;
		Static194.aBoolean299 = true;
		Static269.anInt5282 = arg2;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z")
	public static boolean method1927(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 60 || arg0 == 58 || arg0 == 3 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1011;
		}
	}
}
