import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static554 {

	@OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
	public static int anInt1819;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "Lclient!vd;")
	public static Class353 aClass353_16;

	@OriginalMember(owner = "client!tn", name = "W", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "Lclient!he;")
	public static final Class128 aClass128_8 = new Class128(16);

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!tn", name = "U", descriptor = "I")
	public static int anInt1821 = 0;

	@OriginalMember(owner = "client!tn", name = "V", descriptor = "S")
	public static short aShort27 = 32767;

	@OriginalMember(owner = "client!tn", name = "X", descriptor = "I")
	public static volatile int anInt1822 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!pha;B)I")
	public static int method1508(@OriginalArg(0) Class256 arg0) {
		if (arg0 == Static436.aClass256_4) {
			return 7681;
		} else if (arg0 == Static266.aClass256_3) {
			return 8448;
		} else if (Static190.aClass256_2 == arg0) {
			return 34165;
		} else if (Static114.aClass256_1 == arg0) {
			return 260;
		} else if (arg0 == Static574.aClass256_5) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
