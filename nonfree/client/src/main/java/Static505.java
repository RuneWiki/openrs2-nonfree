import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_128 = new Class151(132, 1);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!ml;")
	public static final Class236 aClass236_6 = new Class236();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILclient!qb;)J")
	public static long method5113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface20 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(21) Class342 local21 = Static441.aClass74_169.method2075(arg2.method7087());
		@Pc(42) long local42 = (long) (arg1 << 7 | arg0 | arg2.method7086() << 14 | arg2.method7088() << 20 | 0x40000000);
		if (local21.anInt8742 == 0) {
			local42 |= local12;
		}
		if (local21.anInt8693 == 1) {
			local42 |= local10;
		}
		return local42 | (long) arg2.method7087() << 32;
	}
}
