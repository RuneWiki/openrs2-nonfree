import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Lclient!eh;")
	public static Class28 aClass28_136;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_850 = Static181.method2795("The server is being updated)3");

	@OriginalMember(owner = "client!o", name = "l", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array49 = new Class83[200];

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_851 = Static181.method2795("Ok");

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!qe;")
	public static Class83 aClass83_852 = aClass83_851;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_855 = Static181.method2795("This computers address has been blocked");

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_853 = aClass83_855;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Lclient!qe;")
	public static Class83 aClass83_854 = aClass83_850;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "[I")
	public static final int[] anIntArray286 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	public static void method2203() {
		for (@Pc(1) int local1 = 0; local1 < Static63.anInt3434; local1++) {
			@Pc(6) Class78 local6 = Static155.aClass78Array2[local1];
			Static208.method3141(local6);
			Static155.aClass78Array2[local1] = null;
		}
		Static63.anInt3434 = 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg5 && arg7 == arg3 && arg4 == arg0 && arg2 == arg8) {
			Static44.method907(arg5, arg4, arg3, arg1, arg2);
			return;
		}
		@Pc(35) int local35 = arg5;
		@Pc(39) int local39 = arg5 * 3;
		@Pc(41) int local41 = arg3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg8 * 3;
		@Pc(57) int local57 = arg6 * 3;
		@Pc(61) int local61 = arg7 * 3;
		@Pc(71) int local71 = local57 + arg4 - arg5 - local49;
		@Pc(81) int local81 = arg2 + local61 - arg3 - local53;
		@Pc(92) int local92 = local49 + local39 - local57 - local57;
		@Pc(102) int local102 = local53 + local45 - local61 - local61;
		@Pc(107) int local107 = local57 - local39;
		@Pc(111) int local111 = local61 - local45;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local113 * local121 >> 12;
			@Pc(131) int local131 = local127 * local71;
			@Pc(135) int local135 = local81 * local127;
			@Pc(139) int local139 = local121 * local92;
			@Pc(143) int local143 = local102 * local121;
			@Pc(147) int local147 = local107 * local113;
			@Pc(151) int local151 = local113 * local111;
			@Pc(162) int local162 = (local147 + local131 + local139 >> 12) + arg5;
			@Pc(173) int local173 = arg3 + (local143 + local135 + local151 >> 12);
			Static44.method907(local35, local162, local41, arg1, local173);
			local41 = local173;
			local35 = local162;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z")
	public static boolean method2211(@OriginalArg(1) int arg0) {
		if (Static210.aBooleanArray29[arg0]) {
			return true;
		} else if (Static201.aClass28_190.method868(arg0)) {
			@Pc(28) int local28 = Static201.aClass28_190.method846(arg0);
			if (local28 == 0) {
				Static210.aBooleanArray29[arg0] = true;
				return true;
			}
			if (Static175.aClass5ArrayArray1[arg0] == null) {
				Static175.aClass5ArrayArray1[arg0] = new Class5[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static175.aClass5ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static201.aClass28_190.method852(local50, arg0);
					if (local64 != null) {
						Static175.aClass5ArrayArray1[arg0][local50] = new Class5();
						Static175.aClass5ArrayArray1[arg0][local50].anInt159 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							Static175.aClass5ArrayArray1[arg0][local50].method103(new Class2_Sub3(local64));
						} else {
							Static175.aClass5ArrayArray1[arg0][local50].method106(new Class2_Sub3(local64));
						}
					}
				}
			}
			Static210.aBooleanArray29[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!qf;")
	public static Class2_Sub2_Sub24 method2214(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub24 local10 = (Class2_Sub2_Sub24) Static158.aClass86_45.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static8.aClass28_12.method852(Static56.method1059(arg0), Static171.method2654(arg0));
		local10 = new Class2_Sub2_Sub24();
		local10.anInt3201 = arg0;
		if (local29 != null) {
			local10.method2444(new Class2_Sub3(local29));
		}
		local10.method2442();
		Static158.aClass86_45.method2647(local10, (long) arg0);
		return local10;
	}
}
