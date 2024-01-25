import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public static int anInt3932 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	public static int method3206(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V")
	public static void method3207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class3_Sub8 local7 = new Class3_Sub8();
		local7.anInt7376 = arg0;
		local7.anInt7372 = arg2;
		local7.anInt7367 = Static24.anInt5323 + arg1;
		local7.anInt7374 = arg4;
		local7.aString71 = arg6;
		local7.anInt7366 = arg3;
		local7.anInt7375 = arg5;
		Static276.aClass84_4.method2305(local7);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)Lclient!sb;")
	public static Class212 method3208(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static148.aFloat178 == 3.0D) {
				return Static258.aClass212_6;
			}
			if ((double) Static148.aFloat178 == 4.0D) {
				return Static373.aClass212_8;
			}
			if ((double) Static148.aFloat178 == 6.0D) {
				return Static239.aClass212_5;
			}
			if ((double) Static148.aFloat178 >= 8.0D) {
				return Static108.aClass212_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static148.aFloat178 == 3.0D) {
				return Static239.aClass212_5;
			}
			if ((double) Static148.aFloat178 == 4.0D) {
				return Static108.aClass212_3;
			}
			if ((double) Static148.aFloat178 == 6.0D) {
				return Static262.aClass212_7;
			}
			if ((double) Static148.aFloat178 >= 8.0D) {
				return Static81.aClass212_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static148.aFloat178 == 3.0D) {
				return Static262.aClass212_7;
			}
			if ((double) Static148.aFloat178 == 4.0D) {
				return Static81.aClass212_2;
			}
			if ((double) Static148.aFloat178 == 6.0D) {
				return Static58.aClass212_1;
			}
			if ((double) Static148.aFloat178 >= 8.0D) {
				return Static117.aClass212_4;
			}
		}
		return null;
	}
}
