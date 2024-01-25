import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "Lclient!bda;")
	public static Class27 aClass27_5;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_118 = new Class319(79, 7);

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "[I")
	public static final int[] anIntArray422 = new int[1];

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_14 = new Class307(5, 1);

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
	public static final int anInt6330 = 1405;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method5275() {
		if (Static295.aClass350Array1 == null) {
			Static295.aClass350Array1 = Static569.method7666();
			Static382.aClass350_1 = Static295.aClass350Array1[0];
			Static576.aLong414 = Static255.method4035();
		}
		if (Static137.aClass260_1 == null) {
			Static400.method7925();
		}
		@Pc(29) Class350 local29 = Static382.aClass350_1;
		@Pc(32) int local32 = Static71.method1512();
		if (Static382.aClass350_1 == local29) {
			Static221.aString43 = Static382.aClass350_1.aClass77_66.method1864(Static562.anInt9127);
			if (Static382.aClass350_1.aBoolean676) {
				Static467.anInt7910 = (Static382.aClass350_1.anInt9280 - Static382.aClass350_1.anInt9278) * local32 / 100 + Static382.aClass350_1.anInt9278;
			}
			if (Static382.aClass350_1.aBoolean677) {
				Static221.aString43 = Static221.aString43 + Static467.anInt7910 + "%";
			}
		} else if (Static382.aClass350_1 == Static569.aClass350_24) {
			Static137.aClass260_1 = null;
			Static243.method3970(3);
		} else {
			Static221.aString43 = local29.aClass77_65.method1864(Static562.anInt9127);
			if (Static382.aClass350_1.aBoolean677) {
				Static221.aString43 = Static221.aString43 + local29.anInt9280 + "%";
			}
			Static467.anInt7910 = local29.anInt9280;
			if (Static382.aClass350_1.aBoolean676 || local29.aBoolean676) {
				Static576.aLong414 = Static255.method4035();
			}
		}
		if (Static137.aClass260_1 == null) {
			return;
		}
		Static137.aClass260_1.method5796(Static576.aLong414, Static467.anInt7910, Static221.aString43, Static382.aClass350_1);
		if (Static509.anInterface22Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static262.anInt4804 + 1; local131 < Static509.anInterface22Array1.length; local131++) {
			if (Static509.anInterface22Array1[local131].method1808() >= 100 && Static262.anInt4804 == local131 - 1 && Static177.anInt2101 >= 1 && Static137.aClass260_1.method5795()) {
				try {
					Static509.anInterface22Array1[local131].method1804();
				} catch (@Pc(165) Exception local165) {
					Static509.anInterface22Array1 = null;
					return;
				}
				Static137.aClass260_1.method5794(Static509.anInterface22Array1[local131]);
				Static262.anInt4804++;
				if (Static262.anInt4804 >= Static509.anInterface22Array1.length - 1 && Static509.anInterface22Array1.length > 1) {
					Static262.anInt4804 = Static3.aClass192_1.method4287() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method5276(@OriginalArg(0) int arg0) {
		if (!Static300.method4703(arg0)) {
			return;
		}
		@Pc(19) Class365[] local19 = Static249.aClass365ArrayArray3[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class365 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt9574 = 1;
				local27.anInt9643 = 0;
				local27.anInt9583 = 0;
			}
		}
	}
}
