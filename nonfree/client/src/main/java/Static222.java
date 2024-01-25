import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "F")
	public static float aFloat215;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7435(@OriginalArg(1) Class87 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (Static558.aBoolean680) {
			local5 = Static257.method4233();
			local7 = Static290.method4545();
		}
		@Pc(19) int local19 = local5 + Static254.anInt5025;
		@Pc(23) int local23 = local7 + Static378.anInt6772;
		@Pc(25) int local25 = Static133.anInt3038;
		@Pc(29) int local29 = Static256.anInt5056 - 3;
		Static357.method5477(Static133.anInt3038, local5 + Static254.anInt5025, Static256.anInt5056, Static628.aClass369_24.method8475(Static377.anInt6756), arg0, Static378.anInt6772 + local7);
		@Pc(54) int local54 = Static6.aClass40_1.method4504() + local5;
		@Pc(60) int local60 = local7 + Static6.aClass40_1.method4499();
		@Pc(64) int local64;
		@Pc(69) Class2_Sub5_Sub20 local69;
		@Pc(86) int local86;
		@Pc(265) int local265;
		@Pc(158) Class2_Sub5_Sub2 local158;
		@Pc(254) Class2_Sub5_Sub20 local254;
		if (Static155.aBoolean303) {
			local64 = 0;
			for (local158 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local158 != null; local158 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
				local86 = local64 * 16 + local23 + 20 + 13;
				if (local5 + Static254.anInt5025 < local54 && local54 < Static133.anInt3038 + Static254.anInt5025 + local5 && local86 - 13 < local60 && local86 + 4 > local60 && (local158.anInt964 > 1 || ((Class2_Sub5_Sub20) local158.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66).aBoolean742)) {
					arg0.aa(local5 + Static254.anInt5025, local86 + -12, Static133.anInt3038, 16, 255 - Static609.anInt9954 << 24 | Static238.anInt4736, 1);
				}
				local64++;
			}
			if (Static591.aClass2_Sub5_Sub2_1 != null) {
				Static357.method5477(Static63.anInt1369, Static331.anInt5908, Static67.anInt1403, Static591.aClass2_Sub5_Sub2_1.aString8, arg0, Static320.anInt5800);
				local64 = 0;
				for (local254 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4280(); local254 != null; local254 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4288()) {
					local265 = local64 * 16 + Static320.anInt5800 + 33;
					if (local54 > Static331.anInt5908 && Static63.anInt1369 + Static331.anInt5908 > local54 && local265 - 13 < local60 && local60 < local265 + 4 && local254.aBoolean742) {
						arg0.aa(Static331.anInt5908, local265 - 12, Static63.anInt1369, 16, 255 - Static609.anInt9954 << 24 | Static238.anInt4736, 1);
					}
					local64++;
				}
				Static25.method594(arg0, Static67.anInt1403, Static320.anInt5800, Static63.anInt1369, Static331.anInt5908);
			}
		} else {
			local64 = 0;
			for (local69 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local69 != null; local69 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				local86 = local23 + (Static90.anInt1824 + -1 + -local64) * 16 + 13 + 20;
				local64++;
				if (Static254.anInt5025 + local5 < local54 && local54 < Static254.anInt5025 + local5 + Static133.anInt3038 && local86 - 13 < local60 && local86 + 4 > local60 && local69.aBoolean742) {
					arg0.aa(local5 + Static254.anInt5025, local86 + -12, Static133.anInt3038, 16, 255 - Static609.anInt9954 << 24 | Static238.anInt4736, 1);
				}
			}
		}
		Static25.method594(arg0, Static256.anInt5056, local7 + Static378.anInt6772, Static133.anInt3038, local5 + Static254.anInt5025);
		if (Static155.aBoolean303) {
			local64 = 0;
			for (local158 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local158 != null; local158 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
				local86 = local64 * 16 + local7 + Static378.anInt6772 + 20 + 13;
				if (local158.anInt964 == 1) {
					Static427.method6421(Static261.anInt5100 | 0xFF000000, Static378.anInt6772 + local7, arg0, Static256.anInt5056, Static133.anInt3038, Static82.anInt1752 | 0xFF000000, local60, (Class2_Sub5_Sub20) local158.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66, local54, Static254.anInt5025 + local5, local86);
				} else {
					Static605.method8281(Static133.anInt3038, local86, local5 + Static254.anInt5025, local54, arg0, local60, Static378.anInt6772 + local7, Static256.anInt5056, local158, Static82.anInt1752 | 0xFF000000, Static261.anInt5100 | 0xFF000000);
				}
				local64++;
			}
			if (Static591.aClass2_Sub5_Sub2_1 != null) {
				local64 = 0;
				for (local254 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4280(); local254 != null; local254 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4288()) {
					local265 = Static320.anInt5800 + local64 * 16 + 33;
					Static427.method6421(Static261.anInt5100 | 0xFF000000, Static320.anInt5800, arg0, Static67.anInt1403, Static63.anInt1369, Static82.anInt1752 | 0xFF000000, local60, local254, local54, Static331.anInt5908, local265);
					local64++;
				}
				Static7.method127(Static67.anInt1403, Static63.anInt1369, Static320.anInt5800, Static331.anInt5908);
			}
		} else {
			local64 = 0;
			for (local69 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local69 != null; local69 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				local86 = local23 + (-local64 + -1 + Static90.anInt1824) * 16 + 20 + 13;
				Static427.method6421(Static261.anInt5100 | 0xFF000000, local23, arg0, local29, local25, Static82.anInt1752 | 0xFF000000, local60, local69, local54, local19, local86);
				local64++;
			}
		}
		Static7.method127(Static256.anInt5056, Static133.anInt3038, Static378.anInt6772 + local7, local5 + Static254.anInt5025);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method7436(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static375.aClass359_4.aBoolean729) {
			Static460.aClass322_3 = new Class322();
			Static460.aClass322_3.aString83 = arg0;
			Static460.aClass322_3.anInt9045 = arg1;
			if (Static267.aClass86_7 != Static95.aClass86_5) {
				Static460.aClass322_3.anInt9044 = Static460.aClass322_3.anInt9045 + 50000;
				Static460.aClass322_3.anInt9041 = Static460.aClass322_3.anInt9045 + 40000;
			}
			if (Static339.aClass202_Sub1Array1.length > arg1 && Static339.aClass202_Sub1Array1[arg1] != null) {
				Static331.anInt5912 = Static339.aClass202_Sub1Array1[arg1].anInt5716;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static95.aClass86_5 != Static267.aClass86_7) {
			local48 = ":" + (arg1 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static538.aString82 != null) {
			local63 = "/p=" + Static538.aString82;
		}
		@Pc(119) String local119 = "http://" + arg0 + local48 + "/l=" + Static377.anInt6756 + "/a=" + Static619.anInt10076 + local63 + "/j" + (Static511.aBoolean580 ? "1" : "0") + ",o" + (Static633.aBoolean753 ? "1" : "0") + ",a2";
		try {
			Static181.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}
}
