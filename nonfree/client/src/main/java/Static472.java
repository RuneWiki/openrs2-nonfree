import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!caa;")
	public static Class31 aClass31_5;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	public static int anInt8248;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_17 = new Class245(6, 0, 4, 2);

	@OriginalMember(owner = "client!u", name = "m", descriptor = "[Lclient!so;")
	public static final Class264[] aClass264Array4 = new Class264[6];

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public static int anInt8247 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
	public static int method6911(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method6912() {
		Static525.aClass39_12.M(((float) Static281.aClass2_Sub19_Sub1_1.anInt2194 * 0.1F + 0.7F) * 1.1523438F);
		Static525.aClass39_12.m(Static108.anInt2105, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static525.aClass39_12.E(Static266.anInt4919, -1, 256);
		Static525.aClass39_12.method6059(Static282.aClass58_4);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Z")
	public static boolean method6914(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 15 || arg0 == 1001 || arg0 == 18 || arg0 == 13;
	}
}
