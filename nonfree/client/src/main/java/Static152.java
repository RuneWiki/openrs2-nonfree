import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!kb;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_50 = new Class45("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Lclient!qn;")
	public static Class20_Sub4 method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub4_1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method2809() {
		Static344.aClass277_49.method7026();
		Static303.aClass277_43.method7026();
		Static8.aClass277_5.method7026();
		Static125.aClass277_21.method7026();
		Static207.aClass277_30.method7026();
	}
}
