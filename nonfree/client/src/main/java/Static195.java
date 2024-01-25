import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	public static int anInt3529;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	public static int anInt3530;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "Lclient!of;")
	public static final Class174 aClass174_108 = new Class174("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_94 = new Class163(36, -1);

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "[Lclient!ff;")
	public static final Class69[] aClass69Array1 = new Class69[16];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIILclient!qa;II)Lclient!ka;")
	public static Class108 method3029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(17) Class108 local17 = (Class108) Static284.aClass268_40.method6166(local6);
		if (local17 == null) {
			@Pc(29) Class160 local29 = Static16.method320(Static119.aClass250_38, arg4);
			if (local29 == null) {
				return null;
			}
			if (local29.anInt4540 < 13) {
				local29.method3772();
			}
			local17 = arg3.method5984(local29, 2055, Static373.anInt6326, 64, 768);
			Static284.aClass268_40.method6164(local17, local6);
		}
		local17 = local17.method4930((byte) 2, 2055, true);
		if (arg0 != 0) {
			local17.l(arg0);
		}
		if (arg1 != 0) {
			local17.E(arg1);
		}
		if (arg2 != 0) {
			local17.S(arg2);
		}
		if (arg5 != 0) {
			local17.R(0, arg5, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	public static void method3030() {
		Static214.method3198();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Z")
	public static boolean method3032(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)V")
	public static void method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static399.anInt2866 <= arg5 - arg0 && Static372.anInt6316 >= arg5 + arg0 && Static316.anInt5349 <= arg2 - arg0 && arg0 + arg2 <= Static418.anInt7030) {
			Static317.method4423(arg3, arg0, arg4, arg5, arg1, arg2);
		} else {
			Static306.method4341(arg1, arg3, arg4, arg5, arg0, arg2);
		}
	}
}
