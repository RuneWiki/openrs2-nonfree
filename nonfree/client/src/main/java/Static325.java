import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
	public static int anInt9475;

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_47 = new Class201(13, 0, 1, 0);

	@OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
	public static int anInt9473 = -1;

	@OriginalMember(owner = "client!mga", name = "q", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_227 = new Class81(23, 6);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
	public static void method7828() {
		Static595.aClass31_1.method984();
		Static287.aClass256_8.method7563();
		Static550.aClient1.method1543();
		Static26.aCanvas3.setBackground(Color.black);
		Static573.anInt9326 = -1;
		Static595.aClass31_1 = Static49.method1139(Static26.aCanvas3);
		Static287.aClass256_8 = Static108.method5951(Static26.aCanvas3);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7830(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static54.anInt1399 >= 100) {
			Static172.method2626(Static103.aClass77_41.method1864(Static562.anInt9127));
			return;
		}
		@Pc(25) String local25 = Static344.method5101(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(30) int local30 = 0; local30 < Static54.anInt1399; local30++) {
			@Pc(40) String local40 = Static344.method5101(Static568.aStringArray40[local30]);
			if (local40 != null && local40.equals(local25)) {
				Static172.method2626(arg0 + Static103.aClass77_42.method1864(Static562.anInt9127));
				return;
			}
			if (Static279.aStringArray22[local30] != null) {
				local71 = Static344.method5101(Static279.aStringArray22[local30]);
				if (local71 != null && local71.equals(local25)) {
					Static172.method2626(arg0 + Static103.aClass77_42.method1864(Static562.anInt9127));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static184.anInt5417; local98++) {
			local71 = Static344.method5101(Static333.aStringArray26[local98]);
			if (local71 != null && local71.equals(local25)) {
				Static172.method2626(Static103.aClass77_47.method1864(Static562.anInt9127) + arg0 + Static103.aClass77_48.method1864(Static562.anInt9127));
				return;
			}
			if (Static498.aStringArray34[local98] != null) {
				@Pc(142) String local142 = Static344.method5101(Static498.aStringArray34[local98]);
				if (local142 != null && local142.equals(local25)) {
					Static172.method2626(Static103.aClass77_47.method1864(Static562.anInt9127) + arg0 + Static103.aClass77_48.method1864(Static562.anInt9127));
					return;
				}
			}
		}
		if (Static344.method5101(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49).equals(local25)) {
			Static172.method2626(Static103.aClass77_44.method1864(Static562.anInt9127));
			return;
		}
		@Pc(200) Class1_Sub48 local200 = Static320.method4867(Static442.aClass170_2, Static280.aClass319_93);
		local200.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0) + 1);
		local200.aClass1_Sub20_Sub1_2.method4399(arg0);
		local200.aClass1_Sub20_Sub1_2.method4378(arg1 ? 1 : 0);
		Static34.method813(local200);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	public static void method7831() {
		for (@Pc(10) Class1_Sub30 local10 = (Class1_Sub30) Static201.aClass361_70.method7854(); local10 != null; local10 = (Class1_Sub30) Static201.aClass361_70.method7853()) {
			if (local10.aBoolean421) {
				local10.method4968();
			}
		}
		for (@Pc(34) Class1_Sub30 local34 = (Class1_Sub30) Static381.aClass361_69.method7854(); local34 != null; local34 = (Class1_Sub30) Static381.aClass361_69.method7853()) {
			if (local34.aBoolean421) {
				local34.method4968();
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z")
	public static boolean method7832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
