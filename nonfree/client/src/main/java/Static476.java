import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!tu", name = "Qd", descriptor = "Lclient!wda;")
	public static Class317 aClass317_4;

	@OriginalMember(owner = "client!tu", name = "Rd", descriptor = "I")
	public static int anInt7744;

	@OriginalMember(owner = "client!tu", name = "Md", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_37 = new Class267(64);

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(IIIII)V")
	public static void method6337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static63.anIntArrayArray20 != null) {
			Static63.anIntArrayArray20[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static222.aShortArrayArray5 != null) {
			Static222.aShortArrayArray5[arg0][arg1] = (short) arg3;
		}
		if (Static125.aByteArrayArray9 != null) {
			Static125.aByteArrayArray9[arg0][arg1] = (byte) arg4;
		}
	}
}
