import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
	public static int anInt561;

	@OriginalMember(owner = "client!ar", name = "L", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_15 = new Class186(98, 6);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method426(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg1, 2);
		local8.method2762();
		local8.aString44 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!jb;ZII)V")
	public static void method428(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte66 == 0) {
			arg0.anInt3406 = arg0.anInt3412;
		} else if (arg0.aByte66 == 1) {
			arg0.anInt3406 = (arg1 - arg0.anInt3421) / 2 + arg0.anInt3412;
		} else if (arg0.aByte66 == 2) {
			arg0.anInt3406 = arg1 - arg0.anInt3421 - arg0.anInt3412;
		} else if (arg0.aByte66 == 3) {
			arg0.anInt3406 = arg0.anInt3412 * arg1 >> 14;
		} else if (arg0.aByte66 == 4) {
			arg0.anInt3406 = (arg0.anInt3412 * arg1 >> 14) + (arg1 - arg0.anInt3421) / 2;
		} else {
			arg0.anInt3406 = arg1 - arg0.anInt3421 - (arg1 * arg0.anInt3412 >> 14);
		}
		if (arg0.aByte65 == 0) {
			arg0.anInt3415 = arg0.anInt3429;
		} else if (arg0.aByte65 == 1) {
			arg0.anInt3415 = arg0.anInt3429 + (arg2 - arg0.anInt3442) / 2;
		} else if (arg0.aByte65 == 2) {
			arg0.anInt3415 = arg2 - arg0.anInt3429 - arg0.anInt3442;
		} else if (arg0.aByte65 == 3) {
			arg0.anInt3415 = arg2 * arg0.anInt3429 >> 14;
		} else if (arg0.aByte65 == 4) {
			arg0.anInt3415 = (arg2 - arg0.anInt3442) / 2 + (arg0.anInt3429 * arg2 >> 14);
		} else {
			arg0.anInt3415 = arg2 - arg0.anInt3442 - (arg0.anInt3429 * arg2 >> 14);
		}
		if (!Static197.aBoolean436) {
			return;
		}
		if (Static55.method1118(arg0).anInt5771 == 0 && arg0.anInt3426 != 0) {
			return;
		}
		if (arg0.anInt3406 < 0) {
			arg0.anInt3406 = 0;
		} else if (arg0.anInt3406 + arg0.anInt3421 > arg1) {
			arg0.anInt3406 = arg1 - arg0.anInt3421;
		}
		if (arg0.anInt3415 < 0) {
			arg0.anInt3415 = 0;
			return;
		}
		if (arg2 < arg0.anInt3442 + arg0.anInt3415) {
			arg0.anInt3415 = arg2 - arg0.anInt3442;
			return;
		}
	}
}
