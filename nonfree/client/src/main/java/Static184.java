import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Lclient!lc;")
	public static final Class126 aClass126_4 = new Class126();

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	public static final int[] anIntArray329 = new int[13];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V")
	public static void method3541(@OriginalArg(1) boolean arg0) {
		Static266.aBoolean339 = arg0;
		Static198.aBoolean250 = !Static96.method2208();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method3542() {
		Static273.aClass11_117.method213();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!up;II)J")
	public static long method3543(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class59 local15 = Static232.method2200(arg1.method4070());
		@Pc(36) long local36 = (long) ((arg2 | 0x800000) << 7 | arg0 | arg1.method4066() << 14 | arg1.method4067() << 20);
		if (local15.anInt1955 == 0) {
			local36 |= local9;
		}
		if (local15.anInt1938 == 1) {
			local36 |= local5;
		}
		if (local15.aBoolean127) {
			local36 |= local7;
		}
		return local36 | (long) arg1.method4070() << 32;
	}
}
