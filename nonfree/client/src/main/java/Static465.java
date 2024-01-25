import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method7072() {
		if (Static238.aClass228Array1 == null) {
			Static238.aClass228Array1 = Static385.method6195();
			Static308.aClass228_2 = Static238.aClass228Array1[0];
			Static321.aLong163 = Static32.method595();
		}
		if (Static645.aClass121_1 == null) {
			Static559.method8060();
		}
		@Pc(28) Class228 local28 = Static308.aClass228_2;
		@Pc(31) int local31 = Static446.method6913();
		if (Static308.aClass228_2 == local28) {
			Static148.aString30 = Static308.aClass228_2.aClass192_63.method5299(Static307.anInt5931);
			if (Static308.aClass228_2.aBoolean495) {
				Static621.anInt10237 = Static308.aClass228_2.anInt7289 + local31 * (Static308.aClass228_2.anInt7287 - Static308.aClass228_2.anInt7289) / 100;
			}
			if (Static308.aClass228_2.aBoolean496) {
				Static148.aString30 = Static148.aString30 + Static621.anInt10237 + "%";
			}
		} else if (Static308.aClass228_2 == Static385.aClass228_23) {
			Static645.aClass121_1 = null;
			Static190.method3390(3);
		} else {
			Static148.aString30 = local28.aClass192_64.method5299(Static307.anInt5931);
			Static621.anInt10237 = local28.anInt7287;
			if (Static308.aClass228_2.aBoolean496) {
				Static148.aString30 = Static148.aString30 + local28.anInt7287 + "%";
			}
			if (Static308.aClass228_2.aBoolean495 || local28.aBoolean495) {
				Static321.aLong163 = Static32.method595();
			}
		}
		if (Static645.aClass121_1 == null) {
			return;
		}
		Static645.aClass121_1.method3460(Static321.aLong163, Static148.aString30, Static621.anInt10237, Static308.aClass228_2);
		if (Static262.anInterface6Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static544.anInt9352 + 1; local130 < Static262.anInterface6Array1.length; local130++) {
			if (Static262.anInterface6Array1[local130].method7227() >= 100 && Static544.anInt9352 == local130 - 1 && Static554.anInt1821 >= 1 && Static645.aClass121_1.method3459()) {
				try {
					Static262.anInterface6Array1[local130].method7226();
				} catch (@Pc(166) Exception local166) {
					Static262.anInterface6Array1 = null;
					return;
				}
				Static645.aClass121_1.method3467(Static262.anInterface6Array1[local130]);
				Static544.anInt9352++;
				if (Static544.anInt9352 >= Static262.anInterface6Array1.length - 1 && Static262.anInterface6Array1.length > 1) {
					Static544.anInt9352 = Static426.aClass36_1.method846() ? 0 : -1;
				}
			}
		}
		return;
	}
}
