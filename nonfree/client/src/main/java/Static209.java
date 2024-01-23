import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!ph;")
	public static Class138 aClass138_57;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static volatile int anInt4120 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method3311() {
		Static253.aFontMetrics3 = null;
		Static263.aFont1 = null;
		Static307.anImage4 = null;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public static void method3312() {
		Static237.method2927(Static9.aClass146_11);
		Static82.anInt1499++;
		if (Static19.aBoolean25 && Static26.aBoolean32) {
			@Pc(26) int local26 = Static152.anInt3132;
			@Pc(28) int local28 = Static300.anInt5678;
			local26 -= Static168.anInt5865;
			local28 -= Static312.anInt5847;
			if (local26 < Static217.anInt4265) {
				local26 = Static217.anInt4265;
			}
			@Pc(45) int local45 = Static9.aClass146_11.anInt4399;
			if (Static87.aClass146_6.anInt4345 + Static217.anInt4265 < Static9.aClass146_11.anInt4345 + local26) {
				local26 = Static87.aClass146_6.anInt4345 + Static217.anInt4265 - Static9.aClass146_11.anInt4345;
			}
			@Pc(69) int local69 = local26 - Static146.anInt2879;
			@Pc(78) int local78 = local26 + Static87.aClass146_6.anInt4341 - Static217.anInt4265;
			if (local28 < Static217.anInt4274) {
				local28 = Static217.anInt4274;
			}
			if (Static87.aClass146_6.anInt4371 + Static217.anInt4274 < local28 - -Static9.aClass146_11.anInt4371) {
				local28 = Static217.anInt4274 + Static87.aClass146_6.anInt4371 - Static9.aClass146_11.anInt4371;
			}
			@Pc(116) int local116 = Static87.aClass146_6.anInt4418 + local28 - Static217.anInt4274;
			@Pc(121) int local121 = local28 - Static313.anInt5906;
			if (Static82.anInt1499 > Static9.aClass146_11.anInt4368 && (local69 > local45 || -local45 > local69 || local121 > local45 || local121 < -local45)) {
				Static271.aBoolean369 = true;
			}
			@Pc(162) Class1_Sub29 local162;
			if (Static9.aClass146_11.anObjectArray6 != null && Static271.aBoolean369) {
				local162 = new Class1_Sub29();
				local162.anObjectArray32 = Static9.aClass146_11.anObjectArray6;
				local162.aClass146_16 = Static9.aClass146_11;
				local162.anInt5100 = local78;
				local162.anInt5104 = local116;
				Static171.method2886(local162);
			}
			if (Static191.anInt3909 == 0) {
				if (Static271.aBoolean369) {
					if (Static9.aClass146_11.anObjectArray18 != null) {
						local162 = new Class1_Sub29();
						local162.aClass146_17 = Static173.aClass146_12;
						local162.anInt5104 = local116;
						local162.anObjectArray32 = Static9.aClass146_11.anObjectArray18;
						local162.aClass146_16 = Static9.aClass146_11;
						local162.anInt5100 = local78;
						Static171.method2886(local162);
					}
					if (Static173.aClass146_12 != null && Static36.method644(Static9.aClass146_11) != null) {
						Static137.aClass1_Sub14_Sub1_6.method2661(235);
						Static137.aClass1_Sub14_Sub1_6.method2642(Static9.aClass146_11.anInt4407);
						Static137.aClass1_Sub14_Sub1_6.method2630(Static9.aClass146_11.anInt4355);
						Static137.aClass1_Sub14_Sub1_6.method2644(Static173.aClass146_12.anInt4355);
						Static137.aClass1_Sub14_Sub1_6.method2642(Static173.aClass146_12.anInt4407);
					}
				} else if ((Static287.anInt5451 == 1 || Static277.method4117(Static316.anInt5941 - 1)) && Static316.anInt5941 > 2) {
					Static35.method598();
				} else if (Static316.anInt5941 > 0) {
					Static300.method4499();
				}
				Static9.aClass146_11 = null;
			}
		} else if (Static82.anInt1499 > 1) {
			Static9.aClass146_11 = null;
		}
	}
}
