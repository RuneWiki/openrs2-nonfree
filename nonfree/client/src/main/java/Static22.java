import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!lc;")
	public static Class40 aClass40_19;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[Lclient!re;")
	public static Class4_Sub13[] aClass4_Sub13Array1 = new Class4_Sub13[2048];

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	public static int anInt649 = -1;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!qc;")
	public static Class60 aClass60_241 = Static121.method2047("");

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_235 = aClass60_241;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_236 = Static121.method2047(")3runescape)3com");

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_237 = Static121.method2047("<img=1>");

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	public static int anInt652 = 0;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!qc;")
	public static Class60 aClass60_238 = Static121.method2047(")2");

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_239 = Static121.method2047("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public static int anInt653 = 0;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "Lclient!qc;")
	public static Class60 aClass60_240 = Static121.method2047("(Y<)4col>");

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method449() {
		aClass60_238 = null;
		aClass60_241 = null;
		aClass60_235 = null;
		aClass60_237 = null;
		aClass60_236 = null;
		aClass4_Sub13Array1 = null;
		aClass40_19 = null;
		aClass60_240 = null;
		aClass60_239 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!of;III)V")
	public static void method450(@OriginalArg(1) Class4_Sub4_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static25.anInt693 >= 400) {
			return;
		}
		if (arg0.anIntArray201 != null) {
			arg0 = arg0.method1494();
		}
		if (arg0 == null || !arg0.aBoolean82) {
			return;
		}
		@Pc(26) Class60 local26 = arg0.aClass60_830;
		if (arg0.anInt2003 != 0) {
			local26 = Static125.method2072(new Class60[] { local26, Static9.method137(arg0.anInt2003, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2658), Static81.aClass60_793, Static29.aClass60_328, Static120.method1450(arg0.anInt2003), Static60.aClass60_939 });
		}
		if (Static26.anInt724 == 1) {
			Static41.method698(arg1, arg3, Static125.method2072(new Class60[] { Static90.aClass60_874, Static33.aClass60_363, local26 }), 17, arg2, Static34.aClass60_372);
		} else if (!Static71.aBoolean70) {
			@Pc(113) Class60[] local113 = arg0.aClass60Array16;
			if (Static2.aBoolean49) {
				local113 = Static28.method558(local113);
			}
			@Pc(123) int local123;
			if (local113 != null) {
				for (local123 = 4; local123 >= 0; local123--) {
					if (local113[local123] != null && !local113[local123].method1661(Static115.aClass60_1109)) {
						@Pc(142) byte local142 = 0;
						if (local123 == 0) {
							local142 = 35;
						}
						if (local123 == 1) {
							local142 = 49;
						}
						if (local123 == 2) {
							local142 = 37;
						}
						if (local123 == 3) {
							local142 = 29;
						}
						if (local123 == 4) {
							local142 = 11;
						}
						Static41.method698(arg1, arg3, Static125.method2072(new Class60[] { Static129.aClass60_1204, local26 }), local142, arg2, local113[local123]);
					}
				}
			}
			if (local113 != null) {
				for (local123 = 4; local123 >= 0; local123--) {
					if (local113[local123] != null && local113[local123].method1661(Static115.aClass60_1109)) {
						@Pc(221) int local221 = 0;
						@Pc(223) short local223 = 0;
						if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2658 < arg0.anInt2003) {
							local223 = 2000;
						}
						if (local123 == 0) {
							local221 = local223 + 35;
						}
						if (local123 == 1) {
							local221 = local223 + 49;
						}
						if (local123 == 2) {
							local221 = local223 + 37;
						}
						if (local123 == 3) {
							local221 = local223 + 29;
						}
						if (local123 == 4) {
							local221 = local223 + 11;
						}
						Static41.method698(arg1, arg3, Static125.method2072(new Class60[] { Static129.aClass60_1204, local26 }), local221, arg2, local113[local123]);
					}
				}
			}
			Static41.method698(arg1, arg3, Static125.method2072(new Class60[] { Static129.aClass60_1204, local26 }), 1004, arg2, Static10.aClass60_97);
		} else if ((Static85.anInt2034 & 0x2) == 2) {
			Static41.method698(arg1, arg3, Static125.method2072(new Class60[] { Static94.aClass60_916, Static33.aClass60_363, local26 }), 38, arg2, Static92.aClass60_891);
		}
	}
}
