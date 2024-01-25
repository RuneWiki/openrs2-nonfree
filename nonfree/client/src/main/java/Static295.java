import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_75 = new Class158(22, 0);

	@OriginalMember(owner = "client!mda", name = "s", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_102 = new Class133(63, 6);

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIZII)V")
	public static void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static380.aLong218 = 0L;
		@Pc(8) int local8 = Static212.method3885();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static121.aClass5_7.method7445()) {
			arg2 = true;
		}
		Static131.method2300(arg1, local8, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4942(@OriginalArg(0) String arg0) {
		Static281.aString42 = arg0;
		if (Static370.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static370.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static370.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static47.method7755(Static12.method647() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static562.method7816("document.cookie=\"" + local36 + "\"", Static370.anApplet1);
		} catch (@Pc(84) Throwable local84) {
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBIII)V")
	public static void method4943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static549.anInt9481 == 1) {
			Static296.aClass119Array11[Static104.anInt2329 / 100].method6678(Static70.anInt567 - 8, Static474.anInt8512 + -8);
		}
		if (Static549.anInt9481 == 2) {
			Static296.aClass119Array11[Static104.anInt2329 / 100 + 4].method6678(Static70.anInt567 - 8, Static474.anInt8512 + -8);
		}
		Static66.method1333();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)V")
	public static void method4944(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static223.anInt4829 - Static25.anInt758;
		if (local8 >= 100) {
			Static305.anInt5998 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static343.aFloat198;
		if (Static70.anInt577 >> 8 > local22) {
			local22 = Static70.anInt577 >> 8;
		}
		if (Static400.aBooleanArray34[4] && Static204.anIntArray581[4] + 128 > local22) {
			local22 = Static204.anIntArray581[4] + 128;
		}
		@Pc(59) int local59 = (int) Static487.aFloat258 + Static148.anInt2973 & 0x3FFF;
		Static266.method4662(Static366.anInt6836, (local22 >> 3) * 3 + 600 << 2, local22, local59, Static58.method1166(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811, Static420.anInt7829) - 200, Static8.anInt583, arg0);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static329.anInt6297 = (int) ((float) (Static329.anInt6297 - Static186.anInt4252) * local102 + (float) Static186.anInt4252);
		Static27.anInt778 = (int) ((float) (Static27.anInt778 - Static522.anInt9090) * local102 + (float) Static522.anInt9090);
		Static311.anInt6050 = (int) ((float) Static83.anInt1814 + (float) (Static311.anInt6050 - Static83.anInt1814) * local102);
		Static347.anInt6620 = (int) ((float) Static225.anInt4852 + local102 * (float) (Static347.anInt6620 - Static225.anInt4852));
		@Pc(152) int local152 = Static262.anInt5491 - Static364.anInt6823;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static262.anInt5491 = (int) ((float) Static364.anInt6823 + (float) local152 * local102);
		Static262.anInt5491 &= 0x3FFF;
	}
}
