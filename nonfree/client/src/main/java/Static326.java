import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt5970;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_112 = new Class73(72, 7);

	@OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
	public static final int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!pfa;Lclient!e;Ljava/awt/Canvas;I)Lclient!oa;")
	public static Class14 method5132(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		if (!Static481.method6625()) {
			throw new RuntimeException("");
		} else if (Static511.method7084("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg3);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class14_Sub2_Sub1 local60 = new Class14_Sub2_Sub1(local24, arg2, local34, arg1, arg0, arg3);
			local60.method6959();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method5133() {
		if (Static240.aClass14_7 == null) {
			return;
		}
		Static98.aClass40_2.method1133();
		Static256.method4332();
		Static510.method7081();
		Static531.method7227();
		Static69.method1379();
		Static321.method5068();
		if (Static385.aClass268_1 != null) {
			Static385.aClass268_1.method5998();
		}
		Static98.method1768();
		Static226.method4024();
		Static53.method1159();
		Static290.method4683();
		Static441.method6276(false);
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class4_Sub1_Sub1_Sub2 local45 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local39];
			if (local45 != null) {
				local45.aClass6_Sub29_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass20Array3.length; local52++) {
					local45.aClass20Array3[local52] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static535.anInt8885; local73++) {
			@Pc(80) Class4_Sub1_Sub1_Sub1 local80 = Static76.aClass6_Sub34Array7[local73].aClass4_Sub1_Sub1_Sub1_2;
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass20Array3.length; local84++) {
					local80.aClass20Array3[local84] = null;
				}
			}
		}
		Static528.aClass54_6 = null;
		Static21.aClass54_1 = null;
		Static240.aClass14_7.method6824();
		Static240.aClass14_7 = null;
	}
}
