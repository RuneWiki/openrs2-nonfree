import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!kh;")
	public static Class208 aClass208_10 = null;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int anInt8708 = -1;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZI)Z")
	public static boolean method7368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static281.method4451(arg0, arg1) || Static282.method4461(arg0, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([IIIII)V")
	public static void method7369(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg2 < local15) {
			@Pc(19) int local19 = arg2 + 1;
			arg0[local19] = arg3;
			@Pc(24) int local24 = local19 + 1;
			arg0[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg3;
			arg2 = local49 + 1;
			arg0[arg2] = arg3;
		}
		while (local12 > arg2) {
			arg2++;
			arg0[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
	public static void method7370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 11);
		local9.method1712();
		local9.anInt1782 = arg2;
		local9.anInt1790 = arg1;
	}
}
