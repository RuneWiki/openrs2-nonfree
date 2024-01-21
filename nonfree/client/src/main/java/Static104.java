import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt2269;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!k;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_11;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt2267 = 0;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!tg;")
	private static Class81 aClass81_799 = Static120.method2057("K");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!h;")
	public static Class30 aClass30_13 = new Class30();

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_800 = aClass81_799;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_801 = aClass81_799;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!tg;")
	private static Class81 aClass81_802 = Static120.method2057("Password: ");

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static int anInt2270 = 0;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!bg;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_803 = aClass81_802;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_804 = Static120.method2057("swe");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)J")
	public static long method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1851; local13++) {
			@Pc(19) Class75 local19 = local7.aClass75Array2[local13];
			if ((local19.aLong118 >> 29 & 0x3L) == 2L && local19.anInt3164 == arg1 && local19.anInt3158 == arg2) {
				return local19.aLong118;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1708() {
		aClass81_801 = null;
		aLongArray5 = null;
		aClass47_4 = null;
		aClass81_800 = null;
		aClass1_Sub8_Sub1_2 = null;
		aClass81_802 = null;
		aClass81_799 = null;
		aClass30_13 = null;
		aClass81_803 = null;
		aClass82_Sub1_11 = null;
		aClass81_804 = null;
	}
}
