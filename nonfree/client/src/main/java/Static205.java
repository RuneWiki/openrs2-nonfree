import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hu", name = "Q", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array12;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
	public static void method3164() {
		if (Static548.method7475(Static55.anInt1068) || Static45.method761(Static55.anInt1068)) {
			Static258.method3754(Static78.anInt1534 >> 12, Static393.anInt6978 >> 12, 5000);
		} else {
			@Pc(35) int local35 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] >> 3;
			@Pc(42) int local42 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] >> 3;
			if (local35 >= 0 && Static458.anInt9736 >> 3 > local35 && local42 >= 0 && local42 < Static378.anInt6747 >> 3) {
				Static258.method3754(local42, local35, 5000);
			} else {
				Static258.method3754(Static378.anInt6747 >> 4, Static458.anInt9736 >> 4, 0);
			}
		}
		Static535.method5754();
		Static24.method491();
		Static382.method7882();
		Static585.method7839();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Lclient!jba;")
	public static Class1_Sub6_Sub2 method3165() {
		return Static54.aClass1_Sub6_Sub2_2;
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)Z")
	public static boolean method3166() {
		@Pc(7) Class1 local7 = Static166.aClass111_49.aClass1_94.aClass1_285;
		if (local7 == null || local7 == Static166.aClass111_49.aClass1_94) {
			return false;
		}
		@Pc(18) Class1_Sub40 local18 = (Class1_Sub40) local7;
		if (local18.anInt7819 >= 2000) {
			local18.anInt7819 -= 2000;
		}
		return local18.anInt7819 == 1011;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z[B)Z")
	public static boolean method3167(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(17) int local17 = local8.method7974();
		if (local17 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method7974() == 1;
		if (local35) {
			Static112.method1543(local8);
		}
		Static471.method6500(local8);
		return true;
	}
}
