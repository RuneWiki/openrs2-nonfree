import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "[[Lclient!gba;")
	public static Class115[][] aClass115ArrayArray1;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	public static int anInt6193;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public static int anInt6196 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method5247() {
		@Pc(16) Class4_Sub41 local16 = Static128.method2707(Static533.aClass61_122, Class16_Sub3.lb);
		local16.aClass4_Sub9_Sub1_3.method6012(Static102.anInt2529);
		Static551.method7603(local16);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public static void method5251() {
		Static61.method1047();
		Static292.method4578(Static189.aClass4_Sub2_Sub1_1.aBoolean650);
		Static4.aClass303_1 = Static175.method7628(Static147.aClass161_4, 0, 22050, Static379.aCanvas13);
		Static4.aClass303_1.method7975(Static135.aClass4_Sub13_Sub3_1);
		Static247.aClass303_2 = Static175.method7628(Static147.aClass161_4, 1, 2048, Static379.aCanvas13);
		Static247.aClass303_2.method7975(Static430.aClass4_Sub13_Sub1_1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI[S)[S")
	public static short[] method5252(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static602.method1588(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
