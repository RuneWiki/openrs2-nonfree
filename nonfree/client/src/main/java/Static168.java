import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
	public static int anInt3337;

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
	public static int anInt3351;

	@OriginalMember(owner = "client!mj", name = "Z", descriptor = "Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
	public static int anInt3340 = 0;

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
	public static int anInt3342 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(3) int local3 = arg3 - arg2;
		@Pc(8) int local8 = arg5 - arg0;
		@Pc(29) int local29 = (arg7 - arg6 << 16) / local8;
		@Pc(37) int local37 = (arg4 - arg1 << 16) / local3;
		Static35.method513(arg5, arg3, arg6, arg1, arg0, local29, local37, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(III)V")
	public static void method2660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class73 local7 = Static112.method1925(arg0);
		@Pc(10) int local10 = local7.anInt2594;
		@Pc(13) int local13 = local7.anInt2586;
		@Pc(16) int local16 = local7.anInt2590;
		@Pc(22) int local22 = Class154.anIntArray428[local16 - local13];
		if (arg1 < 0 || local22 < arg1) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static93.method1502(local10, ~local22 & Static136.anIntArray250[local10] | local22 & arg1 << local13);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2661(@OriginalArg(0) String arg0) {
		if (Static192.aClass9_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static192.aClass9_2.anInt203; local21++) {
			if (Static83.method3365(Static192.aClass9_2.aStringArray2[local21], "<br>", " ").equals(arg0)) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public static void method2662() {
		aClass4_Sub2_Sub1_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2663(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) byte local10 = 2;
		@Pc(13) char[] local13 = new char[local4];
		for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local10 == 0) {
				local27 = Character.toLowerCase(local27);
			} else if (local10 == 2 || Character.isUpperCase(local27)) {
				local27 = Static50.method443(local27);
			}
			if (Character.isLetter(local27)) {
				local10 = 0;
			} else if (local27 == '.' || local27 == '?' || local27 == '!') {
				local10 = 2;
			} else if (!Character.isSpaceChar(local27)) {
				local10 = 1;
			} else if (local10 != 2) {
				local10 = 1;
			}
			local13[local20] = local27;
		}
		return new String(local13);
	}
}
