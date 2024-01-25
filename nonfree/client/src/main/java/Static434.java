import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_175 = new Class215(77, 4);

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "J")
	public static long aLong199 = 0L;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	public static void method6894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg1, 5);
		local8.method3088();
		local8.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/lang/Object;II)[B")
	public static byte[] method6895(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static334.method5736(arg1, local13);
		} else if (arg0 instanceof Class12) {
			@Pc(30) Class12 local30 = (Class12) arg0;
			return local30.method5578(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
