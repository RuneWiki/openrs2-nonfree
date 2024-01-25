import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	public static int anInt4522;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_1 = new Class170(0, 3, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_2 = new Class170(1, 3, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_3 = new Class170(2, 4, Static47.aClass36_5);

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_4 = new Class170(3, 1, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_5 = new Class170(4, 2, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_6 = new Class170(5, 3, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!iq;")
	public static final Class170 aClass170_7 = new Class170(6, 4, Static47.aClass36_9);

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public static final int anInt4521 = Static296.method5214(16);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3743(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public static void method3744(@OriginalArg(1) int arg0) {
		@Pc(1) Class14_Sub3_Sub14 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class51 local8 = Static343.aClass51Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static55.anInt1384; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static28.anInt704; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static579.anInt9935;
							@Pc(32) int local32 = local12 << Static579.anInt9935;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class51 local41 = Static343.aClass51Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7857(local12, local15) - local41.method7857(local12, local15);
									@Pc(71) int local71 = local8.method7857(local12, local15 + 1) - local41.method7857(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7857(local12 + 1, local15 + 1) - local41.method7857(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7857(local12 + 1, local15) - local41.method7857(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)Lclient!iq;")
	public static Class170 method3745(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass170_1;
		} else if (arg0 == 1) {
			return aClass170_2;
		} else if (arg0 == 2) {
			return aClass170_3;
		} else if (arg0 == 3) {
			return aClass170_4;
		} else if (arg0 == 4) {
			return aClass170_5;
		} else if (arg0 == 5) {
			return aClass170_6;
		} else if (arg0 == 6) {
			return aClass170_7;
		} else {
			return null;
		}
	}
}
