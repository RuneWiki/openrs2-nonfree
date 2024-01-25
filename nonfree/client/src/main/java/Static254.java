import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_9 = new Class188(1);

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	public static int anInt4048 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZIIIII)V")
	public static void method3520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static414.method5547(arg0, Static257.anInt4068, Static67.anInt1214);
		@Pc(17) int local17 = Static414.method5547(arg3, Static257.anInt4068, Static67.anInt1214);
		@Pc(23) int local23 = Static414.method5547(arg1, Static379.anInt5914, Static624.anInt10032);
		@Pc(29) int local29 = Static414.method5547(arg4, Static379.anInt5914, Static624.anInt10032);
		@Pc(37) int local37 = Static414.method5547(arg5 + arg0, Static257.anInt4068, Static67.anInt1214);
		@Pc(46) int local46 = Static414.method5547(arg3 - arg5, Static257.anInt4068, Static67.anInt1214);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static134.method1841(Static543.anIntArrayArray57[local48], local23, local29, arg2);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static134.method1841(Static543.anIntArrayArray57[local68], local23, local29, arg2);
		}
		@Pc(94) int local94 = Static414.method5547(arg1 + arg5, Static379.anInt5914, Static624.anInt10032);
		@Pc(103) int local103 = Static414.method5547(arg4 - arg5, Static379.anInt5914, Static624.anInt10032);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static543.anIntArrayArray57[local105];
			Static134.method1841(local111, local23, local94, arg2);
			Static134.method1841(local111, local103, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBI)Z")
	public static boolean method3521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static134.method1848(arg1, arg0) | (arg1 & 0x10000) != 0 || Static213.method2959(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static293.method4047(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z")
	public static boolean method3522() {
		return Static550.method7576("jaclib") ? Static550.method7576("hw3d") : false;
	}
}
