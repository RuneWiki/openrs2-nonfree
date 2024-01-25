import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!ga;")
	public static Class111 aClass111_49;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	public static int anInt4275 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method3670(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static20.aClass17Array1 == Static499.aClass17Array3) {
			return;
		}
		@Pc(10) int local10 = Static158.aClass17Array2[arg1].method6637(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class17 local23 = Static158.aClass17Array2[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method6637(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public static boolean method3672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
