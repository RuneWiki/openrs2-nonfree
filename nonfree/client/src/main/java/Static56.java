import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "B")
	public static byte aByte15;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Z")
	public static boolean aBoolean65;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_14 = new Class181(28, -1);

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "[I")
	public static final int[] anIntArray68 = new int[6];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZB)V")
	public static void method870() {
		@Pc(14) Class5_Sub40 local14 = Static25.method507(Static98.aClass208_2, Static7.aClass181_4);
		Static612.method8496(local14);
		for (@Pc(30) Class5_Sub15 local30 = (Class5_Sub15) Static183.aClass81_27.method1608(); local30 != null; local30 = (Class5_Sub15) Static183.aClass81_27.method1610()) {
			if (!local30.method8913()) {
				local30 = (Class5_Sub15) Static183.aClass81_27.method1608();
				if (local30 == null) {
					break;
				}
			}
			if (local30.anInt2406 == 0) {
				Static177.method2689(true, true, local30);
			}
		}
		if (Static381.aClass357_7 != null) {
			Static637.method8778(Static381.aClass357_7);
			Static381.aClass357_7 = null;
		}
	}
}
