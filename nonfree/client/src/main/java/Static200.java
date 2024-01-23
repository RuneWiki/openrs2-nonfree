import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public static int anInt4012;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!cg;")
	public static Class22 aClass22_70;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!no;")
	public static Class4_Sub24_Sub1 aClass4_Sub24_Sub1_2 = new Class4_Sub24_Sub1(5000);

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Loaded title screen";

	@OriginalMember(owner = "client!on", name = "u", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ql;Lclient!ql;IIZZI)I")
	public static int method3243(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) Class64_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static52.method1018(arg0, arg1, arg4, arg2);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static52.method1018(arg0, arg1, arg3, arg5);
			return arg3 ? -local36 : local36;
		}
	}
}
