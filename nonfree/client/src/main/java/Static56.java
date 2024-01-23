import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!me;")
	public static Class71 aClass71_28;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1230 = Static64.method1101(" <col=ffff00>");

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1231 = Static64.method1101("logo");

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "[I")
	public static int[] anIntArray229 = new int[32];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Lclient!ug;")
	public static Class115 method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class115 local14 = local7.aClass115_1;
			local7.aClass115_1 = null;
			return local14;
		}
	}
}
