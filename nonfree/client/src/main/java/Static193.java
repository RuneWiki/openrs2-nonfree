import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public static int anInt4490;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
	public static int anInt4494;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[200];

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "([ILclient!kha;ILclient!kha;)V")
	public static void method3835(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(3) Class181 arg2) {
		Static359.aClass181_114 = arg2;
		if (arg0 != null) {
			Static393.anIntArray156 = arg0;
		}
		Static452.aClass181_87 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(IB)Z")
	public static boolean method3842(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
