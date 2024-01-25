import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mga", name = "L", descriptor = "Lclient!om;")
	public static Class246 aClass246_158;

	@OriginalMember(owner = "client!mga", name = "K", descriptor = "Lclient!jv;")
	public static final Class174 aClass174_26 = new Class174();

	@OriginalMember(owner = "client!mga", name = "M", descriptor = "[I")
	public static final int[] anIntArray452 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mga", name = "N", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(JJ)J")
	public static long method5043(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)Z")
	public static boolean method5045() {
		@Pc(7) Class3 local7 = Static187.aClass130_15.aClass3_121.aClass3_286;
		if (local7 == null || local7 == Static187.aClass130_15.aClass3_121) {
			return false;
		}
		@Pc(23) Class3_Sub44 local23 = (Class3_Sub44) local7;
		if (local23.anInt7685 >= 2000) {
			local23.anInt7685 -= 2000;
		}
		return local23.anInt7685 == 1006;
	}
}
