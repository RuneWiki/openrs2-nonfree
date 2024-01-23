import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
	public static int anInt2131;

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "S")
	public static short aShort15 = 32767;

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
	public static int anInt2124 = 1;

	@OriginalMember(owner = "client!hg", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
	public static int anInt2132 = -1;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)I")
	public static int method1613(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZI)I")
	public static int method1615(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZI)V")
	public static void method1616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static35.aLong29 = 0L;
		@Pc(3) boolean local3 = false;
		@Pc(10) int local10 = Static99.method1585();
		if (arg3 == 3 || local10 == 3) {
			arg2 = true;
		}
		if (local10 > 0 != arg3 > 0) {
			local3 = true;
		}
		if (Static26.aString24.startsWith("mac") && arg3 > 0) {
			arg2 = true;
		}
		if (arg2 && arg3 > 0) {
			local3 = true;
		}
		Static123.method1976(arg2, arg0, local3, arg3, local10, arg1);
	}
}
