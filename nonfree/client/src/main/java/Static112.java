import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!kca;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[Lclient!d;")
	public static Class16[] aClass16Array3;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array7;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	public static void method2333(@OriginalArg(1) int arg0) {
		if (Static140.anInt3152 == 1) {
			Static524.anInt8909 = arg0;
		} else if (Static140.anInt3152 == 2 || Static140.anInt3152 == 3) {
			Static341.anInt5984 = arg0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIB)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = arg4 + 1;
		Static336.method5023(arg3, arg2, Static383.anIntArrayArray62[arg4], arg1);
		@Pc(20) int local20 = arg0 - 1;
		Static336.method5023(arg3, arg2, Static383.anIntArrayArray62[arg0], arg1);
		for (@Pc(25) int local25 = local11; local25 <= local20; local25++) {
			@Pc(31) int[] local31 = Static383.anIntArrayArray62[local25];
			local31[arg1] = local31[arg2] = arg3;
		}
	}
}
