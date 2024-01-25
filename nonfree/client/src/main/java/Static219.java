import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	public static int anInt4579;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	public static int anInt4585;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_148 = new Class123(68, 0);

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIBIIILclient!nc;IIII)Z")
	public static boolean method3674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class220 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(23) int local23 = arg9 - 64;
		Static418.anIntArrayArray75[64][64] = 99;
		Static360.anIntArrayArray105[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static346.anIntArray349[0] = arg7;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static307.anIntArray276[0] = arg9;
		@Pc(51) int[][] local51 = arg5.anIntArrayArray66;
		while (local43 != local46) {
			local7 = Static346.anIntArray349[local43];
			local9 = Static307.anIntArray276[local43];
			@Pc(71) int local71 = local7 - local18;
			@Pc(76) int local76 = local9 - local23;
			local43 = local43 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg5.anInt6298;
			@Pc(93) int local93 = local9 - arg5.anInt6303;
			if (arg2 == -4) {
				if (arg0 == local7 && arg1 == local9) {
					Static454.anInt7943 = local9;
					Static395.anInt6981 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static391.method5552(local9, arg8, 1, arg1, arg6, local7, 1, arg0)) {
					Static454.anInt7943 = local9;
					Static395.anInt6981 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg5.method5078(arg8, local7, local9, arg0, arg1, arg3, 1, 1, arg6)) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg5.method5082(arg6, local7, local9, arg3, 1, arg8, arg0, arg1)) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg5.method5083(arg1, local9, arg4, arg2, arg0, 1, local7)) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg5.method5089(1, arg1, arg4, arg0, local9, arg2, local7)) {
				Static454.anInt7943 = local9;
				Static395.anInt6981 = local7;
				return true;
			}
			@Pc(246) int local246 = Static360.anIntArrayArray105[local71][local76] + 1;
			if (local71 > 0 && Static418.anIntArrayArray75[local71 - 1][local76] == 0 && (local51[local88 - 1][local93] & 0x42240000) == 0) {
				Static346.anIntArray349[local46] = local7 - 1;
				Static307.anIntArray276[local46] = local9;
				Static418.anIntArrayArray75[local71 - 1][local76] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static360.anIntArrayArray105[local71 - 1][local76] = local246;
			}
			if (local71 < 127 && Static418.anIntArrayArray75[local71 + 1][local76] == 0 && (local51[local88 + 1][local93] & 0x60240000) == 0) {
				Static346.anIntArray349[local46] = local7 + 1;
				Static307.anIntArray276[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71 + 1][local76] = 8;
				Static360.anIntArrayArray105[local71 + 1][local76] = local246;
			}
			if (local76 > 0 && Static418.anIntArrayArray75[local71][local76 - 1] == 0 && (local51[local88][local93 - 1] & 0x40A40000) == 0) {
				Static346.anIntArray349[local46] = local7;
				Static307.anIntArray276[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71][local76 - 1] = 1;
				Static360.anIntArrayArray105[local71][local76 - 1] = local246;
			}
			if (local76 < 127 && Static418.anIntArrayArray75[local71][local76 + 1] == 0 && (local51[local88][local93 + 1] & 0x48240000) == 0) {
				Static346.anIntArray349[local46] = local7;
				Static307.anIntArray276[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71][local76 + 1] = 4;
				Static360.anIntArrayArray105[local71][local76 + 1] = local246;
			}
			if (local71 > 0 && local76 > 0 && Static418.anIntArrayArray75[local71 - 1][local76 - 1] == 0 && (local51[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local51[local88 - 1][local93] & 0x42240000) == 0 && (local51[local88][local93 - 1] & 0x40A40000) == 0) {
				Static346.anIntArray349[local46] = local7 - 1;
				Static307.anIntArray276[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71 - 1][local76 - 1] = 3;
				Static360.anIntArrayArray105[local71 - 1][local76 - 1] = local246;
			}
			if (local71 < 127 && local76 > 0 && Static418.anIntArrayArray75[local71 + 1][local76 - 1] == 0 && (local51[local88 + 1][local93 - 1] & 0x60E40000) == 0 && (local51[local88 + 1][local93] & 0x60240000) == 0 && (local51[local88][local93 - 1] & 0x40A40000) == 0) {
				Static346.anIntArray349[local46] = local7 + 1;
				Static307.anIntArray276[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71 + 1][local76 - 1] = 9;
				Static360.anIntArrayArray105[local71 + 1][local76 - 1] = local246;
			}
			if (local71 > 0 && local76 < 127 && Static418.anIntArrayArray75[local71 - 1][local76 + 1] == 0 && (local51[local88 - 1][local93 + 1] & 0x4E240000) == 0 && (local51[local88 - 1][local93] & 0x42240000) == 0 && (local51[local88][local93 + 1] & 0x48240000) == 0) {
				Static346.anIntArray349[local46] = local7 - 1;
				Static307.anIntArray276[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71 - 1][local76 + 1] = 6;
				Static360.anIntArrayArray105[local71 - 1][local76 + 1] = local246;
			}
			if (local71 < 127 && local76 < 127 && Static418.anIntArrayArray75[local71 + 1][local76 + 1] == 0 && (local51[local88 + 1][local93 + 1] & 0x78240000) == 0 && (local51[local88 + 1][local93] & 0x60240000) == 0 && (local51[local88][local93 + 1] & 0x48240000) == 0) {
				Static346.anIntArray349[local46] = local7 + 1;
				Static307.anIntArray276[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local71 + 1][local76 + 1] = 12;
				Static360.anIntArrayArray105[local71 + 1][local76 + 1] = local246;
			}
		}
		Static395.anInt6981 = local7;
		Static454.anInt7943 = local9;
		return false;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
	public static void method3676() {
		Static347.aClass284_106.anInt8049 = 1;
		Static559.method7662();
		Static269.aBoolean336 = true;
		Static22.aBoolean15 = true;
		Static8.method69();
		for (@Pc(7486) int local7486 = 0; local7486 < Static98.aClass167Array1.length; local7486++) {
			Static98.aClass167Array1[local7486] = null;
		}
		Static253.aBoolean325 = false;
		Static117.method2295();
		Static196.anInt4253 = (int) (Math.random() * 110.0D) - 55;
		Static270.anInt5118 = (int) (Math.random() * 120.0D) - 60;
		Static209.aFloat229 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static411.anInt7378 = (int) (Math.random() * 100.0D) - 50;
		Static350.anInt6241 = (int) (Math.random() * 30.0D) - 20;
		Static427.anInt7545 = (int) (Math.random() * 80.0D) - 40;
		Static582.method7913();
		for (@Pc(7556) int local7556 = 0; local7556 < 2048; local7556++) {
			Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local7556] = null;
		}
		Static60.anInt1599 = 0;
		Static238.anInt4737 = 0;
		Static581.aClass297_39.method6535();
		Static110.aClass244_20.method5581();
		Static410.aClass244_55.method5581();
		Static6.aClass269_1.method5969();
		Static537.aClass297_34.method6535();
		Static391.aClass244_52 = new Class244();
		Static206.aClass143_3.method3693();
		Static169.method3023();
		Static557.anInt6113 = 0;
		Static512.anInt8854 = 0;
		Static258.anInt5017 = 0;
		Static15.anInt134 = 0;
		Static448.anInt10232 = 0;
		Static472.anInt8217 = 0;
		Static524.anInt9196 = 0;
		Static429.anInt7994 = 0;
		Static299.anInt5597 = 0;
		Static77.anInt2106 = 0;
		for (@Pc(7616) int local7616 = 0; local7616 < Static161.anIntArray147.length; local7616++) {
			if (!Static592.aBooleanArray21[local7616]) {
				Static161.anIntArray147[local7616] = -1;
			}
		}
		if (Static79.anInt2118 != -1) {
			Static530.method7269(Static79.anInt2118);
		}
		for (@Pc(7647) Class3_Sub49 local7647 = (Class3_Sub49) Static204.aClass297_16.method6529(); local7647 != null; local7647 = (Class3_Sub49) Static204.aClass297_16.method6532()) {
			if (!local7647.method8129()) {
				local7647 = (Class3_Sub49) Static204.aClass297_16.method6529();
				if (local7647 == null) {
					break;
				}
			}
			Static46.method1171(true, false, local7647);
		}
		Static79.anInt2118 = -1;
		Static204.aClass297_16 = new Class297(8);
		Static50.method1227();
		Static463.aClass251_12 = null;
		for (@Pc(7687) int local7687 = 0; local7687 < 8; local7687++) {
			Static40.aStringArray4[local7687] = null;
			Static429.aBooleanArray26[local7687] = false;
			Static459.anIntArray476[local7687] = -1;
		}
		Static505.method6838();
		Static125.aBoolean197 = true;
		for (@Pc(7713) int local7713 = 0; local7713 < 100; local7713++) {
			Static544.aBooleanArray32[local7713] = true;
		}
		for (@Pc(7725) int local7725 = 0; local7725 < 6; local7725++) {
			Static107.aClass275Array1[local7725] = new Class275();
		}
		for (@Pc(7741) int local7741 = 0; local7741 < 25; local7741++) {
			Static564.anIntArray564[local7741] = 0;
			Static95.anIntArray80[local7741] = 0;
			Static361.anIntArray354[local7741] = 0;
		}
		Static38.method1056();
		Static309.aShortArray77 = Static508.aShortArray130 = Static456.aShortArray114 = Static429.aShortArray115 = new short[256];
		Static595.aBoolean725 = true;
		Static19.aString10 = Static573.aClass350_30.method7730(Static201.anInt4321);
		Static348.aClass3_Sub51_Sub1_5.aBoolean688 = false;
		Static538.anInt9387 = 0;
		Static348.aClass3_Sub51_Sub1_5.aBoolean691 = false;
		Static501.method6728();
		Static339.method4964();
		Static347.aClass284_106.anInt8049 = 2;
		Static321.aClass3_Sub28_3 = null;
		Static207.aLong102 = 0L;
	}
}
