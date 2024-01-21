import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ia", name = "ad", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_21;

	@OriginalMember(owner = "client!ia", name = "Sb", descriptor = "I")
	public static final int anInt1261 = 50;

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "[I")
	public static int[] anIntArray198 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public static int anInt1239 = 78;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "[I")
	public static int[] anIntArray199 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "sb", descriptor = "[I")
	public static int[] anIntArray200 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "Cb", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array12 = new Class45[anInt1261];

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
	public static int anInt1253 = 0;

	@OriginalMember(owner = "client!ia", name = "Ib", descriptor = "[I")
	public static int[] anIntArray202 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "Jb", descriptor = "[I")
	public static int[] anIntArray203 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "bc", descriptor = "[I")
	public static int[] anIntArray205 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "Cc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_547 = Static63.method1251("level)2");

	@OriginalMember(owner = "client!ia", name = "Ac", descriptor = "Lclient!mb;")
	public static Class45 aClass45_546 = aClass45_547;

	@OriginalMember(owner = "client!ia", name = "Oc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_549 = Static63.method1251("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!ia", name = "Wc", descriptor = "[I")
	public static int[] anIntArray209 = new int[anInt1261];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z")
	public static boolean method943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static110.aClass34_1.method928(Static8.anInt262, arg0, arg1, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(28) int local28 = local18 & 0x1F;
		@Pc(34) int local34 = local18 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(51) Class5_Sub2_Sub7 local51 = Static62.method1232(local7);
			@Pc(64) int local64;
			@Pc(67) int local67;
			if (local34 == 0 || local34 == 2) {
				local64 = local51.anInt839;
				local67 = local51.anInt829;
			} else {
				local67 = local51.anInt839;
				local64 = local51.anInt829;
			}
			@Pc(78) int local78 = local51.anInt859;
			if (local34 != 0) {
				local78 = (local78 >> 4 - local34) + (local78 << local34 & 0xF);
			}
			Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], local67, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, local78, arg0, 2, local64, 0, arg1, true);
		} else {
			Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], local34, 0, arg0, 2, 0, local28 + 1, arg1, true);
		}
		Static68.anInt1957 = 2;
		Static27.anInt848 = 0;
		Static88.anInt2499 = Static36.anInt1063;
		Static4.anInt102 = Static67.anInt1906;
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BI[Lclient!jc;Lclient!i;B)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class37[] arg3, @OriginalArg(4) Class34 arg4) {
		@Pc(8) Class5_Sub9 local8 = new Class5_Sub9(arg1);
		@Pc(14) int local14 = -1;
		while (true) {
			@Pc(18) int local18 = local8.method1417();
			if (local18 == 0) {
				return;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local8.method1417();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local8.method1408();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(72) int local72 = local51 + arg2;
				@Pc(76) int local76 = local45 + arg0;
				if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
					@Pc(93) Class37 local93 = null;
					@Pc(95) int local95 = local55;
					if ((Static48.aByteArrayArrayArray3[1][local72][local76] & 0x2) == 2) {
						local95 = local55 - 1;
					}
					if (local95 >= 0) {
						local93 = arg3[local95];
					}
					Static55.method1155(local72, local76, arg4, local93, local55, local14, local67, local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIZ)V")
	public static void method949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == Static41.anInt2257 && Static42.anInt803 == arg0 && (Static99.anInt2657 == arg3 || !Static103.aBoolean122)) {
			return;
		}
		Static99.anInt2657 = arg3;
		if (!Static103.aBoolean122) {
			Static99.anInt2657 = 0;
		}
		Static42.anInt803 = arg0;
		Static41.anInt2257 = arg4;
		Static39.method1422(25);
		Static59.method1216(null, Static111.aClass45_1277, false);
		@Pc(45) int local45 = Static6.anInt162;
		@Pc(47) int local47 = Static78.anInt2210;
		Static6.anInt162 = arg0 * 8 - 48;
		@Pc(58) int local58 = Static6.anInt162 - local45;
		Static78.anInt2210 = arg4 * 8 - 48;
		@Pc(69) int local69 = Static78.anInt2210 - local47;
		for (@Pc(75) int local75 = 0; local75 < 32768; local75++) {
			@Pc(81) Class5_Sub2_Sub4_Sub3_Sub2 local81 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < 10; local85++) {
					local81.anIntArray350[local85] -= local69;
					local81.anIntArray349[local85] -= local58;
				}
				local81.anInt2428 -= local69 * 128;
				local81.anInt2417 -= local58 * 128;
			}
		}
		for (@Pc(131) int local131 = 0; local131 < 2048; local131++) {
			@Pc(137) Class5_Sub2_Sub4_Sub3_Sub1 local137 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local131];
			if (local137 != null) {
				for (@Pc(141) int local141 = 0; local141 < 10; local141++) {
					local137.anIntArray350[local141] -= local69;
					local137.anIntArray349[local141] -= local58;
				}
				local137.anInt2417 -= local58 * 128;
				local137.anInt2428 -= local69 * 128;
			}
		}
		Static8.anInt262 = arg3;
		Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1622(arg1, arg2, false);
		@Pc(195) byte local195 = 0;
		@Pc(197) byte local197 = 1;
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 104;
		@Pc(205) byte local205 = 1;
		if (local69 < 0) {
			local195 = 103;
			local197 = -1;
			local201 = -1;
		}
		if (local58 < 0) {
			local205 = -1;
			local199 = 103;
			local203 = -1;
		}
		for (@Pc(230) int local230 = local195; local230 != local201; local230 += local197) {
			for (@Pc(234) int local234 = local199; local234 != local203; local234 += local205) {
				@Pc(241) int local241 = local234 + local58;
				@Pc(245) int local245 = local69 + local230;
				for (@Pc(247) int local247 = 0; local247 < 4; local247++) {
					if (local245 >= 0 && local241 >= 0 && local245 < 104 && local241 < 104) {
						Static30.aClass10ArrayArrayArray2[local247][local230][local234] = Static30.aClass10ArrayArrayArray2[local247][local245][local241];
					} else {
						Static30.aClass10ArrayArrayArray2[local247][local230][local234] = null;
					}
				}
			}
		}
		for (@Pc(316) Class5_Sub19 local316 = (Class5_Sub19) Static74.aClass10_10.method230(); local316 != null; local316 = (Class5_Sub19) Static74.aClass10_10.method233()) {
			local316.anInt3117 -= local69;
			local316.anInt3122 -= local58;
			if (local316.anInt3117 < 0 || local316.anInt3122 < 0 || local316.anInt3117 >= 104 || local316.anInt3122 >= 104) {
				local316.method2144();
			}
		}
		Static102.anInt2754 = -1;
		Static114.aBoolean131 = false;
		Static101.anInt1025 = 0;
		if (Static1.anInt6 != 0) {
			Static31.anInt924 -= local58;
			Static1.anInt6 -= local69;
		}
		Static16.aClass10_3.method222();
		Static96.aClass10_11.method222();
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method955() {
		anIntArray203 = null;
		anIntArray200 = null;
		anIntArray199 = null;
		aClass45_547 = null;
		aClass45_546 = null;
		anIntArray202 = null;
		anIntArray198 = null;
		anIntArray205 = null;
		aClass5_Sub2_Sub6_Sub4_21 = null;
		aClass45Array12 = null;
		anIntArray209 = null;
		aClass45_549 = null;
	}
}
