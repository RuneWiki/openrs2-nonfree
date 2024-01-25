import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "Lclient!vk;")
	public static final Class259 aClass259_1 = new Class259(2);

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_67 = new Class231("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_56 = new Class208(18, 8);

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_83 = new Class25(28, -2);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2915(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static259.anInt4591 >= 100 && !Static354.aBoolean431 || Static259.anInt4591 >= 200) {
			Static172.method2536(Static153.aClass231_55.method5261(Static80.anInt6195));
			return;
		}
		@Pc(29) String local29 = Static155.method2318(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static259.anInt4591; local34++) {
			@Pc(42) String local42 = Static155.method2318(Static449.aStringArray67[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static172.method2536(arg0 + Static290.aClass231_86.method5261(Static80.anInt6195));
				return;
			}
			if (Static197.aStringArray41[local34] != null) {
				local72 = Static155.method2318(Static197.aStringArray41[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static172.method2536(arg0 + Static290.aClass231_86.method5261(Static80.anInt6195));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static127.anInt2142; local102++) {
			local72 = Static155.method2318(Static268.aStringArray47[local102]);
			if (local72 != null && local72.equals(local29)) {
				Static172.method2536(Static299.aClass231_93.method5261(Static80.anInt6195) + arg0 + Static58.aClass231_19.method5261(Static80.anInt6195));
				return;
			}
			if (Static80.aStringArray58[local102] != null) {
				@Pc(145) String local145 = Static155.method2318(Static80.aStringArray58[local102]);
				if (local145 != null && local145.equals(local29)) {
					Static172.method2536(Static299.aClass231_93.method5261(Static80.anInt6195) + arg0 + Static58.aClass231_19.method5261(Static80.anInt6195));
					return;
				}
			}
		}
		if (Static155.method2318(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20).equals(local29)) {
			Static172.method2536(Static264.aClass231_81.method5261(Static80.anInt6195));
		} else {
			Static164.method2403(Static460.aClass208_107);
			Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0));
			Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)Z")
	public static boolean method2917() {
		return Static377.anInt6585 > 0;
	}
}
