import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!ek;")
	public static Class42 aClass42_29;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public static int[] anIntArray208 = new int[100];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1789(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method1790() {
		Static220.aClass157_37.method4027();
		Static4.aClass157_3.method4027();
		Static301.aClass157_45.method4027();
	}
}
