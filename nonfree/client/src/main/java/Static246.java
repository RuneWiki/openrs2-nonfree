import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method3820() {
		Static4.aClass313_59.method6977();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method3822() {
		if (Static549.anInt8926 < 0) {
			Static415.anInt7185 = -1;
			Static264.anInt4873 = -1;
			Static549.anInt8926 = 0;
		}
		if (Static270.anInt1797 < Static549.anInt8926) {
			Static549.anInt8926 = Static270.anInt1797;
			Static264.anInt4873 = -1;
			Static415.anInt7185 = -1;
		}
		if (Static75.anInt1651 < 0) {
			Static75.anInt1651 = 0;
			Static264.anInt4873 = -1;
			Static415.anInt7185 = -1;
		}
		if (Static75.anInt1651 > Static270.anInt1805) {
			Static75.anInt1651 = Static270.anInt1805;
			Static415.anInt7185 = -1;
			Static264.anInt4873 = -1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method3824() {
		if (Static272.aClass204Array1 == null) {
			Static272.aClass204Array1 = Static302.method4546();
			Static372.aClass204_24 = Static272.aClass204Array1[0];
			Static493.aLong227 = Static548.method7437();
		}
		if (Static527.aClass175_1 == null) {
			Static229.method3606();
		}
		@Pc(25) Class204 local25 = Static372.aClass204_24;
		@Pc(28) int local28 = Static224.method3513();
		if (local25 == Static372.aClass204_24) {
			Static199.aString24 = Static372.aClass204_24.aClass198_66.method4365(Static52.anInt1264);
			if (Static372.aClass204_24.aBoolean427) {
				Static20.anInt8162 = local28 * (Static372.aClass204_24.anInt5420 - Static372.aClass204_24.anInt5422) / 100 + Static372.aClass204_24.anInt5422;
			}
			if (Static372.aClass204_24.aBoolean428) {
				Static199.aString24 = Static199.aString24 + Static20.anInt8162 + "%";
			}
		} else if (Static372.aClass204_24 == Static302.aClass204_23) {
			Static527.aClass175_1 = null;
			Static121.method1780(3);
		} else {
			Static199.aString24 = local25.aClass198_65.method4365(Static52.anInt1264);
			if (Static372.aClass204_24.aBoolean428) {
				Static199.aString24 = Static199.aString24 + local25.anInt5420 + "%";
			}
			Static20.anInt8162 = local25.anInt5420;
			if (Static372.aClass204_24.aBoolean427 || local25.aBoolean427) {
				Static493.aLong227 = Static548.method7437();
			}
		}
		if (Static527.aClass175_1 == null) {
			return;
		}
		Static527.aClass175_1.method3940(Static372.aClass204_24, Static493.aLong227, Static20.anInt8162, Static199.aString24);
		if (Static276.anInterface1Array2 == null) {
			return;
		}
		for (@Pc(132) int local132 = Static353.anInt6341 + 1; local132 < Static276.anInterface1Array2.length; local132++) {
			if (Static276.anInterface1Array2[local132].method5716() >= 100 && local132 - 1 == Static353.anInt6341 && Static201.anInt3963 >= 1 && Static527.aClass175_1.method3942()) {
				try {
					Static276.anInterface1Array2[local132].method5714();
				} catch (@Pc(166) Exception local166) {
					Static276.anInterface1Array2 = null;
					return;
				}
				Static527.aClass175_1.method3937(Static276.anInterface1Array2[local132]);
				Static353.anInt6341++;
				if (Static276.anInterface1Array2.length - 1 <= Static353.anInt6341 && Static276.anInterface1Array2.length > 1) {
					Static353.anInt6341 = Static305.aClass65_1.method1197() ? 0 : -1;
				}
			}
		}
		return;
	}
}
