import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!ag", name = "D", descriptor = "Lclient!so;")
	public static final Class224 aClass224_23 = new Class224(6, 5);

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_198 = new Class151("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBIZLclient!nm;I)V")
	public static void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class171 arg4, @OriginalArg(6) int arg5) {
		if (Static353.anInt5858 >= 50 || (arg4 == null || arg4.anIntArrayArray105 == null || arg4.anIntArrayArray105.length <= arg5 || arg4.anIntArrayArray105[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg4.anIntArrayArray105[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg4.anIntArrayArray105[arg5].length > 1) {
			local67 = (int) ((double) arg4.anIntArrayArray105[arg5].length * Math.random());
			if (local67 > 0) {
				local40 = arg4.anIntArrayArray105[arg5][local67];
			}
		}
		if (local50 == 0) {
			if (arg3) {
				Static263.method3375(255, local40, local46, 0);
			}
		} else if (Static336.aClass106_Sub1_1.anInt5682 != 0) {
			local67 = arg1 - 64 >> 7;
			@Pc(109) int local109 = arg0 - 64 >> 7;
			Static104.aClass98Array2[Static353.anInt5858++] = new Class98((byte) 1, local40, local46, 0, 255, local50 + (local109 << 8) + (arg2 << 24) + (local67 << 16));
		}
	}
}
