import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_115 = new Class154(66, 2);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method6625(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class273 local8 = Static494.method6329(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray10 != null) {
			@Pc(18) Class2_Sub10 local18 = new Class2_Sub10();
			local18.aClass273_4 = local8;
			local18.anObjectArray1 = local8.anObjectArray10;
			local18.anInt1602 = arg2;
			local18.aString22 = arg1;
			Static566.method7398(local18);
		}
		if (Static540.anInt8912 != 10 || !Static70.method1164(local8).method2771(arg2 - 1)) {
			return;
		}
		@Pc(60) Class2_Sub34 local60;
		if (arg2 == 1) {
			local60 = Static555.method7264(Static407.aClass154_88, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 2) {
			local60 = Static555.method7264(Static208.aClass154_42, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 3) {
			local60 = Static555.method7264(Static196.aClass154_39, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 4) {
			local60 = Static555.method7264(Static17.aClass154_57, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 5) {
			local60 = Static555.method7264(Static407.aClass154_89, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 6) {
			local60 = Static555.method7264(Static217.aClass154_46, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 7) {
			local60 = Static555.method7264(Static411.aClass154_90, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 8) {
			local60 = Static555.method7264(Static345.aClass154_74, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 9) {
			local60 = Static555.method7264(Static277.aClass154_55, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
		if (arg2 == 10) {
			local60 = Static555.method7264(Static47.aClass154_7, Static551.aClass64_2);
			Static518.method6692(arg0, local60, local8.anInt6805, arg3);
			Static100.method1508(local60);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method6626() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static416.aBooleanArray7[local11] = false;
		}
		Static582.anInt9451 = 0;
		Static203.anInt2978 = -1;
		Static148.anInt2359 = -1;
		Static181.anInt2686 = 0;
		Static2.anInt12 = -1;
		Static489.anInt7763 = 1;
		Static264.anInt4328 = -1;
	}
}
