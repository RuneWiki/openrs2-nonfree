import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!iga", name = "F", descriptor = "I")
	public static int anInt4731 = 0;

	@OriginalMember(owner = "client!iga", name = "N", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_8 = new Class178(9, 0, 4, 1);

	@OriginalMember(owner = "client!iga", name = "O", descriptor = "Lclient!bk;")
	public static final Class34 aClass34_1 = new Class34("LIVE", 0);

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(II)Lclient!df;")
	public static Class68 method4043(@OriginalArg(0) int arg0) {
		@Pc(10) Class68 local10 = (Class68) Static556.aClass136_64.method3134((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static388.aClass343_184.method8132(0, arg0);
		local10 = new Class68();
		if (local28 != null) {
			local10.method1583(new Class3_Sub9(local28));
		}
		local10.method1579();
		Static556.aClass136_64.method3135(local10, (long) arg0);
		return local10;
	}
}
