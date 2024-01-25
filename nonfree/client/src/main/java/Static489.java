import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static489 {

	@OriginalMember(owner = "client!rea", name = "J", descriptor = "Lclient!qt;")
	public static Class282 aClass282_12;

	@OriginalMember(owner = "client!rea", name = "K", descriptor = "I")
	public static int anInt8492;

	@OriginalMember(owner = "client!rea", name = "M", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!rea", name = "N", descriptor = "I")
	public static int anInt8493;

	@OriginalMember(owner = "client!rea", name = "I", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_51 = new Class223();

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(III)Z")
	public static boolean method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static384.method6205(arg1, arg0) || Static375.method6039(arg1, arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7288(@OriginalArg(1) String arg0) {
		if (Class3_Sub2_Sub7.aString21.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class3_Sub2_Sub7.aString21.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class3_Sub2_Sub7.aString21.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
