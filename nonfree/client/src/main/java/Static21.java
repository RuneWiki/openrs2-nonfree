import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt707;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!nt;")
	public static Class270 aClass270_1 = null;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "J")
	public static long aLong19 = -1L;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "[I")
	public static final int[] anIntArray47 = new int[1];

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIII)V")
	public static void method641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static82.anInt1902 && arg1 + arg2 <= Static77.anInt1737 && arg3 - arg1 >= Static549.anInt5294 && arg3 + arg1 <= Static334.anInt5381) {
			Static503.method6863(arg0, arg1, arg3, arg2);
		} else {
			Static64.method1482(arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBILclient!et;)J")
	public static long method642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface9 arg2) {
		@Pc(12) long local12 = 4194304L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class247 local21 = Static216.aClass53_3.method1523(arg2.method9107());
		@Pc(44) long local44 = (long) (arg0 | arg1 << 7 | arg2.method9102() << 14 | arg2.method9105() << 20 | 0x40000000);
		if (local21.anInt6278 == 0) {
			local44 |= local14;
		}
		if (local21.anInt6259 == 1) {
			local44 |= local12;
		}
		return local44 | (long) arg2.method9107() << 32;
	}
}
