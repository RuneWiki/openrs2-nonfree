import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V")
	public static void method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static455.aClass1_Sub6_Sub2_2.method3948(arg1);
		Static455.aClass1_Sub6_Sub2_2.method3919(arg2);
		Static455.aClass1_Sub6_Sub2_2.method3959(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method755(@OriginalArg(1) String arg0) {
		Static285.aString48 = arg0;
		if (Static466.aClass102_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static466.aClass102_4.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static466.aClass102_4.anApplet1.getParameter("cookiehost");
			@Pc(42) String local42 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local42 = local42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local42 = local42 + "; Expires=" + Static45.method924(Static60.method1119() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static557.method5218("document.cookie=\"" + local42 + "\"", Static466.aClass102_4.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
	public static void method756() {
		Static458.aClass279_6.method6483();
		Static11.aClass61_1.method1455();
		Static477.aClass15_1.method571();
		Static308.aClass96_4.method2269();
		Static538.aClass242_2.method5830();
		Static342.aClass250_2.method5979();
		Static182.aClass218_1.method5223();
		Static489.aClass194_2.method4813();
		Static37.aClass247_1.method5890();
		Static463.aClass108_1.method2493();
		Static351.aClass228_1.method5337();
		Static323.aClass257_4.method6140();
		Static244.aClass272_4.method6377();
		Static526.aClass216_1.method5179();
		Static452.aClass317_2.method7533();
		Static335.aClass41_1.method1034();
		Static482.aClass82_1.method1918();
		Static270.aClass195_1.method4843();
		Static420.aClass95_2.method2261();
		Static529.aClass263_1.method6271();
		Static400.method6036();
		Static445.method6365();
		Static225.method3894();
		Static529.method7333();
		Static321.aClass313_38.method7400();
		Static114.aClass313_11.method7400();
		Static304.aClass313_33.method7400();
		Static27.aClass313_3.method7400();
		Static180.aClass313_24.method7400();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)V")
	public static void method759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(12, arg1);
		local8.method4946();
		local8.anInt5822 = arg0;
	}
}
