import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
	public static int anInt1830;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_25 = new Class194(56, -1);

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BII)Z")
	public static boolean method1493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!bs;III)J")
	public static long method1495(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class114 local16 = Static398.aClass256_4.method5782(arg0.method6037());
		@Pc(37) long local37 = (long) (arg0.method6035() << 14 | arg2 << 7 | arg1 | arg0.method6034() << 20 | 0x40000000);
		if (local16.anInt3001 == 0) {
			local37 |= local9;
		}
		if (local16.anInt2983 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean190) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method6037() << 32;
	}
}
