import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "[Lclient!fba;")
	public static Class92[] aClass92Array16;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "Lclient!an;")
	public static final Class20 aClass20_25 = new Class20(3, 8);

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray104 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public static void method8598() {
		if (Static189.aClass122_1 != null) {
			Static189.aClass122_1.method6803();
		}
		if (Static569.aClass122_3 != null) {
			Static569.aClass122_3.method6803();
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZ)V")
	public static void method8602(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static1.method8533(arg0, arg1, true, arg3, -1, arg2);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([BIB)[B")
	public static byte[] method8603(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static655.method6406(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
