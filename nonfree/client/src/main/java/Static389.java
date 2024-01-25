import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!oi;")
	public static Class185 aClass185_102;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!wm;Z)Lclient!me;")
	public static Class46_Sub2 method5002(@OriginalArg(0) Class1_Sub19 arg0) {
		return new Class46_Sub2(arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2881(), arg0.method2915());
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public static void method5003(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static413.aClass1_Sub19_Sub2_1.method2948(Static379.anInt119) >= 15) {
				@Pc(16) int local16 = Static413.aClass1_Sub19_Sub2_1.method2946(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(32) Class1_Sub44 local32 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local16);
					@Pc(38) Class11_Sub1_Sub3_Sub1 local38;
					if (local32 == null) {
						local38 = new Class11_Sub1_Sub3_Sub1();
						local38.anInt3279 = local16;
						local32 = new Class1_Sub44(local38);
						Static46.aClass208_33.method4413((long) local16, local32);
						Static47.aClass1_Sub44Array1[Static406.anInt6516++] = local32;
						local23 = true;
					}
					local38 = local32.aClass11_Sub1_Sub3_Sub1_2;
					Static135.anIntArray183[Static137.anInt2142++] = local16;
					local38.lb = Static98.anInt1304;
					if (local38.aClass272_1 != null && local38.aClass272_1.method5899()) {
						Static136.method1742(local38);
					}
					@Pc(92) int local92 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
					if (local92 == 1) {
						Static111.anIntArray154[Static383.anInt6137++] = local16;
					}
					@Pc(110) int local110;
					if (arg0) {
						local110 = Static413.aClass1_Sub19_Sub2_1.method2946(8);
						if (local110 > 127) {
							local110 -= 256;
						}
					} else {
						local110 = Static413.aClass1_Sub19_Sub2_1.method2946(5);
						if (local110 > 15) {
							local110 -= 32;
						}
					}
					@Pc(136) int local136;
					if (arg0) {
						local136 = Static413.aClass1_Sub19_Sub2_1.method2946(8);
						if (local136 > 127) {
							local136 -= 256;
						}
					} else {
						local136 = Static413.aClass1_Sub19_Sub2_1.method2946(5);
						if (local136 > 15) {
							local136 -= 32;
						}
					}
					@Pc(160) int local160 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
					@Pc(171) int local171 = Static413.aClass1_Sub19_Sub2_1.method2946(3) + 4 << 11 & 0x3AC8;
					local38.method1303(Static428.aClass196_1.method4163(Static413.aClass1_Sub19_Sub2_1.method2946(14)));
					@Pc(188) int local188 = Static413.aClass1_Sub19_Sub2_1.method2946(2);
					local38.method2637(local38.aClass272_1.anInt7346);
					local38.anInt3297 = local38.aClass272_1.anInt7317 << 3;
					if (local23) {
						local38.method2642(local171, true);
					}
					local38.method1299(Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] + local136, local160 == 1, local188, local38.method2635(), local110 + Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0]);
					if (local38.aClass272_1.method5899()) {
						Static123.method1515(0, local38.anIntArray246[0], local38, local38.anIntArray247[0], local38.aByte90, null, null);
					}
					continue;
				}
			}
			Static413.aClass1_Sub19_Sub2_1.method2940();
			return;
		}
	}
}
