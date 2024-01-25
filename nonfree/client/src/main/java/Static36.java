import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
	public static final int[] anIntArray70 = new int[1];

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)I")
	public static int method656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static23.method486(arg0 + 91923, arg1 - -45365, 4) + (Static23.method486(arg0 + 37821, arg1 + 10294, 2) + -128 >> 1) + (Static23.method486(arg0, arg1, 1) + -128 >> 2) - 128;
		local43 = (int) ((double) local43 * 0.3D) + 35;
		if (local43 < 10) {
			local43 = 10;
		} else if (local43 > 60) {
			local43 = 60;
		}
		return local43;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static370.anIntArrayArrayArray14[arg0][local16][local20] == -Static244.anInt4451) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static372.anInt7558) + 1;
			@Pc(142) int local142 = (arg3 << Static372.anInt7558) + 2;
			@Pc(151) int local151 = Static346.aClass146Array2[arg0].I(arg1, arg3) + arg5;
			if (!Static48.method1023(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static372.anInt7558) - 1;
			if (!Static48.method1023(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static372.anInt7558) - 1;
			if (!Static48.method1023(local20, local151, local177)) {
				return false;
			} else if (Static48.method1023(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static169.method2493(arg0, arg1, arg3)) {
			local16 = arg1 << Static372.anInt7558;
			local20 = arg3 << Static372.anInt7558;
			return Static48.method1023(local16 + 1, Static346.aClass146Array2[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static48.method1023(local16 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static48.method1023(local16 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static205.anInt3908 - 1) && Static48.method1023(local16 + 1, Static346.aClass146Array2[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static205.anInt3908 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method661(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static444.aBoolean493) {
			try {
				@Pc(31) Class122 local31 = (Class122) Class.forName("Class122_Sub1").getDeclaredConstructor().newInstance();
				local31.method2594(arg0);
				return local31;
			} catch (@Pc(38) Throwable local38) {
				Static444.aBoolean493 = true;
			}
		}
		return arg0;
	}
}
