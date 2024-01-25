import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!f;")
	public static Class22 aClass22_25;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!mo;")
	public static Class1_Sub35 aClass1_Sub35_4;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[8];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
	public static boolean method3768() {
		return Static337.anInt8004 > 0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method3769() {
		if (Static77.aClass308_2 != Static357.aClass308_6) {
			try {
				Static602.method2417(Static399.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZZZ)V")
	public static void method3771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		Static329.method4515(arg1, 0, arg0, arg3, arg2, Static436.aClass317_Sub1Array2.length - 1);
		Static375.aClass1_Sub34_2 = null;
		Static355.anInt5920 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!mo;I)Lclient!pr;")
	public static Class267 method3772(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(7) String local7 = arg0.method5760();
		@Pc(14) Class335 local14 = Static119.method1872()[arg0.method5750()];
		@Pc(21) Class122 local21 = Static20.method239()[arg0.method5750()];
		@Pc(31) int local31 = arg0.method5738();
		@Pc(35) int local35 = arg0.method5738();
		@Pc(39) int local39 = arg0.method5750();
		@Pc(43) int local43 = arg0.method5750();
		@Pc(47) int local47 = arg0.method5750();
		@Pc(51) int local51 = arg0.method5771();
		@Pc(55) int local55 = arg0.method5771();
		@Pc(59) int local59 = arg0.method5804();
		@Pc(63) int local63 = arg0.method5804();
		@Pc(67) int local67 = arg0.method5804();
		return new Class267(local7, local14, local21, local31, local35, local39, local43, local47, local51, local55, local59, local63, local67);
	}
}
