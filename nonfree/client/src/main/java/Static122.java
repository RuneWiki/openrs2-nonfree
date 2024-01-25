import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "[Lclient!av;")
	public static final Class17[] aClass17Array1 = new Class17[8];

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_39 = new Class267("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_132 = new Class123(84, 6);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII)V")
	public static void method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 + 1;
		Static298.method4405(Static62.anIntArrayArray7[arg4], arg3, arg2, arg0);
		@Pc(27) int local27 = arg1 - 1;
		Static298.method4405(Static62.anIntArrayArray7[arg1], arg3, arg2, arg0);
		for (@Pc(35) int local35 = local4; local35 <= local27; local35++) {
			@Pc(41) int[] local41 = Static62.anIntArrayArray7[local35];
			local41[arg0] = local41[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BII)Z")
	public static boolean method2103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static32.method5526(arg1, arg0) | (arg0 & 0x40000) != 0 || Static173.method2864(arg1, arg0);
	}
}
