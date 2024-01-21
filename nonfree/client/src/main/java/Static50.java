import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	public static int anInt1375;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_538 = Static146.method2172("<col=ff7000>");

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_539 = Static146.method2172("<col=ffff00>");

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
	public static final int anInt1382 = 5063219;

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_540 = Static146.method2172("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_543 = Static146.method2172("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_541 = aClass77_543;

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "I")
	public static int anInt1384 = 0;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_542 = aClass77_543;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
	public static void method957() {
		aClass77_542 = null;
		aClass77_540 = null;
		aClass77_538 = null;
		anObject1 = null;
		aClass77_541 = null;
		aClass77_543 = null;
		aClass77_539 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIILclient!vb;Lclient!og;I)V")
	public static void method961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class86 arg6, @OriginalArg(8) Class60 arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub2_Sub5 local7 = Static121.method2129(arg8);
		@Pc(21) int local21;
		@Pc(18) int local18;
		if (arg1 == 1 || arg1 == 3) {
			local18 = local7.anInt520;
			local21 = local7.anInt538;
		} else {
			local18 = local7.anInt538;
			local21 = local7.anInt520;
		}
		@Pc(39) int local39;
		@Pc(37) int local37;
		if (local18 + arg5 > 104) {
			local37 = arg5 + 1;
			local39 = arg5;
		} else {
			local37 = arg5 + (local18 + 1 >> 1);
			local39 = arg5 + (local18 >> 1);
		}
		@Pc(58) int[][] local58 = Static122.anIntArrayArrayArray2[arg3];
		@Pc(81) int local81;
		@Pc(75) int local75;
		if (arg0 + local21 <= 104) {
			local75 = arg0 + (local21 + 1 >> 1);
			local81 = (local21 >> 1) + arg0;
		} else {
			local81 = arg0;
			local75 = arg0 + 1;
		}
		@Pc(114) int local114 = local58[local75][local37] + local58[local75][local39] + local58[local81][local39] + local58[local81][local37] >> 2;
		@Pc(122) int local122 = (local21 << 6) + (arg0 << 7);
		@Pc(135) int local135 = (arg5 << 7) + arg0 + (arg8 << 14) + 1073741824;
		if (local7.anInt540 == 0) {
			local135 += Integer.MIN_VALUE;
		}
		@Pc(153) int local153 = (arg5 << 7) + (local18 << 6);
		@Pc(159) int local159 = arg4 + (arg1 << 6);
		if (local7.anInt524 == 1) {
			local159 += 256;
		}
		@Pc(186) Class2_Sub2_Sub1 local186;
		if (arg4 == 22) {
			if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
				local186 = local7.method348(local58, local114, 22, arg1, local153, local122);
			} else {
				local186 = new Class2_Sub2_Sub1_Sub5(arg8, 22, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
			}
			arg7.method2081(arg2, arg0, arg5, local114, local186, local135, local159);
			if (local7.anInt514 == 1) {
				arg6.method2801(arg5, arg0);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
				local186 = local7.method348(local58, local114, 10, arg1, local153, local122);
			} else {
				local186 = new Class2_Sub2_Sub1_Sub5(arg8, 10, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
			}
			if (local186 != null) {
				arg7.method2065(arg2, arg0, arg5, local114, local21, local18, local186, arg4 == 11 ? 256 : 0, local135, local159);
			}
			if (local7.anInt514 != 0) {
				arg6.method2805(arg0, arg5, local21, local18, local7.aBoolean28);
			}
		} else if (arg4 >= 12) {
			if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
				local186 = local7.method348(local58, local114, arg4, arg1, local153, local122);
			} else {
				local186 = new Class2_Sub2_Sub1_Sub5(arg8, arg4, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
			}
			arg7.method2065(arg2, arg0, arg5, local114, 1, 1, local186, 0, local135, local159);
			if (local7.anInt514 != 0) {
				arg6.method2805(arg0, arg5, local21, local18, local7.aBoolean28);
			}
		} else if (arg4 == 0) {
			if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
				local186 = local7.method348(local58, local114, 0, arg1, local153, local122);
			} else {
				local186 = new Class2_Sub2_Sub1_Sub5(arg8, 0, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
			}
			arg7.method2087(arg2, arg0, arg5, local114, local186, null, Static52.anIntArray224[arg1], 0, local135, local159);
			if (local7.anInt514 != 0) {
				arg6.method2812(arg5, local7.aBoolean28, arg1, arg0, arg4);
			}
		} else if (arg4 == 1) {
			if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
				local186 = local7.method348(local58, local114, 1, arg1, local153, local122);
			} else {
				local186 = new Class2_Sub2_Sub1_Sub5(arg8, 1, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
			}
			arg7.method2087(arg2, arg0, arg5, local114, local186, null, Static94.anIntArray387[arg1], 0, local135, local159);
			if (local7.anInt514 != 0) {
				arg6.method2812(arg5, local7.aBoolean28, arg1, arg0, arg4);
			}
		} else {
			@Pc(531) Class2_Sub2_Sub1 local531;
			@Pc(500) int local500;
			if (arg4 == 2) {
				local500 = arg1 + 1 & 0x3;
				@Pc(521) Class2_Sub2_Sub1 local521;
				if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
					local521 = local7.method348(local58, local114, 2, arg1 + 4, local153, local122);
					local531 = local7.method348(local58, local114, 2, local500, local153, local122);
				} else {
					local521 = new Class2_Sub2_Sub1_Sub5(arg8, 2, arg1 + 4, arg3, arg0, arg5, local7.anInt513, true, null);
					local531 = new Class2_Sub2_Sub1_Sub5(arg8, 2, local500, arg3, arg0, arg5, local7.anInt513, true, null);
				}
				arg7.method2087(arg2, arg0, arg5, local114, local521, local531, Static52.anIntArray224[arg1], Static52.anIntArray224[local500], local135, local159);
				if (local7.anInt514 != 0) {
					arg6.method2812(arg5, local7.aBoolean28, arg1, arg0, arg4);
				}
			} else if (arg4 == 3) {
				if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
					local186 = local7.method348(local58, local114, 3, arg1, local153, local122);
				} else {
					local186 = new Class2_Sub2_Sub1_Sub5(arg8, 3, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
				}
				arg7.method2087(arg2, arg0, arg5, local114, local186, null, Static94.anIntArray387[arg1], 0, local135, local159);
				if (local7.anInt514 != 0) {
					arg6.method2812(arg5, local7.aBoolean28, arg1, arg0, arg4);
				}
			} else if (arg4 == 9) {
				if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
					local186 = local7.method348(local58, local114, arg4, arg1, local153, local122);
				} else {
					local186 = new Class2_Sub2_Sub1_Sub5(arg8, arg4, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
				}
				arg7.method2065(arg2, arg0, arg5, local114, 1, 1, local186, 0, local135, local159);
				if (local7.anInt514 != 0) {
					arg6.method2805(arg0, arg5, local21, local18, local7.aBoolean28);
				}
			} else if (arg4 == 4) {
				if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
					local186 = local7.method348(local58, local114, 4, arg1, local153, local122);
				} else {
					local186 = new Class2_Sub2_Sub1_Sub5(arg8, 4, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
				}
				arg7.method2071(arg2, arg0, arg5, local114, local186, null, Static52.anIntArray224[arg1], 0, 0, 0, local135, local159);
			} else {
				@Pc(790) int local790;
				if (arg4 == 5) {
					local500 = 16;
					local790 = arg7.method2077(arg2, arg0, arg5);
					if (local790 != 0) {
						local500 = Static121.method2129(local790 >> 14 & 0x7FFF).anInt526;
					}
					if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
						local531 = local7.method348(local58, local114, 4, arg1, local153, local122);
					} else {
						local531 = new Class2_Sub2_Sub1_Sub5(arg8, 4, arg1, arg3, arg0, arg5, local7.anInt513, true, null);
					}
					arg7.method2071(arg2, arg0, arg5, local114, local531, null, Static52.anIntArray224[arg1], 0, local500 * Static6.anIntArray26[arg1], local500 * Static78.anIntArray344[arg1], local135, local159);
				} else if (arg4 == 6) {
					local500 = 8;
					local790 = arg7.method2077(arg2, arg0, arg5);
					if (local790 != 0) {
						local500 = Static121.method2129(local790 >> 14 & 0x7FFF).anInt526 / 2;
					}
					if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
						local531 = local7.method348(local58, local114, 4, arg1 + 4, local153, local122);
					} else {
						local531 = new Class2_Sub2_Sub1_Sub5(arg8, 4, arg1 + 4, arg3, arg0, arg5, local7.anInt513, true, null);
					}
					arg7.method2071(arg2, arg0, arg5, local114, local531, null, 256, arg1, local500 * Static156.anIntArray563[arg1], local500 * Static109.anIntArray143[arg1], local135, local159);
				} else if (arg4 == 7) {
					local790 = arg1 + 2 & 0x3;
					if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
						local186 = local7.method348(local58, local114, 4, local790 + 4, local153, local122);
					} else {
						local186 = new Class2_Sub2_Sub1_Sub5(arg8, 4, local790 + 4, arg3, arg0, arg5, local7.anInt513, true, null);
					}
					arg7.method2071(arg2, arg0, arg5, local114, local186, null, 256, local790, 0, 0, local135, local159);
				} else if (arg4 == 8) {
					local500 = 8;
					local790 = arg7.method2077(arg2, arg0, arg5);
					@Pc(1028) int local1028 = arg1 + 2 & 0x3;
					if (local790 != 0) {
						local500 = Static121.method2129(local790 >> 14 & 0x7FFF).anInt526 / 2;
					}
					@Pc(1075) Class2_Sub2_Sub1 local1075;
					if (local7.anInt513 == -1 && local7.anIntArray73 == null) {
						local531 = local7.method348(local58, local114, 4, arg1 + 4, local153, local122);
						local1075 = local7.method348(local58, local114, 4, local1028 + 4, local153, local122);
					} else {
						local531 = new Class2_Sub2_Sub1_Sub5(arg8, 4, arg1 + 4, arg3, arg0, arg5, local7.anInt513, true, null);
						local1075 = new Class2_Sub2_Sub1_Sub5(arg8, 4, local1028 + 4, arg3, arg0, arg5, local7.anInt513, true, null);
					}
					arg7.method2071(arg2, arg0, arg5, local114, local531, local1075, 256, arg1, local500 * Static156.anIntArray563[arg1], Static109.anIntArray143[arg1] * local500, local135, local159);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BII[B)I")
	public static int method962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg1; local7++) {
			local5 = Class42.anIntArray359[(arg2[local7] ^ local5) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}
}
