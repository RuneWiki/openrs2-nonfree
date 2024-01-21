import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "Lclient!w;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "I")
	public static int anInt996;

	@OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_7;

	@OriginalMember(owner = "client!eb", name = "Vb", descriptor = "Lclient!vc;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!eb", name = "cc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!eb", name = "ic", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!eb", name = "Wb", descriptor = "I")
	public static int anInt1000 = 0;

	@OriginalMember(owner = "client!eb", name = "Zb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_313 = Static56.method1206("Your account has been disabled)3");

	@OriginalMember(owner = "client!eb", name = "gc", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!k;II)V")
	public static void method679(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub6_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1 || Static59.anInt2044 >= 400) {
			return;
		}
		@Pc(59) Class31 local59;
		if (arg1.anInt1727 == 0) {
			local59 = Static37.method974(new Class31[] { arg1.aClass31_612, Static89.method1498(arg1.anInt1732, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1732), Static49.aClass31_933, Static89.method1499(arg1.anInt1732), Static93.aClass31_870 });
		} else {
			local59 = Static37.method974(new Class31[] { arg1.aClass31_612, Static43.aClass31_574, Static89.method1499(arg1.anInt1727), Static93.aClass31_870 });
		}
		@Pc(131) int local131;
		if (Static63.anInt2118 == 1) {
			Static17.method523(arg3, Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static61.aClass31_738, local59 }), 39, arg0, arg2);
		} else if (Static47.anInt1737 != 1) {
			for (local131 = 4; local131 >= 0; local131--) {
				if (Static93.aClass31Array15[local131] != null) {
					@Pc(143) short local143 = 0;
					if (Static93.aClass31Array15[local131].method1210(Static45.aClass31_582)) {
						if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1732 < arg1.anInt1732) {
							local143 = 2000;
						}
						if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1726 != 0 && arg1.anInt1726 != 0) {
							if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1726 == arg1.anInt1726) {
								local143 = 2000;
							} else {
								local143 = 0;
							}
						}
					} else if (Static33.aBooleanArray29[local131]) {
						local143 = 2000;
					}
					@Pc(188) int local188 = 0;
					if (local131 == 0) {
						local188 = local143 + 3;
					}
					if (local131 == 1) {
						local188 = local143 + 48;
					}
					if (local131 == 2) {
						local188 = local143 + 17;
					}
					if (local131 == 3) {
						local188 = local143 + 27;
					}
					if (local131 == 4) {
						local188 = local143 + 24;
					}
					Static17.method523(arg3, Static37.method974(new Class31[] { Static93.aClass31Array15[local131], Static57.aClass31_932, local59 }), local188, arg0, arg2);
				}
			}
		} else if ((Static105.anInt2787 & 0x8) == 8) {
			Static17.method523(arg3, Static37.method974(new Class31[] { Static85.aClass31_866, Static57.aClass31_932, local59 }), 26, arg0, arg2);
		}
		for (local131 = 0; local131 < Static59.anInt2044; local131++) {
			if (Static63.anIntArray296[local131] == 16) {
				Static85.aClass31Array14[local131] = Static37.method974(new Class31[] { Static59.aClass31_717, local59 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)V")
	public static void method683() {
		aByteArrayArrayArray12 = null;
		aClass11_Sub1_7 = null;
		aClass61_1 = null;
		aClass31_313 = null;
		aClass7_1 = null;
		anIntArrayArray27 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!kc;Lclient!kc;I)V")
	public static void method688(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		Static4.aClass11_5 = arg0;
		Static3.aClass11_4 = arg1;
	}
}
