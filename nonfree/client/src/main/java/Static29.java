import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "[S")
	public static final short[] aShortArray70 = new short[] { 30, 23, 13, 11, 60, 59, 6, 46 };

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Lclient!ks;")
	public static final Class141 aClass141_6 = new Class141();

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
	public static final int[] anIntArray365 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)I")
	public static int method3629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return ((local31 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local31 & 0xFF0000) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	public static void method3634(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static407.anInt6564 != -1) {
				Static272.method4010(Static407.anInt6564);
			}
			for (@Pc(17) Class1_Sub23 local17 = (Class1_Sub23) Static101.aClass96_16.method2342(); local17 != null; local17 = (Class1_Sub23) Static101.aClass96_16.method2339()) {
				if (!local17.method6017()) {
					local17 = (Class1_Sub23) Static101.aClass96_16.method2342();
					if (local17 == null) {
						break;
					}
				}
				Static441.method5820(false, true, local17);
			}
			Static407.anInt6564 = -1;
			Static101.aClass96_16 = new Class96(8);
			Static46.method821();
			Static407.anInt6564 = Static291.anInt5089;
			Static292.method4245(false);
			Static319.method3515();
			Static13.method362(Static407.anInt6564);
		}
		Static309.aBoolean382 = true;
	}
}
