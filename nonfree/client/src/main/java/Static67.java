import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "[Lclient!qp;")
	public static Class30_Sub7[] aClass30_Sub7Array3;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_18 = new Class212(13, 6);

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public static final int anInt9072 = 328;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLclient!p;I)J")
	public static long method7339(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(18) Class283 local18 = Static453.aClass88_3.method2294(arg1.method6868());
		@Pc(39) long local39 = (long) (arg0 << 7 | arg2 | arg1.method6867() << 14 | arg1.method6866() << 20 | 0x40000000);
		if (local18.anInt8152 == 0) {
			local39 |= local9;
		}
		if (local18.anInt8181 == 1) {
			local39 |= local5;
		}
		if (local18.aBoolean580) {
			local39 |= local7;
		}
		return local39 | (long) arg1.method6868() << 32;
	}
}
