import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array3;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt1209;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_11;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_534 = Static109.method1737("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_528 = aClass53_534;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!b;")
	public static Class5 aClass5_1 = new Class5();

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_529 = Static109.method1737("Texturen geladen)3");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_530 = Static109.method1737("Mem:");

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public static int anInt1206 = -1;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!na;")
	private static Class53 aClass53_531 = Static109.method1737("Checking for updates )2 ");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_532 = aClass53_531;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_533 = Static109.method1737("runes");

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_535 = Static109.method1737("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method837() {
		anIntArray143 = null;
		aClass3_Sub1_Sub5_Sub3_11 = null;
		aClass5_1 = null;
		aClass53_529 = null;
		aClass53_528 = null;
		aClass53_533 = null;
		aClass53_531 = null;
		aClass53_532 = null;
		aClass53_530 = null;
		aClass53_534 = null;
		aClass53_535 = null;
		aClass3_Sub1_Sub5_Sub3Array3 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!q;Lclient!dd;BI)V")
	public static void method838(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.aLong94 = arg2;
		local7.anInt1119 = 1;
		local7.aClass62_Sub1_6 = arg0;
		local7.aClass17_1 = arg1;
		@Pc(22) Class11 local22 = Static100.aClass11_11;
		synchronized (Static100.aClass11_11) {
			Static100.aClass11_11.method190(local7);
		}
		Static9.method138();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)Z")
	public static boolean method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(24) int local24 = Static120.aClass39_1.method985(Static72.anInt1813, arg1, arg0, arg2);
		if (local24 == -1) {
			return false;
		}
		@Pc(33) int local33 = local24 & 0x1F;
		@Pc(39) int local39 = local24 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(78) Class3_Sub1_Sub2 local78 = Static12.method200(local7);
			@Pc(86) int local86;
			@Pc(89) int local89;
			if (local39 == 0 || local39 == 2) {
				local86 = local78.anInt270;
				local89 = local78.anInt282;
			} else {
				local89 = local78.anInt270;
				local86 = local78.anInt282;
			}
			@Pc(100) int local100 = local78.anInt277;
			if (local39 != 0) {
				local100 = (local100 >> 4 - local39) + (local100 << local39 & 0xF);
			}
			Static16.method242(arg0, local89, 0, true, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], arg1, local86, local100, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
		} else {
			Static16.method242(arg0, 0, local39, true, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], arg1, 0, 0, local33 + 1, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
		}
		Static2.anInt57 = Static54.anInt2854;
		Static93.anInt2226 = Static56.anInt1504;
		Static48.anInt1294 = 0;
		Static124.anInt2871 = 2;
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static void method840(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static124.aClass3_Sub1_Sub5_Sub4_38.anIntArray257;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static37.aByteArrayArrayArray17[arg0][local40][local25] & 0x18) == 0) {
					Static120.aClass39_1.method1007(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static37.aByteArrayArrayArray17[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static120.aClass39_1.method1007(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static124.aClass3_Sub1_Sub5_Sub4_38.method1335();
		local38 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10;
		local40 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(158) int local158;
		for (@Pc(154) int local154 = 1; local154 < 103; local154++) {
			for (local158 = 1; local158 < 103; local158++) {
				if ((Static37.aByteArrayArrayArray17[arg0][local158][local154] & 0x18) == 0) {
					Static60.method1078(arg0, local38, local154, local158, local40);
				}
				if (arg0 < 3 && (Static37.aByteArrayArrayArray17[arg0 + 1][local158][local154] & 0x8) != 0) {
					Static60.method1078(arg0 + 1, local38, local154, local158, local40);
				}
			}
		}
		Static35.anInt1114 = 0;
		for (local158 = 0; local158 < 104; local158++) {
			for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
				@Pc(229) int local229 = Static120.aClass39_1.method971(Static72.anInt1813, local158, local221);
				if (local229 != 0) {
					local229 = local229 >> 14 & 0x7FFF;
					@Pc(245) int local245 = Static12.method200(local229).anInt271;
					if (local245 >= 0) {
						@Pc(249) int local249 = local158;
						@Pc(251) int local251 = local221;
						if (local245 != 22 && local245 != 29 && local245 != 34 && local245 != 36 && local245 != 46 && local245 != 47 && local245 != 48) {
							@Pc(283) int[][] local283 = Static90.aClass9Array1[Static72.anInt1813].anIntArrayArray1;
							for (@Pc(285) int local285 = 0; local285 < 10; local285++) {
								@Pc(292) int local292 = (int) (Math.random() * 4.0D);
								if (local292 == 0 && local249 > 0 && local249 > local158 - 3 && (local283[local249 - 1][local251] & 0x1280108) == 0) {
									local249--;
								}
								if (local292 == 1 && local249 < 103 && local158 + 3 > local249 && (local283[local249 + 1][local251] & 0x1280180) == 0) {
									local249++;
								}
								if (local292 == 2 && local251 > 0 && local221 - 3 < local251 && (local283[local249][local251 - 1] & 0x1280102) == 0) {
									local251--;
								}
								if (local292 == 3 && local251 < 103 && local221 + 3 > local251 && (local283[local249][local251 + 1] & 0x1280120) == 0) {
									local251++;
								}
							}
						}
						Static33.aClass3_Sub1_Sub5_Sub4Array11[Static35.anInt1114] = Static95.aClass3_Sub1_Sub5_Sub4Array13[local245];
						Static40.anIntArray141[Static35.anInt1114] = local249;
						Static115.anIntArray372[Static35.anInt1114] = local251;
						Static35.anInt1114++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	public static int method841() {
		return 6;
	}
}
