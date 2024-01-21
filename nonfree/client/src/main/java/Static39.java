import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	public static int anInt988;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!ua;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "I")
	public static int anInt1014;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lclient!ie;")
	public static Class32 aClass32_5;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Lclient!sc;")
	private static Class66 aClass66_617 = Static106.method1849("Hidden");

	@OriginalMember(owner = "client!h", name = "F", descriptor = "Lclient!sc;")
	public static Class66 aClass66_615 = aClass66_617;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!sc;")
	public static Class66 aClass66_616 = Static106.method1849("mapdots");

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public static int anInt985 = 0;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_618 = Static106.method1849("Abbrechen");

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!h", name = "Xb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_619 = Static106.method1849("jolt");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method815() {
		aClass66_617 = null;
		aClass66_619 = null;
		aClass72_3 = null;
		aClass32_5 = null;
		aClass66_615 = null;
		aClass66_616 = null;
		aClass66_618 = null;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)Z")
	public static boolean method819() {
		return Static20.anInt622 == 0 ? Static38.aClass1_Sub9_Sub1_33.method843() : true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIILclient!hd;)V")
	public static void method840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub5_Sub2 arg3) {
		if (arg3 == Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1 || Static5.anInt228 >= 400) {
			return;
		}
		@Pc(50) Class66 local50;
		if (arg3.anInt1303 == 0) {
			local50 = Static41.method897(new Class66[] { arg3.aClass66_707, Static41.method901(arg3.anInt1314, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1314), Static44.aClass66_738, Static15.aClass66_1755, Static88.method1632(arg3.anInt1314), Static63.aClass66_1016 });
		} else {
			local50 = Static41.method897(new Class66[] { arg3.aClass66_707, Static44.aClass66_738, Static3.aClass66_115, Static88.method1632(arg3.anInt1303), Static63.aClass66_1016 });
		}
		@Pc(164) int local164;
		if (Static84.anInt2224 == 1) {
			Static98.method1749(Static11.aClass66_241, 47, arg0, arg1, arg2, Static41.method897(new Class66[] { Static42.aClass66_710, Static97.aClass66_1377, local50 }));
		} else if (!Static51.aBoolean65) {
			for (local164 = 7; local164 >= 0; local164--) {
				if (Static132.aClass66Array24[local164] != null) {
					@Pc(176) short local176 = 0;
					if (Static132.aClass66Array24[local164].method1843(Static116.aClass66_1568)) {
						if (arg3.anInt1314 > Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1314) {
							local176 = 2000;
						}
						if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1312 != 0 && arg3.anInt1312 != 0) {
							if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1312 == arg3.anInt1312) {
								local176 = 2000;
							} else {
								local176 = 0;
							}
						}
					} else if (Static24.aBooleanArray4[local164]) {
						local176 = 2000;
					}
					@Pc(233) int local233 = local176 + Static32.anIntArray113[local164];
					Static98.method1749(Static132.aClass66Array24[local164], local233, arg0, arg1, arg2, Static41.method897(new Class66[] { Static134.aClass66_1760, local50 }));
				}
			}
		} else if ((Static128.anInt2909 & 0x8) == 8) {
			Static98.method1749(Static87.aClass66_1277, 20, arg0, arg1, arg2, Static41.method897(new Class66[] { Static27.aClass66_445, Static97.aClass66_1377, local50 }));
		}
		for (local164 = 0; local164 < Static5.anInt228; local164++) {
			if (Static98.anIntArray419[local164] == 46) {
				Static84.aClass66Array18[local164] = Static41.method897(new Class66[] { Static134.aClass66_1760, local50 });
				return;
			}
		}
	}
}
