import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
	public static int anInt6421;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Lclient!ot;")
	public static final Class270 aClass270_14 = new Class270(1);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	public static void method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static161.method2738(local7.aClass23_Sub2_Sub2_1);
		Static161.method2738(local7.aClass23_Sub2_Sub2_2);
		if (local7.aClass23_Sub2_Sub2_1 != null) {
			local7.aClass23_Sub2_Sub2_1 = null;
		}
		if (local7.aClass23_Sub2_Sub2_2 != null) {
			local7.aClass23_Sub2_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
	public static void method5392() {
		Static530.aClass284_1.method7634();
		Static542.aClass75_1.method8407();
		Static487.aClient1.method1736();
		Static469.aCanvas11.setBackground(Color.black);
		Static129.anInt2452 = -1;
		Static530.aClass284_1 = Static2.method25(Static469.aCanvas11);
		Static542.aClass75_1 = Static538.method7479(Static469.aCanvas11);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZLclient!wda;)V")
	public static void method5393(@OriginalArg(1) Class23_Sub2_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(15) Class3_Sub32 local15 = (Class3_Sub32) Static378.aClass193_33.method4457(); local15 != null; local15 = (Class3_Sub32) Static378.aClass193_33.method4459()) {
			if (local15.aClass23_Sub2_Sub1_Sub2_Sub2_2 == arg0) {
				if (local15.aClass3_Sub9_Sub2_1 != null) {
					Static557.aClass3_Sub9_Sub1_2.method1420(local15.aClass3_Sub9_Sub2_1);
					local15.aClass3_Sub9_Sub2_1 = null;
				}
				local15.method8770();
				return;
			}
		}
	}
}
