import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "Lclient!nn;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method143() {
		if (Static387.aClass26_9.method2279()) {
			Static387.aClass26_9.method2287(Static118.aCanvas3);
			Static112.method1695();
			Static387.aClass26_9.method2221(Static118.aCanvas3);
			Static387.aClass26_9.method2229(Static118.aCanvas3);
		} else {
			Static102.method1621(Static281.anInt5126);
		}
		Static8.method183();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
	public static void method146() {
		Static426.aClass2_Sub20_Sub1_2.method2499();
		@Pc(13) int local13 = Static426.aClass2_Sub20_Sub1_2.method2505(8);
		@Pc(22) int local22;
		if (Static391.anInt6867 > local13) {
			for (local22 = local13; local22 < Static391.anInt6867; local22++) {
				Static149.anIntArray198[Static254.anInt6998++] = Static312.anIntArray202[local22];
			}
		}
		if (local13 > Static391.anInt6867) {
			throw new RuntimeException("gnpov1");
		}
		Static391.anInt6867 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(56) int local56 = Static312.anIntArray202[local22];
			@Pc(60) Class4_Sub2_Sub2_Sub2 local60 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local56];
			@Pc(65) int local65 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
			if (local65 == 0) {
				Static312.anIntArray202[Static391.anInt6867++] = local56;
				local60.anInt6508 = Static164.anInt3206;
			} else {
				@Pc(85) int local85 = Static426.aClass2_Sub20_Sub1_2.method2505(2);
				if (local85 == 0) {
					Static312.anIntArray202[Static391.anInt6867++] = local56;
					local60.anInt6508 = Static164.anInt3206;
					Static19.anIntArray29[Static379.anInt6725++] = local56;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local85 == 1) {
						Static312.anIntArray202[Static391.anInt6867++] = local56;
						local60.anInt6508 = Static164.anInt3206;
						local129 = Static426.aClass2_Sub20_Sub1_2.method2505(3);
						local60.method5138(local129, 1);
						local139 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
						if (local139 == 1) {
							Static19.anIntArray29[Static379.anInt6725++] = local56;
						}
					} else if (local85 == 2) {
						Static312.anIntArray202[Static391.anInt6867++] = local56;
						local60.anInt6508 = Static164.anInt3206;
						if (Static426.aClass2_Sub20_Sub1_2.method2505(1) == 1) {
							local129 = Static426.aClass2_Sub20_Sub1_2.method2505(3);
							local60.method5138(local129, 2);
							local139 = Static426.aClass2_Sub20_Sub1_2.method2505(3);
							local60.method5138(local139, 2);
						} else {
							local129 = Static426.aClass2_Sub20_Sub1_2.method2505(3);
							local60.method5138(local129, 0);
						}
						local129 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
						if (local129 == 1) {
							Static19.anIntArray29[Static379.anInt6725++] = local56;
						}
					} else if (local85 == 3) {
						Static149.anIntArray198[Static254.anInt6998++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZI)V")
	public static void method149(@OriginalArg(0) boolean arg0) {
		Static360.anInt6341--;
		if (Static360.anInt6341 == 0) {
			Static413.anIntArray484 = null;
		}
		if (arg0) {
			Static63.anInt1753--;
			if (Static63.anInt1753 == 0) {
				Static130.anIntArray144 = null;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!cr;)Lclient!cr;")
	public static Class41 method150(@OriginalArg(1) Class41 arg0) {
		if (arg0.anInt1663 != -1) {
			return Static160.method2564(arg0.anInt1663);
		}
		@Pc(25) int local25 = arg0.anInt1613 >>> 16;
		@Pc(30) Class211 local30 = new Class211(Static398.aClass240_27);
		for (@Pc(35) Class2_Sub25 local35 = (Class2_Sub25) local30.method4764(); local35 != null; local35 = (Class2_Sub25) local30.method4760()) {
			if (local25 == local35.anInt4163) {
				return Static160.method2564((int) local35.aLong227);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
	public static boolean method151(@OriginalArg(0) int arg0) {
		if (arg0 == 50 || arg0 == 47 || arg0 == 59 || arg0 == 25 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1012;
		}
	}
}
