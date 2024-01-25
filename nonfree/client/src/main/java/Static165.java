import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Lclient!eo;")
	public static Class68 aClass68_6;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)B")
	public static byte method2890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIB)V")
	public static void method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static139.method2522(16, arg0);
		local15.method1570();
		local15.anInt1933 = arg1;
	}
}
