import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!cc;")
	public static Class25 aClass25_6;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!ub;")
	public static Class198 aClass198_140 = new Class198(64);

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "S")
	public static short aShort59 = 1;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_141 = new Class198(50);

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt3923 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Lclient!gn;")
	public static Class80 method3562(@OriginalArg(1) int arg0) {
		@Pc(10) Class198 local10 = Static32.aClass198_32;
		@Pc(19) Class80 local19;
		synchronized (Static32.aClass198_32) {
			local19 = (Class80) Static32.aClass198_32.method5210((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35 = Static97.aClass193_34.method5047(16, arg0);
		local19 = new Class80();
		if (local35 != null) {
			local19.method2353(new Class4_Sub11(local35));
		}
		@Pc(50) Class198 local50 = Static32.aClass198_32;
		synchronized (Static32.aClass198_32) {
			Static32.aClass198_32.method5201(local19, (long) arg0);
			return local19;
		}
	}
}
