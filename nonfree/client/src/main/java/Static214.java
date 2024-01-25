import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array12;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ka;")
	public static Class7_Sub8_Sub2 aClass7_Sub8_Sub2_3;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!rk;")
	public static Class180 aClass180_55;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public static int anInt4266;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt4265 = 0;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString276 = "shake:";

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Z")
	public static boolean method3782(@OriginalArg(1) int arg0) {
		if (arg0 == 10 || arg0 == 13 || arg0 == 49 || arg0 == 5 || arg0 == 16 || arg0 == 31 || arg0 == 20 || arg0 == 58) {
			return true;
		} else if (arg0 == 15 || arg0 == 50 || arg0 == 1006 || arg0 == 1011) {
			return true;
		} else if (arg0 == 21 || arg0 == 40 || arg0 == 34 || arg0 == 1 || arg0 == 18) {
			return true;
		} else {
			return arg0 == 36 || arg0 == 42 || arg0 == 30 || arg0 == 39 || arg0 == 25 || arg0 == 60;
		}
	}
}
