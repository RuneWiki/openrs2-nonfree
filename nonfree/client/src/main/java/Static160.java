import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
	public static int anInt8955;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "Lclient!ug;")
	public static final Class294 aClass294_14 = new Class294();

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_132 = new Class45("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_133 = new Class252(47, 3);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public static void method7799() {
		Static235.anInt4528 = 0;
		Static52.anInt4659 = -1;
		Static259.anInt5037 = -1;
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
	public static void method7801() {
		Static415.aClass1_Sub25_3 = new Class1_Sub25(Static90.aClass45_34.method1474(Static544.anInt7853), "", Static245.anInt4711, 1008, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7803(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static442.method6847(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static330.anInt6194; local29++) {
			@Pc(35) String local35 = Static163.aStringArray18[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static442.method6847(local35);
			if (local35 != null && local35.equals(local24)) {
				Static330.anInt6194--;
				for (@Pc(59) int local59 = local29; local59 < Static330.anInt6194; local59++) {
					Static163.aStringArray18[local59] = Static163.aStringArray18[local59 + 1];
					Static223.aStringArray23[local59] = Static223.aStringArray23[local59 + 1];
					Static462.anIntArray734[local59] = Static462.anIntArray734[local59 + 1];
					Static467.aStringArray33[local59] = Static467.aStringArray33[local59 + 1];
					Static296.anIntArray695[local59] = Static296.anIntArray695[local59 + 1];
					Static232.aBooleanArray14[local59] = Static232.aBooleanArray14[local59 + 1];
				}
				Static82.anInt1887 = Static209.anInt4108;
				Static216.method3997(Static442.aClass252_117);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg0));
				Static259.aClass1_Sub17_Sub2_1.method4464(arg0);
				return;
			}
		}
	}
}
