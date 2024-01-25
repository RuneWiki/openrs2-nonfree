import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_73 = new Class117("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method3683() {
		Static141.aClass26_22.method328();
		Static132.aClass26_21.method328();
		Static136.aClass26_59.method328();
		Static222.aClass26_42.method328();
		Static157.aClass26_28.method328();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3687(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static151.method2277(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static264.anInt5400; local29++) {
			@Pc(35) String local35 = Static110.aStringArray34[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static151.method2277(local35);
			if (local35 != null && local35.equals(local24)) {
				Static264.anInt5400--;
				for (@Pc(59) int local59 = local29; local59 < Static264.anInt5400; local59++) {
					Static110.aStringArray34[local59] = Static110.aStringArray34[local59 + 1];
					Static92.aStringArray11[local59] = Static92.aStringArray11[local59 + 1];
					Static348.aStringArray52[local59] = Static348.aStringArray52[local59 + 1];
					Static189.aStringArray5[local59] = Static189.aStringArray5[local59 + 1];
					Static144.aBooleanArray12[local59] = Static144.aBooleanArray12[local59 + 1];
				}
				Static30.anInt546 = Static301.anInt5969;
				Static313.aClass11_Sub25_Sub1_5.method2454(96);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg0));
				Static313.aClass11_Sub25_Sub1_5.method5173(arg0);
				return;
			}
		}
	}
}
