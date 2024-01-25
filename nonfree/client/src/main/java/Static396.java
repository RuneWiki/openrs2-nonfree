import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array18;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_102 = new Class231("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	public static int anInt6555 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public static void method5418(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class48_Sub8 local7 = new Class48_Sub8();
		local7.anInt6588 = arg1;
		local7.anInt6583 = arg3;
		local7.anInt6586 = Static125.anInt2225 + arg4;
		local7.anInt6584 = arg6;
		local7.anInt6590 = arg5;
		local7.aString62 = arg0;
		local7.anInt6589 = arg2;
		Static28.aClass128_1.method2833(local7);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)Lclient!oh;")
	public static Class189 method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static30.aClass189ArrayArrayArray2[0][arg1][arg2] != null && Static30.aClass189ArrayArrayArray2[0][arg1][arg2].aClass189_1 != null;
			if (local28 && arg0 >= Static268.anInt4600 - 1) {
				return null;
			}
			Static304.method4403(arg0, arg1, arg2);
		}
		return Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ol;ILclient!ol;)V")
	public static void method5421(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.aClass6_251 != null) {
			arg0.method5977();
		}
		arg0.aClass6_252 = arg1;
		arg0.aClass6_251 = arg1.aClass6_251;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}
}
