import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public static int anInt2291;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public static int anInt2290 = -1;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Lclient!mo;")
	public static final Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)I")
	public static int method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)I")
	public static int method1947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(32) int local32 = (arg1 & 0x7F) * arg2 + (arg0 & 0x7F) * local13 >> 7;
		@Pc(46) int local46 = local13 * (arg0 & 0x380) + arg2 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = arg2 * (arg1 & 0xFC00) + (arg0 & 0xFC00) * local13 >> 7;
		return local46 & 0x380 | local60 & 0xFC00 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZI)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class8_Sub18 local10 = Static211.method4038(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray153.length; local15++) {
				local10.anIntArray153[local15] = -1;
				local10.anIntArray154[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method1950() {
		@Pc(5) Class236 local5 = Static438.aClass236_75;
		synchronized (Static438.aClass236_75) {
			Static438.aClass236_75.method6243(5);
		}
		local5 = Static120.aClass236_20;
		synchronized (Static120.aClass236_20) {
			Static120.aClass236_20.method6243(5);
		}
	}
}
