import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static225 {

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
	public static int anInt3793;

	@OriginalMember(owner = "client!kv", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Lclient!ga;")
	public static Class82 aClass82_14 = null;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Lclient!la;")
	public static final Class136 aClass136_105 = new Class136(4, 6);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method3255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)Lclient!gw;")
	public static Class93 method3257(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static211.aFloat3 == 3.0D) {
				return Static59.aClass93_2;
			}
			if ((double) Static211.aFloat3 == 4.0D) {
				return Static251.aClass93_10;
			}
			if ((double) Static211.aFloat3 == 6.0D) {
				return Static358.aClass93_7;
			}
			if ((double) Static211.aFloat3 >= 8.0D) {
				return Static359.aClass93_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static211.aFloat3 == 3.0D) {
				return Static358.aClass93_7;
			}
			if ((double) Static211.aFloat3 == 4.0D) {
				return Static359.aClass93_8;
			}
			if ((double) Static211.aFloat3 == 6.0D) {
				return Static160.aClass93_5;
			}
			if ((double) Static211.aFloat3 >= 8.0D) {
				return Static376.aClass93_9;
			}
		} else if (arg0 == 2) {
			if ((double) Static211.aFloat3 == 3.0D) {
				return Static160.aClass93_5;
			}
			if ((double) Static211.aFloat3 == 4.0D) {
				return Static376.aClass93_9;
			}
			if ((double) Static211.aFloat3 == 6.0D) {
				return Static13.aClass93_1;
			}
			if ((double) Static211.aFloat3 >= 8.0D) {
				return Static308.aClass93_6;
			}
		}
		return null;
	}
}
