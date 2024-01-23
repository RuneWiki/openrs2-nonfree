import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!oh;")
	public static Class123 aClass123_3;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString75 = "slide:";

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBZLclient!lc;II)V")
	public static void method2037(@OriginalArg(0) int arg0, @OriginalArg(3) Class98 arg1, @OriginalArg(4) int arg2) {
		Static297.anInt5500 = arg2;
		Static125.aClass98_78 = arg1;
		Static147.aBoolean197 = false;
		Static217.anInt4316 = arg0;
		Static150.anInt3042 = 0;
		Static57.anInt1137 = 10000;
		Static42.anInt863 = 1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		@Pc(16) int local16;
		for (local16 = arg2; local16 < local14; local16++) {
			Static129.method2127(arg6, arg5, arg3, Static234.anIntArrayArray40[local16]);
		}
		@Pc(34) int local34 = arg4 + arg5;
		for (local16 = arg1; local16 > local10; local16--) {
			Static129.method2127(arg6, arg5, arg3, Static234.anIntArrayArray40[local16]);
		}
		@Pc(55) int local55 = arg6 - arg4;
		for (local16 = local14; local16 <= local10; local16++) {
			@Pc(73) int[] local73 = Static234.anIntArrayArray40[local16];
			Static129.method2127(local34, arg5, arg3, local73);
			Static129.method2127(local55, local34, arg0, local73);
			Static129.method2127(arg6, local55, arg3, local73);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method2039() {
		aClass123_3 = null;
		aString75 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = 0;
		@Pc(12) int local12 = arg5 - arg2;
		if (local12 < 0) {
			local12 = 0;
		}
		Static284.method4277(arg5);
		@Pc(23) int local23 = arg5;
		@Pc(25) int local25 = local12;
		@Pc(28) int local28 = -arg5;
		@Pc(31) int local31 = -local12;
		@Pc(33) int local33 = -1;
		@Pc(48) int[] local48 = Static234.anIntArrayArray40[arg4];
		@Pc(50) int local50 = -1;
		@Pc(55) int local55 = arg1 - local12;
		@Pc(59) int local59 = local12 + arg1;
		Static129.method2127(local55, arg1 - arg5, arg3, local48);
		Static129.method2127(local59, local55, arg0, local48);
		Static129.method2127(arg5 + arg1, local59, arg3, local48);
		while (local3 < local23) {
			local50 += 2;
			local33 += 2;
			local31 += local50;
			if (local31 >= 0 && local25 >= 1) {
				Static281.anIntArray476[local25] = local3;
				local25--;
				local31 -= local25 << 1;
			}
			local28 += local33;
			local3++;
			@Pc(140) int[] local140;
			@Pc(147) int[] local147;
			@Pc(160) int local160;
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(175) int local175;
			@Pc(165) int local165;
			if (local28 >= 0) {
				local23--;
				local28 -= local23 << 1;
				if (local12 > local23) {
					local140 = Static234.anIntArrayArray40[arg4 + local23];
					local147 = Static234.anIntArrayArray40[arg4 - local23];
					local151 = local3 + arg1;
					local156 = arg1 - local3;
					local160 = Static281.anIntArray476[local23];
					local165 = arg1 - local160;
					Static129.method2127(local165, local156, arg3, local140);
					local175 = local160 + arg1;
					Static129.method2127(local175, local165, arg0, local140);
					Static129.method2127(local151, local175, arg3, local140);
					Static129.method2127(local165, local156, arg3, local147);
					Static129.method2127(local175, local165, arg0, local147);
					Static129.method2127(local151, local175, arg3, local147);
				} else {
					local140 = Static234.anIntArrayArray40[arg4 + local23];
					local151 = arg1 - local3;
					local147 = Static234.anIntArrayArray40[arg4 - local23];
					local160 = arg1 + local3;
					Static129.method2127(local160, local151, arg3, local140);
					Static129.method2127(local160, local151, arg3, local147);
				}
			}
			local140 = Static234.anIntArrayArray40[local3 + arg4];
			local147 = Static234.anIntArrayArray40[arg4 - local3];
			local160 = arg1 + local23;
			local151 = arg1 - local23;
			if (local12 <= local3) {
				Static129.method2127(local160, local151, arg3, local140);
				Static129.method2127(local160, local151, arg3, local147);
			} else {
				local156 = local25 < local3 ? Static281.anIntArray476[local3] : local25;
				local175 = arg1 + local156;
				local165 = arg1 - local156;
				Static129.method2127(local165, local151, arg3, local140);
				Static129.method2127(local175, local165, arg0, local140);
				Static129.method2127(local160, local175, arg3, local140);
				Static129.method2127(local165, local151, arg3, local147);
				Static129.method2127(local175, local165, arg0, local147);
				Static129.method2127(local160, local175, arg3, local147);
			}
		}
	}
}
