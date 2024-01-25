import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!nn;I)V")
	public static void method3477(@OriginalArg(0) Class10_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method2469();
		Static446.aClass243Array1 = new Class243[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static446.aClass243Array1[local14] = new Class243();
			Static446.aClass243Array1[local14].anInt6744 = arg0.method2469();
			Static446.aClass243Array1[local14].aString65 = arg0.method2482();
		}
		Static42.anInt723 = arg0.method2469();
		Static266.anInt4717 = arg0.method2469();
		Static70.anInt1480 = arg0.method2469();
		Static436.aClass56_Sub1Array2 = new Class56_Sub1[Static266.anInt4717 + 1 - Static42.anInt723];
		for (@Pc(73) int local73 = 0; local73 < Static70.anInt1480; local73++) {
			@Pc(79) int local79 = arg0.method2469();
			@Pc(87) Class56_Sub1 local87 = Static436.aClass56_Sub1Array2[local79] = new Class56_Sub1();
			local87.anInt4655 = arg0.method2502();
			local87.anInt4658 = arg0.method2459();
			local87.anInt4663 = Static42.anInt723 + local79;
			local87.aString50 = arg0.method2482();
			local87.aString49 = arg0.method2482();
		}
		Static459.anInt7622 = arg0.method2459();
		Static162.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZ)V")
	public static void method3478(@OriginalArg(0) int arg0) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(11, arg0);
		local8.method5346();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BZ)V")
	public static void method3479(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static189.anInt3826 != -1) {
				Static176.method2939(Static189.anInt3826);
			}
			for (@Pc(14) Class10_Sub21 local14 = (Class10_Sub21) Static114.aClass167_12.method3702(); local14 != null; local14 = (Class10_Sub21) Static114.aClass167_12.method3708()) {
				if (!local14.method6034()) {
					local14 = (Class10_Sub21) Static114.aClass167_12.method3702();
					if (local14 == null) {
						break;
					}
				}
				Static153.method2607(false, local14, true);
			}
			Static189.anInt3826 = -1;
			Static114.aClass167_12 = new Class167(8);
			Static153.method2611();
			Static189.anInt3826 = Static39.anInt628;
			Static241.method3528(false);
			Static448.method5473();
			Static79.method1503(Static189.anInt3826);
		}
		Static258.aBoolean308 = true;
	}
}
