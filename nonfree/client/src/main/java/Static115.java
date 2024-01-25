import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "Lclient!ks;")
	public static Class200 aClass200_3;

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)V")
	public static void method1686(@OriginalArg(1) int arg0) {
		if (Static540.anInt8912 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static353.aString80 == null) {
				Static270.method3744(Static6.aString4, Static64.aString14, Static124.anInt9459);
			} else {
				Static250.method3582(Static124.anInt9459);
			}
		}
		if (arg0 != 13 && Static274.aClass124_1 != null) {
			Static274.aClass124_1.method2256();
			Static274.aClass124_1 = null;
		}
		if (arg0 == 3) {
			Static585.method7578(Static579.anInt9400 != Static122.anInt2094);
		}
		if (arg0 == 7) {
			Static42.method724(Static360.anInt6110 != Static122.anInt2094);
		}
		if (arg0 == 5) {
			if (Static353.aString80 == null) {
				Static221.method2689(Static6.aString4, Static64.aString14);
			} else {
				Static344.method5009();
			}
		} else if (arg0 == 6) {
			if (Static353.aString80 == null) {
				Static270.method3744(Static6.aString4, Static64.aString14, Static124.anInt9459);
			} else {
				Static250.method3582(Static124.anInt9459);
			}
		} else if (arg0 == 9) {
			if (Static353.aString80 == null) {
				Static270.method3744(Static6.aString4, Static64.aString14, Static124.anInt9459);
			} else {
				Static250.method3582(Static124.anInt9459);
			}
		} else if (arg0 == 12) {
			if (Static353.aString80 == null) {
				Static221.method2689(Static6.aString4, Static64.aString14);
			} else {
				Static344.method5009();
			}
		}
		if (Static442.method5791(Static540.anInt8912)) {
			Static248.aClass229_57.anInt5920 = 2;
			Static378.aClass229_90.anInt5920 = 2;
			Static72.aClass229_20.anInt5920 = 2;
			Static187.aClass229_121.anInt5920 = 2;
			Static255.aClass229_62.anInt5920 = 2;
			Static309.aClass229_74.anInt5920 = 2;
			Static427.aClass229_97.anInt5920 = 2;
		}
		if (Static442.method5791(arg0)) {
			Static449.anInt7191 = 0;
			Static455.anInt7311 = 0;
			Static346.anInt5968 = 1;
			Static494.anInt7844 = 1;
			Static422.anInt6896 = 0;
			Static169.method2209(true);
			Static248.aClass229_57.anInt5920 = 1;
			Static378.aClass229_90.anInt5920 = 1;
			Static72.aClass229_20.anInt5920 = 1;
			Static187.aClass229_121.anInt5920 = 1;
			Static255.aClass229_62.anInt5920 = 1;
			Static309.aClass229_74.anInt5920 = 1;
			Static427.aClass229_97.anInt5920 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static585.method7579();
		}
		@Pc(241) boolean local241 = arg0 == 2 || Static526.method7746(arg0) || Static397.method5446(arg0);
		@Pc(256) boolean local256 = Static540.anInt8912 == 2 || Static526.method7746(Static540.anInt8912) || Static397.method5446(Static540.anInt8912);
		if (local256 != local241) {
			if (local241) {
				Static491.anInt7770 = Static134.anInt2161;
				if (Static257.aClass2_Sub35_Sub1_1.anInt7499 == 0) {
					Static482.method6225();
				} else {
					Static482.method6224(Static257.aClass2_Sub35_Sub1_1.anInt7499, Static106.aClass229_32, Static134.anInt2161);
					Static569.method7428();
				}
				Static335.aClass249_2.method5227(false);
			} else {
				Static482.method6225();
				Static335.aClass249_2.method5227(true);
			}
		}
		if (Static442.method5791(arg0) || arg0 == 13) {
			Static417.aClass162_17.method6832();
		}
		Static540.anInt8912 = arg0;
	}
}
