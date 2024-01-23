import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!wc;")
	public static Class110 aClass110_19 = new Class110(64);

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "[I")
	public static int[] anIntArray665 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
	public static int[] anIntArray666 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Lclient!jh;")
	public static Class53 aClass53_14 = new Class53(30);

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "J")
	public static volatile long aLong149 = 0L;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_701 = Static199.method3560("wishes to trade with you)3");

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_702 = aClass78_701;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	public static void method3170() {
		@Pc(7) byte[][] local7 = Static150.aByteArrayArray10;
		@Pc(10) int local10 = Static7.aByteArrayArray2.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(23) byte[] local23 = local7[local12];
			if (local23 != null) {
				@Pc(35) int local35 = (Static171.anIntArray653[local12] >> 8) * 64 - Static28.anInt497;
				@Pc(46) int local46 = (Static171.anIntArray653[local12] & 0xFF) * 64 - Static57.anInt628;
				Static41.method565();
				Static106.method1822(local46, local23, Static202.aClass90Array1, local35);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!nh;IIIIIIZ)V")
	public static void method3178(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(27) int local27;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local27 = arg0.method2122();
				if (local27 == 0) {
					return;
				}
				if (local27 == 1) {
					arg0.method2122();
					return;
				}
				if (local27 <= 49) {
					arg0.method2122();
				}
			}
			return;
		}
		Static133.aByteArrayArrayArray10[arg6][arg5][arg4] = 0;
		while (true) {
			local27 = arg0.method2122();
			if (local27 == 0) {
				if (arg6 == 0) {
					Static144.anIntArrayArrayArray7[0][arg5][arg4] = -Static33.method422(arg4 + arg3 + 556238, arg2 + 932731 + arg5) * 8;
					return;
				} else {
					Static144.anIntArrayArrayArray7[arg6][arg5][arg4] = Static144.anIntArrayArrayArray7[arg6 - 1][arg5][arg4] - 240;
					return;
				}
			}
			if (local27 == 1) {
				@Pc(145) int local145 = arg0.method2122();
				if (local145 == 1) {
					local145 = 0;
				}
				if (arg6 != 0) {
					Static144.anIntArrayArrayArray7[arg6][arg5][arg4] = Static144.anIntArrayArrayArray7[arg6 - 1][arg5][arg4] - local145 * 8;
					return;
				}
				Static144.anIntArrayArrayArray7[0][arg5][arg4] = -local145 * 8;
				return;
			}
			if (local27 <= 49) {
				Static170.aByteArrayArrayArray13[arg6][arg5][arg4] = arg0.method2114();
				Static12.aByteArrayArrayArray1[arg6][arg5][arg4] = (byte) ((local27 - 2) / 4);
				Static126.aByteArrayArrayArray7[arg6][arg5][arg4] = (byte) (local27 + arg1 - 2 & 0x3);
			} else if (local27 <= 81) {
				Static133.aByteArrayArrayArray10[arg6][arg5][arg4] = (byte) (local27 - 49);
			} else {
				Static128.aByteArrayArrayArray8[arg6][arg5][arg4] = (byte) (local27 - 81);
			}
		}
	}
}
