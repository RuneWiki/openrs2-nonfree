import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!ok;")
	public static Class125 aClass125_32 = new Class125(64);

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public static int anInt2763 = 0;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!gd;")
	public static Class61 aClass61_21 = new Class61(64);

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!pd;")
	public static Class129 aClass129_14 = new Class129(16);

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
	public static void method2210(@OriginalArg(0) int arg0) {
		Static119.anInt2398 = -1;
		if (arg0 == 37) {
			aFloat29 = 3.0F;
		} else if (arg0 == 50) {
			aFloat29 = 4.0F;
		} else if (arg0 == 75) {
			aFloat29 = 6.0F;
		} else if (arg0 == 100) {
			aFloat29 = 8.0F;
		} else if (arg0 == 200) {
			aFloat29 = 16.0F;
		}
		Static119.anInt2398 = -1;
	}
}
