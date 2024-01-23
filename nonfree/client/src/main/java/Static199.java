import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public static int anInt4004;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!tl;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public static int anInt4005 = 0;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!th;")
	public static Class169 aClass169_111 = new Class169(64);

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	public static int anInt4010 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!ph;)V")
	public static void method3217(@OriginalArg(1) Class138 arg0) {
		Static148.aClass138_45 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3218(@OriginalArg(1) String arg0) {
		return Static121.method1952(10, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3219(@OriginalArg(0) String arg0) {
		Static232.method2984("", "", 0, 0, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IC)Z")
	public static boolean method3220(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static302.aCharArray10;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(49) char local49 = local35[local37];
				if (local49 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
