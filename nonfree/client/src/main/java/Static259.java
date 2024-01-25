import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z")
	public static boolean method4446() {
		if (Static271.aBoolean375) {
			try {
				if ((Boolean) Static406.method5995(Static154.aClass123_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ws;)V")
	public static void method4448(@OriginalArg(1) Class2_Sub43 arg0) {
		if (!Static214.aBoolean313) {
			arg0.method6130();
			Static233.anInt4642--;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method4451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static386.anInt7023 == 1) {
			Static190.aClass27Array33[Static370.anInt4786 / 100].method5318(Static262.anInt5009 - 8, Static77.anInt1694 - 8);
		}
		if (Static386.anInt7023 == 2) {
			Static190.aClass27Array33[Static370.anInt4786 / 100 + 4].method5318(Static262.anInt5009 - 8, Static77.anInt1694 + -8);
		}
		Static349.method5573();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!mt;)Lclient!oe;")
	public static Class168 method4455(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		@Pc(13) Class168 local13;
		if (Static306.aClass168_3 == null) {
			local13 = new Class168();
		} else {
			local13 = Static306.aClass168_3;
			Static306.aClass168_3 = Static306.aClass168_3.aClass168_1;
			Static89.anInt1893--;
			local13.aClass168_1 = null;
		}
		local13.aClass1_Sub2_1 = arg1;
		local13.anInt4777 = arg0;
		return local13;
	}
}
