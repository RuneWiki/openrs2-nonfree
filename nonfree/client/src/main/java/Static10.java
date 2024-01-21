import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_3;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "Lclient!c;")
	public static Class10 aClass10_7;

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "Lclient!od;")
	public static Class60 aClass60_99 = Static41.method597("<img=1>");

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "Lclient!od;")
	public static Class60 aClass60_100 = Static41.method597("null");

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "Lclient!od;")
	private static Class60 aClass60_105 = Static41.method597("Service unavailable)3");

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "Lclient!od;")
	public static Class60 aClass60_101 = aClass60_105;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "Lclient!od;")
	public static Class60 aClass60_102 = Static41.method597("Mem:");

	@OriginalMember(owner = "client!bd", name = "cb", descriptor = "Lclient!od;")
	public static Class60 aClass60_103 = Static41.method597("Lade Texturen )2 ");

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "Lclient!od;")
	public static Class60 aClass60_104 = Static41.method597("blinken2:");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!qd;III)V")
	public static void method163(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static48.anInt1184 >= 400) {
			return;
		}
		if (arg1.anIntArray282 != null) {
			arg1 = arg1.method1526();
		}
		if (arg1 == null || !arg1.aBoolean78) {
			return;
		}
		@Pc(26) Class60 local26 = arg1.aClass60_908;
		if (arg1.anInt2219 != 0) {
			local26 = Static12.method1761(new Class60[] { local26, Static128.method1947(arg1.anInt2219, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt413), Static97.aClass60_922, Static44.aClass60_893, Static65.method1051(arg1.anInt2219), Static47.aClass60_435 });
		}
		if (Static44.anInt2167 == 1) {
			Static113.method814(Static12.method1761(new Class60[] { Static108.aClass60_1004, Static1.aClass60_2, local26 }), Static83.aClass60_819, arg3, 1, arg2, arg0);
		} else if (!Static86.aBoolean71) {
			@Pc(79) Class60[] local79 = arg1.aClass60Array16;
			if (Static98.aBoolean84) {
				local79 = Static23.method427(local79);
			}
			@Pc(89) int local89;
			if (local79 != null) {
				for (local89 = 4; local89 >= 0; local89--) {
					if (local79[local89] != null && !local79[local89].method1318(Static91.aClass60_880)) {
						@Pc(108) byte local108 = 0;
						if (local89 == 0) {
							local108 = 13;
						}
						if (local89 == 1) {
							local108 = 49;
						}
						if (local89 == 2) {
							local108 = 44;
						}
						if (local89 == 3) {
							local108 = 40;
						}
						if (local89 == 4) {
							local108 = 45;
						}
						Static113.method814(Static12.method1761(new Class60[] { Static37.aClass60_383, local26 }), local79[local89], arg3, local108, arg2, arg0);
					}
				}
			}
			if (local79 != null) {
				for (local89 = 4; local89 >= 0; local89--) {
					if (local79[local89] != null && local79[local89].method1318(Static91.aClass60_880)) {
						@Pc(197) int local197 = 0;
						@Pc(199) short local199 = 0;
						if (arg1.anInt2219 > Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt413) {
							local199 = 2000;
						}
						if (local89 == 0) {
							local197 = local199 + 13;
						}
						if (local89 == 1) {
							local197 = local199 + 49;
						}
						if (local89 == 2) {
							local197 = local199 + 44;
						}
						if (local89 == 3) {
							local197 = local199 + 40;
						}
						if (local89 == 4) {
							local197 = local199 + 45;
						}
						Static113.method814(Static12.method1761(new Class60[] { Static37.aClass60_383, local26 }), local79[local89], arg3, local197, arg2, arg0);
					}
				}
			}
			Static113.method814(Static12.method1761(new Class60[] { Static37.aClass60_383, local26 }), Static23.aClass60_258, arg3, 1003, arg2, arg0);
			return;
		} else if ((Static111.anInt2632 & 0x2) == 2) {
			Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static1.aClass60_2, local26 }), Static124.aClass60_1108, arg3, 33, arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public static void method164() {
		aClass60_100 = null;
		aClass60_104 = null;
		aClass60_99 = null;
		anIntArray27 = null;
		aClass60_103 = null;
		aClass60_101 = null;
		aClass60_105 = null;
		aClass60_102 = null;
		aClass10_7 = null;
		aClass10_Sub1_3 = null;
	}
}
