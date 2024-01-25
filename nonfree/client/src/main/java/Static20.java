import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!fd;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!nj;")
	public static Class139 method377(@OriginalArg(1) int arg0) {
		@Pc(15) Class139 local15 = (Class139) Static155.aClass154_56.method4222((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static350.aClass11_155.method288(arg0, 36);
		local15 = new Class139();
		local15.anInt4372 = arg0;
		if (local25 != null) {
			local15.method3658(new Class4_Sub7(local25));
		}
		local15.method3652();
		Static155.aClass154_56.method4221((long) arg0, local15);
		return local15;
	}
}
