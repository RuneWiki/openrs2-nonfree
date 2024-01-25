import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_162 = new Class209("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
	public static int anInt7289 = 0;

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "[I")
	public static final int[] anIntArray626 = new int[13];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	public static void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class237[] local7 = Static20.aClass237Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class237 local15 = local7[local9];
			if (local15 != null && local15.anInt6468 == 2) {
				Static326.method4548(local15.anInt6458, arg1 >> 1, local15.anInt6459, arg0 >> 1, local15.anInt6460 * 2, local15.anInt6461);
				if (Static283.anIntArray135[0] > -1 && Static131.anInt2821 % 20 < 10) {
					Static226.aClass17Array7[local15.anInt6470].method5767(Static283.anIntArray135[0] + arg3 - 12, arg2 - -Static283.anIntArray135[1] + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)Lclient!ru;")
	public static Class2_Sub38 method5748(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub38) Static198.aClass163_24.method3769(local17);
	}
}
