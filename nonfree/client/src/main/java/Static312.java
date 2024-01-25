import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	public static int anInt5418;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "[Lclient!qb;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	public static int anInt5420;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	public static int anInt5414 = 0;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_139 = new Class12(20, 6);

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static int anInt5417 = 0;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt5419 = -1;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!wk;IIII)V")
	public static void method4242(@OriginalArg(0) Class25_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class236 local13 = arg0.method3428();
		@Pc(23) int local23 = arg0.anInt4269 - arg0.aClass265_7.anInt7384 & 0x3FFF;
		if (arg3 == -1) {
			if (local23 != 0 || arg0.anInt4310 > 25) {
				arg0.aBoolean483 = false;
				if (arg2 < 0 && local13.anInt6479 != -1) {
					arg0.anInt4287 = local13.anInt6479;
				} else if (arg2 <= 0 || local13.anInt6480 == -1) {
					arg0.anInt4287 = local13.anInt6447;
				} else {
					arg0.anInt4287 = local13.anInt6480;
				}
			} else if (!arg0.aBoolean483 || !local13.method5071(arg0.anInt4287)) {
				arg0.anInt4287 = local13.method5075();
				arg0.aBoolean483 = arg0.anInt4287 != -1;
			}
		} else if (arg0.anInt4238 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(120) int local120 = Static103.anIntArray134[arg1] - arg0.aClass265_7.anInt7384 & 0x3FFF;
			if (arg3 == 2 && local13.anInt6463 != -1) {
				if (local120 > 2048 && local120 <= 6144 && local13.anInt6477 != -1) {
					arg0.anInt4287 = local13.anInt6477;
				} else if (local120 >= 10240 && local120 < 14336 && local13.anInt6452 != -1) {
					arg0.anInt4287 = local13.anInt6452;
				} else if (local120 <= 6144 || local120 >= 10240 || local13.anInt6458 == -1) {
					arg0.anInt4287 = local13.anInt6463;
				} else {
					arg0.anInt4287 = local13.anInt6458;
				}
			} else if (arg3 == 0 && local13.anInt6470 != -1) {
				if (local120 > 2048 && local120 <= 6144 && local13.anInt6441 != -1) {
					arg0.anInt4287 = local13.anInt6441;
				} else if (local120 >= 10240 && local120 < 14336 && local13.anInt6466 != -1) {
					arg0.anInt4287 = local13.anInt6466;
				} else if (local120 <= 6144 || local120 >= 10240 || local13.anInt6454 == -1) {
					arg0.anInt4287 = local13.anInt6470;
				} else {
					arg0.anInt4287 = local13.anInt6454;
				}
			} else if (local120 > 2048 && local120 <= 6144 && local13.anInt6461 != -1) {
				arg0.anInt4287 = local13.anInt6461;
			} else if (local120 >= 10240 && local120 < 14336 && local13.anInt6478 != -1) {
				arg0.anInt4287 = local13.anInt6478;
			} else if (local120 <= 6144 || local120 >= 10240 || local13.anInt6443 == -1) {
				arg0.anInt4287 = local13.anInt6447;
			} else {
				arg0.anInt4287 = local13.anInt6443;
			}
			arg0.aBoolean483 = false;
		} else if (local23 == 0 && arg0.anInt4310 <= 25) {
			if (arg3 == 2 && local13.anInt6463 != -1) {
				arg0.anInt4287 = local13.anInt6463;
			} else if (arg3 == 0 && local13.anInt6470 != -1) {
				arg0.anInt4287 = local13.anInt6470;
			} else {
				arg0.anInt4287 = local13.anInt6447;
			}
			arg0.aBoolean483 = false;
		} else {
			if (arg3 == 2 && local13.anInt6463 != -1) {
				if (arg2 < 0 && local13.anInt6462 != -1) {
					arg0.anInt4287 = local13.anInt6462;
				} else if (arg2 <= 0 || local13.anInt6474 == -1) {
					arg0.anInt4287 = local13.anInt6463;
				} else {
					arg0.anInt4287 = local13.anInt6474;
				}
			} else if (arg3 == 0 && local13.anInt6470 != -1) {
				if (arg2 < 0 && local13.anInt6451 != -1) {
					arg0.anInt4287 = local13.anInt6451;
				} else if (arg2 <= 0 || local13.anInt6455 == -1) {
					arg0.anInt4287 = local13.anInt6470;
				} else {
					arg0.anInt4287 = local13.anInt6455;
				}
			} else if (arg2 < 0 && local13.anInt6448 != -1) {
				arg0.anInt4287 = local13.anInt6448;
			} else if (arg2 <= 0 || local13.anInt6467 == -1) {
				arg0.anInt4287 = local13.anInt6447;
			} else {
				arg0.anInt4287 = local13.anInt6467;
			}
			arg0.aBoolean483 = false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method4243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg1] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static95.aCharArray1[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}
}
