import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static438 {

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public static int anInt4270;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public static int anInt4272;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!ko;")
	public static final Class179 aClass179_14 = new Class179();

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!qaa;")
	public static final Class266 aClass266_2 = new Class266();

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLclient!ri;)V")
	public static void method3440(@OriginalArg(1) Class284 arg0) {
		Static555.anInt9701 = arg0.method6333("p11_full");
		Static252.anInt4919 = arg0.method6333("p12_full");
		anInt4272 = arg0.method6333("b12_full");
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)Z")
	public static boolean method3441(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
