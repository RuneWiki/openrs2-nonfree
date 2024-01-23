import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lclient!wg;")
	public static Class191[] aClass191Array1;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!ph;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!vl;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "F")
	public static float aFloat1 = 0.0F;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
	public static int method32() {
		return Static272.aClass169_144.method4012();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method33() {
		Static130.aClass169_72.method4018();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method34(@OriginalArg(1) Class138 arg0) {
		Static175.aClass138_49 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method36(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local17));
		}
		return local10;
	}
}
