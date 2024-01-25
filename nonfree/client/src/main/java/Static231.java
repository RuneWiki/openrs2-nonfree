import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray3;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(JI)V")
	public static void method4620(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public static void method4622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub5_Sub20 local14 = Static447.method6065((long) arg0, 16);
		local14.method8832();
		local14.anInt10754 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZII)I")
	public static int method4623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
