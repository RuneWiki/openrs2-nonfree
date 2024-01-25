import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_57 = new Class103(500);

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	public static int anInt5360 = 0;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "Lclient!on;")
	public static final Class154 aClass154_7 = new Class154(16);

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
	public static int anInt5362 = -1;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	public static int anInt5363 = 0;

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString337 = " has logged out.";

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!bi;IIIIILclient!vj;II)V")
	public static void method4517(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(7) int arg7) {
		@Pc(12) int local12 = arg1 * arg1 + arg7 * arg7;
		if (local12 > arg2) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg0.anInt523 / 2, arg0.anInt515 / 2);
		if (local12 <= local37 * local37) {
			Static49.method1084(arg7, arg1, arg6, arg4, arg3, arg0, Static35.aClass52Array3[arg5]);
			return;
		}
		local37 -= 10;
		@Pc(51) int local51;
		if (Static118.anInt6324 == 4) {
			local51 = (int) Static351.aFloat80 & 0x3FFF;
		} else {
			local51 = Static218.anInt4347 + (int) Static351.aFloat80 & 0x3FFF;
		}
		@Pc(63) int local63 = Class147.anIntArray604[local51];
		@Pc(67) int local67 = Class147.anIntArray603[local51];
		if (Static118.anInt6324 != 4) {
			local63 = local63 * 256 / (Static49.anInt1359 + 256);
			local67 = local67 * 256 / (Static49.anInt1359 + 256);
		}
		@Pc(96) int local96 = arg7 * local63 + arg1 * local67 >> 15;
		@Pc(106) int local106 = arg7 * local67 - arg1 * local63 >> 15;
		@Pc(112) double local112 = Math.atan2((double) local96, (double) local106);
		@Pc(119) int local119 = (int) ((double) local37 * Math.sin(local112));
		@Pc(126) int local126 = (int) (Math.cos(local112) * (double) local37);
		Static102.aClass52Array6[arg5].method4129((float) local119 + (float) arg4 + (float) arg0.anInt523 / 2.0F, (float) -local126 + (float) arg3 + (float) arg0.anInt515 / 2.0F, 4096, (int) (-local112 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)V")
	public static void method4518(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 31; local11 > 0; local11--) {
			@Pc(17) int local17 = local11 * 36;
			for (@Pc(19) int local19 = 35; local19 > 0; local19--) {
				if (arg0[local19 + local17] == 0 && arg0[local17 + local19 - 1 - 36] != 0) {
					arg0[local19 + local17] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
	public static void method4519() {
		@Pc(1) Class103 local1 = Static189.aClass103_34;
		synchronized (Static189.aClass103_34) {
			Static189.aClass103_34.method2684();
		}
		local1 = Static179.aClass103_30;
		synchronized (Static179.aClass103_30) {
			Static179.aClass103_30.method2684();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4521(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static2.anInt17; local14++) {
			if (arg0.equalsIgnoreCase(Static94.aStringArray24[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static58.aStringArray12[local14])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(ZI)I")
	public static int method4522(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
