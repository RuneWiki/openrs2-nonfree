import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public static int anInt3115;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!gd;")
	public static Class28 aClass28_81 = new Class28(100);

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!af;")
	private static Class5 aClass5_1385 = Static45.method1937(" ");

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_1384 = aClass5_1385;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Lclient!gd;")
	public static Class28 aClass28_82 = new Class28(64);

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public static volatile int anInt3117 = 0;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
	public static int anInt3118 = 0;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "B")
	public static byte aByte8 = 0;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Z")
	public static volatile boolean aBoolean118 = true;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method2165() {
		aClass5_1385 = null;
		aClass28_82 = null;
		aClass28_81 = null;
		aClass5_1384 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBILclient!nb;I)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub4_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1 || Static18.anInt3043 >= 400) {
			return;
		}
		@Pc(65) Class5 local65;
		if (arg2.anInt2002 == 0) {
			local65 = Static100.method1696(new Class5[] { arg2.aClass5_985, Static10.method279(arg2.anInt2001, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2001), Static91.aClass5_1095, Static36.aClass5_441, Static48.method838(arg2.anInt2001), Static76.aClass5_890 });
		} else {
			local65 = Static100.method1696(new Class5[] { arg2.aClass5_985, Static91.aClass5_1095, Static62.aClass5_1181, Static48.method838(arg2.anInt2002), Static76.aClass5_890 });
		}
		@Pc(139) int local139;
		if (Static120.anInt1840 == 1) {
			Static18.method2149(arg1, arg3, Static100.method1696(new Class5[] { Static74.aClass5_851, Static109.aClass5_1255, local65 }), Static66.aClass5_1396, 16, arg0);
		} else if (!Static47.aBoolean35) {
			for (local139 = 4; local139 >= 0; local139--) {
				if (Static63.aClass5Array13[local139] != null) {
					@Pc(151) int local151 = 0;
					@Pc(153) short local153 = 0;
					if (Static63.aClass5Array13[local139].method207(Static46.aClass5_574)) {
						if (arg2.anInt2001 > Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2001) {
							local153 = 2000;
						}
						if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2000 != 0 && arg2.anInt2000 != 0) {
							if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2000 == arg2.anInt2000) {
								local153 = 2000;
							} else {
								local153 = 0;
							}
						}
					} else if (Static57.aBooleanArray16[local139]) {
						local153 = 2000;
					}
					if (local139 == 0) {
						local151 = local153 + 17;
					}
					if (local139 == 1) {
						local151 = local153 + 31;
					}
					if (local139 == 2) {
						local151 = local153 + 3;
					}
					if (local139 == 3) {
						local151 = local153 + 8;
					}
					if (local139 == 4) {
						local151 = local153 + 21;
					}
					Static18.method2149(arg1, arg3, Static100.method1696(new Class5[] { Static18.aClass5_1371, local65 }), Static63.aClass5Array13[local139], local151, arg0);
				}
			}
		} else if ((Static8.anInt265 & 0x8) == 8) {
			Static18.method2149(arg1, arg3, Static100.method1696(new Class5[] { Static108.aClass5_1252, Static109.aClass5_1255, local65 }), Static80.aClass5_989, 42, arg0);
		}
		for (local139 = 0; local139 < Static18.anInt3043; local139++) {
			if (Static124.anIntArray455[local139] == 38) {
				Static75.aClass5Array12[local139] = Static100.method1696(new Class5[] { Static18.aClass5_1371, local65 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method2168() {
		Static41.anInt1059 = 0;
		@Pc(12) int local12 = Static129.anInt3262 + (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7);
		@Pc(19) int local19 = (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7) + Static32.anInt927;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static41.anInt1059 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static41.anInt1059 = 1;
		}
		if (Static41.anInt1059 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static41.anInt1059 = 0;
		}
	}
}
