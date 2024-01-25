import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread4;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!ni;")
	public static Class223 aClass223_101;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[2];

	@OriginalMember(owner = "client!q", name = "t", descriptor = "[I")
	public static final int[] anIntArray424 = new int[1];

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	public static int anInt8127 = 1;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Z")
	public static boolean aBoolean650 = false;

	@OriginalMember(owner = "client!q", name = "F", descriptor = "[I")
	public static final int[] anIntArray425 = new int[2048];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method6845(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(local14 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(III)Z")
	public static boolean method6846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
	public static void method6848() {
		Static299.aClass302ArrayArray2 = new Class302[Static182.aClass223_48.method5961()][];
		Static250.aClass302ArrayArray1 = new Class302[Static182.aClass223_48.method5961()][];
		Static555.aBooleanArray22 = new boolean[Static182.aClass223_48.method5961()];
	}
}
