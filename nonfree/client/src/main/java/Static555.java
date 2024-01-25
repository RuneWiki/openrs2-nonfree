import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lclient!tg;")
	public static final Class2_Sub11[] aClass2_Sub11Array6 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V")
	public static void method7260(@OriginalArg(1) long arg0) {
		if (Static469.aClass228ArrayArrayArray6 != null) {
			if (Static489.anInt7763 == 1 || Static489.anInt7763 == 5) {
				Static177.method2288(arg0);
			} else if (Static489.anInt7763 == 4) {
				Static375.method5246(arg0);
			}
		}
		Static309.method4430(Static417.aClass162_17, (long) Static532.anInt8757);
		if (Static122.anInt2094 != -1) {
			Static366.method5156(Static122.anInt2094);
		}
		for (@Pc(43) int local43 = 0; local43 < Static292.anInt4935; local43++) {
			if (Static255.aBooleanArray17[local43]) {
				Static217.aBooleanArray11[local43] = true;
			}
			Static232.aBooleanArray16[local43] = Static255.aBooleanArray17[local43];
			Static255.aBooleanArray17[local43] = false;
		}
		Static79.anInt7837 = Static532.anInt8757;
		if (Static122.anInt2094 != -1) {
			Static292.anInt4935 = 0;
			Static418.method5619();
		}
		Static417.aClass162_17.JA();
		Static435.method5712(Static417.aClass162_17);
		@Pc(88) int local88 = Static123.method1660();
		if (local88 == -1) {
			local88 = Static409.anInt6677;
		}
		if (local88 == -1) {
			local88 = Static36.anInt668;
		}
		Static584.method7572(local88);
		@Pc(113) int local113 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() << 8;
		Static167.method2197(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 + local113, local113 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374, Static534.anInt8792);
		Static534.anInt8792 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
	public static boolean method7261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg1 & 0x37) == 0 ? Static582.method7550(arg1, arg0) : Static310.method4443(arg1, arg0);
		return (arg0 & 0x10000) != 0 | Static503.method6531(arg1, arg0) | local25;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method7263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static431.aBoolean567) {
			return false;
		} else if (Static427.anInt6937 < 100) {
			return false;
		} else {
			@Pc(36) int local36;
			@Pc(40) int local40;
			if (arg2 != arg4 || arg5 != arg1) {
				for (local36 = arg2; local36 <= arg4; local36++) {
					for (local40 = arg5; local40 <= arg1; local40++) {
						if (-Static86.anInt1458 == Static364.anIntArrayArrayArray7[arg0][local36][local40]) {
							return false;
						}
					}
				}
				local40 = (arg2 << Static562.anInt9207) + 1;
				@Pc(111) int local111 = (arg5 << Static562.anInt9207) + 2;
				if (Static216.method7683(local111, Static114.aClass151Array1[arg0].method7676(arg5, arg2), (arg4 + 1 - arg2) * Static481.anInt7681, arg3, (arg1 + 1 - arg5) * Static481.anInt7681, local40)) {
					Static471.anInt7543++;
					return true;
				} else {
					return false;
				}
			} else if (Static158.method6599(arg5, arg0, arg2)) {
				local36 = arg2 << Static562.anInt9207;
				local40 = arg5 << Static562.anInt9207;
				if (Static216.method7683(local40, Static114.aClass151Array1[arg0].method7676(arg5, arg2), Static481.anInt7681, arg3, Static481.anInt7681, local36)) {
					Static471.anInt7543++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!iba;BLclient!cr;)Lclient!oda;")
	public static Class2_Sub34 method7264(@OriginalArg(0) Class154 arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(8) Class2_Sub34 local8 = Static134.method1816();
		local8.anInt6309 = arg0.anInt3201;
		local8.aClass154_77 = arg0;
		if (local8.anInt6309 == -1) {
			local8.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(260);
		} else if (local8.anInt6309 == -2) {
			local8.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(10000);
		} else if (local8.anInt6309 <= 18) {
			local8.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(20);
		} else if (local8.anInt6309 <= 98) {
			local8.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(100);
		} else {
			local8.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(260);
		}
		local8.aClass2_Sub7_Sub2_2.method4534(arg1);
		local8.aClass2_Sub7_Sub2_2.method4528(local8.aClass154_77.method2683());
		local8.anInt6307 = 0;
		return local8;
	}
}
