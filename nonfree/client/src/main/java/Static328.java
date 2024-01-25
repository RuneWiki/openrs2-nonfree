import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!so", name = "A", descriptor = "I")
	public static int anInt5513;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "Z")
	public static boolean aBoolean517 = true;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!so", name = "x", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_143 = new Class211(87, 28);

	@OriginalMember(owner = "client!so", name = "C", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_196 = new Class48(38, -1);

	@OriginalMember(owner = "client!so", name = "D", descriptor = "I")
	public static int anInt5515 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(JB)V")
	public static void method4756(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static85.anInt1570;
		@Pc(9) int local9 = Static16.anInt287;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (local7 != Static305.anInt5159) {
			local17 = local7 - Static305.anInt5159;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local17 < local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local17 > local25) {
				local25 = local17;
			}
			Static305.anInt5159 += local25;
		}
		if (Static92.anInt1674 != local9) {
			local17 = local9 - Static92.anInt1674;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local17 > local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static92.anInt1674 += local25;
		}
		if (!Static188.aClass135_Sub1_1.aBoolean329) {
			Static386.aFloat82 += (float) arg0 * Static356.aFloat22 / 40.0F * 8.0F;
			Static19.aFloat1 += (float) arg0 * Static37.aFloat2 / 40.0F * 8.0F;
		}
		Static227.method4202();
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	public static void method4757() {
		Static55.anIntArray145 = null;
		Static384.anIntArray732 = null;
		Static212.aBoolean354 = false;
		Static392.anIntArray747 = null;
		Static24.anIntArray75 = null;
		Static155.anIntArray338 = null;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)I")
	public static int method4758(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(IB)I")
	public static int method4759(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public static void method4760() {
		Static335.anImage2 = null;
		Static202.aFont1 = null;
	}
}
