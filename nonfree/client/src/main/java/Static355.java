import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!pl;")
	public static Class259 aClass259_113;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!sa;")
	public static Class294 aClass294_8;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!pl;")
	public static Class259 aClass259_114;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_14 = new Class113(5, 4);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5271(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static81.anInt1768 >= 100) {
			Static52.method905(Static290.aClass198_41.method4365(Static52.anInt1264));
			return;
		}
		@Pc(31) String local31 = Static281.method4201(arg1);
		if (local31 == null) {
			return;
		}
		@Pc(75) String local75;
		for (@Pc(36) int local36 = 0; local36 < Static81.anInt1768; local36++) {
			@Pc(44) String local44 = Static281.method4201(Static360.aStringArray115[local36]);
			if (local44 != null && local44.equals(local31)) {
				Static52.method905(arg1 + Static290.aClass198_42.method4365(Static52.anInt1264));
				return;
			}
			if (Static323.aStringArray99[local36] != null) {
				local75 = Static281.method4201(Static323.aStringArray99[local36]);
				if (local75 != null && local75.equals(local31)) {
					Static52.method905(arg1 + Static290.aClass198_42.method4365(Static52.anInt1264));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static451.anInt487; local102++) {
			local75 = Static281.method4201(Static306.aStringArray92[local102]);
			if (local75 != null && local75.equals(local31)) {
				Static52.method905(Static290.aClass198_47.method4365(Static52.anInt1264) + arg1 + Static290.aClass198_48.method4365(Static52.anInt1264));
				return;
			}
			if (Static362.aStringArray106[local102] != null) {
				@Pc(146) String local146 = Static281.method4201(Static362.aStringArray106[local102]);
				if (local146 != null && local146.equals(local31)) {
					Static52.method905(Static290.aClass198_47.method4365(Static52.anInt1264) + arg1 + Static290.aClass198_48.method4365(Static52.anInt1264));
					return;
				}
			}
		}
		if (Static281.method4201(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67).equals(local31)) {
			Static52.method905(Static290.aClass198_44.method4365(Static52.anInt1264));
			return;
		}
		@Pc(204) Class2_Sub42 local204 = Static249.method3910(Static332.aClass286_109, Static400.aClass145_2);
		local204.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg1) + 1);
		local204.aClass2_Sub15_Sub2_2.method4313(arg1);
		local204.aClass2_Sub15_Sub2_2.method4333(arg0 ? 1 : 0);
		Static531.method7296(local204);
	}
}
