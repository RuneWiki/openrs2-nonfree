import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[J")
	public static final long[] aLongArray16 = new long[100];

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt9496 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class21 local13 = local7.aClass21_4; local13 != null; local13 = local13.aClass21_1) {
			@Pc(17) Class11_Sub1_Sub1 local17 = local13.aClass11_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort90 == arg1 && local17.aShort88 == arg2) {
				Static60.method1000(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public static boolean method7731(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7732(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg0); local14 != -1; local14 = arg1.indexOf(arg0, arg2.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(local14 + arg0.length());
		}
		return arg1;
	}
}
