import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_35 = new Class21("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!ci;)V")
	public static void method2485(@OriginalArg(1) Class38 arg0) {
		Static229.anInt4568 = 0;
		Static402.anInt7092 = 0;
		Static299.aClass273_2 = new Class273();
		Static119.aClass71_Sub1_Sub2_Sub1Array1 = new Class71_Sub1_Sub2_Sub1[1024];
		Static427.aClass71_Sub6Array1 = new Class71_Sub6[Static129.anIntArray232[Static87.anInt1986] + 1];
		Static176.anInt3455 = 0;
		Static461.anInt5493 = 0;
		Static160.method2904(arg0);
		Static308.method4716(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIILclient!cd;II)V")
	public static void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt994 == -1 && arg2.anIntArray59 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg2.anInt988 * Static157.aClass185_Sub1_1.anInt5555 >> 8;
		if (arg3 > arg2.anInt993) {
			local16 = arg3 - arg2.anInt993;
		} else if (arg2.anInt986 > arg3) {
			local16 = arg2.anInt986 - arg3;
		}
		if (arg0 > arg2.anInt995) {
			local16 += arg0 - arg2.anInt995;
		} else if (arg0 < arg2.anInt987) {
			local16 += arg2.anInt987 - arg0;
		}
		if (arg2.anInt999 == 0 || arg2.anInt999 < local16 - 64 || Static157.aClass185_Sub1_1.anInt5555 == 0 || arg2.anInt989 != arg1) {
			if (arg2.aClass4_Sub7_Sub1_3 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(arg2.aClass4_Sub7_Sub1_3);
				arg2.aClass4_Sub7_Sub1_3 = null;
			}
			if (arg2.aClass4_Sub7_Sub1_2 != null) {
				Static132.aClass4_Sub7_Sub4_1.method5474(arg2.aClass4_Sub7_Sub1_2);
				arg2.aClass4_Sub7_Sub1_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(150) int local150 = (arg2.anInt999 - local16) * local24 / arg2.anInt999;
		if (arg2.aClass4_Sub7_Sub1_3 != null) {
			arg2.aClass4_Sub7_Sub1_3.method993(local150);
		} else if (arg2.anInt994 >= 0) {
			@Pc(165) Class110 local165 = Static473.method3025(Static180.aClass38_37, arg2.anInt994, 0);
			if (local165 != null) {
				@Pc(172) Class4_Sub9_Sub1 local172 = local165.method3023().method1302(Static131.aClass254_2);
				@Pc(177) Class4_Sub7_Sub1 local177 = Static470.method977(local172, local150);
				local177.method974(-1);
				Static132.aClass4_Sub7_Sub4_1.method5473(local177);
				arg2.aClass4_Sub7_Sub1_3 = local177;
			}
		}
		if (arg2.aClass4_Sub7_Sub1_2 != null) {
			arg2.aClass4_Sub7_Sub1_2.method993(local150);
			if (!arg2.aClass4_Sub7_Sub1_2.method6325()) {
				arg2.aClass4_Sub7_Sub1_2 = null;
			}
		} else if (arg2.anIntArray59 != null && (arg2.anInt992 -= arg4) <= 0) {
			@Pc(227) int local227 = (int) ((double) arg2.anIntArray59.length * Math.random());
			@Pc(235) Class110 local235 = Static473.method3025(Static180.aClass38_37, arg2.anIntArray59[local227], 0);
			if (local235 != null) {
				@Pc(242) Class4_Sub9_Sub1 local242 = local235.method3023().method1302(Static131.aClass254_2);
				@Pc(247) Class4_Sub7_Sub1 local247 = Static470.method977(local242, local150);
				local247.method974(0);
				Static132.aClass4_Sub7_Sub4_1.method5473(local247);
				arg2.aClass4_Sub7_Sub1_2 = local247;
				arg2.anInt992 = (int) (Math.random() * (double) (arg2.anInt996 - arg2.anInt998)) + arg2.anInt998;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
	public static int method2487() {
		return 16;
	}
}
