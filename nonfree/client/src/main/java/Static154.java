import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_49 = new Class67("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I")
	public static int method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static222.aShortArrayArray5 == null ? 0 : Static222.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)I")
	public static int method2646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static490.method7169(arg0 - 1, arg1 - 1) + Static490.method7169(arg0 - 1, arg1 - -1) + Static490.method7169(arg0 + 1, arg1 + -1) + Static490.method7169(arg0 + 1, arg1 + 1);
		@Pc(79) int local79 = Static490.method7169(arg0, arg1 - 1) + Static490.method7169(arg0, arg1 + 1) + Static490.method7169(arg0 - 1, arg1) + Static490.method7169(arg0 + 1, arg1);
		@Pc(84) int local84 = Static490.method7169(arg0, arg1);
		return local84 / 4 + local47 / 16 + local79 / 8;
	}
}
