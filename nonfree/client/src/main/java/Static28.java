import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_1 = new Class328(11, 7);

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public static final int[] anIntArray41 = new int[2048];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!wv;)V")
	public static void method884(@OriginalArg(1) Class4_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt7105 - Static312.anInt5688;
		@Pc(21) int local21 = arg0.anInt7091 * 512 + arg0.method5892() * 256;
		@Pc(33) int local33 = arg0.anInt7086 * 512 + arg0.method5892() * 256;
		arg0.anInt9540 += (local33 - arg0.anInt9540) / local9;
		arg0.anInt9542 += (local21 - arg0.anInt9542) / local9;
		arg0.anInt7134 = 0;
		if (arg0.anInt7056 == 0) {
			arg0.method5909(8192);
		}
		if (arg0.anInt7056 == 1) {
			arg0.method5909(12288);
		}
		if (arg0.anInt7056 == 2) {
			arg0.method5909(0);
		}
		if (arg0.anInt7056 == 3) {
			arg0.method5909(4096);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JJ)J")
	public static long method885(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
