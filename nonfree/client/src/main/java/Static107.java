import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString145 = "red:";

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt2505 = 0;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)Z")
	public static boolean method1979(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < Static287.aBooleanArray55.length ? Static287.aBooleanArray55[arg0] : false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLjava/lang/String;Lclient!cg;)I")
	public static int method1980(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		@Pc(7) int local7 = arg1.anInt3264;
		@Pc(15) byte[] local15 = Static217.method3411(arg0);
		arg1.method2653(local15.length);
		arg1.anInt3264 += Static54.aClass158_1.method3916(arg1.aByteArray47, local15.length, local15, 0, arg1.anInt3264);
		return arg1.anInt3264 - local7;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1982(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static148.anInt3198; local11++) {
			if (arg0.equalsIgnoreCase(Static270.aStringArray55[local11])) {
				return true;
			}
		}
		return false;
	}
}
