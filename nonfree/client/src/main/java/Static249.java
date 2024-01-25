import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "Lclient!rk;")
	public static Class180 aClass180_16;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString99 = null;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[B")
	public static final byte[] aByteArray18 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString100 = "Allocated memory";

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(CZ)Z")
	public static boolean method1109(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
	public static void method1111(@OriginalArg(1) int arg0) {
		@Pc(12) Class7_Sub1_Sub15 local12 = Static315.method5104(3, arg0);
		local12.method4788();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public static void method1112() {
		if (!Static253.aBoolean361) {
			return;
		}
		@Pc(11) Class26 local11 = Static23.method4815(Static256.anInt4950, Static269.anInt5313);
		if (local11 != null && local11.anObjectArray13 != null) {
			@Pc(20) Class7_Sub25 local20 = new Class7_Sub25();
			local20.aClass26_22 = local11;
			local20.anObjectArray34 = local11.anObjectArray13;
			Static83.method1766(local20);
		}
		Static221.anInt4408 = -1;
		Static253.aBoolean361 = false;
		Static245.method4226(local11);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!bi;B)Lclient!bi;")
	public static Class26 method1113(@OriginalArg(0) Class26 arg0) {
		if (arg0.anInt530 != -1) {
			return Static245.method4231(arg0.anInt530);
		}
		@Pc(17) int local17 = arg0.anInt492 >>> 16;
		@Pc(22) Class35 local22 = new Class35(Static247.aClass10_40);
		for (@Pc(27) Class7_Sub17 local27 = (Class7_Sub17) local22.method667(); local27 != null; local27 = (Class7_Sub17) local22.method666()) {
			if (local17 == local27.anInt3252) {
				return Static245.method4231((int) local27.aLong232);
			}
		}
		return null;
	}
}
