import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!ha;Lclient!uaa;I)V")
	public static void method4058(@OriginalArg(1) int arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class345 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 63; local9 >= 0; local9--) {
			@Pc(29) int local29 = (local9 & 0x3F) << 10 | 0x380 | 0x3F;
			Static238.method3722(true, false);
			@Pc(37) int local37 = Static336.anIntArray357[local29];
			Static358.method5409(true, false);
			arg1.aa(arg0, arg3 + ((63 - local9) * arg2.anInt9606 >> 6), arg2.anInt9649, (arg2.anInt9606 >> 6) + 1, local37, 0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method4059() {
		if (Static672.aClass259Array1 == null) {
			Static672.aClass259Array1 = Static412.method6134();
			Static123.aClass259_1 = Static672.aClass259Array1[0];
			Static661.aLong303 = Static547.method7619();
		}
		if (Static471.aClass352_41 == null) {
			Static150.method2726();
		}
		@Pc(25) Class259 local25 = Static123.aClass259_1;
		@Pc(28) int local28 = Static88.method1843();
		if (Static123.aClass259_1 == local25) {
			Static667.aString121 = Static123.aClass259_1.aClass52_63.method907(Static544.anInt8937);
			if (Static123.aClass259_1.aBoolean632) {
				Static240.anInt4460 = local28 * (Static123.aClass259_1.anInt7313 - Static123.aClass259_1.anInt7316) / 100 + Static123.aClass259_1.anInt7316;
			}
			if (Static123.aClass259_1.aBoolean631) {
				Static667.aString121 = Static667.aString121 + Static240.anInt4460 + "%";
			}
		} else if (Static412.aClass259_22 == Static123.aClass259_1) {
			Static471.aClass352_41 = null;
			Static271.method4671(3);
		} else {
			Static667.aString121 = local25.aClass52_64.method907(Static544.anInt8937);
			Static240.anInt4460 = local25.anInt7313;
			if (Static123.aClass259_1.aBoolean631) {
				Static667.aString121 = Static667.aString121 + local25.anInt7313 + "%";
			}
			if (Static123.aClass259_1.aBoolean632 || local25.aBoolean632) {
				Static661.aLong303 = Static547.method7619();
			}
		}
		if (Static471.aClass352_41 == null) {
			return;
		}
		Static471.aClass352_41.method8256(Static661.aLong303, Static123.aClass259_1, Static240.anInt4460, Static667.aString121);
		if (Static655.anInterface5Array1 == null) {
			return;
		}
		for (@Pc(133) int local133 = Static518.anInt8631 + 1; local133 < Static655.anInterface5Array1.length; local133++) {
			if (Static655.anInterface5Array1[local133].method8489() >= 100 && local133 - 1 == Static518.anInt8631 && Static173.anInt3397 >= 1 && Static471.aClass352_41.method8259()) {
				try {
					Static655.anInterface5Array1[local133].method8494();
				} catch (@Pc(163) Exception local163) {
					Static655.anInterface5Array1 = null;
					return;
				}
				Static471.aClass352_41.method8254(Static655.anInterface5Array1[local133]);
				Static518.anInt8631++;
				if (Static518.anInt8631 >= Static655.anInterface5Array1.length - 1 && Static655.anInterface5Array1.length > 1) {
					Static518.anInt8631 = Static189.aClass267_1.method6304() ? 0 : -1;
				}
			}
		}
		return;
	}
}
