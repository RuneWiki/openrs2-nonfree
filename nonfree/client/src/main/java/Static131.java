import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!ec;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!eia;")
	public static final Class81 aClass81_3 = new Class81();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_23 = new Class208(7, 6);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z[[[Lclient!ffa;IIII)Z")
	public static boolean method2131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class97[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static167.anInt3480 & 0xFF);
		if (Static312.aByteArrayArrayArray17[Static175.anInt3636][arg3][arg2] == local14) {
			return false;
		} else if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static138.anIntArray172[0] = arg3;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local46 + 1;
			Static349.anIntArray409[0] = arg2;
			Static312.aByteArrayArrayArray17[Static175.anInt3636][arg3][arg2] = local14;
			while (local57 != local60) {
				@Pc(78) int local78 = Static138.anIntArray172[local57] & 0xFFFF;
				@Pc(86) int local86 = Static138.anIntArray172[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static138.anIntArray172[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static349.anIntArray409[local57] & 0xFFFF;
				@Pc(108) int local108 = Static349.anIntArray409[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(139) int local139;
				@Pc(183) int local183;
				@Pc(229) int local229;
				if (arg1 != null) {
					label237: for (local139 = Static175.anInt3636 + 1; local139 <= 3; local139++) {
						if (arg1[local139] != null && (Static197.aByteArrayArrayArray24[local139][local78][local100] & 0x8) == 0) {
							@Pc(334) Class20_Sub2_Sub2 local334;
							@Pc(344) int local344;
							@Pc(323) Class97 local323;
							@Pc(329) Class196 local329;
							if (local116 && arg1[local139][local78][local100] != null) {
								if (arg1[local139][local78][local100].aClass20_Sub2_Sub1_1 != null) {
									local183 = Static432.method6741(local86);
									if (arg1[local139][local78][local100].aClass20_Sub2_Sub1_1.aShort112 == local183 || arg1[local139][local78][local100].aClass20_Sub2_Sub1_2 != null && arg1[local139][local78][local100].aClass20_Sub2_Sub1_2.aShort112 == local183) {
										continue;
									}
									if (local94 != 0) {
										local229 = Static432.method6741(local94);
										if (arg1[local139][local78][local100].aClass20_Sub2_Sub1_1.aShort112 == local229 || arg1[local139][local78][local100].aClass20_Sub2_Sub1_2 != null && arg1[local139][local78][local100].aClass20_Sub2_Sub1_2.aShort112 == local229) {
											continue;
										}
									}
									if (local108 != 0) {
										local229 = Static432.method6741(local108);
										if (arg1[local139][local78][local100].aClass20_Sub2_Sub1_1.aShort112 == local229 || arg1[local139][local78][local100].aClass20_Sub2_Sub1_2 != null && arg1[local139][local78][local100].aClass20_Sub2_Sub1_2.aShort112 == local229) {
											continue;
										}
									}
								}
								local323 = arg1[local139][local78][local100];
								if (local323.aClass196_2 != null) {
									for (local329 = local323.aClass196_2; local329 != null; local329 = local329.aClass196_3) {
										local334 = local329.aClass20_Sub2_Sub2_1;
										if (local334 instanceof Interface12) {
											@Pc(340) Interface12 local340 = (Interface12) local334;
											local344 = local340.method9032();
											@Pc(348) int local348 = local340.method9029();
											if (local344 == 21) {
												local344 = 19;
											}
											@Pc(359) int local359 = local348 << 6 | local344;
											if (local86 == local359 || local94 != 0 && local359 == local94 || local108 != 0 && local359 == local108) {
												continue label237;
											}
										}
									}
								}
							}
							local323 = arg1[local139][local78][local100];
							if (local323 != null && local323.aClass196_2 != null) {
								for (local329 = local323.aClass196_2; local329 != null; local329 = local329.aClass196_3) {
									local334 = local329.aClass20_Sub2_Sub2_1;
									if (local334.aShort124 != local334.aShort125 || local334.aShort123 != local334.aShort122) {
										for (@Pc(424) int local424 = local334.aShort124; local424 <= local334.aShort125; local424++) {
											for (local344 = local334.aShort123; local344 <= local334.aShort122; local344++) {
												Static312.aByteArrayArrayArray17[local139][local424][local344] = local14;
											}
										}
									}
								}
							}
							Static312.aByteArrayArrayArray17[local139][local78][local100] = local14;
							local133 = true;
						}
					}
				}
				if (local133) {
					local139 = Static195.aClass199Array1[Static175.anInt3636 + 1].method8532(local78, local100);
					if (Static502.anIntArray539[arg4] < local139) {
						Static502.anIntArray539[arg4] = local139;
					}
					local183 = local78 << 9;
					if (local183 < Static540.anIntArray572[arg4]) {
						Static540.anIntArray572[arg4] = local183;
					} else if (Static360.anIntArray415[arg4] < local183) {
						Static360.anIntArray415[arg4] = local183;
					}
					local229 = local100 << 9;
					if (local229 < Static112.anIntArray154[arg4]) {
						Static112.anIntArray154[arg4] = local229;
					} else if (local229 > Static335.anIntArray379[arg4]) {
						Static335.anIntArray379[arg4] = local229;
					}
				}
				if (!local116) {
					if (local78 >= 1 && local14 != Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100]) {
						Static138.anIntArray172[local60] = 0xD3000000 | 0x120000 | local78 - 1;
						Static349.anIntArray409[local60] = local100 | 0x130000;
						Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100++;
					if (local100 < Static284.anInt7916) {
						if (local78 - 1 >= 0 && local14 != Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100] && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78][local100] & 0x4) == 0 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static138.anIntArray172[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static349.anIntArray409[local60] = local100 | 0x130000;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local14 != Static312.aByteArrayArrayArray17[Static175.anInt3636][local78][local100]) {
							Static138.anIntArray172[local60] = 0x13000000 | 0x520000 | local78;
							Static349.anIntArray409[local60] = local100 | 0x530000;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static442.anInt7975 > local78 + 1 && Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] != local14 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78][local100] & 0x4) == 0 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static138.anIntArray172[local60] = local78 + 1 | 0x92000000 | 0x520000;
							Static349.anIntArray409[local60] = local100 | 0x530000;
							local60 = local60 + 1 & 0xFFF;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] = local14;
						}
					}
					local100--;
					if (Static442.anInt7975 > local78 + 1 && Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] != local14) {
						Static138.anIntArray172[local60] = 0x53000000 | 0x920000 | local78 + 1;
						Static349.anIntArray409[local60] = local100 | 0x930000;
						Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local14 != Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100] && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78][local100] & 0x4) == 0 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static138.anIntArray172[local60] = 0x12000000 | 0xD20000 | local78 - 1;
							Static349.anIntArray409[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 - 1][local100] = local14;
						}
						if (Static312.aByteArrayArrayArray17[Static175.anInt3636][local78][local100] != local14) {
							Static138.anIntArray172[local60] = local78 | 0xD20000 | 0x93000000;
							Static349.anIntArray409[local60] = local100 | 0xD30000;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static442.anInt7975 && local14 != Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78][local100] & 0x4) == 0 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static138.anIntArray172[local60] = local78 + 1 | 0x920000 | 0xD2000000;
							Static349.anIntArray409[local60] = local100 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static312.aByteArrayArrayArray17[Static175.anInt3636][local78 + 1][local100] = local14;
						}
					}
				}
			}
			if (Static502.anIntArray539[arg4] != -1000000) {
				Static502.anIntArray539[arg4] += 40;
				Static540.anIntArray572[arg4] -= 512;
				Static360.anIntArray415[arg4] += 512;
				Static335.anIntArray379[arg4] += 512;
				Static112.anIntArray154[arg4] -= 512;
			}
			return true;
		}
	}
}
