import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static535 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!bi;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!fa;")
	public static Interface7 anInterface7_11;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!pu;")
	public static Class270 aClass270_112;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public static int anInt8945 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public static boolean method7313(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IC)Z")
	public static boolean method7314(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
