import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ud", name = "Jb", descriptor = "Lclient!jo;")
	public static Class3_Sub4_Sub14 aClass3_Sub4_Sub14_5;

	@OriginalMember(owner = "client!ud", name = "Ub", descriptor = "Lclient!rn;")
	public static Class155 aClass155_101;

	@OriginalMember(owner = "client!ud", name = "Eb", descriptor = "Lclient!rg;")
	public static Class151 aClass151_17 = null;

	@OriginalMember(owner = "client!ud", name = "Kb", descriptor = "I")
	public static int anInt5067 = 0;

	@OriginalMember(owner = "client!ud", name = "wc", descriptor = "[I")
	public static int[] anIntArray540 = new int[100];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Lclient!vb;")
	public static Class183 method4188(@OriginalArg(0) int arg0) {
		@Pc(10) Class183 local10 = (Class183) Static108.aClass98_14.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static98.aClass155_48.method4121(4, arg0);
		local10 = new Class183();
		if (local29 != null) {
			local10.method4755(arg0, new Class3_Sub26(local29));
		}
		Static108.aClass98_14.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)[Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2[] method4193() {
		@Pc(10) Class3_Sub4_Sub12_Sub2[] local10 = new Class3_Sub4_Sub12_Sub2[Static28.anInt494];
		for (@Pc(16) int local16 = 0; local16 < Static28.anInt494; local16++) {
			@Pc(31) int local31 = Static306.anIntArray618[local16] * Static101.anIntArray185[local16];
			@Pc(34) int[] local34 = new int[local31];
			@Pc(38) byte[] local38 = Static314.aByteArrayArray130[local16];
			for (@Pc(40) int local40 = 0; local40 < local31; local40++) {
				local34[local40] = Static299.anIntArray611[local38[local40] & 0xFF];
			}
			local10[local16] = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local16], Static35.anIntArray54[local16], Static101.anIntArray185[local16], Static306.anIntArray618[local16], local34);
		}
		Static6.method108();
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!rn;Lclient!rn;Z)V")
	public static void method4195(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class155 arg1) {
		Static230.aClass155_95 = arg0;
		Static107.aBoolean157 = true;
		Static14.aClass155_11 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)[Lclient!ho;")
	public static Class3_Sub4_Sub12[] method4200() {
		@Pc(20) Class3_Sub4_Sub12[] local20 = new Class3_Sub4_Sub12[Static28.anInt494];
		for (@Pc(22) int local22 = 0; local22 < Static28.anInt494; local22++) {
			@Pc(29) byte[] local29 = Static314.aByteArrayArray130[local22];
			@Pc(37) int local37 = Static306.anIntArray618[local22] * Static101.anIntArray185[local22];
			if (Static314.aBooleanArray138[local22]) {
				@Pc(45) byte[] local45 = Static281.aByteArrayArray106[local22];
				@Pc(48) int[] local48 = new int[local37];
				for (@Pc(50) int local50 = 0; local50 < local37; local50++) {
					local48[local50] = Static299.anIntArray611[local29[local50] & 0xFF] | (local45[local50] & 0xFF) << 24;
				}
				if (Static283.aBoolean393) {
					local20[local22] = new Class3_Sub4_Sub12_Sub1_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local22], Static35.anIntArray54[local22], Static101.anIntArray185[local22], Static306.anIntArray618[local22], local48);
				} else {
					local20[local22] = new Class3_Sub4_Sub12_Sub2_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local22], Static35.anIntArray54[local22], Static101.anIntArray185[local22], Static306.anIntArray618[local22], local48);
				}
			} else {
				@Pc(125) int[] local125 = new int[local37];
				for (@Pc(127) int local127 = 0; local127 < local37; local127++) {
					local125[local127] = Static299.anIntArray611[local29[local127] & 0xFF];
				}
				if (Static283.aBoolean393) {
					local20[local22] = new Class3_Sub4_Sub12_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local22], Static35.anIntArray54[local22], Static101.anIntArray185[local22], Static306.anIntArray618[local22], local125);
				} else {
					local20[local22] = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local22], Static35.anIntArray54[local22], Static101.anIntArray185[local22], Static306.anIntArray618[local22], local125);
				}
			}
		}
		Static6.method108();
		return local20;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIZZIZ)V")
	public static void method4201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg6 && arg2 == Static3.anInt70 && Static131.anInt2471 == arg3 && (Static187.anInt3700 == arg1 || Static208.method3462())) {
			return;
		}
		Static3.anInt70 = arg2;
		Static131.anInt2471 = arg3;
		Static187.anInt3700 = arg1;
		if (Static208.method3462()) {
			Static187.anInt3700 = 0;
		}
		if (arg4) {
			Static264.method4398(28);
		} else {
			Static264.method4398(25);
		}
		Static212.method3485(Static167.aString113, true);
		@Pc(51) int local51 = Static43.anInt798;
		Static43.anInt798 = (arg3 - 6) * 8;
		@Pc(59) int local59 = Static101.anInt1844;
		Static101.anInt1844 = (arg2 - 6) * 8;
		aClass3_Sub4_Sub14_5 = Static228.method1182(Static3.anInt70 * 8, Static131.anInt2471 * 8);
		Static201.aClass43_3 = null;
		@Pc(80) int local80 = Static43.anInt798 - local51;
		@Pc(85) int local85 = Static101.anInt1844 - local59;
		@Pc(93) int local93;
		@Pc(102) Class10_Sub5_Sub2 local102;
		@Pc(108) int local108;
		if (arg4) {
			Static118.anInt2202 = 0;
			for (local93 = 0; local93 < 32768; local93++) {
				local102 = Static110.aClass10_Sub5_Sub2Array1[local93];
				if (local102 != null) {
					local102.anInt5016 -= local80 * 128;
					local102.anInt5073 -= local85 * 128;
					if (local102.anInt5073 >= 0 && local102.anInt5073 <= 13184 && local102.anInt5016 >= 0 && local102.anInt5016 <= 13184) {
						for (local108 = 0; local108 < 10; local108++) {
							local102.anIntArray537[local108] -= local85;
							local102.anIntArray535[local108] -= local80;
						}
						Static253.anIntArray547[Static118.anInt2202++] = local93;
					} else {
						Static110.aClass10_Sub5_Sub2Array1[local93].method4209(null);
						Static110.aClass10_Sub5_Sub2Array1[local93] = null;
					}
				}
			}
		} else {
			for (local93 = 0; local93 < 32768; local93++) {
				local102 = Static110.aClass10_Sub5_Sub2Array1[local93];
				if (local102 != null) {
					for (local108 = 0; local108 < 10; local108++) {
						local102.anIntArray537[local108] -= local85;
						local102.anIntArray535[local108] -= local80;
					}
					local102.anInt5016 -= local80 * 128;
					local102.anInt5073 -= local85 * 128;
				}
			}
		}
		for (local93 = 0; local93 < 2048; local93++) {
			@Pc(266) Class10_Sub5_Sub1 local266 = Static52.aClass10_Sub5_Sub1Array1[local93];
			if (local266 != null) {
				for (local108 = 0; local108 < 10; local108++) {
					local266.anIntArray537[local108] -= local85;
					local266.anIntArray535[local108] -= local80;
				}
				local266.anInt5073 -= local85 * 128;
				local266.anInt5016 -= local80 * 128;
			}
		}
		Static99.anInt1826 = arg1;
		@Pc(319) byte local319 = 0;
		Static136.aClass10_Sub5_Sub1_1.method3047(arg0, arg5, false);
		@Pc(327) byte local327 = 1;
		@Pc(329) byte local329 = 104;
		if (local85 < 0) {
			local327 = -1;
			local329 = -1;
			local319 = 103;
		}
		@Pc(340) byte local340 = 0;
		@Pc(342) byte local342 = 104;
		@Pc(344) byte local344 = 1;
		if (local80 < 0) {
			local342 = -1;
			local340 = 103;
			local344 = -1;
		}
		for (@Pc(355) int local355 = local319; local355 != local329; local355 += local327) {
			for (@Pc(360) int local360 = local340; local360 != local342; local360 += local344) {
				@Pc(371) int local371 = local85 + local355;
				@Pc(375) int local375 = local360 + local80;
				for (@Pc(377) int local377 = 0; local377 < 4; local377++) {
					if (local371 >= 0 && local375 >= 0 && local371 < 104 && local375 < 104) {
						Static223.aClass56ArrayArrayArray1[local377][local355][local360] = Static223.aClass56ArrayArrayArray1[local377][local371][local375];
					} else {
						Static223.aClass56ArrayArrayArray1[local377][local355][local360] = null;
					}
				}
			}
		}
		for (@Pc(439) Class3_Sub10 local439 = (Class3_Sub10) Static219.aClass56_21.method1281(); local439 != null; local439 = (Class3_Sub10) Static219.aClass56_21.method1278()) {
			local439.anInt1465 -= local85;
			local439.anInt1475 -= local80;
			if (local439.anInt1465 < 0 || local439.anInt1475 < 0 || local439.anInt1465 >= 104 || local439.anInt1475 >= 104) {
				local439.method5013();
			}
		}
		Static62.anInt1162 = 0;
		if (arg4) {
			Static135.anInt2608 -= local80;
			Static173.anInt3251 -= local80 * 128;
			Static230.anInt4492 -= local85 * 128;
			Static20.anInt370 -= local85;
			Static107.anInt1966 -= local85;
			Static190.anInt3752 -= local80;
		} else if (Static25.anInt467 == 4) {
			Static306.anInt6010 -= local80 * 128;
			Static224.anInt6078 -= local85 * 128;
			Static2.anInt22 -= local80 * 128;
			Static308.anInt6040 -= local85 * 128;
		} else {
			Static25.anInt467 = 1;
		}
		if (Static81.anInt1533 != 0) {
			Static81.anInt1533 -= local85;
			Static247.anInt4992 -= local80;
		}
		if (Static283.aBoolean393 && arg4 && (Math.abs(local85) > 104 || Math.abs(local80) > 104)) {
			Static13.method193();
		}
		Static295.method4155();
		Static259.aClass56_25.method1270();
		Static291.aClass56_27.method1270();
		Static71.method1088();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZILjava/lang/StringBuffer;C)Ljava/lang/StringBuffer;")
	public static StringBuffer method4204(@OriginalArg(2) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(19) int local19 = local8; local19 < 0; local19++) {
			arg0.setCharAt(local19, ' ');
		}
		return arg0;
	}
}
