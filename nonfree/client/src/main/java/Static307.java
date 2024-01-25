import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!r;")
	public static Class134 aClass134_8;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!ba;")
	public static final Class23 aClass23_5 = new Class23(2);

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public static int anInt5279 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BILjava/lang/String;IZ)V")
	public static void method4285(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static280.method3935(null, false, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public static void method4287(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub6_Sub16 local12 = Static212.method3332(11, arg0);
		local12.method6593();
	}
}
