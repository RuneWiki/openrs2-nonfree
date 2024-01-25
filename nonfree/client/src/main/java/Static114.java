import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Lclient!lg;")
	public static final Class149 aClass149_2 = new Class149(16);

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_25 = new Class25(74, 0);

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "[I")
	public static final int[] anIntArray215 = new int[16];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1871(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static165.anInt2940; local16++) {
			if (arg0.equalsIgnoreCase(Static208.aStringArray24[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBIIII)V")
	public static void method1872(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class48_Sub8 local10 = (Class48_Sub8) Static28.aClass128_1.method2831(); local10 != null; local10 = (Class48_Sub8) Static28.aClass128_1.method2832()) {
			if (local10.anInt6586 <= Static125.anInt2225) {
				local10.method5436();
			} else {
				Static195.method3066((local10.anInt6583 << 7) + 64, (local10.anInt6588 << 7) + 64, local10.anInt6589, arg0 >> 1, arg2 >> 1, local10.anInt6590 * 2);
				Static45.aClass92_1.method5633(arg3 + Static363.anIntArray538[0], arg1 - -Static363.anIntArray538[1], local10.anInt6584 | 0xFF000000, 0, local10.aString62);
			}
		}
	}
}
