import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!lm", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Members object";

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)Lclient!hh;")
	public static Class95 method3017(@OriginalArg(1) int arg0) {
		@Pc(10) Class95 local10 = (Class95) Static252.aClass37_84.method915((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static169.aClass134_81.method3009(arg0, 0);
		local10 = new Class95();
		if (local20 != null) {
			local10.method1828(new Class1_Sub21(local20));
		}
		local10.method1826();
		Static252.aClass37_84.method922((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(ZI)V")
	public static void method3027(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static94.aBoolean128) {
			Static94.aBoolean128 = arg0;
			Static226.method4888();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!jb;Z)Z")
	public static boolean method3033(@OriginalArg(0) Interface4 arg0) {
		@Pc(9) Class79 local9 = Static129.method2097(arg0.method5445());
		if (local9.lb == -1) {
			return true;
		} else {
			@Pc(21) Class69 local21 = Static307.method5320(local9.lb);
			return local21.anInt1643 == -1 ? true : local21.method1397();
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public static void method3035() {
		Static142.aClass1_Sub21_Sub2_1.method5763();
		@Pc(18) int local18 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
		if (local18 == 0) {
			return;
		}
		@Pc(26) int local26 = Static142.aClass1_Sub21_Sub2_1.method5756(2);
		if (local26 == 0) {
			Static312.anIntArray623[Static62.anInt6674++] = 2047;
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local26 == 1) {
			local47 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
			Static127.aClass10_Sub1_Sub2_Sub2_1.method3399(local47, 1);
			local57 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			if (local57 == 1) {
				Static312.anIntArray623[Static62.anInt6674++] = 2047;
			}
		} else if (local26 == 2) {
			if (Static142.aClass1_Sub21_Sub2_1.method5756(1) == 1) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
				Static127.aClass10_Sub1_Sub2_Sub2_1.method3399(local47, 2);
				local57 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
				Static127.aClass10_Sub1_Sub2_Sub2_1.method3399(local57, 2);
			} else {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
				Static127.aClass10_Sub1_Sub2_Sub2_1.method3399(local47, 0);
			}
			local47 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			if (local47 == 1) {
				Static312.anIntArray623[Static62.anInt6674++] = 2047;
			}
		} else if (local26 == 3) {
			Static127.anInt2487 = Static142.aClass1_Sub21_Sub2_1.method5756(2);
			local47 = Static142.aClass1_Sub21_Sub2_1.method5756(7);
			local57 = Static142.aClass1_Sub21_Sub2_1.method5756(7);
			@Pc(154) int local154 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			@Pc(159) int local159 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			if (local159 == 1) {
				Static312.anIntArray623[Static62.anInt6674++] = 2047;
			}
			Static127.aClass10_Sub1_Sub2_Sub2_1.method3420(local57, Static127.anInt2487, local154 == 1, local47);
		}
	}
}
