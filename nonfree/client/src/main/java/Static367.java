import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array24;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public static int anInt8232;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!os;")
	public static final Class258 aClass258_20 = new Class258(2, 2);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)I")
	public static int method6796() {
		if ((double) Static392.aFloat187 == 3.0D) {
			return 37;
		} else if ((double) Static392.aFloat187 == 4.0D) {
			return 50;
		} else if ((double) Static392.aFloat187 == 6.0D) {
			return 75;
		} else if ((double) Static392.aFloat187 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Canvas;IILclient!bi;Lclient!e;)Lclient!oa;")
	public static synchronized Class66 method6819(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) Interface3 arg4) {
		if (arg2 == 0) {
			return Static83.method7961(arg4, arg1, false);
		} else if (arg2 == 2) {
			return Static461.method6474(arg4, arg1);
		} else if (arg2 == 4) {
			return Static83.method7961(arg4, arg1, true);
		} else if (arg2 == 1) {
			return Static8.method7645(arg4, arg1, arg0);
		} else if (arg2 == 5) {
			return Static36.method625(arg0, arg3, arg4, arg1);
		} else if (arg2 == 3) {
			return Static605.method3989(arg4, arg0, arg1, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
	public static void method6855(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static228.method3966(arg1, arg0.length - 1, arg0, 0);
	}
}
