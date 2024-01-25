import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_151 = new Class200(60, 6);

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
	public static int anInt10211 = 0;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)I")
	public static int method8745() {
		return Static482.method7192(false);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8746(@OriginalArg(0) Class5 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static219.aBoolean285) {
			local7 = Static30.method1089();
			local9 = Static166.method2921();
		}
		@Pc(21) int local21 = local7 + Static276.anInt4979;
		@Pc(25) int local25 = local9 + Static625.anInt10194;
		@Pc(27) int local27 = Static452.anInt3209;
		@Pc(31) int local31 = Static354.anInt6787 - 3;
		Static589.method8291(local7 + Static276.anInt4979, arg0, Static59.aClass43_24.method1598(Static325.anInt6083), Static452.anInt3209, local9 + Static625.anInt10194, Static354.anInt6787);
		@Pc(55) int local55 = Static483.aClass191_1.method6989() + local7;
		@Pc(66) int local66 = local9 + Static483.aClass191_1.method6982();
		@Pc(70) int local70;
		@Pc(75) Class3_Sub4_Sub13 local75;
		@Pc(92) int local92;
		@Pc(271) int local271;
		@Pc(162) Class3_Sub4_Sub1 local162;
		@Pc(259) Class3_Sub4_Sub13 local259;
		if (Static392.aBoolean518) {
			local70 = 0;
			for (local162 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local162 != null; local162 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
				local92 = local70 * 16 + local25 + 33;
				local70++;
				if (local55 > Static276.anInt4979 + local7 && Static452.anInt3209 + Static276.anInt4979 + local7 > local55 && local66 > local92 - 13 && local66 < local92 + 4 && (local162.anInt805 > 1 || ((Class3_Sub4_Sub13) local162.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66).aBoolean306)) {
					arg0.aa(local7 + Static276.anInt4979, local92 + -12, Static452.anInt3209, 16, Static303.anInt5383 | 255 - Static184.anInt3547 << 24, 1);
				}
			}
			if (Static528.aClass3_Sub4_Sub1_1 != null) {
				Static589.method8291(Static107.anInt2316, arg0, Static528.aClass3_Sub4_Sub1_1.aString2, Static416.anInt7575, Static312.anInt5897, Static261.anInt4795);
				local70 = 0;
				for (local259 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method897(); local259 != null; local259 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method898()) {
					local271 = Static312.anInt5897 + local70 * 16 + 13 + 20;
					if (local55 > Static107.anInt2316 && local55 < Static107.anInt2316 + Static416.anInt7575 && local66 > local271 - 13 && local66 < local271 + 4 && local259.aBoolean306) {
						arg0.aa(Static107.anInt2316, local271 - 12, Static416.anInt7575, 16, 255 - Static184.anInt3547 << 24 | Static303.anInt5383, 1);
					}
					local70++;
				}
				Static231.method3853(Static312.anInt5897, Static261.anInt4795, arg0, Static107.anInt2316, Static416.anInt7575);
			}
		} else {
			local70 = 0;
			for (local75 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local75 != null; local75 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				local92 = local25 + (Static160.anInt3142 - local70 - 1) * 16 + 33;
				if (Static276.anInt4979 + local7 < local55 && local55 < Static276.anInt4979 + local7 + Static452.anInt3209 && local92 - 13 < local66 && local66 < local92 + 4 && local75.aBoolean306) {
					arg0.aa(Static276.anInt4979 + local7, local92 + -12, Static452.anInt3209, 16, 255 - Static184.anInt3547 << 24 | Static303.anInt5383, 1);
				}
				local70++;
			}
		}
		Static231.method3853(Static625.anInt10194 + local9, Static354.anInt6787, arg0, local7 + Static276.anInt4979, Static452.anInt3209);
		if (Static392.aBoolean518) {
			local70 = 0;
			for (local162 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local162 != null; local162 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
				local92 = Static625.anInt10194 + local9 + local70 * 16 + 13 + 20;
				if (local162.anInt805 == 1) {
					Static17.method865(Static276.anInt4979 + local7, Static625.anInt10194 + local9, local92, Static452.anInt3209, local66, arg0, Static627.anInt10085 | 0xFF000000, Static354.anInt6787, local55, Static325.anInt6089 | 0xFF000000, (Class3_Sub4_Sub13) local162.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66);
				} else {
					Static547.method1364(local66, Static325.anInt6089 | 0xFF000000, arg0, local55, local9 + Static625.anInt10194, Static276.anInt4979 + local7, Static452.anInt3209, local162, Static627.anInt10085 | 0xFF000000, Static354.anInt6787, local92);
				}
				local70++;
			}
			if (Static528.aClass3_Sub4_Sub1_1 != null) {
				local70 = 0;
				for (local259 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method897(); local259 != null; local259 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method898()) {
					local271 = Static312.anInt5897 + local70 * 16 + 13 + 20;
					local70++;
					Static17.method865(Static107.anInt2316, Static312.anInt5897, local271, Static416.anInt7575, local66, arg0, Static627.anInt10085 | 0xFF000000, Static261.anInt4795, local55, Static325.anInt6089 | 0xFF000000, local259);
				}
				Static363.method1644(Static312.anInt5897, Static261.anInt4795, Static107.anInt2316, Static416.anInt7575);
			}
		} else {
			local70 = 0;
			for (local75 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local75 != null; local75 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				local92 = local25 + (-local70 + -1 + Static160.anInt3142) * 16 + 13 + 20;
				Static17.method865(local21, local25, local92, local27, local66, arg0, Static627.anInt10085 | 0xFF000000, local31, local55, Static325.anInt6089 | 0xFF000000, local75);
				local70++;
			}
		}
		Static363.method1644(Static625.anInt10194 + local9, Static354.anInt6787, local7 + Static276.anInt4979, Static452.anInt3209);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILclient!dk;II)V")
	public static void method8747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub14 arg2, @OriginalArg(3) int arg3) {
		arg2.aClass3_Sub3_Sub2_2.method4265(arg0);
		arg2.aClass3_Sub3_Sub2_2.method4201(arg3);
		arg2.aClass3_Sub3_Sub2_2.method4253(arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIIZ)V")
	public static void method8751(@OriginalArg(3) boolean arg0) {
		Static197.anInt3857 = 2;
		Static447.aBoolean556 = arg0;
		Static276.anInt4980 = 22050;
	}
}
