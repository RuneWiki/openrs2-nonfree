import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "Lclient!eh;")
	private static Class28 aClass28_977 = Static170.method3101("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_978 = aClass28_977;

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_979 = aClass28_977;

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
	public static int anInt2985 = 0;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_980 = Static170.method3101("<col=80ff00>");

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_981 = Static170.method3101(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
	public static final int anInt2988 = 2301979;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public static void method2333() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt228; local1++) {
			for (local4 = 0; local4 < Static90.anInt2564; local4++) {
				for (local7 = 0; local7 < Static87.anInt2536; local7++) {
					Static149.aClass3_Sub20ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static103.anInt2677; local4++) {
			for (local7 = 0; local7 < Static103.anIntArray469[local4]; local7++) {
				Static103.aClass65ArrayArray1[local4][local7] = null;
			}
			Static103.anIntArray469[local4] = 0;
		}
		for (local7 = 0; local7 < Static11.anInt411; local7++) {
			Static90.aClass32Array1[local7] = null;
		}
		Static11.anInt411 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static127.aClass32Array2.length; local69++) {
			Static127.aClass32Array2[local69] = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V")
	public static void method2334() {
		aClass28_979 = null;
		aClass28_981 = null;
		aClass28_980 = null;
		aClass28_977 = null;
		aClass28_978 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
	public static boolean method2335(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[III)I")
	public static int method2336(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		return arg2 * arg1[1] + arg0 * arg1[0];
	}
}
