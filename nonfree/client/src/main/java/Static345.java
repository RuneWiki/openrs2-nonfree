import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_151 = new Class263(25, 8);

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_170 = new Class158(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V")
	public static void method4883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static337.method4744(arg4, Static164.anInt6595, Static362.anInt6654);
		@Pc(21) int local21 = Static337.method4744(arg5, Static164.anInt6595, Static362.anInt6654);
		@Pc(27) int local27 = Static337.method4744(arg2, Static70.anInt1843, Static105.anInt2417);
		@Pc(33) int local33 = Static337.method4744(arg0, Static70.anInt1843, Static105.anInt2417);
		@Pc(41) int local41 = Static337.method4744(arg1 + arg4, Static164.anInt6595, Static362.anInt6654);
		@Pc(49) int local49 = Static337.method4744(arg5 - arg1, Static164.anInt6595, Static362.anInt6654);
		for (@Pc(51) int local51 = local15; local51 < local41; local51++) {
			Static228.method3480(local27, arg3, Static60.anIntArrayArray14[local51], local33);
		}
		for (@Pc(67) int local67 = local21; local67 > local49; local67--) {
			Static228.method3480(local27, arg3, Static60.anIntArrayArray14[local67], local33);
		}
		@Pc(89) int local89 = Static337.method4744(arg1 + arg2, Static70.anInt1843, Static105.anInt2417);
		@Pc(98) int local98 = Static337.method4744(arg0 - arg1, Static70.anInt1843, Static105.anInt2417);
		for (@Pc(100) int local100 = local41; local100 <= local49; local100++) {
			@Pc(106) int[] local106 = Static60.anIntArrayArray14[local100];
			Static228.method3480(local27, arg3, local106, local89);
			Static228.method3480(local98, arg3, local106, local33);
		}
	}
}
