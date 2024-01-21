import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!q", name = "P", descriptor = "I")
	public static int anInt3518;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "Lclient!ef;")
	public static Class20 aClass20_11;

	@OriginalMember(owner = "client!q", name = "M", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!ea;")
	private static Class18 aClass18_888 = Static8.method128("Click to switch");

	@OriginalMember(owner = "client!q", name = "O", descriptor = "I")
	public static int anInt3517 = 0;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "Lclient!ea;")
	public static Class18 aClass18_889 = aClass18_888;

	@OriginalMember(owner = "client!q", name = "U", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!q", name = "V", descriptor = "[I")
	public static int[] anIntArray312 = new int[50];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	public static void method2450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub1_Sub6 local7 = Static60.method1242(arg0);
		@Pc(10) int local10 = local7.anInt609;
		@Pc(13) int local13 = local7.anInt610;
		@Pc(16) int local16 = local7.anInt608;
		@Pc(22) int local22 = Class1_Sub1_Sub10.anIntArray193[local16 - local13];
		if (arg1 < 0 || local22 < arg1) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static170.anIntArray420[local10] = ~local22 & Static170.anIntArray420[local10] | arg1 << local13 & local22;
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
	public static void method2451() {
		aClass18_888 = null;
		aClass20_11 = null;
		aClass18_889 = null;
		anIntArray312 = null;
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
	public static void method2452() {
		@Pc(3) Class23 local3 = Static80.aClass23_1;
		synchronized (Static80.aClass23_1) {
			Static118.anInt3368 = Static83.anInt4752;
			@Pc(19) int local19;
			if (Static25.anInt880 < 0) {
				for (local19 = 0; local19 < 112; local19++) {
					Static45.aBooleanArray6[local19] = false;
				}
				Static25.anInt880 = Static143.anInt3955;
			} else {
				while (Static143.anInt3955 != Static25.anInt880) {
					local19 = Static108.anIntArray280[Static143.anInt3955];
					Static143.anInt3955 = Static143.anInt3955 + 1 & 0x7F;
					if (local19 < 0) {
						Static45.aBooleanArray6[~local19] = false;
					} else {
						Static45.aBooleanArray6[local19] = true;
					}
				}
			}
			Static83.anInt4752 = Static86.anInt2624;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lclient!ea;")
	public static Class18 method2453(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(46) byte[] local46 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local30--;
				local46[local30] = Static123.aByteArray36[(int) (local50 - arg0 * 37L)];
			}
			@Pc(75) Class18 local75 = new Class18();
			local75.aByteArray6 = local46;
			local75.anInt1129 = local46.length;
			return local75;
		}
	}
}
