import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
	public static int anInt5508;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	public static int anInt5511 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)Lclient!nu;")
	public static Class26_Sub4 method4422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_Sub4_2 == null ? null : local7.aClass26_Sub4_2;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)Z")
	public static boolean method4423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static366.method4713(arg1, arg0) & Static71.method1185(arg1, arg0);
	}
}
