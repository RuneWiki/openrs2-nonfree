import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!bt;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBI)Z")
	public static boolean method4390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static393.method5917(arg0, arg1) & Static609.method8333(arg1, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!rh;")
	public static Class80 method4391(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class80 local10;
		try {
			local10 = (Class80) Class.forName("ds").getDeclaredConstructor().newInstance();
		} catch (@Pc(12) Throwable local12) {
			local10 = new Class80_Sub2();
		}
		local10.aString75 = arg1;
		local10.anInt4280 = arg0;
		return local10;
	}
}
