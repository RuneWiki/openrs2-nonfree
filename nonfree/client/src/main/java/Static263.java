import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!ok;")
	public static Class125 aClass125_49 = new Class125(64);

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method3991(@OriginalArg(1) Class8_Sub2 arg0) {
		if (arg0.aByteArray24.length - arg0.anInt2955 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method2334();
		if (local22 < 0 || local22 > 11) {
			return;
		}
		@Pc(49) byte local49;
		if (local22 == 11) {
			local49 = 33;
		} else if (local22 == 10) {
			local49 = 32;
		} else if (local22 == 9) {
			local49 = 31;
		} else if (local22 == 8) {
			local49 = 30;
		} else if (local22 == 7) {
			local49 = 29;
		} else if (local22 == 6) {
			local49 = 28;
		} else if (local22 == 5) {
			local49 = 28;
		} else if (local22 == 4) {
			local49 = 24;
		} else if (local22 == 3) {
			local49 = 23;
		} else if (local22 == 2) {
			local49 = 22;
		} else if (local22 == 1) {
			local49 = 23;
		} else {
			local49 = 19;
		}
		if (local49 > arg0.aByteArray24.length - arg0.anInt2955) {
			return;
		}
		Static54.anInt1180 = arg0.method2334();
		if (Static54.anInt1180 < 1) {
			Static54.anInt1180 = 1;
		} else if (Static54.anInt1180 > 4) {
			Static54.anInt1180 = 4;
		}
		Static273.method4053(arg0.method2334() == 1);
		Static11.aBoolean244 = arg0.method2334() == 1;
		Static113.aBoolean182 = arg0.method2334() == 1;
		Static214.aBoolean355 = arg0.method2334() == 1;
		Static153.aBoolean257 = arg0.method2334() == 1;
		Static37.aBoolean314 = arg0.method2334() == 1;
		Static198.aBoolean317 = arg0.method2334() == 1;
		Static150.aBoolean367 = arg0.method2334() == 1;
		Static270.anInt5337 = arg0.method2334();
		if (Static270.anInt5337 > 2) {
			Static270.anInt5337 = 2;
		}
		if (local22 >= 2) {
			Static76.aBoolean117 = arg0.method2334() == 1;
		} else {
			Static76.aBoolean117 = arg0.method2334() == 1;
			arg0.method2334();
		}
		Static273.aBoolean455 = arg0.method2334() == 1;
		Static35.aBoolean50 = arg0.method2334() == 1;
		Static174.anInt3451 = arg0.method2334();
		if (Static174.anInt3451 > 2) {
			Static174.anInt3451 = 2;
		}
		Static215.anInt4429 = Static174.anInt3451;
		Static277.aBoolean477 = arg0.method2334() == 1;
		Static172.anInt3426 = arg0.method2334();
		if (Static172.anInt3426 > 127) {
			Static172.anInt3426 = 127;
		}
		Static275.anInt5409 = arg0.method2334();
		Static106.anInt2205 = arg0.method2334();
		if (Static106.anInt2205 > 127) {
			Static106.anInt2205 = 127;
		}
		if (local22 >= 1) {
			Static229.anInt4665 = arg0.method2375();
			Static172.anInt3425 = arg0.method2375();
		}
		if (local22 >= 3 && local22 < 6) {
			arg0.method2334();
		}
		if (local22 >= 4) {
			@Pc(387) int local387 = arg0.method2334();
			if (Static16.anInt3524 < 96) {
				local387 = 0;
			}
			Static223.method3485(local387);
		}
		if (local22 >= 5) {
			Static185.anInt3690 = arg0.method2352();
		}
		if (local22 >= 6) {
			Static99.anInt2072 = arg0.method2334();
		}
		if (local22 >= 7) {
			Static163.aBoolean361 = arg0.method2334() == 1;
		}
		if (local22 >= 8) {
			Static109.aBoolean177 = arg0.method2334() == 1;
		}
		if (local22 >= 9) {
			Static279.anInt5448 = arg0.method2334();
		}
		if (local22 >= 10) {
			Static270.aBoolean450 = arg0.method2334() != 0;
		}
		if (local22 >= 11) {
			Static81.aBoolean129 = arg0.method2334() != 0;
		}
	}
}
