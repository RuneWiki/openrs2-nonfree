import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_60 = new Class181(12, 6);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt5258 = 0;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "[Lclient!hq;")
	public static Class141[] aClass141Array1 = null;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)Z")
	public static boolean method4523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ql;II)J")
	public static long method4524(@OriginalArg(1) Interface17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class31 local16 = Static480.aClass57_11.method1469(arg0.method8114());
		@Pc(37) long local37 = (long) ((arg0.method8119() | 0x10000) << 14 | arg1 | arg2 << 7 | arg0.method8121() << 20);
		if (local16.anInt1107 == 0) {
			local37 |= local9;
		}
		if (local16.anInt1103 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean86) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method8114() << 32;
	}
}
