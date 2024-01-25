import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static337 {

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Lclient!pf;")
	public static final Class12_Sub42 aClass12_Sub42_2 = new Class12_Sub42(0, -1);

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "S")
	public static short aShort86 = 32767;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "[I")
	public static final int[] anIntArray448 = new int[1];

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	public static int anInt6452 = 0;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "S")
	public static short aShort87 = 320;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
	public static void method5385(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static387.aByteArrayArrayArray18 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z")
	public static boolean method5386(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
