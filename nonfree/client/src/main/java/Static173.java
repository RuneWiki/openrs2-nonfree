import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_38;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1210 = Static8.method128("Existing User");

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!rc;")
	public static Class66 aClass66_26 = new Class66(100);

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1211 = Static8.method128("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1212 = aClass18_1210;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "Lclient!da;")
	public static Class14 aClass14_15 = new Class14(4096);

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1213 = Static8.method128("Loading )2 please wait)3");

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1214 = aClass18_1213;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1215 = Static8.method128("::clientdrop");

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1216 = Static8.method128("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
	public static void method3150() {
		aClass18_1211 = null;
		aClass14_15 = null;
		aClass18_1213 = null;
		aClass18_1214 = null;
		aClass18_1215 = null;
		aClass18_1212 = null;
		aClass18_1216 = null;
		aClass66_26 = null;
		aClass16_38 = null;
		aClass18_1210 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class1_Sub1_Sub14 method3151(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static31.aClass66_5.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static132.aClass16_23.method2254(arg0, 16);
		local10 = new Class1_Sub1_Sub14();
		if (local20 != null) {
			local10.method2534(new Class1_Sub6(local20));
		}
		Static31.aClass66_5.method2597((long) arg0, local10);
		return local10;
	}
}
