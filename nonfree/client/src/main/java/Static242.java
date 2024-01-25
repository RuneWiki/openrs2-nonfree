import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Lclient!rf;")
	public static Class274 aClass274_3;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "[J")
	public static final long[] aLongArray13 = new long[100];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)V")
	public static void method3763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static455.anInt7992 = arg0;
		Static6.anInt87 = arg5;
		Static32.anInt605 = arg3;
		Static20.anInt359 = arg2;
		Static190.anInt7945 = arg1;
		Static485.anInt8591 = arg4;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Z")
	public static boolean method3766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static2.method56(arg1, arg0) | (arg1 & 0x70000) != 0 || Static19.method253(arg1, arg0);
	}
}
