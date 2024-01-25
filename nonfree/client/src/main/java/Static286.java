import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!cq;")
	public static Class8 aClass8_23;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!wl;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	public static int anInt5739;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	public static int anInt5734 = -1;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)V")
	public static void method5006(@OriginalArg(0) boolean arg0) {
		if (Static50.aBoolean82 != arg0) {
			Static50.aBoolean82 = arg0;
			Static295.method5183();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BJ)V")
	public static void method5008(@OriginalArg(1) long arg0) {
		Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
		Static305.aClass1_Sub21_Sub2_3.method5718(21);
		Static305.aClass1_Sub21_Sub2_3.method5744(arg0);
		Static17.anInt339 = 0;
		Static5.anInt50 = 0;
		Static51.anInt1261 = 1;
		Static3.anInt37 = -3;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	public static boolean method5009(@OriginalArg(1) int arg0) {
		if (arg0 == 15 || arg0 == 30 || arg0 == 19 || arg0 == 47 || arg0 == 2 || arg0 == 34 || arg0 == 22 || arg0 == 5) {
			return true;
		} else if (arg0 == 36 || arg0 == 32 || arg0 == 1004 || arg0 == 1003) {
			return true;
		} else if (arg0 == 51 || arg0 == 1 || arg0 == 23 || arg0 == 10 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 39 || arg0 == 16 || arg0 == 58 || arg0 == 46 || arg0 == 6;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V")
	public static void method5010() {
		@Pc(1) Class37 local1 = Static114.aClass37_39;
		synchronized (Static114.aClass37_39) {
			Static114.aClass37_39.method914();
		}
		local1 = Static287.aClass37_91;
		synchronized (Static287.aClass37_91) {
			Static287.aClass37_91.method914();
		}
		local1 = Static211.aClass37_70;
		synchronized (Static211.aClass37_70) {
			Static211.aClass37_70.method914();
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)V")
	public static void method5011(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(9, arg0);
		local8.method4782();
	}
}
