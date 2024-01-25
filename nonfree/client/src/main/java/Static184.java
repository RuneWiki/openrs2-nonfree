import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "[I")
	public static int[] anIntArray666;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_26 = new Class30();

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_27 = new Class30();

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLclient!ae;)Z")
	public static boolean method3166(@OriginalArg(1) Class4 arg0) {
		if (arg0.anInt133 == Static61.anInt1194) {
			Static322.anInt5530 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIBII)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(44) int local44 = local21 + (1 - local29) * local13;
		@Pc(53) int local53 = local17 - (local29 - 1) * local25;
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = local25 * ((arg1 << 1) - 3);
		@Pc(83) int local83 = local61;
		@Pc(101) int local101;
		@Pc(109) int local109;
		if (Static138.anInt932 <= arg3 && Static40.anInt818 >= arg3) {
			local101 = Static93.method1862(arg0 + arg4, Static235.anInt4193, Static243.anInt4326);
			local109 = Static93.method1862(arg4 - arg0, Static235.anInt4193, Static243.anInt4326);
			Static315.method4662(local101, Static15.anIntArrayArray1[arg3], local109, arg2);
		}
		@Pc(125) int local125 = (arg1 - 1) * local57;
		while (local9 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local53 += local83;
					local44 += local69;
					local7++;
					local83 += local61;
					local69 += local61;
				}
			}
			if (local53 < 0) {
				local44 += local69;
				local53 += local83;
				local7++;
				local69 += local61;
				local83 += local61;
			}
			local44 += -local125;
			local53 += -local77;
			local9--;
			local77 -= local57;
			local125 -= local57;
			local101 = arg3 - local9;
			local109 = local9 + arg3;
			if (Static138.anInt932 <= local109 && Static40.anInt818 >= local101) {
				@Pc(214) int local214 = Static93.method1862(local7 + arg4, Static235.anInt4193, Static243.anInt4326);
				@Pc(222) int local222 = Static93.method1862(arg4 - local7, Static235.anInt4193, Static243.anInt4326);
				if (Static138.anInt932 <= local101) {
					Static315.method4662(local214, Static15.anIntArrayArray1[local101], local222, arg2);
				}
				if (Static40.anInt818 >= local109) {
					Static315.method4662(local214, Static15.anIntArrayArray1[local109], local222, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public static void method3175(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static64.aClass251ArrayArrayArray1 = Static232.aClass251ArrayArrayArray2;
			Static350.aClass107Array4 = Static94.aClass107Array2;
		} else {
			Static64.aClass251ArrayArrayArray1 = Static246.aClass251ArrayArrayArray3;
			Static350.aClass107Array4 = Static90.aClass107Array1;
		}
		Static12.anInt311 = Static64.aClass251ArrayArrayArray1.length;
	}
}
