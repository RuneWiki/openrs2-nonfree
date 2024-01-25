import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_45 = new Class181(62, 8);

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject11 = null;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
	public static int[] anIntArray399 = null;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Z")
	public static boolean method4969(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(29) Class156 local29 = Static535.aClass156ArrayArrayArray2[arg5][arg2][arg3];
			if (local29 == null) {
				local29 = new Class156(arg5);
			}
			if (arg1 == 1) {
				local29.aShort63 = (short) arg0;
				local29.aShort60 = (short) arg4;
			} else if (arg1 == 2) {
				local29.aShort61 = (short) arg4;
				local29.aShort62 = (short) arg0;
			}
			if (Static35.aBoolean58) {
				Static67.method1109();
				return;
			}
			return;
		}
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(95) int local95;
		@Pc(107) int local107;
		if (arg1 == 8) {
			local74 = arg2 << Static162.anInt2830;
			local78 = Static407.anInt7012 + local74;
			local82 = arg3 << Static162.anInt2830;
			local87 = local82 + Static407.anInt7012;
			local95 = Static492.aClass40Array3[arg5].method8442(arg2, arg3);
			local107 = Static492.aClass40Array3[arg5].method8442(arg2 + 1, arg3 + 1);
			Static232.aClass4Array3[Static156.anInt2751++] = new Class4(arg1, arg5, local74, local78, local78, local74, local95, local107, local107 - arg4, local95 + -arg4, local82, local87, local87, local82);
			return;
		}
		local74 = Static407.anInt7012 + (arg2 << Static162.anInt2830);
		local78 = local74 - Static407.anInt7012;
		local82 = arg3 << Static162.anInt2830;
		local87 = local82 + Static407.anInt7012;
		local95 = Static492.aClass40Array3[arg5].method8442(arg2 + 1, arg3);
		local107 = Static492.aClass40Array3[arg5].method8442(arg2, arg3 + 1);
		Static232.aClass4Array3[Static156.anInt2751++] = new Class4(arg1, arg5, local74, local78, local78, local74, local95, local107, local107 - arg4, local95 + -arg4, local82, local87, local87, local82);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Lclient!vfa;")
	public static Class357 method4971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class357 local7 = Static472.method6903(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass357Array2 == null || local7.aClass357Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass357Array2[arg1];
		}
	}
}
