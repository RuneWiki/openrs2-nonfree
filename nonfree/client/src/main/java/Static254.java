import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!og", name = "u", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_160 = new Class221("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method4010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static332.anInt5823 && Static202.anInt3722 >= arg5 && arg4 >= Static332.anInt5823 && Static202.anInt3722 >= arg4 && arg0 >= Static332.anInt5823 && arg0 <= Static202.anInt3722 && Static332.anInt5823 <= arg8 && Static202.anInt3722 >= arg8 && Static313.anInt5542 <= arg2 && Static345.anInt6084 >= arg2 && Static313.anInt5542 <= arg3 && Static345.anInt6084 >= arg3 && Static313.anInt5542 <= arg1 && arg1 <= Static345.anInt6084 && Static313.anInt5542 <= arg6 && arg6 <= Static345.anInt6084) {
			Static342.method5239(arg0, arg4, arg8, arg5, arg1, arg6, arg3, arg7, arg2);
		} else {
			Static199.method3342(arg2, arg6, arg0, arg4, arg5, arg3, arg1, arg8, arg7);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method4014(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static76.anInt1483;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class225 local22 = Static284.aClass249_1.method5715(arg0[local13]);
			if (local22.anInt6148 != -1) {
				@Pc(35) Class5 local35 = (Class5) Static363.aClass154_49.method3751((long) local22.anInt6148);
				if (local35 == null) {
					@Pc(43) Class224 local43 = Static404.method5304(Static119.aClass71_25, local22.anInt6148, 0);
					if (local43 != null) {
						local35 = Static304.aClass82_4.method4514(local43);
						Static363.aClass154_49.method3745((long) local22.anInt6148, local35);
					}
				}
				if (local35 != null) {
					Static52.aClass5Array11[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
	public static void method4015(@OriginalArg(1) int arg0) {
		Static318.anInt4656 = arg0;
		Static203.anInt3731 = -1;
		Static203.anInt3731 = -1;
		Static149.method2528();
	}
}
