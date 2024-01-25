import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	public static int anInt4939;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)Z")
	public static boolean method4321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIZIJIILclient!om;)V")
	public static void method4322(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) long arg2, @OriginalArg(7) Class246 arg3) {
		Static487.anInt7851 = arg1;
		anInt4939 = 0;
		Static564.aBoolean704 = false;
		Static375.anInt6351 = 1;
		Static10.aClass246_11 = arg3;
		Static526.anInt8323 = 10000;
		Static478.anInt7778 = arg0;
		Static588.aLong81 = arg2;
		Static206.anInt4170 = 10000;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZILclient!lk;)V")
	public static void method4323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2) {
		if (Static380.aBoolean537) {
			@Pc(23) Class14 local23 = Static472.anInt7697 == -1 ? null : Static69.aClass118_1.method3019(Static472.anInt7697);
			if (Static69.method1651(arg2).method572() && (Static301.anInt5410 & 0x20) != 0 && (local23 == null || arg2.method4773(local23.anInt534, Static472.anInt7697) != local23.anInt534)) {
				Static577.method3272(57, arg2.anInt5531, arg2.anInt5507, 0L, Static484.aString107, arg2.anInt5504, true, Static466.aString125 + " -> " + arg2.aString71, Static456.anInt8051, false);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static316.method7580(arg2, local78);
			if (local85 != null) {
				Static577.method3272(1006, arg2.anInt5531, arg2.anInt5507, (long) (local78 + 1), local85, arg2.anInt5504, true, arg2.aString71, Static148.method2768(arg2, local78), false);
			}
		}
		local85 = Static495.method6684(arg2);
		if (local85 != null) {
			Static577.method3272(2, arg2.anInt5531, arg2.anInt5507, 0L, local85, arg2.anInt5504, true, arg2.aString71, arg2.anInt5441, false);
		}
		for (@Pc(146) int local146 = 4; local146 >= 0; local146--) {
			@Pc(153) String local153 = Static316.method7580(arg2, local146);
			if (local153 != null) {
				Static577.method3272(10, arg2.anInt5531, arg2.anInt5507, (long) (local146 + 1), local153, arg2.anInt5504, true, arg2.aString71, Static148.method2768(arg2, local146), false);
			}
		}
		if (!Static69.method1651(arg2).method574()) {
			return;
		}
		if (arg2.aString72 == null) {
			Static577.method3272(46, arg2.anInt5531, arg2.anInt5507, 0L, Static48.aClass33_11.method797(Static131.anInt2839), arg2.anInt5504, true, "", -1, false);
		} else {
			Static577.method3272(46, arg2.anInt5531, arg2.anInt5507, 0L, arg2.aString72, arg2.anInt5504, true, "", -1, false);
		}
	}
}
