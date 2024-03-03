import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 61)
	public static void method2692() {
		for (@Pc(14) Class2_Sub37 local14 = (Class2_Sub37) Class145.aClass135_26.method3552(); local14 != null; local14 = (Class2_Sub37) Class145.aClass135_26.method3553()) {
			if (local14.anInt6473 == -1) {
				local14.anInt6476 = 0;
				Static79.method1908(local14);
			} else {
				local14.method6469();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lclient!jd;I)V", line = 88)
	public static void method2693(@OriginalArg(0) Class13[] arg0) {
		Static336.anInt6757 = arg0.length;
		Static125.aClass13Array12 = new Class13[Static336.anInt6757 + 10];
		Static68.anIntArray114 = new int[Static336.anInt6757 + 10];
		Static390.method4610(arg0, 0, Static125.aClass13Array12, 0, Static336.anInt6757);
		for (@Pc(31) int local31 = 0; local31 < Static336.anInt6757; local31++) {
			Static68.anIntArray114[local31] = Static125.aClass13Array12[local31].method6385();
		}
		for (@Pc(50) int local50 = Static336.anInt6757; local50 < Static125.aClass13Array12.length; local50++) {
			Static68.anIntArray114[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I", line = 117)
	public static int method2694() {
		if (Static338.aFrame2 == null) {
			return Class11_Sub5_Sub6.aBoolean464 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
