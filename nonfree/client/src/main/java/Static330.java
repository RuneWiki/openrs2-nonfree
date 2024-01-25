import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Lclient!hh;")
	public static Class109 aClass109_75;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public static final int anInt6002 = 1405;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "[I")
	public static final int[] anIntArray443 = new int[14];

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public static int anInt6005 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!rq;BI)J")
	public static long method4759(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class29 local24 = Static251.aClass207_2.method4977(arg1.method5744());
		@Pc(45) long local45 = (long) (arg1.method5747() << 14 | arg0 << 7 | arg2 | arg1.method5742() << 20 | 0x40000000);
		if (local24.anInt550 == 0) {
			local45 |= local17;
		}
		if (local24.anInt531 == 1) {
			local45 |= local13;
		}
		if (local24.aBoolean45) {
			local45 |= local15;
		}
		return local45 | (long) arg1.method5744() << 32;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method4767() {
		Static169.method2637(25);
		Static397.method5466();
		System.gc();
	}
}
