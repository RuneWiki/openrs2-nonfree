import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "[I")
	public static int[] anIntArray406 = new int[25];

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
	public static int anInt4082 = 0;

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
	public static int anInt4084 = 0;

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)Z")
	public static boolean method3336(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(12) int local12 = local8.method2146();
		if (local12 != 1) {
			return false;
		}
		@Pc(39) boolean local39 = local8.method2146() == 1;
		if (local39) {
			Static137.method2472(local8);
		}
		Static273.method4313(local8);
		return true;
	}
}
