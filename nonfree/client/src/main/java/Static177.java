import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public static int anInt3319;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array23;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "Lclient!vj;")
	public static Class206 aClass206_3;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIZLclient!dp;II)V")
	public static void method3430(@OriginalArg(1) int arg0, @OriginalArg(3) Class53 arg1, @OriginalArg(5) int arg2) {
		Static21.anInt335 = arg2;
		Static281.aBoolean369 = false;
		Static319.anInt5902 = 1;
		Static281.anInt5318 = 10000;
		Static252.aClass53_117 = arg1;
		Static16.anInt300 = 0;
		Static76.anInt2855 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!mb;III)V")
	public static void method3432(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte55 == 0) {
			arg0.anInt3581 = arg0.anInt3559;
		} else if (arg0.aByte55 == 1) {
			arg0.anInt3581 = arg0.anInt3559 + (arg2 - arg0.anInt3503) / 2;
		} else if (arg0.aByte55 == 2) {
			arg0.anInt3581 = arg2 - arg0.anInt3559 - arg0.anInt3503;
		} else if (arg0.aByte55 == 3) {
			arg0.anInt3581 = arg2 * arg0.anInt3559 >> 14;
		} else if (arg0.aByte55 == 4) {
			arg0.anInt3581 = (arg2 * arg0.anInt3559 >> 14) + (arg2 - arg0.anInt3503) / 2;
		} else {
			arg0.anInt3581 = arg2 - arg0.anInt3503 - (arg0.anInt3559 * arg2 >> 14);
		}
		if (arg0.aByte54 == 0) {
			arg0.anInt3498 = arg0.anInt3550;
		} else if (arg0.aByte54 == 1) {
			arg0.anInt3498 = arg0.anInt3550 + (arg1 - arg0.anInt3507) / 2;
		} else if (arg0.aByte54 == 2) {
			arg0.anInt3498 = arg1 - arg0.anInt3507 - arg0.anInt3550;
		} else if (arg0.aByte54 == 3) {
			arg0.anInt3498 = arg1 * arg0.anInt3550 >> 14;
		} else if (arg0.aByte54 == 4) {
			arg0.anInt3498 = (arg1 * arg0.anInt3550 >> 14) + (arg1 - arg0.anInt3507) / 2;
		} else {
			arg0.anInt3498 = arg1 - (arg1 * arg0.anInt3550 >> 14) - arg0.anInt3507;
		}
		if (!Static249.aBoolean326 || Static43.method751(arg0).anInt5011 == 0 && arg0.anInt3524 != 0) {
			return;
		}
		if (arg0.anInt3581 < 0) {
			arg0.anInt3581 = 0;
		} else if (arg2 < arg0.anInt3581 + arg0.anInt3503) {
			arg0.anInt3581 = arg2 - arg0.anInt3503;
		}
		if (arg0.anInt3498 < 0) {
			arg0.anInt3498 = 0;
		} else if (arg1 < arg0.anInt3507 + arg0.anInt3498) {
			arg0.anInt3498 = arg1 - arg0.anInt3507;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)V")
	public static void method3433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(6, arg1);
		local8.method2648();
		local8.anInt2511 = arg0;
	}
}
