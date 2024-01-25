import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!fl;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public static int anInt408;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!av", name = "f", descriptor = "[I")
	public static final int[] anIntArray49 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZILclient!mv;IIJB)V")
	public static void method328(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) long arg3) {
		Static155.method2114(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
	public static boolean method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
