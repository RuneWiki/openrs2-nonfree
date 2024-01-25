import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
	public static int anInt575;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	public static int anInt585;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
	public static final int[] anIntArray63 = new int[200];

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	public static int anInt578 = 0;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public static int anInt579 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V")
	public static void method487(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static307.aClass6_Sub2_Sub19_2 != null) {
			Static81.anInt1483 = Static307.aClass6_Sub2_Sub19_2.anInt5674;
		} else {
			Static81.anInt1483 = -1;
		}
		Static225.aClass211_25 = null;
		Static285.aClass132_16 = null;
		Static307.aClass6_Sub2_Sub19_2 = null;
		Static271.anInt5044 = 0;
		Static307.method1099();
		Static307.aClass211_7.method5584();
		Static98.aClass49_3 = null;
		Static190.aClass49_6 = null;
		Static11.aClass49_1 = null;
		Static350.aClass49_9 = null;
		Static71.aClass40_3 = null;
		Static151.aClass49_4 = null;
		Static19.aClass49_2 = null;
		Static165.aClass49_8 = null;
		Static17.anInt6198 = -1;
		Static192.anInt3645 = -1;
		Static307.aClass41_3 = null;
		Static200.aClass49_7 = null;
		Static139.method2651();
		Static92.aClass4_1 = null;
		Static60.method984(128, 64);
		Static270.method4579(64, 64);
		Static47.method791(64);
		Static23.method350(64);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)Lclient!is;")
	public static Class20_Sub5 method489() {
		@Pc(13) Class20_Sub5 local13 = (Class20_Sub5) Static213.aClass109_5.method2940();
		if (local13 == null) {
			return new Class20_Sub5();
		} else {
			Static86.anInt1605--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Z")
	public static boolean method490(@OriginalArg(0) int arg0) {
		if (Static69.aBooleanArray6[arg0]) {
			return true;
		} else if (Static99.aClass53_153.method1035(arg0)) {
			@Pc(25) int local25 = Static99.aClass53_153.method1011(arg0);
			if (local25 == 0) {
				Static69.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static81.aClass132ArrayArray1[arg0] == null) {
				Static81.aClass132ArrayArray1[arg0] = new Class132[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static81.aClass132ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static99.aClass53_153.method1033(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class132 local73 = Static81.aClass132ArrayArray1[arg0][local47] = new Class132();
						local73.anInt3551 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							local73.method3526(new Class6_Sub10(local61));
						} else {
							local73.method3523(new Class6_Sub10(local61));
						}
					}
				}
			}
			Static69.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
