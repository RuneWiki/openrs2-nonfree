import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!lg;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public static void method3626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 != null && local7.aClass8_Sub4_1 != null) {
			local7.aClass8_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3627(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static324.method4280("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BI)I")
	public static int method3629(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static262.method3734(0, arg0, arg1);
	}
}
