import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString196 = "Opened title screen";

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString197 = "red:";

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
	public static int method4703(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method4705(@OriginalArg(1) Class83 arg0) {
		Static231.aClass83_171 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILclient!lg;III)V")
	public static void method4706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static43.method943(arg5, arg1, arg4, arg3, arg2.anInt1604, arg2.anInt1635, arg0);
	}
}
