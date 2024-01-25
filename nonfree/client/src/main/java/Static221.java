import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public static int anInt4257;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public static int anInt4262 = 0;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(B)V")
	public static void method3512() {
		if (Static142.aClass344Array1 == null) {
			Static142.aClass344Array1 = Static593.method8155();
			Static481.aClass344_2 = Static142.aClass344Array1[0];
			Static21.aLong372 = Static626.method8479();
		}
		if (Static720.aClass264_1 == null) {
			Static93.method1257();
		}
		@Pc(34) Class344 local34 = Static481.aClass344_2;
		@Pc(37) int local37 = Static562.method7833();
		if (local34 == Static481.aClass344_2) {
			Static678.aString132 = Static481.aClass344_2.aClass279_63.method6992(Static141.anInt2658);
			if (Static481.aClass344_2.aBoolean693) {
				Static317.anInt5605 = local37 * (Static481.aClass344_2.anInt9668 - Static481.aClass344_2.anInt9660) / 100 + Static481.aClass344_2.anInt9660;
			}
			if (Static481.aClass344_2.aBoolean694) {
				Static678.aString132 = Static678.aString132 + Static317.anInt5605 + "%";
			}
		} else if (Static593.aClass344_23 == Static481.aClass344_2) {
			Static720.aClass264_1 = null;
			Static638.method8657(3);
		} else {
			Static678.aString132 = local34.aClass279_64.method6992(Static141.anInt2658);
			Static317.anInt5605 = local34.anInt9668;
			if (Static481.aClass344_2.aBoolean694) {
				Static678.aString132 = Static678.aString132 + local34.anInt9668 + "%";
			}
			if (Static481.aClass344_2.aBoolean693 || local34.aBoolean693) {
				Static21.aLong372 = Static626.method8479();
			}
		}
		if (Static720.aClass264_1 == null) {
			return;
		}
		Static720.aClass264_1.method6401(Static481.aClass344_2, Static678.aString132, Static317.anInt5605, Static21.aLong372);
		if (Static96.anInterface23Array1 == null) {
			return;
		}
		for (@Pc(157) int local157 = Static304.anInt5479 + 1; local157 < Static96.anInterface23Array1.length; local157++) {
			if (Static96.anInterface23Array1[local157].method8331() >= 100 && Static304.anInt5479 == local157 - 1 && Static178.anInt3225 >= 1 && Static720.aClass264_1.method6410()) {
				try {
					Static96.anInterface23Array1[local157].method8327();
				} catch (@Pc(197) Exception local197) {
					Static96.anInterface23Array1 = null;
					return;
				}
				Static720.aClass264_1.method6411(Static96.anInterface23Array1[local157]);
				Static304.anInt5479++;
				if (Static304.anInt5479 >= Static96.anInterface23Array1.length - 1 && Static96.anInterface23Array1.length > 1) {
					Static304.anInt5479 = Static51.aClass70_1.method2022() ? 0 : -1;
				}
			}
		}
		return;
	}
}
