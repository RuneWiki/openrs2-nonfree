import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "[Lclient!ne;")
	public static Class142[] aClass142Array2;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString190 = "";

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Loaded input handler";

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!rk;Lclient!rk;)V")
	public static void method2596(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Class180 arg1) {
		Static69.aClass180_19 = arg0;
		Static179.aClass180_48 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public static void method2597() {
		for (@Pc(7) int local7 = 0; local7 < Static92.aByteArrayArrayArray3.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static92.aByteArrayArrayArray3[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static92.aByteArrayArrayArray3[0][0].length; local15++) {
					Static92.aByteArrayArrayArray3[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IC)Z")
	public static boolean method2598(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
