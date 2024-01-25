import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!jk;")
	public static Class106 aClass106_7;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public static int anInt5814 = -1;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
	public static int method4973(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)I")
	public static int method4975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static85.anIntArrayArray56 == null ? 0 : Static85.anIntArrayArray56[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I")
	public static int method4976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!aq;ZLclient!uo;)V")
	public static void method4977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(4) Class32 arg3) {
		@Pc(10) Class52 local10 = arg2.method367(arg3);
		if (local10 == null) {
			return;
		}
		arg3.method2226(arg0, arg1, arg0 + arg2.lb, arg2.anInt446 + arg1);
		if (Static144.anInt3144 == 2 || Static144.anInt3144 == 5 || Static97.aClass5_25 == null) {
			arg3.method2156(local10, arg0, arg1);
			return;
		}
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(59) int local59;
		@Pc(53) int local53;
		if (Static147.anInt3204 == 4) {
			local53 = 4096;
			local59 = (int) -Static75.aFloat13 & 0x3FFF;
			local61 = Static133.anInt2962;
			local63 = Static77.anInt2010;
		} else {
			local53 = 4096 - Static287.anInt5748 * 16;
			local61 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109;
			local63 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108;
			local59 = (int) -Static75.aFloat13 + Static337.anInt6461 & 0x3FFF;
		}
		@Pc(96) int local96 = local61 / 32 + 256 - Static233.anInt5573 * 2;
		@Pc(114) int local114 = Static134.anInt2971 * 4 + 48 - (Static134.anInt2971 - 104) * 2 - local63 / 32;
		Static97.aClass5_25.method3631((float) arg2.lb / 2.0F + (float) arg0, (float) arg2.anInt446 / 2.0F + (float) arg1, (float) local96, (float) local114, local53, local59 << 2, local10, arg0, arg1);
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(148) Class1_Sub13 local148 = (Class1_Sub13) Static192.aClass16_23.method410(); local148 != null; local148 = (Class1_Sub13) Static192.aClass16_23.method419()) {
			@Pc(153) int local153 = local148.anInt1849;
			local165 = (Static224.aClass207_3.anIntArray511[local153] >> 14 & 0x3FFF) - Static234.anInt4783;
			local174 = (Static224.aClass207_3.anIntArray511[local153] & 0x3FFF) - Static32.anInt2224;
			local185 = local165 * 4 + 2 - local61 / 32;
			local196 = local174 * 4 + 2 - local63 / 32;
			Static125.method2609(arg0, arg2, arg3, local10, local196, arg1, Static224.aClass207_3.anIntArray510[local153], local185);
		}
		for (local165 = 0; local165 < Static322.anInt6182; local165++) {
			local174 = Static234.anIntArray429[local165] * 4 + 2 - local61 / 32;
			local185 = Static327.anIntArray509[local165] * 4 + 2 - local63 / 32;
			@Pc(251) Class141 local251 = Static119.method2548(Static303.anIntArray218[local165]);
			if (local251.anIntArray391 != null) {
				local251 = local251.method3833();
				if (local251 == null || local251.anInt4277 == -1) {
					continue;
				}
			}
			Static125.method2609(arg0, arg2, arg3, local10, local185, arg1, local251.anInt4277, local174);
		}
		for (@Pc(291) Class1_Sub7 local291 = (Class1_Sub7) Static339.aClass197_30.method5161(); local291 != null; local291 = (Class1_Sub7) Static339.aClass197_30.method5154()) {
			local185 = (int) (local291.aLong213 >> 28 & 0x3L);
			if (local185 == Static239.anInt4960) {
				local196 = (int) (local291.aLong213 & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(339) int local339 = (int) (local291.aLong213 >> 14 & 0x3FFFL) * 4 + 2 - local63 / 32;
				Static120.method2555(arg1, arg2, arg0, local196, Static166.aClass5Array14[0], local10, local339);
			}
		}
		@Pc(403) int local403;
		@Pc(413) int local413;
		for (local185 = 0; local185 < Static5.anInt200; local185++) {
			@Pc(367) Class17_Sub1_Sub1_Sub2 local367 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local185]];
			if (local367 != null && local367.method4333()) {
				@Pc(376) Class213 local376 = local367.aClass213_1;
				if (local376 != null && local376.anIntArray517 != null) {
					local376 = local376.method5480();
				}
				if (local376 != null && local376.aBoolean639 && local376.aBoolean637) {
					local403 = local367.anInt5109 / 32 - local61 / 32;
					local413 = local367.anInt5108 / 32 - local63 / 32;
					if (local376.anInt6519 == -1) {
						Static120.method2555(arg1, arg2, arg0, local403, Static166.aClass5Array14[1], local10, local413);
					} else {
						Static125.method2609(arg0, arg2, arg3, local10, local413, arg1, local376.anInt6519, local403);
					}
				}
			}
		}
		@Pc(486) int local486;
		for (local196 = 0; local196 < Static357.anInt4331; local196++) {
			@Pc(456) Class17_Sub1_Sub1_Sub1 local456 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local196]];
			if (local456 != null && local456.method558()) {
				local403 = local456.anInt5109 / 32 - local61 / 32;
				local413 = local456.anInt5108 / 32 - local63 / 32;
				@Pc(484) boolean local484 = false;
				for (local486 = 0; local486 < Static191.anInt4095; local486++) {
					if (local456.aString13.equals(Static235.aStringArray49[local486]) && Static202.anIntArray385[local486] != 0) {
						local484 = true;
						break;
					}
				}
				@Pc(513) boolean local513 = false;
				for (@Pc(515) int local515 = 0; local515 < Static353.anInt6722; local515++) {
					if (local456.aString13.equals(Static156.aClass215Array1[local515].aString65)) {
						local513 = true;
						break;
					}
				}
				@Pc(539) boolean local539 = false;
				if (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt811 != 0 && local456.anInt811 != 0 && local456.anInt811 == Static198.aClass17_Sub1_Sub1_Sub1_3.anInt811) {
					local539 = true;
				}
				if (local484) {
					Static120.method2555(arg1, arg2, arg0, local403, Static166.aClass5Array14[3], local10, local413);
				} else if (local513) {
					Static120.method2555(arg1, arg2, arg0, local403, Static166.aClass5Array14[5], local10, local413);
				} else if (local539) {
					Static120.method2555(arg1, arg2, arg0, local403, Static166.aClass5Array14[4], local10, local413);
				} else {
					Static120.method2555(arg1, arg2, arg0, local403, Static166.aClass5Array14[2], local10, local413);
				}
			}
		}
		@Pc(617) Class105[] local617 = Static340.aClass105Array1;
		@Pc(711) int local711;
		for (local403 = 0; local403 < local617.length; local403++) {
			@Pc(625) Class105 local625 = local617[local403];
			if (local625 != null && local625.anInt3081 != 0 && Static5.anInt208 % 20 < 10) {
				@Pc(682) int local682;
				if (local625.anInt3081 == 1 && local625.anInt3076 >= 0 && Static140.aClass17_Sub1_Sub1_Sub2Array1.length > local625.anInt3076) {
					@Pc(661) Class17_Sub1_Sub1_Sub2 local661 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local625.anInt3076];
					if (local661 != null) {
						local486 = local661.anInt5109 / 32 - local61 / 32;
						local682 = local661.anInt5108 / 32 - local63 / 32;
						Static298.method4999(360000, arg1, local625.anInt3080, arg2, arg0, local486, local10, local682);
					}
				}
				if (local625.anInt3081 == 2) {
					local711 = (local625.anInt3086 - Static234.anInt4783) * 4 + 2 - local61 / 32;
					local486 = (local625.anInt3083 - Static32.anInt2224) * 4 + 2 - local63 / 32;
					local682 = local625.anInt3084 * 4;
					local682 *= local682;
					Static298.method4999(local682, arg1, local625.anInt3080, arg2, arg0, local711, local10, local486);
				}
				if (local625.anInt3081 == 10 && local625.anInt3076 >= 0 && local625.anInt3076 < Static102.aClass17_Sub1_Sub1_Sub1Array1.length) {
					@Pc(769) Class17_Sub1_Sub1_Sub1 local769 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local625.anInt3076];
					if (local769 != null) {
						local486 = local769.anInt5109 / 32 - local61 / 32;
						local682 = local769.anInt5108 / 32 - local63 / 32;
						Static298.method4999(360000, arg1, local625.anInt3080, arg2, arg0, local486, local10, local682);
					}
				}
			}
		}
		if (Static147.anInt3204 == 4) {
			return;
		}
		if (Static99.anInt2377 != 0) {
			local413 = Static99.anInt2377 * 4 + Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() * 2 + 2 - local61 / 32 - 2;
			local711 = Static266.anInt5402 * 4 + (Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() + -1) * 2 + 2 - local63 / 32;
			Static120.method2555(arg1, arg2, arg0, local413, Static300.aClass5Array23[Static47.aBoolean146 ? 1 : 0], local10, local711);
		}
		arg3.method2191(-1, arg2.lb / 2 + arg0 - 1, 3, arg2.anInt446 / 2 + arg1 - 1, 3);
	}
}
