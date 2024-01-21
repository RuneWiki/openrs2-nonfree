import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_18;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_8;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	public static int anInt4214;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1481 = Static170.method3101("Location");

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1478 = aClass28_1481;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1480 = Static170.method3101("OFF");

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public static int anInt4207 = -1;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1482 = Static170.method3101("scrollbar");

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1483 = Static170.method3101("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
	public static int anInt4222 = 0;

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1484 = Static170.method3101("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wd", name = "rb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1485 = aClass28_1480;

	@OriginalMember(owner = "client!wd", name = "sb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1486 = Static170.method3101("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!wd", name = "Ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1487 = aClass28_1483;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!dg;IIIIII)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class3_Sub2_Sub18 local9 = Static86.method1991(arg1);
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (arg6 == 1 || arg6 == 3) {
			local22 = local9.anInt4226;
			local25 = local9.anInt4242;
		} else {
			local22 = local9.anInt4242;
			local25 = local9.anInt4226;
		}
		@Pc(46) int local46;
		@Pc(54) int local54;
		if (arg5 + local22 <= 104) {
			local46 = (local22 >> 1) + arg5;
			local54 = (local22 + 1 >> 1) + arg5;
		} else {
			local46 = arg5;
			local54 = arg5 + 1;
		}
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local25 + arg7 > 104) {
			local68 = arg7;
			local72 = arg7 + 1;
		} else {
			local72 = arg7 + (local25 + 1 >> 1);
			local68 = arg7 + (local25 >> 1);
		}
		@Pc(93) int[][] local93 = Static90.anIntArrayArrayArray31[arg0];
		@Pc(121) int local121 = local93[local54][local72] + local93[local46][local68] + local93[local54][local68] + local93[local46][local72] >> 2;
		@Pc(129) int local129 = (local22 << 6) + (arg5 << 7);
		@Pc(137) int local137 = (local25 << 6) + (arg7 << 7);
		@Pc(154) long local154 = (long) (arg5 | arg7 << 7 | arg3 << 14 | arg6 << 20 | 0x40000000);
		if (local9.anInt4208 == 0) {
			local154 |= Long.MIN_VALUE;
		}
		if (local9.anInt4209 == 1) {
			local154 |= 0x400000L;
		}
		local154 |= (long) arg1 << 32;
		@Pc(201) Class3_Sub2_Sub1 local201;
		if (arg3 == 22) {
			if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
				local201 = local9.method3176(local129, local121, arg6, 22, local137, local93);
			} else {
				local201 = new Class3_Sub2_Sub1_Sub5(arg1, 22, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
			}
			Static131.method2557(arg4, arg5, arg7, local121, local201, local154);
			if (local9.anInt4236 == 1) {
				arg2.method802(arg5, arg7);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
				local201 = local9.method3176(local129, local121, arg6, 10, local137, local93);
			} else {
				local201 = new Class3_Sub2_Sub1_Sub5(arg1, 10, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
			}
			if (local201 != null) {
				Static90.method2047(arg4, arg5, arg7, local121, local22, local25, local201, arg3 == 11 ? 256 : 0, local154);
			}
			if (local9.anInt4236 != 0) {
				arg2.method800(arg7, local22, arg5, local9.aBoolean196, local25);
			}
		} else if (arg3 >= 12) {
			if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
				local201 = local9.method3176(local129, local121, arg6, arg3, local137, local93);
			} else {
				local201 = new Class3_Sub2_Sub1_Sub5(arg1, arg3, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
			}
			Static90.method2047(arg4, arg5, arg7, local121, 1, 1, local201, 0, local154);
			if (local9.anInt4236 != 0) {
				arg2.method800(arg7, local22, arg5, local9.aBoolean196, local25);
			}
		} else if (arg3 == 0) {
			if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
				local201 = local9.method3176(local129, local121, arg6, 0, local137, local93);
			} else {
				local201 = new Class3_Sub2_Sub1_Sub5(arg1, 0, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
			}
			Static167.method3092(arg4, arg5, arg7, local121, local201, null, Static112.anIntArray503[arg6], 0, local154);
			if (local9.anInt4236 != 0) {
				arg2.method804(arg7, arg6, arg3, arg5, local9.aBoolean196);
			}
		} else if (arg3 == 1) {
			if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
				local201 = local9.method3176(local129, local121, arg6, 1, local137, local93);
			} else {
				local201 = new Class3_Sub2_Sub1_Sub5(arg1, 1, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
			}
			Static167.method3092(arg4, arg5, arg7, local121, local201, null, Static135.anIntArray590[arg6], 0, local154);
			if (local9.anInt4236 != 0) {
				arg2.method804(arg7, arg6, arg3, arg5, local9.aBoolean196);
			}
		} else {
			@Pc(514) int local514;
			if (arg3 == 2) {
				local514 = arg6 + 1 & 0x3;
				@Pc(544) Class3_Sub2_Sub1 local544;
				@Pc(534) Class3_Sub2_Sub1 local534;
				if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
					local534 = local9.method3176(local129, local121, arg6 + 4, 2, local137, local93);
					local544 = local9.method3176(local129, local121, local514, 2, local137, local93);
				} else {
					local534 = new Class3_Sub2_Sub1_Sub5(arg1, 2, arg6 + 4, arg0, arg5, arg7, local9.anInt4221, true, null);
					local544 = new Class3_Sub2_Sub1_Sub5(arg1, 2, local514, arg0, arg5, arg7, local9.anInt4221, true, null);
				}
				Static167.method3092(arg4, arg5, arg7, local121, local534, local544, Static112.anIntArray503[arg6], Static112.anIntArray503[local514], local154);
				if (local9.anInt4236 != 0) {
					arg2.method804(arg7, arg6, arg3, arg5, local9.aBoolean196);
				}
			} else if (arg3 == 3) {
				if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
					local201 = local9.method3176(local129, local121, arg6, 3, local137, local93);
				} else {
					local201 = new Class3_Sub2_Sub1_Sub5(arg1, 3, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
				}
				Static167.method3092(arg4, arg5, arg7, local121, local201, null, Static135.anIntArray590[arg6], 0, local154);
				if (local9.anInt4236 != 0) {
					arg2.method804(arg7, arg6, arg3, arg5, local9.aBoolean196);
				}
			} else if (arg3 == 9) {
				if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
					local201 = local9.method3176(local129, local121, arg6, arg3, local137, local93);
				} else {
					local201 = new Class3_Sub2_Sub1_Sub5(arg1, arg3, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
				}
				Static90.method2047(arg4, arg5, arg7, local121, 1, 1, local201, 0, local154);
				if (local9.anInt4236 != 0) {
					arg2.method800(arg7, local22, arg5, local9.aBoolean196, local25);
				}
			} else if (arg3 == 4) {
				if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
					local201 = local9.method3176(local129, local121, arg6, 4, local137, local93);
				} else {
					local201 = new Class3_Sub2_Sub1_Sub5(arg1, 4, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
				}
				Static104.method2131(arg4, arg5, arg7, local121, local201, null, Static112.anIntArray503[arg6], 0, 0, 0, local154);
			} else {
				@Pc(810) long local810;
				@Pc(846) Class3_Sub2_Sub1 local846;
				if (arg3 == 5) {
					local514 = 16;
					local810 = Static80.method2760(arg4, arg5, arg7);
					if (local810 != 0L) {
						local514 = Static86.method1991((int) (local810 >>> 32) & Integer.MAX_VALUE).anInt4239;
					}
					if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
						local846 = local9.method3176(local129, local121, arg6, 4, local137, local93);
					} else {
						local846 = new Class3_Sub2_Sub1_Sub5(arg1, 4, arg6, arg0, arg5, arg7, local9.anInt4221, true, null);
					}
					Static104.method2131(arg4, arg5, arg7, local121, local846, null, Static112.anIntArray503[arg6], 0, local514 * Static102.anIntArray467[arg6], Static117.anIntArray524[arg6] * local514, local154);
				} else if (arg3 == 6) {
					local514 = 8;
					local810 = Static80.method2760(arg4, arg5, arg7);
					if (local810 != 0L) {
						local514 = Static86.method1991(Integer.MAX_VALUE & (int) (local810 >>> 32)).anInt4239 / 2;
					}
					if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
						local846 = local9.method3176(local129, local121, arg6 + 4, 4, local137, local93);
					} else {
						local846 = new Class3_Sub2_Sub1_Sub5(arg1, 4, arg6 + 4, arg0, arg5, arg7, local9.anInt4221, true, null);
					}
					Static104.method2131(arg4, arg5, arg7, local121, local846, null, 256, arg6, local514 * Static61.anIntArray317[arg6], Static106.anIntArray486[arg6] * local514, local154);
				} else if (arg3 == 7) {
					@Pc(979) int local979 = arg6 + 2 & 0x3;
					if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
						local201 = local9.method3176(local129, local121, local979 + 4, 4, local137, local93);
					} else {
						local201 = new Class3_Sub2_Sub1_Sub5(arg1, 4, local979 + 4, arg0, arg5, arg7, local9.anInt4221, true, null);
					}
					Static104.method2131(arg4, arg5, arg7, local121, local201, null, 256, local979, 0, 0, local154);
				} else if (arg3 == 8) {
					local514 = 8;
					local810 = Static80.method2760(arg4, arg5, arg7);
					if (local810 != 0L) {
						local514 = Static86.method1991((int) (local810 >>> 32) & Integer.MAX_VALUE).anInt4239 / 2;
					}
					@Pc(1063) int local1063 = arg6 + 2 & 0x3;
					@Pc(1095) Class3_Sub2_Sub1 local1095;
					if (local9.anInt4221 == -1 && local9.anIntArray699 == null) {
						local846 = local9.method3176(local129, local121, arg6 + 4, 4, local137, local93);
						local1095 = local9.method3176(local129, local121, local1063 + 4, 4, local137, local93);
					} else {
						local846 = new Class3_Sub2_Sub1_Sub5(arg1, 4, arg6 + 4, arg0, arg5, arg7, local9.anInt4221, true, null);
						local1095 = new Class3_Sub2_Sub1_Sub5(arg1, 4, local1063 + 4, arg0, arg5, arg7, local9.anInt4221, true, null);
					}
					Static104.method2131(arg4, arg5, arg7, local121, local846, local1095, 256, arg6, local514 * Static61.anIntArray317[arg6], local514 * Static106.anIntArray486[arg6], local154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
	public static void method3186() {
		aClass28_1487 = null;
		aClass28_1485 = null;
		aClass28_1478 = null;
		aClass28_1482 = null;
		aClass3_Sub2_Sub2_Sub4_8 = null;
		aClass28_1481 = null;
		aClass7_Sub1_18 = null;
		aClass28_1483 = null;
		aClass28_1484 = null;
		aClass28_1480 = null;
		aClass28_1486 = null;
	}
}
