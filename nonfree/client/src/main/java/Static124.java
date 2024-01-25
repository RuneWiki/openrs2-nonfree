import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!et", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Lclient!ml;")
	public static final Class199 aClass199_3 = new Class199("LIVE", 0);

	@OriginalMember(owner = "client!et", name = "B", descriptor = "F")
	public static float aFloat137 = 0.0F;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(JI)V")
	public static void method2346(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
	public static boolean method2347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(III)Z")
	public static boolean method2348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
