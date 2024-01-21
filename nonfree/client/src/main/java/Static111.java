import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public static int anInt3252;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_818 = Static8.method128("(U(Y");

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_819 = Static8.method128("logo");

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_820 = Static8.method128("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_821 = Static8.method128("headicons_pk");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt3245 = 0;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_822 = Static8.method128("::fpson");

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_823 = Static8.method128("me");

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_824 = Static8.method128(":");

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_825 = Static8.method128("Freie Welt");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method2266() {
		aClass18_823 = null;
		aClass18_821 = null;
		aClass18_824 = null;
		aClass18_822 = null;
		aClass18_818 = null;
		aClass18_820 = null;
		aClass18_825 = null;
		aClass18_819 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
	public static void method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static80.anInt2478 < 2 && Static98.anInt3018 == 0 && !Static21.aBoolean19) {
			return;
		}
		@Pc(44) Class18 local44;
		if (Static98.anInt3018 == 1 && Static80.anInt2478 < 2) {
			local44 = Static144.method2735(new Class18[] { Static144.aClass18_1016, Static87.aClass18_646, Static135.aClass18_967, Static66.aClass18_483 });
		} else if (Static21.aBoolean19 && Static80.anInt2478 < 2) {
			local44 = Static144.method2735(new Class18[] { Static9.aClass18_106, Static87.aClass18_646, Static127.aClass18_912, Static66.aClass18_483 });
		} else {
			local44 = Static125.method2488(Static80.anInt2478 - 1);
		}
		if (Static80.anInt2478 > 2) {
			local44 = Static144.method2735(new Class18[] { local44, Static160.aClass18_1132, Static132.method2564(Static80.anInt2478 - 2), Static16.aClass18_151 });
		}
		@Pc(130) int local130 = Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2019(local44, arg0 + 4, arg1 + 15, Static74.aRandom1, Static89.anInt2751);
		Static41.method817(Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2026(local44) + local130, arg0 - -4, arg1, 15);
	}
}
