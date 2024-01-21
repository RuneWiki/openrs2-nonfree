import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_392 = Static151.method2243("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!jh;")
	public static final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_393 = Static151.method2243(":assistreq:");

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method793() {
		Static91.aClass53_8.method1649();
		Static162.aClass79_10.method2351();
		Static84.aClass79_11.method2351();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI)Z")
	public static boolean method794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(24) Class2_Sub1_Sub11 local24 = Static60.method844(arg0);
		return local24.method1063(arg1);
	}
}
