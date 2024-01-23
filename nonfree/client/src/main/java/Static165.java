import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!fh;")
	public static Class58 aClass58_72;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!fh;")
	public static Class58 aClass58_73;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt3275 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method2688(@OriginalArg(1) Class58 arg0) {
		if (Static92.aBoolean124) {
			return;
		}
		if (Static94.aBoolean138) {
			Static104.method1701();
		} else {
			Static270.method4264();
		}
		Static263.aClass4_Sub3_Sub14_7 = Static38.method583(Static246.anInt4678, arg0);
		@Pc(24) int local24 = Static40.anInt690;
		@Pc(30) int local30 = local24 * 956 / 503;
		Static263.aClass4_Sub3_Sub14_7.method4544((Static31.anInt526 - local30) / 2, 0, local30, local24);
		Static240.aClass56_1 = Static248.method3915(arg0, Static22.anInt322);
		Static240.aClass56_1.method2828(Static31.anInt526 / 2 - Static240.aClass56_1.anInt3408 / 2, 18);
		Static92.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fh;IB)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method2692(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1) {
		return Static265.method4168(arg0, arg1) ? Static132.method2003() : null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method2693(@OriginalArg(1) int arg0) {
		Static89.anIntArray164 = new int[arg0];
		Static242.anIntArray492 = new int[arg0];
		Static212.anIntArray440 = new int[arg0];
		Static291.anIntArray620 = new int[arg0];
		Static241.anIntArray489 = new int[arg0];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method2695(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
