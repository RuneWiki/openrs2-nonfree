import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
	public static final int[] anIntArray363 = new int[50];

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_21 = new Class16();

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[I")
	public static int[] anIntArray364 = new int[2];

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_117 = new Class34("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public static void method3615(@OriginalArg(1) int arg0) {
		Static62.anInt1771 = arg0;
		Static68.anInt1821 = -1;
		Static231.anInt4758 = -1;
		Static246.method4421();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	public static void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class194 local28 = Static77.aClass194ArrayArrayArray1[local9][arg0][arg1] = Static77.aClass194ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte68--;
				for (@Pc(40) Class126 local40 = local28.aClass126_2; local40 != null; local40 = local40.aClass126_1) {
					@Pc(44) Class17_Sub1 local44 = local40.aClass17_Sub1_1;
					if (local44.aShort75 == arg0 && local44.aShort77 == arg1) {
						local44.aByte51--;
					}
				}
			}
		}
		if (Static77.aClass194ArrayArrayArray1[0][arg0][arg1] == null) {
			Static77.aClass194ArrayArrayArray1[0][arg0][arg1] = new Class194(0, arg0, arg1);
			Static77.aClass194ArrayArrayArray1[0][arg0][arg1].aByte64 = 1;
		}
		Static77.aClass194ArrayArrayArray1[0][arg0][arg1].aClass194_1 = local7;
		Static77.aClass194ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
