import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt1835;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public static int anInt1841;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	public static int anInt1842;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public static int anInt1839 = 0;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!kb;")
	private static Class46 aClass46_629 = Static65.method1172("Loading config )2 ");

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_627 = aClass46_629;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!h;")
	public static Class33 aClass33_7 = null;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_628 = Static65.method1172("Abbrechen");

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "[I")
	public static int[] anIntArray173 = new int[100];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1213() {
		aClass46_628 = null;
		anIntArray173 = null;
		aClass33_7 = null;
		aClass46_627 = null;
		anIntArray172 = null;
		aClass46_629 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method1214() {
		if (Static97.aBooleanArray9[96]) {
			Static38.anInt1078 += (-Static38.anInt1078 - 24) / 2;
		} else if (Static97.aBooleanArray9[97]) {
			Static38.anInt1078 += (24 - Static38.anInt1078) / 2;
		} else {
			Static38.anInt1078 /= 2;
		}
		Static29.anInt697 = Static38.anInt1078 / 2 + Static29.anInt697 & 0x7FF;
		@Pc(49) int local49 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 + Static146.anInt3350;
		@Pc(58) int local58 = Static20.anInt514 + Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711;
		if (Static4.anInt3714 - local49 < -500 || Static4.anInt3714 - local49 > 500 || Static178.anInt3927 - local58 < -500 || Static178.anInt3927 - local58 > 500) {
			Static4.anInt3714 = local49;
			Static178.anInt3927 = local58;
		}
		if (Static97.aBooleanArray9[98]) {
			Static137.anInt3201 += (12 - Static137.anInt3201) / 2;
		} else if (Static97.aBooleanArray9[99]) {
			Static137.anInt3201 += (-Static137.anInt3201 - 12) / 2;
		} else {
			Static137.anInt3201 /= 2;
		}
		if (Static4.anInt3714 != local49) {
			Static4.anInt3714 += (local49 - Static4.anInt3714) / 16;
		}
		Static98.anInt2371 += Static137.anInt3201 / 2;
		@Pc(153) int local153 = 0;
		@Pc(157) int local157 = Static4.anInt3714 >> 7;
		if (Static98.anInt2371 < 128) {
			Static98.anInt2371 = 128;
		}
		if (local58 != Static178.anInt3927) {
			Static178.anInt3927 += (local58 - Static178.anInt3927) / 16;
		}
		@Pc(180) int local180 = Static178.anInt3927 >> 7;
		if (Static98.anInt2371 > 383) {
			Static98.anInt2371 = 383;
		}
		@Pc(191) int local191 = Static168.method2689(Static178.anInt3927, Static4.anInt3714, Static99.anInt2422);
		@Pc(211) int local211;
		if (local157 > 3 && local180 > 3 && local157 < 100 && local180 < 100) {
			for (local211 = local157 - 4; local211 <= local157 + 4; local211++) {
				for (@Pc(217) int local217 = local180 - 4; local217 <= local180 + 4; local217++) {
					@Pc(221) int local221 = Static99.anInt2422;
					if (local221 < 3 && (Static119.aByteArrayArrayArray5[1][local211][local217] & 0x2) == 2) {
						local221++;
					}
					@Pc(251) int local251 = local191 - Static133.anIntArrayArrayArray8[local221][local211][local217];
					if (local251 > local153) {
						local153 = local251;
					}
				}
			}
		}
		local211 = local153 * 192;
		if (local211 > 98048) {
			local211 = 98048;
		}
		if (local211 < 32768) {
			local211 = 32768;
		}
		if (anInt1843 < local211) {
			anInt1843 += (local211 - anInt1843) / 24;
		} else if (local211 < anInt1843) {
			anInt1843 += (local211 - anInt1843) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1215() {
		Static108.anInt2585 = 0;
		Static143.anInt3279 = 0;
		Static182.method2918();
		Static13.method289();
		Static57.method1064();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static143.anInt3279; local25++) {
			local31 = Static150.anIntArray393[local25];
			if (Static20.anInt512 != Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local31].anInt1734) {
				Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local31].aClass3_Sub2_Sub16_1 = null;
				Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local31] = null;
			}
		}
		if (Static139.anInt3221 != Static49.aClass3_Sub4_Sub1_2.anInt232) {
			throw new RuntimeException("gnp1 pos:" + Static49.aClass3_Sub4_Sub1_2.anInt232 + " psize:" + Static139.anInt3221);
		}
		for (local31 = 0; local31 < Static174.anInt3804; local31++) {
			if (Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static174.anInt3804);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kb;Lclient!rd;B)I")
	public static int method1216(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		@Pc(11) int local11 = arg1.anInt232;
		arg1.method182(arg0.anInt2034);
		arg1.anInt232 += Static54.aClass75_1.method2515(arg0.anInt2034, arg1.aByteArray5, arg0.aByteArray17, arg1.anInt232, 0);
		return arg1.anInt232 - local11;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ld;Z)V")
	public static void method1217(@OriginalArg(0) Class3_Sub14 arg0) {
		Static96.method1594(200000, arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1218() {
		try {
			if (Static51.aClass73_1 == null) {
				Static51.aClass73_1 = new Class73(Static66.aClass68_4, Static178.method2860(new Class46[] { Static51.aClass46_452, Static38.aClass46_300, Static153.aClass46_1203 }).method1377());
			} else {
				@Pc(39) byte[] local39 = Static51.aClass73_1.method2436();
				if (local39 != null) {
					@Pc(46) Class3_Sub4 local46 = new Class3_Sub4(local39);
					Static171.anInt3770 = local46.method208();
					Static162.aClass38Array1 = new Class38[Static171.anInt3770];
					for (@Pc(55) int local55 = 0; local55 < Static171.anInt3770; local55++) {
						@Pc(65) Class38 local65 = Static162.aClass38Array1[local55] = new Class38();
						@Pc(69) int local69 = local46.method208();
						local65.aBoolean68 = (local69 & 0x8000) != 0;
						local65.anInt1776 = local69 & 0x7FFF;
						local65.aClass46_608 = local46.method172();
						local65.anInt1781 = local46.method220();
						local65.anInt1780 = local55;
						local65.anInt1775 = Static156.method2536(local65.aClass46_608);
					}
					Static96.method1597(Static162.aClass38Array1, Static134.anIntArray351, Static162.aClass38Array1.length - 1, Static83.anIntArray212, 0);
					Static51.aClass73_1 = null;
					Static139.aBoolean134 = true;
				}
			}
		} catch (@Pc(128) Exception local128) {
			local128.printStackTrace();
			Static51.aClass73_1 = null;
		}
	}
}
