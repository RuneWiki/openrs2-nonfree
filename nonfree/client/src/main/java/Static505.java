import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
	public static int anInt8016;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "Lclient!wu;")
	public static final Class366 aClass366_11 = new Class366(1);

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
	public static int anInt8015 = 999999;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Lclient!jp;")
	public static Class180 method6533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass180_3;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;IBLjava/lang/String;)V")
	public static void method6535(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		Static110.method1608(arg0, true, arg3, arg2, arg1, -1);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public static void method6537() {
		Static537.aClass67Array1 = new Class67[50];
		Static276.anInt4784 = 0;
	}
}
