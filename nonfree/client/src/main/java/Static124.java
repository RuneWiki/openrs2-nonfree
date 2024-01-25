import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!jb;")
	public static Class126 aClass126_5;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!ud;")
	public static final Class239 aClass239_3 = new Class239("WTWIP", 3);

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	public static int anInt2538 = 0;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "[I")
	public static final int[] anIntArray167 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_18 = new Class258();

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "[I")
	public static final int[] anIntArray168 = new int[100];

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)I")
	public static int method1881(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZII[[[Lclient!dr;I)Z")
	public static boolean method1882(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class53[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static203.anInt3898 & 0xFF);
		if (Static275.aByteArrayArrayArray8[Static221.anInt4855][arg2][arg4] == local14) {
			return false;
		} else if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static90.anIntArray124[0] = arg2;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local46 + 1;
			Static108.anIntArray146[0] = arg4;
			Static275.aByteArrayArrayArray8[Static221.anInt4855][arg2][arg4] = local14;
			while (local57 != local60) {
				@Pc(78) int local78 = Static90.anIntArray124[local57] & 0xFFFF;
				@Pc(86) int local86 = Static90.anIntArray124[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static90.anIntArray124[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static108.anIntArray146[local57] & 0xFFFF;
				@Pc(108) int local108 = Static108.anIntArray146[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(219) int local219;
				label231: for (@Pc(134) int local134 = Static221.anInt4855 + 1; local134 <= 3; local134++) {
					if ((Static327.aByteArrayArrayArray11[local134][local78][local100] & 0x8) == 0) {
						@Pc(314) Class6_Sub2 local314;
						@Pc(324) int local324;
						@Pc(303) Class53 local303;
						@Pc(309) Class165 local309;
						if (local116 && arg3[local134][local78][local100] != null) {
							if (arg3[local134][local78][local100].aClass6_Sub1_1 != null) {
								local172 = Static307.method5819(local86);
								if (local172 == arg3[local134][local78][local100].aClass6_Sub1_1.anInt5379 || arg3[local134][local78][local100].aClass6_Sub1_2 != null && arg3[local134][local78][local100].aClass6_Sub1_2.anInt5379 == local172) {
									continue;
								}
								if (local94 != 0) {
									local219 = Static307.method5819(local94);
									if (local219 == arg3[local134][local78][local100].aClass6_Sub1_1.anInt5379 || arg3[local134][local78][local100].aClass6_Sub1_2 != null && local219 == arg3[local134][local78][local100].aClass6_Sub1_2.anInt5379) {
										continue;
									}
								}
								if (local108 != 0) {
									local219 = Static307.method5819(local108);
									if (arg3[local134][local78][local100].aClass6_Sub1_1.anInt5379 == local219 || arg3[local134][local78][local100].aClass6_Sub1_2 != null && local219 == arg3[local134][local78][local100].aClass6_Sub1_2.anInt5379) {
										continue;
									}
								}
							}
							local303 = arg3[local134][local78][local100];
							if (local303.aClass165_1 != null) {
								for (local309 = local303.aClass165_1; local309 != null; local309 = local309.aClass165_2) {
									local314 = local309.aClass6_Sub2_2;
									if (local314 instanceof Interface11) {
										@Pc(320) Interface11 local320 = (Interface11) local314;
										local324 = local320.method5644();
										@Pc(328) int local328 = local320.method5649();
										if (local324 == 21) {
											local324 = 19;
										}
										@Pc(341) int local341 = local328 << 6 | local324;
										if (local341 == local86 || local94 != 0 && local341 == local94 || local108 != 0 && local108 == local341) {
											continue label231;
										}
									}
								}
							}
						}
						local303 = arg3[local134][local78][local100];
						if (local303 != null && local303.aClass165_1 != null) {
							for (local309 = local303.aClass165_1; local309 != null; local309 = local309.aClass165_2) {
								local314 = local309.aClass6_Sub2_2;
								if (local314.aShort82 != local314.aShort84 || local314.aShort85 != local314.aShort83) {
									for (@Pc(409) int local409 = local314.aShort82; local409 <= local314.aShort84; local409++) {
										for (local324 = local314.aShort85; local324 <= local314.aShort83; local324++) {
											Static275.aByteArrayArrayArray8[local134][local409][local324] = local14;
										}
									}
								}
							}
						}
						local130 = true;
						Static275.aByteArrayArrayArray8[local134][local78][local100] = local14;
					}
				}
				if (local130) {
					local172 = Static346.aClass146Array2[Static221.anInt4855 + 1].I(local78, local100);
					if (local172 > Static68.anIntArray382[arg1]) {
						Static68.anIntArray382[arg1] = local172;
					}
					local219 = local78 << 7;
					if (local219 < Static385.anIntArray500[arg1]) {
						Static385.anIntArray500[arg1] = local219;
					} else if (Static322.anIntArray502[arg1] < local219) {
						Static322.anIntArray502[arg1] = local219;
					}
					@Pc(519) int local519 = local100 << 7;
					if (local519 < Static254.anIntArray385[arg1]) {
						Static254.anIntArray385[arg1] = local519;
					} else if (local519 > Static90.anIntArray123[arg1]) {
						Static90.anIntArray123[arg1] = local519;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] != local14) {
						Static90.anIntArray124[local60] = local78 - 1 | 0xD3000000 | 0x120000;
						Static108.anIntArray146[local60] = local100 | 0x130000;
						local60 = local60 + 1 & 0xFFF;
						Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] = local14;
					}
					local100++;
					if (local100 < Static190.anInt3697) {
						if (local78 - 1 >= 0 && local14 != Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78][local100] & 0x4) == 0 && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static90.anIntArray124[local60] = local78 - 1 | 0x52000000 | 0x120000;
							Static108.anIntArray146[local60] = local100 | 0x130000;
							local60 = local60 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] = local14;
						}
						if (local14 != Static275.aByteArrayArrayArray8[Static221.anInt4855][local78][local100]) {
							Static90.anIntArray124[local60] = local78 | 0x520000 | 0x13000000;
							Static108.anIntArray146[local60] = local100 | 0x530000;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static126.anInt2569 > local78 + 1 && local14 != Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78][local100] & 0x4) == 0 && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static90.anIntArray124[local60] = local78 + 1 | 0x520000 | 0x92000000;
							Static108.anIntArray146[local60] = local100 | 0x530000;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local100--;
					if (Static126.anInt2569 > local78 + 1 && Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] != local14) {
						Static90.anIntArray124[local60] = local78 + 1 | 0x920000 | 0x53000000;
						Static108.anIntArray146[local60] = local100 | 0x930000;
						local60 = local60 + 1 & 0xFFF;
						Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] = local14;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] != local14 && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78][local100] & 0x4) == 0 && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static90.anIntArray124[local60] = 0x12000000 | 0xD20000 | local78 - 1;
							Static108.anIntArray146[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 - 1][local100] = local14;
						}
						if (Static275.aByteArrayArrayArray8[Static221.anInt4855][local78][local100] != local14) {
							Static90.anIntArray124[local60] = local78 | 0xD20000 | 0x93000000;
							Static108.anIntArray146[local60] = local100 | 0xD30000;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static126.anInt2569 && local14 != Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78][local100] & 0x4) == 0 && (Static327.aByteArrayArrayArray11[Static221.anInt4855][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static90.anIntArray124[local60] = 0xD2000000 | 0x920000 | local78 + 1;
							Static108.anIntArray146[local60] = local100 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray8[Static221.anInt4855][local78 + 1][local100] = local14;
						}
					}
				}
			}
			if (Static68.anIntArray382[arg1] != -1000000) {
				Static68.anIntArray382[arg1] += 10;
				Static385.anIntArray500[arg1] -= 50;
				Static322.anIntArray502[arg1] += 50;
				Static90.anIntArray123[arg1] += 50;
				Static254.anIntArray385[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	public static void method1884() {
		if (Static250.aBoolean333) {
			return;
		}
		Static352.method4939(Static301.aClass53ArrayArrayArray4);
		if (Static39.aClass53ArrayArrayArray3 != null) {
			Static352.method4939(Static39.aClass53ArrayArrayArray3);
		}
		Static250.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V")
	public static void method1885(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static289.method4025(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIZ)V")
	public static void method1886(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class4_Sub39 local10 = Static195.method2229(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray589.length; local19++) {
				local10.anIntArray589[local19] = -1;
				local10.anIntArray588[local19] = 0;
			}
		}
	}
}
