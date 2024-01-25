import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "[[Lclient!qf;")
	public static Class283[][] aClass283ArrayArray1;

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	public static int anInt2237 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[SI)[S")
	public static short[] method1957(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static679.method1564(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)Z")
	public static boolean method1958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static3.method1022(arg0, arg1) || Static307.method4407(arg0, arg1);
	}
}
