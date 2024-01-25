import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_15 = new Class117(14, 0, 4, 1);

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "[I")
	public static final int[] anIntArray664 = new int[1000];

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public static int anInt9233 = 1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	public static void method7857(@OriginalArg(1) int arg0) {
		if (Static299.anIntArray342 == null || Static299.anIntArray342.length < arg0) {
			Static299.anIntArray342 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public static void method7860() {
		Static514.method7103(Static351.aClass303_13);
		Static450.anInt7360++;
		if (Static551.aBoolean626 && Static252.aBoolean360) {
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			if (Static148.aBoolean241) {
				local29 = Static100.method1939();
				local31 = Static260.method4303();
			}
			@Pc(50) int local50 = Static186.aClass358_1.method8722() + local29;
			@Pc(57) int local57 = Static186.aClass358_1.method8721() + local31;
			local57 -= Static474.anInt7662;
			local50 -= Static521.anInt8409;
			if (local50 < Static518.anInt8367) {
				local50 = Static518.anInt8367;
			}
			if (local57 < Static335.anInt5865) {
				local57 = Static335.anInt5865;
			}
			if (Static373.aClass303_14.anInt7914 + Static518.anInt8367 < Static351.aClass303_13.anInt7914 + local50) {
				local50 = Static373.aClass303_14.anInt7914 + Static518.anInt8367 - Static351.aClass303_13.anInt7914;
			}
			if (Static373.aClass303_14.anInt7971 + Static335.anInt5865 < local57 + Static351.aClass303_13.anInt7971) {
				local57 = Static373.aClass303_14.anInt7971 + Static335.anInt5865 - Static351.aClass303_13.anInt7971;
			}
			@Pc(130) int local130 = local50 + Static373.aClass303_14.anInt7920 - Static518.anInt8367;
			@Pc(137) int local137 = local57 + Static373.aClass303_14.anInt7982 - Static335.anInt5865;
			@Pc(185) Class2_Sub18 local185;
			if (Static186.aClass358_1.method8726()) {
				if (Static351.aClass303_13.anInt7941 < Static450.anInt7360) {
					@Pc(224) int local224 = local50 - Static432.anInt7146;
					@Pc(229) int local229 = local57 - Static594.anInt9862;
					if (local224 > Static351.aClass303_13.anInt7912 || -Static351.aClass303_13.anInt7912 > local224 || local229 > Static351.aClass303_13.anInt7912 || local229 < -Static351.aClass303_13.anInt7912) {
						Static610.aBoolean726 = true;
					}
				}
				if (Static351.aClass303_13.anObjectArray3 != null && Static610.aBoolean726) {
					local185 = new Class2_Sub18();
					local185.anInt3019 = local130;
					local185.anInt3016 = local137;
					local185.aClass303_4 = Static351.aClass303_13;
					local185.anObjectArray1 = Static351.aClass303_13.anObjectArray3;
					Static156.method2728(local185);
				}
			} else {
				if (Static610.aBoolean726) {
					Static210.method8326();
					if (Static351.aClass303_13.anObjectArray17 != null) {
						local185 = new Class2_Sub18();
						local185.anInt3016 = local137;
						local185.aClass303_4 = Static351.aClass303_13;
						local185.aClass303_5 = Static582.aClass303_21;
						local185.anInt3019 = local130;
						local185.anObjectArray1 = Static351.aClass303_13.anObjectArray17;
						Static156.method2728(local185);
					}
					if (Static582.aClass303_21 != null && Static79.method1732(Static351.aClass303_13) != null) {
						Static493.method6910(Static582.aClass303_21, Static351.aClass303_13);
					}
				} else if ((Static193.anInt10392 == 1 || Static622.method8631()) && Static633.anInt10265 > 2) {
					Static368.method5466(Static521.anInt8409 + Static432.anInt7146, Static474.anInt7662 + Static594.anInt9862);
				} else if (Static591.method8349()) {
					Static368.method5466(Static432.anInt7146 + Static521.anInt8409, Static474.anInt7662 - -Static594.anInt9862);
				}
				Static351.aClass303_13 = null;
			}
		} else if (Static450.anInt7360 > 1) {
			Static351.aClass303_13 = null;
		}
	}
}
