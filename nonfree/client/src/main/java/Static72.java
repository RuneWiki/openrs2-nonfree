import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public static int anInt1131;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I")
	public static int method1165(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIBI)Lclient!wu;")
	public static Class384 method1168(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class229 local12 = null;
		if (Static161.aClass64_1 != null) {
			local12 = new Class229(arg2, Static161.aClass64_1, Static162.aClass64Array1[arg2], 1000000);
		}
		Static354.aClass277_Sub1Array1[arg2] = Static267.aClass303_1.method7161(Static249.aClass229_1, arg2, local12);
		Static354.aClass277_Sub1Array1[arg2].method6640();
		return new Class384(Static354.aClass277_Sub1Array1[arg2], arg0, arg1);
	}
}
