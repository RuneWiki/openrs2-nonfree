import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "Lclient!et;")
	public static Class70 aClass70_5;

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "Lclient!co;")
	public static final Class41 aClass41_43 = new Class41(64);

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	public static void method2905() {
		@Pc(1) Class41 local1 = Static236.aClass41_55;
		synchronized (Static236.aClass41_55) {
			Static236.aClass41_55.method825();
		}
		local1 = Static157.aClass41_40;
		synchronized (Static157.aClass41_40) {
			Static157.aClass41_40.method825();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method2906(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static383.method5998(local13) : local13;
		} else if (arg1 instanceof Class28) {
			@Pc(27) Class28 local27 = (Class28) arg1;
			return local27.method2336();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
