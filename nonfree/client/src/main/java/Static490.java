import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
	public static void method6838() {
		Static624.method8351(Static444.aClass261_9);
		Static339.anInt5386++;
		if (Static362.aBoolean420 && Static443.aBoolean532) {
			@Pc(26) int local26 = 0;
			@Pc(32) int local32 = 0;
			if (Static319.aBoolean356) {
				local26 = Static274.method3801();
				local32 = Static69.method966();
			}
			@Pc(47) int local47 = Static507.aClass335_1.method7811() + local26;
			@Pc(53) int local53 = local32 + Static507.aClass335_1.method7821();
			local47 -= Static280.anInt4507;
			local53 -= Static434.anInt7016;
			if (Static496.anInt8111 > local47) {
				local47 = Static496.anInt8111;
			}
			if (local47 + Static444.aClass261_9.anInt6595 > Static583.aClass261_12.anInt6595 + Static496.anInt8111) {
				local47 = Static496.anInt8111 + Static583.aClass261_12.anInt6595 - Static444.aClass261_9.anInt6595;
			}
			if (Static217.anInt3575 > local53) {
				local53 = Static217.anInt3575;
			}
			if (local53 + Static444.aClass261_9.anInt6622 > Static583.aClass261_12.anInt6622 + Static217.anInt3575) {
				local53 = Static217.anInt3575 + Static583.aClass261_12.anInt6622 - Static444.aClass261_9.anInt6622;
			}
			@Pc(124) int local124 = Static583.aClass261_12.anInt6598 + local47 - Static496.anInt8111;
			@Pc(132) int local132 = Static583.aClass261_12.anInt6624 + local53 - Static217.anInt3575;
			@Pc(183) Class2_Sub46 local183;
			if (Static507.aClass335_1.method7812()) {
				if (Static444.aClass261_9.anInt6588 < Static339.anInt5386) {
					@Pc(145) int local145 = local47 - Static268.anInt4312;
					@Pc(150) int local150 = local53 - Static50.anInt1048;
					if (local145 > Static444.aClass261_9.anInt6640 || -Static444.aClass261_9.anInt6640 > local145 || Static444.aClass261_9.anInt6640 < local150 || local150 < -Static444.aClass261_9.anInt6640) {
						Static118.aBoolean156 = true;
					}
				}
				if (Static444.aClass261_9.anObjectArray19 != null && Static118.aBoolean156) {
					local183 = new Class2_Sub46();
					local183.aClass261_10 = Static444.aClass261_9;
					local183.anObjectArray32 = Static444.aClass261_9.anObjectArray19;
					local183.anInt9265 = local132;
					local183.anInt9259 = local124;
					Static300.method4138(local183);
					return;
				}
			} else {
				if (Static118.aBoolean156) {
					Static618.method8289();
					if (Static444.aClass261_9.anObjectArray28 != null) {
						local183 = new Class2_Sub46();
						local183.aClass261_11 = Static637.aClass261_14;
						local183.aClass261_10 = Static444.aClass261_9;
						local183.anObjectArray32 = Static444.aClass261_9.anObjectArray28;
						local183.anInt9259 = local124;
						local183.anInt9265 = local132;
						Static300.method4138(local183);
					}
					if (Static637.aClass261_14 != null && Static76.method1079(Static444.aClass261_9) != null) {
						Static249.method3417(Static637.aClass261_14, Static444.aClass261_9);
					}
				} else if ((Static95.anInt1810 == 1 || Static158.method2369()) && Static474.anInt7600 > 2) {
					Static123.method1777(Static280.anInt4507 + Static268.anInt4312, Static50.anInt1048 + Static434.anInt7016);
				} else if (Static393.method5372()) {
					Static123.method1777(Static268.anInt4312 + Static280.anInt4507, Static50.anInt1048 + Static434.anInt7016);
				}
				Static444.aClass261_9 = null;
			}
		} else if (Static339.anInt5386 > 1) {
			Static444.aClass261_9 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IZ)V")
	public static void method6839(@OriginalArg(1) boolean arg0) {
		if (Static61.aString13.length() == 0) {
			return;
		}
		Static338.method4547("--> " + Static61.aString13);
		Static542.method7480(arg0, Static61.aString13, false);
		Static553.anInt9045 = 0;
		Static61.aString13 = "";
		Static329.anInt5228 = 0;
	}
}
