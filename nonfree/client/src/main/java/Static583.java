import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wea", name = "I", descriptor = "Lclient!os;")
	public static final Class258 aClass258_22 = new Class258(3, 2);

	@OriginalMember(owner = "client!wea", name = "O", descriptor = "I")
	public static int anInt9635 = 0;

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(III)Z")
	public static boolean method7895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static252.method4228(arg0, arg1) & Static91.method2096(arg0, arg1);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 + arg6;
		@Pc(15) int local15 = arg1 - arg6;
		for (@Pc(17) int local17 = arg4; local17 < local10; local17++) {
			Static336.method5023(arg2, arg3, Static383.anIntArrayArray62[local17], arg5);
		}
		@Pc(35) int local35 = arg3 - arg6;
		for (@Pc(37) int local37 = arg1; local37 > local15; local37--) {
			Static336.method5023(arg2, arg3, Static383.anIntArrayArray62[local37], arg5);
		}
		@Pc(59) int local59 = arg5 + arg6;
		for (@Pc(61) int local61 = local10; local61 <= local15; local61++) {
			@Pc(67) int[] local67 = Static383.anIntArrayArray62[local61];
			Static336.method5023(arg2, local59, local67, arg5);
			Static336.method5023(arg0, local35, local67, local59);
			Static336.method5023(arg2, arg3, local67, local35);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZB)V")
	public static void method7897(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static487.aClass4_Sub9_Sub1_2.method1043(Static474.anInt4412) >= 15) {
				@Pc(12) int local12 = Static487.aClass4_Sub9_Sub1_2.method1046(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class4_Sub50 local26 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local12);
					@Pc(32) Class10_Sub1_Sub2_Sub1 local32;
					if (local26 == null) {
						local32 = new Class10_Sub1_Sub2_Sub1();
						local32.anInt8531 = local12;
						local26 = new Class4_Sub50(local32);
						Static106.aClass183_8.method4282((long) local12, local26);
						Static161.aClass4_Sub50Array1[Static566.anInt9466++] = local26;
						local19 = true;
					}
					local32 = local26.aClass10_Sub1_Sub2_Sub1_1;
					Static444.anIntArray617[Static428.anInt7363++] = local12;
					local32.anInt8497 = Static237.anInt7561;
					if (local32.aClass54_1 != null && local32.aClass54_1.method1117()) {
						Static158.method3140(local32);
					}
					@Pc(88) int local88;
					if (arg0) {
						local88 = Static487.aClass4_Sub9_Sub1_2.method1046(8);
						if (local88 > 127) {
							local88 -= 256;
						}
					} else {
						local88 = Static487.aClass4_Sub9_Sub1_2.method1046(5);
						if (local88 > 15) {
							local88 -= 32;
						}
					}
					@Pc(112) int local112 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
					if (local112 == 1) {
						Static253.anIntArray436[Static267.anInt5143++] = local12;
					}
					local32.method3531(Static401.aClass345_2.method7602(Static487.aClass4_Sub9_Sub1_2.method1046(14)));
					@Pc(144) int local144 = Static487.aClass4_Sub9_Sub1_2.method1046(3) + 4 << 11 & 0x3895;
					@Pc(149) int local149 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
					@Pc(156) int local156;
					if (arg0) {
						local156 = Static487.aClass4_Sub9_Sub1_2.method1046(8);
						if (local156 > 127) {
							local156 -= 256;
						}
					} else {
						local156 = Static487.aClass4_Sub9_Sub1_2.method1046(5);
						if (local156 > 15) {
							local156 -= 32;
						}
					}
					@Pc(180) int local180 = Static487.aClass4_Sub9_Sub1_2.method1046(2);
					local32.method7028(local32.aClass54_1.anInt1260);
					local32.anInt8513 = local32.aClass54_1.anInt1291 << 3;
					if (local19) {
						local32.method7033(local144, true);
					}
					local32.method3524(local32.method7021(), local180, local88 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0], local149 == 1, Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] + local156);
					if (local32.aClass54_1.method1117()) {
						Static91.method2092(null, local32.aByte101, 0, null, local32, local32.anIntArray654[0], local32.anIntArray653[0]);
					}
					continue;
				}
			}
			Static487.aClass4_Sub9_Sub1_2.method1036();
			return;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ii;ILjava/lang/String;B)Lclient!sa;")
	public static Class299 method7899(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method3823(arg2);
		}
		@Pc(39) Class299 local39;
		if (arg1 == 1) {
			try {
				Static611.method6759(Static55.anApplet1, new Object[] { (new URL(Static55.anApplet1.getCodeBase(), arg2)).toString() }, "openjs");
				local39 = new Class299();
				local39.anInt7985 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class299();
				local39.anInt7985 = 2;
				return local39;
			}
		} else if (arg1 == 2) {
			try {
				Static55.anApplet1.getAppletContext().showDocument(new URL(Static55.anApplet1.getCodeBase(), arg2), "_blank");
				local39 = new Class299();
				local39.anInt7985 = 1;
				return local39;
			} catch (@Pc(77) Exception local77) {
				local39 = new Class299();
				local39.anInt7985 = 2;
				return local39;
			}
		} else if (arg1 == 3) {
			try {
				Static611.method6758("loggedout", Static55.anApplet1);
			} catch (@Pc(104) Throwable local104) {
			}
			@Pc(118) Class299 local118;
			try {
				Static55.anApplet1.getAppletContext().showDocument(new URL(Static55.anApplet1.getCodeBase(), arg2), "_top");
				local118 = new Class299();
				local118.anInt7985 = 1;
				return local118;
			} catch (@Pc(124) Exception local124) {
				local118 = new Class299();
				local118.anInt7985 = 2;
				return local118;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
