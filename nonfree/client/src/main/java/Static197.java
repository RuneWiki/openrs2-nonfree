import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_67 = new Class92(5, -1);

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3085(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static52.method1204(Static362.method5353(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
	public static void method3086(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub2_Sub7 local15 = Static212.method3218(arg0, 2);
		local15.method3084();
	}
}
