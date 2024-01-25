import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
	public static int anInt5816;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "Lclient!se;")
	public static Class1_Sub40 aClass1_Sub40_3;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Lclient!o;")
	public static final Class169 aClass169_316 = new Class169("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public static void method4993() {
		Static293.aClass17_59.method205();
		for (@Pc(13) Class1_Sub40 local13 = (Class1_Sub40) Static358.aClass17_66.method202(); local13 != null; local13 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			if (local13.anInt5411 < 1000) {
				local13.method5577();
				Static293.aClass17_59.method199(local13);
			}
		}
		Static293.aClass17_59.method198(Static358.aClass17_66);
		@Pc(46) int local46 = -1;
		if (Static379.aClass1_Sub13_1 != null) {
			local46 = Static379.aClass1_Sub13_1.method2558();
		}
		if (!Static65.aBoolean115) {
			if (local46 == 0 && (Static205.anInt3599 == 1 && Static215.anInt3678 > 2 || Static293.method4440())) {
				local46 = 2;
			}
			if (local46 == 2 && Static215.anInt3678 > 0 && Static379.aClass1_Sub13_1 != null) {
				if (Static227.aClass117_14 == null && Static355.anInt4355 == 0) {
					Static314.method4647(Static379.aClass1_Sub13_1.method2559(), Static379.aClass1_Sub13_1.method2554());
				} else {
					Static122.anInt2186 = 2;
				}
			}
			if (local46 == 0 && Static215.anInt3678 > 0) {
				Static264.method4058();
			}
			if (Static227.aClass117_14 != null || Static355.anInt4355 != 0) {
				return;
			}
			Static122.anInt2186 = 0;
			Static180.aClass1_Sub40_2 = null;
			return;
		}
		@Pc(62) int local62;
		@Pc(66) int local66;
		if (local46 == -1) {
			local62 = Static300.aClass182_1.method4112();
			local66 = Static300.aClass182_1.method4121();
			if (local62 < Static90.anInt1655 - 10 || local62 > Static56.anInt1146 + Static90.anInt1655 + 10 || Static38.anInt737 - 10 > local66 || local66 > Static38.anInt737 + Static265.anInt4594 + 10) {
				Static65.aBoolean115 = false;
				Static83.method1220(Static38.anInt737, Static56.anInt1146, Static90.anInt1655, Static265.anInt4594);
			}
		}
		if (local46 != 0) {
			return;
		}
		local62 = Static90.anInt1655;
		local66 = Static38.anInt737;
		@Pc(114) int local114 = Static56.anInt1146;
		@Pc(118) int local118 = Static379.aClass1_Sub13_1.method2559();
		@Pc(122) int local122 = Static379.aClass1_Sub13_1.method2554();
		@Pc(124) int local124 = -1;
		@Pc(144) int local144;
		for (@Pc(126) int local126 = 0; local126 < Static215.anInt3678; local126++) {
			if (Static122.aBoolean178) {
				local144 = local66 + (Static215.anInt3678 + -1 + -local126) * 16 + 33;
				if (local62 < local118 && local118 < local62 + local114 && local144 - 13 < local122 && local144 + 4 > local122) {
					local124 = local126;
				}
			} else {
				local144 = local66 + (Static215.anInt3678 - (local126 + 1)) * 16 + 31;
				if (local118 > local62 && local114 + local62 > local118 && local122 > local144 - 13 && local122 < local144 + 3) {
					local124 = local126;
				}
			}
		}
		if (local124 != -1) {
			local144 = 0;
			@Pc(227) Class186 local227 = new Class186(Static358.aClass17_66);
			for (@Pc(232) Class1_Sub40 local232 = (Class1_Sub40) local227.method4292(); local232 != null; local232 = (Class1_Sub40) local227.method4295()) {
				if (local124 == local144) {
					Static364.method5204(local118, local232, local122);
				}
				local144++;
			}
		}
		Static65.aBoolean115 = false;
		Static83.method1220(Static38.anInt737, Static56.anInt1146, Static90.anInt1655, Static265.anInt4594);
		return;
	}
}
