import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!vb;")
	public static Class82 aClass82_70;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1421 = Static120.method2057("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1422 = Static120.method2057("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1423 = Static120.method2057("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[Lclient!re;")
	public static Class75[] aClass75Array3 = new Class75[5000];

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!ah;")
	public static Class5 aClass5_12 = new Class5(512);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method3083() {
		aClass5_12 = null;
		aClass81_1422 = null;
		aClass82_70 = null;
		aClass81_1421 = null;
		aClass81_1423 = null;
		aClass75Array3 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
	public static boolean method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static56.anInt1357 + arg0 * Static33.anInt927 >> 16;
		@Pc(19) int local19 = arg2 * Static33.anInt927 - arg0 * Static56.anInt1357 >> 16;
		@Pc(29) int local29 = arg1 * Static119.anInt2638 + local19 * Static120.anInt2663 >> 16;
		@Pc(39) int local39 = arg1 * Static120.anInt2663 - local19 * Static119.anInt2638 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static163.anInt3736 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static12.anInt4139 + (local39 << 9) / local29;
			return local55 >= Static77.anInt1823 && local55 <= Static179.anInt4046 && local63 >= Static149.anInt3337 && local63 <= Static52.anInt1280;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static8.anInt164 * 128) {
			arg0 = Static8.anInt164 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static141.anInt709 * 128) {
			arg2 = Static141.anInt709 * 128 - 1;
		}
		Static90.anInt1989++;
		Static119.anInt2638 = Class1_Sub2_Sub2_Sub1.anIntArray30[arg3];
		Static120.anInt2663 = Class1_Sub2_Sub2_Sub1.anIntArray33[arg3];
		Static56.anInt1357 = Class1_Sub2_Sub2_Sub1.anIntArray30[arg4];
		Static33.anInt927 = Class1_Sub2_Sub2_Sub1.anIntArray33[arg4];
		Static154.aBooleanArrayArray1 = Static156.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static122.anInt2747 = arg0;
		Static89.anInt4025 = arg1;
		Static184.anInt4119 = arg2;
		Static21.anInt535 = arg0 / 128;
		Static183.anInt4109 = arg2 / 128;
		Static111.anInt2516 = arg5;
		Static138.anInt2966 = Static21.anInt535 - Static63.anInt1552;
		if (Static138.anInt2966 < 0) {
			Static138.anInt2966 = 0;
		}
		Static157.anInt3570 = Static183.anInt4109 - Static63.anInt1552;
		if (Static157.anInt3570 < 0) {
			Static157.anInt3570 = 0;
		}
		Static14.anInt299 = Static21.anInt535 + Static63.anInt1552;
		if (Static14.anInt299 > Static8.anInt164) {
			Static14.anInt299 = Static8.anInt164;
		}
		Static146.anInt3197 = Static183.anInt4109 + Static63.anInt1552;
		if (Static146.anInt3197 > Static141.anInt709) {
			Static146.anInt3197 = Static141.anInt709;
		}
		Static93.method1578();
		Static153.anInt3492 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static126.anInt2764; local118 < Static77.anInt1828; local118++) {
			@Pc(123) Class1_Sub17[][] local123 = Static167.aClass1_Sub17ArrayArrayArray1[local118];
			for (local125 = Static138.anInt2966; local125 < Static14.anInt299; local125++) {
				for (local128 = Static157.anInt3570; local128 < Static146.anInt3197; local128++) {
					@Pc(135) Class1_Sub17 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt1849 <= arg5 && (Static154.aBooleanArrayArray1[local125 + Static63.anInt1552 - Static21.anInt535][local128 + Static63.anInt1552 - Static183.anInt4109] || Static116.anIntArrayArrayArray4[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean74 = true;
							local135.aBoolean76 = true;
							if (local135.anInt1851 > 0) {
								local135.aBoolean75 = true;
							} else {
								local135.aBoolean75 = false;
							}
							Static153.anInt3492++;
						} else {
							local135.aBoolean74 = false;
							local135.aBoolean76 = false;
							local135.anInt1850 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static126.anInt2764; local210 < Static77.anInt1828; local210++) {
			@Pc(215) Class1_Sub17[][] local215 = Static167.aClass1_Sub17ArrayArrayArray1[local210];
			for (local128 = -Static63.anInt1552; local128 <= 0; local128++) {
				local223 = Static21.anInt535 + local128;
				local227 = Static21.anInt535 - local128;
				if (local223 >= Static138.anInt2966 || local227 < Static14.anInt299) {
					for (local236 = -Static63.anInt1552; local236 <= 0; local236++) {
						local241 = Static183.anInt4109 + local236;
						local245 = Static183.anInt4109 - local236;
						@Pc(257) Class1_Sub17 local257;
						if (local223 >= Static138.anInt2966) {
							if (local241 >= Static157.anInt3570) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean74) {
									Static44.method820(local257, true);
								}
							}
							if (local245 < Static146.anInt3197) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean74) {
									Static44.method820(local257, true);
								}
							}
						}
						if (local227 < Static14.anInt299) {
							if (local241 >= Static157.anInt3570) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean74) {
									Static44.method820(local257, true);
								}
							}
							if (local245 < Static146.anInt3197) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean74) {
									Static44.method820(local257, true);
								}
							}
						}
						if (Static153.anInt3492 == 0) {
							Static148.aBoolean143 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static126.anInt2764; local125 < Static77.anInt1828; local125++) {
			@Pc(341) Class1_Sub17[][] local341 = Static167.aClass1_Sub17ArrayArrayArray1[local125];
			for (local223 = -Static63.anInt1552; local223 <= 0; local223++) {
				local227 = Static21.anInt535 + local223;
				local236 = Static21.anInt535 - local223;
				if (local227 >= Static138.anInt2966 || local236 < Static14.anInt299) {
					for (local241 = -Static63.anInt1552; local241 <= 0; local241++) {
						local245 = Static183.anInt4109 + local241;
						@Pc(371) int local371 = Static183.anInt4109 - local241;
						@Pc(383) Class1_Sub17 local383;
						if (local227 >= Static138.anInt2966) {
							if (local245 >= Static157.anInt3570) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean74) {
									Static44.method820(local383, false);
								}
							}
							if (local371 < Static146.anInt3197) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean74) {
									Static44.method820(local383, false);
								}
							}
						}
						if (local236 < Static14.anInt299) {
							if (local245 >= Static157.anInt3570) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean74) {
									Static44.method820(local383, false);
								}
							}
							if (local371 < Static146.anInt3197) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean74) {
									Static44.method820(local383, false);
								}
							}
						}
						if (Static153.anInt3492 == 0) {
							Static148.aBoolean143 = false;
							return;
						}
					}
				}
			}
		}
		Static148.aBoolean143 = false;
	}
}
