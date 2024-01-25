import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!wu;")
	public static Class384 aClass384_98;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[I")
	public static final int[] anIntArray541 = new int[32];

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method6095() {
		if (Static25.anInterface22Array1 == null) {
			return;
		}
		@Pc(10) Interface22[] local10 = Static25.anInterface22Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface22 local18 = local10[local12];
			local18.method6463();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6096(@OriginalArg(1) Class126 arg0) {
		Static464.aClass195Array1 = new Class195[Static137.anIntArray180.length];
		for (@Pc(11) int local11 = 0; local11 < Static137.anIntArray180.length; local11++) {
			@Pc(17) int local17 = Static137.anIntArray180[local11];
			@Pc(22) Class298 local22 = Static7.method166(Static558.aClass384_124, local17);
			@Pc(30) Class6 local30 = arg0.method7000(local22, Static654.method4058(Static76.aClass384_29, local17));
			Static464.aClass195Array1[local11] = new Class195(local30, local22);
		}
	}
}
