import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public static int anInt2404 = -1;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub1_2 != null) {
			local7.aClass4_Sub1_2 = null;
		}
		if (local7.aClass4_Sub1_3 != null) {
			local7.aClass4_Sub1_3 = null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method1759() {
		for (@Pc(7) int local7 = 0; local7 < Static18.anInt404; local7++) {
			@Pc(13) Class9 local13 = Static148.aClass9Array1[local7];
			if (local13.aByte1 == 2) {
				if (local13.aClass2_Sub18_Sub1_1 == null) {
					local13.anInt306 = Integer.MIN_VALUE;
				} else {
					Static360.aClass2_Sub18_Sub4_2.method4456(local13.aClass2_Sub18_Sub1_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)[Lclient!sn;")
	public static Class223[] method1760() {
		return new Class223[] { Static99.aClass223_2, Static164.aClass223_4, Static110.aClass223_3 };
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public static void method1761() {
		if (Static387.aClass26_9 == null) {
			return;
		}
		Static346.aClass184_6.method4216();
		Static440.method5948();
		Static210.method3244();
		Static374.method5250();
		Static190.method3001();
		Static53.method1028();
		if (Static45.aClass243_4 != null) {
			Static45.aClass243_4.method5471();
		}
		Static244.method3751();
		Static238.method3614();
		Static419.method5689();
		Static313.method4436(false);
		Static64.method1256();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class4_Sub2_Sub2_Sub1 local43 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local37];
			if (local43 != null) {
				local43.aClass2_Sub24_3 = null;
				for (@Pc(50) int local50 = 0; local50 < local43.aClass32Array3.length; local50++) {
					local43.aClass32Array3[local50] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static4.aClass4_Sub2_Sub2_Sub2Array1.length; local71++) {
			@Pc(77) Class4_Sub2_Sub2_Sub2 local77 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass32Array3.length; local81++) {
					local77.aClass32Array3[local81] = null;
				}
			}
		}
		Static387.aClass26_9.method2258();
		Static387.aClass26_9 = null;
	}
}
