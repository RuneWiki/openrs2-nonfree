import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!oj;")
	public static Class84 aClass84_16 = new Class84(4);

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!mi;")
	public static Class75 aClass75_4 = new Class75();

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!qc;")
	public static Class90 aClass90_7 = new Class90(4096);

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_306 = Static186.method3527("loginscreen");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(DZ)V")
	public static void method643(@OriginalArg(0) double arg0) {
		if (arg0 == Static200.aDouble3) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static95.anIntArray175[local7] = local19 <= 255 ? local19 : 255;
		}
		Static200.aDouble3 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lclient!hh;")
	public static Class50 method645(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static160.method2684(arg0) : Static125.aClass50_863;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public static void method646() {
		for (@Pc(1) int local1 = 0; local1 < Static158.anInt3271; local1++) {
			@Pc(6) Class94 local6 = Static183.aClass94Array4[local1];
			Static217.method3388(local6);
			Static183.aClass94Array4[local1] = null;
		}
		Static158.anInt3271 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg4 < 128 || arg2 < 128 || arg4 > 13056 || arg2 > 13056) {
			Static226.anInt4354 = -1;
			Static165.anInt2637 = -1;
			return;
		}
		@Pc(35) int local35 = Static131.method2213(arg2, arg4, Static212.anInt4195) - arg1;
		@Pc(39) int local39 = arg4 - Static159.anInt4227;
		@Pc(43) int local43 = arg2 - Static137.anInt2804;
		@Pc(47) int local47 = local35 - Static32.anInt601;
		@Pc(51) int local51 = Class120.anIntArray491[Static218.anInt3563];
		@Pc(55) int local55 = Class120.anIntArray492[Static218.anInt3563];
		@Pc(59) int local59 = Class120.anIntArray491[Static166.anInt3404];
		@Pc(63) int local63 = Class120.anIntArray492[Static166.anInt3404];
		@Pc(73) int local73 = local39 * local63 + local43 * local59 >> 16;
		@Pc(84) int local84 = local63 * local43 - local59 * local39 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(96) int local96 = local47 * local55 - local51 * local84 >> 16;
		@Pc(106) int local106 = local47 * local51 + local55 * local84 >> 16;
		if (local106 < 50) {
			Static226.anInt4354 = -1;
			Static165.anInt2637 = -1;
		} else {
			Static165.anInt2637 = arg0 + (local86 << 9) / local106;
			Static226.anInt4354 = (local96 << 9) / local106 + arg3;
		}
	}
}
