import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!iu", name = "C", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_121 = new Class175("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
	public static int anInt3716 = -50;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!gk;IIII)Lclient!cw;")
	public static Class42_Sub1_Sub1 method3080(@OriginalArg(1) Class75_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean239 || Static39.method920(arg3) && Static39.method920(arg4)) {
			return new Class42_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, true);
		} else if (arg0.aBoolean244) {
			return new Class42_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, true);
		} else {
			return new Class42_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, Static350.method4984(arg3), Static350.method4984(arg4), true);
		}
	}
}
