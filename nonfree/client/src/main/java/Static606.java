import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public static int anInt8651;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_157 = new Class268(111, 2);

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_158 = new Class268(59, 0);

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt8656 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 >= Static347.anInt6542 && arg3 <= Static553.anInt9425 && arg5 >= Static100.anInt10042 && Static567.anInt9578 >= arg4) {
			Static46.method850(arg4, arg0, arg5, arg3, arg2, arg6, arg1);
		} else {
			Static576.method3991(arg2, arg5, arg1, arg3, arg6, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)[Lclient!fa;")
	public static Class89[] method7455() {
		return new Class89[] { Static98.aClass89_10, Static618.aClass89_32, Static644.aClass89_33, Static25.aClass89_6, Static28.aClass89_17, Static387.aClass89_27, Static170.aClass89_13, Static181.aClass89_14, Static52.aClass89_8, Static128.aClass89_11, Static377.aClass89_28, Static504.aClass89_31, Static348.aClass89_24, Static567.aClass89_30 };
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)Z")
	public static boolean method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static365.aBoolean444 || !Static231.aBoolean325) {
			return false;
		} else if (Static113.anInt2246 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static518.anIntArrayArrayArray19[arg2][arg1][arg0];
			if (-Static299.anInt5834 == local24) {
				return false;
			} else if (Static299.anInt5834 == local24) {
				return true;
			} else if (Static195.aClass199Array1 == Static510.aClass199Array3) {
				return false;
			} else {
				@Pc(53) int local53 = arg1 << Static643.anInt10682;
				@Pc(57) int local57 = arg0 << Static643.anInt10682;
				if (Static577.method8180(local53 + Static246.anInt4917 - 1, Static246.anInt4917 + local57 - 1, Static195.aClass199Array1[arg2].method8532(arg1 + 1, arg0 - -1), local53 + 1, local53 + 1, Static195.aClass199Array1[arg2].method8532(arg1, arg0 + 1), Static195.aClass199Array1[arg2].method8532(arg1, arg0), Static246.anInt4917 + local57 - 1, local57 + 1) && Static577.method8180(local53 + Static246.anInt4917 - 1, local57 + 1, Static195.aClass199Array1[arg2].method8532(arg1 + 1, arg0), local53 + 1, local53 + (Static246.anInt4917 - 1), Static195.aClass199Array1[arg2].method8532(arg1 + 1, arg0 + 1), Static195.aClass199Array1[arg2].method8532(arg1, arg0), Static246.anInt4917 + local57 - 1, local57 + 1)) {
					Static565.anInt9568++;
					Static518.anIntArrayArrayArray19[arg2][arg1][arg0] = Static299.anInt5834;
					return true;
				} else {
					Static518.anIntArrayArrayArray19[arg2][arg1][arg0] = -Static299.anInt5834;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I")
	public static int method7458(@OriginalArg(0) boolean arg0) {
		if (Static369.anIntArray417 == null) {
			return 0;
		} else if (arg0 || Static171.aClass52Array1 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < Static369.anIntArray417.length; local20++) {
				@Pc(29) int local29 = Static369.anIntArray417[local20];
				if (Static375.aClass353_61.method8401(local29)) {
					local18++;
				}
				if (Static409.aClass353_74.method8401(local29)) {
					local18++;
				}
			}
			return local18;
		} else {
			return Static369.anIntArray417.length * 2;
		}
	}
}
