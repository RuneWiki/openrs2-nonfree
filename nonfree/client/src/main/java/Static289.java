import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "Lclient!oc;")
	public static Class212 aClass212_2;

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
	public static int anInt5875;

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Lclient!lk;")
	public static final Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "Lclient!os;")
	public static final Class223 aClass223_4 = new Class223();

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIZLclient!qb;)V")
	public static void method4899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6_Sub1_Sub2 arg3) {
		@Pc(9) Class73 local9 = arg3.method7088();
		@Pc(19) int local19 = arg3.anInt8544 - arg3.aClass173_7.anInt5572 & 0x3FFF;
		if (arg2 == -1) {
			if (local19 != 0 || arg3.anInt8550 > 25) {
				arg3.aBoolean630 = false;
				if (arg1 < 0 && local9.anInt2437 != -1) {
					arg3.anInt8534 = local9.anInt2437;
				} else if (arg1 <= 0 || local9.anInt2428 == -1) {
					arg3.anInt8534 = local9.anInt2438;
				} else {
					arg3.anInt8534 = local9.anInt2428;
				}
			} else if (!arg3.aBoolean630 || !local9.method2120(arg3.anInt8534)) {
				arg3.anInt8534 = local9.method2119();
				arg3.aBoolean630 = arg3.anInt8534 != -1;
			}
		} else if (arg3.anInt8563 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(213) int local213 = Static210.anIntArray419[arg0] - arg3.aClass173_7.anInt5572 & 0x3FFF;
			arg3.aBoolean630 = false;
			if (arg2 == 2 && local9.anInt2434 != -1) {
				if (local213 > 2048 && local213 <= 6144 && local9.anInt2425 != -1) {
					arg3.anInt8534 = local9.anInt2425;
				} else if (local213 >= 10240 && local213 < 14336 && local9.anInt2439 != -1) {
					arg3.anInt8534 = local9.anInt2439;
				} else if (local213 <= 6144 || local213 >= 10240 || local9.anInt2412 == -1) {
					arg3.anInt8534 = local9.anInt2434;
				} else {
					arg3.anInt8534 = local9.anInt2412;
				}
			} else if (arg2 == 0 && local9.anInt2417 != -1) {
				if (local213 > 2048 && local213 <= 6144 && local9.anInt2403 != -1) {
					arg3.anInt8534 = local9.anInt2403;
				} else if (local213 >= 10240 && local213 < 14336 && local9.anInt2419 != -1) {
					arg3.anInt8534 = local9.anInt2419;
				} else if (local213 <= 6144 || local213 >= 10240 || local9.anInt2407 == -1) {
					arg3.anInt8534 = local9.anInt2417;
				} else {
					arg3.anInt8534 = local9.anInt2407;
				}
			} else if (local213 > 2048 && local213 <= 6144 && local9.anInt2409 != -1) {
				arg3.anInt8534 = local9.anInt2409;
			} else if (local213 >= 10240 && local213 < 14336 && local9.anInt2423 != -1) {
				arg3.anInt8534 = local9.anInt2423;
			} else if (local213 <= 6144 || local213 >= 10240 || local9.anInt2402 == -1) {
				arg3.anInt8534 = local9.anInt2438;
			} else {
				arg3.anInt8534 = local9.anInt2402;
			}
		} else if (local19 == 0 && arg3.anInt8550 <= 25) {
			arg3.aBoolean630 = false;
			if (arg2 == 2 && local9.anInt2434 != -1) {
				arg3.anInt8534 = local9.anInt2434;
			} else if (arg2 == 0 && local9.anInt2417 != -1) {
				arg3.anInt8534 = local9.anInt2417;
			} else {
				arg3.anInt8534 = local9.anInt2438;
			}
		} else {
			if (arg2 == 2 && local9.anInt2434 != -1) {
				if (arg1 < 0 && local9.anInt2408 != -1) {
					arg3.anInt8534 = local9.anInt2408;
				} else if (arg1 <= 0 || local9.anInt2433 == -1) {
					arg3.anInt8534 = local9.anInt2434;
				} else {
					arg3.anInt8534 = local9.anInt2433;
				}
			} else if (arg2 == 0 && local9.anInt2417 != -1) {
				if (arg1 < 0 && local9.anInt2422 != -1) {
					arg3.anInt8534 = local9.anInt2422;
				} else if (arg1 <= 0 || local9.anInt2414 == -1) {
					arg3.anInt8534 = local9.anInt2417;
				} else {
					arg3.anInt8534 = local9.anInt2414;
				}
			} else if (arg1 < 0 && local9.anInt2406 != -1) {
				arg3.anInt8534 = local9.anInt2406;
			} else if (arg1 <= 0 || local9.anInt2418 == -1) {
				arg3.anInt8534 = local9.anInt2438;
			} else {
				arg3.anInt8534 = local9.anInt2418;
			}
			arg3.aBoolean630 = false;
		}
	}
}
