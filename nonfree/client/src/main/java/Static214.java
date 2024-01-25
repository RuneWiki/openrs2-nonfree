import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hia", name = "U", descriptor = "Lclient!u;")
	public static Class5_Sub44 aClass5_Sub44_1;

	@OriginalMember(owner = "client!hia", name = "W", descriptor = "Lclient!kk;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!hia", name = "Q", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_33 = new Class181(60, -1);

	@OriginalMember(owner = "client!hia", name = "R", descriptor = "I")
	public static int anInt3693 = 0;

	@OriginalMember(owner = "client!hia", name = "S", descriptor = "I")
	public static int anInt3694 = 0;

	@OriginalMember(owner = "client!hia", name = "T", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_26 = new Class293(5);

	@OriginalMember(owner = "client!hia", name = "V", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)V")
	public static void method3254(@OriginalArg(0) int arg0) {
		if (Static469.anInt7883 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static120.aString144 == null) {
				Static323.method5012(Static358.aString114, Static94.aString145, Static536.anInt8899);
			} else {
				Static288.method4293(Static536.anInt8899);
			}
		}
		if (arg0 != 13 && Static196.aClass30_1 != null) {
			Static196.aClass30_1.method671();
			Static196.aClass30_1 = null;
		}
		if (arg0 == 3) {
			Static190.method670(Static302.anInt4813 != Static452.anInt8709);
		}
		if (arg0 == 7) {
			Static146.method2174(Static302.anInt4813 != Static274.anInt10336);
		}
		if (arg0 == 5) {
			if (Static120.aString144 == null) {
				Static64.method1076(Static358.aString114, Static94.aString145);
			} else {
				Static109.method1600();
			}
		} else if (arg0 == 6) {
			if (Static120.aString144 == null) {
				Static323.method5012(Static358.aString114, Static94.aString145, Static536.anInt8899);
			} else {
				Static288.method4293(Static536.anInt8899);
			}
		} else if (arg0 == 9) {
			if (Static120.aString144 == null) {
				Static323.method5012(Static358.aString114, Static94.aString145, Static536.anInt8899);
			} else {
				Static288.method4293(Static536.anInt8899);
			}
		} else if (arg0 == 12) {
			if (Static120.aString144 == null) {
				Static64.method1076(Static358.aString114, Static94.aString145);
			} else {
				Static109.method1600();
			}
		}
		if (Static326.method5072(Static469.anInt7883)) {
			Static400.aClass384_100.anInt10469 = 2;
			Static511.aClass384_113.anInt10469 = 2;
			Static159.aClass384_40.anInt10469 = 2;
			Static148.aClass384_59.anInt10469 = 2;
			Static8.aClass384_5.anInt10469 = 2;
			Static152.aClass384_39.anInt10469 = 2;
			Static348.aClass384_89.anInt10469 = 2;
		}
		if (Static326.method5072(arg0)) {
			Static10.anInt160 = 1;
			Static244.anInt4081 = 1;
			Static564.anInt9281 = 0;
			Static69.anInt1100 = 0;
			Static220.anInt3794 = 0;
			Static451.method6704(true);
			Static400.aClass384_100.anInt10469 = 1;
			Static511.aClass384_113.anInt10469 = 1;
			Static159.aClass384_40.anInt10469 = 1;
			Static148.aClass384_59.anInt10469 = 1;
			Static8.aClass384_5.anInt10469 = 1;
			Static152.aClass384_39.anInt10469 = 1;
			Static348.aClass384_89.anInt10469 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static298.method2508();
		}
		@Pc(238) boolean local238 = arg0 == 2 || Static454.method6737(arg0) || Static318.method4969(arg0);
		@Pc(253) boolean local253 = Static469.anInt7883 == 2 || Static454.method6737(Static469.anInt7883) || Static318.method4969(Static469.anInt7883);
		if (local253 != local238) {
			if (local238) {
				Static68.anInt1096 = Static478.anInt10052;
				if (Static627.aClass5_Sub46_31.aClass11_Sub17_5.method5908() == 0) {
					Static282.method4240();
				} else {
					Static608.method8468(Static627.aClass5_Sub46_31.aClass11_Sub17_5.method5908(), Static478.anInt10052, Static7.aClass384_3);
					Static51.method805();
				}
				Static49.aClass331_1.method7796(false);
			} else {
				Static282.method4240();
				Static49.aClass331_1.method7796(true);
			}
		}
		if (Static326.method5072(arg0) || arg0 == 13) {
			Static485.aClass126_17.method7004();
		}
		Static469.anInt7883 = arg0;
	}

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "(I)V")
	public static void method3256() {
		if (Static548.anInt9084 == 5) {
			Static548.anInt9084 = 6;
		}
	}
}
