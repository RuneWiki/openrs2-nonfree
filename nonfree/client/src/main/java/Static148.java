import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "J")
	public static long aLong101;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIBIZI)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if ((arg3 ? Static455.aClass3_Sub27_Sub1_1.anInt4795 : Static455.aClass3_Sub27_Sub1_1.anInt4799) != 0 && arg0 != 0 && Static228.anInt4641 < 50 && arg1 != -1) {
			Static200.aClass64Array1[Static228.anInt4641++] = new Class64((byte) (arg3 ? 3 : 2), arg1, arg0, arg2, arg4, 0);
		}
	}
}
