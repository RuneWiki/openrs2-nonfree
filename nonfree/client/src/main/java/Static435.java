import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static435 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array13;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!rp;")
	public static final Class212 aClass212_4 = new Class212(1);

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "[Lclient!kt;")
	public static final Class143[] aClass143Array2 = new Class143[14];

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_124 = new Class198("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method5737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static419.anIntArrayArray62 != null) {
			Static419.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static130.aShortArrayArray6 != null) {
			Static130.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static145.aByteArrayArray5 != null) {
			Static145.aByteArrayArray5[arg0][arg1] = (byte) arg4;
		}
	}
}
