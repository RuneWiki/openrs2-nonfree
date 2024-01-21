import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 aClass3_Sub2_Sub2_Sub3_4;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public static int anInt4190 = 0;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public static int anInt4191 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1467 = Static170.method3101("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1465 = aClass28_1467;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1469 = Static170.method3101("Unexpected server response)3");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1466 = aClass28_1469;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1468 = Static170.method3101("blinken2:");

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static int anInt4193 = -1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J")
	public static synchronized long method3161() {
		@Pc(11) long local11 = System.currentTimeMillis();
		if (Static18.aLong20 > local11) {
			Static94.aLong87 += Static18.aLong20 - local11;
		}
		Static18.aLong20 = local11;
		return local11 + Static94.aLong87;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Lclient!gd;")
	public static Class32 method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3336; local13++) {
			@Pc(19) Class32 local19 = local7.aClass32Array3[local13];
			if ((local19.aLong49 >> 29 & 0x3L) == 2L && local19.anInt1450 == arg1 && local19.anInt1449 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method3163() {
		aClass28_1466 = null;
		aClass28_1468 = null;
		aClass28_1469 = null;
		aClass28_1465 = null;
		aClass28_1467 = null;
		aClass3_Sub2_Sub2_Sub3_4 = null;
	}
}
