import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jk", name = "U", descriptor = "Lclient!en;")
	public static Class3_Sub14 aClass3_Sub14_1;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_62 = new Class217(55, 6);

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	public static int anInt3830 = 0;

	@OriginalMember(owner = "client!jk", name = "S", descriptor = "Lclient!op;")
	public static final Class182 aClass182_6 = new Class182("LIVE", 0);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static108.method1849(Static341.anInt5789, arg2, Static309.anInt5495);
		@Pc(17) int local17 = Static108.method1849(Static341.anInt5789, arg3, Static309.anInt5495);
		@Pc(23) int local23 = Static108.method1849(Static452.anInt7626, arg0, Static82.anInt3956);
		@Pc(29) int local29 = Static108.method1849(Static452.anInt7626, arg4, Static82.anInt3956);
		@Pc(37) int local37 = Static108.method1849(Static341.anInt5789, arg5 + arg2, Static309.anInt5495);
		@Pc(46) int local46 = Static108.method1849(Static341.anInt5789, arg3 - arg5, Static309.anInt5495);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static412.method5293(Static262.anIntArrayArray31[local48], arg1, local23, local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static412.method5293(Static262.anIntArrayArray31[local68], arg1, local23, local29);
		}
		@Pc(105) int local105 = Static108.method1849(Static452.anInt7626, arg5 + arg0, Static82.anInt3956);
		@Pc(114) int local114 = Static108.method1849(Static452.anInt7626, arg4 - arg5, Static82.anInt3956);
		for (@Pc(116) int local116 = local37; local116 <= local46; local116++) {
			@Pc(122) int[] local122 = Static262.anIntArrayArray31[local116];
			Static412.method5293(local122, arg1, local23, local105);
			Static412.method5293(local122, arg1, local114, local29);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBI)I")
	public static int method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static16.method366(local17, local7);
		@Pc(35) int local35 = Static16.method366(local17, local7 + 1);
		@Pc(47) int local47 = Static16.method366(local17 + 1, local7);
		@Pc(56) int local56 = Static16.method366(local17 + 1, local7 - -1);
		@Pc(63) int local63 = Static319.method1506(local28, local13, arg2, local35);
		@Pc(70) int local70 = Static319.method1506(local47, local13, arg2, local56);
		return Static319.method1506(local63, local23, arg2, local70);
	}
}
