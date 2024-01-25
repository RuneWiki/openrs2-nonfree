import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_146 = new Class209("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)Z")
	public static boolean method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBILclient!sk;)V")
	public static void method5054(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class3_Sub2_Sub1_Sub2 arg2) {
		@Pc(15) int local15 = arg2.anIntArray525[0];
		@Pc(20) int local20 = arg2.anIntArray524[0];
		if (local15 < 0 || Static229.anInt4427 <= local15 || local20 < 0 || local20 >= Static379.anInt6422 || (arg0 < 0 || Static229.anInt4427 <= arg0 || arg1 < 0 || arg1 >= Static379.anInt6422)) {
			return;
		}
		@Pc(76) int local76 = Static343.method4718(true, Static411.anIntArray583, arg2.method4935(), Static194.aClass70Array1[arg2.aByte89], 0, 0, local15, 0, arg1, 0, -4, arg0, Static77.anIntArray145, local20);
		if (local76 >= 1 && local76 <= 3) {
			for (@Pc(88) int local88 = 0; local88 < local76 - 1; local88++) {
				arg2.method4944(Static411.anIntArray583[local88], (byte) 2, Static77.anIntArray145[local88]);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIZII)V")
	public static void method5055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg5) {
			Static146.method2432(arg4, arg1, arg6, arg0, arg2, arg3);
		} else if (arg4 - arg2 >= Static8.anInt223 && Static184.anInt3600 >= arg4 + arg2 && arg0 - arg5 >= Static430.anInt7123 && Static181.anInt3543 >= arg0 + arg5) {
			Static70.method1329(arg5, arg0, arg3, arg1, arg4, arg6, arg2);
		} else {
			Static235.method4900(arg4, arg0, arg3, arg2, arg5, arg6, arg1);
		}
	}
}
