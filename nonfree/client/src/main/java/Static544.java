import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
	public static int anInt7852;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_115 = new Class45("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_396 = new Class305(82, -1);

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_116 = new Class45(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
	public static int anInt7853 = 0;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "(B)Ljava/lang/String;")
	public static String method6943() {
		return Static238.aBoolean354 || Static250.aClass1_Sub25_2 == null ? "" : Static250.aClass1_Sub25_2.aString95;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Lclient!qn;")
	public static Class20_Sub4 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub4_2;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(FFFI)I")
	public static int method6946(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(20) float local20 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(29) float local29 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(38) float local38 = arg0 < 0.0F ? -arg0 : arg0;
		if (local20 < local29 && local29 > local38) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local20 < local38 && local29 < local38) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
