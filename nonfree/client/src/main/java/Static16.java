import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	public static int anInt521 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method520() {
		for (@Pc(11) int local11 = 0; local11 < Static32.aByteArrayArrayArray4.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static32.aByteArrayArrayArray4[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static32.aByteArrayArrayArray4[0][0].length; local19++) {
					Static32.aByteArrayArrayArray4[local11][local15][local19] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!jf;Lclient!en;III)V")
	public static void method524(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class15 local8 = arg0.method2702(arg1);
		if (local8 == null) {
			return;
		}
		arg1.method4795(arg2, arg3, arg0.anInt2943 + arg2, arg0.anInt2916 + arg3);
		if (Static115.anInt2459 == 2 || Static115.anInt2459 == 5 || Static301.aClass54_21 == null) {
			arg1.method4803(local8, arg2, arg3);
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (Static215.anInt4279 == 4) {
			local46 = Static159.anInt3220;
			local52 = (int) -Static155.aFloat64 & 0x3FFF;
			local54 = 4096;
			local56 = Static130.anInt2662;
		} else {
			local56 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773;
			local54 = 4096 - Static339.anInt6353 * 16;
			local46 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769;
			local52 = Static253.anInt4957 + (int) -Static155.aFloat64 & 0x3FFF;
		}
		@Pc(91) int local91 = local46 / 32 + 48 - (Static266.anInt5101 - 104) * 2;
		@Pc(110) int local110 = Static339.anInt6352 * 4 + 208 + 48 - Static339.anInt6352 * 2 - local56 / 32;
		Static301.aClass54_21.method5570((float) arg2 + (float) arg0.anInt2943 / 2.0F, (float) arg3 + (float) arg0.anInt2916 / 2.0F, (float) local91, (float) local110, local54, local52 << 2, local8, arg2, arg3);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(146) Class5_Sub37 local146 = (Class5_Sub37) Static354.aClass211_42.method5608(); local146 != null; local146 = (Class5_Sub37) Static354.aClass211_42.method5603()) {
			@Pc(150) int local150 = local146.anInt5532;
			local162 = (Static334.aClass194_3.anIntArray499[local150] >> 14 & 0x3FFF) - Static263.anInt5063;
			local172 = (Static334.aClass194_3.anIntArray499[local150] & 0x3FFF) - Static28.anInt773;
			local182 = local162 * 4 + 2 - local46 / 32;
			local193 = local172 * 4 + 2 - local56 / 32;
			Static77.method1711(arg0, local193, arg3, arg1, arg2, Static334.aClass194_3.anIntArray500[local150], local8, local182);
		}
		for (local162 = 0; local162 < Static328.anInt6215; local162++) {
			local172 = Static302.anIntArray448[local162] * 4 + 2 - local46 / 32;
			local182 = Static227.anIntArray319[local162] * 4 + 2 - local56 / 32;
			@Pc(249) Class137 local249 = Static228.method3923(Static216.anIntArray306[local162]);
			if (local249.anIntArray296 != null) {
				local249 = local249.method3720();
				if (local249 == null || local249.anInt4147 == -1) {
					continue;
				}
			}
			Static77.method1711(arg0, local182, arg3, arg1, arg2, local249.anInt4147, local8, local172);
		}
		for (@Pc(287) Class5_Sub16 local287 = (Class5_Sub16) Static3.aClass42_56.method1060(); local287 != null; local287 = (Class5_Sub16) Static3.aClass42_56.method1055()) {
			local182 = (int) (local287.aLong218 >> 28 & 0x3L);
			if (local182 == Static138.anInt2777) {
				local193 = (int) (local287.aLong218 & 0x3FFFL) * 4 + 2 - local46 / 32;
				@Pc(331) int local331 = (int) (local287.aLong218 >> 14 & 0x3FFFL) * 4 + 2 - local56 / 32;
				Static208.method3707(arg2, arg3, local331, local8, arg0, local193, Static260.aClass54Array25[0]);
			}
		}
		@Pc(394) int local394;
		@Pc(404) int local404;
		for (local182 = 0; local182 < Static63.anInt1486; local182++) {
			@Pc(358) Class25_Sub1_Sub1_Sub2 local358 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local182]];
			if (local358 != null && local358.method4662()) {
				@Pc(367) Class216 local367 = local358.aClass216_1;
				if (local367 != null && local367.anIntArray562 != null) {
					local367 = local367.method5777();
				}
				if (local367 != null && local367.aBoolean482 && local367.aBoolean480) {
					local394 = local358.anInt5769 / 32 - local46 / 32;
					local404 = local358.anInt5773 / 32 - local56 / 32;
					if (local367.anInt6542 == -1) {
						Static208.method3707(arg2, arg3, local404, local8, arg0, local394, Static260.aClass54Array25[1]);
					} else {
						Static77.method1711(arg0, local404, arg3, arg1, arg2, local367.anInt6542, local8, local394);
					}
				}
			}
		}
		@Pc(474) int local474;
		for (local193 = 0; local193 < Static161.anInt3258; local193++) {
			@Pc(444) Class25_Sub1_Sub1_Sub1 local444 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local193]];
			if (local444 != null && local444.method3683()) {
				local394 = local444.anInt5769 / 32 - local46 / 32;
				local404 = local444.anInt5773 / 32 - local56 / 32;
				@Pc(472) boolean local472 = false;
				for (local474 = 0; local474 < Static31.anInt829; local474++) {
					if (local444.aString237.equals(Static61.aStringArray8[local474]) && Static19.anIntArray28[local474] != 0) {
						local472 = true;
						break;
					}
				}
				@Pc(495) boolean local495 = false;
				for (@Pc(497) int local497 = 0; local497 < Static117.anInt2498; local497++) {
					if (local444.aString237.equals(Static32.aClass205Array1[local497].aString347)) {
						local495 = true;
						break;
					}
				}
				@Pc(519) boolean local519 = false;
				if (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4068 != 0 && local444.anInt4068 != 0 && Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4068 == local444.anInt4068) {
					local519 = true;
				}
				if (local472) {
					Static208.method3707(arg2, arg3, local404, local8, arg0, local394, Static260.aClass54Array25[3]);
				} else if (local495) {
					Static208.method3707(arg2, arg3, local404, local8, arg0, local394, Static260.aClass54Array25[5]);
				} else if (local519) {
					Static208.method3707(arg2, arg3, local404, local8, arg0, local394, Static260.aClass54Array25[4]);
				} else {
					Static208.method3707(arg2, arg3, local404, local8, arg0, local394, Static260.aClass54Array25[2]);
				}
			}
		}
		@Pc(601) Class104[] local601 = Static141.aClass104Array1;
		@Pc(693) int local693;
		for (local394 = 0; local394 < local601.length; local394++) {
			@Pc(608) Class104 local608 = local601[local394];
			if (local608 != null && local608.anInt3106 != 0 && Static180.anInt3606 % 20 < 10) {
				@Pc(661) int local661;
				if (local608.anInt3106 == 1 && local608.anInt3095 >= 0 && local608.anInt3095 < Static188.aClass25_Sub1_Sub1_Sub2Array1.length) {
					@Pc(639) Class25_Sub1_Sub1_Sub2 local639 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local608.anInt3095];
					if (local639 != null) {
						local474 = local639.anInt5769 / 32 - local46 / 32;
						local661 = local639.anInt5773 / 32 - local56 / 32;
						Static256.method4449(arg3, local608.anInt3094, local8, 360000, arg2, arg0, local474, local661);
					}
				}
				if (local608.anInt3106 == 2) {
					local693 = (local608.anInt3105 + -Static263.anInt5063) * 4 + 2 - local46 / 32;
					local474 = (local608.anInt3100 - Static28.anInt773) * 4 + 2 - local56 / 32;
					local661 = local608.anInt3096 * 4;
					local661 *= local661;
					Static256.method4449(arg3, local608.anInt3094, local8, local661, arg2, arg0, local693, local474);
				}
				if (local608.anInt3106 == 10 && local608.anInt3095 >= 0 && local608.anInt3095 < Static312.aClass25_Sub1_Sub1_Sub1Array1.length) {
					@Pc(747) Class25_Sub1_Sub1_Sub1 local747 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local608.anInt3095];
					if (local747 != null) {
						local474 = local747.anInt5769 / 32 - local46 / 32;
						local661 = local747.anInt5773 / 32 - local56 / 32;
						Static256.method4449(arg3, local608.anInt3094, local8, 360000, arg2, arg0, local474, local661);
					}
				}
			}
		}
		if (Static215.anInt4279 == 4) {
			return;
		}
		if (Static79.anInt1909 != 0) {
			local404 = Static79.anInt1909 * 4 + (Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() + -1) * 2 + 2 - local46 / 32;
			local693 = Static238.anInt4612 * 4 + (Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() - 1) * 2 + 2 - local56 / 32;
			Static208.method3707(arg2, arg3, local693, local8, arg0, local404, Static160.aClass54Array16[Static301.aBoolean447 ? 1 : 0]);
		}
		arg1.method4835(arg0.anInt2916 / 2 + arg3 - 1, arg0.anInt2943 / 2 + -1 + arg2, 3, 3, -1);
		return;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!uh;")
	public static Class200 method527() {
		try {
			return (Class200) Class.forName("Class200_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}
}
