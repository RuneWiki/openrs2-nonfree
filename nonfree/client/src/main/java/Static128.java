import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1254 = Static187.method3089("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1250 = aClass92_1254;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1251 = Static187.method3089(":trade:");

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1252 = Static187.method3089("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1253 = Static187.method3089("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass48_1 != null && local7.aClass48_1.aLong94 == arg3) {
			return true;
		} else if (local7.aClass85_1 != null && local7.aClass85_1.aLong208 == arg3) {
			return true;
		} else if (local7.aClass5_1 != null && local7.aClass5_1.aLong7 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2380; local46++) {
				if (local7.aClass16Array3[local46].aLong30 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!vd;)V")
	public static void method1870(@OriginalArg(1) Class92 arg0) {
		@Pc(7) Class1_Sub7 local7 = Static107.method1614(arg0);
		if (local7 == null) {
			return;
		}
		Static193.anInt3062 = Static52.anInt1305 + Static35.anInt988 - local7.anInt1033;
		Static110.anInt2386 = local7.anInt1032 - Static150.anInt3065;
		@Pc(43) int local43 = Static110.anInt2386 - (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
		@Pc(52) int local52 = (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11) + Static110.anInt2386;
		if (local43 < 0) {
			Static110.anInt2386 = (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
		}
		@Pc(73) int local73 = Static193.anInt3062 - (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
		if (Static90.anInt1950 < local52) {
			Static110.anInt2386 = Static90.anInt1950 - (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
		}
		@Pc(99) int local99 = (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11) + Static193.anInt3062;
		if (local73 < 0) {
			Static193.anInt3062 = (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
		}
		if (local99 > Static35.anInt988) {
			Static193.anInt3062 = Static35.anInt988 - (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII[B[Lclient!ag;IIB)V")
	public static void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) Class7[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if (arg2 + local7 > 0 && arg2 + local7 < 103 && local17 + arg1 > 0 && arg1 + local17 < 103) {
					arg6[arg7].anIntArrayArray4[arg2 + local7][local17 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class1_Sub14 local82 = new Class1_Sub14(arg5);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (local84 == arg3 && arg0 <= local88 && arg0 + 8 > local88 && local92 >= arg8 && arg8 + 8 > local92) {
						Static12.method231(local82, arg4, arg2 + Static172.method2719(local92 & 0x7, arg4, local88 & 0x7), arg1 + Static28.method511(local88 & 0x7, arg4, local92 & 0x7), 0, 0, arg7);
					} else {
						Static12.method231(local82, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
	public static void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub17 local28 = Static179.aClass1_Sub17ArrayArrayArray1[local9][arg0][arg1] = Static179.aClass1_Sub17ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt2377--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt2380; local38++) {
					@Pc(44) Class16 local44 = local28.aClass16Array3[local38];
					if ((local44.aLong30 >> 29 & 0x3L) == 2L && local44.anInt536 == arg0 && local44.anInt540 == arg1) {
						local44.anInt546--;
					}
				}
			}
		}
		if (Static179.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			Static179.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub17(0, arg0, arg1);
		}
		Static179.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1].aClass1_Sub17_1 = local7;
		Static179.aClass1_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
