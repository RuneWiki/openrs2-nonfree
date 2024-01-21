import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!wh;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public static int anInt1926 = -1;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_772 = Static146.method2172("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!sg;")
	private static Class77 aClass77_774 = Static146.method2172("Loaded config");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_773 = aClass77_774;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt1931 = 0;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_775 = Static146.method2172("VOLL");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!sg;")
	public static Class77 aClass77_776 = Static146.method2172("k");

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_777 = Static146.method2172("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_778 = Static146.method2172(")2");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1389() {
		aClass77_774 = null;
		aClass77_775 = null;
		aClass77_772 = null;
		aClass77_776 = null;
		aLongArray4 = null;
		aClass77_777 = null;
		aClass77_773 = null;
		aClass77_778 = null;
		aClass89_1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1390() {
		while (true) {
			if (Static74.aClass2_Sub18_Sub1_1.method2401(Static25.anInt731) >= 27) {
				@Pc(14) int local14 = Static74.aClass2_Sub18_Sub1_1.method2405(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local14] == null) {
						Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local14] = new Class2_Sub2_Sub1_Sub6_Sub2();
						local19 = true;
					}
					@Pc(35) Class2_Sub2_Sub1_Sub6_Sub2 local35 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local14];
					Static160.anIntArray643[Static145.anInt3533++] = local14;
					local35.anInt4401 = Static143.anInt3513;
					local35.aClass2_Sub2_Sub16_1 = Static131.method2901(Static74.aClass2_Sub18_Sub1_1.method2405(14));
					@Pc(61) int local61 = Static106.anIntArray411[Static74.aClass2_Sub18_Sub1_1.method2405(3)];
					if (local19) {
						local35.anInt4387 = local35.anInt4415 = local61;
					}
					@Pc(74) int local74 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
					@Pc(79) int local79 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
					if (local79 == 1) {
						Static6.anIntArray25[Static174.anInt4449++] = local14;
					}
					@Pc(97) int local97 = Static74.aClass2_Sub18_Sub1_1.method2405(5);
					@Pc(102) int local102 = Static74.aClass2_Sub18_Sub1_1.method2405(5);
					local35.anInt4412 = local35.aClass2_Sub2_Sub16_1.anInt3785;
					if (local102 > 15) {
						local102 -= 32;
					}
					local35.anInt4380 = local35.aClass2_Sub2_Sub16_1.anInt3768;
					local35.anInt4413 = local35.aClass2_Sub2_Sub16_1.anInt3778;
					if (local97 > 15) {
						local97 -= 32;
					}
					local35.anInt4425 = local35.aClass2_Sub2_Sub16_1.anInt3783;
					local35.anInt4418 = local35.aClass2_Sub2_Sub16_1.anInt3769;
					local35.anInt4388 = local35.aClass2_Sub2_Sub16_1.anInt3767;
					local35.anInt4397 = local35.aClass2_Sub2_Sub16_1.anInt3781;
					local35.anInt4409 = local35.aClass2_Sub2_Sub16_1.anInt3766;
					if (local35.anInt4397 == 0) {
						local35.anInt4415 = 0;
					}
					local35.anInt4407 = local35.aClass2_Sub2_Sub16_1.anInt3764;
					local35.method2913(local97 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local74 == 1, local102 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0]);
					continue;
				}
			}
			Static74.aClass2_Sub18_Sub1_1.method2403();
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZII)Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 method1391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg4 << 38) + (long) arg0 + ((long) arg1 << 16) + ((long) arg3 << 40);
		@Pc(31) Class2_Sub2_Sub3_Sub2 local31;
		if (!arg2) {
			local31 = (Class2_Sub2_Sub3_Sub2) Static64.aClass82_27.method2699(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class2_Sub2_Sub9 local39 = Static158.method2689(arg0);
		if (arg1 > 1 && local39.anIntArray285 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg1 >= local39.anIntArray284[local51] && local39.anIntArray284[local51] != 0) {
					local49 = local39.anIntArray285[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static158.method2689(local49);
			}
		}
		@Pc(101) Class2_Sub2_Sub1_Sub2_Sub1 local101 = local39.method1306();
		if (local101 == null) {
			return null;
		}
		@Pc(107) Class2_Sub2_Sub3_Sub2 local107 = null;
		if (local39.anInt1799 != -1) {
			local107 = method1391(local39.anInt1779, 10, true, 0, 1);
			if (local107 == null) {
				return null;
			}
		}
		@Pc(127) int local127 = Static113.anInt1736;
		@Pc(129) int local129 = Static113.anInt1738;
		@Pc(131) int[] local131 = Static113.anIntArray275;
		@Pc(134) int[] local134 = new int[4];
		Static113.method1238(local134);
		local31 = new Class2_Sub2_Sub3_Sub2(36, 32);
		Static113.method1234(local31.anIntArray81, 36, 32);
		Static113.method1239();
		Static12.method256();
		Static12.method249(16, 16);
		Static12.aBoolean16 = false;
		@Pc(157) int local157 = local39.anInt1800;
		if (arg2) {
			local157 = (int) ((double) local157 * 1.5D);
		} else if (arg4 == 2) {
			local157 = (int) ((double) local157 * 1.04D);
		}
		@Pc(187) int local187 = Class2_Sub2_Sub3_Sub1.anIntArray50[local39.anInt1790] * local157 >> 16;
		@Pc(196) int local196 = local157 * Class2_Sub2_Sub3_Sub1.anIntArray52[local39.anInt1790] >> 16;
		local101.method592();
		local101.method591(local39.anInt1785, local39.anInt1809, local39.anInt1790, local39.anInt1782, local39.anInt1776 + local187 - local101.aShort32 / 2, local39.anInt1776 + local196);
		if (arg4 >= 1) {
			local31.method408(1);
		}
		if (arg4 >= 2) {
			local31.method408(16777215);
		}
		if (arg3 != 0) {
			local31.method411(arg3);
		}
		Static113.method1234(local31.anIntArray81, 36, 32);
		if (local39.anInt1799 != -1) {
			local107.method401(0, 0);
		}
		if (!arg2 && (local39.anInt1795 == 1 || arg1 != 1) && arg1 != -1) {
			Static114.aClass2_Sub2_Sub3_Sub4_Sub1_6.method1256(Static62.method1151(arg1), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			Static64.aClass82_27.method2701(local23, local31);
		}
		Static113.method1234(local131, local127, local129);
		Static113.method1240(local134);
		Static12.method256();
		Static12.aBoolean16 = true;
		return local31;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIILclient!td;I)V")
	public static void method1392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub16 arg2, @OriginalArg(4) int arg3) {
		if (Static18.anInt618 >= 400) {
			return;
		}
		if (arg2.anIntArray555 != null) {
			arg2 = arg2.method2613();
		}
		if (arg2 == null || !arg2.aBoolean155) {
			return;
		}
		@Pc(28) Class77 local28 = arg2.aClass77_1302;
		if (arg2.anInt3789 != 0) {
			local28 = Static146.method2168(new Class77[] { local28, Static112.method1994(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4342, arg2.anInt3789), Static98.aClass77_963, Static98.aClass77_965, Static2.method61(arg2.anInt3789), Static122.aClass77_221 });
		}
		if (Static124.anInt3041 == 1) {
			Static147.method2486(Static146.method2168(new Class77[] { Static15.aClass77_233, Static178.aClass77_1544, local28 }), arg1, arg0, Static64.aClass77_714, 24, arg3);
		} else if (!Static16.aBoolean25) {
			@Pc(80) Class77[] local80 = arg2.aClass77Array21;
			if (Static78.aBoolean91) {
				local80 = Static119.method2127(local80);
			}
			@Pc(92) int local92;
			if (local80 != null) {
				for (local92 = 4; local92 >= 0; local92--) {
					if (local80[local92] != null && !local80[local92].method2508(Static98.aClass77_957)) {
						@Pc(106) byte local106 = 0;
						if (local92 == 0) {
							local106 = 33;
						}
						if (local92 == 1) {
							local106 = 38;
						}
						if (local92 == 2) {
							local106 = 31;
						}
						if (local92 == 3) {
							local106 = 50;
						}
						if (local92 == 4) {
							local106 = 7;
						}
						Static147.method2486(Static146.method2168(new Class77[] { Static101.aClass77_975, local28 }), arg1, arg0, local80[local92], local106, arg3);
					}
				}
			}
			if (local80 != null) {
				for (local92 = 4; local92 >= 0; local92--) {
					if (local80[local92] != null && local80[local92].method2508(Static98.aClass77_957)) {
						@Pc(188) short local188 = 0;
						if (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4342 < arg2.anInt3789) {
							local188 = 2000;
						}
						@Pc(197) int local197 = 0;
						if (local92 == 0) {
							local197 = local188 + 33;
						}
						if (local92 == 1) {
							local197 = local188 + 38;
						}
						if (local92 == 2) {
							local197 = local188 + 31;
						}
						if (local92 == 3) {
							local197 = local188 + 50;
						}
						if (local92 == 4) {
							local197 = local188 + 7;
						}
						Static147.method2486(Static146.method2168(new Class77[] { Static101.aClass77_975, local28 }), arg1, arg0, local80[local92], local197, arg3);
					}
				}
			}
			Static147.method2486(Static146.method2168(new Class77[] { Static101.aClass77_975, local28 }), arg1, arg0, Static133.aClass77_1171, 1006, arg3);
			return;
		} else if ((Static11.anInt307 & 0x2) == 2) {
			Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static178.aClass77_1544, local28 }), arg1, arg0, Static120.aClass77_405, 5, arg3);
			return;
		}
	}
}
