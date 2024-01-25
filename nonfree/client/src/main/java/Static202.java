import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!gv", name = "A", descriptor = "Lclient!iv;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
	public static int anInt3755;

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_74 = new Class44(39, 7);

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "Lclient!vea;")
	public static final Class363 aClass363_3 = new Class363(1);

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "[Lclient!ak;")
	public static final Class14_Sub3_Sub1[] aClass14_Sub3_Sub1Array2 = new Class14_Sub3_Sub1[14];

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_55 = new Class100(84, 7);

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_56 = new Class100(42, 2);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!mea;B)Ljava/lang/String;")
	public static String method3074(@OriginalArg(0) int arg0, @OriginalArg(1) Class230 arg1) {
		if (!Static78.method1481(arg1).method5411(arg0) && arg1.anObjectArray26 == null) {
			return null;
		} else if (arg1.aStringArray23 == null || arg0 >= arg1.aStringArray23.length || arg1.aStringArray23[arg0] == null || arg1.aStringArray23[arg0].trim().length() == 0) {
			return Static28.aBoolean59 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!d;BILjava/awt/Canvas;)Lclient!ha;")
	public static Class137 method3075(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIII)V")
	public static void method3077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 * Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115() >> 8;
		if (local13 == 0 || arg0 == -1) {
			return;
		}
		if (!Static275.aBoolean329 && Static344.anInt11217 != -1 && Static427.method6300() && !Static398.method5954()) {
			Static177.aClass14_Sub5_Sub2_1 = Static611.method8584();
			@Pc(41) Class14_Sub5_Sub2 local41 = Static191.method2988(Static177.aClass14_Sub5_Sub2_1);
			Static254.method3733(local41);
		}
		Static522.method7501(local13, Static204.aClass386_118, arg0);
		Static26.method487(255, -1);
		Static275.aBoolean329 = true;
	}
}
