import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static174 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[Lclient!nm;")
	public static final Class171[] aClass171Array1 = new Class171[14];

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public static int anInt2859 = -1;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray74 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V")
	public static void method2341(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		Static28.method501(arg4, arg0, null, arg1, arg3, -1, arg2);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
	public static boolean method2343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static235.method3090(arg1, arg0) || Static399.method5010(arg0, arg1) || Static229.method3029(arg0, arg1);
	}
}
