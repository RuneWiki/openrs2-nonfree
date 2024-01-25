import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!jc;")
	public static final Class117 aClass117_6 = new Class117("RC", 1);

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public static int anInt5948 = 0;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "[I")
	public static final int[] anIntArray417 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILclient!f;I)J")
	public static long method4675(@OriginalArg(1) int arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class202 local16 = Static267.aClass262_2.method5560(arg1.method5350());
		@Pc(37) long local37 = (long) ((arg2 | 0x800000) << 7 | arg0 | arg1.method5354() << 14 | arg1.method5347() << 20);
		if (local16.anInt5813 == 0) {
			local37 |= local9;
		}
		if (local16.anInt5818 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean529) {
			local37 |= local7;
		}
		return local37 | (long) arg1.method5350() << 32;
	}
}
