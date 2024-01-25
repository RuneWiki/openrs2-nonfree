import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!pq;")
	public static Class229 aClass229_16;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_67 = new Class277(10);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)Z")
	public static boolean method7923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static333.method5657(arg1, arg0)) {
			return Static127.method2443(arg0, arg1) | (arg1 & 0x9000) != 0 | Static276.method7564(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static346.method5755(arg1, arg0) | Static469.method7144(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)Z")
	public static boolean method7928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!bo;")
	public static Class34 method7929(@OriginalArg(1) int arg0) {
		@Pc(10) Class34 local10 = (Class34) Static354.aClass277_51.method7014((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static364.aClass69_74.method1888(arg0, 0);
		local10 = new Class34();
		if (local22 != null) {
			local10.method1220(arg0, new Class1_Sub17(local22));
		}
		Static354.aClass277_51.method7016(local10, (long) arg0);
		return local10;
	}
}
